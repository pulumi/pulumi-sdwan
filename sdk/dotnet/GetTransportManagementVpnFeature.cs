// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetTransportManagementVpnFeature
    {
        /// <summary>
        /// This data source can read the Transport Management VPN Feature.
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
        ///     var example = Sdwan.GetTransportManagementVpnFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetTransportManagementVpnFeatureResult> InvokeAsync(GetTransportManagementVpnFeatureArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTransportManagementVpnFeatureResult>("sdwan:index/getTransportManagementVpnFeature:getTransportManagementVpnFeature", args ?? new GetTransportManagementVpnFeatureArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Transport Management VPN Feature.
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
        ///     var example = Sdwan.GetTransportManagementVpnFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTransportManagementVpnFeatureResult> Invoke(GetTransportManagementVpnFeatureInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTransportManagementVpnFeatureResult>("sdwan:index/getTransportManagementVpnFeature:getTransportManagementVpnFeature", args ?? new GetTransportManagementVpnFeatureInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTransportManagementVpnFeatureArgs : global::Pulumi.InvokeArgs
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

        public GetTransportManagementVpnFeatureArgs()
        {
        }
        public static new GetTransportManagementVpnFeatureArgs Empty => new GetTransportManagementVpnFeatureArgs();
    }

    public sealed class GetTransportManagementVpnFeatureInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetTransportManagementVpnFeatureInvokeArgs()
        {
        }
        public static new GetTransportManagementVpnFeatureInvokeArgs Empty => new GetTransportManagementVpnFeatureInvokeArgs();
    }


    [OutputType]
    public sealed class GetTransportManagementVpnFeatureResult
    {
        /// <summary>
        /// The description of the Feature
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        public readonly string FeatureProfileId;
        /// <summary>
        /// The id of the Feature
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// IPv4 Static Route
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTransportManagementVpnFeatureIpv4StaticRouteResult> Ipv4StaticRoutes;
        /// <summary>
        /// IPv6 Static Route
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTransportManagementVpnFeatureIpv6StaticRouteResult> Ipv6StaticRoutes;
        /// <summary>
        /// The name of the Feature
        /// </summary>
        public readonly string Name;
        public readonly ImmutableArray<Outputs.GetTransportManagementVpnFeatureNewHostMappingResult> NewHostMappings;
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
        /// The version of the Feature
        /// </summary>
        public readonly int Version;
        /// <summary>
        /// Name
        /// </summary>
        public readonly string VpnDescription;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string VpnDescriptionVariable;

        [OutputConstructor]
        private GetTransportManagementVpnFeatureResult(
            string description,

            string featureProfileId,

            string id,

            ImmutableArray<Outputs.GetTransportManagementVpnFeatureIpv4StaticRouteResult> ipv4StaticRoutes,

            ImmutableArray<Outputs.GetTransportManagementVpnFeatureIpv6StaticRouteResult> ipv6StaticRoutes,

            string name,

            ImmutableArray<Outputs.GetTransportManagementVpnFeatureNewHostMappingResult> newHostMappings,

            string primaryDnsAddressIpv4,

            string primaryDnsAddressIpv4Variable,

            string primaryDnsAddressIpv6,

            string primaryDnsAddressIpv6Variable,

            string secondaryDnsAddressIpv4,

            string secondaryDnsAddressIpv4Variable,

            string secondaryDnsAddressIpv6,

            string secondaryDnsAddressIpv6Variable,

            int version,

            string vpnDescription,

            string vpnDescriptionVariable)
        {
            Description = description;
            FeatureProfileId = featureProfileId;
            Id = id;
            Ipv4StaticRoutes = ipv4StaticRoutes;
            Ipv6StaticRoutes = ipv6StaticRoutes;
            Name = name;
            NewHostMappings = newHostMappings;
            PrimaryDnsAddressIpv4 = primaryDnsAddressIpv4;
            PrimaryDnsAddressIpv4Variable = primaryDnsAddressIpv4Variable;
            PrimaryDnsAddressIpv6 = primaryDnsAddressIpv6;
            PrimaryDnsAddressIpv6Variable = primaryDnsAddressIpv6Variable;
            SecondaryDnsAddressIpv4 = secondaryDnsAddressIpv4;
            SecondaryDnsAddressIpv4Variable = secondaryDnsAddressIpv4Variable;
            SecondaryDnsAddressIpv6 = secondaryDnsAddressIpv6;
            SecondaryDnsAddressIpv6Variable = secondaryDnsAddressIpv6Variable;
            Version = version;
            VpnDescription = vpnDescription;
            VpnDescriptionVariable = vpnDescriptionVariable;
        }
    }
}