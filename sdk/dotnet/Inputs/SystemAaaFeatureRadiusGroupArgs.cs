// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class SystemAaaFeatureRadiusGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set Radius server Group Name
        /// </summary>
        [Input("groupName")]
        public Input<string>? GroupName { get; set; }

        [Input("servers")]
        private InputList<Inputs.SystemAaaFeatureRadiusGroupServerArgs>? _servers;

        /// <summary>
        /// Configure the Radius server
        /// </summary>
        public InputList<Inputs.SystemAaaFeatureRadiusGroupServerArgs> Servers
        {
            get => _servers ?? (_servers = new InputList<Inputs.SystemAaaFeatureRadiusGroupServerArgs>());
            set => _servers = value;
        }

        /// <summary>
        /// Set interface to use to reach Radius server
        /// </summary>
        [Input("sourceInterface")]
        public Input<string>? SourceInterface { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("sourceInterfaceVariable")]
        public Input<string>? SourceInterfaceVariable { get; set; }

        /// <summary>
        /// Set VPN in which Radius server is located
        ///   - Range: `0`-`65530`
        ///   - Default value: `0`
        /// </summary>
        [Input("vpn")]
        public Input<int>? Vpn { get; set; }

        public SystemAaaFeatureRadiusGroupArgs()
        {
        }
        public static new SystemAaaFeatureRadiusGroupArgs Empty => new SystemAaaFeatureRadiusGroupArgs();
    }
}