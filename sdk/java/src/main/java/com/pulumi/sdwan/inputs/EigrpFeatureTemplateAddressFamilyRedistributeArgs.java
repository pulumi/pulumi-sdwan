// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EigrpFeatureTemplateAddressFamilyRedistributeArgs extends com.pulumi.resources.ResourceArgs {

    public static final EigrpFeatureTemplateAddressFamilyRedistributeArgs Empty = new EigrpFeatureTemplateAddressFamilyRedistributeArgs();

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
     * Set the protocol to redistribute routes from
     *   - Choices: `bgp`, `connected`, `nat-route`, `omp`, `ospf`, `ospfv3`, `static`
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return Set the protocol to redistribute routes from
     *   - Choices: `bgp`, `connected`, `nat-route`, `omp`, `ospf`, `ospfv3`, `static`
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="protocolVariable")
    private @Nullable Output<String> protocolVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> protocolVariable() {
        return Optional.ofNullable(this.protocolVariable);
    }

    /**
     * Configure policy to apply to prefixes received from EIGRP neighbor
     * 
     */
    @Import(name="routePolicy")
    private @Nullable Output<String> routePolicy;

    /**
     * @return Configure policy to apply to prefixes received from EIGRP neighbor
     * 
     */
    public Optional<Output<String>> routePolicy() {
        return Optional.ofNullable(this.routePolicy);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="routePolicyVariable")
    private @Nullable Output<String> routePolicyVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> routePolicyVariable() {
        return Optional.ofNullable(this.routePolicyVariable);
    }

    private EigrpFeatureTemplateAddressFamilyRedistributeArgs() {}

    private EigrpFeatureTemplateAddressFamilyRedistributeArgs(EigrpFeatureTemplateAddressFamilyRedistributeArgs $) {
        this.optional = $.optional;
        this.protocol = $.protocol;
        this.protocolVariable = $.protocolVariable;
        this.routePolicy = $.routePolicy;
        this.routePolicyVariable = $.routePolicyVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EigrpFeatureTemplateAddressFamilyRedistributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EigrpFeatureTemplateAddressFamilyRedistributeArgs $;

        public Builder() {
            $ = new EigrpFeatureTemplateAddressFamilyRedistributeArgs();
        }

        public Builder(EigrpFeatureTemplateAddressFamilyRedistributeArgs defaults) {
            $ = new EigrpFeatureTemplateAddressFamilyRedistributeArgs(Objects.requireNonNull(defaults));
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
         * @param protocol Set the protocol to redistribute routes from
         *   - Choices: `bgp`, `connected`, `nat-route`, `omp`, `ospf`, `ospfv3`, `static`
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Set the protocol to redistribute routes from
         *   - Choices: `bgp`, `connected`, `nat-route`, `omp`, `ospf`, `ospfv3`, `static`
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param protocolVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder protocolVariable(@Nullable Output<String> protocolVariable) {
            $.protocolVariable = protocolVariable;
            return this;
        }

        /**
         * @param protocolVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder protocolVariable(String protocolVariable) {
            return protocolVariable(Output.of(protocolVariable));
        }

        /**
         * @param routePolicy Configure policy to apply to prefixes received from EIGRP neighbor
         * 
         * @return builder
         * 
         */
        public Builder routePolicy(@Nullable Output<String> routePolicy) {
            $.routePolicy = routePolicy;
            return this;
        }

        /**
         * @param routePolicy Configure policy to apply to prefixes received from EIGRP neighbor
         * 
         * @return builder
         * 
         */
        public Builder routePolicy(String routePolicy) {
            return routePolicy(Output.of(routePolicy));
        }

        /**
         * @param routePolicyVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder routePolicyVariable(@Nullable Output<String> routePolicyVariable) {
            $.routePolicyVariable = routePolicyVariable;
            return this;
        }

        /**
         * @param routePolicyVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder routePolicyVariable(String routePolicyVariable) {
            return routePolicyVariable(Output.of(routePolicyVariable));
        }

        public EigrpFeatureTemplateAddressFamilyRedistributeArgs build() {
            return $;
        }
    }

}
