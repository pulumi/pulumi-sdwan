// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the Cisco VPN feature template.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getCiscoVpnFeatureTemplate({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 * });
 * ```
 */
export function getCiscoVpnFeatureTemplate(args?: GetCiscoVpnFeatureTemplateArgs, opts?: pulumi.InvokeOptions): Promise<GetCiscoVpnFeatureTemplateResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("sdwan:index/getCiscoVpnFeatureTemplate:getCiscoVpnFeatureTemplate", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getCiscoVpnFeatureTemplate.
 */
export interface GetCiscoVpnFeatureTemplateArgs {
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
 * A collection of values returned by getCiscoVpnFeatureTemplate.
 */
export interface GetCiscoVpnFeatureTemplateResult {
    /**
     * The description of the feature template
     */
    readonly description: string;
    /**
     * List of supported device types
     */
    readonly deviceTypes: string[];
    /**
     * Static DNS mapping
     */
    readonly dnsHosts: outputs.GetCiscoVpnFeatureTemplateDnsHost[];
    /**
     * DNS
     */
    readonly dnsIpv4Servers: outputs.GetCiscoVpnFeatureTemplateDnsIpv4Server[];
    /**
     * DNS
     */
    readonly dnsIpv6Servers: outputs.GetCiscoVpnFeatureTemplateDnsIpv6Server[];
    /**
     * Optional packet fields for ECMP keying
     */
    readonly enhanceEcmpKeying: boolean;
    /**
     * Variable name
     */
    readonly enhanceEcmpKeyingVariable: string;
    /**
     * The id of the feature template
     */
    readonly id: string;
    /**
     * Configure routes pointing to a GRE tunnel
     */
    readonly ipv4StaticGreRoutes: outputs.GetCiscoVpnFeatureTemplateIpv4StaticGreRoute[];
    /**
     * Configure routes pointing to a IPSEC tunnel
     */
    readonly ipv4StaticIpsecRoutes: outputs.GetCiscoVpnFeatureTemplateIpv4StaticIpsecRoute[];
    /**
     * Configure IPv4 Static Routes
     */
    readonly ipv4StaticRoutes: outputs.GetCiscoVpnFeatureTemplateIpv4StaticRoute[];
    /**
     * Configure IPv4 Static Service Routes
     */
    readonly ipv4StaticServiceRoutes: outputs.GetCiscoVpnFeatureTemplateIpv4StaticServiceRoute[];
    /**
     * Configure IPv6 Static Routes
     */
    readonly ipv6StaticRoutes: outputs.GetCiscoVpnFeatureTemplateIpv6StaticRoute[];
    /**
     * The name of the feature template
     */
    readonly name: string;
    /**
     * Set NAT64 v4 pool range
     */
    readonly nat64Pools: outputs.GetCiscoVpnFeatureTemplateNat64Pool[];
    /**
     * Configure NAT Pool entries
     */
    readonly natPools: outputs.GetCiscoVpnFeatureTemplateNatPool[];
    /**
     * omp-admin-distance-ipv4
     */
    readonly ompAdminDistanceIpv4: number;
    /**
     * Variable name
     */
    readonly ompAdminDistanceIpv4Variable: string;
    /**
     * omp-admin-distance-ipv6
     */
    readonly ompAdminDistanceIpv6: number;
    /**
     * Variable name
     */
    readonly ompAdminDistanceIpv6Variable: string;
    /**
     * Advertise routes to OMP
     */
    readonly ompAdvertiseIpv4Routes: outputs.GetCiscoVpnFeatureTemplateOmpAdvertiseIpv4Route[];
    /**
     * Advertise routes to OMP
     */
    readonly ompAdvertiseIpv6Routes: outputs.GetCiscoVpnFeatureTemplateOmpAdvertiseIpv6Route[];
    /**
     * Org Name selected
     */
    readonly organizationName: string;
    /**
     * Configure Port Forward entries
     */
    readonly portForwardRules: outputs.GetCiscoVpnFeatureTemplatePortForwardRule[];
    /**
     * Enable route leaking to Global VPN from this Service VPN
     */
    readonly routeGlobalExports: outputs.GetCiscoVpnFeatureTemplateRouteGlobalExport[];
    /**
     * Enable route leaking from Global VPN to this Service VPN
     */
    readonly routeGlobalImports: outputs.GetCiscoVpnFeatureTemplateRouteGlobalImport[];
    /**
     * Enable route leak from Service VPN to current VPN
     */
    readonly routeVpnImports: outputs.GetCiscoVpnFeatureTemplateRouteVpnImport[];
    /**
     * Configure services
     */
    readonly services: outputs.GetCiscoVpnFeatureTemplateService[];
    /**
     * Configure static NAT entries
     */
    readonly staticNatRules: outputs.GetCiscoVpnFeatureTemplateStaticNatRule[];
    /**
     * Configure static NAT Subnet entries
     */
    readonly staticNatSubnetRules: outputs.GetCiscoVpnFeatureTemplateStaticNatSubnetRule[];
    /**
     * The template type
     */
    readonly templateType: string;
    /**
     * Tenant VPN
     */
    readonly tenantVpnId: number;
    /**
     * The version of the feature template
     */
    readonly version: number;
    /**
     * List of VPN instances
     */
    readonly vpnId: number;
    /**
     * Name
     */
    readonly vpnName: string;
    /**
     * Variable name
     */
    readonly vpnNameVariable: string;
}
/**
 * This data source can read the Cisco VPN feature template.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sdwan from "@pulumi/sdwan";
 *
 * const example = sdwan.getCiscoVpnFeatureTemplate({
 *     id: "f6b2c44c-693c-4763-b010-895aa3d236bd",
 * });
 * ```
 */
export function getCiscoVpnFeatureTemplateOutput(args?: GetCiscoVpnFeatureTemplateOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCiscoVpnFeatureTemplateResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("sdwan:index/getCiscoVpnFeatureTemplate:getCiscoVpnFeatureTemplate", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getCiscoVpnFeatureTemplate.
 */
export interface GetCiscoVpnFeatureTemplateOutputArgs {
    /**
     * The id of the feature template
     */
    id?: pulumi.Input<string>;
    /**
     * The name of the feature template
     */
    name?: pulumi.Input<string>;
}
