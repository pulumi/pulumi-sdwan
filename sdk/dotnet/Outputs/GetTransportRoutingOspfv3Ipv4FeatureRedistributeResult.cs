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
    public sealed class GetTransportRoutingOspfv3Ipv4FeatureRedistributeResult
    {
        /// <summary>
        /// Enable NAT DIA for redistributed routes
        /// </summary>
        public readonly bool NatDia;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string NatDiaVariable;
        /// <summary>
        /// Set the protocol
        /// </summary>
        public readonly string Protocol;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ProtocolVariable;
        public readonly string RoutePolicyId;

        [OutputConstructor]
        private GetTransportRoutingOspfv3Ipv4FeatureRedistributeResult(
            bool natDia,

            string natDiaVariable,

            string protocol,

            string protocolVariable,

            string routePolicyId)
        {
            NatDia = natDia;
            NatDiaVariable = natDiaVariable;
            Protocol = protocol;
            ProtocolVariable = protocolVariable;
            RoutePolicyId = routePolicyId;
        }
    }
}