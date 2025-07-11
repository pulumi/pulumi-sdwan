// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ConfigurationGroupTopologyDeviceUnsupportedFeatureArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Parcel ID
        /// </summary>
        [Input("parcelId")]
        public Input<string>? ParcelId { get; set; }

        /// <summary>
        /// Parcel type
        ///   - Choices: `wan/vpn/interface/gre`, `wan/vpn/interface/ethernet`, `wan/vpn/interface/cellular`, `wan/vpn/interface/ipsec`, `wan/vpn/interface/serial`, `routing/ospf`, `lan/vpn/interface/ethernet`, `lan/vpn/interface/svi`, `lan/vpn/interface/ipsec`, `lan/vpn`
        /// </summary>
        [Input("parcelType")]
        public Input<string>? ParcelType { get; set; }

        public ConfigurationGroupTopologyDeviceUnsupportedFeatureArgs()
        {
        }
        public static new ConfigurationGroupTopologyDeviceUnsupportedFeatureArgs Empty => new ConfigurationGroupTopologyDeviceUnsupportedFeatureArgs();
    }
}
