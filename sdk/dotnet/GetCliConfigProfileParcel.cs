// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetCliConfigProfileParcel
    {
        /// <summary>
        /// This data source can read the CLI Config Profile Parcel .
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
        ///     var example = Sdwan.GetCliConfigProfileParcel.Invoke(new()
        ///     {
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetCliConfigProfileParcelResult> InvokeAsync(GetCliConfigProfileParcelArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCliConfigProfileParcelResult>("sdwan:index/getCliConfigProfileParcel:getCliConfigProfileParcel", args ?? new GetCliConfigProfileParcelArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the CLI Config Profile Parcel .
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
        ///     var example = Sdwan.GetCliConfigProfileParcel.Invoke(new()
        ///     {
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCliConfigProfileParcelResult> Invoke(GetCliConfigProfileParcelInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCliConfigProfileParcelResult>("sdwan:index/getCliConfigProfileParcel:getCliConfigProfileParcel", args ?? new GetCliConfigProfileParcelInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCliConfigProfileParcelArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId", required: true)]
        public string FeatureProfileId { get; set; } = null!;

        /// <summary>
        /// The id of the object
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetCliConfigProfileParcelArgs()
        {
        }
        public static new GetCliConfigProfileParcelArgs Empty => new GetCliConfigProfileParcelArgs();
    }

    public sealed class GetCliConfigProfileParcelInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId", required: true)]
        public Input<string> FeatureProfileId { get; set; } = null!;

        /// <summary>
        /// The id of the object
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetCliConfigProfileParcelInvokeArgs()
        {
        }
        public static new GetCliConfigProfileParcelInvokeArgs Empty => new GetCliConfigProfileParcelInvokeArgs();
    }


    [OutputType]
    public sealed class GetCliConfigProfileParcelResult
    {
        /// <summary>
        /// CLI configuration
        /// </summary>
        public readonly string CliConfiguration;
        /// <summary>
        /// The description of the profile parcel
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        public readonly string FeatureProfileId;
        /// <summary>
        /// The id of the object
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the profile parcel
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The version of the object
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetCliConfigProfileParcelResult(
            string cliConfiguration,

            string description,

            string featureProfileId,

            string id,

            string name,

            int version)
        {
            CliConfiguration = cliConfiguration;
            Description = description;
            FeatureProfileId = featureProfileId;
            Id = id;
            Name = name;
            Version = version;
        }
    }
}
