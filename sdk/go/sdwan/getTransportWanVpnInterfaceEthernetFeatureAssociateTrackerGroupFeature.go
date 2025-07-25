// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source can read the Transport WAN VPN Interface Ethernet Feature Associate Tracker Group Feature .
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
//			_, err := sdwan.LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature(ctx, &sdwan.LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureArgs{
//				FeatureProfileId:                          "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
//				TransportWanVpnFeatureId:                  "140331f6-5418-4755-a059-13c77eb96037",
//				TransportWanVpnInterfaceEthernetFeatureId: "140331f6-5418-4755-a059-13c77eb96037",
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
func LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature(ctx *pulumi.Context, args *LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureArgs, opts ...pulumi.InvokeOption) (*LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult
	err := ctx.Invoke("sdwan:index/getTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature:getTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature.
type LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureArgs struct {
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The id of the object
	Id string `pulumi:"id"`
	// Transport WAN VPN Feature ID
	TransportWanVpnFeatureId string `pulumi:"transportWanVpnFeatureId"`
	// Transport WAN VPN Interface Ethernet Feature ID
	TransportWanVpnInterfaceEthernetFeatureId string `pulumi:"transportWanVpnInterfaceEthernetFeatureId"`
}

// A collection of values returned by getTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature.
type LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult struct {
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The id of the object
	Id string `pulumi:"id"`
	// Transport Tracker Group Feature ID
	TransportTrackerGroupFeatureId string `pulumi:"transportTrackerGroupFeatureId"`
	// Transport WAN VPN Feature ID
	TransportWanVpnFeatureId string `pulumi:"transportWanVpnFeatureId"`
	// Transport WAN VPN Interface Ethernet Feature ID
	TransportWanVpnInterfaceEthernetFeatureId string `pulumi:"transportWanVpnInterfaceEthernetFeatureId"`
	// The version of the object
	Version int `pulumi:"version"`
}

func LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureOutput(ctx *pulumi.Context, args LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureOutputArgs, opts ...pulumi.InvokeOption) LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResultOutput, error) {
			args := v.(LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("sdwan:index/getTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature:getTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature", args, LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResultOutput{}, options).(LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResultOutput), nil
		}).(LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResultOutput)
}

// A collection of arguments for invoking getTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature.
type LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureOutputArgs struct {
	// Feature Profile ID
	FeatureProfileId pulumi.StringInput `pulumi:"featureProfileId"`
	// The id of the object
	Id pulumi.StringInput `pulumi:"id"`
	// Transport WAN VPN Feature ID
	TransportWanVpnFeatureId pulumi.StringInput `pulumi:"transportWanVpnFeatureId"`
	// Transport WAN VPN Interface Ethernet Feature ID
	TransportWanVpnInterfaceEthernetFeatureId pulumi.StringInput `pulumi:"transportWanVpnInterfaceEthernetFeatureId"`
}

func (LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureArgs)(nil)).Elem()
}

// A collection of values returned by getTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature.
type LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResultOutput struct{ *pulumi.OutputState }

func (LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult)(nil)).Elem()
}

func (o LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResultOutput) ToLookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResultOutput() LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResultOutput {
	return o
}

func (o LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResultOutput) ToLookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResultOutputWithContext(ctx context.Context) LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResultOutput {
	return o
}

// Feature Profile ID
func (o LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResultOutput) FeatureProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult) string {
		return v.FeatureProfileId
	}).(pulumi.StringOutput)
}

// The id of the object
func (o LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult) string {
		return v.Id
	}).(pulumi.StringOutput)
}

// Transport Tracker Group Feature ID
func (o LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResultOutput) TransportTrackerGroupFeatureId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult) string {
		return v.TransportTrackerGroupFeatureId
	}).(pulumi.StringOutput)
}

// Transport WAN VPN Feature ID
func (o LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResultOutput) TransportWanVpnFeatureId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult) string {
		return v.TransportWanVpnFeatureId
	}).(pulumi.StringOutput)
}

// Transport WAN VPN Interface Ethernet Feature ID
func (o LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResultOutput) TransportWanVpnInterfaceEthernetFeatureId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult) string {
		return v.TransportWanVpnInterfaceEthernetFeatureId
	}).(pulumi.StringOutput)
}

// The version of the object
func (o LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult) int {
		return v.Version
	}).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResultOutput{})
}
