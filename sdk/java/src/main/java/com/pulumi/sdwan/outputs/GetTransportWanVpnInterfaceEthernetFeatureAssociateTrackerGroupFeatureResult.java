// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult {
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
     * @return Transport Tracker Group Feature ID
     * 
     */
    private String transportTrackerGroupFeatureId;
    /**
     * @return Transport WAN VPN Feature ID
     * 
     */
    private String transportWanVpnFeatureId;
    /**
     * @return Transport WAN VPN Interface Ethernet Feature ID
     * 
     */
    private String transportWanVpnInterfaceEthernetFeatureId;
    /**
     * @return The version of the object
     * 
     */
    private Integer version;

    private GetTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult() {}
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
     * @return Transport Tracker Group Feature ID
     * 
     */
    public String transportTrackerGroupFeatureId() {
        return this.transportTrackerGroupFeatureId;
    }
    /**
     * @return Transport WAN VPN Feature ID
     * 
     */
    public String transportWanVpnFeatureId() {
        return this.transportWanVpnFeatureId;
    }
    /**
     * @return Transport WAN VPN Interface Ethernet Feature ID
     * 
     */
    public String transportWanVpnInterfaceEthernetFeatureId() {
        return this.transportWanVpnInterfaceEthernetFeatureId;
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

    public static Builder builder(GetTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String featureProfileId;
        private String id;
        private String transportTrackerGroupFeatureId;
        private String transportWanVpnFeatureId;
        private String transportWanVpnInterfaceEthernetFeatureId;
        private Integer version;
        public Builder() {}
        public Builder(GetTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.featureProfileId = defaults.featureProfileId;
    	      this.id = defaults.id;
    	      this.transportTrackerGroupFeatureId = defaults.transportTrackerGroupFeatureId;
    	      this.transportWanVpnFeatureId = defaults.transportWanVpnFeatureId;
    	      this.transportWanVpnInterfaceEthernetFeatureId = defaults.transportWanVpnInterfaceEthernetFeatureId;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder featureProfileId(String featureProfileId) {
            if (featureProfileId == null) {
              throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult", "featureProfileId");
            }
            this.featureProfileId = featureProfileId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder transportTrackerGroupFeatureId(String transportTrackerGroupFeatureId) {
            if (transportTrackerGroupFeatureId == null) {
              throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult", "transportTrackerGroupFeatureId");
            }
            this.transportTrackerGroupFeatureId = transportTrackerGroupFeatureId;
            return this;
        }
        @CustomType.Setter
        public Builder transportWanVpnFeatureId(String transportWanVpnFeatureId) {
            if (transportWanVpnFeatureId == null) {
              throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult", "transportWanVpnFeatureId");
            }
            this.transportWanVpnFeatureId = transportWanVpnFeatureId;
            return this;
        }
        @CustomType.Setter
        public Builder transportWanVpnInterfaceEthernetFeatureId(String transportWanVpnInterfaceEthernetFeatureId) {
            if (transportWanVpnInterfaceEthernetFeatureId == null) {
              throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult", "transportWanVpnInterfaceEthernetFeatureId");
            }
            this.transportWanVpnInterfaceEthernetFeatureId = transportWanVpnInterfaceEthernetFeatureId;
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult", "version");
            }
            this.version = version;
            return this;
        }
        public GetTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult build() {
            final var _resultValue = new GetTransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureResult();
            _resultValue.featureProfileId = featureProfileId;
            _resultValue.id = id;
            _resultValue.transportTrackerGroupFeatureId = transportTrackerGroupFeatureId;
            _resultValue.transportWanVpnFeatureId = transportWanVpnFeatureId;
            _resultValue.transportWanVpnInterfaceEthernetFeatureId = transportWanVpnInterfaceEthernetFeatureId;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
