// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class TransportRoutingOspfv3Ipv6FeatureAreaInterfaceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set OSPF interface authentication IPSEC key
        /// </summary>
        [Input("authenticationKey")]
        public Input<string>? AuthenticationKey { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("authenticationKeyVariable")]
        public Input<string>? AuthenticationKeyVariable { get; set; }

        /// <summary>
        /// Set OSPF interface authentication IPSec SPI, range 256..4294967295
        ///   - Range: `256`-`4294967295`
        /// </summary>
        [Input("authenticationSpi")]
        public Input<int>? AuthenticationSpi { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("authenticationSpiVariable")]
        public Input<string>? AuthenticationSpiVariable { get; set; }

        /// <summary>
        /// No Authentication by default
        ///   - Choices: `no-auth`
        /// </summary>
        [Input("authenticationType")]
        public Input<string>? AuthenticationType { get; set; }

        /// <summary>
        /// Set cost of OSPF interface
        ///   - Range: `1`-`65535`
        /// </summary>
        [Input("cost")]
        public Input<int>? Cost { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("costVariable")]
        public Input<string>? CostVariable { get; set; }

        /// <summary>
        /// Set interval after which neighbor is declared to be down
        ///   - Range: `1`-`65535`
        ///   - Default value: `40`
        /// </summary>
        [Input("deadInterval")]
        public Input<int>? DeadInterval { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("deadIntervalVariable")]
        public Input<string>? DeadIntervalVariable { get; set; }

        /// <summary>
        /// Set interval between OSPF hello packets
        ///   - Range: `1`-`65535`
        ///   - Default value: `10`
        /// </summary>
        [Input("helloInterval")]
        public Input<int>? HelloInterval { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("helloIntervalVariable")]
        public Input<string>? HelloIntervalVariable { get; set; }

        /// <summary>
        /// Set time between retransmitting LSAs
        ///   - Range: `1`-`65535`
        ///   - Default value: `5`
        /// </summary>
        [Input("lsaRetransmitInterval")]
        public Input<int>? LsaRetransmitInterval { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("lsaRetransmitIntervalVariable")]
        public Input<string>? LsaRetransmitIntervalVariable { get; set; }

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
        /// Set the OSPF network type
        ///   - Choices: `broadcast`, `point-to-point`, `non-broadcast`, `point-to-multipoint`
        /// </summary>
        [Input("networkType")]
        public Input<string>? NetworkType { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("networkTypeVariable")]
        public Input<string>? NetworkTypeVariable { get; set; }

        /// <summary>
        /// Set the interface to advertise its address, but not to actively run OSPF
        ///   - Default value: `false`
        /// </summary>
        [Input("passiveInterface")]
        public Input<bool>? PassiveInterface { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("passiveInterfaceVariable")]
        public Input<string>? PassiveInterfaceVariable { get; set; }

        public TransportRoutingOspfv3Ipv6FeatureAreaInterfaceArgs()
        {
        }
        public static new TransportRoutingOspfv3Ipv6FeatureAreaInterfaceArgs Empty => new TransportRoutingOspfv3Ipv6FeatureAreaInterfaceArgs();
    }
}