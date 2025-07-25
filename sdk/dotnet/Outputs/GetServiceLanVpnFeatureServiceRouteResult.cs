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
    public sealed class GetServiceLanVpnFeatureServiceRouteResult
    {
        /// <summary>
        /// IP Address
        /// </summary>
        public readonly string NetworkAddress;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string NetworkAddressVariable;
        /// <summary>
        /// Service
        /// </summary>
        public readonly string Service;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ServiceVariable;
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
        private GetServiceLanVpnFeatureServiceRouteResult(
            string networkAddress,

            string networkAddressVariable,

            string service,

            string serviceVariable,

            string subnetMask,

            string subnetMaskVariable,

            int vpn)
        {
            NetworkAddress = networkAddress;
            NetworkAddressVariable = networkAddressVariable;
            Service = service;
            ServiceVariable = serviceVariable;
            SubnetMask = subnetMask;
            SubnetMaskVariable = subnetMaskVariable;
            Vpn = vpn;
        }
    }
}
