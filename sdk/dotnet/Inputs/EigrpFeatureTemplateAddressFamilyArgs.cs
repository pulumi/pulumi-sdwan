// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class EigrpFeatureTemplateAddressFamilyArgs : global::Pulumi.ResourceArgs
    {
        [Input("networks")]
        private InputList<Inputs.EigrpFeatureTemplateAddressFamilyNetworkArgs>? _networks;

        /// <summary>
        /// Configure the networks for EIGRP to advertise
        /// </summary>
        public InputList<Inputs.EigrpFeatureTemplateAddressFamilyNetworkArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.EigrpFeatureTemplateAddressFamilyNetworkArgs>());
            set => _networks = value;
        }

        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        [Input("optional")]
        public Input<bool>? Optional { get; set; }

        [Input("redistributes")]
        private InputList<Inputs.EigrpFeatureTemplateAddressFamilyRedistributeArgs>? _redistributes;

        /// <summary>
        /// Redistribute routes into EIGRP
        /// </summary>
        public InputList<Inputs.EigrpFeatureTemplateAddressFamilyRedistributeArgs> Redistributes
        {
            get => _redistributes ?? (_redistributes = new InputList<Inputs.EigrpFeatureTemplateAddressFamilyRedistributeArgs>());
            set => _redistributes = value;
        }

        /// <summary>
        /// Set EIGRP address family
        ///   - Choices: `ipv4`
        ///   - Default value: `ipv4`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public EigrpFeatureTemplateAddressFamilyArgs()
        {
        }
        public static new EigrpFeatureTemplateAddressFamilyArgs Empty => new EigrpFeatureTemplateAddressFamilyArgs();
    }
}
