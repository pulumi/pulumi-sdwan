// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.inputs.DataIpv6PrefixListPolicyObjectEntryArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataIpv6PrefixListPolicyObjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataIpv6PrefixListPolicyObjectArgs Empty = new DataIpv6PrefixListPolicyObjectArgs();

    /**
     * List of entries
     * 
     */
    @Import(name="entries", required=true)
    private Output<List<DataIpv6PrefixListPolicyObjectEntryArgs>> entries;

    /**
     * @return List of entries
     * 
     */
    public Output<List<DataIpv6PrefixListPolicyObjectEntryArgs>> entries() {
        return this.entries;
    }

    /**
     * The name of the policy object
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the policy object
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private DataIpv6PrefixListPolicyObjectArgs() {}

    private DataIpv6PrefixListPolicyObjectArgs(DataIpv6PrefixListPolicyObjectArgs $) {
        this.entries = $.entries;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataIpv6PrefixListPolicyObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataIpv6PrefixListPolicyObjectArgs $;

        public Builder() {
            $ = new DataIpv6PrefixListPolicyObjectArgs();
        }

        public Builder(DataIpv6PrefixListPolicyObjectArgs defaults) {
            $ = new DataIpv6PrefixListPolicyObjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entries List of entries
         * 
         * @return builder
         * 
         */
        public Builder entries(Output<List<DataIpv6PrefixListPolicyObjectEntryArgs>> entries) {
            $.entries = entries;
            return this;
        }

        /**
         * @param entries List of entries
         * 
         * @return builder
         * 
         */
        public Builder entries(List<DataIpv6PrefixListPolicyObjectEntryArgs> entries) {
            return entries(Output.of(entries));
        }

        /**
         * @param entries List of entries
         * 
         * @return builder
         * 
         */
        public Builder entries(DataIpv6PrefixListPolicyObjectEntryArgs... entries) {
            return entries(List.of(entries));
        }

        /**
         * @param name The name of the policy object
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the policy object
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public DataIpv6PrefixListPolicyObjectArgs build() {
            if ($.entries == null) {
                throw new MissingRequiredPropertyException("DataIpv6PrefixListPolicyObjectArgs", "entries");
            }
            return $;
        }
    }

}
