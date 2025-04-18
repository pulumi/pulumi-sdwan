// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.inputs.PolicyObjectSecurityIdentityListEntryArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyObjectSecurityIdentityListArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyObjectSecurityIdentityListArgs Empty = new PolicyObjectSecurityIdentityListArgs();

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
     * Array of Users and User Groups
     * 
     */
    @Import(name="entries")
    private @Nullable Output<List<PolicyObjectSecurityIdentityListEntryArgs>> entries;

    /**
     * @return Array of Users and User Groups
     * 
     */
    public Optional<Output<List<PolicyObjectSecurityIdentityListEntryArgs>>> entries() {
        return Optional.ofNullable(this.entries);
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

    private PolicyObjectSecurityIdentityListArgs() {}

    private PolicyObjectSecurityIdentityListArgs(PolicyObjectSecurityIdentityListArgs $) {
        this.description = $.description;
        this.entries = $.entries;
        this.featureProfileId = $.featureProfileId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyObjectSecurityIdentityListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyObjectSecurityIdentityListArgs $;

        public Builder() {
            $ = new PolicyObjectSecurityIdentityListArgs();
        }

        public Builder(PolicyObjectSecurityIdentityListArgs defaults) {
            $ = new PolicyObjectSecurityIdentityListArgs(Objects.requireNonNull(defaults));
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
         * @param entries Array of Users and User Groups
         * 
         * @return builder
         * 
         */
        public Builder entries(@Nullable Output<List<PolicyObjectSecurityIdentityListEntryArgs>> entries) {
            $.entries = entries;
            return this;
        }

        /**
         * @param entries Array of Users and User Groups
         * 
         * @return builder
         * 
         */
        public Builder entries(List<PolicyObjectSecurityIdentityListEntryArgs> entries) {
            return entries(Output.of(entries));
        }

        /**
         * @param entries Array of Users and User Groups
         * 
         * @return builder
         * 
         */
        public Builder entries(PolicyObjectSecurityIdentityListEntryArgs... entries) {
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

        public PolicyObjectSecurityIdentityListArgs build() {
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("PolicyObjectSecurityIdentityListArgs", "featureProfileId");
            }
            return $;
        }
    }

}
