// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    /// <summary>
    /// This resource can manage a Transport WAN VPN Feature.
    ///   - Minimum SD-WAN Manager version: `20.12.0`
    /// 
    /// ## Import
    /// 
    /// The `pulumi import` command can be used, for example:
    /// 
    /// Expected import identifier with the format: "transport_wan_vpn_feature_id,feature_profile_id"
    /// 
    /// ```sh
    /// $ pulumi import sdwan:index/transportWanVpnFeature:TransportWanVpnFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"
    /// ```
    /// </summary>
    [SdwanResourceType("sdwan:index/transportWanVpnFeature:TransportWanVpnFeature")]
    public partial class TransportWanVpnFeature : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the Feature
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Enhance ECMP Keying - Default value: `false`
        /// </summary>
        [Output("enhanceEcmpKeying")]
        public Output<bool?> EnhanceEcmpKeying { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("enhanceEcmpKeyingVariable")]
        public Output<string?> EnhanceEcmpKeyingVariable { get; private set; } = null!;

        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Output("featureProfileId")]
        public Output<string> FeatureProfileId { get; private set; } = null!;

        /// <summary>
        /// IPv4 Static Route
        /// </summary>
        [Output("ipv4StaticRoutes")]
        public Output<ImmutableArray<Outputs.TransportWanVpnFeatureIpv4StaticRoute>> Ipv4StaticRoutes { get; private set; } = null!;

        /// <summary>
        /// IPv6 Static Route
        /// </summary>
        [Output("ipv6StaticRoutes")]
        public Output<ImmutableArray<Outputs.TransportWanVpnFeatureIpv6StaticRoute>> Ipv6StaticRoutes { get; private set; } = null!;

        /// <summary>
        /// The name of the Feature
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// NAT64 V4 Pool
        /// </summary>
        [Output("nat64V4Pools")]
        public Output<ImmutableArray<Outputs.TransportWanVpnFeatureNat64V4Pool>> Nat64V4Pools { get; private set; } = null!;

        [Output("newHostMappings")]
        public Output<ImmutableArray<Outputs.TransportWanVpnFeatureNewHostMapping>> NewHostMappings { get; private set; } = null!;

        /// <summary>
        /// Primary DNS Address (IPv4)
        /// </summary>
        [Output("primaryDnsAddressIpv4")]
        public Output<string?> PrimaryDnsAddressIpv4 { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("primaryDnsAddressIpv4Variable")]
        public Output<string?> PrimaryDnsAddressIpv4Variable { get; private set; } = null!;

        /// <summary>
        /// Primary DNS Address (IPv6)
        /// </summary>
        [Output("primaryDnsAddressIpv6")]
        public Output<string?> PrimaryDnsAddressIpv6 { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("primaryDnsAddressIpv6Variable")]
        public Output<string?> PrimaryDnsAddressIpv6Variable { get; private set; } = null!;

        /// <summary>
        /// Secondary DNS Address (IPv4)
        /// </summary>
        [Output("secondaryDnsAddressIpv4")]
        public Output<string?> SecondaryDnsAddressIpv4 { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("secondaryDnsAddressIpv4Variable")]
        public Output<string?> SecondaryDnsAddressIpv4Variable { get; private set; } = null!;

        /// <summary>
        /// Secondary DNS Address (IPv6)
        /// </summary>
        [Output("secondaryDnsAddressIpv6")]
        public Output<string?> SecondaryDnsAddressIpv6 { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("secondaryDnsAddressIpv6Variable")]
        public Output<string?> SecondaryDnsAddressIpv6Variable { get; private set; } = null!;

        /// <summary>
        /// Service
        /// </summary>
        [Output("services")]
        public Output<ImmutableArray<Outputs.TransportWanVpnFeatureService>> Services { get; private set; } = null!;

        /// <summary>
        /// The version of the Feature
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;

        /// <summary>
        /// VPN - Default value: `0`
        /// </summary>
        [Output("vpn")]
        public Output<int?> Vpn { get; private set; } = null!;


        /// <summary>
        /// Create a TransportWanVpnFeature resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TransportWanVpnFeature(string name, TransportWanVpnFeatureArgs args, CustomResourceOptions? options = null)
            : base("sdwan:index/transportWanVpnFeature:TransportWanVpnFeature", name, args ?? new TransportWanVpnFeatureArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TransportWanVpnFeature(string name, Input<string> id, TransportWanVpnFeatureState? state = null, CustomResourceOptions? options = null)
            : base("sdwan:index/transportWanVpnFeature:TransportWanVpnFeature", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing TransportWanVpnFeature resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TransportWanVpnFeature Get(string name, Input<string> id, TransportWanVpnFeatureState? state = null, CustomResourceOptions? options = null)
        {
            return new TransportWanVpnFeature(name, id, state, options);
        }
    }

    public sealed class TransportWanVpnFeatureArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the Feature
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Enhance ECMP Keying - Default value: `false`
        /// </summary>
        [Input("enhanceEcmpKeying")]
        public Input<bool>? EnhanceEcmpKeying { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("enhanceEcmpKeyingVariable")]
        public Input<string>? EnhanceEcmpKeyingVariable { get; set; }

        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId", required: true)]
        public Input<string> FeatureProfileId { get; set; } = null!;

        [Input("ipv4StaticRoutes")]
        private InputList<Inputs.TransportWanVpnFeatureIpv4StaticRouteArgs>? _ipv4StaticRoutes;

        /// <summary>
        /// IPv4 Static Route
        /// </summary>
        public InputList<Inputs.TransportWanVpnFeatureIpv4StaticRouteArgs> Ipv4StaticRoutes
        {
            get => _ipv4StaticRoutes ?? (_ipv4StaticRoutes = new InputList<Inputs.TransportWanVpnFeatureIpv4StaticRouteArgs>());
            set => _ipv4StaticRoutes = value;
        }

        [Input("ipv6StaticRoutes")]
        private InputList<Inputs.TransportWanVpnFeatureIpv6StaticRouteArgs>? _ipv6StaticRoutes;

        /// <summary>
        /// IPv6 Static Route
        /// </summary>
        public InputList<Inputs.TransportWanVpnFeatureIpv6StaticRouteArgs> Ipv6StaticRoutes
        {
            get => _ipv6StaticRoutes ?? (_ipv6StaticRoutes = new InputList<Inputs.TransportWanVpnFeatureIpv6StaticRouteArgs>());
            set => _ipv6StaticRoutes = value;
        }

        /// <summary>
        /// The name of the Feature
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("nat64V4Pools")]
        private InputList<Inputs.TransportWanVpnFeatureNat64V4PoolArgs>? _nat64V4Pools;

        /// <summary>
        /// NAT64 V4 Pool
        /// </summary>
        public InputList<Inputs.TransportWanVpnFeatureNat64V4PoolArgs> Nat64V4Pools
        {
            get => _nat64V4Pools ?? (_nat64V4Pools = new InputList<Inputs.TransportWanVpnFeatureNat64V4PoolArgs>());
            set => _nat64V4Pools = value;
        }

        [Input("newHostMappings")]
        private InputList<Inputs.TransportWanVpnFeatureNewHostMappingArgs>? _newHostMappings;
        public InputList<Inputs.TransportWanVpnFeatureNewHostMappingArgs> NewHostMappings
        {
            get => _newHostMappings ?? (_newHostMappings = new InputList<Inputs.TransportWanVpnFeatureNewHostMappingArgs>());
            set => _newHostMappings = value;
        }

        /// <summary>
        /// Primary DNS Address (IPv4)
        /// </summary>
        [Input("primaryDnsAddressIpv4")]
        public Input<string>? PrimaryDnsAddressIpv4 { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("primaryDnsAddressIpv4Variable")]
        public Input<string>? PrimaryDnsAddressIpv4Variable { get; set; }

        /// <summary>
        /// Primary DNS Address (IPv6)
        /// </summary>
        [Input("primaryDnsAddressIpv6")]
        public Input<string>? PrimaryDnsAddressIpv6 { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("primaryDnsAddressIpv6Variable")]
        public Input<string>? PrimaryDnsAddressIpv6Variable { get; set; }

        /// <summary>
        /// Secondary DNS Address (IPv4)
        /// </summary>
        [Input("secondaryDnsAddressIpv4")]
        public Input<string>? SecondaryDnsAddressIpv4 { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("secondaryDnsAddressIpv4Variable")]
        public Input<string>? SecondaryDnsAddressIpv4Variable { get; set; }

        /// <summary>
        /// Secondary DNS Address (IPv6)
        /// </summary>
        [Input("secondaryDnsAddressIpv6")]
        public Input<string>? SecondaryDnsAddressIpv6 { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("secondaryDnsAddressIpv6Variable")]
        public Input<string>? SecondaryDnsAddressIpv6Variable { get; set; }

        [Input("services")]
        private InputList<Inputs.TransportWanVpnFeatureServiceArgs>? _services;

        /// <summary>
        /// Service
        /// </summary>
        public InputList<Inputs.TransportWanVpnFeatureServiceArgs> Services
        {
            get => _services ?? (_services = new InputList<Inputs.TransportWanVpnFeatureServiceArgs>());
            set => _services = value;
        }

        /// <summary>
        /// VPN - Default value: `0`
        /// </summary>
        [Input("vpn")]
        public Input<int>? Vpn { get; set; }

        public TransportWanVpnFeatureArgs()
        {
        }
        public static new TransportWanVpnFeatureArgs Empty => new TransportWanVpnFeatureArgs();
    }

    public sealed class TransportWanVpnFeatureState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the Feature
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Enhance ECMP Keying - Default value: `false`
        /// </summary>
        [Input("enhanceEcmpKeying")]
        public Input<bool>? EnhanceEcmpKeying { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("enhanceEcmpKeyingVariable")]
        public Input<string>? EnhanceEcmpKeyingVariable { get; set; }

        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId")]
        public Input<string>? FeatureProfileId { get; set; }

        [Input("ipv4StaticRoutes")]
        private InputList<Inputs.TransportWanVpnFeatureIpv4StaticRouteGetArgs>? _ipv4StaticRoutes;

        /// <summary>
        /// IPv4 Static Route
        /// </summary>
        public InputList<Inputs.TransportWanVpnFeatureIpv4StaticRouteGetArgs> Ipv4StaticRoutes
        {
            get => _ipv4StaticRoutes ?? (_ipv4StaticRoutes = new InputList<Inputs.TransportWanVpnFeatureIpv4StaticRouteGetArgs>());
            set => _ipv4StaticRoutes = value;
        }

        [Input("ipv6StaticRoutes")]
        private InputList<Inputs.TransportWanVpnFeatureIpv6StaticRouteGetArgs>? _ipv6StaticRoutes;

        /// <summary>
        /// IPv6 Static Route
        /// </summary>
        public InputList<Inputs.TransportWanVpnFeatureIpv6StaticRouteGetArgs> Ipv6StaticRoutes
        {
            get => _ipv6StaticRoutes ?? (_ipv6StaticRoutes = new InputList<Inputs.TransportWanVpnFeatureIpv6StaticRouteGetArgs>());
            set => _ipv6StaticRoutes = value;
        }

        /// <summary>
        /// The name of the Feature
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("nat64V4Pools")]
        private InputList<Inputs.TransportWanVpnFeatureNat64V4PoolGetArgs>? _nat64V4Pools;

        /// <summary>
        /// NAT64 V4 Pool
        /// </summary>
        public InputList<Inputs.TransportWanVpnFeatureNat64V4PoolGetArgs> Nat64V4Pools
        {
            get => _nat64V4Pools ?? (_nat64V4Pools = new InputList<Inputs.TransportWanVpnFeatureNat64V4PoolGetArgs>());
            set => _nat64V4Pools = value;
        }

        [Input("newHostMappings")]
        private InputList<Inputs.TransportWanVpnFeatureNewHostMappingGetArgs>? _newHostMappings;
        public InputList<Inputs.TransportWanVpnFeatureNewHostMappingGetArgs> NewHostMappings
        {
            get => _newHostMappings ?? (_newHostMappings = new InputList<Inputs.TransportWanVpnFeatureNewHostMappingGetArgs>());
            set => _newHostMappings = value;
        }

        /// <summary>
        /// Primary DNS Address (IPv4)
        /// </summary>
        [Input("primaryDnsAddressIpv4")]
        public Input<string>? PrimaryDnsAddressIpv4 { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("primaryDnsAddressIpv4Variable")]
        public Input<string>? PrimaryDnsAddressIpv4Variable { get; set; }

        /// <summary>
        /// Primary DNS Address (IPv6)
        /// </summary>
        [Input("primaryDnsAddressIpv6")]
        public Input<string>? PrimaryDnsAddressIpv6 { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("primaryDnsAddressIpv6Variable")]
        public Input<string>? PrimaryDnsAddressIpv6Variable { get; set; }

        /// <summary>
        /// Secondary DNS Address (IPv4)
        /// </summary>
        [Input("secondaryDnsAddressIpv4")]
        public Input<string>? SecondaryDnsAddressIpv4 { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("secondaryDnsAddressIpv4Variable")]
        public Input<string>? SecondaryDnsAddressIpv4Variable { get; set; }

        /// <summary>
        /// Secondary DNS Address (IPv6)
        /// </summary>
        [Input("secondaryDnsAddressIpv6")]
        public Input<string>? SecondaryDnsAddressIpv6 { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("secondaryDnsAddressIpv6Variable")]
        public Input<string>? SecondaryDnsAddressIpv6Variable { get; set; }

        [Input("services")]
        private InputList<Inputs.TransportWanVpnFeatureServiceGetArgs>? _services;

        /// <summary>
        /// Service
        /// </summary>
        public InputList<Inputs.TransportWanVpnFeatureServiceGetArgs> Services
        {
            get => _services ?? (_services = new InputList<Inputs.TransportWanVpnFeatureServiceGetArgs>());
            set => _services = value;
        }

        /// <summary>
        /// The version of the Feature
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        /// <summary>
        /// VPN - Default value: `0`
        /// </summary>
        [Input("vpn")]
        public Input<int>? Vpn { get; set; }

        public TransportWanVpnFeatureState()
        {
        }
        public static new TransportWanVpnFeatureState Empty => new TransportWanVpnFeatureState();
    }
}
