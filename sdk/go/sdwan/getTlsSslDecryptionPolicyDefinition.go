// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source can read the TLS SSL Decryption Policy Definition .
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sdwan.LookupTlsSslDecryptionPolicyDefinition(ctx, &sdwan.LookupTlsSslDecryptionPolicyDefinitionArgs{
//				Id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupTlsSslDecryptionPolicyDefinition(ctx *pulumi.Context, args *LookupTlsSslDecryptionPolicyDefinitionArgs, opts ...pulumi.InvokeOption) (*LookupTlsSslDecryptionPolicyDefinitionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupTlsSslDecryptionPolicyDefinitionResult
	err := ctx.Invoke("sdwan:index/getTlsSslDecryptionPolicyDefinition:getTlsSslDecryptionPolicyDefinition", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTlsSslDecryptionPolicyDefinition.
type LookupTlsSslDecryptionPolicyDefinitionArgs struct {
	// The id of the object
	Id string `pulumi:"id"`
}

// A collection of values returned by getTlsSslDecryptionPolicyDefinition.
type LookupTlsSslDecryptionPolicyDefinitionResult struct {
	// Certificate Lifetime(in Days)
	CertificateLifetimeInDays int `pulumi:"certificateLifetimeInDays"`
	// Certificate revocation status
	CertificateRevocationStatus string `pulumi:"certificateRevocationStatus"`
	// Default action (applies when `mode` set to `security`)
	DefaultAction string `pulumi:"defaultAction"`
	// The description of the policy definition.
	Description string `pulumi:"description"`
	// EC Key Type
	EcKeyType string `pulumi:"ecKeyType"`
	// Expired certificate action
	ExpiredCertificate string `pulumi:"expiredCertificate"`
	// Failure mode
	FailureMode string `pulumi:"failureMode"`
	// The id of the object
	Id string `pulumi:"id"`
	// Minimal TLS Version
	MinimalTlsVersion string `pulumi:"minimalTlsVersion"`
	// The policy mode
	Mode string `pulumi:"mode"`
	// The name of the policy definition.
	Name string `pulumi:"name"`
	// List of network rules (applies when `mode` set to `security`)
	NetworkRules []GetTlsSslDecryptionPolicyDefinitionNetworkRule `pulumi:"networkRules"`
	// RSA key pair modules
	RsaKeyPairModulus string `pulumi:"rsaKeyPairModulus"`
	// SSL decryption enabled
	SslDecryptionEnabled string `pulumi:"sslDecryptionEnabled"`
	// Unknown revocation status action
	UnknownRevocationStatus string `pulumi:"unknownRevocationStatus"`
	// Unsupported cipher suites action
	UnsupportedCipherSuites string `pulumi:"unsupportedCipherSuites"`
	// Unsupported protocol versions action
	UnsupportedProtocolVersions string `pulumi:"unsupportedProtocolVersions"`
	// Untrusted certificate action
	UntrustedCertificate string `pulumi:"untrustedCertificate"`
	// List of url rules (applies when `mode` set to `security`)
	UrlRules []GetTlsSslDecryptionPolicyDefinitionUrlRule `pulumi:"urlRules"`
	// Use default CA certificate bundle
	UseDefaultCaCertBundle bool `pulumi:"useDefaultCaCertBundle"`
	// The version of the object
	Version int `pulumi:"version"`
}

func LookupTlsSslDecryptionPolicyDefinitionOutput(ctx *pulumi.Context, args LookupTlsSslDecryptionPolicyDefinitionOutputArgs, opts ...pulumi.InvokeOption) LookupTlsSslDecryptionPolicyDefinitionResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupTlsSslDecryptionPolicyDefinitionResultOutput, error) {
			args := v.(LookupTlsSslDecryptionPolicyDefinitionArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("sdwan:index/getTlsSslDecryptionPolicyDefinition:getTlsSslDecryptionPolicyDefinition", args, LookupTlsSslDecryptionPolicyDefinitionResultOutput{}, options).(LookupTlsSslDecryptionPolicyDefinitionResultOutput), nil
		}).(LookupTlsSslDecryptionPolicyDefinitionResultOutput)
}

// A collection of arguments for invoking getTlsSslDecryptionPolicyDefinition.
type LookupTlsSslDecryptionPolicyDefinitionOutputArgs struct {
	// The id of the object
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupTlsSslDecryptionPolicyDefinitionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTlsSslDecryptionPolicyDefinitionArgs)(nil)).Elem()
}

// A collection of values returned by getTlsSslDecryptionPolicyDefinition.
type LookupTlsSslDecryptionPolicyDefinitionResultOutput struct{ *pulumi.OutputState }

func (LookupTlsSslDecryptionPolicyDefinitionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTlsSslDecryptionPolicyDefinitionResult)(nil)).Elem()
}

func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) ToLookupTlsSslDecryptionPolicyDefinitionResultOutput() LookupTlsSslDecryptionPolicyDefinitionResultOutput {
	return o
}

func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) ToLookupTlsSslDecryptionPolicyDefinitionResultOutputWithContext(ctx context.Context) LookupTlsSslDecryptionPolicyDefinitionResultOutput {
	return o
}

// Certificate Lifetime(in Days)
func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) CertificateLifetimeInDays() pulumi.IntOutput {
	return o.ApplyT(func(v LookupTlsSslDecryptionPolicyDefinitionResult) int { return v.CertificateLifetimeInDays }).(pulumi.IntOutput)
}

// Certificate revocation status
func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) CertificateRevocationStatus() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsSslDecryptionPolicyDefinitionResult) string { return v.CertificateRevocationStatus }).(pulumi.StringOutput)
}

// Default action (applies when `mode` set to `security`)
func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) DefaultAction() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsSslDecryptionPolicyDefinitionResult) string { return v.DefaultAction }).(pulumi.StringOutput)
}

// The description of the policy definition.
func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsSslDecryptionPolicyDefinitionResult) string { return v.Description }).(pulumi.StringOutput)
}

// EC Key Type
func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) EcKeyType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsSslDecryptionPolicyDefinitionResult) string { return v.EcKeyType }).(pulumi.StringOutput)
}

// Expired certificate action
func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) ExpiredCertificate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsSslDecryptionPolicyDefinitionResult) string { return v.ExpiredCertificate }).(pulumi.StringOutput)
}

// Failure mode
func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) FailureMode() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsSslDecryptionPolicyDefinitionResult) string { return v.FailureMode }).(pulumi.StringOutput)
}

// The id of the object
func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsSslDecryptionPolicyDefinitionResult) string { return v.Id }).(pulumi.StringOutput)
}

// Minimal TLS Version
func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) MinimalTlsVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsSslDecryptionPolicyDefinitionResult) string { return v.MinimalTlsVersion }).(pulumi.StringOutput)
}

// The policy mode
func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) Mode() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsSslDecryptionPolicyDefinitionResult) string { return v.Mode }).(pulumi.StringOutput)
}

// The name of the policy definition.
func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsSslDecryptionPolicyDefinitionResult) string { return v.Name }).(pulumi.StringOutput)
}

// List of network rules (applies when `mode` set to `security`)
func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) NetworkRules() GetTlsSslDecryptionPolicyDefinitionNetworkRuleArrayOutput {
	return o.ApplyT(func(v LookupTlsSslDecryptionPolicyDefinitionResult) []GetTlsSslDecryptionPolicyDefinitionNetworkRule {
		return v.NetworkRules
	}).(GetTlsSslDecryptionPolicyDefinitionNetworkRuleArrayOutput)
}

// RSA key pair modules
func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) RsaKeyPairModulus() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsSslDecryptionPolicyDefinitionResult) string { return v.RsaKeyPairModulus }).(pulumi.StringOutput)
}

// SSL decryption enabled
func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) SslDecryptionEnabled() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsSslDecryptionPolicyDefinitionResult) string { return v.SslDecryptionEnabled }).(pulumi.StringOutput)
}

// Unknown revocation status action
func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) UnknownRevocationStatus() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsSslDecryptionPolicyDefinitionResult) string { return v.UnknownRevocationStatus }).(pulumi.StringOutput)
}

// Unsupported cipher suites action
func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) UnsupportedCipherSuites() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsSslDecryptionPolicyDefinitionResult) string { return v.UnsupportedCipherSuites }).(pulumi.StringOutput)
}

// Unsupported protocol versions action
func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) UnsupportedProtocolVersions() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsSslDecryptionPolicyDefinitionResult) string { return v.UnsupportedProtocolVersions }).(pulumi.StringOutput)
}

// Untrusted certificate action
func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) UntrustedCertificate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsSslDecryptionPolicyDefinitionResult) string { return v.UntrustedCertificate }).(pulumi.StringOutput)
}

// List of url rules (applies when `mode` set to `security`)
func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) UrlRules() GetTlsSslDecryptionPolicyDefinitionUrlRuleArrayOutput {
	return o.ApplyT(func(v LookupTlsSslDecryptionPolicyDefinitionResult) []GetTlsSslDecryptionPolicyDefinitionUrlRule {
		return v.UrlRules
	}).(GetTlsSslDecryptionPolicyDefinitionUrlRuleArrayOutput)
}

// Use default CA certificate bundle
func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) UseDefaultCaCertBundle() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupTlsSslDecryptionPolicyDefinitionResult) bool { return v.UseDefaultCaCertBundle }).(pulumi.BoolOutput)
}

// The version of the object
func (o LookupTlsSslDecryptionPolicyDefinitionResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupTlsSslDecryptionPolicyDefinitionResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTlsSslDecryptionPolicyDefinitionResultOutput{})
}
