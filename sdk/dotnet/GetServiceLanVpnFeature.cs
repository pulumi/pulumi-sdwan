// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetServiceLanVpnFeature
    {
        /// <summary>
        /// This data source can read the Service LAN VPN Feature.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Sdwan = Pulumi.Sdwan;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Sdwan.GetServiceLanVpnFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetServiceLanVpnFeatureResult> InvokeAsync(GetServiceLanVpnFeatureArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServiceLanVpnFeatureResult>("sdwan:index/getServiceLanVpnFeature:getServiceLanVpnFeature", args ?? new GetServiceLanVpnFeatureArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Service LAN VPN Feature.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Sdwan = Pulumi.Sdwan;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Sdwan.GetServiceLanVpnFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServiceLanVpnFeatureResult> Invoke(GetServiceLanVpnFeatureInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceLanVpnFeatureResult>("sdwan:index/getServiceLanVpnFeature:getServiceLanVpnFeature", args ?? new GetServiceLanVpnFeatureInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Service LAN VPN Feature.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Sdwan = Pulumi.Sdwan;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Sdwan.GetServiceLanVpnFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServiceLanVpnFeatureResult> Invoke(GetServiceLanVpnFeatureInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceLanVpnFeatureResult>("sdwan:index/getServiceLanVpnFeature:getServiceLanVpnFeature", args ?? new GetServiceLanVpnFeatureInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceLanVpnFeatureArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId", required: true)]
        public string FeatureProfileId { get; set; } = null!;

        /// <summary>
        /// The id of the Feature
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetServiceLanVpnFeatureArgs()
        {
        }
        public static new GetServiceLanVpnFeatureArgs Empty => new GetServiceLanVpnFeatureArgs();
    }

    public sealed class GetServiceLanVpnFeatureInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId", required: true)]
        public Input<string> FeatureProfileId { get; set; } = null!;

        /// <summary>
        /// The id of the Feature
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetServiceLanVpnFeatureInvokeArgs()
        {
        }
        public static new GetServiceLanVpnFeatureInvokeArgs Empty => new GetServiceLanVpnFeatureInvokeArgs();
    }


    [OutputType]
    public sealed class GetServiceLanVpnFeatureResult
    {
        /// <summary>
        /// OMP Advertise IPv4
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceLanVpnFeatureAdvertiseOmpIpv4Result> AdvertiseOmpIpv4s;
        /// <summary>
        /// OMP Advertise IPv6
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceLanVpnFeatureAdvertiseOmpIpv6Result> AdvertiseOmpIpv6s;
        /// <summary>
        /// Name
        /// </summary>
        public readonly string ConfigDescription;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ConfigDescriptionVariable;
        /// <summary>
        /// The description of the Feature
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Enable SDWAN Remote Access
        /// </summary>
        public readonly bool EnableSdwanRemoteAccess;
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        public readonly string FeatureProfileId;
        /// <summary>
        /// IPv4 Static GRE Route
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceLanVpnFeatureGreRouteResult> GreRoutes;
        public readonly ImmutableArray<Outputs.GetServiceLanVpnFeatureHostMappingResult> HostMappings;
        /// <summary>
        /// The id of the Feature
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// IPv4 Static IPSEC Route
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceLanVpnFeatureIpsecRouteResult> IpsecRoutes;
        public readonly ImmutableArray<Outputs.GetServiceLanVpnFeatureIpv4ExportRouteTargetResult> Ipv4ExportRouteTargets;
        public readonly ImmutableArray<Outputs.GetServiceLanVpnFeatureIpv4ImportRouteTargetResult> Ipv4ImportRouteTargets;
        /// <summary>
        /// IPv4 Static Route
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceLanVpnFeatureIpv4StaticRouteResult> Ipv4StaticRoutes;
        public readonly ImmutableArray<Outputs.GetServiceLanVpnFeatureIpv6ExportRouteTargetResult> Ipv6ExportRouteTargets;
        public readonly ImmutableArray<Outputs.GetServiceLanVpnFeatureIpv6ImportRouteTargetResult> Ipv6ImportRouteTargets;
        /// <summary>
        /// IPv6 Static Route
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceLanVpnFeatureIpv6StaticRouteResult> Ipv6StaticRoutes;
        /// <summary>
        /// The name of the Feature
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// NAT64 V4 Pool
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceLanVpnFeatureNat64V4PoolResult> Nat64V4Pools;
        /// <summary>
        /// NAT Pool
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceLanVpnFeatureNatPoolResult> NatPools;
        /// <summary>
        /// NAT Port Forward
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceLanVpnFeatureNatPortForwardResult> NatPortForwards;
        /// <summary>
        /// OMP Admin Distance IPv4
        /// </summary>
        public readonly int OmpAdminDistanceIpv4;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string OmpAdminDistanceIpv4Variable;
        /// <summary>
        /// OMP Admin Distance IPv6
        /// </summary>
        public readonly int OmpAdminDistanceIpv6;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string OmpAdminDistanceIpv6Variable;
        /// <summary>
        /// Primary DNS Address (IPv4)
        /// </summary>
        public readonly string PrimaryDnsAddressIpv4;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string PrimaryDnsAddressIpv4Variable;
        /// <summary>
        /// Primary DNS Address (IPv6)
        /// </summary>
        public readonly string PrimaryDnsAddressIpv6;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string PrimaryDnsAddressIpv6Variable;
        /// <summary>
        /// Enable route leaking from Global to Service VPN
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceLanVpnFeatureRouteLeakFromGlobalVpnResult> RouteLeakFromGlobalVpns;
        /// <summary>
        /// Enable route leak from another Service VPN to current Service VPN
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceLanVpnFeatureRouteLeakFromOtherServiceResult> RouteLeakFromOtherServices;
        /// <summary>
        /// Enable route leaking from Service to Global VPN
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceLanVpnFeatureRouteLeakToGlobalVpnResult> RouteLeakToGlobalVpns;
        /// <summary>
        /// Secondary DNS Address (IPv4)
        /// </summary>
        public readonly string SecondaryDnsAddressIpv4;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string SecondaryDnsAddressIpv4Variable;
        /// <summary>
        /// Secondary DNS Address (IPv6)
        /// </summary>
        public readonly string SecondaryDnsAddressIpv6;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string SecondaryDnsAddressIpv6Variable;
        /// <summary>
        /// Service
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceLanVpnFeatureServiceRouteResult> ServiceRoutes;
        /// <summary>
        /// Service
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceLanVpnFeatureServiceResult> Services;
        /// <summary>
        /// Static NAT Rules
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceLanVpnFeatureStaticNatResult> StaticNats;
        /// <summary>
        /// The version of the Feature
        /// </summary>
        public readonly int Version;
        /// <summary>
        /// VPN
        /// </summary>
        public readonly int Vpn;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string VpnVariable;

        [OutputConstructor]
        private GetServiceLanVpnFeatureResult(
            ImmutableArray<Outputs.GetServiceLanVpnFeatureAdvertiseOmpIpv4Result> advertiseOmpIpv4s,

            ImmutableArray<Outputs.GetServiceLanVpnFeatureAdvertiseOmpIpv6Result> advertiseOmpIpv6s,

            string configDescription,

            string configDescriptionVariable,

            string description,

            bool enableSdwanRemoteAccess,

            string featureProfileId,

            ImmutableArray<Outputs.GetServiceLanVpnFeatureGreRouteResult> greRoutes,

            ImmutableArray<Outputs.GetServiceLanVpnFeatureHostMappingResult> hostMappings,

            string id,

            ImmutableArray<Outputs.GetServiceLanVpnFeatureIpsecRouteResult> ipsecRoutes,

            ImmutableArray<Outputs.GetServiceLanVpnFeatureIpv4ExportRouteTargetResult> ipv4ExportRouteTargets,

            ImmutableArray<Outputs.GetServiceLanVpnFeatureIpv4ImportRouteTargetResult> ipv4ImportRouteTargets,

            ImmutableArray<Outputs.GetServiceLanVpnFeatureIpv4StaticRouteResult> ipv4StaticRoutes,

            ImmutableArray<Outputs.GetServiceLanVpnFeatureIpv6ExportRouteTargetResult> ipv6ExportRouteTargets,

            ImmutableArray<Outputs.GetServiceLanVpnFeatureIpv6ImportRouteTargetResult> ipv6ImportRouteTargets,

            ImmutableArray<Outputs.GetServiceLanVpnFeatureIpv6StaticRouteResult> ipv6StaticRoutes,

            string name,

            ImmutableArray<Outputs.GetServiceLanVpnFeatureNat64V4PoolResult> nat64V4Pools,

            ImmutableArray<Outputs.GetServiceLanVpnFeatureNatPoolResult> natPools,

            ImmutableArray<Outputs.GetServiceLanVpnFeatureNatPortForwardResult> natPortForwards,

            int ompAdminDistanceIpv4,

            string ompAdminDistanceIpv4Variable,

            int ompAdminDistanceIpv6,

            string ompAdminDistanceIpv6Variable,

            string primaryDnsAddressIpv4,

            string primaryDnsAddressIpv4Variable,

            string primaryDnsAddressIpv6,

            string primaryDnsAddressIpv6Variable,

            ImmutableArray<Outputs.GetServiceLanVpnFeatureRouteLeakFromGlobalVpnResult> routeLeakFromGlobalVpns,

            ImmutableArray<Outputs.GetServiceLanVpnFeatureRouteLeakFromOtherServiceResult> routeLeakFromOtherServices,

            ImmutableArray<Outputs.GetServiceLanVpnFeatureRouteLeakToGlobalVpnResult> routeLeakToGlobalVpns,

            string secondaryDnsAddressIpv4,

            string secondaryDnsAddressIpv4Variable,

            string secondaryDnsAddressIpv6,

            string secondaryDnsAddressIpv6Variable,

            ImmutableArray<Outputs.GetServiceLanVpnFeatureServiceRouteResult> serviceRoutes,

            ImmutableArray<Outputs.GetServiceLanVpnFeatureServiceResult> services,

            ImmutableArray<Outputs.GetServiceLanVpnFeatureStaticNatResult> staticNats,

            int version,

            int vpn,

            string vpnVariable)
        {
            AdvertiseOmpIpv4s = advertiseOmpIpv4s;
            AdvertiseOmpIpv6s = advertiseOmpIpv6s;
            ConfigDescription = configDescription;
            ConfigDescriptionVariable = configDescriptionVariable;
            Description = description;
            EnableSdwanRemoteAccess = enableSdwanRemoteAccess;
            FeatureProfileId = featureProfileId;
            GreRoutes = greRoutes;
            HostMappings = hostMappings;
            Id = id;
            IpsecRoutes = ipsecRoutes;
            Ipv4ExportRouteTargets = ipv4ExportRouteTargets;
            Ipv4ImportRouteTargets = ipv4ImportRouteTargets;
            Ipv4StaticRoutes = ipv4StaticRoutes;
            Ipv6ExportRouteTargets = ipv6ExportRouteTargets;
            Ipv6ImportRouteTargets = ipv6ImportRouteTargets;
            Ipv6StaticRoutes = ipv6StaticRoutes;
            Name = name;
            Nat64V4Pools = nat64V4Pools;
            NatPools = natPools;
            NatPortForwards = natPortForwards;
            OmpAdminDistanceIpv4 = ompAdminDistanceIpv4;
            OmpAdminDistanceIpv4Variable = ompAdminDistanceIpv4Variable;
            OmpAdminDistanceIpv6 = ompAdminDistanceIpv6;
            OmpAdminDistanceIpv6Variable = ompAdminDistanceIpv6Variable;
            PrimaryDnsAddressIpv4 = primaryDnsAddressIpv4;
            PrimaryDnsAddressIpv4Variable = primaryDnsAddressIpv4Variable;
            PrimaryDnsAddressIpv6 = primaryDnsAddressIpv6;
            PrimaryDnsAddressIpv6Variable = primaryDnsAddressIpv6Variable;
            RouteLeakFromGlobalVpns = routeLeakFromGlobalVpns;
            RouteLeakFromOtherServices = routeLeakFromOtherServices;
            RouteLeakToGlobalVpns = routeLeakToGlobalVpns;
            SecondaryDnsAddressIpv4 = secondaryDnsAddressIpv4;
            SecondaryDnsAddressIpv4Variable = secondaryDnsAddressIpv4Variable;
            SecondaryDnsAddressIpv6 = secondaryDnsAddressIpv6;
            SecondaryDnsAddressIpv6Variable = secondaryDnsAddressIpv6Variable;
            ServiceRoutes = serviceRoutes;
            Services = services;
            StaticNats = staticNats;
            Version = version;
            Vpn = vpn;
            VpnVariable = vpnVariable;
        }
    }
}
