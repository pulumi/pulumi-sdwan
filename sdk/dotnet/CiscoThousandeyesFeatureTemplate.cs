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
    /// This resource can manage a Cisco ThousandEyes feature template.
    ///   - Minimum SD-WAN Manager version: `15.0.0`
    /// 
    /// ## Import
    /// 
    /// The `pulumi import` command can be used, for example:
    /// 
    /// ```sh
    /// $ pulumi import sdwan:index/ciscoThousandeyesFeatureTemplate:CiscoThousandeyesFeatureTemplate example "f6b2c44c-693c-4763-b010-895aa3d236bd"
    /// ```
    /// </summary>
    [SdwanResourceType("sdwan:index/ciscoThousandeyesFeatureTemplate:CiscoThousandeyesFeatureTemplate")]
    public partial class CiscoThousandeyesFeatureTemplate : global::Pulumi.CustomResource
    {
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
        /// The name of the feature template
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

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
        /// Virtual application Instance
        /// </summary>
        [Output("virtualApplications")]
        public Output<ImmutableArray<Outputs.CiscoThousandeyesFeatureTemplateVirtualApplication>> VirtualApplications { get; private set; } = null!;


        /// <summary>
        /// Create a CiscoThousandeyesFeatureTemplate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CiscoThousandeyesFeatureTemplate(string name, CiscoThousandeyesFeatureTemplateArgs args, CustomResourceOptions? options = null)
            : base("sdwan:index/ciscoThousandeyesFeatureTemplate:CiscoThousandeyesFeatureTemplate", name, args ?? new CiscoThousandeyesFeatureTemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CiscoThousandeyesFeatureTemplate(string name, Input<string> id, CiscoThousandeyesFeatureTemplateState? state = null, CustomResourceOptions? options = null)
            : base("sdwan:index/ciscoThousandeyesFeatureTemplate:CiscoThousandeyesFeatureTemplate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CiscoThousandeyesFeatureTemplate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CiscoThousandeyesFeatureTemplate Get(string name, Input<string> id, CiscoThousandeyesFeatureTemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new CiscoThousandeyesFeatureTemplate(name, id, state, options);
        }
    }

    public sealed class CiscoThousandeyesFeatureTemplateArgs : global::Pulumi.ResourceArgs
    {
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

        /// <summary>
        /// The name of the feature template
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("virtualApplications")]
        private InputList<Inputs.CiscoThousandeyesFeatureTemplateVirtualApplicationArgs>? _virtualApplications;

        /// <summary>
        /// Virtual application Instance
        /// </summary>
        public InputList<Inputs.CiscoThousandeyesFeatureTemplateVirtualApplicationArgs> VirtualApplications
        {
            get => _virtualApplications ?? (_virtualApplications = new InputList<Inputs.CiscoThousandeyesFeatureTemplateVirtualApplicationArgs>());
            set => _virtualApplications = value;
        }

        public CiscoThousandeyesFeatureTemplateArgs()
        {
        }
        public static new CiscoThousandeyesFeatureTemplateArgs Empty => new CiscoThousandeyesFeatureTemplateArgs();
    }

    public sealed class CiscoThousandeyesFeatureTemplateState : global::Pulumi.ResourceArgs
    {
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

        /// <summary>
        /// The name of the feature template
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

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

        [Input("virtualApplications")]
        private InputList<Inputs.CiscoThousandeyesFeatureTemplateVirtualApplicationGetArgs>? _virtualApplications;

        /// <summary>
        /// Virtual application Instance
        /// </summary>
        public InputList<Inputs.CiscoThousandeyesFeatureTemplateVirtualApplicationGetArgs> VirtualApplications
        {
            get => _virtualApplications ?? (_virtualApplications = new InputList<Inputs.CiscoThousandeyesFeatureTemplateVirtualApplicationGetArgs>());
            set => _virtualApplications = value;
        }

        public CiscoThousandeyesFeatureTemplateState()
        {
        }
        public static new CiscoThousandeyesFeatureTemplateState Empty => new CiscoThousandeyesFeatureTemplateState();
    }
}
