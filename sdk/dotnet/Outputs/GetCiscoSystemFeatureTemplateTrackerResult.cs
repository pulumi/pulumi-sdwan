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
    public sealed class GetCiscoSystemFeatureTemplateTrackerResult
    {
        /// <summary>
        /// Type of grouping to be performed for tracker group
        /// </summary>
        public readonly string Boolean;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string BooleanVariable;
        /// <summary>
        /// Tracker member names separated by space
        /// </summary>
        public readonly ImmutableArray<string> Elements;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ElementsVariable;
        /// <summary>
        /// API url of endpoint
        /// </summary>
        public readonly string EndpointApiUrl;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string EndpointApiUrlVariable;
        /// <summary>
        /// DNS name of endpoint
        /// </summary>
        public readonly string EndpointDnsName;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string EndpointDnsNameVariable;
        /// <summary>
        /// IP address of endpoint
        /// </summary>
        public readonly string EndpointIp;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string EndpointIpVariable;
        /// <summary>
        /// Probe interval \n\n seconds
        /// </summary>
        public readonly int Interval;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string IntervalVariable;
        /// <summary>
        /// Probe failure multiplier \n\n failed attempts
        /// </summary>
        public readonly int Multiplier;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string MultiplierVariable;
        /// <summary>
        /// Tracker name
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string NameVariable;
        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        public readonly bool Optional;
        /// <summary>
        /// Probe Timeout threshold \n\n milliseconds
        /// </summary>
        public readonly int Threshold;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ThresholdVariable;
        /// <summary>
        /// Default(Interface)
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TypeVariable;

        [OutputConstructor]
        private GetCiscoSystemFeatureTemplateTrackerResult(
            string boolean,

            string booleanVariable,

            ImmutableArray<string> elements,

            string elementsVariable,

            string endpointApiUrl,

            string endpointApiUrlVariable,

            string endpointDnsName,

            string endpointDnsNameVariable,

            string endpointIp,

            string endpointIpVariable,

            int interval,

            string intervalVariable,

            int multiplier,

            string multiplierVariable,

            string name,

            string nameVariable,

            bool optional,

            int threshold,

            string thresholdVariable,

            string type,

            string typeVariable)
        {
            Boolean = boolean;
            BooleanVariable = booleanVariable;
            Elements = elements;
            ElementsVariable = elementsVariable;
            EndpointApiUrl = endpointApiUrl;
            EndpointApiUrlVariable = endpointApiUrlVariable;
            EndpointDnsName = endpointDnsName;
            EndpointDnsNameVariable = endpointDnsNameVariable;
            EndpointIp = endpointIp;
            EndpointIpVariable = endpointIpVariable;
            Interval = interval;
            IntervalVariable = intervalVariable;
            Multiplier = multiplier;
            MultiplierVariable = multiplierVariable;
            Name = name;
            NameVariable = nameVariable;
            Optional = optional;
            Threshold = threshold;
            ThresholdVariable = thresholdVariable;
            Type = type;
            TypeVariable = typeVariable;
        }
    }
}
