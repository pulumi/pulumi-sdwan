// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource can manage a Protocol List Policy Object .
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = new sdwan.ProtocolListPolicyObject("example", {
 *     name: "Example",
 *     entries: [{
 *         protocol: "cifs",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * ```sh
 * $ pulumi import sdwan:index/protocolListPolicyObject:ProtocolListPolicyObject example "f6b2c44c-693c-4763-b010-895aa3d236bd"
 * ```
 */
export class ProtocolListPolicyObject extends pulumi.CustomResource {
    /**
     * Get an existing ProtocolListPolicyObject resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProtocolListPolicyObjectState, opts?: pulumi.CustomResourceOptions): ProtocolListPolicyObject {
        return new ProtocolListPolicyObject(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sdwan:index/protocolListPolicyObject:ProtocolListPolicyObject';

    /**
     * Returns true if the given object is an instance of ProtocolListPolicyObject.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProtocolListPolicyObject {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProtocolListPolicyObject.__pulumiType;
    }

    /**
     * List of entries
     */
    public readonly entries!: pulumi.Output<outputs.ProtocolListPolicyObjectEntry[]>;
    /**
     * The name of the policy object
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The version of the object
     */
    public /*out*/ readonly version!: pulumi.Output<number>;

    /**
     * Create a ProtocolListPolicyObject resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProtocolListPolicyObjectArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProtocolListPolicyObjectArgs | ProtocolListPolicyObjectState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProtocolListPolicyObjectState | undefined;
            resourceInputs["entries"] = state ? state.entries : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as ProtocolListPolicyObjectArgs | undefined;
            if ((!args || args.entries === undefined) && !opts.urn) {
                throw new Error("Missing required property 'entries'");
            }
            resourceInputs["entries"] = args ? args.entries : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ProtocolListPolicyObject.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProtocolListPolicyObject resources.
 */
export interface ProtocolListPolicyObjectState {
    /**
     * List of entries
     */
    entries?: pulumi.Input<pulumi.Input<inputs.ProtocolListPolicyObjectEntry>[]>;
    /**
     * The name of the policy object
     */
    name?: pulumi.Input<string>;
    /**
     * The version of the object
     */
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a ProtocolListPolicyObject resource.
 */
export interface ProtocolListPolicyObjectArgs {
    /**
     * List of entries
     */
    entries: pulumi.Input<pulumi.Input<inputs.ProtocolListPolicyObjectEntry>[]>;
    /**
     * The name of the policy object
     */
    name?: pulumi.Input<string>;
}
