// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class TransportIpv6AclFeatureSequenceMatchEntryDestinationPortArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// destination port range or individual port number
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        public TransportIpv6AclFeatureSequenceMatchEntryDestinationPortArgs()
        {
        }
        public static new TransportIpv6AclFeatureSequenceMatchEntryDestinationPortArgs Empty => new TransportIpv6AclFeatureSequenceMatchEntryDestinationPortArgs();
    }
}
