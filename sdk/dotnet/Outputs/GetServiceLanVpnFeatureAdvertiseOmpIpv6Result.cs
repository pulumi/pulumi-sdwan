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
    public sealed class GetServiceLanVpnFeatureAdvertiseOmpIpv6Result
    {
        /// <summary>
        /// IPv6 Prefix List
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceLanVpnFeatureAdvertiseOmpIpv6PrefixResult> Prefixes;
        /// <summary>
        /// Protocol
        /// </summary>
        public readonly string Protocol;
        /// <summary>
        /// Protocol Sub Type
        /// </summary>
        public readonly string ProtocolSubType;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ProtocolSubTypeVariable;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ProtocolVariable;
        public readonly string RoutePolicyId;

        [OutputConstructor]
        private GetServiceLanVpnFeatureAdvertiseOmpIpv6Result(
            ImmutableArray<Outputs.GetServiceLanVpnFeatureAdvertiseOmpIpv6PrefixResult> prefixes,

            string protocol,

            string protocolSubType,

            string protocolSubTypeVariable,

            string protocolVariable,

            string routePolicyId)
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
