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
    public sealed class SystemAaaFeatureAccountingRule
    {
        /// <summary>
        /// Use Server-group
        /// </summary>
        public readonly ImmutableArray<string> Groups;
        /// <summary>
        /// Privilege level when method is commands
        ///   - Choices: `1`, `15`
        /// </summary>
        public readonly string? Level;
        /// <summary>
        /// Configure Accounting Method
        ///   - Choices: `commands`, `exec`, `network`, `system`
        /// </summary>
        public readonly string? Method;
        /// <summary>
        /// Configure Accounting Rule ID
        /// </summary>
        public readonly string? RuleId;
        /// <summary>
        /// Record start and stop without waiting
        ///   - Default value: `true`
        /// </summary>
        public readonly bool? StartStop;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? StartStopVariable;

        [OutputConstructor]
        private SystemAaaFeatureAccountingRule(
            ImmutableArray<string> groups,

            string? level,

            string? method,

            string? ruleId,

            bool? startStop,

            string? startStopVariable)
        {
            Groups = groups;
            Level = level;
            Method = method;
            RuleId = ruleId;
            StartStop = startStop;
            StartStopVariable = startStopVariable;
        }
    }
}
