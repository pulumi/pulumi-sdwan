// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource can manage a Cisco Banner feature template.
 *   - Minimum SD-WAN Manager version: `15.0.0`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = new sdwan.CiscoBannerFeatureTemplate("example", {
 *     name: "Example",
 *     description: "My Example",
 *     deviceTypes: ["vedge-C8000V"],
 *     login: "My Login Banner",
 *     motd: "My MOTD Banner",
 * });
 * ```
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * ```sh
 * $ pulumi import sdwan:index/ciscoBannerFeatureTemplate:CiscoBannerFeatureTemplate example "f6b2c44c-693c-4763-b010-895aa3d236bd"
 * ```
 */
export class CiscoBannerFeatureTemplate extends pulumi.CustomResource {
    /**
     * Get an existing CiscoBannerFeatureTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CiscoBannerFeatureTemplateState, opts?: pulumi.CustomResourceOptions): CiscoBannerFeatureTemplate {
        return new CiscoBannerFeatureTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sdwan:index/ciscoBannerFeatureTemplate:CiscoBannerFeatureTemplate';

    /**
     * Returns true if the given object is an instance of CiscoBannerFeatureTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CiscoBannerFeatureTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CiscoBannerFeatureTemplate.__pulumiType;
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
     * Set message to display before login prompt
     */
    public readonly login!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly loginVariable!: pulumi.Output<string | undefined>;
    /**
     * Set message to display after a user logs in
     */
    public readonly motd!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly motdVariable!: pulumi.Output<string | undefined>;
    /**
     * The name of the feature template
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The template type
     */
    public /*out*/ readonly templateType!: pulumi.Output<string>;
    /**
     * The version of the feature template
     */
    public /*out*/ readonly version!: pulumi.Output<number>;

    /**
     * Create a CiscoBannerFeatureTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CiscoBannerFeatureTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CiscoBannerFeatureTemplateArgs | CiscoBannerFeatureTemplateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CiscoBannerFeatureTemplateState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["deviceTypes"] = state ? state.deviceTypes : undefined;
            resourceInputs["login"] = state ? state.login : undefined;
            resourceInputs["loginVariable"] = state ? state.loginVariable : undefined;
            resourceInputs["motd"] = state ? state.motd : undefined;
            resourceInputs["motdVariable"] = state ? state.motdVariable : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["templateType"] = state ? state.templateType : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as CiscoBannerFeatureTemplateArgs | undefined;
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.deviceTypes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deviceTypes'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["deviceTypes"] = args ? args.deviceTypes : undefined;
            resourceInputs["login"] = args ? args.login : undefined;
            resourceInputs["loginVariable"] = args ? args.loginVariable : undefined;
            resourceInputs["motd"] = args ? args.motd : undefined;
            resourceInputs["motdVariable"] = args ? args.motdVariable : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["templateType"] = undefined /*out*/;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CiscoBannerFeatureTemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CiscoBannerFeatureTemplate resources.
 */
export interface CiscoBannerFeatureTemplateState {
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
     * Set message to display before login prompt
     */
    login?: pulumi.Input<string>;
    /**
     * Variable name
     */
    loginVariable?: pulumi.Input<string>;
    /**
     * Set message to display after a user logs in
     */
    motd?: pulumi.Input<string>;
    /**
     * Variable name
     */
    motdVariable?: pulumi.Input<string>;
    /**
     * The name of the feature template
     */
    name?: pulumi.Input<string>;
    /**
     * The template type
     */
    templateType?: pulumi.Input<string>;
    /**
     * The version of the feature template
     */
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a CiscoBannerFeatureTemplate resource.
 */
export interface CiscoBannerFeatureTemplateArgs {
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
     * Set message to display before login prompt
     */
    login?: pulumi.Input<string>;
    /**
     * Variable name
     */
    loginVariable?: pulumi.Input<string>;
    /**
     * Set message to display after a user logs in
     */
    motd?: pulumi.Input<string>;
    /**
     * Variable name
     */
    motdVariable?: pulumi.Input<string>;
    /**
     * The name of the feature template
     */
    name?: pulumi.Input<string>;
}
