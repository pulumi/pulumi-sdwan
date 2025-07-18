// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetServiceTrackerGroupFeature
    {
        /// <summary>
        /// This data source can read the Service Tracker Group Feature.
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
        ///     var example = Sdwan.GetServiceTrackerGroupFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetServiceTrackerGroupFeatureResult> InvokeAsync(GetServiceTrackerGroupFeatureArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServiceTrackerGroupFeatureResult>("sdwan:index/getServiceTrackerGroupFeature:getServiceTrackerGroupFeature", args ?? new GetServiceTrackerGroupFeatureArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Service Tracker Group Feature.
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
        ///     var example = Sdwan.GetServiceTrackerGroupFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServiceTrackerGroupFeatureResult> Invoke(GetServiceTrackerGroupFeatureInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceTrackerGroupFeatureResult>("sdwan:index/getServiceTrackerGroupFeature:getServiceTrackerGroupFeature", args ?? new GetServiceTrackerGroupFeatureInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Service Tracker Group Feature.
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
        ///     var example = Sdwan.GetServiceTrackerGroupFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServiceTrackerGroupFeatureResult> Invoke(GetServiceTrackerGroupFeatureInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceTrackerGroupFeatureResult>("sdwan:index/getServiceTrackerGroupFeature:getServiceTrackerGroupFeature", args ?? new GetServiceTrackerGroupFeatureInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceTrackerGroupFeatureArgs : global::Pulumi.InvokeArgs
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

        public GetServiceTrackerGroupFeatureArgs()
        {
        }
        public static new GetServiceTrackerGroupFeatureArgs Empty => new GetServiceTrackerGroupFeatureArgs();
    }

    public sealed class GetServiceTrackerGroupFeatureInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetServiceTrackerGroupFeatureInvokeArgs()
        {
        }
        public static new GetServiceTrackerGroupFeatureInvokeArgs Empty => new GetServiceTrackerGroupFeatureInvokeArgs();
    }


    [OutputType]
    public sealed class GetServiceTrackerGroupFeatureResult
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
        /// tracker ref list combine boolean and or
        /// </summary>
        public readonly string TrackerBoolean;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TrackerBooleanVariable;
        /// <summary>
        /// tracker parcel ref list
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceTrackerGroupFeatureTrackerElementResult> TrackerElements;
        /// <summary>
        /// The version of the Feature
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetServiceTrackerGroupFeatureResult(
            string description,

            string featureProfileId,

            string id,

            string name,

            string trackerBoolean,

            string trackerBooleanVariable,

            ImmutableArray<Outputs.GetServiceTrackerGroupFeatureTrackerElementResult> trackerElements,

            int version)
        {
            Description = description;
            FeatureProfileId = featureProfileId;
            Id = id;
            Name = name;
            TrackerBoolean = trackerBoolean;
            TrackerBooleanVariable = trackerBooleanVariable;
            TrackerElements = trackerElements;
            Version = version;
        }
    }
}
