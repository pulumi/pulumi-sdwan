// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SystemSnmpFeatureCommunityArgs extends com.pulumi.resources.ResourceArgs {

    public static final SystemSnmpFeatureCommunityArgs Empty = new SystemSnmpFeatureCommunityArgs();

    /**
     * Configure access permissions
     *   - Choices: `read-only`, `read-write`
     * 
     */
    @Import(name="authorization")
    private @Nullable Output<String> authorization;

    /**
     * @return Configure access permissions
     *   - Choices: `read-only`, `read-write`
     * 
     */
    public Optional<Output<String>> authorization() {
        return Optional.ofNullable(this.authorization);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="authorizationVariable")
    private @Nullable Output<String> authorizationVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> authorizationVariable() {
        return Optional.ofNullable(this.authorizationVariable);
    }

    /**
     * Set name of the SNMP community
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Set name of the SNMP community
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Set user label of the SNMP community
     * 
     */
    @Import(name="userLabel")
    private @Nullable Output<String> userLabel;

    /**
     * @return Set user label of the SNMP community
     * 
     */
    public Optional<Output<String>> userLabel() {
        return Optional.ofNullable(this.userLabel);
    }

    /**
     * Set name of the SNMP view
     * 
     */
    @Import(name="view")
    private @Nullable Output<String> view;

    /**
     * @return Set name of the SNMP view
     * 
     */
    public Optional<Output<String>> view() {
        return Optional.ofNullable(this.view);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="viewVariable")
    private @Nullable Output<String> viewVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> viewVariable() {
        return Optional.ofNullable(this.viewVariable);
    }

    private SystemSnmpFeatureCommunityArgs() {}

    private SystemSnmpFeatureCommunityArgs(SystemSnmpFeatureCommunityArgs $) {
        this.authorization = $.authorization;
        this.authorizationVariable = $.authorizationVariable;
        this.name = $.name;
        this.userLabel = $.userLabel;
        this.view = $.view;
        this.viewVariable = $.viewVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SystemSnmpFeatureCommunityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SystemSnmpFeatureCommunityArgs $;

        public Builder() {
            $ = new SystemSnmpFeatureCommunityArgs();
        }

        public Builder(SystemSnmpFeatureCommunityArgs defaults) {
            $ = new SystemSnmpFeatureCommunityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorization Configure access permissions
         *   - Choices: `read-only`, `read-write`
         * 
         * @return builder
         * 
         */
        public Builder authorization(@Nullable Output<String> authorization) {
            $.authorization = authorization;
            return this;
        }

        /**
         * @param authorization Configure access permissions
         *   - Choices: `read-only`, `read-write`
         * 
         * @return builder
         * 
         */
        public Builder authorization(String authorization) {
            return authorization(Output.of(authorization));
        }

        /**
         * @param authorizationVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder authorizationVariable(@Nullable Output<String> authorizationVariable) {
            $.authorizationVariable = authorizationVariable;
            return this;
        }

        /**
         * @param authorizationVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder authorizationVariable(String authorizationVariable) {
            return authorizationVariable(Output.of(authorizationVariable));
        }

        /**
         * @param name Set name of the SNMP community
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Set name of the SNMP community
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param userLabel Set user label of the SNMP community
         * 
         * @return builder
         * 
         */
        public Builder userLabel(@Nullable Output<String> userLabel) {
            $.userLabel = userLabel;
            return this;
        }

        /**
         * @param userLabel Set user label of the SNMP community
         * 
         * @return builder
         * 
         */
        public Builder userLabel(String userLabel) {
            return userLabel(Output.of(userLabel));
        }

        /**
         * @param view Set name of the SNMP view
         * 
         * @return builder
         * 
         */
        public Builder view(@Nullable Output<String> view) {
            $.view = view;
            return this;
        }

        /**
         * @param view Set name of the SNMP view
         * 
         * @return builder
         * 
         */
        public Builder view(String view) {
            return view(Output.of(view));
        }

        /**
         * @param viewVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder viewVariable(@Nullable Output<String> viewVariable) {
            $.viewVariable = viewVariable;
            return this;
        }

        /**
         * @param viewVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder viewVariable(String viewVariable) {
            return viewVariable(Output.of(viewVariable));
        }

        public SystemSnmpFeatureCommunityArgs build() {
            return $;
        }
    }

}
