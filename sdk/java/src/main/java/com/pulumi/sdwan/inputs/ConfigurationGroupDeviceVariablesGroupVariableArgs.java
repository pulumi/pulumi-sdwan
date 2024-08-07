// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationGroupDeviceVariablesGroupVariableArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationGroupDeviceVariablesGroupVariableArgs Empty = new ConfigurationGroupDeviceVariablesGroupVariableArgs();

    /**
     * Variable name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Variable value
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Variable value
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private ConfigurationGroupDeviceVariablesGroupVariableArgs() {}

    private ConfigurationGroupDeviceVariablesGroupVariableArgs(ConfigurationGroupDeviceVariablesGroupVariableArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationGroupDeviceVariablesGroupVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationGroupDeviceVariablesGroupVariableArgs $;

        public Builder() {
            $ = new ConfigurationGroupDeviceVariablesGroupVariableArgs();
        }

        public Builder(ConfigurationGroupDeviceVariablesGroupVariableArgs defaults) {
            $ = new ConfigurationGroupDeviceVariablesGroupVariableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Variable name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Variable name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value Variable value
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Variable value
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ConfigurationGroupDeviceVariablesGroupVariableArgs build() {
            if ($.value == null) {
                throw new MissingRequiredPropertyException("ConfigurationGroupDeviceVariablesGroupVariableArgs", "value");
            }
            return $;
        }
    }

}
