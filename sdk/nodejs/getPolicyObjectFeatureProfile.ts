// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This data source can read the Policy Object Feature Profile .
 */
export function getPolicyObjectFeatureProfile(opts?: pulumi.InvokeOptions): Promise<GetPolicyObjectFeatureProfileResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("sdwan:index/getPolicyObjectFeatureProfile:getPolicyObjectFeatureProfile", {
    }, opts);
}

/**
 * A collection of values returned by getPolicyObjectFeatureProfile.
 */
export interface GetPolicyObjectFeatureProfileResult {
    /**
     * Description
     */
    readonly description: string;
    /**
     * The id of the object
     */
    readonly id: string;
    /**
     * The name of the policy object feature profile
     */
    readonly name: string;
}
/**
 * This data source can read the Policy Object Feature Profile .
 */
export function getPolicyObjectFeatureProfileOutput(opts?: pulumi.InvokeOptions): pulumi.Output<GetPolicyObjectFeatureProfileResult> {
    return pulumi.output(getPolicyObjectFeatureProfile(opts))
}