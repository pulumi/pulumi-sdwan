// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class RoutePolicyDefinitionSequenceMatchEntryGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AS path list ID, Attribute conditional on `type` being equal to `asPath`
        /// </summary>
        [Input("asPathListId")]
        public Input<string>? AsPathListId { get; set; }

        /// <summary>
        /// AS path list version
        /// </summary>
        [Input("asPathListVersion")]
        public Input<int>? AsPathListVersion { get; set; }

        [Input("communityListIds")]
        private InputList<string>? _communityListIds;

        /// <summary>
        /// Community list IDs, Attribute conditional on `type` being equal to `advancedCommunity`
        /// </summary>
        public InputList<string> CommunityListIds
        {
            get => _communityListIds ?? (_communityListIds = new InputList<string>());
            set => _communityListIds = value;
        }

        /// <summary>
        /// Community list match flag, Attribute conditional on `type` being equal to `advancedCommunity`
        ///   - Choices: `and`, `or`, `exact`
        /// </summary>
        [Input("communityListMatchFlag")]
        public Input<string>? CommunityListMatchFlag { get; set; }

        [Input("communityListVersions")]
        private InputList<string>? _communityListVersions;

        /// <summary>
        /// Community list versions
        /// </summary>
        public InputList<string> CommunityListVersions
        {
            get => _communityListVersions ?? (_communityListVersions = new InputList<string>());
            set => _communityListVersions = value;
        }

        /// <summary>
        /// Expanded community list ID, Attribute conditional on `type` being equal to `expandedCommunity`
        /// </summary>
        [Input("expandedCommunityListId")]
        public Input<string>? ExpandedCommunityListId { get; set; }

        /// <summary>
        /// Expanded community list version
        /// </summary>
        [Input("expandedCommunityListVersion")]
        public Input<int>? ExpandedCommunityListVersion { get; set; }

        /// <summary>
        /// Extended community list ID, Attribute conditional on `type` being equal to `extCommunity`
        /// </summary>
        [Input("extendedCommunityListId")]
        public Input<string>? ExtendedCommunityListId { get; set; }

        /// <summary>
        /// Extended community list version
        /// </summary>
        [Input("extendedCommunityListVersion")]
        public Input<int>? ExtendedCommunityListVersion { get; set; }

        /// <summary>
        /// Local preference, Attribute conditional on `type` being equal to `localPreference`
        ///   - Range: `0`-`4294967295`
        /// </summary>
        [Input("localPreference")]
        public Input<int>? LocalPreference { get; set; }

        /// <summary>
        /// Metric, Attribute conditional on `type` being equal to `metric`
        ///   - Range: `0`-`4294967295`
        /// </summary>
        [Input("metric")]
        public Input<int>? Metric { get; set; }

        /// <summary>
        /// Next hop prefix list ID, Attribute conditional on `type` being equal to `nextHop`
        /// </summary>
        [Input("nextHopPrefixListId")]
        public Input<string>? NextHopPrefixListId { get; set; }

        /// <summary>
        /// Next hop prefix list version
        /// </summary>
        [Input("nextHopPrefixListVersion")]
        public Input<int>? NextHopPrefixListVersion { get; set; }

        /// <summary>
        /// OMP tag, Attribute conditional on `type` being equal to `ompTag`
        ///   - Range: `0`-`4294967295`
        /// </summary>
        [Input("ompTag")]
        public Input<int>? OmpTag { get; set; }

        /// <summary>
        /// Origin, Attribute conditional on `type` being equal to `origin`
        ///   - Choices: `igp`, `egp`, `incomplete`
        /// </summary>
        [Input("origin")]
        public Input<string>? Origin { get; set; }

        /// <summary>
        /// OSPF tag, Attribute conditional on `type` being equal to `ospfTag`
        ///   - Range: `0`-`4294967295`
        /// </summary>
        [Input("ospfTag")]
        public Input<int>? OspfTag { get; set; }

        /// <summary>
        /// Peer IP, Attribute conditional on `type` being equal to `peer`
        /// </summary>
        [Input("peer")]
        public Input<string>? Peer { get; set; }

        /// <summary>
        /// Prefix list ID, Attribute conditional on `type` being equal to `address`
        /// </summary>
        [Input("prefixListId")]
        public Input<string>? PrefixListId { get; set; }

        /// <summary>
        /// Prefix list version
        /// </summary>
        [Input("prefixListVersion")]
        public Input<int>? PrefixListVersion { get; set; }

        /// <summary>
        /// Type of match entry
        ///   - Choices: `address`, `asPath`, `advancedCommunity`, `expandedCommunity`, `extCommunity`, `localPreference`, `metric`, `nextHop`, `origin`, `peer`, `ompTag`, `ospfTag`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public RoutePolicyDefinitionSequenceMatchEntryGetArgs()
        {
        }
        public static new RoutePolicyDefinitionSequenceMatchEntryGetArgs Empty => new RoutePolicyDefinitionSequenceMatchEntryGetArgs();
    }
}
