// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VpnInterfaceCellularFeatureTemplateStaticArp {
    /**
     * @return IP Address
     * 
     */
    private @Nullable String ipAddress;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String ipAddressVariable;
    /**
     * @return MAC address
     * 
     */
    private @Nullable String mac;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String macVariable;
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private @Nullable Boolean optional;

    private VpnInterfaceCellularFeatureTemplateStaticArp() {}
    /**
     * @return IP Address
     * 
     */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> ipAddressVariable() {
        return Optional.ofNullable(this.ipAddressVariable);
    }
    /**
     * @return MAC address
     * 
     */
    public Optional<String> mac() {
        return Optional.ofNullable(this.mac);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> macVariable() {
        return Optional.ofNullable(this.macVariable);
    }
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Optional<Boolean> optional() {
        return Optional.ofNullable(this.optional);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnInterfaceCellularFeatureTemplateStaticArp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String ipAddress;
        private @Nullable String ipAddressVariable;
        private @Nullable String mac;
        private @Nullable String macVariable;
        private @Nullable Boolean optional;
        public Builder() {}
        public Builder(VpnInterfaceCellularFeatureTemplateStaticArp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipAddressVariable = defaults.ipAddressVariable;
    	      this.mac = defaults.mac;
    	      this.macVariable = defaults.macVariable;
    	      this.optional = defaults.optional;
        }

        @CustomType.Setter
        public Builder ipAddress(@Nullable String ipAddress) {

            this.ipAddress = ipAddress;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddressVariable(@Nullable String ipAddressVariable) {

            this.ipAddressVariable = ipAddressVariable;
            return this;
        }
        @CustomType.Setter
        public Builder mac(@Nullable String mac) {

            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder macVariable(@Nullable String macVariable) {

            this.macVariable = macVariable;
            return this;
        }
        @CustomType.Setter
        public Builder optional(@Nullable Boolean optional) {

            this.optional = optional;
            return this;
        }
        public VpnInterfaceCellularFeatureTemplateStaticArp build() {
            final var _resultValue = new VpnInterfaceCellularFeatureTemplateStaticArp();
            _resultValue.ipAddress = ipAddress;
            _resultValue.ipAddressVariable = ipAddressVariable;
            _resultValue.mac = mac;
            _resultValue.macVariable = macVariable;
            _resultValue.optional = optional;
            return _resultValue;
        }
    }
}
