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
    public sealed class GetSystemAaaFeatureTacacsGroupResult
    {
        /// <summary>
        /// Set TACACS server Group Name
        /// </summary>
        public readonly string GroupName;
        /// <summary>
        /// Configure the TACACS server
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSystemAaaFeatureTacacsGroupServerResult> Servers;
        /// <summary>
        /// Set interface to use to reach TACACS server
        /// </summary>
        public readonly string SourceInterface;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string SourceInterfaceVariable;
        /// <summary>
        /// Set VPN in which TACACS server is located
        /// </summary>
        public readonly int Vpn;

        [OutputConstructor]
        private GetSystemAaaFeatureTacacsGroupResult(
            string groupName,

            ImmutableArray<Outputs.GetSystemAaaFeatureTacacsGroupServerResult> servers,

            string sourceInterface,

            string sourceInterfaceVariable,

            int vpn)
        {
            GroupName = groupName;
            Servers = servers;
            SourceInterface = sourceInterface;
            SourceInterfaceVariable = sourceInterfaceVariable;
            Vpn = vpn;
        }
    }
}