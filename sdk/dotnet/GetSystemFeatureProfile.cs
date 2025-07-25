// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetSystemFeatureProfile
    {
        /// <summary>
        /// This data source can read the System Feature Profile .
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
        ///     var example = Sdwan.GetSystemFeatureProfile.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetSystemFeatureProfileResult> InvokeAsync(GetSystemFeatureProfileArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSystemFeatureProfileResult>("sdwan:index/getSystemFeatureProfile:getSystemFeatureProfile", args ?? new GetSystemFeatureProfileArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the System Feature Profile .
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
        ///     var example = Sdwan.GetSystemFeatureProfile.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSystemFeatureProfileResult> Invoke(GetSystemFeatureProfileInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSystemFeatureProfileResult>("sdwan:index/getSystemFeatureProfile:getSystemFeatureProfile", args ?? new GetSystemFeatureProfileInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the System Feature Profile .
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
        ///     var example = Sdwan.GetSystemFeatureProfile.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSystemFeatureProfileResult> Invoke(GetSystemFeatureProfileInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSystemFeatureProfileResult>("sdwan:index/getSystemFeatureProfile:getSystemFeatureProfile", args ?? new GetSystemFeatureProfileInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSystemFeatureProfileArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the object
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetSystemFeatureProfileArgs()
        {
        }
        public static new GetSystemFeatureProfileArgs Empty => new GetSystemFeatureProfileArgs();
    }

    public sealed class GetSystemFeatureProfileInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the object
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetSystemFeatureProfileInvokeArgs()
        {
        }
        public static new GetSystemFeatureProfileInvokeArgs Empty => new GetSystemFeatureProfileInvokeArgs();
    }


    [OutputType]
    public sealed class GetSystemFeatureProfileResult
    {
        /// <summary>
        /// Description
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The id of the object
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the system feature profile
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetSystemFeatureProfileResult(
            string description,

            string id,

            string name)
        {
            Description = description;
            Id = id;
            Name = name;
        }
    }
}
