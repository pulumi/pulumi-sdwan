// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class PolicyObjectApplicationListEntryArgs : global::Pulumi.ResourceArgs
    {
        [Input("application")]
        public Input<string>? Application { get; set; }

        [Input("applicationFamily")]
        public Input<string>? ApplicationFamily { get; set; }

        public PolicyObjectApplicationListEntryArgs()
        {
        }
        public static new PolicyObjectApplicationListEntryArgs Empty => new PolicyObjectApplicationListEntryArgs();
    }
}
