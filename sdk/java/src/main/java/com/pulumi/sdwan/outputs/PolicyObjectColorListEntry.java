// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyObjectColorListEntry {
    /**
     * @return - Choices: `3g`, `biz-internet`, `blue`, `bronze`, `custom1`, `custom2`, `custom3`, `default`, `gold`, `green`, `lte`, `metro-ethernet`, `mpls`, `private1`, `private2`, `private3`, `private4`, `private5`, `private6`, `public-internet`, `red`, `silver`
     * 
     */
    private @Nullable String color;

    private PolicyObjectColorListEntry() {}
    /**
     * @return - Choices: `3g`, `biz-internet`, `blue`, `bronze`, `custom1`, `custom2`, `custom3`, `default`, `gold`, `green`, `lte`, `metro-ethernet`, `mpls`, `private1`, `private2`, `private3`, `private4`, `private5`, `private6`, `public-internet`, `red`, `silver`
     * 
     */
    public Optional<String> color() {
        return Optional.ofNullable(this.color);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyObjectColorListEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String color;
        public Builder() {}
        public Builder(PolicyObjectColorListEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.color = defaults.color;
        }

        @CustomType.Setter
        public Builder color(@Nullable String color) {

            this.color = color;
            return this;
        }
        public PolicyObjectColorListEntry build() {
            final var _resultValue = new PolicyObjectColorListEntry();
            _resultValue.color = color;
            return _resultValue;
        }
    }
}
