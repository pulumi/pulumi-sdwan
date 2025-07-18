// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source can read the Service LAN VPN Feature Associate Routing OSPFv3 IPv4 Feature .
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
//			_, err := sdwan.LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4Feature(ctx, &sdwan.LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureArgs{
//				FeatureProfileId:       "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
//				ServiceLanVpnFeatureId: "140331f6-5418-4755-a059-13c77eb96037",
//				Id:                     "f6b2c44c-693c-4763-b010-895aa3d236bd",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4Feature(ctx *pulumi.Context, args *LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureArgs, opts ...pulumi.InvokeOption) (*LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResult
	err := ctx.Invoke("sdwan:index/getServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4Feature:getServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4Feature", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4Feature.
type LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureArgs struct {
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The id of the object
	Id string `pulumi:"id"`
	// Service LAN VPN Feature ID
	ServiceLanVpnFeatureId string `pulumi:"serviceLanVpnFeatureId"`
}

// A collection of values returned by getServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4Feature.
type LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResult struct {
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The id of the object
	Id string `pulumi:"id"`
	// Service LAN VPN Feature ID
	ServiceLanVpnFeatureId string `pulumi:"serviceLanVpnFeatureId"`
	// Service Routing OSPFv3 IPv4 Feature ID
	ServiceRoutingOspfv3Ipv4FeatureId string `pulumi:"serviceRoutingOspfv3Ipv4FeatureId"`
	// The version of the object
	Version int `pulumi:"version"`
}

func LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureOutput(ctx *pulumi.Context, args LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureOutputArgs, opts ...pulumi.InvokeOption) LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResultOutput, error) {
			args := v.(LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("sdwan:index/getServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4Feature:getServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4Feature", args, LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResultOutput{}, options).(LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResultOutput), nil
		}).(LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResultOutput)
}

// A collection of arguments for invoking getServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4Feature.
type LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureOutputArgs struct {
	// Feature Profile ID
	FeatureProfileId pulumi.StringInput `pulumi:"featureProfileId"`
	// The id of the object
	Id pulumi.StringInput `pulumi:"id"`
	// Service LAN VPN Feature ID
	ServiceLanVpnFeatureId pulumi.StringInput `pulumi:"serviceLanVpnFeatureId"`
}

func (LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureArgs)(nil)).Elem()
}

// A collection of values returned by getServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4Feature.
type LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResultOutput struct{ *pulumi.OutputState }

func (LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResult)(nil)).Elem()
}

func (o LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResultOutput) ToLookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResultOutput() LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResultOutput {
	return o
}

func (o LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResultOutput) ToLookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResultOutputWithContext(ctx context.Context) LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResultOutput {
	return o
}

// Feature Profile ID
func (o LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResultOutput) FeatureProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResult) string {
		return v.FeatureProfileId
	}).(pulumi.StringOutput)
}

// The id of the object
func (o LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResult) string { return v.Id }).(pulumi.StringOutput)
}

// Service LAN VPN Feature ID
func (o LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResultOutput) ServiceLanVpnFeatureId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResult) string {
		return v.ServiceLanVpnFeatureId
	}).(pulumi.StringOutput)
}

// Service Routing OSPFv3 IPv4 Feature ID
func (o LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResultOutput) ServiceRoutingOspfv3Ipv4FeatureId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResult) string {
		return v.ServiceRoutingOspfv3Ipv4FeatureId
	}).(pulumi.StringOutput)
}

// The version of the object
func (o LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureResultOutput{})
}
