// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class AllowUrlListPolicyObjectEntryGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// URL
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public AllowUrlListPolicyObjectEntryGetArgs()
        {
        }
        public static new AllowUrlListPolicyObjectEntryGetArgs Empty => new AllowUrlListPolicyObjectEntryGetArgs();
    }
}
