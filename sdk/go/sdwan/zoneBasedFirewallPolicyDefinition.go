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

// This resource can manage a Zone Based Firewall Policy Definition .
//
// ## Import
//
// The `pulumi import` command can be used, for example:
//
// ```sh
// $ pulumi import sdwan:index/zoneBasedFirewallPolicyDefinition:ZoneBasedFirewallPolicyDefinition example "f6b2c44c-693c-4763-b010-895aa3d236bd"
// ```
type ZoneBasedFirewallPolicyDefinition struct {
	pulumi.CustomResourceState

	// , Attribute conditional on `mode` being equal to `security`
	ApplyZonePairs ZoneBasedFirewallPolicyDefinitionApplyZonePairArrayOutput `pulumi:"applyZonePairs"`
	// Default Action - Choices: `pass`, `drop`
	DefaultAction pulumi.StringOutput `pulumi:"defaultAction"`
	// The description of the policy definition
	Description pulumi.StringOutput `pulumi:"description"`
	// The policy mode - Choices: `security`, `unified`
	Mode pulumi.StringOutput `pulumi:"mode"`
	// The name of the policy definition
	Name  pulumi.StringOutput                              `pulumi:"name"`
	Rules ZoneBasedFirewallPolicyDefinitionRuleArrayOutput `pulumi:"rules"`
	// The version of the object
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewZoneBasedFirewallPolicyDefinition registers a new resource with the given unique name, arguments, and options.
func NewZoneBasedFirewallPolicyDefinition(ctx *pulumi.Context,
	name string, args *ZoneBasedFirewallPolicyDefinitionArgs, opts ...pulumi.ResourceOption) (*ZoneBasedFirewallPolicyDefinition, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DefaultAction == nil {
		return nil, errors.New("invalid value for required argument 'DefaultAction'")
	}
	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.Mode == nil {
		return nil, errors.New("invalid value for required argument 'Mode'")
	}
	if args.Rules == nil {
		return nil, errors.New("invalid value for required argument 'Rules'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ZoneBasedFirewallPolicyDefinition
	err := ctx.RegisterResource("sdwan:index/zoneBasedFirewallPolicyDefinition:ZoneBasedFirewallPolicyDefinition", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetZoneBasedFirewallPolicyDefinition gets an existing ZoneBasedFirewallPolicyDefinition resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZoneBasedFirewallPolicyDefinition(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ZoneBasedFirewallPolicyDefinitionState, opts ...pulumi.ResourceOption) (*ZoneBasedFirewallPolicyDefinition, error) {
	var resource ZoneBasedFirewallPolicyDefinition
	err := ctx.ReadResource("sdwan:index/zoneBasedFirewallPolicyDefinition:ZoneBasedFirewallPolicyDefinition", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ZoneBasedFirewallPolicyDefinition resources.
type zoneBasedFirewallPolicyDefinitionState struct {
	// , Attribute conditional on `mode` being equal to `security`
	ApplyZonePairs []ZoneBasedFirewallPolicyDefinitionApplyZonePair `pulumi:"applyZonePairs"`
	// Default Action - Choices: `pass`, `drop`
	DefaultAction *string `pulumi:"defaultAction"`
	// The description of the policy definition
	Description *string `pulumi:"description"`
	// The policy mode - Choices: `security`, `unified`
	Mode *string `pulumi:"mode"`
	// The name of the policy definition
	Name  *string                                 `pulumi:"name"`
	Rules []ZoneBasedFirewallPolicyDefinitionRule `pulumi:"rules"`
	// The version of the object
	Version *int `pulumi:"version"`
}

type ZoneBasedFirewallPolicyDefinitionState struct {
	// , Attribute conditional on `mode` being equal to `security`
	ApplyZonePairs ZoneBasedFirewallPolicyDefinitionApplyZonePairArrayInput
	// Default Action - Choices: `pass`, `drop`
	DefaultAction pulumi.StringPtrInput
	// The description of the policy definition
	Description pulumi.StringPtrInput
	// The policy mode - Choices: `security`, `unified`
	Mode pulumi.StringPtrInput
	// The name of the policy definition
	Name  pulumi.StringPtrInput
	Rules ZoneBasedFirewallPolicyDefinitionRuleArrayInput
	// The version of the object
	Version pulumi.IntPtrInput
}

func (ZoneBasedFirewallPolicyDefinitionState) ElementType() reflect.Type {
	return reflect.TypeOf((*zoneBasedFirewallPolicyDefinitionState)(nil)).Elem()
}

type zoneBasedFirewallPolicyDefinitionArgs struct {
	// , Attribute conditional on `mode` being equal to `security`
	ApplyZonePairs []ZoneBasedFirewallPolicyDefinitionApplyZonePair `pulumi:"applyZonePairs"`
	// Default Action - Choices: `pass`, `drop`
	DefaultAction string `pulumi:"defaultAction"`
	// The description of the policy definition
	Description string `pulumi:"description"`
	// The policy mode - Choices: `security`, `unified`
	Mode string `pulumi:"mode"`
	// The name of the policy definition
	Name  *string                                 `pulumi:"name"`
	Rules []ZoneBasedFirewallPolicyDefinitionRule `pulumi:"rules"`
}

// The set of arguments for constructing a ZoneBasedFirewallPolicyDefinition resource.
type ZoneBasedFirewallPolicyDefinitionArgs struct {
	// , Attribute conditional on `mode` being equal to `security`
	ApplyZonePairs ZoneBasedFirewallPolicyDefinitionApplyZonePairArrayInput
	// Default Action - Choices: `pass`, `drop`
	DefaultAction pulumi.StringInput
	// The description of the policy definition
	Description pulumi.StringInput
	// The policy mode - Choices: `security`, `unified`
	Mode pulumi.StringInput
	// The name of the policy definition
	Name  pulumi.StringPtrInput
	Rules ZoneBasedFirewallPolicyDefinitionRuleArrayInput
}

func (ZoneBasedFirewallPolicyDefinitionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*zoneBasedFirewallPolicyDefinitionArgs)(nil)).Elem()
}

type ZoneBasedFirewallPolicyDefinitionInput interface {
	pulumi.Input

	ToZoneBasedFirewallPolicyDefinitionOutput() ZoneBasedFirewallPolicyDefinitionOutput
	ToZoneBasedFirewallPolicyDefinitionOutputWithContext(ctx context.Context) ZoneBasedFirewallPolicyDefinitionOutput
}

func (*ZoneBasedFirewallPolicyDefinition) ElementType() reflect.Type {
	return reflect.TypeOf((**ZoneBasedFirewallPolicyDefinition)(nil)).Elem()
}

func (i *ZoneBasedFirewallPolicyDefinition) ToZoneBasedFirewallPolicyDefinitionOutput() ZoneBasedFirewallPolicyDefinitionOutput {
	return i.ToZoneBasedFirewallPolicyDefinitionOutputWithContext(context.Background())
}

func (i *ZoneBasedFirewallPolicyDefinition) ToZoneBasedFirewallPolicyDefinitionOutputWithContext(ctx context.Context) ZoneBasedFirewallPolicyDefinitionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneBasedFirewallPolicyDefinitionOutput)
}

// ZoneBasedFirewallPolicyDefinitionArrayInput is an input type that accepts ZoneBasedFirewallPolicyDefinitionArray and ZoneBasedFirewallPolicyDefinitionArrayOutput values.
// You can construct a concrete instance of `ZoneBasedFirewallPolicyDefinitionArrayInput` via:
//
//	ZoneBasedFirewallPolicyDefinitionArray{ ZoneBasedFirewallPolicyDefinitionArgs{...} }
type ZoneBasedFirewallPolicyDefinitionArrayInput interface {
	pulumi.Input

	ToZoneBasedFirewallPolicyDefinitionArrayOutput() ZoneBasedFirewallPolicyDefinitionArrayOutput
	ToZoneBasedFirewallPolicyDefinitionArrayOutputWithContext(context.Context) ZoneBasedFirewallPolicyDefinitionArrayOutput
}

type ZoneBasedFirewallPolicyDefinitionArray []ZoneBasedFirewallPolicyDefinitionInput

func (ZoneBasedFirewallPolicyDefinitionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZoneBasedFirewallPolicyDefinition)(nil)).Elem()
}

func (i ZoneBasedFirewallPolicyDefinitionArray) ToZoneBasedFirewallPolicyDefinitionArrayOutput() ZoneBasedFirewallPolicyDefinitionArrayOutput {
	return i.ToZoneBasedFirewallPolicyDefinitionArrayOutputWithContext(context.Background())
}

func (i ZoneBasedFirewallPolicyDefinitionArray) ToZoneBasedFirewallPolicyDefinitionArrayOutputWithContext(ctx context.Context) ZoneBasedFirewallPolicyDefinitionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneBasedFirewallPolicyDefinitionArrayOutput)
}

// ZoneBasedFirewallPolicyDefinitionMapInput is an input type that accepts ZoneBasedFirewallPolicyDefinitionMap and ZoneBasedFirewallPolicyDefinitionMapOutput values.
// You can construct a concrete instance of `ZoneBasedFirewallPolicyDefinitionMapInput` via:
//
//	ZoneBasedFirewallPolicyDefinitionMap{ "key": ZoneBasedFirewallPolicyDefinitionArgs{...} }
type ZoneBasedFirewallPolicyDefinitionMapInput interface {
	pulumi.Input

	ToZoneBasedFirewallPolicyDefinitionMapOutput() ZoneBasedFirewallPolicyDefinitionMapOutput
	ToZoneBasedFirewallPolicyDefinitionMapOutputWithContext(context.Context) ZoneBasedFirewallPolicyDefinitionMapOutput
}

type ZoneBasedFirewallPolicyDefinitionMap map[string]ZoneBasedFirewallPolicyDefinitionInput

func (ZoneBasedFirewallPolicyDefinitionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZoneBasedFirewallPolicyDefinition)(nil)).Elem()
}

func (i ZoneBasedFirewallPolicyDefinitionMap) ToZoneBasedFirewallPolicyDefinitionMapOutput() ZoneBasedFirewallPolicyDefinitionMapOutput {
	return i.ToZoneBasedFirewallPolicyDefinitionMapOutputWithContext(context.Background())
}

func (i ZoneBasedFirewallPolicyDefinitionMap) ToZoneBasedFirewallPolicyDefinitionMapOutputWithContext(ctx context.Context) ZoneBasedFirewallPolicyDefinitionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneBasedFirewallPolicyDefinitionMapOutput)
}

type ZoneBasedFirewallPolicyDefinitionOutput struct{ *pulumi.OutputState }

func (ZoneBasedFirewallPolicyDefinitionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ZoneBasedFirewallPolicyDefinition)(nil)).Elem()
}

func (o ZoneBasedFirewallPolicyDefinitionOutput) ToZoneBasedFirewallPolicyDefinitionOutput() ZoneBasedFirewallPolicyDefinitionOutput {
	return o
}

func (o ZoneBasedFirewallPolicyDefinitionOutput) ToZoneBasedFirewallPolicyDefinitionOutputWithContext(ctx context.Context) ZoneBasedFirewallPolicyDefinitionOutput {
	return o
}

// , Attribute conditional on `mode` being equal to `security`
func (o ZoneBasedFirewallPolicyDefinitionOutput) ApplyZonePairs() ZoneBasedFirewallPolicyDefinitionApplyZonePairArrayOutput {
	return o.ApplyT(func(v *ZoneBasedFirewallPolicyDefinition) ZoneBasedFirewallPolicyDefinitionApplyZonePairArrayOutput {
		return v.ApplyZonePairs
	}).(ZoneBasedFirewallPolicyDefinitionApplyZonePairArrayOutput)
}

// Default Action - Choices: `pass`, `drop`
func (o ZoneBasedFirewallPolicyDefinitionOutput) DefaultAction() pulumi.StringOutput {
	return o.ApplyT(func(v *ZoneBasedFirewallPolicyDefinition) pulumi.StringOutput { return v.DefaultAction }).(pulumi.StringOutput)
}

// The description of the policy definition
func (o ZoneBasedFirewallPolicyDefinitionOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *ZoneBasedFirewallPolicyDefinition) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The policy mode - Choices: `security`, `unified`
func (o ZoneBasedFirewallPolicyDefinitionOutput) Mode() pulumi.StringOutput {
	return o.ApplyT(func(v *ZoneBasedFirewallPolicyDefinition) pulumi.StringOutput { return v.Mode }).(pulumi.StringOutput)
}

// The name of the policy definition
func (o ZoneBasedFirewallPolicyDefinitionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ZoneBasedFirewallPolicyDefinition) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o ZoneBasedFirewallPolicyDefinitionOutput) Rules() ZoneBasedFirewallPolicyDefinitionRuleArrayOutput {
	return o.ApplyT(func(v *ZoneBasedFirewallPolicyDefinition) ZoneBasedFirewallPolicyDefinitionRuleArrayOutput {
		return v.Rules
	}).(ZoneBasedFirewallPolicyDefinitionRuleArrayOutput)
}

// The version of the object
func (o ZoneBasedFirewallPolicyDefinitionOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *ZoneBasedFirewallPolicyDefinition) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type ZoneBasedFirewallPolicyDefinitionArrayOutput struct{ *pulumi.OutputState }

func (ZoneBasedFirewallPolicyDefinitionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZoneBasedFirewallPolicyDefinition)(nil)).Elem()
}

func (o ZoneBasedFirewallPolicyDefinitionArrayOutput) ToZoneBasedFirewallPolicyDefinitionArrayOutput() ZoneBasedFirewallPolicyDefinitionArrayOutput {
	return o
}

func (o ZoneBasedFirewallPolicyDefinitionArrayOutput) ToZoneBasedFirewallPolicyDefinitionArrayOutputWithContext(ctx context.Context) ZoneBasedFirewallPolicyDefinitionArrayOutput {
	return o
}

func (o ZoneBasedFirewallPolicyDefinitionArrayOutput) Index(i pulumi.IntInput) ZoneBasedFirewallPolicyDefinitionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ZoneBasedFirewallPolicyDefinition {
		return vs[0].([]*ZoneBasedFirewallPolicyDefinition)[vs[1].(int)]
	}).(ZoneBasedFirewallPolicyDefinitionOutput)
}

type ZoneBasedFirewallPolicyDefinitionMapOutput struct{ *pulumi.OutputState }

func (ZoneBasedFirewallPolicyDefinitionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZoneBasedFirewallPolicyDefinition)(nil)).Elem()
}

func (o ZoneBasedFirewallPolicyDefinitionMapOutput) ToZoneBasedFirewallPolicyDefinitionMapOutput() ZoneBasedFirewallPolicyDefinitionMapOutput {
	return o
}

func (o ZoneBasedFirewallPolicyDefinitionMapOutput) ToZoneBasedFirewallPolicyDefinitionMapOutputWithContext(ctx context.Context) ZoneBasedFirewallPolicyDefinitionMapOutput {
	return o
}

func (o ZoneBasedFirewallPolicyDefinitionMapOutput) MapIndex(k pulumi.StringInput) ZoneBasedFirewallPolicyDefinitionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ZoneBasedFirewallPolicyDefinition {
		return vs[0].(map[string]*ZoneBasedFirewallPolicyDefinition)[vs[1].(string)]
	}).(ZoneBasedFirewallPolicyDefinitionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneBasedFirewallPolicyDefinitionInput)(nil)).Elem(), &ZoneBasedFirewallPolicyDefinition{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneBasedFirewallPolicyDefinitionArrayInput)(nil)).Elem(), ZoneBasedFirewallPolicyDefinitionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneBasedFirewallPolicyDefinitionMapInput)(nil)).Elem(), ZoneBasedFirewallPolicyDefinitionMap{})
	pulumi.RegisterOutputType(ZoneBasedFirewallPolicyDefinitionOutput{})
	pulumi.RegisterOutputType(ZoneBasedFirewallPolicyDefinitionArrayOutput{})
	pulumi.RegisterOutputType(ZoneBasedFirewallPolicyDefinitionMapOutput{})
}
