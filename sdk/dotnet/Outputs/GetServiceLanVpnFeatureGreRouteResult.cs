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
    public sealed class GetServiceLanVpnFeatureGreRouteResult
    {
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string InterfaceVariable;
        /// <summary>
        /// Interface
        /// </summary>
        public readonly ImmutableArray<string> Interfaces;
        /// <summary>
        /// IP Address
        /// </summary>
        public readonly string NetworkAddress;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string NetworkAddressVariable;
        /// <summary>
        /// Subnet Mask
        /// </summary>
        public readonly string SubnetMask;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string SubnetMaskVariable;
        /// <summary>
        /// Service
        /// </summary>
        public readonly int Vpn;

        [OutputConstructor]
        private GetServiceLanVpnFeatureGreRouteResult(
            string interfaceVariable,

            ImmutableArray<string> interfaces,

            string networkAddress,

            string networkAddressVariable,

            string subnetMask,

            string subnetMaskVariable,

            int vpn)
        {
            InterfaceVariable = interfaceVariable;
            Interfaces = interfaces;
            NetworkAddress = networkAddress;
            NetworkAddressVariable = networkAddressVariable;
            SubnetMask = subnetMask;
            SubnetMaskVariable = subnetMaskVariable;
            Vpn = vpn;
        }
    }
}
