// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource can manage a System Global Feature.
 *   - Minimum SD-WAN Manager version: `20.12.0`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = new sdwan.SystemGlobalFeature("example", {
 *     name: "Example",
 *     description: "My Example",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 *     httpServer: false,
 *     httpsServer: false,
 *     ftpPassive: false,
 *     domainLookup: false,
 *     arpProxy: false,
 *     rshRcp: false,
 *     lineVty: false,
 *     cdp: true,
 *     lldp: true,
 *     sourceInterface: "GigabitEthernet0/0/1",
 *     tcpKeepalivesIn: true,
 *     tcpKeepalivesOut: true,
 *     tcpSmallServers: false,
 *     udpSmallServers: false,
 *     consoleLogging: true,
 *     ipSourceRouting: false,
 *     vtyLineLogging: false,
 *     snmpIfindexPersist: true,
 *     ignoreBootp: true,
 *     nat64UdpTimeout: 300,
 *     nat64TcpTimeout: 3600,
 *     httpAuthentication: "aaa",
 *     sshVersion: "2",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import sdwan:index/systemGlobalFeature:SystemGlobalFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd"
 * ```
 */
export class SystemGlobalFeature extends pulumi.CustomResource {
    /**
     * Get an existing SystemGlobalFeature resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SystemGlobalFeatureState, opts?: pulumi.CustomResourceOptions): SystemGlobalFeature {
        return new SystemGlobalFeature(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sdwan:index/systemGlobalFeature:SystemGlobalFeature';

    /**
     * Returns true if the given object is an instance of SystemGlobalFeature.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SystemGlobalFeature {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SystemGlobalFeature.__pulumiType;
    }

    /**
     * Set ARP Proxy - Default value: `false`
     */
    public readonly arpProxy!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly arpProxyVariable!: pulumi.Output<string | undefined>;
    /**
     * Configure CDP - Default value: `true`
     */
    public readonly cdp!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly cdpVariable!: pulumi.Output<string | undefined>;
    /**
     * Configure Console Logging - Default value: `true`
     */
    public readonly consoleLogging!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly consoleLoggingVariable!: pulumi.Output<string | undefined>;
    /**
     * The description of the Feature
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Configure Domain-Lookup - Default value: `false`
     */
    public readonly domainLookup!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly domainLookupVariable!: pulumi.Output<string | undefined>;
    /**
     * Feature Profile ID
     */
    public readonly featureProfileId!: pulumi.Output<string>;
    /**
     * Set Passive FTP - Default value: `false`
     */
    public readonly ftpPassive!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly ftpPassiveVariable!: pulumi.Output<string | undefined>;
    /**
     * Set preference for HTTP Authentication - Choices: `local`, `aaa`
     */
    public readonly httpAuthentication!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly httpAuthenticationVariable!: pulumi.Output<string | undefined>;
    /**
     * Set a HTTP Server - Default value: `false`
     */
    public readonly httpServer!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly httpServerVariable!: pulumi.Output<string | undefined>;
    /**
     * Set a HTTPS Server - Default value: `false`
     */
    public readonly httpsServer!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly httpsServerVariable!: pulumi.Output<string | undefined>;
    /**
     * Configure Ignore BOOTP - Default value: `true`
     */
    public readonly ignoreBootp!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly ignoreBootpVariable!: pulumi.Output<string | undefined>;
    /**
     * Set Source Route - Default value: `false`
     */
    public readonly ipSourceRouting!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly ipSourceRoutingVariable!: pulumi.Output<string | undefined>;
    /**
     * Configure Telnet (Outbound) - Default value: `false`
     */
    public readonly lineVty!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly lineVtyVariable!: pulumi.Output<string | undefined>;
    /**
     * Configure LLDP - Default value: `true`
     */
    public readonly lldp!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly lldpVariable!: pulumi.Output<string | undefined>;
    /**
     * The name of the Feature
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Set NAT64 TCP session timeout, in seconds - Range: `1`-`536870` - Default value: `3600`
     */
    public readonly nat64TcpTimeout!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly nat64TcpTimeoutVariable!: pulumi.Output<string | undefined>;
    /**
     * Set NAT64 UDP session timeout, in seconds - Range: `1`-`536870` - Default value: `300`
     */
    public readonly nat64UdpTimeout!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly nat64UdpTimeoutVariable!: pulumi.Output<string | undefined>;
    /**
     * Set RSH/RCP - Default value: `false`
     */
    public readonly rshRcp!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly rshRcpVariable!: pulumi.Output<string | undefined>;
    /**
     * Configure SNMP Ifindex Persist - Default value: `true`
     */
    public readonly snmpIfindexPersist!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly snmpIfindexPersistVariable!: pulumi.Output<string | undefined>;
    /**
     * Specify interface for source address in all HTTP(S) client connections
     */
    public readonly sourceInterface!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly sourceInterfaceVariable!: pulumi.Output<string | undefined>;
    /**
     * Set SSH version - Choices: `2`
     */
    public readonly sshVersion!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly sshVersionVariable!: pulumi.Output<string | undefined>;
    /**
     * Configure tcp-keepalives-in - Default value: `true`
     */
    public readonly tcpKeepalivesIn!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly tcpKeepalivesInVariable!: pulumi.Output<string | undefined>;
    /**
     * Configure tcp-keepalives-out - Default value: `true`
     */
    public readonly tcpKeepalivesOut!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly tcpKeepalivesOutVariable!: pulumi.Output<string | undefined>;
    /**
     * Configure tcp-small-servers - Default value: `false`
     */
    public readonly tcpSmallServers!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly tcpSmallServersVariable!: pulumi.Output<string | undefined>;
    /**
     * Configure udp-small-servers - Default value: `false`
     */
    public readonly udpSmallServers!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly udpSmallServersVariable!: pulumi.Output<string | undefined>;
    /**
     * The version of the Feature
     */
    public /*out*/ readonly version!: pulumi.Output<number>;
    /**
     * Configure VTY Line Logging - Default value: `false`
     */
    public readonly vtyLineLogging!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly vtyLineLoggingVariable!: pulumi.Output<string | undefined>;

    /**
     * Create a SystemGlobalFeature resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SystemGlobalFeatureArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SystemGlobalFeatureArgs | SystemGlobalFeatureState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SystemGlobalFeatureState | undefined;
            resourceInputs["arpProxy"] = state ? state.arpProxy : undefined;
            resourceInputs["arpProxyVariable"] = state ? state.arpProxyVariable : undefined;
            resourceInputs["cdp"] = state ? state.cdp : undefined;
            resourceInputs["cdpVariable"] = state ? state.cdpVariable : undefined;
            resourceInputs["consoleLogging"] = state ? state.consoleLogging : undefined;
            resourceInputs["consoleLoggingVariable"] = state ? state.consoleLoggingVariable : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["domainLookup"] = state ? state.domainLookup : undefined;
            resourceInputs["domainLookupVariable"] = state ? state.domainLookupVariable : undefined;
            resourceInputs["featureProfileId"] = state ? state.featureProfileId : undefined;
            resourceInputs["ftpPassive"] = state ? state.ftpPassive : undefined;
            resourceInputs["ftpPassiveVariable"] = state ? state.ftpPassiveVariable : undefined;
            resourceInputs["httpAuthentication"] = state ? state.httpAuthentication : undefined;
            resourceInputs["httpAuthenticationVariable"] = state ? state.httpAuthenticationVariable : undefined;
            resourceInputs["httpServer"] = state ? state.httpServer : undefined;
            resourceInputs["httpServerVariable"] = state ? state.httpServerVariable : undefined;
            resourceInputs["httpsServer"] = state ? state.httpsServer : undefined;
            resourceInputs["httpsServerVariable"] = state ? state.httpsServerVariable : undefined;
            resourceInputs["ignoreBootp"] = state ? state.ignoreBootp : undefined;
            resourceInputs["ignoreBootpVariable"] = state ? state.ignoreBootpVariable : undefined;
            resourceInputs["ipSourceRouting"] = state ? state.ipSourceRouting : undefined;
            resourceInputs["ipSourceRoutingVariable"] = state ? state.ipSourceRoutingVariable : undefined;
            resourceInputs["lineVty"] = state ? state.lineVty : undefined;
            resourceInputs["lineVtyVariable"] = state ? state.lineVtyVariable : undefined;
            resourceInputs["lldp"] = state ? state.lldp : undefined;
            resourceInputs["lldpVariable"] = state ? state.lldpVariable : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nat64TcpTimeout"] = state ? state.nat64TcpTimeout : undefined;
            resourceInputs["nat64TcpTimeoutVariable"] = state ? state.nat64TcpTimeoutVariable : undefined;
            resourceInputs["nat64UdpTimeout"] = state ? state.nat64UdpTimeout : undefined;
            resourceInputs["nat64UdpTimeoutVariable"] = state ? state.nat64UdpTimeoutVariable : undefined;
            resourceInputs["rshRcp"] = state ? state.rshRcp : undefined;
            resourceInputs["rshRcpVariable"] = state ? state.rshRcpVariable : undefined;
            resourceInputs["snmpIfindexPersist"] = state ? state.snmpIfindexPersist : undefined;
            resourceInputs["snmpIfindexPersistVariable"] = state ? state.snmpIfindexPersistVariable : undefined;
            resourceInputs["sourceInterface"] = state ? state.sourceInterface : undefined;
            resourceInputs["sourceInterfaceVariable"] = state ? state.sourceInterfaceVariable : undefined;
            resourceInputs["sshVersion"] = state ? state.sshVersion : undefined;
            resourceInputs["sshVersionVariable"] = state ? state.sshVersionVariable : undefined;
            resourceInputs["tcpKeepalivesIn"] = state ? state.tcpKeepalivesIn : undefined;
            resourceInputs["tcpKeepalivesInVariable"] = state ? state.tcpKeepalivesInVariable : undefined;
            resourceInputs["tcpKeepalivesOut"] = state ? state.tcpKeepalivesOut : undefined;
            resourceInputs["tcpKeepalivesOutVariable"] = state ? state.tcpKeepalivesOutVariable : undefined;
            resourceInputs["tcpSmallServers"] = state ? state.tcpSmallServers : undefined;
            resourceInputs["tcpSmallServersVariable"] = state ? state.tcpSmallServersVariable : undefined;
            resourceInputs["udpSmallServers"] = state ? state.udpSmallServers : undefined;
            resourceInputs["udpSmallServersVariable"] = state ? state.udpSmallServersVariable : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
            resourceInputs["vtyLineLogging"] = state ? state.vtyLineLogging : undefined;
            resourceInputs["vtyLineLoggingVariable"] = state ? state.vtyLineLoggingVariable : undefined;
        } else {
            const args = argsOrState as SystemGlobalFeatureArgs | undefined;
            if ((!args || args.featureProfileId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'featureProfileId'");
            }
            resourceInputs["arpProxy"] = args ? args.arpProxy : undefined;
            resourceInputs["arpProxyVariable"] = args ? args.arpProxyVariable : undefined;
            resourceInputs["cdp"] = args ? args.cdp : undefined;
            resourceInputs["cdpVariable"] = args ? args.cdpVariable : undefined;
            resourceInputs["consoleLogging"] = args ? args.consoleLogging : undefined;
            resourceInputs["consoleLoggingVariable"] = args ? args.consoleLoggingVariable : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["domainLookup"] = args ? args.domainLookup : undefined;
            resourceInputs["domainLookupVariable"] = args ? args.domainLookupVariable : undefined;
            resourceInputs["featureProfileId"] = args ? args.featureProfileId : undefined;
            resourceInputs["ftpPassive"] = args ? args.ftpPassive : undefined;
            resourceInputs["ftpPassiveVariable"] = args ? args.ftpPassiveVariable : undefined;
            resourceInputs["httpAuthentication"] = args ? args.httpAuthentication : undefined;
            resourceInputs["httpAuthenticationVariable"] = args ? args.httpAuthenticationVariable : undefined;
            resourceInputs["httpServer"] = args ? args.httpServer : undefined;
            resourceInputs["httpServerVariable"] = args ? args.httpServerVariable : undefined;
            resourceInputs["httpsServer"] = args ? args.httpsServer : undefined;
            resourceInputs["httpsServerVariable"] = args ? args.httpsServerVariable : undefined;
            resourceInputs["ignoreBootp"] = args ? args.ignoreBootp : undefined;
            resourceInputs["ignoreBootpVariable"] = args ? args.ignoreBootpVariable : undefined;
            resourceInputs["ipSourceRouting"] = args ? args.ipSourceRouting : undefined;
            resourceInputs["ipSourceRoutingVariable"] = args ? args.ipSourceRoutingVariable : undefined;
            resourceInputs["lineVty"] = args ? args.lineVty : undefined;
            resourceInputs["lineVtyVariable"] = args ? args.lineVtyVariable : undefined;
            resourceInputs["lldp"] = args ? args.lldp : undefined;
            resourceInputs["lldpVariable"] = args ? args.lldpVariable : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nat64TcpTimeout"] = args ? args.nat64TcpTimeout : undefined;
            resourceInputs["nat64TcpTimeoutVariable"] = args ? args.nat64TcpTimeoutVariable : undefined;
            resourceInputs["nat64UdpTimeout"] = args ? args.nat64UdpTimeout : undefined;
            resourceInputs["nat64UdpTimeoutVariable"] = args ? args.nat64UdpTimeoutVariable : undefined;
            resourceInputs["rshRcp"] = args ? args.rshRcp : undefined;
            resourceInputs["rshRcpVariable"] = args ? args.rshRcpVariable : undefined;
            resourceInputs["snmpIfindexPersist"] = args ? args.snmpIfindexPersist : undefined;
            resourceInputs["snmpIfindexPersistVariable"] = args ? args.snmpIfindexPersistVariable : undefined;
            resourceInputs["sourceInterface"] = args ? args.sourceInterface : undefined;
            resourceInputs["sourceInterfaceVariable"] = args ? args.sourceInterfaceVariable : undefined;
            resourceInputs["sshVersion"] = args ? args.sshVersion : undefined;
            resourceInputs["sshVersionVariable"] = args ? args.sshVersionVariable : undefined;
            resourceInputs["tcpKeepalivesIn"] = args ? args.tcpKeepalivesIn : undefined;
            resourceInputs["tcpKeepalivesInVariable"] = args ? args.tcpKeepalivesInVariable : undefined;
            resourceInputs["tcpKeepalivesOut"] = args ? args.tcpKeepalivesOut : undefined;
            resourceInputs["tcpKeepalivesOutVariable"] = args ? args.tcpKeepalivesOutVariable : undefined;
            resourceInputs["tcpSmallServers"] = args ? args.tcpSmallServers : undefined;
            resourceInputs["tcpSmallServersVariable"] = args ? args.tcpSmallServersVariable : undefined;
            resourceInputs["udpSmallServers"] = args ? args.udpSmallServers : undefined;
            resourceInputs["udpSmallServersVariable"] = args ? args.udpSmallServersVariable : undefined;
            resourceInputs["vtyLineLogging"] = args ? args.vtyLineLogging : undefined;
            resourceInputs["vtyLineLoggingVariable"] = args ? args.vtyLineLoggingVariable : undefined;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SystemGlobalFeature.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SystemGlobalFeature resources.
 */
export interface SystemGlobalFeatureState {
    /**
     * Set ARP Proxy - Default value: `false`
     */
    arpProxy?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    arpProxyVariable?: pulumi.Input<string>;
    /**
     * Configure CDP - Default value: `true`
     */
    cdp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    cdpVariable?: pulumi.Input<string>;
    /**
     * Configure Console Logging - Default value: `true`
     */
    consoleLogging?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    consoleLoggingVariable?: pulumi.Input<string>;
    /**
     * The description of the Feature
     */
    description?: pulumi.Input<string>;
    /**
     * Configure Domain-Lookup - Default value: `false`
     */
    domainLookup?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    domainLookupVariable?: pulumi.Input<string>;
    /**
     * Feature Profile ID
     */
    featureProfileId?: pulumi.Input<string>;
    /**
     * Set Passive FTP - Default value: `false`
     */
    ftpPassive?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    ftpPassiveVariable?: pulumi.Input<string>;
    /**
     * Set preference for HTTP Authentication - Choices: `local`, `aaa`
     */
    httpAuthentication?: pulumi.Input<string>;
    /**
     * Variable name
     */
    httpAuthenticationVariable?: pulumi.Input<string>;
    /**
     * Set a HTTP Server - Default value: `false`
     */
    httpServer?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    httpServerVariable?: pulumi.Input<string>;
    /**
     * Set a HTTPS Server - Default value: `false`
     */
    httpsServer?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    httpsServerVariable?: pulumi.Input<string>;
    /**
     * Configure Ignore BOOTP - Default value: `true`
     */
    ignoreBootp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    ignoreBootpVariable?: pulumi.Input<string>;
    /**
     * Set Source Route - Default value: `false`
     */
    ipSourceRouting?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    ipSourceRoutingVariable?: pulumi.Input<string>;
    /**
     * Configure Telnet (Outbound) - Default value: `false`
     */
    lineVty?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    lineVtyVariable?: pulumi.Input<string>;
    /**
     * Configure LLDP - Default value: `true`
     */
    lldp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    lldpVariable?: pulumi.Input<string>;
    /**
     * The name of the Feature
     */
    name?: pulumi.Input<string>;
    /**
     * Set NAT64 TCP session timeout, in seconds - Range: `1`-`536870` - Default value: `3600`
     */
    nat64TcpTimeout?: pulumi.Input<number>;
    /**
     * Variable name
     */
    nat64TcpTimeoutVariable?: pulumi.Input<string>;
    /**
     * Set NAT64 UDP session timeout, in seconds - Range: `1`-`536870` - Default value: `300`
     */
    nat64UdpTimeout?: pulumi.Input<number>;
    /**
     * Variable name
     */
    nat64UdpTimeoutVariable?: pulumi.Input<string>;
    /**
     * Set RSH/RCP - Default value: `false`
     */
    rshRcp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    rshRcpVariable?: pulumi.Input<string>;
    /**
     * Configure SNMP Ifindex Persist - Default value: `true`
     */
    snmpIfindexPersist?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    snmpIfindexPersistVariable?: pulumi.Input<string>;
    /**
     * Specify interface for source address in all HTTP(S) client connections
     */
    sourceInterface?: pulumi.Input<string>;
    /**
     * Variable name
     */
    sourceInterfaceVariable?: pulumi.Input<string>;
    /**
     * Set SSH version - Choices: `2`
     */
    sshVersion?: pulumi.Input<string>;
    /**
     * Variable name
     */
    sshVersionVariable?: pulumi.Input<string>;
    /**
     * Configure tcp-keepalives-in - Default value: `true`
     */
    tcpKeepalivesIn?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    tcpKeepalivesInVariable?: pulumi.Input<string>;
    /**
     * Configure tcp-keepalives-out - Default value: `true`
     */
    tcpKeepalivesOut?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    tcpKeepalivesOutVariable?: pulumi.Input<string>;
    /**
     * Configure tcp-small-servers - Default value: `false`
     */
    tcpSmallServers?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    tcpSmallServersVariable?: pulumi.Input<string>;
    /**
     * Configure udp-small-servers - Default value: `false`
     */
    udpSmallServers?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    udpSmallServersVariable?: pulumi.Input<string>;
    /**
     * The version of the Feature
     */
    version?: pulumi.Input<number>;
    /**
     * Configure VTY Line Logging - Default value: `false`
     */
    vtyLineLogging?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    vtyLineLoggingVariable?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SystemGlobalFeature resource.
 */
export interface SystemGlobalFeatureArgs {
    /**
     * Set ARP Proxy - Default value: `false`
     */
    arpProxy?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    arpProxyVariable?: pulumi.Input<string>;
    /**
     * Configure CDP - Default value: `true`
     */
    cdp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    cdpVariable?: pulumi.Input<string>;
    /**
     * Configure Console Logging - Default value: `true`
     */
    consoleLogging?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    consoleLoggingVariable?: pulumi.Input<string>;
    /**
     * The description of the Feature
     */
    description?: pulumi.Input<string>;
    /**
     * Configure Domain-Lookup - Default value: `false`
     */
    domainLookup?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    domainLookupVariable?: pulumi.Input<string>;
    /**
     * Feature Profile ID
     */
    featureProfileId: pulumi.Input<string>;
    /**
     * Set Passive FTP - Default value: `false`
     */
    ftpPassive?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    ftpPassiveVariable?: pulumi.Input<string>;
    /**
     * Set preference for HTTP Authentication - Choices: `local`, `aaa`
     */
    httpAuthentication?: pulumi.Input<string>;
    /**
     * Variable name
     */
    httpAuthenticationVariable?: pulumi.Input<string>;
    /**
     * Set a HTTP Server - Default value: `false`
     */
    httpServer?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    httpServerVariable?: pulumi.Input<string>;
    /**
     * Set a HTTPS Server - Default value: `false`
     */
    httpsServer?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    httpsServerVariable?: pulumi.Input<string>;
    /**
     * Configure Ignore BOOTP - Default value: `true`
     */
    ignoreBootp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    ignoreBootpVariable?: pulumi.Input<string>;
    /**
     * Set Source Route - Default value: `false`
     */
    ipSourceRouting?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    ipSourceRoutingVariable?: pulumi.Input<string>;
    /**
     * Configure Telnet (Outbound) - Default value: `false`
     */
    lineVty?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    lineVtyVariable?: pulumi.Input<string>;
    /**
     * Configure LLDP - Default value: `true`
     */
    lldp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    lldpVariable?: pulumi.Input<string>;
    /**
     * The name of the Feature
     */
    name?: pulumi.Input<string>;
    /**
     * Set NAT64 TCP session timeout, in seconds - Range: `1`-`536870` - Default value: `3600`
     */
    nat64TcpTimeout?: pulumi.Input<number>;
    /**
     * Variable name
     */
    nat64TcpTimeoutVariable?: pulumi.Input<string>;
    /**
     * Set NAT64 UDP session timeout, in seconds - Range: `1`-`536870` - Default value: `300`
     */
    nat64UdpTimeout?: pulumi.Input<number>;
    /**
     * Variable name
     */
    nat64UdpTimeoutVariable?: pulumi.Input<string>;
    /**
     * Set RSH/RCP - Default value: `false`
     */
    rshRcp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    rshRcpVariable?: pulumi.Input<string>;
    /**
     * Configure SNMP Ifindex Persist - Default value: `true`
     */
    snmpIfindexPersist?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    snmpIfindexPersistVariable?: pulumi.Input<string>;
    /**
     * Specify interface for source address in all HTTP(S) client connections
     */
    sourceInterface?: pulumi.Input<string>;
    /**
     * Variable name
     */
    sourceInterfaceVariable?: pulumi.Input<string>;
    /**
     * Set SSH version - Choices: `2`
     */
    sshVersion?: pulumi.Input<string>;
    /**
     * Variable name
     */
    sshVersionVariable?: pulumi.Input<string>;
    /**
     * Configure tcp-keepalives-in - Default value: `true`
     */
    tcpKeepalivesIn?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    tcpKeepalivesInVariable?: pulumi.Input<string>;
    /**
     * Configure tcp-keepalives-out - Default value: `true`
     */
    tcpKeepalivesOut?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    tcpKeepalivesOutVariable?: pulumi.Input<string>;
    /**
     * Configure tcp-small-servers - Default value: `false`
     */
    tcpSmallServers?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    tcpSmallServersVariable?: pulumi.Input<string>;
    /**
     * Configure udp-small-servers - Default value: `false`
     */
    udpSmallServers?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    udpSmallServersVariable?: pulumi.Input<string>;
    /**
     * Configure VTY Line Logging - Default value: `false`
     */
    vtyLineLogging?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    vtyLineLoggingVariable?: pulumi.Input<string>;
}