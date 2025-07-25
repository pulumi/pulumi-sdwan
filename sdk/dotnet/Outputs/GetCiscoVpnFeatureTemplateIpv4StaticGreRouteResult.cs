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
    public sealed class GetCiscoVpnFeatureTemplateIpv4StaticGreRouteResult
    {
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string InterfaceVariable;
        /// <summary>
        /// List of GRE Interfaces
        /// </summary>
        public readonly ImmutableArray<string> Interfaces;
        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        public readonly bool Optional;
        /// <summary>
        /// Prefix
        /// </summary>
        public readonly string Prefix;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string PrefixVariable;
        /// <summary>
        /// Destination VPN to resolve the prefix
        /// </summary>
        public readonly int VpnId;

        [OutputConstructor]
        private GetCiscoVpnFeatureTemplateIpv4StaticGreRouteResult(
            string interfaceVariable,

            ImmutableArray<string> interfaces,

            bool optional,

            string prefix,

            string prefixVariable,

            int vpnId)
        {
            InterfaceVariable = interfaceVariable;
            Interfaces = interfaces;
            Optional = optional;
            Prefix = prefix;
            PrefixVariable = prefixVariable;
            VpnId = vpnId;
        }
    }
}
