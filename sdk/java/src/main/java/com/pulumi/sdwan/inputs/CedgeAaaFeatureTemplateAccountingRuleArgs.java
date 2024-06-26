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


public final class CedgeAaaFeatureTemplateAccountingRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final CedgeAaaFeatureTemplateAccountingRuleArgs Empty = new CedgeAaaFeatureTemplateAccountingRuleArgs();

    /**
     * Comma separated list of groups
     * 
     */
    @Import(name="groups")
    private @Nullable Output<String> groups;

    /**
     * @return Comma separated list of groups
     * 
     */
    public Optional<Output<String>> groups() {
        return Optional.ofNullable(this.groups);
    }

    /**
     * Configure Accounting Method
     *   - Choices: `commands`, `exec`, `network`, `system`
     * 
     */
    @Import(name="method")
    private @Nullable Output<String> method;

    /**
     * @return Configure Accounting Method
     *   - Choices: `commands`, `exec`, `network`, `system`
     * 
     */
    public Optional<Output<String>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * Configure Accounting Rule ID
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Configure Accounting Rule ID
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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
     * Privilege level when method is commands
     *   - Choices: `1`, `15`
     * 
     */
    @Import(name="privilegeLevel")
    private @Nullable Output<String> privilegeLevel;

    /**
     * @return Privilege level when method is commands
     *   - Choices: `1`, `15`
     * 
     */
    public Optional<Output<String>> privilegeLevel() {
        return Optional.ofNullable(this.privilegeLevel);
    }

    /**
     * Record start and stop without waiting
     *   - Default value: `true`
     * 
     */
    @Import(name="startStop")
    private @Nullable Output<Boolean> startStop;

    /**
     * @return Record start and stop without waiting
     *   - Default value: `true`
     * 
     */
    public Optional<Output<Boolean>> startStop() {
        return Optional.ofNullable(this.startStop);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="startStopVariable")
    private @Nullable Output<String> startStopVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> startStopVariable() {
        return Optional.ofNullable(this.startStopVariable);
    }

    private CedgeAaaFeatureTemplateAccountingRuleArgs() {}

    private CedgeAaaFeatureTemplateAccountingRuleArgs(CedgeAaaFeatureTemplateAccountingRuleArgs $) {
        this.groups = $.groups;
        this.method = $.method;
        this.name = $.name;
        this.optional = $.optional;
        this.privilegeLevel = $.privilegeLevel;
        this.startStop = $.startStop;
        this.startStopVariable = $.startStopVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CedgeAaaFeatureTemplateAccountingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CedgeAaaFeatureTemplateAccountingRuleArgs $;

        public Builder() {
            $ = new CedgeAaaFeatureTemplateAccountingRuleArgs();
        }

        public Builder(CedgeAaaFeatureTemplateAccountingRuleArgs defaults) {
            $ = new CedgeAaaFeatureTemplateAccountingRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groups Comma separated list of groups
         * 
         * @return builder
         * 
         */
        public Builder groups(@Nullable Output<String> groups) {
            $.groups = groups;
            return this;
        }

        /**
         * @param groups Comma separated list of groups
         * 
         * @return builder
         * 
         */
        public Builder groups(String groups) {
            return groups(Output.of(groups));
        }

        /**
         * @param method Configure Accounting Method
         *   - Choices: `commands`, `exec`, `network`, `system`
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method Configure Accounting Method
         *   - Choices: `commands`, `exec`, `network`, `system`
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        /**
         * @param name Configure Accounting Rule ID
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Configure Accounting Rule ID
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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
         * @param privilegeLevel Privilege level when method is commands
         *   - Choices: `1`, `15`
         * 
         * @return builder
         * 
         */
        public Builder privilegeLevel(@Nullable Output<String> privilegeLevel) {
            $.privilegeLevel = privilegeLevel;
            return this;
        }

        /**
         * @param privilegeLevel Privilege level when method is commands
         *   - Choices: `1`, `15`
         * 
         * @return builder
         * 
         */
        public Builder privilegeLevel(String privilegeLevel) {
            return privilegeLevel(Output.of(privilegeLevel));
        }

        /**
         * @param startStop Record start and stop without waiting
         *   - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder startStop(@Nullable Output<Boolean> startStop) {
            $.startStop = startStop;
            return this;
        }

        /**
         * @param startStop Record start and stop without waiting
         *   - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder startStop(Boolean startStop) {
            return startStop(Output.of(startStop));
        }

        /**
         * @param startStopVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder startStopVariable(@Nullable Output<String> startStopVariable) {
            $.startStopVariable = startStopVariable;
            return this;
        }

        /**
         * @param startStopVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder startStopVariable(String startStopVariable) {
            return startStopVariable(Output.of(startStopVariable));
        }

        public CedgeAaaFeatureTemplateAccountingRuleArgs build() {
            return $;
        }
    }

}
