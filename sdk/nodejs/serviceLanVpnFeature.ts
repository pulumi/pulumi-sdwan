// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource can manage a Service LAN VPN Feature.
 *   - Minimum SD-WAN Manager version: `20.12.0`
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import sdwan:index/serviceLanVpnFeature:ServiceLanVpnFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd"
 * ```
 */
export class ServiceLanVpnFeature extends pulumi.CustomResource {
    /**
     * Get an existing ServiceLanVpnFeature resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceLanVpnFeatureState, opts?: pulumi.CustomResourceOptions): ServiceLanVpnFeature {
        return new ServiceLanVpnFeature(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sdwan:index/serviceLanVpnFeature:ServiceLanVpnFeature';

    /**
     * Returns true if the given object is an instance of ServiceLanVpnFeature.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceLanVpnFeature {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceLanVpnFeature.__pulumiType;
    }

    /**
     * OMP Advertise IPv4
     */
    public readonly advertiseOmpIpv4s!: pulumi.Output<outputs.ServiceLanVpnFeatureAdvertiseOmpIpv4[] | undefined>;
    /**
     * OMP Advertise IPv6
     */
    public readonly advertiseOmpIpv6s!: pulumi.Output<outputs.ServiceLanVpnFeatureAdvertiseOmpIpv6[] | undefined>;
    /**
     * Name
     */
    public readonly configDescription!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly configDescriptionVariable!: pulumi.Output<string | undefined>;
    /**
     * The description of the Feature
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Enable SDWAN Remote Access - Default value: `false`
     */
    public readonly enableSdwanRemoteAccess!: pulumi.Output<boolean | undefined>;
    /**
     * Feature Profile ID
     */
    public readonly featureProfileId!: pulumi.Output<string>;
    /**
     * IPv4 Static GRE Route
     */
    public readonly greRoutes!: pulumi.Output<outputs.ServiceLanVpnFeatureGreRoute[] | undefined>;
    public readonly hostMappings!: pulumi.Output<outputs.ServiceLanVpnFeatureHostMapping[] | undefined>;
    /**
     * IPv4 Static IPSEC Route
     */
    public readonly ipsecRoutes!: pulumi.Output<outputs.ServiceLanVpnFeatureIpsecRoute[] | undefined>;
    public readonly ipv4ExportRouteTargets!: pulumi.Output<outputs.ServiceLanVpnFeatureIpv4ExportRouteTarget[] | undefined>;
    public readonly ipv4ImportRouteTargets!: pulumi.Output<outputs.ServiceLanVpnFeatureIpv4ImportRouteTarget[] | undefined>;
    /**
     * IPv4 Static Route
     */
    public readonly ipv4StaticRoutes!: pulumi.Output<outputs.ServiceLanVpnFeatureIpv4StaticRoute[] | undefined>;
    public readonly ipv6ExportRouteTargets!: pulumi.Output<outputs.ServiceLanVpnFeatureIpv6ExportRouteTarget[] | undefined>;
    public readonly ipv6ImportRouteTargets!: pulumi.Output<outputs.ServiceLanVpnFeatureIpv6ImportRouteTarget[] | undefined>;
    /**
     * IPv6 Static Route
     */
    public readonly ipv6StaticRoutes!: pulumi.Output<outputs.ServiceLanVpnFeatureIpv6StaticRoute[] | undefined>;
    /**
     * The name of the Feature
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * NAT64 V4 Pool
     */
    public readonly nat64V4Pools!: pulumi.Output<outputs.ServiceLanVpnFeatureNat64V4Pool[] | undefined>;
    /**
     * NAT Pool
     */
    public readonly natPools!: pulumi.Output<outputs.ServiceLanVpnFeatureNatPool[] | undefined>;
    /**
     * NAT Port Forward
     */
    public readonly natPortForwards!: pulumi.Output<outputs.ServiceLanVpnFeatureNatPortForward[] | undefined>;
    /**
     * OMP Admin Distance IPv4 - Range: `1`-`255`
     */
    public readonly ompAdminDistanceIpv4!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly ompAdminDistanceIpv4Variable!: pulumi.Output<string | undefined>;
    /**
     * OMP Admin Distance IPv6 - Range: `1`-`255`
     */
    public readonly ompAdminDistanceIpv6!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly ompAdminDistanceIpv6Variable!: pulumi.Output<string | undefined>;
    /**
     * Primary DNS Address (IPv4)
     */
    public readonly primaryDnsAddressIpv4!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly primaryDnsAddressIpv4Variable!: pulumi.Output<string | undefined>;
    /**
     * Primary DNS Address (IPv6)
     */
    public readonly primaryDnsAddressIpv6!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly primaryDnsAddressIpv6Variable!: pulumi.Output<string | undefined>;
    /**
     * Enable route leaking from Global to Service VPN
     */
    public readonly routeLeakFromGlobalVpns!: pulumi.Output<outputs.ServiceLanVpnFeatureRouteLeakFromGlobalVpn[] | undefined>;
    /**
     * Enable route leak from another Service VPN to current Service VPN
     */
    public readonly routeLeakFromOtherServices!: pulumi.Output<outputs.ServiceLanVpnFeatureRouteLeakFromOtherService[] | undefined>;
    /**
     * Enable route leaking from Service to Global VPN
     */
    public readonly routeLeakToGlobalVpns!: pulumi.Output<outputs.ServiceLanVpnFeatureRouteLeakToGlobalVpn[] | undefined>;
    /**
     * Secondary DNS Address (IPv4)
     */
    public readonly secondaryDnsAddressIpv4!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly secondaryDnsAddressIpv4Variable!: pulumi.Output<string | undefined>;
    /**
     * Secondary DNS Address (IPv6)
     */
    public readonly secondaryDnsAddressIpv6!: pulumi.Output<string | undefined>;
    /**
     * Variable name
     */
    public readonly secondaryDnsAddressIpv6Variable!: pulumi.Output<string | undefined>;
    /**
     * Service
     */
    public readonly serviceRoutes!: pulumi.Output<outputs.ServiceLanVpnFeatureServiceRoute[] | undefined>;
    /**
     * Service
     */
    public readonly services!: pulumi.Output<outputs.ServiceLanVpnFeatureService[] | undefined>;
    /**
     * Static NAT Rules
     */
    public readonly staticNats!: pulumi.Output<outputs.ServiceLanVpnFeatureStaticNat[] | undefined>;
    /**
     * The version of the Feature
     */
    public /*out*/ readonly version!: pulumi.Output<number>;
    /**
     * VPN - Range: `1`-`65527` - Default value: `0`
     */
    public readonly vpn!: pulumi.Output<number | undefined>;
    /**
     * Variable name
     */
    public readonly vpnVariable!: pulumi.Output<string | undefined>;

    /**
     * Create a ServiceLanVpnFeature resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceLanVpnFeatureArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceLanVpnFeatureArgs | ServiceLanVpnFeatureState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceLanVpnFeatureState | undefined;
            resourceInputs["advertiseOmpIpv4s"] = state ? state.advertiseOmpIpv4s : undefined;
            resourceInputs["advertiseOmpIpv6s"] = state ? state.advertiseOmpIpv6s : undefined;
            resourceInputs["configDescription"] = state ? state.configDescription : undefined;
            resourceInputs["configDescriptionVariable"] = state ? state.configDescriptionVariable : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enableSdwanRemoteAccess"] = state ? state.enableSdwanRemoteAccess : undefined;
            resourceInputs["featureProfileId"] = state ? state.featureProfileId : undefined;
            resourceInputs["greRoutes"] = state ? state.greRoutes : undefined;
            resourceInputs["hostMappings"] = state ? state.hostMappings : undefined;
            resourceInputs["ipsecRoutes"] = state ? state.ipsecRoutes : undefined;
            resourceInputs["ipv4ExportRouteTargets"] = state ? state.ipv4ExportRouteTargets : undefined;
            resourceInputs["ipv4ImportRouteTargets"] = state ? state.ipv4ImportRouteTargets : undefined;
            resourceInputs["ipv4StaticRoutes"] = state ? state.ipv4StaticRoutes : undefined;
            resourceInputs["ipv6ExportRouteTargets"] = state ? state.ipv6ExportRouteTargets : undefined;
            resourceInputs["ipv6ImportRouteTargets"] = state ? state.ipv6ImportRouteTargets : undefined;
            resourceInputs["ipv6StaticRoutes"] = state ? state.ipv6StaticRoutes : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nat64V4Pools"] = state ? state.nat64V4Pools : undefined;
            resourceInputs["natPools"] = state ? state.natPools : undefined;
            resourceInputs["natPortForwards"] = state ? state.natPortForwards : undefined;
            resourceInputs["ompAdminDistanceIpv4"] = state ? state.ompAdminDistanceIpv4 : undefined;
            resourceInputs["ompAdminDistanceIpv4Variable"] = state ? state.ompAdminDistanceIpv4Variable : undefined;
            resourceInputs["ompAdminDistanceIpv6"] = state ? state.ompAdminDistanceIpv6 : undefined;
            resourceInputs["ompAdminDistanceIpv6Variable"] = state ? state.ompAdminDistanceIpv6Variable : undefined;
            resourceInputs["primaryDnsAddressIpv4"] = state ? state.primaryDnsAddressIpv4 : undefined;
            resourceInputs["primaryDnsAddressIpv4Variable"] = state ? state.primaryDnsAddressIpv4Variable : undefined;
            resourceInputs["primaryDnsAddressIpv6"] = state ? state.primaryDnsAddressIpv6 : undefined;
            resourceInputs["primaryDnsAddressIpv6Variable"] = state ? state.primaryDnsAddressIpv6Variable : undefined;
            resourceInputs["routeLeakFromGlobalVpns"] = state ? state.routeLeakFromGlobalVpns : undefined;
            resourceInputs["routeLeakFromOtherServices"] = state ? state.routeLeakFromOtherServices : undefined;
            resourceInputs["routeLeakToGlobalVpns"] = state ? state.routeLeakToGlobalVpns : undefined;
            resourceInputs["secondaryDnsAddressIpv4"] = state ? state.secondaryDnsAddressIpv4 : undefined;
            resourceInputs["secondaryDnsAddressIpv4Variable"] = state ? state.secondaryDnsAddressIpv4Variable : undefined;
            resourceInputs["secondaryDnsAddressIpv6"] = state ? state.secondaryDnsAddressIpv6 : undefined;
            resourceInputs["secondaryDnsAddressIpv6Variable"] = state ? state.secondaryDnsAddressIpv6Variable : undefined;
            resourceInputs["serviceRoutes"] = state ? state.serviceRoutes : undefined;
            resourceInputs["services"] = state ? state.services : undefined;
            resourceInputs["staticNats"] = state ? state.staticNats : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
            resourceInputs["vpn"] = state ? state.vpn : undefined;
            resourceInputs["vpnVariable"] = state ? state.vpnVariable : undefined;
        } else {
            const args = argsOrState as ServiceLanVpnFeatureArgs | undefined;
            if ((!args || args.featureProfileId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'featureProfileId'");
            }
            resourceInputs["advertiseOmpIpv4s"] = args ? args.advertiseOmpIpv4s : undefined;
            resourceInputs["advertiseOmpIpv6s"] = args ? args.advertiseOmpIpv6s : undefined;
            resourceInputs["configDescription"] = args ? args.configDescription : undefined;
            resourceInputs["configDescriptionVariable"] = args ? args.configDescriptionVariable : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enableSdwanRemoteAccess"] = args ? args.enableSdwanRemoteAccess : undefined;
            resourceInputs["featureProfileId"] = args ? args.featureProfileId : undefined;
            resourceInputs["greRoutes"] = args ? args.greRoutes : undefined;
            resourceInputs["hostMappings"] = args ? args.hostMappings : undefined;
            resourceInputs["ipsecRoutes"] = args ? args.ipsecRoutes : undefined;
            resourceInputs["ipv4ExportRouteTargets"] = args ? args.ipv4ExportRouteTargets : undefined;
            resourceInputs["ipv4ImportRouteTargets"] = args ? args.ipv4ImportRouteTargets : undefined;
            resourceInputs["ipv4StaticRoutes"] = args ? args.ipv4StaticRoutes : undefined;
            resourceInputs["ipv6ExportRouteTargets"] = args ? args.ipv6ExportRouteTargets : undefined;
            resourceInputs["ipv6ImportRouteTargets"] = args ? args.ipv6ImportRouteTargets : undefined;
            resourceInputs["ipv6StaticRoutes"] = args ? args.ipv6StaticRoutes : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nat64V4Pools"] = args ? args.nat64V4Pools : undefined;
            resourceInputs["natPools"] = args ? args.natPools : undefined;
            resourceInputs["natPortForwards"] = args ? args.natPortForwards : undefined;
            resourceInputs["ompAdminDistanceIpv4"] = args ? args.ompAdminDistanceIpv4 : undefined;
            resourceInputs["ompAdminDistanceIpv4Variable"] = args ? args.ompAdminDistanceIpv4Variable : undefined;
            resourceInputs["ompAdminDistanceIpv6"] = args ? args.ompAdminDistanceIpv6 : undefined;
            resourceInputs["ompAdminDistanceIpv6Variable"] = args ? args.ompAdminDistanceIpv6Variable : undefined;
            resourceInputs["primaryDnsAddressIpv4"] = args ? args.primaryDnsAddressIpv4 : undefined;
            resourceInputs["primaryDnsAddressIpv4Variable"] = args ? args.primaryDnsAddressIpv4Variable : undefined;
            resourceInputs["primaryDnsAddressIpv6"] = args ? args.primaryDnsAddressIpv6 : undefined;
            resourceInputs["primaryDnsAddressIpv6Variable"] = args ? args.primaryDnsAddressIpv6Variable : undefined;
            resourceInputs["routeLeakFromGlobalVpns"] = args ? args.routeLeakFromGlobalVpns : undefined;
            resourceInputs["routeLeakFromOtherServices"] = args ? args.routeLeakFromOtherServices : undefined;
            resourceInputs["routeLeakToGlobalVpns"] = args ? args.routeLeakToGlobalVpns : undefined;
            resourceInputs["secondaryDnsAddressIpv4"] = args ? args.secondaryDnsAddressIpv4 : undefined;
            resourceInputs["secondaryDnsAddressIpv4Variable"] = args ? args.secondaryDnsAddressIpv4Variable : undefined;
            resourceInputs["secondaryDnsAddressIpv6"] = args ? args.secondaryDnsAddressIpv6 : undefined;
            resourceInputs["secondaryDnsAddressIpv6Variable"] = args ? args.secondaryDnsAddressIpv6Variable : undefined;
            resourceInputs["serviceRoutes"] = args ? args.serviceRoutes : undefined;
            resourceInputs["services"] = args ? args.services : undefined;
            resourceInputs["staticNats"] = args ? args.staticNats : undefined;
            resourceInputs["vpn"] = args ? args.vpn : undefined;
            resourceInputs["vpnVariable"] = args ? args.vpnVariable : undefined;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServiceLanVpnFeature.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceLanVpnFeature resources.
 */
export interface ServiceLanVpnFeatureState {
    /**
     * OMP Advertise IPv4
     */
    advertiseOmpIpv4s?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureAdvertiseOmpIpv4>[]>;
    /**
     * OMP Advertise IPv6
     */
    advertiseOmpIpv6s?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureAdvertiseOmpIpv6>[]>;
    /**
     * Name
     */
    configDescription?: pulumi.Input<string>;
    /**
     * Variable name
     */
    configDescriptionVariable?: pulumi.Input<string>;
    /**
     * The description of the Feature
     */
    description?: pulumi.Input<string>;
    /**
     * Enable SDWAN Remote Access - Default value: `false`
     */
    enableSdwanRemoteAccess?: pulumi.Input<boolean>;
    /**
     * Feature Profile ID
     */
    featureProfileId?: pulumi.Input<string>;
    /**
     * IPv4 Static GRE Route
     */
    greRoutes?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureGreRoute>[]>;
    hostMappings?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureHostMapping>[]>;
    /**
     * IPv4 Static IPSEC Route
     */
    ipsecRoutes?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureIpsecRoute>[]>;
    ipv4ExportRouteTargets?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureIpv4ExportRouteTarget>[]>;
    ipv4ImportRouteTargets?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureIpv4ImportRouteTarget>[]>;
    /**
     * IPv4 Static Route
     */
    ipv4StaticRoutes?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureIpv4StaticRoute>[]>;
    ipv6ExportRouteTargets?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureIpv6ExportRouteTarget>[]>;
    ipv6ImportRouteTargets?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureIpv6ImportRouteTarget>[]>;
    /**
     * IPv6 Static Route
     */
    ipv6StaticRoutes?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureIpv6StaticRoute>[]>;
    /**
     * The name of the Feature
     */
    name?: pulumi.Input<string>;
    /**
     * NAT64 V4 Pool
     */
    nat64V4Pools?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureNat64V4Pool>[]>;
    /**
     * NAT Pool
     */
    natPools?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureNatPool>[]>;
    /**
     * NAT Port Forward
     */
    natPortForwards?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureNatPortForward>[]>;
    /**
     * OMP Admin Distance IPv4 - Range: `1`-`255`
     */
    ompAdminDistanceIpv4?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ompAdminDistanceIpv4Variable?: pulumi.Input<string>;
    /**
     * OMP Admin Distance IPv6 - Range: `1`-`255`
     */
    ompAdminDistanceIpv6?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ompAdminDistanceIpv6Variable?: pulumi.Input<string>;
    /**
     * Primary DNS Address (IPv4)
     */
    primaryDnsAddressIpv4?: pulumi.Input<string>;
    /**
     * Variable name
     */
    primaryDnsAddressIpv4Variable?: pulumi.Input<string>;
    /**
     * Primary DNS Address (IPv6)
     */
    primaryDnsAddressIpv6?: pulumi.Input<string>;
    /**
     * Variable name
     */
    primaryDnsAddressIpv6Variable?: pulumi.Input<string>;
    /**
     * Enable route leaking from Global to Service VPN
     */
    routeLeakFromGlobalVpns?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureRouteLeakFromGlobalVpn>[]>;
    /**
     * Enable route leak from another Service VPN to current Service VPN
     */
    routeLeakFromOtherServices?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureRouteLeakFromOtherService>[]>;
    /**
     * Enable route leaking from Service to Global VPN
     */
    routeLeakToGlobalVpns?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureRouteLeakToGlobalVpn>[]>;
    /**
     * Secondary DNS Address (IPv4)
     */
    secondaryDnsAddressIpv4?: pulumi.Input<string>;
    /**
     * Variable name
     */
    secondaryDnsAddressIpv4Variable?: pulumi.Input<string>;
    /**
     * Secondary DNS Address (IPv6)
     */
    secondaryDnsAddressIpv6?: pulumi.Input<string>;
    /**
     * Variable name
     */
    secondaryDnsAddressIpv6Variable?: pulumi.Input<string>;
    /**
     * Service
     */
    serviceRoutes?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureServiceRoute>[]>;
    /**
     * Service
     */
    services?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureService>[]>;
    /**
     * Static NAT Rules
     */
    staticNats?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureStaticNat>[]>;
    /**
     * The version of the Feature
     */
    version?: pulumi.Input<number>;
    /**
     * VPN - Range: `1`-`65527` - Default value: `0`
     */
    vpn?: pulumi.Input<number>;
    /**
     * Variable name
     */
    vpnVariable?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServiceLanVpnFeature resource.
 */
export interface ServiceLanVpnFeatureArgs {
    /**
     * OMP Advertise IPv4
     */
    advertiseOmpIpv4s?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureAdvertiseOmpIpv4>[]>;
    /**
     * OMP Advertise IPv6
     */
    advertiseOmpIpv6s?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureAdvertiseOmpIpv6>[]>;
    /**
     * Name
     */
    configDescription?: pulumi.Input<string>;
    /**
     * Variable name
     */
    configDescriptionVariable?: pulumi.Input<string>;
    /**
     * The description of the Feature
     */
    description?: pulumi.Input<string>;
    /**
     * Enable SDWAN Remote Access - Default value: `false`
     */
    enableSdwanRemoteAccess?: pulumi.Input<boolean>;
    /**
     * Feature Profile ID
     */
    featureProfileId: pulumi.Input<string>;
    /**
     * IPv4 Static GRE Route
     */
    greRoutes?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureGreRoute>[]>;
    hostMappings?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureHostMapping>[]>;
    /**
     * IPv4 Static IPSEC Route
     */
    ipsecRoutes?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureIpsecRoute>[]>;
    ipv4ExportRouteTargets?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureIpv4ExportRouteTarget>[]>;
    ipv4ImportRouteTargets?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureIpv4ImportRouteTarget>[]>;
    /**
     * IPv4 Static Route
     */
    ipv4StaticRoutes?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureIpv4StaticRoute>[]>;
    ipv6ExportRouteTargets?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureIpv6ExportRouteTarget>[]>;
    ipv6ImportRouteTargets?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureIpv6ImportRouteTarget>[]>;
    /**
     * IPv6 Static Route
     */
    ipv6StaticRoutes?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureIpv6StaticRoute>[]>;
    /**
     * The name of the Feature
     */
    name?: pulumi.Input<string>;
    /**
     * NAT64 V4 Pool
     */
    nat64V4Pools?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureNat64V4Pool>[]>;
    /**
     * NAT Pool
     */
    natPools?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureNatPool>[]>;
    /**
     * NAT Port Forward
     */
    natPortForwards?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureNatPortForward>[]>;
    /**
     * OMP Admin Distance IPv4 - Range: `1`-`255`
     */
    ompAdminDistanceIpv4?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ompAdminDistanceIpv4Variable?: pulumi.Input<string>;
    /**
     * OMP Admin Distance IPv6 - Range: `1`-`255`
     */
    ompAdminDistanceIpv6?: pulumi.Input<number>;
    /**
     * Variable name
     */
    ompAdminDistanceIpv6Variable?: pulumi.Input<string>;
    /**
     * Primary DNS Address (IPv4)
     */
    primaryDnsAddressIpv4?: pulumi.Input<string>;
    /**
     * Variable name
     */
    primaryDnsAddressIpv4Variable?: pulumi.Input<string>;
    /**
     * Primary DNS Address (IPv6)
     */
    primaryDnsAddressIpv6?: pulumi.Input<string>;
    /**
     * Variable name
     */
    primaryDnsAddressIpv6Variable?: pulumi.Input<string>;
    /**
     * Enable route leaking from Global to Service VPN
     */
    routeLeakFromGlobalVpns?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureRouteLeakFromGlobalVpn>[]>;
    /**
     * Enable route leak from another Service VPN to current Service VPN
     */
    routeLeakFromOtherServices?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureRouteLeakFromOtherService>[]>;
    /**
     * Enable route leaking from Service to Global VPN
     */
    routeLeakToGlobalVpns?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureRouteLeakToGlobalVpn>[]>;
    /**
     * Secondary DNS Address (IPv4)
     */
    secondaryDnsAddressIpv4?: pulumi.Input<string>;
    /**
     * Variable name
     */
    secondaryDnsAddressIpv4Variable?: pulumi.Input<string>;
    /**
     * Secondary DNS Address (IPv6)
     */
    secondaryDnsAddressIpv6?: pulumi.Input<string>;
    /**
     * Variable name
     */
    secondaryDnsAddressIpv6Variable?: pulumi.Input<string>;
    /**
     * Service
     */
    serviceRoutes?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureServiceRoute>[]>;
    /**
     * Service
     */
    services?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureService>[]>;
    /**
     * Static NAT Rules
     */
    staticNats?: pulumi.Input<pulumi.Input<inputs.ServiceLanVpnFeatureStaticNat>[]>;
    /**
     * VPN - Range: `1`-`65527` - Default value: `0`
     */
    vpn?: pulumi.Input<number>;
    /**
     * Variable name
     */
    vpnVariable?: pulumi.Input<string>;
}