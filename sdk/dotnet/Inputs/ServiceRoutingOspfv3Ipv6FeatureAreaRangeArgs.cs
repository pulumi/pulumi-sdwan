// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ServiceRoutingOspfv3Ipv6FeatureAreaRangeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set cost for this range
        ///   - Range: `0`-`16777214`
        /// </summary>
        [Input("cost")]
        public Input<int>? Cost { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("costVariable")]
        public Input<string>? CostVariable { get; set; }

        /// <summary>
        /// Do not advertise this range
        ///   - Default value: `false`
        /// </summary>
        [Input("noAdvertise")]
        public Input<bool>? NoAdvertise { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("noAdvertiseVariable")]
        public Input<string>? NoAdvertiseVariable { get; set; }

        /// <summary>
        /// IPv6 prefix,for example 2001::/64
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("prefixVariable")]
        public Input<string>? PrefixVariable { get; set; }

        public ServiceRoutingOspfv3Ipv6FeatureAreaRangeArgs()
        {
        }
        public static new ServiceRoutingOspfv3Ipv6FeatureAreaRangeArgs Empty => new ServiceRoutingOspfv3Ipv6FeatureAreaRangeArgs();
    }
}