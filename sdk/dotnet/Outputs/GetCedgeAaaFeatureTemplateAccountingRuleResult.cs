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
    public sealed class GetCedgeAaaFeatureTemplateAccountingRuleResult
    {
        /// <summary>
        /// Comma separated list of groups
        /// </summary>
        public readonly string Groups;
        /// <summary>
        /// Configure Accounting Method
        /// </summary>
        public readonly string Method;
        /// <summary>
        /// Configure Accounting Rule ID
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        public readonly bool Optional;
        /// <summary>
        /// Privilege level when method is commands
        /// </summary>
        public readonly string PrivilegeLevel;
        /// <summary>
        /// Record start and stop without waiting
        /// </summary>
        public readonly bool StartStop;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string StartStopVariable;

        [OutputConstructor]
        private GetCedgeAaaFeatureTemplateAccountingRuleResult(
            string groups,

            string method,

            string name,

            bool optional,

            string privilegeLevel,

            bool startStop,

            string startStopVariable)
        {
            Groups = groups;
            Method = method;
            Name = name;
            Optional = optional;
            PrivilegeLevel = privilegeLevel;
            StartStop = startStop;
            StartStopVariable = startStopVariable;
        }
    }
}
