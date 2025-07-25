// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class CiscoVpnFeatureTemplateRouteVpnImportRedistributeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        [Input("optional")]
        public Input<bool>? Optional { get; set; }

        /// <summary>
        /// Select a Route Protocol to enable redistribution
        ///   - Choices: `bgp`, `eigrp`, `ospf`
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("protocolVariable")]
        public Input<string>? ProtocolVariable { get; set; }

        /// <summary>
        /// Select a Route Policy to enable redistribution
        /// </summary>
        [Input("routePolicy")]
        public Input<string>? RoutePolicy { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("routePolicyVariable")]
        public Input<string>? RoutePolicyVariable { get; set; }

        public CiscoVpnFeatureTemplateRouteVpnImportRedistributeGetArgs()
        {
        }
        public static new CiscoVpnFeatureTemplateRouteVpnImportRedistributeGetArgs Empty => new CiscoVpnFeatureTemplateRouteVpnImportRedistributeGetArgs();
    }
}
