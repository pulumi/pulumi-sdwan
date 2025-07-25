// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetApplicationAwareRoutingPolicyDefinition
    {
        /// <summary>
        /// This data source can read the Application Aware Routing Policy Definition .
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
        ///     var example = Sdwan.GetApplicationAwareRoutingPolicyDefinition.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetApplicationAwareRoutingPolicyDefinitionResult> InvokeAsync(GetApplicationAwareRoutingPolicyDefinitionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApplicationAwareRoutingPolicyDefinitionResult>("sdwan:index/getApplicationAwareRoutingPolicyDefinition:getApplicationAwareRoutingPolicyDefinition", args ?? new GetApplicationAwareRoutingPolicyDefinitionArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Application Aware Routing Policy Definition .
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
        ///     var example = Sdwan.GetApplicationAwareRoutingPolicyDefinition.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplicationAwareRoutingPolicyDefinitionResult> Invoke(GetApplicationAwareRoutingPolicyDefinitionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplicationAwareRoutingPolicyDefinitionResult>("sdwan:index/getApplicationAwareRoutingPolicyDefinition:getApplicationAwareRoutingPolicyDefinition", args ?? new GetApplicationAwareRoutingPolicyDefinitionInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Application Aware Routing Policy Definition .
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
        ///     var example = Sdwan.GetApplicationAwareRoutingPolicyDefinition.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplicationAwareRoutingPolicyDefinitionResult> Invoke(GetApplicationAwareRoutingPolicyDefinitionInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplicationAwareRoutingPolicyDefinitionResult>("sdwan:index/getApplicationAwareRoutingPolicyDefinition:getApplicationAwareRoutingPolicyDefinition", args ?? new GetApplicationAwareRoutingPolicyDefinitionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApplicationAwareRoutingPolicyDefinitionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the object
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetApplicationAwareRoutingPolicyDefinitionArgs()
        {
        }
        public static new GetApplicationAwareRoutingPolicyDefinitionArgs Empty => new GetApplicationAwareRoutingPolicyDefinitionArgs();
    }

    public sealed class GetApplicationAwareRoutingPolicyDefinitionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the object
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetApplicationAwareRoutingPolicyDefinitionInvokeArgs()
        {
        }
        public static new GetApplicationAwareRoutingPolicyDefinitionInvokeArgs Empty => new GetApplicationAwareRoutingPolicyDefinitionInvokeArgs();
    }


    [OutputType]
    public sealed class GetApplicationAwareRoutingPolicyDefinitionResult
    {
        /// <summary>
        /// The description of the policy definition
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The id of the object
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the policy definition
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// List of sequences
        /// </summary>
        public readonly ImmutableArray<Outputs.GetApplicationAwareRoutingPolicyDefinitionSequenceResult> Sequences;
        /// <summary>
        /// Type
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The version of the object
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetApplicationAwareRoutingPolicyDefinitionResult(
            string description,

            string id,

            string name,

            ImmutableArray<Outputs.GetApplicationAwareRoutingPolicyDefinitionSequenceResult> sequences,

            string type,

            int version)
        {
            Description = description;
            Id = id;
            Name = name;
            Sequences = sequences;
            Type = type;
            Version = version;
        }
    }
}
