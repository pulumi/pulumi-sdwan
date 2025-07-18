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

// This resource can manage a Service LAN VPN Feature Associate Multicast Feature .
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
//			_, err := sdwan.NewServiceLanVpnFeatureAssociateMulticastFeature(ctx, "example", &sdwan.ServiceLanVpnFeatureAssociateMulticastFeatureArgs{
//				FeatureProfileId:          pulumi.String("f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"),
//				ServiceLanVpnFeatureId:    pulumi.String("140331f6-5418-4755-a059-13c77eb96037"),
//				ServiceMulticastFeatureId: pulumi.String("140331f6-5418-4755-a059-13c77eb96037"),
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
// Expected import identifier with the format: "service_lan_vpn_feature_associate_multicast_feature_id,feature_profile_id,service_lan_vpn_feature_id"
//
// ```sh
// $ pulumi import sdwan:index/serviceLanVpnFeatureAssociateMulticastFeature:ServiceLanVpnFeatureAssociateMulticastFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac,140331f6-5418-4755-a059-13c77eb96037"
// ```
type ServiceLanVpnFeatureAssociateMulticastFeature struct {
	pulumi.CustomResourceState

	// Feature Profile ID
	FeatureProfileId pulumi.StringOutput `pulumi:"featureProfileId"`
	// Service LAN VPN Feature ID
	ServiceLanVpnFeatureId pulumi.StringOutput `pulumi:"serviceLanVpnFeatureId"`
	// Service Multicast Feature ID
	ServiceMulticastFeatureId pulumi.StringOutput `pulumi:"serviceMulticastFeatureId"`
	// The version of the object
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewServiceLanVpnFeatureAssociateMulticastFeature registers a new resource with the given unique name, arguments, and options.
func NewServiceLanVpnFeatureAssociateMulticastFeature(ctx *pulumi.Context,
	name string, args *ServiceLanVpnFeatureAssociateMulticastFeatureArgs, opts ...pulumi.ResourceOption) (*ServiceLanVpnFeatureAssociateMulticastFeature, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FeatureProfileId == nil {
		return nil, errors.New("invalid value for required argument 'FeatureProfileId'")
	}
	if args.ServiceLanVpnFeatureId == nil {
		return nil, errors.New("invalid value for required argument 'ServiceLanVpnFeatureId'")
	}
	if args.ServiceMulticastFeatureId == nil {
		return nil, errors.New("invalid value for required argument 'ServiceMulticastFeatureId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServiceLanVpnFeatureAssociateMulticastFeature
	err := ctx.RegisterResource("sdwan:index/serviceLanVpnFeatureAssociateMulticastFeature:ServiceLanVpnFeatureAssociateMulticastFeature", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceLanVpnFeatureAssociateMulticastFeature gets an existing ServiceLanVpnFeatureAssociateMulticastFeature resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceLanVpnFeatureAssociateMulticastFeature(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceLanVpnFeatureAssociateMulticastFeatureState, opts ...pulumi.ResourceOption) (*ServiceLanVpnFeatureAssociateMulticastFeature, error) {
	var resource ServiceLanVpnFeatureAssociateMulticastFeature
	err := ctx.ReadResource("sdwan:index/serviceLanVpnFeatureAssociateMulticastFeature:ServiceLanVpnFeatureAssociateMulticastFeature", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceLanVpnFeatureAssociateMulticastFeature resources.
type serviceLanVpnFeatureAssociateMulticastFeatureState struct {
	// Feature Profile ID
	FeatureProfileId *string `pulumi:"featureProfileId"`
	// Service LAN VPN Feature ID
	ServiceLanVpnFeatureId *string `pulumi:"serviceLanVpnFeatureId"`
	// Service Multicast Feature ID
	ServiceMulticastFeatureId *string `pulumi:"serviceMulticastFeatureId"`
	// The version of the object
	Version *int `pulumi:"version"`
}

type ServiceLanVpnFeatureAssociateMulticastFeatureState struct {
	// Feature Profile ID
	FeatureProfileId pulumi.StringPtrInput
	// Service LAN VPN Feature ID
	ServiceLanVpnFeatureId pulumi.StringPtrInput
	// Service Multicast Feature ID
	ServiceMulticastFeatureId pulumi.StringPtrInput
	// The version of the object
	Version pulumi.IntPtrInput
}

func (ServiceLanVpnFeatureAssociateMulticastFeatureState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceLanVpnFeatureAssociateMulticastFeatureState)(nil)).Elem()
}

type serviceLanVpnFeatureAssociateMulticastFeatureArgs struct {
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// Service LAN VPN Feature ID
	ServiceLanVpnFeatureId string `pulumi:"serviceLanVpnFeatureId"`
	// Service Multicast Feature ID
	ServiceMulticastFeatureId string `pulumi:"serviceMulticastFeatureId"`
}

// The set of arguments for constructing a ServiceLanVpnFeatureAssociateMulticastFeature resource.
type ServiceLanVpnFeatureAssociateMulticastFeatureArgs struct {
	// Feature Profile ID
	FeatureProfileId pulumi.StringInput
	// Service LAN VPN Feature ID
	ServiceLanVpnFeatureId pulumi.StringInput
	// Service Multicast Feature ID
	ServiceMulticastFeatureId pulumi.StringInput
}

func (ServiceLanVpnFeatureAssociateMulticastFeatureArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceLanVpnFeatureAssociateMulticastFeatureArgs)(nil)).Elem()
}

type ServiceLanVpnFeatureAssociateMulticastFeatureInput interface {
	pulumi.Input

	ToServiceLanVpnFeatureAssociateMulticastFeatureOutput() ServiceLanVpnFeatureAssociateMulticastFeatureOutput
	ToServiceLanVpnFeatureAssociateMulticastFeatureOutputWithContext(ctx context.Context) ServiceLanVpnFeatureAssociateMulticastFeatureOutput
}

func (*ServiceLanVpnFeatureAssociateMulticastFeature) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceLanVpnFeatureAssociateMulticastFeature)(nil)).Elem()
}

func (i *ServiceLanVpnFeatureAssociateMulticastFeature) ToServiceLanVpnFeatureAssociateMulticastFeatureOutput() ServiceLanVpnFeatureAssociateMulticastFeatureOutput {
	return i.ToServiceLanVpnFeatureAssociateMulticastFeatureOutputWithContext(context.Background())
}

func (i *ServiceLanVpnFeatureAssociateMulticastFeature) ToServiceLanVpnFeatureAssociateMulticastFeatureOutputWithContext(ctx context.Context) ServiceLanVpnFeatureAssociateMulticastFeatureOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceLanVpnFeatureAssociateMulticastFeatureOutput)
}

// ServiceLanVpnFeatureAssociateMulticastFeatureArrayInput is an input type that accepts ServiceLanVpnFeatureAssociateMulticastFeatureArray and ServiceLanVpnFeatureAssociateMulticastFeatureArrayOutput values.
// You can construct a concrete instance of `ServiceLanVpnFeatureAssociateMulticastFeatureArrayInput` via:
//
//	ServiceLanVpnFeatureAssociateMulticastFeatureArray{ ServiceLanVpnFeatureAssociateMulticastFeatureArgs{...} }
type ServiceLanVpnFeatureAssociateMulticastFeatureArrayInput interface {
	pulumi.Input

	ToServiceLanVpnFeatureAssociateMulticastFeatureArrayOutput() ServiceLanVpnFeatureAssociateMulticastFeatureArrayOutput
	ToServiceLanVpnFeatureAssociateMulticastFeatureArrayOutputWithContext(context.Context) ServiceLanVpnFeatureAssociateMulticastFeatureArrayOutput
}

type ServiceLanVpnFeatureAssociateMulticastFeatureArray []ServiceLanVpnFeatureAssociateMulticastFeatureInput

func (ServiceLanVpnFeatureAssociateMulticastFeatureArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceLanVpnFeatureAssociateMulticastFeature)(nil)).Elem()
}

func (i ServiceLanVpnFeatureAssociateMulticastFeatureArray) ToServiceLanVpnFeatureAssociateMulticastFeatureArrayOutput() ServiceLanVpnFeatureAssociateMulticastFeatureArrayOutput {
	return i.ToServiceLanVpnFeatureAssociateMulticastFeatureArrayOutputWithContext(context.Background())
}

func (i ServiceLanVpnFeatureAssociateMulticastFeatureArray) ToServiceLanVpnFeatureAssociateMulticastFeatureArrayOutputWithContext(ctx context.Context) ServiceLanVpnFeatureAssociateMulticastFeatureArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceLanVpnFeatureAssociateMulticastFeatureArrayOutput)
}

// ServiceLanVpnFeatureAssociateMulticastFeatureMapInput is an input type that accepts ServiceLanVpnFeatureAssociateMulticastFeatureMap and ServiceLanVpnFeatureAssociateMulticastFeatureMapOutput values.
// You can construct a concrete instance of `ServiceLanVpnFeatureAssociateMulticastFeatureMapInput` via:
//
//	ServiceLanVpnFeatureAssociateMulticastFeatureMap{ "key": ServiceLanVpnFeatureAssociateMulticastFeatureArgs{...} }
type ServiceLanVpnFeatureAssociateMulticastFeatureMapInput interface {
	pulumi.Input

	ToServiceLanVpnFeatureAssociateMulticastFeatureMapOutput() ServiceLanVpnFeatureAssociateMulticastFeatureMapOutput
	ToServiceLanVpnFeatureAssociateMulticastFeatureMapOutputWithContext(context.Context) ServiceLanVpnFeatureAssociateMulticastFeatureMapOutput
}

type ServiceLanVpnFeatureAssociateMulticastFeatureMap map[string]ServiceLanVpnFeatureAssociateMulticastFeatureInput

func (ServiceLanVpnFeatureAssociateMulticastFeatureMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceLanVpnFeatureAssociateMulticastFeature)(nil)).Elem()
}

func (i ServiceLanVpnFeatureAssociateMulticastFeatureMap) ToServiceLanVpnFeatureAssociateMulticastFeatureMapOutput() ServiceLanVpnFeatureAssociateMulticastFeatureMapOutput {
	return i.ToServiceLanVpnFeatureAssociateMulticastFeatureMapOutputWithContext(context.Background())
}

func (i ServiceLanVpnFeatureAssociateMulticastFeatureMap) ToServiceLanVpnFeatureAssociateMulticastFeatureMapOutputWithContext(ctx context.Context) ServiceLanVpnFeatureAssociateMulticastFeatureMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceLanVpnFeatureAssociateMulticastFeatureMapOutput)
}

type ServiceLanVpnFeatureAssociateMulticastFeatureOutput struct{ *pulumi.OutputState }

func (ServiceLanVpnFeatureAssociateMulticastFeatureOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceLanVpnFeatureAssociateMulticastFeature)(nil)).Elem()
}

func (o ServiceLanVpnFeatureAssociateMulticastFeatureOutput) ToServiceLanVpnFeatureAssociateMulticastFeatureOutput() ServiceLanVpnFeatureAssociateMulticastFeatureOutput {
	return o
}

func (o ServiceLanVpnFeatureAssociateMulticastFeatureOutput) ToServiceLanVpnFeatureAssociateMulticastFeatureOutputWithContext(ctx context.Context) ServiceLanVpnFeatureAssociateMulticastFeatureOutput {
	return o
}

// Feature Profile ID
func (o ServiceLanVpnFeatureAssociateMulticastFeatureOutput) FeatureProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceLanVpnFeatureAssociateMulticastFeature) pulumi.StringOutput { return v.FeatureProfileId }).(pulumi.StringOutput)
}

// Service LAN VPN Feature ID
func (o ServiceLanVpnFeatureAssociateMulticastFeatureOutput) ServiceLanVpnFeatureId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceLanVpnFeatureAssociateMulticastFeature) pulumi.StringOutput {
		return v.ServiceLanVpnFeatureId
	}).(pulumi.StringOutput)
}

// Service Multicast Feature ID
func (o ServiceLanVpnFeatureAssociateMulticastFeatureOutput) ServiceMulticastFeatureId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceLanVpnFeatureAssociateMulticastFeature) pulumi.StringOutput {
		return v.ServiceMulticastFeatureId
	}).(pulumi.StringOutput)
}

// The version of the object
func (o ServiceLanVpnFeatureAssociateMulticastFeatureOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *ServiceLanVpnFeatureAssociateMulticastFeature) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type ServiceLanVpnFeatureAssociateMulticastFeatureArrayOutput struct{ *pulumi.OutputState }

func (ServiceLanVpnFeatureAssociateMulticastFeatureArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceLanVpnFeatureAssociateMulticastFeature)(nil)).Elem()
}

func (o ServiceLanVpnFeatureAssociateMulticastFeatureArrayOutput) ToServiceLanVpnFeatureAssociateMulticastFeatureArrayOutput() ServiceLanVpnFeatureAssociateMulticastFeatureArrayOutput {
	return o
}

func (o ServiceLanVpnFeatureAssociateMulticastFeatureArrayOutput) ToServiceLanVpnFeatureAssociateMulticastFeatureArrayOutputWithContext(ctx context.Context) ServiceLanVpnFeatureAssociateMulticastFeatureArrayOutput {
	return o
}

func (o ServiceLanVpnFeatureAssociateMulticastFeatureArrayOutput) Index(i pulumi.IntInput) ServiceLanVpnFeatureAssociateMulticastFeatureOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceLanVpnFeatureAssociateMulticastFeature {
		return vs[0].([]*ServiceLanVpnFeatureAssociateMulticastFeature)[vs[1].(int)]
	}).(ServiceLanVpnFeatureAssociateMulticastFeatureOutput)
}

type ServiceLanVpnFeatureAssociateMulticastFeatureMapOutput struct{ *pulumi.OutputState }

func (ServiceLanVpnFeatureAssociateMulticastFeatureMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceLanVpnFeatureAssociateMulticastFeature)(nil)).Elem()
}

func (o ServiceLanVpnFeatureAssociateMulticastFeatureMapOutput) ToServiceLanVpnFeatureAssociateMulticastFeatureMapOutput() ServiceLanVpnFeatureAssociateMulticastFeatureMapOutput {
	return o
}

func (o ServiceLanVpnFeatureAssociateMulticastFeatureMapOutput) ToServiceLanVpnFeatureAssociateMulticastFeatureMapOutputWithContext(ctx context.Context) ServiceLanVpnFeatureAssociateMulticastFeatureMapOutput {
	return o
}

func (o ServiceLanVpnFeatureAssociateMulticastFeatureMapOutput) MapIndex(k pulumi.StringInput) ServiceLanVpnFeatureAssociateMulticastFeatureOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceLanVpnFeatureAssociateMulticastFeature {
		return vs[0].(map[string]*ServiceLanVpnFeatureAssociateMulticastFeature)[vs[1].(string)]
	}).(ServiceLanVpnFeatureAssociateMulticastFeatureOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceLanVpnFeatureAssociateMulticastFeatureInput)(nil)).Elem(), &ServiceLanVpnFeatureAssociateMulticastFeature{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceLanVpnFeatureAssociateMulticastFeatureArrayInput)(nil)).Elem(), ServiceLanVpnFeatureAssociateMulticastFeatureArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceLanVpnFeatureAssociateMulticastFeatureMapInput)(nil)).Elem(), ServiceLanVpnFeatureAssociateMulticastFeatureMap{})
	pulumi.RegisterOutputType(ServiceLanVpnFeatureAssociateMulticastFeatureOutput{})
	pulumi.RegisterOutputType(ServiceLanVpnFeatureAssociateMulticastFeatureArrayOutput{})
	pulumi.RegisterOutputType(ServiceLanVpnFeatureAssociateMulticastFeatureMapOutput{})
}
