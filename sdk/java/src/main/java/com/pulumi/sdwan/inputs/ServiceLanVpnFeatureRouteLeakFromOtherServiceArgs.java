// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sdwan.inputs.ServiceLanVpnFeatureRouteLeakFromOtherServiceRedistributionArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceLanVpnFeatureRouteLeakFromOtherServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLanVpnFeatureRouteLeakFromOtherServiceArgs Empty = new ServiceLanVpnFeatureRouteLeakFromOtherServiceArgs();

    /**
     * Redistribute Route to specific Protocol on Current Service VPN
     * 
     */
    @Import(name="redistributions")
    private @Nullable Output<List<ServiceLanVpnFeatureRouteLeakFromOtherServiceRedistributionArgs>> redistributions;

    /**
     * @return Redistribute Route to specific Protocol on Current Service VPN
     * 
     */
    public Optional<Output<List<ServiceLanVpnFeatureRouteLeakFromOtherServiceRedistributionArgs>>> redistributions() {
        return Optional.ofNullable(this.redistributions);
    }

    @Import(name="routePolicyId")
    private @Nullable Output<String> routePolicyId;

    public Optional<Output<String>> routePolicyId() {
        return Optional.ofNullable(this.routePolicyId);
    }

    /**
     * Leak Route of particular protocol from Source Service VPN
     *   - Choices: `static`, `connected`, `bgp`, `ospf`
     * 
     */
    @Import(name="routeProtocol")
    private @Nullable Output<String> routeProtocol;

    /**
     * @return Leak Route of particular protocol from Source Service VPN
     *   - Choices: `static`, `connected`, `bgp`, `ospf`
     * 
     */
    public Optional<Output<String>> routeProtocol() {
        return Optional.ofNullable(this.routeProtocol);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="routeProtocolVariable")
    private @Nullable Output<String> routeProtocolVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> routeProtocolVariable() {
        return Optional.ofNullable(this.routeProtocolVariable);
    }

    /**
     * Source Service VPN from where route are to be leaked
     *   - Range: `1`-`65530`
     * 
     */
    @Import(name="sourceVpn")
    private @Nullable Output<Integer> sourceVpn;

    /**
     * @return Source Service VPN from where route are to be leaked
     *   - Range: `1`-`65530`
     * 
     */
    public Optional<Output<Integer>> sourceVpn() {
        return Optional.ofNullable(this.sourceVpn);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="sourceVpnVariable")
    private @Nullable Output<String> sourceVpnVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> sourceVpnVariable() {
        return Optional.ofNullable(this.sourceVpnVariable);
    }

    private ServiceLanVpnFeatureRouteLeakFromOtherServiceArgs() {}

    private ServiceLanVpnFeatureRouteLeakFromOtherServiceArgs(ServiceLanVpnFeatureRouteLeakFromOtherServiceArgs $) {
        this.redistributions = $.redistributions;
        this.routePolicyId = $.routePolicyId;
        this.routeProtocol = $.routeProtocol;
        this.routeProtocolVariable = $.routeProtocolVariable;
        this.sourceVpn = $.sourceVpn;
        this.sourceVpnVariable = $.sourceVpnVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLanVpnFeatureRouteLeakFromOtherServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLanVpnFeatureRouteLeakFromOtherServiceArgs $;

        public Builder() {
            $ = new ServiceLanVpnFeatureRouteLeakFromOtherServiceArgs();
        }

        public Builder(ServiceLanVpnFeatureRouteLeakFromOtherServiceArgs defaults) {
            $ = new ServiceLanVpnFeatureRouteLeakFromOtherServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param redistributions Redistribute Route to specific Protocol on Current Service VPN
         * 
         * @return builder
         * 
         */
        public Builder redistributions(@Nullable Output<List<ServiceLanVpnFeatureRouteLeakFromOtherServiceRedistributionArgs>> redistributions) {
            $.redistributions = redistributions;
            return this;
        }

        /**
         * @param redistributions Redistribute Route to specific Protocol on Current Service VPN
         * 
         * @return builder
         * 
         */
        public Builder redistributions(List<ServiceLanVpnFeatureRouteLeakFromOtherServiceRedistributionArgs> redistributions) {
            return redistributions(Output.of(redistributions));
        }

        /**
         * @param redistributions Redistribute Route to specific Protocol on Current Service VPN
         * 
         * @return builder
         * 
         */
        public Builder redistributions(ServiceLanVpnFeatureRouteLeakFromOtherServiceRedistributionArgs... redistributions) {
            return redistributions(List.of(redistributions));
        }

        public Builder routePolicyId(@Nullable Output<String> routePolicyId) {
            $.routePolicyId = routePolicyId;
            return this;
        }

        public Builder routePolicyId(String routePolicyId) {
            return routePolicyId(Output.of(routePolicyId));
        }

        /**
         * @param routeProtocol Leak Route of particular protocol from Source Service VPN
         *   - Choices: `static`, `connected`, `bgp`, `ospf`
         * 
         * @return builder
         * 
         */
        public Builder routeProtocol(@Nullable Output<String> routeProtocol) {
            $.routeProtocol = routeProtocol;
            return this;
        }

        /**
         * @param routeProtocol Leak Route of particular protocol from Source Service VPN
         *   - Choices: `static`, `connected`, `bgp`, `ospf`
         * 
         * @return builder
         * 
         */
        public Builder routeProtocol(String routeProtocol) {
            return routeProtocol(Output.of(routeProtocol));
        }

        /**
         * @param routeProtocolVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder routeProtocolVariable(@Nullable Output<String> routeProtocolVariable) {
            $.routeProtocolVariable = routeProtocolVariable;
            return this;
        }

        /**
         * @param routeProtocolVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder routeProtocolVariable(String routeProtocolVariable) {
            return routeProtocolVariable(Output.of(routeProtocolVariable));
        }

        /**
         * @param sourceVpn Source Service VPN from where route are to be leaked
         *   - Range: `1`-`65530`
         * 
         * @return builder
         * 
         */
        public Builder sourceVpn(@Nullable Output<Integer> sourceVpn) {
            $.sourceVpn = sourceVpn;
            return this;
        }

        /**
         * @param sourceVpn Source Service VPN from where route are to be leaked
         *   - Range: `1`-`65530`
         * 
         * @return builder
         * 
         */
        public Builder sourceVpn(Integer sourceVpn) {
            return sourceVpn(Output.of(sourceVpn));
        }

        /**
         * @param sourceVpnVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder sourceVpnVariable(@Nullable Output<String> sourceVpnVariable) {
            $.sourceVpnVariable = sourceVpnVariable;
            return this;
        }

        /**
         * @param sourceVpnVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder sourceVpnVariable(String sourceVpnVariable) {
            return sourceVpnVariable(Output.of(sourceVpnVariable));
        }

        public ServiceLanVpnFeatureRouteLeakFromOtherServiceArgs build() {
            return $;
        }
    }

}