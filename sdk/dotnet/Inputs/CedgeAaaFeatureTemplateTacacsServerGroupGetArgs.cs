// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class CedgeAaaFeatureTemplateTacacsServerGroupGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set TACACS server Group Name
        /// </summary>
        [Input("groupName")]
        public Input<string>? GroupName { get; set; }

        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        [Input("optional")]
        public Input<bool>? Optional { get; set; }

        [Input("servers")]
        private InputList<Inputs.CedgeAaaFeatureTemplateTacacsServerGroupServerGetArgs>? _servers;

        /// <summary>
        /// Configure the TACACS server
        /// </summary>
        public InputList<Inputs.CedgeAaaFeatureTemplateTacacsServerGroupServerGetArgs> Servers
        {
            get => _servers ?? (_servers = new InputList<Inputs.CedgeAaaFeatureTemplateTacacsServerGroupServerGetArgs>());
            set => _servers = value;
        }

        /// <summary>
        /// Set interface to use to reach TACACS server
        /// </summary>
        [Input("sourceInterface")]
        public Input<string>? SourceInterface { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("sourceInterfaceVariable")]
        public Input<string>? SourceInterfaceVariable { get; set; }

        /// <summary>
        /// Set VPN in which TACACS server is located
        ///   - Range: `0`-`65530`
        ///   - Default value: `0`
        /// </summary>
        [Input("vpnId")]
        public Input<int>? VpnId { get; set; }

        public CedgeAaaFeatureTemplateTacacsServerGroupGetArgs()
        {
        }
        public static new CedgeAaaFeatureTemplateTacacsServerGroupGetArgs Empty => new CedgeAaaFeatureTemplateTacacsServerGroupGetArgs();
    }
}
