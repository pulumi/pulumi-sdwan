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
    public sealed class PolicyObjectSecurityGeolocationListEntry
    {
        /// <summary>
        /// continent name
        ///   - Choices: `AF`, `AN`, `AS`, `EU`, `NA`, `OC`, `SA`
        /// </summary>
        public readonly string? Continent;
        /// <summary>
        /// country names
        ///   - Choices: `AFG`, `ALB`, `ATA`, `DZA`, `ASM`, `AND`, `AGO`, `ATG`, `AZE`, `ARG`, `AUS`, `AUT`, `BHS`, `BHR`, `BGD`, `ARM`, `BRB`, `BEL`, `BMU`, `BTN`, `BOL`, `BIH`, `BWA`, `BVT`, `BRA`, `BLZ`, `IOT`, `SLB`, `VGB`, `BRN`, `BGR`, `MMR`, `BDI`, `BLR`, `KHM`, `CMR`, `CAN`, `CPV`, `CYM`, `CAF`, `LKA`, `TCD`, `CHL`, `CHN`, `TWN`, `CXR`, `CCK`, `COL`, `COM`, `MYT`, `COG`, `COD`, `COK`, `CRI`, `HRV`, `CUB`, `CYP`, `CZE`, `BEN`, `DNK`, `DMA`, `DOM`, `ECU`, `SLV`, `GNQ`, `ETH`, `ERI`, `EST`, `FRO`, `FLK`, `SGS`, `FJI`, `FIN`, `ALA`, `FRA`, `GUF`, `PYF`, `ATF`, `DJI`, `GAB`, `GEO`, `GMB`, `PSE`, `DEU`, `GHA`, `GIB`, `KIR`, `GRC`, `GRL`, `GRD`, `GLP`, `GUM`, `GTM`, `GIN`, `GUY`, `HTI`, `HMD`, `VAT`, `HND`, `HKG`, `HUN`, `ISL`, `IND`, `IDN`, `IRN`, `IRQ`, `IRL`, `ISR`, `ITA`, `CIV`, `JAM`, `JPN`, `KAZ`, `JOR`, `KEN`, `PRK`, `KOR`, `KWT`, `KGZ`, `LAO`, `LBN`, `LSO`, `LVA`, `LBR`, `LBY`, `LIE`, `LTU`, `LUX`, `MAC`, `MDG`, `MWI`, `MYS`, `MDV`, `MLI`, `MLT`, `MTQ`, `MRT`, `MUS`, `MEX`, `MCO`, `MNG`, `MDA`, `MNE`, `MSR`, `MAR`, `MOZ`, `OMN`, `NAM`, `NRU`, `NPL`, `NLD`, `ANT`, `CUW`, `ABW`, `SXM`, `BES`, `NCL`, `VUT`, `NZL`, `NIC`, `NER`, `NGA`, `NIU`, `NFK`, `NOR`, `MNP`, `UMI`, `FSM`, `MHL`, `PLW`, `PAK`, `PAN`, `PNG`, `PRY`, `PER`, `PHL`, `PCN`, `POL`, `PRT`, `GNB`, `TLS`, `PRI`, `QAT`, `REU`, `ROU`, `RUS`, `RWA`, `BLM`, `SHN`, `KNA`, `AIA`, `LCA`, `MAF`, `SPM`, `VCT`, `SMR`, `STP`, `SAU`, `SEN`, `SRB`, `SYC`, `SLE`, `SGP`, `SVK`, `VNM`, `SVN`, `SOM`, `ZAF`, `ZWE`, `ESP`, `SSD`, `ESH`, `SDN`, `SUR`, `SJM`, `SWZ`, `SWE`, `CHE`, `SYR`, `TJK`, `THA`, `TGO`, `TKL`, `TON`, `TTO`, `ARE`, `TUN`, `TUR`, `TKM`, `TCA`, `TUV`, `UGA`, `UKR`, `MKD`, `EGY`, `GBR`, `GGY`, `JEY`, `IMN`, `TZA`, `USA`, `VIR`, `BFA`, `URY`, `UZB`, `VEN`, `WLF`, `WSM`, `YEM`, `ZMB`
        /// </summary>
        public readonly string? Country;

        [OutputConstructor]
        private PolicyObjectSecurityGeolocationListEntry(
            string? continent,

            string? country)
        {
            Continent = continent;
            Country = country;
        }
    }
}
