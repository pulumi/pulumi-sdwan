// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source can read the System Banner profile parcel.
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
//			_, err := sdwan.LookupSystemBannerProfileParcel(ctx, &sdwan.LookupSystemBannerProfileParcelArgs{
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
func LookupSystemBannerProfileParcel(ctx *pulumi.Context, args *LookupSystemBannerProfileParcelArgs, opts ...pulumi.InvokeOption) (*LookupSystemBannerProfileParcelResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSystemBannerProfileParcelResult
	err := ctx.Invoke("sdwan:index/getSystemBannerProfileParcel:getSystemBannerProfileParcel", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSystemBannerProfileParcel.
type LookupSystemBannerProfileParcelArgs struct {
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The id of the profile parcel
	Id string `pulumi:"id"`
}

// A collection of values returned by getSystemBannerProfileParcel.
type LookupSystemBannerProfileParcelResult struct {
	// The description of the profile parcel
	Description string `pulumi:"description"`
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The id of the profile parcel
	Id    string `pulumi:"id"`
	Login string `pulumi:"login"`
	// Variable name
	LoginVariable string `pulumi:"loginVariable"`
	Motd          string `pulumi:"motd"`
	// Variable name
	MotdVariable string `pulumi:"motdVariable"`
	// The name of the profile parcel
	Name string `pulumi:"name"`
	// The version of the profile parcel
	Version int `pulumi:"version"`
}

func LookupSystemBannerProfileParcelOutput(ctx *pulumi.Context, args LookupSystemBannerProfileParcelOutputArgs, opts ...pulumi.InvokeOption) LookupSystemBannerProfileParcelResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSystemBannerProfileParcelResult, error) {
			args := v.(LookupSystemBannerProfileParcelArgs)
			r, err := LookupSystemBannerProfileParcel(ctx, &args, opts...)
			var s LookupSystemBannerProfileParcelResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSystemBannerProfileParcelResultOutput)
}

// A collection of arguments for invoking getSystemBannerProfileParcel.
type LookupSystemBannerProfileParcelOutputArgs struct {
	// Feature Profile ID
	FeatureProfileId pulumi.StringInput `pulumi:"featureProfileId"`
	// The id of the profile parcel
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupSystemBannerProfileParcelOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSystemBannerProfileParcelArgs)(nil)).Elem()
}

// A collection of values returned by getSystemBannerProfileParcel.
type LookupSystemBannerProfileParcelResultOutput struct{ *pulumi.OutputState }

func (LookupSystemBannerProfileParcelResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSystemBannerProfileParcelResult)(nil)).Elem()
}

func (o LookupSystemBannerProfileParcelResultOutput) ToLookupSystemBannerProfileParcelResultOutput() LookupSystemBannerProfileParcelResultOutput {
	return o
}

func (o LookupSystemBannerProfileParcelResultOutput) ToLookupSystemBannerProfileParcelResultOutputWithContext(ctx context.Context) LookupSystemBannerProfileParcelResultOutput {
	return o
}

// The description of the profile parcel
func (o LookupSystemBannerProfileParcelResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemBannerProfileParcelResult) string { return v.Description }).(pulumi.StringOutput)
}

// Feature Profile ID
func (o LookupSystemBannerProfileParcelResultOutput) FeatureProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemBannerProfileParcelResult) string { return v.FeatureProfileId }).(pulumi.StringOutput)
}

// The id of the profile parcel
func (o LookupSystemBannerProfileParcelResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemBannerProfileParcelResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSystemBannerProfileParcelResultOutput) Login() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemBannerProfileParcelResult) string { return v.Login }).(pulumi.StringOutput)
}

// Variable name
func (o LookupSystemBannerProfileParcelResultOutput) LoginVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemBannerProfileParcelResult) string { return v.LoginVariable }).(pulumi.StringOutput)
}

func (o LookupSystemBannerProfileParcelResultOutput) Motd() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemBannerProfileParcelResult) string { return v.Motd }).(pulumi.StringOutput)
}

// Variable name
func (o LookupSystemBannerProfileParcelResultOutput) MotdVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemBannerProfileParcelResult) string { return v.MotdVariable }).(pulumi.StringOutput)
}

// The name of the profile parcel
func (o LookupSystemBannerProfileParcelResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemBannerProfileParcelResult) string { return v.Name }).(pulumi.StringOutput)
}

// The version of the profile parcel
func (o LookupSystemBannerProfileParcelResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupSystemBannerProfileParcelResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSystemBannerProfileParcelResultOutput{})
}
