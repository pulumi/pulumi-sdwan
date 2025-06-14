// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class FeatureDeviceTemplateGeneralTemplateSubTemplateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Feature template ID
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        [Input("subTemplates")]
        private InputList<Inputs.FeatureDeviceTemplateGeneralTemplateSubTemplateSubTemplateArgs>? _subTemplates;

        /// <summary>
        /// List of sub templates
        /// </summary>
        public InputList<Inputs.FeatureDeviceTemplateGeneralTemplateSubTemplateSubTemplateArgs> SubTemplates
        {
            get => _subTemplates ?? (_subTemplates = new InputList<Inputs.FeatureDeviceTemplateGeneralTemplateSubTemplateSubTemplateArgs>());
            set => _subTemplates = value;
        }

        /// <summary>
        /// Feature template type
        ///   - Choices: `cisco_logging`, `cisco_ntp`, `cisco_ospf`, `cisco_bgp`, `cisco_vpn_interface`, `cisco_vpn_interface_gre`, `cisco_vpn_interface_ipsec`, `vpn-interface-svi`, `vpn-cedge-interface-cellular`, `cisco_secure_internet_gateway`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Feature template version
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public FeatureDeviceTemplateGeneralTemplateSubTemplateArgs()
        {
        }
        public static new FeatureDeviceTemplateGeneralTemplateSubTemplateArgs Empty => new FeatureDeviceTemplateGeneralTemplateSubTemplateArgs();
    }
}
