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
    /// This resource can manage a Transport Feature Profile .
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
    ///     var example = new Sdwan.TransportFeatureProfile("example", new()
    ///     {
    ///         Name = "TRANSPORT_FP_1",
    ///         Description = "My transport feature profile 1",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// The `pulumi import` command can be used, for example:
    /// 
    /// ```sh
    /// $ pulumi import sdwan:index/transportFeatureProfile:TransportFeatureProfile example "f6b2c44c-693c-4763-b010-895aa3d236bd"
    /// ```
    /// </summary>
    [SdwanResourceType("sdwan:index/transportFeatureProfile:TransportFeatureProfile")]
    public partial class TransportFeatureProfile : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Description
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the transport feature profile
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a TransportFeatureProfile resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TransportFeatureProfile(string name, TransportFeatureProfileArgs args, CustomResourceOptions? options = null)
            : base("sdwan:index/transportFeatureProfile:TransportFeatureProfile", name, args ?? new TransportFeatureProfileArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TransportFeatureProfile(string name, Input<string> id, TransportFeatureProfileState? state = null, CustomResourceOptions? options = null)
            : base("sdwan:index/transportFeatureProfile:TransportFeatureProfile", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TransportFeatureProfile resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TransportFeatureProfile Get(string name, Input<string> id, TransportFeatureProfileState? state = null, CustomResourceOptions? options = null)
        {
            return new TransportFeatureProfile(name, id, state, options);
        }
    }

    public sealed class TransportFeatureProfileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// The name of the transport feature profile
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public TransportFeatureProfileArgs()
        {
        }
        public static new TransportFeatureProfileArgs Empty => new TransportFeatureProfileArgs();
    }

    public sealed class TransportFeatureProfileState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the transport feature profile
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public TransportFeatureProfileState()
        {
        }
        public static new TransportFeatureProfileState Empty => new TransportFeatureProfileState();
    }
}
