// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ServiceLanVpnInterfaceEthernetProfileParcelIpv6SecondaryAddressArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IPv6 Address Secondary
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("addressVariable")]
        public Input<string>? AddressVariable { get; set; }

        public ServiceLanVpnInterfaceEthernetProfileParcelIpv6SecondaryAddressArgs()
        {
        }
        public static new ServiceLanVpnInterfaceEthernetProfileParcelIpv6SecondaryAddressArgs Empty => new ServiceLanVpnInterfaceEthernetProfileParcelIpv6SecondaryAddressArgs();
    }
}
