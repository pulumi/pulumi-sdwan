// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class SystemSnmpFeatureViewOidGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Exclude the OID
        ///   - Default value: `false`
        /// </summary>
        [Input("exclude")]
        public Input<bool>? Exclude { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("excludeVariable")]
        public Input<string>? ExcludeVariable { get; set; }

        /// <summary>
        /// Configure identifier of subtree of MIB objects
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("idVariable")]
        public Input<string>? IdVariable { get; set; }

        public SystemSnmpFeatureViewOidGetArgs()
        {
        }
        public static new SystemSnmpFeatureViewOidGetArgs Empty => new SystemSnmpFeatureViewOidGetArgs();
    }
}
