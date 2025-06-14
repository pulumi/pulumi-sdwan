// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class CustomControlTopologyPolicyDefinitionSequenceArgs : global::Pulumi.ResourceArgs
    {
        [Input("actionEntries")]
        private InputList<Inputs.CustomControlTopologyPolicyDefinitionSequenceActionEntryArgs>? _actionEntries;

        /// <summary>
        /// List of action entries
        /// </summary>
        public InputList<Inputs.CustomControlTopologyPolicyDefinitionSequenceActionEntryArgs> ActionEntries
        {
            get => _actionEntries ?? (_actionEntries = new InputList<Inputs.CustomControlTopologyPolicyDefinitionSequenceActionEntryArgs>());
            set => _actionEntries = value;
        }

        /// <summary>
        /// Base action, either `accept` or `reject`
        ///   - Choices: `accept`, `reject`
        /// </summary>
        [Input("baseAction")]
        public Input<string>? BaseAction { get; set; }

        /// <summary>
        /// Sequence ID
        /// </summary>
        [Input("id", required: true)]
        public Input<int> Id { get; set; } = null!;

        /// <summary>
        /// Sequence IP type, either `ipv4`, `ipv6` or `all`
        ///   - Choices: `ipv4`, `ipv6`, `all`
        /// </summary>
        [Input("ipType")]
        public Input<string>? IpType { get; set; }

        [Input("matchEntries")]
        private InputList<Inputs.CustomControlTopologyPolicyDefinitionSequenceMatchEntryArgs>? _matchEntries;

        /// <summary>
        /// List of match entries
        /// </summary>
        public InputList<Inputs.CustomControlTopologyPolicyDefinitionSequenceMatchEntryArgs> MatchEntries
        {
            get => _matchEntries ?? (_matchEntries = new InputList<Inputs.CustomControlTopologyPolicyDefinitionSequenceMatchEntryArgs>());
            set => _matchEntries = value;
        }

        /// <summary>
        /// Sequence name
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Sequence type, either `route` or `tloc`
        ///   - Choices: `route`, `tloc`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public CustomControlTopologyPolicyDefinitionSequenceArgs()
        {
        }
        public static new CustomControlTopologyPolicyDefinitionSequenceArgs Empty => new CustomControlTopologyPolicyDefinitionSequenceArgs();
    }
}
