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
    public sealed class ConfigurationGroupDevice
    {
        /// <summary>
        /// Deploy to device if enabled.
        ///   - Default value: `false`
        /// </summary>
        public readonly bool? Deploy;
        /// <summary>
        /// Device ID
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// List of variables
        /// </summary>
        public readonly ImmutableArray<Outputs.ConfigurationGroupDeviceVariable> Variables;

        [OutputConstructor]
        private ConfigurationGroupDevice(
            bool? deploy,

            string? id,

            ImmutableArray<Outputs.ConfigurationGroupDeviceVariable> variables)
        {
            Deploy = deploy;
            Id = id;
            Variables = variables;
        }
    }
}
