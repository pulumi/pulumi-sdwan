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
    public sealed class GetRewriteRulePolicyDefinitionRuleResult
    {
        /// <summary>
        /// Class map ID
        /// </summary>
        public readonly string ClassMapId;
        /// <summary>
        /// Class map version
        /// </summary>
        public readonly int ClassMapVersion;
        /// <summary>
        /// DSCP
        /// </summary>
        public readonly int Dscp;
        /// <summary>
        /// Layer2 CoS
        /// </summary>
        public readonly int Layer2Cos;
        /// <summary>
        /// Priority
        /// </summary>
        public readonly string Priority;

        [OutputConstructor]
        private GetRewriteRulePolicyDefinitionRuleResult(
            string classMapId,

            int classMapVersion,

            int dscp,

            int layer2Cos,

            string priority)
        {
            ClassMapId = classMapId;
            ClassMapVersion = classMapVersion;
            Dscp = dscp;
            Layer2Cos = layer2Cos;
            Priority = priority;
        }
    }
}
