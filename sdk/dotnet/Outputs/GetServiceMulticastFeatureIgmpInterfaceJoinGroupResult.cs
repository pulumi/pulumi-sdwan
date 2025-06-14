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
    public sealed class GetServiceMulticastFeatureIgmpInterfaceJoinGroupResult
    {
        /// <summary>
        /// Set group address
        /// </summary>
        public readonly string GroupAddress;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string GroupAddressVariable;
        /// <summary>
        /// Set source address
        /// </summary>
        public readonly string SourceAddress;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string SourceAddressVariable;

        [OutputConstructor]
        private GetServiceMulticastFeatureIgmpInterfaceJoinGroupResult(
            string groupAddress,

            string groupAddressVariable,

            string sourceAddress,

            string sourceAddressVariable)
        {
            GroupAddress = groupAddress;
            GroupAddressVariable = groupAddressVariable;
            SourceAddress = sourceAddress;
            SourceAddressVariable = sourceAddressVariable;
        }
    }
}
