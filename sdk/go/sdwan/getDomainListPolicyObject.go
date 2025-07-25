// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sdwan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sdwan/sdk/go/sdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source can read the Domain List Policy Object .
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
//			_, err := sdwan.LookupDomainListPolicyObject(ctx, &sdwan.LookupDomainListPolicyObjectArgs{
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
func LookupDomainListPolicyObject(ctx *pulumi.Context, args *LookupDomainListPolicyObjectArgs, opts ...pulumi.InvokeOption) (*LookupDomainListPolicyObjectResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDomainListPolicyObjectResult
	err := ctx.Invoke("sdwan:index/getDomainListPolicyObject:getDomainListPolicyObject", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDomainListPolicyObject.
type LookupDomainListPolicyObjectArgs struct {
	// The id of the object
	Id string `pulumi:"id"`
}

// A collection of values returned by getDomainListPolicyObject.
type LookupDomainListPolicyObjectResult struct {
	// List of entries
	Entries []GetDomainListPolicyObjectEntry `pulumi:"entries"`
	// The id of the object
	Id string `pulumi:"id"`
	// The name of the policy object
	Name string `pulumi:"name"`
	// The version of the object
	Version int `pulumi:"version"`
}

func LookupDomainListPolicyObjectOutput(ctx *pulumi.Context, args LookupDomainListPolicyObjectOutputArgs, opts ...pulumi.InvokeOption) LookupDomainListPolicyObjectResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupDomainListPolicyObjectResultOutput, error) {
			args := v.(LookupDomainListPolicyObjectArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("sdwan:index/getDomainListPolicyObject:getDomainListPolicyObject", args, LookupDomainListPolicyObjectResultOutput{}, options).(LookupDomainListPolicyObjectResultOutput), nil
		}).(LookupDomainListPolicyObjectResultOutput)
}

// A collection of arguments for invoking getDomainListPolicyObject.
type LookupDomainListPolicyObjectOutputArgs struct {
	// The id of the object
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupDomainListPolicyObjectOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDomainListPolicyObjectArgs)(nil)).Elem()
}

// A collection of values returned by getDomainListPolicyObject.
type LookupDomainListPolicyObjectResultOutput struct{ *pulumi.OutputState }

func (LookupDomainListPolicyObjectResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDomainListPolicyObjectResult)(nil)).Elem()
}

func (o LookupDomainListPolicyObjectResultOutput) ToLookupDomainListPolicyObjectResultOutput() LookupDomainListPolicyObjectResultOutput {
	return o
}

func (o LookupDomainListPolicyObjectResultOutput) ToLookupDomainListPolicyObjectResultOutputWithContext(ctx context.Context) LookupDomainListPolicyObjectResultOutput {
	return o
}

// List of entries
func (o LookupDomainListPolicyObjectResultOutput) Entries() GetDomainListPolicyObjectEntryArrayOutput {
	return o.ApplyT(func(v LookupDomainListPolicyObjectResult) []GetDomainListPolicyObjectEntry { return v.Entries }).(GetDomainListPolicyObjectEntryArrayOutput)
}

// The id of the object
func (o LookupDomainListPolicyObjectResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDomainListPolicyObjectResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the policy object
func (o LookupDomainListPolicyObjectResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDomainListPolicyObjectResult) string { return v.Name }).(pulumi.StringOutput)
}

// The version of the object
func (o LookupDomainListPolicyObjectResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDomainListPolicyObjectResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDomainListPolicyObjectResultOutput{})
}
