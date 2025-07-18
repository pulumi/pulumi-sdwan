// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetCliConfigFeature
    {
        /// <summary>
        /// This data source can read the CLI Config Feature .
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
        ///     var example = Sdwan.GetCliConfigFeature.Invoke(new()
        ///     {
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetCliConfigFeatureResult> InvokeAsync(GetCliConfigFeatureArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCliConfigFeatureResult>("sdwan:index/getCliConfigFeature:getCliConfigFeature", args ?? new GetCliConfigFeatureArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the CLI Config Feature .
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
        ///     var example = Sdwan.GetCliConfigFeature.Invoke(new()
        ///     {
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCliConfigFeatureResult> Invoke(GetCliConfigFeatureInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCliConfigFeatureResult>("sdwan:index/getCliConfigFeature:getCliConfigFeature", args ?? new GetCliConfigFeatureInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the CLI Config Feature .
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
        ///     var example = Sdwan.GetCliConfigFeature.Invoke(new()
        ///     {
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCliConfigFeatureResult> Invoke(GetCliConfigFeatureInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCliConfigFeatureResult>("sdwan:index/getCliConfigFeature:getCliConfigFeature", args ?? new GetCliConfigFeatureInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCliConfigFeatureArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId", required: true)]
        public string FeatureProfileId { get; set; } = null!;

        /// <summary>
        /// The id of the object
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetCliConfigFeatureArgs()
        {
        }
        public static new GetCliConfigFeatureArgs Empty => new GetCliConfigFeatureArgs();
    }

    public sealed class GetCliConfigFeatureInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId", required: true)]
        public Input<string> FeatureProfileId { get; set; } = null!;

        /// <summary>
        /// The id of the object
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetCliConfigFeatureInvokeArgs()
        {
        }
        public static new GetCliConfigFeatureInvokeArgs Empty => new GetCliConfigFeatureInvokeArgs();
    }


    [OutputType]
    public sealed class GetCliConfigFeatureResult
    {
        /// <summary>
        /// CLI configuration
        /// </summary>
        public readonly string CliConfiguration;
        /// <summary>
        /// The description of the Feature
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        public readonly string FeatureProfileId;
        /// <summary>
        /// The id of the object
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the Feature
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The version of the object
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetCliConfigFeatureResult(
            string cliConfiguration,

            string description,

            string featureProfileId,

            string id,

            string name,

            int version)
        {
            CliConfiguration = cliConfiguration;
            Description = description;
            FeatureProfileId = featureProfileId;
            Id = id;
            Name = name;
            Version = version;
        }
    }
}
