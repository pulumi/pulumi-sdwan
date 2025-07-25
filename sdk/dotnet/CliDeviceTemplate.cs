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
    /// This resource can manage a CLI Device Template .
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
    ///     var example = new Sdwan.CliDeviceTemplate("example", new()
    ///     {
    ///         Name = "Example",
    ///         Description = "My description",
    ///         DeviceType = "vedge-ISR-4331",
    ///         CliType = "device",
    ///         CliConfiguration = @" system
    ///  host-name             R1-ISR4331-1200-1",
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
    /// $ pulumi import sdwan:index/cliDeviceTemplate:CliDeviceTemplate example "f6b2c44c-693c-4763-b010-895aa3d236bd"
    /// ```
    /// </summary>
    [SdwanResourceType("sdwan:index/cliDeviceTemplate:CliDeviceTemplate")]
    public partial class CliDeviceTemplate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// CLI configuration
        /// </summary>
        [Output("cliConfiguration")]
        public Output<string> CliConfiguration { get; private set; } = null!;

        /// <summary>
        /// CLI type - Choices: `device`, `intend`
        /// </summary>
        [Output("cliType")]
        public Output<string> CliType { get; private set; } = null!;

        /// <summary>
        /// The description of the device template
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The device type (e.g., `vedge-ISR-4331`)
        /// </summary>
        [Output("deviceType")]
        public Output<string> DeviceType { get; private set; } = null!;

        /// <summary>
        /// The name of the device template
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The version of the object
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a CliDeviceTemplate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CliDeviceTemplate(string name, CliDeviceTemplateArgs args, CustomResourceOptions? options = null)
            : base("sdwan:index/cliDeviceTemplate:CliDeviceTemplate", name, args ?? new CliDeviceTemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CliDeviceTemplate(string name, Input<string> id, CliDeviceTemplateState? state = null, CustomResourceOptions? options = null)
            : base("sdwan:index/cliDeviceTemplate:CliDeviceTemplate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CliDeviceTemplate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CliDeviceTemplate Get(string name, Input<string> id, CliDeviceTemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new CliDeviceTemplate(name, id, state, options);
        }
    }

    public sealed class CliDeviceTemplateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CLI configuration
        /// </summary>
        [Input("cliConfiguration", required: true)]
        public Input<string> CliConfiguration { get; set; } = null!;

        /// <summary>
        /// CLI type - Choices: `device`, `intend`
        /// </summary>
        [Input("cliType", required: true)]
        public Input<string> CliType { get; set; } = null!;

        /// <summary>
        /// The description of the device template
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// The device type (e.g., `vedge-ISR-4331`)
        /// </summary>
        [Input("deviceType", required: true)]
        public Input<string> DeviceType { get; set; } = null!;

        /// <summary>
        /// The name of the device template
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public CliDeviceTemplateArgs()
        {
        }
        public static new CliDeviceTemplateArgs Empty => new CliDeviceTemplateArgs();
    }

    public sealed class CliDeviceTemplateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CLI configuration
        /// </summary>
        [Input("cliConfiguration")]
        public Input<string>? CliConfiguration { get; set; }

        /// <summary>
        /// CLI type - Choices: `device`, `intend`
        /// </summary>
        [Input("cliType")]
        public Input<string>? CliType { get; set; }

        /// <summary>
        /// The description of the device template
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The device type (e.g., `vedge-ISR-4331`)
        /// </summary>
        [Input("deviceType")]
        public Input<string>? DeviceType { get; set; }

        /// <summary>
        /// The name of the device template
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The version of the object
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public CliDeviceTemplateState()
        {
        }
        public static new CliDeviceTemplateState Empty => new CliDeviceTemplateState();
    }
}
