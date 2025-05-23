// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceLanVpnFeatureAssociateRoutingBgpFeatureResult {
    /**
     * @return Feature Profile ID
     * 
     */
    private String featureProfileId;
    /**
     * @return The id of the object
     * 
     */
    private String id;
    /**
     * @return Service LAN VPN Feature ID
     * 
     */
    private String serviceLanVpnFeatureId;
    /**
     * @return Service Routing BGP Feature ID
     * 
     */
    private String serviceRoutingBgpFeatureId;
    /**
     * @return The version of the object
     * 
     */
    private Integer version;

    private GetServiceLanVpnFeatureAssociateRoutingBgpFeatureResult() {}
    /**
     * @return Feature Profile ID
     * 
     */
    public String featureProfileId() {
        return this.featureProfileId;
    }
    /**
     * @return The id of the object
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Service LAN VPN Feature ID
     * 
     */
    public String serviceLanVpnFeatureId() {
        return this.serviceLanVpnFeatureId;
    }
    /**
     * @return Service Routing BGP Feature ID
     * 
     */
    public String serviceRoutingBgpFeatureId() {
        return this.serviceRoutingBgpFeatureId;
    }
    /**
     * @return The version of the object
     * 
     */
    public Integer version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceLanVpnFeatureAssociateRoutingBgpFeatureResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String featureProfileId;
        private String id;
        private String serviceLanVpnFeatureId;
        private String serviceRoutingBgpFeatureId;
        private Integer version;
        public Builder() {}
        public Builder(GetServiceLanVpnFeatureAssociateRoutingBgpFeatureResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.featureProfileId = defaults.featureProfileId;
    	      this.id = defaults.id;
    	      this.serviceLanVpnFeatureId = defaults.serviceLanVpnFeatureId;
    	      this.serviceRoutingBgpFeatureId = defaults.serviceRoutingBgpFeatureId;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder featureProfileId(String featureProfileId) {
            if (featureProfileId == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureAssociateRoutingBgpFeatureResult", "featureProfileId");
            }
            this.featureProfileId = featureProfileId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureAssociateRoutingBgpFeatureResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder serviceLanVpnFeatureId(String serviceLanVpnFeatureId) {
            if (serviceLanVpnFeatureId == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureAssociateRoutingBgpFeatureResult", "serviceLanVpnFeatureId");
            }
            this.serviceLanVpnFeatureId = serviceLanVpnFeatureId;
            return this;
        }
        @CustomType.Setter
        public Builder serviceRoutingBgpFeatureId(String serviceRoutingBgpFeatureId) {
            if (serviceRoutingBgpFeatureId == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureAssociateRoutingBgpFeatureResult", "serviceRoutingBgpFeatureId");
            }
            this.serviceRoutingBgpFeatureId = serviceRoutingBgpFeatureId;
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureAssociateRoutingBgpFeatureResult", "version");
            }
            this.version = version;
            return this;
        }
        public GetServiceLanVpnFeatureAssociateRoutingBgpFeatureResult build() {
            final var _resultValue = new GetServiceLanVpnFeatureAssociateRoutingBgpFeatureResult();
            _resultValue.featureProfileId = featureProfileId;
            _resultValue.id = id;
            _resultValue.serviceLanVpnFeatureId = serviceLanVpnFeatureId;
            _resultValue.serviceRoutingBgpFeatureId = serviceRoutingBgpFeatureId;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
