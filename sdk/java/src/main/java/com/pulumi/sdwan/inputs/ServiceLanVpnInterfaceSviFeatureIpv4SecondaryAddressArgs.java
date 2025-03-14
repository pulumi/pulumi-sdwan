// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddressArgs Empty = new ServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddressArgs();

    /**
     * IpV4 Address
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return IpV4 Address
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
     * Subnet Mask
     *   - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`, `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`, `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`, `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`, `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
     * 
     */
    @Import(name="ipv4SubnetMask")
    private @Nullable Output<String> ipv4SubnetMask;

    /**
     * @return Subnet Mask
     *   - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`, `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`, `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`, `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`, `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
     * 
     */
    public Optional<Output<String>> ipv4SubnetMask() {
        return Optional.ofNullable(this.ipv4SubnetMask);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="ipv4SubnetMaskVariable")
    private @Nullable Output<String> ipv4SubnetMaskVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> ipv4SubnetMaskVariable() {
        return Optional.ofNullable(this.ipv4SubnetMaskVariable);
    }

    private ServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddressArgs() {}

    private ServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddressArgs(ServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddressArgs $) {
        this.address = $.address;
        this.addressVariable = $.addressVariable;
        this.ipv4SubnetMask = $.ipv4SubnetMask;
        this.ipv4SubnetMaskVariable = $.ipv4SubnetMaskVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddressArgs $;

        public Builder() {
            $ = new ServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddressArgs();
        }

        public Builder(ServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddressArgs defaults) {
            $ = new ServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address IpV4 Address
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address IpV4 Address
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
         * @param ipv4SubnetMask Subnet Mask
         *   - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`, `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`, `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`, `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`, `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
         * 
         * @return builder
         * 
         */
        public Builder ipv4SubnetMask(@Nullable Output<String> ipv4SubnetMask) {
            $.ipv4SubnetMask = ipv4SubnetMask;
            return this;
        }

        /**
         * @param ipv4SubnetMask Subnet Mask
         *   - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`, `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`, `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`, `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`, `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
         * 
         * @return builder
         * 
         */
        public Builder ipv4SubnetMask(String ipv4SubnetMask) {
            return ipv4SubnetMask(Output.of(ipv4SubnetMask));
        }

        /**
         * @param ipv4SubnetMaskVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder ipv4SubnetMaskVariable(@Nullable Output<String> ipv4SubnetMaskVariable) {
            $.ipv4SubnetMaskVariable = ipv4SubnetMaskVariable;
            return this;
        }

        /**
         * @param ipv4SubnetMaskVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder ipv4SubnetMaskVariable(String ipv4SubnetMaskVariable) {
            return ipv4SubnetMaskVariable(Output.of(ipv4SubnetMaskVariable));
        }

        public ServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddressArgs build() {
            return $;
        }
    }

}
