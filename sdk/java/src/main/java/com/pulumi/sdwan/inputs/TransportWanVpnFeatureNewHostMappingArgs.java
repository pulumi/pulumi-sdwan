// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransportWanVpnFeatureNewHostMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransportWanVpnFeatureNewHostMappingArgs Empty = new TransportWanVpnFeatureNewHostMappingArgs();

    /**
     * Hostname
     * 
     */
    @Import(name="hostName")
    private @Nullable Output<String> hostName;

    /**
     * @return Hostname
     * 
     */
    public Optional<Output<String>> hostName() {
        return Optional.ofNullable(this.hostName);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="hostNameVariable")
    private @Nullable Output<String> hostNameVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> hostNameVariable() {
        return Optional.ofNullable(this.hostNameVariable);
    }

    /**
     * List of IP
     * 
     */
    @Import(name="listOfIpAddresses")
    private @Nullable Output<List<String>> listOfIpAddresses;

    /**
     * @return List of IP
     * 
     */
    public Optional<Output<List<String>>> listOfIpAddresses() {
        return Optional.ofNullable(this.listOfIpAddresses);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="listOfIpAddressesVariable")
    private @Nullable Output<String> listOfIpAddressesVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> listOfIpAddressesVariable() {
        return Optional.ofNullable(this.listOfIpAddressesVariable);
    }

    private TransportWanVpnFeatureNewHostMappingArgs() {}

    private TransportWanVpnFeatureNewHostMappingArgs(TransportWanVpnFeatureNewHostMappingArgs $) {
        this.hostName = $.hostName;
        this.hostNameVariable = $.hostNameVariable;
        this.listOfIpAddresses = $.listOfIpAddresses;
        this.listOfIpAddressesVariable = $.listOfIpAddressesVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransportWanVpnFeatureNewHostMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransportWanVpnFeatureNewHostMappingArgs $;

        public Builder() {
            $ = new TransportWanVpnFeatureNewHostMappingArgs();
        }

        public Builder(TransportWanVpnFeatureNewHostMappingArgs defaults) {
            $ = new TransportWanVpnFeatureNewHostMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostName Hostname
         * 
         * @return builder
         * 
         */
        public Builder hostName(@Nullable Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param hostName Hostname
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        /**
         * @param hostNameVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder hostNameVariable(@Nullable Output<String> hostNameVariable) {
            $.hostNameVariable = hostNameVariable;
            return this;
        }

        /**
         * @param hostNameVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder hostNameVariable(String hostNameVariable) {
            return hostNameVariable(Output.of(hostNameVariable));
        }

        /**
         * @param listOfIpAddresses List of IP
         * 
         * @return builder
         * 
         */
        public Builder listOfIpAddresses(@Nullable Output<List<String>> listOfIpAddresses) {
            $.listOfIpAddresses = listOfIpAddresses;
            return this;
        }

        /**
         * @param listOfIpAddresses List of IP
         * 
         * @return builder
         * 
         */
        public Builder listOfIpAddresses(List<String> listOfIpAddresses) {
            return listOfIpAddresses(Output.of(listOfIpAddresses));
        }

        /**
         * @param listOfIpAddresses List of IP
         * 
         * @return builder
         * 
         */
        public Builder listOfIpAddresses(String... listOfIpAddresses) {
            return listOfIpAddresses(List.of(listOfIpAddresses));
        }

        /**
         * @param listOfIpAddressesVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder listOfIpAddressesVariable(@Nullable Output<String> listOfIpAddressesVariable) {
            $.listOfIpAddressesVariable = listOfIpAddressesVariable;
            return this;
        }

        /**
         * @param listOfIpAddressesVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder listOfIpAddressesVariable(String listOfIpAddressesVariable) {
            return listOfIpAddressesVariable(Output.of(listOfIpAddressesVariable));
        }

        public TransportWanVpnFeatureNewHostMappingArgs build() {
            return $;
        }
    }

}