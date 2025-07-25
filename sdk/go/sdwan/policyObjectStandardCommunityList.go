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

// This resource can manage a Policy Object Standard Community List Policy_object.
//   - Minimum SD-WAN Manager version: `20.12.0`
//
// ## Import
//
// The `pulumi import` command can be used, for example:
//
// Expected import identifier with the format: "policy_object_standard_community_list_id,feature_profile_id"
//
// ```sh
// $ pulumi import sdwan:index/policyObjectStandardCommunityList:PolicyObjectStandardCommunityList example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"
// ```
type PolicyObjectStandardCommunityList struct {
	pulumi.CustomResourceState

	// The description of the Policy_object
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Standard Community List
	Entries PolicyObjectStandardCommunityListEntryArrayOutput `pulumi:"entries"`
	// Feature Profile ID
	FeatureProfileId pulumi.StringOutput `pulumi:"featureProfileId"`
	// The name of the Policy_object
	Name pulumi.StringOutput `pulumi:"name"`
	// The version of the Policy_object
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewPolicyObjectStandardCommunityList registers a new resource with the given unique name, arguments, and options.
func NewPolicyObjectStandardCommunityList(ctx *pulumi.Context,
	name string, args *PolicyObjectStandardCommunityListArgs, opts ...pulumi.ResourceOption) (*PolicyObjectStandardCommunityList, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Entries == nil {
		return nil, errors.New("invalid value for required argument 'Entries'")
	}
	if args.FeatureProfileId == nil {
		return nil, errors.New("invalid value for required argument 'FeatureProfileId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PolicyObjectStandardCommunityList
	err := ctx.RegisterResource("sdwan:index/policyObjectStandardCommunityList:PolicyObjectStandardCommunityList", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPolicyObjectStandardCommunityList gets an existing PolicyObjectStandardCommunityList resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPolicyObjectStandardCommunityList(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PolicyObjectStandardCommunityListState, opts ...pulumi.ResourceOption) (*PolicyObjectStandardCommunityList, error) {
	var resource PolicyObjectStandardCommunityList
	err := ctx.ReadResource("sdwan:index/policyObjectStandardCommunityList:PolicyObjectStandardCommunityList", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PolicyObjectStandardCommunityList resources.
type policyObjectStandardCommunityListState struct {
	// The description of the Policy_object
	Description *string `pulumi:"description"`
	// Standard Community List
	Entries []PolicyObjectStandardCommunityListEntry `pulumi:"entries"`
	// Feature Profile ID
	FeatureProfileId *string `pulumi:"featureProfileId"`
	// The name of the Policy_object
	Name *string `pulumi:"name"`
	// The version of the Policy_object
	Version *int `pulumi:"version"`
}

type PolicyObjectStandardCommunityListState struct {
	// The description of the Policy_object
	Description pulumi.StringPtrInput
	// Standard Community List
	Entries PolicyObjectStandardCommunityListEntryArrayInput
	// Feature Profile ID
	FeatureProfileId pulumi.StringPtrInput
	// The name of the Policy_object
	Name pulumi.StringPtrInput
	// The version of the Policy_object
	Version pulumi.IntPtrInput
}

func (PolicyObjectStandardCommunityListState) ElementType() reflect.Type {
	return reflect.TypeOf((*policyObjectStandardCommunityListState)(nil)).Elem()
}

type policyObjectStandardCommunityListArgs struct {
	// The description of the Policy_object
	Description *string `pulumi:"description"`
	// Standard Community List
	Entries []PolicyObjectStandardCommunityListEntry `pulumi:"entries"`
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The name of the Policy_object
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a PolicyObjectStandardCommunityList resource.
type PolicyObjectStandardCommunityListArgs struct {
	// The description of the Policy_object
	Description pulumi.StringPtrInput
	// Standard Community List
	Entries PolicyObjectStandardCommunityListEntryArrayInput
	// Feature Profile ID
	FeatureProfileId pulumi.StringInput
	// The name of the Policy_object
	Name pulumi.StringPtrInput
}

func (PolicyObjectStandardCommunityListArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*policyObjectStandardCommunityListArgs)(nil)).Elem()
}

type PolicyObjectStandardCommunityListInput interface {
	pulumi.Input

	ToPolicyObjectStandardCommunityListOutput() PolicyObjectStandardCommunityListOutput
	ToPolicyObjectStandardCommunityListOutputWithContext(ctx context.Context) PolicyObjectStandardCommunityListOutput
}

func (*PolicyObjectStandardCommunityList) ElementType() reflect.Type {
	return reflect.TypeOf((**PolicyObjectStandardCommunityList)(nil)).Elem()
}

func (i *PolicyObjectStandardCommunityList) ToPolicyObjectStandardCommunityListOutput() PolicyObjectStandardCommunityListOutput {
	return i.ToPolicyObjectStandardCommunityListOutputWithContext(context.Background())
}

func (i *PolicyObjectStandardCommunityList) ToPolicyObjectStandardCommunityListOutputWithContext(ctx context.Context) PolicyObjectStandardCommunityListOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyObjectStandardCommunityListOutput)
}

// PolicyObjectStandardCommunityListArrayInput is an input type that accepts PolicyObjectStandardCommunityListArray and PolicyObjectStandardCommunityListArrayOutput values.
// You can construct a concrete instance of `PolicyObjectStandardCommunityListArrayInput` via:
//
//	PolicyObjectStandardCommunityListArray{ PolicyObjectStandardCommunityListArgs{...} }
type PolicyObjectStandardCommunityListArrayInput interface {
	pulumi.Input

	ToPolicyObjectStandardCommunityListArrayOutput() PolicyObjectStandardCommunityListArrayOutput
	ToPolicyObjectStandardCommunityListArrayOutputWithContext(context.Context) PolicyObjectStandardCommunityListArrayOutput
}

type PolicyObjectStandardCommunityListArray []PolicyObjectStandardCommunityListInput

func (PolicyObjectStandardCommunityListArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PolicyObjectStandardCommunityList)(nil)).Elem()
}

func (i PolicyObjectStandardCommunityListArray) ToPolicyObjectStandardCommunityListArrayOutput() PolicyObjectStandardCommunityListArrayOutput {
	return i.ToPolicyObjectStandardCommunityListArrayOutputWithContext(context.Background())
}

func (i PolicyObjectStandardCommunityListArray) ToPolicyObjectStandardCommunityListArrayOutputWithContext(ctx context.Context) PolicyObjectStandardCommunityListArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyObjectStandardCommunityListArrayOutput)
}

// PolicyObjectStandardCommunityListMapInput is an input type that accepts PolicyObjectStandardCommunityListMap and PolicyObjectStandardCommunityListMapOutput values.
// You can construct a concrete instance of `PolicyObjectStandardCommunityListMapInput` via:
//
//	PolicyObjectStandardCommunityListMap{ "key": PolicyObjectStandardCommunityListArgs{...} }
type PolicyObjectStandardCommunityListMapInput interface {
	pulumi.Input

	ToPolicyObjectStandardCommunityListMapOutput() PolicyObjectStandardCommunityListMapOutput
	ToPolicyObjectStandardCommunityListMapOutputWithContext(context.Context) PolicyObjectStandardCommunityListMapOutput
}

type PolicyObjectStandardCommunityListMap map[string]PolicyObjectStandardCommunityListInput

func (PolicyObjectStandardCommunityListMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PolicyObjectStandardCommunityList)(nil)).Elem()
}

func (i PolicyObjectStandardCommunityListMap) ToPolicyObjectStandardCommunityListMapOutput() PolicyObjectStandardCommunityListMapOutput {
	return i.ToPolicyObjectStandardCommunityListMapOutputWithContext(context.Background())
}

func (i PolicyObjectStandardCommunityListMap) ToPolicyObjectStandardCommunityListMapOutputWithContext(ctx context.Context) PolicyObjectStandardCommunityListMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyObjectStandardCommunityListMapOutput)
}

type PolicyObjectStandardCommunityListOutput struct{ *pulumi.OutputState }

func (PolicyObjectStandardCommunityListOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PolicyObjectStandardCommunityList)(nil)).Elem()
}

func (o PolicyObjectStandardCommunityListOutput) ToPolicyObjectStandardCommunityListOutput() PolicyObjectStandardCommunityListOutput {
	return o
}

func (o PolicyObjectStandardCommunityListOutput) ToPolicyObjectStandardCommunityListOutputWithContext(ctx context.Context) PolicyObjectStandardCommunityListOutput {
	return o
}

// The description of the Policy_object
func (o PolicyObjectStandardCommunityListOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PolicyObjectStandardCommunityList) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Standard Community List
func (o PolicyObjectStandardCommunityListOutput) Entries() PolicyObjectStandardCommunityListEntryArrayOutput {
	return o.ApplyT(func(v *PolicyObjectStandardCommunityList) PolicyObjectStandardCommunityListEntryArrayOutput {
		return v.Entries
	}).(PolicyObjectStandardCommunityListEntryArrayOutput)
}

// Feature Profile ID
func (o PolicyObjectStandardCommunityListOutput) FeatureProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *PolicyObjectStandardCommunityList) pulumi.StringOutput { return v.FeatureProfileId }).(pulumi.StringOutput)
}

// The name of the Policy_object
func (o PolicyObjectStandardCommunityListOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PolicyObjectStandardCommunityList) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The version of the Policy_object
func (o PolicyObjectStandardCommunityListOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *PolicyObjectStandardCommunityList) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type PolicyObjectStandardCommunityListArrayOutput struct{ *pulumi.OutputState }

func (PolicyObjectStandardCommunityListArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PolicyObjectStandardCommunityList)(nil)).Elem()
}

func (o PolicyObjectStandardCommunityListArrayOutput) ToPolicyObjectStandardCommunityListArrayOutput() PolicyObjectStandardCommunityListArrayOutput {
	return o
}

func (o PolicyObjectStandardCommunityListArrayOutput) ToPolicyObjectStandardCommunityListArrayOutputWithContext(ctx context.Context) PolicyObjectStandardCommunityListArrayOutput {
	return o
}

func (o PolicyObjectStandardCommunityListArrayOutput) Index(i pulumi.IntInput) PolicyObjectStandardCommunityListOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PolicyObjectStandardCommunityList {
		return vs[0].([]*PolicyObjectStandardCommunityList)[vs[1].(int)]
	}).(PolicyObjectStandardCommunityListOutput)
}

type PolicyObjectStandardCommunityListMapOutput struct{ *pulumi.OutputState }

func (PolicyObjectStandardCommunityListMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PolicyObjectStandardCommunityList)(nil)).Elem()
}

func (o PolicyObjectStandardCommunityListMapOutput) ToPolicyObjectStandardCommunityListMapOutput() PolicyObjectStandardCommunityListMapOutput {
	return o
}

func (o PolicyObjectStandardCommunityListMapOutput) ToPolicyObjectStandardCommunityListMapOutputWithContext(ctx context.Context) PolicyObjectStandardCommunityListMapOutput {
	return o
}

func (o PolicyObjectStandardCommunityListMapOutput) MapIndex(k pulumi.StringInput) PolicyObjectStandardCommunityListOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PolicyObjectStandardCommunityList {
		return vs[0].(map[string]*PolicyObjectStandardCommunityList)[vs[1].(string)]
	}).(PolicyObjectStandardCommunityListOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PolicyObjectStandardCommunityListInput)(nil)).Elem(), &PolicyObjectStandardCommunityList{})
	pulumi.RegisterInputType(reflect.TypeOf((*PolicyObjectStandardCommunityListArrayInput)(nil)).Elem(), PolicyObjectStandardCommunityListArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PolicyObjectStandardCommunityListMapInput)(nil)).Elem(), PolicyObjectStandardCommunityListMap{})
	pulumi.RegisterOutputType(PolicyObjectStandardCommunityListOutput{})
	pulumi.RegisterOutputType(PolicyObjectStandardCommunityListArrayOutput{})
	pulumi.RegisterOutputType(PolicyObjectStandardCommunityListMapOutput{})
}
