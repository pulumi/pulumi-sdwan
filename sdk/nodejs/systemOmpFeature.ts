// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource can manage a System OMP Feature.
 *   - Minimum SD-WAN Manager version: `20.12.0`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = new sdwan.SystemOmpFeature("example", {
 *     name: "Example",
 *     description: "My Example",
 *     featureProfileId: "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
 *     gracefulRestart: true,
 *     overlayAs: 10,
 *     pathsAdvertisedPerPrefix: 4,
 *     ecmpLimit: 4,
 *     shutdown: false,
 *     ompAdminDistanceIpv4: 10,
 *     ompAdminDistanceIpv6: 20,
 *     advertisementInterval: 1,
 *     gracefulRestartTimer: 43200,
 *     eorTimer: 300,
 *     holdtime: 60,
 *     advertiseIpv4Bgp: false,
 *     advertiseIpv4Ospf: false,
 *     advertiseIpv4OspfV3: false,
 *     advertiseIpv4Connected: false,
 *     advertiseIpv4Static: false,
 *     advertiseIpv4Eigrp: false,
 *     advertiseIpv4Lisp: false,
 *     advertiseIpv4Isis: false,
 *     advertiseIpv6Bgp: true,
 *     advertiseIpv6Ospf: true,
 *     advertiseIpv6Connected: true,
 *     advertiseIpv6Static: true,
 *     advertiseIpv6Eigrp: true,
 *     advertiseIpv6Lisp: true,
 *     advertiseIpv6Isis: true,
 *     ignoreRegionPathLength: false,
 *     transportGateway: "prefer",
 *     siteTypes: ["type-1"],
 * });
 * ```
 *
 * ## Import
 *
 * The `pulumi import` command can be used, for example:
 *
 * Expected import identifier with the format: "system_omp_feature_id,feature_profile_id"
 *
 * ```sh
 * $ pulumi import sdwan:index/systemOmpFeature:SystemOmpFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"
 * ```
 */
export class SystemOmpFeature extends pulumi.CustomResource {
    /**
     * Get an existing SystemOmpFeature resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SystemOmpFeatureState, opts?: pulumi.CustomResourceOptions): SystemOmpFeature {
        return new SystemOmpFeature(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sdwan:index/systemOmpFeature:SystemOmpFeature';

    /**
     * Returns true if the given object is an instance of SystemOmpFeature.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SystemOmpFeature {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SystemOmpFeature.__pulumiType;
    }

    /**
     * BGP - Default value: `false`
     */
    public readonly advertiseIpv4Bgp!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly advertiseIpv4BgpVariable!: pulumi.Output<string | undefined>;
    /**
     * Connected - Default value: `true`
     */
    public readonly advertiseIpv4Connected!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly advertiseIpv4ConnectedVariable!: pulumi.Output<string | undefined>;
    /**
     * EIGRP - Default value: `false`
     */
    public readonly advertiseIpv4Eigrp!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly advertiseIpv4EigrpVariable!: pulumi.Output<string | undefined>;
    /**
     * ISIS - Default value: `false`
     */
    public readonly advertiseIpv4Isis!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly advertiseIpv4IsisVariable!: pulumi.Output<string | undefined>;
    /**
     * LISP - Default value: `false`
     */
    public readonly advertiseIpv4Lisp!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly advertiseIpv4LispVariable!: pulumi.Output<string | undefined>;
    /**
     * OSPF - Default value: `false`
     */
    public readonly advertiseIpv4Ospf!: pulumi.Output<boolean | undefined>;
    /**
     * OSPFV3 - Default value: `false`
     */
    public readonly advertiseIpv4OspfV3!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly advertiseIpv4OspfV3Variable!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly advertiseIpv4OspfVariable!: pulumi.Output<string | undefined>;
    /**
     * Static - Default value: `true`
     */
    public readonly advertiseIpv4Static!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly advertiseIpv4StaticVariable!: pulumi.Output<string | undefined>;
    /**
     * BGP - Default value: `false`
     */
    public readonly advertiseIpv6Bgp!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly advertiseIpv6BgpVariable!: pulumi.Output<string | undefined>;
    /**
     * Connected - Default value: `false`
     */
    public readonly advertiseIpv6Connected!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly advertiseIpv6ConnectedVariable!: pulumi.Output<string | undefined>;
    /**
     * EIGRP - Default value: `false`
     */
    public readonly advertiseIpv6Eigrp!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly advertiseIpv6EigrpVariable!: pulumi.Output<string | undefined>;
    /**
     * ISIS - Default value: `false`
     */
    public readonly advertiseIpv6Isis!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly advertiseIpv6IsisVariable!: pulumi.Output<string | undefined>;
    /**
     * LISP - Default value: `false`
     */
    public readonly advertiseIpv6Lisp!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly advertiseIpv6LispVariable!: pulumi.Output<string | undefined>;
    /**
     * OSPF - Default value: `false`
     */
    public readonly advertiseIpv6Ospf!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly advertiseIpv6OspfVariable!: pulumi.Output<string | undefined>;
    /**
     * Static - Default value: `false`
     */
    public readonly advertiseIpv6Static!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly advertiseIpv6StaticVariable!: pulumi.Output<string | undefined>;
    /**
     * Advertisement Interval (seconds) - Range: `0`-`65535` - Default value: `1`
     */
    public readonly advertisementInterval!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly advertisementIntervalVariable!: pulumi.Output<string | undefined>;
    /**
     * The description of the Feature
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Set maximum number of OMP paths to install in cEdge route table - Range: `1`-`0` - Default value: `4`
     */
    public readonly ecmpLimit!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly ecmpLimitVariable!: pulumi.Output<string | undefined>;
    /**
     * EOR Timer - Range: `1`-`3600` - Default value: `300`
     */
    public readonly eorTimer!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly eorTimerVariable!: pulumi.Output<string | undefined>;
    /**
     * Feature Profile ID
     */
    public readonly featureProfileId!: pulumi.Output<string>;
    /**
     * Graceful Restart for OMP - Default value: `true`
     */
    public readonly gracefulRestart!: pulumi.Output<boolean | undefined>;
    /**
     * Graceful Restart Timer (seconds) - Range: `1`-`604800` - Default value: `43200`
     */
    public readonly gracefulRestartTimer!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly gracefulRestartTimerVariable!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly gracefulRestartVariable!: pulumi.Output<string | undefined>;
    /**
     * Hold Time (seconds) - Default value: `60`
     */
    public readonly holdtime!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly holdtimeVariable!: pulumi.Output<string | undefined>;
    /**
     * Treat hierarchical and direct (secondary region) paths equally - Default value: `false`
     */
    public readonly ignoreRegionPathLength!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly ignoreRegionPathLengthVariable!: pulumi.Output<string | undefined>;
    /**
     * The name of the Feature
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * OMP Admin Distance IPv4 - Range: `1`-`255` - Default value: `251`
     */
    public readonly ompAdminDistanceIpv4!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly ompAdminDistanceIpv4Variable!: pulumi.Output<string | undefined>;
    /**
     * OMP Admin Distance IPv6 - Range: `1`-`255` - Default value: `251`
     */
    public readonly ompAdminDistanceIpv6!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly ompAdminDistanceIpv6Variable!: pulumi.Output<string | undefined>;
    /**
     * Overlay AS Number - Range: `1`-`4294967295`
     */
    public readonly overlayAs!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly overlayAsVariable!: pulumi.Output<string | undefined>;
    /**
     * Number of Paths Advertised per Prefix - Range: `1`-`16` - Default value: `4`
     */
    public readonly pathsAdvertisedPerPrefix!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly pathsAdvertisedPerPrefixVariable!: pulumi.Output<string | undefined>;
    /**
     * Shutdown - Default value: `false`
     */
    public readonly shutdown!: pulumi.Output<boolean | undefined>;
    /**
     * Variable name
     */
    public readonly shutdownVariable!: pulumi.Output<string | undefined>;
    /**
     * Site Types
     */
    public readonly siteTypes!: pulumi.Output<string[] | undefined>;
    /**
     * Variable name
     */
    public readonly siteTypesVariable!: pulumi.Output<string | undefined>;
    /**
     * Transport Gateway Path Behavior - Choices: `prefer`, `ecmp-with-direct-path`
     */
    public readonly transportGateway!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly transportGatewayVariable!: pulumi.Output<string | undefined>;
    /**
     * The version of the Feature
     */
    public /*out*/ readonly version!: pulumi.Output<number>;

    /**
     * Create a SystemOmpFeature resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SystemOmpFeatureArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SystemOmpFeatureArgs | SystemOmpFeatureState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SystemOmpFeatureState | undefined;
            resourceInputs["advertiseIpv4Bgp"] = state ? state.advertiseIpv4Bgp : undefined;
            resourceInputs["advertiseIpv4BgpVariable"] = state ? state.advertiseIpv4BgpVariable : undefined;
            resourceInputs["advertiseIpv4Connected"] = state ? state.advertiseIpv4Connected : undefined;
            resourceInputs["advertiseIpv4ConnectedVariable"] = state ? state.advertiseIpv4ConnectedVariable : undefined;
            resourceInputs["advertiseIpv4Eigrp"] = state ? state.advertiseIpv4Eigrp : undefined;
            resourceInputs["advertiseIpv4EigrpVariable"] = state ? state.advertiseIpv4EigrpVariable : undefined;
            resourceInputs["advertiseIpv4Isis"] = state ? state.advertiseIpv4Isis : undefined;
            resourceInputs["advertiseIpv4IsisVariable"] = state ? state.advertiseIpv4IsisVariable : undefined;
            resourceInputs["advertiseIpv4Lisp"] = state ? state.advertiseIpv4Lisp : undefined;
            resourceInputs["advertiseIpv4LispVariable"] = state ? state.advertiseIpv4LispVariable : undefined;
            resourceInputs["advertiseIpv4Ospf"] = state ? state.advertiseIpv4Ospf : undefined;
            resourceInputs["advertiseIpv4OspfV3"] = state ? state.advertiseIpv4OspfV3 : undefined;
            resourceInputs["advertiseIpv4OspfV3Variable"] = state ? state.advertiseIpv4OspfV3Variable : undefined;
            resourceInputs["advertiseIpv4OspfVariable"] = state ? state.advertiseIpv4OspfVariable : undefined;
            resourceInputs["advertiseIpv4Static"] = state ? state.advertiseIpv4Static : undefined;
            resourceInputs["advertiseIpv4StaticVariable"] = state ? state.advertiseIpv4StaticVariable : undefined;
            resourceInputs["advertiseIpv6Bgp"] = state ? state.advertiseIpv6Bgp : undefined;
            resourceInputs["advertiseIpv6BgpVariable"] = state ? state.advertiseIpv6BgpVariable : undefined;
            resourceInputs["advertiseIpv6Connected"] = state ? state.advertiseIpv6Connected : undefined;
            resourceInputs["advertiseIpv6ConnectedVariable"] = state ? state.advertiseIpv6ConnectedVariable : undefined;
            resourceInputs["advertiseIpv6Eigrp"] = state ? state.advertiseIpv6Eigrp : undefined;
            resourceInputs["advertiseIpv6EigrpVariable"] = state ? state.advertiseIpv6EigrpVariable : undefined;
            resourceInputs["advertiseIpv6Isis"] = state ? state.advertiseIpv6Isis : undefined;
            resourceInputs["advertiseIpv6IsisVariable"] = state ? state.advertiseIpv6IsisVariable : undefined;
            resourceInputs["advertiseIpv6Lisp"] = state ? state.advertiseIpv6Lisp : undefined;
            resourceInputs["advertiseIpv6LispVariable"] = state ? state.advertiseIpv6LispVariable : undefined;
            resourceInputs["advertiseIpv6Ospf"] = state ? state.advertiseIpv6Ospf : undefined;
            resourceInputs["advertiseIpv6OspfVariable"] = state ? state.advertiseIpv6OspfVariable : undefined;
            resourceInputs["advertiseIpv6Static"] = state ? state.advertiseIpv6Static : undefined;
            resourceInputs["advertiseIpv6StaticVariable"] = state ? state.advertiseIpv6StaticVariable : undefined;
            resourceInputs["advertisementInterval"] = state ? state.advertisementInterval : undefined;
            resourceInputs["advertisementIntervalVariable"] = state ? state.advertisementIntervalVariable : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["ecmpLimit"] = state ? state.ecmpLimit : undefined;
            resourceInputs["ecmpLimitVariable"] = state ? state.ecmpLimitVariable : undefined;
            resourceInputs["eorTimer"] = state ? state.eorTimer : undefined;
            resourceInputs["eorTimerVariable"] = state ? state.eorTimerVariable : undefined;
            resourceInputs["featureProfileId"] = state ? state.featureProfileId : undefined;
            resourceInputs["gracefulRestart"] = state ? state.gracefulRestart : undefined;
            resourceInputs["gracefulRestartTimer"] = state ? state.gracefulRestartTimer : undefined;
            resourceInputs["gracefulRestartTimerVariable"] = state ? state.gracefulRestartTimerVariable : undefined;
            resourceInputs["gracefulRestartVariable"] = state ? state.gracefulRestartVariable : undefined;
            resourceInputs["holdtime"] = state ? state.holdtime : undefined;
            resourceInputs["holdtimeVariable"] = state ? state.holdtimeVariable : undefined;
            resourceInputs["ignoreRegionPathLength"] = state ? state.ignoreRegionPathLength : undefined;
            resourceInputs["ignoreRegionPathLengthVariable"] = state ? state.ignoreRegionPathLengthVariable : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ompAdminDistanceIpv4"] = state ? state.ompAdminDistanceIpv4 : undefined;
            resourceInputs["ompAdminDistanceIpv4Variable"] = state ? state.ompAdminDistanceIpv4Variable : undefined;
            resourceInputs["ompAdminDistanceIpv6"] = state ? state.ompAdminDistanceIpv6 : undefined;
            resourceInputs["ompAdminDistanceIpv6Variable"] = state ? state.ompAdminDistanceIpv6Variable : undefined;
            resourceInputs["overlayAs"] = state ? state.overlayAs : undefined;
            resourceInputs["overlayAsVariable"] = state ? state.overlayAsVariable : undefined;
            resourceInputs["pathsAdvertisedPerPrefix"] = state ? state.pathsAdvertisedPerPrefix : undefined;
            resourceInputs["pathsAdvertisedPerPrefixVariable"] = state ? state.pathsAdvertisedPerPrefixVariable : undefined;
            resourceInputs["shutdown"] = state ? state.shutdown : undefined;
            resourceInputs["shutdownVariable"] = state ? state.shutdownVariable : undefined;
            resourceInputs["siteTypes"] = state ? state.siteTypes : undefined;
            resourceInputs["siteTypesVariable"] = state ? state.siteTypesVariable : undefined;
            resourceInputs["transportGateway"] = state ? state.transportGateway : undefined;
            resourceInputs["transportGatewayVariable"] = state ? state.transportGatewayVariable : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as SystemOmpFeatureArgs | undefined;
            if ((!args || args.featureProfileId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'featureProfileId'");
            }
            resourceInputs["advertiseIpv4Bgp"] = args ? args.advertiseIpv4Bgp : undefined;
            resourceInputs["advertiseIpv4BgpVariable"] = args ? args.advertiseIpv4BgpVariable : undefined;
            resourceInputs["advertiseIpv4Connected"] = args ? args.advertiseIpv4Connected : undefined;
            resourceInputs["advertiseIpv4ConnectedVariable"] = args ? args.advertiseIpv4ConnectedVariable : undefined;
            resourceInputs["advertiseIpv4Eigrp"] = args ? args.advertiseIpv4Eigrp : undefined;
            resourceInputs["advertiseIpv4EigrpVariable"] = args ? args.advertiseIpv4EigrpVariable : undefined;
            resourceInputs["advertiseIpv4Isis"] = args ? args.advertiseIpv4Isis : undefined;
            resourceInputs["advertiseIpv4IsisVariable"] = args ? args.advertiseIpv4IsisVariable : undefined;
            resourceInputs["advertiseIpv4Lisp"] = args ? args.advertiseIpv4Lisp : undefined;
            resourceInputs["advertiseIpv4LispVariable"] = args ? args.advertiseIpv4LispVariable : undefined;
            resourceInputs["advertiseIpv4Ospf"] = args ? args.advertiseIpv4Ospf : undefined;
            resourceInputs["advertiseIpv4OspfV3"] = args ? args.advertiseIpv4OspfV3 : undefined;
            resourceInputs["advertiseIpv4OspfV3Variable"] = args ? args.advertiseIpv4OspfV3Variable : undefined;
            resourceInputs["advertiseIpv4OspfVariable"] = args ? args.advertiseIpv4OspfVariable : undefined;
            resourceInputs["advertiseIpv4Static"] = args ? args.advertiseIpv4Static : undefined;
            resourceInputs["advertiseIpv4StaticVariable"] = args ? args.advertiseIpv4StaticVariable : undefined;
            resourceInputs["advertiseIpv6Bgp"] = args ? args.advertiseIpv6Bgp : undefined;
            resourceInputs["advertiseIpv6BgpVariable"] = args ? args.advertiseIpv6BgpVariable : undefined;
            resourceInputs["advertiseIpv6Connected"] = args ? args.advertiseIpv6Connected : undefined;
            resourceInputs["advertiseIpv6ConnectedVariable"] = args ? args.advertiseIpv6ConnectedVariable : undefined;
            resourceInputs["advertiseIpv6Eigrp"] = args ? args.advertiseIpv6Eigrp : undefined;
            resourceInputs["advertiseIpv6EigrpVariable"] = args ? args.advertiseIpv6EigrpVariable : undefined;
            resourceInputs["advertiseIpv6Isis"] = args ? args.advertiseIpv6Isis : undefined;
            resourceInputs["advertiseIpv6IsisVariable"] = args ? args.advertiseIpv6IsisVariable : undefined;
            resourceInputs["advertiseIpv6Lisp"] = args ? args.advertiseIpv6Lisp : undefined;
            resourceInputs["advertiseIpv6LispVariable"] = args ? args.advertiseIpv6LispVariable : undefined;
            resourceInputs["advertiseIpv6Ospf"] = args ? args.advertiseIpv6Ospf : undefined;
            resourceInputs["advertiseIpv6OspfVariable"] = args ? args.advertiseIpv6OspfVariable : undefined;
            resourceInputs["advertiseIpv6Static"] = args ? args.advertiseIpv6Static : undefined;
            resourceInputs["advertiseIpv6StaticVariable"] = args ? args.advertiseIpv6StaticVariable : undefined;
            resourceInputs["advertisementInterval"] = args ? args.advertisementInterval : undefined;
            resourceInputs["advertisementIntervalVariable"] = args ? args.advertisementIntervalVariable : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["ecmpLimit"] = args ? args.ecmpLimit : undefined;
            resourceInputs["ecmpLimitVariable"] = args ? args.ecmpLimitVariable : undefined;
            resourceInputs["eorTimer"] = args ? args.eorTimer : undefined;
            resourceInputs["eorTimerVariable"] = args ? args.eorTimerVariable : undefined;
            resourceInputs["featureProfileId"] = args ? args.featureProfileId : undefined;
            resourceInputs["gracefulRestart"] = args ? args.gracefulRestart : undefined;
            resourceInputs["gracefulRestartTimer"] = args ? args.gracefulRestartTimer : undefined;
            resourceInputs["gracefulRestartTimerVariable"] = args ? args.gracefulRestartTimerVariable : undefined;
            resourceInputs["gracefulRestartVariable"] = args ? args.gracefulRestartVariable : undefined;
            resourceInputs["holdtime"] = args ? args.holdtime : undefined;
            resourceInputs["holdtimeVariable"] = args ? args.holdtimeVariable : undefined;
            resourceInputs["ignoreRegionPathLength"] = args ? args.ignoreRegionPathLength : undefined;
            resourceInputs["ignoreRegionPathLengthVariable"] = args ? args.ignoreRegionPathLengthVariable : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["ompAdminDistanceIpv4"] = args ? args.ompAdminDistanceIpv4 : undefined;
            resourceInputs["ompAdminDistanceIpv4Variable"] = args ? args.ompAdminDistanceIpv4Variable : undefined;
            resourceInputs["ompAdminDistanceIpv6"] = args ? args.ompAdminDistanceIpv6 : undefined;
            resourceInputs["ompAdminDistanceIpv6Variable"] = args ? args.ompAdminDistanceIpv6Variable : undefined;
            resourceInputs["overlayAs"] = args ? args.overlayAs : undefined;
            resourceInputs["overlayAsVariable"] = args ? args.overlayAsVariable : undefined;
            resourceInputs["pathsAdvertisedPerPrefix"] = args ? args.pathsAdvertisedPerPrefix : undefined;
            resourceInputs["pathsAdvertisedPerPrefixVariable"] = args ? args.pathsAdvertisedPerPrefixVariable : undefined;
            resourceInputs["shutdown"] = args ? args.shutdown : undefined;
            resourceInputs["shutdownVariable"] = args ? args.shutdownVariable : undefined;
            resourceInputs["siteTypes"] = args ? args.siteTypes : undefined;
            resourceInputs["siteTypesVariable"] = args ? args.siteTypesVariable : undefined;
            resourceInputs["transportGateway"] = args ? args.transportGateway : undefined;
            resourceInputs["transportGatewayVariable"] = args ? args.transportGatewayVariable : undefined;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SystemOmpFeature.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SystemOmpFeature resources.
 */
export interface SystemOmpFeatureState {
    /**
     * BGP - Default value: `false`
     */
    advertiseIpv4Bgp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv4BgpVariable?: pulumi.Input<string>;
    /**
     * Connected - Default value: `true`
     */
    advertiseIpv4Connected?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv4ConnectedVariable?: pulumi.Input<string>;
    /**
     * EIGRP - Default value: `false`
     */
    advertiseIpv4Eigrp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv4EigrpVariable?: pulumi.Input<string>;
    /**
     * ISIS - Default value: `false`
     */
    advertiseIpv4Isis?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv4IsisVariable?: pulumi.Input<string>;
    /**
     * LISP - Default value: `false`
     */
    advertiseIpv4Lisp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv4LispVariable?: pulumi.Input<string>;
    /**
     * OSPF - Default value: `false`
     */
    advertiseIpv4Ospf?: pulumi.Input<boolean>;
    /**
     * OSPFV3 - Default value: `false`
     */
    advertiseIpv4OspfV3?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv4OspfV3Variable?: pulumi.Input<string>;
    /**
     * Variable name
     */
    advertiseIpv4OspfVariable?: pulumi.Input<string>;
    /**
     * Static - Default value: `true`
     */
    advertiseIpv4Static?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv4StaticVariable?: pulumi.Input<string>;
    /**
     * BGP - Default value: `false`
     */
    advertiseIpv6Bgp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv6BgpVariable?: pulumi.Input<string>;
    /**
     * Connected - Default value: `false`
     */
    advertiseIpv6Connected?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv6ConnectedVariable?: pulumi.Input<string>;
    /**
     * EIGRP - Default value: `false`
     */
    advertiseIpv6Eigrp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv6EigrpVariable?: pulumi.Input<string>;
    /**
     * ISIS - Default value: `false`
     */
    advertiseIpv6Isis?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv6IsisVariable?: pulumi.Input<string>;
    /**
     * LISP - Default value: `false`
     */
    advertiseIpv6Lisp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv6LispVariable?: pulumi.Input<string>;
    /**
     * OSPF - Default value: `false`
     */
    advertiseIpv6Ospf?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv6OspfVariable?: pulumi.Input<string>;
    /**
     * Static - Default value: `false`
     */
    advertiseIpv6Static?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv6StaticVariable?: pulumi.Input<string>;
    /**
     * Advertisement Interval (seconds) - Range: `0`-`65535` - Default value: `1`
     */
    advertisementInterval?: pulumi.Input<number>;
    /**
     * Variable name
     */
    advertisementIntervalVariable?: pulumi.Input<string>;
    /**
     * The description of the Feature
     */
    description?: pulumi.Input<string>;
    /**
     * Set maximum number of OMP paths to install in cEdge route table - Range: `1`-`0` - Default value: `4`
     */
    ecmpLimit?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ecmpLimitVariable?: pulumi.Input<string>;
    /**
     * EOR Timer - Range: `1`-`3600` - Default value: `300`
     */
    eorTimer?: pulumi.Input<number>;
    /**
     * Variable name
     */
    eorTimerVariable?: pulumi.Input<string>;
    /**
     * Feature Profile ID
     */
    featureProfileId?: pulumi.Input<string>;
    /**
     * Graceful Restart for OMP - Default value: `true`
     */
    gracefulRestart?: pulumi.Input<boolean>;
    /**
     * Graceful Restart Timer (seconds) - Range: `1`-`604800` - Default value: `43200`
     */
    gracefulRestartTimer?: pulumi.Input<number>;
    /**
     * Variable name
     */
    gracefulRestartTimerVariable?: pulumi.Input<string>;
    /**
     * Variable name
     */
    gracefulRestartVariable?: pulumi.Input<string>;
    /**
     * Hold Time (seconds) - Default value: `60`
     */
    holdtime?: pulumi.Input<number>;
    /**
     * Variable name
     */
    holdtimeVariable?: pulumi.Input<string>;
    /**
     * Treat hierarchical and direct (secondary region) paths equally - Default value: `false`
     */
    ignoreRegionPathLength?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    ignoreRegionPathLengthVariable?: pulumi.Input<string>;
    /**
     * The name of the Feature
     */
    name?: pulumi.Input<string>;
    /**
     * OMP Admin Distance IPv4 - Range: `1`-`255` - Default value: `251`
     */
    ompAdminDistanceIpv4?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ompAdminDistanceIpv4Variable?: pulumi.Input<string>;
    /**
     * OMP Admin Distance IPv6 - Range: `1`-`255` - Default value: `251`
     */
    ompAdminDistanceIpv6?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ompAdminDistanceIpv6Variable?: pulumi.Input<string>;
    /**
     * Overlay AS Number - Range: `1`-`4294967295`
     */
    overlayAs?: pulumi.Input<number>;
    /**
     * Variable name
     */
    overlayAsVariable?: pulumi.Input<string>;
    /**
     * Number of Paths Advertised per Prefix - Range: `1`-`16` - Default value: `4`
     */
    pathsAdvertisedPerPrefix?: pulumi.Input<number>;
    /**
     * Variable name
     */
    pathsAdvertisedPerPrefixVariable?: pulumi.Input<string>;
    /**
     * Shutdown - Default value: `false`
     */
    shutdown?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    shutdownVariable?: pulumi.Input<string>;
    /**
     * Site Types
     */
    siteTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Variable name
     */
    siteTypesVariable?: pulumi.Input<string>;
    /**
     * Transport Gateway Path Behavior - Choices: `prefer`, `ecmp-with-direct-path`
     */
    transportGateway?: pulumi.Input<string>;
    /**
     * Variable name
     */
    transportGatewayVariable?: pulumi.Input<string>;
    /**
     * The version of the Feature
     */
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a SystemOmpFeature resource.
 */
export interface SystemOmpFeatureArgs {
    /**
     * BGP - Default value: `false`
     */
    advertiseIpv4Bgp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv4BgpVariable?: pulumi.Input<string>;
    /**
     * Connected - Default value: `true`
     */
    advertiseIpv4Connected?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv4ConnectedVariable?: pulumi.Input<string>;
    /**
     * EIGRP - Default value: `false`
     */
    advertiseIpv4Eigrp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv4EigrpVariable?: pulumi.Input<string>;
    /**
     * ISIS - Default value: `false`
     */
    advertiseIpv4Isis?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv4IsisVariable?: pulumi.Input<string>;
    /**
     * LISP - Default value: `false`
     */
    advertiseIpv4Lisp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv4LispVariable?: pulumi.Input<string>;
    /**
     * OSPF - Default value: `false`
     */
    advertiseIpv4Ospf?: pulumi.Input<boolean>;
    /**
     * OSPFV3 - Default value: `false`
     */
    advertiseIpv4OspfV3?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv4OspfV3Variable?: pulumi.Input<string>;
    /**
     * Variable name
     */
    advertiseIpv4OspfVariable?: pulumi.Input<string>;
    /**
     * Static - Default value: `true`
     */
    advertiseIpv4Static?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv4StaticVariable?: pulumi.Input<string>;
    /**
     * BGP - Default value: `false`
     */
    advertiseIpv6Bgp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv6BgpVariable?: pulumi.Input<string>;
    /**
     * Connected - Default value: `false`
     */
    advertiseIpv6Connected?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv6ConnectedVariable?: pulumi.Input<string>;
    /**
     * EIGRP - Default value: `false`
     */
    advertiseIpv6Eigrp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv6EigrpVariable?: pulumi.Input<string>;
    /**
     * ISIS - Default value: `false`
     */
    advertiseIpv6Isis?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv6IsisVariable?: pulumi.Input<string>;
    /**
     * LISP - Default value: `false`
     */
    advertiseIpv6Lisp?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv6LispVariable?: pulumi.Input<string>;
    /**
     * OSPF - Default value: `false`
     */
    advertiseIpv6Ospf?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv6OspfVariable?: pulumi.Input<string>;
    /**
     * Static - Default value: `false`
     */
    advertiseIpv6Static?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    advertiseIpv6StaticVariable?: pulumi.Input<string>;
    /**
     * Advertisement Interval (seconds) - Range: `0`-`65535` - Default value: `1`
     */
    advertisementInterval?: pulumi.Input<number>;
    /**
     * Variable name
     */
    advertisementIntervalVariable?: pulumi.Input<string>;
    /**
     * The description of the Feature
     */
    description?: pulumi.Input<string>;
    /**
     * Set maximum number of OMP paths to install in cEdge route table - Range: `1`-`0` - Default value: `4`
     */
    ecmpLimit?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ecmpLimitVariable?: pulumi.Input<string>;
    /**
     * EOR Timer - Range: `1`-`3600` - Default value: `300`
     */
    eorTimer?: pulumi.Input<number>;
    /**
     * Variable name
     */
    eorTimerVariable?: pulumi.Input<string>;
    /**
     * Feature Profile ID
     */
    featureProfileId: pulumi.Input<string>;
    /**
     * Graceful Restart for OMP - Default value: `true`
     */
    gracefulRestart?: pulumi.Input<boolean>;
    /**
     * Graceful Restart Timer (seconds) - Range: `1`-`604800` - Default value: `43200`
     */
    gracefulRestartTimer?: pulumi.Input<number>;
    /**
     * Variable name
     */
    gracefulRestartTimerVariable?: pulumi.Input<string>;
    /**
     * Variable name
     */
    gracefulRestartVariable?: pulumi.Input<string>;
    /**
     * Hold Time (seconds) - Default value: `60`
     */
    holdtime?: pulumi.Input<number>;
    /**
     * Variable name
     */
    holdtimeVariable?: pulumi.Input<string>;
    /**
     * Treat hierarchical and direct (secondary region) paths equally - Default value: `false`
     */
    ignoreRegionPathLength?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    ignoreRegionPathLengthVariable?: pulumi.Input<string>;
    /**
     * The name of the Feature
     */
    name?: pulumi.Input<string>;
    /**
     * OMP Admin Distance IPv4 - Range: `1`-`255` - Default value: `251`
     */
    ompAdminDistanceIpv4?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ompAdminDistanceIpv4Variable?: pulumi.Input<string>;
    /**
     * OMP Admin Distance IPv6 - Range: `1`-`255` - Default value: `251`
     */
    ompAdminDistanceIpv6?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ompAdminDistanceIpv6Variable?: pulumi.Input<string>;
    /**
     * Overlay AS Number - Range: `1`-`4294967295`
     */
    overlayAs?: pulumi.Input<number>;
    /**
     * Variable name
     */
    overlayAsVariable?: pulumi.Input<string>;
    /**
     * Number of Paths Advertised per Prefix - Range: `1`-`16` - Default value: `4`
     */
    pathsAdvertisedPerPrefix?: pulumi.Input<number>;
    /**
     * Variable name
     */
    pathsAdvertisedPerPrefixVariable?: pulumi.Input<string>;
    /**
     * Shutdown - Default value: `false`
     */
    shutdown?: pulumi.Input<boolean>;
    /**
     * Variable name
     */
    shutdownVariable?: pulumi.Input<string>;
    /**
     * Site Types
     */
    siteTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Variable name
     */
    siteTypesVariable?: pulumi.Input<string>;
    /**
     * Transport Gateway Path Behavior - Choices: `prefer`, `ecmp-with-direct-path`
     */
    transportGateway?: pulumi.Input<string>;
    /**
     * Variable name
     */
    transportGatewayVariable?: pulumi.Input<string>;
}
