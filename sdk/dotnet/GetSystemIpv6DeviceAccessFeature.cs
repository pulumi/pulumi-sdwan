// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetSystemIpv6DeviceAccessFeature
    {
        /// <summary>
        /// This data source can read the System IPv6 Device Access Feature.
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
        ///     var example = Sdwan.GetSystemIpv6DeviceAccessFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetSystemIpv6DeviceAccessFeatureResult> InvokeAsync(GetSystemIpv6DeviceAccessFeatureArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSystemIpv6DeviceAccessFeatureResult>("sdwan:index/getSystemIpv6DeviceAccessFeature:getSystemIpv6DeviceAccessFeature", args ?? new GetSystemIpv6DeviceAccessFeatureArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the System IPv6 Device Access Feature.
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
        ///     var example = Sdwan.GetSystemIpv6DeviceAccessFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSystemIpv6DeviceAccessFeatureResult> Invoke(GetSystemIpv6DeviceAccessFeatureInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSystemIpv6DeviceAccessFeatureResult>("sdwan:index/getSystemIpv6DeviceAccessFeature:getSystemIpv6DeviceAccessFeature", args ?? new GetSystemIpv6DeviceAccessFeatureInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the System IPv6 Device Access Feature.
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
        ///     var example = Sdwan.GetSystemIpv6DeviceAccessFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSystemIpv6DeviceAccessFeatureResult> Invoke(GetSystemIpv6DeviceAccessFeatureInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSystemIpv6DeviceAccessFeatureResult>("sdwan:index/getSystemIpv6DeviceAccessFeature:getSystemIpv6DeviceAccessFeature", args ?? new GetSystemIpv6DeviceAccessFeatureInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSystemIpv6DeviceAccessFeatureArgs : global::Pulumi.InvokeArgs
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

        public GetSystemIpv6DeviceAccessFeatureArgs()
        {
        }
        public static new GetSystemIpv6DeviceAccessFeatureArgs Empty => new GetSystemIpv6DeviceAccessFeatureArgs();
    }

    public sealed class GetSystemIpv6DeviceAccessFeatureInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetSystemIpv6DeviceAccessFeatureInvokeArgs()
        {
        }
        public static new GetSystemIpv6DeviceAccessFeatureInvokeArgs Empty => new GetSystemIpv6DeviceAccessFeatureInvokeArgs();
    }


    [OutputType]
    public sealed class GetSystemIpv6DeviceAccessFeatureResult
    {
        /// <summary>
        /// Default Action
        /// </summary>
        public readonly string DefaultAction;
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
        /// Device Access Control List
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSystemIpv6DeviceAccessFeatureSequenceResult> Sequences;
        /// <summary>
        /// The version of the Feature
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetSystemIpv6DeviceAccessFeatureResult(
            string defaultAction,

            string description,

            string featureProfileId,

            string id,

            string name,

            ImmutableArray<Outputs.GetSystemIpv6DeviceAccessFeatureSequenceResult> sequences,

            int version)
        {
            DefaultAction = defaultAction;
            Description = description;
            FeatureProfileId = featureProfileId;
            Id = id;
            Name = name;
            Sequences = sequences;
            Version = version;
        }
    }
}
