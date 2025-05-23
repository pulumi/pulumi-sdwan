// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sdwan.outputs.TransportManagementVpnFeatureIpv4StaticRouteNextHop;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TransportManagementVpnFeatureIpv4StaticRoute {
    /**
     * @return Administrative distance, Attribute conditional on `gateway` being equal to `null0`
     *   - Range: `1`-`255`
     *   - Default value: `1`
     * 
     */
    private @Nullable Integer administrativeDistance;
    /**
     * @return Variable name, Attribute conditional on `gateway` being equal to `null0`
     * 
     */
    private @Nullable String administrativeDistanceVariable;
    /**
     * @return Gateway
     *   - Choices: `nextHop`, `dhcp`, `null0`
     *   - Default value: `nextHop`
     * 
     */
    private @Nullable String gateway;
    /**
     * @return IP Address
     * 
     */
    private @Nullable String networkAddress;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String networkAddressVariable;
    /**
     * @return IPv4 Route Gateway Next Hop, Attribute conditional on `gateway` being equal to `nextHop`
     * 
     */
    private @Nullable List<TransportManagementVpnFeatureIpv4StaticRouteNextHop> nextHops;
    /**
     * @return Subnet Mask
     *   - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`, `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`, `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`, `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`, `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
     * 
     */
    private @Nullable String subnetMask;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String subnetMaskVariable;

    private TransportManagementVpnFeatureIpv4StaticRoute() {}
    /**
     * @return Administrative distance, Attribute conditional on `gateway` being equal to `null0`
     *   - Range: `1`-`255`
     *   - Default value: `1`
     * 
     */
    public Optional<Integer> administrativeDistance() {
        return Optional.ofNullable(this.administrativeDistance);
    }
    /**
     * @return Variable name, Attribute conditional on `gateway` being equal to `null0`
     * 
     */
    public Optional<String> administrativeDistanceVariable() {
        return Optional.ofNullable(this.administrativeDistanceVariable);
    }
    /**
     * @return Gateway
     *   - Choices: `nextHop`, `dhcp`, `null0`
     *   - Default value: `nextHop`
     * 
     */
    public Optional<String> gateway() {
        return Optional.ofNullable(this.gateway);
    }
    /**
     * @return IP Address
     * 
     */
    public Optional<String> networkAddress() {
        return Optional.ofNullable(this.networkAddress);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> networkAddressVariable() {
        return Optional.ofNullable(this.networkAddressVariable);
    }
    /**
     * @return IPv4 Route Gateway Next Hop, Attribute conditional on `gateway` being equal to `nextHop`
     * 
     */
    public List<TransportManagementVpnFeatureIpv4StaticRouteNextHop> nextHops() {
        return this.nextHops == null ? List.of() : this.nextHops;
    }
    /**
     * @return Subnet Mask
     *   - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`, `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`, `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`, `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`, `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
     * 
     */
    public Optional<String> subnetMask() {
        return Optional.ofNullable(this.subnetMask);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> subnetMaskVariable() {
        return Optional.ofNullable(this.subnetMaskVariable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransportManagementVpnFeatureIpv4StaticRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer administrativeDistance;
        private @Nullable String administrativeDistanceVariable;
        private @Nullable String gateway;
        private @Nullable String networkAddress;
        private @Nullable String networkAddressVariable;
        private @Nullable List<TransportManagementVpnFeatureIpv4StaticRouteNextHop> nextHops;
        private @Nullable String subnetMask;
        private @Nullable String subnetMaskVariable;
        public Builder() {}
        public Builder(TransportManagementVpnFeatureIpv4StaticRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administrativeDistance = defaults.administrativeDistance;
    	      this.administrativeDistanceVariable = defaults.administrativeDistanceVariable;
    	      this.gateway = defaults.gateway;
    	      this.networkAddress = defaults.networkAddress;
    	      this.networkAddressVariable = defaults.networkAddressVariable;
    	      this.nextHops = defaults.nextHops;
    	      this.subnetMask = defaults.subnetMask;
    	      this.subnetMaskVariable = defaults.subnetMaskVariable;
        }

        @CustomType.Setter
        public Builder administrativeDistance(@Nullable Integer administrativeDistance) {

            this.administrativeDistance = administrativeDistance;
            return this;
        }
        @CustomType.Setter
        public Builder administrativeDistanceVariable(@Nullable String administrativeDistanceVariable) {

            this.administrativeDistanceVariable = administrativeDistanceVariable;
            return this;
        }
        @CustomType.Setter
        public Builder gateway(@Nullable String gateway) {

            this.gateway = gateway;
            return this;
        }
        @CustomType.Setter
        public Builder networkAddress(@Nullable String networkAddress) {

            this.networkAddress = networkAddress;
            return this;
        }
        @CustomType.Setter
        public Builder networkAddressVariable(@Nullable String networkAddressVariable) {

            this.networkAddressVariable = networkAddressVariable;
            return this;
        }
        @CustomType.Setter
        public Builder nextHops(@Nullable List<TransportManagementVpnFeatureIpv4StaticRouteNextHop> nextHops) {

            this.nextHops = nextHops;
            return this;
        }
        public Builder nextHops(TransportManagementVpnFeatureIpv4StaticRouteNextHop... nextHops) {
            return nextHops(List.of(nextHops));
        }
        @CustomType.Setter
        public Builder subnetMask(@Nullable String subnetMask) {

            this.subnetMask = subnetMask;
            return this;
        }
        @CustomType.Setter
        public Builder subnetMaskVariable(@Nullable String subnetMaskVariable) {

            this.subnetMaskVariable = subnetMaskVariable;
            return this;
        }
        public TransportManagementVpnFeatureIpv4StaticRoute build() {
            final var _resultValue = new TransportManagementVpnFeatureIpv4StaticRoute();
            _resultValue.administrativeDistance = administrativeDistance;
            _resultValue.administrativeDistanceVariable = administrativeDistanceVariable;
            _resultValue.gateway = gateway;
            _resultValue.networkAddress = networkAddress;
            _resultValue.networkAddressVariable = networkAddressVariable;
            _resultValue.nextHops = nextHops;
            _resultValue.subnetMask = subnetMask;
            _resultValue.subnetMaskVariable = subnetMaskVariable;
            return _resultValue;
        }
    }
}
