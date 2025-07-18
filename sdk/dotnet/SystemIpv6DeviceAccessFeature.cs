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
    /// This resource can manage a System IPv6 Device Access Feature.
    ///   - Minimum SD-WAN Manager version: `20.12.0`
    /// 
    /// ## Import
    /// 
    /// The `pulumi import` command can be used, for example:
    /// 
    /// Expected import identifier with the format: "system_ipv6_device_access_feature_id,feature_profile_id"
    /// 
    /// ```sh
    /// $ pulumi import sdwan:index/systemIpv6DeviceAccessFeature:SystemIpv6DeviceAccessFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"
    /// ```
    /// </summary>
    [SdwanResourceType("sdwan:index/systemIpv6DeviceAccessFeature:SystemIpv6DeviceAccessFeature")]
    public partial class SystemIpv6DeviceAccessFeature : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Default Action - Choices: `drop`, `accept` - Default value: `drop`
        /// </summary>
        [Output("defaultAction")]
        public Output<string?> DefaultAction { get; private set; } = null!;

        /// <summary>
        /// The description of the Feature
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

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
        /// Device Access Control List
        /// </summary>
        [Output("sequences")]
        public Output<ImmutableArray<Outputs.SystemIpv6DeviceAccessFeatureSequence>> Sequences { get; private set; } = null!;

        /// <summary>
        /// The version of the Feature
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a SystemIpv6DeviceAccessFeature resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SystemIpv6DeviceAccessFeature(string name, SystemIpv6DeviceAccessFeatureArgs args, CustomResourceOptions? options = null)
            : base("sdwan:index/systemIpv6DeviceAccessFeature:SystemIpv6DeviceAccessFeature", name, args ?? new SystemIpv6DeviceAccessFeatureArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SystemIpv6DeviceAccessFeature(string name, Input<string> id, SystemIpv6DeviceAccessFeatureState? state = null, CustomResourceOptions? options = null)
            : base("sdwan:index/systemIpv6DeviceAccessFeature:SystemIpv6DeviceAccessFeature", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SystemIpv6DeviceAccessFeature resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SystemIpv6DeviceAccessFeature Get(string name, Input<string> id, SystemIpv6DeviceAccessFeatureState? state = null, CustomResourceOptions? options = null)
        {
            return new SystemIpv6DeviceAccessFeature(name, id, state, options);
        }
    }

    public sealed class SystemIpv6DeviceAccessFeatureArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Default Action - Choices: `drop`, `accept` - Default value: `drop`
        /// </summary>
        [Input("defaultAction")]
        public Input<string>? DefaultAction { get; set; }

        /// <summary>
        /// The description of the Feature
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

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

        [Input("sequences")]
        private InputList<Inputs.SystemIpv6DeviceAccessFeatureSequenceArgs>? _sequences;

        /// <summary>
        /// Device Access Control List
        /// </summary>
        public InputList<Inputs.SystemIpv6DeviceAccessFeatureSequenceArgs> Sequences
        {
            get => _sequences ?? (_sequences = new InputList<Inputs.SystemIpv6DeviceAccessFeatureSequenceArgs>());
            set => _sequences = value;
        }

        public SystemIpv6DeviceAccessFeatureArgs()
        {
        }
        public static new SystemIpv6DeviceAccessFeatureArgs Empty => new SystemIpv6DeviceAccessFeatureArgs();
    }

    public sealed class SystemIpv6DeviceAccessFeatureState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Default Action - Choices: `drop`, `accept` - Default value: `drop`
        /// </summary>
        [Input("defaultAction")]
        public Input<string>? DefaultAction { get; set; }

        /// <summary>
        /// The description of the Feature
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

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

        [Input("sequences")]
        private InputList<Inputs.SystemIpv6DeviceAccessFeatureSequenceGetArgs>? _sequences;

        /// <summary>
        /// Device Access Control List
        /// </summary>
        public InputList<Inputs.SystemIpv6DeviceAccessFeatureSequenceGetArgs> Sequences
        {
            get => _sequences ?? (_sequences = new InputList<Inputs.SystemIpv6DeviceAccessFeatureSequenceGetArgs>());
            set => _sequences = value;
        }

        /// <summary>
        /// The version of the Feature
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public SystemIpv6DeviceAccessFeatureState()
        {
        }
        public static new SystemIpv6DeviceAccessFeatureState Empty => new SystemIpv6DeviceAccessFeatureState();
    }
}
