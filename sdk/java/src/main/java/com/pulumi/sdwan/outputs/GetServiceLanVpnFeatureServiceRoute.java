// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceLanVpnFeatureServiceRoute {
    /**
     * @return IP Address
     * 
     */
    private String networkAddress;
    /**
     * @return Variable name
     * 
     */
    private String networkAddressVariable;
    /**
     * @return Service
     * 
     */
    private String service;
    /**
     * @return Variable name
     * 
     */
    private String serviceVariable;
    /**
     * @return Subnet Mask
     * 
     */
    private String subnetMask;
    /**
     * @return Variable name
     * 
     */
    private String subnetMaskVariable;
    /**
     * @return Service
     * 
     */
    private Integer vpn;

    private GetServiceLanVpnFeatureServiceRoute() {}
    /**
     * @return IP Address
     * 
     */
    public String networkAddress() {
        return this.networkAddress;
    }
    /**
     * @return Variable name
     * 
     */
    public String networkAddressVariable() {
        return this.networkAddressVariable;
    }
    /**
     * @return Service
     * 
     */
    public String service() {
        return this.service;
    }
    /**
     * @return Variable name
     * 
     */
    public String serviceVariable() {
        return this.serviceVariable;
    }
    /**
     * @return Subnet Mask
     * 
     */
    public String subnetMask() {
        return this.subnetMask;
    }
    /**
     * @return Variable name
     * 
     */
    public String subnetMaskVariable() {
        return this.subnetMaskVariable;
    }
    /**
     * @return Service
     * 
     */
    public Integer vpn() {
        return this.vpn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceLanVpnFeatureServiceRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String networkAddress;
        private String networkAddressVariable;
        private String service;
        private String serviceVariable;
        private String subnetMask;
        private String subnetMaskVariable;
        private Integer vpn;
        public Builder() {}
        public Builder(GetServiceLanVpnFeatureServiceRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkAddress = defaults.networkAddress;
    	      this.networkAddressVariable = defaults.networkAddressVariable;
    	      this.service = defaults.service;
    	      this.serviceVariable = defaults.serviceVariable;
    	      this.subnetMask = defaults.subnetMask;
    	      this.subnetMaskVariable = defaults.subnetMaskVariable;
    	      this.vpn = defaults.vpn;
        }

        @CustomType.Setter
        public Builder networkAddress(String networkAddress) {
            if (networkAddress == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureServiceRoute", "networkAddress");
            }
            this.networkAddress = networkAddress;
            return this;
        }
        @CustomType.Setter
        public Builder networkAddressVariable(String networkAddressVariable) {
            if (networkAddressVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureServiceRoute", "networkAddressVariable");
            }
            this.networkAddressVariable = networkAddressVariable;
            return this;
        }
        @CustomType.Setter
        public Builder service(String service) {
            if (service == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureServiceRoute", "service");
            }
            this.service = service;
            return this;
        }
        @CustomType.Setter
        public Builder serviceVariable(String serviceVariable) {
            if (serviceVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureServiceRoute", "serviceVariable");
            }
            this.serviceVariable = serviceVariable;
            return this;
        }
        @CustomType.Setter
        public Builder subnetMask(String subnetMask) {
            if (subnetMask == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureServiceRoute", "subnetMask");
            }
            this.subnetMask = subnetMask;
            return this;
        }
        @CustomType.Setter
        public Builder subnetMaskVariable(String subnetMaskVariable) {
            if (subnetMaskVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureServiceRoute", "subnetMaskVariable");
            }
            this.subnetMaskVariable = subnetMaskVariable;
            return this;
        }
        @CustomType.Setter
        public Builder vpn(Integer vpn) {
            if (vpn == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureServiceRoute", "vpn");
            }
            this.vpn = vpn;
            return this;
        }
        public GetServiceLanVpnFeatureServiceRoute build() {
            final var _resultValue = new GetServiceLanVpnFeatureServiceRoute();
            _resultValue.networkAddress = networkAddress;
            _resultValue.networkAddressVariable = networkAddressVariable;
            _resultValue.service = service;
            _resultValue.serviceVariable = serviceVariable;
            _resultValue.subnetMask = subnetMask;
            _resultValue.subnetMaskVariable = subnetMaskVariable;
            _resultValue.vpn = vpn;
            return _resultValue;
        }
    }
}