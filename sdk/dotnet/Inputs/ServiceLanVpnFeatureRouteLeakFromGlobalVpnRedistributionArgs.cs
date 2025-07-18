// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ServiceLanVpnFeatureRouteLeakFromGlobalVpnRedistributionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Protocol to restributed leaked routes
        ///   - Choices: `bgp`, `ospf`
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("protocolVariable")]
        public Input<string>? ProtocolVariable { get; set; }

        [Input("redistributionPolicyId")]
        public Input<string>? RedistributionPolicyId { get; set; }

        public ServiceLanVpnFeatureRouteLeakFromGlobalVpnRedistributionArgs()
        {
        }
        public static new ServiceLanVpnFeatureRouteLeakFromGlobalVpnRedistributionArgs Empty => new ServiceLanVpnFeatureRouteLeakFromGlobalVpnRedistributionArgs();
    }
}
