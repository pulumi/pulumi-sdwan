// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    /// <summary>
    /// This resource can manage a Other ThousandEyes Feature.
    ///   - Minimum SD-WAN Manager version: `20.12.0`
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import sdwan:index/otherThousandeyesFeature:OtherThousandeyesFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd"
    /// ```
    /// </summary>
    [SdwanResourceType("sdwan:index/otherThousandeyesFeature:OtherThousandeyesFeature")]
    public partial class OtherThousandeyesFeature : global::Pulumi.CustomResource
    {
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
        /// The version of the Feature
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;

        /// <summary>
        /// Virtual application Instance
        /// </summary>
        [Output("virtualApplications")]
        public Output<ImmutableArray<Outputs.OtherThousandeyesFeatureVirtualApplication>> VirtualApplications { get; private set; } = null!;


        /// <summary>
        /// Create a OtherThousandeyesFeature resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OtherThousandeyesFeature(string name, OtherThousandeyesFeatureArgs args, CustomResourceOptions? options = null)
            : base("sdwan:index/otherThousandeyesFeature:OtherThousandeyesFeature", name, args ?? new OtherThousandeyesFeatureArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OtherThousandeyesFeature(string name, Input<string> id, OtherThousandeyesFeatureState? state = null, CustomResourceOptions? options = null)
            : base("sdwan:index/otherThousandeyesFeature:OtherThousandeyesFeature", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OtherThousandeyesFeature resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OtherThousandeyesFeature Get(string name, Input<string> id, OtherThousandeyesFeatureState? state = null, CustomResourceOptions? options = null)
        {
            return new OtherThousandeyesFeature(name, id, state, options);
        }
    }

    public sealed class OtherThousandeyesFeatureArgs : global::Pulumi.ResourceArgs
    {
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

        [Input("virtualApplications")]
        private InputList<Inputs.OtherThousandeyesFeatureVirtualApplicationArgs>? _virtualApplications;

        /// <summary>
        /// Virtual application Instance
        /// </summary>
        public InputList<Inputs.OtherThousandeyesFeatureVirtualApplicationArgs> VirtualApplications
        {
            get => _virtualApplications ?? (_virtualApplications = new InputList<Inputs.OtherThousandeyesFeatureVirtualApplicationArgs>());
            set => _virtualApplications = value;
        }

        public OtherThousandeyesFeatureArgs()
        {
        }
        public static new OtherThousandeyesFeatureArgs Empty => new OtherThousandeyesFeatureArgs();
    }

    public sealed class OtherThousandeyesFeatureState : global::Pulumi.ResourceArgs
    {
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

        /// <summary>
        /// The version of the Feature
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        [Input("virtualApplications")]
        private InputList<Inputs.OtherThousandeyesFeatureVirtualApplicationGetArgs>? _virtualApplications;

        /// <summary>
        /// Virtual application Instance
        /// </summary>
        public InputList<Inputs.OtherThousandeyesFeatureVirtualApplicationGetArgs> VirtualApplications
        {
            get => _virtualApplications ?? (_virtualApplications = new InputList<Inputs.OtherThousandeyesFeatureVirtualApplicationGetArgs>());
            set => _virtualApplications = value;
        }

        public OtherThousandeyesFeatureState()
        {
        }
        public static new OtherThousandeyesFeatureState Empty => new OtherThousandeyesFeatureState();
    }
}