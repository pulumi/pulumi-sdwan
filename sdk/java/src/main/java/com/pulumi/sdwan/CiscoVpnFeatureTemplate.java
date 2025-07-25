// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sdwan.CiscoVpnFeatureTemplateArgs;
import com.pulumi.sdwan.Utilities;
import com.pulumi.sdwan.inputs.CiscoVpnFeatureTemplateState;
import com.pulumi.sdwan.outputs.CiscoVpnFeatureTemplateDnsHost;
import com.pulumi.sdwan.outputs.CiscoVpnFeatureTemplateDnsIpv4Server;
import com.pulumi.sdwan.outputs.CiscoVpnFeatureTemplateDnsIpv6Server;
import com.pulumi.sdwan.outputs.CiscoVpnFeatureTemplateIpv4StaticGreRoute;
import com.pulumi.sdwan.outputs.CiscoVpnFeatureTemplateIpv4StaticIpsecRoute;
import com.pulumi.sdwan.outputs.CiscoVpnFeatureTemplateIpv4StaticRoute;
import com.pulumi.sdwan.outputs.CiscoVpnFeatureTemplateIpv4StaticServiceRoute;
import com.pulumi.sdwan.outputs.CiscoVpnFeatureTemplateIpv6StaticRoute;
import com.pulumi.sdwan.outputs.CiscoVpnFeatureTemplateNat64Pool;
import com.pulumi.sdwan.outputs.CiscoVpnFeatureTemplateNatPool;
import com.pulumi.sdwan.outputs.CiscoVpnFeatureTemplateOmpAdvertiseIpv4Route;
import com.pulumi.sdwan.outputs.CiscoVpnFeatureTemplateOmpAdvertiseIpv6Route;
import com.pulumi.sdwan.outputs.CiscoVpnFeatureTemplatePortForwardRule;
import com.pulumi.sdwan.outputs.CiscoVpnFeatureTemplateRouteGlobalExport;
import com.pulumi.sdwan.outputs.CiscoVpnFeatureTemplateRouteGlobalImport;
import com.pulumi.sdwan.outputs.CiscoVpnFeatureTemplateRouteVpnImport;
import com.pulumi.sdwan.outputs.CiscoVpnFeatureTemplateService;
import com.pulumi.sdwan.outputs.CiscoVpnFeatureTemplateStaticNatRule;
import com.pulumi.sdwan.outputs.CiscoVpnFeatureTemplateStaticNatSubnetRule;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource can manage a Cisco VPN feature template.
 *   - Minimum SD-WAN Manager version: `15.0.0`
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * The `pulumi import` command can be used, for example:
 * 
 * ```sh
 * $ pulumi import sdwan:index/ciscoVpnFeatureTemplate:CiscoVpnFeatureTemplate example &#34;f6b2c44c-693c-4763-b010-895aa3d236bd&#34;
 * ```
 * 
 */
@ResourceType(type="sdwan:index/ciscoVpnFeatureTemplate:CiscoVpnFeatureTemplate")
public class CiscoVpnFeatureTemplate extends com.pulumi.resources.CustomResource {
    /**
     * The description of the feature template
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return The description of the feature template
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
     * `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
     * `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
     * 
     */
    @Export(name="deviceTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> deviceTypes;

    /**
     * @return List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
     * `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
     * `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
     * 
     */
    public Output<List<String>> deviceTypes() {
        return this.deviceTypes;
    }
    /**
     * Static DNS mapping
     * 
     */
    @Export(name="dnsHosts", refs={List.class,CiscoVpnFeatureTemplateDnsHost.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CiscoVpnFeatureTemplateDnsHost>> dnsHosts;

    /**
     * @return Static DNS mapping
     * 
     */
    public Output<Optional<List<CiscoVpnFeatureTemplateDnsHost>>> dnsHosts() {
        return Codegen.optional(this.dnsHosts);
    }
    /**
     * DNS
     * 
     */
    @Export(name="dnsIpv4Servers", refs={List.class,CiscoVpnFeatureTemplateDnsIpv4Server.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CiscoVpnFeatureTemplateDnsIpv4Server>> dnsIpv4Servers;

    /**
     * @return DNS
     * 
     */
    public Output<Optional<List<CiscoVpnFeatureTemplateDnsIpv4Server>>> dnsIpv4Servers() {
        return Codegen.optional(this.dnsIpv4Servers);
    }
    /**
     * DNS
     * 
     */
    @Export(name="dnsIpv6Servers", refs={List.class,CiscoVpnFeatureTemplateDnsIpv6Server.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CiscoVpnFeatureTemplateDnsIpv6Server>> dnsIpv6Servers;

    /**
     * @return DNS
     * 
     */
    public Output<Optional<List<CiscoVpnFeatureTemplateDnsIpv6Server>>> dnsIpv6Servers() {
        return Codegen.optional(this.dnsIpv6Servers);
    }
    /**
     * Optional packet fields for ECMP keying - Default value: `false`
     * 
     */
    @Export(name="enhanceEcmpKeying", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enhanceEcmpKeying;

    /**
     * @return Optional packet fields for ECMP keying - Default value: `false`
     * 
     */
    public Output<Optional<Boolean>> enhanceEcmpKeying() {
        return Codegen.optional(this.enhanceEcmpKeying);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="enhanceEcmpKeyingVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> enhanceEcmpKeyingVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> enhanceEcmpKeyingVariable() {
        return Codegen.optional(this.enhanceEcmpKeyingVariable);
    }
    /**
     * Configure routes pointing to a GRE tunnel
     * 
     */
    @Export(name="ipv4StaticGreRoutes", refs={List.class,CiscoVpnFeatureTemplateIpv4StaticGreRoute.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CiscoVpnFeatureTemplateIpv4StaticGreRoute>> ipv4StaticGreRoutes;

    /**
     * @return Configure routes pointing to a GRE tunnel
     * 
     */
    public Output<Optional<List<CiscoVpnFeatureTemplateIpv4StaticGreRoute>>> ipv4StaticGreRoutes() {
        return Codegen.optional(this.ipv4StaticGreRoutes);
    }
    /**
     * Configure routes pointing to a IPSEC tunnel
     * 
     */
    @Export(name="ipv4StaticIpsecRoutes", refs={List.class,CiscoVpnFeatureTemplateIpv4StaticIpsecRoute.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CiscoVpnFeatureTemplateIpv4StaticIpsecRoute>> ipv4StaticIpsecRoutes;

    /**
     * @return Configure routes pointing to a IPSEC tunnel
     * 
     */
    public Output<Optional<List<CiscoVpnFeatureTemplateIpv4StaticIpsecRoute>>> ipv4StaticIpsecRoutes() {
        return Codegen.optional(this.ipv4StaticIpsecRoutes);
    }
    /**
     * Configure IPv4 Static Routes
     * 
     */
    @Export(name="ipv4StaticRoutes", refs={List.class,CiscoVpnFeatureTemplateIpv4StaticRoute.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CiscoVpnFeatureTemplateIpv4StaticRoute>> ipv4StaticRoutes;

    /**
     * @return Configure IPv4 Static Routes
     * 
     */
    public Output<Optional<List<CiscoVpnFeatureTemplateIpv4StaticRoute>>> ipv4StaticRoutes() {
        return Codegen.optional(this.ipv4StaticRoutes);
    }
    /**
     * Configure IPv4 Static Service Routes
     * 
     */
    @Export(name="ipv4StaticServiceRoutes", refs={List.class,CiscoVpnFeatureTemplateIpv4StaticServiceRoute.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CiscoVpnFeatureTemplateIpv4StaticServiceRoute>> ipv4StaticServiceRoutes;

    /**
     * @return Configure IPv4 Static Service Routes
     * 
     */
    public Output<Optional<List<CiscoVpnFeatureTemplateIpv4StaticServiceRoute>>> ipv4StaticServiceRoutes() {
        return Codegen.optional(this.ipv4StaticServiceRoutes);
    }
    /**
     * Configure IPv6 Static Routes
     * 
     */
    @Export(name="ipv6StaticRoutes", refs={List.class,CiscoVpnFeatureTemplateIpv6StaticRoute.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CiscoVpnFeatureTemplateIpv6StaticRoute>> ipv6StaticRoutes;

    /**
     * @return Configure IPv6 Static Routes
     * 
     */
    public Output<Optional<List<CiscoVpnFeatureTemplateIpv6StaticRoute>>> ipv6StaticRoutes() {
        return Codegen.optional(this.ipv6StaticRoutes);
    }
    /**
     * The name of the feature template
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the feature template
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Set NAT64 v4 pool range
     * 
     */
    @Export(name="nat64Pools", refs={List.class,CiscoVpnFeatureTemplateNat64Pool.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CiscoVpnFeatureTemplateNat64Pool>> nat64Pools;

    /**
     * @return Set NAT64 v4 pool range
     * 
     */
    public Output<Optional<List<CiscoVpnFeatureTemplateNat64Pool>>> nat64Pools() {
        return Codegen.optional(this.nat64Pools);
    }
    /**
     * Configure NAT Pool entries
     * 
     */
    @Export(name="natPools", refs={List.class,CiscoVpnFeatureTemplateNatPool.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CiscoVpnFeatureTemplateNatPool>> natPools;

    /**
     * @return Configure NAT Pool entries
     * 
     */
    public Output<Optional<List<CiscoVpnFeatureTemplateNatPool>>> natPools() {
        return Codegen.optional(this.natPools);
    }
    /**
     * omp-admin-distance-ipv4 - Range: `1`-`255`
     * 
     */
    @Export(name="ompAdminDistanceIpv4", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> ompAdminDistanceIpv4;

    /**
     * @return omp-admin-distance-ipv4 - Range: `1`-`255`
     * 
     */
    public Output<Optional<Integer>> ompAdminDistanceIpv4() {
        return Codegen.optional(this.ompAdminDistanceIpv4);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="ompAdminDistanceIpv4Variable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ompAdminDistanceIpv4Variable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> ompAdminDistanceIpv4Variable() {
        return Codegen.optional(this.ompAdminDistanceIpv4Variable);
    }
    /**
     * omp-admin-distance-ipv6 - Range: `1`-`255`
     * 
     */
    @Export(name="ompAdminDistanceIpv6", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> ompAdminDistanceIpv6;

    /**
     * @return omp-admin-distance-ipv6 - Range: `1`-`255`
     * 
     */
    public Output<Optional<Integer>> ompAdminDistanceIpv6() {
        return Codegen.optional(this.ompAdminDistanceIpv6);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="ompAdminDistanceIpv6Variable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ompAdminDistanceIpv6Variable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> ompAdminDistanceIpv6Variable() {
        return Codegen.optional(this.ompAdminDistanceIpv6Variable);
    }
    /**
     * Advertise routes to OMP
     * 
     */
    @Export(name="ompAdvertiseIpv4Routes", refs={List.class,CiscoVpnFeatureTemplateOmpAdvertiseIpv4Route.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CiscoVpnFeatureTemplateOmpAdvertiseIpv4Route>> ompAdvertiseIpv4Routes;

    /**
     * @return Advertise routes to OMP
     * 
     */
    public Output<Optional<List<CiscoVpnFeatureTemplateOmpAdvertiseIpv4Route>>> ompAdvertiseIpv4Routes() {
        return Codegen.optional(this.ompAdvertiseIpv4Routes);
    }
    /**
     * Advertise routes to OMP
     * 
     */
    @Export(name="ompAdvertiseIpv6Routes", refs={List.class,CiscoVpnFeatureTemplateOmpAdvertiseIpv6Route.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CiscoVpnFeatureTemplateOmpAdvertiseIpv6Route>> ompAdvertiseIpv6Routes;

    /**
     * @return Advertise routes to OMP
     * 
     */
    public Output<Optional<List<CiscoVpnFeatureTemplateOmpAdvertiseIpv6Route>>> ompAdvertiseIpv6Routes() {
        return Codegen.optional(this.ompAdvertiseIpv6Routes);
    }
    /**
     * Org Name selected
     * 
     */
    @Export(name="organizationName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> organizationName;

    /**
     * @return Org Name selected
     * 
     */
    public Output<Optional<String>> organizationName() {
        return Codegen.optional(this.organizationName);
    }
    /**
     * Configure Port Forward entries
     * 
     */
    @Export(name="portForwardRules", refs={List.class,CiscoVpnFeatureTemplatePortForwardRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CiscoVpnFeatureTemplatePortForwardRule>> portForwardRules;

    /**
     * @return Configure Port Forward entries
     * 
     */
    public Output<Optional<List<CiscoVpnFeatureTemplatePortForwardRule>>> portForwardRules() {
        return Codegen.optional(this.portForwardRules);
    }
    /**
     * Enable route leaking to Global VPN from this Service VPN
     * 
     */
    @Export(name="routeGlobalExports", refs={List.class,CiscoVpnFeatureTemplateRouteGlobalExport.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CiscoVpnFeatureTemplateRouteGlobalExport>> routeGlobalExports;

    /**
     * @return Enable route leaking to Global VPN from this Service VPN
     * 
     */
    public Output<Optional<List<CiscoVpnFeatureTemplateRouteGlobalExport>>> routeGlobalExports() {
        return Codegen.optional(this.routeGlobalExports);
    }
    /**
     * Enable route leaking from Global VPN to this Service VPN
     * 
     */
    @Export(name="routeGlobalImports", refs={List.class,CiscoVpnFeatureTemplateRouteGlobalImport.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CiscoVpnFeatureTemplateRouteGlobalImport>> routeGlobalImports;

    /**
     * @return Enable route leaking from Global VPN to this Service VPN
     * 
     */
    public Output<Optional<List<CiscoVpnFeatureTemplateRouteGlobalImport>>> routeGlobalImports() {
        return Codegen.optional(this.routeGlobalImports);
    }
    /**
     * Enable route leak from Service VPN to current VPN
     * 
     */
    @Export(name="routeVpnImports", refs={List.class,CiscoVpnFeatureTemplateRouteVpnImport.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CiscoVpnFeatureTemplateRouteVpnImport>> routeVpnImports;

    /**
     * @return Enable route leak from Service VPN to current VPN
     * 
     */
    public Output<Optional<List<CiscoVpnFeatureTemplateRouteVpnImport>>> routeVpnImports() {
        return Codegen.optional(this.routeVpnImports);
    }
    /**
     * Configure services
     * 
     */
    @Export(name="services", refs={List.class,CiscoVpnFeatureTemplateService.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CiscoVpnFeatureTemplateService>> services;

    /**
     * @return Configure services
     * 
     */
    public Output<Optional<List<CiscoVpnFeatureTemplateService>>> services() {
        return Codegen.optional(this.services);
    }
    /**
     * Configure static NAT entries
     * 
     */
    @Export(name="staticNatRules", refs={List.class,CiscoVpnFeatureTemplateStaticNatRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CiscoVpnFeatureTemplateStaticNatRule>> staticNatRules;

    /**
     * @return Configure static NAT entries
     * 
     */
    public Output<Optional<List<CiscoVpnFeatureTemplateStaticNatRule>>> staticNatRules() {
        return Codegen.optional(this.staticNatRules);
    }
    /**
     * Configure static NAT Subnet entries
     * 
     */
    @Export(name="staticNatSubnetRules", refs={List.class,CiscoVpnFeatureTemplateStaticNatSubnetRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CiscoVpnFeatureTemplateStaticNatSubnetRule>> staticNatSubnetRules;

    /**
     * @return Configure static NAT Subnet entries
     * 
     */
    public Output<Optional<List<CiscoVpnFeatureTemplateStaticNatSubnetRule>>> staticNatSubnetRules() {
        return Codegen.optional(this.staticNatSubnetRules);
    }
    /**
     * The template type
     * 
     */
    @Export(name="templateType", refs={String.class}, tree="[0]")
    private Output<String> templateType;

    /**
     * @return The template type
     * 
     */
    public Output<String> templateType() {
        return this.templateType;
    }
    /**
     * Tenant VPN - Range: `0`-`65527` - Default value: `0`
     * 
     */
    @Export(name="tenantVpnId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> tenantVpnId;

    /**
     * @return Tenant VPN - Range: `0`-`65527` - Default value: `0`
     * 
     */
    public Output<Optional<Integer>> tenantVpnId() {
        return Codegen.optional(this.tenantVpnId);
    }
    /**
     * The version of the feature template
     * 
     */
    @Export(name="version", refs={Integer.class}, tree="[0]")
    private Output<Integer> version;

    /**
     * @return The version of the feature template
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }
    /**
     * List of VPN instances - Range: `0`-`65527` - Default value: `0`
     * 
     */
    @Export(name="vpnId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> vpnId;

    /**
     * @return List of VPN instances - Range: `0`-`65527` - Default value: `0`
     * 
     */
    public Output<Optional<Integer>> vpnId() {
        return Codegen.optional(this.vpnId);
    }
    /**
     * Name
     * 
     */
    @Export(name="vpnName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vpnName;

    /**
     * @return Name
     * 
     */
    public Output<Optional<String>> vpnName() {
        return Codegen.optional(this.vpnName);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="vpnNameVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vpnNameVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> vpnNameVariable() {
        return Codegen.optional(this.vpnNameVariable);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CiscoVpnFeatureTemplate(java.lang.String name) {
        this(name, CiscoVpnFeatureTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CiscoVpnFeatureTemplate(java.lang.String name, CiscoVpnFeatureTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CiscoVpnFeatureTemplate(java.lang.String name, CiscoVpnFeatureTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sdwan:index/ciscoVpnFeatureTemplate:CiscoVpnFeatureTemplate", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CiscoVpnFeatureTemplate(java.lang.String name, Output<java.lang.String> id, @Nullable CiscoVpnFeatureTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sdwan:index/ciscoVpnFeatureTemplate:CiscoVpnFeatureTemplate", name, state, makeResourceOptions(options, id), false);
    }

    private static CiscoVpnFeatureTemplateArgs makeArgs(CiscoVpnFeatureTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CiscoVpnFeatureTemplateArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CiscoVpnFeatureTemplate get(java.lang.String name, Output<java.lang.String> id, @Nullable CiscoVpnFeatureTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CiscoVpnFeatureTemplate(name, id, state, options);
    }
}
