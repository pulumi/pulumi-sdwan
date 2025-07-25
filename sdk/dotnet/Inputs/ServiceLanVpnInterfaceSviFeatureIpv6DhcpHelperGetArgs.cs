// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ServiceLanVpnInterfaceSviFeatureIpv6DhcpHelperGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// DHCPv6 Helper address
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("addressVariable")]
        public Input<string>? AddressVariable { get; set; }

        /// <summary>
        /// DHCPv6 Helper VPN
        ///   - Range: `1`-`65536`
        /// </summary>
        [Input("vpn")]
        public Input<int>? Vpn { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("vpnVariable")]
        public Input<string>? VpnVariable { get; set; }

        public ServiceLanVpnInterfaceSviFeatureIpv6DhcpHelperGetArgs()
        {
        }
        public static new ServiceLanVpnInterfaceSviFeatureIpv6DhcpHelperGetArgs Empty => new ServiceLanVpnInterfaceSviFeatureIpv6DhcpHelperGetArgs();
    }
}
