// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceRoutingBgpFeatureIpv4NetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceRoutingBgpFeatureIpv4NetworkArgs Empty = new ServiceRoutingBgpFeatureIpv4NetworkArgs();

    @Import(name="networkAddress")
    private @Nullable Output<String> networkAddress;

    public Optional<Output<String>> networkAddress() {
        return Optional.ofNullable(this.networkAddress);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="networkAddressVariable")
    private @Nullable Output<String> networkAddressVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> networkAddressVariable() {
        return Optional.ofNullable(this.networkAddressVariable);
    }

    /**
     * - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`, `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`, `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`, `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`, `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
     * 
     */
    @Import(name="subnetMask")
    private @Nullable Output<String> subnetMask;

    /**
     * @return - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`, `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`, `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`, `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`, `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
     * 
     */
    public Optional<Output<String>> subnetMask() {
        return Optional.ofNullable(this.subnetMask);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="subnetMaskVariable")
    private @Nullable Output<String> subnetMaskVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> subnetMaskVariable() {
        return Optional.ofNullable(this.subnetMaskVariable);
    }

    private ServiceRoutingBgpFeatureIpv4NetworkArgs() {}

    private ServiceRoutingBgpFeatureIpv4NetworkArgs(ServiceRoutingBgpFeatureIpv4NetworkArgs $) {
        this.networkAddress = $.networkAddress;
        this.networkAddressVariable = $.networkAddressVariable;
        this.subnetMask = $.subnetMask;
        this.subnetMaskVariable = $.subnetMaskVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceRoutingBgpFeatureIpv4NetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceRoutingBgpFeatureIpv4NetworkArgs $;

        public Builder() {
            $ = new ServiceRoutingBgpFeatureIpv4NetworkArgs();
        }

        public Builder(ServiceRoutingBgpFeatureIpv4NetworkArgs defaults) {
            $ = new ServiceRoutingBgpFeatureIpv4NetworkArgs(Objects.requireNonNull(defaults));
        }

        public Builder networkAddress(@Nullable Output<String> networkAddress) {
            $.networkAddress = networkAddress;
            return this;
        }

        public Builder networkAddress(String networkAddress) {
            return networkAddress(Output.of(networkAddress));
        }

        /**
         * @param networkAddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder networkAddressVariable(@Nullable Output<String> networkAddressVariable) {
            $.networkAddressVariable = networkAddressVariable;
            return this;
        }

        /**
         * @param networkAddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder networkAddressVariable(String networkAddressVariable) {
            return networkAddressVariable(Output.of(networkAddressVariable));
        }

        /**
         * @param subnetMask - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`, `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`, `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`, `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`, `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
         * 
         * @return builder
         * 
         */
        public Builder subnetMask(@Nullable Output<String> subnetMask) {
            $.subnetMask = subnetMask;
            return this;
        }

        /**
         * @param subnetMask - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`, `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`, `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`, `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`, `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
         * 
         * @return builder
         * 
         */
        public Builder subnetMask(String subnetMask) {
            return subnetMask(Output.of(subnetMask));
        }

        /**
         * @param subnetMaskVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder subnetMaskVariable(@Nullable Output<String> subnetMaskVariable) {
            $.subnetMaskVariable = subnetMaskVariable;
            return this;
        }

        /**
         * @param subnetMaskVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder subnetMaskVariable(String subnetMaskVariable) {
            return subnetMaskVariable(Output.of(subnetMaskVariable));
        }

        public ServiceRoutingBgpFeatureIpv4NetworkArgs build() {
            return $;
        }
    }

}