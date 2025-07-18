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
    /// This resource can manage a SLA Class Policy Object .
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
    ///     var example = new Sdwan.SlaClassPolicyObject("example", new()
    ///     {
    ///         Name = "Example",
    ///         Jitter = 100,
    ///         Latency = 10,
    ///         Loss = 1,
    ///         FallbackBestTunnelCriteria = "jitter-loss-latency",
    ///         FallbackBestTunnelJitter = 100,
    ///         FallbackBestTunnelLatency = 10,
    ///         FallbackBestTunnelLoss = 1,
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
    /// $ pulumi import sdwan:index/slaClassPolicyObject:SlaClassPolicyObject example "f6b2c44c-693c-4763-b010-895aa3d236bd"
    /// ```
    /// </summary>
    [SdwanResourceType("sdwan:index/slaClassPolicyObject:SlaClassPolicyObject")]
    public partial class SlaClassPolicyObject : global::Pulumi.CustomResource
    {
        /// <summary>
        /// App Probe Class Policy Object ID
        /// </summary>
        [Output("appProbeClassId")]
        public Output<string?> AppProbeClassId { get; private set; } = null!;

        /// <summary>
        /// App Probe Class Policy Object version
        /// </summary>
        [Output("appProbeClassVersion")]
        public Output<int?> AppProbeClassVersion { get; private set; } = null!;

        /// <summary>
        /// - Choices: `loss`, `latency`, `jitter`, `loss-latency`, `loss-jitter`, `latency-loss`, `latency-jitter`,
        /// `jitter-latency`, `jitter-loss`, `loss-latency-jitter`, `loss-jitter-latency`, `latency-loss-jitter`,
        /// `latency-jitter-loss`, `jitter-latency-loss`, `jitter-loss-latency`
        /// </summary>
        [Output("fallbackBestTunnelCriteria")]
        public Output<string?> FallbackBestTunnelCriteria { get; private set; } = null!;

        /// <summary>
        /// Jitter variance in ms - Range: `1`-`1000`
        /// </summary>
        [Output("fallbackBestTunnelJitter")]
        public Output<int?> FallbackBestTunnelJitter { get; private set; } = null!;

        /// <summary>
        /// Latency variance in ms - Range: `1`-`1000`
        /// </summary>
        [Output("fallbackBestTunnelLatency")]
        public Output<int?> FallbackBestTunnelLatency { get; private set; } = null!;

        /// <summary>
        /// Loss variance in percent - Range: `1`-`100`
        /// </summary>
        [Output("fallbackBestTunnelLoss")]
        public Output<int?> FallbackBestTunnelLoss { get; private set; } = null!;

        /// <summary>
        /// Jitter in ms - Range: `1`-`1000`
        /// </summary>
        [Output("jitter")]
        public Output<int?> Jitter { get; private set; } = null!;

        /// <summary>
        /// Latency in ms - Range: `1`-`1000`
        /// </summary>
        [Output("latency")]
        public Output<int?> Latency { get; private set; } = null!;

        /// <summary>
        /// Loss in percent - Range: `1`-`100`
        /// </summary>
        [Output("loss")]
        public Output<int?> Loss { get; private set; } = null!;

        /// <summary>
        /// The name of the policy object
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The version of the object
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a SlaClassPolicyObject resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SlaClassPolicyObject(string name, SlaClassPolicyObjectArgs? args = null, CustomResourceOptions? options = null)
            : base("sdwan:index/slaClassPolicyObject:SlaClassPolicyObject", name, args ?? new SlaClassPolicyObjectArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SlaClassPolicyObject(string name, Input<string> id, SlaClassPolicyObjectState? state = null, CustomResourceOptions? options = null)
            : base("sdwan:index/slaClassPolicyObject:SlaClassPolicyObject", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SlaClassPolicyObject resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SlaClassPolicyObject Get(string name, Input<string> id, SlaClassPolicyObjectState? state = null, CustomResourceOptions? options = null)
        {
            return new SlaClassPolicyObject(name, id, state, options);
        }
    }

    public sealed class SlaClassPolicyObjectArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// App Probe Class Policy Object ID
        /// </summary>
        [Input("appProbeClassId")]
        public Input<string>? AppProbeClassId { get; set; }

        /// <summary>
        /// App Probe Class Policy Object version
        /// </summary>
        [Input("appProbeClassVersion")]
        public Input<int>? AppProbeClassVersion { get; set; }

        /// <summary>
        /// - Choices: `loss`, `latency`, `jitter`, `loss-latency`, `loss-jitter`, `latency-loss`, `latency-jitter`,
        /// `jitter-latency`, `jitter-loss`, `loss-latency-jitter`, `loss-jitter-latency`, `latency-loss-jitter`,
        /// `latency-jitter-loss`, `jitter-latency-loss`, `jitter-loss-latency`
        /// </summary>
        [Input("fallbackBestTunnelCriteria")]
        public Input<string>? FallbackBestTunnelCriteria { get; set; }

        /// <summary>
        /// Jitter variance in ms - Range: `1`-`1000`
        /// </summary>
        [Input("fallbackBestTunnelJitter")]
        public Input<int>? FallbackBestTunnelJitter { get; set; }

        /// <summary>
        /// Latency variance in ms - Range: `1`-`1000`
        /// </summary>
        [Input("fallbackBestTunnelLatency")]
        public Input<int>? FallbackBestTunnelLatency { get; set; }

        /// <summary>
        /// Loss variance in percent - Range: `1`-`100`
        /// </summary>
        [Input("fallbackBestTunnelLoss")]
        public Input<int>? FallbackBestTunnelLoss { get; set; }

        /// <summary>
        /// Jitter in ms - Range: `1`-`1000`
        /// </summary>
        [Input("jitter")]
        public Input<int>? Jitter { get; set; }

        /// <summary>
        /// Latency in ms - Range: `1`-`1000`
        /// </summary>
        [Input("latency")]
        public Input<int>? Latency { get; set; }

        /// <summary>
        /// Loss in percent - Range: `1`-`100`
        /// </summary>
        [Input("loss")]
        public Input<int>? Loss { get; set; }

        /// <summary>
        /// The name of the policy object
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public SlaClassPolicyObjectArgs()
        {
        }
        public static new SlaClassPolicyObjectArgs Empty => new SlaClassPolicyObjectArgs();
    }

    public sealed class SlaClassPolicyObjectState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// App Probe Class Policy Object ID
        /// </summary>
        [Input("appProbeClassId")]
        public Input<string>? AppProbeClassId { get; set; }

        /// <summary>
        /// App Probe Class Policy Object version
        /// </summary>
        [Input("appProbeClassVersion")]
        public Input<int>? AppProbeClassVersion { get; set; }

        /// <summary>
        /// - Choices: `loss`, `latency`, `jitter`, `loss-latency`, `loss-jitter`, `latency-loss`, `latency-jitter`,
        /// `jitter-latency`, `jitter-loss`, `loss-latency-jitter`, `loss-jitter-latency`, `latency-loss-jitter`,
        /// `latency-jitter-loss`, `jitter-latency-loss`, `jitter-loss-latency`
        /// </summary>
        [Input("fallbackBestTunnelCriteria")]
        public Input<string>? FallbackBestTunnelCriteria { get; set; }

        /// <summary>
        /// Jitter variance in ms - Range: `1`-`1000`
        /// </summary>
        [Input("fallbackBestTunnelJitter")]
        public Input<int>? FallbackBestTunnelJitter { get; set; }

        /// <summary>
        /// Latency variance in ms - Range: `1`-`1000`
        /// </summary>
        [Input("fallbackBestTunnelLatency")]
        public Input<int>? FallbackBestTunnelLatency { get; set; }

        /// <summary>
        /// Loss variance in percent - Range: `1`-`100`
        /// </summary>
        [Input("fallbackBestTunnelLoss")]
        public Input<int>? FallbackBestTunnelLoss { get; set; }

        /// <summary>
        /// Jitter in ms - Range: `1`-`1000`
        /// </summary>
        [Input("jitter")]
        public Input<int>? Jitter { get; set; }

        /// <summary>
        /// Latency in ms - Range: `1`-`1000`
        /// </summary>
        [Input("latency")]
        public Input<int>? Latency { get; set; }

        /// <summary>
        /// Loss in percent - Range: `1`-`100`
        /// </summary>
        [Input("loss")]
        public Input<int>? Loss { get; set; }

        /// <summary>
        /// The name of the policy object
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The version of the object
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public SlaClassPolicyObjectState()
        {
        }
        public static new SlaClassPolicyObjectState Empty => new SlaClassPolicyObjectState();
    }
}
