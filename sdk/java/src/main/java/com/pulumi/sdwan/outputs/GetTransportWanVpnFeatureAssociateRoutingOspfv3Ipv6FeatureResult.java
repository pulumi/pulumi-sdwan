// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureResult {
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
     * @return Transport Routing OSPFv4 IPv6 Feature ID
     * 
     */
    private String transportRoutingOspfv3Ipv6FeatureId;
    /**
     * @return Transport WAN VPN Feature ID
     * 
     */
    private String transportWanVpnFeatureId;
    /**
     * @return The version of the object
     * 
     */
    private Integer version;

    private GetTransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureResult() {}
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
     * @return Transport Routing OSPFv4 IPv6 Feature ID
     * 
     */
    public String transportRoutingOspfv3Ipv6FeatureId() {
        return this.transportRoutingOspfv3Ipv6FeatureId;
    }
    /**
     * @return Transport WAN VPN Feature ID
     * 
     */
    public String transportWanVpnFeatureId() {
        return this.transportWanVpnFeatureId;
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

    public static Builder builder(GetTransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String featureProfileId;
        private String id;
        private String transportRoutingOspfv3Ipv6FeatureId;
        private String transportWanVpnFeatureId;
        private Integer version;
        public Builder() {}
        public Builder(GetTransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.featureProfileId = defaults.featureProfileId;
    	      this.id = defaults.id;
    	      this.transportRoutingOspfv3Ipv6FeatureId = defaults.transportRoutingOspfv3Ipv6FeatureId;
    	      this.transportWanVpnFeatureId = defaults.transportWanVpnFeatureId;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder featureProfileId(String featureProfileId) {
            if (featureProfileId == null) {
              throw new MissingRequiredPropertyException("GetTransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureResult", "featureProfileId");
            }
            this.featureProfileId = featureProfileId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder transportRoutingOspfv3Ipv6FeatureId(String transportRoutingOspfv3Ipv6FeatureId) {
            if (transportRoutingOspfv3Ipv6FeatureId == null) {
              throw new MissingRequiredPropertyException("GetTransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureResult", "transportRoutingOspfv3Ipv6FeatureId");
            }
            this.transportRoutingOspfv3Ipv6FeatureId = transportRoutingOspfv3Ipv6FeatureId;
            return this;
        }
        @CustomType.Setter
        public Builder transportWanVpnFeatureId(String transportWanVpnFeatureId) {
            if (transportWanVpnFeatureId == null) {
              throw new MissingRequiredPropertyException("GetTransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureResult", "transportWanVpnFeatureId");
            }
            this.transportWanVpnFeatureId = transportWanVpnFeatureId;
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetTransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureResult", "version");
            }
            this.version = version;
            return this;
        }
        public GetTransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureResult build() {
            final var _resultValue = new GetTransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureResult();
            _resultValue.featureProfileId = featureProfileId;
            _resultValue.id = id;
            _resultValue.transportRoutingOspfv3Ipv6FeatureId = transportRoutingOspfv3Ipv6FeatureId;
            _resultValue.transportWanVpnFeatureId = transportWanVpnFeatureId;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
