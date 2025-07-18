// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Outputs
{

    [OutputType]
    public sealed class PolicyObjectPreferredColorGroupEntry
    {
        public readonly ImmutableArray<string> PrimaryColorPreferences;
        /// <summary>
        /// - Choices: `all-paths`, `direct-path`, `multi-hop-path`
        /// </summary>
        public readonly string? PrimaryPathPreference;
        public readonly ImmutableArray<string> SecondaryColorPreferences;
        /// <summary>
        /// - Choices: `all-paths`, `direct-path`, `multi-hop-path`
        /// </summary>
        public readonly string? SecondaryPathPreference;
        public readonly ImmutableArray<string> TertiaryColorPreferences;
        /// <summary>
        /// - Choices: `all-paths`, `direct-path`, `multi-hop-path`
        /// </summary>
        public readonly string? TertiaryPathPreference;

        [OutputConstructor]
        private PolicyObjectPreferredColorGroupEntry(
            ImmutableArray<string> primaryColorPreferences,

            string? primaryPathPreference,

            ImmutableArray<string> secondaryColorPreferences,

            string? secondaryPathPreference,

            ImmutableArray<string> tertiaryColorPreferences,

            string? tertiaryPathPreference)
        {
            PrimaryColorPreferences = primaryColorPreferences;
            PrimaryPathPreference = primaryPathPreference;
            SecondaryColorPreferences = secondaryColorPreferences;
            SecondaryPathPreference = secondaryPathPreference;
            TertiaryColorPreferences = tertiaryColorPreferences;
            TertiaryPathPreference = tertiaryPathPreference;
        }
    }
}
