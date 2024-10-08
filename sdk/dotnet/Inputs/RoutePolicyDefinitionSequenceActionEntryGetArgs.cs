// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class RoutePolicyDefinitionSequenceActionEntryGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Aggregator
        ///   - Range: `0`-`4294967295`
        /// </summary>
        [Input("aggregator")]
        public Input<int>? Aggregator { get; set; }

        /// <summary>
        /// IP address
        /// </summary>
        [Input("aggregatorIpAddress")]
        public Input<string>? AggregatorIpAddress { get; set; }

        /// <summary>
        /// Space separated list of ASN to exclude
        /// </summary>
        [Input("asPathExclude")]
        public Input<string>? AsPathExclude { get; set; }

        /// <summary>
        /// Space separated list of ASN to prepend
        /// </summary>
        [Input("asPathPrepend")]
        public Input<string>? AsPathPrepend { get; set; }

        /// <summary>
        /// Atomic aggregate
        /// </summary>
        [Input("atomicAggregate")]
        public Input<bool>? AtomicAggregate { get; set; }

        /// <summary>
        /// Community value, e.g. `1000:10000` or `internet` or `local-AS`
        /// </summary>
        [Input("community")]
        public Input<string>? Community { get; set; }

        /// <summary>
        /// Community additive
        /// </summary>
        [Input("communityAdditive")]
        public Input<bool>? CommunityAdditive { get; set; }

        /// <summary>
        /// Local preference
        ///   - Range: `0`-`4294967295`
        /// </summary>
        [Input("localPreference")]
        public Input<int>? LocalPreference { get; set; }

        /// <summary>
        /// Metric
        ///   - Range: `0`-`4294967295`
        /// </summary>
        [Input("metric")]
        public Input<int>? Metric { get; set; }

        /// <summary>
        /// Metric type
        ///   - Choices: `type1`, `type2`
        /// </summary>
        [Input("metricType")]
        public Input<string>? MetricType { get; set; }

        /// <summary>
        /// Next hop IP
        /// </summary>
        [Input("nextHop")]
        public Input<string>? NextHop { get; set; }

        /// <summary>
        /// OMP tag
        ///   - Range: `0`-`4294967295`
        /// </summary>
        [Input("ompTag")]
        public Input<int>? OmpTag { get; set; }

        /// <summary>
        /// Origin
        ///   - Choices: `igp`, `egp`, `incomplete`
        /// </summary>
        [Input("origin")]
        public Input<string>? Origin { get; set; }

        /// <summary>
        /// Originator IP
        /// </summary>
        [Input("originator")]
        public Input<string>? Originator { get; set; }

        /// <summary>
        /// OSPF tag
        ///   - Range: `0`-`4294967295`
        /// </summary>
        [Input("ospfTag")]
        public Input<int>? OspfTag { get; set; }

        /// <summary>
        /// Type of action entry
        ///   - Choices: `aggregator`, `asPath`, `atomicAggregate`, `community`, `communityAdditive`, `localPreference`, `metric`, `weight`, `metricType`, `nextHop`, `ompTag`, `ospfTag`, `origin`, `originator`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Weight
        ///   - Range: `0`-`4294967295`
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public RoutePolicyDefinitionSequenceActionEntryGetArgs()
        {
        }
        public static new RoutePolicyDefinitionSequenceActionEntryGetArgs Empty => new RoutePolicyDefinitionSequenceActionEntryGetArgs();
    }
}
