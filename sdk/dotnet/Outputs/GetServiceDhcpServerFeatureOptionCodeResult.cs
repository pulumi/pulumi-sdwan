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
    public sealed class GetServiceDhcpServerFeatureOptionCodeResult
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
        /// Set Option Code
        /// </summary>
        public readonly int Code;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string CodeVariable;
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
        public readonly string IpVariable;
        /// <summary>
        /// Set ip address
        /// </summary>
        public readonly ImmutableArray<string> Ips;

        [OutputConstructor]
        private GetServiceDhcpServerFeatureOptionCodeResult(
            string ascii,

            string asciiVariable,

            int code,

            string codeVariable,

            string hex,

            string hexVariable,

            string ipVariable,

            ImmutableArray<string> ips)
        {
            Ascii = ascii;
            AsciiVariable = asciiVariable;
            Code = code;
            CodeVariable = codeVariable;
            Hex = hex;
            HexVariable = hexVariable;
            IpVariable = ipVariable;
            Ips = ips;
        }
    }
}
