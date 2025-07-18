// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the Data FQDN Prefix List Policy Object .
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getDataFqdnPrefixListPolicyObject({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 * });
 * ```
 */
export function getDataFqdnPrefixListPolicyObject(args: GetDataFqdnPrefixListPolicyObjectArgs, opts?: pulumi.InvokeOptions): Promise<GetDataFqdnPrefixListPolicyObjectResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("sdwan:index/getDataFqdnPrefixListPolicyObject:getDataFqdnPrefixListPolicyObject", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getDataFqdnPrefixListPolicyObject.
 */
export interface GetDataFqdnPrefixListPolicyObjectArgs {
    /**
     * The id of the object
     */
    id: string;
}

/**
 * A collection of values returned by getDataFqdnPrefixListPolicyObject.
 */
export interface GetDataFqdnPrefixListPolicyObjectResult {
    /**
     * List of entries
     */
    readonly entries: outputs.GetDataFqdnPrefixListPolicyObjectEntry[];
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
 * This data source can read the Data FQDN Prefix List Policy Object .
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getDataFqdnPrefixListPolicyObject({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 * });
 * ```
 */
export function getDataFqdnPrefixListPolicyObjectOutput(args: GetDataFqdnPrefixListPolicyObjectOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDataFqdnPrefixListPolicyObjectResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("sdwan:index/getDataFqdnPrefixListPolicyObject:getDataFqdnPrefixListPolicyObject", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getDataFqdnPrefixListPolicyObject.
 */
export interface GetDataFqdnPrefixListPolicyObjectOutputArgs {
    /**
     * The id of the object
     */
    id: pulumi.Input<string>;
}
