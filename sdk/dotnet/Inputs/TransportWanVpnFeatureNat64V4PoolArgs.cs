// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class TransportWanVpnFeatureNat64V4PoolArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// NAT64 v4 Pool Name
        /// </summary>
        [Input("nat64V4PoolName")]
        public Input<string>? Nat64V4PoolName { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("nat64V4PoolNameVariable")]
        public Input<string>? Nat64V4PoolNameVariable { get; set; }

        /// <summary>
        /// NAT64 Overload
        ///   - Default value: `false`
        /// </summary>
        [Input("nat64V4PoolOverload")]
        public Input<bool>? Nat64V4PoolOverload { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("nat64V4PoolOverloadVariable")]
        public Input<string>? Nat64V4PoolOverloadVariable { get; set; }

        /// <summary>
        /// NAT64 Pool Range End
        /// </summary>
        [Input("nat64V4PoolRangeEnd")]
        public Input<string>? Nat64V4PoolRangeEnd { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("nat64V4PoolRangeEndVariable")]
        public Input<string>? Nat64V4PoolRangeEndVariable { get; set; }

        /// <summary>
        /// NAT64 Pool Range Start
        /// </summary>
        [Input("nat64V4PoolRangeStart")]
        public Input<string>? Nat64V4PoolRangeStart { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("nat64V4PoolRangeStartVariable")]
        public Input<string>? Nat64V4PoolRangeStartVariable { get; set; }

        public TransportWanVpnFeatureNat64V4PoolArgs()
        {
        }
        public static new TransportWanVpnFeatureNat64V4PoolArgs Empty => new TransportWanVpnFeatureNat64V4PoolArgs();
    }
}