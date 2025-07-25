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
    public sealed class ServiceLanVpnFeatureIpv4ExportRouteTarget
    {
        /// <summary>
        /// Route target
        /// </summary>
        public readonly string? RouteTarget;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? RouteTargetVariable;

        [OutputConstructor]
        private ServiceLanVpnFeatureIpv4ExportRouteTarget(
            string? routeTarget,

            string? routeTargetVariable)
        {
            RouteTarget = routeTarget;
            RouteTargetVariable = routeTargetVariable;
        }
    }
}
