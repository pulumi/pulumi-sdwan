// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransportWanVpnFeatureIpv6StaticRouteNextHopArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransportWanVpnFeatureIpv6StaticRouteNextHopArgs Empty = new TransportWanVpnFeatureIpv6StaticRouteNextHopArgs();

    /**
     * Address
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return Address
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
     * Administrative distance
     *   - Range: `1`-`254`
     * 
     */
    @Import(name="administrativeDistance")
    private @Nullable Output<Integer> administrativeDistance;

    /**
     * @return Administrative distance
     *   - Range: `1`-`254`
     * 
     */
    public Optional<Output<Integer>> administrativeDistance() {
        return Optional.ofNullable(this.administrativeDistance);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="administrativeDistanceVariable")
    private @Nullable Output<String> administrativeDistanceVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> administrativeDistanceVariable() {
        return Optional.ofNullable(this.administrativeDistanceVariable);
    }

    private TransportWanVpnFeatureIpv6StaticRouteNextHopArgs() {}

    private TransportWanVpnFeatureIpv6StaticRouteNextHopArgs(TransportWanVpnFeatureIpv6StaticRouteNextHopArgs $) {
        this.address = $.address;
        this.addressVariable = $.addressVariable;
        this.administrativeDistance = $.administrativeDistance;
        this.administrativeDistanceVariable = $.administrativeDistanceVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransportWanVpnFeatureIpv6StaticRouteNextHopArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransportWanVpnFeatureIpv6StaticRouteNextHopArgs $;

        public Builder() {
            $ = new TransportWanVpnFeatureIpv6StaticRouteNextHopArgs();
        }

        public Builder(TransportWanVpnFeatureIpv6StaticRouteNextHopArgs defaults) {
            $ = new TransportWanVpnFeatureIpv6StaticRouteNextHopArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address Address
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address Address
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
         * @param administrativeDistance Administrative distance
         *   - Range: `1`-`254`
         * 
         * @return builder
         * 
         */
        public Builder administrativeDistance(@Nullable Output<Integer> administrativeDistance) {
            $.administrativeDistance = administrativeDistance;
            return this;
        }

        /**
         * @param administrativeDistance Administrative distance
         *   - Range: `1`-`254`
         * 
         * @return builder
         * 
         */
        public Builder administrativeDistance(Integer administrativeDistance) {
            return administrativeDistance(Output.of(administrativeDistance));
        }

        /**
         * @param administrativeDistanceVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder administrativeDistanceVariable(@Nullable Output<String> administrativeDistanceVariable) {
            $.administrativeDistanceVariable = administrativeDistanceVariable;
            return this;
        }

        /**
         * @param administrativeDistanceVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder administrativeDistanceVariable(String administrativeDistanceVariable) {
            return administrativeDistanceVariable(Output.of(administrativeDistanceVariable));
        }

        public TransportWanVpnFeatureIpv6StaticRouteNextHopArgs build() {
            return $;
        }
    }

}
