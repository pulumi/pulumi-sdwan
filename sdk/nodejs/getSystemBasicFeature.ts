// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the System Basic Feature.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getSystemBasicFeature({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 * });
 * ```
 */
export function getSystemBasicFeature(args: GetSystemBasicFeatureArgs, opts?: pulumi.InvokeOptions): Promise<GetSystemBasicFeatureResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("sdwan:index/getSystemBasicFeature:getSystemBasicFeature", {
        "featureProfileId": args.featureProfileId,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getSystemBasicFeature.
 */
export interface GetSystemBasicFeatureArgs {
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
 * A collection of values returned by getSystemBasicFeature.
 */
export interface GetSystemBasicFeatureResult {
    /**
     * Collect admin-tech before reboot due to daemon failure
     */
    readonly adminTechOnFailure: boolean;
    /**
     * Variable name
     */
    readonly adminTechOnFailureVariable: string;
    /**
     * Affinity Group Number
     */
    readonly affinityGroupNumber: number;
    /**
     * Variable name
     */
    readonly affinityGroupNumberVariable: string;
    /**
     * Affinity Group Preference
     */
    readonly affinityGroupPreferences: number[];
    /**
     * Variable name
     */
    readonly affinityGroupPreferencesVariable: string;
    /**
     * Affinity Group Number for VRFs
     */
    readonly affinityPerVrfs: outputs.GetSystemBasicFeatureAffinityPerVrf[];
    /**
     * Affinity Group Preference Auto
     */
    readonly affinityPreferenceAuto: boolean;
    /**
     * Variable name
     */
    readonly affinityPreferenceAutoVariable: string;
    /**
     * Set a text description of the device
     */
    readonly configDescription: string;
    /**
     * Variable name
     */
    readonly configDescriptionVariable: string;
    /**
     * Set the console baud rate
     */
    readonly consoleBaudRate: string;
    /**
     * Variable name
     */
    readonly consoleBaudRateVariable: string;
    /**
     * Set the policer rate for control sessions
     */
    readonly controlSessionPps: number;
    /**
     * Variable name
     */
    readonly controlSessionPpsVariable: string;
    /**
     * Configure a list of comma-separated controller groups
     */
    readonly controllerGroups: number[];
    /**
     * Variable name
     */
    readonly controllerGroupsVariable: string;
    /**
     * The description of the Feature
     */
    readonly description: string;
    /**
     * Device groups
     */
    readonly deviceGroups: string[];
    /**
     * Variable name
     */
    readonly deviceGroupsVariable: string;
    /**
     * Enable SLA Dampening and Enhanced App Routing.
     */
    readonly enhancedAppAwareRouting: string;
    /**
     * Variable name
     */
    readonly enhancedAppAwareRoutingVariable: string;
    /**
     * Feature Profile ID
     */
    readonly featureProfileId: string;
    /**
     * Enable Geo fencing
     */
    readonly gpsGeoFencingEnable: boolean;
    /**
     * Set the device’s geo fencing range
     */
    readonly gpsGeoFencingRange: number;
    /**
     * Variable name
     */
    readonly gpsGeoFencingRangeVariable: string;
    /**
     * Set the device physical latitude
     */
    readonly gpsLatitude: number;
    /**
     * Variable name
     */
    readonly gpsLatitudeVariable: string;
    /**
     * Set the device physical longitude
     */
    readonly gpsLongitude: number;
    /**
     * Variable name
     */
    readonly gpsLongitudeVariable: string;
    /**
     * Enable device’s geo fencing SMS
     */
    readonly gpsSmsEnable: boolean;
    /**
     * Set device’s geo fencing SMS phone number
     */
    readonly gpsSmsMobileNumbers: outputs.GetSystemBasicFeatureGpsSmsMobileNumber[];
    /**
     * The id of the Feature
     */
    readonly id: string;
    /**
     * Idle CLI timeout in minutes
     */
    readonly idleTimeout: number;
    /**
     * Variable name
     */
    readonly idleTimeoutVariable: string;
    /**
     * Set the location of the device
     */
    readonly location: string;
    /**
     * Variable name
     */
    readonly locationVariable: string;
    /**
     * Set the maximum number of OMP sessions \n\n the device can have
     */
    readonly maxOmpSessions: number;
    /**
     * Variable name
     */
    readonly maxOmpSessionsVariable: string;
    /**
     * Device is multi-tenant
     */
    readonly multiTenant: boolean;
    /**
     * Variable name
     */
    readonly multiTenantVariable: string;
    /**
     * The name of the Feature
     */
    readonly name: string;
    /**
     * Enable or disable On-demand Tunnel
     */
    readonly onDemandEnable: boolean;
    /**
     * Variable name
     */
    readonly onDemandEnableVariable: string;
    /**
     * Set the idle timeout for on-demand tunnels
     */
    readonly onDemandIdleTimeout: number;
    /**
     * Variable name
     */
    readonly onDemandIdleTimeoutVariable: string;
    /**
     * Set the Overlay ID
     */
    readonly overlayId: number;
    /**
     * Variable name
     */
    readonly overlayIdVariable: string;
    /**
     * Enable port hopping
     */
    readonly portHopping: boolean;
    /**
     * Variable name
     */
    readonly portHoppingVariable: string;
    /**
     * Set the TLOC port offset when multiple devices are behind a NAT
     */
    readonly portOffset: number;
    /**
     * Variable name
     */
    readonly portOffsetVariable: string;
    /**
     * Site Type
     */
    readonly siteTypes: string[];
    /**
     * Variable name
     */
    readonly siteTypesVariable: string;
    /**
     * Set the timezone
     */
    readonly timezone: string;
    /**
     * Variable name
     */
    readonly timezoneVariable: string;
    /**
     * Enable or disable default gateway tracking
     */
    readonly trackDefaultGateway: boolean;
    /**
     * Variable name
     */
    readonly trackDefaultGatewayVariable: string;
    /**
     * OMP Tag attached to routes based on interface tracking
     */
    readonly trackInterfaceTag: number;
    /**
     * Variable name
     */
    readonly trackInterfaceTagVariable: string;
    /**
     * Configure tracking of transport
     */
    readonly trackTransport: boolean;
    /**
     * Variable name
     */
    readonly trackTransportVariable: string;
    /**
     * Enable transport gateway
     */
    readonly transportGateway: boolean;
    /**
     * Variable name
     */
    readonly transportGatewayVariable: string;
    /**
     * The version of the Feature
     */
    readonly version: number;
}
/**
 * This data source can read the System Basic Feature.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getSystemBasicFeature({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 * });
 * ```
 */
export function getSystemBasicFeatureOutput(args: GetSystemBasicFeatureOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSystemBasicFeatureResult> {
    return pulumi.output(args).apply((a: any) => getSystemBasicFeature(a, opts))
}

/**
 * A collection of arguments for invoking getSystemBasicFeature.
 */
export interface GetSystemBasicFeatureOutputArgs {
    /**
     * Feature Profile ID
     */
    featureProfileId: pulumi.Input<string>;
    /**
     * The id of the Feature
     */
    id: pulumi.Input<string>;
}