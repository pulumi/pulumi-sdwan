// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetTransportTrackerFeature
    {
        /// <summary>
        /// This data source can read the Transport Tracker Feature.
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
        ///     var example = Sdwan.GetTransportTrackerFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetTransportTrackerFeatureResult> InvokeAsync(GetTransportTrackerFeatureArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTransportTrackerFeatureResult>("sdwan:index/getTransportTrackerFeature:getTransportTrackerFeature", args ?? new GetTransportTrackerFeatureArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Transport Tracker Feature.
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
        ///     var example = Sdwan.GetTransportTrackerFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTransportTrackerFeatureResult> Invoke(GetTransportTrackerFeatureInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTransportTrackerFeatureResult>("sdwan:index/getTransportTrackerFeature:getTransportTrackerFeature", args ?? new GetTransportTrackerFeatureInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTransportTrackerFeatureArgs : global::Pulumi.InvokeArgs
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

        public GetTransportTrackerFeatureArgs()
        {
        }
        public static new GetTransportTrackerFeatureArgs Empty => new GetTransportTrackerFeatureArgs();
    }

    public sealed class GetTransportTrackerFeatureInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetTransportTrackerFeatureInvokeArgs()
        {
        }
        public static new GetTransportTrackerFeatureInvokeArgs Empty => new GetTransportTrackerFeatureInvokeArgs();
    }


    [OutputType]
    public sealed class GetTransportTrackerFeatureResult
    {
        /// <summary>
        /// The description of the Feature
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// API url of endpoint
        /// </summary>
        public readonly string EndpointApiUrl;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string EndpointApiUrlVariable;
        /// <summary>
        /// Endpoint DNS Name
        /// </summary>
        public readonly string EndpointDnsName;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string EndpointDnsNameVariable;
        /// <summary>
        /// Endpoint IP
        /// </summary>
        public readonly string EndpointIp;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string EndpointIpVariable;
        /// <summary>
        /// Endpoint Tracker Type
        /// </summary>
        public readonly string EndpointTrackerType;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string EndpointTrackerTypeVariable;
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        public readonly string FeatureProfileId;
        /// <summary>
        /// The id of the Feature
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Interval
        /// </summary>
        public readonly int Interval;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string IntervalVariable;
        /// <summary>
        /// Multiplier
        /// </summary>
        public readonly int Multiplier;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string MultiplierVariable;
        /// <summary>
        /// The name of the Feature
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Threshold
        /// </summary>
        public readonly int Threshold;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ThresholdVariable;
        /// <summary>
        /// Tracker Name
        /// </summary>
        public readonly string TrackerName;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TrackerNameVariable;
        /// <summary>
        /// Tracker Type
        /// </summary>
        public readonly string TrackerType;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TrackerTypeVariable;
        /// <summary>
        /// The version of the Feature
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetTransportTrackerFeatureResult(
            string description,

            string endpointApiUrl,

            string endpointApiUrlVariable,

            string endpointDnsName,

            string endpointDnsNameVariable,

            string endpointIp,

            string endpointIpVariable,

            string endpointTrackerType,

            string endpointTrackerTypeVariable,

            string featureProfileId,

            string id,

            int interval,

            string intervalVariable,

            int multiplier,

            string multiplierVariable,

            string name,

            int threshold,

            string thresholdVariable,

            string trackerName,

            string trackerNameVariable,

            string trackerType,

            string trackerTypeVariable,

            int version)
        {
            Description = description;
            EndpointApiUrl = endpointApiUrl;
            EndpointApiUrlVariable = endpointApiUrlVariable;
            EndpointDnsName = endpointDnsName;
            EndpointDnsNameVariable = endpointDnsNameVariable;
            EndpointIp = endpointIp;
            EndpointIpVariable = endpointIpVariable;
            EndpointTrackerType = endpointTrackerType;
            EndpointTrackerTypeVariable = endpointTrackerTypeVariable;
            FeatureProfileId = featureProfileId;
            Id = id;
            Interval = interval;
            IntervalVariable = intervalVariable;
            Multiplier = multiplier;
            MultiplierVariable = multiplierVariable;
            Name = name;
            Threshold = threshold;
            ThresholdVariable = thresholdVariable;
            TrackerName = trackerName;
            TrackerNameVariable = trackerNameVariable;
            TrackerType = trackerType;
            TrackerTypeVariable = trackerTypeVariable;
            Version = version;
        }
    }
}