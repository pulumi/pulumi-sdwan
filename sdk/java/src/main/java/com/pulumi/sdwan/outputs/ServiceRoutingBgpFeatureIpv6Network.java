// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceRoutingBgpFeatureIpv6Network {
    /**
     * @return Configure the prefixes for BGP to announce
     * 
     */
    private @Nullable String networkPrefix;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String networkPrefixVariable;

    private ServiceRoutingBgpFeatureIpv6Network() {}
    /**
     * @return Configure the prefixes for BGP to announce
     * 
     */
    public Optional<String> networkPrefix() {
        return Optional.ofNullable(this.networkPrefix);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> networkPrefixVariable() {
        return Optional.ofNullable(this.networkPrefixVariable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceRoutingBgpFeatureIpv6Network defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String networkPrefix;
        private @Nullable String networkPrefixVariable;
        public Builder() {}
        public Builder(ServiceRoutingBgpFeatureIpv6Network defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkPrefix = defaults.networkPrefix;
    	      this.networkPrefixVariable = defaults.networkPrefixVariable;
        }

        @CustomType.Setter
        public Builder networkPrefix(@Nullable String networkPrefix) {

            this.networkPrefix = networkPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder networkPrefixVariable(@Nullable String networkPrefixVariable) {

            this.networkPrefixVariable = networkPrefixVariable;
            return this;
        }
        public ServiceRoutingBgpFeatureIpv6Network build() {
            final var _resultValue = new ServiceRoutingBgpFeatureIpv6Network();
            _resultValue.networkPrefix = networkPrefix;
            _resultValue.networkPrefixVariable = networkPrefixVariable;
            return _resultValue;
        }
    }
}