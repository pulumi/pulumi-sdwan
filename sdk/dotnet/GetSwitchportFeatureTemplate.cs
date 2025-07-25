// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetSwitchportFeatureTemplate
    {
        /// <summary>
        /// This data source can read the Switchport feature template.
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
        ///     var example = Sdwan.GetSwitchportFeatureTemplate.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetSwitchportFeatureTemplateResult> InvokeAsync(GetSwitchportFeatureTemplateArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSwitchportFeatureTemplateResult>("sdwan:index/getSwitchportFeatureTemplate:getSwitchportFeatureTemplate", args ?? new GetSwitchportFeatureTemplateArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Switchport feature template.
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
        ///     var example = Sdwan.GetSwitchportFeatureTemplate.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSwitchportFeatureTemplateResult> Invoke(GetSwitchportFeatureTemplateInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSwitchportFeatureTemplateResult>("sdwan:index/getSwitchportFeatureTemplate:getSwitchportFeatureTemplate", args ?? new GetSwitchportFeatureTemplateInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Switchport feature template.
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
        ///     var example = Sdwan.GetSwitchportFeatureTemplate.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSwitchportFeatureTemplateResult> Invoke(GetSwitchportFeatureTemplateInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSwitchportFeatureTemplateResult>("sdwan:index/getSwitchportFeatureTemplate:getSwitchportFeatureTemplate", args ?? new GetSwitchportFeatureTemplateInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSwitchportFeatureTemplateArgs : global::Pulumi.InvokeArgs
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

        public GetSwitchportFeatureTemplateArgs()
        {
        }
        public static new GetSwitchportFeatureTemplateArgs Empty => new GetSwitchportFeatureTemplateArgs();
    }

    public sealed class GetSwitchportFeatureTemplateInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetSwitchportFeatureTemplateInvokeArgs()
        {
        }
        public static new GetSwitchportFeatureTemplateInvokeArgs Empty => new GetSwitchportFeatureTemplateInvokeArgs();
    }


    [OutputType]
    public sealed class GetSwitchportFeatureTemplateResult
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
        /// The description of the feature template
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// List of supported device types
        /// </summary>
        public readonly ImmutableArray<string> DeviceTypes;
        /// <summary>
        /// The id of the feature template
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Interface name: GigabitEthernet0/&lt;&gt;/&lt;&gt; when present
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSwitchportFeatureTemplateInterfaceResult> Interfaces;
        /// <summary>
        /// Module type
        /// </summary>
        public readonly string ModuleType;
        /// <summary>
        /// The name of the feature template
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Number of Slots
        /// </summary>
        public readonly int Slot;
        /// <summary>
        /// Add static MAC address entries for interface
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSwitchportFeatureTemplateStaticMacAddressResult> StaticMacAddresses;
        /// <summary>
        /// Number of Sub-Slots
        /// </summary>
        public readonly int SubSlot;
        /// <summary>
        /// The template type
        /// </summary>
        public readonly string TemplateType;
        /// <summary>
        /// The version of the feature template
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetSwitchportFeatureTemplateResult(
            int ageOutTime,

            string ageOutTimeVariable,

            string description,

            ImmutableArray<string> deviceTypes,

            string id,

            ImmutableArray<Outputs.GetSwitchportFeatureTemplateInterfaceResult> interfaces,

            string moduleType,

            string name,

            int slot,

            ImmutableArray<Outputs.GetSwitchportFeatureTemplateStaticMacAddressResult> staticMacAddresses,

            int subSlot,

            string templateType,

            int version)
        {
            AgeOutTime = ageOutTime;
            AgeOutTimeVariable = ageOutTimeVariable;
            Description = description;
            DeviceTypes = deviceTypes;
            Id = id;
            Interfaces = interfaces;
            ModuleType = moduleType;
            Name = name;
            Slot = slot;
            StaticMacAddresses = staticMacAddresses;
            SubSlot = subSlot;
            TemplateType = templateType;
            Version = version;
        }
    }
}
