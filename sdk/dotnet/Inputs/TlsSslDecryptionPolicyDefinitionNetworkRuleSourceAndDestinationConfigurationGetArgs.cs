// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class TlsSslDecryptionPolicyDefinitionNetworkRuleSourceAndDestinationConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// source / destination option
        ///   - Choices: `sourceIp`, `sourcePort`, `destinationVpn`, `destinationIp`, `destinationPort`
        /// </summary>
        [Input("option")]
        public Input<string>? Option { get; set; }

        /// <summary>
        /// source / destination option target
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public TlsSslDecryptionPolicyDefinitionNetworkRuleSourceAndDestinationConfigurationGetArgs()
        {
        }
        public static new TlsSslDecryptionPolicyDefinitionNetworkRuleSourceAndDestinationConfigurationGetArgs Empty => new TlsSslDecryptionPolicyDefinitionNetworkRuleSourceAndDestinationConfigurationGetArgs();
    }
}
