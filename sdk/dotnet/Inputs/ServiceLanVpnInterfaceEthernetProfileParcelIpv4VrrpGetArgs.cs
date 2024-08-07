// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ServiceLanVpnInterfaceEthernetProfileParcelIpv4VrrpGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Group ID
        ///   - Range: `1`-`255`
        /// </summary>
        [Input("groupId")]
        public Input<int>? GroupId { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("groupIdVariable")]
        public Input<string>? GroupIdVariable { get; set; }

        /// <summary>
        /// VRRP Ip Address
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipAddressVariable")]
        public Input<string>? IpAddressVariable { get; set; }

        /// <summary>
        /// Set priority
        ///   - Range: `1`-`254`
        ///   - Default value: `100`
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("priorityVariable")]
        public Input<string>? PriorityVariable { get; set; }

        [Input("secondaryAddresses")]
        private InputList<Inputs.ServiceLanVpnInterfaceEthernetProfileParcelIpv4VrrpSecondaryAddressGetArgs>? _secondaryAddresses;

        /// <summary>
        /// VRRP Secondary Ip Addresses
        /// </summary>
        public InputList<Inputs.ServiceLanVpnInterfaceEthernetProfileParcelIpv4VrrpSecondaryAddressGetArgs> SecondaryAddresses
        {
            get => _secondaryAddresses ?? (_secondaryAddresses = new InputList<Inputs.ServiceLanVpnInterfaceEthernetProfileParcelIpv4VrrpSecondaryAddressGetArgs>());
            set => _secondaryAddresses = value;
        }

        /// <summary>
        /// Timer interval for successive advertisements, in milliseconds
        ///   - Range: `100`-`40950`
        ///   - Default value: `1000`
        /// </summary>
        [Input("timer")]
        public Input<int>? Timer { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("timerVariable")]
        public Input<string>? TimerVariable { get; set; }

        /// <summary>
        /// Timer interval for successive advertisements, in milliseconds
        ///   - Range: `100`-`4294967295`
        /// </summary>
        [Input("tlocPrefChangeValue")]
        public Input<int>? TlocPrefChangeValue { get; set; }

        /// <summary>
        /// Timer interval for successive advertisements, in milliseconds
        ///   - Default value: `false`
        /// </summary>
        [Input("tlocPrefixChange")]
        public Input<bool>? TlocPrefixChange { get; set; }

        /// <summary>
        /// Track OMP status
        ///   - Default value: `false`
        /// </summary>
        [Input("trackOmp")]
        public Input<bool>? TrackOmp { get; set; }

        public ServiceLanVpnInterfaceEthernetProfileParcelIpv4VrrpGetArgs()
        {
        }
        public static new ServiceLanVpnInterfaceEthernetProfileParcelIpv4VrrpGetArgs Empty => new ServiceLanVpnInterfaceEthernetProfileParcelIpv4VrrpGetArgs();
    }
}
