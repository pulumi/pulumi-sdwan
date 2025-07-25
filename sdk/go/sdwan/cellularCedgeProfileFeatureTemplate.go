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

// This resource can manage a Cellular cEdge Profile feature template.
//   - Minimum SD-WAN Manager version: `15.0.0`
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sdwan.NewCellularCedgeProfileFeatureTemplate(ctx, "example", &sdwan.CellularCedgeProfileFeatureTemplateArgs{
//				Name:        pulumi.String("Example"),
//				Description: pulumi.String("My Example"),
//				DeviceTypes: pulumi.StringArray{
//					pulumi.String("vedge-C8000V"),
//				},
//				ProfileId:             pulumi.Int(1),
//				AccessPointName:       pulumi.String("APN1"),
//				AuthenticationType:    pulumi.String("chap"),
//				PacketDataNetworkType: pulumi.String("ipv4"),
//				ProfileUsername:       pulumi.String("MyUsername"),
//				ProfilePassword:       pulumi.String("MyPassword"),
//				NoOverwrite:           pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// The `pulumi import` command can be used, for example:
//
// ```sh
// $ pulumi import sdwan:index/cellularCedgeProfileFeatureTemplate:CellularCedgeProfileFeatureTemplate example "f6b2c44c-693c-4763-b010-895aa3d236bd"
// ```
type CellularCedgeProfileFeatureTemplate struct {
	pulumi.CustomResourceState

	// Set access point name
	AccessPointName pulumi.StringPtrOutput `pulumi:"accessPointName"`
	// Variable name
	AccessPointNameVariable pulumi.StringPtrOutput `pulumi:"accessPointNameVariable"`
	// Set authentication type - Choices: `none`, `pap`, `chap`, `papChap` - Default value: `none`
	AuthenticationType pulumi.StringPtrOutput `pulumi:"authenticationType"`
	// Variable name
	AuthenticationTypeVariable pulumi.StringPtrOutput `pulumi:"authenticationTypeVariable"`
	// The description of the feature template
	Description pulumi.StringOutput `pulumi:"description"`
	// List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
	// `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
	// `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
	DeviceTypes pulumi.StringArrayOutput `pulumi:"deviceTypes"`
	// The name of the feature template
	Name pulumi.StringOutput `pulumi:"name"`
	// No Overwrite
	NoOverwrite pulumi.BoolPtrOutput `pulumi:"noOverwrite"`
	// Variable name
	NoOverwriteVariable pulumi.StringPtrOutput `pulumi:"noOverwriteVariable"`
	// Set packet data network type - Choices: `ipv4`, `ipv4v6`, `ipv6` - Default value: `ipv4`
	PacketDataNetworkType pulumi.StringPtrOutput `pulumi:"packetDataNetworkType"`
	// Variable name
	PacketDataNetworkTypeVariable pulumi.StringPtrOutput `pulumi:"packetDataNetworkTypeVariable"`
	// Set Profile ID - Range: `1`-`16`
	ProfileId pulumi.IntPtrOutput `pulumi:"profileId"`
	// Variable name
	ProfileIdVariable pulumi.StringPtrOutput `pulumi:"profileIdVariable"`
	// Set the profile password
	ProfilePassword pulumi.StringPtrOutput `pulumi:"profilePassword"`
	// Variable name
	ProfilePasswordVariable pulumi.StringPtrOutput `pulumi:"profilePasswordVariable"`
	// Set the profile username
	ProfileUsername pulumi.StringPtrOutput `pulumi:"profileUsername"`
	// Variable name
	ProfileUsernameVariable pulumi.StringPtrOutput `pulumi:"profileUsernameVariable"`
	// The template type
	TemplateType pulumi.StringOutput `pulumi:"templateType"`
	// The version of the feature template
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewCellularCedgeProfileFeatureTemplate registers a new resource with the given unique name, arguments, and options.
func NewCellularCedgeProfileFeatureTemplate(ctx *pulumi.Context,
	name string, args *CellularCedgeProfileFeatureTemplateArgs, opts ...pulumi.ResourceOption) (*CellularCedgeProfileFeatureTemplate, error) {
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
	var resource CellularCedgeProfileFeatureTemplate
	err := ctx.RegisterResource("sdwan:index/cellularCedgeProfileFeatureTemplate:CellularCedgeProfileFeatureTemplate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCellularCedgeProfileFeatureTemplate gets an existing CellularCedgeProfileFeatureTemplate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCellularCedgeProfileFeatureTemplate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CellularCedgeProfileFeatureTemplateState, opts ...pulumi.ResourceOption) (*CellularCedgeProfileFeatureTemplate, error) {
	var resource CellularCedgeProfileFeatureTemplate
	err := ctx.ReadResource("sdwan:index/cellularCedgeProfileFeatureTemplate:CellularCedgeProfileFeatureTemplate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CellularCedgeProfileFeatureTemplate resources.
type cellularCedgeProfileFeatureTemplateState struct {
	// Set access point name
	AccessPointName *string `pulumi:"accessPointName"`
	// Variable name
	AccessPointNameVariable *string `pulumi:"accessPointNameVariable"`
	// Set authentication type - Choices: `none`, `pap`, `chap`, `papChap` - Default value: `none`
	AuthenticationType *string `pulumi:"authenticationType"`
	// Variable name
	AuthenticationTypeVariable *string `pulumi:"authenticationTypeVariable"`
	// The description of the feature template
	Description *string `pulumi:"description"`
	// List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
	// `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
	// `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
	DeviceTypes []string `pulumi:"deviceTypes"`
	// The name of the feature template
	Name *string `pulumi:"name"`
	// No Overwrite
	NoOverwrite *bool `pulumi:"noOverwrite"`
	// Variable name
	NoOverwriteVariable *string `pulumi:"noOverwriteVariable"`
	// Set packet data network type - Choices: `ipv4`, `ipv4v6`, `ipv6` - Default value: `ipv4`
	PacketDataNetworkType *string `pulumi:"packetDataNetworkType"`
	// Variable name
	PacketDataNetworkTypeVariable *string `pulumi:"packetDataNetworkTypeVariable"`
	// Set Profile ID - Range: `1`-`16`
	ProfileId *int `pulumi:"profileId"`
	// Variable name
	ProfileIdVariable *string `pulumi:"profileIdVariable"`
	// Set the profile password
	ProfilePassword *string `pulumi:"profilePassword"`
	// Variable name
	ProfilePasswordVariable *string `pulumi:"profilePasswordVariable"`
	// Set the profile username
	ProfileUsername *string `pulumi:"profileUsername"`
	// Variable name
	ProfileUsernameVariable *string `pulumi:"profileUsernameVariable"`
	// The template type
	TemplateType *string `pulumi:"templateType"`
	// The version of the feature template
	Version *int `pulumi:"version"`
}

type CellularCedgeProfileFeatureTemplateState struct {
	// Set access point name
	AccessPointName pulumi.StringPtrInput
	// Variable name
	AccessPointNameVariable pulumi.StringPtrInput
	// Set authentication type - Choices: `none`, `pap`, `chap`, `papChap` - Default value: `none`
	AuthenticationType pulumi.StringPtrInput
	// Variable name
	AuthenticationTypeVariable pulumi.StringPtrInput
	// The description of the feature template
	Description pulumi.StringPtrInput
	// List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
	// `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
	// `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
	DeviceTypes pulumi.StringArrayInput
	// The name of the feature template
	Name pulumi.StringPtrInput
	// No Overwrite
	NoOverwrite pulumi.BoolPtrInput
	// Variable name
	NoOverwriteVariable pulumi.StringPtrInput
	// Set packet data network type - Choices: `ipv4`, `ipv4v6`, `ipv6` - Default value: `ipv4`
	PacketDataNetworkType pulumi.StringPtrInput
	// Variable name
	PacketDataNetworkTypeVariable pulumi.StringPtrInput
	// Set Profile ID - Range: `1`-`16`
	ProfileId pulumi.IntPtrInput
	// Variable name
	ProfileIdVariable pulumi.StringPtrInput
	// Set the profile password
	ProfilePassword pulumi.StringPtrInput
	// Variable name
	ProfilePasswordVariable pulumi.StringPtrInput
	// Set the profile username
	ProfileUsername pulumi.StringPtrInput
	// Variable name
	ProfileUsernameVariable pulumi.StringPtrInput
	// The template type
	TemplateType pulumi.StringPtrInput
	// The version of the feature template
	Version pulumi.IntPtrInput
}

func (CellularCedgeProfileFeatureTemplateState) ElementType() reflect.Type {
	return reflect.TypeOf((*cellularCedgeProfileFeatureTemplateState)(nil)).Elem()
}

type cellularCedgeProfileFeatureTemplateArgs struct {
	// Set access point name
	AccessPointName *string `pulumi:"accessPointName"`
	// Variable name
	AccessPointNameVariable *string `pulumi:"accessPointNameVariable"`
	// Set authentication type - Choices: `none`, `pap`, `chap`, `papChap` - Default value: `none`
	AuthenticationType *string `pulumi:"authenticationType"`
	// Variable name
	AuthenticationTypeVariable *string `pulumi:"authenticationTypeVariable"`
	// The description of the feature template
	Description string `pulumi:"description"`
	// List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
	// `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
	// `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
	DeviceTypes []string `pulumi:"deviceTypes"`
	// The name of the feature template
	Name *string `pulumi:"name"`
	// No Overwrite
	NoOverwrite *bool `pulumi:"noOverwrite"`
	// Variable name
	NoOverwriteVariable *string `pulumi:"noOverwriteVariable"`
	// Set packet data network type - Choices: `ipv4`, `ipv4v6`, `ipv6` - Default value: `ipv4`
	PacketDataNetworkType *string `pulumi:"packetDataNetworkType"`
	// Variable name
	PacketDataNetworkTypeVariable *string `pulumi:"packetDataNetworkTypeVariable"`
	// Set Profile ID - Range: `1`-`16`
	ProfileId *int `pulumi:"profileId"`
	// Variable name
	ProfileIdVariable *string `pulumi:"profileIdVariable"`
	// Set the profile password
	ProfilePassword *string `pulumi:"profilePassword"`
	// Variable name
	ProfilePasswordVariable *string `pulumi:"profilePasswordVariable"`
	// Set the profile username
	ProfileUsername *string `pulumi:"profileUsername"`
	// Variable name
	ProfileUsernameVariable *string `pulumi:"profileUsernameVariable"`
}

// The set of arguments for constructing a CellularCedgeProfileFeatureTemplate resource.
type CellularCedgeProfileFeatureTemplateArgs struct {
	// Set access point name
	AccessPointName pulumi.StringPtrInput
	// Variable name
	AccessPointNameVariable pulumi.StringPtrInput
	// Set authentication type - Choices: `none`, `pap`, `chap`, `papChap` - Default value: `none`
	AuthenticationType pulumi.StringPtrInput
	// Variable name
	AuthenticationTypeVariable pulumi.StringPtrInput
	// The description of the feature template
	Description pulumi.StringInput
	// List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
	// `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
	// `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
	DeviceTypes pulumi.StringArrayInput
	// The name of the feature template
	Name pulumi.StringPtrInput
	// No Overwrite
	NoOverwrite pulumi.BoolPtrInput
	// Variable name
	NoOverwriteVariable pulumi.StringPtrInput
	// Set packet data network type - Choices: `ipv4`, `ipv4v6`, `ipv6` - Default value: `ipv4`
	PacketDataNetworkType pulumi.StringPtrInput
	// Variable name
	PacketDataNetworkTypeVariable pulumi.StringPtrInput
	// Set Profile ID - Range: `1`-`16`
	ProfileId pulumi.IntPtrInput
	// Variable name
	ProfileIdVariable pulumi.StringPtrInput
	// Set the profile password
	ProfilePassword pulumi.StringPtrInput
	// Variable name
	ProfilePasswordVariable pulumi.StringPtrInput
	// Set the profile username
	ProfileUsername pulumi.StringPtrInput
	// Variable name
	ProfileUsernameVariable pulumi.StringPtrInput
}

func (CellularCedgeProfileFeatureTemplateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cellularCedgeProfileFeatureTemplateArgs)(nil)).Elem()
}

type CellularCedgeProfileFeatureTemplateInput interface {
	pulumi.Input

	ToCellularCedgeProfileFeatureTemplateOutput() CellularCedgeProfileFeatureTemplateOutput
	ToCellularCedgeProfileFeatureTemplateOutputWithContext(ctx context.Context) CellularCedgeProfileFeatureTemplateOutput
}

func (*CellularCedgeProfileFeatureTemplate) ElementType() reflect.Type {
	return reflect.TypeOf((**CellularCedgeProfileFeatureTemplate)(nil)).Elem()
}

func (i *CellularCedgeProfileFeatureTemplate) ToCellularCedgeProfileFeatureTemplateOutput() CellularCedgeProfileFeatureTemplateOutput {
	return i.ToCellularCedgeProfileFeatureTemplateOutputWithContext(context.Background())
}

func (i *CellularCedgeProfileFeatureTemplate) ToCellularCedgeProfileFeatureTemplateOutputWithContext(ctx context.Context) CellularCedgeProfileFeatureTemplateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CellularCedgeProfileFeatureTemplateOutput)
}

// CellularCedgeProfileFeatureTemplateArrayInput is an input type that accepts CellularCedgeProfileFeatureTemplateArray and CellularCedgeProfileFeatureTemplateArrayOutput values.
// You can construct a concrete instance of `CellularCedgeProfileFeatureTemplateArrayInput` via:
//
//	CellularCedgeProfileFeatureTemplateArray{ CellularCedgeProfileFeatureTemplateArgs{...} }
type CellularCedgeProfileFeatureTemplateArrayInput interface {
	pulumi.Input

	ToCellularCedgeProfileFeatureTemplateArrayOutput() CellularCedgeProfileFeatureTemplateArrayOutput
	ToCellularCedgeProfileFeatureTemplateArrayOutputWithContext(context.Context) CellularCedgeProfileFeatureTemplateArrayOutput
}

type CellularCedgeProfileFeatureTemplateArray []CellularCedgeProfileFeatureTemplateInput

func (CellularCedgeProfileFeatureTemplateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CellularCedgeProfileFeatureTemplate)(nil)).Elem()
}

func (i CellularCedgeProfileFeatureTemplateArray) ToCellularCedgeProfileFeatureTemplateArrayOutput() CellularCedgeProfileFeatureTemplateArrayOutput {
	return i.ToCellularCedgeProfileFeatureTemplateArrayOutputWithContext(context.Background())
}

func (i CellularCedgeProfileFeatureTemplateArray) ToCellularCedgeProfileFeatureTemplateArrayOutputWithContext(ctx context.Context) CellularCedgeProfileFeatureTemplateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CellularCedgeProfileFeatureTemplateArrayOutput)
}

// CellularCedgeProfileFeatureTemplateMapInput is an input type that accepts CellularCedgeProfileFeatureTemplateMap and CellularCedgeProfileFeatureTemplateMapOutput values.
// You can construct a concrete instance of `CellularCedgeProfileFeatureTemplateMapInput` via:
//
//	CellularCedgeProfileFeatureTemplateMap{ "key": CellularCedgeProfileFeatureTemplateArgs{...} }
type CellularCedgeProfileFeatureTemplateMapInput interface {
	pulumi.Input

	ToCellularCedgeProfileFeatureTemplateMapOutput() CellularCedgeProfileFeatureTemplateMapOutput
	ToCellularCedgeProfileFeatureTemplateMapOutputWithContext(context.Context) CellularCedgeProfileFeatureTemplateMapOutput
}

type CellularCedgeProfileFeatureTemplateMap map[string]CellularCedgeProfileFeatureTemplateInput

func (CellularCedgeProfileFeatureTemplateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CellularCedgeProfileFeatureTemplate)(nil)).Elem()
}

func (i CellularCedgeProfileFeatureTemplateMap) ToCellularCedgeProfileFeatureTemplateMapOutput() CellularCedgeProfileFeatureTemplateMapOutput {
	return i.ToCellularCedgeProfileFeatureTemplateMapOutputWithContext(context.Background())
}

func (i CellularCedgeProfileFeatureTemplateMap) ToCellularCedgeProfileFeatureTemplateMapOutputWithContext(ctx context.Context) CellularCedgeProfileFeatureTemplateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CellularCedgeProfileFeatureTemplateMapOutput)
}

type CellularCedgeProfileFeatureTemplateOutput struct{ *pulumi.OutputState }

func (CellularCedgeProfileFeatureTemplateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CellularCedgeProfileFeatureTemplate)(nil)).Elem()
}

func (o CellularCedgeProfileFeatureTemplateOutput) ToCellularCedgeProfileFeatureTemplateOutput() CellularCedgeProfileFeatureTemplateOutput {
	return o
}

func (o CellularCedgeProfileFeatureTemplateOutput) ToCellularCedgeProfileFeatureTemplateOutputWithContext(ctx context.Context) CellularCedgeProfileFeatureTemplateOutput {
	return o
}

// Set access point name
func (o CellularCedgeProfileFeatureTemplateOutput) AccessPointName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CellularCedgeProfileFeatureTemplate) pulumi.StringPtrOutput { return v.AccessPointName }).(pulumi.StringPtrOutput)
}

// Variable name
func (o CellularCedgeProfileFeatureTemplateOutput) AccessPointNameVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CellularCedgeProfileFeatureTemplate) pulumi.StringPtrOutput { return v.AccessPointNameVariable }).(pulumi.StringPtrOutput)
}

// Set authentication type - Choices: `none`, `pap`, `chap`, `papChap` - Default value: `none`
func (o CellularCedgeProfileFeatureTemplateOutput) AuthenticationType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CellularCedgeProfileFeatureTemplate) pulumi.StringPtrOutput { return v.AuthenticationType }).(pulumi.StringPtrOutput)
}

// Variable name
func (o CellularCedgeProfileFeatureTemplateOutput) AuthenticationTypeVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CellularCedgeProfileFeatureTemplate) pulumi.StringPtrOutput {
		return v.AuthenticationTypeVariable
	}).(pulumi.StringPtrOutput)
}

// The description of the feature template
func (o CellularCedgeProfileFeatureTemplateOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *CellularCedgeProfileFeatureTemplate) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
// `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
// `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
func (o CellularCedgeProfileFeatureTemplateOutput) DeviceTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CellularCedgeProfileFeatureTemplate) pulumi.StringArrayOutput { return v.DeviceTypes }).(pulumi.StringArrayOutput)
}

// The name of the feature template
func (o CellularCedgeProfileFeatureTemplateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CellularCedgeProfileFeatureTemplate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// No Overwrite
func (o CellularCedgeProfileFeatureTemplateOutput) NoOverwrite() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CellularCedgeProfileFeatureTemplate) pulumi.BoolPtrOutput { return v.NoOverwrite }).(pulumi.BoolPtrOutput)
}

// Variable name
func (o CellularCedgeProfileFeatureTemplateOutput) NoOverwriteVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CellularCedgeProfileFeatureTemplate) pulumi.StringPtrOutput { return v.NoOverwriteVariable }).(pulumi.StringPtrOutput)
}

// Set packet data network type - Choices: `ipv4`, `ipv4v6`, `ipv6` - Default value: `ipv4`
func (o CellularCedgeProfileFeatureTemplateOutput) PacketDataNetworkType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CellularCedgeProfileFeatureTemplate) pulumi.StringPtrOutput { return v.PacketDataNetworkType }).(pulumi.StringPtrOutput)
}

// Variable name
func (o CellularCedgeProfileFeatureTemplateOutput) PacketDataNetworkTypeVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CellularCedgeProfileFeatureTemplate) pulumi.StringPtrOutput {
		return v.PacketDataNetworkTypeVariable
	}).(pulumi.StringPtrOutput)
}

// Set Profile ID - Range: `1`-`16`
func (o CellularCedgeProfileFeatureTemplateOutput) ProfileId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *CellularCedgeProfileFeatureTemplate) pulumi.IntPtrOutput { return v.ProfileId }).(pulumi.IntPtrOutput)
}

// Variable name
func (o CellularCedgeProfileFeatureTemplateOutput) ProfileIdVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CellularCedgeProfileFeatureTemplate) pulumi.StringPtrOutput { return v.ProfileIdVariable }).(pulumi.StringPtrOutput)
}

// Set the profile password
func (o CellularCedgeProfileFeatureTemplateOutput) ProfilePassword() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CellularCedgeProfileFeatureTemplate) pulumi.StringPtrOutput { return v.ProfilePassword }).(pulumi.StringPtrOutput)
}

// Variable name
func (o CellularCedgeProfileFeatureTemplateOutput) ProfilePasswordVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CellularCedgeProfileFeatureTemplate) pulumi.StringPtrOutput { return v.ProfilePasswordVariable }).(pulumi.StringPtrOutput)
}

// Set the profile username
func (o CellularCedgeProfileFeatureTemplateOutput) ProfileUsername() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CellularCedgeProfileFeatureTemplate) pulumi.StringPtrOutput { return v.ProfileUsername }).(pulumi.StringPtrOutput)
}

// Variable name
func (o CellularCedgeProfileFeatureTemplateOutput) ProfileUsernameVariable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CellularCedgeProfileFeatureTemplate) pulumi.StringPtrOutput { return v.ProfileUsernameVariable }).(pulumi.StringPtrOutput)
}

// The template type
func (o CellularCedgeProfileFeatureTemplateOutput) TemplateType() pulumi.StringOutput {
	return o.ApplyT(func(v *CellularCedgeProfileFeatureTemplate) pulumi.StringOutput { return v.TemplateType }).(pulumi.StringOutput)
}

// The version of the feature template
func (o CellularCedgeProfileFeatureTemplateOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *CellularCedgeProfileFeatureTemplate) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type CellularCedgeProfileFeatureTemplateArrayOutput struct{ *pulumi.OutputState }

func (CellularCedgeProfileFeatureTemplateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CellularCedgeProfileFeatureTemplate)(nil)).Elem()
}

func (o CellularCedgeProfileFeatureTemplateArrayOutput) ToCellularCedgeProfileFeatureTemplateArrayOutput() CellularCedgeProfileFeatureTemplateArrayOutput {
	return o
}

func (o CellularCedgeProfileFeatureTemplateArrayOutput) ToCellularCedgeProfileFeatureTemplateArrayOutputWithContext(ctx context.Context) CellularCedgeProfileFeatureTemplateArrayOutput {
	return o
}

func (o CellularCedgeProfileFeatureTemplateArrayOutput) Index(i pulumi.IntInput) CellularCedgeProfileFeatureTemplateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CellularCedgeProfileFeatureTemplate {
		return vs[0].([]*CellularCedgeProfileFeatureTemplate)[vs[1].(int)]
	}).(CellularCedgeProfileFeatureTemplateOutput)
}

type CellularCedgeProfileFeatureTemplateMapOutput struct{ *pulumi.OutputState }

func (CellularCedgeProfileFeatureTemplateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CellularCedgeProfileFeatureTemplate)(nil)).Elem()
}

func (o CellularCedgeProfileFeatureTemplateMapOutput) ToCellularCedgeProfileFeatureTemplateMapOutput() CellularCedgeProfileFeatureTemplateMapOutput {
	return o
}

func (o CellularCedgeProfileFeatureTemplateMapOutput) ToCellularCedgeProfileFeatureTemplateMapOutputWithContext(ctx context.Context) CellularCedgeProfileFeatureTemplateMapOutput {
	return o
}

func (o CellularCedgeProfileFeatureTemplateMapOutput) MapIndex(k pulumi.StringInput) CellularCedgeProfileFeatureTemplateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CellularCedgeProfileFeatureTemplate {
		return vs[0].(map[string]*CellularCedgeProfileFeatureTemplate)[vs[1].(string)]
	}).(CellularCedgeProfileFeatureTemplateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CellularCedgeProfileFeatureTemplateInput)(nil)).Elem(), &CellularCedgeProfileFeatureTemplate{})
	pulumi.RegisterInputType(reflect.TypeOf((*CellularCedgeProfileFeatureTemplateArrayInput)(nil)).Elem(), CellularCedgeProfileFeatureTemplateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CellularCedgeProfileFeatureTemplateMapInput)(nil)).Elem(), CellularCedgeProfileFeatureTemplateMap{})
	pulumi.RegisterOutputType(CellularCedgeProfileFeatureTemplateOutput{})
	pulumi.RegisterOutputType(CellularCedgeProfileFeatureTemplateArrayOutput{})
	pulumi.RegisterOutputType(CellularCedgeProfileFeatureTemplateMapOutput{})
}
