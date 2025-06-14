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
    public sealed class ServiceRoutingOspfFeatureArea
    {
        /// <summary>
        /// Set OSPF area number
        ///   - Range: `0`-`4294967295`
        /// </summary>
        public readonly int? AreaNumber;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? AreaNumberVariable;
        /// <summary>
        /// set the area type
        ///   - Choices: `stub`, `nssa`
        /// </summary>
        public readonly string? AreaType;
        /// <summary>
        /// Set OSPF interface parameters
        /// </summary>
        public readonly ImmutableArray<Outputs.ServiceRoutingOspfFeatureAreaInterface> Interfaces;
        /// <summary>
        /// Do not inject interarea routes into STUB or NSSA
        ///   - Default value: `false`
        /// </summary>
        public readonly bool? NoSummary;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? NoSummaryVariable;
        /// <summary>
        /// Summarize OSPF routes at an area boundary
        /// </summary>
        public readonly ImmutableArray<Outputs.ServiceRoutingOspfFeatureAreaRange> Ranges;

        [OutputConstructor]
        private ServiceRoutingOspfFeatureArea(
            int? areaNumber,

            string? areaNumberVariable,

            string? areaType,

            ImmutableArray<Outputs.ServiceRoutingOspfFeatureAreaInterface> interfaces,

            bool? noSummary,

            string? noSummaryVariable,

            ImmutableArray<Outputs.ServiceRoutingOspfFeatureAreaRange> ranges)
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
