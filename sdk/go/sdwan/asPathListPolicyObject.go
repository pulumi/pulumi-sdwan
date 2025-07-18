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

// This resource can manage a AS Path List Policy Object .
//
// ## Import
//
// The `pulumi import` command can be used, for example:
//
// ```sh
// $ pulumi import sdwan:index/asPathListPolicyObject:AsPathListPolicyObject example "f6b2c44c-693c-4763-b010-895aa3d236bd"
// ```
type AsPathListPolicyObject struct {
	pulumi.CustomResourceState

	// List of entries
	Entries AsPathListPolicyObjectEntryArrayOutput `pulumi:"entries"`
	// The name of the policy object
	Name pulumi.StringOutput `pulumi:"name"`
	// The version of the object
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewAsPathListPolicyObject registers a new resource with the given unique name, arguments, and options.
func NewAsPathListPolicyObject(ctx *pulumi.Context,
	name string, args *AsPathListPolicyObjectArgs, opts ...pulumi.ResourceOption) (*AsPathListPolicyObject, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Entries == nil {
		return nil, errors.New("invalid value for required argument 'Entries'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AsPathListPolicyObject
	err := ctx.RegisterResource("sdwan:index/asPathListPolicyObject:AsPathListPolicyObject", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAsPathListPolicyObject gets an existing AsPathListPolicyObject resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAsPathListPolicyObject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AsPathListPolicyObjectState, opts ...pulumi.ResourceOption) (*AsPathListPolicyObject, error) {
	var resource AsPathListPolicyObject
	err := ctx.ReadResource("sdwan:index/asPathListPolicyObject:AsPathListPolicyObject", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AsPathListPolicyObject resources.
type asPathListPolicyObjectState struct {
	// List of entries
	Entries []AsPathListPolicyObjectEntry `pulumi:"entries"`
	// The name of the policy object
	Name *string `pulumi:"name"`
	// The version of the object
	Version *int `pulumi:"version"`
}

type AsPathListPolicyObjectState struct {
	// List of entries
	Entries AsPathListPolicyObjectEntryArrayInput
	// The name of the policy object
	Name pulumi.StringPtrInput
	// The version of the object
	Version pulumi.IntPtrInput
}

func (AsPathListPolicyObjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*asPathListPolicyObjectState)(nil)).Elem()
}

type asPathListPolicyObjectArgs struct {
	// List of entries
	Entries []AsPathListPolicyObjectEntry `pulumi:"entries"`
	// The name of the policy object
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a AsPathListPolicyObject resource.
type AsPathListPolicyObjectArgs struct {
	// List of entries
	Entries AsPathListPolicyObjectEntryArrayInput
	// The name of the policy object
	Name pulumi.StringPtrInput
}

func (AsPathListPolicyObjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*asPathListPolicyObjectArgs)(nil)).Elem()
}

type AsPathListPolicyObjectInput interface {
	pulumi.Input

	ToAsPathListPolicyObjectOutput() AsPathListPolicyObjectOutput
	ToAsPathListPolicyObjectOutputWithContext(ctx context.Context) AsPathListPolicyObjectOutput
}

func (*AsPathListPolicyObject) ElementType() reflect.Type {
	return reflect.TypeOf((**AsPathListPolicyObject)(nil)).Elem()
}

func (i *AsPathListPolicyObject) ToAsPathListPolicyObjectOutput() AsPathListPolicyObjectOutput {
	return i.ToAsPathListPolicyObjectOutputWithContext(context.Background())
}

func (i *AsPathListPolicyObject) ToAsPathListPolicyObjectOutputWithContext(ctx context.Context) AsPathListPolicyObjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AsPathListPolicyObjectOutput)
}

// AsPathListPolicyObjectArrayInput is an input type that accepts AsPathListPolicyObjectArray and AsPathListPolicyObjectArrayOutput values.
// You can construct a concrete instance of `AsPathListPolicyObjectArrayInput` via:
//
//	AsPathListPolicyObjectArray{ AsPathListPolicyObjectArgs{...} }
type AsPathListPolicyObjectArrayInput interface {
	pulumi.Input

	ToAsPathListPolicyObjectArrayOutput() AsPathListPolicyObjectArrayOutput
	ToAsPathListPolicyObjectArrayOutputWithContext(context.Context) AsPathListPolicyObjectArrayOutput
}

type AsPathListPolicyObjectArray []AsPathListPolicyObjectInput

func (AsPathListPolicyObjectArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AsPathListPolicyObject)(nil)).Elem()
}

func (i AsPathListPolicyObjectArray) ToAsPathListPolicyObjectArrayOutput() AsPathListPolicyObjectArrayOutput {
	return i.ToAsPathListPolicyObjectArrayOutputWithContext(context.Background())
}

func (i AsPathListPolicyObjectArray) ToAsPathListPolicyObjectArrayOutputWithContext(ctx context.Context) AsPathListPolicyObjectArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AsPathListPolicyObjectArrayOutput)
}

// AsPathListPolicyObjectMapInput is an input type that accepts AsPathListPolicyObjectMap and AsPathListPolicyObjectMapOutput values.
// You can construct a concrete instance of `AsPathListPolicyObjectMapInput` via:
//
//	AsPathListPolicyObjectMap{ "key": AsPathListPolicyObjectArgs{...} }
type AsPathListPolicyObjectMapInput interface {
	pulumi.Input

	ToAsPathListPolicyObjectMapOutput() AsPathListPolicyObjectMapOutput
	ToAsPathListPolicyObjectMapOutputWithContext(context.Context) AsPathListPolicyObjectMapOutput
}

type AsPathListPolicyObjectMap map[string]AsPathListPolicyObjectInput

func (AsPathListPolicyObjectMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AsPathListPolicyObject)(nil)).Elem()
}

func (i AsPathListPolicyObjectMap) ToAsPathListPolicyObjectMapOutput() AsPathListPolicyObjectMapOutput {
	return i.ToAsPathListPolicyObjectMapOutputWithContext(context.Background())
}

func (i AsPathListPolicyObjectMap) ToAsPathListPolicyObjectMapOutputWithContext(ctx context.Context) AsPathListPolicyObjectMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AsPathListPolicyObjectMapOutput)
}

type AsPathListPolicyObjectOutput struct{ *pulumi.OutputState }

func (AsPathListPolicyObjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AsPathListPolicyObject)(nil)).Elem()
}

func (o AsPathListPolicyObjectOutput) ToAsPathListPolicyObjectOutput() AsPathListPolicyObjectOutput {
	return o
}

func (o AsPathListPolicyObjectOutput) ToAsPathListPolicyObjectOutputWithContext(ctx context.Context) AsPathListPolicyObjectOutput {
	return o
}

// List of entries
func (o AsPathListPolicyObjectOutput) Entries() AsPathListPolicyObjectEntryArrayOutput {
	return o.ApplyT(func(v *AsPathListPolicyObject) AsPathListPolicyObjectEntryArrayOutput { return v.Entries }).(AsPathListPolicyObjectEntryArrayOutput)
}

// The name of the policy object
func (o AsPathListPolicyObjectOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AsPathListPolicyObject) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The version of the object
func (o AsPathListPolicyObjectOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *AsPathListPolicyObject) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type AsPathListPolicyObjectArrayOutput struct{ *pulumi.OutputState }

func (AsPathListPolicyObjectArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AsPathListPolicyObject)(nil)).Elem()
}

func (o AsPathListPolicyObjectArrayOutput) ToAsPathListPolicyObjectArrayOutput() AsPathListPolicyObjectArrayOutput {
	return o
}

func (o AsPathListPolicyObjectArrayOutput) ToAsPathListPolicyObjectArrayOutputWithContext(ctx context.Context) AsPathListPolicyObjectArrayOutput {
	return o
}

func (o AsPathListPolicyObjectArrayOutput) Index(i pulumi.IntInput) AsPathListPolicyObjectOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AsPathListPolicyObject {
		return vs[0].([]*AsPathListPolicyObject)[vs[1].(int)]
	}).(AsPathListPolicyObjectOutput)
}

type AsPathListPolicyObjectMapOutput struct{ *pulumi.OutputState }

func (AsPathListPolicyObjectMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AsPathListPolicyObject)(nil)).Elem()
}

func (o AsPathListPolicyObjectMapOutput) ToAsPathListPolicyObjectMapOutput() AsPathListPolicyObjectMapOutput {
	return o
}

func (o AsPathListPolicyObjectMapOutput) ToAsPathListPolicyObjectMapOutputWithContext(ctx context.Context) AsPathListPolicyObjectMapOutput {
	return o
}

func (o AsPathListPolicyObjectMapOutput) MapIndex(k pulumi.StringInput) AsPathListPolicyObjectOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AsPathListPolicyObject {
		return vs[0].(map[string]*AsPathListPolicyObject)[vs[1].(string)]
	}).(AsPathListPolicyObjectOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AsPathListPolicyObjectInput)(nil)).Elem(), &AsPathListPolicyObject{})
	pulumi.RegisterInputType(reflect.TypeOf((*AsPathListPolicyObjectArrayInput)(nil)).Elem(), AsPathListPolicyObjectArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AsPathListPolicyObjectMapInput)(nil)).Elem(), AsPathListPolicyObjectMap{})
	pulumi.RegisterOutputType(AsPathListPolicyObjectOutput{})
	pulumi.RegisterOutputType(AsPathListPolicyObjectArrayOutput{})
	pulumi.RegisterOutputType(AsPathListPolicyObjectMapOutput{})
}
