// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetPolicyObjectColorList
    {
        /// <summary>
        /// This data source can read the Policy Object Color List Policy_object.
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
        ///     var example = Sdwan.GetPolicyObjectColorList.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetPolicyObjectColorListResult> InvokeAsync(GetPolicyObjectColorListArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPolicyObjectColorListResult>("sdwan:index/getPolicyObjectColorList:getPolicyObjectColorList", args ?? new GetPolicyObjectColorListArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Policy Object Color List Policy_object.
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
        ///     var example = Sdwan.GetPolicyObjectColorList.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPolicyObjectColorListResult> Invoke(GetPolicyObjectColorListInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPolicyObjectColorListResult>("sdwan:index/getPolicyObjectColorList:getPolicyObjectColorList", args ?? new GetPolicyObjectColorListInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Policy Object Color List Policy_object.
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
        ///     var example = Sdwan.GetPolicyObjectColorList.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPolicyObjectColorListResult> Invoke(GetPolicyObjectColorListInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetPolicyObjectColorListResult>("sdwan:index/getPolicyObjectColorList:getPolicyObjectColorList", args ?? new GetPolicyObjectColorListInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPolicyObjectColorListArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId", required: true)]
        public string FeatureProfileId { get; set; } = null!;

        /// <summary>
        /// The id of the Policy_object
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetPolicyObjectColorListArgs()
        {
        }
        public static new GetPolicyObjectColorListArgs Empty => new GetPolicyObjectColorListArgs();
    }

    public sealed class GetPolicyObjectColorListInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId", required: true)]
        public Input<string> FeatureProfileId { get; set; } = null!;

        /// <summary>
        /// The id of the Policy_object
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetPolicyObjectColorListInvokeArgs()
        {
        }
        public static new GetPolicyObjectColorListInvokeArgs Empty => new GetPolicyObjectColorListInvokeArgs();
    }


    [OutputType]
    public sealed class GetPolicyObjectColorListResult
    {
        /// <summary>
        /// The description of the Policy_object
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Color List
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPolicyObjectColorListEntryResult> Entries;
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        public readonly string FeatureProfileId;
        /// <summary>
        /// The id of the Policy_object
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the Policy_object
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The version of the Policy_object
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetPolicyObjectColorListResult(
            string description,

            ImmutableArray<Outputs.GetPolicyObjectColorListEntryResult> entries,

            string featureProfileId,

            string id,

            string name,

            int version)
        {
            Description = description;
            Entries = entries;
            FeatureProfileId = featureProfileId;
            Id = id;
            Name = name;
            Version = version;
        }
    }
}
