// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class CiscoVpnFeatureTemplateRouteGlobalImportArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        [Input("optional")]
        public Input<bool>? Optional { get; set; }

        /// <summary>
        /// Select a Route Protocol to enable route leaking from Global VPN to this Service VPN
        ///   - Choices: `static`, `connected`, `bgp`, `ospf`
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("protocolSubTypeVariable")]
        public Input<string>? ProtocolSubTypeVariable { get; set; }

        [Input("protocolSubTypes")]
        private InputList<string>? _protocolSubTypes;

        /// <summary>
        /// - Default value: `external`
        /// </summary>
        public InputList<string> ProtocolSubTypes
        {
            get => _protocolSubTypes ?? (_protocolSubTypes = new InputList<string>());
            set => _protocolSubTypes = value;
        }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("protocolVariable")]
        public Input<string>? ProtocolVariable { get; set; }

        [Input("redistributes")]
        private InputList<Inputs.CiscoVpnFeatureTemplateRouteGlobalImportRedistributeArgs>? _redistributes;

        /// <summary>
        /// Enable redistribution of replicated route protocol
        /// </summary>
        public InputList<Inputs.CiscoVpnFeatureTemplateRouteGlobalImportRedistributeArgs> Redistributes
        {
            get => _redistributes ?? (_redistributes = new InputList<Inputs.CiscoVpnFeatureTemplateRouteGlobalImportRedistributeArgs>());
            set => _redistributes = value;
        }

        /// <summary>
        /// Select a Route Policy to enable route leaking from Global VPN to this Service VPN
        /// </summary>
        [Input("routePolicy")]
        public Input<string>? RoutePolicy { get; set; }

        public CiscoVpnFeatureTemplateRouteGlobalImportArgs()
        {
        }
        public static new CiscoVpnFeatureTemplateRouteGlobalImportArgs Empty => new CiscoVpnFeatureTemplateRouteGlobalImportArgs();
    }
}
