// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyObjectClassMapEntry {
    /**
     * @return select a queue
     *   - Choices: `0`, `1`, `2`, `3`, `4`, `5`, `6`, `7`
     * 
     */
    private @Nullable String queue;

    private PolicyObjectClassMapEntry() {}
    /**
     * @return select a queue
     *   - Choices: `0`, `1`, `2`, `3`, `4`, `5`, `6`, `7`
     * 
     */
    public Optional<String> queue() {
        return Optional.ofNullable(this.queue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyObjectClassMapEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String queue;
        public Builder() {}
        public Builder(PolicyObjectClassMapEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queue = defaults.queue;
        }

        @CustomType.Setter
        public Builder queue(@Nullable String queue) {

            this.queue = queue;
            return this;
        }
        public PolicyObjectClassMapEntry build() {
            final var _resultValue = new PolicyObjectClassMapEntry();
            _resultValue.queue = queue;
            return _resultValue;
        }
    }
}