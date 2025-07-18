// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class CedgeAaaFeatureTemplateAuthorizationRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Succeed if user has authenticated
        ///   - Default value: `false`
        /// </summary>
        [Input("authenticated")]
        public Input<bool>? Authenticated { get; set; }

        /// <summary>
        /// Comma separated list of groups
        /// </summary>
        [Input("groups")]
        public Input<string>? Groups { get; set; }

        /// <summary>
        /// Method
        ///   - Choices: `commands`
        /// </summary>
        [Input("method")]
        public Input<string>? Method { get; set; }

        /// <summary>
        /// Configure Authorization Rule ID
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        [Input("optional")]
        public Input<bool>? Optional { get; set; }

        /// <summary>
        /// Privilege level when method is commands
        ///   - Choices: `1`, `15`
        /// </summary>
        [Input("privilegeLevel")]
        public Input<string>? PrivilegeLevel { get; set; }

        public CedgeAaaFeatureTemplateAuthorizationRuleArgs()
        {
        }
        public static new CedgeAaaFeatureTemplateAuthorizationRuleArgs Empty => new CedgeAaaFeatureTemplateAuthorizationRuleArgs();
    }
}
