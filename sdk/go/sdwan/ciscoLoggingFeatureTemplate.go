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

// This resource can manage a Cisco Logging feature template.
//   - Minimum SD-WAN Manager version: `15.0.0`
//
// ## Import
//
// The `pulumi import` command can be used, for example:
//
// ```sh
// $ pulumi import sdwan:index/ciscoLoggingFeatureTemplate:CiscoLoggingFeatureTemplate example "f6b2c44c-693c-4763-b010-895aa3d236bd"
// ```
type CiscoLoggingFeatureTemplate struct {
	pulumi.CustomResourceState

	// The description of the feature template
	Description pulumi.StringOutput `pulumi:"description"`
	// List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
	// `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
	// `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
	DeviceTypes pulumi.StringArrayOutput `pulumi:"deviceTypes"`
	// Enable logging to local disk - Default value: `true`
	DiskLogging pulumi.BoolPtrOutput `pulumi:"diskLogging"`
	// Variable name
	DiskLoggingVariable pulumi.StringPtrOutput `pulumi:"diskLoggingVariable"`
	// Enable logging to remote server
	Ipv4Servers CiscoLoggingFeatureTemplateIpv4ServerArrayOutput `pulumi:"ipv4Servers"`
	// Enable logging to remote IPv6 server
	Ipv6Servers CiscoLoggingFeatureTemplateIpv6ServerArrayOutput `pulumi:"ipv6Servers"`
	// Set number of syslog files to create before discarding oldest files - Range: `1`-`10` - Default value: `10`
	LogRotations pulumi.IntPtrOutput `pulumi:"logRotations"`
	// Variable name
	LogRotationsVariable pulumi.StringPtrOutput `pulumi:"logRotationsVariable"`
	// Set maximum size of file before it is rotated - Range: `1`-`20` - Default value: `10`
	MaxSize pulumi.IntPtrOutput `pulumi:"maxSize"`
	// Variable name
	MaxSizeVariable pulumi.StringPtrOutput `pulumi:"maxSizeVariable"`
	// The name of the feature template
	Name pulumi.StringOutput `pulumi:"name"`
	// The template type
	TemplateType pulumi.StringOutput `pulumi:"templateType"`
	// Configure a TLS profile
	TlsProfiles CiscoLoggingFeatureTemplateTlsProfileArrayOutput `pulumi:"tlsProfiles"`
	// The version of the feature template
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewCiscoLoggingFeatureTemplate registers a new resource with the given unique name, arguments, and options.
func NewCiscoLoggingFeatureTemplate(ctx *pulumi.Context,
	name string, args *CiscoLoggingFeatureTemplateArgs, opts ...pulumi.ResourceOption) (*CiscoLoggingFeatureTemplate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.DeviceTypes == nil {
		return nil, errors.New("invalid value for required argument 'DeviceTypes'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CiscoLoggingFeatureTemplate
	err := ctx.RegisterResource("sdwan:index/ciscoLoggingFeatureTemplate:CiscoLoggingFeatureTemplate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCiscoLoggingFeatureTemplate gets an existing CiscoLoggingFeatureTemplate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCiscoLoggingFeatureTemplate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CiscoLoggingFeatureTemplateState, opts ...pulumi.ResourceOption) (*CiscoLoggingFeatureTemplate, error) {
	var resource CiscoLoggingFeatureTemplate
	err := ctx.ReadResource("sdwan:index/ciscoLoggingFeatureTemplate:CiscoLoggingFeatureTemplate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CiscoLoggingFeatureTemplate resources.
type ciscoLoggingFeatureTemplateState struct {
	// The description of the feature template
	Description *string `pulumi:"description"`
	// List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
	// `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
	// `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
	DeviceTypes []string `pulumi:"deviceTypes"`
	// Enable logging to local disk - Default value: `true`
	DiskLogging *bool `pulumi:"diskLogging"`
	// Variable name
	DiskLoggingVariable *string `pulumi:"diskLoggingVariable"`
	// Enable logging to remote server
	Ipv4Servers []CiscoLoggingFeatureTemplateIpv4Server `pulumi:"ipv4Servers"`
	// Enable logging to remote IPv6 server
	Ipv6Servers []CiscoLoggingFeatureTemplateIpv6Server `pulumi:"ipv6Servers"`
	// Set number of syslog files to create before discarding oldest files - Range: `1`-`10` - Default value: `10`
	LogRotations *int `pulumi:"logRotations"`
	// Variable name
	LogRotationsVariable *string `pulumi:"logRotationsVariable"`
	// Set maximum size of file before it is rotated - Range: `1`-`20` - Default value: `10`
	MaxSize *int `pulumi:"maxSize"`
	// Variable name
	MaxSizeVariable *string `pulumi:"maxSizeVariable"`
	// The name of the feature template
	Name *string `pulumi:"name"`
	// The template type
	TemplateType *string `pulumi:"templateType"`
	// Configure a TLS profile
	TlsProfiles []CiscoLoggingFeatureTemplateTlsProfile `pulumi:"tlsProfiles"`
	// The version of the feature template
	Version *int `pulumi:"version"`
}

type CiscoLoggingFeatureTemplateState struct {
	// The description of the feature template
	Description pulumi.StringPtrInput
	// List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
	// `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
	// `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
	DeviceTypes pulumi.StringArrayInput
	// Enable logging to local disk - Default value: `true`
	DiskLogging pulumi.BoolPtrInput
	// Variable name
	DiskLoggingVariable pulumi.StringPtrInput
	// Enable logging to remote server
	Ipv4Servers CiscoLoggingFeatureTemplateIpv4ServerArrayInput
	// Enable logging to remote IPv6 server
	Ipv6Servers CiscoLoggingFeatureTemplateIpv6ServerArrayInput
	// Set number of syslog files to create before discarding oldest files - Range: `1`-`10` - Default value: `10`
	LogRotations pulumi.IntPtrInput
	// Variable name
	LogRotationsVariable pulumi.StringPtrInput
	// Set maximum size of file before it is rotated - Range: `1`-`20` - Default value: `10`
	MaxSize pulumi.IntPtrInput
	// Variable name
	MaxSizeVariable pulumi.StringPtrInput
	// The name of the feature template
	Name pulumi.StringPtrInput
	// The template type
	TemplateType pulumi.StringPtrInput
	// Configure a TLS profile
	TlsProfiles CiscoLoggingFeatureTemplateTlsProfileArrayInput
	// The version of the feature template
	Version pulumi.IntPtrInput
}

func (CiscoLoggingFeatureTemplateState) ElementType() reflect.Type {
	return reflect.TypeOf((*ciscoLoggingFeatureTemplateState)(nil)).Elem()
}

type ciscoLoggingFeatureTemplateArgs struct {
	// The description of the feature template
	Description string `pulumi:"description"`
	// List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
	// `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
	// `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
	DeviceTypes []string `pulumi:"deviceTypes"`
	// Enable logging to local disk - Default value: `true`
	DiskLogging *bool `pulumi:"diskLogging"`
	// Variable name
	DiskLoggingVariable *string `pulumi:"diskLoggingVariable"`
	// Enable logging to remote server
	Ipv4Servers []CiscoLoggingFeatureTemplateIpv4Server `pulumi:"ipv4Servers"`
	// Enable logging to remote IPv6 server
	Ipv6Servers []CiscoLoggingFeatureTemplateIpv6Server `pulumi:"ipv6Servers"`
	// Set number of syslog files to create before discarding oldest files - Range: `1`-`10` - Default value: `10`
	LogRotations *int `pulumi:"logRotations"`
	// Variable name
	LogRotationsVariable *string `pulumi:"logRotationsVariable"`
	// Set maximum size of file before it is rotated - Range: `1`-`20` - Default value: `10`
	MaxSize *int `pulumi:"maxSize"`
	// Variable name
	MaxSizeVariable *string `pulumi:"maxSizeVariable"`
	// The name of the feature template
	Name *string `pulumi:"name"`
	// Configure a TLS profile
	TlsProfiles []CiscoLoggingFeatureTemplateTlsProfile `pulumi:"tlsProfiles"`
}

// The set of arguments for constructing a CiscoLoggingFeatureTemplate resource.
type CiscoLoggingFeatureTemplateArgs struct {
	// The description of the feature template
	Description pulumi.StringInput
	// List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
	// `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
	// `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
	DeviceTypes pulumi.StringArrayInput
	// Enable logging to local disk - Default value: `true`
	DiskLogging pulumi.BoolPtrInput
	// Variable name
	DiskLoggingVariable pulumi.StringPtrInput
	// Enable logging to remote server
	Ipv4Servers CiscoLoggingFeatureTemplateIpv4ServerArrayInput
	// Enable logging to remote IPv6 server
	Ipv6Servers CiscoLoggingFeatureTemplateIpv6ServerArrayInput
	// Set number of syslog files to create before discarding oldest files - Range: `1`-`10` - Default value: `10`
	LogRotations pulumi.IntPtrInput
	// Variable name
	LogRotationsVariable pulumi.StringPtrInput
	// Set maximum size of file before it is rotated - Range: `1`-`20` - Default value: `10`
	MaxSize pulumi.IntPtrInput
	// Variable name
	MaxSizeVariable pulumi.StringPtrInput
	// The name of the feature template
	Name pulumi.StringPtrInput
	// Configure a TLS profile
	TlsProfiles CiscoLoggingFeatureTemplateTlsProfileArrayInput
}

func (CiscoLoggingFeatureTemplateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ciscoLoggingFeatureTemplateArgs)(nil)).Elem()
}

type CiscoLoggingFeatureTemplateInput interface {
	pulumi.Input

	ToCiscoLoggingFeatureTemplateOutput() CiscoLoggingFeatureTemplateOutput
	ToCiscoLoggingFeatureTemplateOutputWithContext(ctx context.Context) CiscoLoggingFeatureTemplateOutput
}

func (*CiscoLoggingFeatureTemplate) ElementType() reflect.Type {
	return reflect.TypeOf((**CiscoLoggingFeatureTemplate)(nil)).Elem()
}

func (i *CiscoLoggingFeatureTemplate) ToCiscoLoggingFeatureTemplateOutput() CiscoLoggingFeatureTemplateOutput {
	return i.ToCiscoLoggingFeatureTemplateOutputWithContext(context.Background())
}

func (i *CiscoLoggingFeatureTemplate) ToCiscoLoggingFeatureTemplateOutputWithContext(ctx context.Context) CiscoLoggingFeatureTemplateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CiscoLoggingFeatureTemplateOutput)
}

// CiscoLoggingFeatureTemplateArrayInput is an input type that accepts CiscoLoggingFeatureTemplateArray and CiscoLoggingFeatureTemplateArrayOutput values.
// You can construct a concrete instance of `CiscoLoggingFeatureTemplateArrayInput` via:
//
//	CiscoLoggingFeatureTemplateArray{ CiscoLoggingFeatureTemplateArgs{...} }
type CiscoLoggingFeatureTemplateArrayInput interface {
	pulumi.Input

	ToCiscoLoggingFeatureTemplateArrayOutput() CiscoLoggingFeatureTemplateArrayOutput
	ToCiscoLoggingFeatureTemplateArrayOutputWithContext(context.Context) CiscoLoggingFeatureTemplateArrayOutput
}

type CiscoLoggingFeatureTemplateArray []CiscoLoggingFeatureTemplateInput

func (CiscoLoggingFeatureTemplateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CiscoLoggingFeatureTemplate)(nil)).Elem()
}

func (i CiscoLoggingFeatureTemplateArray) ToCiscoLoggingFeatureTemplateArrayOutput() CiscoLoggingFeatureTemplateArrayOutput {
	return i.ToCiscoLoggingFeatureTemplateArrayOutputWithContext(context.Background())
}

func (i CiscoLoggingFeatureTemplateArray) ToCiscoLoggingFeatureTemplateArrayOutputWithContext(ctx context.Context) CiscoLoggingFeatureTemplateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CiscoLoggingFeatureTemplateArrayOutput)
}

// CiscoLoggingFeatureTemplateMapInput is an input type that accepts CiscoLoggingFeatureTemplateMap and CiscoLoggingFeatureTemplateMapOutput values.
// You can construct a concrete instance of `CiscoLoggingFeatureTemplateMapInput` via:
//
//	CiscoLoggingFeatureTemplateMap{ "key": CiscoLoggingFeatureTemplateArgs{...} }
type CiscoLoggingFeatureTemplateMapInput interface {
	pulumi.Input

	ToCiscoLoggingFeatureTemplateMapOutput() CiscoLoggingFeatureTemplateMapOutput
	ToCiscoLoggingFeatureTemplateMapOutputWithContext(context.Context) CiscoLoggingFeatureTemplateMapOutput
}

type CiscoLoggingFeatureTemplateMap map[string]CiscoLoggingFeatureTemplateInput

func (CiscoLoggingFeatureTemplateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CiscoLoggingFeatureTemplate)(nil)).Elem()
}

func (i CiscoLoggingFeatureTemplateMap) ToCiscoLoggingFeatureTemplateMapOutput() CiscoLoggingFeatureTemplateMapOutput {
	return i.ToCiscoLoggingFeatureTemplateMapOutputWithContext(context.Background())
}

func (i CiscoLoggingFeatureTemplateMap) ToCiscoLoggingFeatureTemplateMapOutputWithContext(ctx context.Context) CiscoLoggingFeatureTemplateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CiscoLoggingFeatureTemplateMapOutput)
}

type CiscoLoggingFeatureTemplateOutput struct{ *pulumi.OutputState }

func (CiscoLoggingFeatureTemplateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CiscoLoggingFeatureTemplate)(nil)).Elem()
}

func (o CiscoLoggingFeatureTemplateOutput) ToCiscoLoggingFeatureTemplateOutput() CiscoLoggingFeatureTemplateOutput {
	return o
}

func (o CiscoLoggingFeatureTemplateOutput) ToCiscoLoggingFeatureTemplateOutputWithContext(ctx context.Context) CiscoLoggingFeatureTemplateOutput {
	return o
}

// The description of the feature template
func (o CiscoLoggingFeatureTemplateOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *CiscoLoggingFeatureTemplate) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
// `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
// `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
func (o CiscoLoggingFeatureTemplateOutput) DeviceTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CiscoLoggingFeatureTemplate) pulumi.StringArrayOutput { return v.DeviceTypes }).(pulumi.StringArrayOutput)
}

// Enable logging to local disk - Default value: `true`
func (o CiscoLoggingFeatureTemplateOutput) DiskLogging() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CiscoLoggingFeatureTemplate) pulumi.BoolPtrOutput { return v.DiskLogging }).(pulumi.BoolPtrOutput)
}

// Variable name
func (o CiscoLoggingFeatureTemplateOutput) DiskLoggingVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CiscoLoggingFeatureTemplate) pulumi.StringPtrOutput { return v.DiskLoggingVariable }).(pulumi.StringPtrOutput)
}

// Enable logging to remote server
func (o CiscoLoggingFeatureTemplateOutput) Ipv4Servers() CiscoLoggingFeatureTemplateIpv4ServerArrayOutput {
	return o.ApplyT(func(v *CiscoLoggingFeatureTemplate) CiscoLoggingFeatureTemplateIpv4ServerArrayOutput {
		return v.Ipv4Servers
	}).(CiscoLoggingFeatureTemplateIpv4ServerArrayOutput)
}

// Enable logging to remote IPv6 server
func (o CiscoLoggingFeatureTemplateOutput) Ipv6Servers() CiscoLoggingFeatureTemplateIpv6ServerArrayOutput {
	return o.ApplyT(func(v *CiscoLoggingFeatureTemplate) CiscoLoggingFeatureTemplateIpv6ServerArrayOutput {
		return v.Ipv6Servers
	}).(CiscoLoggingFeatureTemplateIpv6ServerArrayOutput)
}

// Set number of syslog files to create before discarding oldest files - Range: `1`-`10` - Default value: `10`
func (o CiscoLoggingFeatureTemplateOutput) LogRotations() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *CiscoLoggingFeatureTemplate) pulumi.IntPtrOutput { return v.LogRotations }).(pulumi.IntPtrOutput)
}

// Variable name
func (o CiscoLoggingFeatureTemplateOutput) LogRotationsVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CiscoLoggingFeatureTemplate) pulumi.StringPtrOutput { return v.LogRotationsVariable }).(pulumi.StringPtrOutput)
}

// Set maximum size of file before it is rotated - Range: `1`-`20` - Default value: `10`
func (o CiscoLoggingFeatureTemplateOutput) MaxSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *CiscoLoggingFeatureTemplate) pulumi.IntPtrOutput { return v.MaxSize }).(pulumi.IntPtrOutput)
}

// Variable name
func (o CiscoLoggingFeatureTemplateOutput) MaxSizeVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CiscoLoggingFeatureTemplate) pulumi.StringPtrOutput { return v.MaxSizeVariable }).(pulumi.StringPtrOutput)
}

// The name of the feature template
func (o CiscoLoggingFeatureTemplateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CiscoLoggingFeatureTemplate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The template type
func (o CiscoLoggingFeatureTemplateOutput) TemplateType() pulumi.StringOutput {
	return o.ApplyT(func(v *CiscoLoggingFeatureTemplate) pulumi.StringOutput { return v.TemplateType }).(pulumi.StringOutput)
}

// Configure a TLS profile
func (o CiscoLoggingFeatureTemplateOutput) TlsProfiles() CiscoLoggingFeatureTemplateTlsProfileArrayOutput {
	return o.ApplyT(func(v *CiscoLoggingFeatureTemplate) CiscoLoggingFeatureTemplateTlsProfileArrayOutput {
		return v.TlsProfiles
	}).(CiscoLoggingFeatureTemplateTlsProfileArrayOutput)
}

// The version of the feature template
func (o CiscoLoggingFeatureTemplateOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *CiscoLoggingFeatureTemplate) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type CiscoLoggingFeatureTemplateArrayOutput struct{ *pulumi.OutputState }

func (CiscoLoggingFeatureTemplateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CiscoLoggingFeatureTemplate)(nil)).Elem()
}

func (o CiscoLoggingFeatureTemplateArrayOutput) ToCiscoLoggingFeatureTemplateArrayOutput() CiscoLoggingFeatureTemplateArrayOutput {
	return o
}

func (o CiscoLoggingFeatureTemplateArrayOutput) ToCiscoLoggingFeatureTemplateArrayOutputWithContext(ctx context.Context) CiscoLoggingFeatureTemplateArrayOutput {
	return o
}

func (o CiscoLoggingFeatureTemplateArrayOutput) Index(i pulumi.IntInput) CiscoLoggingFeatureTemplateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CiscoLoggingFeatureTemplate {
		return vs[0].([]*CiscoLoggingFeatureTemplate)[vs[1].(int)]
	}).(CiscoLoggingFeatureTemplateOutput)
}

type CiscoLoggingFeatureTemplateMapOutput struct{ *pulumi.OutputState }

func (CiscoLoggingFeatureTemplateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CiscoLoggingFeatureTemplate)(nil)).Elem()
}

func (o CiscoLoggingFeatureTemplateMapOutput) ToCiscoLoggingFeatureTemplateMapOutput() CiscoLoggingFeatureTemplateMapOutput {
	return o
}

func (o CiscoLoggingFeatureTemplateMapOutput) ToCiscoLoggingFeatureTemplateMapOutputWithContext(ctx context.Context) CiscoLoggingFeatureTemplateMapOutput {
	return o
}

func (o CiscoLoggingFeatureTemplateMapOutput) MapIndex(k pulumi.StringInput) CiscoLoggingFeatureTemplateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CiscoLoggingFeatureTemplate {
		return vs[0].(map[string]*CiscoLoggingFeatureTemplate)[vs[1].(string)]
	}).(CiscoLoggingFeatureTemplateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CiscoLoggingFeatureTemplateInput)(nil)).Elem(), &CiscoLoggingFeatureTemplate{})
	pulumi.RegisterInputType(reflect.TypeOf((*CiscoLoggingFeatureTemplateArrayInput)(nil)).Elem(), CiscoLoggingFeatureTemplateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CiscoLoggingFeatureTemplateMapInput)(nil)).Elem(), CiscoLoggingFeatureTemplateMap{})
	pulumi.RegisterOutputType(CiscoLoggingFeatureTemplateOutput{})
	pulumi.RegisterOutputType(CiscoLoggingFeatureTemplateArrayOutput{})
	pulumi.RegisterOutputType(CiscoLoggingFeatureTemplateMapOutput{})
}
