// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source can read the Service Routing OSPFv3 IPv4 Feature.
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
//			_, err := sdwan.LookupServiceRoutingOspfv3Ipv4Feature(ctx, &sdwan.LookupServiceRoutingOspfv3Ipv4FeatureArgs{
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
func LookupServiceRoutingOspfv3Ipv4Feature(ctx *pulumi.Context, args *LookupServiceRoutingOspfv3Ipv4FeatureArgs, opts ...pulumi.InvokeOption) (*LookupServiceRoutingOspfv3Ipv4FeatureResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupServiceRoutingOspfv3Ipv4FeatureResult
	err := ctx.Invoke("sdwan:index/getServiceRoutingOspfv3Ipv4Feature:getServiceRoutingOspfv3Ipv4Feature", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceRoutingOspfv3Ipv4Feature.
type LookupServiceRoutingOspfv3Ipv4FeatureArgs struct {
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The id of the Feature
	Id string `pulumi:"id"`
}

// A collection of values returned by getServiceRoutingOspfv3Ipv4Feature.
type LookupServiceRoutingOspfv3Ipv4FeatureResult struct {
	// Configure OSPFv3 IPv4 area
	Areas []GetServiceRoutingOspfv3Ipv4FeatureArea `pulumi:"areas"`
	// Distribute default external route into OSPF disabled
	DefaultInformationOriginate bool `pulumi:"defaultInformationOriginate"`
	// Always advertise default route
	DefaultInformationOriginateAlways bool `pulumi:"defaultInformationOriginateAlways"`
	// Variable name
	DefaultInformationOriginateAlwaysVariable string `pulumi:"defaultInformationOriginateAlwaysVariable"`
	// Set metric used to generate default route \n\n
	DefaultInformationOriginateMetric int `pulumi:"defaultInformationOriginateMetric"`
	// Set default route metric type
	DefaultInformationOriginateMetricType string `pulumi:"defaultInformationOriginateMetricType"`
	// Variable name
	DefaultInformationOriginateMetricTypeVariable string `pulumi:"defaultInformationOriginateMetricTypeVariable"`
	// Variable name
	DefaultInformationOriginateMetricVariable string `pulumi:"defaultInformationOriginateMetricVariable"`
	// The description of the Feature
	Description string `pulumi:"description"`
	// Distance
	Distance int `pulumi:"distance"`
	// Set distance for external routes
	DistanceExternal int `pulumi:"distanceExternal"`
	// Variable name
	DistanceExternalVariable string `pulumi:"distanceExternalVariable"`
	// Set distance for inter-area routes
	DistanceInterArea int `pulumi:"distanceInterArea"`
	// Variable name
	DistanceInterAreaVariable string `pulumi:"distanceInterAreaVariable"`
	// Set distance for intra-area routes
	DistanceIntraArea int `pulumi:"distanceIntraArea"`
	// Variable name
	DistanceIntraAreaVariable string `pulumi:"distanceIntraAreaVariable"`
	// Variable name
	DistanceVariable string `pulumi:"distanceVariable"`
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// Table map filtered or not
	Filter bool `pulumi:"filter"`
	// Variable name
	FilterVariable string `pulumi:"filterVariable"`
	// The id of the Feature
	Id string `pulumi:"id"`
	// The name of the Feature
	Name string `pulumi:"name"`
	// Redistribute routes
	Redistributes []GetServiceRoutingOspfv3Ipv4FeatureRedistribute `pulumi:"redistributes"`
	// Set reference bandwidth method to assign OSPF cost
	ReferenceBandwidth int `pulumi:"referenceBandwidth"`
	// Variable name
	ReferenceBandwidthVariable string `pulumi:"referenceBandwidthVariable"`
	// Calculate summary route cost based on RFC 1583
	Rfc1583Compatible bool `pulumi:"rfc1583Compatible"`
	// Variable name
	Rfc1583CompatibleVariable string `pulumi:"rfc1583CompatibleVariable"`
	RoutePolicyId             string `pulumi:"routePolicyId"`
	// Set OSPF router ID to override system IP address
	RouterId string `pulumi:"routerId"`
	// Variable name
	RouterIdVariable string `pulumi:"routerIdVariable"`
	// Not advertise maximum metric Router LSA policy by default
	RouterLsaAction string `pulumi:"routerLsaAction"`
	// Set how long to advertise maximum metric after router boot up
	RouterLsaOnStartupTime int `pulumi:"routerLsaOnStartupTime"`
	// Variable name
	RouterLsaOnStartupTimeVariable string `pulumi:"routerLsaOnStartupTimeVariable"`
	// Set delay from first change received until performing SPF calculation
	SpfCalculationDelay int `pulumi:"spfCalculationDelay"`
	// Variable name
	SpfCalculationDelayVariable string `pulumi:"spfCalculationDelayVariable"`
	// Set initial hold time between consecutive SPF calculations
	SpfInitialHoldTime int `pulumi:"spfInitialHoldTime"`
	// Variable name
	SpfInitialHoldTimeVariable string `pulumi:"spfInitialHoldTimeVariable"`
	// Set maximum hold time between consecutive SPF calculations
	SpfMaximumHoldTime int `pulumi:"spfMaximumHoldTime"`
	// Variable name
	SpfMaximumHoldTimeVariable string `pulumi:"spfMaximumHoldTimeVariable"`
	// The version of the Feature
	Version int `pulumi:"version"`
}

func LookupServiceRoutingOspfv3Ipv4FeatureOutput(ctx *pulumi.Context, args LookupServiceRoutingOspfv3Ipv4FeatureOutputArgs, opts ...pulumi.InvokeOption) LookupServiceRoutingOspfv3Ipv4FeatureResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupServiceRoutingOspfv3Ipv4FeatureResult, error) {
			args := v.(LookupServiceRoutingOspfv3Ipv4FeatureArgs)
			r, err := LookupServiceRoutingOspfv3Ipv4Feature(ctx, &args, opts...)
			var s LookupServiceRoutingOspfv3Ipv4FeatureResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupServiceRoutingOspfv3Ipv4FeatureResultOutput)
}

// A collection of arguments for invoking getServiceRoutingOspfv3Ipv4Feature.
type LookupServiceRoutingOspfv3Ipv4FeatureOutputArgs struct {
	// Feature Profile ID
	FeatureProfileId pulumi.StringInput `pulumi:"featureProfileId"`
	// The id of the Feature
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupServiceRoutingOspfv3Ipv4FeatureOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceRoutingOspfv3Ipv4FeatureArgs)(nil)).Elem()
}

// A collection of values returned by getServiceRoutingOspfv3Ipv4Feature.
type LookupServiceRoutingOspfv3Ipv4FeatureResultOutput struct{ *pulumi.OutputState }

func (LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceRoutingOspfv3Ipv4FeatureResult)(nil)).Elem()
}

func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) ToLookupServiceRoutingOspfv3Ipv4FeatureResultOutput() LookupServiceRoutingOspfv3Ipv4FeatureResultOutput {
	return o
}

func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) ToLookupServiceRoutingOspfv3Ipv4FeatureResultOutputWithContext(ctx context.Context) LookupServiceRoutingOspfv3Ipv4FeatureResultOutput {
	return o
}

// Configure OSPFv3 IPv4 area
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) Areas() GetServiceRoutingOspfv3Ipv4FeatureAreaArrayOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) []GetServiceRoutingOspfv3Ipv4FeatureArea {
		return v.Areas
	}).(GetServiceRoutingOspfv3Ipv4FeatureAreaArrayOutput)
}

// Distribute default external route into OSPF disabled
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) DefaultInformationOriginate() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) bool { return v.DefaultInformationOriginate }).(pulumi.BoolOutput)
}

// Always advertise default route
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) DefaultInformationOriginateAlways() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) bool { return v.DefaultInformationOriginateAlways }).(pulumi.BoolOutput)
}

// Variable name
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) DefaultInformationOriginateAlwaysVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string {
		return v.DefaultInformationOriginateAlwaysVariable
	}).(pulumi.StringOutput)
}

// Set metric used to generate default route \n\n
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) DefaultInformationOriginateMetric() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) int { return v.DefaultInformationOriginateMetric }).(pulumi.IntOutput)
}

// Set default route metric type
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) DefaultInformationOriginateMetricType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string {
		return v.DefaultInformationOriginateMetricType
	}).(pulumi.StringOutput)
}

// Variable name
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) DefaultInformationOriginateMetricTypeVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string {
		return v.DefaultInformationOriginateMetricTypeVariable
	}).(pulumi.StringOutput)
}

// Variable name
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) DefaultInformationOriginateMetricVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string {
		return v.DefaultInformationOriginateMetricVariable
	}).(pulumi.StringOutput)
}

// The description of the Feature
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string { return v.Description }).(pulumi.StringOutput)
}

// Distance
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) Distance() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) int { return v.Distance }).(pulumi.IntOutput)
}

// Set distance for external routes
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) DistanceExternal() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) int { return v.DistanceExternal }).(pulumi.IntOutput)
}

// Variable name
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) DistanceExternalVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string { return v.DistanceExternalVariable }).(pulumi.StringOutput)
}

// Set distance for inter-area routes
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) DistanceInterArea() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) int { return v.DistanceInterArea }).(pulumi.IntOutput)
}

// Variable name
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) DistanceInterAreaVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string { return v.DistanceInterAreaVariable }).(pulumi.StringOutput)
}

// Set distance for intra-area routes
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) DistanceIntraArea() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) int { return v.DistanceIntraArea }).(pulumi.IntOutput)
}

// Variable name
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) DistanceIntraAreaVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string { return v.DistanceIntraAreaVariable }).(pulumi.StringOutput)
}

// Variable name
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) DistanceVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string { return v.DistanceVariable }).(pulumi.StringOutput)
}

// Feature Profile ID
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) FeatureProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string { return v.FeatureProfileId }).(pulumi.StringOutput)
}

// Table map filtered or not
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) Filter() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) bool { return v.Filter }).(pulumi.BoolOutput)
}

// Variable name
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) FilterVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string { return v.FilterVariable }).(pulumi.StringOutput)
}

// The id of the Feature
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the Feature
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string { return v.Name }).(pulumi.StringOutput)
}

// Redistribute routes
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) Redistributes() GetServiceRoutingOspfv3Ipv4FeatureRedistributeArrayOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) []GetServiceRoutingOspfv3Ipv4FeatureRedistribute {
		return v.Redistributes
	}).(GetServiceRoutingOspfv3Ipv4FeatureRedistributeArrayOutput)
}

// Set reference bandwidth method to assign OSPF cost
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) ReferenceBandwidth() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) int { return v.ReferenceBandwidth }).(pulumi.IntOutput)
}

// Variable name
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) ReferenceBandwidthVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string { return v.ReferenceBandwidthVariable }).(pulumi.StringOutput)
}

// Calculate summary route cost based on RFC 1583
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) Rfc1583Compatible() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) bool { return v.Rfc1583Compatible }).(pulumi.BoolOutput)
}

// Variable name
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) Rfc1583CompatibleVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string { return v.Rfc1583CompatibleVariable }).(pulumi.StringOutput)
}

func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) RoutePolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string { return v.RoutePolicyId }).(pulumi.StringOutput)
}

// Set OSPF router ID to override system IP address
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) RouterId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string { return v.RouterId }).(pulumi.StringOutput)
}

// Variable name
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) RouterIdVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string { return v.RouterIdVariable }).(pulumi.StringOutput)
}

// Not advertise maximum metric Router LSA policy by default
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) RouterLsaAction() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string { return v.RouterLsaAction }).(pulumi.StringOutput)
}

// Set how long to advertise maximum metric after router boot up
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) RouterLsaOnStartupTime() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) int { return v.RouterLsaOnStartupTime }).(pulumi.IntOutput)
}

// Variable name
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) RouterLsaOnStartupTimeVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string { return v.RouterLsaOnStartupTimeVariable }).(pulumi.StringOutput)
}

// Set delay from first change received until performing SPF calculation
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) SpfCalculationDelay() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) int { return v.SpfCalculationDelay }).(pulumi.IntOutput)
}

// Variable name
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) SpfCalculationDelayVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string { return v.SpfCalculationDelayVariable }).(pulumi.StringOutput)
}

// Set initial hold time between consecutive SPF calculations
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) SpfInitialHoldTime() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) int { return v.SpfInitialHoldTime }).(pulumi.IntOutput)
}

// Variable name
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) SpfInitialHoldTimeVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string { return v.SpfInitialHoldTimeVariable }).(pulumi.StringOutput)
}

// Set maximum hold time between consecutive SPF calculations
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) SpfMaximumHoldTime() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) int { return v.SpfMaximumHoldTime }).(pulumi.IntOutput)
}

// Variable name
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) SpfMaximumHoldTimeVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) string { return v.SpfMaximumHoldTimeVariable }).(pulumi.StringOutput)
}

// The version of the Feature
func (o LookupServiceRoutingOspfv3Ipv4FeatureResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceRoutingOspfv3Ipv4FeatureResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServiceRoutingOspfv3Ipv4FeatureResultOutput{})
}