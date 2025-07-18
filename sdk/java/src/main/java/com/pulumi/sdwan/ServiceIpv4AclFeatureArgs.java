// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.inputs.ServiceIpv4AclFeatureSequenceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceIpv4AclFeatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIpv4AclFeatureArgs Empty = new ServiceIpv4AclFeatureArgs();

    /**
     * Default Action - Choices: `drop`, `accept` - Default value: `drop`
     * 
     */
    @Import(name="defaultAction")
    private @Nullable Output<String> defaultAction;

    /**
     * @return Default Action - Choices: `drop`, `accept` - Default value: `drop`
     * 
     */
    public Optional<Output<String>> defaultAction() {
        return Optional.ofNullable(this.defaultAction);
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

    /**
     * Access Control List
     * 
     */
    @Import(name="sequences")
    private @Nullable Output<List<ServiceIpv4AclFeatureSequenceArgs>> sequences;

    /**
     * @return Access Control List
     * 
     */
    public Optional<Output<List<ServiceIpv4AclFeatureSequenceArgs>>> sequences() {
        return Optional.ofNullable(this.sequences);
    }

    private ServiceIpv4AclFeatureArgs() {}

    private ServiceIpv4AclFeatureArgs(ServiceIpv4AclFeatureArgs $) {
        this.defaultAction = $.defaultAction;
        this.description = $.description;
        this.featureProfileId = $.featureProfileId;
        this.name = $.name;
        this.sequences = $.sequences;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIpv4AclFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIpv4AclFeatureArgs $;

        public Builder() {
            $ = new ServiceIpv4AclFeatureArgs();
        }

        public Builder(ServiceIpv4AclFeatureArgs defaults) {
            $ = new ServiceIpv4AclFeatureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultAction Default Action - Choices: `drop`, `accept` - Default value: `drop`
         * 
         * @return builder
         * 
         */
        public Builder defaultAction(@Nullable Output<String> defaultAction) {
            $.defaultAction = defaultAction;
            return this;
        }

        /**
         * @param defaultAction Default Action - Choices: `drop`, `accept` - Default value: `drop`
         * 
         * @return builder
         * 
         */
        public Builder defaultAction(String defaultAction) {
            return defaultAction(Output.of(defaultAction));
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

        /**
         * @param sequences Access Control List
         * 
         * @return builder
         * 
         */
        public Builder sequences(@Nullable Output<List<ServiceIpv4AclFeatureSequenceArgs>> sequences) {
            $.sequences = sequences;
            return this;
        }

        /**
         * @param sequences Access Control List
         * 
         * @return builder
         * 
         */
        public Builder sequences(List<ServiceIpv4AclFeatureSequenceArgs> sequences) {
            return sequences(Output.of(sequences));
        }

        /**
         * @param sequences Access Control List
         * 
         * @return builder
         * 
         */
        public Builder sequences(ServiceIpv4AclFeatureSequenceArgs... sequences) {
            return sequences(List.of(sequences));
        }

        public ServiceIpv4AclFeatureArgs build() {
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("ServiceIpv4AclFeatureArgs", "featureProfileId");
            }
            return $;
        }
    }

}
