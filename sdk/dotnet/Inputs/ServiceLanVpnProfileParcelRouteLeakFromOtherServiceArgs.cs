// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ServiceLanVpnProfileParcelRouteLeakFromOtherServiceArgs : global::Pulumi.ResourceArgs
    {
        [Input("redistributions")]
        private InputList<Inputs.ServiceLanVpnProfileParcelRouteLeakFromOtherServiceRedistributionArgs>? _redistributions;

        /// <summary>
        /// Redistribute Route to specific Protocol on Current Service VPN
        /// </summary>
        public InputList<Inputs.ServiceLanVpnProfileParcelRouteLeakFromOtherServiceRedistributionArgs> Redistributions
        {
            get => _redistributions ?? (_redistributions = new InputList<Inputs.ServiceLanVpnProfileParcelRouteLeakFromOtherServiceRedistributionArgs>());
            set => _redistributions = value;
        }

        [Input("routePolicyId")]
        public Input<string>? RoutePolicyId { get; set; }

        /// <summary>
        /// Leak Route of particular protocol from Source Service VPN
        ///   - Choices: `static`, `connected`, `bgp`, `ospf`
        /// </summary>
        [Input("routeProtocol")]
        public Input<string>? RouteProtocol { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("routeProtocolVariable")]
        public Input<string>? RouteProtocolVariable { get; set; }

        /// <summary>
        /// Source Service VPN from where route are to be leaked
        ///   - Range: `1`-`65530`
        /// </summary>
        [Input("sourceVpn")]
        public Input<int>? SourceVpn { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("sourceVpnVariable")]
        public Input<string>? SourceVpnVariable { get; set; }

        public ServiceLanVpnProfileParcelRouteLeakFromOtherServiceArgs()
        {
        }
        public static new ServiceLanVpnProfileParcelRouteLeakFromOtherServiceArgs Empty => new ServiceLanVpnProfileParcelRouteLeakFromOtherServiceArgs();
    }
}
