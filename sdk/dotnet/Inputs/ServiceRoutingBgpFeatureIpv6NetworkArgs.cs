// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ServiceRoutingBgpFeatureIpv6NetworkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configure the prefixes for BGP to announce
        /// </summary>
        [Input("networkPrefix")]
        public Input<string>? NetworkPrefix { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("networkPrefixVariable")]
        public Input<string>? NetworkPrefixVariable { get; set; }

        public ServiceRoutingBgpFeatureIpv6NetworkArgs()
        {
        }
        public static new ServiceRoutingBgpFeatureIpv6NetworkArgs Empty => new ServiceRoutingBgpFeatureIpv6NetworkArgs();
    }
}