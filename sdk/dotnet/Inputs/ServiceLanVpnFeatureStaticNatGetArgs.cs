// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ServiceLanVpnFeatureStaticNatGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// NAT Pool Name
        ///   - Range: `1`-`32`
        /// </summary>
        [Input("natPoolName")]
        public Input<int>? NatPoolName { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("natPoolNameVariable")]
        public Input<string>? NatPoolNameVariable { get; set; }

        /// <summary>
        /// Source IP Address
        /// </summary>
        [Input("sourceIp")]
        public Input<string>? SourceIp { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("sourceIpVariable")]
        public Input<string>? SourceIpVariable { get; set; }

        /// <summary>
        /// Static NAT Direction
        ///   - Choices: `inside`, `outside`
        /// </summary>
        [Input("staticNatDirection")]
        public Input<string>? StaticNatDirection { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("staticNatDirectionVariable")]
        public Input<string>? StaticNatDirectionVariable { get; set; }

        [Input("trackerObjectId")]
        public Input<string>? TrackerObjectId { get; set; }

        /// <summary>
        /// Translated Source IP Address
        /// </summary>
        [Input("translatedSourceIp")]
        public Input<string>? TranslatedSourceIp { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("translatedSourceIpVariable")]
        public Input<string>? TranslatedSourceIpVariable { get; set; }

        public ServiceLanVpnFeatureStaticNatGetArgs()
        {
        }
        public static new ServiceLanVpnFeatureStaticNatGetArgs Empty => new ServiceLanVpnFeatureStaticNatGetArgs();
    }
}
