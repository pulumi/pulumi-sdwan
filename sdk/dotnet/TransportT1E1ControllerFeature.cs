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
    /// This resource can manage a Transport T1 E1 Controller Feature.
    ///   - Minimum SD-WAN Manager version: `20.12.0`
    /// 
    /// ## Import
    /// 
    /// The `pulumi import` command can be used, for example:
    /// 
    /// Expected import identifier with the format: "transport_t1_e1_controller_feature_id,feature_profile_id"
    /// 
    /// ```sh
    /// $ pulumi import sdwan:index/transportT1E1ControllerFeature:TransportT1E1ControllerFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"
    /// ```
    /// </summary>
    [SdwanResourceType("sdwan:index/transportT1E1ControllerFeature:TransportT1E1ControllerFeature")]
    public partial class TransportT1E1ControllerFeature : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the Feature
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Controller tx-ex List
        /// </summary>
        [Output("entries")]
        public Output<ImmutableArray<Outputs.TransportT1E1ControllerFeatureEntry>> Entries { get; private set; } = null!;

        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Output("featureProfileId")]
        public Output<string> FeatureProfileId { get; private set; } = null!;

        /// <summary>
        /// The name of the Feature
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Slot number
        /// </summary>
        [Output("slot")]
        public Output<string?> Slot { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("slotVariable")]
        public Output<string?> SlotVariable { get; private set; } = null!;

        /// <summary>
        /// Card Type - Choices: `e1`, `t1`
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The version of the Feature
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a TransportT1E1ControllerFeature resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TransportT1E1ControllerFeature(string name, TransportT1E1ControllerFeatureArgs args, CustomResourceOptions? options = null)
            : base("sdwan:index/transportT1E1ControllerFeature:TransportT1E1ControllerFeature", name, args ?? new TransportT1E1ControllerFeatureArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TransportT1E1ControllerFeature(string name, Input<string> id, TransportT1E1ControllerFeatureState? state = null, CustomResourceOptions? options = null)
            : base("sdwan:index/transportT1E1ControllerFeature:TransportT1E1ControllerFeature", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TransportT1E1ControllerFeature resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TransportT1E1ControllerFeature Get(string name, Input<string> id, TransportT1E1ControllerFeatureState? state = null, CustomResourceOptions? options = null)
        {
            return new TransportT1E1ControllerFeature(name, id, state, options);
        }
    }

    public sealed class TransportT1E1ControllerFeatureArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the Feature
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("entries", required: true)]
        private InputList<Inputs.TransportT1E1ControllerFeatureEntryArgs>? _entries;

        /// <summary>
        /// Controller tx-ex List
        /// </summary>
        public InputList<Inputs.TransportT1E1ControllerFeatureEntryArgs> Entries
        {
            get => _entries ?? (_entries = new InputList<Inputs.TransportT1E1ControllerFeatureEntryArgs>());
            set => _entries = value;
        }

        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId", required: true)]
        public Input<string> FeatureProfileId { get; set; } = null!;

        /// <summary>
        /// The name of the Feature
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Slot number
        /// </summary>
        [Input("slot")]
        public Input<string>? Slot { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("slotVariable")]
        public Input<string>? SlotVariable { get; set; }

        /// <summary>
        /// Card Type - Choices: `e1`, `t1`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public TransportT1E1ControllerFeatureArgs()
        {
        }
        public static new TransportT1E1ControllerFeatureArgs Empty => new TransportT1E1ControllerFeatureArgs();
    }

    public sealed class TransportT1E1ControllerFeatureState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the Feature
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("entries")]
        private InputList<Inputs.TransportT1E1ControllerFeatureEntryGetArgs>? _entries;

        /// <summary>
        /// Controller tx-ex List
        /// </summary>
        public InputList<Inputs.TransportT1E1ControllerFeatureEntryGetArgs> Entries
        {
            get => _entries ?? (_entries = new InputList<Inputs.TransportT1E1ControllerFeatureEntryGetArgs>());
            set => _entries = value;
        }

        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId")]
        public Input<string>? FeatureProfileId { get; set; }

        /// <summary>
        /// The name of the Feature
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Slot number
        /// </summary>
        [Input("slot")]
        public Input<string>? Slot { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("slotVariable")]
        public Input<string>? SlotVariable { get; set; }

        /// <summary>
        /// Card Type - Choices: `e1`, `t1`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The version of the Feature
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public TransportT1E1ControllerFeatureState()
        {
        }
        public static new TransportT1E1ControllerFeatureState Empty => new TransportT1E1ControllerFeatureState();
    }
}
