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
    public sealed class SystemSnmpFeatureViewOid
    {
        /// <summary>
        /// Exclude the OID
        ///   - Default value: `false`
        /// </summary>
        public readonly bool? Exclude;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? ExcludeVariable;
        /// <summary>
        /// Configure identifier of subtree of MIB objects
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? IdVariable;

        [OutputConstructor]
        private SystemSnmpFeatureViewOid(
            bool? exclude,

            string? excludeVariable,

            string? id,

            string? idVariable)
        {
            Exclude = exclude;
            ExcludeVariable = excludeVariable;
            Id = id;
            IdVariable = idVariable;
        }
    }
}