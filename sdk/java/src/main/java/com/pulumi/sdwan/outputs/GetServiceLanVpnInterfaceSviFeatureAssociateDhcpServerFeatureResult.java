// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureResult {
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
     * @return Service DHCP Server Feature ID
     * 
     */
    private String serviceDhcpServerFeatureId;
    /**
     * @return Service LAN VPN Feature ID
     * 
     */
    private String serviceLanVpnFeatureId;
    /**
     * @return Service LAN VPN Interface SVI Feature ID
     * 
     */
    private String serviceLanVpnInterfaceSviFeatureId;
    /**
     * @return The version of the object
     * 
     */
    private Integer version;

    private GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureResult() {}
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
     * @return Service DHCP Server Feature ID
     * 
     */
    public String serviceDhcpServerFeatureId() {
        return this.serviceDhcpServerFeatureId;
    }
    /**
     * @return Service LAN VPN Feature ID
     * 
     */
    public String serviceLanVpnFeatureId() {
        return this.serviceLanVpnFeatureId;
    }
    /**
     * @return Service LAN VPN Interface SVI Feature ID
     * 
     */
    public String serviceLanVpnInterfaceSviFeatureId() {
        return this.serviceLanVpnInterfaceSviFeatureId;
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

    public static Builder builder(GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String featureProfileId;
        private String id;
        private String serviceDhcpServerFeatureId;
        private String serviceLanVpnFeatureId;
        private String serviceLanVpnInterfaceSviFeatureId;
        private Integer version;
        public Builder() {}
        public Builder(GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.featureProfileId = defaults.featureProfileId;
    	      this.id = defaults.id;
    	      this.serviceDhcpServerFeatureId = defaults.serviceDhcpServerFeatureId;
    	      this.serviceLanVpnFeatureId = defaults.serviceLanVpnFeatureId;
    	      this.serviceLanVpnInterfaceSviFeatureId = defaults.serviceLanVpnInterfaceSviFeatureId;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder featureProfileId(String featureProfileId) {
            if (featureProfileId == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureResult", "featureProfileId");
            }
            this.featureProfileId = featureProfileId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder serviceDhcpServerFeatureId(String serviceDhcpServerFeatureId) {
            if (serviceDhcpServerFeatureId == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureResult", "serviceDhcpServerFeatureId");
            }
            this.serviceDhcpServerFeatureId = serviceDhcpServerFeatureId;
            return this;
        }
        @CustomType.Setter
        public Builder serviceLanVpnFeatureId(String serviceLanVpnFeatureId) {
            if (serviceLanVpnFeatureId == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureResult", "serviceLanVpnFeatureId");
            }
            this.serviceLanVpnFeatureId = serviceLanVpnFeatureId;
            return this;
        }
        @CustomType.Setter
        public Builder serviceLanVpnInterfaceSviFeatureId(String serviceLanVpnInterfaceSviFeatureId) {
            if (serviceLanVpnInterfaceSviFeatureId == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureResult", "serviceLanVpnInterfaceSviFeatureId");
            }
            this.serviceLanVpnInterfaceSviFeatureId = serviceLanVpnInterfaceSviFeatureId;
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureResult", "version");
            }
            this.version = version;
            return this;
        }
        public GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureResult build() {
            final var _resultValue = new GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureResult();
            _resultValue.featureProfileId = featureProfileId;
            _resultValue.id = id;
            _resultValue.serviceDhcpServerFeatureId = serviceDhcpServerFeatureId;
            _resultValue.serviceLanVpnFeatureId = serviceLanVpnFeatureId;
            _resultValue.serviceLanVpnInterfaceSviFeatureId = serviceLanVpnInterfaceSviFeatureId;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
