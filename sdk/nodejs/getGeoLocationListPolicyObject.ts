// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the Geo Location List Policy Object .
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getGeoLocationListPolicyObject({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 * });
 * ```
 */
export function getGeoLocationListPolicyObject(args: GetGeoLocationListPolicyObjectArgs, opts?: pulumi.InvokeOptions): Promise<GetGeoLocationListPolicyObjectResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("sdwan:index/getGeoLocationListPolicyObject:getGeoLocationListPolicyObject", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getGeoLocationListPolicyObject.
 */
export interface GetGeoLocationListPolicyObjectArgs {
    /**
     * The id of the object
     */
    id: string;
}

/**
 * A collection of values returned by getGeoLocationListPolicyObject.
 */
export interface GetGeoLocationListPolicyObjectResult {
    /**
     * List of entries
     */
    readonly entries: outputs.GetGeoLocationListPolicyObjectEntry[];
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
 * This data source can read the Geo Location List Policy Object .
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getGeoLocationListPolicyObject({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 * });
 * ```
 */
export function getGeoLocationListPolicyObjectOutput(args: GetGeoLocationListPolicyObjectOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGeoLocationListPolicyObjectResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("sdwan:index/getGeoLocationListPolicyObject:getGeoLocationListPolicyObject", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getGeoLocationListPolicyObject.
 */
export interface GetGeoLocationListPolicyObjectOutputArgs {
    /**
     * The id of the object
     */
    id: pulumi.Input<string>;
}
