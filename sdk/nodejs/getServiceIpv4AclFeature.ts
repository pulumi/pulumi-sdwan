// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the Service IPv4 ACL Feature.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getServiceIpv4AclFeature({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 * });
 * ```
 */
export function getServiceIpv4AclFeature(args: GetServiceIpv4AclFeatureArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceIpv4AclFeatureResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("sdwan:index/getServiceIpv4AclFeature:getServiceIpv4AclFeature", {
        "featureProfileId": args.featureProfileId,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceIpv4AclFeature.
 */
export interface GetServiceIpv4AclFeatureArgs {
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
 * A collection of values returned by getServiceIpv4AclFeature.
 */
export interface GetServiceIpv4AclFeatureResult {
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
     * Access Control List
     */
    readonly sequences: outputs.GetServiceIpv4AclFeatureSequence[];
    /**
     * The version of the Feature
     */
    readonly version: number;
}
/**
 * This data source can read the Service IPv4 ACL Feature.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getServiceIpv4AclFeature({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 * });
 * ```
 */
export function getServiceIpv4AclFeatureOutput(args: GetServiceIpv4AclFeatureOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetServiceIpv4AclFeatureResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("sdwan:index/getServiceIpv4AclFeature:getServiceIpv4AclFeature", {
        "featureProfileId": args.featureProfileId,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceIpv4AclFeature.
 */
export interface GetServiceIpv4AclFeatureOutputArgs {
    /**
     * Feature Profile ID
     */
    featureProfileId: pulumi.Input<string>;
    /**
     * The id of the Feature
     */
    id: pulumi.Input<string>;
}
