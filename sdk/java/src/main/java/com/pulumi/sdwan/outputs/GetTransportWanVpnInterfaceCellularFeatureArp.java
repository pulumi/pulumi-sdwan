// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTransportWanVpnInterfaceCellularFeatureArp {
    /**
     * @return IP V4 Address
     * 
     */
    private String ipAddress;
    /**
     * @return Variable name
     * 
     */
    private String ipAddressVariable;
    /**
     * @return MAC Address
     * 
     */
    private String macAddress;
    /**
     * @return Variable name
     * 
     */
    private String macAddressVariable;

    private GetTransportWanVpnInterfaceCellularFeatureArp() {}
    /**
     * @return IP V4 Address
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return Variable name
     * 
     */
    public String ipAddressVariable() {
        return this.ipAddressVariable;
    }
    /**
     * @return MAC Address
     * 
     */
    public String macAddress() {
        return this.macAddress;
    }
    /**
     * @return Variable name
     * 
     */
    public String macAddressVariable() {
        return this.macAddressVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransportWanVpnInterfaceCellularFeatureArp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ipAddress;
        private String ipAddressVariable;
        private String macAddress;
        private String macAddressVariable;
        public Builder() {}
        public Builder(GetTransportWanVpnInterfaceCellularFeatureArp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipAddressVariable = defaults.ipAddressVariable;
    	      this.macAddress = defaults.macAddress;
    	      this.macAddressVariable = defaults.macAddressVariable;
        }

        @CustomType.Setter
        public Builder ipAddress(String ipAddress) {
            if (ipAddress == null) {
              throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceCellularFeatureArp", "ipAddress");
            }
            this.ipAddress = ipAddress;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddressVariable(String ipAddressVariable) {
            if (ipAddressVariable == null) {
              throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceCellularFeatureArp", "ipAddressVariable");
            }
            this.ipAddressVariable = ipAddressVariable;
            return this;
        }
        @CustomType.Setter
        public Builder macAddress(String macAddress) {
            if (macAddress == null) {
              throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceCellularFeatureArp", "macAddress");
            }
            this.macAddress = macAddress;
            return this;
        }
        @CustomType.Setter
        public Builder macAddressVariable(String macAddressVariable) {
            if (macAddressVariable == null) {
              throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceCellularFeatureArp", "macAddressVariable");
            }
            this.macAddressVariable = macAddressVariable;
            return this;
        }
        public GetTransportWanVpnInterfaceCellularFeatureArp build() {
            final var _resultValue = new GetTransportWanVpnInterfaceCellularFeatureArp();
            _resultValue.ipAddress = ipAddress;
            _resultValue.ipAddressVariable = ipAddressVariable;
            _resultValue.macAddress = macAddress;
            _resultValue.macAddressVariable = macAddressVariable;
            return _resultValue;
        }
    }
}