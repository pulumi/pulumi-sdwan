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
    public sealed class ServiceLanVpnFeatureServiceRoute
    {
        /// <summary>
        /// IP Address
        /// </summary>
        public readonly string? NetworkAddress;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? NetworkAddressVariable;
        /// <summary>
        /// Service
        ///   - Choices: `SIG`
        ///   - Default value: `SIG`
        /// </summary>
        public readonly string? Service;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? ServiceVariable;
        /// <summary>
        /// Subnet Mask
        ///   - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`, `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`, `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`, `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`, `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
        /// </summary>
        public readonly string? SubnetMask;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? SubnetMaskVariable;
        /// <summary>
        /// Service
        /// </summary>
        public readonly int? Vpn;

        [OutputConstructor]
        private ServiceLanVpnFeatureServiceRoute(
            string? networkAddress,

            string? networkAddressVariable,

            string? service,

            string? serviceVariable,

            string? subnetMask,

            string? subnetMaskVariable,

            int? vpn)
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