// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sdwan.outputs.ServiceLanVpnFeatureIpv4StaticRouteNextHop;
import com.pulumi.sdwan.outputs.ServiceLanVpnFeatureIpv4StaticRouteNextHopWithTracker;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceLanVpnFeatureIpv4StaticRoute {
    /**
     * @return IPv4 Route Gateway DHCP
     * 
     */
    private @Nullable Boolean gatewayDhcp;
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
     * @return IPv4 Route Gateway Next Hop with Tracker
     * 
     */
    private @Nullable List<ServiceLanVpnFeatureIpv4StaticRouteNextHopWithTracker> nextHopWithTrackers;
    /**
     * @return IPv4 Route Gateway Next Hop
     * 
     */
    private @Nullable List<ServiceLanVpnFeatureIpv4StaticRouteNextHop> nextHops;
    /**
     * @return IPv4 Route Gateway Next Hop
     * 
     */
    private @Nullable Boolean null0;
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
    /**
     * @return IPv4 Route Gateway VPN
     * 
     */
    private @Nullable Boolean vpn;

    private ServiceLanVpnFeatureIpv4StaticRoute() {}
    /**
     * @return IPv4 Route Gateway DHCP
     * 
     */
    public Optional<Boolean> gatewayDhcp() {
        return Optional.ofNullable(this.gatewayDhcp);
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
     * @return IPv4 Route Gateway Next Hop with Tracker
     * 
     */
    public List<ServiceLanVpnFeatureIpv4StaticRouteNextHopWithTracker> nextHopWithTrackers() {
        return this.nextHopWithTrackers == null ? List.of() : this.nextHopWithTrackers;
    }
    /**
     * @return IPv4 Route Gateway Next Hop
     * 
     */
    public List<ServiceLanVpnFeatureIpv4StaticRouteNextHop> nextHops() {
        return this.nextHops == null ? List.of() : this.nextHops;
    }
    /**
     * @return IPv4 Route Gateway Next Hop
     * 
     */
    public Optional<Boolean> null0() {
        return Optional.ofNullable(this.null0);
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
    /**
     * @return IPv4 Route Gateway VPN
     * 
     */
    public Optional<Boolean> vpn() {
        return Optional.ofNullable(this.vpn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceLanVpnFeatureIpv4StaticRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean gatewayDhcp;
        private @Nullable String networkAddress;
        private @Nullable String networkAddressVariable;
        private @Nullable List<ServiceLanVpnFeatureIpv4StaticRouteNextHopWithTracker> nextHopWithTrackers;
        private @Nullable List<ServiceLanVpnFeatureIpv4StaticRouteNextHop> nextHops;
        private @Nullable Boolean null0;
        private @Nullable String subnetMask;
        private @Nullable String subnetMaskVariable;
        private @Nullable Boolean vpn;
        public Builder() {}
        public Builder(ServiceLanVpnFeatureIpv4StaticRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayDhcp = defaults.gatewayDhcp;
    	      this.networkAddress = defaults.networkAddress;
    	      this.networkAddressVariable = defaults.networkAddressVariable;
    	      this.nextHopWithTrackers = defaults.nextHopWithTrackers;
    	      this.nextHops = defaults.nextHops;
    	      this.null0 = defaults.null0;
    	      this.subnetMask = defaults.subnetMask;
    	      this.subnetMaskVariable = defaults.subnetMaskVariable;
    	      this.vpn = defaults.vpn;
        }

        @CustomType.Setter
        public Builder gatewayDhcp(@Nullable Boolean gatewayDhcp) {

            this.gatewayDhcp = gatewayDhcp;
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
        public Builder nextHopWithTrackers(@Nullable List<ServiceLanVpnFeatureIpv4StaticRouteNextHopWithTracker> nextHopWithTrackers) {

            this.nextHopWithTrackers = nextHopWithTrackers;
            return this;
        }
        public Builder nextHopWithTrackers(ServiceLanVpnFeatureIpv4StaticRouteNextHopWithTracker... nextHopWithTrackers) {
            return nextHopWithTrackers(List.of(nextHopWithTrackers));
        }
        @CustomType.Setter
        public Builder nextHops(@Nullable List<ServiceLanVpnFeatureIpv4StaticRouteNextHop> nextHops) {

            this.nextHops = nextHops;
            return this;
        }
        public Builder nextHops(ServiceLanVpnFeatureIpv4StaticRouteNextHop... nextHops) {
            return nextHops(List.of(nextHops));
        }
        @CustomType.Setter
        public Builder null0(@Nullable Boolean null0) {

            this.null0 = null0;
            return this;
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
        @CustomType.Setter
        public Builder vpn(@Nullable Boolean vpn) {

            this.vpn = vpn;
            return this;
        }
        public ServiceLanVpnFeatureIpv4StaticRoute build() {
            final var _resultValue = new ServiceLanVpnFeatureIpv4StaticRoute();
            _resultValue.gatewayDhcp = gatewayDhcp;
            _resultValue.networkAddress = networkAddress;
            _resultValue.networkAddressVariable = networkAddressVariable;
            _resultValue.nextHopWithTrackers = nextHopWithTrackers;
            _resultValue.nextHops = nextHops;
            _resultValue.null0 = null0;
            _resultValue.subnetMask = subnetMask;
            _resultValue.subnetMaskVariable = subnetMaskVariable;
            _resultValue.vpn = vpn;
            return _resultValue;
        }
    }
}
