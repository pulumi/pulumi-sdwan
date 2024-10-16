// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.outputs.GetServiceLanVpnFeatureRouteLeakFromOtherServiceRedistribution;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceLanVpnFeatureRouteLeakFromOtherService {
    /**
     * @return Redistribute Route to specific Protocol on Current Service VPN
     * 
     */
    private List<GetServiceLanVpnFeatureRouteLeakFromOtherServiceRedistribution> redistributions;
    private String routePolicyId;
    /**
     * @return Leak Route of particular protocol from Source Service VPN
     * 
     */
    private String routeProtocol;
    /**
     * @return Variable name
     * 
     */
    private String routeProtocolVariable;
    /**
     * @return Source Service VPN from where route are to be leaked
     * 
     */
    private Integer sourceVpn;
    /**
     * @return Variable name
     * 
     */
    private String sourceVpnVariable;

    private GetServiceLanVpnFeatureRouteLeakFromOtherService() {}
    /**
     * @return Redistribute Route to specific Protocol on Current Service VPN
     * 
     */
    public List<GetServiceLanVpnFeatureRouteLeakFromOtherServiceRedistribution> redistributions() {
        return this.redistributions;
    }
    public String routePolicyId() {
        return this.routePolicyId;
    }
    /**
     * @return Leak Route of particular protocol from Source Service VPN
     * 
     */
    public String routeProtocol() {
        return this.routeProtocol;
    }
    /**
     * @return Variable name
     * 
     */
    public String routeProtocolVariable() {
        return this.routeProtocolVariable;
    }
    /**
     * @return Source Service VPN from where route are to be leaked
     * 
     */
    public Integer sourceVpn() {
        return this.sourceVpn;
    }
    /**
     * @return Variable name
     * 
     */
    public String sourceVpnVariable() {
        return this.sourceVpnVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceLanVpnFeatureRouteLeakFromOtherService defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetServiceLanVpnFeatureRouteLeakFromOtherServiceRedistribution> redistributions;
        private String routePolicyId;
        private String routeProtocol;
        private String routeProtocolVariable;
        private Integer sourceVpn;
        private String sourceVpnVariable;
        public Builder() {}
        public Builder(GetServiceLanVpnFeatureRouteLeakFromOtherService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.redistributions = defaults.redistributions;
    	      this.routePolicyId = defaults.routePolicyId;
    	      this.routeProtocol = defaults.routeProtocol;
    	      this.routeProtocolVariable = defaults.routeProtocolVariable;
    	      this.sourceVpn = defaults.sourceVpn;
    	      this.sourceVpnVariable = defaults.sourceVpnVariable;
        }

        @CustomType.Setter
        public Builder redistributions(List<GetServiceLanVpnFeatureRouteLeakFromOtherServiceRedistribution> redistributions) {
            if (redistributions == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureRouteLeakFromOtherService", "redistributions");
            }
            this.redistributions = redistributions;
            return this;
        }
        public Builder redistributions(GetServiceLanVpnFeatureRouteLeakFromOtherServiceRedistribution... redistributions) {
            return redistributions(List.of(redistributions));
        }
        @CustomType.Setter
        public Builder routePolicyId(String routePolicyId) {
            if (routePolicyId == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureRouteLeakFromOtherService", "routePolicyId");
            }
            this.routePolicyId = routePolicyId;
            return this;
        }
        @CustomType.Setter
        public Builder routeProtocol(String routeProtocol) {
            if (routeProtocol == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureRouteLeakFromOtherService", "routeProtocol");
            }
            this.routeProtocol = routeProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder routeProtocolVariable(String routeProtocolVariable) {
            if (routeProtocolVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureRouteLeakFromOtherService", "routeProtocolVariable");
            }
            this.routeProtocolVariable = routeProtocolVariable;
            return this;
        }
        @CustomType.Setter
        public Builder sourceVpn(Integer sourceVpn) {
            if (sourceVpn == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureRouteLeakFromOtherService", "sourceVpn");
            }
            this.sourceVpn = sourceVpn;
            return this;
        }
        @CustomType.Setter
        public Builder sourceVpnVariable(String sourceVpnVariable) {
            if (sourceVpnVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureRouteLeakFromOtherService", "sourceVpnVariable");
            }
            this.sourceVpnVariable = sourceVpnVariable;
            return this;
        }
        public GetServiceLanVpnFeatureRouteLeakFromOtherService build() {
            final var _resultValue = new GetServiceLanVpnFeatureRouteLeakFromOtherService();
            _resultValue.redistributions = redistributions;
            _resultValue.routePolicyId = routePolicyId;
            _resultValue.routeProtocol = routeProtocol;
            _resultValue.routeProtocolVariable = routeProtocolVariable;
            _resultValue.sourceVpn = sourceVpn;
            _resultValue.sourceVpnVariable = sourceVpnVariable;
            return _resultValue;
        }
    }
}
