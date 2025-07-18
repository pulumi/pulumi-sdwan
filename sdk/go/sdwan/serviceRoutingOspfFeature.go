// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource can manage a Service Routing OSPF Feature.
//   - Minimum SD-WAN Manager version: `20.12.0`
//
// ## Import
//
// The `pulumi import` command can be used, for example:
//
// Expected import identifier with the format: "service_routing_ospf_feature_id,feature_profile_id"
//
// ```sh
// $ pulumi import sdwan:index/serviceRoutingOspfFeature:ServiceRoutingOspfFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"
// ```
type ServiceRoutingOspfFeature struct {
	pulumi.CustomResourceState

	// Configure OSPF area
	Areas ServiceRoutingOspfFeatureAreaArrayOutput `pulumi:"areas"`
	// Distribute default external route into OSPF - Default value: `false`
	DefaultInformationOriginate pulumi.BoolPtrOutput `pulumi:"defaultInformationOriginate"`
	// Always advertise default route - Default value: `false`
	DefaultInformationOriginateAlways pulumi.BoolPtrOutput `pulumi:"defaultInformationOriginateAlways"`
	// Variable name
	DefaultInformationOriginateAlwaysVariable pulumi.StringPtrOutput `pulumi:"defaultInformationOriginateAlwaysVariable"`
	// Set metric used to generate default route <0..16777214> - Range: `0`-`16777214`
	DefaultInformationOriginateMetric pulumi.IntPtrOutput `pulumi:"defaultInformationOriginateMetric"`
	// Set default route type - Choices: `type1`, `type2`
	DefaultInformationOriginateMetricType pulumi.StringPtrOutput `pulumi:"defaultInformationOriginateMetricType"`
	// Variable name
	DefaultInformationOriginateMetricTypeVariable pulumi.StringPtrOutput `pulumi:"defaultInformationOriginateMetricTypeVariable"`
	// Variable name
	DefaultInformationOriginateMetricVariable pulumi.StringPtrOutput `pulumi:"defaultInformationOriginateMetricVariable"`
	// The description of the Feature
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Set distance for external routes - Range: `1`-`255` - Default value: `110`
	DistanceExternal pulumi.IntPtrOutput `pulumi:"distanceExternal"`
	// Variable name
	DistanceExternalVariable pulumi.StringPtrOutput `pulumi:"distanceExternalVariable"`
	// Set distance for inter-area routes - Range: `1`-`255` - Default value: `110`
	DistanceInterArea pulumi.IntPtrOutput `pulumi:"distanceInterArea"`
	// Variable name
	DistanceInterAreaVariable pulumi.StringPtrOutput `pulumi:"distanceInterAreaVariable"`
	// Set distance for intra-area routes - Range: `1`-`255` - Default value: `110`
	DistanceIntraArea pulumi.IntPtrOutput `pulumi:"distanceIntraArea"`
	// Variable name
	DistanceIntraAreaVariable pulumi.StringPtrOutput `pulumi:"distanceIntraAreaVariable"`
	// Feature Profile ID
	FeatureProfileId pulumi.StringOutput `pulumi:"featureProfileId"`
	// The name of the Feature
	Name pulumi.StringOutput `pulumi:"name"`
	// Redistribute routes
	Redistributes ServiceRoutingOspfFeatureRedistributeArrayOutput `pulumi:"redistributes"`
	// Set reference bandwidth method to assign OSPF cost - Range: `1`-`4294967` - Default value: `100`
	ReferenceBandwidth pulumi.IntPtrOutput `pulumi:"referenceBandwidth"`
	// Variable name
	ReferenceBandwidthVariable pulumi.StringPtrOutput `pulumi:"referenceBandwidthVariable"`
	// Calculate summary route cost based on RFC 1583 - Default value: `true`
	Rfc1583Compatible pulumi.BoolPtrOutput `pulumi:"rfc1583Compatible"`
	// Variable name
	Rfc1583CompatibleVariable pulumi.StringPtrOutput `pulumi:"rfc1583CompatibleVariable"`
	RoutePolicyId             pulumi.StringPtrOutput `pulumi:"routePolicyId"`
	// Set OSPF router ID to override system IP address
	RouterId pulumi.StringPtrOutput `pulumi:"routerId"`
	// Variable name
	RouterIdVariable pulumi.StringPtrOutput `pulumi:"routerIdVariable"`
	// Advertise own router LSA with infinite distance
	RouterLsas ServiceRoutingOspfFeatureRouterLsaArrayOutput `pulumi:"routerLsas"`
	// Set delay from first change received until performing SPF calculation - Range: `1`-`600000` - Default value: `200`
	SpfCalculationDelay pulumi.IntPtrOutput `pulumi:"spfCalculationDelay"`
	// Variable name
	SpfCalculationDelayVariable pulumi.StringPtrOutput `pulumi:"spfCalculationDelayVariable"`
	// Set initial hold time between consecutive SPF calculations - Range: `1`-`600000` - Default value: `1000`
	SpfInitialHoldTime pulumi.IntPtrOutput `pulumi:"spfInitialHoldTime"`
	// Variable name
	SpfInitialHoldTimeVariable pulumi.StringPtrOutput `pulumi:"spfInitialHoldTimeVariable"`
	// Set maximum hold time between consecutive SPF calculations - Range: `1`-`600000` - Default value: `10000`
	SpfMaximumHoldTime pulumi.IntPtrOutput `pulumi:"spfMaximumHoldTime"`
	// Variable name
	SpfMaximumHoldTimeVariable pulumi.StringPtrOutput `pulumi:"spfMaximumHoldTimeVariable"`
	// The version of the Feature
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewServiceRoutingOspfFeature registers a new resource with the given unique name, arguments, and options.
func NewServiceRoutingOspfFeature(ctx *pulumi.Context,
	name string, args *ServiceRoutingOspfFeatureArgs, opts ...pulumi.ResourceOption) (*ServiceRoutingOspfFeature, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FeatureProfileId == nil {
		return nil, errors.New("invalid value for required argument 'FeatureProfileId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServiceRoutingOspfFeature
	err := ctx.RegisterResource("sdwan:index/serviceRoutingOspfFeature:ServiceRoutingOspfFeature", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceRoutingOspfFeature gets an existing ServiceRoutingOspfFeature resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceRoutingOspfFeature(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceRoutingOspfFeatureState, opts ...pulumi.ResourceOption) (*ServiceRoutingOspfFeature, error) {
	var resource ServiceRoutingOspfFeature
	err := ctx.ReadResource("sdwan:index/serviceRoutingOspfFeature:ServiceRoutingOspfFeature", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceRoutingOspfFeature resources.
type serviceRoutingOspfFeatureState struct {
	// Configure OSPF area
	Areas []ServiceRoutingOspfFeatureArea `pulumi:"areas"`
	// Distribute default external route into OSPF - Default value: `false`
	DefaultInformationOriginate *bool `pulumi:"defaultInformationOriginate"`
	// Always advertise default route - Default value: `false`
	DefaultInformationOriginateAlways *bool `pulumi:"defaultInformationOriginateAlways"`
	// Variable name
	DefaultInformationOriginateAlwaysVariable *string `pulumi:"defaultInformationOriginateAlwaysVariable"`
	// Set metric used to generate default route <0..16777214> - Range: `0`-`16777214`
	DefaultInformationOriginateMetric *int `pulumi:"defaultInformationOriginateMetric"`
	// Set default route type - Choices: `type1`, `type2`
	DefaultInformationOriginateMetricType *string `pulumi:"defaultInformationOriginateMetricType"`
	// Variable name
	DefaultInformationOriginateMetricTypeVariable *string `pulumi:"defaultInformationOriginateMetricTypeVariable"`
	// Variable name
	DefaultInformationOriginateMetricVariable *string `pulumi:"defaultInformationOriginateMetricVariable"`
	// The description of the Feature
	Description *string `pulumi:"description"`
	// Set distance for external routes - Range: `1`-`255` - Default value: `110`
	DistanceExternal *int `pulumi:"distanceExternal"`
	// Variable name
	DistanceExternalVariable *string `pulumi:"distanceExternalVariable"`
	// Set distance for inter-area routes - Range: `1`-`255` - Default value: `110`
	DistanceInterArea *int `pulumi:"distanceInterArea"`
	// Variable name
	DistanceInterAreaVariable *string `pulumi:"distanceInterAreaVariable"`
	// Set distance for intra-area routes - Range: `1`-`255` - Default value: `110`
	DistanceIntraArea *int `pulumi:"distanceIntraArea"`
	// Variable name
	DistanceIntraAreaVariable *string `pulumi:"distanceIntraAreaVariable"`
	// Feature Profile ID
	FeatureProfileId *string `pulumi:"featureProfileId"`
	// The name of the Feature
	Name *string `pulumi:"name"`
	// Redistribute routes
	Redistributes []ServiceRoutingOspfFeatureRedistribute `pulumi:"redistributes"`
	// Set reference bandwidth method to assign OSPF cost - Range: `1`-`4294967` - Default value: `100`
	ReferenceBandwidth *int `pulumi:"referenceBandwidth"`
	// Variable name
	ReferenceBandwidthVariable *string `pulumi:"referenceBandwidthVariable"`
	// Calculate summary route cost based on RFC 1583 - Default value: `true`
	Rfc1583Compatible *bool `pulumi:"rfc1583Compatible"`
	// Variable name
	Rfc1583CompatibleVariable *string `pulumi:"rfc1583CompatibleVariable"`
	RoutePolicyId             *string `pulumi:"routePolicyId"`
	// Set OSPF router ID to override system IP address
	RouterId *string `pulumi:"routerId"`
	// Variable name
	RouterIdVariable *string `pulumi:"routerIdVariable"`
	// Advertise own router LSA with infinite distance
	RouterLsas []ServiceRoutingOspfFeatureRouterLsa `pulumi:"routerLsas"`
	// Set delay from first change received until performing SPF calculation - Range: `1`-`600000` - Default value: `200`
	SpfCalculationDelay *int `pulumi:"spfCalculationDelay"`
	// Variable name
	SpfCalculationDelayVariable *string `pulumi:"spfCalculationDelayVariable"`
	// Set initial hold time between consecutive SPF calculations - Range: `1`-`600000` - Default value: `1000`
	SpfInitialHoldTime *int `pulumi:"spfInitialHoldTime"`
	// Variable name
	SpfInitialHoldTimeVariable *string `pulumi:"spfInitialHoldTimeVariable"`
	// Set maximum hold time between consecutive SPF calculations - Range: `1`-`600000` - Default value: `10000`
	SpfMaximumHoldTime *int `pulumi:"spfMaximumHoldTime"`
	// Variable name
	SpfMaximumHoldTimeVariable *string `pulumi:"spfMaximumHoldTimeVariable"`
	// The version of the Feature
	Version *int `pulumi:"version"`
}

type ServiceRoutingOspfFeatureState struct {
	// Configure OSPF area
	Areas ServiceRoutingOspfFeatureAreaArrayInput
	// Distribute default external route into OSPF - Default value: `false`
	DefaultInformationOriginate pulumi.BoolPtrInput
	// Always advertise default route - Default value: `false`
	DefaultInformationOriginateAlways pulumi.BoolPtrInput
	// Variable name
	DefaultInformationOriginateAlwaysVariable pulumi.StringPtrInput
	// Set metric used to generate default route <0..16777214> - Range: `0`-`16777214`
	DefaultInformationOriginateMetric pulumi.IntPtrInput
	// Set default route type - Choices: `type1`, `type2`
	DefaultInformationOriginateMetricType pulumi.StringPtrInput
	// Variable name
	DefaultInformationOriginateMetricTypeVariable pulumi.StringPtrInput
	// Variable name
	DefaultInformationOriginateMetricVariable pulumi.StringPtrInput
	// The description of the Feature
	Description pulumi.StringPtrInput
	// Set distance for external routes - Range: `1`-`255` - Default value: `110`
	DistanceExternal pulumi.IntPtrInput
	// Variable name
	DistanceExternalVariable pulumi.StringPtrInput
	// Set distance for inter-area routes - Range: `1`-`255` - Default value: `110`
	DistanceInterArea pulumi.IntPtrInput
	// Variable name
	DistanceInterAreaVariable pulumi.StringPtrInput
	// Set distance for intra-area routes - Range: `1`-`255` - Default value: `110`
	DistanceIntraArea pulumi.IntPtrInput
	// Variable name
	DistanceIntraAreaVariable pulumi.StringPtrInput
	// Feature Profile ID
	FeatureProfileId pulumi.StringPtrInput
	// The name of the Feature
	Name pulumi.StringPtrInput
	// Redistribute routes
	Redistributes ServiceRoutingOspfFeatureRedistributeArrayInput
	// Set reference bandwidth method to assign OSPF cost - Range: `1`-`4294967` - Default value: `100`
	ReferenceBandwidth pulumi.IntPtrInput
	// Variable name
	ReferenceBandwidthVariable pulumi.StringPtrInput
	// Calculate summary route cost based on RFC 1583 - Default value: `true`
	Rfc1583Compatible pulumi.BoolPtrInput
	// Variable name
	Rfc1583CompatibleVariable pulumi.StringPtrInput
	RoutePolicyId             pulumi.StringPtrInput
	// Set OSPF router ID to override system IP address
	RouterId pulumi.StringPtrInput
	// Variable name
	RouterIdVariable pulumi.StringPtrInput
	// Advertise own router LSA with infinite distance
	RouterLsas ServiceRoutingOspfFeatureRouterLsaArrayInput
	// Set delay from first change received until performing SPF calculation - Range: `1`-`600000` - Default value: `200`
	SpfCalculationDelay pulumi.IntPtrInput
	// Variable name
	SpfCalculationDelayVariable pulumi.StringPtrInput
	// Set initial hold time between consecutive SPF calculations - Range: `1`-`600000` - Default value: `1000`
	SpfInitialHoldTime pulumi.IntPtrInput
	// Variable name
	SpfInitialHoldTimeVariable pulumi.StringPtrInput
	// Set maximum hold time between consecutive SPF calculations - Range: `1`-`600000` - Default value: `10000`
	SpfMaximumHoldTime pulumi.IntPtrInput
	// Variable name
	SpfMaximumHoldTimeVariable pulumi.StringPtrInput
	// The version of the Feature
	Version pulumi.IntPtrInput
}

func (ServiceRoutingOspfFeatureState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceRoutingOspfFeatureState)(nil)).Elem()
}

type serviceRoutingOspfFeatureArgs struct {
	// Configure OSPF area
	Areas []ServiceRoutingOspfFeatureArea `pulumi:"areas"`
	// Distribute default external route into OSPF - Default value: `false`
	DefaultInformationOriginate *bool `pulumi:"defaultInformationOriginate"`
	// Always advertise default route - Default value: `false`
	DefaultInformationOriginateAlways *bool `pulumi:"defaultInformationOriginateAlways"`
	// Variable name
	DefaultInformationOriginateAlwaysVariable *string `pulumi:"defaultInformationOriginateAlwaysVariable"`
	// Set metric used to generate default route <0..16777214> - Range: `0`-`16777214`
	DefaultInformationOriginateMetric *int `pulumi:"defaultInformationOriginateMetric"`
	// Set default route type - Choices: `type1`, `type2`
	DefaultInformationOriginateMetricType *string `pulumi:"defaultInformationOriginateMetricType"`
	// Variable name
	DefaultInformationOriginateMetricTypeVariable *string `pulumi:"defaultInformationOriginateMetricTypeVariable"`
	// Variable name
	DefaultInformationOriginateMetricVariable *string `pulumi:"defaultInformationOriginateMetricVariable"`
	// The description of the Feature
	Description *string `pulumi:"description"`
	// Set distance for external routes - Range: `1`-`255` - Default value: `110`
	DistanceExternal *int `pulumi:"distanceExternal"`
	// Variable name
	DistanceExternalVariable *string `pulumi:"distanceExternalVariable"`
	// Set distance for inter-area routes - Range: `1`-`255` - Default value: `110`
	DistanceInterArea *int `pulumi:"distanceInterArea"`
	// Variable name
	DistanceInterAreaVariable *string `pulumi:"distanceInterAreaVariable"`
	// Set distance for intra-area routes - Range: `1`-`255` - Default value: `110`
	DistanceIntraArea *int `pulumi:"distanceIntraArea"`
	// Variable name
	DistanceIntraAreaVariable *string `pulumi:"distanceIntraAreaVariable"`
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The name of the Feature
	Name *string `pulumi:"name"`
	// Redistribute routes
	Redistributes []ServiceRoutingOspfFeatureRedistribute `pulumi:"redistributes"`
	// Set reference bandwidth method to assign OSPF cost - Range: `1`-`4294967` - Default value: `100`
	ReferenceBandwidth *int `pulumi:"referenceBandwidth"`
	// Variable name
	ReferenceBandwidthVariable *string `pulumi:"referenceBandwidthVariable"`
	// Calculate summary route cost based on RFC 1583 - Default value: `true`
	Rfc1583Compatible *bool `pulumi:"rfc1583Compatible"`
	// Variable name
	Rfc1583CompatibleVariable *string `pulumi:"rfc1583CompatibleVariable"`
	RoutePolicyId             *string `pulumi:"routePolicyId"`
	// Set OSPF router ID to override system IP address
	RouterId *string `pulumi:"routerId"`
	// Variable name
	RouterIdVariable *string `pulumi:"routerIdVariable"`
	// Advertise own router LSA with infinite distance
	RouterLsas []ServiceRoutingOspfFeatureRouterLsa `pulumi:"routerLsas"`
	// Set delay from first change received until performing SPF calculation - Range: `1`-`600000` - Default value: `200`
	SpfCalculationDelay *int `pulumi:"spfCalculationDelay"`
	// Variable name
	SpfCalculationDelayVariable *string `pulumi:"spfCalculationDelayVariable"`
	// Set initial hold time between consecutive SPF calculations - Range: `1`-`600000` - Default value: `1000`
	SpfInitialHoldTime *int `pulumi:"spfInitialHoldTime"`
	// Variable name
	SpfInitialHoldTimeVariable *string `pulumi:"spfInitialHoldTimeVariable"`
	// Set maximum hold time between consecutive SPF calculations - Range: `1`-`600000` - Default value: `10000`
	SpfMaximumHoldTime *int `pulumi:"spfMaximumHoldTime"`
	// Variable name
	SpfMaximumHoldTimeVariable *string `pulumi:"spfMaximumHoldTimeVariable"`
}

// The set of arguments for constructing a ServiceRoutingOspfFeature resource.
type ServiceRoutingOspfFeatureArgs struct {
	// Configure OSPF area
	Areas ServiceRoutingOspfFeatureAreaArrayInput
	// Distribute default external route into OSPF - Default value: `false`
	DefaultInformationOriginate pulumi.BoolPtrInput
	// Always advertise default route - Default value: `false`
	DefaultInformationOriginateAlways pulumi.BoolPtrInput
	// Variable name
	DefaultInformationOriginateAlwaysVariable pulumi.StringPtrInput
	// Set metric used to generate default route <0..16777214> - Range: `0`-`16777214`
	DefaultInformationOriginateMetric pulumi.IntPtrInput
	// Set default route type - Choices: `type1`, `type2`
	DefaultInformationOriginateMetricType pulumi.StringPtrInput
	// Variable name
	DefaultInformationOriginateMetricTypeVariable pulumi.StringPtrInput
	// Variable name
	DefaultInformationOriginateMetricVariable pulumi.StringPtrInput
	// The description of the Feature
	Description pulumi.StringPtrInput
	// Set distance for external routes - Range: `1`-`255` - Default value: `110`
	DistanceExternal pulumi.IntPtrInput
	// Variable name
	DistanceExternalVariable pulumi.StringPtrInput
	// Set distance for inter-area routes - Range: `1`-`255` - Default value: `110`
	DistanceInterArea pulumi.IntPtrInput
	// Variable name
	DistanceInterAreaVariable pulumi.StringPtrInput
	// Set distance for intra-area routes - Range: `1`-`255` - Default value: `110`
	DistanceIntraArea pulumi.IntPtrInput
	// Variable name
	DistanceIntraAreaVariable pulumi.StringPtrInput
	// Feature Profile ID
	FeatureProfileId pulumi.StringInput
	// The name of the Feature
	Name pulumi.StringPtrInput
	// Redistribute routes
	Redistributes ServiceRoutingOspfFeatureRedistributeArrayInput
	// Set reference bandwidth method to assign OSPF cost - Range: `1`-`4294967` - Default value: `100`
	ReferenceBandwidth pulumi.IntPtrInput
	// Variable name
	ReferenceBandwidthVariable pulumi.StringPtrInput
	// Calculate summary route cost based on RFC 1583 - Default value: `true`
	Rfc1583Compatible pulumi.BoolPtrInput
	// Variable name
	Rfc1583CompatibleVariable pulumi.StringPtrInput
	RoutePolicyId             pulumi.StringPtrInput
	// Set OSPF router ID to override system IP address
	RouterId pulumi.StringPtrInput
	// Variable name
	RouterIdVariable pulumi.StringPtrInput
	// Advertise own router LSA with infinite distance
	RouterLsas ServiceRoutingOspfFeatureRouterLsaArrayInput
	// Set delay from first change received until performing SPF calculation - Range: `1`-`600000` - Default value: `200`
	SpfCalculationDelay pulumi.IntPtrInput
	// Variable name
	SpfCalculationDelayVariable pulumi.StringPtrInput
	// Set initial hold time between consecutive SPF calculations - Range: `1`-`600000` - Default value: `1000`
	SpfInitialHoldTime pulumi.IntPtrInput
	// Variable name
	SpfInitialHoldTimeVariable pulumi.StringPtrInput
	// Set maximum hold time between consecutive SPF calculations - Range: `1`-`600000` - Default value: `10000`
	SpfMaximumHoldTime pulumi.IntPtrInput
	// Variable name
	SpfMaximumHoldTimeVariable pulumi.StringPtrInput
}

func (ServiceRoutingOspfFeatureArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceRoutingOspfFeatureArgs)(nil)).Elem()
}

type ServiceRoutingOspfFeatureInput interface {
	pulumi.Input

	ToServiceRoutingOspfFeatureOutput() ServiceRoutingOspfFeatureOutput
	ToServiceRoutingOspfFeatureOutputWithContext(ctx context.Context) ServiceRoutingOspfFeatureOutput
}

func (*ServiceRoutingOspfFeature) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceRoutingOspfFeature)(nil)).Elem()
}

func (i *ServiceRoutingOspfFeature) ToServiceRoutingOspfFeatureOutput() ServiceRoutingOspfFeatureOutput {
	return i.ToServiceRoutingOspfFeatureOutputWithContext(context.Background())
}

func (i *ServiceRoutingOspfFeature) ToServiceRoutingOspfFeatureOutputWithContext(ctx context.Context) ServiceRoutingOspfFeatureOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceRoutingOspfFeatureOutput)
}

// ServiceRoutingOspfFeatureArrayInput is an input type that accepts ServiceRoutingOspfFeatureArray and ServiceRoutingOspfFeatureArrayOutput values.
// You can construct a concrete instance of `ServiceRoutingOspfFeatureArrayInput` via:
//
//	ServiceRoutingOspfFeatureArray{ ServiceRoutingOspfFeatureArgs{...} }
type ServiceRoutingOspfFeatureArrayInput interface {
	pulumi.Input

	ToServiceRoutingOspfFeatureArrayOutput() ServiceRoutingOspfFeatureArrayOutput
	ToServiceRoutingOspfFeatureArrayOutputWithContext(context.Context) ServiceRoutingOspfFeatureArrayOutput
}

type ServiceRoutingOspfFeatureArray []ServiceRoutingOspfFeatureInput

func (ServiceRoutingOspfFeatureArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceRoutingOspfFeature)(nil)).Elem()
}

func (i ServiceRoutingOspfFeatureArray) ToServiceRoutingOspfFeatureArrayOutput() ServiceRoutingOspfFeatureArrayOutput {
	return i.ToServiceRoutingOspfFeatureArrayOutputWithContext(context.Background())
}

func (i ServiceRoutingOspfFeatureArray) ToServiceRoutingOspfFeatureArrayOutputWithContext(ctx context.Context) ServiceRoutingOspfFeatureArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceRoutingOspfFeatureArrayOutput)
}

// ServiceRoutingOspfFeatureMapInput is an input type that accepts ServiceRoutingOspfFeatureMap and ServiceRoutingOspfFeatureMapOutput values.
// You can construct a concrete instance of `ServiceRoutingOspfFeatureMapInput` via:
//
//	ServiceRoutingOspfFeatureMap{ "key": ServiceRoutingOspfFeatureArgs{...} }
type ServiceRoutingOspfFeatureMapInput interface {
	pulumi.Input

	ToServiceRoutingOspfFeatureMapOutput() ServiceRoutingOspfFeatureMapOutput
	ToServiceRoutingOspfFeatureMapOutputWithContext(context.Context) ServiceRoutingOspfFeatureMapOutput
}

type ServiceRoutingOspfFeatureMap map[string]ServiceRoutingOspfFeatureInput

func (ServiceRoutingOspfFeatureMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceRoutingOspfFeature)(nil)).Elem()
}

func (i ServiceRoutingOspfFeatureMap) ToServiceRoutingOspfFeatureMapOutput() ServiceRoutingOspfFeatureMapOutput {
	return i.ToServiceRoutingOspfFeatureMapOutputWithContext(context.Background())
}

func (i ServiceRoutingOspfFeatureMap) ToServiceRoutingOspfFeatureMapOutputWithContext(ctx context.Context) ServiceRoutingOspfFeatureMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceRoutingOspfFeatureMapOutput)
}

type ServiceRoutingOspfFeatureOutput struct{ *pulumi.OutputState }

func (ServiceRoutingOspfFeatureOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceRoutingOspfFeature)(nil)).Elem()
}

func (o ServiceRoutingOspfFeatureOutput) ToServiceRoutingOspfFeatureOutput() ServiceRoutingOspfFeatureOutput {
	return o
}

func (o ServiceRoutingOspfFeatureOutput) ToServiceRoutingOspfFeatureOutputWithContext(ctx context.Context) ServiceRoutingOspfFeatureOutput {
	return o
}

// Configure OSPF area
func (o ServiceRoutingOspfFeatureOutput) Areas() ServiceRoutingOspfFeatureAreaArrayOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) ServiceRoutingOspfFeatureAreaArrayOutput { return v.Areas }).(ServiceRoutingOspfFeatureAreaArrayOutput)
}

// Distribute default external route into OSPF - Default value: `false`
func (o ServiceRoutingOspfFeatureOutput) DefaultInformationOriginate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.BoolPtrOutput { return v.DefaultInformationOriginate }).(pulumi.BoolPtrOutput)
}

// Always advertise default route - Default value: `false`
func (o ServiceRoutingOspfFeatureOutput) DefaultInformationOriginateAlways() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.BoolPtrOutput { return v.DefaultInformationOriginateAlways }).(pulumi.BoolPtrOutput)
}

// Variable name
func (o ServiceRoutingOspfFeatureOutput) DefaultInformationOriginateAlwaysVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.StringPtrOutput {
		return v.DefaultInformationOriginateAlwaysVariable
	}).(pulumi.StringPtrOutput)
}

// Set metric used to generate default route <0..16777214> - Range: `0`-`16777214`
func (o ServiceRoutingOspfFeatureOutput) DefaultInformationOriginateMetric() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.IntPtrOutput { return v.DefaultInformationOriginateMetric }).(pulumi.IntPtrOutput)
}

// Set default route type - Choices: `type1`, `type2`
func (o ServiceRoutingOspfFeatureOutput) DefaultInformationOriginateMetricType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.StringPtrOutput {
		return v.DefaultInformationOriginateMetricType
	}).(pulumi.StringPtrOutput)
}

// Variable name
func (o ServiceRoutingOspfFeatureOutput) DefaultInformationOriginateMetricTypeVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.StringPtrOutput {
		return v.DefaultInformationOriginateMetricTypeVariable
	}).(pulumi.StringPtrOutput)
}

// Variable name
func (o ServiceRoutingOspfFeatureOutput) DefaultInformationOriginateMetricVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.StringPtrOutput {
		return v.DefaultInformationOriginateMetricVariable
	}).(pulumi.StringPtrOutput)
}

// The description of the Feature
func (o ServiceRoutingOspfFeatureOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Set distance for external routes - Range: `1`-`255` - Default value: `110`
func (o ServiceRoutingOspfFeatureOutput) DistanceExternal() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.IntPtrOutput { return v.DistanceExternal }).(pulumi.IntPtrOutput)
}

// Variable name
func (o ServiceRoutingOspfFeatureOutput) DistanceExternalVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.StringPtrOutput { return v.DistanceExternalVariable }).(pulumi.StringPtrOutput)
}

// Set distance for inter-area routes - Range: `1`-`255` - Default value: `110`
func (o ServiceRoutingOspfFeatureOutput) DistanceInterArea() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.IntPtrOutput { return v.DistanceInterArea }).(pulumi.IntPtrOutput)
}

// Variable name
func (o ServiceRoutingOspfFeatureOutput) DistanceInterAreaVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.StringPtrOutput { return v.DistanceInterAreaVariable }).(pulumi.StringPtrOutput)
}

// Set distance for intra-area routes - Range: `1`-`255` - Default value: `110`
func (o ServiceRoutingOspfFeatureOutput) DistanceIntraArea() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.IntPtrOutput { return v.DistanceIntraArea }).(pulumi.IntPtrOutput)
}

// Variable name
func (o ServiceRoutingOspfFeatureOutput) DistanceIntraAreaVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.StringPtrOutput { return v.DistanceIntraAreaVariable }).(pulumi.StringPtrOutput)
}

// Feature Profile ID
func (o ServiceRoutingOspfFeatureOutput) FeatureProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.StringOutput { return v.FeatureProfileId }).(pulumi.StringOutput)
}

// The name of the Feature
func (o ServiceRoutingOspfFeatureOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Redistribute routes
func (o ServiceRoutingOspfFeatureOutput) Redistributes() ServiceRoutingOspfFeatureRedistributeArrayOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) ServiceRoutingOspfFeatureRedistributeArrayOutput {
		return v.Redistributes
	}).(ServiceRoutingOspfFeatureRedistributeArrayOutput)
}

// Set reference bandwidth method to assign OSPF cost - Range: `1`-`4294967` - Default value: `100`
func (o ServiceRoutingOspfFeatureOutput) ReferenceBandwidth() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.IntPtrOutput { return v.ReferenceBandwidth }).(pulumi.IntPtrOutput)
}

// Variable name
func (o ServiceRoutingOspfFeatureOutput) ReferenceBandwidthVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.StringPtrOutput { return v.ReferenceBandwidthVariable }).(pulumi.StringPtrOutput)
}

// Calculate summary route cost based on RFC 1583 - Default value: `true`
func (o ServiceRoutingOspfFeatureOutput) Rfc1583Compatible() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.BoolPtrOutput { return v.Rfc1583Compatible }).(pulumi.BoolPtrOutput)
}

// Variable name
func (o ServiceRoutingOspfFeatureOutput) Rfc1583CompatibleVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.StringPtrOutput { return v.Rfc1583CompatibleVariable }).(pulumi.StringPtrOutput)
}

func (o ServiceRoutingOspfFeatureOutput) RoutePolicyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.StringPtrOutput { return v.RoutePolicyId }).(pulumi.StringPtrOutput)
}

// Set OSPF router ID to override system IP address
func (o ServiceRoutingOspfFeatureOutput) RouterId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.StringPtrOutput { return v.RouterId }).(pulumi.StringPtrOutput)
}

// Variable name
func (o ServiceRoutingOspfFeatureOutput) RouterIdVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.StringPtrOutput { return v.RouterIdVariable }).(pulumi.StringPtrOutput)
}

// Advertise own router LSA with infinite distance
func (o ServiceRoutingOspfFeatureOutput) RouterLsas() ServiceRoutingOspfFeatureRouterLsaArrayOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) ServiceRoutingOspfFeatureRouterLsaArrayOutput { return v.RouterLsas }).(ServiceRoutingOspfFeatureRouterLsaArrayOutput)
}

// Set delay from first change received until performing SPF calculation - Range: `1`-`600000` - Default value: `200`
func (o ServiceRoutingOspfFeatureOutput) SpfCalculationDelay() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.IntPtrOutput { return v.SpfCalculationDelay }).(pulumi.IntPtrOutput)
}

// Variable name
func (o ServiceRoutingOspfFeatureOutput) SpfCalculationDelayVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.StringPtrOutput { return v.SpfCalculationDelayVariable }).(pulumi.StringPtrOutput)
}

// Set initial hold time between consecutive SPF calculations - Range: `1`-`600000` - Default value: `1000`
func (o ServiceRoutingOspfFeatureOutput) SpfInitialHoldTime() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.IntPtrOutput { return v.SpfInitialHoldTime }).(pulumi.IntPtrOutput)
}

// Variable name
func (o ServiceRoutingOspfFeatureOutput) SpfInitialHoldTimeVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.StringPtrOutput { return v.SpfInitialHoldTimeVariable }).(pulumi.StringPtrOutput)
}

// Set maximum hold time between consecutive SPF calculations - Range: `1`-`600000` - Default value: `10000`
func (o ServiceRoutingOspfFeatureOutput) SpfMaximumHoldTime() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.IntPtrOutput { return v.SpfMaximumHoldTime }).(pulumi.IntPtrOutput)
}

// Variable name
func (o ServiceRoutingOspfFeatureOutput) SpfMaximumHoldTimeVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.StringPtrOutput { return v.SpfMaximumHoldTimeVariable }).(pulumi.StringPtrOutput)
}

// The version of the Feature
func (o ServiceRoutingOspfFeatureOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *ServiceRoutingOspfFeature) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type ServiceRoutingOspfFeatureArrayOutput struct{ *pulumi.OutputState }

func (ServiceRoutingOspfFeatureArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceRoutingOspfFeature)(nil)).Elem()
}

func (o ServiceRoutingOspfFeatureArrayOutput) ToServiceRoutingOspfFeatureArrayOutput() ServiceRoutingOspfFeatureArrayOutput {
	return o
}

func (o ServiceRoutingOspfFeatureArrayOutput) ToServiceRoutingOspfFeatureArrayOutputWithContext(ctx context.Context) ServiceRoutingOspfFeatureArrayOutput {
	return o
}

func (o ServiceRoutingOspfFeatureArrayOutput) Index(i pulumi.IntInput) ServiceRoutingOspfFeatureOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceRoutingOspfFeature {
		return vs[0].([]*ServiceRoutingOspfFeature)[vs[1].(int)]
	}).(ServiceRoutingOspfFeatureOutput)
}

type ServiceRoutingOspfFeatureMapOutput struct{ *pulumi.OutputState }

func (ServiceRoutingOspfFeatureMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceRoutingOspfFeature)(nil)).Elem()
}

func (o ServiceRoutingOspfFeatureMapOutput) ToServiceRoutingOspfFeatureMapOutput() ServiceRoutingOspfFeatureMapOutput {
	return o
}

func (o ServiceRoutingOspfFeatureMapOutput) ToServiceRoutingOspfFeatureMapOutputWithContext(ctx context.Context) ServiceRoutingOspfFeatureMapOutput {
	return o
}

func (o ServiceRoutingOspfFeatureMapOutput) MapIndex(k pulumi.StringInput) ServiceRoutingOspfFeatureOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceRoutingOspfFeature {
		return vs[0].(map[string]*ServiceRoutingOspfFeature)[vs[1].(string)]
	}).(ServiceRoutingOspfFeatureOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceRoutingOspfFeatureInput)(nil)).Elem(), &ServiceRoutingOspfFeature{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceRoutingOspfFeatureArrayInput)(nil)).Elem(), ServiceRoutingOspfFeatureArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceRoutingOspfFeatureMapInput)(nil)).Elem(), ServiceRoutingOspfFeatureMap{})
	pulumi.RegisterOutputType(ServiceRoutingOspfFeatureOutput{})
	pulumi.RegisterOutputType(ServiceRoutingOspfFeatureArrayOutput{})
	pulumi.RegisterOutputType(ServiceRoutingOspfFeatureMapOutput{})
}
