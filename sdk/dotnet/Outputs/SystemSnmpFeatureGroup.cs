// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Outputs
{

    [OutputType]
    public sealed class SystemSnmpFeatureGroup
    {
        /// <summary>
        /// Name of the SNMP group
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Configure security level
        ///   - Choices: `no-auth-no-priv`, `auth-no-priv`, `auth-priv`
        /// </summary>
        public readonly string? SecurityLevel;
        /// <summary>
        /// Name of the SNMP view
        /// </summary>
        public readonly string? View;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? ViewVariable;

        [OutputConstructor]
        private SystemSnmpFeatureGroup(
            string? name,

            string? securityLevel,

            string? view,

            string? viewVariable)
        {
            Name = name;
            SecurityLevel = securityLevel;
            View = view;
            ViewVariable = viewVariable;
        }
    }
}