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

// This resource can manage a Transport WAN VPN Interface GRE Feature.
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
//			_, err := sdwan.NewTransportWanVpnInterfaceGreFeature(ctx, "example", &sdwan.TransportWanVpnInterfaceGreFeatureArgs{
//				Name:                         pulumi.String("Example"),
//				Description:                  pulumi.String("My Example"),
//				FeatureProfileId:             pulumi.String("f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"),
//				TransportWanVpnFeatureId:     pulumi.String("140331f6-5418-4755-a059-13c77eb96037"),
//				InterfaceName:                pulumi.String("gre1"),
//				InterfaceDescription:         pulumi.String("gre1"),
//				Ipv4Address:                  pulumi.String("70.1.1.1"),
//				Ipv4SubnetMask:               pulumi.String("255.255.255.0"),
//				Shutdown:                     pulumi.Bool(true),
//				TunnelSourceIpv4Address:      pulumi.String("78.1.1.1"),
//				TunnelDestinationIpv4Address: pulumi.String("79.1.1.1"),
//				IpMtu:                        pulumi.Int(1500),
//				TcpMss:                       pulumi.Int(1460),
//				ClearDontFragment:            pulumi.Bool(false),
//				ApplicationTunnelType:        pulumi.String("none"),
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
// Expected import identifier with the format: "transport_wan_vpn_interface_gre_feature_id,feature_profile_id,transport_wan_vpn_feature_id"
//
// ```sh
// $ pulumi import sdwan:index/transportWanVpnInterfaceGreFeature:TransportWanVpnInterfaceGreFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac,140331f6-5418-4755-a059-13c77eb96037"
// ```
type TransportWanVpnInterfaceGreFeature struct {
	pulumi.CustomResourceState

	// Enable Application Tunnel Type - Choices: `none`, `sig`
	ApplicationTunnelType pulumi.StringPtrOutput `pulumi:"applicationTunnelType"`
	// Variable name
	ApplicationTunnelTypeVariable pulumi.StringPtrOutput `pulumi:"applicationTunnelTypeVariable"`
	// Enable clear dont fragment (Currently Only SDWAN Tunnel Interface) - Default value: `false`
	ClearDontFragment pulumi.BoolPtrOutput `pulumi:"clearDontFragment"`
	// Variable name
	ClearDontFragmentVariable pulumi.StringPtrOutput `pulumi:"clearDontFragmentVariable"`
	// The description of the Feature
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Feature Profile ID
	FeatureProfileId pulumi.StringOutput `pulumi:"featureProfileId"`
	// Interface description
	InterfaceDescription pulumi.StringPtrOutput `pulumi:"interfaceDescription"`
	// Variable name
	InterfaceDescriptionVariable pulumi.StringPtrOutput `pulumi:"interfaceDescriptionVariable"`
	// Interface name (1..255)
	InterfaceName pulumi.StringPtrOutput `pulumi:"interfaceName"`
	// Variable name
	InterfaceNameVariable pulumi.StringPtrOutput `pulumi:"interfaceNameVariable"`
	// Interface MTU <576..9976>, in bytes - Range: `576`-`9976` - Default value: `1500`
	IpMtu pulumi.IntPtrOutput `pulumi:"ipMtu"`
	// Variable name
	IpMtuVariable pulumi.StringPtrOutput `pulumi:"ipMtuVariable"`
	Ipv4Address   pulumi.StringPtrOutput `pulumi:"ipv4Address"`
	// Variable name
	Ipv4AddressVariable pulumi.StringPtrOutput `pulumi:"ipv4AddressVariable"`
	// - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
	//   `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`,
	//   `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`,
	//   `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`,
	//   `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
	Ipv4SubnetMask pulumi.StringPtrOutput `pulumi:"ipv4SubnetMask"`
	// Variable name
	Ipv4SubnetMaskVariable pulumi.StringPtrOutput `pulumi:"ipv4SubnetMaskVariable"`
	// The name of the Feature
	Name pulumi.StringOutput `pulumi:"name"`
	// Administrative state - Default value: `false`
	Shutdown pulumi.BoolPtrOutput `pulumi:"shutdown"`
	// Variable name
	ShutdownVariable pulumi.StringPtrOutput `pulumi:"shutdownVariable"`
	// TCP MSS on SYN packets, in bytes - Range: `500`-`1460`
	TcpMss pulumi.IntPtrOutput `pulumi:"tcpMss"`
	// Variable name
	TcpMssVariable pulumi.StringPtrOutput `pulumi:"tcpMssVariable"`
	// Transport WAN VPN Feature ID
	TransportWanVpnFeatureId pulumi.StringOutput `pulumi:"transportWanVpnFeatureId"`
	// Tunnel destination IP Address
	TunnelDestinationIpv4Address pulumi.StringPtrOutput `pulumi:"tunnelDestinationIpv4Address"`
	// Variable name
	TunnelDestinationIpv4AddressVariable pulumi.StringPtrOutput `pulumi:"tunnelDestinationIpv4AddressVariable"`
	// <1..32 characters> Interface name, can't be Loopback interface
	TunnelRouteViaLoopback pulumi.StringPtrOutput `pulumi:"tunnelRouteViaLoopback"`
	// Variable name
	TunnelRouteViaLoopbackVariable pulumi.StringPtrOutput `pulumi:"tunnelRouteViaLoopbackVariable"`
	// <1..32 characters> Interface name
	TunnelSourceInterface pulumi.StringPtrOutput `pulumi:"tunnelSourceInterface"`
	// <1..32 characters> Interface name
	TunnelSourceInterfaceLoopback pulumi.StringPtrOutput `pulumi:"tunnelSourceInterfaceLoopback"`
	// Variable name
	TunnelSourceInterfaceLoopbackVariable pulumi.StringPtrOutput `pulumi:"tunnelSourceInterfaceLoopbackVariable"`
	// Variable name
	TunnelSourceInterfaceVariable pulumi.StringPtrOutput `pulumi:"tunnelSourceInterfaceVariable"`
	// Tunnel source IP Address
	TunnelSourceIpv4Address pulumi.StringPtrOutput `pulumi:"tunnelSourceIpv4Address"`
	// Variable name
	TunnelSourceIpv4AddressVariable pulumi.StringPtrOutput `pulumi:"tunnelSourceIpv4AddressVariable"`
	// The version of the Feature
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewTransportWanVpnInterfaceGreFeature registers a new resource with the given unique name, arguments, and options.
func NewTransportWanVpnInterfaceGreFeature(ctx *pulumi.Context,
	name string, args *TransportWanVpnInterfaceGreFeatureArgs, opts ...pulumi.ResourceOption) (*TransportWanVpnInterfaceGreFeature, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FeatureProfileId == nil {
		return nil, errors.New("invalid value for required argument 'FeatureProfileId'")
	}
	if args.TransportWanVpnFeatureId == nil {
		return nil, errors.New("invalid value for required argument 'TransportWanVpnFeatureId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TransportWanVpnInterfaceGreFeature
	err := ctx.RegisterResource("sdwan:index/transportWanVpnInterfaceGreFeature:TransportWanVpnInterfaceGreFeature", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTransportWanVpnInterfaceGreFeature gets an existing TransportWanVpnInterfaceGreFeature resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTransportWanVpnInterfaceGreFeature(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TransportWanVpnInterfaceGreFeatureState, opts ...pulumi.ResourceOption) (*TransportWanVpnInterfaceGreFeature, error) {
	var resource TransportWanVpnInterfaceGreFeature
	err := ctx.ReadResource("sdwan:index/transportWanVpnInterfaceGreFeature:TransportWanVpnInterfaceGreFeature", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TransportWanVpnInterfaceGreFeature resources.
type transportWanVpnInterfaceGreFeatureState struct {
	// Enable Application Tunnel Type - Choices: `none`, `sig`
	ApplicationTunnelType *string `pulumi:"applicationTunnelType"`
	// Variable name
	ApplicationTunnelTypeVariable *string `pulumi:"applicationTunnelTypeVariable"`
	// Enable clear dont fragment (Currently Only SDWAN Tunnel Interface) - Default value: `false`
	ClearDontFragment *bool `pulumi:"clearDontFragment"`
	// Variable name
	ClearDontFragmentVariable *string `pulumi:"clearDontFragmentVariable"`
	// The description of the Feature
	Description *string `pulumi:"description"`
	// Feature Profile ID
	FeatureProfileId *string `pulumi:"featureProfileId"`
	// Interface description
	InterfaceDescription *string `pulumi:"interfaceDescription"`
	// Variable name
	InterfaceDescriptionVariable *string `pulumi:"interfaceDescriptionVariable"`
	// Interface name (1..255)
	InterfaceName *string `pulumi:"interfaceName"`
	// Variable name
	InterfaceNameVariable *string `pulumi:"interfaceNameVariable"`
	// Interface MTU <576..9976>, in bytes - Range: `576`-`9976` - Default value: `1500`
	IpMtu *int `pulumi:"ipMtu"`
	// Variable name
	IpMtuVariable *string `pulumi:"ipMtuVariable"`
	Ipv4Address   *string `pulumi:"ipv4Address"`
	// Variable name
	Ipv4AddressVariable *string `pulumi:"ipv4AddressVariable"`
	// - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
	//   `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`,
	//   `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`,
	//   `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`,
	//   `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
	Ipv4SubnetMask *string `pulumi:"ipv4SubnetMask"`
	// Variable name
	Ipv4SubnetMaskVariable *string `pulumi:"ipv4SubnetMaskVariable"`
	// The name of the Feature
	Name *string `pulumi:"name"`
	// Administrative state - Default value: `false`
	Shutdown *bool `pulumi:"shutdown"`
	// Variable name
	ShutdownVariable *string `pulumi:"shutdownVariable"`
	// TCP MSS on SYN packets, in bytes - Range: `500`-`1460`
	TcpMss *int `pulumi:"tcpMss"`
	// Variable name
	TcpMssVariable *string `pulumi:"tcpMssVariable"`
	// Transport WAN VPN Feature ID
	TransportWanVpnFeatureId *string `pulumi:"transportWanVpnFeatureId"`
	// Tunnel destination IP Address
	TunnelDestinationIpv4Address *string `pulumi:"tunnelDestinationIpv4Address"`
	// Variable name
	TunnelDestinationIpv4AddressVariable *string `pulumi:"tunnelDestinationIpv4AddressVariable"`
	// <1..32 characters> Interface name, can't be Loopback interface
	TunnelRouteViaLoopback *string `pulumi:"tunnelRouteViaLoopback"`
	// Variable name
	TunnelRouteViaLoopbackVariable *string `pulumi:"tunnelRouteViaLoopbackVariable"`
	// <1..32 characters> Interface name
	TunnelSourceInterface *string `pulumi:"tunnelSourceInterface"`
	// <1..32 characters> Interface name
	TunnelSourceInterfaceLoopback *string `pulumi:"tunnelSourceInterfaceLoopback"`
	// Variable name
	TunnelSourceInterfaceLoopbackVariable *string `pulumi:"tunnelSourceInterfaceLoopbackVariable"`
	// Variable name
	TunnelSourceInterfaceVariable *string `pulumi:"tunnelSourceInterfaceVariable"`
	// Tunnel source IP Address
	TunnelSourceIpv4Address *string `pulumi:"tunnelSourceIpv4Address"`
	// Variable name
	TunnelSourceIpv4AddressVariable *string `pulumi:"tunnelSourceIpv4AddressVariable"`
	// The version of the Feature
	Version *int `pulumi:"version"`
}

type TransportWanVpnInterfaceGreFeatureState struct {
	// Enable Application Tunnel Type - Choices: `none`, `sig`
	ApplicationTunnelType pulumi.StringPtrInput
	// Variable name
	ApplicationTunnelTypeVariable pulumi.StringPtrInput
	// Enable clear dont fragment (Currently Only SDWAN Tunnel Interface) - Default value: `false`
	ClearDontFragment pulumi.BoolPtrInput
	// Variable name
	ClearDontFragmentVariable pulumi.StringPtrInput
	// The description of the Feature
	Description pulumi.StringPtrInput
	// Feature Profile ID
	FeatureProfileId pulumi.StringPtrInput
	// Interface description
	InterfaceDescription pulumi.StringPtrInput
	// Variable name
	InterfaceDescriptionVariable pulumi.StringPtrInput
	// Interface name (1..255)
	InterfaceName pulumi.StringPtrInput
	// Variable name
	InterfaceNameVariable pulumi.StringPtrInput
	// Interface MTU <576..9976>, in bytes - Range: `576`-`9976` - Default value: `1500`
	IpMtu pulumi.IntPtrInput
	// Variable name
	IpMtuVariable pulumi.StringPtrInput
	Ipv4Address   pulumi.StringPtrInput
	// Variable name
	Ipv4AddressVariable pulumi.StringPtrInput
	// - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
	//   `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`,
	//   `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`,
	//   `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`,
	//   `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
	Ipv4SubnetMask pulumi.StringPtrInput
	// Variable name
	Ipv4SubnetMaskVariable pulumi.StringPtrInput
	// The name of the Feature
	Name pulumi.StringPtrInput
	// Administrative state - Default value: `false`
	Shutdown pulumi.BoolPtrInput
	// Variable name
	ShutdownVariable pulumi.StringPtrInput
	// TCP MSS on SYN packets, in bytes - Range: `500`-`1460`
	TcpMss pulumi.IntPtrInput
	// Variable name
	TcpMssVariable pulumi.StringPtrInput
	// Transport WAN VPN Feature ID
	TransportWanVpnFeatureId pulumi.StringPtrInput
	// Tunnel destination IP Address
	TunnelDestinationIpv4Address pulumi.StringPtrInput
	// Variable name
	TunnelDestinationIpv4AddressVariable pulumi.StringPtrInput
	// <1..32 characters> Interface name, can't be Loopback interface
	TunnelRouteViaLoopback pulumi.StringPtrInput
	// Variable name
	TunnelRouteViaLoopbackVariable pulumi.StringPtrInput
	// <1..32 characters> Interface name
	TunnelSourceInterface pulumi.StringPtrInput
	// <1..32 characters> Interface name
	TunnelSourceInterfaceLoopback pulumi.StringPtrInput
	// Variable name
	TunnelSourceInterfaceLoopbackVariable pulumi.StringPtrInput
	// Variable name
	TunnelSourceInterfaceVariable pulumi.StringPtrInput
	// Tunnel source IP Address
	TunnelSourceIpv4Address pulumi.StringPtrInput
	// Variable name
	TunnelSourceIpv4AddressVariable pulumi.StringPtrInput
	// The version of the Feature
	Version pulumi.IntPtrInput
}

func (TransportWanVpnInterfaceGreFeatureState) ElementType() reflect.Type {
	return reflect.TypeOf((*transportWanVpnInterfaceGreFeatureState)(nil)).Elem()
}

type transportWanVpnInterfaceGreFeatureArgs struct {
	// Enable Application Tunnel Type - Choices: `none`, `sig`
	ApplicationTunnelType *string `pulumi:"applicationTunnelType"`
	// Variable name
	ApplicationTunnelTypeVariable *string `pulumi:"applicationTunnelTypeVariable"`
	// Enable clear dont fragment (Currently Only SDWAN Tunnel Interface) - Default value: `false`
	ClearDontFragment *bool `pulumi:"clearDontFragment"`
	// Variable name
	ClearDontFragmentVariable *string `pulumi:"clearDontFragmentVariable"`
	// The description of the Feature
	Description *string `pulumi:"description"`
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// Interface description
	InterfaceDescription *string `pulumi:"interfaceDescription"`
	// Variable name
	InterfaceDescriptionVariable *string `pulumi:"interfaceDescriptionVariable"`
	// Interface name (1..255)
	InterfaceName *string `pulumi:"interfaceName"`
	// Variable name
	InterfaceNameVariable *string `pulumi:"interfaceNameVariable"`
	// Interface MTU <576..9976>, in bytes - Range: `576`-`9976` - Default value: `1500`
	IpMtu *int `pulumi:"ipMtu"`
	// Variable name
	IpMtuVariable *string `pulumi:"ipMtuVariable"`
	Ipv4Address   *string `pulumi:"ipv4Address"`
	// Variable name
	Ipv4AddressVariable *string `pulumi:"ipv4AddressVariable"`
	// - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
	//   `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`,
	//   `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`,
	//   `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`,
	//   `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
	Ipv4SubnetMask *string `pulumi:"ipv4SubnetMask"`
	// Variable name
	Ipv4SubnetMaskVariable *string `pulumi:"ipv4SubnetMaskVariable"`
	// The name of the Feature
	Name *string `pulumi:"name"`
	// Administrative state - Default value: `false`
	Shutdown *bool `pulumi:"shutdown"`
	// Variable name
	ShutdownVariable *string `pulumi:"shutdownVariable"`
	// TCP MSS on SYN packets, in bytes - Range: `500`-`1460`
	TcpMss *int `pulumi:"tcpMss"`
	// Variable name
	TcpMssVariable *string `pulumi:"tcpMssVariable"`
	// Transport WAN VPN Feature ID
	TransportWanVpnFeatureId string `pulumi:"transportWanVpnFeatureId"`
	// Tunnel destination IP Address
	TunnelDestinationIpv4Address *string `pulumi:"tunnelDestinationIpv4Address"`
	// Variable name
	TunnelDestinationIpv4AddressVariable *string `pulumi:"tunnelDestinationIpv4AddressVariable"`
	// <1..32 characters> Interface name, can't be Loopback interface
	TunnelRouteViaLoopback *string `pulumi:"tunnelRouteViaLoopback"`
	// Variable name
	TunnelRouteViaLoopbackVariable *string `pulumi:"tunnelRouteViaLoopbackVariable"`
	// <1..32 characters> Interface name
	TunnelSourceInterface *string `pulumi:"tunnelSourceInterface"`
	// <1..32 characters> Interface name
	TunnelSourceInterfaceLoopback *string `pulumi:"tunnelSourceInterfaceLoopback"`
	// Variable name
	TunnelSourceInterfaceLoopbackVariable *string `pulumi:"tunnelSourceInterfaceLoopbackVariable"`
	// Variable name
	TunnelSourceInterfaceVariable *string `pulumi:"tunnelSourceInterfaceVariable"`
	// Tunnel source IP Address
	TunnelSourceIpv4Address *string `pulumi:"tunnelSourceIpv4Address"`
	// Variable name
	TunnelSourceIpv4AddressVariable *string `pulumi:"tunnelSourceIpv4AddressVariable"`
}

// The set of arguments for constructing a TransportWanVpnInterfaceGreFeature resource.
type TransportWanVpnInterfaceGreFeatureArgs struct {
	// Enable Application Tunnel Type - Choices: `none`, `sig`
	ApplicationTunnelType pulumi.StringPtrInput
	// Variable name
	ApplicationTunnelTypeVariable pulumi.StringPtrInput
	// Enable clear dont fragment (Currently Only SDWAN Tunnel Interface) - Default value: `false`
	ClearDontFragment pulumi.BoolPtrInput
	// Variable name
	ClearDontFragmentVariable pulumi.StringPtrInput
	// The description of the Feature
	Description pulumi.StringPtrInput
	// Feature Profile ID
	FeatureProfileId pulumi.StringInput
	// Interface description
	InterfaceDescription pulumi.StringPtrInput
	// Variable name
	InterfaceDescriptionVariable pulumi.StringPtrInput
	// Interface name (1..255)
	InterfaceName pulumi.StringPtrInput
	// Variable name
	InterfaceNameVariable pulumi.StringPtrInput
	// Interface MTU <576..9976>, in bytes - Range: `576`-`9976` - Default value: `1500`
	IpMtu pulumi.IntPtrInput
	// Variable name
	IpMtuVariable pulumi.StringPtrInput
	Ipv4Address   pulumi.StringPtrInput
	// Variable name
	Ipv4AddressVariable pulumi.StringPtrInput
	// - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
	//   `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`,
	//   `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`,
	//   `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`,
	//   `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
	Ipv4SubnetMask pulumi.StringPtrInput
	// Variable name
	Ipv4SubnetMaskVariable pulumi.StringPtrInput
	// The name of the Feature
	Name pulumi.StringPtrInput
	// Administrative state - Default value: `false`
	Shutdown pulumi.BoolPtrInput
	// Variable name
	ShutdownVariable pulumi.StringPtrInput
	// TCP MSS on SYN packets, in bytes - Range: `500`-`1460`
	TcpMss pulumi.IntPtrInput
	// Variable name
	TcpMssVariable pulumi.StringPtrInput
	// Transport WAN VPN Feature ID
	TransportWanVpnFeatureId pulumi.StringInput
	// Tunnel destination IP Address
	TunnelDestinationIpv4Address pulumi.StringPtrInput
	// Variable name
	TunnelDestinationIpv4AddressVariable pulumi.StringPtrInput
	// <1..32 characters> Interface name, can't be Loopback interface
	TunnelRouteViaLoopback pulumi.StringPtrInput
	// Variable name
	TunnelRouteViaLoopbackVariable pulumi.StringPtrInput
	// <1..32 characters> Interface name
	TunnelSourceInterface pulumi.StringPtrInput
	// <1..32 characters> Interface name
	TunnelSourceInterfaceLoopback pulumi.StringPtrInput
	// Variable name
	TunnelSourceInterfaceLoopbackVariable pulumi.StringPtrInput
	// Variable name
	TunnelSourceInterfaceVariable pulumi.StringPtrInput
	// Tunnel source IP Address
	TunnelSourceIpv4Address pulumi.StringPtrInput
	// Variable name
	TunnelSourceIpv4AddressVariable pulumi.StringPtrInput
}

func (TransportWanVpnInterfaceGreFeatureArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*transportWanVpnInterfaceGreFeatureArgs)(nil)).Elem()
}

type TransportWanVpnInterfaceGreFeatureInput interface {
	pulumi.Input

	ToTransportWanVpnInterfaceGreFeatureOutput() TransportWanVpnInterfaceGreFeatureOutput
	ToTransportWanVpnInterfaceGreFeatureOutputWithContext(ctx context.Context) TransportWanVpnInterfaceGreFeatureOutput
}

func (*TransportWanVpnInterfaceGreFeature) ElementType() reflect.Type {
	return reflect.TypeOf((**TransportWanVpnInterfaceGreFeature)(nil)).Elem()
}

func (i *TransportWanVpnInterfaceGreFeature) ToTransportWanVpnInterfaceGreFeatureOutput() TransportWanVpnInterfaceGreFeatureOutput {
	return i.ToTransportWanVpnInterfaceGreFeatureOutputWithContext(context.Background())
}

func (i *TransportWanVpnInterfaceGreFeature) ToTransportWanVpnInterfaceGreFeatureOutputWithContext(ctx context.Context) TransportWanVpnInterfaceGreFeatureOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransportWanVpnInterfaceGreFeatureOutput)
}

// TransportWanVpnInterfaceGreFeatureArrayInput is an input type that accepts TransportWanVpnInterfaceGreFeatureArray and TransportWanVpnInterfaceGreFeatureArrayOutput values.
// You can construct a concrete instance of `TransportWanVpnInterfaceGreFeatureArrayInput` via:
//
//	TransportWanVpnInterfaceGreFeatureArray{ TransportWanVpnInterfaceGreFeatureArgs{...} }
type TransportWanVpnInterfaceGreFeatureArrayInput interface {
	pulumi.Input

	ToTransportWanVpnInterfaceGreFeatureArrayOutput() TransportWanVpnInterfaceGreFeatureArrayOutput
	ToTransportWanVpnInterfaceGreFeatureArrayOutputWithContext(context.Context) TransportWanVpnInterfaceGreFeatureArrayOutput
}

type TransportWanVpnInterfaceGreFeatureArray []TransportWanVpnInterfaceGreFeatureInput

func (TransportWanVpnInterfaceGreFeatureArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransportWanVpnInterfaceGreFeature)(nil)).Elem()
}

func (i TransportWanVpnInterfaceGreFeatureArray) ToTransportWanVpnInterfaceGreFeatureArrayOutput() TransportWanVpnInterfaceGreFeatureArrayOutput {
	return i.ToTransportWanVpnInterfaceGreFeatureArrayOutputWithContext(context.Background())
}

func (i TransportWanVpnInterfaceGreFeatureArray) ToTransportWanVpnInterfaceGreFeatureArrayOutputWithContext(ctx context.Context) TransportWanVpnInterfaceGreFeatureArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransportWanVpnInterfaceGreFeatureArrayOutput)
}

// TransportWanVpnInterfaceGreFeatureMapInput is an input type that accepts TransportWanVpnInterfaceGreFeatureMap and TransportWanVpnInterfaceGreFeatureMapOutput values.
// You can construct a concrete instance of `TransportWanVpnInterfaceGreFeatureMapInput` via:
//
//	TransportWanVpnInterfaceGreFeatureMap{ "key": TransportWanVpnInterfaceGreFeatureArgs{...} }
type TransportWanVpnInterfaceGreFeatureMapInput interface {
	pulumi.Input

	ToTransportWanVpnInterfaceGreFeatureMapOutput() TransportWanVpnInterfaceGreFeatureMapOutput
	ToTransportWanVpnInterfaceGreFeatureMapOutputWithContext(context.Context) TransportWanVpnInterfaceGreFeatureMapOutput
}

type TransportWanVpnInterfaceGreFeatureMap map[string]TransportWanVpnInterfaceGreFeatureInput

func (TransportWanVpnInterfaceGreFeatureMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransportWanVpnInterfaceGreFeature)(nil)).Elem()
}

func (i TransportWanVpnInterfaceGreFeatureMap) ToTransportWanVpnInterfaceGreFeatureMapOutput() TransportWanVpnInterfaceGreFeatureMapOutput {
	return i.ToTransportWanVpnInterfaceGreFeatureMapOutputWithContext(context.Background())
}

func (i TransportWanVpnInterfaceGreFeatureMap) ToTransportWanVpnInterfaceGreFeatureMapOutputWithContext(ctx context.Context) TransportWanVpnInterfaceGreFeatureMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransportWanVpnInterfaceGreFeatureMapOutput)
}

type TransportWanVpnInterfaceGreFeatureOutput struct{ *pulumi.OutputState }

func (TransportWanVpnInterfaceGreFeatureOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TransportWanVpnInterfaceGreFeature)(nil)).Elem()
}

func (o TransportWanVpnInterfaceGreFeatureOutput) ToTransportWanVpnInterfaceGreFeatureOutput() TransportWanVpnInterfaceGreFeatureOutput {
	return o
}

func (o TransportWanVpnInterfaceGreFeatureOutput) ToTransportWanVpnInterfaceGreFeatureOutputWithContext(ctx context.Context) TransportWanVpnInterfaceGreFeatureOutput {
	return o
}

// Enable Application Tunnel Type - Choices: `none`, `sig`
func (o TransportWanVpnInterfaceGreFeatureOutput) ApplicationTunnelType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput { return v.ApplicationTunnelType }).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportWanVpnInterfaceGreFeatureOutput) ApplicationTunnelTypeVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput {
		return v.ApplicationTunnelTypeVariable
	}).(pulumi.StringPtrOutput)
}

// Enable clear dont fragment (Currently Only SDWAN Tunnel Interface) - Default value: `false`
func (o TransportWanVpnInterfaceGreFeatureOutput) ClearDontFragment() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.BoolPtrOutput { return v.ClearDontFragment }).(pulumi.BoolPtrOutput)
}

// Variable name
func (o TransportWanVpnInterfaceGreFeatureOutput) ClearDontFragmentVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput { return v.ClearDontFragmentVariable }).(pulumi.StringPtrOutput)
}

// The description of the Feature
func (o TransportWanVpnInterfaceGreFeatureOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Feature Profile ID
func (o TransportWanVpnInterfaceGreFeatureOutput) FeatureProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringOutput { return v.FeatureProfileId }).(pulumi.StringOutput)
}

// Interface description
func (o TransportWanVpnInterfaceGreFeatureOutput) InterfaceDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput { return v.InterfaceDescription }).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportWanVpnInterfaceGreFeatureOutput) InterfaceDescriptionVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput {
		return v.InterfaceDescriptionVariable
	}).(pulumi.StringPtrOutput)
}

// Interface name (1..255)
func (o TransportWanVpnInterfaceGreFeatureOutput) InterfaceName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput { return v.InterfaceName }).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportWanVpnInterfaceGreFeatureOutput) InterfaceNameVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput { return v.InterfaceNameVariable }).(pulumi.StringPtrOutput)
}

// Interface MTU <576..9976>, in bytes - Range: `576`-`9976` - Default value: `1500`
func (o TransportWanVpnInterfaceGreFeatureOutput) IpMtu() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.IntPtrOutput { return v.IpMtu }).(pulumi.IntPtrOutput)
}

// Variable name
func (o TransportWanVpnInterfaceGreFeatureOutput) IpMtuVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput { return v.IpMtuVariable }).(pulumi.StringPtrOutput)
}

func (o TransportWanVpnInterfaceGreFeatureOutput) Ipv4Address() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput { return v.Ipv4Address }).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportWanVpnInterfaceGreFeatureOutput) Ipv4AddressVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput { return v.Ipv4AddressVariable }).(pulumi.StringPtrOutput)
}

//   - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
//     `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`,
//     `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`,
//     `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`,
//     `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
func (o TransportWanVpnInterfaceGreFeatureOutput) Ipv4SubnetMask() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput { return v.Ipv4SubnetMask }).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportWanVpnInterfaceGreFeatureOutput) Ipv4SubnetMaskVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput { return v.Ipv4SubnetMaskVariable }).(pulumi.StringPtrOutput)
}

// The name of the Feature
func (o TransportWanVpnInterfaceGreFeatureOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Administrative state - Default value: `false`
func (o TransportWanVpnInterfaceGreFeatureOutput) Shutdown() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.BoolPtrOutput { return v.Shutdown }).(pulumi.BoolPtrOutput)
}

// Variable name
func (o TransportWanVpnInterfaceGreFeatureOutput) ShutdownVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput { return v.ShutdownVariable }).(pulumi.StringPtrOutput)
}

// TCP MSS on SYN packets, in bytes - Range: `500`-`1460`
func (o TransportWanVpnInterfaceGreFeatureOutput) TcpMss() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.IntPtrOutput { return v.TcpMss }).(pulumi.IntPtrOutput)
}

// Variable name
func (o TransportWanVpnInterfaceGreFeatureOutput) TcpMssVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput { return v.TcpMssVariable }).(pulumi.StringPtrOutput)
}

// Transport WAN VPN Feature ID
func (o TransportWanVpnInterfaceGreFeatureOutput) TransportWanVpnFeatureId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringOutput { return v.TransportWanVpnFeatureId }).(pulumi.StringOutput)
}

// Tunnel destination IP Address
func (o TransportWanVpnInterfaceGreFeatureOutput) TunnelDestinationIpv4Address() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput {
		return v.TunnelDestinationIpv4Address
	}).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportWanVpnInterfaceGreFeatureOutput) TunnelDestinationIpv4AddressVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput {
		return v.TunnelDestinationIpv4AddressVariable
	}).(pulumi.StringPtrOutput)
}

// <1..32 characters> Interface name, can't be Loopback interface
func (o TransportWanVpnInterfaceGreFeatureOutput) TunnelRouteViaLoopback() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput { return v.TunnelRouteViaLoopback }).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportWanVpnInterfaceGreFeatureOutput) TunnelRouteViaLoopbackVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput {
		return v.TunnelRouteViaLoopbackVariable
	}).(pulumi.StringPtrOutput)
}

// <1..32 characters> Interface name
func (o TransportWanVpnInterfaceGreFeatureOutput) TunnelSourceInterface() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput { return v.TunnelSourceInterface }).(pulumi.StringPtrOutput)
}

// <1..32 characters> Interface name
func (o TransportWanVpnInterfaceGreFeatureOutput) TunnelSourceInterfaceLoopback() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput {
		return v.TunnelSourceInterfaceLoopback
	}).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportWanVpnInterfaceGreFeatureOutput) TunnelSourceInterfaceLoopbackVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput {
		return v.TunnelSourceInterfaceLoopbackVariable
	}).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportWanVpnInterfaceGreFeatureOutput) TunnelSourceInterfaceVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput {
		return v.TunnelSourceInterfaceVariable
	}).(pulumi.StringPtrOutput)
}

// Tunnel source IP Address
func (o TransportWanVpnInterfaceGreFeatureOutput) TunnelSourceIpv4Address() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput { return v.TunnelSourceIpv4Address }).(pulumi.StringPtrOutput)
}

// Variable name
func (o TransportWanVpnInterfaceGreFeatureOutput) TunnelSourceIpv4AddressVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.StringPtrOutput {
		return v.TunnelSourceIpv4AddressVariable
	}).(pulumi.StringPtrOutput)
}

// The version of the Feature
func (o TransportWanVpnInterfaceGreFeatureOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *TransportWanVpnInterfaceGreFeature) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type TransportWanVpnInterfaceGreFeatureArrayOutput struct{ *pulumi.OutputState }

func (TransportWanVpnInterfaceGreFeatureArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransportWanVpnInterfaceGreFeature)(nil)).Elem()
}

func (o TransportWanVpnInterfaceGreFeatureArrayOutput) ToTransportWanVpnInterfaceGreFeatureArrayOutput() TransportWanVpnInterfaceGreFeatureArrayOutput {
	return o
}

func (o TransportWanVpnInterfaceGreFeatureArrayOutput) ToTransportWanVpnInterfaceGreFeatureArrayOutputWithContext(ctx context.Context) TransportWanVpnInterfaceGreFeatureArrayOutput {
	return o
}

func (o TransportWanVpnInterfaceGreFeatureArrayOutput) Index(i pulumi.IntInput) TransportWanVpnInterfaceGreFeatureOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TransportWanVpnInterfaceGreFeature {
		return vs[0].([]*TransportWanVpnInterfaceGreFeature)[vs[1].(int)]
	}).(TransportWanVpnInterfaceGreFeatureOutput)
}

type TransportWanVpnInterfaceGreFeatureMapOutput struct{ *pulumi.OutputState }

func (TransportWanVpnInterfaceGreFeatureMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransportWanVpnInterfaceGreFeature)(nil)).Elem()
}

func (o TransportWanVpnInterfaceGreFeatureMapOutput) ToTransportWanVpnInterfaceGreFeatureMapOutput() TransportWanVpnInterfaceGreFeatureMapOutput {
	return o
}

func (o TransportWanVpnInterfaceGreFeatureMapOutput) ToTransportWanVpnInterfaceGreFeatureMapOutputWithContext(ctx context.Context) TransportWanVpnInterfaceGreFeatureMapOutput {
	return o
}

func (o TransportWanVpnInterfaceGreFeatureMapOutput) MapIndex(k pulumi.StringInput) TransportWanVpnInterfaceGreFeatureOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TransportWanVpnInterfaceGreFeature {
		return vs[0].(map[string]*TransportWanVpnInterfaceGreFeature)[vs[1].(string)]
	}).(TransportWanVpnInterfaceGreFeatureOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TransportWanVpnInterfaceGreFeatureInput)(nil)).Elem(), &TransportWanVpnInterfaceGreFeature{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransportWanVpnInterfaceGreFeatureArrayInput)(nil)).Elem(), TransportWanVpnInterfaceGreFeatureArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransportWanVpnInterfaceGreFeatureMapInput)(nil)).Elem(), TransportWanVpnInterfaceGreFeatureMap{})
	pulumi.RegisterOutputType(TransportWanVpnInterfaceGreFeatureOutput{})
	pulumi.RegisterOutputType(TransportWanVpnInterfaceGreFeatureArrayOutput{})
	pulumi.RegisterOutputType(TransportWanVpnInterfaceGreFeatureMapOutput{})
}
