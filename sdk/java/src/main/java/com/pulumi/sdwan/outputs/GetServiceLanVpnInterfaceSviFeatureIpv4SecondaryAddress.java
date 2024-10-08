// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddress {
    /**
     * @return IpV4 Address
     * 
     */
    private String address;
    /**
     * @return Variable name
     * 
     */
    private String addressVariable;
    /**
     * @return Subnet Mask
     * 
     */
    private String ipv4SubnetMask;
    /**
     * @return Variable name
     * 
     */
    private String ipv4SubnetMaskVariable;

    private GetServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddress() {}
    /**
     * @return IpV4 Address
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return Variable name
     * 
     */
    public String addressVariable() {
        return this.addressVariable;
    }
    /**
     * @return Subnet Mask
     * 
     */
    public String ipv4SubnetMask() {
        return this.ipv4SubnetMask;
    }
    /**
     * @return Variable name
     * 
     */
    public String ipv4SubnetMaskVariable() {
        return this.ipv4SubnetMaskVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private String addressVariable;
        private String ipv4SubnetMask;
        private String ipv4SubnetMaskVariable;
        public Builder() {}
        public Builder(GetServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.addressVariable = defaults.addressVariable;
    	      this.ipv4SubnetMask = defaults.ipv4SubnetMask;
    	      this.ipv4SubnetMaskVariable = defaults.ipv4SubnetMaskVariable;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddress", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder addressVariable(String addressVariable) {
            if (addressVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddress", "addressVariable");
            }
            this.addressVariable = addressVariable;
            return this;
        }
        @CustomType.Setter
        public Builder ipv4SubnetMask(String ipv4SubnetMask) {
            if (ipv4SubnetMask == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddress", "ipv4SubnetMask");
            }
            this.ipv4SubnetMask = ipv4SubnetMask;
            return this;
        }
        @CustomType.Setter
        public Builder ipv4SubnetMaskVariable(String ipv4SubnetMaskVariable) {
            if (ipv4SubnetMaskVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddress", "ipv4SubnetMaskVariable");
            }
            this.ipv4SubnetMaskVariable = ipv4SubnetMaskVariable;
            return this;
        }
        public GetServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddress build() {
            final var _resultValue = new GetServiceLanVpnInterfaceSviFeatureIpv4SecondaryAddress();
            _resultValue.address = address;
            _resultValue.addressVariable = addressVariable;
            _resultValue.ipv4SubnetMask = ipv4SubnetMask;
            _resultValue.ipv4SubnetMaskVariable = ipv4SubnetMaskVariable;
            return _resultValue;
        }
    }
}
