// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetDomainListPolicyObject
    {
        /// <summary>
        /// This data source can read the Domain List Policy Object .
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
        ///     var example = Sdwan.GetDomainListPolicyObject.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetDomainListPolicyObjectResult> InvokeAsync(GetDomainListPolicyObjectArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDomainListPolicyObjectResult>("sdwan:index/getDomainListPolicyObject:getDomainListPolicyObject", args ?? new GetDomainListPolicyObjectArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Domain List Policy Object .
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
        ///     var example = Sdwan.GetDomainListPolicyObject.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDomainListPolicyObjectResult> Invoke(GetDomainListPolicyObjectInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDomainListPolicyObjectResult>("sdwan:index/getDomainListPolicyObject:getDomainListPolicyObject", args ?? new GetDomainListPolicyObjectInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Domain List Policy Object .
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
        ///     var example = Sdwan.GetDomainListPolicyObject.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDomainListPolicyObjectResult> Invoke(GetDomainListPolicyObjectInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDomainListPolicyObjectResult>("sdwan:index/getDomainListPolicyObject:getDomainListPolicyObject", args ?? new GetDomainListPolicyObjectInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDomainListPolicyObjectArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the object
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetDomainListPolicyObjectArgs()
        {
        }
        public static new GetDomainListPolicyObjectArgs Empty => new GetDomainListPolicyObjectArgs();
    }

    public sealed class GetDomainListPolicyObjectInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the object
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetDomainListPolicyObjectInvokeArgs()
        {
        }
        public static new GetDomainListPolicyObjectInvokeArgs Empty => new GetDomainListPolicyObjectInvokeArgs();
    }


    [OutputType]
    public sealed class GetDomainListPolicyObjectResult
    {
        /// <summary>
        /// List of entries
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDomainListPolicyObjectEntryResult> Entries;
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
        private GetDomainListPolicyObjectResult(
            ImmutableArray<Outputs.GetDomainListPolicyObjectEntryResult> entries,

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
