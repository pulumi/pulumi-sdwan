// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the Transport Management VPN Feature.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getTransportManagementVpnFeature({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 * });
 * ```
 */
export function getTransportManagementVpnFeature(args: GetTransportManagementVpnFeatureArgs, opts?: pulumi.InvokeOptions): Promise<GetTransportManagementVpnFeatureResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("sdwan:index/getTransportManagementVpnFeature:getTransportManagementVpnFeature", {
        "featureProfileId": args.featureProfileId,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransportManagementVpnFeature.
 */
export interface GetTransportManagementVpnFeatureArgs {
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
 * A collection of values returned by getTransportManagementVpnFeature.
 */
export interface GetTransportManagementVpnFeatureResult {
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
     * IPv4 Static Route
     */
    readonly ipv4StaticRoutes: outputs.GetTransportManagementVpnFeatureIpv4StaticRoute[];
    /**
     * IPv6 Static Route
     */
    readonly ipv6StaticRoutes: outputs.GetTransportManagementVpnFeatureIpv6StaticRoute[];
    /**
     * The name of the Feature
     */
    readonly name: string;
    readonly newHostMappings: outputs.GetTransportManagementVpnFeatureNewHostMapping[];
    /**
     * Primary DNS Address (IPv4)
     */
    readonly primaryDnsAddressIpv4: string;
    /**
     * Variable name
     */
    readonly primaryDnsAddressIpv4Variable: string;
    /**
     * Primary DNS Address (IPv6)
     */
    readonly primaryDnsAddressIpv6: string;
    /**
     * Variable name
     */
    readonly primaryDnsAddressIpv6Variable: string;
    /**
     * Secondary DNS Address (IPv4)
     */
    readonly secondaryDnsAddressIpv4: string;
    /**
     * Variable name
     */
    readonly secondaryDnsAddressIpv4Variable: string;
    /**
     * Secondary DNS Address (IPv6)
     */
    readonly secondaryDnsAddressIpv6: string;
    /**
     * Variable name
     */
    readonly secondaryDnsAddressIpv6Variable: string;
    /**
     * The version of the Feature
     */
    readonly version: number;
    /**
     * Name
     */
    readonly vpnDescription: string;
    /**
     * Variable name
     */
    readonly vpnDescriptionVariable: string;
}
/**
 * This data source can read the Transport Management VPN Feature.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getTransportManagementVpnFeature({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 * });
 * ```
 */
export function getTransportManagementVpnFeatureOutput(args: GetTransportManagementVpnFeatureOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTransportManagementVpnFeatureResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("sdwan:index/getTransportManagementVpnFeature:getTransportManagementVpnFeature", {
        "featureProfileId": args.featureProfileId,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransportManagementVpnFeature.
 */
export interface GetTransportManagementVpnFeatureOutputArgs {
    /**
     * Feature Profile ID
     */
    featureProfileId: pulumi.Input<string>;
    /**
     * The id of the Feature
     */
    id: pulumi.Input<string>;
}
