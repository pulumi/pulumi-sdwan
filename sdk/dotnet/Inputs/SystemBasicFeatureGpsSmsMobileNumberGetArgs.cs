// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class SystemBasicFeatureGpsSmsMobileNumberGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Mobile number, ex: 1231234414
        /// </summary>
        [Input("number")]
        public Input<string>? Number { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("numberVariable")]
        public Input<string>? NumberVariable { get; set; }

        public SystemBasicFeatureGpsSmsMobileNumberGetArgs()
        {
        }
        public static new SystemBasicFeatureGpsSmsMobileNumberGetArgs Empty => new SystemBasicFeatureGpsSmsMobileNumberGetArgs();
    }
}