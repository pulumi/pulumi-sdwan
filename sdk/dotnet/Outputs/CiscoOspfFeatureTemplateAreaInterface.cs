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
    public sealed class CiscoOspfFeatureTemplateAreaInterface
    {
        /// <summary>
        /// Set MD5 authentication key
        /// </summary>
        public readonly string? AuthenticationMessageDigestKey;
        /// <summary>
        /// Set MD5 message digest key
        ///   - Range: `1`-`255`
        /// </summary>
        public readonly int? AuthenticationMessageDigestKeyId;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? AuthenticationMessageDigestKeyIdVariable;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? AuthenticationMessageDigestKeyVariable;
        /// <summary>
        /// Set OSPF interface authentication type
        ///   - Choices: `simple`, `message-digest`, `null`
        /// </summary>
        public readonly string? AuthenticationType;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? AuthenticationTypeVariable;
        /// <summary>
        /// Set cost of OSPF interface
        ///   - Range: `1`-`65535`
        /// </summary>
        public readonly int? Cost;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? CostVariable;
        /// <summary>
        /// Set interval after which neighbor is declared to be down
        ///   - Range: `1`-`65535`
        ///   - Default value: `40`
        /// </summary>
        public readonly int? DeadInterval;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? DeadIntervalVariable;
        /// <summary>
        /// Set interval between OSPF hello packets
        ///   - Range: `1`-`65535`
        ///   - Default value: `10`
        /// </summary>
        public readonly int? HelloInterval;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? HelloIntervalVariable;
        /// <summary>
        /// Set interface name
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? NameVariable;
        /// <summary>
        /// Set the OSPF network type
        ///   - Choices: `broadcast`, `point-to-point`, `non-broadcast`, `point-to-multipoint`
        ///   - Default value: `broadcast`
        /// </summary>
        public readonly string? Network;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? NetworkVariable;
        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        public readonly bool? Optional;
        /// <summary>
        /// Set the interface to advertise its address, but not to actively run OSPF
        ///   - Default value: `false`
        /// </summary>
        public readonly bool? PassiveInterface;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? PassiveInterfaceVariable;
        /// <summary>
        /// Set router’s priority to be elected as designated router
        ///   - Range: `0`-`255`
        ///   - Default value: `1`
        /// </summary>
        public readonly int? Priority;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? PriorityVariable;
        /// <summary>
        /// Set time between retransmitting LSAs
        ///   - Range: `1`-`65535`
        ///   - Default value: `5`
        /// </summary>
        public readonly int? RetransmitInterval;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string? RetransmitIntervalVariable;

        [OutputConstructor]
        private CiscoOspfFeatureTemplateAreaInterface(
            string? authenticationMessageDigestKey,

            int? authenticationMessageDigestKeyId,

            string? authenticationMessageDigestKeyIdVariable,

            string? authenticationMessageDigestKeyVariable,

            string? authenticationType,

            string? authenticationTypeVariable,

            int? cost,

            string? costVariable,

            int? deadInterval,

            string? deadIntervalVariable,

            int? helloInterval,

            string? helloIntervalVariable,

            string? name,

            string? nameVariable,

            string? network,

            string? networkVariable,

            bool? optional,

            bool? passiveInterface,

            string? passiveInterfaceVariable,

            int? priority,

            string? priorityVariable,

            int? retransmitInterval,

            string? retransmitIntervalVariable)
        {
            AuthenticationMessageDigestKey = authenticationMessageDigestKey;
            AuthenticationMessageDigestKeyId = authenticationMessageDigestKeyId;
            AuthenticationMessageDigestKeyIdVariable = authenticationMessageDigestKeyIdVariable;
            AuthenticationMessageDigestKeyVariable = authenticationMessageDigestKeyVariable;
            AuthenticationType = authenticationType;
            AuthenticationTypeVariable = authenticationTypeVariable;
            Cost = cost;
            CostVariable = costVariable;
            DeadInterval = deadInterval;
            DeadIntervalVariable = deadIntervalVariable;
            HelloInterval = helloInterval;
            HelloIntervalVariable = helloIntervalVariable;
            Name = name;
            NameVariable = nameVariable;
            Network = network;
            NetworkVariable = networkVariable;
            Optional = optional;
            PassiveInterface = passiveInterface;
            PassiveInterfaceVariable = passiveInterfaceVariable;
            Priority = priority;
            PriorityVariable = priorityVariable;
            RetransmitInterval = retransmitInterval;
            RetransmitIntervalVariable = retransmitIntervalVariable;
        }
    }
}
