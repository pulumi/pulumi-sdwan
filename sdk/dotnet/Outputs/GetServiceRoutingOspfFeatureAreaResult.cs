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
    public sealed class GetServiceRoutingOspfFeatureAreaResult
    {
        /// <summary>
        /// Set OSPF area number
        /// </summary>
        public readonly int AreaNumber;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string AreaNumberVariable;
        /// <summary>
        /// set the area type
        /// </summary>
        public readonly string AreaType;
        /// <summary>
        /// Set OSPF interface parameters
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceRoutingOspfFeatureAreaInterfaceResult> Interfaces;
        /// <summary>
        /// Do not inject interarea routes into STUB or NSSA
        /// </summary>
        public readonly bool NoSummary;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string NoSummaryVariable;
        /// <summary>
        /// Summarize OSPF routes at an area boundary
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceRoutingOspfFeatureAreaRangeResult> Ranges;

        [OutputConstructor]
        private GetServiceRoutingOspfFeatureAreaResult(
            int areaNumber,

            string areaNumberVariable,

            string areaType,

            ImmutableArray<Outputs.GetServiceRoutingOspfFeatureAreaInterfaceResult> interfaces,

            bool noSummary,

            string noSummaryVariable,

            ImmutableArray<Outputs.GetServiceRoutingOspfFeatureAreaRangeResult> ranges)
        {
            AreaNumber = areaNumber;
            AreaNumberVariable = areaNumberVariable;
            AreaType = areaType;
            Interfaces = interfaces;
            NoSummary = noSummary;
            NoSummaryVariable = noSummaryVariable;
            Ranges = ranges;
        }
    }
}