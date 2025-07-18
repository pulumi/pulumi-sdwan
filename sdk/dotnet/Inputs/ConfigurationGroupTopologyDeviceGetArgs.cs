// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ConfigurationGroupTopologyDeviceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Criteria attribute
        ///   - Choices: `tag`
        /// </summary>
        [Input("criteriaAttribute", required: true)]
        public Input<string> CriteriaAttribute { get; set; } = null!;

        /// <summary>
        /// Criteria value
        /// </summary>
        [Input("criteriaValue")]
        public Input<string>? CriteriaValue { get; set; }

        [Input("unsupportedFeatures")]
        private InputList<Inputs.ConfigurationGroupTopologyDeviceUnsupportedFeatureGetArgs>? _unsupportedFeatures;

        /// <summary>
        /// List of unsupported features
        /// </summary>
        public InputList<Inputs.ConfigurationGroupTopologyDeviceUnsupportedFeatureGetArgs> UnsupportedFeatures
        {
            get => _unsupportedFeatures ?? (_unsupportedFeatures = new InputList<Inputs.ConfigurationGroupTopologyDeviceUnsupportedFeatureGetArgs>());
            set => _unsupportedFeatures = value;
        }

        public ConfigurationGroupTopologyDeviceGetArgs()
        {
        }
        public static new ConfigurationGroupTopologyDeviceGetArgs Empty => new ConfigurationGroupTopologyDeviceGetArgs();
    }
}
