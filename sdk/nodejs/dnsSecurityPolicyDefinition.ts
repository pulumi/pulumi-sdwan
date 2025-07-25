// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource can manage a DNS Security Policy Definition .
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = new sdwan.DnsSecurityPolicyDefinition("example", {
 *     name: "Example",
 *     description: "Example",
 *     domainListId: "84f10c9d-def7-45a3-8c64-6df26163c861",
 *     localDomainBypassEnabled: false,
 *     matchAllVpn: true,
 *     dnscrypt: true,
 *     umbrellaDnsDefault: true,
 *     ciscoSigCredentialsFeatureTemplateId: "3ac6eef9-bd8f-458d-96a7-a932c90b1e75",
 * });
 * ```
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * ```sh
 * $ pulumi import sdwan:index/dnsSecurityPolicyDefinition:DnsSecurityPolicyDefinition example "f6b2c44c-693c-4763-b010-895aa3d236bd"
 * ```
 */
export class DnsSecurityPolicyDefinition extends pulumi.CustomResource {
    /**
     * Get an existing DnsSecurityPolicyDefinition resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DnsSecurityPolicyDefinitionState, opts?: pulumi.CustomResourceOptions): DnsSecurityPolicyDefinition {
        return new DnsSecurityPolicyDefinition(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sdwan:index/dnsSecurityPolicyDefinition:DnsSecurityPolicyDefinition';

    /**
     * Returns true if the given object is an instance of DnsSecurityPolicyDefinition.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DnsSecurityPolicyDefinition {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DnsSecurityPolicyDefinition.__pulumiType;
    }

    /**
     * Credentials feature template ID
     */
    public readonly ciscoSigCredentialsFeatureTemplateId!: pulumi.Output<string>;
    /**
     * Credentials feature template version
     */
    public readonly ciscoSigCredentialsFeatureTemplateVersion!: pulumi.Output<number | undefined>;
    /**
     * Only relevant when `umbrellaDnsDefault` is `false`
     */
    public readonly customDnsServerIp!: pulumi.Output<string | undefined>;
    /**
     * The description of the policy definition.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Should DNSCrypt be enabled
     */
    public readonly dnscrypt!: pulumi.Output<boolean | undefined>;
    /**
     * Local domain bypass list ID
     */
    public readonly domainListId!: pulumi.Output<string | undefined>;
    /**
     * Local domain bypass list version
     */
    public readonly domainListVersion!: pulumi.Output<number | undefined>;
    /**
     * Should the local domain bypass list be enabled
     */
    public readonly localDomainBypassEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Should use match all VPN
     */
    public readonly matchAllVpn!: pulumi.Output<boolean>;
    /**
     * The name of the policy definition.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Only relevant when `matchAllVpn` is `false`
     */
    public readonly targetVpns!: pulumi.Output<outputs.DnsSecurityPolicyDefinitionTargetVpn[] | undefined>;
    /**
     * Should use umbrella as DNS Server
     */
    public readonly umbrellaDnsDefault!: pulumi.Output<boolean>;
    /**
     * The version of the object
     */
    public /*out*/ readonly version!: pulumi.Output<number>;

    /**
     * Create a DnsSecurityPolicyDefinition resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DnsSecurityPolicyDefinitionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DnsSecurityPolicyDefinitionArgs | DnsSecurityPolicyDefinitionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DnsSecurityPolicyDefinitionState | undefined;
            resourceInputs["ciscoSigCredentialsFeatureTemplateId"] = state ? state.ciscoSigCredentialsFeatureTemplateId : undefined;
            resourceInputs["ciscoSigCredentialsFeatureTemplateVersion"] = state ? state.ciscoSigCredentialsFeatureTemplateVersion : undefined;
            resourceInputs["customDnsServerIp"] = state ? state.customDnsServerIp : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["dnscrypt"] = state ? state.dnscrypt : undefined;
            resourceInputs["domainListId"] = state ? state.domainListId : undefined;
            resourceInputs["domainListVersion"] = state ? state.domainListVersion : undefined;
            resourceInputs["localDomainBypassEnabled"] = state ? state.localDomainBypassEnabled : undefined;
            resourceInputs["matchAllVpn"] = state ? state.matchAllVpn : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["targetVpns"] = state ? state.targetVpns : undefined;
            resourceInputs["umbrellaDnsDefault"] = state ? state.umbrellaDnsDefault : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as DnsSecurityPolicyDefinitionArgs | undefined;
            if ((!args || args.ciscoSigCredentialsFeatureTemplateId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ciscoSigCredentialsFeatureTemplateId'");
            }
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.matchAllVpn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'matchAllVpn'");
            }
            if ((!args || args.umbrellaDnsDefault === undefined) && !opts.urn) {
                throw new Error("Missing required property 'umbrellaDnsDefault'");
            }
            resourceInputs["ciscoSigCredentialsFeatureTemplateId"] = args ? args.ciscoSigCredentialsFeatureTemplateId : undefined;
            resourceInputs["ciscoSigCredentialsFeatureTemplateVersion"] = args ? args.ciscoSigCredentialsFeatureTemplateVersion : undefined;
            resourceInputs["customDnsServerIp"] = args ? args.customDnsServerIp : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["dnscrypt"] = args ? args.dnscrypt : undefined;
            resourceInputs["domainListId"] = args ? args.domainListId : undefined;
            resourceInputs["domainListVersion"] = args ? args.domainListVersion : undefined;
            resourceInputs["localDomainBypassEnabled"] = args ? args.localDomainBypassEnabled : undefined;
            resourceInputs["matchAllVpn"] = args ? args.matchAllVpn : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["targetVpns"] = args ? args.targetVpns : undefined;
            resourceInputs["umbrellaDnsDefault"] = args ? args.umbrellaDnsDefault : undefined;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DnsSecurityPolicyDefinition.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DnsSecurityPolicyDefinition resources.
 */
export interface DnsSecurityPolicyDefinitionState {
    /**
     * Credentials feature template ID
     */
    ciscoSigCredentialsFeatureTemplateId?: pulumi.Input<string>;
    /**
     * Credentials feature template version
     */
    ciscoSigCredentialsFeatureTemplateVersion?: pulumi.Input<number>;
    /**
     * Only relevant when `umbrellaDnsDefault` is `false`
     */
    customDnsServerIp?: pulumi.Input<string>;
    /**
     * The description of the policy definition.
     */
    description?: pulumi.Input<string>;
    /**
     * Should DNSCrypt be enabled
     */
    dnscrypt?: pulumi.Input<boolean>;
    /**
     * Local domain bypass list ID
     */
    domainListId?: pulumi.Input<string>;
    /**
     * Local domain bypass list version
     */
    domainListVersion?: pulumi.Input<number>;
    /**
     * Should the local domain bypass list be enabled
     */
    localDomainBypassEnabled?: pulumi.Input<boolean>;
    /**
     * Should use match all VPN
     */
    matchAllVpn?: pulumi.Input<boolean>;
    /**
     * The name of the policy definition.
     */
    name?: pulumi.Input<string>;
    /**
     * Only relevant when `matchAllVpn` is `false`
     */
    targetVpns?: pulumi.Input<pulumi.Input<inputs.DnsSecurityPolicyDefinitionTargetVpn>[]>;
    /**
     * Should use umbrella as DNS Server
     */
    umbrellaDnsDefault?: pulumi.Input<boolean>;
    /**
     * The version of the object
     */
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a DnsSecurityPolicyDefinition resource.
 */
export interface DnsSecurityPolicyDefinitionArgs {
    /**
     * Credentials feature template ID
     */
    ciscoSigCredentialsFeatureTemplateId: pulumi.Input<string>;
    /**
     * Credentials feature template version
     */
    ciscoSigCredentialsFeatureTemplateVersion?: pulumi.Input<number>;
    /**
     * Only relevant when `umbrellaDnsDefault` is `false`
     */
    customDnsServerIp?: pulumi.Input<string>;
    /**
     * The description of the policy definition.
     */
    description: pulumi.Input<string>;
    /**
     * Should DNSCrypt be enabled
     */
    dnscrypt?: pulumi.Input<boolean>;
    /**
     * Local domain bypass list ID
     */
    domainListId?: pulumi.Input<string>;
    /**
     * Local domain bypass list version
     */
    domainListVersion?: pulumi.Input<number>;
    /**
     * Should the local domain bypass list be enabled
     */
    localDomainBypassEnabled?: pulumi.Input<boolean>;
    /**
     * Should use match all VPN
     */
    matchAllVpn: pulumi.Input<boolean>;
    /**
     * The name of the policy definition.
     */
    name?: pulumi.Input<string>;
    /**
     * Only relevant when `matchAllVpn` is `false`
     */
    targetVpns?: pulumi.Input<pulumi.Input<inputs.DnsSecurityPolicyDefinitionTargetVpn>[]>;
    /**
     * Should use umbrella as DNS Server
     */
    umbrellaDnsDefault: pulumi.Input<boolean>;
}
