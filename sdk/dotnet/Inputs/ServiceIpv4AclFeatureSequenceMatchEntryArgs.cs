// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ServiceIpv4AclFeatureSequenceMatchEntryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Destination Data IP Prefix
        /// </summary>
        [Input("destinationDataPrefix")]
        public Input<string>? DestinationDataPrefix { get; set; }

        [Input("destinationDataPrefixListId")]
        public Input<string>? DestinationDataPrefixListId { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("destinationDataPrefixVariable")]
        public Input<string>? DestinationDataPrefixVariable { get; set; }

        [Input("destinationPorts")]
        private InputList<Inputs.ServiceIpv4AclFeatureSequenceMatchEntryDestinationPortArgs>? _destinationPorts;

        /// <summary>
        /// Destination Port List
        /// </summary>
        public InputList<Inputs.ServiceIpv4AclFeatureSequenceMatchEntryDestinationPortArgs> DestinationPorts
        {
            get => _destinationPorts ?? (_destinationPorts = new InputList<Inputs.ServiceIpv4AclFeatureSequenceMatchEntryDestinationPortArgs>());
            set => _destinationPorts = value;
        }

        [Input("dscps")]
        private InputList<int>? _dscps;

        /// <summary>
        /// DSCP number
        /// </summary>
        public InputList<int> Dscps
        {
            get => _dscps ?? (_dscps = new InputList<int>());
            set => _dscps = value;
        }

        [Input("icmpMessages")]
        private InputList<string>? _icmpMessages;

        /// <summary>
        /// ICMP Message
        /// </summary>
        public InputList<string> IcmpMessages
        {
            get => _icmpMessages ?? (_icmpMessages = new InputList<string>());
            set => _icmpMessages = value;
        }

        /// <summary>
        /// Packet Length
        /// </summary>
        [Input("packetLength")]
        public Input<string>? PacketLength { get; set; }

        [Input("protocols")]
        private InputList<int>? _protocols;

        /// <summary>
        /// protocol number list with at least one item
        /// </summary>
        public InputList<int> Protocols
        {
            get => _protocols ?? (_protocols = new InputList<int>());
            set => _protocols = value;
        }

        /// <summary>
        /// Source Data IP Prefix
        /// </summary>
        [Input("sourceDataPrefix")]
        public Input<string>? SourceDataPrefix { get; set; }

        [Input("sourceDataPrefixListId")]
        public Input<string>? SourceDataPrefixListId { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("sourceDataPrefixVariable")]
        public Input<string>? SourceDataPrefixVariable { get; set; }

        [Input("sourcePorts")]
        private InputList<Inputs.ServiceIpv4AclFeatureSequenceMatchEntrySourcePortArgs>? _sourcePorts;

        /// <summary>
        /// Source Port List
        /// </summary>
        public InputList<Inputs.ServiceIpv4AclFeatureSequenceMatchEntrySourcePortArgs> SourcePorts
        {
            get => _sourcePorts ?? (_sourcePorts = new InputList<Inputs.ServiceIpv4AclFeatureSequenceMatchEntrySourcePortArgs>());
            set => _sourcePorts = value;
        }

        /// <summary>
        /// TCP States
        ///   - Choices: `syn`
        /// </summary>
        [Input("tcpState")]
        public Input<string>? TcpState { get; set; }

        public ServiceIpv4AclFeatureSequenceMatchEntryArgs()
        {
        }
        public static new ServiceIpv4AclFeatureSequenceMatchEntryArgs Empty => new ServiceIpv4AclFeatureSequenceMatchEntryArgs();
    }
}
