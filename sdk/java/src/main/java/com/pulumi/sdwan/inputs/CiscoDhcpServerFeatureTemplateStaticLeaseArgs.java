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


public final class CiscoDhcpServerFeatureTemplateStaticLeaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final CiscoDhcpServerFeatureTemplateStaticLeaseArgs Empty = new CiscoDhcpServerFeatureTemplateStaticLeaseArgs();

    /**
     * Set client’s hostname
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return Set client’s hostname
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="hostnameVariable")
    private @Nullable Output<String> hostnameVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> hostnameVariable() {
        return Optional.ofNullable(this.hostnameVariable);
    }

    /**
     * Set client’s static IP address
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return Set client’s static IP address
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="ipAddressVariable")
    private @Nullable Output<String> ipAddressVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> ipAddressVariable() {
        return Optional.ofNullable(this.ipAddressVariable);
    }

    /**
     * Set MAC address of client
     * 
     */
    @Import(name="macAddress")
    private @Nullable Output<String> macAddress;

    /**
     * @return Set MAC address of client
     * 
     */
    public Optional<Output<String>> macAddress() {
        return Optional.ofNullable(this.macAddress);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="macAddressVariable")
    private @Nullable Output<String> macAddressVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> macAddressVariable() {
        return Optional.ofNullable(this.macAddressVariable);
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

    private CiscoDhcpServerFeatureTemplateStaticLeaseArgs() {}

    private CiscoDhcpServerFeatureTemplateStaticLeaseArgs(CiscoDhcpServerFeatureTemplateStaticLeaseArgs $) {
        this.hostname = $.hostname;
        this.hostnameVariable = $.hostnameVariable;
        this.ipAddress = $.ipAddress;
        this.ipAddressVariable = $.ipAddressVariable;
        this.macAddress = $.macAddress;
        this.macAddressVariable = $.macAddressVariable;
        this.optional = $.optional;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CiscoDhcpServerFeatureTemplateStaticLeaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CiscoDhcpServerFeatureTemplateStaticLeaseArgs $;

        public Builder() {
            $ = new CiscoDhcpServerFeatureTemplateStaticLeaseArgs();
        }

        public Builder(CiscoDhcpServerFeatureTemplateStaticLeaseArgs defaults) {
            $ = new CiscoDhcpServerFeatureTemplateStaticLeaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostname Set client’s hostname
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Set client’s hostname
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param hostnameVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder hostnameVariable(@Nullable Output<String> hostnameVariable) {
            $.hostnameVariable = hostnameVariable;
            return this;
        }

        /**
         * @param hostnameVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder hostnameVariable(String hostnameVariable) {
            return hostnameVariable(Output.of(hostnameVariable));
        }

        /**
         * @param ipAddress Set client’s static IP address
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress Set client’s static IP address
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param ipAddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder ipAddressVariable(@Nullable Output<String> ipAddressVariable) {
            $.ipAddressVariable = ipAddressVariable;
            return this;
        }

        /**
         * @param ipAddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder ipAddressVariable(String ipAddressVariable) {
            return ipAddressVariable(Output.of(ipAddressVariable));
        }

        /**
         * @param macAddress Set MAC address of client
         * 
         * @return builder
         * 
         */
        public Builder macAddress(@Nullable Output<String> macAddress) {
            $.macAddress = macAddress;
            return this;
        }

        /**
         * @param macAddress Set MAC address of client
         * 
         * @return builder
         * 
         */
        public Builder macAddress(String macAddress) {
            return macAddress(Output.of(macAddress));
        }

        /**
         * @param macAddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder macAddressVariable(@Nullable Output<String> macAddressVariable) {
            $.macAddressVariable = macAddressVariable;
            return this;
        }

        /**
         * @param macAddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder macAddressVariable(String macAddressVariable) {
            return macAddressVariable(Output.of(macAddressVariable));
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

        public CiscoDhcpServerFeatureTemplateStaticLeaseArgs build() {
            return $;
        }
    }

}
