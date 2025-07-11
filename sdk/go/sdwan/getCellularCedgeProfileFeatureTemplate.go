// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source can read the Cellular cEdge Profile feature template.
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
//			_, err := sdwan.LookupCellularCedgeProfileFeatureTemplate(ctx, &sdwan.LookupCellularCedgeProfileFeatureTemplateArgs{
//				Id: pulumi.StringRef("f6b2c44c-693c-4763-b010-895aa3d236bd"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupCellularCedgeProfileFeatureTemplate(ctx *pulumi.Context, args *LookupCellularCedgeProfileFeatureTemplateArgs, opts ...pulumi.InvokeOption) (*LookupCellularCedgeProfileFeatureTemplateResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCellularCedgeProfileFeatureTemplateResult
	err := ctx.Invoke("sdwan:index/getCellularCedgeProfileFeatureTemplate:getCellularCedgeProfileFeatureTemplate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCellularCedgeProfileFeatureTemplate.
type LookupCellularCedgeProfileFeatureTemplateArgs struct {
	// The id of the feature template
	Id *string `pulumi:"id"`
	// The name of the feature template
	Name *string `pulumi:"name"`
}

// A collection of values returned by getCellularCedgeProfileFeatureTemplate.
type LookupCellularCedgeProfileFeatureTemplateResult struct {
	// Set access point name
	AccessPointName string `pulumi:"accessPointName"`
	// Variable name
	AccessPointNameVariable string `pulumi:"accessPointNameVariable"`
	// Set authentication type
	AuthenticationType string `pulumi:"authenticationType"`
	// Variable name
	AuthenticationTypeVariable string `pulumi:"authenticationTypeVariable"`
	// The description of the feature template
	Description string `pulumi:"description"`
	// List of supported device types
	DeviceTypes []string `pulumi:"deviceTypes"`
	// The id of the feature template
	Id string `pulumi:"id"`
	// The name of the feature template
	Name string `pulumi:"name"`
	// No Overwrite
	NoOverwrite bool `pulumi:"noOverwrite"`
	// Variable name
	NoOverwriteVariable string `pulumi:"noOverwriteVariable"`
	// Set packet data network type
	PacketDataNetworkType string `pulumi:"packetDataNetworkType"`
	// Variable name
	PacketDataNetworkTypeVariable string `pulumi:"packetDataNetworkTypeVariable"`
	// Set Profile ID
	ProfileId int `pulumi:"profileId"`
	// Variable name
	ProfileIdVariable string `pulumi:"profileIdVariable"`
	// Set the profile password
	ProfilePassword string `pulumi:"profilePassword"`
	// Variable name
	ProfilePasswordVariable string `pulumi:"profilePasswordVariable"`
	// Set the profile username
	ProfileUsername string `pulumi:"profileUsername"`
	// Variable name
	ProfileUsernameVariable string `pulumi:"profileUsernameVariable"`
	// The template type
	TemplateType string `pulumi:"templateType"`
	// The version of the feature template
	Version int `pulumi:"version"`
}

func LookupCellularCedgeProfileFeatureTemplateOutput(ctx *pulumi.Context, args LookupCellularCedgeProfileFeatureTemplateOutputArgs, opts ...pulumi.InvokeOption) LookupCellularCedgeProfileFeatureTemplateResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupCellularCedgeProfileFeatureTemplateResultOutput, error) {
			args := v.(LookupCellularCedgeProfileFeatureTemplateArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("sdwan:index/getCellularCedgeProfileFeatureTemplate:getCellularCedgeProfileFeatureTemplate", args, LookupCellularCedgeProfileFeatureTemplateResultOutput{}, options).(LookupCellularCedgeProfileFeatureTemplateResultOutput), nil
		}).(LookupCellularCedgeProfileFeatureTemplateResultOutput)
}

// A collection of arguments for invoking getCellularCedgeProfileFeatureTemplate.
type LookupCellularCedgeProfileFeatureTemplateOutputArgs struct {
	// The id of the feature template
	Id pulumi.StringPtrInput `pulumi:"id"`
	// The name of the feature template
	Name pulumi.StringPtrInput `pulumi:"name"`
}

func (LookupCellularCedgeProfileFeatureTemplateOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCellularCedgeProfileFeatureTemplateArgs)(nil)).Elem()
}

// A collection of values returned by getCellularCedgeProfileFeatureTemplate.
type LookupCellularCedgeProfileFeatureTemplateResultOutput struct{ *pulumi.OutputState }

func (LookupCellularCedgeProfileFeatureTemplateResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCellularCedgeProfileFeatureTemplateResult)(nil)).Elem()
}

func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) ToLookupCellularCedgeProfileFeatureTemplateResultOutput() LookupCellularCedgeProfileFeatureTemplateResultOutput {
	return o
}

func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) ToLookupCellularCedgeProfileFeatureTemplateResultOutputWithContext(ctx context.Context) LookupCellularCedgeProfileFeatureTemplateResultOutput {
	return o
}

// Set access point name
func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) AccessPointName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCellularCedgeProfileFeatureTemplateResult) string { return v.AccessPointName }).(pulumi.StringOutput)
}

// Variable name
func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) AccessPointNameVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCellularCedgeProfileFeatureTemplateResult) string { return v.AccessPointNameVariable }).(pulumi.StringOutput)
}

// Set authentication type
func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) AuthenticationType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCellularCedgeProfileFeatureTemplateResult) string { return v.AuthenticationType }).(pulumi.StringOutput)
}

// Variable name
func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) AuthenticationTypeVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCellularCedgeProfileFeatureTemplateResult) string { return v.AuthenticationTypeVariable }).(pulumi.StringOutput)
}

// The description of the feature template
func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCellularCedgeProfileFeatureTemplateResult) string { return v.Description }).(pulumi.StringOutput)
}

// List of supported device types
func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) DeviceTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupCellularCedgeProfileFeatureTemplateResult) []string { return v.DeviceTypes }).(pulumi.StringArrayOutput)
}

// The id of the feature template
func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCellularCedgeProfileFeatureTemplateResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the feature template
func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCellularCedgeProfileFeatureTemplateResult) string { return v.Name }).(pulumi.StringOutput)
}

// No Overwrite
func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) NoOverwrite() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCellularCedgeProfileFeatureTemplateResult) bool { return v.NoOverwrite }).(pulumi.BoolOutput)
}

// Variable name
func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) NoOverwriteVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCellularCedgeProfileFeatureTemplateResult) string { return v.NoOverwriteVariable }).(pulumi.StringOutput)
}

// Set packet data network type
func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) PacketDataNetworkType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCellularCedgeProfileFeatureTemplateResult) string { return v.PacketDataNetworkType }).(pulumi.StringOutput)
}

// Variable name
func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) PacketDataNetworkTypeVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCellularCedgeProfileFeatureTemplateResult) string { return v.PacketDataNetworkTypeVariable }).(pulumi.StringOutput)
}

// Set Profile ID
func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) ProfileId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupCellularCedgeProfileFeatureTemplateResult) int { return v.ProfileId }).(pulumi.IntOutput)
}

// Variable name
func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) ProfileIdVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCellularCedgeProfileFeatureTemplateResult) string { return v.ProfileIdVariable }).(pulumi.StringOutput)
}

// Set the profile password
func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) ProfilePassword() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCellularCedgeProfileFeatureTemplateResult) string { return v.ProfilePassword }).(pulumi.StringOutput)
}

// Variable name
func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) ProfilePasswordVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCellularCedgeProfileFeatureTemplateResult) string { return v.ProfilePasswordVariable }).(pulumi.StringOutput)
}

// Set the profile username
func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) ProfileUsername() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCellularCedgeProfileFeatureTemplateResult) string { return v.ProfileUsername }).(pulumi.StringOutput)
}

// Variable name
func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) ProfileUsernameVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCellularCedgeProfileFeatureTemplateResult) string { return v.ProfileUsernameVariable }).(pulumi.StringOutput)
}

// The template type
func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) TemplateType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCellularCedgeProfileFeatureTemplateResult) string { return v.TemplateType }).(pulumi.StringOutput)
}

// The version of the feature template
func (o LookupCellularCedgeProfileFeatureTemplateResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupCellularCedgeProfileFeatureTemplateResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCellularCedgeProfileFeatureTemplateResultOutput{})
}
