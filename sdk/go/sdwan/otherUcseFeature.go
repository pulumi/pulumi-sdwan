// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource can manage a Other UCSE Feature.
//   - Minimum SD-WAN Manager version: `20.12.0`
//
// ## Import
//
// ```sh
// $ pulumi import sdwan:index/otherUcseFeature:OtherUcseFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd"
// ```
type OtherUcseFeature struct {
	pulumi.CustomResourceState

	// Dedicated - Default value: `true`
	AccessPortDedicated pulumi.BoolPtrOutput `pulumi:"accessPortDedicated"`
	// - Choices: `ge2`, `te2`
	AccessPortSharedFailoverType pulumi.StringOutput `pulumi:"accessPortSharedFailoverType"`
	// - Choices: `ge1`, `ge2`, `ge3`, `te2`, `te3`, `console`, `failover`
	AccessPortSharedType pulumi.StringOutput `pulumi:"accessPortSharedType"`
	// Assign priority - Range: `0`-`7`
	AssignPriority pulumi.IntPtrOutput `pulumi:"assignPriority"`
	// Variable name
	AssignPriorityVariable pulumi.StringPtrOutput `pulumi:"assignPriorityVariable"`
	// Bay - Range: `0`-`2`
	Bay pulumi.IntOutput `pulumi:"bay"`
	// Assign default gateway
	DefaultGateway pulumi.StringOutput `pulumi:"defaultGateway"`
	// Variable name
	DefaultGatewayVariable pulumi.StringPtrOutput `pulumi:"defaultGatewayVariable"`
	// The description of the Feature
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Feature Profile ID
	FeatureProfileId pulumi.StringOutput `pulumi:"featureProfileId"`
	// Interface name: GigabitEthernet0/<>/<> when present
	Interfaces OtherUcseFeatureInterfaceArrayOutput `pulumi:"interfaces"`
	// Assign IPv4 address
	Ipv4Address pulumi.StringOutput `pulumi:"ipv4Address"`
	// Variable name
	Ipv4AddressVariable pulumi.StringPtrOutput `pulumi:"ipv4AddressVariable"`
	// The name of the Feature
	Name pulumi.StringOutput `pulumi:"name"`
	// Slot - Range: `0`-`3`
	Slot pulumi.IntOutput `pulumi:"slot"`
	// The version of the Feature
	Version pulumi.IntOutput `pulumi:"version"`
	// Assign Vlan Id - Range: `2`-`4095`
	VlanId pulumi.IntPtrOutput `pulumi:"vlanId"`
	// Variable name
	VlanIdVariable pulumi.StringPtrOutput `pulumi:"vlanIdVariable"`
}

// NewOtherUcseFeature registers a new resource with the given unique name, arguments, and options.
func NewOtherUcseFeature(ctx *pulumi.Context,
	name string, args *OtherUcseFeatureArgs, opts ...pulumi.ResourceOption) (*OtherUcseFeature, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccessPortSharedFailoverType == nil {
		return nil, errors.New("invalid value for required argument 'AccessPortSharedFailoverType'")
	}
	if args.AccessPortSharedType == nil {
		return nil, errors.New("invalid value for required argument 'AccessPortSharedType'")
	}
	if args.Bay == nil {
		return nil, errors.New("invalid value for required argument 'Bay'")
	}
	if args.DefaultGateway == nil {
		return nil, errors.New("invalid value for required argument 'DefaultGateway'")
	}
	if args.FeatureProfileId == nil {
		return nil, errors.New("invalid value for required argument 'FeatureProfileId'")
	}
	if args.Ipv4Address == nil {
		return nil, errors.New("invalid value for required argument 'Ipv4Address'")
	}
	if args.Slot == nil {
		return nil, errors.New("invalid value for required argument 'Slot'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OtherUcseFeature
	err := ctx.RegisterResource("sdwan:index/otherUcseFeature:OtherUcseFeature", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOtherUcseFeature gets an existing OtherUcseFeature resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOtherUcseFeature(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OtherUcseFeatureState, opts ...pulumi.ResourceOption) (*OtherUcseFeature, error) {
	var resource OtherUcseFeature
	err := ctx.ReadResource("sdwan:index/otherUcseFeature:OtherUcseFeature", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OtherUcseFeature resources.
type otherUcseFeatureState struct {
	// Dedicated - Default value: `true`
	AccessPortDedicated *bool `pulumi:"accessPortDedicated"`
	// - Choices: `ge2`, `te2`
	AccessPortSharedFailoverType *string `pulumi:"accessPortSharedFailoverType"`
	// - Choices: `ge1`, `ge2`, `ge3`, `te2`, `te3`, `console`, `failover`
	AccessPortSharedType *string `pulumi:"accessPortSharedType"`
	// Assign priority - Range: `0`-`7`
	AssignPriority *int `pulumi:"assignPriority"`
	// Variable name
	AssignPriorityVariable *string `pulumi:"assignPriorityVariable"`
	// Bay - Range: `0`-`2`
	Bay *int `pulumi:"bay"`
	// Assign default gateway
	DefaultGateway *string `pulumi:"defaultGateway"`
	// Variable name
	DefaultGatewayVariable *string `pulumi:"defaultGatewayVariable"`
	// The description of the Feature
	Description *string `pulumi:"description"`
	// Feature Profile ID
	FeatureProfileId *string `pulumi:"featureProfileId"`
	// Interface name: GigabitEthernet0/<>/<> when present
	Interfaces []OtherUcseFeatureInterface `pulumi:"interfaces"`
	// Assign IPv4 address
	Ipv4Address *string `pulumi:"ipv4Address"`
	// Variable name
	Ipv4AddressVariable *string `pulumi:"ipv4AddressVariable"`
	// The name of the Feature
	Name *string `pulumi:"name"`
	// Slot - Range: `0`-`3`
	Slot *int `pulumi:"slot"`
	// The version of the Feature
	Version *int `pulumi:"version"`
	// Assign Vlan Id - Range: `2`-`4095`
	VlanId *int `pulumi:"vlanId"`
	// Variable name
	VlanIdVariable *string `pulumi:"vlanIdVariable"`
}

type OtherUcseFeatureState struct {
	// Dedicated - Default value: `true`
	AccessPortDedicated pulumi.BoolPtrInput
	// - Choices: `ge2`, `te2`
	AccessPortSharedFailoverType pulumi.StringPtrInput
	// - Choices: `ge1`, `ge2`, `ge3`, `te2`, `te3`, `console`, `failover`
	AccessPortSharedType pulumi.StringPtrInput
	// Assign priority - Range: `0`-`7`
	AssignPriority pulumi.IntPtrInput
	// Variable name
	AssignPriorityVariable pulumi.StringPtrInput
	// Bay - Range: `0`-`2`
	Bay pulumi.IntPtrInput
	// Assign default gateway
	DefaultGateway pulumi.StringPtrInput
	// Variable name
	DefaultGatewayVariable pulumi.StringPtrInput
	// The description of the Feature
	Description pulumi.StringPtrInput
	// Feature Profile ID
	FeatureProfileId pulumi.StringPtrInput
	// Interface name: GigabitEthernet0/<>/<> when present
	Interfaces OtherUcseFeatureInterfaceArrayInput
	// Assign IPv4 address
	Ipv4Address pulumi.StringPtrInput
	// Variable name
	Ipv4AddressVariable pulumi.StringPtrInput
	// The name of the Feature
	Name pulumi.StringPtrInput
	// Slot - Range: `0`-`3`
	Slot pulumi.IntPtrInput
	// The version of the Feature
	Version pulumi.IntPtrInput
	// Assign Vlan Id - Range: `2`-`4095`
	VlanId pulumi.IntPtrInput
	// Variable name
	VlanIdVariable pulumi.StringPtrInput
}

func (OtherUcseFeatureState) ElementType() reflect.Type {
	return reflect.TypeOf((*otherUcseFeatureState)(nil)).Elem()
}

type otherUcseFeatureArgs struct {
	// Dedicated - Default value: `true`
	AccessPortDedicated *bool `pulumi:"accessPortDedicated"`
	// - Choices: `ge2`, `te2`
	AccessPortSharedFailoverType string `pulumi:"accessPortSharedFailoverType"`
	// - Choices: `ge1`, `ge2`, `ge3`, `te2`, `te3`, `console`, `failover`
	AccessPortSharedType string `pulumi:"accessPortSharedType"`
	// Assign priority - Range: `0`-`7`
	AssignPriority *int `pulumi:"assignPriority"`
	// Variable name
	AssignPriorityVariable *string `pulumi:"assignPriorityVariable"`
	// Bay - Range: `0`-`2`
	Bay int `pulumi:"bay"`
	// Assign default gateway
	DefaultGateway string `pulumi:"defaultGateway"`
	// Variable name
	DefaultGatewayVariable *string `pulumi:"defaultGatewayVariable"`
	// The description of the Feature
	Description *string `pulumi:"description"`
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// Interface name: GigabitEthernet0/<>/<> when present
	Interfaces []OtherUcseFeatureInterface `pulumi:"interfaces"`
	// Assign IPv4 address
	Ipv4Address string `pulumi:"ipv4Address"`
	// Variable name
	Ipv4AddressVariable *string `pulumi:"ipv4AddressVariable"`
	// The name of the Feature
	Name *string `pulumi:"name"`
	// Slot - Range: `0`-`3`
	Slot int `pulumi:"slot"`
	// Assign Vlan Id - Range: `2`-`4095`
	VlanId *int `pulumi:"vlanId"`
	// Variable name
	VlanIdVariable *string `pulumi:"vlanIdVariable"`
}

// The set of arguments for constructing a OtherUcseFeature resource.
type OtherUcseFeatureArgs struct {
	// Dedicated - Default value: `true`
	AccessPortDedicated pulumi.BoolPtrInput
	// - Choices: `ge2`, `te2`
	AccessPortSharedFailoverType pulumi.StringInput
	// - Choices: `ge1`, `ge2`, `ge3`, `te2`, `te3`, `console`, `failover`
	AccessPortSharedType pulumi.StringInput
	// Assign priority - Range: `0`-`7`
	AssignPriority pulumi.IntPtrInput
	// Variable name
	AssignPriorityVariable pulumi.StringPtrInput
	// Bay - Range: `0`-`2`
	Bay pulumi.IntInput
	// Assign default gateway
	DefaultGateway pulumi.StringInput
	// Variable name
	DefaultGatewayVariable pulumi.StringPtrInput
	// The description of the Feature
	Description pulumi.StringPtrInput
	// Feature Profile ID
	FeatureProfileId pulumi.StringInput
	// Interface name: GigabitEthernet0/<>/<> when present
	Interfaces OtherUcseFeatureInterfaceArrayInput
	// Assign IPv4 address
	Ipv4Address pulumi.StringInput
	// Variable name
	Ipv4AddressVariable pulumi.StringPtrInput
	// The name of the Feature
	Name pulumi.StringPtrInput
	// Slot - Range: `0`-`3`
	Slot pulumi.IntInput
	// Assign Vlan Id - Range: `2`-`4095`
	VlanId pulumi.IntPtrInput
	// Variable name
	VlanIdVariable pulumi.StringPtrInput
}

func (OtherUcseFeatureArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*otherUcseFeatureArgs)(nil)).Elem()
}

type OtherUcseFeatureInput interface {
	pulumi.Input

	ToOtherUcseFeatureOutput() OtherUcseFeatureOutput
	ToOtherUcseFeatureOutputWithContext(ctx context.Context) OtherUcseFeatureOutput
}

func (*OtherUcseFeature) ElementType() reflect.Type {
	return reflect.TypeOf((**OtherUcseFeature)(nil)).Elem()
}

func (i *OtherUcseFeature) ToOtherUcseFeatureOutput() OtherUcseFeatureOutput {
	return i.ToOtherUcseFeatureOutputWithContext(context.Background())
}

func (i *OtherUcseFeature) ToOtherUcseFeatureOutputWithContext(ctx context.Context) OtherUcseFeatureOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OtherUcseFeatureOutput)
}

// OtherUcseFeatureArrayInput is an input type that accepts OtherUcseFeatureArray and OtherUcseFeatureArrayOutput values.
// You can construct a concrete instance of `OtherUcseFeatureArrayInput` via:
//
//	OtherUcseFeatureArray{ OtherUcseFeatureArgs{...} }
type OtherUcseFeatureArrayInput interface {
	pulumi.Input

	ToOtherUcseFeatureArrayOutput() OtherUcseFeatureArrayOutput
	ToOtherUcseFeatureArrayOutputWithContext(context.Context) OtherUcseFeatureArrayOutput
}

type OtherUcseFeatureArray []OtherUcseFeatureInput

func (OtherUcseFeatureArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OtherUcseFeature)(nil)).Elem()
}

func (i OtherUcseFeatureArray) ToOtherUcseFeatureArrayOutput() OtherUcseFeatureArrayOutput {
	return i.ToOtherUcseFeatureArrayOutputWithContext(context.Background())
}

func (i OtherUcseFeatureArray) ToOtherUcseFeatureArrayOutputWithContext(ctx context.Context) OtherUcseFeatureArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OtherUcseFeatureArrayOutput)
}

// OtherUcseFeatureMapInput is an input type that accepts OtherUcseFeatureMap and OtherUcseFeatureMapOutput values.
// You can construct a concrete instance of `OtherUcseFeatureMapInput` via:
//
//	OtherUcseFeatureMap{ "key": OtherUcseFeatureArgs{...} }
type OtherUcseFeatureMapInput interface {
	pulumi.Input

	ToOtherUcseFeatureMapOutput() OtherUcseFeatureMapOutput
	ToOtherUcseFeatureMapOutputWithContext(context.Context) OtherUcseFeatureMapOutput
}

type OtherUcseFeatureMap map[string]OtherUcseFeatureInput

func (OtherUcseFeatureMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OtherUcseFeature)(nil)).Elem()
}

func (i OtherUcseFeatureMap) ToOtherUcseFeatureMapOutput() OtherUcseFeatureMapOutput {
	return i.ToOtherUcseFeatureMapOutputWithContext(context.Background())
}

func (i OtherUcseFeatureMap) ToOtherUcseFeatureMapOutputWithContext(ctx context.Context) OtherUcseFeatureMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OtherUcseFeatureMapOutput)
}

type OtherUcseFeatureOutput struct{ *pulumi.OutputState }

func (OtherUcseFeatureOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OtherUcseFeature)(nil)).Elem()
}

func (o OtherUcseFeatureOutput) ToOtherUcseFeatureOutput() OtherUcseFeatureOutput {
	return o
}

func (o OtherUcseFeatureOutput) ToOtherUcseFeatureOutputWithContext(ctx context.Context) OtherUcseFeatureOutput {
	return o
}

// Dedicated - Default value: `true`
func (o OtherUcseFeatureOutput) AccessPortDedicated() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *OtherUcseFeature) pulumi.BoolPtrOutput { return v.AccessPortDedicated }).(pulumi.BoolPtrOutput)
}

// - Choices: `ge2`, `te2`
func (o OtherUcseFeatureOutput) AccessPortSharedFailoverType() pulumi.StringOutput {
	return o.ApplyT(func(v *OtherUcseFeature) pulumi.StringOutput { return v.AccessPortSharedFailoverType }).(pulumi.StringOutput)
}

// - Choices: `ge1`, `ge2`, `ge3`, `te2`, `te3`, `console`, `failover`
func (o OtherUcseFeatureOutput) AccessPortSharedType() pulumi.StringOutput {
	return o.ApplyT(func(v *OtherUcseFeature) pulumi.StringOutput { return v.AccessPortSharedType }).(pulumi.StringOutput)
}

// Assign priority - Range: `0`-`7`
func (o OtherUcseFeatureOutput) AssignPriority() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *OtherUcseFeature) pulumi.IntPtrOutput { return v.AssignPriority }).(pulumi.IntPtrOutput)
}

// Variable name
func (o OtherUcseFeatureOutput) AssignPriorityVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OtherUcseFeature) pulumi.StringPtrOutput { return v.AssignPriorityVariable }).(pulumi.StringPtrOutput)
}

// Bay - Range: `0`-`2`
func (o OtherUcseFeatureOutput) Bay() pulumi.IntOutput {
	return o.ApplyT(func(v *OtherUcseFeature) pulumi.IntOutput { return v.Bay }).(pulumi.IntOutput)
}

// Assign default gateway
func (o OtherUcseFeatureOutput) DefaultGateway() pulumi.StringOutput {
	return o.ApplyT(func(v *OtherUcseFeature) pulumi.StringOutput { return v.DefaultGateway }).(pulumi.StringOutput)
}

// Variable name
func (o OtherUcseFeatureOutput) DefaultGatewayVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OtherUcseFeature) pulumi.StringPtrOutput { return v.DefaultGatewayVariable }).(pulumi.StringPtrOutput)
}

// The description of the Feature
func (o OtherUcseFeatureOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OtherUcseFeature) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Feature Profile ID
func (o OtherUcseFeatureOutput) FeatureProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *OtherUcseFeature) pulumi.StringOutput { return v.FeatureProfileId }).(pulumi.StringOutput)
}

// Interface name: GigabitEthernet0/<>/<> when present
func (o OtherUcseFeatureOutput) Interfaces() OtherUcseFeatureInterfaceArrayOutput {
	return o.ApplyT(func(v *OtherUcseFeature) OtherUcseFeatureInterfaceArrayOutput { return v.Interfaces }).(OtherUcseFeatureInterfaceArrayOutput)
}

// Assign IPv4 address
func (o OtherUcseFeatureOutput) Ipv4Address() pulumi.StringOutput {
	return o.ApplyT(func(v *OtherUcseFeature) pulumi.StringOutput { return v.Ipv4Address }).(pulumi.StringOutput)
}

// Variable name
func (o OtherUcseFeatureOutput) Ipv4AddressVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OtherUcseFeature) pulumi.StringPtrOutput { return v.Ipv4AddressVariable }).(pulumi.StringPtrOutput)
}

// The name of the Feature
func (o OtherUcseFeatureOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OtherUcseFeature) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Slot - Range: `0`-`3`
func (o OtherUcseFeatureOutput) Slot() pulumi.IntOutput {
	return o.ApplyT(func(v *OtherUcseFeature) pulumi.IntOutput { return v.Slot }).(pulumi.IntOutput)
}

// The version of the Feature
func (o OtherUcseFeatureOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *OtherUcseFeature) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

// Assign Vlan Id - Range: `2`-`4095`
func (o OtherUcseFeatureOutput) VlanId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *OtherUcseFeature) pulumi.IntPtrOutput { return v.VlanId }).(pulumi.IntPtrOutput)
}

// Variable name
func (o OtherUcseFeatureOutput) VlanIdVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OtherUcseFeature) pulumi.StringPtrOutput { return v.VlanIdVariable }).(pulumi.StringPtrOutput)
}

type OtherUcseFeatureArrayOutput struct{ *pulumi.OutputState }

func (OtherUcseFeatureArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OtherUcseFeature)(nil)).Elem()
}

func (o OtherUcseFeatureArrayOutput) ToOtherUcseFeatureArrayOutput() OtherUcseFeatureArrayOutput {
	return o
}

func (o OtherUcseFeatureArrayOutput) ToOtherUcseFeatureArrayOutputWithContext(ctx context.Context) OtherUcseFeatureArrayOutput {
	return o
}

func (o OtherUcseFeatureArrayOutput) Index(i pulumi.IntInput) OtherUcseFeatureOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OtherUcseFeature {
		return vs[0].([]*OtherUcseFeature)[vs[1].(int)]
	}).(OtherUcseFeatureOutput)
}

type OtherUcseFeatureMapOutput struct{ *pulumi.OutputState }

func (OtherUcseFeatureMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OtherUcseFeature)(nil)).Elem()
}

func (o OtherUcseFeatureMapOutput) ToOtherUcseFeatureMapOutput() OtherUcseFeatureMapOutput {
	return o
}

func (o OtherUcseFeatureMapOutput) ToOtherUcseFeatureMapOutputWithContext(ctx context.Context) OtherUcseFeatureMapOutput {
	return o
}

func (o OtherUcseFeatureMapOutput) MapIndex(k pulumi.StringInput) OtherUcseFeatureOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OtherUcseFeature {
		return vs[0].(map[string]*OtherUcseFeature)[vs[1].(string)]
	}).(OtherUcseFeatureOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OtherUcseFeatureInput)(nil)).Elem(), &OtherUcseFeature{})
	pulumi.RegisterInputType(reflect.TypeOf((*OtherUcseFeatureArrayInput)(nil)).Elem(), OtherUcseFeatureArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OtherUcseFeatureMapInput)(nil)).Elem(), OtherUcseFeatureMap{})
	pulumi.RegisterOutputType(OtherUcseFeatureOutput{})
	pulumi.RegisterOutputType(OtherUcseFeatureArrayOutput{})
	pulumi.RegisterOutputType(OtherUcseFeatureMapOutput{})
}