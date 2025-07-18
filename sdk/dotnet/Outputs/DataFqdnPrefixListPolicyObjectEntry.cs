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
    public sealed class DataFqdnPrefixListPolicyObjectEntry
    {
        /// <summary>
        /// Fully qualified domain name
        /// </summary>
        public readonly string Fqdn;

        [OutputConstructor]
        private DataFqdnPrefixListPolicyObjectEntry(string fqdn)
        {
            Fqdn = fqdn;
        }
    }
}
