// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    /// <summary>
    /// This resource can manage a System Remote Access Feature.
    ///   - Minimum SD-WAN Manager version: `20.12.0`
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
    ///     var example = new Sdwan.SystemRemoteAccessFeature("example", new()
    ///     {
    ///         Name = "Example",
    ///         Description = "My Example",
    ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
    ///         ConnectionTypeSsl = false,
    ///         AnyConnectEapAuthenticationType = "user",
    ///         Ipv4PoolSize = 50,
    ///         Ipv6PoolSize = 1024,
    ///         EnableCertificateListCheck = false,
    ///         PskAuthenticationType = "aaa",
    ///         RadiusGroupName = "radius-1",
    ///         AaaDeriveNameFromPeerIdentity = "MyPassword",
    ///         AaaEnableAccounting = false,
    ///         Ikev2LocalIkeIdentityType = "EMAIL",
    ///         Ikev2LocalIkeIdentityValue = "abc@xyz.com",
    ///         Ikev2SecurityAssociationLifetime = 86400,
    ///         Ikev2AntiDosThreshold = 99,
    ///         IpsecEnableAntiReplay = false,
    ///         IpsecSecurityAssociationLifetime = 3600,
    ///         IpsecEnablePerfectFowardSecrecy = false,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import sdwan:index/systemRemoteAccessFeature:SystemRemoteAccessFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd"
    /// ```
    /// </summary>
    [SdwanResourceType("sdwan:index/systemRemoteAccessFeature:SystemRemoteAccessFeature")]
    public partial class SystemRemoteAccessFeature : global::Pulumi.CustomResource
    {
        /// <summary>
        /// , Attribute conditional on `connection_type_ssl` being equal to `false`
        /// </summary>
        [Output("aaaDeriveNameFromPeerDomain")]
        public Output<string?> AaaDeriveNameFromPeerDomain { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("aaaDeriveNameFromPeerDomainVariable")]
        public Output<string?> AaaDeriveNameFromPeerDomainVariable { get; private set; } = null!;

        /// <summary>
        /// , Attribute conditional on `connection_type_ssl` being equal to `false`
        /// </summary>
        [Output("aaaDeriveNameFromPeerIdentity")]
        public Output<string?> AaaDeriveNameFromPeerIdentity { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("aaaDeriveNameFromPeerIdentityVariable")]
        public Output<string?> AaaDeriveNameFromPeerIdentityVariable { get; private set; } = null!;

        /// <summary>
        /// Enable Accounting - Default value: `true`
        /// </summary>
        [Output("aaaEnableAccounting")]
        public Output<bool?> AaaEnableAccounting { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("aaaEnableAccountingVariable")]
        public Output<string?> AaaEnableAccountingVariable { get; private set; } = null!;

        [Output("aaaSpecifyNamePolicyName")]
        public Output<string?> AaaSpecifyNamePolicyName { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("aaaSpecifyNamePolicyNameVariable")]
        public Output<string?> AaaSpecifyNamePolicyNameVariable { get; private set; } = null!;

        [Output("aaaSpecifyNamePolicyPassword")]
        public Output<string?> AaaSpecifyNamePolicyPassword { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("aaaSpecifyNamePolicyPasswordVariable")]
        public Output<string?> AaaSpecifyNamePolicyPasswordVariable { get; private set; } = null!;

        /// <summary>
        /// , Attribute conditional on `connection_type_ssl` being equal to `false` - Choices: `user`, `device`
        /// </summary>
        [Output("anyConnectEapAuthenticationType")]
        public Output<string> AnyConnectEapAuthenticationType { get; private set; } = null!;

        /// <summary>
        /// Enabled SSL VPN - Default value: `false`
        /// </summary>
        [Output("connectionTypeSsl")]
        public Output<bool?> ConnectionTypeSsl { get; private set; } = null!;

        /// <summary>
        /// The description of the Feature
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// - Default value: `false`
        /// </summary>
        [Output("enableCertificateListCheck")]
        public Output<bool?> EnableCertificateListCheck { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("enableCertificateListCheckVariable")]
        public Output<string?> EnableCertificateListCheckVariable { get; private set; } = null!;

        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Output("featureProfileId")]
        public Output<string?> FeatureProfileId { get; private set; } = null!;

        /// <summary>
        /// Anti-DOS Threshold, Attribute conditional on `connection_type_ssl` being equal to `false` - Range: `10`-`1000` - Default
        /// value: `100`
        /// </summary>
        [Output("ikev2AntiDosThreshold")]
        public Output<int?> Ikev2AntiDosThreshold { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("ikev2AntiDosThresholdVariable")]
        public Output<string?> Ikev2AntiDosThresholdVariable { get; private set; } = null!;

        /// <summary>
        /// , Attribute conditional on `connection_type_ssl` being equal to `false` - Choices: `EMAIL`, `FQDN`, `KEYID`, `IPv4
        /// ADDRESS`, `IPv6 ADDRESS`
        /// </summary>
        [Output("ikev2LocalIkeIdentityType")]
        public Output<string?> Ikev2LocalIkeIdentityType { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("ikev2LocalIkeIdentityTypeVariable")]
        public Output<string?> Ikev2LocalIkeIdentityTypeVariable { get; private set; } = null!;

        /// <summary>
        /// , Attribute conditional on `connection_type_ssl` being equal to `false`
        /// </summary>
        [Output("ikev2LocalIkeIdentityValue")]
        public Output<string?> Ikev2LocalIkeIdentityValue { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("ikev2LocalIkeIdentityValueVariable")]
        public Output<string?> Ikev2LocalIkeIdentityValueVariable { get; private set; } = null!;

        /// <summary>
        /// Security Association Lifetime in Seconds, Attribute conditional on `connection_type_ssl` being equal to `false` - Range:
        /// `3600`-`86400` - Default value: `86400`
        /// </summary>
        [Output("ikev2SecurityAssociationLifetime")]
        public Output<int?> Ikev2SecurityAssociationLifetime { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("ikev2SecurityAssociationLifetimeVariable")]
        public Output<string?> Ikev2SecurityAssociationLifetimeVariable { get; private set; } = null!;

        /// <summary>
        /// security Association Lifetime, Attribute conditional on `ipsec_enable_anti_replay` being equal to `true` - Default
        /// value: `64`
        /// </summary>
        [Output("ipsecAntiReplayWindowSize")]
        public Output<int?> IpsecAntiReplayWindowSize { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("ipsecAntiReplayWindowSizeVariable")]
        public Output<string?> IpsecAntiReplayWindowSizeVariable { get; private set; } = null!;

        /// <summary>
        /// Enable Anti-Replay, Attribute conditional on `connection_type_ssl` being equal to `false` - Default value: `true`
        /// </summary>
        [Output("ipsecEnableAntiReplay")]
        public Output<bool?> IpsecEnableAntiReplay { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("ipsecEnableAntiReplayVariable")]
        public Output<string?> IpsecEnableAntiReplayVariable { get; private set; } = null!;

        /// <summary>
        /// security Association Lifetime, Attribute conditional on `connection_type_ssl` being equal to `false` - Default value:
        /// `false`
        /// </summary>
        [Output("ipsecEnablePerfectFowardSecrecy")]
        public Output<bool?> IpsecEnablePerfectFowardSecrecy { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("ipsecEnablePerfectFowardSecrecyVariable")]
        public Output<string?> IpsecEnablePerfectFowardSecrecyVariable { get; private set; } = null!;

        /// <summary>
        /// Security Association Lifetime in Seconds, Attribute conditional on `connection_type_ssl` being equal to `false` - Range:
        /// `3600`-`86400` - Default value: `3600`
        /// </summary>
        [Output("ipsecSecurityAssociationLifetime")]
        public Output<int?> IpsecSecurityAssociationLifetime { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("ipsecSecurityAssociationLifetimeVariable")]
        public Output<string?> IpsecSecurityAssociationLifetimeVariable { get; private set; } = null!;

        /// <summary>
        /// IPv4 Pool Size - Default value: `1000`
        /// </summary>
        [Output("ipv4PoolSize")]
        public Output<int?> Ipv4PoolSize { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("ipv4PoolSizeVariable")]
        public Output<string?> Ipv4PoolSizeVariable { get; private set; } = null!;

        /// <summary>
        /// IPv6 Pool Size - Default value: `1024`
        /// </summary>
        [Output("ipv6PoolSize")]
        public Output<int?> Ipv6PoolSize { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("ipv6PoolSizeVariable")]
        public Output<string?> Ipv6PoolSizeVariable { get; private set; } = null!;

        /// <summary>
        /// The name of the Feature
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// PSK Pre Shared Key, Attribute conditional on `psk_authentication_type` being equal to `group`
        /// </summary>
        [Output("pskAuthenticationPreSharedKey")]
        public Output<string?> PskAuthenticationPreSharedKey { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("pskAuthenticationPreSharedKeyVariable")]
        public Output<string?> PskAuthenticationPreSharedKeyVariable { get; private set; } = null!;

        /// <summary>
        /// PSK Selection, Attribute conditional on `connection_type_ssl` being equal to `false` - Choices: `aaa`, `group`
        /// </summary>
        [Output("pskAuthenticationType")]
        public Output<string?> PskAuthenticationType { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("pskAuthenticationTypeVariable")]
        public Output<string?> PskAuthenticationTypeVariable { get; private set; } = null!;

        [Output("radiusGroupName")]
        public Output<string> RadiusGroupName { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("radiusGroupNameVariable")]
        public Output<string?> RadiusGroupNameVariable { get; private set; } = null!;

        /// <summary>
        /// The version of the Feature
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a SystemRemoteAccessFeature resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SystemRemoteAccessFeature(string name, SystemRemoteAccessFeatureArgs args, CustomResourceOptions? options = null)
            : base("sdwan:index/systemRemoteAccessFeature:SystemRemoteAccessFeature", name, args ?? new SystemRemoteAccessFeatureArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SystemRemoteAccessFeature(string name, Input<string> id, SystemRemoteAccessFeatureState? state = null, CustomResourceOptions? options = null)
            : base("sdwan:index/systemRemoteAccessFeature:SystemRemoteAccessFeature", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SystemRemoteAccessFeature resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SystemRemoteAccessFeature Get(string name, Input<string> id, SystemRemoteAccessFeatureState? state = null, CustomResourceOptions? options = null)
        {
            return new SystemRemoteAccessFeature(name, id, state, options);
        }
    }

    public sealed class SystemRemoteAccessFeatureArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// , Attribute conditional on `connection_type_ssl` being equal to `false`
        /// </summary>
        [Input("aaaDeriveNameFromPeerDomain")]
        public Input<string>? AaaDeriveNameFromPeerDomain { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("aaaDeriveNameFromPeerDomainVariable")]
        public Input<string>? AaaDeriveNameFromPeerDomainVariable { get; set; }

        /// <summary>
        /// , Attribute conditional on `connection_type_ssl` being equal to `false`
        /// </summary>
        [Input("aaaDeriveNameFromPeerIdentity")]
        public Input<string>? AaaDeriveNameFromPeerIdentity { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("aaaDeriveNameFromPeerIdentityVariable")]
        public Input<string>? AaaDeriveNameFromPeerIdentityVariable { get; set; }

        /// <summary>
        /// Enable Accounting - Default value: `true`
        /// </summary>
        [Input("aaaEnableAccounting")]
        public Input<bool>? AaaEnableAccounting { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("aaaEnableAccountingVariable")]
        public Input<string>? AaaEnableAccountingVariable { get; set; }

        [Input("aaaSpecifyNamePolicyName")]
        public Input<string>? AaaSpecifyNamePolicyName { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("aaaSpecifyNamePolicyNameVariable")]
        public Input<string>? AaaSpecifyNamePolicyNameVariable { get; set; }

        [Input("aaaSpecifyNamePolicyPassword")]
        public Input<string>? AaaSpecifyNamePolicyPassword { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("aaaSpecifyNamePolicyPasswordVariable")]
        public Input<string>? AaaSpecifyNamePolicyPasswordVariable { get; set; }

        /// <summary>
        /// , Attribute conditional on `connection_type_ssl` being equal to `false` - Choices: `user`, `device`
        /// </summary>
        [Input("anyConnectEapAuthenticationType", required: true)]
        public Input<string> AnyConnectEapAuthenticationType { get; set; } = null!;

        /// <summary>
        /// Enabled SSL VPN - Default value: `false`
        /// </summary>
        [Input("connectionTypeSsl")]
        public Input<bool>? ConnectionTypeSsl { get; set; }

        /// <summary>
        /// The description of the Feature
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// - Default value: `false`
        /// </summary>
        [Input("enableCertificateListCheck")]
        public Input<bool>? EnableCertificateListCheck { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("enableCertificateListCheckVariable")]
        public Input<string>? EnableCertificateListCheckVariable { get; set; }

        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId")]
        public Input<string>? FeatureProfileId { get; set; }

        /// <summary>
        /// Anti-DOS Threshold, Attribute conditional on `connection_type_ssl` being equal to `false` - Range: `10`-`1000` - Default
        /// value: `100`
        /// </summary>
        [Input("ikev2AntiDosThreshold")]
        public Input<int>? Ikev2AntiDosThreshold { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ikev2AntiDosThresholdVariable")]
        public Input<string>? Ikev2AntiDosThresholdVariable { get; set; }

        /// <summary>
        /// , Attribute conditional on `connection_type_ssl` being equal to `false` - Choices: `EMAIL`, `FQDN`, `KEYID`, `IPv4
        /// ADDRESS`, `IPv6 ADDRESS`
        /// </summary>
        [Input("ikev2LocalIkeIdentityType")]
        public Input<string>? Ikev2LocalIkeIdentityType { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ikev2LocalIkeIdentityTypeVariable")]
        public Input<string>? Ikev2LocalIkeIdentityTypeVariable { get; set; }

        /// <summary>
        /// , Attribute conditional on `connection_type_ssl` being equal to `false`
        /// </summary>
        [Input("ikev2LocalIkeIdentityValue")]
        public Input<string>? Ikev2LocalIkeIdentityValue { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ikev2LocalIkeIdentityValueVariable")]
        public Input<string>? Ikev2LocalIkeIdentityValueVariable { get; set; }

        /// <summary>
        /// Security Association Lifetime in Seconds, Attribute conditional on `connection_type_ssl` being equal to `false` - Range:
        /// `3600`-`86400` - Default value: `86400`
        /// </summary>
        [Input("ikev2SecurityAssociationLifetime")]
        public Input<int>? Ikev2SecurityAssociationLifetime { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ikev2SecurityAssociationLifetimeVariable")]
        public Input<string>? Ikev2SecurityAssociationLifetimeVariable { get; set; }

        /// <summary>
        /// security Association Lifetime, Attribute conditional on `ipsec_enable_anti_replay` being equal to `true` - Default
        /// value: `64`
        /// </summary>
        [Input("ipsecAntiReplayWindowSize")]
        public Input<int>? IpsecAntiReplayWindowSize { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipsecAntiReplayWindowSizeVariable")]
        public Input<string>? IpsecAntiReplayWindowSizeVariable { get; set; }

        /// <summary>
        /// Enable Anti-Replay, Attribute conditional on `connection_type_ssl` being equal to `false` - Default value: `true`
        /// </summary>
        [Input("ipsecEnableAntiReplay")]
        public Input<bool>? IpsecEnableAntiReplay { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipsecEnableAntiReplayVariable")]
        public Input<string>? IpsecEnableAntiReplayVariable { get; set; }

        /// <summary>
        /// security Association Lifetime, Attribute conditional on `connection_type_ssl` being equal to `false` - Default value:
        /// `false`
        /// </summary>
        [Input("ipsecEnablePerfectFowardSecrecy")]
        public Input<bool>? IpsecEnablePerfectFowardSecrecy { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipsecEnablePerfectFowardSecrecyVariable")]
        public Input<string>? IpsecEnablePerfectFowardSecrecyVariable { get; set; }

        /// <summary>
        /// Security Association Lifetime in Seconds, Attribute conditional on `connection_type_ssl` being equal to `false` - Range:
        /// `3600`-`86400` - Default value: `3600`
        /// </summary>
        [Input("ipsecSecurityAssociationLifetime")]
        public Input<int>? IpsecSecurityAssociationLifetime { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipsecSecurityAssociationLifetimeVariable")]
        public Input<string>? IpsecSecurityAssociationLifetimeVariable { get; set; }

        /// <summary>
        /// IPv4 Pool Size - Default value: `1000`
        /// </summary>
        [Input("ipv4PoolSize")]
        public Input<int>? Ipv4PoolSize { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipv4PoolSizeVariable")]
        public Input<string>? Ipv4PoolSizeVariable { get; set; }

        /// <summary>
        /// IPv6 Pool Size - Default value: `1024`
        /// </summary>
        [Input("ipv6PoolSize")]
        public Input<int>? Ipv6PoolSize { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipv6PoolSizeVariable")]
        public Input<string>? Ipv6PoolSizeVariable { get; set; }

        /// <summary>
        /// The name of the Feature
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// PSK Pre Shared Key, Attribute conditional on `psk_authentication_type` being equal to `group`
        /// </summary>
        [Input("pskAuthenticationPreSharedKey")]
        public Input<string>? PskAuthenticationPreSharedKey { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("pskAuthenticationPreSharedKeyVariable")]
        public Input<string>? PskAuthenticationPreSharedKeyVariable { get; set; }

        /// <summary>
        /// PSK Selection, Attribute conditional on `connection_type_ssl` being equal to `false` - Choices: `aaa`, `group`
        /// </summary>
        [Input("pskAuthenticationType")]
        public Input<string>? PskAuthenticationType { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("pskAuthenticationTypeVariable")]
        public Input<string>? PskAuthenticationTypeVariable { get; set; }

        [Input("radiusGroupName", required: true)]
        public Input<string> RadiusGroupName { get; set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("radiusGroupNameVariable")]
        public Input<string>? RadiusGroupNameVariable { get; set; }

        public SystemRemoteAccessFeatureArgs()
        {
        }
        public static new SystemRemoteAccessFeatureArgs Empty => new SystemRemoteAccessFeatureArgs();
    }

    public sealed class SystemRemoteAccessFeatureState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// , Attribute conditional on `connection_type_ssl` being equal to `false`
        /// </summary>
        [Input("aaaDeriveNameFromPeerDomain")]
        public Input<string>? AaaDeriveNameFromPeerDomain { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("aaaDeriveNameFromPeerDomainVariable")]
        public Input<string>? AaaDeriveNameFromPeerDomainVariable { get; set; }

        /// <summary>
        /// , Attribute conditional on `connection_type_ssl` being equal to `false`
        /// </summary>
        [Input("aaaDeriveNameFromPeerIdentity")]
        public Input<string>? AaaDeriveNameFromPeerIdentity { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("aaaDeriveNameFromPeerIdentityVariable")]
        public Input<string>? AaaDeriveNameFromPeerIdentityVariable { get; set; }

        /// <summary>
        /// Enable Accounting - Default value: `true`
        /// </summary>
        [Input("aaaEnableAccounting")]
        public Input<bool>? AaaEnableAccounting { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("aaaEnableAccountingVariable")]
        public Input<string>? AaaEnableAccountingVariable { get; set; }

        [Input("aaaSpecifyNamePolicyName")]
        public Input<string>? AaaSpecifyNamePolicyName { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("aaaSpecifyNamePolicyNameVariable")]
        public Input<string>? AaaSpecifyNamePolicyNameVariable { get; set; }

        [Input("aaaSpecifyNamePolicyPassword")]
        public Input<string>? AaaSpecifyNamePolicyPassword { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("aaaSpecifyNamePolicyPasswordVariable")]
        public Input<string>? AaaSpecifyNamePolicyPasswordVariable { get; set; }

        /// <summary>
        /// , Attribute conditional on `connection_type_ssl` being equal to `false` - Choices: `user`, `device`
        /// </summary>
        [Input("anyConnectEapAuthenticationType")]
        public Input<string>? AnyConnectEapAuthenticationType { get; set; }

        /// <summary>
        /// Enabled SSL VPN - Default value: `false`
        /// </summary>
        [Input("connectionTypeSsl")]
        public Input<bool>? ConnectionTypeSsl { get; set; }

        /// <summary>
        /// The description of the Feature
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// - Default value: `false`
        /// </summary>
        [Input("enableCertificateListCheck")]
        public Input<bool>? EnableCertificateListCheck { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("enableCertificateListCheckVariable")]
        public Input<string>? EnableCertificateListCheckVariable { get; set; }

        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId")]
        public Input<string>? FeatureProfileId { get; set; }

        /// <summary>
        /// Anti-DOS Threshold, Attribute conditional on `connection_type_ssl` being equal to `false` - Range: `10`-`1000` - Default
        /// value: `100`
        /// </summary>
        [Input("ikev2AntiDosThreshold")]
        public Input<int>? Ikev2AntiDosThreshold { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ikev2AntiDosThresholdVariable")]
        public Input<string>? Ikev2AntiDosThresholdVariable { get; set; }

        /// <summary>
        /// , Attribute conditional on `connection_type_ssl` being equal to `false` - Choices: `EMAIL`, `FQDN`, `KEYID`, `IPv4
        /// ADDRESS`, `IPv6 ADDRESS`
        /// </summary>
        [Input("ikev2LocalIkeIdentityType")]
        public Input<string>? Ikev2LocalIkeIdentityType { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ikev2LocalIkeIdentityTypeVariable")]
        public Input<string>? Ikev2LocalIkeIdentityTypeVariable { get; set; }

        /// <summary>
        /// , Attribute conditional on `connection_type_ssl` being equal to `false`
        /// </summary>
        [Input("ikev2LocalIkeIdentityValue")]
        public Input<string>? Ikev2LocalIkeIdentityValue { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ikev2LocalIkeIdentityValueVariable")]
        public Input<string>? Ikev2LocalIkeIdentityValueVariable { get; set; }

        /// <summary>
        /// Security Association Lifetime in Seconds, Attribute conditional on `connection_type_ssl` being equal to `false` - Range:
        /// `3600`-`86400` - Default value: `86400`
        /// </summary>
        [Input("ikev2SecurityAssociationLifetime")]
        public Input<int>? Ikev2SecurityAssociationLifetime { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ikev2SecurityAssociationLifetimeVariable")]
        public Input<string>? Ikev2SecurityAssociationLifetimeVariable { get; set; }

        /// <summary>
        /// security Association Lifetime, Attribute conditional on `ipsec_enable_anti_replay` being equal to `true` - Default
        /// value: `64`
        /// </summary>
        [Input("ipsecAntiReplayWindowSize")]
        public Input<int>? IpsecAntiReplayWindowSize { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipsecAntiReplayWindowSizeVariable")]
        public Input<string>? IpsecAntiReplayWindowSizeVariable { get; set; }

        /// <summary>
        /// Enable Anti-Replay, Attribute conditional on `connection_type_ssl` being equal to `false` - Default value: `true`
        /// </summary>
        [Input("ipsecEnableAntiReplay")]
        public Input<bool>? IpsecEnableAntiReplay { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipsecEnableAntiReplayVariable")]
        public Input<string>? IpsecEnableAntiReplayVariable { get; set; }

        /// <summary>
        /// security Association Lifetime, Attribute conditional on `connection_type_ssl` being equal to `false` - Default value:
        /// `false`
        /// </summary>
        [Input("ipsecEnablePerfectFowardSecrecy")]
        public Input<bool>? IpsecEnablePerfectFowardSecrecy { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipsecEnablePerfectFowardSecrecyVariable")]
        public Input<string>? IpsecEnablePerfectFowardSecrecyVariable { get; set; }

        /// <summary>
        /// Security Association Lifetime in Seconds, Attribute conditional on `connection_type_ssl` being equal to `false` - Range:
        /// `3600`-`86400` - Default value: `3600`
        /// </summary>
        [Input("ipsecSecurityAssociationLifetime")]
        public Input<int>? IpsecSecurityAssociationLifetime { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipsecSecurityAssociationLifetimeVariable")]
        public Input<string>? IpsecSecurityAssociationLifetimeVariable { get; set; }

        /// <summary>
        /// IPv4 Pool Size - Default value: `1000`
        /// </summary>
        [Input("ipv4PoolSize")]
        public Input<int>? Ipv4PoolSize { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipv4PoolSizeVariable")]
        public Input<string>? Ipv4PoolSizeVariable { get; set; }

        /// <summary>
        /// IPv6 Pool Size - Default value: `1024`
        /// </summary>
        [Input("ipv6PoolSize")]
        public Input<int>? Ipv6PoolSize { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ipv6PoolSizeVariable")]
        public Input<string>? Ipv6PoolSizeVariable { get; set; }

        /// <summary>
        /// The name of the Feature
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// PSK Pre Shared Key, Attribute conditional on `psk_authentication_type` being equal to `group`
        /// </summary>
        [Input("pskAuthenticationPreSharedKey")]
        public Input<string>? PskAuthenticationPreSharedKey { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("pskAuthenticationPreSharedKeyVariable")]
        public Input<string>? PskAuthenticationPreSharedKeyVariable { get; set; }

        /// <summary>
        /// PSK Selection, Attribute conditional on `connection_type_ssl` being equal to `false` - Choices: `aaa`, `group`
        /// </summary>
        [Input("pskAuthenticationType")]
        public Input<string>? PskAuthenticationType { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("pskAuthenticationTypeVariable")]
        public Input<string>? PskAuthenticationTypeVariable { get; set; }

        [Input("radiusGroupName")]
        public Input<string>? RadiusGroupName { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("radiusGroupNameVariable")]
        public Input<string>? RadiusGroupNameVariable { get; set; }

        /// <summary>
        /// The version of the Feature
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public SystemRemoteAccessFeatureState()
        {
        }
        public static new SystemRemoteAccessFeatureState Empty => new SystemRemoteAccessFeatureState();
    }
}