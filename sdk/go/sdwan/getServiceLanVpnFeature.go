// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source can read the Service LAN VPN Feature.
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
//			_, err := sdwan.LookupServiceLanVpnFeature(ctx, &sdwan.LookupServiceLanVpnFeatureArgs{
//				Id:               "f6b2c44c-693c-4763-b010-895aa3d236bd",
//				FeatureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupServiceLanVpnFeature(ctx *pulumi.Context, args *LookupServiceLanVpnFeatureArgs, opts ...pulumi.InvokeOption) (*LookupServiceLanVpnFeatureResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupServiceLanVpnFeatureResult
	err := ctx.Invoke("sdwan:index/getServiceLanVpnFeature:getServiceLanVpnFeature", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceLanVpnFeature.
type LookupServiceLanVpnFeatureArgs struct {
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The id of the Feature
	Id string `pulumi:"id"`
}

// A collection of values returned by getServiceLanVpnFeature.
type LookupServiceLanVpnFeatureResult struct {
	// OMP Advertise IPv4
	AdvertiseOmpIpv4s []GetServiceLanVpnFeatureAdvertiseOmpIpv4 `pulumi:"advertiseOmpIpv4s"`
	// OMP Advertise IPv6
	AdvertiseOmpIpv6s []GetServiceLanVpnFeatureAdvertiseOmpIpv6 `pulumi:"advertiseOmpIpv6s"`
	// Name
	ConfigDescription string `pulumi:"configDescription"`
	// Variable name
	ConfigDescriptionVariable string `pulumi:"configDescriptionVariable"`
	// The description of the Feature
	Description string `pulumi:"description"`
	// Enable SDWAN Remote Access
	EnableSdwanRemoteAccess bool `pulumi:"enableSdwanRemoteAccess"`
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// IPv4 Static GRE Route
	GreRoutes    []GetServiceLanVpnFeatureGreRoute    `pulumi:"greRoutes"`
	HostMappings []GetServiceLanVpnFeatureHostMapping `pulumi:"hostMappings"`
	// The id of the Feature
	Id string `pulumi:"id"`
	// IPv4 Static IPSEC Route
	IpsecRoutes            []GetServiceLanVpnFeatureIpsecRoute            `pulumi:"ipsecRoutes"`
	Ipv4ExportRouteTargets []GetServiceLanVpnFeatureIpv4ExportRouteTarget `pulumi:"ipv4ExportRouteTargets"`
	Ipv4ImportRouteTargets []GetServiceLanVpnFeatureIpv4ImportRouteTarget `pulumi:"ipv4ImportRouteTargets"`
	// IPv4 Static Route
	Ipv4StaticRoutes       []GetServiceLanVpnFeatureIpv4StaticRoute       `pulumi:"ipv4StaticRoutes"`
	Ipv6ExportRouteTargets []GetServiceLanVpnFeatureIpv6ExportRouteTarget `pulumi:"ipv6ExportRouteTargets"`
	Ipv6ImportRouteTargets []GetServiceLanVpnFeatureIpv6ImportRouteTarget `pulumi:"ipv6ImportRouteTargets"`
	// IPv6 Static Route
	Ipv6StaticRoutes []GetServiceLanVpnFeatureIpv6StaticRoute `pulumi:"ipv6StaticRoutes"`
	// The name of the Feature
	Name string `pulumi:"name"`
	// NAT64 V4 Pool
	Nat64V4Pools []GetServiceLanVpnFeatureNat64V4Pool `pulumi:"nat64V4Pools"`
	// NAT Pool
	NatPools []GetServiceLanVpnFeatureNatPool `pulumi:"natPools"`
	// NAT Port Forward
	NatPortForwards []GetServiceLanVpnFeatureNatPortForward `pulumi:"natPortForwards"`
	// OMP Admin Distance IPv4
	OmpAdminDistanceIpv4 int `pulumi:"ompAdminDistanceIpv4"`
	// Variable name
	OmpAdminDistanceIpv4Variable string `pulumi:"ompAdminDistanceIpv4Variable"`
	// OMP Admin Distance IPv6
	OmpAdminDistanceIpv6 int `pulumi:"ompAdminDistanceIpv6"`
	// Variable name
	OmpAdminDistanceIpv6Variable string `pulumi:"ompAdminDistanceIpv6Variable"`
	// Primary DNS Address (IPv4)
	PrimaryDnsAddressIpv4 string `pulumi:"primaryDnsAddressIpv4"`
	// Variable name
	PrimaryDnsAddressIpv4Variable string `pulumi:"primaryDnsAddressIpv4Variable"`
	// Primary DNS Address (IPv6)
	PrimaryDnsAddressIpv6 string `pulumi:"primaryDnsAddressIpv6"`
	// Variable name
	PrimaryDnsAddressIpv6Variable string `pulumi:"primaryDnsAddressIpv6Variable"`
	// Enable route leaking from Global to Service VPN
	RouteLeakFromGlobalVpns []GetServiceLanVpnFeatureRouteLeakFromGlobalVpn `pulumi:"routeLeakFromGlobalVpns"`
	// Enable route leak from another Service VPN to current Service VPN
	RouteLeakFromOtherServices []GetServiceLanVpnFeatureRouteLeakFromOtherService `pulumi:"routeLeakFromOtherServices"`
	// Enable route leaking from Service to Global VPN
	RouteLeakToGlobalVpns []GetServiceLanVpnFeatureRouteLeakToGlobalVpn `pulumi:"routeLeakToGlobalVpns"`
	// Secondary DNS Address (IPv4)
	SecondaryDnsAddressIpv4 string `pulumi:"secondaryDnsAddressIpv4"`
	// Variable name
	SecondaryDnsAddressIpv4Variable string `pulumi:"secondaryDnsAddressIpv4Variable"`
	// Secondary DNS Address (IPv6)
	SecondaryDnsAddressIpv6 string `pulumi:"secondaryDnsAddressIpv6"`
	// Variable name
	SecondaryDnsAddressIpv6Variable string `pulumi:"secondaryDnsAddressIpv6Variable"`
	// Service
	ServiceRoutes []GetServiceLanVpnFeatureServiceRoute `pulumi:"serviceRoutes"`
	// Service
	Services []GetServiceLanVpnFeatureService `pulumi:"services"`
	// Static NAT Rules
	StaticNats []GetServiceLanVpnFeatureStaticNat `pulumi:"staticNats"`
	// The version of the Feature
	Version int `pulumi:"version"`
	// VPN
	Vpn int `pulumi:"vpn"`
	// Variable name
	VpnVariable string `pulumi:"vpnVariable"`
}

func LookupServiceLanVpnFeatureOutput(ctx *pulumi.Context, args LookupServiceLanVpnFeatureOutputArgs, opts ...pulumi.InvokeOption) LookupServiceLanVpnFeatureResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupServiceLanVpnFeatureResult, error) {
			args := v.(LookupServiceLanVpnFeatureArgs)
			r, err := LookupServiceLanVpnFeature(ctx, &args, opts...)
			var s LookupServiceLanVpnFeatureResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupServiceLanVpnFeatureResultOutput)
}

// A collection of arguments for invoking getServiceLanVpnFeature.
type LookupServiceLanVpnFeatureOutputArgs struct {
	// Feature Profile ID
	FeatureProfileId pulumi.StringInput `pulumi:"featureProfileId"`
	// The id of the Feature
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupServiceLanVpnFeatureOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceLanVpnFeatureArgs)(nil)).Elem()
}

// A collection of values returned by getServiceLanVpnFeature.
type LookupServiceLanVpnFeatureResultOutput struct{ *pulumi.OutputState }

func (LookupServiceLanVpnFeatureResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceLanVpnFeatureResult)(nil)).Elem()
}

func (o LookupServiceLanVpnFeatureResultOutput) ToLookupServiceLanVpnFeatureResultOutput() LookupServiceLanVpnFeatureResultOutput {
	return o
}

func (o LookupServiceLanVpnFeatureResultOutput) ToLookupServiceLanVpnFeatureResultOutputWithContext(ctx context.Context) LookupServiceLanVpnFeatureResultOutput {
	return o
}

// OMP Advertise IPv4
func (o LookupServiceLanVpnFeatureResultOutput) AdvertiseOmpIpv4s() GetServiceLanVpnFeatureAdvertiseOmpIpv4ArrayOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) []GetServiceLanVpnFeatureAdvertiseOmpIpv4 {
		return v.AdvertiseOmpIpv4s
	}).(GetServiceLanVpnFeatureAdvertiseOmpIpv4ArrayOutput)
}

// OMP Advertise IPv6
func (o LookupServiceLanVpnFeatureResultOutput) AdvertiseOmpIpv6s() GetServiceLanVpnFeatureAdvertiseOmpIpv6ArrayOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) []GetServiceLanVpnFeatureAdvertiseOmpIpv6 {
		return v.AdvertiseOmpIpv6s
	}).(GetServiceLanVpnFeatureAdvertiseOmpIpv6ArrayOutput)
}

// Name
func (o LookupServiceLanVpnFeatureResultOutput) ConfigDescription() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) string { return v.ConfigDescription }).(pulumi.StringOutput)
}

// Variable name
func (o LookupServiceLanVpnFeatureResultOutput) ConfigDescriptionVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) string { return v.ConfigDescriptionVariable }).(pulumi.StringOutput)
}

// The description of the Feature
func (o LookupServiceLanVpnFeatureResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) string { return v.Description }).(pulumi.StringOutput)
}

// Enable SDWAN Remote Access
func (o LookupServiceLanVpnFeatureResultOutput) EnableSdwanRemoteAccess() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) bool { return v.EnableSdwanRemoteAccess }).(pulumi.BoolOutput)
}

// Feature Profile ID
func (o LookupServiceLanVpnFeatureResultOutput) FeatureProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) string { return v.FeatureProfileId }).(pulumi.StringOutput)
}

// IPv4 Static GRE Route
func (o LookupServiceLanVpnFeatureResultOutput) GreRoutes() GetServiceLanVpnFeatureGreRouteArrayOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) []GetServiceLanVpnFeatureGreRoute { return v.GreRoutes }).(GetServiceLanVpnFeatureGreRouteArrayOutput)
}

func (o LookupServiceLanVpnFeatureResultOutput) HostMappings() GetServiceLanVpnFeatureHostMappingArrayOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) []GetServiceLanVpnFeatureHostMapping { return v.HostMappings }).(GetServiceLanVpnFeatureHostMappingArrayOutput)
}

// The id of the Feature
func (o LookupServiceLanVpnFeatureResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) string { return v.Id }).(pulumi.StringOutput)
}

// IPv4 Static IPSEC Route
func (o LookupServiceLanVpnFeatureResultOutput) IpsecRoutes() GetServiceLanVpnFeatureIpsecRouteArrayOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) []GetServiceLanVpnFeatureIpsecRoute { return v.IpsecRoutes }).(GetServiceLanVpnFeatureIpsecRouteArrayOutput)
}

func (o LookupServiceLanVpnFeatureResultOutput) Ipv4ExportRouteTargets() GetServiceLanVpnFeatureIpv4ExportRouteTargetArrayOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) []GetServiceLanVpnFeatureIpv4ExportRouteTarget {
		return v.Ipv4ExportRouteTargets
	}).(GetServiceLanVpnFeatureIpv4ExportRouteTargetArrayOutput)
}

func (o LookupServiceLanVpnFeatureResultOutput) Ipv4ImportRouteTargets() GetServiceLanVpnFeatureIpv4ImportRouteTargetArrayOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) []GetServiceLanVpnFeatureIpv4ImportRouteTarget {
		return v.Ipv4ImportRouteTargets
	}).(GetServiceLanVpnFeatureIpv4ImportRouteTargetArrayOutput)
}

// IPv4 Static Route
func (o LookupServiceLanVpnFeatureResultOutput) Ipv4StaticRoutes() GetServiceLanVpnFeatureIpv4StaticRouteArrayOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) []GetServiceLanVpnFeatureIpv4StaticRoute {
		return v.Ipv4StaticRoutes
	}).(GetServiceLanVpnFeatureIpv4StaticRouteArrayOutput)
}

func (o LookupServiceLanVpnFeatureResultOutput) Ipv6ExportRouteTargets() GetServiceLanVpnFeatureIpv6ExportRouteTargetArrayOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) []GetServiceLanVpnFeatureIpv6ExportRouteTarget {
		return v.Ipv6ExportRouteTargets
	}).(GetServiceLanVpnFeatureIpv6ExportRouteTargetArrayOutput)
}

func (o LookupServiceLanVpnFeatureResultOutput) Ipv6ImportRouteTargets() GetServiceLanVpnFeatureIpv6ImportRouteTargetArrayOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) []GetServiceLanVpnFeatureIpv6ImportRouteTarget {
		return v.Ipv6ImportRouteTargets
	}).(GetServiceLanVpnFeatureIpv6ImportRouteTargetArrayOutput)
}

// IPv6 Static Route
func (o LookupServiceLanVpnFeatureResultOutput) Ipv6StaticRoutes() GetServiceLanVpnFeatureIpv6StaticRouteArrayOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) []GetServiceLanVpnFeatureIpv6StaticRoute {
		return v.Ipv6StaticRoutes
	}).(GetServiceLanVpnFeatureIpv6StaticRouteArrayOutput)
}

// The name of the Feature
func (o LookupServiceLanVpnFeatureResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) string { return v.Name }).(pulumi.StringOutput)
}

// NAT64 V4 Pool
func (o LookupServiceLanVpnFeatureResultOutput) Nat64V4Pools() GetServiceLanVpnFeatureNat64V4PoolArrayOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) []GetServiceLanVpnFeatureNat64V4Pool { return v.Nat64V4Pools }).(GetServiceLanVpnFeatureNat64V4PoolArrayOutput)
}

// NAT Pool
func (o LookupServiceLanVpnFeatureResultOutput) NatPools() GetServiceLanVpnFeatureNatPoolArrayOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) []GetServiceLanVpnFeatureNatPool { return v.NatPools }).(GetServiceLanVpnFeatureNatPoolArrayOutput)
}

// NAT Port Forward
func (o LookupServiceLanVpnFeatureResultOutput) NatPortForwards() GetServiceLanVpnFeatureNatPortForwardArrayOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) []GetServiceLanVpnFeatureNatPortForward {
		return v.NatPortForwards
	}).(GetServiceLanVpnFeatureNatPortForwardArrayOutput)
}

// OMP Admin Distance IPv4
func (o LookupServiceLanVpnFeatureResultOutput) OmpAdminDistanceIpv4() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) int { return v.OmpAdminDistanceIpv4 }).(pulumi.IntOutput)
}

// Variable name
func (o LookupServiceLanVpnFeatureResultOutput) OmpAdminDistanceIpv4Variable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) string { return v.OmpAdminDistanceIpv4Variable }).(pulumi.StringOutput)
}

// OMP Admin Distance IPv6
func (o LookupServiceLanVpnFeatureResultOutput) OmpAdminDistanceIpv6() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) int { return v.OmpAdminDistanceIpv6 }).(pulumi.IntOutput)
}

// Variable name
func (o LookupServiceLanVpnFeatureResultOutput) OmpAdminDistanceIpv6Variable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) string { return v.OmpAdminDistanceIpv6Variable }).(pulumi.StringOutput)
}

// Primary DNS Address (IPv4)
func (o LookupServiceLanVpnFeatureResultOutput) PrimaryDnsAddressIpv4() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) string { return v.PrimaryDnsAddressIpv4 }).(pulumi.StringOutput)
}

// Variable name
func (o LookupServiceLanVpnFeatureResultOutput) PrimaryDnsAddressIpv4Variable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) string { return v.PrimaryDnsAddressIpv4Variable }).(pulumi.StringOutput)
}

// Primary DNS Address (IPv6)
func (o LookupServiceLanVpnFeatureResultOutput) PrimaryDnsAddressIpv6() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) string { return v.PrimaryDnsAddressIpv6 }).(pulumi.StringOutput)
}

// Variable name
func (o LookupServiceLanVpnFeatureResultOutput) PrimaryDnsAddressIpv6Variable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) string { return v.PrimaryDnsAddressIpv6Variable }).(pulumi.StringOutput)
}

// Enable route leaking from Global to Service VPN
func (o LookupServiceLanVpnFeatureResultOutput) RouteLeakFromGlobalVpns() GetServiceLanVpnFeatureRouteLeakFromGlobalVpnArrayOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) []GetServiceLanVpnFeatureRouteLeakFromGlobalVpn {
		return v.RouteLeakFromGlobalVpns
	}).(GetServiceLanVpnFeatureRouteLeakFromGlobalVpnArrayOutput)
}

// Enable route leak from another Service VPN to current Service VPN
func (o LookupServiceLanVpnFeatureResultOutput) RouteLeakFromOtherServices() GetServiceLanVpnFeatureRouteLeakFromOtherServiceArrayOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) []GetServiceLanVpnFeatureRouteLeakFromOtherService {
		return v.RouteLeakFromOtherServices
	}).(GetServiceLanVpnFeatureRouteLeakFromOtherServiceArrayOutput)
}

// Enable route leaking from Service to Global VPN
func (o LookupServiceLanVpnFeatureResultOutput) RouteLeakToGlobalVpns() GetServiceLanVpnFeatureRouteLeakToGlobalVpnArrayOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) []GetServiceLanVpnFeatureRouteLeakToGlobalVpn {
		return v.RouteLeakToGlobalVpns
	}).(GetServiceLanVpnFeatureRouteLeakToGlobalVpnArrayOutput)
}

// Secondary DNS Address (IPv4)
func (o LookupServiceLanVpnFeatureResultOutput) SecondaryDnsAddressIpv4() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) string { return v.SecondaryDnsAddressIpv4 }).(pulumi.StringOutput)
}

// Variable name
func (o LookupServiceLanVpnFeatureResultOutput) SecondaryDnsAddressIpv4Variable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) string { return v.SecondaryDnsAddressIpv4Variable }).(pulumi.StringOutput)
}

// Secondary DNS Address (IPv6)
func (o LookupServiceLanVpnFeatureResultOutput) SecondaryDnsAddressIpv6() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) string { return v.SecondaryDnsAddressIpv6 }).(pulumi.StringOutput)
}

// Variable name
func (o LookupServiceLanVpnFeatureResultOutput) SecondaryDnsAddressIpv6Variable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) string { return v.SecondaryDnsAddressIpv6Variable }).(pulumi.StringOutput)
}

// Service
func (o LookupServiceLanVpnFeatureResultOutput) ServiceRoutes() GetServiceLanVpnFeatureServiceRouteArrayOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) []GetServiceLanVpnFeatureServiceRoute { return v.ServiceRoutes }).(GetServiceLanVpnFeatureServiceRouteArrayOutput)
}

// Service
func (o LookupServiceLanVpnFeatureResultOutput) Services() GetServiceLanVpnFeatureServiceArrayOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) []GetServiceLanVpnFeatureService { return v.Services }).(GetServiceLanVpnFeatureServiceArrayOutput)
}

// Static NAT Rules
func (o LookupServiceLanVpnFeatureResultOutput) StaticNats() GetServiceLanVpnFeatureStaticNatArrayOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) []GetServiceLanVpnFeatureStaticNat { return v.StaticNats }).(GetServiceLanVpnFeatureStaticNatArrayOutput)
}

// The version of the Feature
func (o LookupServiceLanVpnFeatureResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) int { return v.Version }).(pulumi.IntOutput)
}

// VPN
func (o LookupServiceLanVpnFeatureResultOutput) Vpn() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) int { return v.Vpn }).(pulumi.IntOutput)
}

// Variable name
func (o LookupServiceLanVpnFeatureResultOutput) VpnVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLanVpnFeatureResult) string { return v.VpnVariable }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServiceLanVpnFeatureResultOutput{})
}