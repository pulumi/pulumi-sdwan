// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class CiscoThousandeyesFeatureTemplateVirtualApplicationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// List of Virtual applications
        ///   - Default value: `te`
        /// </summary>
        [Input("applicationType")]
        public Input<string>? ApplicationType { get; set; }

        /// <summary>
        /// List of Virtual applications
        ///   - Default value: `1`
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        [Input("optional")]
        public Input<bool>? Optional { get; set; }

        /// <summary>
        /// Set the Account Group Token
        /// </summary>
        [Input("teAccountGroupToken")]
        public Input<string>? TeAccountGroupToken { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("teAccountGroupTokenVariable")]
        public Input<string>? TeAccountGroupTokenVariable { get; set; }

        /// <summary>
        /// Set the Agent IP Address
        /// </summary>
        [Input("teAgentIp")]
        public Input<string>? TeAgentIp { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("teAgentIpVariable")]
        public Input<string>? TeAgentIpVariable { get; set; }

        /// <summary>
        /// Set the Agent default gateway
        /// </summary>
        [Input("teDefaultGateway")]
        public Input<string>? TeDefaultGateway { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("teDefaultGatewayVariable")]
        public Input<string>? TeDefaultGatewayVariable { get; set; }

        /// <summary>
        /// Set the host name
        /// </summary>
        [Input("teHostname")]
        public Input<string>? TeHostname { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("teHostnameVariable")]
        public Input<string>? TeHostnameVariable { get; set; }

        /// <summary>
        /// Set the name server
        /// </summary>
        [Input("teNameServer")]
        public Input<string>? TeNameServer { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("teNameServerVariable")]
        public Input<string>? TeNameServerVariable { get; set; }

        /// <summary>
        /// PAC URL
        /// </summary>
        [Input("tePacUrl")]
        public Input<string>? TePacUrl { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("tePacUrlVariable")]
        public Input<string>? TePacUrlVariable { get; set; }

        /// <summary>
        /// Set the proxy host
        /// </summary>
        [Input("teProxyHost")]
        public Input<string>? TeProxyHost { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("teProxyHostVariable")]
        public Input<string>? TeProxyHostVariable { get; set; }

        /// <summary>
        /// Set the proxy port
        ///   - Range: `0`-`65535`
        /// </summary>
        [Input("teProxyPort")]
        public Input<int>? TeProxyPort { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("teProxyPortVariable")]
        public Input<string>? TeProxyPortVariable { get; set; }

        /// <summary>
        /// VPN number
        ///   - Range: `1`-`65535`
        /// </summary>
        [Input("teVpn")]
        public Input<int>? TeVpn { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("teVpnVariable")]
        public Input<string>? TeVpnVariable { get; set; }

        /// <summary>
        /// Web Proxy Type
        ///   - Choices: `none`, `static`, `pac`
        ///   - Default value: `none`
        /// </summary>
        [Input("teWebProxyType")]
        public Input<string>? TeWebProxyType { get; set; }

        public CiscoThousandeyesFeatureTemplateVirtualApplicationGetArgs()
        {
        }
        public static new CiscoThousandeyesFeatureTemplateVirtualApplicationGetArgs Empty => new CiscoThousandeyesFeatureTemplateVirtualApplicationGetArgs();
    }
}
