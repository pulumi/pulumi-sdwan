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

// This resource can manage a Transport Feature Profile .
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
//			_, err := sdwan.NewTransportFeatureProfile(ctx, "example", &sdwan.TransportFeatureProfileArgs{
//				Name:        pulumi.String("TRANSPORT_FP_1"),
//				Description: pulumi.String("My transport feature profile 1"),
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
// $ pulumi import sdwan:index/transportFeatureProfile:TransportFeatureProfile example "f6b2c44c-693c-4763-b010-895aa3d236bd"
// ```
type TransportFeatureProfile struct {
	pulumi.CustomResourceState

	// Description
	Description pulumi.StringOutput `pulumi:"description"`
	// The name of the transport feature profile
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewTransportFeatureProfile registers a new resource with the given unique name, arguments, and options.
func NewTransportFeatureProfile(ctx *pulumi.Context,
	name string, args *TransportFeatureProfileArgs, opts ...pulumi.ResourceOption) (*TransportFeatureProfile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TransportFeatureProfile
	err := ctx.RegisterResource("sdwan:index/transportFeatureProfile:TransportFeatureProfile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTransportFeatureProfile gets an existing TransportFeatureProfile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTransportFeatureProfile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TransportFeatureProfileState, opts ...pulumi.ResourceOption) (*TransportFeatureProfile, error) {
	var resource TransportFeatureProfile
	err := ctx.ReadResource("sdwan:index/transportFeatureProfile:TransportFeatureProfile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TransportFeatureProfile resources.
type transportFeatureProfileState struct {
	// Description
	Description *string `pulumi:"description"`
	// The name of the transport feature profile
	Name *string `pulumi:"name"`
}

type TransportFeatureProfileState struct {
	// Description
	Description pulumi.StringPtrInput
	// The name of the transport feature profile
	Name pulumi.StringPtrInput
}

func (TransportFeatureProfileState) ElementType() reflect.Type {
	return reflect.TypeOf((*transportFeatureProfileState)(nil)).Elem()
}

type transportFeatureProfileArgs struct {
	// Description
	Description string `pulumi:"description"`
	// The name of the transport feature profile
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a TransportFeatureProfile resource.
type TransportFeatureProfileArgs struct {
	// Description
	Description pulumi.StringInput
	// The name of the transport feature profile
	Name pulumi.StringPtrInput
}

func (TransportFeatureProfileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*transportFeatureProfileArgs)(nil)).Elem()
}

type TransportFeatureProfileInput interface {
	pulumi.Input

	ToTransportFeatureProfileOutput() TransportFeatureProfileOutput
	ToTransportFeatureProfileOutputWithContext(ctx context.Context) TransportFeatureProfileOutput
}

func (*TransportFeatureProfile) ElementType() reflect.Type {
	return reflect.TypeOf((**TransportFeatureProfile)(nil)).Elem()
}

func (i *TransportFeatureProfile) ToTransportFeatureProfileOutput() TransportFeatureProfileOutput {
	return i.ToTransportFeatureProfileOutputWithContext(context.Background())
}

func (i *TransportFeatureProfile) ToTransportFeatureProfileOutputWithContext(ctx context.Context) TransportFeatureProfileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransportFeatureProfileOutput)
}

// TransportFeatureProfileArrayInput is an input type that accepts TransportFeatureProfileArray and TransportFeatureProfileArrayOutput values.
// You can construct a concrete instance of `TransportFeatureProfileArrayInput` via:
//
//	TransportFeatureProfileArray{ TransportFeatureProfileArgs{...} }
type TransportFeatureProfileArrayInput interface {
	pulumi.Input

	ToTransportFeatureProfileArrayOutput() TransportFeatureProfileArrayOutput
	ToTransportFeatureProfileArrayOutputWithContext(context.Context) TransportFeatureProfileArrayOutput
}

type TransportFeatureProfileArray []TransportFeatureProfileInput

func (TransportFeatureProfileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransportFeatureProfile)(nil)).Elem()
}

func (i TransportFeatureProfileArray) ToTransportFeatureProfileArrayOutput() TransportFeatureProfileArrayOutput {
	return i.ToTransportFeatureProfileArrayOutputWithContext(context.Background())
}

func (i TransportFeatureProfileArray) ToTransportFeatureProfileArrayOutputWithContext(ctx context.Context) TransportFeatureProfileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransportFeatureProfileArrayOutput)
}

// TransportFeatureProfileMapInput is an input type that accepts TransportFeatureProfileMap and TransportFeatureProfileMapOutput values.
// You can construct a concrete instance of `TransportFeatureProfileMapInput` via:
//
//	TransportFeatureProfileMap{ "key": TransportFeatureProfileArgs{...} }
type TransportFeatureProfileMapInput interface {
	pulumi.Input

	ToTransportFeatureProfileMapOutput() TransportFeatureProfileMapOutput
	ToTransportFeatureProfileMapOutputWithContext(context.Context) TransportFeatureProfileMapOutput
}

type TransportFeatureProfileMap map[string]TransportFeatureProfileInput

func (TransportFeatureProfileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransportFeatureProfile)(nil)).Elem()
}

func (i TransportFeatureProfileMap) ToTransportFeatureProfileMapOutput() TransportFeatureProfileMapOutput {
	return i.ToTransportFeatureProfileMapOutputWithContext(context.Background())
}

func (i TransportFeatureProfileMap) ToTransportFeatureProfileMapOutputWithContext(ctx context.Context) TransportFeatureProfileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransportFeatureProfileMapOutput)
}

type TransportFeatureProfileOutput struct{ *pulumi.OutputState }

func (TransportFeatureProfileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TransportFeatureProfile)(nil)).Elem()
}

func (o TransportFeatureProfileOutput) ToTransportFeatureProfileOutput() TransportFeatureProfileOutput {
	return o
}

func (o TransportFeatureProfileOutput) ToTransportFeatureProfileOutputWithContext(ctx context.Context) TransportFeatureProfileOutput {
	return o
}

// Description
func (o TransportFeatureProfileOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *TransportFeatureProfile) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The name of the transport feature profile
func (o TransportFeatureProfileOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *TransportFeatureProfile) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type TransportFeatureProfileArrayOutput struct{ *pulumi.OutputState }

func (TransportFeatureProfileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransportFeatureProfile)(nil)).Elem()
}

func (o TransportFeatureProfileArrayOutput) ToTransportFeatureProfileArrayOutput() TransportFeatureProfileArrayOutput {
	return o
}

func (o TransportFeatureProfileArrayOutput) ToTransportFeatureProfileArrayOutputWithContext(ctx context.Context) TransportFeatureProfileArrayOutput {
	return o
}

func (o TransportFeatureProfileArrayOutput) Index(i pulumi.IntInput) TransportFeatureProfileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TransportFeatureProfile {
		return vs[0].([]*TransportFeatureProfile)[vs[1].(int)]
	}).(TransportFeatureProfileOutput)
}

type TransportFeatureProfileMapOutput struct{ *pulumi.OutputState }

func (TransportFeatureProfileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransportFeatureProfile)(nil)).Elem()
}

func (o TransportFeatureProfileMapOutput) ToTransportFeatureProfileMapOutput() TransportFeatureProfileMapOutput {
	return o
}

func (o TransportFeatureProfileMapOutput) ToTransportFeatureProfileMapOutputWithContext(ctx context.Context) TransportFeatureProfileMapOutput {
	return o
}

func (o TransportFeatureProfileMapOutput) MapIndex(k pulumi.StringInput) TransportFeatureProfileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TransportFeatureProfile {
		return vs[0].(map[string]*TransportFeatureProfile)[vs[1].(string)]
	}).(TransportFeatureProfileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TransportFeatureProfileInput)(nil)).Elem(), &TransportFeatureProfile{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransportFeatureProfileArrayInput)(nil)).Elem(), TransportFeatureProfileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransportFeatureProfileMapInput)(nil)).Elem(), TransportFeatureProfileMap{})
	pulumi.RegisterOutputType(TransportFeatureProfileOutput{})
	pulumi.RegisterOutputType(TransportFeatureProfileArrayOutput{})
	pulumi.RegisterOutputType(TransportFeatureProfileMapOutput{})
}
