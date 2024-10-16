// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sdwan.inputs.VpnMembershipPolicyDefinitionSiteArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpnMembershipPolicyDefinitionState extends com.pulumi.resources.ResourceArgs {

    public static final VpnMembershipPolicyDefinitionState Empty = new VpnMembershipPolicyDefinitionState();

    /**
     * The description of the policy definition
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the policy definition
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the policy definition
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the policy definition
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * List of sites
     * 
     */
    @Import(name="sites")
    private @Nullable Output<List<VpnMembershipPolicyDefinitionSiteArgs>> sites;

    /**
     * @return List of sites
     * 
     */
    public Optional<Output<List<VpnMembershipPolicyDefinitionSiteArgs>>> sites() {
        return Optional.ofNullable(this.sites);
    }

    /**
     * Type
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
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

    private VpnMembershipPolicyDefinitionState() {}

    private VpnMembershipPolicyDefinitionState(VpnMembershipPolicyDefinitionState $) {
        this.description = $.description;
        this.name = $.name;
        this.sites = $.sites;
        this.type = $.type;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnMembershipPolicyDefinitionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnMembershipPolicyDefinitionState $;

        public Builder() {
            $ = new VpnMembershipPolicyDefinitionState();
        }

        public Builder(VpnMembershipPolicyDefinitionState defaults) {
            $ = new VpnMembershipPolicyDefinitionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the policy definition
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the policy definition
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the policy definition
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the policy definition
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sites List of sites
         * 
         * @return builder
         * 
         */
        public Builder sites(@Nullable Output<List<VpnMembershipPolicyDefinitionSiteArgs>> sites) {
            $.sites = sites;
            return this;
        }

        /**
         * @param sites List of sites
         * 
         * @return builder
         * 
         */
        public Builder sites(List<VpnMembershipPolicyDefinitionSiteArgs> sites) {
            return sites(Output.of(sites));
        }

        /**
         * @param sites List of sites
         * 
         * @return builder
         * 
         */
        public Builder sites(VpnMembershipPolicyDefinitionSiteArgs... sites) {
            return sites(List.of(sites));
        }

        /**
         * @param type Type
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
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

        public VpnMembershipPolicyDefinitionState build() {
            return $;
        }
    }

}
