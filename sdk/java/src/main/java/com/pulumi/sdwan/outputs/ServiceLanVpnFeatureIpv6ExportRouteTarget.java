// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceLanVpnFeatureIpv6ExportRouteTarget {
    /**
     * @return Route target
     * 
     */
    private @Nullable String routeTarget;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String routeTargetVariable;

    private ServiceLanVpnFeatureIpv6ExportRouteTarget() {}
    /**
     * @return Route target
     * 
     */
    public Optional<String> routeTarget() {
        return Optional.ofNullable(this.routeTarget);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> routeTargetVariable() {
        return Optional.ofNullable(this.routeTargetVariable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceLanVpnFeatureIpv6ExportRouteTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String routeTarget;
        private @Nullable String routeTargetVariable;
        public Builder() {}
        public Builder(ServiceLanVpnFeatureIpv6ExportRouteTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.routeTarget = defaults.routeTarget;
    	      this.routeTargetVariable = defaults.routeTargetVariable;
        }

        @CustomType.Setter
        public Builder routeTarget(@Nullable String routeTarget) {

            this.routeTarget = routeTarget;
            return this;
        }
        @CustomType.Setter
        public Builder routeTargetVariable(@Nullable String routeTargetVariable) {

            this.routeTargetVariable = routeTargetVariable;
            return this;
        }
        public ServiceLanVpnFeatureIpv6ExportRouteTarget build() {
            final var _resultValue = new ServiceLanVpnFeatureIpv6ExportRouteTarget();
            _resultValue.routeTarget = routeTarget;
            _resultValue.routeTargetVariable = routeTargetVariable;
            return _resultValue;
        }
    }
}
