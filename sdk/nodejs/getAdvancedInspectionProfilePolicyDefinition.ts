// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This data source can read the Advanced Inspection Profile Policy Definition .
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getAdvancedInspectionProfilePolicyDefinition({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 * });
 * ```
 */
export function getAdvancedInspectionProfilePolicyDefinition(args: GetAdvancedInspectionProfilePolicyDefinitionArgs, opts?: pulumi.InvokeOptions): Promise<GetAdvancedInspectionProfilePolicyDefinitionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("sdwan:index/getAdvancedInspectionProfilePolicyDefinition:getAdvancedInspectionProfilePolicyDefinition", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getAdvancedInspectionProfilePolicyDefinition.
 */
export interface GetAdvancedInspectionProfilePolicyDefinitionArgs {
    /**
     * The id of the object
     */
    id: string;
}

/**
 * A collection of values returned by getAdvancedInspectionProfilePolicyDefinition.
 */
export interface GetAdvancedInspectionProfilePolicyDefinitionResult {
    /**
     * Advanced malware protection ID
     */
    readonly advancedMalwareProtectionId: string;
    /**
     * Advanced malware protection version
     */
    readonly advancedMalwareProtectionVersion: number;
    /**
     * The description of the policy definition.
     */
    readonly description: string;
    /**
     * The id of the object
     */
    readonly id: string;
    /**
     * Intrusion prevention ID (unified mode)
     */
    readonly intrusionPreventionId: string;
    /**
     * Intrusion prevention version
     */
    readonly intrusionPreventionVersion: number;
    /**
     * The name of the policy definition.
     */
    readonly name: string;
    /**
     * TLS Action
     */
    readonly tlsAction: string;
    /**
     * TLS/SSL decryption ID
     */
    readonly tlsSslDecryptionId: string;
    /**
     * TLS/SSL decryption version
     */
    readonly tlsSslDecryptionVersion: number;
    /**
     * URL filtering ID (unified mode)
     */
    readonly urlFilteringId: string;
    /**
     * URL filtering version
     */
    readonly urlFilteringVersion: number;
    /**
     * The version of the object
     */
    readonly version: number;
}
/**
 * This data source can read the Advanced Inspection Profile Policy Definition .
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getAdvancedInspectionProfilePolicyDefinition({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 * });
 * ```
 */
export function getAdvancedInspectionProfilePolicyDefinitionOutput(args: GetAdvancedInspectionProfilePolicyDefinitionOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAdvancedInspectionProfilePolicyDefinitionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("sdwan:index/getAdvancedInspectionProfilePolicyDefinition:getAdvancedInspectionProfilePolicyDefinition", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getAdvancedInspectionProfilePolicyDefinition.
 */
export interface GetAdvancedInspectionProfilePolicyDefinitionOutputArgs {
    /**
     * The id of the object
     */
    id: pulumi.Input<string>;
}
