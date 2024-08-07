// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CiscoOspfFeatureTemplateRoutePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final CiscoOspfFeatureTemplateRoutePolicyArgs Empty = new CiscoOspfFeatureTemplateRoutePolicyArgs();

    /**
     * Set direction to apply policy
     *   - Choices: `in`
     * 
     */
    @Import(name="direction")
    private @Nullable Output<String> direction;

    /**
     * @return Set direction to apply policy
     *   - Choices: `in`
     * 
     */
    public Optional<Output<String>> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="directionVariable")
    private @Nullable Output<String> directionVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> directionVariable() {
        return Optional.ofNullable(this.directionVariable);
    }

    /**
     * Indicates if list item is considered optional.
     * 
     */
    @Import(name="optional")
    private @Nullable Output<Boolean> optional;

    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Optional<Output<Boolean>> optional() {
        return Optional.ofNullable(this.optional);
    }

    /**
     * Name of route policy
     * 
     */
    @Import(name="policyName")
    private @Nullable Output<String> policyName;

    /**
     * @return Name of route policy
     * 
     */
    public Optional<Output<String>> policyName() {
        return Optional.ofNullable(this.policyName);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="policyNameVariable")
    private @Nullable Output<String> policyNameVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> policyNameVariable() {
        return Optional.ofNullable(this.policyNameVariable);
    }

    private CiscoOspfFeatureTemplateRoutePolicyArgs() {}

    private CiscoOspfFeatureTemplateRoutePolicyArgs(CiscoOspfFeatureTemplateRoutePolicyArgs $) {
        this.direction = $.direction;
        this.directionVariable = $.directionVariable;
        this.optional = $.optional;
        this.policyName = $.policyName;
        this.policyNameVariable = $.policyNameVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CiscoOspfFeatureTemplateRoutePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CiscoOspfFeatureTemplateRoutePolicyArgs $;

        public Builder() {
            $ = new CiscoOspfFeatureTemplateRoutePolicyArgs();
        }

        public Builder(CiscoOspfFeatureTemplateRoutePolicyArgs defaults) {
            $ = new CiscoOspfFeatureTemplateRoutePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param direction Set direction to apply policy
         *   - Choices: `in`
         * 
         * @return builder
         * 
         */
        public Builder direction(@Nullable Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction Set direction to apply policy
         *   - Choices: `in`
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param directionVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder directionVariable(@Nullable Output<String> directionVariable) {
            $.directionVariable = directionVariable;
            return this;
        }

        /**
         * @param directionVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder directionVariable(String directionVariable) {
            return directionVariable(Output.of(directionVariable));
        }

        /**
         * @param optional Indicates if list item is considered optional.
         * 
         * @return builder
         * 
         */
        public Builder optional(@Nullable Output<Boolean> optional) {
            $.optional = optional;
            return this;
        }

        /**
         * @param optional Indicates if list item is considered optional.
         * 
         * @return builder
         * 
         */
        public Builder optional(Boolean optional) {
            return optional(Output.of(optional));
        }

        /**
         * @param policyName Name of route policy
         * 
         * @return builder
         * 
         */
        public Builder policyName(@Nullable Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName Name of route policy
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        /**
         * @param policyNameVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder policyNameVariable(@Nullable Output<String> policyNameVariable) {
            $.policyNameVariable = policyNameVariable;
            return this;
        }

        /**
         * @param policyNameVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder policyNameVariable(String policyNameVariable) {
            return policyNameVariable(Output.of(policyNameVariable));
        }

        public CiscoOspfFeatureTemplateRoutePolicyArgs build() {
            return $;
        }
    }

}
