// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource can activate a centralized policy.
//
// ## Import
//
// The `pulumi import` command can be used, for example:
//
// ```sh
// $ pulumi import sdwan:index/activateCentralizedPolicy:ActivateCentralizedPolicy example "f6b2c44c-693c-4763-b010-895aa3d236bd"
// ```
type ActivateCentralizedPolicy struct {
	pulumi.CustomResourceState

	// The version of the centralized policy
	Version pulumi.IntPtrOutput `pulumi:"version"`
}

// NewActivateCentralizedPolicy registers a new resource with the given unique name, arguments, and options.
func NewActivateCentralizedPolicy(ctx *pulumi.Context,
	name string, args *ActivateCentralizedPolicyArgs, opts ...pulumi.ResourceOption) (*ActivateCentralizedPolicy, error) {
	if args == nil {
		args = &ActivateCentralizedPolicyArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ActivateCentralizedPolicy
	err := ctx.RegisterResource("sdwan:index/activateCentralizedPolicy:ActivateCentralizedPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetActivateCentralizedPolicy gets an existing ActivateCentralizedPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetActivateCentralizedPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ActivateCentralizedPolicyState, opts ...pulumi.ResourceOption) (*ActivateCentralizedPolicy, error) {
	var resource ActivateCentralizedPolicy
	err := ctx.ReadResource("sdwan:index/activateCentralizedPolicy:ActivateCentralizedPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ActivateCentralizedPolicy resources.
type activateCentralizedPolicyState struct {
	// The version of the centralized policy
	Version *int `pulumi:"version"`
}

type ActivateCentralizedPolicyState struct {
	// The version of the centralized policy
	Version pulumi.IntPtrInput
}

func (ActivateCentralizedPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*activateCentralizedPolicyState)(nil)).Elem()
}

type activateCentralizedPolicyArgs struct {
	// The version of the centralized policy
	Version *int `pulumi:"version"`
}

// The set of arguments for constructing a ActivateCentralizedPolicy resource.
type ActivateCentralizedPolicyArgs struct {
	// The version of the centralized policy
	Version pulumi.IntPtrInput
}

func (ActivateCentralizedPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*activateCentralizedPolicyArgs)(nil)).Elem()
}

type ActivateCentralizedPolicyInput interface {
	pulumi.Input

	ToActivateCentralizedPolicyOutput() ActivateCentralizedPolicyOutput
	ToActivateCentralizedPolicyOutputWithContext(ctx context.Context) ActivateCentralizedPolicyOutput
}

func (*ActivateCentralizedPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**ActivateCentralizedPolicy)(nil)).Elem()
}

func (i *ActivateCentralizedPolicy) ToActivateCentralizedPolicyOutput() ActivateCentralizedPolicyOutput {
	return i.ToActivateCentralizedPolicyOutputWithContext(context.Background())
}

func (i *ActivateCentralizedPolicy) ToActivateCentralizedPolicyOutputWithContext(ctx context.Context) ActivateCentralizedPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActivateCentralizedPolicyOutput)
}

// ActivateCentralizedPolicyArrayInput is an input type that accepts ActivateCentralizedPolicyArray and ActivateCentralizedPolicyArrayOutput values.
// You can construct a concrete instance of `ActivateCentralizedPolicyArrayInput` via:
//
//	ActivateCentralizedPolicyArray{ ActivateCentralizedPolicyArgs{...} }
type ActivateCentralizedPolicyArrayInput interface {
	pulumi.Input

	ToActivateCentralizedPolicyArrayOutput() ActivateCentralizedPolicyArrayOutput
	ToActivateCentralizedPolicyArrayOutputWithContext(context.Context) ActivateCentralizedPolicyArrayOutput
}

type ActivateCentralizedPolicyArray []ActivateCentralizedPolicyInput

func (ActivateCentralizedPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ActivateCentralizedPolicy)(nil)).Elem()
}

func (i ActivateCentralizedPolicyArray) ToActivateCentralizedPolicyArrayOutput() ActivateCentralizedPolicyArrayOutput {
	return i.ToActivateCentralizedPolicyArrayOutputWithContext(context.Background())
}

func (i ActivateCentralizedPolicyArray) ToActivateCentralizedPolicyArrayOutputWithContext(ctx context.Context) ActivateCentralizedPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActivateCentralizedPolicyArrayOutput)
}

// ActivateCentralizedPolicyMapInput is an input type that accepts ActivateCentralizedPolicyMap and ActivateCentralizedPolicyMapOutput values.
// You can construct a concrete instance of `ActivateCentralizedPolicyMapInput` via:
//
//	ActivateCentralizedPolicyMap{ "key": ActivateCentralizedPolicyArgs{...} }
type ActivateCentralizedPolicyMapInput interface {
	pulumi.Input

	ToActivateCentralizedPolicyMapOutput() ActivateCentralizedPolicyMapOutput
	ToActivateCentralizedPolicyMapOutputWithContext(context.Context) ActivateCentralizedPolicyMapOutput
}

type ActivateCentralizedPolicyMap map[string]ActivateCentralizedPolicyInput

func (ActivateCentralizedPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ActivateCentralizedPolicy)(nil)).Elem()
}

func (i ActivateCentralizedPolicyMap) ToActivateCentralizedPolicyMapOutput() ActivateCentralizedPolicyMapOutput {
	return i.ToActivateCentralizedPolicyMapOutputWithContext(context.Background())
}

func (i ActivateCentralizedPolicyMap) ToActivateCentralizedPolicyMapOutputWithContext(ctx context.Context) ActivateCentralizedPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActivateCentralizedPolicyMapOutput)
}

type ActivateCentralizedPolicyOutput struct{ *pulumi.OutputState }

func (ActivateCentralizedPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ActivateCentralizedPolicy)(nil)).Elem()
}

func (o ActivateCentralizedPolicyOutput) ToActivateCentralizedPolicyOutput() ActivateCentralizedPolicyOutput {
	return o
}

func (o ActivateCentralizedPolicyOutput) ToActivateCentralizedPolicyOutputWithContext(ctx context.Context) ActivateCentralizedPolicyOutput {
	return o
}

// The version of the centralized policy
func (o ActivateCentralizedPolicyOutput) Version() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ActivateCentralizedPolicy) pulumi.IntPtrOutput { return v.Version }).(pulumi.IntPtrOutput)
}

type ActivateCentralizedPolicyArrayOutput struct{ *pulumi.OutputState }

func (ActivateCentralizedPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ActivateCentralizedPolicy)(nil)).Elem()
}

func (o ActivateCentralizedPolicyArrayOutput) ToActivateCentralizedPolicyArrayOutput() ActivateCentralizedPolicyArrayOutput {
	return o
}

func (o ActivateCentralizedPolicyArrayOutput) ToActivateCentralizedPolicyArrayOutputWithContext(ctx context.Context) ActivateCentralizedPolicyArrayOutput {
	return o
}

func (o ActivateCentralizedPolicyArrayOutput) Index(i pulumi.IntInput) ActivateCentralizedPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ActivateCentralizedPolicy {
		return vs[0].([]*ActivateCentralizedPolicy)[vs[1].(int)]
	}).(ActivateCentralizedPolicyOutput)
}

type ActivateCentralizedPolicyMapOutput struct{ *pulumi.OutputState }

func (ActivateCentralizedPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ActivateCentralizedPolicy)(nil)).Elem()
}

func (o ActivateCentralizedPolicyMapOutput) ToActivateCentralizedPolicyMapOutput() ActivateCentralizedPolicyMapOutput {
	return o
}

func (o ActivateCentralizedPolicyMapOutput) ToActivateCentralizedPolicyMapOutputWithContext(ctx context.Context) ActivateCentralizedPolicyMapOutput {
	return o
}

func (o ActivateCentralizedPolicyMapOutput) MapIndex(k pulumi.StringInput) ActivateCentralizedPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ActivateCentralizedPolicy {
		return vs[0].(map[string]*ActivateCentralizedPolicy)[vs[1].(string)]
	}).(ActivateCentralizedPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ActivateCentralizedPolicyInput)(nil)).Elem(), &ActivateCentralizedPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*ActivateCentralizedPolicyArrayInput)(nil)).Elem(), ActivateCentralizedPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ActivateCentralizedPolicyMapInput)(nil)).Elem(), ActivateCentralizedPolicyMap{})
	pulumi.RegisterOutputType(ActivateCentralizedPolicyOutput{})
	pulumi.RegisterOutputType(ActivateCentralizedPolicyArrayOutput{})
	pulumi.RegisterOutputType(ActivateCentralizedPolicyMapOutput{})
}
