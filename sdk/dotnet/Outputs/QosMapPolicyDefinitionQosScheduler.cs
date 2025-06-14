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
    public sealed class QosMapPolicyDefinitionQosScheduler
    {
        /// <summary>
        /// Bandwidth percent
        ///   - Range: `0`-`100`
        /// </summary>
        public readonly int BandwidthPercent;
        /// <summary>
        /// Buffer percent
        ///   - Range: `0`-`100`
        /// </summary>
        public readonly int BufferPercent;
        /// <summary>
        /// Burst size
        ///   - Range: `5000`-`10000000`
        /// </summary>
        public readonly int? Burst;
        /// <summary>
        /// Class map ID
        /// </summary>
        public readonly string ClassMapId;
        /// <summary>
        /// Class map version
        /// </summary>
        public readonly int? ClassMapVersion;
        /// <summary>
        /// Drop type
        ///   - Choices: `tail-drop`, `red-drop`
        /// </summary>
        public readonly string DropType;
        /// <summary>
        /// Queue number
        ///   - Range: `0`-`7`
        /// </summary>
        public readonly int Queue;
        /// <summary>
        /// Scheduling type
        ///   - Choices: `llq`, `wrr`
        /// </summary>
        public readonly string SchedulingType;

        [OutputConstructor]
        private QosMapPolicyDefinitionQosScheduler(
            int bandwidthPercent,

            int bufferPercent,

            int? burst,

            string classMapId,

            int? classMapVersion,

            string dropType,

            int queue,

            string schedulingType)
        {
            BandwidthPercent = bandwidthPercent;
            BufferPercent = bufferPercent;
            Burst = burst;
            ClassMapId = classMapId;
            ClassMapVersion = classMapVersion;
            DropType = dropType;
            Queue = queue;
            SchedulingType = schedulingType;
        }
    }
}
