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
    public sealed class GetServiceRoutingBgpFeatureIpv6NeighborAddressFamilyResult
    {
        /// <summary>
        /// Set IPv6 unicast address family
        /// </summary>
        public readonly string FamilyType;
        public readonly string InRoutePolicyId;
        /// <summary>
        /// Set maximum number of prefixes accepted from BGP peer
        /// </summary>
        public readonly int MaxNumberOfPrefixes;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string MaxNumberOfPrefixesVariable;
        public readonly string OutRoutePolicyId;
        /// <summary>
        /// Neighbor received maximum prefix policy is disabled.
        /// </summary>
        public readonly string PolicyType;
        /// <summary>
        /// Set the restart interval(minutes) when to restart BGP connection if threshold is exceeded
        /// </summary>
        public readonly int RestartInterval;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string RestartIntervalVariable;
        /// <summary>
        /// Set threshold(1 to 100) at which to generate a warning message
        /// </summary>
        public readonly int Threshold;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ThresholdVariable;

        [OutputConstructor]
        private GetServiceRoutingBgpFeatureIpv6NeighborAddressFamilyResult(
            string familyType,

            string inRoutePolicyId,

            int maxNumberOfPrefixes,

            string maxNumberOfPrefixesVariable,

            string outRoutePolicyId,

            string policyType,

            int restartInterval,

            string restartIntervalVariable,

            int threshold,

            string thresholdVariable)
        {
            FamilyType = familyType;
            InRoutePolicyId = inRoutePolicyId;
            MaxNumberOfPrefixes = maxNumberOfPrefixes;
            MaxNumberOfPrefixesVariable = maxNumberOfPrefixesVariable;
            OutRoutePolicyId = outRoutePolicyId;
            PolicyType = policyType;
            RestartInterval = restartInterval;
            RestartIntervalVariable = restartIntervalVariable;
            Threshold = threshold;
            ThresholdVariable = thresholdVariable;
        }
    }
}