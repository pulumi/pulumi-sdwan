// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource can manage a Service Switchport Feature.
 *   - Minimum SD-WAN Manager version: `20.12.0`
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import sdwan:index/serviceSwitchportFeature:ServiceSwitchportFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd"
 * ```
 */
export class ServiceSwitchportFeature extends pulumi.CustomResource {
    /**
     * Get an existing ServiceSwitchportFeature resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceSwitchportFeatureState, opts?: pulumi.CustomResourceOptions): ServiceSwitchportFeature {
        return new ServiceSwitchportFeature(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sdwan:index/serviceSwitchportFeature:ServiceSwitchportFeature';

    /**
     * Returns true if the given object is an instance of ServiceSwitchportFeature.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceSwitchportFeature {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceSwitchportFeature.__pulumiType;
    }

    /**
     * Set when a MAC table entry ages out (0 to disable, 10-1000000 otherwise) - Range: `0`-`1000000` - Default value: `300`
     */
    public readonly ageOutTime!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly ageOutTimeVariable!: pulumi.Output<string | undefined>;
    /**
     * The description of the Feature
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Feature Profile ID
     */
    public readonly featureProfileId!: pulumi.Output<string>;
    /**
     * Interface name: GigabitEthernet0/<>/<> when present
     */
    public readonly interfaces!: pulumi.Output<outputs.ServiceSwitchportFeatureInterface[] | undefined>;
    /**
     * The name of the Feature
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Add static MAC address entries for interface
     */
    public readonly staticMacAddresses!: pulumi.Output<outputs.ServiceSwitchportFeatureStaticMacAddress[] | undefined>;
    /**
     * The version of the Feature
     */
    public /*out*/ readonly version!: pulumi.Output<number>;

    /**
     * Create a ServiceSwitchportFeature resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceSwitchportFeatureArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceSwitchportFeatureArgs | ServiceSwitchportFeatureState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceSwitchportFeatureState | undefined;
            resourceInputs["ageOutTime"] = state ? state.ageOutTime : undefined;
            resourceInputs["ageOutTimeVariable"] = state ? state.ageOutTimeVariable : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["featureProfileId"] = state ? state.featureProfileId : undefined;
            resourceInputs["interfaces"] = state ? state.interfaces : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["staticMacAddresses"] = state ? state.staticMacAddresses : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as ServiceSwitchportFeatureArgs | undefined;
            if ((!args || args.featureProfileId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'featureProfileId'");
            }
            resourceInputs["ageOutTime"] = args ? args.ageOutTime : undefined;
            resourceInputs["ageOutTimeVariable"] = args ? args.ageOutTimeVariable : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["featureProfileId"] = args ? args.featureProfileId : undefined;
            resourceInputs["interfaces"] = args ? args.interfaces : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["staticMacAddresses"] = args ? args.staticMacAddresses : undefined;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServiceSwitchportFeature.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceSwitchportFeature resources.
 */
export interface ServiceSwitchportFeatureState {
    /**
     * Set when a MAC table entry ages out (0 to disable, 10-1000000 otherwise) - Range: `0`-`1000000` - Default value: `300`
     */
    ageOutTime?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ageOutTimeVariable?: pulumi.Input<string>;
    /**
     * The description of the Feature
     */
    description?: pulumi.Input<string>;
    /**
     * Feature Profile ID
     */
    featureProfileId?: pulumi.Input<string>;
    /**
     * Interface name: GigabitEthernet0/<>/<> when present
     */
    interfaces?: pulumi.Input<pulumi.Input<inputs.ServiceSwitchportFeatureInterface>[]>;
    /**
     * The name of the Feature
     */
    name?: pulumi.Input<string>;
    /**
     * Add static MAC address entries for interface
     */
    staticMacAddresses?: pulumi.Input<pulumi.Input<inputs.ServiceSwitchportFeatureStaticMacAddress>[]>;
    /**
     * The version of the Feature
     */
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a ServiceSwitchportFeature resource.
 */
export interface ServiceSwitchportFeatureArgs {
    /**
     * Set when a MAC table entry ages out (0 to disable, 10-1000000 otherwise) - Range: `0`-`1000000` - Default value: `300`
     */
    ageOutTime?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ageOutTimeVariable?: pulumi.Input<string>;
    /**
     * The description of the Feature
     */
    description?: pulumi.Input<string>;
    /**
     * Feature Profile ID
     */
    featureProfileId: pulumi.Input<string>;
    /**
     * Interface name: GigabitEthernet0/<>/<> when present
     */
    interfaces?: pulumi.Input<pulumi.Input<inputs.ServiceSwitchportFeatureInterface>[]>;
    /**
     * The name of the Feature
     */
    name?: pulumi.Input<string>;
    /**
     * Add static MAC address entries for interface
     */
    staticMacAddresses?: pulumi.Input<pulumi.Input<inputs.ServiceSwitchportFeatureStaticMacAddress>[]>;
}