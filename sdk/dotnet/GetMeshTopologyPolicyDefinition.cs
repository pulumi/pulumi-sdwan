// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetMeshTopologyPolicyDefinition
    {
        /// <summary>
        /// This data source can read the Mesh Topology Policy Definition .
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
        ///     var example = Sdwan.GetMeshTopologyPolicyDefinition.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetMeshTopologyPolicyDefinitionResult> InvokeAsync(GetMeshTopologyPolicyDefinitionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMeshTopologyPolicyDefinitionResult>("sdwan:index/getMeshTopologyPolicyDefinition:getMeshTopologyPolicyDefinition", args ?? new GetMeshTopologyPolicyDefinitionArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Mesh Topology Policy Definition .
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
        ///     var example = Sdwan.GetMeshTopologyPolicyDefinition.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetMeshTopologyPolicyDefinitionResult> Invoke(GetMeshTopologyPolicyDefinitionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMeshTopologyPolicyDefinitionResult>("sdwan:index/getMeshTopologyPolicyDefinition:getMeshTopologyPolicyDefinition", args ?? new GetMeshTopologyPolicyDefinitionInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Mesh Topology Policy Definition .
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
        ///     var example = Sdwan.GetMeshTopologyPolicyDefinition.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetMeshTopologyPolicyDefinitionResult> Invoke(GetMeshTopologyPolicyDefinitionInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetMeshTopologyPolicyDefinitionResult>("sdwan:index/getMeshTopologyPolicyDefinition:getMeshTopologyPolicyDefinition", args ?? new GetMeshTopologyPolicyDefinitionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMeshTopologyPolicyDefinitionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the object
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetMeshTopologyPolicyDefinitionArgs()
        {
        }
        public static new GetMeshTopologyPolicyDefinitionArgs Empty => new GetMeshTopologyPolicyDefinitionArgs();
    }

    public sealed class GetMeshTopologyPolicyDefinitionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the object
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetMeshTopologyPolicyDefinitionInvokeArgs()
        {
        }
        public static new GetMeshTopologyPolicyDefinitionInvokeArgs Empty => new GetMeshTopologyPolicyDefinitionInvokeArgs();
    }


    [OutputType]
    public sealed class GetMeshTopologyPolicyDefinitionResult
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
        /// List of regions
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMeshTopologyPolicyDefinitionRegionResult> Regions;
        /// <summary>
        /// Type
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The version of the object
        /// </summary>
        public readonly int Version;
        /// <summary>
        /// VPN list ID
        /// </summary>
        public readonly string VpnListId;
        /// <summary>
        /// VPN list version
        /// </summary>
        public readonly int VpnListVersion;

        [OutputConstructor]
        private GetMeshTopologyPolicyDefinitionResult(
            string description,

            string id,

            string name,

            ImmutableArray<Outputs.GetMeshTopologyPolicyDefinitionRegionResult> regions,

            string type,

            int version,

            string vpnListId,

            int vpnListVersion)
        {
            Description = description;
            Id = id;
            Name = name;
            Regions = regions;
            Type = type;
            Version = version;
            VpnListId = vpnListId;
            VpnListVersion = vpnListVersion;
        }
    }
}
