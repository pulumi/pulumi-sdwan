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


public final class ApplicationPriorityFeatureProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationPriorityFeatureProfileArgs Empty = new ApplicationPriorityFeatureProfileArgs();

    /**
     * Description
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return Description
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * The name of the application priority feature profile
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the application priority feature profile
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ApplicationPriorityFeatureProfileArgs() {}

    private ApplicationPriorityFeatureProfileArgs(ApplicationPriorityFeatureProfileArgs $) {
        this.description = $.description;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationPriorityFeatureProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationPriorityFeatureProfileArgs $;

        public Builder() {
            $ = new ApplicationPriorityFeatureProfileArgs();
        }

        public Builder(ApplicationPriorityFeatureProfileArgs defaults) {
            $ = new ApplicationPriorityFeatureProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the application priority feature profile
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the application priority feature profile
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ApplicationPriorityFeatureProfileArgs build() {
            if ($.description == null) {
                throw new MissingRequiredPropertyException("ApplicationPriorityFeatureProfileArgs", "description");
            }
            return $;
        }
    }

}
