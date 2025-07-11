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
    public sealed class CedgeAaaFeatureTemplateRadiusClient
    {
        /// <summary>
        /// Client IP
        /// </summary>
        public readonly string? ClientIp;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? ClientIpVariable;
        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        public readonly bool? Optional;
        /// <summary>
        /// VPN configuration
        /// </summary>
        public readonly ImmutableArray<Outputs.CedgeAaaFeatureTemplateRadiusClientVpnConfiguration> VpnConfigurations;

        [OutputConstructor]
        private CedgeAaaFeatureTemplateRadiusClient(
            string? clientIp,

            string? clientIpVariable,

            bool? optional,

            ImmutableArray<Outputs.CedgeAaaFeatureTemplateRadiusClientVpnConfiguration> vpnConfigurations)
        {
            ClientIp = clientIp;
            ClientIpVariable = clientIpVariable;
            Optional = optional;
            VpnConfigurations = vpnConfigurations;
        }
    }
}
