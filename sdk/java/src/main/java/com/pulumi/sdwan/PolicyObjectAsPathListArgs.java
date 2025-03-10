// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.inputs.PolicyObjectAsPathListEntryArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyObjectAsPathListArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyObjectAsPathListArgs Empty = new PolicyObjectAsPathListArgs();

    /**
     * As path List Number - Range: `1`-`500`
     * 
     */
    @Import(name="asPathListId", required=true)
    private Output<Integer> asPathListId;

    /**
     * @return As path List Number - Range: `1`-`500`
     * 
     */
    public Output<Integer> asPathListId() {
        return this.asPathListId;
    }

    /**
     * The description of the Policy_object
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Policy_object
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * AS Path List
     * 
     */
    @Import(name="entries", required=true)
    private Output<List<PolicyObjectAsPathListEntryArgs>> entries;

    /**
     * @return AS Path List
     * 
     */
    public Output<List<PolicyObjectAsPathListEntryArgs>> entries() {
        return this.entries;
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
     * The name of the Policy_object
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Policy_object
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private PolicyObjectAsPathListArgs() {}

    private PolicyObjectAsPathListArgs(PolicyObjectAsPathListArgs $) {
        this.asPathListId = $.asPathListId;
        this.description = $.description;
        this.entries = $.entries;
        this.featureProfileId = $.featureProfileId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyObjectAsPathListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyObjectAsPathListArgs $;

        public Builder() {
            $ = new PolicyObjectAsPathListArgs();
        }

        public Builder(PolicyObjectAsPathListArgs defaults) {
            $ = new PolicyObjectAsPathListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param asPathListId As path List Number - Range: `1`-`500`
         * 
         * @return builder
         * 
         */
        public Builder asPathListId(Output<Integer> asPathListId) {
            $.asPathListId = asPathListId;
            return this;
        }

        /**
         * @param asPathListId As path List Number - Range: `1`-`500`
         * 
         * @return builder
         * 
         */
        public Builder asPathListId(Integer asPathListId) {
            return asPathListId(Output.of(asPathListId));
        }

        /**
         * @param description The description of the Policy_object
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Policy_object
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param entries AS Path List
         * 
         * @return builder
         * 
         */
        public Builder entries(Output<List<PolicyObjectAsPathListEntryArgs>> entries) {
            $.entries = entries;
            return this;
        }

        /**
         * @param entries AS Path List
         * 
         * @return builder
         * 
         */
        public Builder entries(List<PolicyObjectAsPathListEntryArgs> entries) {
            return entries(Output.of(entries));
        }

        /**
         * @param entries AS Path List
         * 
         * @return builder
         * 
         */
        public Builder entries(PolicyObjectAsPathListEntryArgs... entries) {
            return entries(List.of(entries));
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
         * @param name The name of the Policy_object
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Policy_object
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public PolicyObjectAsPathListArgs build() {
            if ($.asPathListId == null) {
                throw new MissingRequiredPropertyException("PolicyObjectAsPathListArgs", "asPathListId");
            }
            if ($.entries == null) {
                throw new MissingRequiredPropertyException("PolicyObjectAsPathListArgs", "entries");
            }
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("PolicyObjectAsPathListArgs", "featureProfileId");
            }
            return $;
        }
    }

}
