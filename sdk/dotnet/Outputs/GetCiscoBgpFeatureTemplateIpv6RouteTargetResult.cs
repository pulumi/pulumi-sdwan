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
    public sealed class GetCiscoBgpFeatureTemplateIpv6RouteTargetResult
    {
        /// <summary>
        /// Export Target-VPN community for IPV6
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCiscoBgpFeatureTemplateIpv6RouteTargetExportResult> Exports;
        /// <summary>
        /// Import Target-VPN community for IPV6
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCiscoBgpFeatureTemplateIpv6RouteTargetImportResult> Imports;
        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        public readonly bool Optional;
        /// <summary>
        /// VPN ID for IPv6
        /// </summary>
        public readonly int VpnId;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string VpnIdVariable;

        [OutputConstructor]
        private GetCiscoBgpFeatureTemplateIpv6RouteTargetResult(
            ImmutableArray<Outputs.GetCiscoBgpFeatureTemplateIpv6RouteTargetExportResult> exports,

            ImmutableArray<Outputs.GetCiscoBgpFeatureTemplateIpv6RouteTargetImportResult> imports,

            bool optional,

            int vpnId,

            string vpnIdVariable)
        {
            Exports = exports;
            Imports = imports;
            Optional = optional;
            VpnId = vpnId;
            VpnIdVariable = vpnIdVariable;
        }
    }
}
