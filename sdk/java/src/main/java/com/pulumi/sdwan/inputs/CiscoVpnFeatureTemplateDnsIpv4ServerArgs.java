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


public final class CiscoVpnFeatureTemplateDnsIpv4ServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final CiscoVpnFeatureTemplateDnsIpv4ServerArgs Empty = new CiscoVpnFeatureTemplateDnsIpv4ServerArgs();

    /**
     * DNS Address
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return DNS Address
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="addressVariable")
    private @Nullable Output<String> addressVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> addressVariable() {
        return Optional.ofNullable(this.addressVariable);
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
     * Role
     *   - Choices: `primary`, `secondary`
     *   - Default value: `primary`
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return Role
     *   - Choices: `primary`, `secondary`
     *   - Default value: `primary`
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

    private CiscoVpnFeatureTemplateDnsIpv4ServerArgs() {}

    private CiscoVpnFeatureTemplateDnsIpv4ServerArgs(CiscoVpnFeatureTemplateDnsIpv4ServerArgs $) {
        this.address = $.address;
        this.addressVariable = $.addressVariable;
        this.optional = $.optional;
        this.role = $.role;
        this.roleVariable = $.roleVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CiscoVpnFeatureTemplateDnsIpv4ServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CiscoVpnFeatureTemplateDnsIpv4ServerArgs $;

        public Builder() {
            $ = new CiscoVpnFeatureTemplateDnsIpv4ServerArgs();
        }

        public Builder(CiscoVpnFeatureTemplateDnsIpv4ServerArgs defaults) {
            $ = new CiscoVpnFeatureTemplateDnsIpv4ServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address DNS Address
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address DNS Address
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param addressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder addressVariable(@Nullable Output<String> addressVariable) {
            $.addressVariable = addressVariable;
            return this;
        }

        /**
         * @param addressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder addressVariable(String addressVariable) {
            return addressVariable(Output.of(addressVariable));
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
         * @param role Role
         *   - Choices: `primary`, `secondary`
         *   - Default value: `primary`
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role Role
         *   - Choices: `primary`, `secondary`
         *   - Default value: `primary`
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

        public CiscoVpnFeatureTemplateDnsIpv4ServerArgs build() {
            return $;
        }
    }

}
