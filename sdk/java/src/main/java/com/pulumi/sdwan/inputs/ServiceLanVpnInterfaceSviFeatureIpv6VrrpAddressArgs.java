// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceLanVpnInterfaceSviFeatureIpv6VrrpAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLanVpnInterfaceSviFeatureIpv6VrrpAddressArgs Empty = new ServiceLanVpnInterfaceSviFeatureIpv6VrrpAddressArgs();

    /**
     * Assign Global IPv6 Prefix
     * 
     */
    @Import(name="globalAddress")
    private @Nullable Output<String> globalAddress;

    /**
     * @return Assign Global IPv6 Prefix
     * 
     */
    public Optional<Output<String>> globalAddress() {
        return Optional.ofNullable(this.globalAddress);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="globalAddressVariable")
    private @Nullable Output<String> globalAddressVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> globalAddressVariable() {
        return Optional.ofNullable(this.globalAddressVariable);
    }

    /**
     * Use link-local IPv6 Address
     * 
     */
    @Import(name="linkLocalAddress")
    private @Nullable Output<String> linkLocalAddress;

    /**
     * @return Use link-local IPv6 Address
     * 
     */
    public Optional<Output<String>> linkLocalAddress() {
        return Optional.ofNullable(this.linkLocalAddress);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="linkLocalAddressVariable")
    private @Nullable Output<String> linkLocalAddressVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> linkLocalAddressVariable() {
        return Optional.ofNullable(this.linkLocalAddressVariable);
    }

    private ServiceLanVpnInterfaceSviFeatureIpv6VrrpAddressArgs() {}

    private ServiceLanVpnInterfaceSviFeatureIpv6VrrpAddressArgs(ServiceLanVpnInterfaceSviFeatureIpv6VrrpAddressArgs $) {
        this.globalAddress = $.globalAddress;
        this.globalAddressVariable = $.globalAddressVariable;
        this.linkLocalAddress = $.linkLocalAddress;
        this.linkLocalAddressVariable = $.linkLocalAddressVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLanVpnInterfaceSviFeatureIpv6VrrpAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLanVpnInterfaceSviFeatureIpv6VrrpAddressArgs $;

        public Builder() {
            $ = new ServiceLanVpnInterfaceSviFeatureIpv6VrrpAddressArgs();
        }

        public Builder(ServiceLanVpnInterfaceSviFeatureIpv6VrrpAddressArgs defaults) {
            $ = new ServiceLanVpnInterfaceSviFeatureIpv6VrrpAddressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param globalAddress Assign Global IPv6 Prefix
         * 
         * @return builder
         * 
         */
        public Builder globalAddress(@Nullable Output<String> globalAddress) {
            $.globalAddress = globalAddress;
            return this;
        }

        /**
         * @param globalAddress Assign Global IPv6 Prefix
         * 
         * @return builder
         * 
         */
        public Builder globalAddress(String globalAddress) {
            return globalAddress(Output.of(globalAddress));
        }

        /**
         * @param globalAddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder globalAddressVariable(@Nullable Output<String> globalAddressVariable) {
            $.globalAddressVariable = globalAddressVariable;
            return this;
        }

        /**
         * @param globalAddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder globalAddressVariable(String globalAddressVariable) {
            return globalAddressVariable(Output.of(globalAddressVariable));
        }

        /**
         * @param linkLocalAddress Use link-local IPv6 Address
         * 
         * @return builder
         * 
         */
        public Builder linkLocalAddress(@Nullable Output<String> linkLocalAddress) {
            $.linkLocalAddress = linkLocalAddress;
            return this;
        }

        /**
         * @param linkLocalAddress Use link-local IPv6 Address
         * 
         * @return builder
         * 
         */
        public Builder linkLocalAddress(String linkLocalAddress) {
            return linkLocalAddress(Output.of(linkLocalAddress));
        }

        /**
         * @param linkLocalAddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder linkLocalAddressVariable(@Nullable Output<String> linkLocalAddressVariable) {
            $.linkLocalAddressVariable = linkLocalAddressVariable;
            return this;
        }

        /**
         * @param linkLocalAddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder linkLocalAddressVariable(String linkLocalAddressVariable) {
            return linkLocalAddressVariable(Output.of(linkLocalAddressVariable));
        }

        public ServiceLanVpnInterfaceSviFeatureIpv6VrrpAddressArgs build() {
            return $;
        }
    }

}
