// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceLanVpnFeatureIpv4ExportRouteTarget {
    /**
     * @return Route target
     * 
     */
    private String routeTarget;
    /**
     * @return Variable name
     * 
     */
    private String routeTargetVariable;

    private GetServiceLanVpnFeatureIpv4ExportRouteTarget() {}
    /**
     * @return Route target
     * 
     */
    public String routeTarget() {
        return this.routeTarget;
    }
    /**
     * @return Variable name
     * 
     */
    public String routeTargetVariable() {
        return this.routeTargetVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceLanVpnFeatureIpv4ExportRouteTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String routeTarget;
        private String routeTargetVariable;
        public Builder() {}
        public Builder(GetServiceLanVpnFeatureIpv4ExportRouteTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.routeTarget = defaults.routeTarget;
    	      this.routeTargetVariable = defaults.routeTargetVariable;
        }

        @CustomType.Setter
        public Builder routeTarget(String routeTarget) {
            if (routeTarget == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureIpv4ExportRouteTarget", "routeTarget");
            }
            this.routeTarget = routeTarget;
            return this;
        }
        @CustomType.Setter
        public Builder routeTargetVariable(String routeTargetVariable) {
            if (routeTargetVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureIpv4ExportRouteTarget", "routeTargetVariable");
            }
            this.routeTargetVariable = routeTargetVariable;
            return this;
        }
        public GetServiceLanVpnFeatureIpv4ExportRouteTarget build() {
            final var _resultValue = new GetServiceLanVpnFeatureIpv4ExportRouteTarget();
            _resultValue.routeTarget = routeTarget;
            _resultValue.routeTargetVariable = routeTargetVariable;
            return _resultValue;
        }
    }
}