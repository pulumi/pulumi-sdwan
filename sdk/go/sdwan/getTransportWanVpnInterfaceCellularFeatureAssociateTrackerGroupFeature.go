// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source can read the Transport WAN VPN Interface Cellular Feature Associate Tracker Group Feature .
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
//			_, err := sdwan.LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeature(ctx, &sdwan.LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs{
//				FeatureProfileId:                          "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
//				TransportWanVpnFeatureId:                  "140331f6-5418-4755-a059-13c77eb96037",
//				TransportWanVpnInterfaceCellularFeatureId: "140331f6-5418-4755-a059-13c77eb96037",
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
func LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeature(ctx *pulumi.Context, args *LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs, opts ...pulumi.InvokeOption) (*LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResult
	err := ctx.Invoke("sdwan:index/getTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeature:getTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeature", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeature.
type LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs struct {
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The id of the object
	Id string `pulumi:"id"`
	// Transport WAN VPN Feature ID
	TransportWanVpnFeatureId string `pulumi:"transportWanVpnFeatureId"`
	// Transport WAN VPN Interface Cellular Feature ID
	TransportWanVpnInterfaceCellularFeatureId string `pulumi:"transportWanVpnInterfaceCellularFeatureId"`
}

// A collection of values returned by getTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeature.
type LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResult struct {
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The id of the object
	Id string `pulumi:"id"`
	// Transport Tracker Group Feature ID
	TransportTrackerGroupFeatureId string `pulumi:"transportTrackerGroupFeatureId"`
	// Transport WAN VPN Feature ID
	TransportWanVpnFeatureId string `pulumi:"transportWanVpnFeatureId"`
	// Transport WAN VPN Interface Cellular Feature ID
	TransportWanVpnInterfaceCellularFeatureId string `pulumi:"transportWanVpnInterfaceCellularFeatureId"`
	// The version of the object
	Version int `pulumi:"version"`
}

func LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureOutput(ctx *pulumi.Context, args LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureOutputArgs, opts ...pulumi.InvokeOption) LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResultOutput, error) {
			args := v.(LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("sdwan:index/getTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeature:getTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeature", args, LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResultOutput{}, options).(LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResultOutput), nil
		}).(LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResultOutput)
}

// A collection of arguments for invoking getTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeature.
type LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureOutputArgs struct {
	// Feature Profile ID
	FeatureProfileId pulumi.StringInput `pulumi:"featureProfileId"`
	// The id of the object
	Id pulumi.StringInput `pulumi:"id"`
	// Transport WAN VPN Feature ID
	TransportWanVpnFeatureId pulumi.StringInput `pulumi:"transportWanVpnFeatureId"`
	// Transport WAN VPN Interface Cellular Feature ID
	TransportWanVpnInterfaceCellularFeatureId pulumi.StringInput `pulumi:"transportWanVpnInterfaceCellularFeatureId"`
}

func (LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs)(nil)).Elem()
}

// A collection of values returned by getTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeature.
type LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResultOutput struct{ *pulumi.OutputState }

func (LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResult)(nil)).Elem()
}

func (o LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResultOutput) ToLookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResultOutput() LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResultOutput {
	return o
}

func (o LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResultOutput) ToLookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResultOutputWithContext(ctx context.Context) LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResultOutput {
	return o
}

// Feature Profile ID
func (o LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResultOutput) FeatureProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResult) string {
		return v.FeatureProfileId
	}).(pulumi.StringOutput)
}

// The id of the object
func (o LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResult) string {
		return v.Id
	}).(pulumi.StringOutput)
}

// Transport Tracker Group Feature ID
func (o LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResultOutput) TransportTrackerGroupFeatureId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResult) string {
		return v.TransportTrackerGroupFeatureId
	}).(pulumi.StringOutput)
}

// Transport WAN VPN Feature ID
func (o LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResultOutput) TransportWanVpnFeatureId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResult) string {
		return v.TransportWanVpnFeatureId
	}).(pulumi.StringOutput)
}

// Transport WAN VPN Interface Cellular Feature ID
func (o LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResultOutput) TransportWanVpnInterfaceCellularFeatureId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResult) string {
		return v.TransportWanVpnInterfaceCellularFeatureId
	}).(pulumi.StringOutput)
}

// The version of the object
func (o LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResult) int {
		return v.Version
	}).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureResultOutput{})
}
