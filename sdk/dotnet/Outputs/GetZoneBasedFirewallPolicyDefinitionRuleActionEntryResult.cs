// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Outputs
{

    [OutputType]
    public sealed class GetZoneBasedFirewallPolicyDefinitionRuleActionEntryResult
    {
        /// <summary>
        /// Type of action entry
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetZoneBasedFirewallPolicyDefinitionRuleActionEntryResult(string type)
        {
            Type = type;
        }
    }
}
