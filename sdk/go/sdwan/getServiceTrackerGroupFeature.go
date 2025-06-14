// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source can read the Service Tracker Group Feature.
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
//			_, err := sdwan.LookupServiceTrackerGroupFeature(ctx, &sdwan.LookupServiceTrackerGroupFeatureArgs{
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
func LookupServiceTrackerGroupFeature(ctx *pulumi.Context, args *LookupServiceTrackerGroupFeatureArgs, opts ...pulumi.InvokeOption) (*LookupServiceTrackerGroupFeatureResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupServiceTrackerGroupFeatureResult
	err := ctx.Invoke("sdwan:index/getServiceTrackerGroupFeature:getServiceTrackerGroupFeature", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceTrackerGroupFeature.
type LookupServiceTrackerGroupFeatureArgs struct {
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The id of the Feature
	Id string `pulumi:"id"`
}

// A collection of values returned by getServiceTrackerGroupFeature.
type LookupServiceTrackerGroupFeatureResult struct {
	// The description of the Feature
	Description string `pulumi:"description"`
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The id of the Feature
	Id string `pulumi:"id"`
	// The name of the Feature
	Name string `pulumi:"name"`
	// tracker ref list combine boolean and or
	TrackerBoolean string `pulumi:"trackerBoolean"`
	// Variable name
	TrackerBooleanVariable string `pulumi:"trackerBooleanVariable"`
	// tracker parcel ref list
	TrackerElements []GetServiceTrackerGroupFeatureTrackerElement `pulumi:"trackerElements"`
	// The version of the Feature
	Version int `pulumi:"version"`
}

func LookupServiceTrackerGroupFeatureOutput(ctx *pulumi.Context, args LookupServiceTrackerGroupFeatureOutputArgs, opts ...pulumi.InvokeOption) LookupServiceTrackerGroupFeatureResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupServiceTrackerGroupFeatureResultOutput, error) {
			args := v.(LookupServiceTrackerGroupFeatureArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("sdwan:index/getServiceTrackerGroupFeature:getServiceTrackerGroupFeature", args, LookupServiceTrackerGroupFeatureResultOutput{}, options).(LookupServiceTrackerGroupFeatureResultOutput), nil
		}).(LookupServiceTrackerGroupFeatureResultOutput)
}

// A collection of arguments for invoking getServiceTrackerGroupFeature.
type LookupServiceTrackerGroupFeatureOutputArgs struct {
	// Feature Profile ID
	FeatureProfileId pulumi.StringInput `pulumi:"featureProfileId"`
	// The id of the Feature
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupServiceTrackerGroupFeatureOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceTrackerGroupFeatureArgs)(nil)).Elem()
}

// A collection of values returned by getServiceTrackerGroupFeature.
type LookupServiceTrackerGroupFeatureResultOutput struct{ *pulumi.OutputState }

func (LookupServiceTrackerGroupFeatureResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceTrackerGroupFeatureResult)(nil)).Elem()
}

func (o LookupServiceTrackerGroupFeatureResultOutput) ToLookupServiceTrackerGroupFeatureResultOutput() LookupServiceTrackerGroupFeatureResultOutput {
	return o
}

func (o LookupServiceTrackerGroupFeatureResultOutput) ToLookupServiceTrackerGroupFeatureResultOutputWithContext(ctx context.Context) LookupServiceTrackerGroupFeatureResultOutput {
	return o
}

// The description of the Feature
func (o LookupServiceTrackerGroupFeatureResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTrackerGroupFeatureResult) string { return v.Description }).(pulumi.StringOutput)
}

// Feature Profile ID
func (o LookupServiceTrackerGroupFeatureResultOutput) FeatureProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTrackerGroupFeatureResult) string { return v.FeatureProfileId }).(pulumi.StringOutput)
}

// The id of the Feature
func (o LookupServiceTrackerGroupFeatureResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTrackerGroupFeatureResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the Feature
func (o LookupServiceTrackerGroupFeatureResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTrackerGroupFeatureResult) string { return v.Name }).(pulumi.StringOutput)
}

// tracker ref list combine boolean and or
func (o LookupServiceTrackerGroupFeatureResultOutput) TrackerBoolean() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTrackerGroupFeatureResult) string { return v.TrackerBoolean }).(pulumi.StringOutput)
}

// Variable name
func (o LookupServiceTrackerGroupFeatureResultOutput) TrackerBooleanVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTrackerGroupFeatureResult) string { return v.TrackerBooleanVariable }).(pulumi.StringOutput)
}

// tracker parcel ref list
func (o LookupServiceTrackerGroupFeatureResultOutput) TrackerElements() GetServiceTrackerGroupFeatureTrackerElementArrayOutput {
	return o.ApplyT(func(v LookupServiceTrackerGroupFeatureResult) []GetServiceTrackerGroupFeatureTrackerElement {
		return v.TrackerElements
	}).(GetServiceTrackerGroupFeatureTrackerElementArrayOutput)
}

// The version of the Feature
func (o LookupServiceTrackerGroupFeatureResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceTrackerGroupFeatureResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServiceTrackerGroupFeatureResultOutput{})
}
