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

// This resource can manage a Transport Tracker Feature.
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
//			_, err := sdwan.NewTransportTrackerFeature(ctx, "example", &sdwan.TransportTrackerFeatureArgs{
//				Name:                pulumi.String("Example"),
//				Description:         pulumi.String("My Example"),
//				FeatureProfileId:    pulumi.String("f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"),
//				TrackerName:         pulumi.String("TRACKER_1"),
//				EndpointApiUrl:      pulumi.String("google.com"),
//				EndpointDnsName:     pulumi.String("google.com"),
//				EndpointIp:          pulumi.String("1.2.3.4"),
//				Interval:            pulumi.Int(30),
//				Multiplier:          pulumi.Int(3),
//				Threshold:           pulumi.Int(300),
//				EndpointTrackerType: pulumi.String("interface"),
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
// Expected import identifier with the format: "transport_tracker_feature_id,feature_profile_id"
//
// ```sh
// $ pulumi import sdwan:index/transportTrackerFeature:TransportTrackerFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"
// ```
type TransportTrackerFeature struct {
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
	// Endpoint Tracker Type - Choices: `interface` - Default value: `interface`
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
	// Tracker Type - Choices: `endpoint`, `object` - Default value: `endpoint`
	TrackerType pulumi.StringPtrOutput `pulumi:"trackerType"`
	// Variable name
	TrackerTypeVariable pulumi.StringPtrOutput `pulumi:"trackerTypeVariable"`
	// The version of the Feature
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewTransportTrackerFeature registers a new resource with the given unique name, arguments, and options.
func NewTransportTrackerFeature(ctx *pulumi.Context,
	name string, args *TransportTrackerFeatureArgs, opts ...pulumi.ResourceOption) (*TransportTrackerFeature, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FeatureProfileId == nil {
		return nil, errors.New("invalid value for required argument 'FeatureProfileId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TransportTrackerFeature
	err := ctx.RegisterResource("sdwan:index/transportTrackerFeature:TransportTrackerFeature", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTransportTrackerFeature gets an existing TransportTrackerFeature resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTransportTrackerFeature(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TransportTrackerFeatureState, opts ...pulumi.ResourceOption) (*TransportTrackerFeature, error) {
	var resource TransportTrackerFeature
	err := ctx.ReadResource("sdwan:index/transportTrackerFeature:TransportTrackerFeature", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TransportTrackerFeature resources.
type transportTrackerFeatureState struct {
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
	// Endpoint Tracker Type - Choices: `interface` - Default value: `interface`
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
	// Tracker Type - Choices: `endpoint`, `object` - Default value: `endpoint`
	TrackerType *string `pulumi:"trackerType"`
	// Variable name
	TrackerTypeVariable *string `pulumi:"trackerTypeVariable"`
	// The version of the Feature
	Version *int `pulumi:"version"`
}

type TransportTrackerFeatureState struct {
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
	// Endpoint Tracker Type - Choices: `interface` - Default value: `interface`
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
	// Tracker Type - Choices: `endpoint`, `object` - Default value: `endpoint`
	TrackerType pulumi.StringPtrInput
	// Variable name
	TrackerTypeVariable pulumi.StringPtrInput
	// The version of the Feature
	Version pulumi.IntPtrInput
}

func (TransportTrackerFeatureState) ElementType() reflect.Type {
	return reflect.TypeOf((*transportTrackerFeatureState)(nil)).Elem()
}

type transportTrackerFeatureArgs struct {
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
	// Endpoint Tracker Type - Choices: `interface` - Default value: `interface`
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
	// Tracker Type - Choices: `endpoint`, `object` - Default value: `endpoint`
	TrackerType *string `pulumi:"trackerType"`
	// Variable name
	TrackerTypeVariable *string `pulumi:"trackerTypeVariable"`
}

// The set of arguments for constructing a TransportTrackerFeature resource.
type TransportTrackerFeatureArgs struct {
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
	// Endpoint Tracker Type - Choices: `interface` - Default value: `interface`
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
	// Tracker Type - Choices: `endpoint`, `object` - Default value: `endpoint`
	TrackerType pulumi.StringPtrInput
	// Variable name
	TrackerTypeVariable pulumi.StringPtrInput
}

func (TransportTrackerFeatureArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*transportTrackerFeatureArgs)(nil)).Elem()
}

type TransportTrackerFeatureInput interface {
	pulumi.Input

	ToTransportTrackerFeatureOutput() TransportTrackerFeatureOutput
	ToTransportTrackerFeatureOutputWithContext(ctx context.Context) TransportTrackerFeatureOutput
}

func (*TransportTrackerFeature) ElementType() reflect.Type {
	return reflect.TypeOf((**TransportTrackerFeature)(nil)).Elem()
}

func (i *TransportTrackerFeature) ToTransportTrackerFeatureOutput() TransportTrackerFeatureOutput {
	return i.ToTransportTrackerFeatureOutputWithContext(context.Background())
}

func (i *TransportTrackerFeature) ToTransportTrackerFeatureOutputWithContext(ctx context.Context) TransportTrackerFeatureOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransportTrackerFeatureOutput)
}

// TransportTrackerFeatureArrayInput is an input type that accepts TransportTrackerFeatureArray and TransportTrackerFeatureArrayOutput values.
// You can construct a concrete instance of `TransportTrackerFeatureArrayInput` via:
//
//	TransportTrackerFeatureArray{ TransportTrackerFeatureArgs{...} }
type TransportTrackerFeatureArrayInput interface {
	pulumi.Input

	ToTransportTrackerFeatureArrayOutput() TransportTrackerFeatureArrayOutput
	ToTransportTrackerFeatureArrayOutputWithContext(context.Context) TransportTrackerFeatureArrayOutput
}

type TransportTrackerFeatureArray []TransportTrackerFeatureInput

func (TransportTrackerFeatureArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransportTrackerFeature)(nil)).Elem()
}

func (i TransportTrackerFeatureArray) ToTransportTrackerFeatureArrayOutput() TransportTrackerFeatureArrayOutput {
	return i.ToTransportTrackerFeatureArrayOutputWithContext(context.Background())
}

func (i TransportTrackerFeatureArray) ToTransportTrackerFeatureArrayOutputWithContext(ctx context.Context) TransportTrackerFeatureArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransportTrackerFeatureArrayOutput)
}

// TransportTrackerFeatureMapInput is an input type that accepts TransportTrackerFeatureMap and TransportTrackerFeatureMapOutput values.
// You can construct a concrete instance of `TransportTrackerFeatureMapInput` via:
//
//	TransportTrackerFeatureMap{ "key": TransportTrackerFeatureArgs{...} }
type TransportTrackerFeatureMapInput interface {
	pulumi.Input

	ToTransportTrackerFeatureMapOutput() TransportTrackerFeatureMapOutput
	ToTransportTrackerFeatureMapOutputWithContext(context.Context) TransportTrackerFeatureMapOutput
}

type TransportTrackerFeatureMap map[string]TransportTrackerFeatureInput

func (TransportTrackerFeatureMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransportTrackerFeature)(nil)).Elem()
}

func (i TransportTrackerFeatureMap) ToTransportTrackerFeatureMapOutput() TransportTrackerFeatureMapOutput {
	return i.ToTransportTrackerFeatureMapOutputWithContext(context.Background())
}

func (i TransportTrackerFeatureMap) ToTransportTrackerFeatureMapOutputWithContext(ctx context.Context) TransportTrackerFeatureMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransportTrackerFeatureMapOutput)
}

type TransportTrackerFeatureOutput struct{ *pulumi.OutputState }

func (TransportTrackerFeatureOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TransportTrackerFeature)(nil)).Elem()
}

func (o TransportTrackerFeatureOutput) ToTransportTrackerFeatureOutput() TransportTrackerFeatureOutput {
	return o
}

func (o TransportTrackerFeatureOutput) ToTransportTrackerFeatureOutputWithContext(ctx context.Context) TransportTrackerFeatureOutput {
	return o
}

// The description of the Feature
func (o TransportTrackerFeatureOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// API url of endpoint
func (o TransportTrackerFeatureOutput) EndpointApiUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.StringPtrOutput { return v.EndpointApiUrl }).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportTrackerFeatureOutput) EndpointApiUrlVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.StringPtrOutput { return v.EndpointApiUrlVariable }).(pulumi.StringPtrOutput)
}

// Endpoint DNS Name
func (o TransportTrackerFeatureOutput) EndpointDnsName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.StringPtrOutput { return v.EndpointDnsName }).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportTrackerFeatureOutput) EndpointDnsNameVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.StringPtrOutput { return v.EndpointDnsNameVariable }).(pulumi.StringPtrOutput)
}

// Endpoint IP
func (o TransportTrackerFeatureOutput) EndpointIp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.StringPtrOutput { return v.EndpointIp }).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportTrackerFeatureOutput) EndpointIpVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.StringPtrOutput { return v.EndpointIpVariable }).(pulumi.StringPtrOutput)
}

// Endpoint Tracker Type - Choices: `interface` - Default value: `interface`
func (o TransportTrackerFeatureOutput) EndpointTrackerType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.StringPtrOutput { return v.EndpointTrackerType }).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportTrackerFeatureOutput) EndpointTrackerTypeVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.StringPtrOutput { return v.EndpointTrackerTypeVariable }).(pulumi.StringPtrOutput)
}

// Feature Profile ID
func (o TransportTrackerFeatureOutput) FeatureProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.StringOutput { return v.FeatureProfileId }).(pulumi.StringOutput)
}

// Interval - Range: `20`-`600` - Default value: `60`
func (o TransportTrackerFeatureOutput) Interval() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.IntPtrOutput { return v.Interval }).(pulumi.IntPtrOutput)
}

// Variable name
func (o TransportTrackerFeatureOutput) IntervalVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.StringPtrOutput { return v.IntervalVariable }).(pulumi.StringPtrOutput)
}

// Multiplier - Range: `1`-`10` - Default value: `3`
func (o TransportTrackerFeatureOutput) Multiplier() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.IntPtrOutput { return v.Multiplier }).(pulumi.IntPtrOutput)
}

// Variable name
func (o TransportTrackerFeatureOutput) MultiplierVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.StringPtrOutput { return v.MultiplierVariable }).(pulumi.StringPtrOutput)
}

// The name of the Feature
func (o TransportTrackerFeatureOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Threshold - Range: `100`-`1000` - Default value: `300`
func (o TransportTrackerFeatureOutput) Threshold() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.IntPtrOutput { return v.Threshold }).(pulumi.IntPtrOutput)
}

// Variable name
func (o TransportTrackerFeatureOutput) ThresholdVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.StringPtrOutput { return v.ThresholdVariable }).(pulumi.StringPtrOutput)
}

// Tracker Name
func (o TransportTrackerFeatureOutput) TrackerName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.StringPtrOutput { return v.TrackerName }).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportTrackerFeatureOutput) TrackerNameVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.StringPtrOutput { return v.TrackerNameVariable }).(pulumi.StringPtrOutput)
}

// Tracker Type - Choices: `endpoint`, `object` - Default value: `endpoint`
func (o TransportTrackerFeatureOutput) TrackerType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.StringPtrOutput { return v.TrackerType }).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportTrackerFeatureOutput) TrackerTypeVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.StringPtrOutput { return v.TrackerTypeVariable }).(pulumi.StringPtrOutput)
}

// The version of the Feature
func (o TransportTrackerFeatureOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *TransportTrackerFeature) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type TransportTrackerFeatureArrayOutput struct{ *pulumi.OutputState }

func (TransportTrackerFeatureArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransportTrackerFeature)(nil)).Elem()
}

func (o TransportTrackerFeatureArrayOutput) ToTransportTrackerFeatureArrayOutput() TransportTrackerFeatureArrayOutput {
	return o
}

func (o TransportTrackerFeatureArrayOutput) ToTransportTrackerFeatureArrayOutputWithContext(ctx context.Context) TransportTrackerFeatureArrayOutput {
	return o
}

func (o TransportTrackerFeatureArrayOutput) Index(i pulumi.IntInput) TransportTrackerFeatureOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TransportTrackerFeature {
		return vs[0].([]*TransportTrackerFeature)[vs[1].(int)]
	}).(TransportTrackerFeatureOutput)
}

type TransportTrackerFeatureMapOutput struct{ *pulumi.OutputState }

func (TransportTrackerFeatureMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransportTrackerFeature)(nil)).Elem()
}

func (o TransportTrackerFeatureMapOutput) ToTransportTrackerFeatureMapOutput() TransportTrackerFeatureMapOutput {
	return o
}

func (o TransportTrackerFeatureMapOutput) ToTransportTrackerFeatureMapOutputWithContext(ctx context.Context) TransportTrackerFeatureMapOutput {
	return o
}

func (o TransportTrackerFeatureMapOutput) MapIndex(k pulumi.StringInput) TransportTrackerFeatureOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TransportTrackerFeature {
		return vs[0].(map[string]*TransportTrackerFeature)[vs[1].(string)]
	}).(TransportTrackerFeatureOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TransportTrackerFeatureInput)(nil)).Elem(), &TransportTrackerFeature{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransportTrackerFeatureArrayInput)(nil)).Elem(), TransportTrackerFeatureArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransportTrackerFeatureMapInput)(nil)).Elem(), TransportTrackerFeatureMap{})
	pulumi.RegisterOutputType(TransportTrackerFeatureOutput{})
	pulumi.RegisterOutputType(TransportTrackerFeatureArrayOutput{})
	pulumi.RegisterOutputType(TransportTrackerFeatureMapOutput{})
}
