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
    public sealed class GetTransportIpv6AclFeatureSequenceMatchEntrySourcePortResult
    {
        /// <summary>
        /// source port range or individual port number
        /// </summary>
        public readonly string Port;

        [OutputConstructor]
        private GetTransportIpv6AclFeatureSequenceMatchEntrySourcePortResult(string port)
        {
            Port = port;
        }
    }
}
