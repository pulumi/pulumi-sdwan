// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ServiceRoutePolicyFeatureSequenceActionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("asPathPrepends")]
        private InputList<int>? _asPathPrepends;
        public InputList<int> AsPathPrepends
        {
            get => _asPathPrepends ?? (_asPathPrepends = new InputList<int>());
            set => _asPathPrepends = value;
        }

        [Input("communities")]
        private InputList<string>? _communities;
        public InputList<string> Communities
        {
            get => _communities ?? (_communities = new InputList<string>());
            set => _communities = value;
        }

        /// <summary>
        /// - Default value: `false`
        /// </summary>
        [Input("communityAdditive")]
        public Input<bool>? CommunityAdditive { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("communityVariable")]
        public Input<string>? CommunityVariable { get; set; }

        /// <summary>
        /// Set Ipv4 Next Hop
        /// </summary>
        [Input("ipv4NextHop")]
        public Input<string>? Ipv4NextHop { get; set; }

        /// <summary>
        /// Set Ipv6 Next Hop
        /// </summary>
        [Input("ipv6NextHop")]
        public Input<string>? Ipv6NextHop { get; set; }

        /// <summary>
        /// Set Local Preference
        ///   - Range: `0`-`4294967295`
        /// </summary>
        [Input("localPreference")]
        public Input<int>? LocalPreference { get; set; }

        /// <summary>
        /// Set Metric
        ///   - Range: `0`-`4294967295`
        /// </summary>
        [Input("metric")]
        public Input<int>? Metric { get; set; }

        /// <summary>
        /// Set Metric Type
        ///   - Choices: `type1`, `type2`
        /// </summary>
        [Input("metricType")]
        public Input<string>? MetricType { get; set; }

        /// <summary>
        /// Set OMP Tag
        ///   - Range: `0`-`4294967295`
        /// </summary>
        [Input("ompTag")]
        public Input<int>? OmpTag { get; set; }

        /// <summary>
        /// Set Origin
        ///   - Choices: `EGP`, `IGP`, `Incomplete`
        /// </summary>
        [Input("origin")]
        public Input<string>? Origin { get; set; }

        /// <summary>
        /// Set OSPF Tag
        ///   - Range: `0`-`4294967295`
        /// </summary>
        [Input("ospfTag")]
        public Input<int>? OspfTag { get; set; }

        /// <summary>
        /// Set Weight
        ///   - Range: `0`-`65535`
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public ServiceRoutePolicyFeatureSequenceActionGetArgs()
        {
        }
        public static new ServiceRoutePolicyFeatureSequenceActionGetArgs Empty => new ServiceRoutePolicyFeatureSequenceActionGetArgs();
    }
}