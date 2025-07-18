// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    /// <summary>
    /// This resource can manage a Cisco OSPF feature template.
    ///   - Minimum SD-WAN Manager version: `15.0.0`
    /// 
    /// ## Import
    /// 
    /// The `pulumi import` command can be used, for example:
    /// 
    /// ```sh
    /// $ pulumi import sdwan:index/ciscoOspfFeatureTemplate:CiscoOspfFeatureTemplate example "f6b2c44c-693c-4763-b010-895aa3d236bd"
    /// ```
    /// </summary>
    [SdwanResourceType("sdwan:index/ciscoOspfFeatureTemplate:CiscoOspfFeatureTemplate")]
    public partial class CiscoOspfFeatureTemplate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Configure OSPF area
        /// </summary>
        [Output("areas")]
        public Output<ImmutableArray<Outputs.CiscoOspfFeatureTemplateArea>> Areas { get; private set; } = null!;

        /// <summary>
        /// Set reference bandwidth method to assign OSPF cost - Range: `1`-`4294967` - Default value: `100`
        /// </summary>
        [Output("autoCostReferenceBandwidth")]
        public Output<int?> AutoCostReferenceBandwidth { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("autoCostReferenceBandwidthVariable")]
        public Output<string?> AutoCostReferenceBandwidthVariable { get; private set; } = null!;

        /// <summary>
        /// Calculate summary route cost based on RFC 1583 - Default value: `true`
        /// </summary>
        [Output("compatibleRfc1583")]
        public Output<bool?> CompatibleRfc1583 { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("compatibleRfc1583Variable")]
        public Output<string?> CompatibleRfc1583Variable { get; private set; } = null!;

        /// <summary>
        /// Distribute default external route into OSPF - Default value: `false`
        /// </summary>
        [Output("defaultInformationOriginate")]
        public Output<bool?> DefaultInformationOriginate { get; private set; } = null!;

        /// <summary>
        /// Always advertise default route - Default value: `false`
        /// </summary>
        [Output("defaultInformationOriginateAlways")]
        public Output<bool?> DefaultInformationOriginateAlways { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("defaultInformationOriginateAlwaysVariable")]
        public Output<string?> DefaultInformationOriginateAlwaysVariable { get; private set; } = null!;

        /// <summary>
        /// Set metric used to generate default route &lt;0..16777214&gt; - Range: `0`-`16777214`
        /// </summary>
        [Output("defaultInformationOriginateMetric")]
        public Output<int?> DefaultInformationOriginateMetric { get; private set; } = null!;

        /// <summary>
        /// Set default route type - Choices: `type1`, `type2`
        /// </summary>
        [Output("defaultInformationOriginateMetricType")]
        public Output<string?> DefaultInformationOriginateMetricType { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("defaultInformationOriginateMetricTypeVariable")]
        public Output<string?> DefaultInformationOriginateMetricTypeVariable { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("defaultInformationOriginateMetricVariable")]
        public Output<string?> DefaultInformationOriginateMetricVariable { get; private set; } = null!;

        /// <summary>
        /// The description of the feature template
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
        /// `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
        /// `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
        /// </summary>
        [Output("deviceTypes")]
        public Output<ImmutableArray<string>> DeviceTypes { get; private set; } = null!;

        /// <summary>
        /// Set distance for external routes - Range: `1`-`255` - Default value: `110`
        /// </summary>
        [Output("distanceExternal")]
        public Output<int?> DistanceExternal { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("distanceExternalVariable")]
        public Output<string?> DistanceExternalVariable { get; private set; } = null!;

        /// <summary>
        /// Set distance for inter-area routes - Range: `1`-`255` - Default value: `110`
        /// </summary>
        [Output("distanceInterArea")]
        public Output<int?> DistanceInterArea { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("distanceInterAreaVariable")]
        public Output<string?> DistanceInterAreaVariable { get; private set; } = null!;

        /// <summary>
        /// Set distance for intra-area routes - Range: `1`-`255` - Default value: `110`
        /// </summary>
        [Output("distanceIntraArea")]
        public Output<int?> DistanceIntraArea { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("distanceIntraAreaVariable")]
        public Output<string?> DistanceIntraAreaVariable { get; private set; } = null!;

        /// <summary>
        /// Advertise own router LSA with infinite distance
        /// </summary>
        [Output("maxMetricRouterLsas")]
        public Output<ImmutableArray<Outputs.CiscoOspfFeatureTemplateMaxMetricRouterLsa>> MaxMetricRouterLsas { get; private set; } = null!;

        /// <summary>
        /// The name of the feature template
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Redistribute routes
        /// </summary>
        [Output("redistributes")]
        public Output<ImmutableArray<Outputs.CiscoOspfFeatureTemplateRedistribute>> Redistributes { get; private set; } = null!;

        /// <summary>
        /// Set route policy to apply
        /// </summary>
        [Output("routePolicies")]
        public Output<ImmutableArray<Outputs.CiscoOspfFeatureTemplateRoutePolicy>> RoutePolicies { get; private set; } = null!;

        /// <summary>
        /// Set OSPF router ID to override system IP address
        /// </summary>
        [Output("routerId")]
        public Output<string?> RouterId { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("routerIdVariable")]
        public Output<string?> RouterIdVariable { get; private set; } = null!;

        /// <summary>
        /// The template type
        /// </summary>
        [Output("templateType")]
        public Output<string> TemplateType { get; private set; } = null!;

        /// <summary>
        /// Set delay from first change received until performing SPF calculation - Range: `1`-`600000` - Default value: `200`
        /// </summary>
        [Output("timersSpfDelay")]
        public Output<int?> TimersSpfDelay { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("timersSpfDelayVariable")]
        public Output<string?> TimersSpfDelayVariable { get; private set; } = null!;

        /// <summary>
        /// Set initial hold time between consecutive SPF calculations - Range: `1`-`600000` - Default value: `1000`
        /// </summary>
        [Output("timersSpfInitialHold")]
        public Output<int?> TimersSpfInitialHold { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("timersSpfInitialHoldVariable")]
        public Output<string?> TimersSpfInitialHoldVariable { get; private set; } = null!;

        /// <summary>
        /// Set maximum hold time between consecutive SPF calculations - Range: `1`-`600000` - Default value: `10000`
        /// </summary>
        [Output("timersSpfMaxHold")]
        public Output<int?> TimersSpfMaxHold { get; private set; } = null!;

        /// <summary>
        /// Variable name
        /// </summary>
        [Output("timersSpfMaxHoldVariable")]
        public Output<string?> TimersSpfMaxHoldVariable { get; private set; } = null!;

        /// <summary>
        /// The version of the feature template
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a CiscoOspfFeatureTemplate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CiscoOspfFeatureTemplate(string name, CiscoOspfFeatureTemplateArgs args, CustomResourceOptions? options = null)
            : base("sdwan:index/ciscoOspfFeatureTemplate:CiscoOspfFeatureTemplate", name, args ?? new CiscoOspfFeatureTemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CiscoOspfFeatureTemplate(string name, Input<string> id, CiscoOspfFeatureTemplateState? state = null, CustomResourceOptions? options = null)
            : base("sdwan:index/ciscoOspfFeatureTemplate:CiscoOspfFeatureTemplate", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing CiscoOspfFeatureTemplate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CiscoOspfFeatureTemplate Get(string name, Input<string> id, CiscoOspfFeatureTemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new CiscoOspfFeatureTemplate(name, id, state, options);
        }
    }

    public sealed class CiscoOspfFeatureTemplateArgs : global::Pulumi.ResourceArgs
    {
        [Input("areas")]
        private InputList<Inputs.CiscoOspfFeatureTemplateAreaArgs>? _areas;

        /// <summary>
        /// Configure OSPF area
        /// </summary>
        public InputList<Inputs.CiscoOspfFeatureTemplateAreaArgs> Areas
        {
            get => _areas ?? (_areas = new InputList<Inputs.CiscoOspfFeatureTemplateAreaArgs>());
            set => _areas = value;
        }

        /// <summary>
        /// Set reference bandwidth method to assign OSPF cost - Range: `1`-`4294967` - Default value: `100`
        /// </summary>
        [Input("autoCostReferenceBandwidth")]
        public Input<int>? AutoCostReferenceBandwidth { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("autoCostReferenceBandwidthVariable")]
        public Input<string>? AutoCostReferenceBandwidthVariable { get; set; }

        /// <summary>
        /// Calculate summary route cost based on RFC 1583 - Default value: `true`
        /// </summary>
        [Input("compatibleRfc1583")]
        public Input<bool>? CompatibleRfc1583 { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("compatibleRfc1583Variable")]
        public Input<string>? CompatibleRfc1583Variable { get; set; }

        /// <summary>
        /// Distribute default external route into OSPF - Default value: `false`
        /// </summary>
        [Input("defaultInformationOriginate")]
        public Input<bool>? DefaultInformationOriginate { get; set; }

        /// <summary>
        /// Always advertise default route - Default value: `false`
        /// </summary>
        [Input("defaultInformationOriginateAlways")]
        public Input<bool>? DefaultInformationOriginateAlways { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("defaultInformationOriginateAlwaysVariable")]
        public Input<string>? DefaultInformationOriginateAlwaysVariable { get; set; }

        /// <summary>
        /// Set metric used to generate default route &lt;0..16777214&gt; - Range: `0`-`16777214`
        /// </summary>
        [Input("defaultInformationOriginateMetric")]
        public Input<int>? DefaultInformationOriginateMetric { get; set; }

        /// <summary>
        /// Set default route type - Choices: `type1`, `type2`
        /// </summary>
        [Input("defaultInformationOriginateMetricType")]
        public Input<string>? DefaultInformationOriginateMetricType { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("defaultInformationOriginateMetricTypeVariable")]
        public Input<string>? DefaultInformationOriginateMetricTypeVariable { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("defaultInformationOriginateMetricVariable")]
        public Input<string>? DefaultInformationOriginateMetricVariable { get; set; }

        /// <summary>
        /// The description of the feature template
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        [Input("deviceTypes", required: true)]
        private InputList<string>? _deviceTypes;

        /// <summary>
        /// List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
        /// `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
        /// `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
        /// </summary>
        public InputList<string> DeviceTypes
        {
            get => _deviceTypes ?? (_deviceTypes = new InputList<string>());
            set => _deviceTypes = value;
        }

        /// <summary>
        /// Set distance for external routes - Range: `1`-`255` - Default value: `110`
        /// </summary>
        [Input("distanceExternal")]
        public Input<int>? DistanceExternal { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("distanceExternalVariable")]
        public Input<string>? DistanceExternalVariable { get; set; }

        /// <summary>
        /// Set distance for inter-area routes - Range: `1`-`255` - Default value: `110`
        /// </summary>
        [Input("distanceInterArea")]
        public Input<int>? DistanceInterArea { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("distanceInterAreaVariable")]
        public Input<string>? DistanceInterAreaVariable { get; set; }

        /// <summary>
        /// Set distance for intra-area routes - Range: `1`-`255` - Default value: `110`
        /// </summary>
        [Input("distanceIntraArea")]
        public Input<int>? DistanceIntraArea { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("distanceIntraAreaVariable")]
        public Input<string>? DistanceIntraAreaVariable { get; set; }

        [Input("maxMetricRouterLsas")]
        private InputList<Inputs.CiscoOspfFeatureTemplateMaxMetricRouterLsaArgs>? _maxMetricRouterLsas;

        /// <summary>
        /// Advertise own router LSA with infinite distance
        /// </summary>
        public InputList<Inputs.CiscoOspfFeatureTemplateMaxMetricRouterLsaArgs> MaxMetricRouterLsas
        {
            get => _maxMetricRouterLsas ?? (_maxMetricRouterLsas = new InputList<Inputs.CiscoOspfFeatureTemplateMaxMetricRouterLsaArgs>());
            set => _maxMetricRouterLsas = value;
        }

        /// <summary>
        /// The name of the feature template
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("redistributes")]
        private InputList<Inputs.CiscoOspfFeatureTemplateRedistributeArgs>? _redistributes;

        /// <summary>
        /// Redistribute routes
        /// </summary>
        public InputList<Inputs.CiscoOspfFeatureTemplateRedistributeArgs> Redistributes
        {
            get => _redistributes ?? (_redistributes = new InputList<Inputs.CiscoOspfFeatureTemplateRedistributeArgs>());
            set => _redistributes = value;
        }

        [Input("routePolicies")]
        private InputList<Inputs.CiscoOspfFeatureTemplateRoutePolicyArgs>? _routePolicies;

        /// <summary>
        /// Set route policy to apply
        /// </summary>
        public InputList<Inputs.CiscoOspfFeatureTemplateRoutePolicyArgs> RoutePolicies
        {
            get => _routePolicies ?? (_routePolicies = new InputList<Inputs.CiscoOspfFeatureTemplateRoutePolicyArgs>());
            set => _routePolicies = value;
        }

        /// <summary>
        /// Set OSPF router ID to override system IP address
        /// </summary>
        [Input("routerId")]
        public Input<string>? RouterId { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("routerIdVariable")]
        public Input<string>? RouterIdVariable { get; set; }

        /// <summary>
        /// Set delay from first change received until performing SPF calculation - Range: `1`-`600000` - Default value: `200`
        /// </summary>
        [Input("timersSpfDelay")]
        public Input<int>? TimersSpfDelay { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("timersSpfDelayVariable")]
        public Input<string>? TimersSpfDelayVariable { get; set; }

        /// <summary>
        /// Set initial hold time between consecutive SPF calculations - Range: `1`-`600000` - Default value: `1000`
        /// </summary>
        [Input("timersSpfInitialHold")]
        public Input<int>? TimersSpfInitialHold { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("timersSpfInitialHoldVariable")]
        public Input<string>? TimersSpfInitialHoldVariable { get; set; }

        /// <summary>
        /// Set maximum hold time between consecutive SPF calculations - Range: `1`-`600000` - Default value: `10000`
        /// </summary>
        [Input("timersSpfMaxHold")]
        public Input<int>? TimersSpfMaxHold { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("timersSpfMaxHoldVariable")]
        public Input<string>? TimersSpfMaxHoldVariable { get; set; }

        public CiscoOspfFeatureTemplateArgs()
        {
        }
        public static new CiscoOspfFeatureTemplateArgs Empty => new CiscoOspfFeatureTemplateArgs();
    }

    public sealed class CiscoOspfFeatureTemplateState : global::Pulumi.ResourceArgs
    {
        [Input("areas")]
        private InputList<Inputs.CiscoOspfFeatureTemplateAreaGetArgs>? _areas;

        /// <summary>
        /// Configure OSPF area
        /// </summary>
        public InputList<Inputs.CiscoOspfFeatureTemplateAreaGetArgs> Areas
        {
            get => _areas ?? (_areas = new InputList<Inputs.CiscoOspfFeatureTemplateAreaGetArgs>());
            set => _areas = value;
        }

        /// <summary>
        /// Set reference bandwidth method to assign OSPF cost - Range: `1`-`4294967` - Default value: `100`
        /// </summary>
        [Input("autoCostReferenceBandwidth")]
        public Input<int>? AutoCostReferenceBandwidth { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("autoCostReferenceBandwidthVariable")]
        public Input<string>? AutoCostReferenceBandwidthVariable { get; set; }

        /// <summary>
        /// Calculate summary route cost based on RFC 1583 - Default value: `true`
        /// </summary>
        [Input("compatibleRfc1583")]
        public Input<bool>? CompatibleRfc1583 { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("compatibleRfc1583Variable")]
        public Input<string>? CompatibleRfc1583Variable { get; set; }

        /// <summary>
        /// Distribute default external route into OSPF - Default value: `false`
        /// </summary>
        [Input("defaultInformationOriginate")]
        public Input<bool>? DefaultInformationOriginate { get; set; }

        /// <summary>
        /// Always advertise default route - Default value: `false`
        /// </summary>
        [Input("defaultInformationOriginateAlways")]
        public Input<bool>? DefaultInformationOriginateAlways { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("defaultInformationOriginateAlwaysVariable")]
        public Input<string>? DefaultInformationOriginateAlwaysVariable { get; set; }

        /// <summary>
        /// Set metric used to generate default route &lt;0..16777214&gt; - Range: `0`-`16777214`
        /// </summary>
        [Input("defaultInformationOriginateMetric")]
        public Input<int>? DefaultInformationOriginateMetric { get; set; }

        /// <summary>
        /// Set default route type - Choices: `type1`, `type2`
        /// </summary>
        [Input("defaultInformationOriginateMetricType")]
        public Input<string>? DefaultInformationOriginateMetricType { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("defaultInformationOriginateMetricTypeVariable")]
        public Input<string>? DefaultInformationOriginateMetricTypeVariable { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("defaultInformationOriginateMetricVariable")]
        public Input<string>? DefaultInformationOriginateMetricVariable { get; set; }

        /// <summary>
        /// The description of the feature template
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("deviceTypes")]
        private InputList<string>? _deviceTypes;

        /// <summary>
        /// List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
        /// `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
        /// `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
        /// </summary>
        public InputList<string> DeviceTypes
        {
            get => _deviceTypes ?? (_deviceTypes = new InputList<string>());
            set => _deviceTypes = value;
        }

        /// <summary>
        /// Set distance for external routes - Range: `1`-`255` - Default value: `110`
        /// </summary>
        [Input("distanceExternal")]
        public Input<int>? DistanceExternal { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("distanceExternalVariable")]
        public Input<string>? DistanceExternalVariable { get; set; }

        /// <summary>
        /// Set distance for inter-area routes - Range: `1`-`255` - Default value: `110`
        /// </summary>
        [Input("distanceInterArea")]
        public Input<int>? DistanceInterArea { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("distanceInterAreaVariable")]
        public Input<string>? DistanceInterAreaVariable { get; set; }

        /// <summary>
        /// Set distance for intra-area routes - Range: `1`-`255` - Default value: `110`
        /// </summary>
        [Input("distanceIntraArea")]
        public Input<int>? DistanceIntraArea { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("distanceIntraAreaVariable")]
        public Input<string>? DistanceIntraAreaVariable { get; set; }

        [Input("maxMetricRouterLsas")]
        private InputList<Inputs.CiscoOspfFeatureTemplateMaxMetricRouterLsaGetArgs>? _maxMetricRouterLsas;

        /// <summary>
        /// Advertise own router LSA with infinite distance
        /// </summary>
        public InputList<Inputs.CiscoOspfFeatureTemplateMaxMetricRouterLsaGetArgs> MaxMetricRouterLsas
        {
            get => _maxMetricRouterLsas ?? (_maxMetricRouterLsas = new InputList<Inputs.CiscoOspfFeatureTemplateMaxMetricRouterLsaGetArgs>());
            set => _maxMetricRouterLsas = value;
        }

        /// <summary>
        /// The name of the feature template
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("redistributes")]
        private InputList<Inputs.CiscoOspfFeatureTemplateRedistributeGetArgs>? _redistributes;

        /// <summary>
        /// Redistribute routes
        /// </summary>
        public InputList<Inputs.CiscoOspfFeatureTemplateRedistributeGetArgs> Redistributes
        {
            get => _redistributes ?? (_redistributes = new InputList<Inputs.CiscoOspfFeatureTemplateRedistributeGetArgs>());
            set => _redistributes = value;
        }

        [Input("routePolicies")]
        private InputList<Inputs.CiscoOspfFeatureTemplateRoutePolicyGetArgs>? _routePolicies;

        /// <summary>
        /// Set route policy to apply
        /// </summary>
        public InputList<Inputs.CiscoOspfFeatureTemplateRoutePolicyGetArgs> RoutePolicies
        {
            get => _routePolicies ?? (_routePolicies = new InputList<Inputs.CiscoOspfFeatureTemplateRoutePolicyGetArgs>());
            set => _routePolicies = value;
        }

        /// <summary>
        /// Set OSPF router ID to override system IP address
        /// </summary>
        [Input("routerId")]
        public Input<string>? RouterId { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("routerIdVariable")]
        public Input<string>? RouterIdVariable { get; set; }

        /// <summary>
        /// The template type
        /// </summary>
        [Input("templateType")]
        public Input<string>? TemplateType { get; set; }

        /// <summary>
        /// Set delay from first change received until performing SPF calculation - Range: `1`-`600000` - Default value: `200`
        /// </summary>
        [Input("timersSpfDelay")]
        public Input<int>? TimersSpfDelay { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("timersSpfDelayVariable")]
        public Input<string>? TimersSpfDelayVariable { get; set; }

        /// <summary>
        /// Set initial hold time between consecutive SPF calculations - Range: `1`-`600000` - Default value: `1000`
        /// </summary>
        [Input("timersSpfInitialHold")]
        public Input<int>? TimersSpfInitialHold { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("timersSpfInitialHoldVariable")]
        public Input<string>? TimersSpfInitialHoldVariable { get; set; }

        /// <summary>
        /// Set maximum hold time between consecutive SPF calculations - Range: `1`-`600000` - Default value: `10000`
        /// </summary>
        [Input("timersSpfMaxHold")]
        public Input<int>? TimersSpfMaxHold { get; set; }

        /// <summary>
        /// Variable name
        /// </summary>
        [Input("timersSpfMaxHoldVariable")]
        public Input<string>? TimersSpfMaxHoldVariable { get; set; }

        /// <summary>
        /// The version of the feature template
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public CiscoOspfFeatureTemplateState()
        {
        }
        public static new CiscoOspfFeatureTemplateState Empty => new CiscoOspfFeatureTemplateState();
    }
}
