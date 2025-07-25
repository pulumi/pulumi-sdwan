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
    /// This resource can manage a Service LAN VPN Interface GRE Feature.
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
    ///     var example = new Sdwan.ServiceLanVpnInterfaceGreFeature("example", new()
    ///     {
    ///         Name = "Example",
    ///         Description = "My Example",
    ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
    ///         ServiceLanVpnFeatureId = "140331f6-5418-4755-a059-13c77eb96037",
    ///         InterfaceName = "gre1",
    ///         InterfaceDescription = "gre1",
    ///         Ipv4Address = "70.1.1.1",
    ///         Ipv4SubnetMask = "255.255.255.0",
    ///         Shutdown = true,
    ///         TunnelSourceIpv4Address = "78.1.1.1",
    ///         TunnelDestinationIpv4Address = "79.1.1.1",
    ///         IpMtu = 1500,
    ///         TcpMss = 1460,
    ///         ClearDontFragment = false,
    ///         ApplicationTunnelType = "none",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// The `pulumi import` command can be used, for example:
    /// 
    /// Expected import identifier with the format: "service_lan_vpn_interface_gre_feature_id,feature_profile_id,service_lan_vpn_feature_id"
    /// 
    /// ```sh
    /// $ pulumi import sdwan:index/serviceLanVpnInterfaceGreFeature:ServiceLanVpnInterfaceGreFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac,140331f6-5418-4755-a059-13c77eb96037"
    /// ```
    /// </summary>
    [SdwanResourceType("sdwan:index/serviceLanVpnInterfaceGreFeature:ServiceLanVpnInterfaceGreFeature")]
    public partial class ServiceLanVpnInterfaceGreFeature : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Enable Application Tunnel Type - Choices: `none`, `sig`
        /// </summary>
        [Output("applicationTunnelType")]
        public Output<string?> ApplicationTunnelType { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("applicationTunnelTypeVariable")]
        public Output<string?> ApplicationTunnelTypeVariable { get; private set; } = null!;

        /// <summary>
        /// Enable clear dont fragment (Currently Only SDWAN Tunnel Interface) - Default value: `false`
        /// </summary>
        [Output("clearDontFragment")]
        public Output<bool?> ClearDontFragment { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("clearDontFragmentVariable")]
        public Output<string?> ClearDontFragmentVariable { get; private set; } = null!;

        /// <summary>
        /// The description of the Feature
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Output("featureProfileId")]
        public Output<string> FeatureProfileId { get; private set; } = null!;

        /// <summary>
        /// Interface description
        /// </summary>
        [Output("interfaceDescription")]
        public Output<string?> InterfaceDescription { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("interfaceDescriptionVariable")]
        public Output<string?> InterfaceDescriptionVariable { get; private set; } = null!;

        /// <summary>
        /// Interface name (1..255)
        /// </summary>
        [Output("interfaceName")]
        public Output<string?> InterfaceName { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("interfaceNameVariable")]
        public Output<string?> InterfaceNameVariable { get; private set; } = null!;

        /// <summary>
        /// Interface MTU &lt;576..9976&gt;, in bytes - Range: `576`-`9976` - Default value: `1500`
        /// </summary>
        [Output("ipMtu")]
        public Output<int?> IpMtu { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("ipMtuVariable")]
        public Output<string?> IpMtuVariable { get; private set; } = null!;

        [Output("ipv4Address")]
        public Output<string?> Ipv4Address { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("ipv4AddressVariable")]
        public Output<string?> Ipv4AddressVariable { get; private set; } = null!;

        /// <summary>
        /// - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
        /// `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`,
        /// `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`,
        /// `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`,
        /// `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
        /// </summary>
        [Output("ipv4SubnetMask")]
        public Output<string?> Ipv4SubnetMask { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("ipv4SubnetMaskVariable")]
        public Output<string?> Ipv4SubnetMaskVariable { get; private set; } = null!;

        /// <summary>
        /// The name of the Feature
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Service LAN VPN Feature ID
        /// </summary>
        [Output("serviceLanVpnFeatureId")]
        public Output<string> ServiceLanVpnFeatureId { get; private set; } = null!;

        /// <summary>
        /// Administrative state - Default value: `false`
        /// </summary>
        [Output("shutdown")]
        public Output<bool?> Shutdown { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("shutdownVariable")]
        public Output<string?> ShutdownVariable { get; private set; } = null!;

        /// <summary>
        /// TCP MSS on SYN packets, in bytes - Range: `500`-`1460`
        /// </summary>
        [Output("tcpMss")]
        public Output<int?> TcpMss { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("tcpMssVariable")]
        public Output<string?> TcpMssVariable { get; private set; } = null!;

        /// <summary>
        /// Tunnel destination IP Address
        /// </summary>
        [Output("tunnelDestinationIpv4Address")]
        public Output<string?> TunnelDestinationIpv4Address { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("tunnelDestinationIpv4AddressVariable")]
        public Output<string?> TunnelDestinationIpv4AddressVariable { get; private set; } = null!;

        /// <summary>
        /// &lt;1..32 characters&gt; Interface name, can't be Loopback interface
        /// </summary>
        [Output("tunnelRouteViaLoopback")]
        public Output<string?> TunnelRouteViaLoopback { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("tunnelRouteViaLoopbackVariable")]
        public Output<string?> TunnelRouteViaLoopbackVariable { get; private set; } = null!;

        /// <summary>
        /// &lt;1..32 characters&gt; Interface name
        /// </summary>
        [Output("tunnelSourceInterface")]
        public Output<string?> TunnelSourceInterface { get; private set; } = null!;

        /// <summary>
        /// &lt;1..32 characters&gt; Interface name
        /// </summary>
        [Output("tunnelSourceInterfaceLoopback")]
        public Output<string?> TunnelSourceInterfaceLoopback { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("tunnelSourceInterfaceLoopbackVariable")]
        public Output<string?> TunnelSourceInterfaceLoopbackVariable { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("tunnelSourceInterfaceVariable")]
        public Output<string?> TunnelSourceInterfaceVariable { get; private set; } = null!;

        /// <summary>
        /// Tunnel source IP Address
        /// </summary>
        [Output("tunnelSourceIpv4Address")]
        public Output<string?> TunnelSourceIpv4Address { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("tunnelSourceIpv4AddressVariable")]
        public Output<string?> TunnelSourceIpv4AddressVariable { get; private set; } = null!;

        /// <summary>
        /// The version of the Feature
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a ServiceLanVpnInterfaceGreFeature resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServiceLanVpnInterfaceGreFeature(string name, ServiceLanVpnInterfaceGreFeatureArgs args, CustomResourceOptions? options = null)
            : base("sdwan:index/serviceLanVpnInterfaceGreFeature:ServiceLanVpnInterfaceGreFeature", name, args ?? new ServiceLanVpnInterfaceGreFeatureArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServiceLanVpnInterfaceGreFeature(string name, Input<string> id, ServiceLanVpnInterfaceGreFeatureState? state = null, CustomResourceOptions? options = null)
            : base("sdwan:index/serviceLanVpnInterfaceGreFeature:ServiceLanVpnInterfaceGreFeature", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServiceLanVpnInterfaceGreFeature resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServiceLanVpnInterfaceGreFeature Get(string name, Input<string> id, ServiceLanVpnInterfaceGreFeatureState? state = null, CustomResourceOptions? options = null)
        {
            return new ServiceLanVpnInterfaceGreFeature(name, id, state, options);
        }
    }

    public sealed class ServiceLanVpnInterfaceGreFeatureArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable Application Tunnel Type - Choices: `none`, `sig`
        /// </summary>
        [Input("applicationTunnelType")]
        public Input<string>? ApplicationTunnelType { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("applicationTunnelTypeVariable")]
        public Input<string>? ApplicationTunnelTypeVariable { get; set; }

        /// <summary>
        /// Enable clear dont fragment (Currently Only SDWAN Tunnel Interface) - Default value: `false`
        /// </summary>
        [Input("clearDontFragment")]
        public Input<bool>? ClearDontFragment { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("clearDontFragmentVariable")]
        public Input<string>? ClearDontFragmentVariable { get; set; }

        /// <summary>
        /// The description of the Feature
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId", required: true)]
        public Input<string> FeatureProfileId { get; set; } = null!;

        /// <summary>
        /// Interface description
        /// </summary>
        [Input("interfaceDescription")]
        public Input<string>? InterfaceDescription { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("interfaceDescriptionVariable")]
        public Input<string>? InterfaceDescriptionVariable { get; set; }

        /// <summary>
        /// Interface name (1..255)
        /// </summary>
        [Input("interfaceName")]
        public Input<string>? InterfaceName { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("interfaceNameVariable")]
        public Input<string>? InterfaceNameVariable { get; set; }

        /// <summary>
        /// Interface MTU &lt;576..9976&gt;, in bytes - Range: `576`-`9976` - Default value: `1500`
        /// </summary>
        [Input("ipMtu")]
        public Input<int>? IpMtu { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipMtuVariable")]
        public Input<string>? IpMtuVariable { get; set; }

        [Input("ipv4Address")]
        public Input<string>? Ipv4Address { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipv4AddressVariable")]
        public Input<string>? Ipv4AddressVariable { get; set; }

        /// <summary>
        /// - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
        /// `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`,
        /// `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`,
        /// `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`,
        /// `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
        /// </summary>
        [Input("ipv4SubnetMask")]
        public Input<string>? Ipv4SubnetMask { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipv4SubnetMaskVariable")]
        public Input<string>? Ipv4SubnetMaskVariable { get; set; }

        /// <summary>
        /// The name of the Feature
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Service LAN VPN Feature ID
        /// </summary>
        [Input("serviceLanVpnFeatureId", required: true)]
        public Input<string> ServiceLanVpnFeatureId { get; set; } = null!;

        /// <summary>
        /// Administrative state - Default value: `false`
        /// </summary>
        [Input("shutdown")]
        public Input<bool>? Shutdown { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("shutdownVariable")]
        public Input<string>? ShutdownVariable { get; set; }

        /// <summary>
        /// TCP MSS on SYN packets, in bytes - Range: `500`-`1460`
        /// </summary>
        [Input("tcpMss")]
        public Input<int>? TcpMss { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("tcpMssVariable")]
        public Input<string>? TcpMssVariable { get; set; }

        /// <summary>
        /// Tunnel destination IP Address
        /// </summary>
        [Input("tunnelDestinationIpv4Address")]
        public Input<string>? TunnelDestinationIpv4Address { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("tunnelDestinationIpv4AddressVariable")]
        public Input<string>? TunnelDestinationIpv4AddressVariable { get; set; }

        /// <summary>
        /// &lt;1..32 characters&gt; Interface name, can't be Loopback interface
        /// </summary>
        [Input("tunnelRouteViaLoopback")]
        public Input<string>? TunnelRouteViaLoopback { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("tunnelRouteViaLoopbackVariable")]
        public Input<string>? TunnelRouteViaLoopbackVariable { get; set; }

        /// <summary>
        /// &lt;1..32 characters&gt; Interface name
        /// </summary>
        [Input("tunnelSourceInterface")]
        public Input<string>? TunnelSourceInterface { get; set; }

        /// <summary>
        /// &lt;1..32 characters&gt; Interface name
        /// </summary>
        [Input("tunnelSourceInterfaceLoopback")]
        public Input<string>? TunnelSourceInterfaceLoopback { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("tunnelSourceInterfaceLoopbackVariable")]
        public Input<string>? TunnelSourceInterfaceLoopbackVariable { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("tunnelSourceInterfaceVariable")]
        public Input<string>? TunnelSourceInterfaceVariable { get; set; }

        /// <summary>
        /// Tunnel source IP Address
        /// </summary>
        [Input("tunnelSourceIpv4Address")]
        public Input<string>? TunnelSourceIpv4Address { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("tunnelSourceIpv4AddressVariable")]
        public Input<string>? TunnelSourceIpv4AddressVariable { get; set; }

        public ServiceLanVpnInterfaceGreFeatureArgs()
        {
        }
        public static new ServiceLanVpnInterfaceGreFeatureArgs Empty => new ServiceLanVpnInterfaceGreFeatureArgs();
    }

    public sealed class ServiceLanVpnInterfaceGreFeatureState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable Application Tunnel Type - Choices: `none`, `sig`
        /// </summary>
        [Input("applicationTunnelType")]
        public Input<string>? ApplicationTunnelType { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("applicationTunnelTypeVariable")]
        public Input<string>? ApplicationTunnelTypeVariable { get; set; }

        /// <summary>
        /// Enable clear dont fragment (Currently Only SDWAN Tunnel Interface) - Default value: `false`
        /// </summary>
        [Input("clearDontFragment")]
        public Input<bool>? ClearDontFragment { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("clearDontFragmentVariable")]
        public Input<string>? ClearDontFragmentVariable { get; set; }

        /// <summary>
        /// The description of the Feature
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId")]
        public Input<string>? FeatureProfileId { get; set; }

        /// <summary>
        /// Interface description
        /// </summary>
        [Input("interfaceDescription")]
        public Input<string>? InterfaceDescription { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("interfaceDescriptionVariable")]
        public Input<string>? InterfaceDescriptionVariable { get; set; }

        /// <summary>
        /// Interface name (1..255)
        /// </summary>
        [Input("interfaceName")]
        public Input<string>? InterfaceName { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("interfaceNameVariable")]
        public Input<string>? InterfaceNameVariable { get; set; }

        /// <summary>
        /// Interface MTU &lt;576..9976&gt;, in bytes - Range: `576`-`9976` - Default value: `1500`
        /// </summary>
        [Input("ipMtu")]
        public Input<int>? IpMtu { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipMtuVariable")]
        public Input<string>? IpMtuVariable { get; set; }

        [Input("ipv4Address")]
        public Input<string>? Ipv4Address { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipv4AddressVariable")]
        public Input<string>? Ipv4AddressVariable { get; set; }

        /// <summary>
        /// - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
        /// `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`,
        /// `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`,
        /// `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`,
        /// `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
        /// </summary>
        [Input("ipv4SubnetMask")]
        public Input<string>? Ipv4SubnetMask { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipv4SubnetMaskVariable")]
        public Input<string>? Ipv4SubnetMaskVariable { get; set; }

        /// <summary>
        /// The name of the Feature
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Service LAN VPN Feature ID
        /// </summary>
        [Input("serviceLanVpnFeatureId")]
        public Input<string>? ServiceLanVpnFeatureId { get; set; }

        /// <summary>
        /// Administrative state - Default value: `false`
        /// </summary>
        [Input("shutdown")]
        public Input<bool>? Shutdown { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("shutdownVariable")]
        public Input<string>? ShutdownVariable { get; set; }

        /// <summary>
        /// TCP MSS on SYN packets, in bytes - Range: `500`-`1460`
        /// </summary>
        [Input("tcpMss")]
        public Input<int>? TcpMss { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("tcpMssVariable")]
        public Input<string>? TcpMssVariable { get; set; }

        /// <summary>
        /// Tunnel destination IP Address
        /// </summary>
        [Input("tunnelDestinationIpv4Address")]
        public Input<string>? TunnelDestinationIpv4Address { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("tunnelDestinationIpv4AddressVariable")]
        public Input<string>? TunnelDestinationIpv4AddressVariable { get; set; }

        /// <summary>
        /// &lt;1..32 characters&gt; Interface name, can't be Loopback interface
        /// </summary>
        [Input("tunnelRouteViaLoopback")]
        public Input<string>? TunnelRouteViaLoopback { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("tunnelRouteViaLoopbackVariable")]
        public Input<string>? TunnelRouteViaLoopbackVariable { get; set; }

        /// <summary>
        /// &lt;1..32 characters&gt; Interface name
        /// </summary>
        [Input("tunnelSourceInterface")]
        public Input<string>? TunnelSourceInterface { get; set; }

        /// <summary>
        /// &lt;1..32 characters&gt; Interface name
        /// </summary>
        [Input("tunnelSourceInterfaceLoopback")]
        public Input<string>? TunnelSourceInterfaceLoopback { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("tunnelSourceInterfaceLoopbackVariable")]
        public Input<string>? TunnelSourceInterfaceLoopbackVariable { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("tunnelSourceInterfaceVariable")]
        public Input<string>? TunnelSourceInterfaceVariable { get; set; }

        /// <summary>
        /// Tunnel source IP Address
        /// </summary>
        [Input("tunnelSourceIpv4Address")]
        public Input<string>? TunnelSourceIpv4Address { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("tunnelSourceIpv4AddressVariable")]
        public Input<string>? TunnelSourceIpv4AddressVariable { get; set; }

        /// <summary>
        /// The version of the Feature
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public ServiceLanVpnInterfaceGreFeatureState()
        {
        }
        public static new ServiceLanVpnInterfaceGreFeatureState Empty => new ServiceLanVpnInterfaceGreFeatureState();
    }
}
