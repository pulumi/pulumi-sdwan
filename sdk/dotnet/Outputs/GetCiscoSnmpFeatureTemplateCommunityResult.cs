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
    public sealed class GetCiscoSnmpFeatureTemplateCommunityResult
    {
        /// <summary>
        /// Configure access permissions
        /// </summary>
        public readonly string Authorization;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string AuthorizationVariable;
        /// <summary>
        /// Set name of the SNMP community
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        public readonly bool Optional;
        /// <summary>
        /// Set name of the SNMP view
        /// </summary>
        public readonly string View;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ViewVariable;

        [OutputConstructor]
        private GetCiscoSnmpFeatureTemplateCommunityResult(
            string authorization,

            string authorizationVariable,

            string name,

            bool optional,

            string view,

            string viewVariable)
        {
            Authorization = authorization;
            AuthorizationVariable = authorizationVariable;
            Name = name;
            Optional = optional;
            View = view;
            ViewVariable = viewVariable;
        }
    }
}
