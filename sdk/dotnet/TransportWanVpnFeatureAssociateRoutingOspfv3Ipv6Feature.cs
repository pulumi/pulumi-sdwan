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
    /// This resource can manage a Transport WAN VPN Feature Associate Routing OSPFv3 IPv6 Feature .
    ///   - Minimum SD-WAN Manager version: `20.12.0`
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
    ///     var example = new Sdwan.TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6Feature("example", new()
    ///     {
    ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
    ///         TransportWanVpnFeatureId = "140331f6-5418-4755-a059-13c77eb96037",
    ///         TransportRoutingOspfv3Ipv6FeatureId = "140331f6-5418-4755-a059-13c77eb96037",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// The `pulumi import` command can be used, for example:
    /// 
    /// Expected import identifier with the format: "transport_wan_vpn_feature_associate_routing_ospfv3_ipv6_feature_id,feature_profile_id,transport_wan_vpn_feature_id"
    /// 
    /// ```sh
    /// $ pulumi import sdwan:index/transportWanVpnFeatureAssociateRoutingOspfv3Ipv6Feature:TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6Feature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac,140331f6-5418-4755-a059-13c77eb96037"
    /// ```
    /// </summary>
    [SdwanResourceType("sdwan:index/transportWanVpnFeatureAssociateRoutingOspfv3Ipv6Feature:TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6Feature")]
    public partial class TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6Feature : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Output("featureProfileId")]
        public Output<string> FeatureProfileId { get; private set; } = null!;

        /// <summary>
        /// Transport Routing OSPFv4 IPv6 Feature ID
        /// </summary>
        [Output("transportRoutingOspfv3Ipv6FeatureId")]
        public Output<string> TransportRoutingOspfv3Ipv6FeatureId { get; private set; } = null!;

        /// <summary>
        /// Transport WAN VPN Feature ID
        /// </summary>
        [Output("transportWanVpnFeatureId")]
        public Output<string> TransportWanVpnFeatureId { get; private set; } = null!;

        /// <summary>
        /// The version of the object
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6Feature resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6Feature(string name, TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureArgs args, CustomResourceOptions? options = null)
            : base("sdwan:index/transportWanVpnFeatureAssociateRoutingOspfv3Ipv6Feature:TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6Feature", name, args ?? new TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6Feature(string name, Input<string> id, TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureState? state = null, CustomResourceOptions? options = null)
            : base("sdwan:index/transportWanVpnFeatureAssociateRoutingOspfv3Ipv6Feature:TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6Feature", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6Feature resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6Feature Get(string name, Input<string> id, TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureState? state = null, CustomResourceOptions? options = null)
        {
            return new TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6Feature(name, id, state, options);
        }
    }

    public sealed class TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId", required: true)]
        public Input<string> FeatureProfileId { get; set; } = null!;

        /// <summary>
        /// Transport Routing OSPFv4 IPv6 Feature ID
        /// </summary>
        [Input("transportRoutingOspfv3Ipv6FeatureId", required: true)]
        public Input<string> TransportRoutingOspfv3Ipv6FeatureId { get; set; } = null!;

        /// <summary>
        /// Transport WAN VPN Feature ID
        /// </summary>
        [Input("transportWanVpnFeatureId", required: true)]
        public Input<string> TransportWanVpnFeatureId { get; set; } = null!;

        public TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureArgs()
        {
        }
        public static new TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureArgs Empty => new TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureArgs();
    }

    public sealed class TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId")]
        public Input<string>? FeatureProfileId { get; set; }

        /// <summary>
        /// Transport Routing OSPFv4 IPv6 Feature ID
        /// </summary>
        [Input("transportRoutingOspfv3Ipv6FeatureId")]
        public Input<string>? TransportRoutingOspfv3Ipv6FeatureId { get; set; }

        /// <summary>
        /// Transport WAN VPN Feature ID
        /// </summary>
        [Input("transportWanVpnFeatureId")]
        public Input<string>? TransportWanVpnFeatureId { get; set; }

        /// <summary>
        /// The version of the object
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureState()
        {
        }
        public static new TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureState Empty => new TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureState();
    }
}
