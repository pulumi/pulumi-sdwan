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

// This resource can manage a System IPv4 Device Access Feature.
//   - Minimum SD-WAN Manager version: `20.12.0`
//
// ## Import
//
// ```sh
// $ pulumi import sdwan:index/systemIpv4DeviceAccessFeature:SystemIpv4DeviceAccessFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd"
// ```
type SystemIpv4DeviceAccessFeature struct {
	pulumi.CustomResourceState

	// Default Action - Choices: `drop`, `accept` - Default value: `drop`
	DefaultAction pulumi.StringPtrOutput `pulumi:"defaultAction"`
	// The description of the Feature
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Feature Profile ID
	FeatureProfileId pulumi.StringOutput `pulumi:"featureProfileId"`
	// The name of the Feature
	Name pulumi.StringOutput `pulumi:"name"`
	// Device Access Control List
	Sequences SystemIpv4DeviceAccessFeatureSequenceArrayOutput `pulumi:"sequences"`
	// The version of the Feature
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewSystemIpv4DeviceAccessFeature registers a new resource with the given unique name, arguments, and options.
func NewSystemIpv4DeviceAccessFeature(ctx *pulumi.Context,
	name string, args *SystemIpv4DeviceAccessFeatureArgs, opts ...pulumi.ResourceOption) (*SystemIpv4DeviceAccessFeature, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FeatureProfileId == nil {
		return nil, errors.New("invalid value for required argument 'FeatureProfileId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SystemIpv4DeviceAccessFeature
	err := ctx.RegisterResource("sdwan:index/systemIpv4DeviceAccessFeature:SystemIpv4DeviceAccessFeature", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSystemIpv4DeviceAccessFeature gets an existing SystemIpv4DeviceAccessFeature resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSystemIpv4DeviceAccessFeature(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SystemIpv4DeviceAccessFeatureState, opts ...pulumi.ResourceOption) (*SystemIpv4DeviceAccessFeature, error) {
	var resource SystemIpv4DeviceAccessFeature
	err := ctx.ReadResource("sdwan:index/systemIpv4DeviceAccessFeature:SystemIpv4DeviceAccessFeature", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SystemIpv4DeviceAccessFeature resources.
type systemIpv4DeviceAccessFeatureState struct {
	// Default Action - Choices: `drop`, `accept` - Default value: `drop`
	DefaultAction *string `pulumi:"defaultAction"`
	// The description of the Feature
	Description *string `pulumi:"description"`
	// Feature Profile ID
	FeatureProfileId *string `pulumi:"featureProfileId"`
	// The name of the Feature
	Name *string `pulumi:"name"`
	// Device Access Control List
	Sequences []SystemIpv4DeviceAccessFeatureSequence `pulumi:"sequences"`
	// The version of the Feature
	Version *int `pulumi:"version"`
}

type SystemIpv4DeviceAccessFeatureState struct {
	// Default Action - Choices: `drop`, `accept` - Default value: `drop`
	DefaultAction pulumi.StringPtrInput
	// The description of the Feature
	Description pulumi.StringPtrInput
	// Feature Profile ID
	FeatureProfileId pulumi.StringPtrInput
	// The name of the Feature
	Name pulumi.StringPtrInput
	// Device Access Control List
	Sequences SystemIpv4DeviceAccessFeatureSequenceArrayInput
	// The version of the Feature
	Version pulumi.IntPtrInput
}

func (SystemIpv4DeviceAccessFeatureState) ElementType() reflect.Type {
	return reflect.TypeOf((*systemIpv4DeviceAccessFeatureState)(nil)).Elem()
}

type systemIpv4DeviceAccessFeatureArgs struct {
	// Default Action - Choices: `drop`, `accept` - Default value: `drop`
	DefaultAction *string `pulumi:"defaultAction"`
	// The description of the Feature
	Description *string `pulumi:"description"`
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The name of the Feature
	Name *string `pulumi:"name"`
	// Device Access Control List
	Sequences []SystemIpv4DeviceAccessFeatureSequence `pulumi:"sequences"`
}

// The set of arguments for constructing a SystemIpv4DeviceAccessFeature resource.
type SystemIpv4DeviceAccessFeatureArgs struct {
	// Default Action - Choices: `drop`, `accept` - Default value: `drop`
	DefaultAction pulumi.StringPtrInput
	// The description of the Feature
	Description pulumi.StringPtrInput
	// Feature Profile ID
	FeatureProfileId pulumi.StringInput
	// The name of the Feature
	Name pulumi.StringPtrInput
	// Device Access Control List
	Sequences SystemIpv4DeviceAccessFeatureSequenceArrayInput
}

func (SystemIpv4DeviceAccessFeatureArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*systemIpv4DeviceAccessFeatureArgs)(nil)).Elem()
}

type SystemIpv4DeviceAccessFeatureInput interface {
	pulumi.Input

	ToSystemIpv4DeviceAccessFeatureOutput() SystemIpv4DeviceAccessFeatureOutput
	ToSystemIpv4DeviceAccessFeatureOutputWithContext(ctx context.Context) SystemIpv4DeviceAccessFeatureOutput
}

func (*SystemIpv4DeviceAccessFeature) ElementType() reflect.Type {
	return reflect.TypeOf((**SystemIpv4DeviceAccessFeature)(nil)).Elem()
}

func (i *SystemIpv4DeviceAccessFeature) ToSystemIpv4DeviceAccessFeatureOutput() SystemIpv4DeviceAccessFeatureOutput {
	return i.ToSystemIpv4DeviceAccessFeatureOutputWithContext(context.Background())
}

func (i *SystemIpv4DeviceAccessFeature) ToSystemIpv4DeviceAccessFeatureOutputWithContext(ctx context.Context) SystemIpv4DeviceAccessFeatureOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SystemIpv4DeviceAccessFeatureOutput)
}

// SystemIpv4DeviceAccessFeatureArrayInput is an input type that accepts SystemIpv4DeviceAccessFeatureArray and SystemIpv4DeviceAccessFeatureArrayOutput values.
// You can construct a concrete instance of `SystemIpv4DeviceAccessFeatureArrayInput` via:
//
//	SystemIpv4DeviceAccessFeatureArray{ SystemIpv4DeviceAccessFeatureArgs{...} }
type SystemIpv4DeviceAccessFeatureArrayInput interface {
	pulumi.Input

	ToSystemIpv4DeviceAccessFeatureArrayOutput() SystemIpv4DeviceAccessFeatureArrayOutput
	ToSystemIpv4DeviceAccessFeatureArrayOutputWithContext(context.Context) SystemIpv4DeviceAccessFeatureArrayOutput
}

type SystemIpv4DeviceAccessFeatureArray []SystemIpv4DeviceAccessFeatureInput

func (SystemIpv4DeviceAccessFeatureArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SystemIpv4DeviceAccessFeature)(nil)).Elem()
}

func (i SystemIpv4DeviceAccessFeatureArray) ToSystemIpv4DeviceAccessFeatureArrayOutput() SystemIpv4DeviceAccessFeatureArrayOutput {
	return i.ToSystemIpv4DeviceAccessFeatureArrayOutputWithContext(context.Background())
}

func (i SystemIpv4DeviceAccessFeatureArray) ToSystemIpv4DeviceAccessFeatureArrayOutputWithContext(ctx context.Context) SystemIpv4DeviceAccessFeatureArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SystemIpv4DeviceAccessFeatureArrayOutput)
}

// SystemIpv4DeviceAccessFeatureMapInput is an input type that accepts SystemIpv4DeviceAccessFeatureMap and SystemIpv4DeviceAccessFeatureMapOutput values.
// You can construct a concrete instance of `SystemIpv4DeviceAccessFeatureMapInput` via:
//
//	SystemIpv4DeviceAccessFeatureMap{ "key": SystemIpv4DeviceAccessFeatureArgs{...} }
type SystemIpv4DeviceAccessFeatureMapInput interface {
	pulumi.Input

	ToSystemIpv4DeviceAccessFeatureMapOutput() SystemIpv4DeviceAccessFeatureMapOutput
	ToSystemIpv4DeviceAccessFeatureMapOutputWithContext(context.Context) SystemIpv4DeviceAccessFeatureMapOutput
}

type SystemIpv4DeviceAccessFeatureMap map[string]SystemIpv4DeviceAccessFeatureInput

func (SystemIpv4DeviceAccessFeatureMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SystemIpv4DeviceAccessFeature)(nil)).Elem()
}

func (i SystemIpv4DeviceAccessFeatureMap) ToSystemIpv4DeviceAccessFeatureMapOutput() SystemIpv4DeviceAccessFeatureMapOutput {
	return i.ToSystemIpv4DeviceAccessFeatureMapOutputWithContext(context.Background())
}

func (i SystemIpv4DeviceAccessFeatureMap) ToSystemIpv4DeviceAccessFeatureMapOutputWithContext(ctx context.Context) SystemIpv4DeviceAccessFeatureMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SystemIpv4DeviceAccessFeatureMapOutput)
}

type SystemIpv4DeviceAccessFeatureOutput struct{ *pulumi.OutputState }

func (SystemIpv4DeviceAccessFeatureOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SystemIpv4DeviceAccessFeature)(nil)).Elem()
}

func (o SystemIpv4DeviceAccessFeatureOutput) ToSystemIpv4DeviceAccessFeatureOutput() SystemIpv4DeviceAccessFeatureOutput {
	return o
}

func (o SystemIpv4DeviceAccessFeatureOutput) ToSystemIpv4DeviceAccessFeatureOutputWithContext(ctx context.Context) SystemIpv4DeviceAccessFeatureOutput {
	return o
}

// Default Action - Choices: `drop`, `accept` - Default value: `drop`
func (o SystemIpv4DeviceAccessFeatureOutput) DefaultAction() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SystemIpv4DeviceAccessFeature) pulumi.StringPtrOutput { return v.DefaultAction }).(pulumi.StringPtrOutput)
}

// The description of the Feature
func (o SystemIpv4DeviceAccessFeatureOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SystemIpv4DeviceAccessFeature) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Feature Profile ID
func (o SystemIpv4DeviceAccessFeatureOutput) FeatureProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *SystemIpv4DeviceAccessFeature) pulumi.StringOutput { return v.FeatureProfileId }).(pulumi.StringOutput)
}

// The name of the Feature
func (o SystemIpv4DeviceAccessFeatureOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SystemIpv4DeviceAccessFeature) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Device Access Control List
func (o SystemIpv4DeviceAccessFeatureOutput) Sequences() SystemIpv4DeviceAccessFeatureSequenceArrayOutput {
	return o.ApplyT(func(v *SystemIpv4DeviceAccessFeature) SystemIpv4DeviceAccessFeatureSequenceArrayOutput {
		return v.Sequences
	}).(SystemIpv4DeviceAccessFeatureSequenceArrayOutput)
}

// The version of the Feature
func (o SystemIpv4DeviceAccessFeatureOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *SystemIpv4DeviceAccessFeature) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type SystemIpv4DeviceAccessFeatureArrayOutput struct{ *pulumi.OutputState }

func (SystemIpv4DeviceAccessFeatureArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SystemIpv4DeviceAccessFeature)(nil)).Elem()
}

func (o SystemIpv4DeviceAccessFeatureArrayOutput) ToSystemIpv4DeviceAccessFeatureArrayOutput() SystemIpv4DeviceAccessFeatureArrayOutput {
	return o
}

func (o SystemIpv4DeviceAccessFeatureArrayOutput) ToSystemIpv4DeviceAccessFeatureArrayOutputWithContext(ctx context.Context) SystemIpv4DeviceAccessFeatureArrayOutput {
	return o
}

func (o SystemIpv4DeviceAccessFeatureArrayOutput) Index(i pulumi.IntInput) SystemIpv4DeviceAccessFeatureOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SystemIpv4DeviceAccessFeature {
		return vs[0].([]*SystemIpv4DeviceAccessFeature)[vs[1].(int)]
	}).(SystemIpv4DeviceAccessFeatureOutput)
}

type SystemIpv4DeviceAccessFeatureMapOutput struct{ *pulumi.OutputState }

func (SystemIpv4DeviceAccessFeatureMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SystemIpv4DeviceAccessFeature)(nil)).Elem()
}

func (o SystemIpv4DeviceAccessFeatureMapOutput) ToSystemIpv4DeviceAccessFeatureMapOutput() SystemIpv4DeviceAccessFeatureMapOutput {
	return o
}

func (o SystemIpv4DeviceAccessFeatureMapOutput) ToSystemIpv4DeviceAccessFeatureMapOutputWithContext(ctx context.Context) SystemIpv4DeviceAccessFeatureMapOutput {
	return o
}

func (o SystemIpv4DeviceAccessFeatureMapOutput) MapIndex(k pulumi.StringInput) SystemIpv4DeviceAccessFeatureOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SystemIpv4DeviceAccessFeature {
		return vs[0].(map[string]*SystemIpv4DeviceAccessFeature)[vs[1].(string)]
	}).(SystemIpv4DeviceAccessFeatureOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SystemIpv4DeviceAccessFeatureInput)(nil)).Elem(), &SystemIpv4DeviceAccessFeature{})
	pulumi.RegisterInputType(reflect.TypeOf((*SystemIpv4DeviceAccessFeatureArrayInput)(nil)).Elem(), SystemIpv4DeviceAccessFeatureArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SystemIpv4DeviceAccessFeatureMapInput)(nil)).Elem(), SystemIpv4DeviceAccessFeatureMap{})
	pulumi.RegisterOutputType(SystemIpv4DeviceAccessFeatureOutput{})
	pulumi.RegisterOutputType(SystemIpv4DeviceAccessFeatureArrayOutput{})
	pulumi.RegisterOutputType(SystemIpv4DeviceAccessFeatureMapOutput{})
}