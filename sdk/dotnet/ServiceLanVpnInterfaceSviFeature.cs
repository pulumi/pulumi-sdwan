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
    /// This resource can manage a Service LAN VPN Interface SVI Feature.
    ///   - Minimum SD-WAN Manager version: `20.12.0`
    /// 
    /// ## Import
    /// 
    /// The `pulumi import` command can be used, for example:
    /// 
    /// Expected import identifier with the format: "service_lan_vpn_interface_svi_feature_id,feature_profile_id,service_lan_vpn_feature_id"
    /// 
    /// ```sh
    /// $ pulumi import sdwan:index/serviceLanVpnInterfaceSviFeature:ServiceLanVpnInterfaceSviFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac,140331f6-5418-4755-a059-13c77eb96037"
    /// ```
    /// </summary>
    [SdwanResourceType("sdwan:index/serviceLanVpnInterfaceSviFeature:ServiceLanVpnInterfaceSviFeature")]
    public partial class ServiceLanVpnInterfaceSviFeature : global::Pulumi.CustomResource
    {
        [Output("aclIpv4EgressFeatureId")]
        public Output<string?> AclIpv4EgressFeatureId { get; private set; } = null!;

        [Output("aclIpv4IngressFeatureId")]
        public Output<string?> AclIpv4IngressFeatureId { get; private set; } = null!;

        [Output("aclIpv6EgressFeatureId")]
        public Output<string?> AclIpv6EgressFeatureId { get; private set; } = null!;

        [Output("aclIpv6IngressFeatureId")]
        public Output<string?> AclIpv6IngressFeatureId { get; private set; } = null!;

        /// <summary>
        /// Timeout value for dynamically learned ARP entries, &lt;0..2678400&gt; seconds - Range: `0`-`2678400` - Default value: `1200`
        /// </summary>
        [Output("arpTimeout")]
        public Output<int?> ArpTimeout { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("arpTimeoutVariable")]
        public Output<string?> ArpTimeoutVariable { get; private set; } = null!;

        /// <summary>
        /// Configure static ARP entries
        /// </summary>
        [Output("arps")]
        public Output<ImmutableArray<Outputs.ServiceLanVpnInterfaceSviFeatureArp>> Arps { get; private set; } = null!;

        /// <summary>
        /// The description of the Feature
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Enable DHCPv6 - Default value: `false`
        /// </summary>
        [Output("enableDhcpv6")]
        public Output<bool?> EnableDhcpv6 { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("enableDhcpv6Variable")]
        public Output<string?> EnableDhcpv6Variable { get; private set; } = null!;

        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Output("featureProfileId")]
        public Output<string> FeatureProfileId { get; private set; } = null!;

        /// <summary>
        /// ICMP/ICMPv6 Redirect Disable - Default value: `true`
        /// </summary>
        [Output("icmpRedirectDisable")]
        public Output<bool?> IcmpRedirectDisable { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("icmpRedirectDisableVariable")]
        public Output<string?> IcmpRedirectDisableVariable { get; private set; } = null!;

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
        /// Interface MTU &lt;1500..9216&gt; in bytes - Range: `1500`-`9216` - Default value: `1500`
        /// </summary>
        [Output("interfaceMtu")]
        public Output<int?> InterfaceMtu { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("interfaceMtuVariable")]
        public Output<string?> InterfaceMtuVariable { get; private set; } = null!;

        /// <summary>
        /// Interface name: VLAN 1 - VLAN 4094 when present
        /// </summary>
        [Output("interfaceName")]
        public Output<string?> InterfaceName { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("interfaceNameVariable")]
        public Output<string?> InterfaceNameVariable { get; private set; } = null!;

        /// <summary>
        /// IP Directed-Broadcast - Default value: `false`
        /// </summary>
        [Output("ipDirectedBroadcast")]
        public Output<bool?> IpDirectedBroadcast { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("ipDirectedBroadcastVariable")]
        public Output<string?> IpDirectedBroadcastVariable { get; private set; } = null!;

        /// <summary>
        /// IP MTU &lt;576..Interface MTU&gt;, in bytes - Range: `576`-`9216` - Default value: `1500`
        /// </summary>
        [Output("ipMtu")]
        public Output<int?> IpMtu { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("ipMtuVariable")]
        public Output<string?> IpMtuVariable { get; private set; } = null!;

        /// <summary>
        /// IP Address
        /// </summary>
        [Output("ipv4Address")]
        public Output<string?> Ipv4Address { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("ipv4AddressVariable")]
        public Output<string?> Ipv4AddressVariable { get; private set; } = null!;

        /// <summary>
        /// List of DHCP helper addresses
        /// </summary>
        [Output("ipv4DhcpHelpers")]
        public Output<ImmutableArray<string>> Ipv4DhcpHelpers { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("ipv4DhcpHelpersVariable")]
        public Output<string?> Ipv4DhcpHelpersVariable { get; private set; } = null!;

        /// <summary>
        /// Assign secondary IP addresses
        /// </summary>
        [Output("ipv4SecondaryAddresses")]
        public Output<ImmutableArray<Outputs.ServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddress>> Ipv4SecondaryAddresses { get; private set; } = null!;

        /// <summary>
        /// Subnet Mask - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
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
        /// Enable ipv4 VRRP
        /// </summary>
        [Output("ipv4Vrrps")]
        public Output<ImmutableArray<Outputs.ServiceLanVpnInterfaceSviFeatureIpv4Vrrp>> Ipv4Vrrps { get; private set; } = null!;

        /// <summary>
        /// Assign IPv6 address
        /// </summary>
        [Output("ipv6Address")]
        public Output<string?> Ipv6Address { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("ipv6AddressVariable")]
        public Output<string?> Ipv6AddressVariable { get; private set; } = null!;

        /// <summary>
        /// DHCPv6 Helper
        /// </summary>
        [Output("ipv6DhcpHelpers")]
        public Output<ImmutableArray<Outputs.ServiceLanVpnInterfaceSviFeatureIpv6DhcpHelper>> Ipv6DhcpHelpers { get; private set; } = null!;

        /// <summary>
        /// Assign secondary IPv6 addresses
        /// </summary>
        [Output("ipv6SecondaryAddresses")]
        public Output<ImmutableArray<Outputs.ServiceLanVpnInterfaceSviFeatureIpv6SecondaryAddress>> Ipv6SecondaryAddresses { get; private set; } = null!;

        /// <summary>
        /// Enable ipv6 VRRP
        /// </summary>
        [Output("ipv6Vrrps")]
        public Output<ImmutableArray<Outputs.ServiceLanVpnInterfaceSviFeatureIpv6Vrrp>> Ipv6Vrrps { get; private set; } = null!;

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
        /// Administrative state - Default value: `true`
        /// </summary>
        [Output("shutdown")]
        public Output<bool?> Shutdown { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("shutdownVariable")]
        public Output<string?> ShutdownVariable { get; private set; } = null!;

        /// <summary>
        /// TCP MSS on SYN packets, in bytes - Range: `552`-`1960`
        /// </summary>
        [Output("tcpMss")]
        public Output<int?> TcpMss { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("tcpMssVariable")]
        public Output<string?> TcpMssVariable { get; private set; } = null!;

        /// <summary>
        /// The version of the Feature
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a ServiceLanVpnInterfaceSviFeature resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServiceLanVpnInterfaceSviFeature(string name, ServiceLanVpnInterfaceSviFeatureArgs args, CustomResourceOptions? options = null)
            : base("sdwan:index/serviceLanVpnInterfaceSviFeature:ServiceLanVpnInterfaceSviFeature", name, args ?? new ServiceLanVpnInterfaceSviFeatureArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServiceLanVpnInterfaceSviFeature(string name, Input<string> id, ServiceLanVpnInterfaceSviFeatureState? state = null, CustomResourceOptions? options = null)
            : base("sdwan:index/serviceLanVpnInterfaceSviFeature:ServiceLanVpnInterfaceSviFeature", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServiceLanVpnInterfaceSviFeature resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServiceLanVpnInterfaceSviFeature Get(string name, Input<string> id, ServiceLanVpnInterfaceSviFeatureState? state = null, CustomResourceOptions? options = null)
        {
            return new ServiceLanVpnInterfaceSviFeature(name, id, state, options);
        }
    }

    public sealed class ServiceLanVpnInterfaceSviFeatureArgs : global::Pulumi.ResourceArgs
    {
        [Input("aclIpv4EgressFeatureId")]
        public Input<string>? AclIpv4EgressFeatureId { get; set; }

        [Input("aclIpv4IngressFeatureId")]
        public Input<string>? AclIpv4IngressFeatureId { get; set; }

        [Input("aclIpv6EgressFeatureId")]
        public Input<string>? AclIpv6EgressFeatureId { get; set; }

        [Input("aclIpv6IngressFeatureId")]
        public Input<string>? AclIpv6IngressFeatureId { get; set; }

        /// <summary>
        /// Timeout value for dynamically learned ARP entries, &lt;0..2678400&gt; seconds - Range: `0`-`2678400` - Default value: `1200`
        /// </summary>
        [Input("arpTimeout")]
        public Input<int>? ArpTimeout { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("arpTimeoutVariable")]
        public Input<string>? ArpTimeoutVariable { get; set; }

        [Input("arps")]
        private InputList<Inputs.ServiceLanVpnInterfaceSviFeatureArpArgs>? _arps;

        /// <summary>
        /// Configure static ARP entries
        /// </summary>
        public InputList<Inputs.ServiceLanVpnInterfaceSviFeatureArpArgs> Arps
        {
            get => _arps ?? (_arps = new InputList<Inputs.ServiceLanVpnInterfaceSviFeatureArpArgs>());
            set => _arps = value;
        }

        /// <summary>
        /// The description of the Feature
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Enable DHCPv6 - Default value: `false`
        /// </summary>
        [Input("enableDhcpv6")]
        public Input<bool>? EnableDhcpv6 { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("enableDhcpv6Variable")]
        public Input<string>? EnableDhcpv6Variable { get; set; }

        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId", required: true)]
        public Input<string> FeatureProfileId { get; set; } = null!;

        /// <summary>
        /// ICMP/ICMPv6 Redirect Disable - Default value: `true`
        /// </summary>
        [Input("icmpRedirectDisable")]
        public Input<bool>? IcmpRedirectDisable { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("icmpRedirectDisableVariable")]
        public Input<string>? IcmpRedirectDisableVariable { get; set; }

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
        /// Interface MTU &lt;1500..9216&gt; in bytes - Range: `1500`-`9216` - Default value: `1500`
        /// </summary>
        [Input("interfaceMtu")]
        public Input<int>? InterfaceMtu { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("interfaceMtuVariable")]
        public Input<string>? InterfaceMtuVariable { get; set; }

        /// <summary>
        /// Interface name: VLAN 1 - VLAN 4094 when present
        /// </summary>
        [Input("interfaceName")]
        public Input<string>? InterfaceName { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("interfaceNameVariable")]
        public Input<string>? InterfaceNameVariable { get; set; }

        /// <summary>
        /// IP Directed-Broadcast - Default value: `false`
        /// </summary>
        [Input("ipDirectedBroadcast")]
        public Input<bool>? IpDirectedBroadcast { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipDirectedBroadcastVariable")]
        public Input<string>? IpDirectedBroadcastVariable { get; set; }

        /// <summary>
        /// IP MTU &lt;576..Interface MTU&gt;, in bytes - Range: `576`-`9216` - Default value: `1500`
        /// </summary>
        [Input("ipMtu")]
        public Input<int>? IpMtu { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipMtuVariable")]
        public Input<string>? IpMtuVariable { get; set; }

        /// <summary>
        /// IP Address
        /// </summary>
        [Input("ipv4Address")]
        public Input<string>? Ipv4Address { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipv4AddressVariable")]
        public Input<string>? Ipv4AddressVariable { get; set; }

        [Input("ipv4DhcpHelpers")]
        private InputList<string>? _ipv4DhcpHelpers;

        /// <summary>
        /// List of DHCP helper addresses
        /// </summary>
        public InputList<string> Ipv4DhcpHelpers
        {
            get => _ipv4DhcpHelpers ?? (_ipv4DhcpHelpers = new InputList<string>());
            set => _ipv4DhcpHelpers = value;
        }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipv4DhcpHelpersVariable")]
        public Input<string>? Ipv4DhcpHelpersVariable { get; set; }

        [Input("ipv4SecondaryAddresses")]
        private InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddressArgs>? _ipv4SecondaryAddresses;

        /// <summary>
        /// Assign secondary IP addresses
        /// </summary>
        public InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddressArgs> Ipv4SecondaryAddresses
        {
            get => _ipv4SecondaryAddresses ?? (_ipv4SecondaryAddresses = new InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddressArgs>());
            set => _ipv4SecondaryAddresses = value;
        }

        /// <summary>
        /// Subnet Mask - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
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

        [Input("ipv4Vrrps")]
        private InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv4VrrpArgs>? _ipv4Vrrps;

        /// <summary>
        /// Enable ipv4 VRRP
        /// </summary>
        public InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv4VrrpArgs> Ipv4Vrrps
        {
            get => _ipv4Vrrps ?? (_ipv4Vrrps = new InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv4VrrpArgs>());
            set => _ipv4Vrrps = value;
        }

        /// <summary>
        /// Assign IPv6 address
        /// </summary>
        [Input("ipv6Address")]
        public Input<string>? Ipv6Address { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipv6AddressVariable")]
        public Input<string>? Ipv6AddressVariable { get; set; }

        [Input("ipv6DhcpHelpers")]
        private InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv6DhcpHelperArgs>? _ipv6DhcpHelpers;

        /// <summary>
        /// DHCPv6 Helper
        /// </summary>
        public InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv6DhcpHelperArgs> Ipv6DhcpHelpers
        {
            get => _ipv6DhcpHelpers ?? (_ipv6DhcpHelpers = new InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv6DhcpHelperArgs>());
            set => _ipv6DhcpHelpers = value;
        }

        [Input("ipv6SecondaryAddresses")]
        private InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv6SecondaryAddressArgs>? _ipv6SecondaryAddresses;

        /// <summary>
        /// Assign secondary IPv6 addresses
        /// </summary>
        public InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv6SecondaryAddressArgs> Ipv6SecondaryAddresses
        {
            get => _ipv6SecondaryAddresses ?? (_ipv6SecondaryAddresses = new InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv6SecondaryAddressArgs>());
            set => _ipv6SecondaryAddresses = value;
        }

        [Input("ipv6Vrrps")]
        private InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv6VrrpArgs>? _ipv6Vrrps;

        /// <summary>
        /// Enable ipv6 VRRP
        /// </summary>
        public InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv6VrrpArgs> Ipv6Vrrps
        {
            get => _ipv6Vrrps ?? (_ipv6Vrrps = new InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv6VrrpArgs>());
            set => _ipv6Vrrps = value;
        }

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
        /// Administrative state - Default value: `true`
        /// </summary>
        [Input("shutdown")]
        public Input<bool>? Shutdown { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("shutdownVariable")]
        public Input<string>? ShutdownVariable { get; set; }

        /// <summary>
        /// TCP MSS on SYN packets, in bytes - Range: `552`-`1960`
        /// </summary>
        [Input("tcpMss")]
        public Input<int>? TcpMss { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("tcpMssVariable")]
        public Input<string>? TcpMssVariable { get; set; }

        public ServiceLanVpnInterfaceSviFeatureArgs()
        {
        }
        public static new ServiceLanVpnInterfaceSviFeatureArgs Empty => new ServiceLanVpnInterfaceSviFeatureArgs();
    }

    public sealed class ServiceLanVpnInterfaceSviFeatureState : global::Pulumi.ResourceArgs
    {
        [Input("aclIpv4EgressFeatureId")]
        public Input<string>? AclIpv4EgressFeatureId { get; set; }

        [Input("aclIpv4IngressFeatureId")]
        public Input<string>? AclIpv4IngressFeatureId { get; set; }

        [Input("aclIpv6EgressFeatureId")]
        public Input<string>? AclIpv6EgressFeatureId { get; set; }

        [Input("aclIpv6IngressFeatureId")]
        public Input<string>? AclIpv6IngressFeatureId { get; set; }

        /// <summary>
        /// Timeout value for dynamically learned ARP entries, &lt;0..2678400&gt; seconds - Range: `0`-`2678400` - Default value: `1200`
        /// </summary>
        [Input("arpTimeout")]
        public Input<int>? ArpTimeout { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("arpTimeoutVariable")]
        public Input<string>? ArpTimeoutVariable { get; set; }

        [Input("arps")]
        private InputList<Inputs.ServiceLanVpnInterfaceSviFeatureArpGetArgs>? _arps;

        /// <summary>
        /// Configure static ARP entries
        /// </summary>
        public InputList<Inputs.ServiceLanVpnInterfaceSviFeatureArpGetArgs> Arps
        {
            get => _arps ?? (_arps = new InputList<Inputs.ServiceLanVpnInterfaceSviFeatureArpGetArgs>());
            set => _arps = value;
        }

        /// <summary>
        /// The description of the Feature
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Enable DHCPv6 - Default value: `false`
        /// </summary>
        [Input("enableDhcpv6")]
        public Input<bool>? EnableDhcpv6 { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("enableDhcpv6Variable")]
        public Input<string>? EnableDhcpv6Variable { get; set; }

        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId")]
        public Input<string>? FeatureProfileId { get; set; }

        /// <summary>
        /// ICMP/ICMPv6 Redirect Disable - Default value: `true`
        /// </summary>
        [Input("icmpRedirectDisable")]
        public Input<bool>? IcmpRedirectDisable { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("icmpRedirectDisableVariable")]
        public Input<string>? IcmpRedirectDisableVariable { get; set; }

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
        /// Interface MTU &lt;1500..9216&gt; in bytes - Range: `1500`-`9216` - Default value: `1500`
        /// </summary>
        [Input("interfaceMtu")]
        public Input<int>? InterfaceMtu { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("interfaceMtuVariable")]
        public Input<string>? InterfaceMtuVariable { get; set; }

        /// <summary>
        /// Interface name: VLAN 1 - VLAN 4094 when present
        /// </summary>
        [Input("interfaceName")]
        public Input<string>? InterfaceName { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("interfaceNameVariable")]
        public Input<string>? InterfaceNameVariable { get; set; }

        /// <summary>
        /// IP Directed-Broadcast - Default value: `false`
        /// </summary>
        [Input("ipDirectedBroadcast")]
        public Input<bool>? IpDirectedBroadcast { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipDirectedBroadcastVariable")]
        public Input<string>? IpDirectedBroadcastVariable { get; set; }

        /// <summary>
        /// IP MTU &lt;576..Interface MTU&gt;, in bytes - Range: `576`-`9216` - Default value: `1500`
        /// </summary>
        [Input("ipMtu")]
        public Input<int>? IpMtu { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipMtuVariable")]
        public Input<string>? IpMtuVariable { get; set; }

        /// <summary>
        /// IP Address
        /// </summary>
        [Input("ipv4Address")]
        public Input<string>? Ipv4Address { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipv4AddressVariable")]
        public Input<string>? Ipv4AddressVariable { get; set; }

        [Input("ipv4DhcpHelpers")]
        private InputList<string>? _ipv4DhcpHelpers;

        /// <summary>
        /// List of DHCP helper addresses
        /// </summary>
        public InputList<string> Ipv4DhcpHelpers
        {
            get => _ipv4DhcpHelpers ?? (_ipv4DhcpHelpers = new InputList<string>());
            set => _ipv4DhcpHelpers = value;
        }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipv4DhcpHelpersVariable")]
        public Input<string>? Ipv4DhcpHelpersVariable { get; set; }

        [Input("ipv4SecondaryAddresses")]
        private InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddressGetArgs>? _ipv4SecondaryAddresses;

        /// <summary>
        /// Assign secondary IP addresses
        /// </summary>
        public InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddressGetArgs> Ipv4SecondaryAddresses
        {
            get => _ipv4SecondaryAddresses ?? (_ipv4SecondaryAddresses = new InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddressGetArgs>());
            set => _ipv4SecondaryAddresses = value;
        }

        /// <summary>
        /// Subnet Mask - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
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

        [Input("ipv4Vrrps")]
        private InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv4VrrpGetArgs>? _ipv4Vrrps;

        /// <summary>
        /// Enable ipv4 VRRP
        /// </summary>
        public InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv4VrrpGetArgs> Ipv4Vrrps
        {
            get => _ipv4Vrrps ?? (_ipv4Vrrps = new InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv4VrrpGetArgs>());
            set => _ipv4Vrrps = value;
        }

        /// <summary>
        /// Assign IPv6 address
        /// </summary>
        [Input("ipv6Address")]
        public Input<string>? Ipv6Address { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipv6AddressVariable")]
        public Input<string>? Ipv6AddressVariable { get; set; }

        [Input("ipv6DhcpHelpers")]
        private InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv6DhcpHelperGetArgs>? _ipv6DhcpHelpers;

        /// <summary>
        /// DHCPv6 Helper
        /// </summary>
        public InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv6DhcpHelperGetArgs> Ipv6DhcpHelpers
        {
            get => _ipv6DhcpHelpers ?? (_ipv6DhcpHelpers = new InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv6DhcpHelperGetArgs>());
            set => _ipv6DhcpHelpers = value;
        }

        [Input("ipv6SecondaryAddresses")]
        private InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv6SecondaryAddressGetArgs>? _ipv6SecondaryAddresses;

        /// <summary>
        /// Assign secondary IPv6 addresses
        /// </summary>
        public InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv6SecondaryAddressGetArgs> Ipv6SecondaryAddresses
        {
            get => _ipv6SecondaryAddresses ?? (_ipv6SecondaryAddresses = new InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv6SecondaryAddressGetArgs>());
            set => _ipv6SecondaryAddresses = value;
        }

        [Input("ipv6Vrrps")]
        private InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv6VrrpGetArgs>? _ipv6Vrrps;

        /// <summary>
        /// Enable ipv6 VRRP
        /// </summary>
        public InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv6VrrpGetArgs> Ipv6Vrrps
        {
            get => _ipv6Vrrps ?? (_ipv6Vrrps = new InputList<Inputs.ServiceLanVpnInterfaceSviFeatureIpv6VrrpGetArgs>());
            set => _ipv6Vrrps = value;
        }

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
        /// Administrative state - Default value: `true`
        /// </summary>
        [Input("shutdown")]
        public Input<bool>? Shutdown { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("shutdownVariable")]
        public Input<string>? ShutdownVariable { get; set; }

        /// <summary>
        /// TCP MSS on SYN packets, in bytes - Range: `552`-`1960`
        /// </summary>
        [Input("tcpMss")]
        public Input<int>? TcpMss { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("tcpMssVariable")]
        public Input<string>? TcpMssVariable { get; set; }

        /// <summary>
        /// The version of the Feature
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public ServiceLanVpnInterfaceSviFeatureState()
        {
        }
        public static new ServiceLanVpnInterfaceSviFeatureState Empty => new ServiceLanVpnInterfaceSviFeatureState();
    }
}
