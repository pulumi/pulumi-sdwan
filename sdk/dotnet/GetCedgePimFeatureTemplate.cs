// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetCedgePimFeatureTemplate
    {
        /// <summary>
        /// This data source can read the cEdge PIM feature template.
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
        ///     var example = Sdwan.GetCedgePimFeatureTemplate.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetCedgePimFeatureTemplateResult> InvokeAsync(GetCedgePimFeatureTemplateArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCedgePimFeatureTemplateResult>("sdwan:index/getCedgePimFeatureTemplate:getCedgePimFeatureTemplate", args ?? new GetCedgePimFeatureTemplateArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the cEdge PIM feature template.
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
        ///     var example = Sdwan.GetCedgePimFeatureTemplate.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCedgePimFeatureTemplateResult> Invoke(GetCedgePimFeatureTemplateInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCedgePimFeatureTemplateResult>("sdwan:index/getCedgePimFeatureTemplate:getCedgePimFeatureTemplate", args ?? new GetCedgePimFeatureTemplateInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the cEdge PIM feature template.
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
        ///     var example = Sdwan.GetCedgePimFeatureTemplate.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCedgePimFeatureTemplateResult> Invoke(GetCedgePimFeatureTemplateInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCedgePimFeatureTemplateResult>("sdwan:index/getCedgePimFeatureTemplate:getCedgePimFeatureTemplate", args ?? new GetCedgePimFeatureTemplateInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCedgePimFeatureTemplateArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the feature template
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// The name of the feature template
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetCedgePimFeatureTemplateArgs()
        {
        }
        public static new GetCedgePimFeatureTemplateArgs Empty => new GetCedgePimFeatureTemplateArgs();
    }

    public sealed class GetCedgePimFeatureTemplateInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the feature template
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The name of the feature template
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetCedgePimFeatureTemplateInvokeArgs()
        {
        }
        public static new GetCedgePimFeatureTemplateInvokeArgs Empty => new GetCedgePimFeatureTemplateInvokeArgs();
    }


    [OutputType]
    public sealed class GetCedgePimFeatureTemplateResult
    {
        /// <summary>
        /// Enable or disable auto-RP
        /// </summary>
        public readonly bool AutoRp;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string AutoRpVariable;
        /// <summary>
        /// Set Autonomic-Networking virtual interface
        /// </summary>
        public readonly string BsrCandidate;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string BsrCandidateVariable;
        /// <summary>
        /// Turn SSM On / Off
        /// </summary>
        public readonly bool Default;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string DefaultVariable;
        /// <summary>
        /// The description of the feature template
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// List of supported device types
        /// </summary>
        public readonly ImmutableArray<string> DeviceTypes;
        /// <summary>
        /// Hash Mask length for RP selection
        /// </summary>
        public readonly string HashMaskLength;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string HashMaskLengthVariable;
        /// <summary>
        /// The id of the feature template
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Set RP Discovery Interface Name
        /// </summary>
        public readonly string InterfaceName;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string InterfaceNameVariable;
        /// <summary>
        /// Set PIM interface parameters
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCedgePimFeatureTemplateInterfaceResult> Interfaces;
        /// <summary>
        /// The name of the feature template
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Set RP candidate priority
        /// </summary>
        public readonly int Priority;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string PriorityVariable;
        /// <summary>
        /// Set Access List for PIM SSM
        /// </summary>
        public readonly string Range;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string RangeVariable;
        /// <summary>
        /// Set Static RP Address(es)
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCedgePimFeatureTemplateRpAddressResult> RpAddresses;
        /// <summary>
        /// Enable or disable RP Announce
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCedgePimFeatureTemplateRpAnnounceFieldResult> RpAnnounceFields;
        /// <summary>
        /// Set BSR RP candidate filter
        /// </summary>
        public readonly string RpCandidateAccessList;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string RpCandidateAccessListVariable;
        /// <summary>
        /// Set RP Discovery Scope
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCedgePimFeatureTemplateRpCandidateResult> RpCandidates;
        /// <summary>
        /// Set RP Discovery Scope
        /// </summary>
        public readonly int Scope;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ScopeVariable;
        /// <summary>
        /// Set when PIM router joins the SPT (kbps)
        /// </summary>
        public readonly string SptThreshold;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string SptThresholdVariable;
        /// <summary>
        /// The template type
        /// </summary>
        public readonly string TemplateType;
        /// <summary>
        /// The version of the feature template
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetCedgePimFeatureTemplateResult(
            bool autoRp,

            string autoRpVariable,

            string bsrCandidate,

            string bsrCandidateVariable,

            bool @default,

            string defaultVariable,

            string description,

            ImmutableArray<string> deviceTypes,

            string hashMaskLength,

            string hashMaskLengthVariable,

            string id,

            string interfaceName,

            string interfaceNameVariable,

            ImmutableArray<Outputs.GetCedgePimFeatureTemplateInterfaceResult> interfaces,

            string name,

            int priority,

            string priorityVariable,

            string range,

            string rangeVariable,

            ImmutableArray<Outputs.GetCedgePimFeatureTemplateRpAddressResult> rpAddresses,

            ImmutableArray<Outputs.GetCedgePimFeatureTemplateRpAnnounceFieldResult> rpAnnounceFields,

            string rpCandidateAccessList,

            string rpCandidateAccessListVariable,

            ImmutableArray<Outputs.GetCedgePimFeatureTemplateRpCandidateResult> rpCandidates,

            int scope,

            string scopeVariable,

            string sptThreshold,

            string sptThresholdVariable,

            string templateType,

            int version)
        {
            AutoRp = autoRp;
            AutoRpVariable = autoRpVariable;
            BsrCandidate = bsrCandidate;
            BsrCandidateVariable = bsrCandidateVariable;
            Default = @default;
            DefaultVariable = defaultVariable;
            Description = description;
            DeviceTypes = deviceTypes;
            HashMaskLength = hashMaskLength;
            HashMaskLengthVariable = hashMaskLengthVariable;
            Id = id;
            InterfaceName = interfaceName;
            InterfaceNameVariable = interfaceNameVariable;
            Interfaces = interfaces;
            Name = name;
            Priority = priority;
            PriorityVariable = priorityVariable;
            Range = range;
            RangeVariable = rangeVariable;
            RpAddresses = rpAddresses;
            RpAnnounceFields = rpAnnounceFields;
            RpCandidateAccessList = rpCandidateAccessList;
            RpCandidateAccessListVariable = rpCandidateAccessListVariable;
            RpCandidates = rpCandidates;
            Scope = scope;
            ScopeVariable = scopeVariable;
            SptThreshold = sptThreshold;
            SptThresholdVariable = sptThresholdVariable;
            TemplateType = templateType;
            Version = version;
        }
    }
}
