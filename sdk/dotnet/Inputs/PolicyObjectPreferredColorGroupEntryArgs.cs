// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class PolicyObjectPreferredColorGroupEntryArgs : global::Pulumi.ResourceArgs
    {
        [Input("primaryColorPreferences")]
        private InputList<string>? _primaryColorPreferences;
        public InputList<string> PrimaryColorPreferences
        {
            get => _primaryColorPreferences ?? (_primaryColorPreferences = new InputList<string>());
            set => _primaryColorPreferences = value;
        }

        /// <summary>
        /// - Choices: `all-paths`, `direct-path`, `multi-hop-path`
        /// </summary>
        [Input("primaryPathPreference")]
        public Input<string>? PrimaryPathPreference { get; set; }

        [Input("secondaryColorPreferences")]
        private InputList<string>? _secondaryColorPreferences;
        public InputList<string> SecondaryColorPreferences
        {
            get => _secondaryColorPreferences ?? (_secondaryColorPreferences = new InputList<string>());
            set => _secondaryColorPreferences = value;
        }

        /// <summary>
        /// - Choices: `all-paths`, `direct-path`, `multi-hop-path`
        /// </summary>
        [Input("secondaryPathPreference")]
        public Input<string>? SecondaryPathPreference { get; set; }

        [Input("tertiaryColorPreferences")]
        private InputList<string>? _tertiaryColorPreferences;
        public InputList<string> TertiaryColorPreferences
        {
            get => _tertiaryColorPreferences ?? (_tertiaryColorPreferences = new InputList<string>());
            set => _tertiaryColorPreferences = value;
        }

        /// <summary>
        /// - Choices: `all-paths`, `direct-path`, `multi-hop-path`
        /// </summary>
        [Input("tertiaryPathPreference")]
        public Input<string>? TertiaryPathPreference { get; set; }

        public PolicyObjectPreferredColorGroupEntryArgs()
        {
        }
        public static new PolicyObjectPreferredColorGroupEntryArgs Empty => new PolicyObjectPreferredColorGroupEntryArgs();
    }
}
