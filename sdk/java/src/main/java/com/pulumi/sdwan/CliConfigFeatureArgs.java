// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CliConfigFeatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final CliConfigFeatureArgs Empty = new CliConfigFeatureArgs();

    /**
     * CLI configuration
     * 
     */
    @Import(name="cliConfiguration", required=true)
    private Output<String> cliConfiguration;

    /**
     * @return CLI configuration
     * 
     */
    public Output<String> cliConfiguration() {
        return this.cliConfiguration;
    }

    /**
     * The description of the Feature
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return The description of the Feature
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * Feature Profile ID
     * 
     */
    @Import(name="featureProfileId", required=true)
    private Output<String> featureProfileId;

    /**
     * @return Feature Profile ID
     * 
     */
    public Output<String> featureProfileId() {
        return this.featureProfileId;
    }

    /**
     * The name of the Feature
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Feature
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private CliConfigFeatureArgs() {}

    private CliConfigFeatureArgs(CliConfigFeatureArgs $) {
        this.cliConfiguration = $.cliConfiguration;
        this.description = $.description;
        this.featureProfileId = $.featureProfileId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CliConfigFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CliConfigFeatureArgs $;

        public Builder() {
            $ = new CliConfigFeatureArgs();
        }

        public Builder(CliConfigFeatureArgs defaults) {
            $ = new CliConfigFeatureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cliConfiguration CLI configuration
         * 
         * @return builder
         * 
         */
        public Builder cliConfiguration(Output<String> cliConfiguration) {
            $.cliConfiguration = cliConfiguration;
            return this;
        }

        /**
         * @param cliConfiguration CLI configuration
         * 
         * @return builder
         * 
         */
        public Builder cliConfiguration(String cliConfiguration) {
            return cliConfiguration(Output.of(cliConfiguration));
        }

        /**
         * @param description The description of the Feature
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Feature
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param featureProfileId Feature Profile ID
         * 
         * @return builder
         * 
         */
        public Builder featureProfileId(Output<String> featureProfileId) {
            $.featureProfileId = featureProfileId;
            return this;
        }

        /**
         * @param featureProfileId Feature Profile ID
         * 
         * @return builder
         * 
         */
        public Builder featureProfileId(String featureProfileId) {
            return featureProfileId(Output.of(featureProfileId));
        }

        /**
         * @param name The name of the Feature
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Feature
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public CliConfigFeatureArgs build() {
            if ($.cliConfiguration == null) {
                throw new MissingRequiredPropertyException("CliConfigFeatureArgs", "cliConfiguration");
            }
            if ($.description == null) {
                throw new MissingRequiredPropertyException("CliConfigFeatureArgs", "description");
            }
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("CliConfigFeatureArgs", "featureProfileId");
            }
            return $;
        }
    }

}