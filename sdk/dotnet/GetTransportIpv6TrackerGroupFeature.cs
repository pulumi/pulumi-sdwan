// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetTransportIpv6TrackerGroupFeature
    {
        /// <summary>
        /// This data source can read the Transport IPv6 Tracker Group Feature.
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
        ///     var example = Sdwan.GetTransportIpv6TrackerGroupFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetTransportIpv6TrackerGroupFeatureResult> InvokeAsync(GetTransportIpv6TrackerGroupFeatureArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTransportIpv6TrackerGroupFeatureResult>("sdwan:index/getTransportIpv6TrackerGroupFeature:getTransportIpv6TrackerGroupFeature", args ?? new GetTransportIpv6TrackerGroupFeatureArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Transport IPv6 Tracker Group Feature.
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
        ///     var example = Sdwan.GetTransportIpv6TrackerGroupFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTransportIpv6TrackerGroupFeatureResult> Invoke(GetTransportIpv6TrackerGroupFeatureInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTransportIpv6TrackerGroupFeatureResult>("sdwan:index/getTransportIpv6TrackerGroupFeature:getTransportIpv6TrackerGroupFeature", args ?? new GetTransportIpv6TrackerGroupFeatureInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Transport IPv6 Tracker Group Feature.
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
        ///     var example = Sdwan.GetTransportIpv6TrackerGroupFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTransportIpv6TrackerGroupFeatureResult> Invoke(GetTransportIpv6TrackerGroupFeatureInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetTransportIpv6TrackerGroupFeatureResult>("sdwan:index/getTransportIpv6TrackerGroupFeature:getTransportIpv6TrackerGroupFeature", args ?? new GetTransportIpv6TrackerGroupFeatureInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTransportIpv6TrackerGroupFeatureArgs : global::Pulumi.InvokeArgs
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

        public GetTransportIpv6TrackerGroupFeatureArgs()
        {
        }
        public static new GetTransportIpv6TrackerGroupFeatureArgs Empty => new GetTransportIpv6TrackerGroupFeatureArgs();
    }

    public sealed class GetTransportIpv6TrackerGroupFeatureInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetTransportIpv6TrackerGroupFeatureInvokeArgs()
        {
        }
        public static new GetTransportIpv6TrackerGroupFeatureInvokeArgs Empty => new GetTransportIpv6TrackerGroupFeatureInvokeArgs();
    }


    [OutputType]
    public sealed class GetTransportIpv6TrackerGroupFeatureResult
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
        /// trackers ref list
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTransportIpv6TrackerGroupFeatureTrackerElementResult> TrackerElements;
        /// <summary>
        /// Tracker Name
        /// </summary>
        public readonly string TrackerName;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TrackerNameVariable;
        /// <summary>
        /// The version of the Feature
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetTransportIpv6TrackerGroupFeatureResult(
            string description,

            string featureProfileId,

            string id,

            string name,

            string trackerBoolean,

            string trackerBooleanVariable,

            ImmutableArray<Outputs.GetTransportIpv6TrackerGroupFeatureTrackerElementResult> trackerElements,

            string trackerName,

            string trackerNameVariable,

            int version)
        {
            Description = description;
            FeatureProfileId = featureProfileId;
            Id = id;
            Name = name;
            TrackerBoolean = trackerBoolean;
            TrackerBooleanVariable = trackerBooleanVariable;
            TrackerElements = trackerElements;
            TrackerName = trackerName;
            TrackerNameVariable = trackerNameVariable;
            Version = version;
        }
    }
}
