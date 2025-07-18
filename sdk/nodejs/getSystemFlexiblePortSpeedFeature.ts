// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This data source can read the System Flexible Port Speed Feature.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getSystemFlexiblePortSpeedFeature({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 * });
 * ```
 */
export function getSystemFlexiblePortSpeedFeature(args: GetSystemFlexiblePortSpeedFeatureArgs, opts?: pulumi.InvokeOptions): Promise<GetSystemFlexiblePortSpeedFeatureResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("sdwan:index/getSystemFlexiblePortSpeedFeature:getSystemFlexiblePortSpeedFeature", {
        "featureProfileId": args.featureProfileId,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getSystemFlexiblePortSpeedFeature.
 */
export interface GetSystemFlexiblePortSpeedFeatureArgs {
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
 * A collection of values returned by getSystemFlexiblePortSpeedFeature.
 */
export interface GetSystemFlexiblePortSpeedFeatureResult {
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
     * port Type
     */
    readonly portType: string;
    /**
     * Variable name
     */
    readonly portTypeVariable: string;
    /**
     * The version of the Feature
     */
    readonly version: number;
}
/**
 * This data source can read the System Flexible Port Speed Feature.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getSystemFlexiblePortSpeedFeature({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 * });
 * ```
 */
export function getSystemFlexiblePortSpeedFeatureOutput(args: GetSystemFlexiblePortSpeedFeatureOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSystemFlexiblePortSpeedFeatureResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("sdwan:index/getSystemFlexiblePortSpeedFeature:getSystemFlexiblePortSpeedFeature", {
        "featureProfileId": args.featureProfileId,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getSystemFlexiblePortSpeedFeature.
 */
export interface GetSystemFlexiblePortSpeedFeatureOutputArgs {
    /**
     * Feature Profile ID
     */
    featureProfileId: pulumi.Input<string>;
    /**
     * The id of the Feature
     */
    id: pulumi.Input<string>;
}
