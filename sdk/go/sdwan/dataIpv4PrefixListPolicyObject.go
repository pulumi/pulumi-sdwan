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

// This resource can manage a Data IPv4 Prefix List Policy Object .
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
//			_, err := sdwan.NewDataIpv4PrefixListPolicyObject(ctx, "example", &sdwan.DataIpv4PrefixListPolicyObjectArgs{
//				Name: pulumi.String("Example"),
//				Entries: sdwan.DataIpv4PrefixListPolicyObjectEntryArray{
//					&sdwan.DataIpv4PrefixListPolicyObjectEntryArgs{
//						Prefix: pulumi.String("10.0.0.0/12"),
//					},
//				},
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
// ```sh
// $ pulumi import sdwan:index/dataIpv4PrefixListPolicyObject:DataIpv4PrefixListPolicyObject example "f6b2c44c-693c-4763-b010-895aa3d236bd"
// ```
type DataIpv4PrefixListPolicyObject struct {
	pulumi.CustomResourceState

	// List of entries
	Entries DataIpv4PrefixListPolicyObjectEntryArrayOutput `pulumi:"entries"`
	// The name of the policy object
	Name pulumi.StringOutput `pulumi:"name"`
	// The version of the object
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewDataIpv4PrefixListPolicyObject registers a new resource with the given unique name, arguments, and options.
func NewDataIpv4PrefixListPolicyObject(ctx *pulumi.Context,
	name string, args *DataIpv4PrefixListPolicyObjectArgs, opts ...pulumi.ResourceOption) (*DataIpv4PrefixListPolicyObject, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Entries == nil {
		return nil, errors.New("invalid value for required argument 'Entries'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DataIpv4PrefixListPolicyObject
	err := ctx.RegisterResource("sdwan:index/dataIpv4PrefixListPolicyObject:DataIpv4PrefixListPolicyObject", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDataIpv4PrefixListPolicyObject gets an existing DataIpv4PrefixListPolicyObject resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDataIpv4PrefixListPolicyObject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DataIpv4PrefixListPolicyObjectState, opts ...pulumi.ResourceOption) (*DataIpv4PrefixListPolicyObject, error) {
	var resource DataIpv4PrefixListPolicyObject
	err := ctx.ReadResource("sdwan:index/dataIpv4PrefixListPolicyObject:DataIpv4PrefixListPolicyObject", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DataIpv4PrefixListPolicyObject resources.
type dataIpv4PrefixListPolicyObjectState struct {
	// List of entries
	Entries []DataIpv4PrefixListPolicyObjectEntry `pulumi:"entries"`
	// The name of the policy object
	Name *string `pulumi:"name"`
	// The version of the object
	Version *int `pulumi:"version"`
}

type DataIpv4PrefixListPolicyObjectState struct {
	// List of entries
	Entries DataIpv4PrefixListPolicyObjectEntryArrayInput
	// The name of the policy object
	Name pulumi.StringPtrInput
	// The version of the object
	Version pulumi.IntPtrInput
}

func (DataIpv4PrefixListPolicyObjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*dataIpv4PrefixListPolicyObjectState)(nil)).Elem()
}

type dataIpv4PrefixListPolicyObjectArgs struct {
	// List of entries
	Entries []DataIpv4PrefixListPolicyObjectEntry `pulumi:"entries"`
	// The name of the policy object
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a DataIpv4PrefixListPolicyObject resource.
type DataIpv4PrefixListPolicyObjectArgs struct {
	// List of entries
	Entries DataIpv4PrefixListPolicyObjectEntryArrayInput
	// The name of the policy object
	Name pulumi.StringPtrInput
}

func (DataIpv4PrefixListPolicyObjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dataIpv4PrefixListPolicyObjectArgs)(nil)).Elem()
}

type DataIpv4PrefixListPolicyObjectInput interface {
	pulumi.Input

	ToDataIpv4PrefixListPolicyObjectOutput() DataIpv4PrefixListPolicyObjectOutput
	ToDataIpv4PrefixListPolicyObjectOutputWithContext(ctx context.Context) DataIpv4PrefixListPolicyObjectOutput
}

func (*DataIpv4PrefixListPolicyObject) ElementType() reflect.Type {
	return reflect.TypeOf((**DataIpv4PrefixListPolicyObject)(nil)).Elem()
}

func (i *DataIpv4PrefixListPolicyObject) ToDataIpv4PrefixListPolicyObjectOutput() DataIpv4PrefixListPolicyObjectOutput {
	return i.ToDataIpv4PrefixListPolicyObjectOutputWithContext(context.Background())
}

func (i *DataIpv4PrefixListPolicyObject) ToDataIpv4PrefixListPolicyObjectOutputWithContext(ctx context.Context) DataIpv4PrefixListPolicyObjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataIpv4PrefixListPolicyObjectOutput)
}

// DataIpv4PrefixListPolicyObjectArrayInput is an input type that accepts DataIpv4PrefixListPolicyObjectArray and DataIpv4PrefixListPolicyObjectArrayOutput values.
// You can construct a concrete instance of `DataIpv4PrefixListPolicyObjectArrayInput` via:
//
//	DataIpv4PrefixListPolicyObjectArray{ DataIpv4PrefixListPolicyObjectArgs{...} }
type DataIpv4PrefixListPolicyObjectArrayInput interface {
	pulumi.Input

	ToDataIpv4PrefixListPolicyObjectArrayOutput() DataIpv4PrefixListPolicyObjectArrayOutput
	ToDataIpv4PrefixListPolicyObjectArrayOutputWithContext(context.Context) DataIpv4PrefixListPolicyObjectArrayOutput
}

type DataIpv4PrefixListPolicyObjectArray []DataIpv4PrefixListPolicyObjectInput

func (DataIpv4PrefixListPolicyObjectArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataIpv4PrefixListPolicyObject)(nil)).Elem()
}

func (i DataIpv4PrefixListPolicyObjectArray) ToDataIpv4PrefixListPolicyObjectArrayOutput() DataIpv4PrefixListPolicyObjectArrayOutput {
	return i.ToDataIpv4PrefixListPolicyObjectArrayOutputWithContext(context.Background())
}

func (i DataIpv4PrefixListPolicyObjectArray) ToDataIpv4PrefixListPolicyObjectArrayOutputWithContext(ctx context.Context) DataIpv4PrefixListPolicyObjectArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataIpv4PrefixListPolicyObjectArrayOutput)
}

// DataIpv4PrefixListPolicyObjectMapInput is an input type that accepts DataIpv4PrefixListPolicyObjectMap and DataIpv4PrefixListPolicyObjectMapOutput values.
// You can construct a concrete instance of `DataIpv4PrefixListPolicyObjectMapInput` via:
//
//	DataIpv4PrefixListPolicyObjectMap{ "key": DataIpv4PrefixListPolicyObjectArgs{...} }
type DataIpv4PrefixListPolicyObjectMapInput interface {
	pulumi.Input

	ToDataIpv4PrefixListPolicyObjectMapOutput() DataIpv4PrefixListPolicyObjectMapOutput
	ToDataIpv4PrefixListPolicyObjectMapOutputWithContext(context.Context) DataIpv4PrefixListPolicyObjectMapOutput
}

type DataIpv4PrefixListPolicyObjectMap map[string]DataIpv4PrefixListPolicyObjectInput

func (DataIpv4PrefixListPolicyObjectMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataIpv4PrefixListPolicyObject)(nil)).Elem()
}

func (i DataIpv4PrefixListPolicyObjectMap) ToDataIpv4PrefixListPolicyObjectMapOutput() DataIpv4PrefixListPolicyObjectMapOutput {
	return i.ToDataIpv4PrefixListPolicyObjectMapOutputWithContext(context.Background())
}

func (i DataIpv4PrefixListPolicyObjectMap) ToDataIpv4PrefixListPolicyObjectMapOutputWithContext(ctx context.Context) DataIpv4PrefixListPolicyObjectMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataIpv4PrefixListPolicyObjectMapOutput)
}

type DataIpv4PrefixListPolicyObjectOutput struct{ *pulumi.OutputState }

func (DataIpv4PrefixListPolicyObjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DataIpv4PrefixListPolicyObject)(nil)).Elem()
}

func (o DataIpv4PrefixListPolicyObjectOutput) ToDataIpv4PrefixListPolicyObjectOutput() DataIpv4PrefixListPolicyObjectOutput {
	return o
}

func (o DataIpv4PrefixListPolicyObjectOutput) ToDataIpv4PrefixListPolicyObjectOutputWithContext(ctx context.Context) DataIpv4PrefixListPolicyObjectOutput {
	return o
}

// List of entries
func (o DataIpv4PrefixListPolicyObjectOutput) Entries() DataIpv4PrefixListPolicyObjectEntryArrayOutput {
	return o.ApplyT(func(v *DataIpv4PrefixListPolicyObject) DataIpv4PrefixListPolicyObjectEntryArrayOutput {
		return v.Entries
	}).(DataIpv4PrefixListPolicyObjectEntryArrayOutput)
}

// The name of the policy object
func (o DataIpv4PrefixListPolicyObjectOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DataIpv4PrefixListPolicyObject) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The version of the object
func (o DataIpv4PrefixListPolicyObjectOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *DataIpv4PrefixListPolicyObject) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type DataIpv4PrefixListPolicyObjectArrayOutput struct{ *pulumi.OutputState }

func (DataIpv4PrefixListPolicyObjectArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataIpv4PrefixListPolicyObject)(nil)).Elem()
}

func (o DataIpv4PrefixListPolicyObjectArrayOutput) ToDataIpv4PrefixListPolicyObjectArrayOutput() DataIpv4PrefixListPolicyObjectArrayOutput {
	return o
}

func (o DataIpv4PrefixListPolicyObjectArrayOutput) ToDataIpv4PrefixListPolicyObjectArrayOutputWithContext(ctx context.Context) DataIpv4PrefixListPolicyObjectArrayOutput {
	return o
}

func (o DataIpv4PrefixListPolicyObjectArrayOutput) Index(i pulumi.IntInput) DataIpv4PrefixListPolicyObjectOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DataIpv4PrefixListPolicyObject {
		return vs[0].([]*DataIpv4PrefixListPolicyObject)[vs[1].(int)]
	}).(DataIpv4PrefixListPolicyObjectOutput)
}

type DataIpv4PrefixListPolicyObjectMapOutput struct{ *pulumi.OutputState }

func (DataIpv4PrefixListPolicyObjectMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataIpv4PrefixListPolicyObject)(nil)).Elem()
}

func (o DataIpv4PrefixListPolicyObjectMapOutput) ToDataIpv4PrefixListPolicyObjectMapOutput() DataIpv4PrefixListPolicyObjectMapOutput {
	return o
}

func (o DataIpv4PrefixListPolicyObjectMapOutput) ToDataIpv4PrefixListPolicyObjectMapOutputWithContext(ctx context.Context) DataIpv4PrefixListPolicyObjectMapOutput {
	return o
}

func (o DataIpv4PrefixListPolicyObjectMapOutput) MapIndex(k pulumi.StringInput) DataIpv4PrefixListPolicyObjectOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DataIpv4PrefixListPolicyObject {
		return vs[0].(map[string]*DataIpv4PrefixListPolicyObject)[vs[1].(string)]
	}).(DataIpv4PrefixListPolicyObjectOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DataIpv4PrefixListPolicyObjectInput)(nil)).Elem(), &DataIpv4PrefixListPolicyObject{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataIpv4PrefixListPolicyObjectArrayInput)(nil)).Elem(), DataIpv4PrefixListPolicyObjectArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataIpv4PrefixListPolicyObjectMapInput)(nil)).Elem(), DataIpv4PrefixListPolicyObjectMap{})
	pulumi.RegisterOutputType(DataIpv4PrefixListPolicyObjectOutput{})
	pulumi.RegisterOutputType(DataIpv4PrefixListPolicyObjectArrayOutput{})
	pulumi.RegisterOutputType(DataIpv4PrefixListPolicyObjectMapOutput{})
}
