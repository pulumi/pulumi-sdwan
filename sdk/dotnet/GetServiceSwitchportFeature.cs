// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetServiceSwitchportFeature
    {
        /// <summary>
        /// This data source can read the Service Switchport Feature.
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
        ///     var example = Sdwan.GetServiceSwitchportFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetServiceSwitchportFeatureResult> InvokeAsync(GetServiceSwitchportFeatureArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServiceSwitchportFeatureResult>("sdwan:index/getServiceSwitchportFeature:getServiceSwitchportFeature", args ?? new GetServiceSwitchportFeatureArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Service Switchport Feature.
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
        ///     var example = Sdwan.GetServiceSwitchportFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServiceSwitchportFeatureResult> Invoke(GetServiceSwitchportFeatureInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceSwitchportFeatureResult>("sdwan:index/getServiceSwitchportFeature:getServiceSwitchportFeature", args ?? new GetServiceSwitchportFeatureInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Service Switchport Feature.
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
        ///     var example = Sdwan.GetServiceSwitchportFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServiceSwitchportFeatureResult> Invoke(GetServiceSwitchportFeatureInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceSwitchportFeatureResult>("sdwan:index/getServiceSwitchportFeature:getServiceSwitchportFeature", args ?? new GetServiceSwitchportFeatureInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceSwitchportFeatureArgs : global::Pulumi.InvokeArgs
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

        public GetServiceSwitchportFeatureArgs()
        {
        }
        public static new GetServiceSwitchportFeatureArgs Empty => new GetServiceSwitchportFeatureArgs();
    }

    public sealed class GetServiceSwitchportFeatureInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetServiceSwitchportFeatureInvokeArgs()
        {
        }
        public static new GetServiceSwitchportFeatureInvokeArgs Empty => new GetServiceSwitchportFeatureInvokeArgs();
    }


    [OutputType]
    public sealed class GetServiceSwitchportFeatureResult
    {
        /// <summary>
        /// Set when a MAC table entry ages out (0 to disable, 10-1000000 otherwise)
        /// </summary>
        public readonly int AgeOutTime;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string AgeOutTimeVariable;
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
        /// Interface name: GigabitEthernet0/&lt;&gt;/&lt;&gt; when present
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceSwitchportFeatureInterfaceResult> Interfaces;
        /// <summary>
        /// The name of the Feature
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Add static MAC address entries for interface
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceSwitchportFeatureStaticMacAddressResult> StaticMacAddresses;
        /// <summary>
        /// The version of the Feature
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetServiceSwitchportFeatureResult(
            int ageOutTime,

            string ageOutTimeVariable,

            string description,

            string featureProfileId,

            string id,

            ImmutableArray<Outputs.GetServiceSwitchportFeatureInterfaceResult> interfaces,

            string name,

            ImmutableArray<Outputs.GetServiceSwitchportFeatureStaticMacAddressResult> staticMacAddresses,

            int version)
        {
            AgeOutTime = ageOutTime;
            AgeOutTimeVariable = ageOutTimeVariable;
            Description = description;
            FeatureProfileId = featureProfileId;
            Id = id;
            Interfaces = interfaces;
            Name = name;
            StaticMacAddresses = staticMacAddresses;
            Version = version;
        }
    }
}
