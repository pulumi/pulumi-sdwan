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
    public sealed class OtherThousandeyesFeatureVirtualApplication
    {
        /// <summary>
        /// Set the Account Group Token
        /// </summary>
        public readonly string? AccountGroupToken;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? AccountGroupTokenVariable;
        /// <summary>
        /// Set the Agent default gateway
        /// </summary>
        public readonly string? AgentDefaultGateway;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? AgentDefaultGatewayVariable;
        /// <summary>
        /// Set the host name
        /// </summary>
        public readonly string? Hostname;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? HostnameVariable;
        /// <summary>
        /// Set the Agent IP Address
        /// </summary>
        public readonly string? ManagementIp;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? ManagementIpVariable;
        /// <summary>
        /// Set the Agent SubnetMask
        ///   - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`, `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`, `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`, `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`, `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
        /// </summary>
        public readonly string? ManagementSubnetMask;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? ManagementSubnetMaskVariable;
        /// <summary>
        /// Set the name server
        /// </summary>
        public readonly string? NameServerIp;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? NameServerIpVariable;
        /// <summary>
        /// Set the proxy PAC url
        /// </summary>
        public readonly string? PacUrl;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? PacUrlVariable;
        /// <summary>
        /// Set the Proxy Host
        /// </summary>
        public readonly string? ProxyHost;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? ProxyHostVariable;
        /// <summary>
        /// Set the Proxy Port
        ///   - Range: `1`-`65535`
        /// </summary>
        public readonly int? ProxyPort;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? ProxyPortVariable;
        /// <summary>
        /// Select Web Proxy Type
        /// </summary>
        public readonly string? ProxyType;
        /// <summary>
        /// VPN number
        ///   - Range: `0`-`65530`
        /// </summary>
        public readonly int? Vpn;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? VpnVariable;

        [OutputConstructor]
        private OtherThousandeyesFeatureVirtualApplication(
            string? accountGroupToken,

            string? accountGroupTokenVariable,

            string? agentDefaultGateway,

            string? agentDefaultGatewayVariable,

            string? hostname,

            string? hostnameVariable,

            string? managementIp,

            string? managementIpVariable,

            string? managementSubnetMask,

            string? managementSubnetMaskVariable,

            string? nameServerIp,

            string? nameServerIpVariable,

            string? pacUrl,

            string? pacUrlVariable,

            string? proxyHost,

            string? proxyHostVariable,

            int? proxyPort,

            string? proxyPortVariable,

            string? proxyType,

            int? vpn,

            string? vpnVariable)
        {
            AccountGroupToken = accountGroupToken;
            AccountGroupTokenVariable = accountGroupTokenVariable;
            AgentDefaultGateway = agentDefaultGateway;
            AgentDefaultGatewayVariable = agentDefaultGatewayVariable;
            Hostname = hostname;
            HostnameVariable = hostnameVariable;
            ManagementIp = managementIp;
            ManagementIpVariable = managementIpVariable;
            ManagementSubnetMask = managementSubnetMask;
            ManagementSubnetMaskVariable = managementSubnetMaskVariable;
            NameServerIp = nameServerIp;
            NameServerIpVariable = nameServerIpVariable;
            PacUrl = pacUrl;
            PacUrlVariable = pacUrlVariable;
            ProxyHost = proxyHost;
            ProxyHostVariable = proxyHostVariable;
            ProxyPort = proxyPort;
            ProxyPortVariable = proxyPortVariable;
            ProxyType = proxyType;
            Vpn = vpn;
            VpnVariable = vpnVariable;
        }
    }
}
