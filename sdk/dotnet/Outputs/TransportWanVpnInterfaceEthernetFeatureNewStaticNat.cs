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
    public sealed class TransportWanVpnInterfaceEthernetFeatureNewStaticNat
    {
        /// <summary>
        /// Direction of static NAT translation
        ///   - Choices: `inside`, `outside`
        ///   - Default value: `inside`
        /// </summary>
        public readonly string? Direction;
        /// <summary>
        /// Source IP address to be translated
        /// </summary>
        public readonly string? SourceIp;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? SourceIpVariable;
        /// <summary>
        /// Source VPN ID
        ///   - Range: `0`-`65530`
        ///   - Default value: `0`
        /// </summary>
        public readonly int? SourceVpn;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? SourceVpnVariable;
        /// <summary>
        /// Statically translated source IP address
        /// </summary>
        public readonly string? TranslatedIp;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? TranslatedIpVariable;

        [OutputConstructor]
        private TransportWanVpnInterfaceEthernetFeatureNewStaticNat(
            string? direction,

            string? sourceIp,

            string? sourceIpVariable,

            int? sourceVpn,

            string? sourceVpnVariable,

            string? translatedIp,

            string? translatedIpVariable)
        {
            Direction = direction;
            SourceIp = sourceIp;
            SourceIpVariable = sourceIpVariable;
            SourceVpn = sourceVpn;
            SourceVpnVariable = sourceVpnVariable;
            TranslatedIp = translatedIp;
            TranslatedIpVariable = translatedIpVariable;
        }
    }
}