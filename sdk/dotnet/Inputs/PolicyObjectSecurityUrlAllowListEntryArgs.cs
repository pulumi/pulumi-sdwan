// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class PolicyObjectSecurityUrlAllowListEntryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// valid url pattern
        /// </summary>
        [Input("pattern")]
        public Input<string>? Pattern { get; set; }

        public PolicyObjectSecurityUrlAllowListEntryArgs()
        {
        }
        public static new PolicyObjectSecurityUrlAllowListEntryArgs Empty => new PolicyObjectSecurityUrlAllowListEntryArgs();
    }
}
