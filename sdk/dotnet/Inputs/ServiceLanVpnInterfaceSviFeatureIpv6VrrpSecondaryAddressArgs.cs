// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ServiceLanVpnInterfaceSviFeatureIpv6VrrpSecondaryAddressArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IPv6 Secondary IP address
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("prefixVariable")]
        public Input<string>? PrefixVariable { get; set; }

        public ServiceLanVpnInterfaceSviFeatureIpv6VrrpSecondaryAddressArgs()
        {
        }
        public static new ServiceLanVpnInterfaceSviFeatureIpv6VrrpSecondaryAddressArgs Empty => new ServiceLanVpnInterfaceSviFeatureIpv6VrrpSecondaryAddressArgs();
    }
}