// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This data source can read the Transport Cellular Profile Feature.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getTransportCellularProfileFeature({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 * });
 * ```
 */
export function getTransportCellularProfileFeature(args: GetTransportCellularProfileFeatureArgs, opts?: pulumi.InvokeOptions): Promise<GetTransportCellularProfileFeatureResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("sdwan:index/getTransportCellularProfileFeature:getTransportCellularProfileFeature", {
        "featureProfileId": args.featureProfileId,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransportCellularProfileFeature.
 */
export interface GetTransportCellularProfileFeatureArgs {
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
 * A collection of values returned by getTransportCellularProfileFeature.
 */
export interface GetTransportCellularProfileFeatureResult {
    /**
     * Set access point name
     */
    readonly accessPointName: string;
    /**
     * Variable name
     */
    readonly accessPointNameVariable: string;
    /**
     * Set authentication type
     */
    readonly authenticationType: string;
    /**
     * Variable name
     */
    readonly authenticationTypeVariable: string;
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
     * No Overwrite
     */
    readonly noOverwrite: boolean;
    /**
     * Variable name
     */
    readonly noOverwriteVariable: string;
    /**
     * Set packet data network type
     */
    readonly packetDataNetworkType: string;
    /**
     * Variable name
     */
    readonly packetDataNetworkTypeVariable: string;
    /**
     * Set Profile ID
     */
    readonly profileId: number;
    /**
     * Variable name
     */
    readonly profileIdVariable: string;
    /**
     * Set the profile password
     */
    readonly profilePassword: string;
    /**
     * Variable name
     */
    readonly profilePasswordVariable: string;
    /**
     * Set the profile username
     */
    readonly profileUsername: string;
    /**
     * Variable name
     */
    readonly profileUsernameVariable: string;
    /**
     * Require authentication type
     */
    readonly requiresAuthentication: boolean;
    /**
     * The version of the Feature
     */
    readonly version: number;
}
/**
 * This data source can read the Transport Cellular Profile Feature.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getTransportCellularProfileFeature({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 * });
 * ```
 */
export function getTransportCellularProfileFeatureOutput(args: GetTransportCellularProfileFeatureOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTransportCellularProfileFeatureResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("sdwan:index/getTransportCellularProfileFeature:getTransportCellularProfileFeature", {
        "featureProfileId": args.featureProfileId,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransportCellularProfileFeature.
 */
export interface GetTransportCellularProfileFeatureOutputArgs {
    /**
     * Feature Profile ID
     */
    featureProfileId: pulumi.Input<string>;
    /**
     * The id of the Feature
     */
    id: pulumi.Input<string>;
}
