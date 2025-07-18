// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource can manage a Cisco Secure Internet Gateway feature template.
 *   - Minimum SD-WAN Manager version: `15.0.0`
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * ```sh
 * $ pulumi import sdwan:index/ciscoSecureInternetGatewayFeatureTemplate:CiscoSecureInternetGatewayFeatureTemplate example "f6b2c44c-693c-4763-b010-895aa3d236bd"
 * ```
 */
export class CiscoSecureInternetGatewayFeatureTemplate extends pulumi.CustomResource {
    /**
     * Get an existing CiscoSecureInternetGatewayFeatureTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CiscoSecureInternetGatewayFeatureTemplateState, opts?: pulumi.CustomResourceOptions): CiscoSecureInternetGatewayFeatureTemplate {
        return new CiscoSecureInternetGatewayFeatureTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sdwan:index/ciscoSecureInternetGatewayFeatureTemplate:CiscoSecureInternetGatewayFeatureTemplate';

    /**
     * Returns true if the given object is an instance of CiscoSecureInternetGatewayFeatureTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CiscoSecureInternetGatewayFeatureTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CiscoSecureInternetGatewayFeatureTemplate.__pulumiType;
    }

    /**
     * The description of the feature template
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
     * `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
     * `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
     */
    public readonly deviceTypes!: pulumi.Output<string[]>;
    /**
     * Interface name: IPsec when present
     */
    public readonly interfaces!: pulumi.Output<outputs.CiscoSecureInternetGatewayFeatureTemplateInterface[] | undefined>;
    /**
     * The name of the feature template
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Configure services
     */
    public readonly services!: pulumi.Output<outputs.CiscoSecureInternetGatewayFeatureTemplateService[] | undefined>;
    /**
     * The template type
     */
    public /*out*/ readonly templateType!: pulumi.Output<string>;
    /**
     * Source IP address for Tracker
     */
    public readonly trackerSourceIp!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly trackerSourceIpVariable!: pulumi.Output<string | undefined>;
    /**
     * Tracker configuration
     */
    public readonly trackers!: pulumi.Output<outputs.CiscoSecureInternetGatewayFeatureTemplateTracker[] | undefined>;
    /**
     * The version of the feature template
     */
    public /*out*/ readonly version!: pulumi.Output<number>;
    /**
     * List of VPN instances - Range: `0`-`65527` - Default value: `0`
     */
    public readonly vpnId!: pulumi.Output<number | undefined>;

    /**
     * Create a CiscoSecureInternetGatewayFeatureTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CiscoSecureInternetGatewayFeatureTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CiscoSecureInternetGatewayFeatureTemplateArgs | CiscoSecureInternetGatewayFeatureTemplateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CiscoSecureInternetGatewayFeatureTemplateState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["deviceTypes"] = state ? state.deviceTypes : undefined;
            resourceInputs["interfaces"] = state ? state.interfaces : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["services"] = state ? state.services : undefined;
            resourceInputs["templateType"] = state ? state.templateType : undefined;
            resourceInputs["trackerSourceIp"] = state ? state.trackerSourceIp : undefined;
            resourceInputs["trackerSourceIpVariable"] = state ? state.trackerSourceIpVariable : undefined;
            resourceInputs["trackers"] = state ? state.trackers : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
            resourceInputs["vpnId"] = state ? state.vpnId : undefined;
        } else {
            const args = argsOrState as CiscoSecureInternetGatewayFeatureTemplateArgs | undefined;
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.deviceTypes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deviceTypes'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["deviceTypes"] = args ? args.deviceTypes : undefined;
            resourceInputs["interfaces"] = args ? args.interfaces : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["services"] = args ? args.services : undefined;
            resourceInputs["trackerSourceIp"] = args ? args.trackerSourceIp : undefined;
            resourceInputs["trackerSourceIpVariable"] = args ? args.trackerSourceIpVariable : undefined;
            resourceInputs["trackers"] = args ? args.trackers : undefined;
            resourceInputs["vpnId"] = args ? args.vpnId : undefined;
            resourceInputs["templateType"] = undefined /*out*/;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CiscoSecureInternetGatewayFeatureTemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CiscoSecureInternetGatewayFeatureTemplate resources.
 */
export interface CiscoSecureInternetGatewayFeatureTemplateState {
    /**
     * The description of the feature template
     */
    description?: pulumi.Input<string>;
    /**
     * List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
     * `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
     * `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
     */
    deviceTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Interface name: IPsec when present
     */
    interfaces?: pulumi.Input<pulumi.Input<inputs.CiscoSecureInternetGatewayFeatureTemplateInterface>[]>;
    /**
     * The name of the feature template
     */
    name?: pulumi.Input<string>;
    /**
     * Configure services
     */
    services?: pulumi.Input<pulumi.Input<inputs.CiscoSecureInternetGatewayFeatureTemplateService>[]>;
    /**
     * The template type
     */
    templateType?: pulumi.Input<string>;
    /**
     * Source IP address for Tracker
     */
    trackerSourceIp?: pulumi.Input<string>;
    /**
     * Variable name
     */
    trackerSourceIpVariable?: pulumi.Input<string>;
    /**
     * Tracker configuration
     */
    trackers?: pulumi.Input<pulumi.Input<inputs.CiscoSecureInternetGatewayFeatureTemplateTracker>[]>;
    /**
     * The version of the feature template
     */
    version?: pulumi.Input<number>;
    /**
     * List of VPN instances - Range: `0`-`65527` - Default value: `0`
     */
    vpnId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a CiscoSecureInternetGatewayFeatureTemplate resource.
 */
export interface CiscoSecureInternetGatewayFeatureTemplateArgs {
    /**
     * The description of the feature template
     */
    description: pulumi.Input<string>;
    /**
     * List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
     * `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
     * `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
     */
    deviceTypes: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Interface name: IPsec when present
     */
    interfaces?: pulumi.Input<pulumi.Input<inputs.CiscoSecureInternetGatewayFeatureTemplateInterface>[]>;
    /**
     * The name of the feature template
     */
    name?: pulumi.Input<string>;
    /**
     * Configure services
     */
    services?: pulumi.Input<pulumi.Input<inputs.CiscoSecureInternetGatewayFeatureTemplateService>[]>;
    /**
     * Source IP address for Tracker
     */
    trackerSourceIp?: pulumi.Input<string>;
    /**
     * Variable name
     */
    trackerSourceIpVariable?: pulumi.Input<string>;
    /**
     * Tracker configuration
     */
    trackers?: pulumi.Input<pulumi.Input<inputs.CiscoSecureInternetGatewayFeatureTemplateTracker>[]>;
    /**
     * List of VPN instances - Range: `0`-`65527` - Default value: `0`
     */
    vpnId?: pulumi.Input<number>;
}
