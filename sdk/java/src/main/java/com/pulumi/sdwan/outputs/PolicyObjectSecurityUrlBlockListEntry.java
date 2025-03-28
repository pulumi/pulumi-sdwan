// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyObjectSecurityUrlBlockListEntry {
    /**
     * @return valid url pattern
     * 
     */
    private @Nullable String pattern;

    private PolicyObjectSecurityUrlBlockListEntry() {}
    /**
     * @return valid url pattern
     * 
     */
    public Optional<String> pattern() {
        return Optional.ofNullable(this.pattern);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyObjectSecurityUrlBlockListEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String pattern;
        public Builder() {}
        public Builder(PolicyObjectSecurityUrlBlockListEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pattern = defaults.pattern;
        }

        @CustomType.Setter
        public Builder pattern(@Nullable String pattern) {

            this.pattern = pattern;
            return this;
        }
        public PolicyObjectSecurityUrlBlockListEntry build() {
            final var _resultValue = new PolicyObjectSecurityUrlBlockListEntry();
            _resultValue.pattern = pattern;
            return _resultValue;
        }
    }
}
