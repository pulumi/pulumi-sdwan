// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ServiceLanVpnFeatureAdvertiseOmpIpv4Args : global::Pulumi.ResourceArgs
    {
        [Input("prefixes")]
        private InputList<Inputs.ServiceLanVpnFeatureAdvertiseOmpIpv4PrefixArgs>? _prefixes;

        /// <summary>
        /// IPv4 Prefix List
        /// </summary>
        public InputList<Inputs.ServiceLanVpnFeatureAdvertiseOmpIpv4PrefixArgs> Prefixes
        {
            get => _prefixes ?? (_prefixes = new InputList<Inputs.ServiceLanVpnFeatureAdvertiseOmpIpv4PrefixArgs>());
            set => _prefixes = value;
        }

        /// <summary>
        /// Protocol
        ///   - Choices: `bgp`, `ospf`, `ospfv3`, `connected`, `static`, `network`, `aggregate`, `eigrp`, `lisp`, `isis`
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("protocolVariable")]
        public Input<string>? ProtocolVariable { get; set; }

        [Input("routePolicyId")]
        public Input<string>? RoutePolicyId { get; set; }

        public ServiceLanVpnFeatureAdvertiseOmpIpv4Args()
        {
        }
        public static new ServiceLanVpnFeatureAdvertiseOmpIpv4Args Empty => new ServiceLanVpnFeatureAdvertiseOmpIpv4Args();
    }
}
