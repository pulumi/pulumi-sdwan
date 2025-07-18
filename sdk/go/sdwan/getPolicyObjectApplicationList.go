// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source can read the Policy Object Application List Policy_object.
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
//			_, err := sdwan.LookupPolicyObjectApplicationList(ctx, &sdwan.LookupPolicyObjectApplicationListArgs{
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
func LookupPolicyObjectApplicationList(ctx *pulumi.Context, args *LookupPolicyObjectApplicationListArgs, opts ...pulumi.InvokeOption) (*LookupPolicyObjectApplicationListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPolicyObjectApplicationListResult
	err := ctx.Invoke("sdwan:index/getPolicyObjectApplicationList:getPolicyObjectApplicationList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPolicyObjectApplicationList.
type LookupPolicyObjectApplicationListArgs struct {
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The id of the Policy_object
	Id string `pulumi:"id"`
}

// A collection of values returned by getPolicyObjectApplicationList.
type LookupPolicyObjectApplicationListResult struct {
	// The description of the Policy_object
	Description string `pulumi:"description"`
	// Centralized Policy App List
	Entries []GetPolicyObjectApplicationListEntry `pulumi:"entries"`
	// Feature Profile ID
	FeatureProfileId string `pulumi:"featureProfileId"`
	// The id of the Policy_object
	Id string `pulumi:"id"`
	// The name of the Policy_object
	Name string `pulumi:"name"`
	// The version of the Policy_object
	Version int `pulumi:"version"`
}

func LookupPolicyObjectApplicationListOutput(ctx *pulumi.Context, args LookupPolicyObjectApplicationListOutputArgs, opts ...pulumi.InvokeOption) LookupPolicyObjectApplicationListResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupPolicyObjectApplicationListResultOutput, error) {
			args := v.(LookupPolicyObjectApplicationListArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("sdwan:index/getPolicyObjectApplicationList:getPolicyObjectApplicationList", args, LookupPolicyObjectApplicationListResultOutput{}, options).(LookupPolicyObjectApplicationListResultOutput), nil
		}).(LookupPolicyObjectApplicationListResultOutput)
}

// A collection of arguments for invoking getPolicyObjectApplicationList.
type LookupPolicyObjectApplicationListOutputArgs struct {
	// Feature Profile ID
	FeatureProfileId pulumi.StringInput `pulumi:"featureProfileId"`
	// The id of the Policy_object
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupPolicyObjectApplicationListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPolicyObjectApplicationListArgs)(nil)).Elem()
}

// A collection of values returned by getPolicyObjectApplicationList.
type LookupPolicyObjectApplicationListResultOutput struct{ *pulumi.OutputState }

func (LookupPolicyObjectApplicationListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPolicyObjectApplicationListResult)(nil)).Elem()
}

func (o LookupPolicyObjectApplicationListResultOutput) ToLookupPolicyObjectApplicationListResultOutput() LookupPolicyObjectApplicationListResultOutput {
	return o
}

func (o LookupPolicyObjectApplicationListResultOutput) ToLookupPolicyObjectApplicationListResultOutputWithContext(ctx context.Context) LookupPolicyObjectApplicationListResultOutput {
	return o
}

// The description of the Policy_object
func (o LookupPolicyObjectApplicationListResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPolicyObjectApplicationListResult) string { return v.Description }).(pulumi.StringOutput)
}

// Centralized Policy App List
func (o LookupPolicyObjectApplicationListResultOutput) Entries() GetPolicyObjectApplicationListEntryArrayOutput {
	return o.ApplyT(func(v LookupPolicyObjectApplicationListResult) []GetPolicyObjectApplicationListEntry {
		return v.Entries
	}).(GetPolicyObjectApplicationListEntryArrayOutput)
}

// Feature Profile ID
func (o LookupPolicyObjectApplicationListResultOutput) FeatureProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPolicyObjectApplicationListResult) string { return v.FeatureProfileId }).(pulumi.StringOutput)
}

// The id of the Policy_object
func (o LookupPolicyObjectApplicationListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPolicyObjectApplicationListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the Policy_object
func (o LookupPolicyObjectApplicationListResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPolicyObjectApplicationListResult) string { return v.Name }).(pulumi.StringOutput)
}

// The version of the Policy_object
func (o LookupPolicyObjectApplicationListResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupPolicyObjectApplicationListResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPolicyObjectApplicationListResultOutput{})
}
