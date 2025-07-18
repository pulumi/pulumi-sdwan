// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    /// <summary>
    /// This resource can manage a Security Policy .
    /// 
    /// ## Import
    /// 
    /// The `pulumi import` command can be used, for example:
    /// 
    /// ```sh
    /// $ pulumi import sdwan:index/securityPolicy:SecurityPolicy example "f6b2c44c-693c-4763-b010-895aa3d236bd"
    /// ```
    /// </summary>
    [SdwanResourceType("sdwan:index/securityPolicy:SecurityPolicy")]
    public partial class SecurityPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Audit trail - Choices: `on`, `off`
        /// </summary>
        [Output("auditTrail")]
        public Output<string?> AuditTrail { get; private set; } = null!;

        /// <summary>
        /// List of policy definitions
        /// </summary>
        [Output("definitions")]
        public Output<ImmutableArray<Outputs.SecurityPolicyDefinition>> Definitions { get; private set; } = null!;

        /// <summary>
        /// The description of the security policy
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// Bypass firewall policy and allow all Internet traffic to/from VPN 0 - Choices: `allow`, `deny`
        /// </summary>
        [Output("directInternetApplications")]
        public Output<string?> DirectInternetApplications { get; private set; } = null!;

        /// <summary>
        /// Failure mode - Choices: `open`, `close`
        /// </summary>
        [Output("failureMode")]
        public Output<string?> FailureMode { get; private set; } = null!;

        /// <summary>
        /// High Speed Logging Server IP
        /// </summary>
        [Output("highSpeedLoggingServerIp")]
        public Output<string?> HighSpeedLoggingServerIp { get; private set; } = null!;

        /// <summary>
        /// High Speed Logging Port
        /// </summary>
        [Output("highSpeedLoggingServerPort")]
        public Output<string?> HighSpeedLoggingServerPort { get; private set; } = null!;

        /// <summary>
        /// High Speed Logging Source Interface
        /// </summary>
        [Output("highSpeedLoggingServerSourceInterface")]
        public Output<string?> HighSpeedLoggingServerSourceInterface { get; private set; } = null!;

        /// <summary>
        /// High Speed Logging VPN
        /// </summary>
        [Output("highSpeedLoggingVpn")]
        public Output<string?> HighSpeedLoggingVpn { get; private set; } = null!;

        /// <summary>
        /// ICMP Unreachable Allow
        /// </summary>
        [Output("imcpUnreachableAllow")]
        public Output<bool?> ImcpUnreachableAllow { get; private set; } = null!;

        [Output("loggings")]
        public Output<ImmutableArray<Outputs.SecurityPolicyLogging>> Loggings { get; private set; } = null!;

        /// <summary>
        /// Match Statistics per-filter - Choices: `on`, `off`
        /// </summary>
        [Output("matchStatisticsPerFilter")]
        public Output<string?> MatchStatisticsPerFilter { get; private set; } = null!;

        /// <summary>
        /// Max Incomplete ICMP Limit
        /// </summary>
        [Output("maxIncompleteIcmpLimit")]
        public Output<int?> MaxIncompleteIcmpLimit { get; private set; } = null!;

        /// <summary>
        /// Max Incomplete TCP Limit
        /// </summary>
        [Output("maxIncompleteTcpLimit")]
        public Output<int?> MaxIncompleteTcpLimit { get; private set; } = null!;

        /// <summary>
        /// Max Incomplete UDP Limit
        /// </summary>
        [Output("maxIncompleteUdpLimit")]
        public Output<int?> MaxIncompleteUdpLimit { get; private set; } = null!;

        /// <summary>
        /// The policy mode - Choices: `security`, `unified` - Default value: `security`
        /// </summary>
        [Output("mode")]
        public Output<string> Mode { get; private set; } = null!;

        /// <summary>
        /// The name of the security policy
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Session Reclassify Allow
        /// </summary>
        [Output("sessionReclassifyAllow")]
        public Output<bool?> SessionReclassifyAllow { get; private set; } = null!;

        /// <summary>
        /// TCP SYN Flood Limit, value from 1 to 4294967295
        /// </summary>
        [Output("tcpSynFloodLimit")]
        public Output<string?> TcpSynFloodLimit { get; private set; } = null!;

        /// <summary>
        /// Unified Logging
        /// </summary>
        [Output("unifiedLogging")]
        public Output<bool?> UnifiedLogging { get; private set; } = null!;

        /// <summary>
        /// The use case of the security policy - Choices: `custom`, `compliance`, `guestAccess`, `directCloudAccess`,
        /// `directInternetAccess`, `directCloudAccess` - Default value: `custom`
        /// </summary>
        [Output("useCase")]
        public Output<string> UseCase { get; private set; } = null!;

        /// <summary>
        /// The version of the object
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a SecurityPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecurityPolicy(string name, SecurityPolicyArgs args, CustomResourceOptions? options = null)
            : base("sdwan:index/securityPolicy:SecurityPolicy", name, args ?? new SecurityPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecurityPolicy(string name, Input<string> id, SecurityPolicyState? state = null, CustomResourceOptions? options = null)
            : base("sdwan:index/securityPolicy:SecurityPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SecurityPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecurityPolicy Get(string name, Input<string> id, SecurityPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new SecurityPolicy(name, id, state, options);
        }
    }

    public sealed class SecurityPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Audit trail - Choices: `on`, `off`
        /// </summary>
        [Input("auditTrail")]
        public Input<string>? AuditTrail { get; set; }

        [Input("definitions", required: true)]
        private InputList<Inputs.SecurityPolicyDefinitionArgs>? _definitions;

        /// <summary>
        /// List of policy definitions
        /// </summary>
        public InputList<Inputs.SecurityPolicyDefinitionArgs> Definitions
        {
            get => _definitions ?? (_definitions = new InputList<Inputs.SecurityPolicyDefinitionArgs>());
            set => _definitions = value;
        }

        /// <summary>
        /// The description of the security policy
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// Bypass firewall policy and allow all Internet traffic to/from VPN 0 - Choices: `allow`, `deny`
        /// </summary>
        [Input("directInternetApplications")]
        public Input<string>? DirectInternetApplications { get; set; }

        /// <summary>
        /// Failure mode - Choices: `open`, `close`
        /// </summary>
        [Input("failureMode")]
        public Input<string>? FailureMode { get; set; }

        /// <summary>
        /// High Speed Logging Server IP
        /// </summary>
        [Input("highSpeedLoggingServerIp")]
        public Input<string>? HighSpeedLoggingServerIp { get; set; }

        /// <summary>
        /// High Speed Logging Port
        /// </summary>
        [Input("highSpeedLoggingServerPort")]
        public Input<string>? HighSpeedLoggingServerPort { get; set; }

        /// <summary>
        /// High Speed Logging Source Interface
        /// </summary>
        [Input("highSpeedLoggingServerSourceInterface")]
        public Input<string>? HighSpeedLoggingServerSourceInterface { get; set; }

        /// <summary>
        /// High Speed Logging VPN
        /// </summary>
        [Input("highSpeedLoggingVpn")]
        public Input<string>? HighSpeedLoggingVpn { get; set; }

        /// <summary>
        /// ICMP Unreachable Allow
        /// </summary>
        [Input("imcpUnreachableAllow")]
        public Input<bool>? ImcpUnreachableAllow { get; set; }

        [Input("loggings")]
        private InputList<Inputs.SecurityPolicyLoggingArgs>? _loggings;
        public InputList<Inputs.SecurityPolicyLoggingArgs> Loggings
        {
            get => _loggings ?? (_loggings = new InputList<Inputs.SecurityPolicyLoggingArgs>());
            set => _loggings = value;
        }

        /// <summary>
        /// Match Statistics per-filter - Choices: `on`, `off`
        /// </summary>
        [Input("matchStatisticsPerFilter")]
        public Input<string>? MatchStatisticsPerFilter { get; set; }

        /// <summary>
        /// Max Incomplete ICMP Limit
        /// </summary>
        [Input("maxIncompleteIcmpLimit")]
        public Input<int>? MaxIncompleteIcmpLimit { get; set; }

        /// <summary>
        /// Max Incomplete TCP Limit
        /// </summary>
        [Input("maxIncompleteTcpLimit")]
        public Input<int>? MaxIncompleteTcpLimit { get; set; }

        /// <summary>
        /// Max Incomplete UDP Limit
        /// </summary>
        [Input("maxIncompleteUdpLimit")]
        public Input<int>? MaxIncompleteUdpLimit { get; set; }

        /// <summary>
        /// The policy mode - Choices: `security`, `unified` - Default value: `security`
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The name of the security policy
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Session Reclassify Allow
        /// </summary>
        [Input("sessionReclassifyAllow")]
        public Input<bool>? SessionReclassifyAllow { get; set; }

        /// <summary>
        /// TCP SYN Flood Limit, value from 1 to 4294967295
        /// </summary>
        [Input("tcpSynFloodLimit")]
        public Input<string>? TcpSynFloodLimit { get; set; }

        /// <summary>
        /// Unified Logging
        /// </summary>
        [Input("unifiedLogging")]
        public Input<bool>? UnifiedLogging { get; set; }

        /// <summary>
        /// The use case of the security policy - Choices: `custom`, `compliance`, `guestAccess`, `directCloudAccess`,
        /// `directInternetAccess`, `directCloudAccess` - Default value: `custom`
        /// </summary>
        [Input("useCase")]
        public Input<string>? UseCase { get; set; }

        public SecurityPolicyArgs()
        {
        }
        public static new SecurityPolicyArgs Empty => new SecurityPolicyArgs();
    }

    public sealed class SecurityPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Audit trail - Choices: `on`, `off`
        /// </summary>
        [Input("auditTrail")]
        public Input<string>? AuditTrail { get; set; }

        [Input("definitions")]
        private InputList<Inputs.SecurityPolicyDefinitionGetArgs>? _definitions;

        /// <summary>
        /// List of policy definitions
        /// </summary>
        public InputList<Inputs.SecurityPolicyDefinitionGetArgs> Definitions
        {
            get => _definitions ?? (_definitions = new InputList<Inputs.SecurityPolicyDefinitionGetArgs>());
            set => _definitions = value;
        }

        /// <summary>
        /// The description of the security policy
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Bypass firewall policy and allow all Internet traffic to/from VPN 0 - Choices: `allow`, `deny`
        /// </summary>
        [Input("directInternetApplications")]
        public Input<string>? DirectInternetApplications { get; set; }

        /// <summary>
        /// Failure mode - Choices: `open`, `close`
        /// </summary>
        [Input("failureMode")]
        public Input<string>? FailureMode { get; set; }

        /// <summary>
        /// High Speed Logging Server IP
        /// </summary>
        [Input("highSpeedLoggingServerIp")]
        public Input<string>? HighSpeedLoggingServerIp { get; set; }

        /// <summary>
        /// High Speed Logging Port
        /// </summary>
        [Input("highSpeedLoggingServerPort")]
        public Input<string>? HighSpeedLoggingServerPort { get; set; }

        /// <summary>
        /// High Speed Logging Source Interface
        /// </summary>
        [Input("highSpeedLoggingServerSourceInterface")]
        public Input<string>? HighSpeedLoggingServerSourceInterface { get; set; }

        /// <summary>
        /// High Speed Logging VPN
        /// </summary>
        [Input("highSpeedLoggingVpn")]
        public Input<string>? HighSpeedLoggingVpn { get; set; }

        /// <summary>
        /// ICMP Unreachable Allow
        /// </summary>
        [Input("imcpUnreachableAllow")]
        public Input<bool>? ImcpUnreachableAllow { get; set; }

        [Input("loggings")]
        private InputList<Inputs.SecurityPolicyLoggingGetArgs>? _loggings;
        public InputList<Inputs.SecurityPolicyLoggingGetArgs> Loggings
        {
            get => _loggings ?? (_loggings = new InputList<Inputs.SecurityPolicyLoggingGetArgs>());
            set => _loggings = value;
        }

        /// <summary>
        /// Match Statistics per-filter - Choices: `on`, `off`
        /// </summary>
        [Input("matchStatisticsPerFilter")]
        public Input<string>? MatchStatisticsPerFilter { get; set; }

        /// <summary>
        /// Max Incomplete ICMP Limit
        /// </summary>
        [Input("maxIncompleteIcmpLimit")]
        public Input<int>? MaxIncompleteIcmpLimit { get; set; }

        /// <summary>
        /// Max Incomplete TCP Limit
        /// </summary>
        [Input("maxIncompleteTcpLimit")]
        public Input<int>? MaxIncompleteTcpLimit { get; set; }

        /// <summary>
        /// Max Incomplete UDP Limit
        /// </summary>
        [Input("maxIncompleteUdpLimit")]
        public Input<int>? MaxIncompleteUdpLimit { get; set; }

        /// <summary>
        /// The policy mode - Choices: `security`, `unified` - Default value: `security`
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The name of the security policy
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Session Reclassify Allow
        /// </summary>
        [Input("sessionReclassifyAllow")]
        public Input<bool>? SessionReclassifyAllow { get; set; }

        /// <summary>
        /// TCP SYN Flood Limit, value from 1 to 4294967295
        /// </summary>
        [Input("tcpSynFloodLimit")]
        public Input<string>? TcpSynFloodLimit { get; set; }

        /// <summary>
        /// Unified Logging
        /// </summary>
        [Input("unifiedLogging")]
        public Input<bool>? UnifiedLogging { get; set; }

        /// <summary>
        /// The use case of the security policy - Choices: `custom`, `compliance`, `guestAccess`, `directCloudAccess`,
        /// `directInternetAccess`, `directCloudAccess` - Default value: `custom`
        /// </summary>
        [Input("useCase")]
        public Input<string>? UseCase { get; set; }

        /// <summary>
        /// The version of the object
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public SecurityPolicyState()
        {
        }
        public static new SecurityPolicyState Empty => new SecurityPolicyState();
    }
}
