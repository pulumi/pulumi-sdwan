// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetCiscoNtpFeatureTemplate
    {
        /// <summary>
        /// This data source can read the Cisco NTP feature template.
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
        ///     var example = Sdwan.GetCiscoNtpFeatureTemplate.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetCiscoNtpFeatureTemplateResult> InvokeAsync(GetCiscoNtpFeatureTemplateArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCiscoNtpFeatureTemplateResult>("sdwan:index/getCiscoNtpFeatureTemplate:getCiscoNtpFeatureTemplate", args ?? new GetCiscoNtpFeatureTemplateArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Cisco NTP feature template.
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
        ///     var example = Sdwan.GetCiscoNtpFeatureTemplate.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCiscoNtpFeatureTemplateResult> Invoke(GetCiscoNtpFeatureTemplateInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCiscoNtpFeatureTemplateResult>("sdwan:index/getCiscoNtpFeatureTemplate:getCiscoNtpFeatureTemplate", args ?? new GetCiscoNtpFeatureTemplateInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Cisco NTP feature template.
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
        ///     var example = Sdwan.GetCiscoNtpFeatureTemplate.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCiscoNtpFeatureTemplateResult> Invoke(GetCiscoNtpFeatureTemplateInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCiscoNtpFeatureTemplateResult>("sdwan:index/getCiscoNtpFeatureTemplate:getCiscoNtpFeatureTemplate", args ?? new GetCiscoNtpFeatureTemplateInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCiscoNtpFeatureTemplateArgs : global::Pulumi.InvokeArgs
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

        public GetCiscoNtpFeatureTemplateArgs()
        {
        }
        public static new GetCiscoNtpFeatureTemplateArgs Empty => new GetCiscoNtpFeatureTemplateArgs();
    }

    public sealed class GetCiscoNtpFeatureTemplateInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetCiscoNtpFeatureTemplateInvokeArgs()
        {
        }
        public static new GetCiscoNtpFeatureTemplateInvokeArgs Empty => new GetCiscoNtpFeatureTemplateInvokeArgs();
    }


    [OutputType]
    public sealed class GetCiscoNtpFeatureTemplateResult
    {
        /// <summary>
        /// Set MD5 authentication key
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCiscoNtpFeatureTemplateAuthenticationKeyResult> AuthenticationKeys;
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
        /// Configure device as NTP master
        /// </summary>
        public readonly bool Master;
        /// <summary>
        /// Set interface for NTP Master
        /// </summary>
        public readonly string MasterSourceInterface;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string MasterSourceInterfaceVariable;
        /// <summary>
        /// Master Stratum \n\n
        /// </summary>
        public readonly int MasterStratum;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string MasterStratumVariable;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string MasterVariable;
        /// <summary>
        /// The name of the feature template
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Configure NTP servers
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCiscoNtpFeatureTemplateServerResult> Servers;
        /// <summary>
        /// The template type
        /// </summary>
        public readonly string TemplateType;
        /// <summary>
        /// Designate authentication key as trustworthy
        /// </summary>
        public readonly ImmutableArray<int> TrustedKeys;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TrustedKeysVariable;
        /// <summary>
        /// The version of the feature template
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetCiscoNtpFeatureTemplateResult(
            ImmutableArray<Outputs.GetCiscoNtpFeatureTemplateAuthenticationKeyResult> authenticationKeys,

            string description,

            ImmutableArray<string> deviceTypes,

            string id,

            bool master,

            string masterSourceInterface,

            string masterSourceInterfaceVariable,

            int masterStratum,

            string masterStratumVariable,

            string masterVariable,

            string name,

            ImmutableArray<Outputs.GetCiscoNtpFeatureTemplateServerResult> servers,

            string templateType,

            ImmutableArray<int> trustedKeys,

            string trustedKeysVariable,

            int version)
        {
            AuthenticationKeys = authenticationKeys;
            Description = description;
            DeviceTypes = deviceTypes;
            Id = id;
            Master = master;
            MasterSourceInterface = masterSourceInterface;
            MasterSourceInterfaceVariable = masterSourceInterfaceVariable;
            MasterStratum = masterStratum;
            MasterStratumVariable = masterStratumVariable;
            MasterVariable = masterVariable;
            Name = name;
            Servers = servers;
            TemplateType = templateType;
            TrustedKeys = trustedKeys;
            TrustedKeysVariable = trustedKeysVariable;
            Version = version;
        }
    }
}
