// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Outputs
{

    [OutputType]
    public sealed class GetCiscoThousandeyesFeatureTemplateVirtualApplicationResult
    {
        /// <summary>
        /// List of Virtual applications
        /// </summary>
        public readonly string ApplicationType;
        /// <summary>
        /// List of Virtual applications
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        public readonly bool Optional;
        /// <summary>
        /// Set the Account Group Token
        /// </summary>
        public readonly string TeAccountGroupToken;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TeAccountGroupTokenVariable;
        /// <summary>
        /// Set the Agent IP Address
        /// </summary>
        public readonly string TeAgentIp;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TeAgentIpVariable;
        /// <summary>
        /// Set the Agent default gateway
        /// </summary>
        public readonly string TeDefaultGateway;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TeDefaultGatewayVariable;
        /// <summary>
        /// Set the host name
        /// </summary>
        public readonly string TeHostname;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TeHostnameVariable;
        /// <summary>
        /// Set the name server
        /// </summary>
        public readonly string TeNameServer;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TeNameServerVariable;
        /// <summary>
        /// PAC URL
        /// </summary>
        public readonly string TePacUrl;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TePacUrlVariable;
        /// <summary>
        /// Set the proxy host
        /// </summary>
        public readonly string TeProxyHost;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TeProxyHostVariable;
        /// <summary>
        /// Set the proxy port
        /// </summary>
        public readonly int TeProxyPort;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TeProxyPortVariable;
        /// <summary>
        /// VPN number
        /// </summary>
        public readonly int TeVpn;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TeVpnVariable;
        /// <summary>
        /// Web Proxy Type
        /// </summary>
        public readonly string TeWebProxyType;

        [OutputConstructor]
        private GetCiscoThousandeyesFeatureTemplateVirtualApplicationResult(
            string applicationType,

            string instanceId,

            bool optional,

            string teAccountGroupToken,

            string teAccountGroupTokenVariable,

            string teAgentIp,

            string teAgentIpVariable,

            string teDefaultGateway,

            string teDefaultGatewayVariable,

            string teHostname,

            string teHostnameVariable,

            string teNameServer,

            string teNameServerVariable,

            string tePacUrl,

            string tePacUrlVariable,

            string teProxyHost,

            string teProxyHostVariable,

            int teProxyPort,

            string teProxyPortVariable,

            int teVpn,

            string teVpnVariable,

            string teWebProxyType)
        {
            ApplicationType = applicationType;
            InstanceId = instanceId;
            Optional = optional;
            TeAccountGroupToken = teAccountGroupToken;
            TeAccountGroupTokenVariable = teAccountGroupTokenVariable;
            TeAgentIp = teAgentIp;
            TeAgentIpVariable = teAgentIpVariable;
            TeDefaultGateway = teDefaultGateway;
            TeDefaultGatewayVariable = teDefaultGatewayVariable;
            TeHostname = teHostname;
            TeHostnameVariable = teHostnameVariable;
            TeNameServer = teNameServer;
            TeNameServerVariable = teNameServerVariable;
            TePacUrl = tePacUrl;
            TePacUrlVariable = tePacUrlVariable;
            TeProxyHost = teProxyHost;
            TeProxyHostVariable = teProxyHostVariable;
            TeProxyPort = teProxyPort;
            TeProxyPortVariable = teProxyPortVariable;
            TeVpn = teVpn;
            TeVpnVariable = teVpnVariable;
            TeWebProxyType = teWebProxyType;
        }
    }
}
