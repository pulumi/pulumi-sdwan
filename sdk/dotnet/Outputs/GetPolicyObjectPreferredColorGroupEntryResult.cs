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
    public sealed class GetPolicyObjectPreferredColorGroupEntryResult
    {
        public readonly ImmutableArray<string> PrimaryColorPreferences;
        public readonly string PrimaryPathPreference;
        public readonly ImmutableArray<string> SecondaryColorPreferences;
        public readonly string SecondaryPathPreference;
        public readonly ImmutableArray<string> TertiaryColorPreferences;
        public readonly string TertiaryPathPreference;

        [OutputConstructor]
        private GetPolicyObjectPreferredColorGroupEntryResult(
            ImmutableArray<string> primaryColorPreferences,

            string primaryPathPreference,

            ImmutableArray<string> secondaryColorPreferences,

            string secondaryPathPreference,

            ImmutableArray<string> tertiaryColorPreferences,

            string tertiaryPathPreference)
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
