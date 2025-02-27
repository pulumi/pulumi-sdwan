// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceLanVpnInterfaceSviFeatureIpv4VrrpSecondaryAddress {
    /**
     * @return VRRP Secondary IPV4 address
     * 
     */
    private String address;
    /**
     * @return Variable name
     * 
     */
    private String addressVariable;

    private GetServiceLanVpnInterfaceSviFeatureIpv4VrrpSecondaryAddress() {}
    /**
     * @return VRRP Secondary IPV4 address
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceLanVpnInterfaceSviFeatureIpv4VrrpSecondaryAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private String addressVariable;
        public Builder() {}
        public Builder(GetServiceLanVpnInterfaceSviFeatureIpv4VrrpSecondaryAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.addressVariable = defaults.addressVariable;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceSviFeatureIpv4VrrpSecondaryAddress", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder addressVariable(String addressVariable) {
            if (addressVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceSviFeatureIpv4VrrpSecondaryAddress", "addressVariable");
            }
            this.addressVariable = addressVariable;
            return this;
        }
        public GetServiceLanVpnInterfaceSviFeatureIpv4VrrpSecondaryAddress build() {
            final var _resultValue = new GetServiceLanVpnInterfaceSviFeatureIpv4VrrpSecondaryAddress();
            _resultValue.address = address;
            _resultValue.addressVariable = addressVariable;
            return _resultValue;
        }
    }
}
