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

// This resource can manage a Other Feature Profile .
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
//			_, err := sdwan.NewOtherFeatureProfile(ctx, "example", &sdwan.OtherFeatureProfileArgs{
//				Name:        pulumi.String("OTHER_FP_1"),
//				Description: pulumi.String("My Other feature profile 1"),
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
// ```sh
// $ pulumi import sdwan:index/otherFeatureProfile:OtherFeatureProfile example "f6b2c44c-693c-4763-b010-895aa3d236bd"
// ```
type OtherFeatureProfile struct {
	pulumi.CustomResourceState

	// Description
	Description pulumi.StringOutput `pulumi:"description"`
	// The name of the transport feature profile
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewOtherFeatureProfile registers a new resource with the given unique name, arguments, and options.
func NewOtherFeatureProfile(ctx *pulumi.Context,
	name string, args *OtherFeatureProfileArgs, opts ...pulumi.ResourceOption) (*OtherFeatureProfile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OtherFeatureProfile
	err := ctx.RegisterResource("sdwan:index/otherFeatureProfile:OtherFeatureProfile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOtherFeatureProfile gets an existing OtherFeatureProfile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOtherFeatureProfile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OtherFeatureProfileState, opts ...pulumi.ResourceOption) (*OtherFeatureProfile, error) {
	var resource OtherFeatureProfile
	err := ctx.ReadResource("sdwan:index/otherFeatureProfile:OtherFeatureProfile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OtherFeatureProfile resources.
type otherFeatureProfileState struct {
	// Description
	Description *string `pulumi:"description"`
	// The name of the transport feature profile
	Name *string `pulumi:"name"`
}

type OtherFeatureProfileState struct {
	// Description
	Description pulumi.StringPtrInput
	// The name of the transport feature profile
	Name pulumi.StringPtrInput
}

func (OtherFeatureProfileState) ElementType() reflect.Type {
	return reflect.TypeOf((*otherFeatureProfileState)(nil)).Elem()
}

type otherFeatureProfileArgs struct {
	// Description
	Description string `pulumi:"description"`
	// The name of the transport feature profile
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a OtherFeatureProfile resource.
type OtherFeatureProfileArgs struct {
	// Description
	Description pulumi.StringInput
	// The name of the transport feature profile
	Name pulumi.StringPtrInput
}

func (OtherFeatureProfileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*otherFeatureProfileArgs)(nil)).Elem()
}

type OtherFeatureProfileInput interface {
	pulumi.Input

	ToOtherFeatureProfileOutput() OtherFeatureProfileOutput
	ToOtherFeatureProfileOutputWithContext(ctx context.Context) OtherFeatureProfileOutput
}

func (*OtherFeatureProfile) ElementType() reflect.Type {
	return reflect.TypeOf((**OtherFeatureProfile)(nil)).Elem()
}

func (i *OtherFeatureProfile) ToOtherFeatureProfileOutput() OtherFeatureProfileOutput {
	return i.ToOtherFeatureProfileOutputWithContext(context.Background())
}

func (i *OtherFeatureProfile) ToOtherFeatureProfileOutputWithContext(ctx context.Context) OtherFeatureProfileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OtherFeatureProfileOutput)
}

// OtherFeatureProfileArrayInput is an input type that accepts OtherFeatureProfileArray and OtherFeatureProfileArrayOutput values.
// You can construct a concrete instance of `OtherFeatureProfileArrayInput` via:
//
//	OtherFeatureProfileArray{ OtherFeatureProfileArgs{...} }
type OtherFeatureProfileArrayInput interface {
	pulumi.Input

	ToOtherFeatureProfileArrayOutput() OtherFeatureProfileArrayOutput
	ToOtherFeatureProfileArrayOutputWithContext(context.Context) OtherFeatureProfileArrayOutput
}

type OtherFeatureProfileArray []OtherFeatureProfileInput

func (OtherFeatureProfileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OtherFeatureProfile)(nil)).Elem()
}

func (i OtherFeatureProfileArray) ToOtherFeatureProfileArrayOutput() OtherFeatureProfileArrayOutput {
	return i.ToOtherFeatureProfileArrayOutputWithContext(context.Background())
}

func (i OtherFeatureProfileArray) ToOtherFeatureProfileArrayOutputWithContext(ctx context.Context) OtherFeatureProfileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OtherFeatureProfileArrayOutput)
}

// OtherFeatureProfileMapInput is an input type that accepts OtherFeatureProfileMap and OtherFeatureProfileMapOutput values.
// You can construct a concrete instance of `OtherFeatureProfileMapInput` via:
//
//	OtherFeatureProfileMap{ "key": OtherFeatureProfileArgs{...} }
type OtherFeatureProfileMapInput interface {
	pulumi.Input

	ToOtherFeatureProfileMapOutput() OtherFeatureProfileMapOutput
	ToOtherFeatureProfileMapOutputWithContext(context.Context) OtherFeatureProfileMapOutput
}

type OtherFeatureProfileMap map[string]OtherFeatureProfileInput

func (OtherFeatureProfileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OtherFeatureProfile)(nil)).Elem()
}

func (i OtherFeatureProfileMap) ToOtherFeatureProfileMapOutput() OtherFeatureProfileMapOutput {
	return i.ToOtherFeatureProfileMapOutputWithContext(context.Background())
}

func (i OtherFeatureProfileMap) ToOtherFeatureProfileMapOutputWithContext(ctx context.Context) OtherFeatureProfileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OtherFeatureProfileMapOutput)
}

type OtherFeatureProfileOutput struct{ *pulumi.OutputState }

func (OtherFeatureProfileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OtherFeatureProfile)(nil)).Elem()
}

func (o OtherFeatureProfileOutput) ToOtherFeatureProfileOutput() OtherFeatureProfileOutput {
	return o
}

func (o OtherFeatureProfileOutput) ToOtherFeatureProfileOutputWithContext(ctx context.Context) OtherFeatureProfileOutput {
	return o
}

// Description
func (o OtherFeatureProfileOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *OtherFeatureProfile) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The name of the transport feature profile
func (o OtherFeatureProfileOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OtherFeatureProfile) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type OtherFeatureProfileArrayOutput struct{ *pulumi.OutputState }

func (OtherFeatureProfileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OtherFeatureProfile)(nil)).Elem()
}

func (o OtherFeatureProfileArrayOutput) ToOtherFeatureProfileArrayOutput() OtherFeatureProfileArrayOutput {
	return o
}

func (o OtherFeatureProfileArrayOutput) ToOtherFeatureProfileArrayOutputWithContext(ctx context.Context) OtherFeatureProfileArrayOutput {
	return o
}

func (o OtherFeatureProfileArrayOutput) Index(i pulumi.IntInput) OtherFeatureProfileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OtherFeatureProfile {
		return vs[0].([]*OtherFeatureProfile)[vs[1].(int)]
	}).(OtherFeatureProfileOutput)
}

type OtherFeatureProfileMapOutput struct{ *pulumi.OutputState }

func (OtherFeatureProfileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OtherFeatureProfile)(nil)).Elem()
}

func (o OtherFeatureProfileMapOutput) ToOtherFeatureProfileMapOutput() OtherFeatureProfileMapOutput {
	return o
}

func (o OtherFeatureProfileMapOutput) ToOtherFeatureProfileMapOutputWithContext(ctx context.Context) OtherFeatureProfileMapOutput {
	return o
}

func (o OtherFeatureProfileMapOutput) MapIndex(k pulumi.StringInput) OtherFeatureProfileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OtherFeatureProfile {
		return vs[0].(map[string]*OtherFeatureProfile)[vs[1].(string)]
	}).(OtherFeatureProfileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OtherFeatureProfileInput)(nil)).Elem(), &OtherFeatureProfile{})
	pulumi.RegisterInputType(reflect.TypeOf((*OtherFeatureProfileArrayInput)(nil)).Elem(), OtherFeatureProfileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OtherFeatureProfileMapInput)(nil)).Elem(), OtherFeatureProfileMap{})
	pulumi.RegisterOutputType(OtherFeatureProfileOutput{})
	pulumi.RegisterOutputType(OtherFeatureProfileArrayOutput{})
	pulumi.RegisterOutputType(OtherFeatureProfileMapOutput{})
}