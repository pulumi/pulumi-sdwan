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
    public sealed class GetCiscoDhcpServerFeatureTemplateOptionResult
    {
        /// <summary>
        /// Set ASCII value
        /// </summary>
        public readonly string Ascii;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string AsciiVariable;
        /// <summary>
        /// Set HEX value
        /// </summary>
        public readonly string Hex;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string HexVariable;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string IpAddressVariable;
        /// <summary>
        /// Set ip address
        /// </summary>
        public readonly ImmutableArray<string> IpAddresses;
        /// <summary>
        /// Set Option Code
        /// </summary>
        public readonly int OptionCode;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string OptionCodeVariable;
        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        public readonly bool Optional;

        [OutputConstructor]
        private GetCiscoDhcpServerFeatureTemplateOptionResult(
            string ascii,

            string asciiVariable,

            string hex,

            string hexVariable,

            string ipAddressVariable,

            ImmutableArray<string> ipAddresses,

            int optionCode,

            string optionCodeVariable,

            bool optional)
        {
            Ascii = ascii;
            AsciiVariable = asciiVariable;
            Hex = hex;
            HexVariable = hexVariable;
            IpAddressVariable = ipAddressVariable;
            IpAddresses = ipAddresses;
            OptionCode = optionCode;
            OptionCodeVariable = optionCodeVariable;
            Optional = optional;
        }
    }
}
