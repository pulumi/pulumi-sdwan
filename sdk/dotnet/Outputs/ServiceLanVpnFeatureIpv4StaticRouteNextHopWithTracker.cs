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
    public sealed class ServiceLanVpnFeatureIpv4StaticRouteNextHopWithTracker
    {
        /// <summary>
        /// Address
        /// </summary>
        public readonly string? Address;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? AddressVariable;
        /// <summary>
        /// Administrative distance
        ///   - Range: `1`-`255`
        /// </summary>
        public readonly int? AdministrativeDistance;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? AdministrativeDistanceVariable;
        public readonly string? TrackerId;

        [OutputConstructor]
        private ServiceLanVpnFeatureIpv4StaticRouteNextHopWithTracker(
            string? address,

            string? addressVariable,

            int? administrativeDistance,

            string? administrativeDistanceVariable,

            string? trackerId)
        {
            Address = address;
            AddressVariable = addressVariable;
            AdministrativeDistance = administrativeDistance;
            AdministrativeDistanceVariable = administrativeDistanceVariable;
            TrackerId = trackerId;
        }
    }
}
