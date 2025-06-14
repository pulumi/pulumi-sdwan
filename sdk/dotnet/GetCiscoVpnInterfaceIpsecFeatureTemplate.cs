// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetCiscoVpnInterfaceIpsecFeatureTemplate
    {
        /// <summary>
        /// This data source can read the Cisco VPN Interface IPSec feature template.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Sdwan = Pulumi.Sdwan;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Sdwan.GetCiscoVpnInterfaceIpsecFeatureTemplate.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetCiscoVpnInterfaceIpsecFeatureTemplateResult> InvokeAsync(GetCiscoVpnInterfaceIpsecFeatureTemplateArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCiscoVpnInterfaceIpsecFeatureTemplateResult>("sdwan:index/getCiscoVpnInterfaceIpsecFeatureTemplate:getCiscoVpnInterfaceIpsecFeatureTemplate", args ?? new GetCiscoVpnInterfaceIpsecFeatureTemplateArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Cisco VPN Interface IPSec feature template.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Sdwan = Pulumi.Sdwan;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Sdwan.GetCiscoVpnInterfaceIpsecFeatureTemplate.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCiscoVpnInterfaceIpsecFeatureTemplateResult> Invoke(GetCiscoVpnInterfaceIpsecFeatureTemplateInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCiscoVpnInterfaceIpsecFeatureTemplateResult>("sdwan:index/getCiscoVpnInterfaceIpsecFeatureTemplate:getCiscoVpnInterfaceIpsecFeatureTemplate", args ?? new GetCiscoVpnInterfaceIpsecFeatureTemplateInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Cisco VPN Interface IPSec feature template.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Sdwan = Pulumi.Sdwan;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Sdwan.GetCiscoVpnInterfaceIpsecFeatureTemplate.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCiscoVpnInterfaceIpsecFeatureTemplateResult> Invoke(GetCiscoVpnInterfaceIpsecFeatureTemplateInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCiscoVpnInterfaceIpsecFeatureTemplateResult>("sdwan:index/getCiscoVpnInterfaceIpsecFeatureTemplate:getCiscoVpnInterfaceIpsecFeatureTemplate", args ?? new GetCiscoVpnInterfaceIpsecFeatureTemplateInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCiscoVpnInterfaceIpsecFeatureTemplateArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the feature template
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// The name of the feature template
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetCiscoVpnInterfaceIpsecFeatureTemplateArgs()
        {
        }
        public static new GetCiscoVpnInterfaceIpsecFeatureTemplateArgs Empty => new GetCiscoVpnInterfaceIpsecFeatureTemplateArgs();
    }

    public sealed class GetCiscoVpnInterfaceIpsecFeatureTemplateInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the feature template
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The name of the feature template
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetCiscoVpnInterfaceIpsecFeatureTemplateInvokeArgs()
        {
        }
        public static new GetCiscoVpnInterfaceIpsecFeatureTemplateInvokeArgs Empty => new GetCiscoVpnInterfaceIpsecFeatureTemplateInvokeArgs();
    }


    [OutputType]
    public sealed class GetCiscoVpnInterfaceIpsecFeatureTemplateResult
    {
        /// <summary>
        /// Enable Application Tunnel Type
        /// </summary>
        public readonly string Application;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ApplicationVariable;
        /// <summary>
        /// Enable clear dont fragment (Currently Only SDWAN Tunnel Interface)
        /// </summary>
        public readonly bool ClearDontFragment;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ClearDontFragmentVariable;
        /// <summary>
        /// IKE keepalive interval (seconds)
        /// </summary>
        public readonly int DeadPeerDetectionInterval;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string DeadPeerDetectionIntervalVariable;
        /// <summary>
        /// IKE keepalive retries
        /// </summary>
        public readonly int DeadPeerDetectionRetries;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string DeadPeerDetectionRetriesVariable;
        /// <summary>
        /// The description of the feature template
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// List of supported device types
        /// </summary>
        public readonly ImmutableArray<string> DeviceTypes;
        /// <summary>
        /// The id of the feature template
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// IKE identity the IKE preshared secret belongs to
        /// </summary>
        public readonly string IkeCiphersuite;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string IkeCiphersuiteVariable;
        /// <summary>
        /// IKE Diffie Hellman Groups
        /// </summary>
        public readonly string IkeGroup;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string IkeGroupVariable;
        /// <summary>
        /// IKE integrity protocol
        /// </summary>
        public readonly string IkeMode;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string IkeModeVariable;
        /// <summary>
        /// Use preshared key to authenticate IKE peer
        /// </summary>
        public readonly string IkePreSharedKey;
        /// <summary>
        /// IKE ID for the local endpoint. Input IPv4 address, domain name, or email address
        /// </summary>
        public readonly string IkePreSharedKeyLocalId;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string IkePreSharedKeyLocalIdVariable;
        /// <summary>
        /// IKE ID for the remote endpoint. Input IPv4 address, domain name, or email address
        /// </summary>
        public readonly string IkePreSharedKeyRemoteId;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string IkePreSharedKeyRemoteIdVariable;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string IkePreSharedKeyVariable;
        /// <summary>
        /// IKE rekey interval \n\n seconds
        /// </summary>
        public readonly int IkeRekeyInterval;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string IkeRekeyIntervalVariable;
        /// <summary>
        /// IKE Version \n\n
        /// </summary>
        public readonly int IkeVersion;
        /// <summary>
        /// Interface description
        /// </summary>
        public readonly string InterfaceDescription;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string InterfaceDescriptionVariable;
        /// <summary>
        /// Interface name: IPsec when present
        /// </summary>
        public readonly string InterfaceName;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string InterfaceNameVariable;
        /// <summary>
        /// Assign IPv4 address
        /// </summary>
        public readonly string IpAddress;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string IpAddressVariable;
        /// <summary>
        /// IPsec(ESP) encryption and integrity protocol
        /// </summary>
        public readonly string IpsecCiphersuite;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string IpsecCiphersuiteVariable;
        /// <summary>
        /// IPsec perfect forward secrecy settings
        /// </summary>
        public readonly string IpsecPerfectForwardSecrecy;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string IpsecPerfectForwardSecrecyVariable;
        /// <summary>
        /// IPsec rekey interval \n\n seconds
        /// </summary>
        public readonly int IpsecRekeyInterval;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string IpsecRekeyIntervalVariable;
        /// <summary>
        /// Replay window size 32..8192 (must be a power of 2)
        /// </summary>
        public readonly int IpsecReplayWindow;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string IpsecReplayWindowVariable;
        /// <summary>
        /// Interface MTU \n\n, in bytes
        /// </summary>
        public readonly int Mtu;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string MtuVariable;
        /// <summary>
        /// The name of the feature template
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Administrative state
        /// </summary>
        public readonly bool Shutdown;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ShutdownVariable;
        /// <summary>
        /// TCP MSS on SYN packets, in bytes
        /// </summary>
        public readonly int TcpMssAdjust;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TcpMssAdjustVariable;
        /// <summary>
        /// The template type
        /// </summary>
        public readonly string TemplateType;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TrackerVariable;
        /// <summary>
        /// Enable tracker for this interface
        /// </summary>
        public readonly ImmutableArray<string> Trackers;
        /// <summary>
        /// Tunnel destination IP address
        /// </summary>
        public readonly string TunnelDestination;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TunnelDestinationVariable;
        /// <summary>
        /// \n\n Interface name: ge0/\n\n or ge0/\n\n.vlanid
        /// </summary>
        public readonly string TunnelRouteVia;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TunnelRouteViaVariable;
        /// <summary>
        /// Tunnel source IP Address
        /// </summary>
        public readonly string TunnelSource;
        /// <summary>
        /// \n\n Interface name: ge0/\n\n or ge0/\n\n.vlanid
        /// </summary>
        public readonly string TunnelSourceInterface;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TunnelSourceInterfaceVariable;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TunnelSourceVariable;
        /// <summary>
        /// The version of the feature template
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetCiscoVpnInterfaceIpsecFeatureTemplateResult(
            string application,

            string applicationVariable,

            bool clearDontFragment,

            string clearDontFragmentVariable,

            int deadPeerDetectionInterval,

            string deadPeerDetectionIntervalVariable,

            int deadPeerDetectionRetries,

            string deadPeerDetectionRetriesVariable,

            string description,

            ImmutableArray<string> deviceTypes,

            string id,

            string ikeCiphersuite,

            string ikeCiphersuiteVariable,

            string ikeGroup,

            string ikeGroupVariable,

            string ikeMode,

            string ikeModeVariable,

            string ikePreSharedKey,

            string ikePreSharedKeyLocalId,

            string ikePreSharedKeyLocalIdVariable,

            string ikePreSharedKeyRemoteId,

            string ikePreSharedKeyRemoteIdVariable,

            string ikePreSharedKeyVariable,

            int ikeRekeyInterval,

            string ikeRekeyIntervalVariable,

            int ikeVersion,

            string interfaceDescription,

            string interfaceDescriptionVariable,

            string interfaceName,

            string interfaceNameVariable,

            string ipAddress,

            string ipAddressVariable,

            string ipsecCiphersuite,

            string ipsecCiphersuiteVariable,

            string ipsecPerfectForwardSecrecy,

            string ipsecPerfectForwardSecrecyVariable,

            int ipsecRekeyInterval,

            string ipsecRekeyIntervalVariable,

            int ipsecReplayWindow,

            string ipsecReplayWindowVariable,

            int mtu,

            string mtuVariable,

            string name,

            bool shutdown,

            string shutdownVariable,

            int tcpMssAdjust,

            string tcpMssAdjustVariable,

            string templateType,

            string trackerVariable,

            ImmutableArray<string> trackers,

            string tunnelDestination,

            string tunnelDestinationVariable,

            string tunnelRouteVia,

            string tunnelRouteViaVariable,

            string tunnelSource,

            string tunnelSourceInterface,

            string tunnelSourceInterfaceVariable,

            string tunnelSourceVariable,

            int version)
        {
            Application = application;
            ApplicationVariable = applicationVariable;
            ClearDontFragment = clearDontFragment;
            ClearDontFragmentVariable = clearDontFragmentVariable;
            DeadPeerDetectionInterval = deadPeerDetectionInterval;
            DeadPeerDetectionIntervalVariable = deadPeerDetectionIntervalVariable;
            DeadPeerDetectionRetries = deadPeerDetectionRetries;
            DeadPeerDetectionRetriesVariable = deadPeerDetectionRetriesVariable;
            Description = description;
            DeviceTypes = deviceTypes;
            Id = id;
            IkeCiphersuite = ikeCiphersuite;
            IkeCiphersuiteVariable = ikeCiphersuiteVariable;
            IkeGroup = ikeGroup;
            IkeGroupVariable = ikeGroupVariable;
            IkeMode = ikeMode;
            IkeModeVariable = ikeModeVariable;
            IkePreSharedKey = ikePreSharedKey;
            IkePreSharedKeyLocalId = ikePreSharedKeyLocalId;
            IkePreSharedKeyLocalIdVariable = ikePreSharedKeyLocalIdVariable;
            IkePreSharedKeyRemoteId = ikePreSharedKeyRemoteId;
            IkePreSharedKeyRemoteIdVariable = ikePreSharedKeyRemoteIdVariable;
            IkePreSharedKeyVariable = ikePreSharedKeyVariable;
            IkeRekeyInterval = ikeRekeyInterval;
            IkeRekeyIntervalVariable = ikeRekeyIntervalVariable;
            IkeVersion = ikeVersion;
            InterfaceDescription = interfaceDescription;
            InterfaceDescriptionVariable = interfaceDescriptionVariable;
            InterfaceName = interfaceName;
            InterfaceNameVariable = interfaceNameVariable;
            IpAddress = ipAddress;
            IpAddressVariable = ipAddressVariable;
            IpsecCiphersuite = ipsecCiphersuite;
            IpsecCiphersuiteVariable = ipsecCiphersuiteVariable;
            IpsecPerfectForwardSecrecy = ipsecPerfectForwardSecrecy;
            IpsecPerfectForwardSecrecyVariable = ipsecPerfectForwardSecrecyVariable;
            IpsecRekeyInterval = ipsecRekeyInterval;
            IpsecRekeyIntervalVariable = ipsecRekeyIntervalVariable;
            IpsecReplayWindow = ipsecReplayWindow;
            IpsecReplayWindowVariable = ipsecReplayWindowVariable;
            Mtu = mtu;
            MtuVariable = mtuVariable;
            Name = name;
            Shutdown = shutdown;
            ShutdownVariable = shutdownVariable;
            TcpMssAdjust = tcpMssAdjust;
            TcpMssAdjustVariable = tcpMssAdjustVariable;
            TemplateType = templateType;
            TrackerVariable = trackerVariable;
            Trackers = trackers;
            TunnelDestination = tunnelDestination;
            TunnelDestinationVariable = tunnelDestinationVariable;
            TunnelRouteVia = tunnelRouteVia;
            TunnelRouteViaVariable = tunnelRouteViaVariable;
            TunnelSource = tunnelSource;
            TunnelSourceInterface = tunnelSourceInterface;
            TunnelSourceInterfaceVariable = tunnelSourceInterfaceVariable;
            TunnelSourceVariable = tunnelSourceVariable;
            Version = version;
        }
    }
}
