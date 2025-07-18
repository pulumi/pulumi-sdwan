// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class Ipv6DeviceAclPolicyDefinitionSequenceMatchEntryGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Destination data IPv6 prefix list ID, Attribute conditional on `type` being equal to `destinationDataIpv6PrefixList`
        /// </summary>
        [Input("destinationDataIpv6PrefixListId")]
        public Input<string>? DestinationDataIpv6PrefixListId { get; set; }

        /// <summary>
        /// Destination data IPv6 prefix list version
        /// </summary>
        [Input("destinationDataIpv6PrefixListVersion")]
        public Input<int>? DestinationDataIpv6PrefixListVersion { get; set; }

        /// <summary>
        /// Destination IP prefix, Attribute conditional on `type` being equal to `destinationIpv6`
        /// </summary>
        [Input("destinationIp")]
        public Input<string>? DestinationIp { get; set; }

        /// <summary>
        /// Destination port, only `22` and `161` supported, Attribute conditional on `type` being equal to `destinationPort`
        ///   - Range: `0`-`65535`
        /// </summary>
        [Input("destinationPort")]
        public Input<int>? DestinationPort { get; set; }

        /// <summary>
        /// Source data IPv6 prefix list ID, Attribute conditional on `type` being equal to `sourceDataIpv6PrefixList`
        /// </summary>
        [Input("sourceDataIpv6PrefixListId")]
        public Input<string>? SourceDataIpv6PrefixListId { get; set; }

        /// <summary>
        /// Source data IPv6 prefix list version
        /// </summary>
        [Input("sourceDataIpv6PrefixListVersion")]
        public Input<int>? SourceDataIpv6PrefixListVersion { get; set; }

        /// <summary>
        /// Source IP prefix, Attribute conditional on `type` being equal to `sourceIpv6`
        /// </summary>
        [Input("sourceIp")]
        public Input<string>? SourceIp { get; set; }

        /// <summary>
        /// Source ports. Single value (0-65535) or ranges separated by spaces., Attribute conditional on `type` being equal to `sourcePort`
        /// </summary>
        [Input("sourcePorts")]
        public Input<string>? SourcePorts { get; set; }

        /// <summary>
        /// Type of match entry
        ///   - Choices: `sourceIpv6`, `destinationIpv6`, `sourcePort`, `destinationPort`, `sourceDataIpv6PrefixList`, `destinationDataIpv6PrefixList`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public Ipv6DeviceAclPolicyDefinitionSequenceMatchEntryGetArgs()
        {
        }
        public static new Ipv6DeviceAclPolicyDefinitionSequenceMatchEntryGetArgs Empty => new Ipv6DeviceAclPolicyDefinitionSequenceMatchEntryGetArgs();
    }
}
