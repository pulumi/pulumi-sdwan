// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source can read the Block URL List Policy Object .
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
//			_, err := sdwan.LookupBlockUrlListPolicyObject(ctx, &sdwan.LookupBlockUrlListPolicyObjectArgs{
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
func LookupBlockUrlListPolicyObject(ctx *pulumi.Context, args *LookupBlockUrlListPolicyObjectArgs, opts ...pulumi.InvokeOption) (*LookupBlockUrlListPolicyObjectResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupBlockUrlListPolicyObjectResult
	err := ctx.Invoke("sdwan:index/getBlockUrlListPolicyObject:getBlockUrlListPolicyObject", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBlockUrlListPolicyObject.
type LookupBlockUrlListPolicyObjectArgs struct {
	// The id of the object
	Id string `pulumi:"id"`
}

// A collection of values returned by getBlockUrlListPolicyObject.
type LookupBlockUrlListPolicyObjectResult struct {
	// List of entries
	Entries []GetBlockUrlListPolicyObjectEntry `pulumi:"entries"`
	// The id of the object
	Id string `pulumi:"id"`
	// The name of the policy object
	Name string `pulumi:"name"`
	// The version of the object
	Version int `pulumi:"version"`
}

func LookupBlockUrlListPolicyObjectOutput(ctx *pulumi.Context, args LookupBlockUrlListPolicyObjectOutputArgs, opts ...pulumi.InvokeOption) LookupBlockUrlListPolicyObjectResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupBlockUrlListPolicyObjectResultOutput, error) {
			args := v.(LookupBlockUrlListPolicyObjectArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("sdwan:index/getBlockUrlListPolicyObject:getBlockUrlListPolicyObject", args, LookupBlockUrlListPolicyObjectResultOutput{}, options).(LookupBlockUrlListPolicyObjectResultOutput), nil
		}).(LookupBlockUrlListPolicyObjectResultOutput)
}

// A collection of arguments for invoking getBlockUrlListPolicyObject.
type LookupBlockUrlListPolicyObjectOutputArgs struct {
	// The id of the object
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupBlockUrlListPolicyObjectOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBlockUrlListPolicyObjectArgs)(nil)).Elem()
}

// A collection of values returned by getBlockUrlListPolicyObject.
type LookupBlockUrlListPolicyObjectResultOutput struct{ *pulumi.OutputState }

func (LookupBlockUrlListPolicyObjectResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBlockUrlListPolicyObjectResult)(nil)).Elem()
}

func (o LookupBlockUrlListPolicyObjectResultOutput) ToLookupBlockUrlListPolicyObjectResultOutput() LookupBlockUrlListPolicyObjectResultOutput {
	return o
}

func (o LookupBlockUrlListPolicyObjectResultOutput) ToLookupBlockUrlListPolicyObjectResultOutputWithContext(ctx context.Context) LookupBlockUrlListPolicyObjectResultOutput {
	return o
}

// List of entries
func (o LookupBlockUrlListPolicyObjectResultOutput) Entries() GetBlockUrlListPolicyObjectEntryArrayOutput {
	return o.ApplyT(func(v LookupBlockUrlListPolicyObjectResult) []GetBlockUrlListPolicyObjectEntry { return v.Entries }).(GetBlockUrlListPolicyObjectEntryArrayOutput)
}

// The id of the object
func (o LookupBlockUrlListPolicyObjectResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBlockUrlListPolicyObjectResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the policy object
func (o LookupBlockUrlListPolicyObjectResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBlockUrlListPolicyObjectResult) string { return v.Name }).(pulumi.StringOutput)
}

// The version of the object
func (o LookupBlockUrlListPolicyObjectResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupBlockUrlListPolicyObjectResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupBlockUrlListPolicyObjectResultOutput{})
}
