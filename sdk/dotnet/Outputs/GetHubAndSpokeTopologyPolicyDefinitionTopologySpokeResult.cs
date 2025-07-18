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
    public sealed class GetHubAndSpokeTopologyPolicyDefinitionTopologySpokeResult
    {
        /// <summary>
        /// List of hubs
        /// </summary>
        public readonly ImmutableArray<Outputs.GetHubAndSpokeTopologyPolicyDefinitionTopologySpokeHubResult> Hubs;
        /// <summary>
        /// Site list ID
        /// </summary>
        public readonly string SiteListId;
        /// <summary>
        /// Site list version
        /// </summary>
        public readonly int SiteListVersion;

        [OutputConstructor]
        private GetHubAndSpokeTopologyPolicyDefinitionTopologySpokeResult(
            ImmutableArray<Outputs.GetHubAndSpokeTopologyPolicyDefinitionTopologySpokeHubResult> hubs,

            string siteListId,

            int siteListVersion)
        {
            Hubs = hubs;
            SiteListId = siteListId;
            SiteListVersion = siteListVersion;
        }
    }
}
