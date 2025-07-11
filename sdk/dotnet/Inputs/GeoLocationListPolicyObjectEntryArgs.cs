// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class GeoLocationListPolicyObjectEntryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Continent
        ///   - Choices: `AF`, `AN`, `AS`, `EU`, `NA`, `OC`, `SA`
        /// </summary>
        [Input("continent")]
        public Input<string>? Continent { get; set; }

        /// <summary>
        /// Country
        /// </summary>
        [Input("country")]
        public Input<string>? Country { get; set; }

        public GeoLocationListPolicyObjectEntryArgs()
        {
        }
        public static new GeoLocationListPolicyObjectEntryArgs Empty => new GeoLocationListPolicyObjectEntryArgs();
    }
}
