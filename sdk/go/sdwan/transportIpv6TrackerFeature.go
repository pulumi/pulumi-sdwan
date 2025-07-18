// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource can manage a Transport IPv6 Tracker Feature.
//   - Minimum SD-WAN Manager version: `20.12.0`
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
//			_, err := sdwan.NewTransportIpv6TrackerFeature(ctx, "example", &sdwan.TransportIpv6TrackerFeatureArgs{
//				Name:                pulumi.String("Example"),
//				Description:         pulumi.String("My Example"),
//				FeatureProfileId:    pulumi.String("f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"),
//				TrackerName:         pulumi.String("TRACKER_1"),
//				EndpointApiUrl:      pulumi.String("google.com"),
//				EndpointDnsName:     pulumi.String("google.com"),
//				EndpointIp:          pulumi.String("2001:0:0:1::0"),
//				Interval:            pulumi.Int(30),
//				Multiplier:          pulumi.Int(3),
//				Threshold:           pulumi.Int(300),
//				EndpointTrackerType: pulumi.String("ipv6-interface"),
//				TrackerType:         pulumi.String("endpoint"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// The `pulumi import` command can be used, for example:
//
// Expected import identifier with the format: "transport_ipv6_tracker_feature_id,feature_profile_id"
//
// ```sh
// $ pulumi import sdwan:index/transportIpv6TrackerFeature:TransportIpv6TrackerFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"
// ```
type TransportIpv6TrackerFeature struct {
	pulumi.CustomResourceState

	// The description of the Feature
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// API url of endpoint
	EndpointApiUrl pulumi.StringPtrOutput `pulumi:"endpointApiUrl"`
	// Variable name
	EndpointApiUrlVariable pulumi.StringPtrOutput `pulumi:"endpointApiUrlVariable"`
	// Endpoint DNS Name
	EndpointDnsName pulumi.StringPtrOutput `pulumi:"endpointDnsName"`
	// Variable name
	EndpointDnsNameVariable pulumi.StringPtrOutput `pulumi:"endpointDnsNameVariable"`
	// Endpoint IP
	EndpointIp pulumi.StringPtrOutput `pulumi:"endpointIp"`
	// Variable name
	EndpointIpVariable pulumi.StringPtrOutput `pulumi:"endpointIpVariable"`
	// Endpoint Tracker Type - Choices: `ipv6-interface` - Default value: `ipv6-interface`
	EndpointTrackerType pulumi.StringPtrOutput `pulumi:"endpointTrackerType"`
	// Variable name
	EndpointTrackerTypeVariable pulumi.StringPtrOutput `pulumi:"endpointTrackerTypeVariable"`
	// Feature Profile ID
	FeatureProfileId pulumi.StringOutput `pulumi:"featureProfileId"`
	// Interval - Range: `20`-`600` - Default value: `60`
	Interval pulumi.IntPtrOutput `pulumi:"interval"`
	// Variable name
	IntervalVariable pulumi.StringPtrOutput `pulumi:"intervalVariable"`
	// Multiplier - Range: `1`-`10` - Default value: `3`
	Multiplier pulumi.IntPtrOutput `pulumi:"multiplier"`
	// Variable name
	MultiplierVariable pulumi.StringPtrOutput `pulumi:"multiplierVariable"`
	// The name of the Feature
	Name pulumi.StringOutput `pulumi:"name"`
	// Threshold - Range: `100`-`1000` - Default value: `300`
	Threshold pulumi.IntPtrOutput `pulumi:"threshold"`
	// Variable name
	ThresholdVariable pulumi.StringPtrOutput `pulumi:"thresholdVariable"`
	// Tracker Name
	TrackerName pulumi.StringPtrOutput `pulumi:"trackerName"`
	// Variable name
	TrackerNameVariable pulumi.StringPtrOutput `pulumi:"trackerNameVariable"`
	// Tracker Type - Choices: `endpoint` - Default value: `endpoint`
	TrackerType pulumi.StringPtrOutput `pulumi:"trackerType"`
	// Variable name
	TrackerTypeVariable pulumi.StringPtrOutput `pulumi:"trackerTypeVariable"`
	// The version of the Feature
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewTransportIpv6TrackerFeature registers a new resource with the given unique name, arguments, and options.
func NewTransportIpv6TrackerFeature(ctx *pulumi.Context,
	name string, args *TransportIpv6TrackerFeatureArgs, opts ...pulumi.ResourceOption) (*TransportIpv6TrackerFeature, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FeatureProfileId == nil {
		return nil, errors.New("invalid value for required argument 'FeatureProfileId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TransportIpv6TrackerFeature
	err := ctx.RegisterResource("sdwan:index/transportIpv6TrackerFeature:TransportIpv6TrackerFeature", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTransportIpv6TrackerFeature gets an existing TransportIpv6TrackerFeature resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTransportIpv6TrackerFeature(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TransportIpv6TrackerFeatureState, opts ...pulumi.ResourceOption) (*TransportIpv6TrackerFeature, error) {
	var resource TransportIpv6TrackerFeature
	err := ctx.ReadResource("sdwan:index/transportIpv6TrackerFeature:TransportIpv6TrackerFeature", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TransportIpv6TrackerFeature resources.
type transportIpv6TrackerFeatureState struct {
	// The description of the Feature
	Description *string `pulumi:"description"`
	// API url of endpoint
	EndpointApiUrl *string `pulumi:"endpointApiUrl"`
	// Variable name
	EndpointApiUrlVariable *string `pulumi:"endpointApiUrlVariable"`
	// Endpoint DNS Name
	EndpointDnsName *string `pulumi:"endpointDnsName"`
	// Variable name
	EndpointDnsNameVariable *string `pulumi:"endpointDnsNameVariable"`
	// Endpoint IP
	EndpointIp *string `pulumi:"endpointIp"`
	// Variable name
	EndpointIpVariable *string `pulumi:"endpointIpVariable"`
	// Endpoint Tracker Type - Choices: `ipv6-interface` - Default value: `ipv6-interface`
	EndpointTrackerType *string `pulumi:"endpointTrackerType"`
	// Variable name
	EndpointTrackerTypeVariable *string `pulumi:"endpointTrackerTypeVariable"`
	// Feature Profile ID
	FeatureProfileId *string `pulumi:"featureProfileId"`
	// Interval - Range: `20`-`600` - Default value: `60`
	Interval *int `pulumi:"interval"`
	// Variable name
	IntervalVariable *string `pulumi:"intervalVariable"`
	// Multiplier - Range: `1`-`10` - Default value: `3`
	Multiplier *int `pulumi:"multiplier"`
	// Variable name
	MultiplierVariable *string `pulumi:"multiplierVariable"`
	// The name of the Feature
	Name *string `pulumi:"name"`
	// Threshold - Range: `100`-`1000` - Default value: `300`
	Threshold *int `pulumi:"threshold"`
	// Variable name
	ThresholdVariable *string `pulumi:"thresholdVariable"`
	// Tracker Name
	TrackerName *string `pulumi:"trackerName"`
	// Variable name
	TrackerNameVariable *string `pulumi:"trackerNameVariable"`
	// Tracker Type - Choices: `endpoint` - Default value: `endpoint`
	TrackerType *string `pulumi:"trackerType"`
	// Variable name
	TrackerTypeVariable *string `pulumi:"trackerTypeVariable"`
	// The version of the Feature
	Version *int `pulumi:"version"`
}

type TransportIpv6TrackerFeatureState struct {
	// The description of the Feature
	Description pulumi.StringPtrInput
	// API url of endpoint
	EndpointApiUrl pulumi.StringPtrInput
	// Variable name
	EndpointApiUrlVariable pulumi.StringPtrInput
	// Endpoint DNS Name
	EndpointDnsName pulumi.StringPtrInput
	// Variable name
	EndpointDnsNameVariable pulumi.StringPtrInput
	// Endpoint IP
	EndpointIp pulumi.StringPtrInput
	// Variable name
	EndpointIpVariable pulumi.StringPtrInput
	// Endpoint Tracker Type - Choices: `ipv6-interface` - Default value: `ipv6-interface`
	EndpointTrackerType pulumi.StringPtrInput
	// Variable name
	EndpointTrackerTypeVariable pulumi.StringPtrInput
	// Feature Profile ID
	FeatureProfileId pulumi.StringPtrInput
	// Interval - Range: `20`-`600` - Default value: `60`
	Interval pulumi.IntPtrInput
	// Variable name
	IntervalVariable pulumi.StringPtrInput
	// Multiplier - Range: `1`-`10` - Default value: `3`
	Multiplier pulumi.IntPtrInput
	// Variable name
	MultiplierVariable pulumi.StringPtrInput
	// The name of the Feature
	Name pulumi.StringPtrInput
	// Threshold - Range: `100`-`1000` - Default value: `300`
	Threshold pulumi.IntPtrInput
	// Variable name
	ThresholdVariable pulumi.StringPtrInput
	// Tracker Name
	TrackerName pulumi.StringPtrInput
	// Variable name
	TrackerNameVariable pulumi.StringPtrInput
	// Tracker Type - Choices: `endpoint` - Default value: `endpoint`
	TrackerType pulumi.StringPtrInput
	// Variable name
	TrackerTypeVariable pulumi.StringPtrInput
	// The version of the Feature
	Version pulumi.IntPtrInput
}

func (TransportIpv6TrackerFeatureState) ElementType() reflect.Type {
	return reflect.TypeOf((*transportIpv6TrackerFeatureState)(nil)).Elem()
}

type transportIpv6TrackerFeatureArgs struct {
	// The description of the Feature
	Description *string `pulumi:"description"`
	// API url of endpoint
	EndpointApiUrl *string `pulumi:"endpointApiUrl"`
	// Variable name
	EndpointApiUrlVariable *string `pulumi:"endpointApiUrlVariable"`
	// Endpoint DNS Name
	EndpointDnsName *string `pulumi:"endpointDnsName"`
	// Variable name
	EndpointDnsNameVariable *string `pulumi:"endpointDnsNameVariable"`
	// Endpoint IP
	EndpointIp *string `pulumi:"endpointIp"`
	// Variable name
	EndpointIpVariable *string `pulumi:"endpointIpVariable"`
	// Endpoint Tracker Type - Choices: `ipv6-interface` - Default value: `ipv6-interface`
	EndpointTrackerType *string `pulumi:"endpointTrackerType"`
	// Variable name
	EndpointTrackerTypeVariable *string `pulumi:"endpointTrackerTypeVariable"`
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// Interval - Range: `20`-`600` - Default value: `60`
	Interval *int `pulumi:"interval"`
	// Variable name
	IntervalVariable *string `pulumi:"intervalVariable"`
	// Multiplier - Range: `1`-`10` - Default value: `3`
	Multiplier *int `pulumi:"multiplier"`
	// Variable name
	MultiplierVariable *string `pulumi:"multiplierVariable"`
	// The name of the Feature
	Name *string `pulumi:"name"`
	// Threshold - Range: `100`-`1000` - Default value: `300`
	Threshold *int `pulumi:"threshold"`
	// Variable name
	ThresholdVariable *string `pulumi:"thresholdVariable"`
	// Tracker Name
	TrackerName *string `pulumi:"trackerName"`
	// Variable name
	TrackerNameVariable *string `pulumi:"trackerNameVariable"`
	// Tracker Type - Choices: `endpoint` - Default value: `endpoint`
	TrackerType *string `pulumi:"trackerType"`
	// Variable name
	TrackerTypeVariable *string `pulumi:"trackerTypeVariable"`
}

// The set of arguments for constructing a TransportIpv6TrackerFeature resource.
type TransportIpv6TrackerFeatureArgs struct {
	// The description of the Feature
	Description pulumi.StringPtrInput
	// API url of endpoint
	EndpointApiUrl pulumi.StringPtrInput
	// Variable name
	EndpointApiUrlVariable pulumi.StringPtrInput
	// Endpoint DNS Name
	EndpointDnsName pulumi.StringPtrInput
	// Variable name
	EndpointDnsNameVariable pulumi.StringPtrInput
	// Endpoint IP
	EndpointIp pulumi.StringPtrInput
	// Variable name
	EndpointIpVariable pulumi.StringPtrInput
	// Endpoint Tracker Type - Choices: `ipv6-interface` - Default value: `ipv6-interface`
	EndpointTrackerType pulumi.StringPtrInput
	// Variable name
	EndpointTrackerTypeVariable pulumi.StringPtrInput
	// Feature Profile ID
	FeatureProfileId pulumi.StringInput
	// Interval - Range: `20`-`600` - Default value: `60`
	Interval pulumi.IntPtrInput
	// Variable name
	IntervalVariable pulumi.StringPtrInput
	// Multiplier - Range: `1`-`10` - Default value: `3`
	Multiplier pulumi.IntPtrInput
	// Variable name
	MultiplierVariable pulumi.StringPtrInput
	// The name of the Feature
	Name pulumi.StringPtrInput
	// Threshold - Range: `100`-`1000` - Default value: `300`
	Threshold pulumi.IntPtrInput
	// Variable name
	ThresholdVariable pulumi.StringPtrInput
	// Tracker Name
	TrackerName pulumi.StringPtrInput
	// Variable name
	TrackerNameVariable pulumi.StringPtrInput
	// Tracker Type - Choices: `endpoint` - Default value: `endpoint`
	TrackerType pulumi.StringPtrInput
	// Variable name
	TrackerTypeVariable pulumi.StringPtrInput
}

func (TransportIpv6TrackerFeatureArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*transportIpv6TrackerFeatureArgs)(nil)).Elem()
}

type TransportIpv6TrackerFeatureInput interface {
	pulumi.Input

	ToTransportIpv6TrackerFeatureOutput() TransportIpv6TrackerFeatureOutput
	ToTransportIpv6TrackerFeatureOutputWithContext(ctx context.Context) TransportIpv6TrackerFeatureOutput
}

func (*TransportIpv6TrackerFeature) ElementType() reflect.Type {
	return reflect.TypeOf((**TransportIpv6TrackerFeature)(nil)).Elem()
}

func (i *TransportIpv6TrackerFeature) ToTransportIpv6TrackerFeatureOutput() TransportIpv6TrackerFeatureOutput {
	return i.ToTransportIpv6TrackerFeatureOutputWithContext(context.Background())
}

func (i *TransportIpv6TrackerFeature) ToTransportIpv6TrackerFeatureOutputWithContext(ctx context.Context) TransportIpv6TrackerFeatureOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransportIpv6TrackerFeatureOutput)
}

// TransportIpv6TrackerFeatureArrayInput is an input type that accepts TransportIpv6TrackerFeatureArray and TransportIpv6TrackerFeatureArrayOutput values.
// You can construct a concrete instance of `TransportIpv6TrackerFeatureArrayInput` via:
//
//	TransportIpv6TrackerFeatureArray{ TransportIpv6TrackerFeatureArgs{...} }
type TransportIpv6TrackerFeatureArrayInput interface {
	pulumi.Input

	ToTransportIpv6TrackerFeatureArrayOutput() TransportIpv6TrackerFeatureArrayOutput
	ToTransportIpv6TrackerFeatureArrayOutputWithContext(context.Context) TransportIpv6TrackerFeatureArrayOutput
}

type TransportIpv6TrackerFeatureArray []TransportIpv6TrackerFeatureInput

func (TransportIpv6TrackerFeatureArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransportIpv6TrackerFeature)(nil)).Elem()
}

func (i TransportIpv6TrackerFeatureArray) ToTransportIpv6TrackerFeatureArrayOutput() TransportIpv6TrackerFeatureArrayOutput {
	return i.ToTransportIpv6TrackerFeatureArrayOutputWithContext(context.Background())
}

func (i TransportIpv6TrackerFeatureArray) ToTransportIpv6TrackerFeatureArrayOutputWithContext(ctx context.Context) TransportIpv6TrackerFeatureArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransportIpv6TrackerFeatureArrayOutput)
}

// TransportIpv6TrackerFeatureMapInput is an input type that accepts TransportIpv6TrackerFeatureMap and TransportIpv6TrackerFeatureMapOutput values.
// You can construct a concrete instance of `TransportIpv6TrackerFeatureMapInput` via:
//
//	TransportIpv6TrackerFeatureMap{ "key": TransportIpv6TrackerFeatureArgs{...} }
type TransportIpv6TrackerFeatureMapInput interface {
	pulumi.Input

	ToTransportIpv6TrackerFeatureMapOutput() TransportIpv6TrackerFeatureMapOutput
	ToTransportIpv6TrackerFeatureMapOutputWithContext(context.Context) TransportIpv6TrackerFeatureMapOutput
}

type TransportIpv6TrackerFeatureMap map[string]TransportIpv6TrackerFeatureInput

func (TransportIpv6TrackerFeatureMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransportIpv6TrackerFeature)(nil)).Elem()
}

func (i TransportIpv6TrackerFeatureMap) ToTransportIpv6TrackerFeatureMapOutput() TransportIpv6TrackerFeatureMapOutput {
	return i.ToTransportIpv6TrackerFeatureMapOutputWithContext(context.Background())
}

func (i TransportIpv6TrackerFeatureMap) ToTransportIpv6TrackerFeatureMapOutputWithContext(ctx context.Context) TransportIpv6TrackerFeatureMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransportIpv6TrackerFeatureMapOutput)
}

type TransportIpv6TrackerFeatureOutput struct{ *pulumi.OutputState }

func (TransportIpv6TrackerFeatureOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TransportIpv6TrackerFeature)(nil)).Elem()
}

func (o TransportIpv6TrackerFeatureOutput) ToTransportIpv6TrackerFeatureOutput() TransportIpv6TrackerFeatureOutput {
	return o
}

func (o TransportIpv6TrackerFeatureOutput) ToTransportIpv6TrackerFeatureOutputWithContext(ctx context.Context) TransportIpv6TrackerFeatureOutput {
	return o
}

// The description of the Feature
func (o TransportIpv6TrackerFeatureOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// API url of endpoint
func (o TransportIpv6TrackerFeatureOutput) EndpointApiUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.StringPtrOutput { return v.EndpointApiUrl }).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportIpv6TrackerFeatureOutput) EndpointApiUrlVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.StringPtrOutput { return v.EndpointApiUrlVariable }).(pulumi.StringPtrOutput)
}

// Endpoint DNS Name
func (o TransportIpv6TrackerFeatureOutput) EndpointDnsName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.StringPtrOutput { return v.EndpointDnsName }).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportIpv6TrackerFeatureOutput) EndpointDnsNameVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.StringPtrOutput { return v.EndpointDnsNameVariable }).(pulumi.StringPtrOutput)
}

// Endpoint IP
func (o TransportIpv6TrackerFeatureOutput) EndpointIp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.StringPtrOutput { return v.EndpointIp }).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportIpv6TrackerFeatureOutput) EndpointIpVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.StringPtrOutput { return v.EndpointIpVariable }).(pulumi.StringPtrOutput)
}

// Endpoint Tracker Type - Choices: `ipv6-interface` - Default value: `ipv6-interface`
func (o TransportIpv6TrackerFeatureOutput) EndpointTrackerType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.StringPtrOutput { return v.EndpointTrackerType }).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportIpv6TrackerFeatureOutput) EndpointTrackerTypeVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.StringPtrOutput { return v.EndpointTrackerTypeVariable }).(pulumi.StringPtrOutput)
}

// Feature Profile ID
func (o TransportIpv6TrackerFeatureOutput) FeatureProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.StringOutput { return v.FeatureProfileId }).(pulumi.StringOutput)
}

// Interval - Range: `20`-`600` - Default value: `60`
func (o TransportIpv6TrackerFeatureOutput) Interval() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.IntPtrOutput { return v.Interval }).(pulumi.IntPtrOutput)
}

// Variable name
func (o TransportIpv6TrackerFeatureOutput) IntervalVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.StringPtrOutput { return v.IntervalVariable }).(pulumi.StringPtrOutput)
}

// Multiplier - Range: `1`-`10` - Default value: `3`
func (o TransportIpv6TrackerFeatureOutput) Multiplier() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.IntPtrOutput { return v.Multiplier }).(pulumi.IntPtrOutput)
}

// Variable name
func (o TransportIpv6TrackerFeatureOutput) MultiplierVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.StringPtrOutput { return v.MultiplierVariable }).(pulumi.StringPtrOutput)
}

// The name of the Feature
func (o TransportIpv6TrackerFeatureOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Threshold - Range: `100`-`1000` - Default value: `300`
func (o TransportIpv6TrackerFeatureOutput) Threshold() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.IntPtrOutput { return v.Threshold }).(pulumi.IntPtrOutput)
}

// Variable name
func (o TransportIpv6TrackerFeatureOutput) ThresholdVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.StringPtrOutput { return v.ThresholdVariable }).(pulumi.StringPtrOutput)
}

// Tracker Name
func (o TransportIpv6TrackerFeatureOutput) TrackerName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.StringPtrOutput { return v.TrackerName }).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportIpv6TrackerFeatureOutput) TrackerNameVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.StringPtrOutput { return v.TrackerNameVariable }).(pulumi.StringPtrOutput)
}

// Tracker Type - Choices: `endpoint` - Default value: `endpoint`
func (o TransportIpv6TrackerFeatureOutput) TrackerType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.StringPtrOutput { return v.TrackerType }).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportIpv6TrackerFeatureOutput) TrackerTypeVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.StringPtrOutput { return v.TrackerTypeVariable }).(pulumi.StringPtrOutput)
}

// The version of the Feature
func (o TransportIpv6TrackerFeatureOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *TransportIpv6TrackerFeature) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type TransportIpv6TrackerFeatureArrayOutput struct{ *pulumi.OutputState }

func (TransportIpv6TrackerFeatureArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransportIpv6TrackerFeature)(nil)).Elem()
}

func (o TransportIpv6TrackerFeatureArrayOutput) ToTransportIpv6TrackerFeatureArrayOutput() TransportIpv6TrackerFeatureArrayOutput {
	return o
}

func (o TransportIpv6TrackerFeatureArrayOutput) ToTransportIpv6TrackerFeatureArrayOutputWithContext(ctx context.Context) TransportIpv6TrackerFeatureArrayOutput {
	return o
}

func (o TransportIpv6TrackerFeatureArrayOutput) Index(i pulumi.IntInput) TransportIpv6TrackerFeatureOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TransportIpv6TrackerFeature {
		return vs[0].([]*TransportIpv6TrackerFeature)[vs[1].(int)]
	}).(TransportIpv6TrackerFeatureOutput)
}

type TransportIpv6TrackerFeatureMapOutput struct{ *pulumi.OutputState }

func (TransportIpv6TrackerFeatureMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransportIpv6TrackerFeature)(nil)).Elem()
}

func (o TransportIpv6TrackerFeatureMapOutput) ToTransportIpv6TrackerFeatureMapOutput() TransportIpv6TrackerFeatureMapOutput {
	return o
}

func (o TransportIpv6TrackerFeatureMapOutput) ToTransportIpv6TrackerFeatureMapOutputWithContext(ctx context.Context) TransportIpv6TrackerFeatureMapOutput {
	return o
}

func (o TransportIpv6TrackerFeatureMapOutput) MapIndex(k pulumi.StringInput) TransportIpv6TrackerFeatureOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TransportIpv6TrackerFeature {
		return vs[0].(map[string]*TransportIpv6TrackerFeature)[vs[1].(string)]
	}).(TransportIpv6TrackerFeatureOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TransportIpv6TrackerFeatureInput)(nil)).Elem(), &TransportIpv6TrackerFeature{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransportIpv6TrackerFeatureArrayInput)(nil)).Elem(), TransportIpv6TrackerFeatureArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransportIpv6TrackerFeatureMapInput)(nil)).Elem(), TransportIpv6TrackerFeatureMap{})
	pulumi.RegisterOutputType(TransportIpv6TrackerFeatureOutput{})
	pulumi.RegisterOutputType(TransportIpv6TrackerFeatureArrayOutput{})
	pulumi.RegisterOutputType(TransportIpv6TrackerFeatureMapOutput{})
}
