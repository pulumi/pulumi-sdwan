// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class SystemSecurityFeatureKeyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configure Accept AO Mismatch
        ///   - Default value: `false`
        /// </summary>
        [Input("acceptAoMismatch")]
        public Input<bool>? AcceptAoMismatch { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("acceptAoMismatchVariable")]
        public Input<string>? AcceptAoMismatchVariable { get; set; }

        /// <summary>
        /// Send lifetime Duration (seconds)
        ///   - Range: `1`-`2147483646`
        /// </summary>
        [Input("acceptLifeTimeDuration")]
        public Input<int>? AcceptLifeTimeDuration { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("acceptLifeTimeDurationVariable")]
        public Input<string>? AcceptLifeTimeDurationVariable { get; set; }

        /// <summary>
        /// Configure Key lifetime end time
        /// </summary>
        [Input("acceptLifeTimeExact")]
        public Input<int>? AcceptLifeTimeExact { get; set; }

        /// <summary>
        /// Infinite lifetime
        /// </summary>
        [Input("acceptLifeTimeInfinite")]
        public Input<bool>? AcceptLifeTimeInfinite { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("acceptLifeTimeInfiniteVariable")]
        public Input<string>? AcceptLifeTimeInfiniteVariable { get; set; }

        /// <summary>
        /// Configure Send lifetime Local
        ///   - Default value: `false`
        /// </summary>
        [Input("acceptLifeTimeLocal")]
        public Input<bool>? AcceptLifeTimeLocal { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("acceptLifeTimeLocalVariable")]
        public Input<string>? AcceptLifeTimeLocalVariable { get; set; }

        /// <summary>
        /// Configure Key lifetime start time
        /// </summary>
        [Input("acceptLifeTimeStartEpoch")]
        public Input<int>? AcceptLifeTimeStartEpoch { get; set; }

        /// <summary>
        /// Crypto Algorithm
        ///   - Choices: `aes-128-cmac`, `hmac-sha-1`, `hmac-sha-256`
        /// </summary>
        [Input("cryptoAlgorithm")]
        public Input<string>? CryptoAlgorithm { get; set; }

        /// <summary>
        /// Select the Key ID
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        /// <summary>
        /// Configure Include TCP Options
        ///   - Default value: `false`
        /// </summary>
        [Input("includeTcpOptions")]
        public Input<bool>? IncludeTcpOptions { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("includeTcpOptionsVariable")]
        public Input<string>? IncludeTcpOptionsVariable { get; set; }

        /// <summary>
        /// Specify the Key String
        /// </summary>
        [Input("keyString")]
        public Input<string>? KeyString { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("keyStringVariable")]
        public Input<string>? KeyStringVariable { get; set; }

        /// <summary>
        /// Select the chain name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specify the Receiver ID
        ///   - Range: `0`-`255`
        /// </summary>
        [Input("receiverId")]
        public Input<int>? ReceiverId { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("receiverIdVariable")]
        public Input<string>? ReceiverIdVariable { get; set; }

        /// <summary>
        /// Specify the Send ID
        ///   - Range: `0`-`255`
        /// </summary>
        [Input("sendId")]
        public Input<int>? SendId { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("sendIdVariable")]
        public Input<string>? SendIdVariable { get; set; }

        /// <summary>
        /// Send lifetime Duration (seconds)
        ///   - Range: `1`-`2147483646`
        /// </summary>
        [Input("sendLifeTimeDuration")]
        public Input<int>? SendLifeTimeDuration { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("sendLifeTimeDurationVariable")]
        public Input<string>? SendLifeTimeDurationVariable { get; set; }

        /// <summary>
        /// Configure Key lifetime end time
        /// </summary>
        [Input("sendLifeTimeExact")]
        public Input<int>? SendLifeTimeExact { get; set; }

        /// <summary>
        /// Infinite lifetime
        /// </summary>
        [Input("sendLifeTimeInfinite")]
        public Input<bool>? SendLifeTimeInfinite { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("sendLifeTimeInfiniteVariable")]
        public Input<string>? SendLifeTimeInfiniteVariable { get; set; }

        /// <summary>
        /// Configure Send lifetime Local
        ///   - Default value: `false`
        /// </summary>
        [Input("sendLifeTimeLocal")]
        public Input<bool>? SendLifeTimeLocal { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("sendLifeTimeLocalVariable")]
        public Input<string>? SendLifeTimeLocalVariable { get; set; }

        /// <summary>
        /// Configure Key lifetime start time
        /// </summary>
        [Input("sendLifeTimeStartEpoch")]
        public Input<int>? SendLifeTimeStartEpoch { get; set; }

        public SystemSecurityFeatureKeyGetArgs()
        {
        }
        public static new SystemSecurityFeatureKeyGetArgs Empty => new SystemSecurityFeatureKeyGetArgs();
    }
}
