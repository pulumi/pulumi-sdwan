// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProtocolListPolicyObjectEntry {
    /**
     * @return Protocol name
     * 
     */
    private @Nullable String protocol;

    private ProtocolListPolicyObjectEntry() {}
    /**
     * @return Protocol name
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProtocolListPolicyObjectEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String protocol;
        public Builder() {}
        public Builder(ProtocolListPolicyObjectEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protocol = defaults.protocol;
        }

        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {

            this.protocol = protocol;
            return this;
        }
        public ProtocolListPolicyObjectEntry build() {
            final var _resultValue = new ProtocolListPolicyObjectEntry();
            _resultValue.protocol = protocol;
            return _resultValue;
        }
    }
}
