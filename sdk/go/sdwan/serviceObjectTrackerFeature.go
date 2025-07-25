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

// This resource can manage a Service Object Tracker Feature.
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
//			_, err := sdwan.NewServiceObjectTrackerFeature(ctx, "example", &sdwan.ServiceObjectTrackerFeatureArgs{
//				Name:              pulumi.String("Example"),
//				Description:       pulumi.String("My Example"),
//				FeatureProfileId:  pulumi.String("f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"),
//				ObjectTrackerId:   pulumi.Int(10),
//				ObjectTrackerType: pulumi.String("Interface"),
//				Interface:         pulumi.String("GigabitEthernet1"),
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
// Expected import identifier with the format: "service_object_tracker_feature_id,feature_profile_id"
//
// ```sh
// $ pulumi import sdwan:index/serviceObjectTrackerFeature:ServiceObjectTrackerFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"
// ```
type ServiceObjectTrackerFeature struct {
	pulumi.CustomResourceState

	// The description of the Feature
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Feature Profile ID
	FeatureProfileId pulumi.StringOutput `pulumi:"featureProfileId"`
	// interface name
	Interface pulumi.StringPtrOutput `pulumi:"interface"`
	// Variable name
	InterfaceVariable pulumi.StringPtrOutput `pulumi:"interfaceVariable"`
	// The name of the Feature
	Name pulumi.StringOutput `pulumi:"name"`
	// Object tracker ID - Range: `1`-`1000`
	ObjectTrackerId pulumi.IntPtrOutput `pulumi:"objectTrackerId"`
	// Variable name
	ObjectTrackerIdVariable pulumi.StringPtrOutput `pulumi:"objectTrackerIdVariable"`
	// objectTrackerType:Interface SIG Route - Choices: `Interface`, `SIG`, `Route`
	ObjectTrackerType pulumi.StringOutput `pulumi:"objectTrackerType"`
	// IP address
	RouteIp pulumi.StringPtrOutput `pulumi:"routeIp"`
	// Variable name
	RouteIpVariable pulumi.StringPtrOutput `pulumi:"routeIpVariable"`
	// IP mask - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
	// `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`,
	// `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`,
	// `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`,
	// `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0` - Default value: `0.0.0.0`
	RouteMask pulumi.StringPtrOutput `pulumi:"routeMask"`
	// Variable name
	RouteMaskVariable pulumi.StringPtrOutput `pulumi:"routeMaskVariable"`
	// The version of the Feature
	Version pulumi.IntOutput `pulumi:"version"`
	// VPN - Range: `0`-`65530`
	Vpn pulumi.IntPtrOutput `pulumi:"vpn"`
	// Variable name
	VpnVariable pulumi.StringPtrOutput `pulumi:"vpnVariable"`
}

// NewServiceObjectTrackerFeature registers a new resource with the given unique name, arguments, and options.
func NewServiceObjectTrackerFeature(ctx *pulumi.Context,
	name string, args *ServiceObjectTrackerFeatureArgs, opts ...pulumi.ResourceOption) (*ServiceObjectTrackerFeature, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FeatureProfileId == nil {
		return nil, errors.New("invalid value for required argument 'FeatureProfileId'")
	}
	if args.ObjectTrackerType == nil {
		return nil, errors.New("invalid value for required argument 'ObjectTrackerType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServiceObjectTrackerFeature
	err := ctx.RegisterResource("sdwan:index/serviceObjectTrackerFeature:ServiceObjectTrackerFeature", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceObjectTrackerFeature gets an existing ServiceObjectTrackerFeature resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceObjectTrackerFeature(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceObjectTrackerFeatureState, opts ...pulumi.ResourceOption) (*ServiceObjectTrackerFeature, error) {
	var resource ServiceObjectTrackerFeature
	err := ctx.ReadResource("sdwan:index/serviceObjectTrackerFeature:ServiceObjectTrackerFeature", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceObjectTrackerFeature resources.
type serviceObjectTrackerFeatureState struct {
	// The description of the Feature
	Description *string `pulumi:"description"`
	// Feature Profile ID
	FeatureProfileId *string `pulumi:"featureProfileId"`
	// interface name
	Interface *string `pulumi:"interface"`
	// Variable name
	InterfaceVariable *string `pulumi:"interfaceVariable"`
	// The name of the Feature
	Name *string `pulumi:"name"`
	// Object tracker ID - Range: `1`-`1000`
	ObjectTrackerId *int `pulumi:"objectTrackerId"`
	// Variable name
	ObjectTrackerIdVariable *string `pulumi:"objectTrackerIdVariable"`
	// objectTrackerType:Interface SIG Route - Choices: `Interface`, `SIG`, `Route`
	ObjectTrackerType *string `pulumi:"objectTrackerType"`
	// IP address
	RouteIp *string `pulumi:"routeIp"`
	// Variable name
	RouteIpVariable *string `pulumi:"routeIpVariable"`
	// IP mask - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
	// `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`,
	// `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`,
	// `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`,
	// `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0` - Default value: `0.0.0.0`
	RouteMask *string `pulumi:"routeMask"`
	// Variable name
	RouteMaskVariable *string `pulumi:"routeMaskVariable"`
	// The version of the Feature
	Version *int `pulumi:"version"`
	// VPN - Range: `0`-`65530`
	Vpn *int `pulumi:"vpn"`
	// Variable name
	VpnVariable *string `pulumi:"vpnVariable"`
}

type ServiceObjectTrackerFeatureState struct {
	// The description of the Feature
	Description pulumi.StringPtrInput
	// Feature Profile ID
	FeatureProfileId pulumi.StringPtrInput
	// interface name
	Interface pulumi.StringPtrInput
	// Variable name
	InterfaceVariable pulumi.StringPtrInput
	// The name of the Feature
	Name pulumi.StringPtrInput
	// Object tracker ID - Range: `1`-`1000`
	ObjectTrackerId pulumi.IntPtrInput
	// Variable name
	ObjectTrackerIdVariable pulumi.StringPtrInput
	// objectTrackerType:Interface SIG Route - Choices: `Interface`, `SIG`, `Route`
	ObjectTrackerType pulumi.StringPtrInput
	// IP address
	RouteIp pulumi.StringPtrInput
	// Variable name
	RouteIpVariable pulumi.StringPtrInput
	// IP mask - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
	// `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`,
	// `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`,
	// `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`,
	// `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0` - Default value: `0.0.0.0`
	RouteMask pulumi.StringPtrInput
	// Variable name
	RouteMaskVariable pulumi.StringPtrInput
	// The version of the Feature
	Version pulumi.IntPtrInput
	// VPN - Range: `0`-`65530`
	Vpn pulumi.IntPtrInput
	// Variable name
	VpnVariable pulumi.StringPtrInput
}

func (ServiceObjectTrackerFeatureState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceObjectTrackerFeatureState)(nil)).Elem()
}

type serviceObjectTrackerFeatureArgs struct {
	// The description of the Feature
	Description *string `pulumi:"description"`
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// interface name
	Interface *string `pulumi:"interface"`
	// Variable name
	InterfaceVariable *string `pulumi:"interfaceVariable"`
	// The name of the Feature
	Name *string `pulumi:"name"`
	// Object tracker ID - Range: `1`-`1000`
	ObjectTrackerId *int `pulumi:"objectTrackerId"`
	// Variable name
	ObjectTrackerIdVariable *string `pulumi:"objectTrackerIdVariable"`
	// objectTrackerType:Interface SIG Route - Choices: `Interface`, `SIG`, `Route`
	ObjectTrackerType string `pulumi:"objectTrackerType"`
	// IP address
	RouteIp *string `pulumi:"routeIp"`
	// Variable name
	RouteIpVariable *string `pulumi:"routeIpVariable"`
	// IP mask - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
	// `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`,
	// `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`,
	// `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`,
	// `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0` - Default value: `0.0.0.0`
	RouteMask *string `pulumi:"routeMask"`
	// Variable name
	RouteMaskVariable *string `pulumi:"routeMaskVariable"`
	// VPN - Range: `0`-`65530`
	Vpn *int `pulumi:"vpn"`
	// Variable name
	VpnVariable *string `pulumi:"vpnVariable"`
}

// The set of arguments for constructing a ServiceObjectTrackerFeature resource.
type ServiceObjectTrackerFeatureArgs struct {
	// The description of the Feature
	Description pulumi.StringPtrInput
	// Feature Profile ID
	FeatureProfileId pulumi.StringInput
	// interface name
	Interface pulumi.StringPtrInput
	// Variable name
	InterfaceVariable pulumi.StringPtrInput
	// The name of the Feature
	Name pulumi.StringPtrInput
	// Object tracker ID - Range: `1`-`1000`
	ObjectTrackerId pulumi.IntPtrInput
	// Variable name
	ObjectTrackerIdVariable pulumi.StringPtrInput
	// objectTrackerType:Interface SIG Route - Choices: `Interface`, `SIG`, `Route`
	ObjectTrackerType pulumi.StringInput
	// IP address
	RouteIp pulumi.StringPtrInput
	// Variable name
	RouteIpVariable pulumi.StringPtrInput
	// IP mask - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
	// `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`,
	// `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`,
	// `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`,
	// `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0` - Default value: `0.0.0.0`
	RouteMask pulumi.StringPtrInput
	// Variable name
	RouteMaskVariable pulumi.StringPtrInput
	// VPN - Range: `0`-`65530`
	Vpn pulumi.IntPtrInput
	// Variable name
	VpnVariable pulumi.StringPtrInput
}

func (ServiceObjectTrackerFeatureArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceObjectTrackerFeatureArgs)(nil)).Elem()
}

type ServiceObjectTrackerFeatureInput interface {
	pulumi.Input

	ToServiceObjectTrackerFeatureOutput() ServiceObjectTrackerFeatureOutput
	ToServiceObjectTrackerFeatureOutputWithContext(ctx context.Context) ServiceObjectTrackerFeatureOutput
}

func (*ServiceObjectTrackerFeature) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceObjectTrackerFeature)(nil)).Elem()
}

func (i *ServiceObjectTrackerFeature) ToServiceObjectTrackerFeatureOutput() ServiceObjectTrackerFeatureOutput {
	return i.ToServiceObjectTrackerFeatureOutputWithContext(context.Background())
}

func (i *ServiceObjectTrackerFeature) ToServiceObjectTrackerFeatureOutputWithContext(ctx context.Context) ServiceObjectTrackerFeatureOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceObjectTrackerFeatureOutput)
}

// ServiceObjectTrackerFeatureArrayInput is an input type that accepts ServiceObjectTrackerFeatureArray and ServiceObjectTrackerFeatureArrayOutput values.
// You can construct a concrete instance of `ServiceObjectTrackerFeatureArrayInput` via:
//
//	ServiceObjectTrackerFeatureArray{ ServiceObjectTrackerFeatureArgs{...} }
type ServiceObjectTrackerFeatureArrayInput interface {
	pulumi.Input

	ToServiceObjectTrackerFeatureArrayOutput() ServiceObjectTrackerFeatureArrayOutput
	ToServiceObjectTrackerFeatureArrayOutputWithContext(context.Context) ServiceObjectTrackerFeatureArrayOutput
}

type ServiceObjectTrackerFeatureArray []ServiceObjectTrackerFeatureInput

func (ServiceObjectTrackerFeatureArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceObjectTrackerFeature)(nil)).Elem()
}

func (i ServiceObjectTrackerFeatureArray) ToServiceObjectTrackerFeatureArrayOutput() ServiceObjectTrackerFeatureArrayOutput {
	return i.ToServiceObjectTrackerFeatureArrayOutputWithContext(context.Background())
}

func (i ServiceObjectTrackerFeatureArray) ToServiceObjectTrackerFeatureArrayOutputWithContext(ctx context.Context) ServiceObjectTrackerFeatureArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceObjectTrackerFeatureArrayOutput)
}

// ServiceObjectTrackerFeatureMapInput is an input type that accepts ServiceObjectTrackerFeatureMap and ServiceObjectTrackerFeatureMapOutput values.
// You can construct a concrete instance of `ServiceObjectTrackerFeatureMapInput` via:
//
//	ServiceObjectTrackerFeatureMap{ "key": ServiceObjectTrackerFeatureArgs{...} }
type ServiceObjectTrackerFeatureMapInput interface {
	pulumi.Input

	ToServiceObjectTrackerFeatureMapOutput() ServiceObjectTrackerFeatureMapOutput
	ToServiceObjectTrackerFeatureMapOutputWithContext(context.Context) ServiceObjectTrackerFeatureMapOutput
}

type ServiceObjectTrackerFeatureMap map[string]ServiceObjectTrackerFeatureInput

func (ServiceObjectTrackerFeatureMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceObjectTrackerFeature)(nil)).Elem()
}

func (i ServiceObjectTrackerFeatureMap) ToServiceObjectTrackerFeatureMapOutput() ServiceObjectTrackerFeatureMapOutput {
	return i.ToServiceObjectTrackerFeatureMapOutputWithContext(context.Background())
}

func (i ServiceObjectTrackerFeatureMap) ToServiceObjectTrackerFeatureMapOutputWithContext(ctx context.Context) ServiceObjectTrackerFeatureMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceObjectTrackerFeatureMapOutput)
}

type ServiceObjectTrackerFeatureOutput struct{ *pulumi.OutputState }

func (ServiceObjectTrackerFeatureOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceObjectTrackerFeature)(nil)).Elem()
}

func (o ServiceObjectTrackerFeatureOutput) ToServiceObjectTrackerFeatureOutput() ServiceObjectTrackerFeatureOutput {
	return o
}

func (o ServiceObjectTrackerFeatureOutput) ToServiceObjectTrackerFeatureOutputWithContext(ctx context.Context) ServiceObjectTrackerFeatureOutput {
	return o
}

// The description of the Feature
func (o ServiceObjectTrackerFeatureOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceObjectTrackerFeature) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Feature Profile ID
func (o ServiceObjectTrackerFeatureOutput) FeatureProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceObjectTrackerFeature) pulumi.StringOutput { return v.FeatureProfileId }).(pulumi.StringOutput)
}

// interface name
func (o ServiceObjectTrackerFeatureOutput) Interface() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceObjectTrackerFeature) pulumi.StringPtrOutput { return v.Interface }).(pulumi.StringPtrOutput)
}

// Variable name
func (o ServiceObjectTrackerFeatureOutput) InterfaceVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceObjectTrackerFeature) pulumi.StringPtrOutput { return v.InterfaceVariable }).(pulumi.StringPtrOutput)
}

// The name of the Feature
func (o ServiceObjectTrackerFeatureOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceObjectTrackerFeature) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Object tracker ID - Range: `1`-`1000`
func (o ServiceObjectTrackerFeatureOutput) ObjectTrackerId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ServiceObjectTrackerFeature) pulumi.IntPtrOutput { return v.ObjectTrackerId }).(pulumi.IntPtrOutput)
}

// Variable name
func (o ServiceObjectTrackerFeatureOutput) ObjectTrackerIdVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceObjectTrackerFeature) pulumi.StringPtrOutput { return v.ObjectTrackerIdVariable }).(pulumi.StringPtrOutput)
}

// objectTrackerType:Interface SIG Route - Choices: `Interface`, `SIG`, `Route`
func (o ServiceObjectTrackerFeatureOutput) ObjectTrackerType() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceObjectTrackerFeature) pulumi.StringOutput { return v.ObjectTrackerType }).(pulumi.StringOutput)
}

// IP address
func (o ServiceObjectTrackerFeatureOutput) RouteIp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceObjectTrackerFeature) pulumi.StringPtrOutput { return v.RouteIp }).(pulumi.StringPtrOutput)
}

// Variable name
func (o ServiceObjectTrackerFeatureOutput) RouteIpVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceObjectTrackerFeature) pulumi.StringPtrOutput { return v.RouteIpVariable }).(pulumi.StringPtrOutput)
}

// IP mask - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
// `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`,
// `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`,
// `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`,
// `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0` - Default value: `0.0.0.0`
func (o ServiceObjectTrackerFeatureOutput) RouteMask() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceObjectTrackerFeature) pulumi.StringPtrOutput { return v.RouteMask }).(pulumi.StringPtrOutput)
}

// Variable name
func (o ServiceObjectTrackerFeatureOutput) RouteMaskVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceObjectTrackerFeature) pulumi.StringPtrOutput { return v.RouteMaskVariable }).(pulumi.StringPtrOutput)
}

// The version of the Feature
func (o ServiceObjectTrackerFeatureOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *ServiceObjectTrackerFeature) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

// VPN - Range: `0`-`65530`
func (o ServiceObjectTrackerFeatureOutput) Vpn() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ServiceObjectTrackerFeature) pulumi.IntPtrOutput { return v.Vpn }).(pulumi.IntPtrOutput)
}

// Variable name
func (o ServiceObjectTrackerFeatureOutput) VpnVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceObjectTrackerFeature) pulumi.StringPtrOutput { return v.VpnVariable }).(pulumi.StringPtrOutput)
}

type ServiceObjectTrackerFeatureArrayOutput struct{ *pulumi.OutputState }

func (ServiceObjectTrackerFeatureArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceObjectTrackerFeature)(nil)).Elem()
}

func (o ServiceObjectTrackerFeatureArrayOutput) ToServiceObjectTrackerFeatureArrayOutput() ServiceObjectTrackerFeatureArrayOutput {
	return o
}

func (o ServiceObjectTrackerFeatureArrayOutput) ToServiceObjectTrackerFeatureArrayOutputWithContext(ctx context.Context) ServiceObjectTrackerFeatureArrayOutput {
	return o
}

func (o ServiceObjectTrackerFeatureArrayOutput) Index(i pulumi.IntInput) ServiceObjectTrackerFeatureOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceObjectTrackerFeature {
		return vs[0].([]*ServiceObjectTrackerFeature)[vs[1].(int)]
	}).(ServiceObjectTrackerFeatureOutput)
}

type ServiceObjectTrackerFeatureMapOutput struct{ *pulumi.OutputState }

func (ServiceObjectTrackerFeatureMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceObjectTrackerFeature)(nil)).Elem()
}

func (o ServiceObjectTrackerFeatureMapOutput) ToServiceObjectTrackerFeatureMapOutput() ServiceObjectTrackerFeatureMapOutput {
	return o
}

func (o ServiceObjectTrackerFeatureMapOutput) ToServiceObjectTrackerFeatureMapOutputWithContext(ctx context.Context) ServiceObjectTrackerFeatureMapOutput {
	return o
}

func (o ServiceObjectTrackerFeatureMapOutput) MapIndex(k pulumi.StringInput) ServiceObjectTrackerFeatureOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceObjectTrackerFeature {
		return vs[0].(map[string]*ServiceObjectTrackerFeature)[vs[1].(string)]
	}).(ServiceObjectTrackerFeatureOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceObjectTrackerFeatureInput)(nil)).Elem(), &ServiceObjectTrackerFeature{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceObjectTrackerFeatureArrayInput)(nil)).Elem(), ServiceObjectTrackerFeatureArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceObjectTrackerFeatureMapInput)(nil)).Elem(), ServiceObjectTrackerFeatureMap{})
	pulumi.RegisterOutputType(ServiceObjectTrackerFeatureOutput{})
	pulumi.RegisterOutputType(ServiceObjectTrackerFeatureArrayOutput{})
	pulumi.RegisterOutputType(ServiceObjectTrackerFeatureMapOutput{})
}
