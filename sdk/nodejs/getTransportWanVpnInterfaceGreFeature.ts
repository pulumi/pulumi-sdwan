// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This data source can read the Transport WAN VPN Interface GRE Feature.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getTransportWanVpnInterfaceGreFeature({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 *     transportWanVpnFeatureId: "140331f6-5418-4755-a059-13c77eb96037",
 * });
 * ```
 */
export function getTransportWanVpnInterfaceGreFeature(args: GetTransportWanVpnInterfaceGreFeatureArgs, opts?: pulumi.InvokeOptions): Promise<GetTransportWanVpnInterfaceGreFeatureResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("sdwan:index/getTransportWanVpnInterfaceGreFeature:getTransportWanVpnInterfaceGreFeature", {
        "featureProfileId": args.featureProfileId,
        "id": args.id,
        "transportWanVpnFeatureId": args.transportWanVpnFeatureId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransportWanVpnInterfaceGreFeature.
 */
export interface GetTransportWanVpnInterfaceGreFeatureArgs {
    /**
     * Feature Profile ID
     */
    featureProfileId: string;
    /**
     * The id of the Feature
     */
    id: string;
    /**
     * Transport WAN VPN Feature ID
     */
    transportWanVpnFeatureId: string;
}

/**
 * A collection of values returned by getTransportWanVpnInterfaceGreFeature.
 */
export interface GetTransportWanVpnInterfaceGreFeatureResult {
    /**
     * Enable Application Tunnel Type
     */
    readonly applicationTunnelType: string;
    /**
     * Variable name
     */
    readonly applicationTunnelTypeVariable: string;
    /**
     * Enable clear dont fragment (Currently Only SDWAN Tunnel Interface)
     */
    readonly clearDontFragment: boolean;
    /**
     * Variable name
     */
    readonly clearDontFragmentVariable: string;
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
     * Interface description
     */
    readonly interfaceDescription: string;
    /**
     * Variable name
     */
    readonly interfaceDescriptionVariable: string;
    /**
     * Interface name (1..255)
     */
    readonly interfaceName: string;
    /**
     * Variable name
     */
    readonly interfaceNameVariable: string;
    /**
     * Interface MTU \n\n, in bytes
     */
    readonly ipMtu: number;
    /**
     * Variable name
     */
    readonly ipMtuVariable: string;
    readonly ipv4Address: string;
    /**
     * Variable name
     */
    readonly ipv4AddressVariable: string;
    readonly ipv4SubnetMask: string;
    /**
     * Variable name
     */
    readonly ipv4SubnetMaskVariable: string;
    /**
     * The name of the Feature
     */
    readonly name: string;
    /**
     * Administrative state
     */
    readonly shutdown: boolean;
    /**
     * Variable name
     */
    readonly shutdownVariable: string;
    /**
     * TCP MSS on SYN packets, in bytes
     */
    readonly tcpMss: number;
    /**
     * Variable name
     */
    readonly tcpMssVariable: string;
    /**
     * Transport WAN VPN Feature ID
     */
    readonly transportWanVpnFeatureId: string;
    /**
     * Tunnel destination IP Address
     */
    readonly tunnelDestinationIpv4Address: string;
    /**
     * Variable name
     */
    readonly tunnelDestinationIpv4AddressVariable: string;
    /**
     * \n\n Interface name, can't be Loopback interface
     */
    readonly tunnelRouteViaLoopback: string;
    /**
     * Variable name
     */
    readonly tunnelRouteViaLoopbackVariable: string;
    /**
     * \n\n Interface name
     */
    readonly tunnelSourceInterface: string;
    /**
     * \n\n Interface name
     */
    readonly tunnelSourceInterfaceLoopback: string;
    /**
     * Variable name
     */
    readonly tunnelSourceInterfaceLoopbackVariable: string;
    /**
     * Variable name
     */
    readonly tunnelSourceInterfaceVariable: string;
    /**
     * Tunnel source IP Address
     */
    readonly tunnelSourceIpv4Address: string;
    /**
     * Variable name
     */
    readonly tunnelSourceIpv4AddressVariable: string;
    /**
     * The version of the Feature
     */
    readonly version: number;
}
/**
 * This data source can read the Transport WAN VPN Interface GRE Feature.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getTransportWanVpnInterfaceGreFeature({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 *     transportWanVpnFeatureId: "140331f6-5418-4755-a059-13c77eb96037",
 * });
 * ```
 */
export function getTransportWanVpnInterfaceGreFeatureOutput(args: GetTransportWanVpnInterfaceGreFeatureOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTransportWanVpnInterfaceGreFeatureResult> {
    return pulumi.output(args).apply((a: any) => getTransportWanVpnInterfaceGreFeature(a, opts))
}

/**
 * A collection of arguments for invoking getTransportWanVpnInterfaceGreFeature.
 */
export interface GetTransportWanVpnInterfaceGreFeatureOutputArgs {
    /**
     * Feature Profile ID
     */
    featureProfileId: pulumi.Input<string>;
    /**
     * The id of the Feature
     */
    id: pulumi.Input<string>;
    /**
     * Transport WAN VPN Feature ID
     */
    transportWanVpnFeatureId: pulumi.Input<string>;
}