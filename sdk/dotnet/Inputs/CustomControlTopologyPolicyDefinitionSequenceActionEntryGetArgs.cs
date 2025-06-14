// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class CustomControlTopologyPolicyDefinitionSequenceActionEntryGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Export to VPN list ID, Attribute conditional on `type` being equal to `exportTo`
        /// </summary>
        [Input("exportToVpnListId")]
        public Input<string>? ExportToVpnListId { get; set; }

        /// <summary>
        /// Export to VPN list version
        /// </summary>
        [Input("exportToVpnListVersion")]
        public Input<int>? ExportToVpnListVersion { get; set; }

        [Input("setParameters")]
        private InputList<Inputs.CustomControlTopologyPolicyDefinitionSequenceActionEntrySetParameterGetArgs>? _setParameters;

        /// <summary>
        /// List of set parameters, Attribute conditional on `type` being equal to `set`
        /// </summary>
        public InputList<Inputs.CustomControlTopologyPolicyDefinitionSequenceActionEntrySetParameterGetArgs> SetParameters
        {
            get => _setParameters ?? (_setParameters = new InputList<Inputs.CustomControlTopologyPolicyDefinitionSequenceActionEntrySetParameterGetArgs>());
            set => _setParameters = value;
        }

        /// <summary>
        /// Type of action entry
        ///   - Choices: `set`, `exportTo`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public CustomControlTopologyPolicyDefinitionSequenceActionEntryGetArgs()
        {
        }
        public static new CustomControlTopologyPolicyDefinitionSequenceActionEntryGetArgs Empty => new CustomControlTopologyPolicyDefinitionSequenceActionEntryGetArgs();
    }
}
