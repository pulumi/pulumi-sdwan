// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetServiceObjectTrackerGroupFeature
    {
        /// <summary>
        /// This data source can read the Service Object Tracker Group Feature.
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
        ///     var example = Sdwan.GetServiceObjectTrackerGroupFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetServiceObjectTrackerGroupFeatureResult> InvokeAsync(GetServiceObjectTrackerGroupFeatureArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServiceObjectTrackerGroupFeatureResult>("sdwan:index/getServiceObjectTrackerGroupFeature:getServiceObjectTrackerGroupFeature", args ?? new GetServiceObjectTrackerGroupFeatureArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Service Object Tracker Group Feature.
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
        ///     var example = Sdwan.GetServiceObjectTrackerGroupFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServiceObjectTrackerGroupFeatureResult> Invoke(GetServiceObjectTrackerGroupFeatureInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceObjectTrackerGroupFeatureResult>("sdwan:index/getServiceObjectTrackerGroupFeature:getServiceObjectTrackerGroupFeature", args ?? new GetServiceObjectTrackerGroupFeatureInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceObjectTrackerGroupFeatureArgs : global::Pulumi.InvokeArgs
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

        public GetServiceObjectTrackerGroupFeatureArgs()
        {
        }
        public static new GetServiceObjectTrackerGroupFeatureArgs Empty => new GetServiceObjectTrackerGroupFeatureArgs();
    }

    public sealed class GetServiceObjectTrackerGroupFeatureInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetServiceObjectTrackerGroupFeatureInvokeArgs()
        {
        }
        public static new GetServiceObjectTrackerGroupFeatureInvokeArgs Empty => new GetServiceObjectTrackerGroupFeatureInvokeArgs();
    }


    [OutputType]
    public sealed class GetServiceObjectTrackerGroupFeatureResult
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
        /// Object ID
        /// </summary>
        public readonly int ObjectTrackerId;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ObjectTrackerIdVariable;
        /// <summary>
        /// tracker ref list criteria boolean and or
        /// </summary>
        public readonly string Reachable;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ReachableVariable;
        /// <summary>
        /// Group Tracks ID Refs
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceObjectTrackerGroupFeatureTrackerElementResult> TrackerElements;
        /// <summary>
        /// The version of the Feature
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetServiceObjectTrackerGroupFeatureResult(
            string description,

            string featureProfileId,

            string id,

            string name,

            int objectTrackerId,

            string objectTrackerIdVariable,

            string reachable,

            string reachableVariable,

            ImmutableArray<Outputs.GetServiceObjectTrackerGroupFeatureTrackerElementResult> trackerElements,

            int version)
        {
            Description = description;
            FeatureProfileId = featureProfileId;
            Id = id;
            Name = name;
            ObjectTrackerId = objectTrackerId;
            ObjectTrackerIdVariable = objectTrackerIdVariable;
            Reachable = reachable;
            ReachableVariable = reachableVariable;
            TrackerElements = trackerElements;
            Version = version;
        }
    }
}