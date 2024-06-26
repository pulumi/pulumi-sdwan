// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigurationGroupDeviceVariablesGroupVariable {
    /**
     * @return Variable name
     * 
     */
    private @Nullable String name;
    /**
     * @return Variable value
     * 
     */
    private String value;

    private ConfigurationGroupDeviceVariablesGroupVariable() {}
    /**
     * @return Variable name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Variable value
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationGroupDeviceVariablesGroupVariable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private String value;
        public Builder() {}
        public Builder(ConfigurationGroupDeviceVariablesGroupVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("ConfigurationGroupDeviceVariablesGroupVariable", "value");
            }
            this.value = value;
            return this;
        }
        public ConfigurationGroupDeviceVariablesGroupVariable build() {
            final var _resultValue = new ConfigurationGroupDeviceVariablesGroupVariable();
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
