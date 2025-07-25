// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource can manage a Cisco VPN Interface IPSec feature template.
 *   - Minimum SD-WAN Manager version: `15.0.0`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = new sdwan.CiscoVpnInterfaceIpsecFeatureTemplate("example", {
 *     name: "Example",
 *     description: "My Example",
 *     deviceTypes: ["vedge-C8000V"],
 *     interfaceName: "ipsec1",
 *     shutdown: false,
 *     interfaceDescription: "My Description",
 *     ipAddress: "1.1.1.1/24",
 *     tunnelSource: "1.2.3.4",
 *     tunnelSourceInterface: "e1",
 *     tunnelDestination: "3.4.5.6",
 *     application: "sig",
 *     tcpMssAdjust: 1400,
 *     clearDontFragment: true,
 *     mtu: 1500,
 *     deadPeerDetectionInterval: 100,
 *     deadPeerDetectionRetries: 4,
 *     ikeVersion: 2,
 *     ikeMode: "main",
 *     ikeRekeyInterval: 20000,
 *     ikeCiphersuite: "aes256-cbc-sha1",
 *     ikeGroup: "20",
 *     ikePreSharedKey: "cisco123",
 *     ikePreSharedKeyLocalId: "1",
 *     ikePreSharedKeyRemoteId: "2",
 *     ipsecRekeyInterval: 7200,
 *     ipsecReplayWindow: 128,
 *     ipsecCiphersuite: "aes256-cbc-sha256",
 *     ipsecPerfectForwardSecrecy: "group-20",
 *     trackers: ["TRACKER1"],
 *     tunnelRouteVia: "g0/0",
 * });
 * ```
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * ```sh
 * $ pulumi import sdwan:index/ciscoVpnInterfaceIpsecFeatureTemplate:CiscoVpnInterfaceIpsecFeatureTemplate example "f6b2c44c-693c-4763-b010-895aa3d236bd"
 * ```
 */
export class CiscoVpnInterfaceIpsecFeatureTemplate extends pulumi.CustomResource {
    /**
     * Get an existing CiscoVpnInterfaceIpsecFeatureTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CiscoVpnInterfaceIpsecFeatureTemplateState, opts?: pulumi.CustomResourceOptions): CiscoVpnInterfaceIpsecFeatureTemplate {
        return new CiscoVpnInterfaceIpsecFeatureTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sdwan:index/ciscoVpnInterfaceIpsecFeatureTemplate:CiscoVpnInterfaceIpsecFeatureTemplate';

    /**
     * Returns true if the given object is an instance of CiscoVpnInterfaceIpsecFeatureTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CiscoVpnInterfaceIpsecFeatureTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CiscoVpnInterfaceIpsecFeatureTemplate.__pulumiType;
    }

    /**
     * Enable Application Tunnel Type - Choices: `none`, `sig` - Default value: `none`
     */
    public readonly application!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly applicationVariable!: pulumi.Output<string | undefined>;
    /**
     * Enable clear dont fragment (Currently Only SDWAN Tunnel Interface) - Default value: `false`
     */
    public readonly clearDontFragment!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly clearDontFragmentVariable!: pulumi.Output<string | undefined>;
    /**
     * IKE keepalive interval (seconds) - Range: `10`-`3600` - Default value: `10`
     */
    public readonly deadPeerDetectionInterval!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly deadPeerDetectionIntervalVariable!: pulumi.Output<string | undefined>;
    /**
     * IKE keepalive retries - Range: `2`-`60` - Default value: `3`
     */
    public readonly deadPeerDetectionRetries!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly deadPeerDetectionRetriesVariable!: pulumi.Output<string | undefined>;
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
     * IKE identity the IKE preshared secret belongs to - Choices: `aes256-cbc-sha1`, `aes256-cbc-sha2`, `aes128-cbc-sha1`,
     * `aes128-cbc-sha2` - Default value: `aes256-cbc-sha1`
     */
    public readonly ikeCiphersuite!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly ikeCiphersuiteVariable!: pulumi.Output<string | undefined>;
    /**
     * IKE Diffie Hellman Groups - Choices: `2`, `14`, `15`, `16`, `19`, `20`, `21`, `24` - Default value: `16`
     */
    public readonly ikeGroup!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly ikeGroupVariable!: pulumi.Output<string | undefined>;
    /**
     * IKE integrity protocol - Choices: `main`, `aggressive` - Default value: `main`
     */
    public readonly ikeMode!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly ikeModeVariable!: pulumi.Output<string | undefined>;
    /**
     * Use preshared key to authenticate IKE peer
     */
    public readonly ikePreSharedKey!: pulumi.Output<string | undefined>;
    /**
     * IKE ID for the local endpoint. Input IPv4 address, domain name, or email address
     */
    public readonly ikePreSharedKeyLocalId!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly ikePreSharedKeyLocalIdVariable!: pulumi.Output<string | undefined>;
    /**
     * IKE ID for the remote endpoint. Input IPv4 address, domain name, or email address
     */
    public readonly ikePreSharedKeyRemoteId!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly ikePreSharedKeyRemoteIdVariable!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly ikePreSharedKeyVariable!: pulumi.Output<string | undefined>;
    /**
     * IKE rekey interval <60..86400> seconds - Range: `60`-`86400` - Default value: `14400`
     */
    public readonly ikeRekeyInterval!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly ikeRekeyIntervalVariable!: pulumi.Output<string | undefined>;
    /**
     * IKE Version <1..2> - Range: `1`-`2` - Default value: `1`
     */
    public readonly ikeVersion!: pulumi.Output<number | undefined>;
    /**
     * Interface description
     */
    public readonly interfaceDescription!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly interfaceDescriptionVariable!: pulumi.Output<string | undefined>;
    /**
     * Interface name: IPsec when present
     */
    public readonly interfaceName!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly interfaceNameVariable!: pulumi.Output<string | undefined>;
    /**
     * Assign IPv4 address
     */
    public readonly ipAddress!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly ipAddressVariable!: pulumi.Output<string | undefined>;
    /**
     * IPsec(ESP) encryption and integrity protocol - Choices: `aes256-cbc-sha1`, `aes256-cbc-sha384`, `aes256-cbc-sha256`,
     * `aes256-cbc-sha512`, `aes256-gcm`, `null-sha1`, `null-sha384`, `null-sha256`, `null-sha512` - Default value:
     * `aes256-gcm`
     */
    public readonly ipsecCiphersuite!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly ipsecCiphersuiteVariable!: pulumi.Output<string | undefined>;
    /**
     * IPsec perfect forward secrecy settings - Choices: `group-1`, `group-2`, `group-5`, `group-14`, `group-15`, `group-16`,
     * `group-19`, `group-20`, `group-21`, `group-24`, `none` - Default value: `group-16`
     */
    public readonly ipsecPerfectForwardSecrecy!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly ipsecPerfectForwardSecrecyVariable!: pulumi.Output<string | undefined>;
    /**
     * IPsec rekey interval <300..1209600> seconds - Range: `120`-`2592000` - Default value: `3600`
     */
    public readonly ipsecRekeyInterval!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly ipsecRekeyIntervalVariable!: pulumi.Output<string | undefined>;
    /**
     * Replay window size 32..8192 (must be a power of 2) - Range: `64`-`4096` - Default value: `512`
     */
    public readonly ipsecReplayWindow!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly ipsecReplayWindowVariable!: pulumi.Output<string | undefined>;
    /**
     * Interface MTU <68..9216>, in bytes - Range: `68`-`9216` - Default value: `1500`
     */
    public readonly mtu!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly mtuVariable!: pulumi.Output<string | undefined>;
    /**
     * The name of the feature template
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Administrative state - Default value: `true`
     */
    public readonly shutdown!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly shutdownVariable!: pulumi.Output<string | undefined>;
    /**
     * TCP MSS on SYN packets, in bytes - Range: `500`-`1460`
     */
    public readonly tcpMssAdjust!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly tcpMssAdjustVariable!: pulumi.Output<string | undefined>;
    /**
     * The template type
     */
    public /*out*/ readonly templateType!: pulumi.Output<string>;
    /**
     * Variable name
     */
    public readonly trackerVariable!: pulumi.Output<string | undefined>;
    /**
     * Enable tracker for this interface
     */
    public readonly trackers!: pulumi.Output<string[] | undefined>;
    /**
     * Tunnel destination IP address
     */
    public readonly tunnelDestination!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly tunnelDestinationVariable!: pulumi.Output<string | undefined>;
    /**
     * <1..32 characters> Interface name: ge0/<0-..> or ge0/<0-..>.vlanid
     */
    public readonly tunnelRouteVia!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly tunnelRouteViaVariable!: pulumi.Output<string | undefined>;
    /**
     * Tunnel source IP Address
     */
    public readonly tunnelSource!: pulumi.Output<string | undefined>;
    /**
     * <1..32 characters> Interface name: ge0/<0-..> or ge0/<0-..>.vlanid
     */
    public readonly tunnelSourceInterface!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly tunnelSourceInterfaceVariable!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly tunnelSourceVariable!: pulumi.Output<string | undefined>;
    /**
     * The version of the feature template
     */
    public /*out*/ readonly version!: pulumi.Output<number>;

    /**
     * Create a CiscoVpnInterfaceIpsecFeatureTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CiscoVpnInterfaceIpsecFeatureTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CiscoVpnInterfaceIpsecFeatureTemplateArgs | CiscoVpnInterfaceIpsecFeatureTemplateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CiscoVpnInterfaceIpsecFeatureTemplateState | undefined;
            resourceInputs["application"] = state ? state.application : undefined;
            resourceInputs["applicationVariable"] = state ? state.applicationVariable : undefined;
            resourceInputs["clearDontFragment"] = state ? state.clearDontFragment : undefined;
            resourceInputs["clearDontFragmentVariable"] = state ? state.clearDontFragmentVariable : undefined;
            resourceInputs["deadPeerDetectionInterval"] = state ? state.deadPeerDetectionInterval : undefined;
            resourceInputs["deadPeerDetectionIntervalVariable"] = state ? state.deadPeerDetectionIntervalVariable : undefined;
            resourceInputs["deadPeerDetectionRetries"] = state ? state.deadPeerDetectionRetries : undefined;
            resourceInputs["deadPeerDetectionRetriesVariable"] = state ? state.deadPeerDetectionRetriesVariable : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["deviceTypes"] = state ? state.deviceTypes : undefined;
            resourceInputs["ikeCiphersuite"] = state ? state.ikeCiphersuite : undefined;
            resourceInputs["ikeCiphersuiteVariable"] = state ? state.ikeCiphersuiteVariable : undefined;
            resourceInputs["ikeGroup"] = state ? state.ikeGroup : undefined;
            resourceInputs["ikeGroupVariable"] = state ? state.ikeGroupVariable : undefined;
            resourceInputs["ikeMode"] = state ? state.ikeMode : undefined;
            resourceInputs["ikeModeVariable"] = state ? state.ikeModeVariable : undefined;
            resourceInputs["ikePreSharedKey"] = state ? state.ikePreSharedKey : undefined;
            resourceInputs["ikePreSharedKeyLocalId"] = state ? state.ikePreSharedKeyLocalId : undefined;
            resourceInputs["ikePreSharedKeyLocalIdVariable"] = state ? state.ikePreSharedKeyLocalIdVariable : undefined;
            resourceInputs["ikePreSharedKeyRemoteId"] = state ? state.ikePreSharedKeyRemoteId : undefined;
            resourceInputs["ikePreSharedKeyRemoteIdVariable"] = state ? state.ikePreSharedKeyRemoteIdVariable : undefined;
            resourceInputs["ikePreSharedKeyVariable"] = state ? state.ikePreSharedKeyVariable : undefined;
            resourceInputs["ikeRekeyInterval"] = state ? state.ikeRekeyInterval : undefined;
            resourceInputs["ikeRekeyIntervalVariable"] = state ? state.ikeRekeyIntervalVariable : undefined;
            resourceInputs["ikeVersion"] = state ? state.ikeVersion : undefined;
            resourceInputs["interfaceDescription"] = state ? state.interfaceDescription : undefined;
            resourceInputs["interfaceDescriptionVariable"] = state ? state.interfaceDescriptionVariable : undefined;
            resourceInputs["interfaceName"] = state ? state.interfaceName : undefined;
            resourceInputs["interfaceNameVariable"] = state ? state.interfaceNameVariable : undefined;
            resourceInputs["ipAddress"] = state ? state.ipAddress : undefined;
            resourceInputs["ipAddressVariable"] = state ? state.ipAddressVariable : undefined;
            resourceInputs["ipsecCiphersuite"] = state ? state.ipsecCiphersuite : undefined;
            resourceInputs["ipsecCiphersuiteVariable"] = state ? state.ipsecCiphersuiteVariable : undefined;
            resourceInputs["ipsecPerfectForwardSecrecy"] = state ? state.ipsecPerfectForwardSecrecy : undefined;
            resourceInputs["ipsecPerfectForwardSecrecyVariable"] = state ? state.ipsecPerfectForwardSecrecyVariable : undefined;
            resourceInputs["ipsecRekeyInterval"] = state ? state.ipsecRekeyInterval : undefined;
            resourceInputs["ipsecRekeyIntervalVariable"] = state ? state.ipsecRekeyIntervalVariable : undefined;
            resourceInputs["ipsecReplayWindow"] = state ? state.ipsecReplayWindow : undefined;
            resourceInputs["ipsecReplayWindowVariable"] = state ? state.ipsecReplayWindowVariable : undefined;
            resourceInputs["mtu"] = state ? state.mtu : undefined;
            resourceInputs["mtuVariable"] = state ? state.mtuVariable : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["shutdown"] = state ? state.shutdown : undefined;
            resourceInputs["shutdownVariable"] = state ? state.shutdownVariable : undefined;
            resourceInputs["tcpMssAdjust"] = state ? state.tcpMssAdjust : undefined;
            resourceInputs["tcpMssAdjustVariable"] = state ? state.tcpMssAdjustVariable : undefined;
            resourceInputs["templateType"] = state ? state.templateType : undefined;
            resourceInputs["trackerVariable"] = state ? state.trackerVariable : undefined;
            resourceInputs["trackers"] = state ? state.trackers : undefined;
            resourceInputs["tunnelDestination"] = state ? state.tunnelDestination : undefined;
            resourceInputs["tunnelDestinationVariable"] = state ? state.tunnelDestinationVariable : undefined;
            resourceInputs["tunnelRouteVia"] = state ? state.tunnelRouteVia : undefined;
            resourceInputs["tunnelRouteViaVariable"] = state ? state.tunnelRouteViaVariable : undefined;
            resourceInputs["tunnelSource"] = state ? state.tunnelSource : undefined;
            resourceInputs["tunnelSourceInterface"] = state ? state.tunnelSourceInterface : undefined;
            resourceInputs["tunnelSourceInterfaceVariable"] = state ? state.tunnelSourceInterfaceVariable : undefined;
            resourceInputs["tunnelSourceVariable"] = state ? state.tunnelSourceVariable : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as CiscoVpnInterfaceIpsecFeatureTemplateArgs | undefined;
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.deviceTypes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deviceTypes'");
            }
            resourceInputs["application"] = args ? args.application : undefined;
            resourceInputs["applicationVariable"] = args ? args.applicationVariable : undefined;
            resourceInputs["clearDontFragment"] = args ? args.clearDontFragment : undefined;
            resourceInputs["clearDontFragmentVariable"] = args ? args.clearDontFragmentVariable : undefined;
            resourceInputs["deadPeerDetectionInterval"] = args ? args.deadPeerDetectionInterval : undefined;
            resourceInputs["deadPeerDetectionIntervalVariable"] = args ? args.deadPeerDetectionIntervalVariable : undefined;
            resourceInputs["deadPeerDetectionRetries"] = args ? args.deadPeerDetectionRetries : undefined;
            resourceInputs["deadPeerDetectionRetriesVariable"] = args ? args.deadPeerDetectionRetriesVariable : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["deviceTypes"] = args ? args.deviceTypes : undefined;
            resourceInputs["ikeCiphersuite"] = args ? args.ikeCiphersuite : undefined;
            resourceInputs["ikeCiphersuiteVariable"] = args ? args.ikeCiphersuiteVariable : undefined;
            resourceInputs["ikeGroup"] = args ? args.ikeGroup : undefined;
            resourceInputs["ikeGroupVariable"] = args ? args.ikeGroupVariable : undefined;
            resourceInputs["ikeMode"] = args ? args.ikeMode : undefined;
            resourceInputs["ikeModeVariable"] = args ? args.ikeModeVariable : undefined;
            resourceInputs["ikePreSharedKey"] = args ? args.ikePreSharedKey : undefined;
            resourceInputs["ikePreSharedKeyLocalId"] = args ? args.ikePreSharedKeyLocalId : undefined;
            resourceInputs["ikePreSharedKeyLocalIdVariable"] = args ? args.ikePreSharedKeyLocalIdVariable : undefined;
            resourceInputs["ikePreSharedKeyRemoteId"] = args ? args.ikePreSharedKeyRemoteId : undefined;
            resourceInputs["ikePreSharedKeyRemoteIdVariable"] = args ? args.ikePreSharedKeyRemoteIdVariable : undefined;
            resourceInputs["ikePreSharedKeyVariable"] = args ? args.ikePreSharedKeyVariable : undefined;
            resourceInputs["ikeRekeyInterval"] = args ? args.ikeRekeyInterval : undefined;
            resourceInputs["ikeRekeyIntervalVariable"] = args ? args.ikeRekeyIntervalVariable : undefined;
            resourceInputs["ikeVersion"] = args ? args.ikeVersion : undefined;
            resourceInputs["interfaceDescription"] = args ? args.interfaceDescription : undefined;
            resourceInputs["interfaceDescriptionVariable"] = args ? args.interfaceDescriptionVariable : undefined;
            resourceInputs["interfaceName"] = args ? args.interfaceName : undefined;
            resourceInputs["interfaceNameVariable"] = args ? args.interfaceNameVariable : undefined;
            resourceInputs["ipAddress"] = args ? args.ipAddress : undefined;
            resourceInputs["ipAddressVariable"] = args ? args.ipAddressVariable : undefined;
            resourceInputs["ipsecCiphersuite"] = args ? args.ipsecCiphersuite : undefined;
            resourceInputs["ipsecCiphersuiteVariable"] = args ? args.ipsecCiphersuiteVariable : undefined;
            resourceInputs["ipsecPerfectForwardSecrecy"] = args ? args.ipsecPerfectForwardSecrecy : undefined;
            resourceInputs["ipsecPerfectForwardSecrecyVariable"] = args ? args.ipsecPerfectForwardSecrecyVariable : undefined;
            resourceInputs["ipsecRekeyInterval"] = args ? args.ipsecRekeyInterval : undefined;
            resourceInputs["ipsecRekeyIntervalVariable"] = args ? args.ipsecRekeyIntervalVariable : undefined;
            resourceInputs["ipsecReplayWindow"] = args ? args.ipsecReplayWindow : undefined;
            resourceInputs["ipsecReplayWindowVariable"] = args ? args.ipsecReplayWindowVariable : undefined;
            resourceInputs["mtu"] = args ? args.mtu : undefined;
            resourceInputs["mtuVariable"] = args ? args.mtuVariable : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["shutdown"] = args ? args.shutdown : undefined;
            resourceInputs["shutdownVariable"] = args ? args.shutdownVariable : undefined;
            resourceInputs["tcpMssAdjust"] = args ? args.tcpMssAdjust : undefined;
            resourceInputs["tcpMssAdjustVariable"] = args ? args.tcpMssAdjustVariable : undefined;
            resourceInputs["trackerVariable"] = args ? args.trackerVariable : undefined;
            resourceInputs["trackers"] = args ? args.trackers : undefined;
            resourceInputs["tunnelDestination"] = args ? args.tunnelDestination : undefined;
            resourceInputs["tunnelDestinationVariable"] = args ? args.tunnelDestinationVariable : undefined;
            resourceInputs["tunnelRouteVia"] = args ? args.tunnelRouteVia : undefined;
            resourceInputs["tunnelRouteViaVariable"] = args ? args.tunnelRouteViaVariable : undefined;
            resourceInputs["tunnelSource"] = args ? args.tunnelSource : undefined;
            resourceInputs["tunnelSourceInterface"] = args ? args.tunnelSourceInterface : undefined;
            resourceInputs["tunnelSourceInterfaceVariable"] = args ? args.tunnelSourceInterfaceVariable : undefined;
            resourceInputs["tunnelSourceVariable"] = args ? args.tunnelSourceVariable : undefined;
            resourceInputs["templateType"] = undefined /*out*/;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CiscoVpnInterfaceIpsecFeatureTemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CiscoVpnInterfaceIpsecFeatureTemplate resources.
 */
export interface CiscoVpnInterfaceIpsecFeatureTemplateState {
    /**
     * Enable Application Tunnel Type - Choices: `none`, `sig` - Default value: `none`
     */
    application?: pulumi.Input<string>;
    /**
     * Variable name
     */
    applicationVariable?: pulumi.Input<string>;
    /**
     * Enable clear dont fragment (Currently Only SDWAN Tunnel Interface) - Default value: `false`
     */
    clearDontFragment?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    clearDontFragmentVariable?: pulumi.Input<string>;
    /**
     * IKE keepalive interval (seconds) - Range: `10`-`3600` - Default value: `10`
     */
    deadPeerDetectionInterval?: pulumi.Input<number>;
    /**
     * Variable name
     */
    deadPeerDetectionIntervalVariable?: pulumi.Input<string>;
    /**
     * IKE keepalive retries - Range: `2`-`60` - Default value: `3`
     */
    deadPeerDetectionRetries?: pulumi.Input<number>;
    /**
     * Variable name
     */
    deadPeerDetectionRetriesVariable?: pulumi.Input<string>;
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
     * IKE identity the IKE preshared secret belongs to - Choices: `aes256-cbc-sha1`, `aes256-cbc-sha2`, `aes128-cbc-sha1`,
     * `aes128-cbc-sha2` - Default value: `aes256-cbc-sha1`
     */
    ikeCiphersuite?: pulumi.Input<string>;
    /**
     * Variable name
     */
    ikeCiphersuiteVariable?: pulumi.Input<string>;
    /**
     * IKE Diffie Hellman Groups - Choices: `2`, `14`, `15`, `16`, `19`, `20`, `21`, `24` - Default value: `16`
     */
    ikeGroup?: pulumi.Input<string>;
    /**
     * Variable name
     */
    ikeGroupVariable?: pulumi.Input<string>;
    /**
     * IKE integrity protocol - Choices: `main`, `aggressive` - Default value: `main`
     */
    ikeMode?: pulumi.Input<string>;
    /**
     * Variable name
     */
    ikeModeVariable?: pulumi.Input<string>;
    /**
     * Use preshared key to authenticate IKE peer
     */
    ikePreSharedKey?: pulumi.Input<string>;
    /**
     * IKE ID for the local endpoint. Input IPv4 address, domain name, or email address
     */
    ikePreSharedKeyLocalId?: pulumi.Input<string>;
    /**
     * Variable name
     */
    ikePreSharedKeyLocalIdVariable?: pulumi.Input<string>;
    /**
     * IKE ID for the remote endpoint. Input IPv4 address, domain name, or email address
     */
    ikePreSharedKeyRemoteId?: pulumi.Input<string>;
    /**
     * Variable name
     */
    ikePreSharedKeyRemoteIdVariable?: pulumi.Input<string>;
    /**
     * Variable name
     */
    ikePreSharedKeyVariable?: pulumi.Input<string>;
    /**
     * IKE rekey interval <60..86400> seconds - Range: `60`-`86400` - Default value: `14400`
     */
    ikeRekeyInterval?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ikeRekeyIntervalVariable?: pulumi.Input<string>;
    /**
     * IKE Version <1..2> - Range: `1`-`2` - Default value: `1`
     */
    ikeVersion?: pulumi.Input<number>;
    /**
     * Interface description
     */
    interfaceDescription?: pulumi.Input<string>;
    /**
     * Variable name
     */
    interfaceDescriptionVariable?: pulumi.Input<string>;
    /**
     * Interface name: IPsec when present
     */
    interfaceName?: pulumi.Input<string>;
    /**
     * Variable name
     */
    interfaceNameVariable?: pulumi.Input<string>;
    /**
     * Assign IPv4 address
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * Variable name
     */
    ipAddressVariable?: pulumi.Input<string>;
    /**
     * IPsec(ESP) encryption and integrity protocol - Choices: `aes256-cbc-sha1`, `aes256-cbc-sha384`, `aes256-cbc-sha256`,
     * `aes256-cbc-sha512`, `aes256-gcm`, `null-sha1`, `null-sha384`, `null-sha256`, `null-sha512` - Default value:
     * `aes256-gcm`
     */
    ipsecCiphersuite?: pulumi.Input<string>;
    /**
     * Variable name
     */
    ipsecCiphersuiteVariable?: pulumi.Input<string>;
    /**
     * IPsec perfect forward secrecy settings - Choices: `group-1`, `group-2`, `group-5`, `group-14`, `group-15`, `group-16`,
     * `group-19`, `group-20`, `group-21`, `group-24`, `none` - Default value: `group-16`
     */
    ipsecPerfectForwardSecrecy?: pulumi.Input<string>;
    /**
     * Variable name
     */
    ipsecPerfectForwardSecrecyVariable?: pulumi.Input<string>;
    /**
     * IPsec rekey interval <300..1209600> seconds - Range: `120`-`2592000` - Default value: `3600`
     */
    ipsecRekeyInterval?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ipsecRekeyIntervalVariable?: pulumi.Input<string>;
    /**
     * Replay window size 32..8192 (must be a power of 2) - Range: `64`-`4096` - Default value: `512`
     */
    ipsecReplayWindow?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ipsecReplayWindowVariable?: pulumi.Input<string>;
    /**
     * Interface MTU <68..9216>, in bytes - Range: `68`-`9216` - Default value: `1500`
     */
    mtu?: pulumi.Input<number>;
    /**
     * Variable name
     */
    mtuVariable?: pulumi.Input<string>;
    /**
     * The name of the feature template
     */
    name?: pulumi.Input<string>;
    /**
     * Administrative state - Default value: `true`
     */
    shutdown?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    shutdownVariable?: pulumi.Input<string>;
    /**
     * TCP MSS on SYN packets, in bytes - Range: `500`-`1460`
     */
    tcpMssAdjust?: pulumi.Input<number>;
    /**
     * Variable name
     */
    tcpMssAdjustVariable?: pulumi.Input<string>;
    /**
     * The template type
     */
    templateType?: pulumi.Input<string>;
    /**
     * Variable name
     */
    trackerVariable?: pulumi.Input<string>;
    /**
     * Enable tracker for this interface
     */
    trackers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Tunnel destination IP address
     */
    tunnelDestination?: pulumi.Input<string>;
    /**
     * Variable name
     */
    tunnelDestinationVariable?: pulumi.Input<string>;
    /**
     * <1..32 characters> Interface name: ge0/<0-..> or ge0/<0-..>.vlanid
     */
    tunnelRouteVia?: pulumi.Input<string>;
    /**
     * Variable name
     */
    tunnelRouteViaVariable?: pulumi.Input<string>;
    /**
     * Tunnel source IP Address
     */
    tunnelSource?: pulumi.Input<string>;
    /**
     * <1..32 characters> Interface name: ge0/<0-..> or ge0/<0-..>.vlanid
     */
    tunnelSourceInterface?: pulumi.Input<string>;
    /**
     * Variable name
     */
    tunnelSourceInterfaceVariable?: pulumi.Input<string>;
    /**
     * Variable name
     */
    tunnelSourceVariable?: pulumi.Input<string>;
    /**
     * The version of the feature template
     */
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a CiscoVpnInterfaceIpsecFeatureTemplate resource.
 */
export interface CiscoVpnInterfaceIpsecFeatureTemplateArgs {
    /**
     * Enable Application Tunnel Type - Choices: `none`, `sig` - Default value: `none`
     */
    application?: pulumi.Input<string>;
    /**
     * Variable name
     */
    applicationVariable?: pulumi.Input<string>;
    /**
     * Enable clear dont fragment (Currently Only SDWAN Tunnel Interface) - Default value: `false`
     */
    clearDontFragment?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    clearDontFragmentVariable?: pulumi.Input<string>;
    /**
     * IKE keepalive interval (seconds) - Range: `10`-`3600` - Default value: `10`
     */
    deadPeerDetectionInterval?: pulumi.Input<number>;
    /**
     * Variable name
     */
    deadPeerDetectionIntervalVariable?: pulumi.Input<string>;
    /**
     * IKE keepalive retries - Range: `2`-`60` - Default value: `3`
     */
    deadPeerDetectionRetries?: pulumi.Input<number>;
    /**
     * Variable name
     */
    deadPeerDetectionRetriesVariable?: pulumi.Input<string>;
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
     * IKE identity the IKE preshared secret belongs to - Choices: `aes256-cbc-sha1`, `aes256-cbc-sha2`, `aes128-cbc-sha1`,
     * `aes128-cbc-sha2` - Default value: `aes256-cbc-sha1`
     */
    ikeCiphersuite?: pulumi.Input<string>;
    /**
     * Variable name
     */
    ikeCiphersuiteVariable?: pulumi.Input<string>;
    /**
     * IKE Diffie Hellman Groups - Choices: `2`, `14`, `15`, `16`, `19`, `20`, `21`, `24` - Default value: `16`
     */
    ikeGroup?: pulumi.Input<string>;
    /**
     * Variable name
     */
    ikeGroupVariable?: pulumi.Input<string>;
    /**
     * IKE integrity protocol - Choices: `main`, `aggressive` - Default value: `main`
     */
    ikeMode?: pulumi.Input<string>;
    /**
     * Variable name
     */
    ikeModeVariable?: pulumi.Input<string>;
    /**
     * Use preshared key to authenticate IKE peer
     */
    ikePreSharedKey?: pulumi.Input<string>;
    /**
     * IKE ID for the local endpoint. Input IPv4 address, domain name, or email address
     */
    ikePreSharedKeyLocalId?: pulumi.Input<string>;
    /**
     * Variable name
     */
    ikePreSharedKeyLocalIdVariable?: pulumi.Input<string>;
    /**
     * IKE ID for the remote endpoint. Input IPv4 address, domain name, or email address
     */
    ikePreSharedKeyRemoteId?: pulumi.Input<string>;
    /**
     * Variable name
     */
    ikePreSharedKeyRemoteIdVariable?: pulumi.Input<string>;
    /**
     * Variable name
     */
    ikePreSharedKeyVariable?: pulumi.Input<string>;
    /**
     * IKE rekey interval <60..86400> seconds - Range: `60`-`86400` - Default value: `14400`
     */
    ikeRekeyInterval?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ikeRekeyIntervalVariable?: pulumi.Input<string>;
    /**
     * IKE Version <1..2> - Range: `1`-`2` - Default value: `1`
     */
    ikeVersion?: pulumi.Input<number>;
    /**
     * Interface description
     */
    interfaceDescription?: pulumi.Input<string>;
    /**
     * Variable name
     */
    interfaceDescriptionVariable?: pulumi.Input<string>;
    /**
     * Interface name: IPsec when present
     */
    interfaceName?: pulumi.Input<string>;
    /**
     * Variable name
     */
    interfaceNameVariable?: pulumi.Input<string>;
    /**
     * Assign IPv4 address
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * Variable name
     */
    ipAddressVariable?: pulumi.Input<string>;
    /**
     * IPsec(ESP) encryption and integrity protocol - Choices: `aes256-cbc-sha1`, `aes256-cbc-sha384`, `aes256-cbc-sha256`,
     * `aes256-cbc-sha512`, `aes256-gcm`, `null-sha1`, `null-sha384`, `null-sha256`, `null-sha512` - Default value:
     * `aes256-gcm`
     */
    ipsecCiphersuite?: pulumi.Input<string>;
    /**
     * Variable name
     */
    ipsecCiphersuiteVariable?: pulumi.Input<string>;
    /**
     * IPsec perfect forward secrecy settings - Choices: `group-1`, `group-2`, `group-5`, `group-14`, `group-15`, `group-16`,
     * `group-19`, `group-20`, `group-21`, `group-24`, `none` - Default value: `group-16`
     */
    ipsecPerfectForwardSecrecy?: pulumi.Input<string>;
    /**
     * Variable name
     */
    ipsecPerfectForwardSecrecyVariable?: pulumi.Input<string>;
    /**
     * IPsec rekey interval <300..1209600> seconds - Range: `120`-`2592000` - Default value: `3600`
     */
    ipsecRekeyInterval?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ipsecRekeyIntervalVariable?: pulumi.Input<string>;
    /**
     * Replay window size 32..8192 (must be a power of 2) - Range: `64`-`4096` - Default value: `512`
     */
    ipsecReplayWindow?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ipsecReplayWindowVariable?: pulumi.Input<string>;
    /**
     * Interface MTU <68..9216>, in bytes - Range: `68`-`9216` - Default value: `1500`
     */
    mtu?: pulumi.Input<number>;
    /**
     * Variable name
     */
    mtuVariable?: pulumi.Input<string>;
    /**
     * The name of the feature template
     */
    name?: pulumi.Input<string>;
    /**
     * Administrative state - Default value: `true`
     */
    shutdown?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    shutdownVariable?: pulumi.Input<string>;
    /**
     * TCP MSS on SYN packets, in bytes - Range: `500`-`1460`
     */
    tcpMssAdjust?: pulumi.Input<number>;
    /**
     * Variable name
     */
    tcpMssAdjustVariable?: pulumi.Input<string>;
    /**
     * Variable name
     */
    trackerVariable?: pulumi.Input<string>;
    /**
     * Enable tracker for this interface
     */
    trackers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Tunnel destination IP address
     */
    tunnelDestination?: pulumi.Input<string>;
    /**
     * Variable name
     */
    tunnelDestinationVariable?: pulumi.Input<string>;
    /**
     * <1..32 characters> Interface name: ge0/<0-..> or ge0/<0-..>.vlanid
     */
    tunnelRouteVia?: pulumi.Input<string>;
    /**
     * Variable name
     */
    tunnelRouteViaVariable?: pulumi.Input<string>;
    /**
     * Tunnel source IP Address
     */
    tunnelSource?: pulumi.Input<string>;
    /**
     * <1..32 characters> Interface name: ge0/<0-..> or ge0/<0-..>.vlanid
     */
    tunnelSourceInterface?: pulumi.Input<string>;
    /**
     * Variable name
     */
    tunnelSourceInterfaceVariable?: pulumi.Input<string>;
    /**
     * Variable name
     */
    tunnelSourceVariable?: pulumi.Input<string>;
}
