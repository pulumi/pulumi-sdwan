// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source can read the System Security profile parcel.
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
//			_, err := sdwan.LookupSystemSecurityProfileParcel(ctx, &sdwan.LookupSystemSecurityProfileParcelArgs{
//				Id:               "f6b2c44c-693c-4763-b010-895aa3d236bd",
//				FeatureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupSystemSecurityProfileParcel(ctx *pulumi.Context, args *LookupSystemSecurityProfileParcelArgs, opts ...pulumi.InvokeOption) (*LookupSystemSecurityProfileParcelResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSystemSecurityProfileParcelResult
	err := ctx.Invoke("sdwan:index/getSystemSecurityProfileParcel:getSystemSecurityProfileParcel", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSystemSecurityProfileParcel.
type LookupSystemSecurityProfileParcelArgs struct {
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The id of the profile parcel
	Id string `pulumi:"id"`
}

// A collection of values returned by getSystemSecurityProfileParcel.
type LookupSystemSecurityProfileParcelResult struct {
	// Set the sliding replay window size
	AntiReplayWindow string `pulumi:"antiReplayWindow"`
	// Variable name
	AntiReplayWindowVariable string `pulumi:"antiReplayWindowVariable"`
	// The description of the profile parcel
	Description string `pulumi:"description"`
	// Extended Anti-Replay Window
	ExtendedAntiReplayWindow int `pulumi:"extendedAntiReplayWindow"`
	// Variable name
	ExtendedAntiReplayWindowVariable string `pulumi:"extendedAntiReplayWindowVariable"`
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The id of the profile parcel
	Id string `pulumi:"id"`
	// Variable name
	IntegrityTypeVariable string `pulumi:"integrityTypeVariable"`
	// Set the authentication type for DTLS connections
	IntegrityTypes []string `pulumi:"integrityTypes"`
	// Enable or disable IPsec pairwise-keying
	IpsecPairwiseKeying bool `pulumi:"ipsecPairwiseKeying"`
	// Variable name
	IpsecPairwiseKeyingVariable string `pulumi:"ipsecPairwiseKeyingVariable"`
	// Configure a Keychain
	Keychains []GetSystemSecurityProfileParcelKeychain `pulumi:"keychains"`
	// Configure a Key
	Keys []GetSystemSecurityProfileParcelKey `pulumi:"keys"`
	// The name of the profile parcel
	Name string `pulumi:"name"`
	// Set how often to change the AES key for DTLS connections
	Rekey int `pulumi:"rekey"`
	// Variable name
	RekeyVariable string `pulumi:"rekeyVariable"`
	// The version of the profile parcel
	Version int `pulumi:"version"`
}

func LookupSystemSecurityProfileParcelOutput(ctx *pulumi.Context, args LookupSystemSecurityProfileParcelOutputArgs, opts ...pulumi.InvokeOption) LookupSystemSecurityProfileParcelResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSystemSecurityProfileParcelResult, error) {
			args := v.(LookupSystemSecurityProfileParcelArgs)
			r, err := LookupSystemSecurityProfileParcel(ctx, &args, opts...)
			var s LookupSystemSecurityProfileParcelResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSystemSecurityProfileParcelResultOutput)
}

// A collection of arguments for invoking getSystemSecurityProfileParcel.
type LookupSystemSecurityProfileParcelOutputArgs struct {
	// Feature Profile ID
	FeatureProfileId pulumi.StringInput `pulumi:"featureProfileId"`
	// The id of the profile parcel
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupSystemSecurityProfileParcelOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSystemSecurityProfileParcelArgs)(nil)).Elem()
}

// A collection of values returned by getSystemSecurityProfileParcel.
type LookupSystemSecurityProfileParcelResultOutput struct{ *pulumi.OutputState }

func (LookupSystemSecurityProfileParcelResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSystemSecurityProfileParcelResult)(nil)).Elem()
}

func (o LookupSystemSecurityProfileParcelResultOutput) ToLookupSystemSecurityProfileParcelResultOutput() LookupSystemSecurityProfileParcelResultOutput {
	return o
}

func (o LookupSystemSecurityProfileParcelResultOutput) ToLookupSystemSecurityProfileParcelResultOutputWithContext(ctx context.Context) LookupSystemSecurityProfileParcelResultOutput {
	return o
}

// Set the sliding replay window size
func (o LookupSystemSecurityProfileParcelResultOutput) AntiReplayWindow() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemSecurityProfileParcelResult) string { return v.AntiReplayWindow }).(pulumi.StringOutput)
}

// Variable name
func (o LookupSystemSecurityProfileParcelResultOutput) AntiReplayWindowVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemSecurityProfileParcelResult) string { return v.AntiReplayWindowVariable }).(pulumi.StringOutput)
}

// The description of the profile parcel
func (o LookupSystemSecurityProfileParcelResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemSecurityProfileParcelResult) string { return v.Description }).(pulumi.StringOutput)
}

// Extended Anti-Replay Window
func (o LookupSystemSecurityProfileParcelResultOutput) ExtendedAntiReplayWindow() pulumi.IntOutput {
	return o.ApplyT(func(v LookupSystemSecurityProfileParcelResult) int { return v.ExtendedAntiReplayWindow }).(pulumi.IntOutput)
}

// Variable name
func (o LookupSystemSecurityProfileParcelResultOutput) ExtendedAntiReplayWindowVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemSecurityProfileParcelResult) string { return v.ExtendedAntiReplayWindowVariable }).(pulumi.StringOutput)
}

// Feature Profile ID
func (o LookupSystemSecurityProfileParcelResultOutput) FeatureProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemSecurityProfileParcelResult) string { return v.FeatureProfileId }).(pulumi.StringOutput)
}

// The id of the profile parcel
func (o LookupSystemSecurityProfileParcelResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemSecurityProfileParcelResult) string { return v.Id }).(pulumi.StringOutput)
}

// Variable name
func (o LookupSystemSecurityProfileParcelResultOutput) IntegrityTypeVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemSecurityProfileParcelResult) string { return v.IntegrityTypeVariable }).(pulumi.StringOutput)
}

// Set the authentication type for DTLS connections
func (o LookupSystemSecurityProfileParcelResultOutput) IntegrityTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupSystemSecurityProfileParcelResult) []string { return v.IntegrityTypes }).(pulumi.StringArrayOutput)
}

// Enable or disable IPsec pairwise-keying
func (o LookupSystemSecurityProfileParcelResultOutput) IpsecPairwiseKeying() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupSystemSecurityProfileParcelResult) bool { return v.IpsecPairwiseKeying }).(pulumi.BoolOutput)
}

// Variable name
func (o LookupSystemSecurityProfileParcelResultOutput) IpsecPairwiseKeyingVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemSecurityProfileParcelResult) string { return v.IpsecPairwiseKeyingVariable }).(pulumi.StringOutput)
}

// Configure a Keychain
func (o LookupSystemSecurityProfileParcelResultOutput) Keychains() GetSystemSecurityProfileParcelKeychainArrayOutput {
	return o.ApplyT(func(v LookupSystemSecurityProfileParcelResult) []GetSystemSecurityProfileParcelKeychain {
		return v.Keychains
	}).(GetSystemSecurityProfileParcelKeychainArrayOutput)
}

// Configure a Key
func (o LookupSystemSecurityProfileParcelResultOutput) Keys() GetSystemSecurityProfileParcelKeyArrayOutput {
	return o.ApplyT(func(v LookupSystemSecurityProfileParcelResult) []GetSystemSecurityProfileParcelKey { return v.Keys }).(GetSystemSecurityProfileParcelKeyArrayOutput)
}

// The name of the profile parcel
func (o LookupSystemSecurityProfileParcelResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemSecurityProfileParcelResult) string { return v.Name }).(pulumi.StringOutput)
}

// Set how often to change the AES key for DTLS connections
func (o LookupSystemSecurityProfileParcelResultOutput) Rekey() pulumi.IntOutput {
	return o.ApplyT(func(v LookupSystemSecurityProfileParcelResult) int { return v.Rekey }).(pulumi.IntOutput)
}

// Variable name
func (o LookupSystemSecurityProfileParcelResultOutput) RekeyVariable() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSystemSecurityProfileParcelResult) string { return v.RekeyVariable }).(pulumi.StringOutput)
}

// The version of the profile parcel
func (o LookupSystemSecurityProfileParcelResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupSystemSecurityProfileParcelResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSystemSecurityProfileParcelResultOutput{})
}
