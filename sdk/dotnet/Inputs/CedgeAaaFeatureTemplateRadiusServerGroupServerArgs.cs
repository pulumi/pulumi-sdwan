// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class CedgeAaaFeatureTemplateRadiusServerGroupServerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set Accounting port to use to connect to Radius server
        ///   - Range: `1`-`65534`
        ///   - Default value: `1813`
        /// </summary>
        [Input("accountingPort")]
        public Input<int>? AccountingPort { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("accountingPortVariable")]
        public Input<string>? AccountingPortVariable { get; set; }

        /// <summary>
        /// Set IP address of Radius server
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// Set Authentication port to use to connect to Radius server
        ///   - Range: `1`-`65534`
        ///   - Default value: `1812`
        /// </summary>
        [Input("authenticationPort")]
        public Input<int>? AuthenticationPort { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("authenticationPortVariable")]
        public Input<string>? AuthenticationPortVariable { get; set; }

        /// <summary>
        /// Type of encyption. To be used for type 6
        ///   - Choices: `6`, `7`
        /// </summary>
        [Input("encryptionType")]
        public Input<string>? EncryptionType { get; set; }

        /// <summary>
        /// Set the Radius server shared key
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// key type
        ///   - Choices: `key`, `pac`
        ///   - Default value: `key`
        /// </summary>
        [Input("keyType")]
        public Input<string>? KeyType { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("keyTypeVariable")]
        public Input<string>? KeyTypeVariable { get; set; }

        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        [Input("optional")]
        public Input<bool>? Optional { get; set; }

        /// <summary>
        /// Configure how many times to contact this Radius server
        ///   - Range: `1`-`100`
        ///   - Default value: `3`
        /// </summary>
        [Input("retransmit")]
        public Input<int>? Retransmit { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("retransmitVariable")]
        public Input<string>? RetransmitVariable { get; set; }

        /// <summary>
        /// Set the Radius server shared type 7 encrypted key
        /// </summary>
        [Input("secretKey")]
        public Input<string>? SecretKey { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("secretKeyVariable")]
        public Input<string>? SecretKeyVariable { get; set; }

        /// <summary>
        /// Configure how long to wait for replies from the Radius server
        ///   - Range: `1`-`1000`
        ///   - Default value: `5`
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("timeoutVariable")]
        public Input<string>? TimeoutVariable { get; set; }

        public CedgeAaaFeatureTemplateRadiusServerGroupServerArgs()
        {
        }
        public static new CedgeAaaFeatureTemplateRadiusServerGroupServerArgs Empty => new CedgeAaaFeatureTemplateRadiusServerGroupServerArgs();
    }
}
