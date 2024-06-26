// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sdwan.outputs.CiscoVpnFeatureTemplateIpv6StaticRouteNextHop;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CiscoVpnFeatureTemplateIpv6StaticRoute {
    /**
     * @return NAT
     *   - Choices: `NAT64`, `NAT66`
     *   - Default value: `NAT64`
     * 
     */
    private @Nullable String nat;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String natVariable;
    /**
     * @return IP gateway address
     * 
     */
    private @Nullable List<CiscoVpnFeatureTemplateIpv6StaticRouteNextHop> nextHops;
    /**
     * @return null0
     *   - Default value: `false`
     * 
     */
    private @Nullable Boolean null0;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String null0Variable;
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private @Nullable Boolean optional;
    /**
     * @return Prefix
     * 
     */
    private @Nullable String prefix;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String prefixVariable;
    /**
     * @return Destination VPN(!=0 or !=512) to resolve the prefix
     *   - Default value: `0`
     * 
     */
    private @Nullable Integer vpnId;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String vpnIdVariable;

    private CiscoVpnFeatureTemplateIpv6StaticRoute() {}
    /**
     * @return NAT
     *   - Choices: `NAT64`, `NAT66`
     *   - Default value: `NAT64`
     * 
     */
    public Optional<String> nat() {
        return Optional.ofNullable(this.nat);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> natVariable() {
        return Optional.ofNullable(this.natVariable);
    }
    /**
     * @return IP gateway address
     * 
     */
    public List<CiscoVpnFeatureTemplateIpv6StaticRouteNextHop> nextHops() {
        return this.nextHops == null ? List.of() : this.nextHops;
    }
    /**
     * @return null0
     *   - Default value: `false`
     * 
     */
    public Optional<Boolean> null0() {
        return Optional.ofNullable(this.null0);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> null0Variable() {
        return Optional.ofNullable(this.null0Variable);
    }
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Optional<Boolean> optional() {
        return Optional.ofNullable(this.optional);
    }
    /**
     * @return Prefix
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> prefixVariable() {
        return Optional.ofNullable(this.prefixVariable);
    }
    /**
     * @return Destination VPN(!=0 or !=512) to resolve the prefix
     *   - Default value: `0`
     * 
     */
    public Optional<Integer> vpnId() {
        return Optional.ofNullable(this.vpnId);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> vpnIdVariable() {
        return Optional.ofNullable(this.vpnIdVariable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CiscoVpnFeatureTemplateIpv6StaticRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String nat;
        private @Nullable String natVariable;
        private @Nullable List<CiscoVpnFeatureTemplateIpv6StaticRouteNextHop> nextHops;
        private @Nullable Boolean null0;
        private @Nullable String null0Variable;
        private @Nullable Boolean optional;
        private @Nullable String prefix;
        private @Nullable String prefixVariable;
        private @Nullable Integer vpnId;
        private @Nullable String vpnIdVariable;
        public Builder() {}
        public Builder(CiscoVpnFeatureTemplateIpv6StaticRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nat = defaults.nat;
    	      this.natVariable = defaults.natVariable;
    	      this.nextHops = defaults.nextHops;
    	      this.null0 = defaults.null0;
    	      this.null0Variable = defaults.null0Variable;
    	      this.optional = defaults.optional;
    	      this.prefix = defaults.prefix;
    	      this.prefixVariable = defaults.prefixVariable;
    	      this.vpnId = defaults.vpnId;
    	      this.vpnIdVariable = defaults.vpnIdVariable;
        }

        @CustomType.Setter
        public Builder nat(@Nullable String nat) {

            this.nat = nat;
            return this;
        }
        @CustomType.Setter
        public Builder natVariable(@Nullable String natVariable) {

            this.natVariable = natVariable;
            return this;
        }
        @CustomType.Setter
        public Builder nextHops(@Nullable List<CiscoVpnFeatureTemplateIpv6StaticRouteNextHop> nextHops) {

            this.nextHops = nextHops;
            return this;
        }
        public Builder nextHops(CiscoVpnFeatureTemplateIpv6StaticRouteNextHop... nextHops) {
            return nextHops(List.of(nextHops));
        }
        @CustomType.Setter
        public Builder null0(@Nullable Boolean null0) {

            this.null0 = null0;
            return this;
        }
        @CustomType.Setter
        public Builder null0Variable(@Nullable String null0Variable) {

            this.null0Variable = null0Variable;
            return this;
        }
        @CustomType.Setter
        public Builder optional(@Nullable Boolean optional) {

            this.optional = optional;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {

            this.prefix = prefix;
            return this;
        }
        @CustomType.Setter
        public Builder prefixVariable(@Nullable String prefixVariable) {

            this.prefixVariable = prefixVariable;
            return this;
        }
        @CustomType.Setter
        public Builder vpnId(@Nullable Integer vpnId) {

            this.vpnId = vpnId;
            return this;
        }
        @CustomType.Setter
        public Builder vpnIdVariable(@Nullable String vpnIdVariable) {

            this.vpnIdVariable = vpnIdVariable;
            return this;
        }
        public CiscoVpnFeatureTemplateIpv6StaticRoute build() {
            final var _resultValue = new CiscoVpnFeatureTemplateIpv6StaticRoute();
            _resultValue.nat = nat;
            _resultValue.natVariable = natVariable;
            _resultValue.nextHops = nextHops;
            _resultValue.null0 = null0;
            _resultValue.null0Variable = null0Variable;
            _resultValue.optional = optional;
            _resultValue.prefix = prefix;
            _resultValue.prefixVariable = prefixVariable;
            _resultValue.vpnId = vpnId;
            _resultValue.vpnIdVariable = vpnIdVariable;
            return _resultValue;
        }
    }
}
