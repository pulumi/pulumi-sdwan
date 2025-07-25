// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetApplicationPriorityTrafficPolicyPolicy
    {
        /// <summary>
        /// This data source can read the Application Priority Traffic Policy Policy.
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
        ///     var example = Sdwan.GetApplicationPriorityTrafficPolicyPolicy.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetApplicationPriorityTrafficPolicyPolicyResult> InvokeAsync(GetApplicationPriorityTrafficPolicyPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApplicationPriorityTrafficPolicyPolicyResult>("sdwan:index/getApplicationPriorityTrafficPolicyPolicy:getApplicationPriorityTrafficPolicyPolicy", args ?? new GetApplicationPriorityTrafficPolicyPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Application Priority Traffic Policy Policy.
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
        ///     var example = Sdwan.GetApplicationPriorityTrafficPolicyPolicy.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplicationPriorityTrafficPolicyPolicyResult> Invoke(GetApplicationPriorityTrafficPolicyPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplicationPriorityTrafficPolicyPolicyResult>("sdwan:index/getApplicationPriorityTrafficPolicyPolicy:getApplicationPriorityTrafficPolicyPolicy", args ?? new GetApplicationPriorityTrafficPolicyPolicyInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Application Priority Traffic Policy Policy.
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
        ///     var example = Sdwan.GetApplicationPriorityTrafficPolicyPolicy.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplicationPriorityTrafficPolicyPolicyResult> Invoke(GetApplicationPriorityTrafficPolicyPolicyInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplicationPriorityTrafficPolicyPolicyResult>("sdwan:index/getApplicationPriorityTrafficPolicyPolicy:getApplicationPriorityTrafficPolicyPolicy", args ?? new GetApplicationPriorityTrafficPolicyPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApplicationPriorityTrafficPolicyPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId", required: true)]
        public string FeatureProfileId { get; set; } = null!;

        /// <summary>
        /// The id of the Policy
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetApplicationPriorityTrafficPolicyPolicyArgs()
        {
        }
        public static new GetApplicationPriorityTrafficPolicyPolicyArgs Empty => new GetApplicationPriorityTrafficPolicyPolicyArgs();
    }

    public sealed class GetApplicationPriorityTrafficPolicyPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId", required: true)]
        public Input<string> FeatureProfileId { get; set; } = null!;

        /// <summary>
        /// The id of the Policy
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetApplicationPriorityTrafficPolicyPolicyInvokeArgs()
        {
        }
        public static new GetApplicationPriorityTrafficPolicyPolicyInvokeArgs Empty => new GetApplicationPriorityTrafficPolicyPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetApplicationPriorityTrafficPolicyPolicyResult
    {
        public readonly string DefaultAction;
        /// <summary>
        /// The description of the Policy
        /// </summary>
        public readonly string Description;
        public readonly string Direction;
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        public readonly string FeatureProfileId;
        /// <summary>
        /// The id of the Policy
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the Policy
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Traffic policy sequence list
        /// </summary>
        public readonly ImmutableArray<Outputs.GetApplicationPriorityTrafficPolicyPolicySequenceResult> Sequences;
        /// <summary>
        /// The version of the Policy
        /// </summary>
        public readonly int Version;
        public readonly ImmutableArray<string> Vpns;

        [OutputConstructor]
        private GetApplicationPriorityTrafficPolicyPolicyResult(
            string defaultAction,

            string description,

            string direction,

            string featureProfileId,

            string id,

            string name,

            ImmutableArray<Outputs.GetApplicationPriorityTrafficPolicyPolicySequenceResult> sequences,

            int version,

            ImmutableArray<string> vpns)
        {
            DefaultAction = defaultAction;
            Description = description;
            Direction = direction;
            FeatureProfileId = featureProfileId;
            Id = id;
            Name = name;
            Sequences = sequences;
            Version = version;
            Vpns = vpns;
        }
    }
}
