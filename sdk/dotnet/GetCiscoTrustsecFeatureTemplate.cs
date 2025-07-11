// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetCiscoTrustsecFeatureTemplate
    {
        /// <summary>
        /// This data source can read the Cisco TrustSec feature template.
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
        ///     var example = Sdwan.GetCiscoTrustsecFeatureTemplate.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetCiscoTrustsecFeatureTemplateResult> InvokeAsync(GetCiscoTrustsecFeatureTemplateArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCiscoTrustsecFeatureTemplateResult>("sdwan:index/getCiscoTrustsecFeatureTemplate:getCiscoTrustsecFeatureTemplate", args ?? new GetCiscoTrustsecFeatureTemplateArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Cisco TrustSec feature template.
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
        ///     var example = Sdwan.GetCiscoTrustsecFeatureTemplate.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCiscoTrustsecFeatureTemplateResult> Invoke(GetCiscoTrustsecFeatureTemplateInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCiscoTrustsecFeatureTemplateResult>("sdwan:index/getCiscoTrustsecFeatureTemplate:getCiscoTrustsecFeatureTemplate", args ?? new GetCiscoTrustsecFeatureTemplateInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Cisco TrustSec feature template.
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
        ///     var example = Sdwan.GetCiscoTrustsecFeatureTemplate.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCiscoTrustsecFeatureTemplateResult> Invoke(GetCiscoTrustsecFeatureTemplateInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCiscoTrustsecFeatureTemplateResult>("sdwan:index/getCiscoTrustsecFeatureTemplate:getCiscoTrustsecFeatureTemplate", args ?? new GetCiscoTrustsecFeatureTemplateInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCiscoTrustsecFeatureTemplateArgs : global::Pulumi.InvokeArgs
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

        public GetCiscoTrustsecFeatureTemplateArgs()
        {
        }
        public static new GetCiscoTrustsecFeatureTemplateArgs Empty => new GetCiscoTrustsecFeatureTemplateArgs();
    }

    public sealed class GetCiscoTrustsecFeatureTemplateInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetCiscoTrustsecFeatureTemplateInvokeArgs()
        {
        }
        public static new GetCiscoTrustsecFeatureTemplateInvokeArgs Empty => new GetCiscoTrustsecFeatureTemplateInvokeArgs();
    }


    [OutputType]
    public sealed class GetCiscoTrustsecFeatureTemplateResult
    {
        /// <summary>
        /// Specify the TrustSec Network Access Device ID, should be same as mentioned in the Identity Services Engine (upto 32 char)
        /// </summary>
        public readonly string CredentialsId;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string CredentialsIdVariable;
        /// <summary>
        /// Set the password for the device
        /// </summary>
        public readonly string CredentialsPassword;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string CredentialsPasswordVariable;
        /// <summary>
        /// The description of the feature template
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Configure Local device security group \n\n
        /// </summary>
        public readonly int DeviceSgt;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string DeviceSgtVariable;
        /// <summary>
        /// List of supported device types
        /// </summary>
        public readonly ImmutableArray<string> DeviceTypes;
        /// <summary>
        /// Enable Role-based Access Control enforcement
        /// </summary>
        public readonly bool EnableEnforcement;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string EnableEnforcementVariable;
        /// <summary>
        /// Enable CTS SXP support
        /// </summary>
        public readonly bool EnableSxp;
        /// <summary>
        /// The id of the feature template
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Configure Maximum allowed hold-time for listener in seconds \n\n
        /// </summary>
        public readonly int MaximumListenerHoldTime;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string MaximumListenerHoldTimeVariable;
        /// <summary>
        /// Configure Minimum allowed hold-time for listener in seconds \n\n
        /// </summary>
        public readonly int MinimumListenerHoldTime;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string MinimumListenerHoldTimeVariable;
        /// <summary>
        /// The name of the feature template
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Configure Speaker hold-time in seconds \n\n
        /// </summary>
        public readonly int SpeakerHoldTime;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string SpeakerHoldTimeVariable;
        /// <summary>
        /// Configure SXP Connections
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCiscoTrustsecFeatureTemplateSxpConnectionResult> SxpConnections;
        /// <summary>
        /// Configure SXP default password
        /// </summary>
        public readonly string SxpDefaultPassword;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string SxpDefaultPasswordVariable;
        /// <summary>
        /// Configure SXP key-chain
        /// </summary>
        public readonly string SxpKeyChain;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string SxpKeyChainVariable;
        /// <summary>
        /// Enables logging for IP-to-SGT binding changes
        /// </summary>
        public readonly bool SxpLogBindingChanges;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string SxpLogBindingChangesVariable;
        /// <summary>
        /// Configure SXP Node ID \n\n
        /// </summary>
        public readonly string SxpNodeId;
        /// <summary>
        /// Define SXP Node ID type \n\n
        /// </summary>
        public readonly string SxpNodeIdType;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string SxpNodeIdVariable;
        /// <summary>
        /// Configure the SXP reconciliation period in seconds \n\n
        /// </summary>
        public readonly int SxpReconciliationPeriod;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string SxpReconciliationPeriodVariable;
        /// <summary>
        /// Configure Retry period for SXP connection in seconds \n\n
        /// </summary>
        public readonly int SxpRetryPeriod;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string SxpRetryPeriodVariable;
        /// <summary>
        /// SXP Source IP
        /// </summary>
        public readonly string SxpSourceIp;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string SxpSourceIpVariable;
        /// <summary>
        /// The template type
        /// </summary>
        public readonly string TemplateType;
        /// <summary>
        /// The version of the feature template
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetCiscoTrustsecFeatureTemplateResult(
            string credentialsId,

            string credentialsIdVariable,

            string credentialsPassword,

            string credentialsPasswordVariable,

            string description,

            int deviceSgt,

            string deviceSgtVariable,

            ImmutableArray<string> deviceTypes,

            bool enableEnforcement,

            string enableEnforcementVariable,

            bool enableSxp,

            string id,

            int maximumListenerHoldTime,

            string maximumListenerHoldTimeVariable,

            int minimumListenerHoldTime,

            string minimumListenerHoldTimeVariable,

            string name,

            int speakerHoldTime,

            string speakerHoldTimeVariable,

            ImmutableArray<Outputs.GetCiscoTrustsecFeatureTemplateSxpConnectionResult> sxpConnections,

            string sxpDefaultPassword,

            string sxpDefaultPasswordVariable,

            string sxpKeyChain,

            string sxpKeyChainVariable,

            bool sxpLogBindingChanges,

            string sxpLogBindingChangesVariable,

            string sxpNodeId,

            string sxpNodeIdType,

            string sxpNodeIdVariable,

            int sxpReconciliationPeriod,

            string sxpReconciliationPeriodVariable,

            int sxpRetryPeriod,

            string sxpRetryPeriodVariable,

            string sxpSourceIp,

            string sxpSourceIpVariable,

            string templateType,

            int version)
        {
            CredentialsId = credentialsId;
            CredentialsIdVariable = credentialsIdVariable;
            CredentialsPassword = credentialsPassword;
            CredentialsPasswordVariable = credentialsPasswordVariable;
            Description = description;
            DeviceSgt = deviceSgt;
            DeviceSgtVariable = deviceSgtVariable;
            DeviceTypes = deviceTypes;
            EnableEnforcement = enableEnforcement;
            EnableEnforcementVariable = enableEnforcementVariable;
            EnableSxp = enableSxp;
            Id = id;
            MaximumListenerHoldTime = maximumListenerHoldTime;
            MaximumListenerHoldTimeVariable = maximumListenerHoldTimeVariable;
            MinimumListenerHoldTime = minimumListenerHoldTime;
            MinimumListenerHoldTimeVariable = minimumListenerHoldTimeVariable;
            Name = name;
            SpeakerHoldTime = speakerHoldTime;
            SpeakerHoldTimeVariable = speakerHoldTimeVariable;
            SxpConnections = sxpConnections;
            SxpDefaultPassword = sxpDefaultPassword;
            SxpDefaultPasswordVariable = sxpDefaultPasswordVariable;
            SxpKeyChain = sxpKeyChain;
            SxpKeyChainVariable = sxpKeyChainVariable;
            SxpLogBindingChanges = sxpLogBindingChanges;
            SxpLogBindingChangesVariable = sxpLogBindingChangesVariable;
            SxpNodeId = sxpNodeId;
            SxpNodeIdType = sxpNodeIdType;
            SxpNodeIdVariable = sxpNodeIdVariable;
            SxpReconciliationPeriod = sxpReconciliationPeriod;
            SxpReconciliationPeriodVariable = sxpReconciliationPeriodVariable;
            SxpRetryPeriod = sxpRetryPeriod;
            SxpRetryPeriodVariable = sxpRetryPeriodVariable;
            SxpSourceIp = sxpSourceIp;
            SxpSourceIpVariable = sxpSourceIpVariable;
            TemplateType = templateType;
            Version = version;
        }
    }
}
