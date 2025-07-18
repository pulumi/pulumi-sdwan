// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetCellularCedgeProfileFeatureTemplate
    {
        /// <summary>
        /// This data source can read the Cellular cEdge Profile feature template.
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
        ///     var example = Sdwan.GetCellularCedgeProfileFeatureTemplate.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetCellularCedgeProfileFeatureTemplateResult> InvokeAsync(GetCellularCedgeProfileFeatureTemplateArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCellularCedgeProfileFeatureTemplateResult>("sdwan:index/getCellularCedgeProfileFeatureTemplate:getCellularCedgeProfileFeatureTemplate", args ?? new GetCellularCedgeProfileFeatureTemplateArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Cellular cEdge Profile feature template.
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
        ///     var example = Sdwan.GetCellularCedgeProfileFeatureTemplate.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCellularCedgeProfileFeatureTemplateResult> Invoke(GetCellularCedgeProfileFeatureTemplateInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCellularCedgeProfileFeatureTemplateResult>("sdwan:index/getCellularCedgeProfileFeatureTemplate:getCellularCedgeProfileFeatureTemplate", args ?? new GetCellularCedgeProfileFeatureTemplateInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Cellular cEdge Profile feature template.
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
        ///     var example = Sdwan.GetCellularCedgeProfileFeatureTemplate.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCellularCedgeProfileFeatureTemplateResult> Invoke(GetCellularCedgeProfileFeatureTemplateInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCellularCedgeProfileFeatureTemplateResult>("sdwan:index/getCellularCedgeProfileFeatureTemplate:getCellularCedgeProfileFeatureTemplate", args ?? new GetCellularCedgeProfileFeatureTemplateInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCellularCedgeProfileFeatureTemplateArgs : global::Pulumi.InvokeArgs
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

        public GetCellularCedgeProfileFeatureTemplateArgs()
        {
        }
        public static new GetCellularCedgeProfileFeatureTemplateArgs Empty => new GetCellularCedgeProfileFeatureTemplateArgs();
    }

    public sealed class GetCellularCedgeProfileFeatureTemplateInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetCellularCedgeProfileFeatureTemplateInvokeArgs()
        {
        }
        public static new GetCellularCedgeProfileFeatureTemplateInvokeArgs Empty => new GetCellularCedgeProfileFeatureTemplateInvokeArgs();
    }


    [OutputType]
    public sealed class GetCellularCedgeProfileFeatureTemplateResult
    {
        /// <summary>
        /// Set access point name
        /// </summary>
        public readonly string AccessPointName;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string AccessPointNameVariable;
        /// <summary>
        /// Set authentication type
        /// </summary>
        public readonly string AuthenticationType;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string AuthenticationTypeVariable;
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
        /// The name of the feature template
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// No Overwrite
        /// </summary>
        public readonly bool NoOverwrite;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string NoOverwriteVariable;
        /// <summary>
        /// Set packet data network type
        /// </summary>
        public readonly string PacketDataNetworkType;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string PacketDataNetworkTypeVariable;
        /// <summary>
        /// Set Profile ID
        /// </summary>
        public readonly int ProfileId;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ProfileIdVariable;
        /// <summary>
        /// Set the profile password
        /// </summary>
        public readonly string ProfilePassword;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ProfilePasswordVariable;
        /// <summary>
        /// Set the profile username
        /// </summary>
        public readonly string ProfileUsername;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ProfileUsernameVariable;
        /// <summary>
        /// The template type
        /// </summary>
        public readonly string TemplateType;
        /// <summary>
        /// The version of the feature template
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetCellularCedgeProfileFeatureTemplateResult(
            string accessPointName,

            string accessPointNameVariable,

            string authenticationType,

            string authenticationTypeVariable,

            string description,

            ImmutableArray<string> deviceTypes,

            string id,

            string name,

            bool noOverwrite,

            string noOverwriteVariable,

            string packetDataNetworkType,

            string packetDataNetworkTypeVariable,

            int profileId,

            string profileIdVariable,

            string profilePassword,

            string profilePasswordVariable,

            string profileUsername,

            string profileUsernameVariable,

            string templateType,

            int version)
        {
            AccessPointName = accessPointName;
            AccessPointNameVariable = accessPointNameVariable;
            AuthenticationType = authenticationType;
            AuthenticationTypeVariable = authenticationTypeVariable;
            Description = description;
            DeviceTypes = deviceTypes;
            Id = id;
            Name = name;
            NoOverwrite = noOverwrite;
            NoOverwriteVariable = noOverwriteVariable;
            PacketDataNetworkType = packetDataNetworkType;
            PacketDataNetworkTypeVariable = packetDataNetworkTypeVariable;
            ProfileId = profileId;
            ProfileIdVariable = profileIdVariable;
            ProfilePassword = profilePassword;
            ProfilePasswordVariable = profilePasswordVariable;
            ProfileUsername = profileUsername;
            ProfileUsernameVariable = profileUsernameVariable;
            TemplateType = templateType;
            Version = version;
        }
    }
}
