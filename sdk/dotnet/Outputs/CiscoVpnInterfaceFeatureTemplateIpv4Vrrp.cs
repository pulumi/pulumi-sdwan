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
    public sealed class CiscoVpnInterfaceFeatureTemplateIpv4Vrrp
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
        /// Assign IP Address
        /// </summary>
        public readonly string? IpAddress;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? IpAddressVariable;
        /// <summary>
        /// VRRP Secondary IP address
        /// </summary>
        public readonly ImmutableArray<Outputs.CiscoVpnInterfaceFeatureTemplateIpv4VrrpIpv4SecondaryAddress> Ipv4SecondaryAddresses;
        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        public readonly bool? Optional;
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
        ///   - Default value: `100`
        /// </summary>
        public readonly int? Timer;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? TimerVariable;
        /// <summary>
        /// change TLOC preference
        ///   - Default value: `false`
        /// </summary>
        public readonly bool? TlocPreferenceChange;
        /// <summary>
        /// Set tloc preference change value
        ///   - Range: `1`-`4294967295`
        /// </summary>
        public readonly int? TlocPreferenceChangeValue;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? TlocPreferenceChangeValueVariable;
        /// <summary>
        /// Track OMP status
        ///   - Default value: `false`
        /// </summary>
        public readonly bool? TrackOmp;
        /// <summary>
        /// Track Prefix List
        /// </summary>
        public readonly string? TrackPrefixList;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? TrackPrefixListVariable;
        /// <summary>
        /// tracking object for VRRP configuration
        /// </summary>
        public readonly ImmutableArray<Outputs.CiscoVpnInterfaceFeatureTemplateIpv4VrrpTrackingObject> TrackingObjects;

        [OutputConstructor]
        private CiscoVpnInterfaceFeatureTemplateIpv4Vrrp(
            int? groupId,

            string? groupIdVariable,

            string? ipAddress,

            string? ipAddressVariable,

            ImmutableArray<Outputs.CiscoVpnInterfaceFeatureTemplateIpv4VrrpIpv4SecondaryAddress> ipv4SecondaryAddresses,

            bool? optional,

            int? priority,

            string? priorityVariable,

            int? timer,

            string? timerVariable,

            bool? tlocPreferenceChange,

            int? tlocPreferenceChangeValue,

            string? tlocPreferenceChangeValueVariable,

            bool? trackOmp,

            string? trackPrefixList,

            string? trackPrefixListVariable,

            ImmutableArray<Outputs.CiscoVpnInterfaceFeatureTemplateIpv4VrrpTrackingObject> trackingObjects)
        {
            GroupId = groupId;
            GroupIdVariable = groupIdVariable;
            IpAddress = ipAddress;
            IpAddressVariable = ipAddressVariable;
            Ipv4SecondaryAddresses = ipv4SecondaryAddresses;
            Optional = optional;
            Priority = priority;
            PriorityVariable = priorityVariable;
            Timer = timer;
            TimerVariable = timerVariable;
            TlocPreferenceChange = tlocPreferenceChange;
            TlocPreferenceChangeValue = tlocPreferenceChangeValue;
            TlocPreferenceChangeValueVariable = tlocPreferenceChangeValueVariable;
            TrackOmp = trackOmp;
            TrackPrefixList = trackPrefixList;
            TrackPrefixListVariable = trackPrefixListVariable;
            TrackingObjects = trackingObjects;
        }
    }
}
