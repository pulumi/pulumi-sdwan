// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class SystemAaaFeatureAccountingRuleGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("groups")]
        private InputList<string>? _groups;

        /// <summary>
        /// Use Server-group
        /// </summary>
        public InputList<string> Groups
        {
            get => _groups ?? (_groups = new InputList<string>());
            set => _groups = value;
        }

        /// <summary>
        /// Privilege level when method is commands
        ///   - Choices: `1`, `15`
        /// </summary>
        [Input("level")]
        public Input<string>? Level { get; set; }

        /// <summary>
        /// Configure Accounting Method
        ///   - Choices: `commands`, `exec`, `network`, `system`
        /// </summary>
        [Input("method")]
        public Input<string>? Method { get; set; }

        /// <summary>
        /// Configure Accounting Rule ID
        /// </summary>
        [Input("ruleId")]
        public Input<string>? RuleId { get; set; }

        /// <summary>
        /// Record start and stop without waiting
        ///   - Default value: `true`
        /// </summary>
        [Input("startStop")]
        public Input<bool>? StartStop { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("startStopVariable")]
        public Input<string>? StartStopVariable { get; set; }

        public SystemAaaFeatureAccountingRuleGetArgs()
        {
        }
        public static new SystemAaaFeatureAccountingRuleGetArgs Empty => new SystemAaaFeatureAccountingRuleGetArgs();
    }
}