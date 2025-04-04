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


public final class CiscoSnmpFeatureTemplateUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final CiscoSnmpFeatureTemplateUserArgs Empty = new CiscoSnmpFeatureTemplateUserArgs();

    /**
     * Specify authentication protocol password
     * 
     */
    @Import(name="authenticationPassword")
    private @Nullable Output<String> authenticationPassword;

    /**
     * @return Specify authentication protocol password
     * 
     */
    public Optional<Output<String>> authenticationPassword() {
        return Optional.ofNullable(this.authenticationPassword);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="authenticationPasswordVariable")
    private @Nullable Output<String> authenticationPasswordVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> authenticationPasswordVariable() {
        return Optional.ofNullable(this.authenticationPasswordVariable);
    }

    /**
     * Configure authentication protocol
     *   - Choices: `md5`, `sha`
     * 
     */
    @Import(name="authenticationProtocol")
    private @Nullable Output<String> authenticationProtocol;

    /**
     * @return Configure authentication protocol
     *   - Choices: `md5`, `sha`
     * 
     */
    public Optional<Output<String>> authenticationProtocol() {
        return Optional.ofNullable(this.authenticationProtocol);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="authenticationProtocolVariable")
    private @Nullable Output<String> authenticationProtocolVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> authenticationProtocolVariable() {
        return Optional.ofNullable(this.authenticationProtocolVariable);
    }

    /**
     * Name of the SNMP group
     * 
     */
    @Import(name="group")
    private @Nullable Output<String> group;

    /**
     * @return Name of the SNMP group
     * 
     */
    public Optional<Output<String>> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="groupVariable")
    private @Nullable Output<String> groupVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> groupVariable() {
        return Optional.ofNullable(this.groupVariable);
    }

    /**
     * Name of the SNMP user
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the SNMP user
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
     * Specify privacy protocol password
     * 
     */
    @Import(name="privacyPassword")
    private @Nullable Output<String> privacyPassword;

    /**
     * @return Specify privacy protocol password
     * 
     */
    public Optional<Output<String>> privacyPassword() {
        return Optional.ofNullable(this.privacyPassword);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="privacyPasswordVariable")
    private @Nullable Output<String> privacyPasswordVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> privacyPasswordVariable() {
        return Optional.ofNullable(this.privacyPasswordVariable);
    }

    /**
     * Configure privacy protocol
     *   - Choices: `aes-cfb-128`, `aes-256-cfb-128`
     * 
     */
    @Import(name="privacyProtocol")
    private @Nullable Output<String> privacyProtocol;

    /**
     * @return Configure privacy protocol
     *   - Choices: `aes-cfb-128`, `aes-256-cfb-128`
     * 
     */
    public Optional<Output<String>> privacyProtocol() {
        return Optional.ofNullable(this.privacyProtocol);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="privacyProtocolVariable")
    private @Nullable Output<String> privacyProtocolVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> privacyProtocolVariable() {
        return Optional.ofNullable(this.privacyProtocolVariable);
    }

    private CiscoSnmpFeatureTemplateUserArgs() {}

    private CiscoSnmpFeatureTemplateUserArgs(CiscoSnmpFeatureTemplateUserArgs $) {
        this.authenticationPassword = $.authenticationPassword;
        this.authenticationPasswordVariable = $.authenticationPasswordVariable;
        this.authenticationProtocol = $.authenticationProtocol;
        this.authenticationProtocolVariable = $.authenticationProtocolVariable;
        this.group = $.group;
        this.groupVariable = $.groupVariable;
        this.name = $.name;
        this.optional = $.optional;
        this.privacyPassword = $.privacyPassword;
        this.privacyPasswordVariable = $.privacyPasswordVariable;
        this.privacyProtocol = $.privacyProtocol;
        this.privacyProtocolVariable = $.privacyProtocolVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CiscoSnmpFeatureTemplateUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CiscoSnmpFeatureTemplateUserArgs $;

        public Builder() {
            $ = new CiscoSnmpFeatureTemplateUserArgs();
        }

        public Builder(CiscoSnmpFeatureTemplateUserArgs defaults) {
            $ = new CiscoSnmpFeatureTemplateUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationPassword Specify authentication protocol password
         * 
         * @return builder
         * 
         */
        public Builder authenticationPassword(@Nullable Output<String> authenticationPassword) {
            $.authenticationPassword = authenticationPassword;
            return this;
        }

        /**
         * @param authenticationPassword Specify authentication protocol password
         * 
         * @return builder
         * 
         */
        public Builder authenticationPassword(String authenticationPassword) {
            return authenticationPassword(Output.of(authenticationPassword));
        }

        /**
         * @param authenticationPasswordVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder authenticationPasswordVariable(@Nullable Output<String> authenticationPasswordVariable) {
            $.authenticationPasswordVariable = authenticationPasswordVariable;
            return this;
        }

        /**
         * @param authenticationPasswordVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder authenticationPasswordVariable(String authenticationPasswordVariable) {
            return authenticationPasswordVariable(Output.of(authenticationPasswordVariable));
        }

        /**
         * @param authenticationProtocol Configure authentication protocol
         *   - Choices: `md5`, `sha`
         * 
         * @return builder
         * 
         */
        public Builder authenticationProtocol(@Nullable Output<String> authenticationProtocol) {
            $.authenticationProtocol = authenticationProtocol;
            return this;
        }

        /**
         * @param authenticationProtocol Configure authentication protocol
         *   - Choices: `md5`, `sha`
         * 
         * @return builder
         * 
         */
        public Builder authenticationProtocol(String authenticationProtocol) {
            return authenticationProtocol(Output.of(authenticationProtocol));
        }

        /**
         * @param authenticationProtocolVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder authenticationProtocolVariable(@Nullable Output<String> authenticationProtocolVariable) {
            $.authenticationProtocolVariable = authenticationProtocolVariable;
            return this;
        }

        /**
         * @param authenticationProtocolVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder authenticationProtocolVariable(String authenticationProtocolVariable) {
            return authenticationProtocolVariable(Output.of(authenticationProtocolVariable));
        }

        /**
         * @param group Name of the SNMP group
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group Name of the SNMP group
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        /**
         * @param groupVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder groupVariable(@Nullable Output<String> groupVariable) {
            $.groupVariable = groupVariable;
            return this;
        }

        /**
         * @param groupVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder groupVariable(String groupVariable) {
            return groupVariable(Output.of(groupVariable));
        }

        /**
         * @param name Name of the SNMP user
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the SNMP user
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
         * @param privacyPassword Specify privacy protocol password
         * 
         * @return builder
         * 
         */
        public Builder privacyPassword(@Nullable Output<String> privacyPassword) {
            $.privacyPassword = privacyPassword;
            return this;
        }

        /**
         * @param privacyPassword Specify privacy protocol password
         * 
         * @return builder
         * 
         */
        public Builder privacyPassword(String privacyPassword) {
            return privacyPassword(Output.of(privacyPassword));
        }

        /**
         * @param privacyPasswordVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder privacyPasswordVariable(@Nullable Output<String> privacyPasswordVariable) {
            $.privacyPasswordVariable = privacyPasswordVariable;
            return this;
        }

        /**
         * @param privacyPasswordVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder privacyPasswordVariable(String privacyPasswordVariable) {
            return privacyPasswordVariable(Output.of(privacyPasswordVariable));
        }

        /**
         * @param privacyProtocol Configure privacy protocol
         *   - Choices: `aes-cfb-128`, `aes-256-cfb-128`
         * 
         * @return builder
         * 
         */
        public Builder privacyProtocol(@Nullable Output<String> privacyProtocol) {
            $.privacyProtocol = privacyProtocol;
            return this;
        }

        /**
         * @param privacyProtocol Configure privacy protocol
         *   - Choices: `aes-cfb-128`, `aes-256-cfb-128`
         * 
         * @return builder
         * 
         */
        public Builder privacyProtocol(String privacyProtocol) {
            return privacyProtocol(Output.of(privacyProtocol));
        }

        /**
         * @param privacyProtocolVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder privacyProtocolVariable(@Nullable Output<String> privacyProtocolVariable) {
            $.privacyProtocolVariable = privacyProtocolVariable;
            return this;
        }

        /**
         * @param privacyProtocolVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder privacyProtocolVariable(String privacyProtocolVariable) {
            return privacyProtocolVariable(Output.of(privacyProtocolVariable));
        }

        public CiscoSnmpFeatureTemplateUserArgs build() {
            return $;
        }
    }

}
