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
    public sealed class GetPolicyObjectIpv4PrefixListEntryResult
    {
        /// <summary>
        /// IPv4 prefix length with ge range operator
        /// </summary>
        public readonly int Ge;
        /// <summary>
        /// IPv4 address
        /// </summary>
        public readonly string Ipv4Address;
        /// <summary>
        /// IPv4 prefix length
        /// </summary>
        public readonly int Ipv4PrefixLength;
        /// <summary>
        /// IPv4 prefix length with le range operator
        /// </summary>
        public readonly int Le;

        [OutputConstructor]
        private GetPolicyObjectIpv4PrefixListEntryResult(
            int ge,

            string ipv4Address,

            int ipv4PrefixLength,

            int le)
        {
            Ge = ge;
            Ipv4Address = ipv4Address;
            Ipv4PrefixLength = ipv4PrefixLength;
            Le = le;
        }
    }
}