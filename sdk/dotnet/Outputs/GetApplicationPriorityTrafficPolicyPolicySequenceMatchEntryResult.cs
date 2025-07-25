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
    public sealed class GetApplicationPriorityTrafficPolicyPolicySequenceMatchEntryResult
    {
        public readonly string ApplicationListId;
        public readonly string DestinationDataIpv4PrefixListId;
        public readonly string DestinationDataIpv6PrefixListId;
        /// <summary>
        /// Destination Data IP Prefix
        /// </summary>
        public readonly string DestinationIpv4Prefix;
        /// <summary>
        /// Destination Data IP Prefix
        /// </summary>
        public readonly string DestinationIpv6Prefix;
        /// <summary>
        /// Destination Port (0-65535) range or individual number separated by space
        /// </summary>
        public readonly ImmutableArray<string> DestinationPorts;
        /// <summary>
        /// Destination Region
        /// </summary>
        public readonly string DestinationRegion;
        /// <summary>
        /// Dns
        /// </summary>
        public readonly string Dns;
        public readonly string DnsApplicationListId;
        /// <summary>
        /// DSCP number
        /// </summary>
        public readonly int Dscp;
        /// <summary>
        /// ICMP6 Message
        /// </summary>
        public readonly ImmutableArray<string> Icmp6Messages;
        /// <summary>
        /// ICMP Message
        /// </summary>
        public readonly ImmutableArray<string> IcmpMessages;
        /// <summary>
        /// Packet Length
        /// </summary>
        public readonly string PacketLength;
        /// <summary>
        /// protocol (0-255) range or individual number separated by space
        /// </summary>
        public readonly ImmutableArray<string> Protocols;
        public readonly string SaasApplicationListId;
        /// <summary>
        /// M365 Service Area
        /// </summary>
        public readonly ImmutableArray<string> ServiceAreas;
        public readonly string SourceDataIpv4PrefxListId;
        public readonly string SourceDataIpv6PrefxListId;
        /// <summary>
        /// Source Data IP Prefix
        /// </summary>
        public readonly string SourceIpv4Prefix;
        /// <summary>
        /// Source Data IP Prefix
        /// </summary>
        public readonly string SourceIpv6Prefix;
        /// <summary>
        /// Source Port (0-65535) range or individual number separated by space
        /// </summary>
        public readonly ImmutableArray<string> SourcePorts;
        /// <summary>
        /// TCP States
        /// </summary>
        public readonly string Tcp;
        /// <summary>
        /// M365 Traffic Category
        /// </summary>
        public readonly string TrafficCategory;
        /// <summary>
        /// Traffic Class
        /// </summary>
        public readonly string TrafficClass;
        /// <summary>
        /// Traffic to
        /// </summary>
        public readonly string TrafficTo;

        [OutputConstructor]
        private GetApplicationPriorityTrafficPolicyPolicySequenceMatchEntryResult(
            string applicationListId,

            string destinationDataIpv4PrefixListId,

            string destinationDataIpv6PrefixListId,

            string destinationIpv4Prefix,

            string destinationIpv6Prefix,

            ImmutableArray<string> destinationPorts,

            string destinationRegion,

            string dns,

            string dnsApplicationListId,

            int dscp,

            ImmutableArray<string> icmp6Messages,

            ImmutableArray<string> icmpMessages,

            string packetLength,

            ImmutableArray<string> protocols,

            string saasApplicationListId,

            ImmutableArray<string> serviceAreas,

            string sourceDataIpv4PrefxListId,

            string sourceDataIpv6PrefxListId,

            string sourceIpv4Prefix,

            string sourceIpv6Prefix,

            ImmutableArray<string> sourcePorts,

            string tcp,

            string trafficCategory,

            string trafficClass,

            string trafficTo)
        {
            ApplicationListId = applicationListId;
            DestinationDataIpv4PrefixListId = destinationDataIpv4PrefixListId;
            DestinationDataIpv6PrefixListId = destinationDataIpv6PrefixListId;
            DestinationIpv4Prefix = destinationIpv4Prefix;
            DestinationIpv6Prefix = destinationIpv6Prefix;
            DestinationPorts = destinationPorts;
            DestinationRegion = destinationRegion;
            Dns = dns;
            DnsApplicationListId = dnsApplicationListId;
            Dscp = dscp;
            Icmp6Messages = icmp6Messages;
            IcmpMessages = icmpMessages;
            PacketLength = packetLength;
            Protocols = protocols;
            SaasApplicationListId = saasApplicationListId;
            ServiceAreas = serviceAreas;
            SourceDataIpv4PrefxListId = sourceDataIpv4PrefxListId;
            SourceDataIpv6PrefxListId = sourceDataIpv6PrefxListId;
            SourceIpv4Prefix = sourceIpv4Prefix;
            SourceIpv6Prefix = sourceIpv6Prefix;
            SourcePorts = sourcePorts;
            Tcp = tcp;
            TrafficCategory = trafficCategory;
            TrafficClass = trafficClass;
            TrafficTo = trafficTo;
        }
    }
}
