// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sdwan.inputs.TransportManagementVpnFeatureIpv6StaticRouteNextHopArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransportManagementVpnFeatureIpv6StaticRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransportManagementVpnFeatureIpv6StaticRouteArgs Empty = new TransportManagementVpnFeatureIpv6StaticRouteArgs();

    /**
     * IPv6 Nat
     *   - Choices: `NAT64`, `NAT66`
     * 
     */
    @Import(name="nat")
    private @Nullable Output<String> nat;

    /**
     * @return IPv6 Nat
     *   - Choices: `NAT64`, `NAT66`
     * 
     */
    public Optional<Output<String>> nat() {
        return Optional.ofNullable(this.nat);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="natVariable")
    private @Nullable Output<String> natVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> natVariable() {
        return Optional.ofNullable(this.natVariable);
    }

    /**
     * IPv6 Route Gateway Next Hop
     * 
     */
    @Import(name="nextHops")
    private @Nullable Output<List<TransportManagementVpnFeatureIpv6StaticRouteNextHopArgs>> nextHops;

    /**
     * @return IPv6 Route Gateway Next Hop
     * 
     */
    public Optional<Output<List<TransportManagementVpnFeatureIpv6StaticRouteNextHopArgs>>> nextHops() {
        return Optional.ofNullable(this.nextHops);
    }

    /**
     * IPv6 Route Gateway Next Hop
     * 
     */
    @Import(name="null0")
    private @Nullable Output<Boolean> null0;

    /**
     * @return IPv6 Route Gateway Next Hop
     * 
     */
    public Optional<Output<Boolean>> null0() {
        return Optional.ofNullable(this.null0);
    }

    /**
     * Prefix
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return Prefix
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="prefixVariable")
    private @Nullable Output<String> prefixVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> prefixVariable() {
        return Optional.ofNullable(this.prefixVariable);
    }

    private TransportManagementVpnFeatureIpv6StaticRouteArgs() {}

    private TransportManagementVpnFeatureIpv6StaticRouteArgs(TransportManagementVpnFeatureIpv6StaticRouteArgs $) {
        this.nat = $.nat;
        this.natVariable = $.natVariable;
        this.nextHops = $.nextHops;
        this.null0 = $.null0;
        this.prefix = $.prefix;
        this.prefixVariable = $.prefixVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransportManagementVpnFeatureIpv6StaticRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransportManagementVpnFeatureIpv6StaticRouteArgs $;

        public Builder() {
            $ = new TransportManagementVpnFeatureIpv6StaticRouteArgs();
        }

        public Builder(TransportManagementVpnFeatureIpv6StaticRouteArgs defaults) {
            $ = new TransportManagementVpnFeatureIpv6StaticRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nat IPv6 Nat
         *   - Choices: `NAT64`, `NAT66`
         * 
         * @return builder
         * 
         */
        public Builder nat(@Nullable Output<String> nat) {
            $.nat = nat;
            return this;
        }

        /**
         * @param nat IPv6 Nat
         *   - Choices: `NAT64`, `NAT66`
         * 
         * @return builder
         * 
         */
        public Builder nat(String nat) {
            return nat(Output.of(nat));
        }

        /**
         * @param natVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder natVariable(@Nullable Output<String> natVariable) {
            $.natVariable = natVariable;
            return this;
        }

        /**
         * @param natVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder natVariable(String natVariable) {
            return natVariable(Output.of(natVariable));
        }

        /**
         * @param nextHops IPv6 Route Gateway Next Hop
         * 
         * @return builder
         * 
         */
        public Builder nextHops(@Nullable Output<List<TransportManagementVpnFeatureIpv6StaticRouteNextHopArgs>> nextHops) {
            $.nextHops = nextHops;
            return this;
        }

        /**
         * @param nextHops IPv6 Route Gateway Next Hop
         * 
         * @return builder
         * 
         */
        public Builder nextHops(List<TransportManagementVpnFeatureIpv6StaticRouteNextHopArgs> nextHops) {
            return nextHops(Output.of(nextHops));
        }

        /**
         * @param nextHops IPv6 Route Gateway Next Hop
         * 
         * @return builder
         * 
         */
        public Builder nextHops(TransportManagementVpnFeatureIpv6StaticRouteNextHopArgs... nextHops) {
            return nextHops(List.of(nextHops));
        }

        /**
         * @param null0 IPv6 Route Gateway Next Hop
         * 
         * @return builder
         * 
         */
        public Builder null0(@Nullable Output<Boolean> null0) {
            $.null0 = null0;
            return this;
        }

        /**
         * @param null0 IPv6 Route Gateway Next Hop
         * 
         * @return builder
         * 
         */
        public Builder null0(Boolean null0) {
            return null0(Output.of(null0));
        }

        /**
         * @param prefix Prefix
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix Prefix
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param prefixVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder prefixVariable(@Nullable Output<String> prefixVariable) {
            $.prefixVariable = prefixVariable;
            return this;
        }

        /**
         * @param prefixVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder prefixVariable(String prefixVariable) {
            return prefixVariable(Output.of(prefixVariable));
        }

        public TransportManagementVpnFeatureIpv6StaticRouteArgs build() {
            return $;
        }
    }

}