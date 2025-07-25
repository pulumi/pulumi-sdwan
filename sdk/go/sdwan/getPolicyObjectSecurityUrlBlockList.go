// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source can read the Policy Object Security URL Block List Policy_object.
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
//			_, err := sdwan.LookupPolicyObjectSecurityUrlBlockList(ctx, &sdwan.LookupPolicyObjectSecurityUrlBlockListArgs{
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
func LookupPolicyObjectSecurityUrlBlockList(ctx *pulumi.Context, args *LookupPolicyObjectSecurityUrlBlockListArgs, opts ...pulumi.InvokeOption) (*LookupPolicyObjectSecurityUrlBlockListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPolicyObjectSecurityUrlBlockListResult
	err := ctx.Invoke("sdwan:index/getPolicyObjectSecurityUrlBlockList:getPolicyObjectSecurityUrlBlockList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPolicyObjectSecurityUrlBlockList.
type LookupPolicyObjectSecurityUrlBlockListArgs struct {
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The id of the Policy_object
	Id string `pulumi:"id"`
}

// A collection of values returned by getPolicyObjectSecurityUrlBlockList.
type LookupPolicyObjectSecurityUrlBlockListResult struct {
	// The description of the Policy_object
	Description string `pulumi:"description"`
	// URL List
	Entries []GetPolicyObjectSecurityUrlBlockListEntry `pulumi:"entries"`
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The id of the Policy_object
	Id string `pulumi:"id"`
	// The name of the Policy_object
	Name string `pulumi:"name"`
	// The version of the Policy_object
	Version int `pulumi:"version"`
}

func LookupPolicyObjectSecurityUrlBlockListOutput(ctx *pulumi.Context, args LookupPolicyObjectSecurityUrlBlockListOutputArgs, opts ...pulumi.InvokeOption) LookupPolicyObjectSecurityUrlBlockListResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupPolicyObjectSecurityUrlBlockListResultOutput, error) {
			args := v.(LookupPolicyObjectSecurityUrlBlockListArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("sdwan:index/getPolicyObjectSecurityUrlBlockList:getPolicyObjectSecurityUrlBlockList", args, LookupPolicyObjectSecurityUrlBlockListResultOutput{}, options).(LookupPolicyObjectSecurityUrlBlockListResultOutput), nil
		}).(LookupPolicyObjectSecurityUrlBlockListResultOutput)
}

// A collection of arguments for invoking getPolicyObjectSecurityUrlBlockList.
type LookupPolicyObjectSecurityUrlBlockListOutputArgs struct {
	// Feature Profile ID
	FeatureProfileId pulumi.StringInput `pulumi:"featureProfileId"`
	// The id of the Policy_object
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupPolicyObjectSecurityUrlBlockListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPolicyObjectSecurityUrlBlockListArgs)(nil)).Elem()
}

// A collection of values returned by getPolicyObjectSecurityUrlBlockList.
type LookupPolicyObjectSecurityUrlBlockListResultOutput struct{ *pulumi.OutputState }

func (LookupPolicyObjectSecurityUrlBlockListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPolicyObjectSecurityUrlBlockListResult)(nil)).Elem()
}

func (o LookupPolicyObjectSecurityUrlBlockListResultOutput) ToLookupPolicyObjectSecurityUrlBlockListResultOutput() LookupPolicyObjectSecurityUrlBlockListResultOutput {
	return o
}

func (o LookupPolicyObjectSecurityUrlBlockListResultOutput) ToLookupPolicyObjectSecurityUrlBlockListResultOutputWithContext(ctx context.Context) LookupPolicyObjectSecurityUrlBlockListResultOutput {
	return o
}

// The description of the Policy_object
func (o LookupPolicyObjectSecurityUrlBlockListResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPolicyObjectSecurityUrlBlockListResult) string { return v.Description }).(pulumi.StringOutput)
}

// URL List
func (o LookupPolicyObjectSecurityUrlBlockListResultOutput) Entries() GetPolicyObjectSecurityUrlBlockListEntryArrayOutput {
	return o.ApplyT(func(v LookupPolicyObjectSecurityUrlBlockListResult) []GetPolicyObjectSecurityUrlBlockListEntry {
		return v.Entries
	}).(GetPolicyObjectSecurityUrlBlockListEntryArrayOutput)
}

// Feature Profile ID
func (o LookupPolicyObjectSecurityUrlBlockListResultOutput) FeatureProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPolicyObjectSecurityUrlBlockListResult) string { return v.FeatureProfileId }).(pulumi.StringOutput)
}

// The id of the Policy_object
func (o LookupPolicyObjectSecurityUrlBlockListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPolicyObjectSecurityUrlBlockListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the Policy_object
func (o LookupPolicyObjectSecurityUrlBlockListResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPolicyObjectSecurityUrlBlockListResult) string { return v.Name }).(pulumi.StringOutput)
}

// The version of the Policy_object
func (o LookupPolicyObjectSecurityUrlBlockListResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupPolicyObjectSecurityUrlBlockListResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPolicyObjectSecurityUrlBlockListResultOutput{})
}
