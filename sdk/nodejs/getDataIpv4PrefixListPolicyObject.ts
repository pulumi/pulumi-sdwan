// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the Data IPv4 Prefix List Policy Object .
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getDataIpv4PrefixListPolicyObject({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 * });
 * ```
 */
export function getDataIpv4PrefixListPolicyObject(args: GetDataIpv4PrefixListPolicyObjectArgs, opts?: pulumi.InvokeOptions): Promise<GetDataIpv4PrefixListPolicyObjectResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("sdwan:index/getDataIpv4PrefixListPolicyObject:getDataIpv4PrefixListPolicyObject", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getDataIpv4PrefixListPolicyObject.
 */
export interface GetDataIpv4PrefixListPolicyObjectArgs {
    /**
     * The id of the object
     */
    id: string;
}

/**
 * A collection of values returned by getDataIpv4PrefixListPolicyObject.
 */
export interface GetDataIpv4PrefixListPolicyObjectResult {
    /**
     * List of entries
     */
    readonly entries: outputs.GetDataIpv4PrefixListPolicyObjectEntry[];
    /**
     * The id of the object
     */
    readonly id: string;
    /**
     * The name of the policy object
     */
    readonly name: string;
    /**
     * The version of the object
     */
    readonly version: number;
}
/**
 * This data source can read the Data IPv4 Prefix List Policy Object .
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getDataIpv4PrefixListPolicyObject({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 * });
 * ```
 */
export function getDataIpv4PrefixListPolicyObjectOutput(args: GetDataIpv4PrefixListPolicyObjectOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDataIpv4PrefixListPolicyObjectResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("sdwan:index/getDataIpv4PrefixListPolicyObject:getDataIpv4PrefixListPolicyObject", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getDataIpv4PrefixListPolicyObject.
 */
export interface GetDataIpv4PrefixListPolicyObjectOutputArgs {
    /**
     * The id of the object
     */
    id: pulumi.Input<string>;
}
