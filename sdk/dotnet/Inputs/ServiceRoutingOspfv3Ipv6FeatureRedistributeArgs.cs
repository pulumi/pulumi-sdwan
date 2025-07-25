// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ServiceRoutingOspfv3Ipv6FeatureRedistributeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set the protocol
        ///   - Choices: `connected`, `static`, `omp`, `bgp`, `eigrp`
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("protocolVariable")]
        public Input<string>? ProtocolVariable { get; set; }

        [Input("routePolicyId")]
        public Input<string>? RoutePolicyId { get; set; }

        public ServiceRoutingOspfv3Ipv6FeatureRedistributeArgs()
        {
        }
        public static new ServiceRoutingOspfv3Ipv6FeatureRedistributeArgs Empty => new ServiceRoutingOspfv3Ipv6FeatureRedistributeArgs();
    }
}
