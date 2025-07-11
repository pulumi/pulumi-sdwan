// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class CiscoVpnFeatureTemplateNatPoolArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Direction of NAT translation
        ///   - Choices: `inside`, `outside`
        /// </summary>
        [Input("direction")]
        public Input<string>? Direction { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("directionVariable")]
        public Input<string>? DirectionVariable { get; set; }

        /// <summary>
        /// NAT Pool Name, natpool1..31
        ///   - Range: `1`-`31`
        /// </summary>
        [Input("name")]
        public Input<int>? Name { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("nameVariable")]
        public Input<string>? NameVariable { get; set; }

        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        [Input("optional")]
        public Input<bool>? Optional { get; set; }

        /// <summary>
        /// Enable port translation(PAT)
        ///   - Default value: `true`
        /// </summary>
        [Input("overload")]
        public Input<bool>? Overload { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("overloadVariable")]
        public Input<string>? OverloadVariable { get; set; }

        /// <summary>
        /// Ending IP address of NAT Pool Prefix Length
        ///   - Range: `1`-`32`
        /// </summary>
        [Input("prefixLength")]
        public Input<int>? PrefixLength { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("prefixLengthVariable")]
        public Input<string>? PrefixLengthVariable { get; set; }

        /// <summary>
        /// Ending IP address of NAT pool range
        /// </summary>
        [Input("rangeEnd")]
        public Input<string>? RangeEnd { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("rangeEndVariable")]
        public Input<string>? RangeEndVariable { get; set; }

        /// <summary>
        /// Starting IP address of NAT pool range
        /// </summary>
        [Input("rangeStart")]
        public Input<string>? RangeStart { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("rangeStartVariable")]
        public Input<string>? RangeStartVariable { get; set; }

        /// <summary>
        /// Add Object/Object Group Tracker
        ///   - Range: `1`-`1000`
        /// </summary>
        [Input("trackerId")]
        public Input<int>? TrackerId { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("trackerIdVariable")]
        public Input<string>? TrackerIdVariable { get; set; }

        public CiscoVpnFeatureTemplateNatPoolArgs()
        {
        }
        public static new CiscoVpnFeatureTemplateNatPoolArgs Empty => new CiscoVpnFeatureTemplateNatPoolArgs();
    }
}
