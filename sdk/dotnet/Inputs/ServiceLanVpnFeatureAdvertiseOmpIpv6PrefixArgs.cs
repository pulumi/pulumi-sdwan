// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ServiceLanVpnFeatureAdvertiseOmpIpv6PrefixArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Aggregate Only
        ///   - Default value: `false`
        /// </summary>
        [Input("aggregateOnly")]
        public Input<bool>? AggregateOnly { get; set; }

        /// <summary>
        /// IPv6 Prefix
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("prefixVariable")]
        public Input<string>? PrefixVariable { get; set; }

        public ServiceLanVpnFeatureAdvertiseOmpIpv6PrefixArgs()
        {
        }
        public static new ServiceLanVpnFeatureAdvertiseOmpIpv6PrefixArgs Empty => new ServiceLanVpnFeatureAdvertiseOmpIpv6PrefixArgs();
    }
}