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
    public sealed class GetServiceLanVpnInterfaceEthernetFeatureIpv4VrrpResult
    {
        /// <summary>
        /// VRRP Ip Address
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
        /// Set priority
        /// </summary>
        public readonly int Priority;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string PriorityVariable;
        /// <summary>
        /// VRRP Secondary Ip Addresses
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceLanVpnInterfaceEthernetFeatureIpv4VrrpSecondaryAddressResult> SecondaryAddresses;
        /// <summary>
        /// Timer interval for successive advertisements, in milliseconds
        /// </summary>
        public readonly int Timer;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TimerVariable;
        /// <summary>
        /// Timer interval for successive advertisements, in milliseconds
        /// </summary>
        public readonly int TlocPrefChangeValue;
        /// <summary>
        /// Timer interval for successive advertisements, in milliseconds
        /// </summary>
        public readonly bool TlocPrefixChange;
        /// <summary>
        /// Track OMP status
        /// </summary>
        public readonly bool TrackOmp;

        [OutputConstructor]
        private GetServiceLanVpnInterfaceEthernetFeatureIpv4VrrpResult(
            string address,

            string addressVariable,

            int groupId,

            string groupIdVariable,

            int priority,

            string priorityVariable,

            ImmutableArray<Outputs.GetServiceLanVpnInterfaceEthernetFeatureIpv4VrrpSecondaryAddressResult> secondaryAddresses,

            int timer,

            string timerVariable,

            int tlocPrefChangeValue,

            bool tlocPrefixChange,

            bool trackOmp)
        {
            Address = address;
            AddressVariable = addressVariable;
            GroupId = groupId;
            GroupIdVariable = groupIdVariable;
            Priority = priority;
            PriorityVariable = priorityVariable;
            SecondaryAddresses = secondaryAddresses;
            Timer = timer;
            TimerVariable = timerVariable;
            TlocPrefChangeValue = tlocPrefChangeValue;
            TlocPrefixChange = tlocPrefixChange;
            TrackOmp = trackOmp;
        }
    }
}