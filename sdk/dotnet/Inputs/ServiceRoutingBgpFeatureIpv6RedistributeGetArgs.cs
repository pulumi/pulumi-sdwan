// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ServiceRoutingBgpFeatureIpv6RedistributeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set the protocol to redistribute routes from
        ///   - Choices: `static`, `connected`, `ospf`, `omp`
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

        public ServiceRoutingBgpFeatureIpv6RedistributeGetArgs()
        {
        }
        public static new ServiceRoutingBgpFeatureIpv6RedistributeGetArgs Empty => new ServiceRoutingBgpFeatureIpv6RedistributeGetArgs();
    }
}