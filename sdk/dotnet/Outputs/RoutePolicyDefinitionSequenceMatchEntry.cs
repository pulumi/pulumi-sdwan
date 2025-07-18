// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Outputs
{

    [OutputType]
    public sealed class RoutePolicyDefinitionSequenceMatchEntry
    {
        /// <summary>
        /// AS path list ID, Attribute conditional on `type` being equal to `asPath`
        /// </summary>
        public readonly string? AsPathListId;
        /// <summary>
        /// AS path list version
        /// </summary>
        public readonly int? AsPathListVersion;
        /// <summary>
        /// Community list IDs, Attribute conditional on `type` being equal to `advancedCommunity`
        /// </summary>
        public readonly ImmutableArray<string> CommunityListIds;
        /// <summary>
        /// Community list match flag, Attribute conditional on `type` being equal to `advancedCommunity`
        ///   - Choices: `and`, `or`, `exact`
        /// </summary>
        public readonly string? CommunityListMatchFlag;
        /// <summary>
        /// Community list versions
        /// </summary>
        public readonly ImmutableArray<string> CommunityListVersions;
        /// <summary>
        /// Expanded community list ID, Attribute conditional on `type` being equal to `expandedCommunity`
        /// </summary>
        public readonly string? ExpandedCommunityListId;
        /// <summary>
        /// Expanded community list version
        /// </summary>
        public readonly int? ExpandedCommunityListVersion;
        /// <summary>
        /// Extended community list ID, Attribute conditional on `type` being equal to `extCommunity`
        /// </summary>
        public readonly string? ExtendedCommunityListId;
        /// <summary>
        /// Extended community list version
        /// </summary>
        public readonly int? ExtendedCommunityListVersion;
        /// <summary>
        /// Local preference, Attribute conditional on `type` being equal to `localPreference`
        ///   - Range: `0`-`4294967295`
        /// </summary>
        public readonly int? LocalPreference;
        /// <summary>
        /// Metric, Attribute conditional on `type` being equal to `metric`
        ///   - Range: `0`-`4294967295`
        /// </summary>
        public readonly int? Metric;
        /// <summary>
        /// Next hop prefix list ID, Attribute conditional on `type` being equal to `nextHop`
        /// </summary>
        public readonly string? NextHopPrefixListId;
        /// <summary>
        /// Next hop prefix list version
        /// </summary>
        public readonly int? NextHopPrefixListVersion;
        /// <summary>
        /// OMP tag, Attribute conditional on `type` being equal to `ompTag`
        ///   - Range: `0`-`4294967295`
        /// </summary>
        public readonly int? OmpTag;
        /// <summary>
        /// Origin, Attribute conditional on `type` being equal to `origin`
        ///   - Choices: `igp`, `egp`, `incomplete`
        /// </summary>
        public readonly string? Origin;
        /// <summary>
        /// OSPF tag, Attribute conditional on `type` being equal to `ospfTag`
        ///   - Range: `0`-`4294967295`
        /// </summary>
        public readonly int? OspfTag;
        /// <summary>
        /// Peer IP, Attribute conditional on `type` being equal to `peer`
        /// </summary>
        public readonly string? Peer;
        /// <summary>
        /// Prefix list ID, Attribute conditional on `type` being equal to `address`
        /// </summary>
        public readonly string? PrefixListId;
        /// <summary>
        /// Prefix list version
        /// </summary>
        public readonly int? PrefixListVersion;
        /// <summary>
        /// Type of match entry
        ///   - Choices: `address`, `asPath`, `advancedCommunity`, `expandedCommunity`, `extCommunity`, `localPreference`, `metric`, `nextHop`, `origin`, `peer`, `ompTag`, `ospfTag`
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private RoutePolicyDefinitionSequenceMatchEntry(
            string? asPathListId,

            int? asPathListVersion,

            ImmutableArray<string> communityListIds,

            string? communityListMatchFlag,

            ImmutableArray<string> communityListVersions,

            string? expandedCommunityListId,

            int? expandedCommunityListVersion,

            string? extendedCommunityListId,

            int? extendedCommunityListVersion,

            int? localPreference,

            int? metric,

            string? nextHopPrefixListId,

            int? nextHopPrefixListVersion,

            int? ompTag,

            string? origin,

            int? ospfTag,

            string? peer,

            string? prefixListId,

            int? prefixListVersion,

            string type)
        {
            AsPathListId = asPathListId;
            AsPathListVersion = asPathListVersion;
            CommunityListIds = communityListIds;
            CommunityListMatchFlag = communityListMatchFlag;
            CommunityListVersions = communityListVersions;
            ExpandedCommunityListId = expandedCommunityListId;
            ExpandedCommunityListVersion = expandedCommunityListVersion;
            ExtendedCommunityListId = extendedCommunityListId;
            ExtendedCommunityListVersion = extendedCommunityListVersion;
            LocalPreference = localPreference;
            Metric = metric;
            NextHopPrefixListId = nextHopPrefixListId;
            NextHopPrefixListVersion = nextHopPrefixListVersion;
            OmpTag = ompTag;
            Origin = origin;
            OspfTag = ospfTag;
            Peer = peer;
            PrefixListId = prefixListId;
            PrefixListVersion = prefixListVersion;
            Type = type;
        }
    }
}
