// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sdwan.inputs.CedgeAaaFeatureTemplateRadiusClientVpnConfigurationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CedgeAaaFeatureTemplateRadiusClientArgs extends com.pulumi.resources.ResourceArgs {

    public static final CedgeAaaFeatureTemplateRadiusClientArgs Empty = new CedgeAaaFeatureTemplateRadiusClientArgs();

    /**
     * Client IP
     * 
     */
    @Import(name="clientIp")
    private @Nullable Output<String> clientIp;

    /**
     * @return Client IP
     * 
     */
    public Optional<Output<String>> clientIp() {
        return Optional.ofNullable(this.clientIp);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="clientIpVariable")
    private @Nullable Output<String> clientIpVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> clientIpVariable() {
        return Optional.ofNullable(this.clientIpVariable);
    }

    /**
     * Indicates if list item is considered optional.
     * 
     */
    @Import(name="optional")
    private @Nullable Output<Boolean> optional;

    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Optional<Output<Boolean>> optional() {
        return Optional.ofNullable(this.optional);
    }

    /**
     * VPN configuration
     * 
     */
    @Import(name="vpnConfigurations")
    private @Nullable Output<List<CedgeAaaFeatureTemplateRadiusClientVpnConfigurationArgs>> vpnConfigurations;

    /**
     * @return VPN configuration
     * 
     */
    public Optional<Output<List<CedgeAaaFeatureTemplateRadiusClientVpnConfigurationArgs>>> vpnConfigurations() {
        return Optional.ofNullable(this.vpnConfigurations);
    }

    private CedgeAaaFeatureTemplateRadiusClientArgs() {}

    private CedgeAaaFeatureTemplateRadiusClientArgs(CedgeAaaFeatureTemplateRadiusClientArgs $) {
        this.clientIp = $.clientIp;
        this.clientIpVariable = $.clientIpVariable;
        this.optional = $.optional;
        this.vpnConfigurations = $.vpnConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CedgeAaaFeatureTemplateRadiusClientArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CedgeAaaFeatureTemplateRadiusClientArgs $;

        public Builder() {
            $ = new CedgeAaaFeatureTemplateRadiusClientArgs();
        }

        public Builder(CedgeAaaFeatureTemplateRadiusClientArgs defaults) {
            $ = new CedgeAaaFeatureTemplateRadiusClientArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientIp Client IP
         * 
         * @return builder
         * 
         */
        public Builder clientIp(@Nullable Output<String> clientIp) {
            $.clientIp = clientIp;
            return this;
        }

        /**
         * @param clientIp Client IP
         * 
         * @return builder
         * 
         */
        public Builder clientIp(String clientIp) {
            return clientIp(Output.of(clientIp));
        }

        /**
         * @param clientIpVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder clientIpVariable(@Nullable Output<String> clientIpVariable) {
            $.clientIpVariable = clientIpVariable;
            return this;
        }

        /**
         * @param clientIpVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder clientIpVariable(String clientIpVariable) {
            return clientIpVariable(Output.of(clientIpVariable));
        }

        /**
         * @param optional Indicates if list item is considered optional.
         * 
         * @return builder
         * 
         */
        public Builder optional(@Nullable Output<Boolean> optional) {
            $.optional = optional;
            return this;
        }

        /**
         * @param optional Indicates if list item is considered optional.
         * 
         * @return builder
         * 
         */
        public Builder optional(Boolean optional) {
            return optional(Output.of(optional));
        }

        /**
         * @param vpnConfigurations VPN configuration
         * 
         * @return builder
         * 
         */
        public Builder vpnConfigurations(@Nullable Output<List<CedgeAaaFeatureTemplateRadiusClientVpnConfigurationArgs>> vpnConfigurations) {
            $.vpnConfigurations = vpnConfigurations;
            return this;
        }

        /**
         * @param vpnConfigurations VPN configuration
         * 
         * @return builder
         * 
         */
        public Builder vpnConfigurations(List<CedgeAaaFeatureTemplateRadiusClientVpnConfigurationArgs> vpnConfigurations) {
            return vpnConfigurations(Output.of(vpnConfigurations));
        }

        /**
         * @param vpnConfigurations VPN configuration
         * 
         * @return builder
         * 
         */
        public Builder vpnConfigurations(CedgeAaaFeatureTemplateRadiusClientVpnConfigurationArgs... vpnConfigurations) {
            return vpnConfigurations(List.of(vpnConfigurations));
        }

        public CedgeAaaFeatureTemplateRadiusClientArgs build() {
            return $;
        }
    }

}
