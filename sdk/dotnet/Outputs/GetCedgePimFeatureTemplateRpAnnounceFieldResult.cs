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
    public sealed class GetCedgePimFeatureTemplateRpAnnounceFieldResult
    {
        /// <summary>
        /// Set RP Announce Interface Name
        /// </summary>
        public readonly string InterfaceName;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string InterfaceNameVariable;
        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        public readonly bool Optional;
        /// <summary>
        /// Set RP Announce Scope
        /// </summary>
        public readonly int Scope;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ScopeVariable;

        [OutputConstructor]
        private GetCedgePimFeatureTemplateRpAnnounceFieldResult(
            string interfaceName,

            string interfaceNameVariable,

            bool optional,

            int scope,

            string scopeVariable)
        {
            InterfaceName = interfaceName;
            InterfaceNameVariable = interfaceNameVariable;
            Optional = optional;
            Scope = scope;
            ScopeVariable = scopeVariable;
        }
    }
}
