// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sdwan.inputs.RegionListPolicyObjectEntryArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionListPolicyObjectState extends com.pulumi.resources.ResourceArgs {

    public static final RegionListPolicyObjectState Empty = new RegionListPolicyObjectState();

    /**
     * List of entries
     * 
     */
    @Import(name="entries")
    private @Nullable Output<List<RegionListPolicyObjectEntryArgs>> entries;

    /**
     * @return List of entries
     * 
     */
    public Optional<Output<List<RegionListPolicyObjectEntryArgs>>> entries() {
        return Optional.ofNullable(this.entries);
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

    private RegionListPolicyObjectState() {}

    private RegionListPolicyObjectState(RegionListPolicyObjectState $) {
        this.entries = $.entries;
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionListPolicyObjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionListPolicyObjectState $;

        public Builder() {
            $ = new RegionListPolicyObjectState();
        }

        public Builder(RegionListPolicyObjectState defaults) {
            $ = new RegionListPolicyObjectState(Objects.requireNonNull(defaults));
        }

        /**
         * @param entries List of entries
         * 
         * @return builder
         * 
         */
        public Builder entries(@Nullable Output<List<RegionListPolicyObjectEntryArgs>> entries) {
            $.entries = entries;
            return this;
        }

        /**
         * @param entries List of entries
         * 
         * @return builder
         * 
         */
        public Builder entries(List<RegionListPolicyObjectEntryArgs> entries) {
            return entries(Output.of(entries));
        }

        /**
         * @param entries List of entries
         * 
         * @return builder
         * 
         */
        public Builder entries(RegionListPolicyObjectEntryArgs... entries) {
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

        public RegionListPolicyObjectState build() {
            return $;
        }
    }

}
