// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource can manage a Service LAN VPN Interface Ethernet Feature Associate DHCP Server Feature .
 *   - Minimum SD-WAN Manager version: `20.12.0`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = new sdwan.ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeature("example", {
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 *     serviceLanVpnFeatureId: "140331f6-5418-4755-a059-13c77eb96037",
 *     serviceLanVpnInterfaceEthernetFeatureId: "140331f6-5418-4755-a059-13c77eb96037",
 *     serviceDhcpServerFeatureId: "140331f6-5418-4755-a059-13c77eb96037",
 * });
 * ```
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * Expected import identifier with the format: "service_lan_vpn_interface_ethernet_feature_associate_dhcp_server_feature_id,feature_profile_id,service_lan_vpn_feature_id,service_lan_vpn_interface_ethernet_feature_id"
 *
 * ```sh
 * $ pulumi import sdwan:index/serviceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeature:ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac,140331f6-5418-4755-a059-13c77eb96037,140331f6-5418-4755-a059-13c77eb96037"
 * ```
 */
export class ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeature extends pulumi.CustomResource {
    /**
     * Get an existing ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeature resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeatureState, opts?: pulumi.CustomResourceOptions): ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeature {
        return new ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeature(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sdwan:index/serviceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeature:ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeature';

    /**
     * Returns true if the given object is an instance of ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeature.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeature {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeature.__pulumiType;
    }

    /**
     * Feature Profile ID
     */
    public readonly featureProfileId!: pulumi.Output<string>;
    /**
     * Service DHCP Server Feature ID
     */
    public readonly serviceDhcpServerFeatureId!: pulumi.Output<string>;
    /**
     * Service LAN VPN Feature ID
     */
    public readonly serviceLanVpnFeatureId!: pulumi.Output<string>;
    /**
     * Service LAN VPN Interface Ethernet Feature ID
     */
    public readonly serviceLanVpnInterfaceEthernetFeatureId!: pulumi.Output<string>;
    /**
     * The version of the object
     */
    public /*out*/ readonly version!: pulumi.Output<number>;

    /**
     * Create a ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeature resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeatureArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeatureArgs | ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeatureState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeatureState | undefined;
            resourceInputs["featureProfileId"] = state ? state.featureProfileId : undefined;
            resourceInputs["serviceDhcpServerFeatureId"] = state ? state.serviceDhcpServerFeatureId : undefined;
            resourceInputs["serviceLanVpnFeatureId"] = state ? state.serviceLanVpnFeatureId : undefined;
            resourceInputs["serviceLanVpnInterfaceEthernetFeatureId"] = state ? state.serviceLanVpnInterfaceEthernetFeatureId : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeatureArgs | undefined;
            if ((!args || args.featureProfileId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'featureProfileId'");
            }
            if ((!args || args.serviceDhcpServerFeatureId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceDhcpServerFeatureId'");
            }
            if ((!args || args.serviceLanVpnFeatureId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceLanVpnFeatureId'");
            }
            if ((!args || args.serviceLanVpnInterfaceEthernetFeatureId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceLanVpnInterfaceEthernetFeatureId'");
            }
            resourceInputs["featureProfileId"] = args ? args.featureProfileId : undefined;
            resourceInputs["serviceDhcpServerFeatureId"] = args ? args.serviceDhcpServerFeatureId : undefined;
            resourceInputs["serviceLanVpnFeatureId"] = args ? args.serviceLanVpnFeatureId : undefined;
            resourceInputs["serviceLanVpnInterfaceEthernetFeatureId"] = args ? args.serviceLanVpnInterfaceEthernetFeatureId : undefined;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeature.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeature resources.
 */
export interface ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeatureState {
    /**
     * Feature Profile ID
     */
    featureProfileId?: pulumi.Input<string>;
    /**
     * Service DHCP Server Feature ID
     */
    serviceDhcpServerFeatureId?: pulumi.Input<string>;
    /**
     * Service LAN VPN Feature ID
     */
    serviceLanVpnFeatureId?: pulumi.Input<string>;
    /**
     * Service LAN VPN Interface Ethernet Feature ID
     */
    serviceLanVpnInterfaceEthernetFeatureId?: pulumi.Input<string>;
    /**
     * The version of the object
     */
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeature resource.
 */
export interface ServiceLanVpnInterfaceEthernetFeatureAssociateDhcpServerFeatureArgs {
    /**
     * Feature Profile ID
     */
    featureProfileId: pulumi.Input<string>;
    /**
     * Service DHCP Server Feature ID
     */
    serviceDhcpServerFeatureId: pulumi.Input<string>;
    /**
     * Service LAN VPN Feature ID
     */
    serviceLanVpnFeatureId: pulumi.Input<string>;
    /**
     * Service LAN VPN Interface Ethernet Feature ID
     */
    serviceLanVpnInterfaceEthernetFeatureId: pulumi.Input<string>;
}
