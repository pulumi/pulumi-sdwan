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
    public sealed class GetCiscoSystemFeatureTemplateObjectTrackerGroupTracksIdResult
    {
        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        public readonly bool Optional;
        /// <summary>
        /// Track id
        /// </summary>
        public readonly int TrackId;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TrackIdVariable;

        [OutputConstructor]
        private GetCiscoSystemFeatureTemplateObjectTrackerGroupTracksIdResult(
            bool optional,

            int trackId,

            string trackIdVariable)
        {
            Optional = optional;
            TrackId = trackId;
            TrackIdVariable = trackIdVariable;
        }
    }
}
