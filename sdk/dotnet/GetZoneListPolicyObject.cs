// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetZoneListPolicyObject
    {
        /// <summary>
        /// This data source can read the Zone List Policy Object .
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
        ///     var example = Sdwan.GetZoneListPolicyObject.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetZoneListPolicyObjectResult> InvokeAsync(GetZoneListPolicyObjectArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZoneListPolicyObjectResult>("sdwan:index/getZoneListPolicyObject:getZoneListPolicyObject", args ?? new GetZoneListPolicyObjectArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Zone List Policy Object .
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
        ///     var example = Sdwan.GetZoneListPolicyObject.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZoneListPolicyObjectResult> Invoke(GetZoneListPolicyObjectInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZoneListPolicyObjectResult>("sdwan:index/getZoneListPolicyObject:getZoneListPolicyObject", args ?? new GetZoneListPolicyObjectInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Zone List Policy Object .
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
        ///     var example = Sdwan.GetZoneListPolicyObject.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZoneListPolicyObjectResult> Invoke(GetZoneListPolicyObjectInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetZoneListPolicyObjectResult>("sdwan:index/getZoneListPolicyObject:getZoneListPolicyObject", args ?? new GetZoneListPolicyObjectInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZoneListPolicyObjectArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the object
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetZoneListPolicyObjectArgs()
        {
        }
        public static new GetZoneListPolicyObjectArgs Empty => new GetZoneListPolicyObjectArgs();
    }

    public sealed class GetZoneListPolicyObjectInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the object
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetZoneListPolicyObjectInvokeArgs()
        {
        }
        public static new GetZoneListPolicyObjectInvokeArgs Empty => new GetZoneListPolicyObjectInvokeArgs();
    }


    [OutputType]
    public sealed class GetZoneListPolicyObjectResult
    {
        /// <summary>
        /// List of entries
        /// </summary>
        public readonly ImmutableArray<Outputs.GetZoneListPolicyObjectEntryResult> Entries;
        /// <summary>
        /// The id of the object
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the policy object
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The version of the object
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetZoneListPolicyObjectResult(
            ImmutableArray<Outputs.GetZoneListPolicyObjectEntryResult> entries,

            string id,

            string name,

            int version)
        {
            Entries = entries;
            Id = id;
            Name = name;
            Version = version;
        }
    }
}
