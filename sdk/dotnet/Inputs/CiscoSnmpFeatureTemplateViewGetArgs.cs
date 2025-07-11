// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Inputs
{

    public sealed class CiscoSnmpFeatureTemplateViewGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set the name of the SNMP view
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("objectIdentifiers")]
        private InputList<Inputs.CiscoSnmpFeatureTemplateViewObjectIdentifierGetArgs>? _objectIdentifiers;

        /// <summary>
        /// Configure SNMP object identifier
        /// </summary>
        public InputList<Inputs.CiscoSnmpFeatureTemplateViewObjectIdentifierGetArgs> ObjectIdentifiers
        {
            get => _objectIdentifiers ?? (_objectIdentifiers = new InputList<Inputs.CiscoSnmpFeatureTemplateViewObjectIdentifierGetArgs>());
            set => _objectIdentifiers = value;
        }

        /// <summary>
        /// Indicates if list item is considered optional.
        /// </summary>
        [Input("optional")]
        public Input<bool>? Optional { get; set; }

        public CiscoSnmpFeatureTemplateViewGetArgs()
        {
        }
        public static new CiscoSnmpFeatureTemplateViewGetArgs Empty => new CiscoSnmpFeatureTemplateViewGetArgs();
    }
}
