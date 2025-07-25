// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class CiscoSystemFeatureTemplateObjectTrackerGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Type of grouping to be performed for tracker group
        ///   - Choices: `and`, `or`
        /// </summary>
        [Input("boolean")]
        public Input<string>? Boolean { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("booleanVariable")]
        public Input<string>? BooleanVariable { get; set; }

        [Input("groupTracksIds")]
        private InputList<Inputs.CiscoSystemFeatureTemplateObjectTrackerGroupTracksIdGetArgs>? _groupTracksIds;

        /// <summary>
        /// Tracks id in group configuration
        /// </summary>
        public InputList<Inputs.CiscoSystemFeatureTemplateObjectTrackerGroupTracksIdGetArgs> GroupTracksIds
        {
            get => _groupTracksIds ?? (_groupTracksIds = new InputList<Inputs.CiscoSystemFeatureTemplateObjectTrackerGroupTracksIdGetArgs>());
            set => _groupTracksIds = value;
        }

        /// <summary>
        /// interface name
        /// </summary>
        [Input("interface")]
        public Input<string>? Interface { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("interfaceVariable")]
        public Input<string>? InterfaceVariable { get; set; }

        /// <summary>
        /// IP address of route
        /// </summary>
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipVariable")]
        public Input<string>? IpVariable { get; set; }

        /// <summary>
        /// Route Ip Mask
        ///   - Default value: `0.0.0.0`
        /// </summary>
        [Input("mask")]
        public Input<string>? Mask { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("maskVariable")]
        public Input<string>? MaskVariable { get; set; }

        /// <summary>
        /// Object tracker ID
        ///   - Range: `1`-`1000`
        /// </summary>
        [Input("objectNumber")]
        public Input<int>? ObjectNumber { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("objectNumberVariable")]
        public Input<string>? ObjectNumberVariable { get; set; }

        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        [Input("optional")]
        public Input<bool>? Optional { get; set; }

        /// <summary>
        /// service sig
        /// </summary>
        [Input("sig")]
        public Input<string>? Sig { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("sigVariable")]
        public Input<string>? SigVariable { get; set; }

        /// <summary>
        /// VPN
        ///   - Range: `0`-`65527`
        ///   - Default value: `0`
        /// </summary>
        [Input("vpnId")]
        public Input<int>? VpnId { get; set; }

        public CiscoSystemFeatureTemplateObjectTrackerGetArgs()
        {
        }
        public static new CiscoSystemFeatureTemplateObjectTrackerGetArgs Empty => new CiscoSystemFeatureTemplateObjectTrackerGetArgs();
    }
}
