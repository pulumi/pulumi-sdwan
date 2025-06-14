// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source can read the Extended Community List Policy Object .
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
//			_, err := sdwan.LookupExtendedCommunityListPolicyObject(ctx, &sdwan.LookupExtendedCommunityListPolicyObjectArgs{
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
func LookupExtendedCommunityListPolicyObject(ctx *pulumi.Context, args *LookupExtendedCommunityListPolicyObjectArgs, opts ...pulumi.InvokeOption) (*LookupExtendedCommunityListPolicyObjectResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupExtendedCommunityListPolicyObjectResult
	err := ctx.Invoke("sdwan:index/getExtendedCommunityListPolicyObject:getExtendedCommunityListPolicyObject", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getExtendedCommunityListPolicyObject.
type LookupExtendedCommunityListPolicyObjectArgs struct {
	// The id of the object
	Id string `pulumi:"id"`
}

// A collection of values returned by getExtendedCommunityListPolicyObject.
type LookupExtendedCommunityListPolicyObjectResult struct {
	// List of entries
	Entries []GetExtendedCommunityListPolicyObjectEntry `pulumi:"entries"`
	// The id of the object
	Id string `pulumi:"id"`
	// The name of the policy object
	Name string `pulumi:"name"`
	// The version of the object
	Version int `pulumi:"version"`
}

func LookupExtendedCommunityListPolicyObjectOutput(ctx *pulumi.Context, args LookupExtendedCommunityListPolicyObjectOutputArgs, opts ...pulumi.InvokeOption) LookupExtendedCommunityListPolicyObjectResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupExtendedCommunityListPolicyObjectResultOutput, error) {
			args := v.(LookupExtendedCommunityListPolicyObjectArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("sdwan:index/getExtendedCommunityListPolicyObject:getExtendedCommunityListPolicyObject", args, LookupExtendedCommunityListPolicyObjectResultOutput{}, options).(LookupExtendedCommunityListPolicyObjectResultOutput), nil
		}).(LookupExtendedCommunityListPolicyObjectResultOutput)
}

// A collection of arguments for invoking getExtendedCommunityListPolicyObject.
type LookupExtendedCommunityListPolicyObjectOutputArgs struct {
	// The id of the object
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupExtendedCommunityListPolicyObjectOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupExtendedCommunityListPolicyObjectArgs)(nil)).Elem()
}

// A collection of values returned by getExtendedCommunityListPolicyObject.
type LookupExtendedCommunityListPolicyObjectResultOutput struct{ *pulumi.OutputState }

func (LookupExtendedCommunityListPolicyObjectResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupExtendedCommunityListPolicyObjectResult)(nil)).Elem()
}

func (o LookupExtendedCommunityListPolicyObjectResultOutput) ToLookupExtendedCommunityListPolicyObjectResultOutput() LookupExtendedCommunityListPolicyObjectResultOutput {
	return o
}

func (o LookupExtendedCommunityListPolicyObjectResultOutput) ToLookupExtendedCommunityListPolicyObjectResultOutputWithContext(ctx context.Context) LookupExtendedCommunityListPolicyObjectResultOutput {
	return o
}

// List of entries
func (o LookupExtendedCommunityListPolicyObjectResultOutput) Entries() GetExtendedCommunityListPolicyObjectEntryArrayOutput {
	return o.ApplyT(func(v LookupExtendedCommunityListPolicyObjectResult) []GetExtendedCommunityListPolicyObjectEntry {
		return v.Entries
	}).(GetExtendedCommunityListPolicyObjectEntryArrayOutput)
}

// The id of the object
func (o LookupExtendedCommunityListPolicyObjectResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupExtendedCommunityListPolicyObjectResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the policy object
func (o LookupExtendedCommunityListPolicyObjectResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupExtendedCommunityListPolicyObjectResult) string { return v.Name }).(pulumi.StringOutput)
}

// The version of the object
func (o LookupExtendedCommunityListPolicyObjectResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupExtendedCommunityListPolicyObjectResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupExtendedCommunityListPolicyObjectResultOutput{})
}
