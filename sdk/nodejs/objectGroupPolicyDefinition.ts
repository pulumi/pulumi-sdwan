// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource can manage a Object Group Policy Definition .
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = new sdwan.ObjectGroupPolicyDefinition("example", {
 *     name: "Example",
 *     description: "My description",
 *     ipv4Prefix: "10.1.1.0/24",
 *     fqdn: "cisco.com",
 *     port: "80-90",
 *     geoLocation: "AF",
 * });
 * ```
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * ```sh
 * $ pulumi import sdwan:index/objectGroupPolicyDefinition:ObjectGroupPolicyDefinition example "f6b2c44c-693c-4763-b010-895aa3d236bd"
 * ```
 */
export class ObjectGroupPolicyDefinition extends pulumi.CustomResource {
    /**
     * Get an existing ObjectGroupPolicyDefinition resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ObjectGroupPolicyDefinitionState, opts?: pulumi.CustomResourceOptions): ObjectGroupPolicyDefinition {
        return new ObjectGroupPolicyDefinition(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sdwan:index/objectGroupPolicyDefinition:ObjectGroupPolicyDefinition';

    /**
     * Returns true if the given object is an instance of ObjectGroupPolicyDefinition.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ObjectGroupPolicyDefinition {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ObjectGroupPolicyDefinition.__pulumiType;
    }

    /**
     * Data FQDN prefix list ID
     */
    public readonly dataFqdnPrefixListId!: pulumi.Output<string | undefined>;
    /**
     * Data FQDN prefix list version
     */
    public readonly dataFqdnPrefixListVersion!: pulumi.Output<number | undefined>;
    /**
     * Data IPv4 prefix list ID
     */
    public readonly dataIpv4PrefixListId!: pulumi.Output<string | undefined>;
    /**
     * Data IPv4 prefix list version
     */
    public readonly dataIpv4PrefixListVersion!: pulumi.Output<number | undefined>;
    /**
     * The description of the policy definition
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Fully qualified domain name
     */
    public readonly fqdn!: pulumi.Output<string | undefined>;
    /**
     * Geo location
     */
    public readonly geoLocation!: pulumi.Output<string | undefined>;
    /**
     * Geo location list ID
     */
    public readonly geoLocationListId!: pulumi.Output<string | undefined>;
    /**
     * Geo location list version
     */
    public readonly geoLocationListVersion!: pulumi.Output<number | undefined>;
    /**
     * IPv4 prefix
     */
    public readonly ipv4Prefix!: pulumi.Output<string | undefined>;
    /**
     * IPv4 prefix variable name
     */
    public readonly ipv4PrefixVariable!: pulumi.Output<string | undefined>;
    /**
     * The name of the policy definition
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Port or range of ports
     */
    public readonly port!: pulumi.Output<string | undefined>;
    /**
     * Port list ID
     */
    public readonly portListId!: pulumi.Output<string | undefined>;
    /**
     * Port list version
     */
    public readonly portListVersion!: pulumi.Output<number | undefined>;
    /**
     * The version of the object
     */
    public /*out*/ readonly version!: pulumi.Output<number>;

    /**
     * Create a ObjectGroupPolicyDefinition resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ObjectGroupPolicyDefinitionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ObjectGroupPolicyDefinitionArgs | ObjectGroupPolicyDefinitionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ObjectGroupPolicyDefinitionState | undefined;
            resourceInputs["dataFqdnPrefixListId"] = state ? state.dataFqdnPrefixListId : undefined;
            resourceInputs["dataFqdnPrefixListVersion"] = state ? state.dataFqdnPrefixListVersion : undefined;
            resourceInputs["dataIpv4PrefixListId"] = state ? state.dataIpv4PrefixListId : undefined;
            resourceInputs["dataIpv4PrefixListVersion"] = state ? state.dataIpv4PrefixListVersion : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["fqdn"] = state ? state.fqdn : undefined;
            resourceInputs["geoLocation"] = state ? state.geoLocation : undefined;
            resourceInputs["geoLocationListId"] = state ? state.geoLocationListId : undefined;
            resourceInputs["geoLocationListVersion"] = state ? state.geoLocationListVersion : undefined;
            resourceInputs["ipv4Prefix"] = state ? state.ipv4Prefix : undefined;
            resourceInputs["ipv4PrefixVariable"] = state ? state.ipv4PrefixVariable : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["portListId"] = state ? state.portListId : undefined;
            resourceInputs["portListVersion"] = state ? state.portListVersion : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as ObjectGroupPolicyDefinitionArgs | undefined;
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            resourceInputs["dataFqdnPrefixListId"] = args ? args.dataFqdnPrefixListId : undefined;
            resourceInputs["dataFqdnPrefixListVersion"] = args ? args.dataFqdnPrefixListVersion : undefined;
            resourceInputs["dataIpv4PrefixListId"] = args ? args.dataIpv4PrefixListId : undefined;
            resourceInputs["dataIpv4PrefixListVersion"] = args ? args.dataIpv4PrefixListVersion : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["fqdn"] = args ? args.fqdn : undefined;
            resourceInputs["geoLocation"] = args ? args.geoLocation : undefined;
            resourceInputs["geoLocationListId"] = args ? args.geoLocationListId : undefined;
            resourceInputs["geoLocationListVersion"] = args ? args.geoLocationListVersion : undefined;
            resourceInputs["ipv4Prefix"] = args ? args.ipv4Prefix : undefined;
            resourceInputs["ipv4PrefixVariable"] = args ? args.ipv4PrefixVariable : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["port"] = args ? args.port : undefined;
            resourceInputs["portListId"] = args ? args.portListId : undefined;
            resourceInputs["portListVersion"] = args ? args.portListVersion : undefined;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ObjectGroupPolicyDefinition.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ObjectGroupPolicyDefinition resources.
 */
export interface ObjectGroupPolicyDefinitionState {
    /**
     * Data FQDN prefix list ID
     */
    dataFqdnPrefixListId?: pulumi.Input<string>;
    /**
     * Data FQDN prefix list version
     */
    dataFqdnPrefixListVersion?: pulumi.Input<number>;
    /**
     * Data IPv4 prefix list ID
     */
    dataIpv4PrefixListId?: pulumi.Input<string>;
    /**
     * Data IPv4 prefix list version
     */
    dataIpv4PrefixListVersion?: pulumi.Input<number>;
    /**
     * The description of the policy definition
     */
    description?: pulumi.Input<string>;
    /**
     * Fully qualified domain name
     */
    fqdn?: pulumi.Input<string>;
    /**
     * Geo location
     */
    geoLocation?: pulumi.Input<string>;
    /**
     * Geo location list ID
     */
    geoLocationListId?: pulumi.Input<string>;
    /**
     * Geo location list version
     */
    geoLocationListVersion?: pulumi.Input<number>;
    /**
     * IPv4 prefix
     */
    ipv4Prefix?: pulumi.Input<string>;
    /**
     * IPv4 prefix variable name
     */
    ipv4PrefixVariable?: pulumi.Input<string>;
    /**
     * The name of the policy definition
     */
    name?: pulumi.Input<string>;
    /**
     * Port or range of ports
     */
    port?: pulumi.Input<string>;
    /**
     * Port list ID
     */
    portListId?: pulumi.Input<string>;
    /**
     * Port list version
     */
    portListVersion?: pulumi.Input<number>;
    /**
     * The version of the object
     */
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a ObjectGroupPolicyDefinition resource.
 */
export interface ObjectGroupPolicyDefinitionArgs {
    /**
     * Data FQDN prefix list ID
     */
    dataFqdnPrefixListId?: pulumi.Input<string>;
    /**
     * Data FQDN prefix list version
     */
    dataFqdnPrefixListVersion?: pulumi.Input<number>;
    /**
     * Data IPv4 prefix list ID
     */
    dataIpv4PrefixListId?: pulumi.Input<string>;
    /**
     * Data IPv4 prefix list version
     */
    dataIpv4PrefixListVersion?: pulumi.Input<number>;
    /**
     * The description of the policy definition
     */
    description: pulumi.Input<string>;
    /**
     * Fully qualified domain name
     */
    fqdn?: pulumi.Input<string>;
    /**
     * Geo location
     */
    geoLocation?: pulumi.Input<string>;
    /**
     * Geo location list ID
     */
    geoLocationListId?: pulumi.Input<string>;
    /**
     * Geo location list version
     */
    geoLocationListVersion?: pulumi.Input<number>;
    /**
     * IPv4 prefix
     */
    ipv4Prefix?: pulumi.Input<string>;
    /**
     * IPv4 prefix variable name
     */
    ipv4PrefixVariable?: pulumi.Input<string>;
    /**
     * The name of the policy definition
     */
    name?: pulumi.Input<string>;
    /**
     * Port or range of ports
     */
    port?: pulumi.Input<string>;
    /**
     * Port list ID
     */
    portListId?: pulumi.Input<string>;
    /**
     * Port list version
     */
    portListVersion?: pulumi.Input<number>;
}
