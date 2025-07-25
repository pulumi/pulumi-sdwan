// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class CiscoVpnInterfaceFeatureTemplateIpv6DhcpHelperGetArgs : global::Pulumi.ResourceArgs
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
        /// Indicates if list item is considered optional.
        /// </summary>
        [Input("optional")]
        public Input<bool>? Optional { get; set; }

        /// <summary>
        /// DHCPv6 Helper VPN
        ///   - Range: `1`-`65536`
        /// </summary>
        [Input("vpnId")]
        public Input<int>? VpnId { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("vpnIdVariable")]
        public Input<string>? VpnIdVariable { get; set; }

        public CiscoVpnInterfaceFeatureTemplateIpv6DhcpHelperGetArgs()
        {
        }
        public static new CiscoVpnInterfaceFeatureTemplateIpv6DhcpHelperGetArgs Empty => new CiscoVpnInterfaceFeatureTemplateIpv6DhcpHelperGetArgs();
    }
}
