// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.inputs.TlocListPolicyObjectEntryArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TlocListPolicyObjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final TlocListPolicyObjectArgs Empty = new TlocListPolicyObjectArgs();

    /**
     * List of entries
     * 
     */
    @Import(name="entries", required=true)
    private Output<List<TlocListPolicyObjectEntryArgs>> entries;

    /**
     * @return List of entries
     * 
     */
    public Output<List<TlocListPolicyObjectEntryArgs>> entries() {
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

    private TlocListPolicyObjectArgs() {}

    private TlocListPolicyObjectArgs(TlocListPolicyObjectArgs $) {
        this.entries = $.entries;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TlocListPolicyObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlocListPolicyObjectArgs $;

        public Builder() {
            $ = new TlocListPolicyObjectArgs();
        }

        public Builder(TlocListPolicyObjectArgs defaults) {
            $ = new TlocListPolicyObjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entries List of entries
         * 
         * @return builder
         * 
         */
        public Builder entries(Output<List<TlocListPolicyObjectEntryArgs>> entries) {
            $.entries = entries;
            return this;
        }

        /**
         * @param entries List of entries
         * 
         * @return builder
         * 
         */
        public Builder entries(List<TlocListPolicyObjectEntryArgs> entries) {
            return entries(Output.of(entries));
        }

        /**
         * @param entries List of entries
         * 
         * @return builder
         * 
         */
        public Builder entries(TlocListPolicyObjectEntryArgs... entries) {
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

        public TlocListPolicyObjectArgs build() {
            if ($.entries == null) {
                throw new MissingRequiredPropertyException("TlocListPolicyObjectArgs", "entries");
            }
            return $;
        }
    }

}
