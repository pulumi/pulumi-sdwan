// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source can read the Policy Object Feature Profile .
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
//			_, err := sdwan.LookupPolicyObjectFeatureProfile(ctx, &sdwan.LookupPolicyObjectFeatureProfileArgs{
//				Id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupPolicyObjectFeatureProfile(ctx *pulumi.Context, args *LookupPolicyObjectFeatureProfileArgs, opts ...pulumi.InvokeOption) (*LookupPolicyObjectFeatureProfileResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPolicyObjectFeatureProfileResult
	err := ctx.Invoke("sdwan:index/getPolicyObjectFeatureProfile:getPolicyObjectFeatureProfile", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPolicyObjectFeatureProfile.
type LookupPolicyObjectFeatureProfileArgs struct {
	// The id of the object
	Id string `pulumi:"id"`
}

// A collection of values returned by getPolicyObjectFeatureProfile.
type LookupPolicyObjectFeatureProfileResult struct {
	// Description
	Description string `pulumi:"description"`
	// The id of the object
	Id string `pulumi:"id"`
	// The name of the policy object feature profile
	Name string `pulumi:"name"`
}

func LookupPolicyObjectFeatureProfileOutput(ctx *pulumi.Context, args LookupPolicyObjectFeatureProfileOutputArgs, opts ...pulumi.InvokeOption) LookupPolicyObjectFeatureProfileResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupPolicyObjectFeatureProfileResultOutput, error) {
			args := v.(LookupPolicyObjectFeatureProfileArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("sdwan:index/getPolicyObjectFeatureProfile:getPolicyObjectFeatureProfile", args, LookupPolicyObjectFeatureProfileResultOutput{}, options).(LookupPolicyObjectFeatureProfileResultOutput), nil
		}).(LookupPolicyObjectFeatureProfileResultOutput)
}

// A collection of arguments for invoking getPolicyObjectFeatureProfile.
type LookupPolicyObjectFeatureProfileOutputArgs struct {
	// The id of the object
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupPolicyObjectFeatureProfileOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPolicyObjectFeatureProfileArgs)(nil)).Elem()
}

// A collection of values returned by getPolicyObjectFeatureProfile.
type LookupPolicyObjectFeatureProfileResultOutput struct{ *pulumi.OutputState }

func (LookupPolicyObjectFeatureProfileResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPolicyObjectFeatureProfileResult)(nil)).Elem()
}

func (o LookupPolicyObjectFeatureProfileResultOutput) ToLookupPolicyObjectFeatureProfileResultOutput() LookupPolicyObjectFeatureProfileResultOutput {
	return o
}

func (o LookupPolicyObjectFeatureProfileResultOutput) ToLookupPolicyObjectFeatureProfileResultOutputWithContext(ctx context.Context) LookupPolicyObjectFeatureProfileResultOutput {
	return o
}

// Description
func (o LookupPolicyObjectFeatureProfileResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPolicyObjectFeatureProfileResult) string { return v.Description }).(pulumi.StringOutput)
}

// The id of the object
func (o LookupPolicyObjectFeatureProfileResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPolicyObjectFeatureProfileResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the policy object feature profile
func (o LookupPolicyObjectFeatureProfileResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPolicyObjectFeatureProfileResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPolicyObjectFeatureProfileResultOutput{})
}
