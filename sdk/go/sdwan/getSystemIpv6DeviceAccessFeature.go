// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source can read the System IPv6 Device Access Feature.
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
//			_, err := sdwan.LookupSystemIpv6DeviceAccessFeature(ctx, &sdwan.LookupSystemIpv6DeviceAccessFeatureArgs{
//				Id:               "f6b2c44c-693c-4763-b010-895aa3d236bd",
//				FeatureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupSystemIpv6DeviceAccessFeature(ctx *pulumi.Context, args *LookupSystemIpv6DeviceAccessFeatureArgs, opts ...pulumi.InvokeOption) (*LookupSystemIpv6DeviceAccessFeatureResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSystemIpv6DeviceAccessFeatureResult
	err := ctx.Invoke("sdwan:index/getSystemIpv6DeviceAccessFeature:getSystemIpv6DeviceAccessFeature", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSystemIpv6DeviceAccessFeature.
type LookupSystemIpv6DeviceAccessFeatureArgs struct {
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The id of the Feature
	Id string `pulumi:"id"`
}

// A collection of values returned by getSystemIpv6DeviceAccessFeature.
type LookupSystemIpv6DeviceAccessFeatureResult struct {
	// Default Action
	DefaultAction string `pulumi:"defaultAction"`
	// The description of the Feature
	Description string `pulumi:"description"`
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The id of the Feature
	Id string `pulumi:"id"`
	// The name of the Feature
	Name string `pulumi:"name"`
	// Device Access Control List
	Sequences []GetSystemIpv6DeviceAccessFeatureSequence `pulumi:"sequences"`
	// The version of the Feature
	Version int `pulumi:"version"`
}

func LookupSystemIpv6DeviceAccessFeatureOutput(ctx *pulumi.Context, args LookupSystemIpv6DeviceAccessFeatureOutputArgs, opts ...pulumi.InvokeOption) LookupSystemIpv6DeviceAccessFeatureResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSystemIpv6DeviceAccessFeatureResult, error) {
			args := v.(LookupSystemIpv6DeviceAccessFeatureArgs)
			r, err := LookupSystemIpv6DeviceAccessFeature(ctx, &args, opts...)
			var s LookupSystemIpv6DeviceAccessFeatureResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSystemIpv6DeviceAccessFeatureResultOutput)
}

// A collection of arguments for invoking getSystemIpv6DeviceAccessFeature.
type LookupSystemIpv6DeviceAccessFeatureOutputArgs struct {
	// Feature Profile ID
	FeatureProfileId pulumi.StringInput `pulumi:"featureProfileId"`
	// The id of the Feature
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupSystemIpv6DeviceAccessFeatureOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSystemIpv6DeviceAccessFeatureArgs)(nil)).Elem()
}

// A collection of values returned by getSystemIpv6DeviceAccessFeature.
type LookupSystemIpv6DeviceAccessFeatureResultOutput struct{ *pulumi.OutputState }

func (LookupSystemIpv6DeviceAccessFeatureResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSystemIpv6DeviceAccessFeatureResult)(nil)).Elem()
}

func (o LookupSystemIpv6DeviceAccessFeatureResultOutput) ToLookupSystemIpv6DeviceAccessFeatureResultOutput() LookupSystemIpv6DeviceAccessFeatureResultOutput {
	return o
}

func (o LookupSystemIpv6DeviceAccessFeatureResultOutput) ToLookupSystemIpv6DeviceAccessFeatureResultOutputWithContext(ctx context.Context) LookupSystemIpv6DeviceAccessFeatureResultOutput {
	return o
}

// Default Action
func (o LookupSystemIpv6DeviceAccessFeatureResultOutput) DefaultAction() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemIpv6DeviceAccessFeatureResult) string { return v.DefaultAction }).(pulumi.StringOutput)
}

// The description of the Feature
func (o LookupSystemIpv6DeviceAccessFeatureResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemIpv6DeviceAccessFeatureResult) string { return v.Description }).(pulumi.StringOutput)
}

// Feature Profile ID
func (o LookupSystemIpv6DeviceAccessFeatureResultOutput) FeatureProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemIpv6DeviceAccessFeatureResult) string { return v.FeatureProfileId }).(pulumi.StringOutput)
}

// The id of the Feature
func (o LookupSystemIpv6DeviceAccessFeatureResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemIpv6DeviceAccessFeatureResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the Feature
func (o LookupSystemIpv6DeviceAccessFeatureResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemIpv6DeviceAccessFeatureResult) string { return v.Name }).(pulumi.StringOutput)
}

// Device Access Control List
func (o LookupSystemIpv6DeviceAccessFeatureResultOutput) Sequences() GetSystemIpv6DeviceAccessFeatureSequenceArrayOutput {
	return o.ApplyT(func(v LookupSystemIpv6DeviceAccessFeatureResult) []GetSystemIpv6DeviceAccessFeatureSequence {
		return v.Sequences
	}).(GetSystemIpv6DeviceAccessFeatureSequenceArrayOutput)
}

// The version of the Feature
func (o LookupSystemIpv6DeviceAccessFeatureResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupSystemIpv6DeviceAccessFeatureResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSystemIpv6DeviceAccessFeatureResultOutput{})
}