// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ServiceLanVpnFeatureAdvertiseOmpIpv4GetArgs : global::Pulumi.ResourceArgs
    {
        [Input("prefixes")]
        private InputList<Inputs.ServiceLanVpnFeatureAdvertiseOmpIpv4PrefixGetArgs>? _prefixes;

        /// <summary>
        /// IPv4 Prefix List
        /// </summary>
        public InputList<Inputs.ServiceLanVpnFeatureAdvertiseOmpIpv4PrefixGetArgs> Prefixes
        {
            get => _prefixes ?? (_prefixes = new InputList<Inputs.ServiceLanVpnFeatureAdvertiseOmpIpv4PrefixGetArgs>());
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

        public ServiceLanVpnFeatureAdvertiseOmpIpv4GetArgs()
        {
        }
        public static new ServiceLanVpnFeatureAdvertiseOmpIpv4GetArgs Empty => new ServiceLanVpnFeatureAdvertiseOmpIpv4GetArgs();
    }
}