// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class SystemSnmpFeatureGroupGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the SNMP group
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Configure security level
        ///   - Choices: `no-auth-no-priv`, `auth-no-priv`, `auth-priv`
        /// </summary>
        [Input("securityLevel")]
        public Input<string>? SecurityLevel { get; set; }

        /// <summary>
        /// Name of the SNMP view
        /// </summary>
        [Input("view")]
        public Input<string>? View { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("viewVariable")]
        public Input<string>? ViewVariable { get; set; }

        public SystemSnmpFeatureGroupGetArgs()
        {
        }
        public static new SystemSnmpFeatureGroupGetArgs Empty => new SystemSnmpFeatureGroupGetArgs();
    }
}