// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the Cisco NTP feature template.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getCiscoNtpFeatureTemplate({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 * });
 * ```
 */
export function getCiscoNtpFeatureTemplate(args?: GetCiscoNtpFeatureTemplateArgs, opts?: pulumi.InvokeOptions): Promise<GetCiscoNtpFeatureTemplateResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("sdwan:index/getCiscoNtpFeatureTemplate:getCiscoNtpFeatureTemplate", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getCiscoNtpFeatureTemplate.
 */
export interface GetCiscoNtpFeatureTemplateArgs {
    /**
     * The id of the feature template
     */
    id?: string;
    /**
     * The name of the feature template
     */
    name?: string;
}

/**
 * A collection of values returned by getCiscoNtpFeatureTemplate.
 */
export interface GetCiscoNtpFeatureTemplateResult {
    /**
     * Set MD5 authentication key
     */
    readonly authenticationKeys: outputs.GetCiscoNtpFeatureTemplateAuthenticationKey[];
    /**
     * The description of the feature template
     */
    readonly description: string;
    /**
     * List of supported device types
     */
    readonly deviceTypes: string[];
    /**
     * The id of the feature template
     */
    readonly id: string;
    /**
     * Configure device as NTP master
     */
    readonly master: boolean;
    /**
     * Set interface for NTP Master
     */
    readonly masterSourceInterface: string;
    /**
     * Variable name
     */
    readonly masterSourceInterfaceVariable: string;
    /**
     * Master Stratum \n\n
     */
    readonly masterStratum: number;
    /**
     * Variable name
     */
    readonly masterStratumVariable: string;
    /**
     * Variable name
     */
    readonly masterVariable: string;
    /**
     * The name of the feature template
     */
    readonly name: string;
    /**
     * Configure NTP servers
     */
    readonly servers: outputs.GetCiscoNtpFeatureTemplateServer[];
    /**
     * The template type
     */
    readonly templateType: string;
    /**
     * Designate authentication key as trustworthy
     */
    readonly trustedKeys: number[];
    /**
     * Variable name
     */
    readonly trustedKeysVariable: string;
    /**
     * The version of the feature template
     */
    readonly version: number;
}
/**
 * This data source can read the Cisco NTP feature template.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getCiscoNtpFeatureTemplate({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 * });
 * ```
 */
export function getCiscoNtpFeatureTemplateOutput(args?: GetCiscoNtpFeatureTemplateOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCiscoNtpFeatureTemplateResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("sdwan:index/getCiscoNtpFeatureTemplate:getCiscoNtpFeatureTemplate", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getCiscoNtpFeatureTemplate.
 */
export interface GetCiscoNtpFeatureTemplateOutputArgs {
    /**
     * The id of the feature template
     */
    id?: pulumi.Input<string>;
    /**
     * The name of the feature template
     */
    name?: pulumi.Input<string>;
}
