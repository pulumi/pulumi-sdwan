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
    public sealed class ZoneBasedFirewallPolicyDefinitionApplyZonePair
    {
        /// <summary>
        /// Destination Zone
        /// </summary>
        public readonly string? DestinationZone;
        /// <summary>
        /// Source Zone
        /// </summary>
        public readonly string? SourceZone;

        [OutputConstructor]
        private ZoneBasedFirewallPolicyDefinitionApplyZonePair(
            string? destinationZone,

            string? sourceZone)
        {
            DestinationZone = destinationZone;
            SourceZone = sourceZone;
        }
    }
}
