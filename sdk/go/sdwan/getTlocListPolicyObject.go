// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source can read the TLOC List Policy Object .
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
//			_, err := sdwan.LookupTlocListPolicyObject(ctx, &sdwan.LookupTlocListPolicyObjectArgs{
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
func LookupTlocListPolicyObject(ctx *pulumi.Context, args *LookupTlocListPolicyObjectArgs, opts ...pulumi.InvokeOption) (*LookupTlocListPolicyObjectResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupTlocListPolicyObjectResult
	err := ctx.Invoke("sdwan:index/getTlocListPolicyObject:getTlocListPolicyObject", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTlocListPolicyObject.
type LookupTlocListPolicyObjectArgs struct {
	// The id of the object
	Id string `pulumi:"id"`
}

// A collection of values returned by getTlocListPolicyObject.
type LookupTlocListPolicyObjectResult struct {
	// List of entries
	Entries []GetTlocListPolicyObjectEntry `pulumi:"entries"`
	// The id of the object
	Id string `pulumi:"id"`
	// The name of the policy object
	Name string `pulumi:"name"`
	// The version of the object
	Version int `pulumi:"version"`
}

func LookupTlocListPolicyObjectOutput(ctx *pulumi.Context, args LookupTlocListPolicyObjectOutputArgs, opts ...pulumi.InvokeOption) LookupTlocListPolicyObjectResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupTlocListPolicyObjectResultOutput, error) {
			args := v.(LookupTlocListPolicyObjectArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("sdwan:index/getTlocListPolicyObject:getTlocListPolicyObject", args, LookupTlocListPolicyObjectResultOutput{}, options).(LookupTlocListPolicyObjectResultOutput), nil
		}).(LookupTlocListPolicyObjectResultOutput)
}

// A collection of arguments for invoking getTlocListPolicyObject.
type LookupTlocListPolicyObjectOutputArgs struct {
	// The id of the object
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupTlocListPolicyObjectOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTlocListPolicyObjectArgs)(nil)).Elem()
}

// A collection of values returned by getTlocListPolicyObject.
type LookupTlocListPolicyObjectResultOutput struct{ *pulumi.OutputState }

func (LookupTlocListPolicyObjectResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTlocListPolicyObjectResult)(nil)).Elem()
}

func (o LookupTlocListPolicyObjectResultOutput) ToLookupTlocListPolicyObjectResultOutput() LookupTlocListPolicyObjectResultOutput {
	return o
}

func (o LookupTlocListPolicyObjectResultOutput) ToLookupTlocListPolicyObjectResultOutputWithContext(ctx context.Context) LookupTlocListPolicyObjectResultOutput {
	return o
}

// List of entries
func (o LookupTlocListPolicyObjectResultOutput) Entries() GetTlocListPolicyObjectEntryArrayOutput {
	return o.ApplyT(func(v LookupTlocListPolicyObjectResult) []GetTlocListPolicyObjectEntry { return v.Entries }).(GetTlocListPolicyObjectEntryArrayOutput)
}

// The id of the object
func (o LookupTlocListPolicyObjectResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlocListPolicyObjectResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the policy object
func (o LookupTlocListPolicyObjectResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlocListPolicyObjectResult) string { return v.Name }).(pulumi.StringOutput)
}

// The version of the object
func (o LookupTlocListPolicyObjectResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupTlocListPolicyObjectResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTlocListPolicyObjectResultOutput{})
}
