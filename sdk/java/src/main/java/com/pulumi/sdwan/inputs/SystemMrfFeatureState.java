// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SystemMrfFeatureState extends com.pulumi.resources.ResourceArgs {

    public static final SystemMrfFeatureState Empty = new SystemMrfFeatureState();

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
     * Enable migration mode to Multi-Region Fabric - Choices: `enabled`, `enabled-from-bgp-core`
     * 
     */
    @Import(name="enableMigrationToMrf")
    private @Nullable Output<String> enableMigrationToMrf;

    /**
     * @return Enable migration mode to Multi-Region Fabric - Choices: `enabled`, `enabled-from-bgp-core`
     * 
     */
    public Optional<Output<String>> enableMigrationToMrf() {
        return Optional.ofNullable(this.enableMigrationToMrf);
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
     * Set BGP community during migration from BGP-core based network - Range: `1`-`4294967295`
     * 
     */
    @Import(name="migrationBgpCommunity")
    private @Nullable Output<Integer> migrationBgpCommunity;

    /**
     * @return Set BGP community during migration from BGP-core based network - Range: `1`-`4294967295`
     * 
     */
    public Optional<Output<Integer>> migrationBgpCommunity() {
        return Optional.ofNullable(this.migrationBgpCommunity);
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
     * Set region ID - Range: `1`-`63`
     * 
     */
    @Import(name="regionId")
    private @Nullable Output<Integer> regionId;

    /**
     * @return Set region ID - Range: `1`-`63`
     * 
     */
    public Optional<Output<Integer>> regionId() {
        return Optional.ofNullable(this.regionId);
    }

    /**
     * Set the role for router - Choices: `edge-router`, `border-router`
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return Set the role for router - Choices: `edge-router`, `border-router`
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="roleVariable")
    private @Nullable Output<String> roleVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> roleVariable() {
        return Optional.ofNullable(this.roleVariable);
    }

    /**
     * Set secondary region ID - Range: `1`-`63`
     * 
     */
    @Import(name="secondaryRegionId")
    private @Nullable Output<Integer> secondaryRegionId;

    /**
     * @return Set secondary region ID - Range: `1`-`63`
     * 
     */
    public Optional<Output<Integer>> secondaryRegionId() {
        return Optional.ofNullable(this.secondaryRegionId);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="secondaryRegionIdVariable")
    private @Nullable Output<String> secondaryRegionIdVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> secondaryRegionIdVariable() {
        return Optional.ofNullable(this.secondaryRegionIdVariable);
    }

    /**
     * The version of the Feature
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return The version of the Feature
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private SystemMrfFeatureState() {}

    private SystemMrfFeatureState(SystemMrfFeatureState $) {
        this.description = $.description;
        this.enableMigrationToMrf = $.enableMigrationToMrf;
        this.featureProfileId = $.featureProfileId;
        this.migrationBgpCommunity = $.migrationBgpCommunity;
        this.name = $.name;
        this.regionId = $.regionId;
        this.role = $.role;
        this.roleVariable = $.roleVariable;
        this.secondaryRegionId = $.secondaryRegionId;
        this.secondaryRegionIdVariable = $.secondaryRegionIdVariable;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SystemMrfFeatureState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SystemMrfFeatureState $;

        public Builder() {
            $ = new SystemMrfFeatureState();
        }

        public Builder(SystemMrfFeatureState defaults) {
            $ = new SystemMrfFeatureState(Objects.requireNonNull(defaults));
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
         * @param enableMigrationToMrf Enable migration mode to Multi-Region Fabric - Choices: `enabled`, `enabled-from-bgp-core`
         * 
         * @return builder
         * 
         */
        public Builder enableMigrationToMrf(@Nullable Output<String> enableMigrationToMrf) {
            $.enableMigrationToMrf = enableMigrationToMrf;
            return this;
        }

        /**
         * @param enableMigrationToMrf Enable migration mode to Multi-Region Fabric - Choices: `enabled`, `enabled-from-bgp-core`
         * 
         * @return builder
         * 
         */
        public Builder enableMigrationToMrf(String enableMigrationToMrf) {
            return enableMigrationToMrf(Output.of(enableMigrationToMrf));
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
         * @param migrationBgpCommunity Set BGP community during migration from BGP-core based network - Range: `1`-`4294967295`
         * 
         * @return builder
         * 
         */
        public Builder migrationBgpCommunity(@Nullable Output<Integer> migrationBgpCommunity) {
            $.migrationBgpCommunity = migrationBgpCommunity;
            return this;
        }

        /**
         * @param migrationBgpCommunity Set BGP community during migration from BGP-core based network - Range: `1`-`4294967295`
         * 
         * @return builder
         * 
         */
        public Builder migrationBgpCommunity(Integer migrationBgpCommunity) {
            return migrationBgpCommunity(Output.of(migrationBgpCommunity));
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
         * @param regionId Set region ID - Range: `1`-`63`
         * 
         * @return builder
         * 
         */
        public Builder regionId(@Nullable Output<Integer> regionId) {
            $.regionId = regionId;
            return this;
        }

        /**
         * @param regionId Set region ID - Range: `1`-`63`
         * 
         * @return builder
         * 
         */
        public Builder regionId(Integer regionId) {
            return regionId(Output.of(regionId));
        }

        /**
         * @param role Set the role for router - Choices: `edge-router`, `border-router`
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role Set the role for router - Choices: `edge-router`, `border-router`
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param roleVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder roleVariable(@Nullable Output<String> roleVariable) {
            $.roleVariable = roleVariable;
            return this;
        }

        /**
         * @param roleVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder roleVariable(String roleVariable) {
            return roleVariable(Output.of(roleVariable));
        }

        /**
         * @param secondaryRegionId Set secondary region ID - Range: `1`-`63`
         * 
         * @return builder
         * 
         */
        public Builder secondaryRegionId(@Nullable Output<Integer> secondaryRegionId) {
            $.secondaryRegionId = secondaryRegionId;
            return this;
        }

        /**
         * @param secondaryRegionId Set secondary region ID - Range: `1`-`63`
         * 
         * @return builder
         * 
         */
        public Builder secondaryRegionId(Integer secondaryRegionId) {
            return secondaryRegionId(Output.of(secondaryRegionId));
        }

        /**
         * @param secondaryRegionIdVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder secondaryRegionIdVariable(@Nullable Output<String> secondaryRegionIdVariable) {
            $.secondaryRegionIdVariable = secondaryRegionIdVariable;
            return this;
        }

        /**
         * @param secondaryRegionIdVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder secondaryRegionIdVariable(String secondaryRegionIdVariable) {
            return secondaryRegionIdVariable(Output.of(secondaryRegionIdVariable));
        }

        /**
         * @param version The version of the Feature
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the Feature
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public SystemMrfFeatureState build() {
            return $;
        }
    }

}
