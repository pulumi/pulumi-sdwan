// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource can manage a System Remote Access Feature.
 *   - Minimum SD-WAN Manager version: `20.12.0`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = new sdwan.SystemRemoteAccessFeature("example", {
 *     name: "Example",
 *     description: "My Example",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 *     connectionTypeSsl: false,
 *     anyConnectEapAuthenticationType: "user",
 *     ipv4PoolSize: 50,
 *     ipv6PoolSize: 1024,
 *     enableCertificateListCheck: false,
 *     pskAuthenticationType: "aaa",
 *     radiusGroupName: "radius-1",
 *     aaaDeriveNameFromPeerIdentity: "MyPassword",
 *     aaaEnableAccounting: false,
 *     ikev2LocalIkeIdentityType: "EMAIL",
 *     ikev2LocalIkeIdentityValue: "abc@xyz.com",
 *     ikev2SecurityAssociationLifetime: 86400,
 *     ikev2AntiDosThreshold: 99,
 *     ipsecEnableAntiReplay: false,
 *     ipsecSecurityAssociationLifetime: 3600,
 *     ipsecEnablePerfectFowardSecrecy: false,
 * });
 * ```
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * Expected import identifier with the format: "system_remote_access_feature_id,feature_profile_id"
 *
 * ```sh
 * $ pulumi import sdwan:index/systemRemoteAccessFeature:SystemRemoteAccessFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"
 * ```
 */
export class SystemRemoteAccessFeature extends pulumi.CustomResource {
    /**
     * Get an existing SystemRemoteAccessFeature resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SystemRemoteAccessFeatureState, opts?: pulumi.CustomResourceOptions): SystemRemoteAccessFeature {
        return new SystemRemoteAccessFeature(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sdwan:index/systemRemoteAccessFeature:SystemRemoteAccessFeature';

    /**
     * Returns true if the given object is an instance of SystemRemoteAccessFeature.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SystemRemoteAccessFeature {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SystemRemoteAccessFeature.__pulumiType;
    }

    /**
     * , Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    public readonly aaaDeriveNameFromPeerDomain!: pulumi.Output<string | undefined>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    public readonly aaaDeriveNameFromPeerDomainVariable!: pulumi.Output<string | undefined>;
    /**
     * , Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    public readonly aaaDeriveNameFromPeerIdentity!: pulumi.Output<string | undefined>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    public readonly aaaDeriveNameFromPeerIdentityVariable!: pulumi.Output<string | undefined>;
    /**
     * Enable Accounting - Default value: `true`
     */
    public readonly aaaEnableAccounting!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly aaaEnableAccountingVariable!: pulumi.Output<string | undefined>;
    public readonly aaaSpecifyNamePolicyName!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly aaaSpecifyNamePolicyNameVariable!: pulumi.Output<string | undefined>;
    public readonly aaaSpecifyNamePolicyPassword!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly aaaSpecifyNamePolicyPasswordVariable!: pulumi.Output<string | undefined>;
    /**
     * , Attribute conditional on `connectionTypeSsl` being equal to `false` - Choices: `user`, `device`
     */
    public readonly anyConnectEapAuthenticationType!: pulumi.Output<string | undefined>;
    /**
     * Enabled SSL VPN - Default value: `false`
     */
    public readonly connectionTypeSsl!: pulumi.Output<boolean | undefined>;
    /**
     * The description of the Feature
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * - Default value: `false`
     */
    public readonly enableCertificateListCheck!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly enableCertificateListCheckVariable!: pulumi.Output<string | undefined>;
    /**
     * Feature Profile ID
     */
    public readonly featureProfileId!: pulumi.Output<string>;
    /**
     * Anti-DOS Threshold, Attribute conditional on `connectionTypeSsl` being equal to `false` - Range: `10`-`1000` - Default
     * value: `100`
     */
    public readonly ikev2AntiDosThreshold!: pulumi.Output<number | undefined>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    public readonly ikev2AntiDosThresholdVariable!: pulumi.Output<string | undefined>;
    /**
     * , Attribute conditional on `connectionTypeSsl` being equal to `false` - Choices: `EMAIL`, `FQDN`, `KEYID`, `IPv4
     * ADDRESS`, `IPv6 ADDRESS`
     */
    public readonly ikev2LocalIkeIdentityType!: pulumi.Output<string | undefined>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    public readonly ikev2LocalIkeIdentityTypeVariable!: pulumi.Output<string | undefined>;
    /**
     * , Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    public readonly ikev2LocalIkeIdentityValue!: pulumi.Output<string | undefined>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    public readonly ikev2LocalIkeIdentityValueVariable!: pulumi.Output<string | undefined>;
    /**
     * Security Association Lifetime in Seconds, Attribute conditional on `connectionTypeSsl` being equal to `false` - Range:
     * `3600`-`86400` - Default value: `86400`
     */
    public readonly ikev2SecurityAssociationLifetime!: pulumi.Output<number | undefined>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    public readonly ikev2SecurityAssociationLifetimeVariable!: pulumi.Output<string | undefined>;
    /**
     * security Association Lifetime, Attribute conditional on `ipsecEnableAntiReplay` being equal to `true` - Default value:
     * `64`
     */
    public readonly ipsecAntiReplayWindowSize!: pulumi.Output<number | undefined>;
    /**
     * Variable name, Attribute conditional on `ipsecEnableAntiReplay` being equal to `true`
     */
    public readonly ipsecAntiReplayWindowSizeVariable!: pulumi.Output<string | undefined>;
    /**
     * Enable Anti-Replay, Attribute conditional on `connectionTypeSsl` being equal to `false` - Default value: `true`
     */
    public readonly ipsecEnableAntiReplay!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    public readonly ipsecEnableAntiReplayVariable!: pulumi.Output<string | undefined>;
    /**
     * security Association Lifetime, Attribute conditional on `connectionTypeSsl` being equal to `false` - Default value:
     * `false`
     */
    public readonly ipsecEnablePerfectFowardSecrecy!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    public readonly ipsecEnablePerfectFowardSecrecyVariable!: pulumi.Output<string | undefined>;
    /**
     * Security Association Lifetime in Seconds, Attribute conditional on `connectionTypeSsl` being equal to `false` - Range:
     * `3600`-`86400` - Default value: `3600`
     */
    public readonly ipsecSecurityAssociationLifetime!: pulumi.Output<number | undefined>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    public readonly ipsecSecurityAssociationLifetimeVariable!: pulumi.Output<string | undefined>;
    /**
     * IPv4 Pool Size - Default value: `1000`
     */
    public readonly ipv4PoolSize!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly ipv4PoolSizeVariable!: pulumi.Output<string | undefined>;
    /**
     * IPv6 Pool Size - Default value: `1024`
     */
    public readonly ipv6PoolSize!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly ipv6PoolSizeVariable!: pulumi.Output<string | undefined>;
    /**
     * The name of the Feature
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * PSK Pre Shared Key, Attribute conditional on `pskAuthenticationType` being equal to `group`
     */
    public readonly pskAuthenticationPreSharedKey!: pulumi.Output<string | undefined>;
    /**
     * Variable name, Attribute conditional on `pskAuthenticationType` being equal to `group`
     */
    public readonly pskAuthenticationPreSharedKeyVariable!: pulumi.Output<string | undefined>;
    /**
     * PSK Selection, Attribute conditional on `connectionTypeSsl` being equal to `false` - Choices: `aaa`, `group`
     */
    public readonly pskAuthenticationType!: pulumi.Output<string | undefined>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    public readonly pskAuthenticationTypeVariable!: pulumi.Output<string | undefined>;
    public readonly radiusGroupName!: pulumi.Output<string>;
    /**
     * Variable name
     */
    public readonly radiusGroupNameVariable!: pulumi.Output<string | undefined>;
    /**
     * The version of the Feature
     */
    public /*out*/ readonly version!: pulumi.Output<number>;

    /**
     * Create a SystemRemoteAccessFeature resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SystemRemoteAccessFeatureArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SystemRemoteAccessFeatureArgs | SystemRemoteAccessFeatureState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SystemRemoteAccessFeatureState | undefined;
            resourceInputs["aaaDeriveNameFromPeerDomain"] = state ? state.aaaDeriveNameFromPeerDomain : undefined;
            resourceInputs["aaaDeriveNameFromPeerDomainVariable"] = state ? state.aaaDeriveNameFromPeerDomainVariable : undefined;
            resourceInputs["aaaDeriveNameFromPeerIdentity"] = state ? state.aaaDeriveNameFromPeerIdentity : undefined;
            resourceInputs["aaaDeriveNameFromPeerIdentityVariable"] = state ? state.aaaDeriveNameFromPeerIdentityVariable : undefined;
            resourceInputs["aaaEnableAccounting"] = state ? state.aaaEnableAccounting : undefined;
            resourceInputs["aaaEnableAccountingVariable"] = state ? state.aaaEnableAccountingVariable : undefined;
            resourceInputs["aaaSpecifyNamePolicyName"] = state ? state.aaaSpecifyNamePolicyName : undefined;
            resourceInputs["aaaSpecifyNamePolicyNameVariable"] = state ? state.aaaSpecifyNamePolicyNameVariable : undefined;
            resourceInputs["aaaSpecifyNamePolicyPassword"] = state ? state.aaaSpecifyNamePolicyPassword : undefined;
            resourceInputs["aaaSpecifyNamePolicyPasswordVariable"] = state ? state.aaaSpecifyNamePolicyPasswordVariable : undefined;
            resourceInputs["anyConnectEapAuthenticationType"] = state ? state.anyConnectEapAuthenticationType : undefined;
            resourceInputs["connectionTypeSsl"] = state ? state.connectionTypeSsl : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enableCertificateListCheck"] = state ? state.enableCertificateListCheck : undefined;
            resourceInputs["enableCertificateListCheckVariable"] = state ? state.enableCertificateListCheckVariable : undefined;
            resourceInputs["featureProfileId"] = state ? state.featureProfileId : undefined;
            resourceInputs["ikev2AntiDosThreshold"] = state ? state.ikev2AntiDosThreshold : undefined;
            resourceInputs["ikev2AntiDosThresholdVariable"] = state ? state.ikev2AntiDosThresholdVariable : undefined;
            resourceInputs["ikev2LocalIkeIdentityType"] = state ? state.ikev2LocalIkeIdentityType : undefined;
            resourceInputs["ikev2LocalIkeIdentityTypeVariable"] = state ? state.ikev2LocalIkeIdentityTypeVariable : undefined;
            resourceInputs["ikev2LocalIkeIdentityValue"] = state ? state.ikev2LocalIkeIdentityValue : undefined;
            resourceInputs["ikev2LocalIkeIdentityValueVariable"] = state ? state.ikev2LocalIkeIdentityValueVariable : undefined;
            resourceInputs["ikev2SecurityAssociationLifetime"] = state ? state.ikev2SecurityAssociationLifetime : undefined;
            resourceInputs["ikev2SecurityAssociationLifetimeVariable"] = state ? state.ikev2SecurityAssociationLifetimeVariable : undefined;
            resourceInputs["ipsecAntiReplayWindowSize"] = state ? state.ipsecAntiReplayWindowSize : undefined;
            resourceInputs["ipsecAntiReplayWindowSizeVariable"] = state ? state.ipsecAntiReplayWindowSizeVariable : undefined;
            resourceInputs["ipsecEnableAntiReplay"] = state ? state.ipsecEnableAntiReplay : undefined;
            resourceInputs["ipsecEnableAntiReplayVariable"] = state ? state.ipsecEnableAntiReplayVariable : undefined;
            resourceInputs["ipsecEnablePerfectFowardSecrecy"] = state ? state.ipsecEnablePerfectFowardSecrecy : undefined;
            resourceInputs["ipsecEnablePerfectFowardSecrecyVariable"] = state ? state.ipsecEnablePerfectFowardSecrecyVariable : undefined;
            resourceInputs["ipsecSecurityAssociationLifetime"] = state ? state.ipsecSecurityAssociationLifetime : undefined;
            resourceInputs["ipsecSecurityAssociationLifetimeVariable"] = state ? state.ipsecSecurityAssociationLifetimeVariable : undefined;
            resourceInputs["ipv4PoolSize"] = state ? state.ipv4PoolSize : undefined;
            resourceInputs["ipv4PoolSizeVariable"] = state ? state.ipv4PoolSizeVariable : undefined;
            resourceInputs["ipv6PoolSize"] = state ? state.ipv6PoolSize : undefined;
            resourceInputs["ipv6PoolSizeVariable"] = state ? state.ipv6PoolSizeVariable : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["pskAuthenticationPreSharedKey"] = state ? state.pskAuthenticationPreSharedKey : undefined;
            resourceInputs["pskAuthenticationPreSharedKeyVariable"] = state ? state.pskAuthenticationPreSharedKeyVariable : undefined;
            resourceInputs["pskAuthenticationType"] = state ? state.pskAuthenticationType : undefined;
            resourceInputs["pskAuthenticationTypeVariable"] = state ? state.pskAuthenticationTypeVariable : undefined;
            resourceInputs["radiusGroupName"] = state ? state.radiusGroupName : undefined;
            resourceInputs["radiusGroupNameVariable"] = state ? state.radiusGroupNameVariable : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as SystemRemoteAccessFeatureArgs | undefined;
            if ((!args || args.featureProfileId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'featureProfileId'");
            }
            if ((!args || args.radiusGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'radiusGroupName'");
            }
            resourceInputs["aaaDeriveNameFromPeerDomain"] = args ? args.aaaDeriveNameFromPeerDomain : undefined;
            resourceInputs["aaaDeriveNameFromPeerDomainVariable"] = args ? args.aaaDeriveNameFromPeerDomainVariable : undefined;
            resourceInputs["aaaDeriveNameFromPeerIdentity"] = args ? args.aaaDeriveNameFromPeerIdentity : undefined;
            resourceInputs["aaaDeriveNameFromPeerIdentityVariable"] = args ? args.aaaDeriveNameFromPeerIdentityVariable : undefined;
            resourceInputs["aaaEnableAccounting"] = args ? args.aaaEnableAccounting : undefined;
            resourceInputs["aaaEnableAccountingVariable"] = args ? args.aaaEnableAccountingVariable : undefined;
            resourceInputs["aaaSpecifyNamePolicyName"] = args ? args.aaaSpecifyNamePolicyName : undefined;
            resourceInputs["aaaSpecifyNamePolicyNameVariable"] = args ? args.aaaSpecifyNamePolicyNameVariable : undefined;
            resourceInputs["aaaSpecifyNamePolicyPassword"] = args ? args.aaaSpecifyNamePolicyPassword : undefined;
            resourceInputs["aaaSpecifyNamePolicyPasswordVariable"] = args ? args.aaaSpecifyNamePolicyPasswordVariable : undefined;
            resourceInputs["anyConnectEapAuthenticationType"] = args ? args.anyConnectEapAuthenticationType : undefined;
            resourceInputs["connectionTypeSsl"] = args ? args.connectionTypeSsl : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enableCertificateListCheck"] = args ? args.enableCertificateListCheck : undefined;
            resourceInputs["enableCertificateListCheckVariable"] = args ? args.enableCertificateListCheckVariable : undefined;
            resourceInputs["featureProfileId"] = args ? args.featureProfileId : undefined;
            resourceInputs["ikev2AntiDosThreshold"] = args ? args.ikev2AntiDosThreshold : undefined;
            resourceInputs["ikev2AntiDosThresholdVariable"] = args ? args.ikev2AntiDosThresholdVariable : undefined;
            resourceInputs["ikev2LocalIkeIdentityType"] = args ? args.ikev2LocalIkeIdentityType : undefined;
            resourceInputs["ikev2LocalIkeIdentityTypeVariable"] = args ? args.ikev2LocalIkeIdentityTypeVariable : undefined;
            resourceInputs["ikev2LocalIkeIdentityValue"] = args ? args.ikev2LocalIkeIdentityValue : undefined;
            resourceInputs["ikev2LocalIkeIdentityValueVariable"] = args ? args.ikev2LocalIkeIdentityValueVariable : undefined;
            resourceInputs["ikev2SecurityAssociationLifetime"] = args ? args.ikev2SecurityAssociationLifetime : undefined;
            resourceInputs["ikev2SecurityAssociationLifetimeVariable"] = args ? args.ikev2SecurityAssociationLifetimeVariable : undefined;
            resourceInputs["ipsecAntiReplayWindowSize"] = args ? args.ipsecAntiReplayWindowSize : undefined;
            resourceInputs["ipsecAntiReplayWindowSizeVariable"] = args ? args.ipsecAntiReplayWindowSizeVariable : undefined;
            resourceInputs["ipsecEnableAntiReplay"] = args ? args.ipsecEnableAntiReplay : undefined;
            resourceInputs["ipsecEnableAntiReplayVariable"] = args ? args.ipsecEnableAntiReplayVariable : undefined;
            resourceInputs["ipsecEnablePerfectFowardSecrecy"] = args ? args.ipsecEnablePerfectFowardSecrecy : undefined;
            resourceInputs["ipsecEnablePerfectFowardSecrecyVariable"] = args ? args.ipsecEnablePerfectFowardSecrecyVariable : undefined;
            resourceInputs["ipsecSecurityAssociationLifetime"] = args ? args.ipsecSecurityAssociationLifetime : undefined;
            resourceInputs["ipsecSecurityAssociationLifetimeVariable"] = args ? args.ipsecSecurityAssociationLifetimeVariable : undefined;
            resourceInputs["ipv4PoolSize"] = args ? args.ipv4PoolSize : undefined;
            resourceInputs["ipv4PoolSizeVariable"] = args ? args.ipv4PoolSizeVariable : undefined;
            resourceInputs["ipv6PoolSize"] = args ? args.ipv6PoolSize : undefined;
            resourceInputs["ipv6PoolSizeVariable"] = args ? args.ipv6PoolSizeVariable : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["pskAuthenticationPreSharedKey"] = args ? args.pskAuthenticationPreSharedKey : undefined;
            resourceInputs["pskAuthenticationPreSharedKeyVariable"] = args ? args.pskAuthenticationPreSharedKeyVariable : undefined;
            resourceInputs["pskAuthenticationType"] = args ? args.pskAuthenticationType : undefined;
            resourceInputs["pskAuthenticationTypeVariable"] = args ? args.pskAuthenticationTypeVariable : undefined;
            resourceInputs["radiusGroupName"] = args ? args.radiusGroupName : undefined;
            resourceInputs["radiusGroupNameVariable"] = args ? args.radiusGroupNameVariable : undefined;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SystemRemoteAccessFeature.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SystemRemoteAccessFeature resources.
 */
export interface SystemRemoteAccessFeatureState {
    /**
     * , Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    aaaDeriveNameFromPeerDomain?: pulumi.Input<string>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    aaaDeriveNameFromPeerDomainVariable?: pulumi.Input<string>;
    /**
     * , Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    aaaDeriveNameFromPeerIdentity?: pulumi.Input<string>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    aaaDeriveNameFromPeerIdentityVariable?: pulumi.Input<string>;
    /**
     * Enable Accounting - Default value: `true`
     */
    aaaEnableAccounting?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    aaaEnableAccountingVariable?: pulumi.Input<string>;
    aaaSpecifyNamePolicyName?: pulumi.Input<string>;
    /**
     * Variable name
     */
    aaaSpecifyNamePolicyNameVariable?: pulumi.Input<string>;
    aaaSpecifyNamePolicyPassword?: pulumi.Input<string>;
    /**
     * Variable name
     */
    aaaSpecifyNamePolicyPasswordVariable?: pulumi.Input<string>;
    /**
     * , Attribute conditional on `connectionTypeSsl` being equal to `false` - Choices: `user`, `device`
     */
    anyConnectEapAuthenticationType?: pulumi.Input<string>;
    /**
     * Enabled SSL VPN - Default value: `false`
     */
    connectionTypeSsl?: pulumi.Input<boolean>;
    /**
     * The description of the Feature
     */
    description?: pulumi.Input<string>;
    /**
     * - Default value: `false`
     */
    enableCertificateListCheck?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    enableCertificateListCheckVariable?: pulumi.Input<string>;
    /**
     * Feature Profile ID
     */
    featureProfileId?: pulumi.Input<string>;
    /**
     * Anti-DOS Threshold, Attribute conditional on `connectionTypeSsl` being equal to `false` - Range: `10`-`1000` - Default
     * value: `100`
     */
    ikev2AntiDosThreshold?: pulumi.Input<number>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    ikev2AntiDosThresholdVariable?: pulumi.Input<string>;
    /**
     * , Attribute conditional on `connectionTypeSsl` being equal to `false` - Choices: `EMAIL`, `FQDN`, `KEYID`, `IPv4
     * ADDRESS`, `IPv6 ADDRESS`
     */
    ikev2LocalIkeIdentityType?: pulumi.Input<string>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    ikev2LocalIkeIdentityTypeVariable?: pulumi.Input<string>;
    /**
     * , Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    ikev2LocalIkeIdentityValue?: pulumi.Input<string>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    ikev2LocalIkeIdentityValueVariable?: pulumi.Input<string>;
    /**
     * Security Association Lifetime in Seconds, Attribute conditional on `connectionTypeSsl` being equal to `false` - Range:
     * `3600`-`86400` - Default value: `86400`
     */
    ikev2SecurityAssociationLifetime?: pulumi.Input<number>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    ikev2SecurityAssociationLifetimeVariable?: pulumi.Input<string>;
    /**
     * security Association Lifetime, Attribute conditional on `ipsecEnableAntiReplay` being equal to `true` - Default value:
     * `64`
     */
    ipsecAntiReplayWindowSize?: pulumi.Input<number>;
    /**
     * Variable name, Attribute conditional on `ipsecEnableAntiReplay` being equal to `true`
     */
    ipsecAntiReplayWindowSizeVariable?: pulumi.Input<string>;
    /**
     * Enable Anti-Replay, Attribute conditional on `connectionTypeSsl` being equal to `false` - Default value: `true`
     */
    ipsecEnableAntiReplay?: pulumi.Input<boolean>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    ipsecEnableAntiReplayVariable?: pulumi.Input<string>;
    /**
     * security Association Lifetime, Attribute conditional on `connectionTypeSsl` being equal to `false` - Default value:
     * `false`
     */
    ipsecEnablePerfectFowardSecrecy?: pulumi.Input<boolean>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    ipsecEnablePerfectFowardSecrecyVariable?: pulumi.Input<string>;
    /**
     * Security Association Lifetime in Seconds, Attribute conditional on `connectionTypeSsl` being equal to `false` - Range:
     * `3600`-`86400` - Default value: `3600`
     */
    ipsecSecurityAssociationLifetime?: pulumi.Input<number>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    ipsecSecurityAssociationLifetimeVariable?: pulumi.Input<string>;
    /**
     * IPv4 Pool Size - Default value: `1000`
     */
    ipv4PoolSize?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ipv4PoolSizeVariable?: pulumi.Input<string>;
    /**
     * IPv6 Pool Size - Default value: `1024`
     */
    ipv6PoolSize?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ipv6PoolSizeVariable?: pulumi.Input<string>;
    /**
     * The name of the Feature
     */
    name?: pulumi.Input<string>;
    /**
     * PSK Pre Shared Key, Attribute conditional on `pskAuthenticationType` being equal to `group`
     */
    pskAuthenticationPreSharedKey?: pulumi.Input<string>;
    /**
     * Variable name, Attribute conditional on `pskAuthenticationType` being equal to `group`
     */
    pskAuthenticationPreSharedKeyVariable?: pulumi.Input<string>;
    /**
     * PSK Selection, Attribute conditional on `connectionTypeSsl` being equal to `false` - Choices: `aaa`, `group`
     */
    pskAuthenticationType?: pulumi.Input<string>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    pskAuthenticationTypeVariable?: pulumi.Input<string>;
    radiusGroupName?: pulumi.Input<string>;
    /**
     * Variable name
     */
    radiusGroupNameVariable?: pulumi.Input<string>;
    /**
     * The version of the Feature
     */
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a SystemRemoteAccessFeature resource.
 */
export interface SystemRemoteAccessFeatureArgs {
    /**
     * , Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    aaaDeriveNameFromPeerDomain?: pulumi.Input<string>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    aaaDeriveNameFromPeerDomainVariable?: pulumi.Input<string>;
    /**
     * , Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    aaaDeriveNameFromPeerIdentity?: pulumi.Input<string>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    aaaDeriveNameFromPeerIdentityVariable?: pulumi.Input<string>;
    /**
     * Enable Accounting - Default value: `true`
     */
    aaaEnableAccounting?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    aaaEnableAccountingVariable?: pulumi.Input<string>;
    aaaSpecifyNamePolicyName?: pulumi.Input<string>;
    /**
     * Variable name
     */
    aaaSpecifyNamePolicyNameVariable?: pulumi.Input<string>;
    aaaSpecifyNamePolicyPassword?: pulumi.Input<string>;
    /**
     * Variable name
     */
    aaaSpecifyNamePolicyPasswordVariable?: pulumi.Input<string>;
    /**
     * , Attribute conditional on `connectionTypeSsl` being equal to `false` - Choices: `user`, `device`
     */
    anyConnectEapAuthenticationType?: pulumi.Input<string>;
    /**
     * Enabled SSL VPN - Default value: `false`
     */
    connectionTypeSsl?: pulumi.Input<boolean>;
    /**
     * The description of the Feature
     */
    description?: pulumi.Input<string>;
    /**
     * - Default value: `false`
     */
    enableCertificateListCheck?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    enableCertificateListCheckVariable?: pulumi.Input<string>;
    /**
     * Feature Profile ID
     */
    featureProfileId: pulumi.Input<string>;
    /**
     * Anti-DOS Threshold, Attribute conditional on `connectionTypeSsl` being equal to `false` - Range: `10`-`1000` - Default
     * value: `100`
     */
    ikev2AntiDosThreshold?: pulumi.Input<number>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    ikev2AntiDosThresholdVariable?: pulumi.Input<string>;
    /**
     * , Attribute conditional on `connectionTypeSsl` being equal to `false` - Choices: `EMAIL`, `FQDN`, `KEYID`, `IPv4
     * ADDRESS`, `IPv6 ADDRESS`
     */
    ikev2LocalIkeIdentityType?: pulumi.Input<string>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    ikev2LocalIkeIdentityTypeVariable?: pulumi.Input<string>;
    /**
     * , Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    ikev2LocalIkeIdentityValue?: pulumi.Input<string>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    ikev2LocalIkeIdentityValueVariable?: pulumi.Input<string>;
    /**
     * Security Association Lifetime in Seconds, Attribute conditional on `connectionTypeSsl` being equal to `false` - Range:
     * `3600`-`86400` - Default value: `86400`
     */
    ikev2SecurityAssociationLifetime?: pulumi.Input<number>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    ikev2SecurityAssociationLifetimeVariable?: pulumi.Input<string>;
    /**
     * security Association Lifetime, Attribute conditional on `ipsecEnableAntiReplay` being equal to `true` - Default value:
     * `64`
     */
    ipsecAntiReplayWindowSize?: pulumi.Input<number>;
    /**
     * Variable name, Attribute conditional on `ipsecEnableAntiReplay` being equal to `true`
     */
    ipsecAntiReplayWindowSizeVariable?: pulumi.Input<string>;
    /**
     * Enable Anti-Replay, Attribute conditional on `connectionTypeSsl` being equal to `false` - Default value: `true`
     */
    ipsecEnableAntiReplay?: pulumi.Input<boolean>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    ipsecEnableAntiReplayVariable?: pulumi.Input<string>;
    /**
     * security Association Lifetime, Attribute conditional on `connectionTypeSsl` being equal to `false` - Default value:
     * `false`
     */
    ipsecEnablePerfectFowardSecrecy?: pulumi.Input<boolean>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    ipsecEnablePerfectFowardSecrecyVariable?: pulumi.Input<string>;
    /**
     * Security Association Lifetime in Seconds, Attribute conditional on `connectionTypeSsl` being equal to `false` - Range:
     * `3600`-`86400` - Default value: `3600`
     */
    ipsecSecurityAssociationLifetime?: pulumi.Input<number>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    ipsecSecurityAssociationLifetimeVariable?: pulumi.Input<string>;
    /**
     * IPv4 Pool Size - Default value: `1000`
     */
    ipv4PoolSize?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ipv4PoolSizeVariable?: pulumi.Input<string>;
    /**
     * IPv6 Pool Size - Default value: `1024`
     */
    ipv6PoolSize?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ipv6PoolSizeVariable?: pulumi.Input<string>;
    /**
     * The name of the Feature
     */
    name?: pulumi.Input<string>;
    /**
     * PSK Pre Shared Key, Attribute conditional on `pskAuthenticationType` being equal to `group`
     */
    pskAuthenticationPreSharedKey?: pulumi.Input<string>;
    /**
     * Variable name, Attribute conditional on `pskAuthenticationType` being equal to `group`
     */
    pskAuthenticationPreSharedKeyVariable?: pulumi.Input<string>;
    /**
     * PSK Selection, Attribute conditional on `connectionTypeSsl` being equal to `false` - Choices: `aaa`, `group`
     */
    pskAuthenticationType?: pulumi.Input<string>;
    /**
     * Variable name, Attribute conditional on `connectionTypeSsl` being equal to `false`
     */
    pskAuthenticationTypeVariable?: pulumi.Input<string>;
    radiusGroupName: pulumi.Input<string>;
    /**
     * Variable name
     */
    radiusGroupNameVariable?: pulumi.Input<string>;
}
