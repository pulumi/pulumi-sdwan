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
    public sealed class ServiceLanVpnInterfaceEthernetFeatureIpv6Vrrp
    {
        /// <summary>
        /// Group ID
        ///   - Range: `1`-`255`
        /// </summary>
        public readonly int? GroupId;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? GroupIdVariable;
        /// <summary>
        /// IPv6 VRRP
        /// </summary>
        public readonly ImmutableArray<Outputs.ServiceLanVpnInterfaceEthernetFeatureIpv6VrrpIpv6Address> Ipv6Addresses;
        /// <summary>
        /// Set priority
        ///   - Range: `1`-`254`
        ///   - Default value: `100`
        /// </summary>
        public readonly int? Priority;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? PriorityVariable;
        /// <summary>
        /// Timer interval for successive advertisements, in milliseconds
        ///   - Range: `100`-`40950`
        ///   - Default value: `1000`
        /// </summary>
        public readonly int? Timer;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? TimerVariable;
        /// <summary>
        /// Track OMP status
        ///   - Default value: `false`
        /// </summary>
        public readonly bool? TrackOmp;

        [OutputConstructor]
        private ServiceLanVpnInterfaceEthernetFeatureIpv6Vrrp(
            int? groupId,

            string? groupIdVariable,

            ImmutableArray<Outputs.ServiceLanVpnInterfaceEthernetFeatureIpv6VrrpIpv6Address> ipv6Addresses,

            int? priority,

            string? priorityVariable,

            int? timer,

            string? timerVariable,

            bool? trackOmp)
        {
            GroupId = groupId;
            GroupIdVariable = groupIdVariable;
            Ipv6Addresses = ipv6Addresses;
            Priority = priority;
            PriorityVariable = priorityVariable;
            Timer = timer;
            TimerVariable = timerVariable;
            TrackOmp = trackOmp;
        }
    }
}