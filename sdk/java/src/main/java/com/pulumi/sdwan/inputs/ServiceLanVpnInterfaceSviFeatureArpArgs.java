// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceLanVpnInterfaceSviFeatureArpArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLanVpnInterfaceSviFeatureArpArgs Empty = new ServiceLanVpnInterfaceSviFeatureArpArgs();

    /**
     * IP Address
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return IP Address
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
     * MAC address
     * 
     */
    @Import(name="macAddress")
    private @Nullable Output<String> macAddress;

    /**
     * @return MAC address
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

    private ServiceLanVpnInterfaceSviFeatureArpArgs() {}

    private ServiceLanVpnInterfaceSviFeatureArpArgs(ServiceLanVpnInterfaceSviFeatureArpArgs $) {
        this.ipAddress = $.ipAddress;
        this.ipAddressVariable = $.ipAddressVariable;
        this.macAddress = $.macAddress;
        this.macAddressVariable = $.macAddressVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLanVpnInterfaceSviFeatureArpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLanVpnInterfaceSviFeatureArpArgs $;

        public Builder() {
            $ = new ServiceLanVpnInterfaceSviFeatureArpArgs();
        }

        public Builder(ServiceLanVpnInterfaceSviFeatureArpArgs defaults) {
            $ = new ServiceLanVpnInterfaceSviFeatureArpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipAddress IP Address
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress IP Address
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
         * @param macAddress MAC address
         * 
         * @return builder
         * 
         */
        public Builder macAddress(@Nullable Output<String> macAddress) {
            $.macAddress = macAddress;
            return this;
        }

        /**
         * @param macAddress MAC address
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

        public ServiceLanVpnInterfaceSviFeatureArpArgs build() {
            return $;
        }
    }

}