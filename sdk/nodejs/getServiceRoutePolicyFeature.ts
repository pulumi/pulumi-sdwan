// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the Service Route Policy Feature.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getServiceRoutePolicyFeature({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 * });
 * ```
 */
export function getServiceRoutePolicyFeature(args: GetServiceRoutePolicyFeatureArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceRoutePolicyFeatureResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("sdwan:index/getServiceRoutePolicyFeature:getServiceRoutePolicyFeature", {
        "featureProfileId": args.featureProfileId,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceRoutePolicyFeature.
 */
export interface GetServiceRoutePolicyFeatureArgs {
    /**
     * Feature Profile ID
     */
    featureProfileId: string;
    /**
     * The id of the Feature
     */
    id: string;
}

/**
 * A collection of values returned by getServiceRoutePolicyFeature.
 */
export interface GetServiceRoutePolicyFeatureResult {
    /**
     * Default Action
     */
    readonly defaultAction: string;
    /**
     * The description of the Feature
     */
    readonly description: string;
    /**
     * Feature Profile ID
     */
    readonly featureProfileId: string;
    /**
     * The id of the Feature
     */
    readonly id: string;
    /**
     * The name of the Feature
     */
    readonly name: string;
    /**
     * Route Policy List
     */
    readonly sequences: outputs.GetServiceRoutePolicyFeatureSequence[];
    /**
     * The version of the Feature
     */
    readonly version: number;
}
/**
 * This data source can read the Service Route Policy Feature.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getServiceRoutePolicyFeature({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 * });
 * ```
 */
export function getServiceRoutePolicyFeatureOutput(args: GetServiceRoutePolicyFeatureOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServiceRoutePolicyFeatureResult> {
    return pulumi.output(args).apply((a: any) => getServiceRoutePolicyFeature(a, opts))
}

/**
 * A collection of arguments for invoking getServiceRoutePolicyFeature.
 */
export interface GetServiceRoutePolicyFeatureOutputArgs {
    /**
     * Feature Profile ID
     */
    featureProfileId: pulumi.Input<string>;
    /**
     * The id of the Feature
     */
    id: pulumi.Input<string>;
}