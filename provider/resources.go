// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package provider

import (
	"bytes"
	"context"
	"fmt"
	"path/filepath"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	"github.com/CiscoDevNet/terraform-provider-sdwan/sdwan"

	pf "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tfbridgetokens "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfgen"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"

	"github.com/pulumi/pulumi-sdwan/provider/pkg/version"
)

//go:embed cmd/pulumi-resource-sdwan/bridge-metadata.json
var bridgeMetadata []byte

// all of the token components used below.
const (
	mainPkg = "sdwan"
	mainMod = "index"
)

func StaticID(idValue string) func(context.Context, resource.PropertyMap) (resource.ID, error) {
	return func(context.Context, resource.PropertyMap) (resource.ID, error) { return resource.ID(idValue), nil }
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := pf.ShimProvider(sdwan.Provider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:    p,
		Name: "sdwan",
		// DisplayName is a way to be able to change the casing of the provider
		// name when being displayed on the Pulumi registry
		DisplayName: "Cisco Catalyst SD-WAN",
		// LogoURL is optional but useful to help identify your package in the Pulumi Registry
		// if this package is published there.
		//
		// You may host a logo on a domain you control or add an SVG logo for your package
		// in your repository and use the raw content URL for that file as your logo URL.
		LogoURL:     "https://raw.githubusercontent.com/pulumi/pulumi-sdwan/main/docs/logo.png",
		Description: "A Pulumi package for managing resources on Cisco Catalyst SD-WAN.",
		// category/cloud tag helps with categorizing the package in the Pulumi Registry.
		// For all available categories, see `Keywords` in
		// https://www.pulumi.com/docs/guides/pulumi-packages/schema/#package.
		Keywords: []string{
			"pulumi",
			"sdwan",
			"category/network",
		},
		License:    "Apache-2.0",
		Homepage:   "https://pulumi.com",
		Repository: "https://github.com/pulumi/pulumi-sdwan",
		// The GitHub Org for the provider - defaults to `terraform-providers`. Note that this
		// should match the TF provider module's require directive, not any replace directives.
		GitHubOrg:         "CiscoDevNet",
		UpstreamRepoPath:  "./upstream",
		MetadataInfo:      tfbridge.NewProviderMetadata(bridgeMetadata),
		TFProviderVersion: "0.4.1",
		Version:           version.Version,
		Config:            map[string]*tfbridge.SchemaInfo{},
		DocRules:          &tfbridge.DocRuleInfo{EditRules: docEditRules},
		Resources: map[string]*tfbridge.ResourceInfo{
			"sdwan_activate_centralized_policy":    {ComputeID: StaticID("sdwan:activateCentralizedPolicy")},
			"sdwan_attach_feature_device_template": {ComputeID: StaticID("sdwan:attachFeatureDeviceTemplate")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{},
		JavaScript: &tfbridge.JavaScriptInfo{
			PackageName: "@pulumi/sdwan",

			// List any npm dependencies and their versions

			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: (func() *tfbridge.PythonInfo {
			i := &tfbridge.PythonInfo{
				RespectSchemaVersion: true,
			}
			i.PyProject.Enabled = true
			return i
		})(),
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", "sdwan"),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				"sdwan",
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
		Java: &tfbridge.JavaInfo{
			BasePackage: "com.pulumi",
		},
	}

	prov.MustComputeTokens(
		tfbridgetokens.SingleModule(
			mainPkg,
			mainMod,
			tfbridgetokens.MakeStandard(mainPkg),
		),
	)

	prov.SetAutonaming(255, "-")
	prov.MustApplyAutoAliases()

	return prov
}

func docEditRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	return append(
		defaults,
		trimWhitespace,
		skipGettingStartedSection,
	)
}

// Removes a blank line at the beginning of the doc
var trimWhitespace = tfbridge.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		return bytes.TrimSpace(content), nil
	},
}

// Strips an upstream Getting Started section
var skipGettingStartedSection = tfbridge.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		return tfgen.SkipSectionByHeaderContent(content, func(headerText string) bool {
			return headerText == "Getting Started"
		})
	},
}
