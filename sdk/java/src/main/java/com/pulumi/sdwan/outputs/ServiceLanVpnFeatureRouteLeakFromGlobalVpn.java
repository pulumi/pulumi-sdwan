// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sdwan.outputs.ServiceLanVpnFeatureRouteLeakFromGlobalVpnRedistribution;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceLanVpnFeatureRouteLeakFromGlobalVpn {
    /**
     * @return Redistribute Routes to specific Protocol on Service VPN
     * 
     */
    private @Nullable List<ServiceLanVpnFeatureRouteLeakFromGlobalVpnRedistribution> redistributions;
    private @Nullable String routePolicyId;
    /**
     * @return Leak Routes of particular protocol from Global to Service VPN
     *   - Choices: `static`, `connected`, `bgp`, `ospf`
     * 
     */
    private @Nullable String routeProtocol;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String routeProtocolVariable;

    private ServiceLanVpnFeatureRouteLeakFromGlobalVpn() {}
    /**
     * @return Redistribute Routes to specific Protocol on Service VPN
     * 
     */
    public List<ServiceLanVpnFeatureRouteLeakFromGlobalVpnRedistribution> redistributions() {
        return this.redistributions == null ? List.of() : this.redistributions;
    }
    public Optional<String> routePolicyId() {
        return Optional.ofNullable(this.routePolicyId);
    }
    /**
     * @return Leak Routes of particular protocol from Global to Service VPN
     *   - Choices: `static`, `connected`, `bgp`, `ospf`
     * 
     */
    public Optional<String> routeProtocol() {
        return Optional.ofNullable(this.routeProtocol);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> routeProtocolVariable() {
        return Optional.ofNullable(this.routeProtocolVariable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceLanVpnFeatureRouteLeakFromGlobalVpn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ServiceLanVpnFeatureRouteLeakFromGlobalVpnRedistribution> redistributions;
        private @Nullable String routePolicyId;
        private @Nullable String routeProtocol;
        private @Nullable String routeProtocolVariable;
        public Builder() {}
        public Builder(ServiceLanVpnFeatureRouteLeakFromGlobalVpn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.redistributions = defaults.redistributions;
    	      this.routePolicyId = defaults.routePolicyId;
    	      this.routeProtocol = defaults.routeProtocol;
    	      this.routeProtocolVariable = defaults.routeProtocolVariable;
        }

        @CustomType.Setter
        public Builder redistributions(@Nullable List<ServiceLanVpnFeatureRouteLeakFromGlobalVpnRedistribution> redistributions) {

            this.redistributions = redistributions;
            return this;
        }
        public Builder redistributions(ServiceLanVpnFeatureRouteLeakFromGlobalVpnRedistribution... redistributions) {
            return redistributions(List.of(redistributions));
        }
        @CustomType.Setter
        public Builder routePolicyId(@Nullable String routePolicyId) {

            this.routePolicyId = routePolicyId;
            return this;
        }
        @CustomType.Setter
        public Builder routeProtocol(@Nullable String routeProtocol) {

            this.routeProtocol = routeProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder routeProtocolVariable(@Nullable String routeProtocolVariable) {

            this.routeProtocolVariable = routeProtocolVariable;
            return this;
        }
        public ServiceLanVpnFeatureRouteLeakFromGlobalVpn build() {
            final var _resultValue = new ServiceLanVpnFeatureRouteLeakFromGlobalVpn();
            _resultValue.redistributions = redistributions;
            _resultValue.routePolicyId = routePolicyId;
            _resultValue.routeProtocol = routeProtocol;
            _resultValue.routeProtocolVariable = routeProtocolVariable;
            return _resultValue;
        }
    }
}
