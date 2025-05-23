// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceLanVpnFeatureIpv4StaticRouteNextHop {
    /**
     * @return Address
     * 
     */
    private @Nullable String address;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String addressVariable;
    /**
     * @return Administrative distance
     *   - Range: `1`-`255`
     * 
     */
    private @Nullable Integer administrativeDistance;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String administrativeDistanceVariable;

    private ServiceLanVpnFeatureIpv4StaticRouteNextHop() {}
    /**
     * @return Address
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> addressVariable() {
        return Optional.ofNullable(this.addressVariable);
    }
    /**
     * @return Administrative distance
     *   - Range: `1`-`255`
     * 
     */
    public Optional<Integer> administrativeDistance() {
        return Optional.ofNullable(this.administrativeDistance);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> administrativeDistanceVariable() {
        return Optional.ofNullable(this.administrativeDistanceVariable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceLanVpnFeatureIpv4StaticRouteNextHop defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String address;
        private @Nullable String addressVariable;
        private @Nullable Integer administrativeDistance;
        private @Nullable String administrativeDistanceVariable;
        public Builder() {}
        public Builder(ServiceLanVpnFeatureIpv4StaticRouteNextHop defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.addressVariable = defaults.addressVariable;
    	      this.administrativeDistance = defaults.administrativeDistance;
    	      this.administrativeDistanceVariable = defaults.administrativeDistanceVariable;
        }

        @CustomType.Setter
        public Builder address(@Nullable String address) {

            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder addressVariable(@Nullable String addressVariable) {

            this.addressVariable = addressVariable;
            return this;
        }
        @CustomType.Setter
        public Builder administrativeDistance(@Nullable Integer administrativeDistance) {

            this.administrativeDistance = administrativeDistance;
            return this;
        }
        @CustomType.Setter
        public Builder administrativeDistanceVariable(@Nullable String administrativeDistanceVariable) {

            this.administrativeDistanceVariable = administrativeDistanceVariable;
            return this;
        }
        public ServiceLanVpnFeatureIpv4StaticRouteNextHop build() {
            final var _resultValue = new ServiceLanVpnFeatureIpv4StaticRouteNextHop();
            _resultValue.address = address;
            _resultValue.addressVariable = addressVariable;
            _resultValue.administrativeDistance = administrativeDistance;
            _resultValue.administrativeDistanceVariable = administrativeDistanceVariable;
            return _resultValue;
        }
    }
}
