// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class OtherUcseFeatureInterfaceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set Inteface name
        /// </summary>
        [Input("interfaceName")]
        public Input<string>? InterfaceName { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("interfaceNameVariable")]
        public Input<string>? InterfaceNameVariable { get; set; }

        /// <summary>
        /// Assign IPv4 address
        /// </summary>
        [Input("ipv4Address")]
        public Input<string>? Ipv4Address { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipv4AddressVariable")]
        public Input<string>? Ipv4AddressVariable { get; set; }

        /// <summary>
        /// UCSE Interface VPN
        ///   - Range: `1`-`65527`
        /// </summary>
        [Input("ucseInterfaceVpn")]
        public Input<int>? UcseInterfaceVpn { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ucseInterfaceVpnVariable")]
        public Input<string>? UcseInterfaceVpnVariable { get; set; }

        public OtherUcseFeatureInterfaceArgs()
        {
        }
        public static new OtherUcseFeatureInterfaceArgs Empty => new OtherUcseFeatureInterfaceArgs();
    }
}
