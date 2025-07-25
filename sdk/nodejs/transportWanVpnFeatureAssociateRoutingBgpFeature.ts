// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource can manage a Transport WAN VPN Feature Associate Routing BGP Feature .
 *   - Minimum SD-WAN Manager version: `20.12.0`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = new sdwan.TransportWanVpnFeatureAssociateRoutingBgpFeature("example", {
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 *     transportWanVpnFeatureId: "140331f6-5418-4755-a059-13c77eb96037",
 *     transportRoutingBgpFeatureId: "140331f6-5418-4755-a059-13c77eb96037",
 * });
 * ```
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * Expected import identifier with the format: "transport_wan_vpn_feature_associate_routing_bgp_feature_id,feature_profile_id,transport_wan_vpn_feature_id"
 *
 * ```sh
 * $ pulumi import sdwan:index/transportWanVpnFeatureAssociateRoutingBgpFeature:TransportWanVpnFeatureAssociateRoutingBgpFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac,140331f6-5418-4755-a059-13c77eb96037"
 * ```
 */
export class TransportWanVpnFeatureAssociateRoutingBgpFeature extends pulumi.CustomResource {
    /**
     * Get an existing TransportWanVpnFeatureAssociateRoutingBgpFeature resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TransportWanVpnFeatureAssociateRoutingBgpFeatureState, opts?: pulumi.CustomResourceOptions): TransportWanVpnFeatureAssociateRoutingBgpFeature {
        return new TransportWanVpnFeatureAssociateRoutingBgpFeature(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sdwan:index/transportWanVpnFeatureAssociateRoutingBgpFeature:TransportWanVpnFeatureAssociateRoutingBgpFeature';

    /**
     * Returns true if the given object is an instance of TransportWanVpnFeatureAssociateRoutingBgpFeature.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TransportWanVpnFeatureAssociateRoutingBgpFeature {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TransportWanVpnFeatureAssociateRoutingBgpFeature.__pulumiType;
    }

    /**
     * Feature Profile ID
     */
    public readonly featureProfileId!: pulumi.Output<string>;
    /**
     * Transport Routing BGP Feature ID
     */
    public readonly transportRoutingBgpFeatureId!: pulumi.Output<string>;
    /**
     * Transport WAN VPN Feature ID
     */
    public readonly transportWanVpnFeatureId!: pulumi.Output<string>;
    /**
     * The version of the object
     */
    public /*out*/ readonly version!: pulumi.Output<number>;

    /**
     * Create a TransportWanVpnFeatureAssociateRoutingBgpFeature resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TransportWanVpnFeatureAssociateRoutingBgpFeatureArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TransportWanVpnFeatureAssociateRoutingBgpFeatureArgs | TransportWanVpnFeatureAssociateRoutingBgpFeatureState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TransportWanVpnFeatureAssociateRoutingBgpFeatureState | undefined;
            resourceInputs["featureProfileId"] = state ? state.featureProfileId : undefined;
            resourceInputs["transportRoutingBgpFeatureId"] = state ? state.transportRoutingBgpFeatureId : undefined;
            resourceInputs["transportWanVpnFeatureId"] = state ? state.transportWanVpnFeatureId : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as TransportWanVpnFeatureAssociateRoutingBgpFeatureArgs | undefined;
            if ((!args || args.featureProfileId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'featureProfileId'");
            }
            if ((!args || args.transportRoutingBgpFeatureId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transportRoutingBgpFeatureId'");
            }
            if ((!args || args.transportWanVpnFeatureId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transportWanVpnFeatureId'");
            }
            resourceInputs["featureProfileId"] = args ? args.featureProfileId : undefined;
            resourceInputs["transportRoutingBgpFeatureId"] = args ? args.transportRoutingBgpFeatureId : undefined;
            resourceInputs["transportWanVpnFeatureId"] = args ? args.transportWanVpnFeatureId : undefined;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TransportWanVpnFeatureAssociateRoutingBgpFeature.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TransportWanVpnFeatureAssociateRoutingBgpFeature resources.
 */
export interface TransportWanVpnFeatureAssociateRoutingBgpFeatureState {
    /**
     * Feature Profile ID
     */
    featureProfileId?: pulumi.Input<string>;
    /**
     * Transport Routing BGP Feature ID
     */
    transportRoutingBgpFeatureId?: pulumi.Input<string>;
    /**
     * Transport WAN VPN Feature ID
     */
    transportWanVpnFeatureId?: pulumi.Input<string>;
    /**
     * The version of the object
     */
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a TransportWanVpnFeatureAssociateRoutingBgpFeature resource.
 */
export interface TransportWanVpnFeatureAssociateRoutingBgpFeatureArgs {
    /**
     * Feature Profile ID
     */
    featureProfileId: pulumi.Input<string>;
    /**
     * Transport Routing BGP Feature ID
     */
    transportRoutingBgpFeatureId: pulumi.Input<string>;
    /**
     * Transport WAN VPN Feature ID
     */
    transportWanVpnFeatureId: pulumi.Input<string>;
}
