// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CliConfigFeatureState extends com.pulumi.resources.ResourceArgs {

    public static final CliConfigFeatureState Empty = new CliConfigFeatureState();

    /**
     * CLI configuration
     * 
     */
    @Import(name="cliConfiguration")
    private @Nullable Output<String> cliConfiguration;

    /**
     * @return CLI configuration
     * 
     */
    public Optional<Output<String>> cliConfiguration() {
        return Optional.ofNullable(this.cliConfiguration);
    }

    /**
     * The description of the Feature
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Feature
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Feature Profile ID
     * 
     */
    @Import(name="featureProfileId")
    private @Nullable Output<String> featureProfileId;

    /**
     * @return Feature Profile ID
     * 
     */
    public Optional<Output<String>> featureProfileId() {
        return Optional.ofNullable(this.featureProfileId);
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

    /**
     * The version of the object
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return The version of the object
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private CliConfigFeatureState() {}

    private CliConfigFeatureState(CliConfigFeatureState $) {
        this.cliConfiguration = $.cliConfiguration;
        this.description = $.description;
        this.featureProfileId = $.featureProfileId;
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CliConfigFeatureState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CliConfigFeatureState $;

        public Builder() {
            $ = new CliConfigFeatureState();
        }

        public Builder(CliConfigFeatureState defaults) {
            $ = new CliConfigFeatureState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cliConfiguration CLI configuration
         * 
         * @return builder
         * 
         */
        public Builder cliConfiguration(@Nullable Output<String> cliConfiguration) {
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
        public Builder description(@Nullable Output<String> description) {
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
        public Builder featureProfileId(@Nullable Output<String> featureProfileId) {
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

        /**
         * @param version The version of the object
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the object
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public CliConfigFeatureState build() {
            return $;
        }
    }

}