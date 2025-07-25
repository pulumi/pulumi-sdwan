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
    /// This resource can manage a Policy Object IPv4 Prefix List Policy_object.
    ///   - Minimum SD-WAN Manager version: `20.12.0`
    /// 
    /// ## Import
    /// 
    /// The `pulumi import` command can be used, for example:
    /// 
    /// Expected import identifier with the format: "policy_object_ipv4_prefix_list_id,feature_profile_id"
    /// 
    /// ```sh
    /// $ pulumi import sdwan:index/policyObjectIpv4PrefixList:PolicyObjectIpv4PrefixList example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"
    /// ```
    /// </summary>
    [SdwanResourceType("sdwan:index/policyObjectIpv4PrefixList:PolicyObjectIpv4PrefixList")]
    public partial class PolicyObjectIpv4PrefixList : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the Policy_object
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// IPv4 Prefix List
        /// </summary>
        [Output("entries")]
        public Output<ImmutableArray<Outputs.PolicyObjectIpv4PrefixListEntry>> Entries { get; private set; } = null!;

        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Output("featureProfileId")]
        public Output<string> FeatureProfileId { get; private set; } = null!;

        /// <summary>
        /// The name of the Policy_object
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The version of the Policy_object
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a PolicyObjectIpv4PrefixList resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PolicyObjectIpv4PrefixList(string name, PolicyObjectIpv4PrefixListArgs args, CustomResourceOptions? options = null)
            : base("sdwan:index/policyObjectIpv4PrefixList:PolicyObjectIpv4PrefixList", name, args ?? new PolicyObjectIpv4PrefixListArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PolicyObjectIpv4PrefixList(string name, Input<string> id, PolicyObjectIpv4PrefixListState? state = null, CustomResourceOptions? options = null)
            : base("sdwan:index/policyObjectIpv4PrefixList:PolicyObjectIpv4PrefixList", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PolicyObjectIpv4PrefixList resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PolicyObjectIpv4PrefixList Get(string name, Input<string> id, PolicyObjectIpv4PrefixListState? state = null, CustomResourceOptions? options = null)
        {
            return new PolicyObjectIpv4PrefixList(name, id, state, options);
        }
    }

    public sealed class PolicyObjectIpv4PrefixListArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the Policy_object
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("entries", required: true)]
        private InputList<Inputs.PolicyObjectIpv4PrefixListEntryArgs>? _entries;

        /// <summary>
        /// IPv4 Prefix List
        /// </summary>
        public InputList<Inputs.PolicyObjectIpv4PrefixListEntryArgs> Entries
        {
            get => _entries ?? (_entries = new InputList<Inputs.PolicyObjectIpv4PrefixListEntryArgs>());
            set => _entries = value;
        }

        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId", required: true)]
        public Input<string> FeatureProfileId { get; set; } = null!;

        /// <summary>
        /// The name of the Policy_object
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public PolicyObjectIpv4PrefixListArgs()
        {
        }
        public static new PolicyObjectIpv4PrefixListArgs Empty => new PolicyObjectIpv4PrefixListArgs();
    }

    public sealed class PolicyObjectIpv4PrefixListState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the Policy_object
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("entries")]
        private InputList<Inputs.PolicyObjectIpv4PrefixListEntryGetArgs>? _entries;

        /// <summary>
        /// IPv4 Prefix List
        /// </summary>
        public InputList<Inputs.PolicyObjectIpv4PrefixListEntryGetArgs> Entries
        {
            get => _entries ?? (_entries = new InputList<Inputs.PolicyObjectIpv4PrefixListEntryGetArgs>());
            set => _entries = value;
        }

        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId")]
        public Input<string>? FeatureProfileId { get; set; }

        /// <summary>
        /// The name of the Policy_object
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The version of the Policy_object
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public PolicyObjectIpv4PrefixListState()
        {
        }
        public static new PolicyObjectIpv4PrefixListState Empty => new PolicyObjectIpv4PrefixListState();
    }
}
