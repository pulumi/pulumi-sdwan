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
    public sealed class ServiceIpv6AclFeatureSequenceMatchEntryDestinationPort
    {
        /// <summary>
        /// destination port range or individual port number
        /// </summary>
        public readonly string? Port;

        [OutputConstructor]
        private ServiceIpv6AclFeatureSequenceMatchEntryDestinationPort(string? port)
        {
            Port = port;
        }
    }
}
