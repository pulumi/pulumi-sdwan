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
    public sealed class IpsSignatureListPolicyObjectEntry
    {
        /// <summary>
        /// Signature generator ID
        ///   - Range: `0`-`4294967295`
        /// </summary>
        public readonly int? GeneratorId;
        /// <summary>
        /// Signature ID
        ///   - Range: `0`-`4294967295`
        /// </summary>
        public readonly int? SignatureId;

        [OutputConstructor]
        private IpsSignatureListPolicyObjectEntry(
            int? generatorId,

            int? signatureId)
        {
            GeneratorId = generatorId;
            SignatureId = signatureId;
        }
    }
}
