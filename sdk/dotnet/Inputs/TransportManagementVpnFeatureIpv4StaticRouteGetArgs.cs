// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class TransportManagementVpnFeatureIpv4StaticRouteGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Administrative distance, Attribute conditional on `gateway` being equal to `null0`
        ///   - Range: `1`-`255`
        ///   - Default value: `1`
        /// </summary>
        [Input("administrativeDistance")]
        public Input<int>? AdministrativeDistance { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("administrativeDistanceVariable")]
        public Input<string>? AdministrativeDistanceVariable { get; set; }

        /// <summary>
        /// Gateway
        ///   - Choices: `nextHop`, `dhcp`, `null0`
        ///   - Default value: `nextHop`
        /// </summary>
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        /// <summary>
        /// IP Address
        /// </summary>
        [Input("networkAddress")]
        public Input<string>? NetworkAddress { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("networkAddressVariable")]
        public Input<string>? NetworkAddressVariable { get; set; }

        [Input("nextHops")]
        private InputList<Inputs.TransportManagementVpnFeatureIpv4StaticRouteNextHopGetArgs>? _nextHops;

        /// <summary>
        /// IPv4 Route Gateway Next Hop, Attribute conditional on `gateway` being equal to `nextHop`
        /// </summary>
        public InputList<Inputs.TransportManagementVpnFeatureIpv4StaticRouteNextHopGetArgs> NextHops
        {
            get => _nextHops ?? (_nextHops = new InputList<Inputs.TransportManagementVpnFeatureIpv4StaticRouteNextHopGetArgs>());
            set => _nextHops = value;
        }

        /// <summary>
        /// Subnet Mask
        ///   - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`, `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`, `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`, `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`, `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
        /// </summary>
        [Input("subnetMask")]
        public Input<string>? SubnetMask { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("subnetMaskVariable")]
        public Input<string>? SubnetMaskVariable { get; set; }

        public TransportManagementVpnFeatureIpv4StaticRouteGetArgs()
        {
        }
        public static new TransportManagementVpnFeatureIpv4StaticRouteGetArgs Empty => new TransportManagementVpnFeatureIpv4StaticRouteGetArgs();
    }
}