// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Outputs
{

    [OutputType]
    public sealed class PolicyObjectColorListEntry
    {
        /// <summary>
        /// - Choices: `3g`, `biz-internet`, `blue`, `bronze`, `custom1`, `custom2`, `custom3`, `default`, `gold`, `green`, `lte`, `metro-ethernet`, `mpls`, `private1`, `private2`, `private3`, `private4`, `private5`, `private6`, `public-internet`, `red`, `silver`
        /// </summary>
        public readonly string? Color;

        [OutputConstructor]
        private PolicyObjectColorListEntry(string? color)
        {
            Color = color;
        }
    }
}