// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ServiceRoutePolicyFeatureSequenceGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("actions")]
        private InputList<Inputs.ServiceRoutePolicyFeatureSequenceActionGetArgs>? _actions;

        /// <summary>
        /// Define list of actions
        /// </summary>
        public InputList<Inputs.ServiceRoutePolicyFeatureSequenceActionGetArgs> Actions
        {
            get => _actions ?? (_actions = new InputList<Inputs.ServiceRoutePolicyFeatureSequenceActionGetArgs>());
            set => _actions = value;
        }

        /// <summary>
        /// Base Action
        ///   - Choices: `reject`, `accept`
        ///   - Default value: `reject`
        /// </summary>
        [Input("baseAction")]
        public Input<string>? BaseAction { get; set; }

        /// <summary>
        /// Sequence Id
        ///   - Range: `1`-`65536`
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        [Input("matchEntries")]
        private InputList<Inputs.ServiceRoutePolicyFeatureSequenceMatchEntryGetArgs>? _matchEntries;

        /// <summary>
        /// Define match conditions
        /// </summary>
        public InputList<Inputs.ServiceRoutePolicyFeatureSequenceMatchEntryGetArgs> MatchEntries
        {
            get => _matchEntries ?? (_matchEntries = new InputList<Inputs.ServiceRoutePolicyFeatureSequenceMatchEntryGetArgs>());
            set => _matchEntries = value;
        }

        /// <summary>
        /// Sequence Name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// protocol such as IPV4, IPV6, or BOTH
        ///   - Choices: `IPV4`, `IPV6`, `BOTH`
        ///   - Default value: `IPV4`
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        public ServiceRoutePolicyFeatureSequenceGetArgs()
        {
        }
        public static new ServiceRoutePolicyFeatureSequenceGetArgs Empty => new ServiceRoutePolicyFeatureSequenceGetArgs();
    }
}
