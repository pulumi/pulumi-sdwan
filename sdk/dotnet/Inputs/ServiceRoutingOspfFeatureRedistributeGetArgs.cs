// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ServiceRoutingOspfFeatureRedistributeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable NAT DIA for redistributed routes
        ///   - Default value: `true`
        /// </summary>
        [Input("natDia")]
        public Input<bool>? NatDia { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("natDiaVariable")]
        public Input<string>? NatDiaVariable { get; set; }

        /// <summary>
        /// Set the protocol
        ///   - Choices: `static`, `connected`, `bgp`, `omp`, `nat`, `eigrp`
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

        public ServiceRoutingOspfFeatureRedistributeGetArgs()
        {
        }
        public static new ServiceRoutingOspfFeatureRedistributeGetArgs Empty => new ServiceRoutingOspfFeatureRedistributeGetArgs();
    }
}
