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
    public sealed class GetServiceLanVpnFeatureStaticNatResult
    {
        /// <summary>
        /// NAT Pool Name
        /// </summary>
        public readonly int NatPoolName;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string NatPoolNameVariable;
        /// <summary>
        /// Source IP Address
        /// </summary>
        public readonly string SourceIp;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string SourceIpVariable;
        /// <summary>
        /// Static NAT Direction
        /// </summary>
        public readonly string StaticNatDirection;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string StaticNatDirectionVariable;
        public readonly string TrackerObjectId;
        /// <summary>
        /// Translated Source IP Address
        /// </summary>
        public readonly string TranslatedSourceIp;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TranslatedSourceIpVariable;

        [OutputConstructor]
        private GetServiceLanVpnFeatureStaticNatResult(
            int natPoolName,

            string natPoolNameVariable,

            string sourceIp,

            string sourceIpVariable,

            string staticNatDirection,

            string staticNatDirectionVariable,

            string trackerObjectId,

            string translatedSourceIp,

            string translatedSourceIpVariable)
        {
            NatPoolName = natPoolName;
            NatPoolNameVariable = natPoolNameVariable;
            SourceIp = sourceIp;
            SourceIpVariable = sourceIpVariable;
            StaticNatDirection = staticNatDirection;
            StaticNatDirectionVariable = staticNatDirectionVariable;
            TrackerObjectId = trackerObjectId;
            TranslatedSourceIp = translatedSourceIp;
            TranslatedSourceIpVariable = translatedSourceIpVariable;
        }
    }
}