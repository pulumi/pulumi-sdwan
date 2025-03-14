// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyObjectSecurityDataIpv4PrefixListEntry {
    private @Nullable String ipPrefix;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String ipPrefixVariable;

    private PolicyObjectSecurityDataIpv4PrefixListEntry() {}
    public Optional<String> ipPrefix() {
        return Optional.ofNullable(this.ipPrefix);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> ipPrefixVariable() {
        return Optional.ofNullable(this.ipPrefixVariable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyObjectSecurityDataIpv4PrefixListEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String ipPrefix;
        private @Nullable String ipPrefixVariable;
        public Builder() {}
        public Builder(PolicyObjectSecurityDataIpv4PrefixListEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipPrefix = defaults.ipPrefix;
    	      this.ipPrefixVariable = defaults.ipPrefixVariable;
        }

        @CustomType.Setter
        public Builder ipPrefix(@Nullable String ipPrefix) {

            this.ipPrefix = ipPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder ipPrefixVariable(@Nullable String ipPrefixVariable) {

            this.ipPrefixVariable = ipPrefixVariable;
            return this;
        }
        public PolicyObjectSecurityDataIpv4PrefixListEntry build() {
            final var _resultValue = new PolicyObjectSecurityDataIpv4PrefixListEntry();
            _resultValue.ipPrefix = ipPrefix;
            _resultValue.ipPrefixVariable = ipPrefixVariable;
            return _resultValue;
        }
    }
}
