// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource can manage a Preferred Color Group Policy Object .
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = new sdwan.PreferredColorGroupPolicyObject("example", {
 *     name: "Example",
 *     primaryColorPreference: "blue bronze",
 *     primaryPathPreference: "direct-path",
 *     secondaryColorPreference: "3g",
 *     secondaryPathPreference: "multi-hop-path",
 *     tertiaryColorPreference: "custom1",
 *     tertiaryPathPreference: "all-paths",
 * });
 * ```
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * ```sh
 * $ pulumi import sdwan:index/preferredColorGroupPolicyObject:PreferredColorGroupPolicyObject example "f6b2c44c-693c-4763-b010-895aa3d236bd"
 * ```
 */
export class PreferredColorGroupPolicyObject extends pulumi.CustomResource {
    /**
     * Get an existing PreferredColorGroupPolicyObject resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PreferredColorGroupPolicyObjectState, opts?: pulumi.CustomResourceOptions): PreferredColorGroupPolicyObject {
        return new PreferredColorGroupPolicyObject(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sdwan:index/preferredColorGroupPolicyObject:PreferredColorGroupPolicyObject';

    /**
     * Returns true if the given object is an instance of PreferredColorGroupPolicyObject.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PreferredColorGroupPolicyObject {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PreferredColorGroupPolicyObject.__pulumiType;
    }

    /**
     * The name of the policy object
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Color or space separated list of colors
     */
    public readonly primaryColorPreference!: pulumi.Output<string>;
    /**
     * Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
     */
    public readonly primaryPathPreference!: pulumi.Output<string | undefined>;
    /**
     * Color or space separated list of colors
     */
    public readonly secondaryColorPreference!: pulumi.Output<string | undefined>;
    /**
     * Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
     */
    public readonly secondaryPathPreference!: pulumi.Output<string | undefined>;
    /**
     * Color or space separated list of colors
     */
    public readonly tertiaryColorPreference!: pulumi.Output<string | undefined>;
    /**
     * Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
     */
    public readonly tertiaryPathPreference!: pulumi.Output<string | undefined>;
    /**
     * The version of the object
     */
    public /*out*/ readonly version!: pulumi.Output<number>;

    /**
     * Create a PreferredColorGroupPolicyObject resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PreferredColorGroupPolicyObjectArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PreferredColorGroupPolicyObjectArgs | PreferredColorGroupPolicyObjectState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PreferredColorGroupPolicyObjectState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["primaryColorPreference"] = state ? state.primaryColorPreference : undefined;
            resourceInputs["primaryPathPreference"] = state ? state.primaryPathPreference : undefined;
            resourceInputs["secondaryColorPreference"] = state ? state.secondaryColorPreference : undefined;
            resourceInputs["secondaryPathPreference"] = state ? state.secondaryPathPreference : undefined;
            resourceInputs["tertiaryColorPreference"] = state ? state.tertiaryColorPreference : undefined;
            resourceInputs["tertiaryPathPreference"] = state ? state.tertiaryPathPreference : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as PreferredColorGroupPolicyObjectArgs | undefined;
            if ((!args || args.primaryColorPreference === undefined) && !opts.urn) {
                throw new Error("Missing required property 'primaryColorPreference'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["primaryColorPreference"] = args ? args.primaryColorPreference : undefined;
            resourceInputs["primaryPathPreference"] = args ? args.primaryPathPreference : undefined;
            resourceInputs["secondaryColorPreference"] = args ? args.secondaryColorPreference : undefined;
            resourceInputs["secondaryPathPreference"] = args ? args.secondaryPathPreference : undefined;
            resourceInputs["tertiaryColorPreference"] = args ? args.tertiaryColorPreference : undefined;
            resourceInputs["tertiaryPathPreference"] = args ? args.tertiaryPathPreference : undefined;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PreferredColorGroupPolicyObject.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PreferredColorGroupPolicyObject resources.
 */
export interface PreferredColorGroupPolicyObjectState {
    /**
     * The name of the policy object
     */
    name?: pulumi.Input<string>;
    /**
     * Color or space separated list of colors
     */
    primaryColorPreference?: pulumi.Input<string>;
    /**
     * Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
     */
    primaryPathPreference?: pulumi.Input<string>;
    /**
     * Color or space separated list of colors
     */
    secondaryColorPreference?: pulumi.Input<string>;
    /**
     * Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
     */
    secondaryPathPreference?: pulumi.Input<string>;
    /**
     * Color or space separated list of colors
     */
    tertiaryColorPreference?: pulumi.Input<string>;
    /**
     * Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
     */
    tertiaryPathPreference?: pulumi.Input<string>;
    /**
     * The version of the object
     */
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a PreferredColorGroupPolicyObject resource.
 */
export interface PreferredColorGroupPolicyObjectArgs {
    /**
     * The name of the policy object
     */
    name?: pulumi.Input<string>;
    /**
     * Color or space separated list of colors
     */
    primaryColorPreference: pulumi.Input<string>;
    /**
     * Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
     */
    primaryPathPreference?: pulumi.Input<string>;
    /**
     * Color or space separated list of colors
     */
    secondaryColorPreference?: pulumi.Input<string>;
    /**
     * Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
     */
    secondaryPathPreference?: pulumi.Input<string>;
    /**
     * Color or space separated list of colors
     */
    tertiaryColorPreference?: pulumi.Input<string>;
    /**
     * Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
     */
    tertiaryPathPreference?: pulumi.Input<string>;
}
