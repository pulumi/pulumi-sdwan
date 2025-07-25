// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetCiscoSecureInternetGatewayFeatureTemplate
    {
        /// <summary>
        /// This data source can read the Cisco Secure Internet Gateway feature template.
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
        ///     var example = Sdwan.GetCiscoSecureInternetGatewayFeatureTemplate.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetCiscoSecureInternetGatewayFeatureTemplateResult> InvokeAsync(GetCiscoSecureInternetGatewayFeatureTemplateArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCiscoSecureInternetGatewayFeatureTemplateResult>("sdwan:index/getCiscoSecureInternetGatewayFeatureTemplate:getCiscoSecureInternetGatewayFeatureTemplate", args ?? new GetCiscoSecureInternetGatewayFeatureTemplateArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Cisco Secure Internet Gateway feature template.
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
        ///     var example = Sdwan.GetCiscoSecureInternetGatewayFeatureTemplate.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCiscoSecureInternetGatewayFeatureTemplateResult> Invoke(GetCiscoSecureInternetGatewayFeatureTemplateInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCiscoSecureInternetGatewayFeatureTemplateResult>("sdwan:index/getCiscoSecureInternetGatewayFeatureTemplate:getCiscoSecureInternetGatewayFeatureTemplate", args ?? new GetCiscoSecureInternetGatewayFeatureTemplateInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Cisco Secure Internet Gateway feature template.
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
        ///     var example = Sdwan.GetCiscoSecureInternetGatewayFeatureTemplate.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCiscoSecureInternetGatewayFeatureTemplateResult> Invoke(GetCiscoSecureInternetGatewayFeatureTemplateInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCiscoSecureInternetGatewayFeatureTemplateResult>("sdwan:index/getCiscoSecureInternetGatewayFeatureTemplate:getCiscoSecureInternetGatewayFeatureTemplate", args ?? new GetCiscoSecureInternetGatewayFeatureTemplateInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCiscoSecureInternetGatewayFeatureTemplateArgs : global::Pulumi.InvokeArgs
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

        public GetCiscoSecureInternetGatewayFeatureTemplateArgs()
        {
        }
        public static new GetCiscoSecureInternetGatewayFeatureTemplateArgs Empty => new GetCiscoSecureInternetGatewayFeatureTemplateArgs();
    }

    public sealed class GetCiscoSecureInternetGatewayFeatureTemplateInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetCiscoSecureInternetGatewayFeatureTemplateInvokeArgs()
        {
        }
        public static new GetCiscoSecureInternetGatewayFeatureTemplateInvokeArgs Empty => new GetCiscoSecureInternetGatewayFeatureTemplateInvokeArgs();
    }


    [OutputType]
    public sealed class GetCiscoSecureInternetGatewayFeatureTemplateResult
    {
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
        /// Interface name: IPsec when present
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCiscoSecureInternetGatewayFeatureTemplateInterfaceResult> Interfaces;
        /// <summary>
        /// The name of the feature template
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Configure services
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCiscoSecureInternetGatewayFeatureTemplateServiceResult> Services;
        /// <summary>
        /// The template type
        /// </summary>
        public readonly string TemplateType;
        /// <summary>
        /// Source IP address for Tracker
        /// </summary>
        public readonly string TrackerSourceIp;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TrackerSourceIpVariable;
        /// <summary>
        /// Tracker configuration
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCiscoSecureInternetGatewayFeatureTemplateTrackerResult> Trackers;
        /// <summary>
        /// The version of the feature template
        /// </summary>
        public readonly int Version;
        /// <summary>
        /// List of VPN instances
        /// </summary>
        public readonly int VpnId;

        [OutputConstructor]
        private GetCiscoSecureInternetGatewayFeatureTemplateResult(
            string description,

            ImmutableArray<string> deviceTypes,

            string id,

            ImmutableArray<Outputs.GetCiscoSecureInternetGatewayFeatureTemplateInterfaceResult> interfaces,

            string name,

            ImmutableArray<Outputs.GetCiscoSecureInternetGatewayFeatureTemplateServiceResult> services,

            string templateType,

            string trackerSourceIp,

            string trackerSourceIpVariable,

            ImmutableArray<Outputs.GetCiscoSecureInternetGatewayFeatureTemplateTrackerResult> trackers,

            int version,

            int vpnId)
        {
            Description = description;
            DeviceTypes = deviceTypes;
            Id = id;
            Interfaces = interfaces;
            Name = name;
            Services = services;
            TemplateType = templateType;
            TrackerSourceIp = trackerSourceIp;
            TrackerSourceIpVariable = trackerSourceIpVariable;
            Trackers = trackers;
            Version = version;
            VpnId = vpnId;
        }
    }
}
