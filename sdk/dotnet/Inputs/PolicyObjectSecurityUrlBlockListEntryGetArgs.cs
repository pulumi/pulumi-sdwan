// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class PolicyObjectSecurityUrlBlockListEntryGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// valid url pattern
        /// </summary>
        [Input("pattern")]
        public Input<string>? Pattern { get; set; }

        public PolicyObjectSecurityUrlBlockListEntryGetArgs()
        {
        }
        public static new PolicyObjectSecurityUrlBlockListEntryGetArgs Empty => new PolicyObjectSecurityUrlBlockListEntryGetArgs();
    }
}
