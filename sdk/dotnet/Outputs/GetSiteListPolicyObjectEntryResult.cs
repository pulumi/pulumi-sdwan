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
    public sealed class GetSiteListPolicyObjectEntryResult
    {
        /// <summary>
        /// Site ID or range of Site IDs e.g., `100` or `200-300`
        /// </summary>
        public readonly string SiteId;

        [OutputConstructor]
        private GetSiteListPolicyObjectEntryResult(string siteId)
        {
            SiteId = siteId;
        }
    }
}
