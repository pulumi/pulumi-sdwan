// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class TransportWanVpnFeatureIpv6StaticRouteArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IPv6 Nat
        ///   - Choices: `NAT64`, `NAT66`
        /// </summary>
        [Input("nat")]
        public Input<string>? Nat { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("natVariable")]
        public Input<string>? NatVariable { get; set; }

        [Input("nextHops")]
        private InputList<Inputs.TransportWanVpnFeatureIpv6StaticRouteNextHopArgs>? _nextHops;

        /// <summary>
        /// IPv6 Route Gateway Next Hop
        /// </summary>
        public InputList<Inputs.TransportWanVpnFeatureIpv6StaticRouteNextHopArgs> NextHops
        {
            get => _nextHops ?? (_nextHops = new InputList<Inputs.TransportWanVpnFeatureIpv6StaticRouteNextHopArgs>());
            set => _nextHops = value;
        }

        /// <summary>
        /// IPv6 Route Gateway Next Hop
        /// </summary>
        [Input("null0")]
        public Input<bool>? Null0 { get; set; }

        /// <summary>
        /// Prefix
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("prefixVariable")]
        public Input<string>? PrefixVariable { get; set; }

        public TransportWanVpnFeatureIpv6StaticRouteArgs()
        {
        }
        public static new TransportWanVpnFeatureIpv6StaticRouteArgs Empty => new TransportWanVpnFeatureIpv6StaticRouteArgs();
    }
}