// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceLanVpnFeatureServiceRoute {
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
     * @return Service
     *   - Choices: `SIG`
     *   - Default value: `SIG`
     * 
     */
    private @Nullable String service;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String serviceVariable;
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
     * @return Service
     * 
     */
    private @Nullable Integer vpn;

    private ServiceLanVpnFeatureServiceRoute() {}
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
     * @return Service
     *   - Choices: `SIG`
     *   - Default value: `SIG`
     * 
     */
    public Optional<String> service() {
        return Optional.ofNullable(this.service);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> serviceVariable() {
        return Optional.ofNullable(this.serviceVariable);
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
     * @return Service
     * 
     */
    public Optional<Integer> vpn() {
        return Optional.ofNullable(this.vpn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceLanVpnFeatureServiceRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String networkAddress;
        private @Nullable String networkAddressVariable;
        private @Nullable String service;
        private @Nullable String serviceVariable;
        private @Nullable String subnetMask;
        private @Nullable String subnetMaskVariable;
        private @Nullable Integer vpn;
        public Builder() {}
        public Builder(ServiceLanVpnFeatureServiceRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkAddress = defaults.networkAddress;
    	      this.networkAddressVariable = defaults.networkAddressVariable;
    	      this.service = defaults.service;
    	      this.serviceVariable = defaults.serviceVariable;
    	      this.subnetMask = defaults.subnetMask;
    	      this.subnetMaskVariable = defaults.subnetMaskVariable;
    	      this.vpn = defaults.vpn;
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
        public Builder service(@Nullable String service) {

            this.service = service;
            return this;
        }
        @CustomType.Setter
        public Builder serviceVariable(@Nullable String serviceVariable) {

            this.serviceVariable = serviceVariable;
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
        public Builder vpn(@Nullable Integer vpn) {

            this.vpn = vpn;
            return this;
        }
        public ServiceLanVpnFeatureServiceRoute build() {
            final var _resultValue = new ServiceLanVpnFeatureServiceRoute();
            _resultValue.networkAddress = networkAddress;
            _resultValue.networkAddressVariable = networkAddressVariable;
            _resultValue.service = service;
            _resultValue.serviceVariable = serviceVariable;
            _resultValue.subnetMask = subnetMask;
            _resultValue.subnetMaskVariable = subnetMaskVariable;
            _resultValue.vpn = vpn;
            return _resultValue;
        }
    }
}
