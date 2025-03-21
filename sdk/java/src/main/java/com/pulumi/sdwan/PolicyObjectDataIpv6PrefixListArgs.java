// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.inputs.PolicyObjectDataIpv6PrefixListEntryArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyObjectDataIpv6PrefixListArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyObjectDataIpv6PrefixListArgs Empty = new PolicyObjectDataIpv6PrefixListArgs();

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
     * IPv6 Prefix List
     * 
     */
    @Import(name="entries", required=true)
    private Output<List<PolicyObjectDataIpv6PrefixListEntryArgs>> entries;

    /**
     * @return IPv6 Prefix List
     * 
     */
    public Output<List<PolicyObjectDataIpv6PrefixListEntryArgs>> entries() {
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

    private PolicyObjectDataIpv6PrefixListArgs() {}

    private PolicyObjectDataIpv6PrefixListArgs(PolicyObjectDataIpv6PrefixListArgs $) {
        this.description = $.description;
        this.entries = $.entries;
        this.featureProfileId = $.featureProfileId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyObjectDataIpv6PrefixListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyObjectDataIpv6PrefixListArgs $;

        public Builder() {
            $ = new PolicyObjectDataIpv6PrefixListArgs();
        }

        public Builder(PolicyObjectDataIpv6PrefixListArgs defaults) {
            $ = new PolicyObjectDataIpv6PrefixListArgs(Objects.requireNonNull(defaults));
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
         * @param entries IPv6 Prefix List
         * 
         * @return builder
         * 
         */
        public Builder entries(Output<List<PolicyObjectDataIpv6PrefixListEntryArgs>> entries) {
            $.entries = entries;
            return this;
        }

        /**
         * @param entries IPv6 Prefix List
         * 
         * @return builder
         * 
         */
        public Builder entries(List<PolicyObjectDataIpv6PrefixListEntryArgs> entries) {
            return entries(Output.of(entries));
        }

        /**
         * @param entries IPv6 Prefix List
         * 
         * @return builder
         * 
         */
        public Builder entries(PolicyObjectDataIpv6PrefixListEntryArgs... entries) {
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

        public PolicyObjectDataIpv6PrefixListArgs build() {
            if ($.entries == null) {
                throw new MissingRequiredPropertyException("PolicyObjectDataIpv6PrefixListArgs", "entries");
            }
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("PolicyObjectDataIpv6PrefixListArgs", "featureProfileId");
            }
            return $;
        }
    }

}
