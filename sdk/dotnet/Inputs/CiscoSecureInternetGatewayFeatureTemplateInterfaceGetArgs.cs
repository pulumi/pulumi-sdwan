// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class CiscoSecureInternetGatewayFeatureTemplateInterfaceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable Application Tunnel Type
        ///   - Choices: `sig`
        ///   - Default value: `sig`
        /// </summary>
        [Input("application")]
        public Input<string>? Application { get; set; }

        /// <summary>
        /// Auto Tunnel Mode
        ///   - Default value: `false`
        /// </summary>
        [Input("autoTunnelMode")]
        public Input<bool>? AutoTunnelMode { get; set; }

        /// <summary>
        /// IKE keepalive interval (seconds)
        ///   - Range: `0`-`65535`
        ///   - Default value: `10`
        /// </summary>
        [Input("deadPeerDetectionInterval")]
        public Input<int>? DeadPeerDetectionInterval { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("deadPeerDetectionIntervalVariable")]
        public Input<string>? DeadPeerDetectionIntervalVariable { get; set; }

        /// <summary>
        /// IKE keepalive retries
        ///   - Range: `0`-`255`
        ///   - Default value: `3`
        /// </summary>
        [Input("deadPeerDetectionRetries")]
        public Input<int>? DeadPeerDetectionRetries { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("deadPeerDetectionRetriesVariable")]
        public Input<string>? DeadPeerDetectionRetriesVariable { get; set; }

        /// <summary>
        /// Interface description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("descriptionVariable")]
        public Input<string>? DescriptionVariable { get; set; }

        /// <summary>
        /// IKE identity the IKE preshared secret belongs to
        ///   - Choices: `aes256-cbc-sha1`, `aes256-cbc-sha2`, `aes128-cbc-sha1`, `aes128-cbc-sha2`
        ///   - Default value: `aes256-cbc-sha1`
        /// </summary>
        [Input("ikeCiphersuite")]
        public Input<string>? IkeCiphersuite { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ikeCiphersuiteVariable")]
        public Input<string>? IkeCiphersuiteVariable { get; set; }

        /// <summary>
        /// IKE Diffie Hellman Groups
        ///   - Choices: `2`, `14`, `15`, `16`
        ///   - Default value: `14`
        /// </summary>
        [Input("ikeGroup")]
        public Input<string>? IkeGroup { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ikeGroupVariable")]
        public Input<string>? IkeGroupVariable { get; set; }

        /// <summary>
        /// Use preshared key to authenticate IKE peer
        /// </summary>
        [Input("ikePreSharedKey")]
        public Input<string>? IkePreSharedKey { get; set; }

        /// <summary>
        /// Use preshared key to authenticate IKE peer
        ///   - Default value: `true`
        /// </summary>
        [Input("ikePreSharedKeyDynamic")]
        public Input<bool>? IkePreSharedKeyDynamic { get; set; }

        /// <summary>
        /// IKE ID for the local endpoint. Input IPv4 address, domain name, or email address
        /// </summary>
        [Input("ikePreSharedKeyLocalId")]
        public Input<string>? IkePreSharedKeyLocalId { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ikePreSharedKeyLocalIdVariable")]
        public Input<string>? IkePreSharedKeyLocalIdVariable { get; set; }

        /// <summary>
        /// IKE ID for the remote endpoint. Input IPv4 address, domain name, or email address
        /// </summary>
        [Input("ikePreSharedKeyRemoteId")]
        public Input<string>? IkePreSharedKeyRemoteId { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ikePreSharedKeyRemoteIdVariable")]
        public Input<string>? IkePreSharedKeyRemoteIdVariable { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ikePreSharedKeyVariable")]
        public Input<string>? IkePreSharedKeyVariable { get; set; }

        /// <summary>
        /// IKE rekey interval &lt;300..1209600&gt; seconds
        ///   - Range: `300`-`1209600`
        ///   - Default value: `14400`
        /// </summary>
        [Input("ikeRekeyInterval")]
        public Input<int>? IkeRekeyInterval { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ikeRekeyIntervalVariable")]
        public Input<string>? IkeRekeyIntervalVariable { get; set; }

        /// <summary>
        /// IKE Version &lt;1..2&gt;
        ///   - Range: `1`-`2`
        ///   - Default value: `2`
        /// </summary>
        [Input("ikeVersion")]
        public Input<int>? IkeVersion { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ikeVersionVariable")]
        public Input<string>? IkeVersionVariable { get; set; }

        /// <summary>
        /// Unnumbered interface
        ///   - Default value: `true`
        /// </summary>
        [Input("ipUnnumbered")]
        public Input<bool>? IpUnnumbered { get; set; }

        /// <summary>
        /// IPsec(ESP) encryption and integrity protocol
        ///   - Choices: `aes256-cbc-sha1`, `aes256-cbc-sha384`, `aes256-cbc-sha256`, `aes256-cbc-sha512`, `aes256-gcm`, `null-sha1`, `null-sha384`, `null-sha256`, `null-sha512`
        ///   - Default value: `aes256-gcm`
        /// </summary>
        [Input("ipsecCiphersuite")]
        public Input<string>? IpsecCiphersuite { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipsecCiphersuiteVariable")]
        public Input<string>? IpsecCiphersuiteVariable { get; set; }

        /// <summary>
        /// IPsec perfect forward secrecy settings
        ///   - Choices: `group-2`, `group-14`, `group-15`, `group-16`, `none`
        ///   - Default value: `none`
        /// </summary>
        [Input("ipsecPerfectForwardSecrecy")]
        public Input<string>? IpsecPerfectForwardSecrecy { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipsecPerfectForwardSecrecyVariable")]
        public Input<string>? IpsecPerfectForwardSecrecyVariable { get; set; }

        /// <summary>
        /// IPsec rekey interval &lt;300..1209600&gt; seconds
        ///   - Range: `300`-`1209600`
        ///   - Default value: `3600`
        /// </summary>
        [Input("ipsecRekeyInterval")]
        public Input<int>? IpsecRekeyInterval { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipsecRekeyIntervalVariable")]
        public Input<string>? IpsecRekeyIntervalVariable { get; set; }

        /// <summary>
        /// Replay window size 32..8192 (must be a power of 2)
        ///   - Range: `64`-`4096`
        ///   - Default value: `512`
        /// </summary>
        [Input("ipsecReplayWindow")]
        public Input<int>? IpsecReplayWindow { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipsecReplayWindowVariable")]
        public Input<string>? IpsecReplayWindowVariable { get; set; }

        /// <summary>
        /// Assign IPv4 address
        /// </summary>
        [Input("ipv4Address")]
        public Input<string>? Ipv4Address { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipv4AddressVariable")]
        public Input<string>? Ipv4AddressVariable { get; set; }

        /// <summary>
        /// Interface MTU &lt;576..2000&gt;, in bytes
        ///   - Range: `576`-`2000`
        ///   - Default value: `1400`
        /// </summary>
        [Input("mtu")]
        public Input<int>? Mtu { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("mtuVariable")]
        public Input<string>? MtuVariable { get; set; }

        /// <summary>
        /// Interface name: IPsec when present
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

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
        /// Administrative state
        ///   - Default value: `false`
        /// </summary>
        [Input("shutdown")]
        public Input<bool>? Shutdown { get; set; }

        /// <summary>
        /// SIG Tunnel Provider
        ///   - Choices: `secure-internet-gateway-umbrella`, `secure-internet-gateway-zscaler`, `secure-internet-gateway-other`
        ///   - Default value: `secure-internet-gateway-umbrella`
        /// </summary>
        [Input("sigProvider")]
        public Input<string>? SigProvider { get; set; }

        /// <summary>
        /// TCP MSS on SYN packets, in bytes
        ///   - Range: `500`-`1460`
        /// </summary>
        [Input("tcpMss")]
        public Input<int>? TcpMss { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("tcpMssVariable")]
        public Input<string>? TcpMssVariable { get; set; }

        /// <summary>
        /// Enable/disable SIG tracking
        ///   - Default value: `true`
        /// </summary>
        [Input("trackEnable")]
        public Input<bool>? TrackEnable { get; set; }

        /// <summary>
        /// Enable tracker for this interface
        /// </summary>
        [Input("tracker")]
        public Input<string>? Tracker { get; set; }

        /// <summary>
        /// SIG Tunnel Data Center
        ///   - Choices: `primary-dc`, `secondary-dc`
        ///   - Default value: `primary-dc`
        /// </summary>
        [Input("tunnelDcPreference")]
        public Input<string>? TunnelDcPreference { get; set; }

        /// <summary>
        /// Tunnel destination IP address
        /// </summary>
        [Input("tunnelDestination")]
        public Input<string>? TunnelDestination { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("tunnelDestinationVariable")]
        public Input<string>? TunnelDestinationVariable { get; set; }

        /// <summary>
        /// Public IP required to setup GRE tunnel to Zscaler
        ///   - Default value: `Auto`
        /// </summary>
        [Input("tunnelPublicIp")]
        public Input<string>? TunnelPublicIp { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("tunnelPublicIpVariable")]
        public Input<string>? TunnelPublicIpVariable { get; set; }

        /// <summary>
        /// &lt;1..32 characters&gt; Interface name: ge0/&lt;0-..&gt; or ge0/&lt;0-..&gt;.vlanid
        /// </summary>
        [Input("tunnelRouteVia")]
        public Input<string>? TunnelRouteVia { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("tunnelRouteViaVariable")]
        public Input<string>? TunnelRouteViaVariable { get; set; }

        /// <summary>
        /// Tunnel source IP Address
        /// </summary>
        [Input("tunnelSource")]
        public Input<string>? TunnelSource { get; set; }

        /// <summary>
        /// &lt;1..32 characters&gt; Interface name: ge0/&lt;0-..&gt; or ge0/&lt;0-..&gt;.vlanid
        /// </summary>
        [Input("tunnelSourceInterface")]
        public Input<string>? TunnelSourceInterface { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("tunnelSourceInterfaceVariable")]
        public Input<string>? TunnelSourceInterfaceVariable { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("tunnelSourceVariable")]
        public Input<string>? TunnelSourceVariable { get; set; }

        public CiscoSecureInternetGatewayFeatureTemplateInterfaceGetArgs()
        {
        }
        public static new CiscoSecureInternetGatewayFeatureTemplateInterfaceGetArgs Empty => new CiscoSecureInternetGatewayFeatureTemplateInterfaceGetArgs();
    }
}
