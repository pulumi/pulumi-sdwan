// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ZoneBasedFirewallPolicyDefinitionApplyZonePairArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Destination Zone
        /// </summary>
        [Input("destinationZone")]
        public Input<string>? DestinationZone { get; set; }

        /// <summary>
        /// Source Zone
        /// </summary>
        [Input("sourceZone")]
        public Input<string>? SourceZone { get; set; }

        public ZoneBasedFirewallPolicyDefinitionApplyZonePairArgs()
        {
        }
        public static new ZoneBasedFirewallPolicyDefinitionApplyZonePairArgs Empty => new ZoneBasedFirewallPolicyDefinitionApplyZonePairArgs();
    }
}