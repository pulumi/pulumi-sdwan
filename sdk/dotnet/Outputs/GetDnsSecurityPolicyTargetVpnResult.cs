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
    public sealed class GetDnsSecurityPolicyTargetVpnResult
    {
        /// <summary>
        /// Field will only be under data field if matchAllVpn is true, otherwise field will be under targetVpns and set per entry
        /// </summary>
        public readonly string DnsServerIp;
        /// <summary>
        /// Field will only be under data field if matchAllVpn is true, otherwise field will be under targetVpns and set per entry
        /// </summary>
        public readonly bool LocalDomainBypassEnabled;
        /// <summary>
        /// non empty interger string
        /// </summary>
        public readonly string Uid;
        /// <summary>
        /// Field will only be under data field if matchAllVpn is true, otherwise field will be under targetVpns and set per entry
        /// </summary>
        public readonly bool UmbrellaDefault;
        public readonly ImmutableArray<string> Vpns;

        [OutputConstructor]
        private GetDnsSecurityPolicyTargetVpnResult(
            string dnsServerIp,

            bool localDomainBypassEnabled,

            string uid,

            bool umbrellaDefault,

            ImmutableArray<string> vpns)
        {
            DnsServerIp = dnsServerIp;
            LocalDomainBypassEnabled = localDomainBypassEnabled;
            Uid = uid;
            UmbrellaDefault = umbrellaDefault;
            Vpns = vpns;
        }
    }
}
