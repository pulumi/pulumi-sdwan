// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource can manage a URL Filtering Policy Definition .
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * ```sh
 * $ pulumi import sdwan:index/urlFilteringPolicyDefinition:UrlFilteringPolicyDefinition example "f6b2c44c-693c-4763-b010-895aa3d236bd"
 * ```
 */
export class UrlFilteringPolicyDefinition extends pulumi.CustomResource {
    /**
     * Get an existing UrlFilteringPolicyDefinition resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UrlFilteringPolicyDefinitionState, opts?: pulumi.CustomResourceOptions): UrlFilteringPolicyDefinition {
        return new UrlFilteringPolicyDefinition(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sdwan:index/urlFilteringPolicyDefinition:UrlFilteringPolicyDefinition';

    /**
     * Returns true if the given object is an instance of UrlFilteringPolicyDefinition.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UrlFilteringPolicyDefinition {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UrlFilteringPolicyDefinition.__pulumiType;
    }

    /**
     * List of alerts options that will be exported as syslog messages
     */
    public readonly alerts!: pulumi.Output<string[] | undefined>;
    /**
     * Allow URL list ID
     */
    public readonly allowUrlListId!: pulumi.Output<string | undefined>;
    /**
     * Allow URL list version
     */
    public readonly allowUrlListVersion!: pulumi.Output<number | undefined>;
    /**
     * Redirect to a URL or display a message when a blocked page is accessed. - Choices: `text`, `redirectUrl`
     */
    public readonly blockPageAction!: pulumi.Output<string | undefined>;
    /**
     * The message displayed or URL redirected to when a blocked page is accessed.
     */
    public readonly blockPageContents!: pulumi.Output<string | undefined>;
    /**
     * Block URL list ID
     */
    public readonly blockUrlListId!: pulumi.Output<string | undefined>;
    /**
     * Block URL list version
     */
    public readonly blockUrlListVersion!: pulumi.Output<number | undefined>;
    /**
     * The description of the policy definition.
     */
    public readonly description!: pulumi.Output<string>;
    public readonly loggings!: pulumi.Output<outputs.UrlFilteringPolicyDefinitionLogging[] | undefined>;
    /**
     * The policy mode - Choices: `security`, `unified`
     */
    public readonly mode!: pulumi.Output<string | undefined>;
    /**
     * The name of the policy definition.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * List of VPN IDs
     */
    public readonly targetVpns!: pulumi.Output<string[] | undefined>;
    /**
     * The version of the object
     */
    public /*out*/ readonly version!: pulumi.Output<number>;
    /**
     * List of categories to block or allow
     */
    public readonly webCategories!: pulumi.Output<string[] | undefined>;
    /**
     * whether the selected web categories should be blocked or allowed. - Choices: `block`, `allow`
     */
    public readonly webCategoriesAction!: pulumi.Output<string | undefined>;
    /**
     * The web reputation of the policy definition - Choices: `high-risk`, `suspicious`, `moderate-risk`, `low-risk`,
     * `trustworthy`
     */
    public readonly webReputation!: pulumi.Output<string | undefined>;

    /**
     * Create a UrlFilteringPolicyDefinition resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UrlFilteringPolicyDefinitionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UrlFilteringPolicyDefinitionArgs | UrlFilteringPolicyDefinitionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UrlFilteringPolicyDefinitionState | undefined;
            resourceInputs["alerts"] = state ? state.alerts : undefined;
            resourceInputs["allowUrlListId"] = state ? state.allowUrlListId : undefined;
            resourceInputs["allowUrlListVersion"] = state ? state.allowUrlListVersion : undefined;
            resourceInputs["blockPageAction"] = state ? state.blockPageAction : undefined;
            resourceInputs["blockPageContents"] = state ? state.blockPageContents : undefined;
            resourceInputs["blockUrlListId"] = state ? state.blockUrlListId : undefined;
            resourceInputs["blockUrlListVersion"] = state ? state.blockUrlListVersion : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["loggings"] = state ? state.loggings : undefined;
            resourceInputs["mode"] = state ? state.mode : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["targetVpns"] = state ? state.targetVpns : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
            resourceInputs["webCategories"] = state ? state.webCategories : undefined;
            resourceInputs["webCategoriesAction"] = state ? state.webCategoriesAction : undefined;
            resourceInputs["webReputation"] = state ? state.webReputation : undefined;
        } else {
            const args = argsOrState as UrlFilteringPolicyDefinitionArgs | undefined;
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            resourceInputs["alerts"] = args ? args.alerts : undefined;
            resourceInputs["allowUrlListId"] = args ? args.allowUrlListId : undefined;
            resourceInputs["allowUrlListVersion"] = args ? args.allowUrlListVersion : undefined;
            resourceInputs["blockPageAction"] = args ? args.blockPageAction : undefined;
            resourceInputs["blockPageContents"] = args ? args.blockPageContents : undefined;
            resourceInputs["blockUrlListId"] = args ? args.blockUrlListId : undefined;
            resourceInputs["blockUrlListVersion"] = args ? args.blockUrlListVersion : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["loggings"] = args ? args.loggings : undefined;
            resourceInputs["mode"] = args ? args.mode : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["targetVpns"] = args ? args.targetVpns : undefined;
            resourceInputs["webCategories"] = args ? args.webCategories : undefined;
            resourceInputs["webCategoriesAction"] = args ? args.webCategoriesAction : undefined;
            resourceInputs["webReputation"] = args ? args.webReputation : undefined;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(UrlFilteringPolicyDefinition.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UrlFilteringPolicyDefinition resources.
 */
export interface UrlFilteringPolicyDefinitionState {
    /**
     * List of alerts options that will be exported as syslog messages
     */
    alerts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Allow URL list ID
     */
    allowUrlListId?: pulumi.Input<string>;
    /**
     * Allow URL list version
     */
    allowUrlListVersion?: pulumi.Input<number>;
    /**
     * Redirect to a URL or display a message when a blocked page is accessed. - Choices: `text`, `redirectUrl`
     */
    blockPageAction?: pulumi.Input<string>;
    /**
     * The message displayed or URL redirected to when a blocked page is accessed.
     */
    blockPageContents?: pulumi.Input<string>;
    /**
     * Block URL list ID
     */
    blockUrlListId?: pulumi.Input<string>;
    /**
     * Block URL list version
     */
    blockUrlListVersion?: pulumi.Input<number>;
    /**
     * The description of the policy definition.
     */
    description?: pulumi.Input<string>;
    loggings?: pulumi.Input<pulumi.Input<inputs.UrlFilteringPolicyDefinitionLogging>[]>;
    /**
     * The policy mode - Choices: `security`, `unified`
     */
    mode?: pulumi.Input<string>;
    /**
     * The name of the policy definition.
     */
    name?: pulumi.Input<string>;
    /**
     * List of VPN IDs
     */
    targetVpns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The version of the object
     */
    version?: pulumi.Input<number>;
    /**
     * List of categories to block or allow
     */
    webCategories?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * whether the selected web categories should be blocked or allowed. - Choices: `block`, `allow`
     */
    webCategoriesAction?: pulumi.Input<string>;
    /**
     * The web reputation of the policy definition - Choices: `high-risk`, `suspicious`, `moderate-risk`, `low-risk`,
     * `trustworthy`
     */
    webReputation?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a UrlFilteringPolicyDefinition resource.
 */
export interface UrlFilteringPolicyDefinitionArgs {
    /**
     * List of alerts options that will be exported as syslog messages
     */
    alerts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Allow URL list ID
     */
    allowUrlListId?: pulumi.Input<string>;
    /**
     * Allow URL list version
     */
    allowUrlListVersion?: pulumi.Input<number>;
    /**
     * Redirect to a URL or display a message when a blocked page is accessed. - Choices: `text`, `redirectUrl`
     */
    blockPageAction?: pulumi.Input<string>;
    /**
     * The message displayed or URL redirected to when a blocked page is accessed.
     */
    blockPageContents?: pulumi.Input<string>;
    /**
     * Block URL list ID
     */
    blockUrlListId?: pulumi.Input<string>;
    /**
     * Block URL list version
     */
    blockUrlListVersion?: pulumi.Input<number>;
    /**
     * The description of the policy definition.
     */
    description: pulumi.Input<string>;
    loggings?: pulumi.Input<pulumi.Input<inputs.UrlFilteringPolicyDefinitionLogging>[]>;
    /**
     * The policy mode - Choices: `security`, `unified`
     */
    mode?: pulumi.Input<string>;
    /**
     * The name of the policy definition.
     */
    name?: pulumi.Input<string>;
    /**
     * List of VPN IDs
     */
    targetVpns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of categories to block or allow
     */
    webCategories?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * whether the selected web categories should be blocked or allowed. - Choices: `block`, `allow`
     */
    webCategoriesAction?: pulumi.Input<string>;
    /**
     * The web reputation of the policy definition - Choices: `high-risk`, `suspicious`, `moderate-risk`, `low-risk`,
     * `trustworthy`
     */
    webReputation?: pulumi.Input<string>;
}
