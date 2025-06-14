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
    public sealed class ServiceLanVpnFeatureAdvertiseOmpIpv6
    {
        /// <summary>
        /// IPv6 Prefix List
        /// </summary>
        public readonly ImmutableArray<Outputs.ServiceLanVpnFeatureAdvertiseOmpIpv6Prefix> Prefixes;
        /// <summary>
        /// Protocol
        ///   - Choices: `BGP`, `OSPF`, `Connected`, `Static`, `Network`, `Aggregate`
        /// </summary>
        public readonly string? Protocol;
        /// <summary>
        /// Protocol Sub Type
        ///   - Choices: `External`
        /// </summary>
        public readonly string? ProtocolSubType;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? ProtocolSubTypeVariable;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? ProtocolVariable;
        public readonly string? RoutePolicyId;

        [OutputConstructor]
        private ServiceLanVpnFeatureAdvertiseOmpIpv6(
            ImmutableArray<Outputs.ServiceLanVpnFeatureAdvertiseOmpIpv6Prefix> prefixes,

            string? protocol,

            string? protocolSubType,

            string? protocolSubTypeVariable,

            string? protocolVariable,

            string? routePolicyId)
        {
            Prefixes = prefixes;
            Protocol = protocol;
            ProtocolSubType = protocolSubType;
            ProtocolSubTypeVariable = protocolSubTypeVariable;
            ProtocolVariable = protocolVariable;
            RoutePolicyId = routePolicyId;
        }
    }
}
