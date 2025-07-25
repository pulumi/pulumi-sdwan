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
    public sealed class ServiceRoutingEigrpFeatureRedistribute
    {
        /// <summary>
        /// Set the protocol to redistribute routes from
        ///   - Choices: `bgp`, `connected`, `nat-route`, `omp`, `ospf`, `ospfv3`, `static`
        /// </summary>
        public readonly string? Protocol;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? ProtocolVariable;
        public readonly string? RoutePolicyId;

        [OutputConstructor]
        private ServiceRoutingEigrpFeatureRedistribute(
            string? protocol,

            string? protocolVariable,

            string? routePolicyId)
        {
            Protocol = protocol;
            ProtocolVariable = protocolVariable;
            RoutePolicyId = routePolicyId;
        }
    }
}
