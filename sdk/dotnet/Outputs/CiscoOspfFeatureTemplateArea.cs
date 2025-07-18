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
    public sealed class CiscoOspfFeatureTemplateArea
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
        /// Set OSPF interface parameters
        /// </summary>
        public readonly ImmutableArray<Outputs.CiscoOspfFeatureTemplateAreaInterface> Interfaces;
        /// <summary>
        /// NSSA area
        /// </summary>
        public readonly bool? Nssa;
        /// <summary>
        /// Do not inject interarea routes into NSSA
        ///   - Default value: `false`
        /// </summary>
        public readonly bool? NssaNoSummary;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? NssaNoSummaryVariable;
        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        public readonly bool? Optional;
        /// <summary>
        /// Summarize OSPF routes at an area boundary
        /// </summary>
        public readonly ImmutableArray<Outputs.CiscoOspfFeatureTemplateAreaRange> Ranges;
        /// <summary>
        /// Stub area
        /// </summary>
        public readonly bool? Stub;
        /// <summary>
        /// Do not inject interarea routes into stub
        ///   - Default value: `false`
        /// </summary>
        public readonly bool? StubNoSummary;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? StubNoSummaryVariable;

        [OutputConstructor]
        private CiscoOspfFeatureTemplateArea(
            int? areaNumber,

            string? areaNumberVariable,

            ImmutableArray<Outputs.CiscoOspfFeatureTemplateAreaInterface> interfaces,

            bool? nssa,

            bool? nssaNoSummary,

            string? nssaNoSummaryVariable,

            bool? optional,

            ImmutableArray<Outputs.CiscoOspfFeatureTemplateAreaRange> ranges,

            bool? stub,

            bool? stubNoSummary,

            string? stubNoSummaryVariable)
        {
            AreaNumber = areaNumber;
            AreaNumberVariable = areaNumberVariable;
            Interfaces = interfaces;
            Nssa = nssa;
            NssaNoSummary = nssaNoSummary;
            NssaNoSummaryVariable = nssaNoSummaryVariable;
            Optional = optional;
            Ranges = ranges;
            Stub = stub;
            StubNoSummary = stubNoSummary;
            StubNoSummaryVariable = stubNoSummaryVariable;
        }
    }
}
