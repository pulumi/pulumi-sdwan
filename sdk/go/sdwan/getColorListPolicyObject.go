// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source can read the Color List Policy Object .
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
//			_, err := sdwan.LookupColorListPolicyObject(ctx, &sdwan.LookupColorListPolicyObjectArgs{
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
func LookupColorListPolicyObject(ctx *pulumi.Context, args *LookupColorListPolicyObjectArgs, opts ...pulumi.InvokeOption) (*LookupColorListPolicyObjectResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupColorListPolicyObjectResult
	err := ctx.Invoke("sdwan:index/getColorListPolicyObject:getColorListPolicyObject", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getColorListPolicyObject.
type LookupColorListPolicyObjectArgs struct {
	// The id of the object
	Id string `pulumi:"id"`
}

// A collection of values returned by getColorListPolicyObject.
type LookupColorListPolicyObjectResult struct {
	// List of entries
	Entries []GetColorListPolicyObjectEntry `pulumi:"entries"`
	// The id of the object
	Id string `pulumi:"id"`
	// The name of the policy object
	Name string `pulumi:"name"`
	// The version of the object
	Version int `pulumi:"version"`
}

func LookupColorListPolicyObjectOutput(ctx *pulumi.Context, args LookupColorListPolicyObjectOutputArgs, opts ...pulumi.InvokeOption) LookupColorListPolicyObjectResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupColorListPolicyObjectResultOutput, error) {
			args := v.(LookupColorListPolicyObjectArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("sdwan:index/getColorListPolicyObject:getColorListPolicyObject", args, LookupColorListPolicyObjectResultOutput{}, options).(LookupColorListPolicyObjectResultOutput), nil
		}).(LookupColorListPolicyObjectResultOutput)
}

// A collection of arguments for invoking getColorListPolicyObject.
type LookupColorListPolicyObjectOutputArgs struct {
	// The id of the object
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupColorListPolicyObjectOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupColorListPolicyObjectArgs)(nil)).Elem()
}

// A collection of values returned by getColorListPolicyObject.
type LookupColorListPolicyObjectResultOutput struct{ *pulumi.OutputState }

func (LookupColorListPolicyObjectResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupColorListPolicyObjectResult)(nil)).Elem()
}

func (o LookupColorListPolicyObjectResultOutput) ToLookupColorListPolicyObjectResultOutput() LookupColorListPolicyObjectResultOutput {
	return o
}

func (o LookupColorListPolicyObjectResultOutput) ToLookupColorListPolicyObjectResultOutputWithContext(ctx context.Context) LookupColorListPolicyObjectResultOutput {
	return o
}

// List of entries
func (o LookupColorListPolicyObjectResultOutput) Entries() GetColorListPolicyObjectEntryArrayOutput {
	return o.ApplyT(func(v LookupColorListPolicyObjectResult) []GetColorListPolicyObjectEntry { return v.Entries }).(GetColorListPolicyObjectEntryArrayOutput)
}

// The id of the object
func (o LookupColorListPolicyObjectResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupColorListPolicyObjectResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the policy object
func (o LookupColorListPolicyObjectResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupColorListPolicyObjectResult) string { return v.Name }).(pulumi.StringOutput)
}

// The version of the object
func (o LookupColorListPolicyObjectResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupColorListPolicyObjectResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupColorListPolicyObjectResultOutput{})
}
