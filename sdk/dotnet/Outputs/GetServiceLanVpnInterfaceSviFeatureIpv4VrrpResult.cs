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
    public sealed class GetServiceLanVpnInterfaceSviFeatureIpv4VrrpResult
    {
        /// <summary>
        /// Assign IPV4 Address
        /// </summary>
        public readonly string Address;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string AddressVariable;
        /// <summary>
        /// Group ID
        /// </summary>
        public readonly int GroupId;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string GroupIdVariable;
        /// <summary>
        /// Track Prefix List
        /// </summary>
        public readonly string PrefixList;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string PrefixListVariable;
        /// <summary>
        /// Set priority
        /// </summary>
        public readonly int Priority;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string PriorityVariable;
        /// <summary>
        /// VRRP Secondary IPV4 address
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceLanVpnInterfaceSviFeatureIpv4VrrpSecondaryAddressResult> SecondaryAddresses;
        /// <summary>
        /// Timer interval for successive advertisements, in milliseconds
        /// </summary>
        public readonly int Timer;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TimerVariable;
        /// <summary>
        /// change TLOC preference
        /// </summary>
        public readonly bool TlocPrefixChange;
        /// <summary>
        /// Set tloc preference change value
        /// </summary>
        public readonly int TlocPrefixChangeValue;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TlocPrefixChangeValueVariable;
        /// <summary>
        /// Track OMP status
        /// </summary>
        public readonly bool TrackOmp;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TrackOmpVariable;
        /// <summary>
        /// tracking object for VRRP configuration
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceLanVpnInterfaceSviFeatureIpv4VrrpTrackingObjectResult> TrackingObjects;

        [OutputConstructor]
        private GetServiceLanVpnInterfaceSviFeatureIpv4VrrpResult(
            string address,

            string addressVariable,

            int groupId,

            string groupIdVariable,

            string prefixList,

            string prefixListVariable,

            int priority,

            string priorityVariable,

            ImmutableArray<Outputs.GetServiceLanVpnInterfaceSviFeatureIpv4VrrpSecondaryAddressResult> secondaryAddresses,

            int timer,

            string timerVariable,

            bool tlocPrefixChange,

            int tlocPrefixChangeValue,

            string tlocPrefixChangeValueVariable,

            bool trackOmp,

            string trackOmpVariable,

            ImmutableArray<Outputs.GetServiceLanVpnInterfaceSviFeatureIpv4VrrpTrackingObjectResult> trackingObjects)
        {
            Address = address;
            AddressVariable = addressVariable;
            GroupId = groupId;
            GroupIdVariable = groupIdVariable;
            PrefixList = prefixList;
            PrefixListVariable = prefixListVariable;
            Priority = priority;
            PriorityVariable = priorityVariable;
            SecondaryAddresses = secondaryAddresses;
            Timer = timer;
            TimerVariable = timerVariable;
            TlocPrefixChange = tlocPrefixChange;
            TlocPrefixChangeValue = tlocPrefixChangeValue;
            TlocPrefixChangeValueVariable = tlocPrefixChangeValueVariable;
            TrackOmp = trackOmp;
            TrackOmpVariable = trackOmpVariable;
            TrackingObjects = trackingObjects;
        }
    }
}
