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
    public sealed class GetServiceRoutingOspfFeatureRouterLsaResult
    {
        /// <summary>
        /// Set how long to advertise maximum metric after router starts up
        /// </summary>
        public readonly int Time;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TimeVariable;
        /// <summary>
        /// Set the router LSA advertisement type
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetServiceRoutingOspfFeatureRouterLsaResult(
            int time,

            string timeVariable,

            string type)
        {
            Time = time;
            TimeVariable = timeVariable;
            Type = type;
        }
    }
}