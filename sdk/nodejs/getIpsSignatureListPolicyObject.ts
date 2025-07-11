// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the IPS Signature List Policy Object .
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getIpsSignatureListPolicyObject({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 * });
 * ```
 */
export function getIpsSignatureListPolicyObject(args: GetIpsSignatureListPolicyObjectArgs, opts?: pulumi.InvokeOptions): Promise<GetIpsSignatureListPolicyObjectResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("sdwan:index/getIpsSignatureListPolicyObject:getIpsSignatureListPolicyObject", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getIpsSignatureListPolicyObject.
 */
export interface GetIpsSignatureListPolicyObjectArgs {
    /**
     * The id of the object
     */
    id: string;
}

/**
 * A collection of values returned by getIpsSignatureListPolicyObject.
 */
export interface GetIpsSignatureListPolicyObjectResult {
    /**
     * List of entries
     */
    readonly entries: outputs.GetIpsSignatureListPolicyObjectEntry[];
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
 * This data source can read the IPS Signature List Policy Object .
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getIpsSignatureListPolicyObject({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 * });
 * ```
 */
export function getIpsSignatureListPolicyObjectOutput(args: GetIpsSignatureListPolicyObjectOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetIpsSignatureListPolicyObjectResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("sdwan:index/getIpsSignatureListPolicyObject:getIpsSignatureListPolicyObject", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getIpsSignatureListPolicyObject.
 */
export interface GetIpsSignatureListPolicyObjectOutputArgs {
    /**
     * The id of the object
     */
    id: pulumi.Input<string>;
}
