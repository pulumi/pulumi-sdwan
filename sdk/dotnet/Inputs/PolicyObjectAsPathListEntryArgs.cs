// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class PolicyObjectAsPathListEntryArgs : global::Pulumi.ResourceArgs
    {
        [Input("asPathList")]
        public Input<string>? AsPathList { get; set; }

        public PolicyObjectAsPathListEntryArgs()
        {
        }
        public static new PolicyObjectAsPathListEntryArgs Empty => new PolicyObjectAsPathListEntryArgs();
    }
}
