// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class ServiceRoutingEigrpFeatureInterfaceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set interface name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("nameVariable")]
        public Input<string>? NameVariable { get; set; }

        /// <summary>
        /// Enable/disable EIGRP
        ///   - Default value: `false`
        /// </summary>
        [Input("shutdown")]
        public Input<bool>? Shutdown { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("shutdownVariable")]
        public Input<string>? ShutdownVariable { get; set; }

        [Input("summaryAddresses")]
        private InputList<Inputs.ServiceRoutingEigrpFeatureInterfaceSummaryAddressArgs>? _summaryAddresses;

        /// <summary>
        /// Set summary addresses
        /// </summary>
        public InputList<Inputs.ServiceRoutingEigrpFeatureInterfaceSummaryAddressArgs> SummaryAddresses
        {
            get => _summaryAddresses ?? (_summaryAddresses = new InputList<Inputs.ServiceRoutingEigrpFeatureInterfaceSummaryAddressArgs>());
            set => _summaryAddresses = value;
        }

        public ServiceRoutingEigrpFeatureInterfaceArgs()
        {
        }
        public static new ServiceRoutingEigrpFeatureInterfaceArgs Empty => new ServiceRoutingEigrpFeatureInterfaceArgs();
    }
}
