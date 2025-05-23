// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sdwan.inputs.PolicyObjectSecurityScalableGroupTagListEntryArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyObjectSecurityScalableGroupTagListState extends com.pulumi.resources.ResourceArgs {

    public static final PolicyObjectSecurityScalableGroupTagListState Empty = new PolicyObjectSecurityScalableGroupTagListState();

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

    @Import(name="entries")
    private @Nullable Output<List<PolicyObjectSecurityScalableGroupTagListEntryArgs>> entries;

    public Optional<Output<List<PolicyObjectSecurityScalableGroupTagListEntryArgs>>> entries() {
        return Optional.ofNullable(this.entries);
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

    /**
     * The version of the Policy_object
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return The version of the Policy_object
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private PolicyObjectSecurityScalableGroupTagListState() {}

    private PolicyObjectSecurityScalableGroupTagListState(PolicyObjectSecurityScalableGroupTagListState $) {
        this.description = $.description;
        this.entries = $.entries;
        this.featureProfileId = $.featureProfileId;
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyObjectSecurityScalableGroupTagListState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyObjectSecurityScalableGroupTagListState $;

        public Builder() {
            $ = new PolicyObjectSecurityScalableGroupTagListState();
        }

        public Builder(PolicyObjectSecurityScalableGroupTagListState defaults) {
            $ = new PolicyObjectSecurityScalableGroupTagListState(Objects.requireNonNull(defaults));
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

        public Builder entries(@Nullable Output<List<PolicyObjectSecurityScalableGroupTagListEntryArgs>> entries) {
            $.entries = entries;
            return this;
        }

        public Builder entries(List<PolicyObjectSecurityScalableGroupTagListEntryArgs> entries) {
            return entries(Output.of(entries));
        }

        public Builder entries(PolicyObjectSecurityScalableGroupTagListEntryArgs... entries) {
            return entries(List.of(entries));
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

        /**
         * @param version The version of the Policy_object
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the Policy_object
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public PolicyObjectSecurityScalableGroupTagListState build() {
            return $;
        }
    }

}
