// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class DomainListPolicyObjectEntryGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Domain name, must not start with `*`
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        public DomainListPolicyObjectEntryGetArgs()
        {
        }
        public static new DomainListPolicyObjectEntryGetArgs Empty => new DomainListPolicyObjectEntryGetArgs();
    }
}
