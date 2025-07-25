// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource can manage a cEdge PIM feature template.
 *   - Minimum SD-WAN Manager version: `15.0.0`
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * ```sh
 * $ pulumi import sdwan:index/cedgePimFeatureTemplate:CedgePimFeatureTemplate example "f6b2c44c-693c-4763-b010-895aa3d236bd"
 * ```
 */
export class CedgePimFeatureTemplate extends pulumi.CustomResource {
    /**
     * Get an existing CedgePimFeatureTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CedgePimFeatureTemplateState, opts?: pulumi.CustomResourceOptions): CedgePimFeatureTemplate {
        return new CedgePimFeatureTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sdwan:index/cedgePimFeatureTemplate:CedgePimFeatureTemplate';

    /**
     * Returns true if the given object is an instance of CedgePimFeatureTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CedgePimFeatureTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CedgePimFeatureTemplate.__pulumiType;
    }

    /**
     * Enable or disable auto-RP - Default value: `false`
     */
    public readonly autoRp!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly autoRpVariable!: pulumi.Output<string | undefined>;
    /**
     * Set Autonomic-Networking virtual interface
     */
    public readonly bsrCandidate!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly bsrCandidateVariable!: pulumi.Output<string | undefined>;
    /**
     * Turn SSM On / Off - Default value: `false`
     */
    public readonly default!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly defaultVariable!: pulumi.Output<string | undefined>;
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
     * Hash Mask length for RP selection
     */
    public readonly hashMaskLength!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly hashMaskLengthVariable!: pulumi.Output<string | undefined>;
    /**
     * Set RP Discovery Interface Name
     */
    public readonly interfaceName!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly interfaceNameVariable!: pulumi.Output<string | undefined>;
    /**
     * Set PIM interface parameters
     */
    public readonly interfaces!: pulumi.Output<outputs.CedgePimFeatureTemplateInterface[] | undefined>;
    /**
     * The name of the feature template
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Set RP candidate priority - Range: `0`-`255`
     */
    public readonly priority!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly priorityVariable!: pulumi.Output<string | undefined>;
    /**
     * Set Access List for PIM SSM
     */
    public readonly range!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly rangeVariable!: pulumi.Output<string | undefined>;
    /**
     * Set Static RP Address(es)
     */
    public readonly rpAddresses!: pulumi.Output<outputs.CedgePimFeatureTemplateRpAddress[] | undefined>;
    /**
     * Enable or disable RP Announce
     */
    public readonly rpAnnounceFields!: pulumi.Output<outputs.CedgePimFeatureTemplateRpAnnounceField[] | undefined>;
    /**
     * Set BSR RP candidate filter
     */
    public readonly rpCandidateAccessList!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly rpCandidateAccessListVariable!: pulumi.Output<string | undefined>;
    /**
     * Set RP Discovery Scope
     */
    public readonly rpCandidates!: pulumi.Output<outputs.CedgePimFeatureTemplateRpCandidate[] | undefined>;
    /**
     * Set RP Discovery Scope - Range: `1`-`255`
     */
    public readonly scope!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly scopeVariable!: pulumi.Output<string | undefined>;
    /**
     * Set when PIM router joins the SPT (kbps) - Choices: `0`, `infinity`
     */
    public readonly sptThreshold!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly sptThresholdVariable!: pulumi.Output<string | undefined>;
    /**
     * The template type
     */
    public /*out*/ readonly templateType!: pulumi.Output<string>;
    /**
     * The version of the feature template
     */
    public /*out*/ readonly version!: pulumi.Output<number>;

    /**
     * Create a CedgePimFeatureTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CedgePimFeatureTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CedgePimFeatureTemplateArgs | CedgePimFeatureTemplateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CedgePimFeatureTemplateState | undefined;
            resourceInputs["autoRp"] = state ? state.autoRp : undefined;
            resourceInputs["autoRpVariable"] = state ? state.autoRpVariable : undefined;
            resourceInputs["bsrCandidate"] = state ? state.bsrCandidate : undefined;
            resourceInputs["bsrCandidateVariable"] = state ? state.bsrCandidateVariable : undefined;
            resourceInputs["default"] = state ? state.default : undefined;
            resourceInputs["defaultVariable"] = state ? state.defaultVariable : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["deviceTypes"] = state ? state.deviceTypes : undefined;
            resourceInputs["hashMaskLength"] = state ? state.hashMaskLength : undefined;
            resourceInputs["hashMaskLengthVariable"] = state ? state.hashMaskLengthVariable : undefined;
            resourceInputs["interfaceName"] = state ? state.interfaceName : undefined;
            resourceInputs["interfaceNameVariable"] = state ? state.interfaceNameVariable : undefined;
            resourceInputs["interfaces"] = state ? state.interfaces : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["priority"] = state ? state.priority : undefined;
            resourceInputs["priorityVariable"] = state ? state.priorityVariable : undefined;
            resourceInputs["range"] = state ? state.range : undefined;
            resourceInputs["rangeVariable"] = state ? state.rangeVariable : undefined;
            resourceInputs["rpAddresses"] = state ? state.rpAddresses : undefined;
            resourceInputs["rpAnnounceFields"] = state ? state.rpAnnounceFields : undefined;
            resourceInputs["rpCandidateAccessList"] = state ? state.rpCandidateAccessList : undefined;
            resourceInputs["rpCandidateAccessListVariable"] = state ? state.rpCandidateAccessListVariable : undefined;
            resourceInputs["rpCandidates"] = state ? state.rpCandidates : undefined;
            resourceInputs["scope"] = state ? state.scope : undefined;
            resourceInputs["scopeVariable"] = state ? state.scopeVariable : undefined;
            resourceInputs["sptThreshold"] = state ? state.sptThreshold : undefined;
            resourceInputs["sptThresholdVariable"] = state ? state.sptThresholdVariable : undefined;
            resourceInputs["templateType"] = state ? state.templateType : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as CedgePimFeatureTemplateArgs | undefined;
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.deviceTypes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deviceTypes'");
            }
            resourceInputs["autoRp"] = args ? args.autoRp : undefined;
            resourceInputs["autoRpVariable"] = args ? args.autoRpVariable : undefined;
            resourceInputs["bsrCandidate"] = args ? args.bsrCandidate : undefined;
            resourceInputs["bsrCandidateVariable"] = args ? args.bsrCandidateVariable : undefined;
            resourceInputs["default"] = args ? args.default : undefined;
            resourceInputs["defaultVariable"] = args ? args.defaultVariable : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["deviceTypes"] = args ? args.deviceTypes : undefined;
            resourceInputs["hashMaskLength"] = args ? args.hashMaskLength : undefined;
            resourceInputs["hashMaskLengthVariable"] = args ? args.hashMaskLengthVariable : undefined;
            resourceInputs["interfaceName"] = args ? args.interfaceName : undefined;
            resourceInputs["interfaceNameVariable"] = args ? args.interfaceNameVariable : undefined;
            resourceInputs["interfaces"] = args ? args.interfaces : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["priority"] = args ? args.priority : undefined;
            resourceInputs["priorityVariable"] = args ? args.priorityVariable : undefined;
            resourceInputs["range"] = args ? args.range : undefined;
            resourceInputs["rangeVariable"] = args ? args.rangeVariable : undefined;
            resourceInputs["rpAddresses"] = args ? args.rpAddresses : undefined;
            resourceInputs["rpAnnounceFields"] = args ? args.rpAnnounceFields : undefined;
            resourceInputs["rpCandidateAccessList"] = args ? args.rpCandidateAccessList : undefined;
            resourceInputs["rpCandidateAccessListVariable"] = args ? args.rpCandidateAccessListVariable : undefined;
            resourceInputs["rpCandidates"] = args ? args.rpCandidates : undefined;
            resourceInputs["scope"] = args ? args.scope : undefined;
            resourceInputs["scopeVariable"] = args ? args.scopeVariable : undefined;
            resourceInputs["sptThreshold"] = args ? args.sptThreshold : undefined;
            resourceInputs["sptThresholdVariable"] = args ? args.sptThresholdVariable : undefined;
            resourceInputs["templateType"] = undefined /*out*/;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CedgePimFeatureTemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CedgePimFeatureTemplate resources.
 */
export interface CedgePimFeatureTemplateState {
    /**
     * Enable or disable auto-RP - Default value: `false`
     */
    autoRp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    autoRpVariable?: pulumi.Input<string>;
    /**
     * Set Autonomic-Networking virtual interface
     */
    bsrCandidate?: pulumi.Input<string>;
    /**
     * Variable name
     */
    bsrCandidateVariable?: pulumi.Input<string>;
    /**
     * Turn SSM On / Off - Default value: `false`
     */
    default?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    defaultVariable?: pulumi.Input<string>;
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
     * Hash Mask length for RP selection
     */
    hashMaskLength?: pulumi.Input<string>;
    /**
     * Variable name
     */
    hashMaskLengthVariable?: pulumi.Input<string>;
    /**
     * Set RP Discovery Interface Name
     */
    interfaceName?: pulumi.Input<string>;
    /**
     * Variable name
     */
    interfaceNameVariable?: pulumi.Input<string>;
    /**
     * Set PIM interface parameters
     */
    interfaces?: pulumi.Input<pulumi.Input<inputs.CedgePimFeatureTemplateInterface>[]>;
    /**
     * The name of the feature template
     */
    name?: pulumi.Input<string>;
    /**
     * Set RP candidate priority - Range: `0`-`255`
     */
    priority?: pulumi.Input<number>;
    /**
     * Variable name
     */
    priorityVariable?: pulumi.Input<string>;
    /**
     * Set Access List for PIM SSM
     */
    range?: pulumi.Input<string>;
    /**
     * Variable name
     */
    rangeVariable?: pulumi.Input<string>;
    /**
     * Set Static RP Address(es)
     */
    rpAddresses?: pulumi.Input<pulumi.Input<inputs.CedgePimFeatureTemplateRpAddress>[]>;
    /**
     * Enable or disable RP Announce
     */
    rpAnnounceFields?: pulumi.Input<pulumi.Input<inputs.CedgePimFeatureTemplateRpAnnounceField>[]>;
    /**
     * Set BSR RP candidate filter
     */
    rpCandidateAccessList?: pulumi.Input<string>;
    /**
     * Variable name
     */
    rpCandidateAccessListVariable?: pulumi.Input<string>;
    /**
     * Set RP Discovery Scope
     */
    rpCandidates?: pulumi.Input<pulumi.Input<inputs.CedgePimFeatureTemplateRpCandidate>[]>;
    /**
     * Set RP Discovery Scope - Range: `1`-`255`
     */
    scope?: pulumi.Input<number>;
    /**
     * Variable name
     */
    scopeVariable?: pulumi.Input<string>;
    /**
     * Set when PIM router joins the SPT (kbps) - Choices: `0`, `infinity`
     */
    sptThreshold?: pulumi.Input<string>;
    /**
     * Variable name
     */
    sptThresholdVariable?: pulumi.Input<string>;
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
 * The set of arguments for constructing a CedgePimFeatureTemplate resource.
 */
export interface CedgePimFeatureTemplateArgs {
    /**
     * Enable or disable auto-RP - Default value: `false`
     */
    autoRp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    autoRpVariable?: pulumi.Input<string>;
    /**
     * Set Autonomic-Networking virtual interface
     */
    bsrCandidate?: pulumi.Input<string>;
    /**
     * Variable name
     */
    bsrCandidateVariable?: pulumi.Input<string>;
    /**
     * Turn SSM On / Off - Default value: `false`
     */
    default?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    defaultVariable?: pulumi.Input<string>;
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
     * Hash Mask length for RP selection
     */
    hashMaskLength?: pulumi.Input<string>;
    /**
     * Variable name
     */
    hashMaskLengthVariable?: pulumi.Input<string>;
    /**
     * Set RP Discovery Interface Name
     */
    interfaceName?: pulumi.Input<string>;
    /**
     * Variable name
     */
    interfaceNameVariable?: pulumi.Input<string>;
    /**
     * Set PIM interface parameters
     */
    interfaces?: pulumi.Input<pulumi.Input<inputs.CedgePimFeatureTemplateInterface>[]>;
    /**
     * The name of the feature template
     */
    name?: pulumi.Input<string>;
    /**
     * Set RP candidate priority - Range: `0`-`255`
     */
    priority?: pulumi.Input<number>;
    /**
     * Variable name
     */
    priorityVariable?: pulumi.Input<string>;
    /**
     * Set Access List for PIM SSM
     */
    range?: pulumi.Input<string>;
    /**
     * Variable name
     */
    rangeVariable?: pulumi.Input<string>;
    /**
     * Set Static RP Address(es)
     */
    rpAddresses?: pulumi.Input<pulumi.Input<inputs.CedgePimFeatureTemplateRpAddress>[]>;
    /**
     * Enable or disable RP Announce
     */
    rpAnnounceFields?: pulumi.Input<pulumi.Input<inputs.CedgePimFeatureTemplateRpAnnounceField>[]>;
    /**
     * Set BSR RP candidate filter
     */
    rpCandidateAccessList?: pulumi.Input<string>;
    /**
     * Variable name
     */
    rpCandidateAccessListVariable?: pulumi.Input<string>;
    /**
     * Set RP Discovery Scope
     */
    rpCandidates?: pulumi.Input<pulumi.Input<inputs.CedgePimFeatureTemplateRpCandidate>[]>;
    /**
     * Set RP Discovery Scope - Range: `1`-`255`
     */
    scope?: pulumi.Input<number>;
    /**
     * Variable name
     */
    scopeVariable?: pulumi.Input<string>;
    /**
     * Set when PIM router joins the SPT (kbps) - Choices: `0`, `infinity`
     */
    sptThreshold?: pulumi.Input<string>;
    /**
     * Variable name
     */
    sptThresholdVariable?: pulumi.Input<string>;
}
