// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    /// <summary>
    /// This resource can manage a Switchport feature template.
    ///   - Minimum SD-WAN Manager version: `15.0.0`
    /// 
    /// ## Import
    /// 
    /// The `pulumi import` command can be used, for example:
    /// 
    /// ```sh
    /// $ pulumi import sdwan:index/switchportFeatureTemplate:SwitchportFeatureTemplate example "f6b2c44c-693c-4763-b010-895aa3d236bd"
    /// ```
    /// </summary>
    [SdwanResourceType("sdwan:index/switchportFeatureTemplate:SwitchportFeatureTemplate")]
    public partial class SwitchportFeatureTemplate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Set when a MAC table entry ages out (0 to disable, 10-1000000 otherwise) - Range: `0`-`1000000` - Default value: `300`
        /// </summary>
        [Output("ageOutTime")]
        public Output<int?> AgeOutTime { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("ageOutTimeVariable")]
        public Output<string?> AgeOutTimeVariable { get; private set; } = null!;

        /// <summary>
        /// The description of the feature template
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
        /// `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
        /// `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
        /// </summary>
        [Output("deviceTypes")]
        public Output<ImmutableArray<string>> DeviceTypes { get; private set; } = null!;

        /// <summary>
        /// Interface name: GigabitEthernet0/&lt;&gt;/&lt;&gt; when present
        /// </summary>
        [Output("interfaces")]
        public Output<ImmutableArray<Outputs.SwitchportFeatureTemplateInterface>> Interfaces { get; private set; } = null!;

        /// <summary>
        /// Module type - Choices: `4`, `8`, `22`, `50`
        /// </summary>
        [Output("moduleType")]
        public Output<string?> ModuleType { get; private set; } = null!;

        /// <summary>
        /// The name of the feature template
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Number of Slots - Range: `0`-`31` - Default value: `0`
        /// </summary>
        [Output("slot")]
        public Output<int?> Slot { get; private set; } = null!;

        /// <summary>
        /// Add static MAC address entries for interface
        /// </summary>
        [Output("staticMacAddresses")]
        public Output<ImmutableArray<Outputs.SwitchportFeatureTemplateStaticMacAddress>> StaticMacAddresses { get; private set; } = null!;

        /// <summary>
        /// Number of Sub-Slots - Range: `0`-`31` - Default value: `0`
        /// </summary>
        [Output("subSlot")]
        public Output<int?> SubSlot { get; private set; } = null!;

        /// <summary>
        /// The template type
        /// </summary>
        [Output("templateType")]
        public Output<string> TemplateType { get; private set; } = null!;

        /// <summary>
        /// The version of the feature template
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a SwitchportFeatureTemplate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SwitchportFeatureTemplate(string name, SwitchportFeatureTemplateArgs args, CustomResourceOptions? options = null)
            : base("sdwan:index/switchportFeatureTemplate:SwitchportFeatureTemplate", name, args ?? new SwitchportFeatureTemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SwitchportFeatureTemplate(string name, Input<string> id, SwitchportFeatureTemplateState? state = null, CustomResourceOptions? options = null)
            : base("sdwan:index/switchportFeatureTemplate:SwitchportFeatureTemplate", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SwitchportFeatureTemplate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SwitchportFeatureTemplate Get(string name, Input<string> id, SwitchportFeatureTemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new SwitchportFeatureTemplate(name, id, state, options);
        }
    }

    public sealed class SwitchportFeatureTemplateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set when a MAC table entry ages out (0 to disable, 10-1000000 otherwise) - Range: `0`-`1000000` - Default value: `300`
        /// </summary>
        [Input("ageOutTime")]
        public Input<int>? AgeOutTime { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ageOutTimeVariable")]
        public Input<string>? AgeOutTimeVariable { get; set; }

        /// <summary>
        /// The description of the feature template
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        [Input("deviceTypes", required: true)]
        private InputList<string>? _deviceTypes;

        /// <summary>
        /// List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
        /// `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
        /// `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
        /// </summary>
        public InputList<string> DeviceTypes
        {
            get => _deviceTypes ?? (_deviceTypes = new InputList<string>());
            set => _deviceTypes = value;
        }

        [Input("interfaces")]
        private InputList<Inputs.SwitchportFeatureTemplateInterfaceArgs>? _interfaces;

        /// <summary>
        /// Interface name: GigabitEthernet0/&lt;&gt;/&lt;&gt; when present
        /// </summary>
        public InputList<Inputs.SwitchportFeatureTemplateInterfaceArgs> Interfaces
        {
            get => _interfaces ?? (_interfaces = new InputList<Inputs.SwitchportFeatureTemplateInterfaceArgs>());
            set => _interfaces = value;
        }

        /// <summary>
        /// Module type - Choices: `4`, `8`, `22`, `50`
        /// </summary>
        [Input("moduleType")]
        public Input<string>? ModuleType { get; set; }

        /// <summary>
        /// The name of the feature template
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Number of Slots - Range: `0`-`31` - Default value: `0`
        /// </summary>
        [Input("slot")]
        public Input<int>? Slot { get; set; }

        [Input("staticMacAddresses")]
        private InputList<Inputs.SwitchportFeatureTemplateStaticMacAddressArgs>? _staticMacAddresses;

        /// <summary>
        /// Add static MAC address entries for interface
        /// </summary>
        public InputList<Inputs.SwitchportFeatureTemplateStaticMacAddressArgs> StaticMacAddresses
        {
            get => _staticMacAddresses ?? (_staticMacAddresses = new InputList<Inputs.SwitchportFeatureTemplateStaticMacAddressArgs>());
            set => _staticMacAddresses = value;
        }

        /// <summary>
        /// Number of Sub-Slots - Range: `0`-`31` - Default value: `0`
        /// </summary>
        [Input("subSlot")]
        public Input<int>? SubSlot { get; set; }

        public SwitchportFeatureTemplateArgs()
        {
        }
        public static new SwitchportFeatureTemplateArgs Empty => new SwitchportFeatureTemplateArgs();
    }

    public sealed class SwitchportFeatureTemplateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set when a MAC table entry ages out (0 to disable, 10-1000000 otherwise) - Range: `0`-`1000000` - Default value: `300`
        /// </summary>
        [Input("ageOutTime")]
        public Input<int>? AgeOutTime { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("ageOutTimeVariable")]
        public Input<string>? AgeOutTimeVariable { get; set; }

        /// <summary>
        /// The description of the feature template
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("deviceTypes")]
        private InputList<string>? _deviceTypes;

        /// <summary>
        /// List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
        /// `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
        /// `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
        /// </summary>
        public InputList<string> DeviceTypes
        {
            get => _deviceTypes ?? (_deviceTypes = new InputList<string>());
            set => _deviceTypes = value;
        }

        [Input("interfaces")]
        private InputList<Inputs.SwitchportFeatureTemplateInterfaceGetArgs>? _interfaces;

        /// <summary>
        /// Interface name: GigabitEthernet0/&lt;&gt;/&lt;&gt; when present
        /// </summary>
        public InputList<Inputs.SwitchportFeatureTemplateInterfaceGetArgs> Interfaces
        {
            get => _interfaces ?? (_interfaces = new InputList<Inputs.SwitchportFeatureTemplateInterfaceGetArgs>());
            set => _interfaces = value;
        }

        /// <summary>
        /// Module type - Choices: `4`, `8`, `22`, `50`
        /// </summary>
        [Input("moduleType")]
        public Input<string>? ModuleType { get; set; }

        /// <summary>
        /// The name of the feature template
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Number of Slots - Range: `0`-`31` - Default value: `0`
        /// </summary>
        [Input("slot")]
        public Input<int>? Slot { get; set; }

        [Input("staticMacAddresses")]
        private InputList<Inputs.SwitchportFeatureTemplateStaticMacAddressGetArgs>? _staticMacAddresses;

        /// <summary>
        /// Add static MAC address entries for interface
        /// </summary>
        public InputList<Inputs.SwitchportFeatureTemplateStaticMacAddressGetArgs> StaticMacAddresses
        {
            get => _staticMacAddresses ?? (_staticMacAddresses = new InputList<Inputs.SwitchportFeatureTemplateStaticMacAddressGetArgs>());
            set => _staticMacAddresses = value;
        }

        /// <summary>
        /// Number of Sub-Slots - Range: `0`-`31` - Default value: `0`
        /// </summary>
        [Input("subSlot")]
        public Input<int>? SubSlot { get; set; }

        /// <summary>
        /// The template type
        /// </summary>
        [Input("templateType")]
        public Input<string>? TemplateType { get; set; }

        /// <summary>
        /// The version of the feature template
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public SwitchportFeatureTemplateState()
        {
        }
        public static new SwitchportFeatureTemplateState Empty => new SwitchportFeatureTemplateState();
    }
}
