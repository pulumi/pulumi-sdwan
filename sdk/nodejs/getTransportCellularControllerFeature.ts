// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This data source can read the Transport Cellular Controller Feature.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getTransportCellularControllerFeature({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 * });
 * ```
 */
export function getTransportCellularControllerFeature(args: GetTransportCellularControllerFeatureArgs, opts?: pulumi.InvokeOptions): Promise<GetTransportCellularControllerFeatureResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("sdwan:index/getTransportCellularControllerFeature:getTransportCellularControllerFeature", {
        "featureProfileId": args.featureProfileId,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransportCellularControllerFeature.
 */
export interface GetTransportCellularControllerFeatureArgs {
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
 * A collection of values returned by getTransportCellularControllerFeature.
 */
export interface GetTransportCellularControllerFeatureResult {
    /**
     * Cellular ID
     */
    readonly cellularId: string;
    /**
     * Variable name
     */
    readonly cellularIdVariable: string;
    /**
     * The description of the Feature
     */
    readonly description: string;
    /**
     * Feature Profile ID
     */
    readonly featureProfileId: string;
    /**
     * Enable/Disable Firmware Auto Sim
     */
    readonly firmwareAutoSim: boolean;
    /**
     * Variable name
     */
    readonly firmwareAutoSimVariable: string;
    /**
     * The id of the Feature
     */
    readonly id: string;
    /**
     * The name of the Feature
     */
    readonly name: string;
    /**
     * Set primary SIM slot
     */
    readonly primarySimSlot: number;
    /**
     * Variable name
     */
    readonly primarySimSlotVariable: string;
    /**
     * Set SIM failover retries
     */
    readonly simFailoverRetries: number;
    /**
     * Variable name
     */
    readonly simFailoverRetriesVariable: string;
    /**
     * Set SIM failover timeout in minutes
     */
    readonly simFailoverTimeout: number;
    /**
     * Variable name
     */
    readonly simFailoverTimeoutVariable: string;
    /**
     * The version of the Feature
     */
    readonly version: number;
}
/**
 * This data source can read the Transport Cellular Controller Feature.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getTransportCellularControllerFeature({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 * });
 * ```
 */
export function getTransportCellularControllerFeatureOutput(args: GetTransportCellularControllerFeatureOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTransportCellularControllerFeatureResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("sdwan:index/getTransportCellularControllerFeature:getTransportCellularControllerFeature", {
        "featureProfileId": args.featureProfileId,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransportCellularControllerFeature.
 */
export interface GetTransportCellularControllerFeatureOutputArgs {
    /**
     * Feature Profile ID
     */
    featureProfileId: pulumi.Input<string>;
    /**
     * The id of the Feature
     */
    id: pulumi.Input<string>;
}
