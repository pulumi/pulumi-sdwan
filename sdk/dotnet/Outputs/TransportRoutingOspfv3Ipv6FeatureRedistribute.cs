// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Outputs
{

    [OutputType]
    public sealed class TransportRoutingOspfv3Ipv6FeatureRedistribute
    {
        /// <summary>
        /// Set the protocol
        ///   - Choices: `connected`, `static`, `omp`, `bgp`, `eigrp`
        /// </summary>
        public readonly string? Protocol;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? ProtocolVariable;
        public readonly string? RoutePolicyId;

        [OutputConstructor]
        private TransportRoutingOspfv3Ipv6FeatureRedistribute(
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