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
    /// This resource can manage a Service IPv4 ACL Feature.
    ///   - Minimum SD-WAN Manager version: `20.12.0`
    /// 
    /// ## Import
    /// 
    /// The `pulumi import` command can be used, for example:
    /// 
    /// Expected import identifier with the format: "service_ipv4_acl_feature_id,feature_profile_id"
    /// 
    /// ```sh
    /// $ pulumi import sdwan:index/serviceIpv4AclFeature:ServiceIpv4AclFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"
    /// ```
    /// </summary>
    [SdwanResourceType("sdwan:index/serviceIpv4AclFeature:ServiceIpv4AclFeature")]
    public partial class ServiceIpv4AclFeature : global::Pulumi.CustomResource
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
        /// Access Control List
        /// </summary>
        [Output("sequences")]
        public Output<ImmutableArray<Outputs.ServiceIpv4AclFeatureSequence>> Sequences { get; private set; } = null!;

        /// <summary>
        /// The version of the Feature
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a ServiceIpv4AclFeature resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServiceIpv4AclFeature(string name, ServiceIpv4AclFeatureArgs args, CustomResourceOptions? options = null)
            : base("sdwan:index/serviceIpv4AclFeature:ServiceIpv4AclFeature", name, args ?? new ServiceIpv4AclFeatureArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServiceIpv4AclFeature(string name, Input<string> id, ServiceIpv4AclFeatureState? state = null, CustomResourceOptions? options = null)
            : base("sdwan:index/serviceIpv4AclFeature:ServiceIpv4AclFeature", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServiceIpv4AclFeature resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServiceIpv4AclFeature Get(string name, Input<string> id, ServiceIpv4AclFeatureState? state = null, CustomResourceOptions? options = null)
        {
            return new ServiceIpv4AclFeature(name, id, state, options);
        }
    }

    public sealed class ServiceIpv4AclFeatureArgs : global::Pulumi.ResourceArgs
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
        private InputList<Inputs.ServiceIpv4AclFeatureSequenceArgs>? _sequences;

        /// <summary>
        /// Access Control List
        /// </summary>
        public InputList<Inputs.ServiceIpv4AclFeatureSequenceArgs> Sequences
        {
            get => _sequences ?? (_sequences = new InputList<Inputs.ServiceIpv4AclFeatureSequenceArgs>());
            set => _sequences = value;
        }

        public ServiceIpv4AclFeatureArgs()
        {
        }
        public static new ServiceIpv4AclFeatureArgs Empty => new ServiceIpv4AclFeatureArgs();
    }

    public sealed class ServiceIpv4AclFeatureState : global::Pulumi.ResourceArgs
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
        private InputList<Inputs.ServiceIpv4AclFeatureSequenceGetArgs>? _sequences;

        /// <summary>
        /// Access Control List
        /// </summary>
        public InputList<Inputs.ServiceIpv4AclFeatureSequenceGetArgs> Sequences
        {
            get => _sequences ?? (_sequences = new InputList<Inputs.ServiceIpv4AclFeatureSequenceGetArgs>());
            set => _sequences = value;
        }

        /// <summary>
        /// The version of the Feature
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public ServiceIpv4AclFeatureState()
        {
        }
        public static new ServiceIpv4AclFeatureState Empty => new ServiceIpv4AclFeatureState();
    }
}
