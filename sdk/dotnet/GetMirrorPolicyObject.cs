// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetMirrorPolicyObject
    {
        /// <summary>
        /// This data source can read the Mirror Policy Object .
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
        ///     var example = Sdwan.GetMirrorPolicyObject.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetMirrorPolicyObjectResult> InvokeAsync(GetMirrorPolicyObjectArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMirrorPolicyObjectResult>("sdwan:index/getMirrorPolicyObject:getMirrorPolicyObject", args ?? new GetMirrorPolicyObjectArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Mirror Policy Object .
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
        ///     var example = Sdwan.GetMirrorPolicyObject.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetMirrorPolicyObjectResult> Invoke(GetMirrorPolicyObjectInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMirrorPolicyObjectResult>("sdwan:index/getMirrorPolicyObject:getMirrorPolicyObject", args ?? new GetMirrorPolicyObjectInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Mirror Policy Object .
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
        ///     var example = Sdwan.GetMirrorPolicyObject.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetMirrorPolicyObjectResult> Invoke(GetMirrorPolicyObjectInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetMirrorPolicyObjectResult>("sdwan:index/getMirrorPolicyObject:getMirrorPolicyObject", args ?? new GetMirrorPolicyObjectInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMirrorPolicyObjectArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the object
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetMirrorPolicyObjectArgs()
        {
        }
        public static new GetMirrorPolicyObjectArgs Empty => new GetMirrorPolicyObjectArgs();
    }

    public sealed class GetMirrorPolicyObjectInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the object
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetMirrorPolicyObjectInvokeArgs()
        {
        }
        public static new GetMirrorPolicyObjectInvokeArgs Empty => new GetMirrorPolicyObjectInvokeArgs();
    }


    [OutputType]
    public sealed class GetMirrorPolicyObjectResult
    {
        /// <summary>
        /// The id of the object
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the policy object
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Remote destination IP
        /// </summary>
        public readonly string RemoteDestinationIp;
        /// <summary>
        /// Source IP
        /// </summary>
        public readonly string SourceIp;
        /// <summary>
        /// The version of the object
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetMirrorPolicyObjectResult(
            string id,

            string name,

            string remoteDestinationIp,

            string sourceIp,

            int version)
        {
            Id = id;
            Name = name;
            RemoteDestinationIp = remoteDestinationIp;
            SourceIp = sourceIp;
            Version = version;
        }
    }
}
