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
    public sealed class EigrpFeatureTemplateInterfaceSummaryAddress
    {
        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        public readonly bool? Optional;
        /// <summary>
        /// Set summary address prefix
        /// </summary>
        public readonly string? Prefix;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? PrefixVariable;

        [OutputConstructor]
        private EigrpFeatureTemplateInterfaceSummaryAddress(
            bool? optional,

            string? prefix,

            string? prefixVariable)
        {
            Optional = optional;
            Prefix = prefix;
            PrefixVariable = prefixVariable;
        }
    }
}
