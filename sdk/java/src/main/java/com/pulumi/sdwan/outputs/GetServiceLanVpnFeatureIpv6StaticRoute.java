// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.outputs.GetServiceLanVpnFeatureIpv6StaticRouteNextHop;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceLanVpnFeatureIpv6StaticRoute {
    /**
     * @return IPv6 Nat
     * 
     */
    private String nat;
    /**
     * @return Variable name
     * 
     */
    private String natVariable;
    /**
     * @return IPv6 Route Gateway Next Hop
     * 
     */
    private List<GetServiceLanVpnFeatureIpv6StaticRouteNextHop> nextHops;
    /**
     * @return IPv6 Route Gateway Next Hop
     * 
     */
    private Boolean null0;
    /**
     * @return Prefix
     * 
     */
    private String prefix;
    /**
     * @return Variable name
     * 
     */
    private String prefixVariable;

    private GetServiceLanVpnFeatureIpv6StaticRoute() {}
    /**
     * @return IPv6 Nat
     * 
     */
    public String nat() {
        return this.nat;
    }
    /**
     * @return Variable name
     * 
     */
    public String natVariable() {
        return this.natVariable;
    }
    /**
     * @return IPv6 Route Gateway Next Hop
     * 
     */
    public List<GetServiceLanVpnFeatureIpv6StaticRouteNextHop> nextHops() {
        return this.nextHops;
    }
    /**
     * @return IPv6 Route Gateway Next Hop
     * 
     */
    public Boolean null0() {
        return this.null0;
    }
    /**
     * @return Prefix
     * 
     */
    public String prefix() {
        return this.prefix;
    }
    /**
     * @return Variable name
     * 
     */
    public String prefixVariable() {
        return this.prefixVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceLanVpnFeatureIpv6StaticRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String nat;
        private String natVariable;
        private List<GetServiceLanVpnFeatureIpv6StaticRouteNextHop> nextHops;
        private Boolean null0;
        private String prefix;
        private String prefixVariable;
        public Builder() {}
        public Builder(GetServiceLanVpnFeatureIpv6StaticRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nat = defaults.nat;
    	      this.natVariable = defaults.natVariable;
    	      this.nextHops = defaults.nextHops;
    	      this.null0 = defaults.null0;
    	      this.prefix = defaults.prefix;
    	      this.prefixVariable = defaults.prefixVariable;
        }

        @CustomType.Setter
        public Builder nat(String nat) {
            if (nat == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureIpv6StaticRoute", "nat");
            }
            this.nat = nat;
            return this;
        }
        @CustomType.Setter
        public Builder natVariable(String natVariable) {
            if (natVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureIpv6StaticRoute", "natVariable");
            }
            this.natVariable = natVariable;
            return this;
        }
        @CustomType.Setter
        public Builder nextHops(List<GetServiceLanVpnFeatureIpv6StaticRouteNextHop> nextHops) {
            if (nextHops == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureIpv6StaticRoute", "nextHops");
            }
            this.nextHops = nextHops;
            return this;
        }
        public Builder nextHops(GetServiceLanVpnFeatureIpv6StaticRouteNextHop... nextHops) {
            return nextHops(List.of(nextHops));
        }
        @CustomType.Setter
        public Builder null0(Boolean null0) {
            if (null0 == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureIpv6StaticRoute", "null0");
            }
            this.null0 = null0;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(String prefix) {
            if (prefix == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureIpv6StaticRoute", "prefix");
            }
            this.prefix = prefix;
            return this;
        }
        @CustomType.Setter
        public Builder prefixVariable(String prefixVariable) {
            if (prefixVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureIpv6StaticRoute", "prefixVariable");
            }
            this.prefixVariable = prefixVariable;
            return this;
        }
        public GetServiceLanVpnFeatureIpv6StaticRoute build() {
            final var _resultValue = new GetServiceLanVpnFeatureIpv6StaticRoute();
            _resultValue.nat = nat;
            _resultValue.natVariable = natVariable;
            _resultValue.nextHops = nextHops;
            _resultValue.null0 = null0;
            _resultValue.prefix = prefix;
            _resultValue.prefixVariable = prefixVariable;
            return _resultValue;
        }
    }
}