// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the System NTP Feature.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getSystemNtpFeature({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 * });
 * ```
 */
export function getSystemNtpFeature(args: GetSystemNtpFeatureArgs, opts?: pulumi.InvokeOptions): Promise<GetSystemNtpFeatureResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("sdwan:index/getSystemNtpFeature:getSystemNtpFeature", {
        "featureProfileId": args.featureProfileId,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getSystemNtpFeature.
 */
export interface GetSystemNtpFeatureArgs {
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
 * A collection of values returned by getSystemNtpFeature.
 */
export interface GetSystemNtpFeatureResult {
    /**
     * Set MD5 authentication key
     */
    readonly authenticationKeys: outputs.GetSystemNtpFeatureAuthenticationKey[];
    /**
     * Enable device as NTP Leader
     */
    readonly authoritativeNtpServer: boolean;
    /**
     * Variable name
     */
    readonly authoritativeNtpServerVariable: string;
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
     * Configure NTP servers
     */
    readonly servers: outputs.GetSystemNtpFeatureServer[];
    /**
     * Enable device as NTP Leader
     */
    readonly sourceInterface: string;
    /**
     * Variable name
     */
    readonly sourceInterfaceVariable: string;
    /**
     * Enable device as NTP Leader
     */
    readonly stratum: number;
    /**
     * Variable name
     */
    readonly stratumVariable: string;
    /**
     * Designate authentication key as trustworthy
     */
    readonly trustedKeys: number[];
    /**
     * Variable name
     */
    readonly trustedKeysVariable: string;
    /**
     * The version of the Feature
     */
    readonly version: number;
}
/**
 * This data source can read the System NTP Feature.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getSystemNtpFeature({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 * });
 * ```
 */
export function getSystemNtpFeatureOutput(args: GetSystemNtpFeatureOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSystemNtpFeatureResult> {
    return pulumi.output(args).apply((a: any) => getSystemNtpFeature(a, opts))
}

/**
 * A collection of arguments for invoking getSystemNtpFeature.
 */
export interface GetSystemNtpFeatureOutputArgs {
    /**
     * Feature Profile ID
     */
    featureProfileId: pulumi.Input<string>;
    /**
     * The id of the Feature
     */
    id: pulumi.Input<string>;
}