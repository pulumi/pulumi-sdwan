// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetApplicationPriorityQosPolicy
    {
        /// <summary>
        /// This data source can read the Application Priority QoS Policy.
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
        ///     var example = Sdwan.GetApplicationPriorityQosPolicy.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetApplicationPriorityQosPolicyResult> InvokeAsync(GetApplicationPriorityQosPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApplicationPriorityQosPolicyResult>("sdwan:index/getApplicationPriorityQosPolicy:getApplicationPriorityQosPolicy", args ?? new GetApplicationPriorityQosPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Application Priority QoS Policy.
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
        ///     var example = Sdwan.GetApplicationPriorityQosPolicy.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplicationPriorityQosPolicyResult> Invoke(GetApplicationPriorityQosPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplicationPriorityQosPolicyResult>("sdwan:index/getApplicationPriorityQosPolicy:getApplicationPriorityQosPolicy", args ?? new GetApplicationPriorityQosPolicyInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Application Priority QoS Policy.
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
        ///     var example = Sdwan.GetApplicationPriorityQosPolicy.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplicationPriorityQosPolicyResult> Invoke(GetApplicationPriorityQosPolicyInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplicationPriorityQosPolicyResult>("sdwan:index/getApplicationPriorityQosPolicy:getApplicationPriorityQosPolicy", args ?? new GetApplicationPriorityQosPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApplicationPriorityQosPolicyArgs : global::Pulumi.InvokeArgs
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

        public GetApplicationPriorityQosPolicyArgs()
        {
        }
        public static new GetApplicationPriorityQosPolicyArgs Empty => new GetApplicationPriorityQosPolicyArgs();
    }

    public sealed class GetApplicationPriorityQosPolicyInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetApplicationPriorityQosPolicyInvokeArgs()
        {
        }
        public static new GetApplicationPriorityQosPolicyInvokeArgs Empty => new GetApplicationPriorityQosPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetApplicationPriorityQosPolicyResult
    {
        /// <summary>
        /// The description of the Policy
        /// </summary>
        public readonly string Description;
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
        /// qosSchedulers
        /// </summary>
        public readonly ImmutableArray<Outputs.GetApplicationPriorityQosPolicyQosSchedulerResult> QosSchedulers;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TargetInterfaceVariable;
        /// <summary>
        /// interfaces
        /// </summary>
        public readonly ImmutableArray<string> TargetInterfaces;
        /// <summary>
        /// The version of the Policy
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetApplicationPriorityQosPolicyResult(
            string description,

            string featureProfileId,

            string id,

            string name,

            ImmutableArray<Outputs.GetApplicationPriorityQosPolicyQosSchedulerResult> qosSchedulers,

            string targetInterfaceVariable,

            ImmutableArray<string> targetInterfaces,

            int version)
        {
            Description = description;
            FeatureProfileId = featureProfileId;
            Id = id;
            Name = name;
            QosSchedulers = qosSchedulers;
            TargetInterfaceVariable = targetInterfaceVariable;
            TargetInterfaces = targetInterfaces;
            Version = version;
        }
    }
}
