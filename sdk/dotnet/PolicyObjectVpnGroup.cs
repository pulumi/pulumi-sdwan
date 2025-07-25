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
    /// This resource can manage a Policy Object VPN Group Policy_object.
    ///   - Minimum SD-WAN Manager version: `20.12.0`
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
    ///     var example = new Sdwan.PolicyObjectVpnGroup("example", new()
    ///     {
    ///         Name = "Example",
    ///         Description = "My Example",
    ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
    ///         Entries = new[]
    ///         {
    ///             new Sdwan.Inputs.PolicyObjectVpnGroupEntryArgs
    ///             {
    ///                 Vpn = 100,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// The `pulumi import` command can be used, for example:
    /// 
    /// Expected import identifier with the format: "policy_object_vpn_group_id,feature_profile_id"
    /// 
    /// ```sh
    /// $ pulumi import sdwan:index/policyObjectVpnGroup:PolicyObjectVpnGroup example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"
    /// ```
    /// </summary>
    [SdwanResourceType("sdwan:index/policyObjectVpnGroup:PolicyObjectVpnGroup")]
    public partial class PolicyObjectVpnGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the Policy_object
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// VPN List
        /// </summary>
        [Output("entries")]
        public Output<ImmutableArray<Outputs.PolicyObjectVpnGroupEntry>> Entries { get; private set; } = null!;

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
        /// Create a PolicyObjectVpnGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PolicyObjectVpnGroup(string name, PolicyObjectVpnGroupArgs args, CustomResourceOptions? options = null)
            : base("sdwan:index/policyObjectVpnGroup:PolicyObjectVpnGroup", name, args ?? new PolicyObjectVpnGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PolicyObjectVpnGroup(string name, Input<string> id, PolicyObjectVpnGroupState? state = null, CustomResourceOptions? options = null)
            : base("sdwan:index/policyObjectVpnGroup:PolicyObjectVpnGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PolicyObjectVpnGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PolicyObjectVpnGroup Get(string name, Input<string> id, PolicyObjectVpnGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new PolicyObjectVpnGroup(name, id, state, options);
        }
    }

    public sealed class PolicyObjectVpnGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the Policy_object
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("entries", required: true)]
        private InputList<Inputs.PolicyObjectVpnGroupEntryArgs>? _entries;

        /// <summary>
        /// VPN List
        /// </summary>
        public InputList<Inputs.PolicyObjectVpnGroupEntryArgs> Entries
        {
            get => _entries ?? (_entries = new InputList<Inputs.PolicyObjectVpnGroupEntryArgs>());
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

        public PolicyObjectVpnGroupArgs()
        {
        }
        public static new PolicyObjectVpnGroupArgs Empty => new PolicyObjectVpnGroupArgs();
    }

    public sealed class PolicyObjectVpnGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the Policy_object
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("entries")]
        private InputList<Inputs.PolicyObjectVpnGroupEntryGetArgs>? _entries;

        /// <summary>
        /// VPN List
        /// </summary>
        public InputList<Inputs.PolicyObjectVpnGroupEntryGetArgs> Entries
        {
            get => _entries ?? (_entries = new InputList<Inputs.PolicyObjectVpnGroupEntryGetArgs>());
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

        public PolicyObjectVpnGroupState()
        {
        }
        public static new PolicyObjectVpnGroupState Empty => new PolicyObjectVpnGroupState();
    }
}
