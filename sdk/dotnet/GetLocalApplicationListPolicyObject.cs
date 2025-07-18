// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetLocalApplicationListPolicyObject
    {
        /// <summary>
        /// This data source can read the Local Application List Policy Object .
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
        ///     var example = Sdwan.GetLocalApplicationListPolicyObject.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetLocalApplicationListPolicyObjectResult> InvokeAsync(GetLocalApplicationListPolicyObjectArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLocalApplicationListPolicyObjectResult>("sdwan:index/getLocalApplicationListPolicyObject:getLocalApplicationListPolicyObject", args ?? new GetLocalApplicationListPolicyObjectArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Local Application List Policy Object .
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
        ///     var example = Sdwan.GetLocalApplicationListPolicyObject.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetLocalApplicationListPolicyObjectResult> Invoke(GetLocalApplicationListPolicyObjectInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLocalApplicationListPolicyObjectResult>("sdwan:index/getLocalApplicationListPolicyObject:getLocalApplicationListPolicyObject", args ?? new GetLocalApplicationListPolicyObjectInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Local Application List Policy Object .
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
        ///     var example = Sdwan.GetLocalApplicationListPolicyObject.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetLocalApplicationListPolicyObjectResult> Invoke(GetLocalApplicationListPolicyObjectInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetLocalApplicationListPolicyObjectResult>("sdwan:index/getLocalApplicationListPolicyObject:getLocalApplicationListPolicyObject", args ?? new GetLocalApplicationListPolicyObjectInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLocalApplicationListPolicyObjectArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the object
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetLocalApplicationListPolicyObjectArgs()
        {
        }
        public static new GetLocalApplicationListPolicyObjectArgs Empty => new GetLocalApplicationListPolicyObjectArgs();
    }

    public sealed class GetLocalApplicationListPolicyObjectInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the object
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetLocalApplicationListPolicyObjectInvokeArgs()
        {
        }
        public static new GetLocalApplicationListPolicyObjectInvokeArgs Empty => new GetLocalApplicationListPolicyObjectInvokeArgs();
    }


    [OutputType]
    public sealed class GetLocalApplicationListPolicyObjectResult
    {
        /// <summary>
        /// List of entries
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLocalApplicationListPolicyObjectEntryResult> Entries;
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
        private GetLocalApplicationListPolicyObjectResult(
            ImmutableArray<Outputs.GetLocalApplicationListPolicyObjectEntryResult> entries,

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
