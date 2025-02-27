// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceLanVpnInterfaceSviFeatureIpv6VrrpAddress {
    /**
     * @return Assign Global IPv6 Prefix
     * 
     */
    private @Nullable String globalAddress;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String globalAddressVariable;
    /**
     * @return Use link-local IPv6 Address
     * 
     */
    private @Nullable String linkLocalAddress;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String linkLocalAddressVariable;

    private ServiceLanVpnInterfaceSviFeatureIpv6VrrpAddress() {}
    /**
     * @return Assign Global IPv6 Prefix
     * 
     */
    public Optional<String> globalAddress() {
        return Optional.ofNullable(this.globalAddress);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> globalAddressVariable() {
        return Optional.ofNullable(this.globalAddressVariable);
    }
    /**
     * @return Use link-local IPv6 Address
     * 
     */
    public Optional<String> linkLocalAddress() {
        return Optional.ofNullable(this.linkLocalAddress);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> linkLocalAddressVariable() {
        return Optional.ofNullable(this.linkLocalAddressVariable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceLanVpnInterfaceSviFeatureIpv6VrrpAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String globalAddress;
        private @Nullable String globalAddressVariable;
        private @Nullable String linkLocalAddress;
        private @Nullable String linkLocalAddressVariable;
        public Builder() {}
        public Builder(ServiceLanVpnInterfaceSviFeatureIpv6VrrpAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.globalAddress = defaults.globalAddress;
    	      this.globalAddressVariable = defaults.globalAddressVariable;
    	      this.linkLocalAddress = defaults.linkLocalAddress;
    	      this.linkLocalAddressVariable = defaults.linkLocalAddressVariable;
        }

        @CustomType.Setter
        public Builder globalAddress(@Nullable String globalAddress) {

            this.globalAddress = globalAddress;
            return this;
        }
        @CustomType.Setter
        public Builder globalAddressVariable(@Nullable String globalAddressVariable) {

            this.globalAddressVariable = globalAddressVariable;
            return this;
        }
        @CustomType.Setter
        public Builder linkLocalAddress(@Nullable String linkLocalAddress) {

            this.linkLocalAddress = linkLocalAddress;
            return this;
        }
        @CustomType.Setter
        public Builder linkLocalAddressVariable(@Nullable String linkLocalAddressVariable) {

            this.linkLocalAddressVariable = linkLocalAddressVariable;
            return this;
        }
        public ServiceLanVpnInterfaceSviFeatureIpv6VrrpAddress build() {
            final var _resultValue = new ServiceLanVpnInterfaceSviFeatureIpv6VrrpAddress();
            _resultValue.globalAddress = globalAddress;
            _resultValue.globalAddressVariable = globalAddressVariable;
            _resultValue.linkLocalAddress = linkLocalAddress;
            _resultValue.linkLocalAddressVariable = linkLocalAddressVariable;
            return _resultValue;
        }
    }
}
