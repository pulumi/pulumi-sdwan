// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BlockUrlListPolicyObjectEntry {
    /**
     * @return URL
     * 
     */
    private @Nullable String url;

    private BlockUrlListPolicyObjectEntry() {}
    /**
     * @return URL
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlockUrlListPolicyObjectEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String url;
        public Builder() {}
        public Builder(BlockUrlListPolicyObjectEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder url(@Nullable String url) {

            this.url = url;
            return this;
        }
        public BlockUrlListPolicyObjectEntry build() {
            final var _resultValue = new BlockUrlListPolicyObjectEntry();
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
