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
    public sealed class TrafficDataPolicyDefinitionSequenceMatchEntry
    {
        /// <summary>
        /// Application list ID, Attribute conditional on `type` being equal to `appList`
        /// </summary>
        public readonly string? ApplicationListId;
        /// <summary>
        /// Application list version
        /// </summary>
        public readonly int? ApplicationListVersion;
        /// <summary>
        /// Destination Data Prefix list ID, Attribute conditional on `type` being equal to `destinationDataPrefixList`
        /// </summary>
        public readonly string? DestinationDataPrefixListId;
        /// <summary>
        /// Destination Data Prefix list version
        /// </summary>
        public readonly int? DestinationDataPrefixListVersion;
        /// <summary>
        /// Destination IP, Attribute conditional on `type` being equal to `destinationIp`
        /// </summary>
        public readonly string? DestinationIp;
        /// <summary>
        /// Destination port, 0-65535 (Single value, range or multiple values separated by spaces), Attribute conditional on `type` being equal to `destinationPort`
        /// </summary>
        public readonly string? DestinationPort;
        /// <summary>
        /// Destination region, Attribute conditional on `type` being equal to `destinationRegion`
        ///   - Choices: `primary-region`, `secondary-region`, `other-region`
        /// </summary>
        public readonly string? DestinationRegion;
        /// <summary>
        /// DNS request or response, Attribute conditional on `type` being equal to `dns`
        ///   - Choices: `request`, `response`
        /// </summary>
        public readonly string? Dns;
        /// <summary>
        /// DNS Application list ID, Attribute conditional on `type` being equal to `dnsAppList`
        /// </summary>
        public readonly string? DnsApplicationListId;
        /// <summary>
        /// DNS Application list version
        /// </summary>
        public readonly int? DnsApplicationListVersion;
        /// <summary>
        /// DSCP value, Attribute conditional on `type` being equal to `dscp`
        /// </summary>
        public readonly string? Dscp;
        /// <summary>
        /// ICMP Message, Attribute conditional on `type` being equal to `icmpMessage`
        /// </summary>
        public readonly string? IcmpMessage;
        /// <summary>
        /// Packet length, Attribute conditional on `type` being equal to `packetLength`
        ///   - Range: `0`-`65535`
        /// </summary>
        public readonly int? PacketLength;
        /// <summary>
        /// PLP, Attribute conditional on `type` being equal to `plp`
        ///   - Choices: `low`, `high`
        /// </summary>
        public readonly string? Plp;
        /// <summary>
        /// IP Protocol, 0-255 (Single value or multiple values separated by spaces), Attribute conditional on `type` being equal to `protocol`
        /// </summary>
        public readonly string? Protocol;
        /// <summary>
        /// Source Data Prefix list ID, Attribute conditional on `type` being equal to `sourceDataPrefixList`
        /// </summary>
        public readonly string? SourceDataPrefixListId;
        /// <summary>
        /// Source Data Prefix list version
        /// </summary>
        public readonly int? SourceDataPrefixListVersion;
        /// <summary>
        /// Source IP, Attribute conditional on `type` being equal to `sourceIp`
        /// </summary>
        public readonly string? SourceIp;
        /// <summary>
        /// Source port, 0-65535 (Single value, range or multiple values separated by spaces), Attribute conditional on `type` being equal to `sourcePort`
        /// </summary>
        public readonly string? SourcePort;
        /// <summary>
        /// TCP flags, Attribute conditional on `type` being equal to `tcp`
        ///   - Choices: `syn`
        /// </summary>
        public readonly string? Tcp;
        /// <summary>
        /// Traffic to, Attribute conditional on `type` being equal to `trafficTo`
        ///   - Choices: `access`, `core`, `service`
        /// </summary>
        public readonly string? TrafficTo;
        /// <summary>
        /// Type of match entry
        ///   - Choices: `appList`, `dnsAppList`, `dns`, `dscp`, `packetLength`, `plp`, `protocol`, `sourceDataPrefixList`, `sourceIp`, `sourcePort`, `destinationDataPrefixList`, `destinationIp`, `destinationRegion`, `destinationPort`, `tcp`, `trafficTo`, `icmpMessage`
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private TrafficDataPolicyDefinitionSequenceMatchEntry(
            string? applicationListId,

            int? applicationListVersion,

            string? destinationDataPrefixListId,

            int? destinationDataPrefixListVersion,

            string? destinationIp,

            string? destinationPort,

            string? destinationRegion,

            string? dns,

            string? dnsApplicationListId,

            int? dnsApplicationListVersion,

            string? dscp,

            string? icmpMessage,

            int? packetLength,

            string? plp,

            string? protocol,

            string? sourceDataPrefixListId,

            int? sourceDataPrefixListVersion,

            string? sourceIp,

            string? sourcePort,

            string? tcp,

            string? trafficTo,

            string type)
        {
            ApplicationListId = applicationListId;
            ApplicationListVersion = applicationListVersion;
            DestinationDataPrefixListId = destinationDataPrefixListId;
            DestinationDataPrefixListVersion = destinationDataPrefixListVersion;
            DestinationIp = destinationIp;
            DestinationPort = destinationPort;
            DestinationRegion = destinationRegion;
            Dns = dns;
            DnsApplicationListId = dnsApplicationListId;
            DnsApplicationListVersion = dnsApplicationListVersion;
            Dscp = dscp;
            IcmpMessage = icmpMessage;
            PacketLength = packetLength;
            Plp = plp;
            Protocol = protocol;
            SourceDataPrefixListId = sourceDataPrefixListId;
            SourceDataPrefixListVersion = sourceDataPrefixListVersion;
            SourceIp = sourceIp;
            SourcePort = sourcePort;
            Tcp = tcp;
            TrafficTo = trafficTo;
            Type = type;
        }
    }
}
