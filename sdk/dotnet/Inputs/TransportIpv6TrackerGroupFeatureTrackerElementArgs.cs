// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class TransportIpv6TrackerGroupFeatureTrackerElementArgs : global::Pulumi.ResourceArgs
    {
        [Input("trackerId")]
        public Input<string>? TrackerId { get; set; }

        public TransportIpv6TrackerGroupFeatureTrackerElementArgs()
        {
        }
        public static new TransportIpv6TrackerGroupFeatureTrackerElementArgs Empty => new TransportIpv6TrackerGroupFeatureTrackerElementArgs();
    }
}