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
public final class PolicyObjectDataIpv6PrefixListEntry {
    /**
     * @return IPv6 address
     * 
     */
    private @Nullable String ipv6Address;
    /**
     * @return IPv6 prefix
     *   - Range: `0`-`128`
     * 
     */
    private @Nullable Integer ipv6PrefixLength;

    private PolicyObjectDataIpv6PrefixListEntry() {}
    /**
     * @return IPv6 address
     * 
     */
    public Optional<String> ipv6Address() {
        return Optional.ofNullable(this.ipv6Address);
    }
    /**
     * @return IPv6 prefix
     *   - Range: `0`-`128`
     * 
     */
    public Optional<Integer> ipv6PrefixLength() {
        return Optional.ofNullable(this.ipv6PrefixLength);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyObjectDataIpv6PrefixListEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String ipv6Address;
        private @Nullable Integer ipv6PrefixLength;
        public Builder() {}
        public Builder(PolicyObjectDataIpv6PrefixListEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.ipv6PrefixLength = defaults.ipv6PrefixLength;
        }

        @CustomType.Setter
        public Builder ipv6Address(@Nullable String ipv6Address) {

            this.ipv6Address = ipv6Address;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6PrefixLength(@Nullable Integer ipv6PrefixLength) {

            this.ipv6PrefixLength = ipv6PrefixLength;
            return this;
        }
        public PolicyObjectDataIpv6PrefixListEntry build() {
            final var _resultValue = new PolicyObjectDataIpv6PrefixListEntry();
            _resultValue.ipv6Address = ipv6Address;
            _resultValue.ipv6PrefixLength = ipv6PrefixLength;
            return _resultValue;
        }
    }
}