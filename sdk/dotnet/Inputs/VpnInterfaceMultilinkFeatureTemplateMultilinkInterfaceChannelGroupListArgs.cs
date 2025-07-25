// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class VpnInterfaceMultilinkFeatureTemplateMultilinkInterfaceChannelGroupListArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number
        ///   - Range: `0`-`30`
        /// </summary>
        [Input("channelGroup")]
        public Input<int>? ChannelGroup { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("channelGroupVariable")]
        public Input<string>? ChannelGroupVariable { get; set; }

        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        [Input("optional")]
        public Input<bool>? Optional { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("timeSlotVariable")]
        public Input<string>? TimeSlotVariable { get; set; }

        [Input("timeSlots")]
        private InputList<string>? _timeSlots;

        /// <summary>
        /// Time slots
        /// </summary>
        public InputList<string> TimeSlots
        {
            get => _timeSlots ?? (_timeSlots = new InputList<string>());
            set => _timeSlots = value;
        }

        public VpnInterfaceMultilinkFeatureTemplateMultilinkInterfaceChannelGroupListArgs()
        {
        }
        public static new VpnInterfaceMultilinkFeatureTemplateMultilinkInterfaceChannelGroupListArgs Empty => new VpnInterfaceMultilinkFeatureTemplateMultilinkInterfaceChannelGroupListArgs();
    }
}
