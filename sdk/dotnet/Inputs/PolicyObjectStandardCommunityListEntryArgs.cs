// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class PolicyObjectStandardCommunityListEntryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Standard Community
        /// </summary>
        [Input("standardCommunity")]
        public Input<string>? StandardCommunity { get; set; }

        public PolicyObjectStandardCommunityListEntryArgs()
        {
        }
        public static new PolicyObjectStandardCommunityListEntryArgs Empty => new PolicyObjectStandardCommunityListEntryArgs();
    }
}
