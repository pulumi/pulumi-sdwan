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
    public sealed class ServiceLanVpnInterfaceEthernetFeatureIpv6SecondaryAddress
    {
        /// <summary>
        /// IPv6 Address Secondary
        /// </summary>
        public readonly string? Address;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? AddressVariable;

        [OutputConstructor]
        private ServiceLanVpnInterfaceEthernetFeatureIpv6SecondaryAddress(
            string? address,

            string? addressVariable)
        {
            Address = address;
            AddressVariable = addressVariable;
        }
    }
}
