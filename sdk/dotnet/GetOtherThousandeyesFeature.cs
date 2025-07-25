// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetOtherThousandeyesFeature
    {
        /// <summary>
        /// This data source can read the Other ThousandEyes Feature.
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
        ///     var example = Sdwan.GetOtherThousandeyesFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetOtherThousandeyesFeatureResult> InvokeAsync(GetOtherThousandeyesFeatureArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOtherThousandeyesFeatureResult>("sdwan:index/getOtherThousandeyesFeature:getOtherThousandeyesFeature", args ?? new GetOtherThousandeyesFeatureArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Other ThousandEyes Feature.
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
        ///     var example = Sdwan.GetOtherThousandeyesFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetOtherThousandeyesFeatureResult> Invoke(GetOtherThousandeyesFeatureInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOtherThousandeyesFeatureResult>("sdwan:index/getOtherThousandeyesFeature:getOtherThousandeyesFeature", args ?? new GetOtherThousandeyesFeatureInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Other ThousandEyes Feature.
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
        ///     var example = Sdwan.GetOtherThousandeyesFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetOtherThousandeyesFeatureResult> Invoke(GetOtherThousandeyesFeatureInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetOtherThousandeyesFeatureResult>("sdwan:index/getOtherThousandeyesFeature:getOtherThousandeyesFeature", args ?? new GetOtherThousandeyesFeatureInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOtherThousandeyesFeatureArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId", required: true)]
        public string FeatureProfileId { get; set; } = null!;

        /// <summary>
        /// The id of the Feature
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetOtherThousandeyesFeatureArgs()
        {
        }
        public static new GetOtherThousandeyesFeatureArgs Empty => new GetOtherThousandeyesFeatureArgs();
    }

    public sealed class GetOtherThousandeyesFeatureInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId", required: true)]
        public Input<string> FeatureProfileId { get; set; } = null!;

        /// <summary>
        /// The id of the Feature
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetOtherThousandeyesFeatureInvokeArgs()
        {
        }
        public static new GetOtherThousandeyesFeatureInvokeArgs Empty => new GetOtherThousandeyesFeatureInvokeArgs();
    }


    [OutputType]
    public sealed class GetOtherThousandeyesFeatureResult
    {
        /// <summary>
        /// The description of the Feature
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        public readonly string FeatureProfileId;
        /// <summary>
        /// The id of the Feature
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the Feature
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The version of the Feature
        /// </summary>
        public readonly int Version;
        /// <summary>
        /// Virtual application Instance
        /// </summary>
        public readonly ImmutableArray<Outputs.GetOtherThousandeyesFeatureVirtualApplicationResult> VirtualApplications;

        [OutputConstructor]
        private GetOtherThousandeyesFeatureResult(
            string description,

            string featureProfileId,

            string id,

            string name,

            int version,

            ImmutableArray<Outputs.GetOtherThousandeyesFeatureVirtualApplicationResult> virtualApplications)
        {
            Description = description;
            FeatureProfileId = featureProfileId;
            Id = id;
            Name = name;
            Version = version;
            VirtualApplications = virtualApplications;
        }
    }
}
