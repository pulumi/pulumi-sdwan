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
    public sealed class GetTransportManagementVpnProfileParcelIpv4StaticRouteResult
    {
        /// <summary>
        /// Administrative distance
        /// </summary>
        public readonly int AdministrativeDistance;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string AdministrativeDistanceVariable;
        /// <summary>
        /// Gateway
        /// </summary>
        public readonly string Gateway;
        /// <summary>
        /// IPv4 Route Gateway Next Hop
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTransportManagementVpnProfileParcelIpv4StaticRouteIpv4RouteGatewayNextHoResult> Ipv4RouteGatewayNextHos;
        /// <summary>
        /// IP Address
        /// </summary>
        public readonly string NetworkAddress;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string NetworkAddressVariable;
        /// <summary>
        /// Subnet Mask
        /// </summary>
        public readonly string SubnetMask;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string SubnetMaskVariable;

        [OutputConstructor]
        private GetTransportManagementVpnProfileParcelIpv4StaticRouteResult(
            int administrativeDistance,

            string administrativeDistanceVariable,

            string gateway,

            ImmutableArray<Outputs.GetTransportManagementVpnProfileParcelIpv4StaticRouteIpv4RouteGatewayNextHoResult> ipv4RouteGatewayNextHos,

            string networkAddress,

            string networkAddressVariable,

            string subnetMask,

            string subnetMaskVariable)
        {
            AdministrativeDistance = administrativeDistance;
            AdministrativeDistanceVariable = administrativeDistanceVariable;
            Gateway = gateway;
            Ipv4RouteGatewayNextHos = ipv4RouteGatewayNextHos;
            NetworkAddress = networkAddress;
            NetworkAddressVariable = networkAddressVariable;
            SubnetMask = subnetMask;
            SubnetMaskVariable = subnetMaskVariable;
        }
    }
}
