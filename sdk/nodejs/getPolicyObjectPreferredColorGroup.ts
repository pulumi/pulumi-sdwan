// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the Policy Object Preferred Color Group Policy_object.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getPolicyObjectPreferredColorGroup({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 * });
 * ```
 */
export function getPolicyObjectPreferredColorGroup(args: GetPolicyObjectPreferredColorGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetPolicyObjectPreferredColorGroupResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("sdwan:index/getPolicyObjectPreferredColorGroup:getPolicyObjectPreferredColorGroup", {
        "featureProfileId": args.featureProfileId,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getPolicyObjectPreferredColorGroup.
 */
export interface GetPolicyObjectPreferredColorGroupArgs {
    /**
     * Feature Profile ID
     */
    featureProfileId: string;
    /**
     * The id of the Policy_object
     */
    id: string;
}

/**
 * A collection of values returned by getPolicyObjectPreferredColorGroup.
 */
export interface GetPolicyObjectPreferredColorGroupResult {
    /**
     * The description of the Policy_object
     */
    readonly description: string;
    /**
     * Preferred Color Group List
     */
    readonly entries: outputs.GetPolicyObjectPreferredColorGroupEntry[];
    /**
     * Feature Profile ID
     */
    readonly featureProfileId: string;
    /**
     * The id of the Policy_object
     */
    readonly id: string;
    /**
     * The name of the Policy_object
     */
    readonly name: string;
    /**
     * The version of the Policy_object
     */
    readonly version: number;
}
/**
 * This data source can read the Policy Object Preferred Color Group Policy_object.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getPolicyObjectPreferredColorGroup({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 * });
 * ```
 */
export function getPolicyObjectPreferredColorGroupOutput(args: GetPolicyObjectPreferredColorGroupOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPolicyObjectPreferredColorGroupResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("sdwan:index/getPolicyObjectPreferredColorGroup:getPolicyObjectPreferredColorGroup", {
        "featureProfileId": args.featureProfileId,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getPolicyObjectPreferredColorGroup.
 */
export interface GetPolicyObjectPreferredColorGroupOutputArgs {
    /**
     * Feature Profile ID
     */
    featureProfileId: pulumi.Input<string>;
    /**
     * The id of the Policy_object
     */
    id: pulumi.Input<string>;
}
