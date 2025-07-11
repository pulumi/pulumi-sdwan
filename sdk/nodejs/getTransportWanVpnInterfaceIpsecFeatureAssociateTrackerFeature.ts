// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This data source can read the Transport WAN VPN Interface IPSEC Feature Associate Tracker Feature .
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeature({
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 *     transportWanVpnFeatureId: "140331f6-5418-4755-a059-13c77eb96037",
 *     transportWanVpnInterfaceIpsecFeatureId: "140331f6-5418-4755-a059-13c77eb96037",
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 * });
 * ```
 */
export function getTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeature(args: GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs, opts?: pulumi.InvokeOptions): Promise<GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("sdwan:index/getTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeature:getTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeature", {
        "featureProfileId": args.featureProfileId,
        "id": args.id,
        "transportWanVpnFeatureId": args.transportWanVpnFeatureId,
        "transportWanVpnInterfaceIpsecFeatureId": args.transportWanVpnInterfaceIpsecFeatureId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeature.
 */
export interface GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs {
    /**
     * Feature Profile ID
     */
    featureProfileId: string;
    /**
     * The id of the object
     */
    id: string;
    /**
     * Transport WAN VPN Feature ID
     */
    transportWanVpnFeatureId: string;
    /**
     * Transport WAN VPN Interface IPSEC Feature ID
     */
    transportWanVpnInterfaceIpsecFeatureId: string;
}

/**
 * A collection of values returned by getTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeature.
 */
export interface GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureResult {
    /**
     * Feature Profile ID
     */
    readonly featureProfileId: string;
    /**
     * The id of the object
     */
    readonly id: string;
    /**
     * Transport Tracker Feature ID
     */
    readonly transportTrackerFeatureId: string;
    /**
     * Transport WAN VPN Feature ID
     */
    readonly transportWanVpnFeatureId: string;
    /**
     * Transport WAN VPN Interface IPSEC Feature ID
     */
    readonly transportWanVpnInterfaceIpsecFeatureId: string;
    /**
     * The version of the object
     */
    readonly version: number;
}
/**
 * This data source can read the Transport WAN VPN Interface IPSEC Feature Associate Tracker Feature .
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeature({
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 *     transportWanVpnFeatureId: "140331f6-5418-4755-a059-13c77eb96037",
 *     transportWanVpnInterfaceIpsecFeatureId: "140331f6-5418-4755-a059-13c77eb96037",
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 * });
 * ```
 */
export function getTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureOutput(args: GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("sdwan:index/getTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeature:getTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeature", {
        "featureProfileId": args.featureProfileId,
        "id": args.id,
        "transportWanVpnFeatureId": args.transportWanVpnFeatureId,
        "transportWanVpnInterfaceIpsecFeatureId": args.transportWanVpnInterfaceIpsecFeatureId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeature.
 */
export interface GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureOutputArgs {
    /**
     * Feature Profile ID
     */
    featureProfileId: pulumi.Input<string>;
    /**
     * The id of the object
     */
    id: pulumi.Input<string>;
    /**
     * Transport WAN VPN Feature ID
     */
    transportWanVpnFeatureId: pulumi.Input<string>;
    /**
     * Transport WAN VPN Interface IPSEC Feature ID
     */
    transportWanVpnInterfaceIpsecFeatureId: pulumi.Input<string>;
}
