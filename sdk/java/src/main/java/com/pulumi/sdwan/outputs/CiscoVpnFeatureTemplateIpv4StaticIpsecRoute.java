// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CiscoVpnFeatureTemplateIpv4StaticIpsecRoute {
    /**
     * @return Variable name
     * 
     */
    private @Nullable String interfaceVariable;
    /**
     * @return List of IPSEC Interfaces (Separated by commas)
     * 
     */
    private @Nullable List<String> interfaces;
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private @Nullable Boolean optional;
    /**
     * @return Prefix
     * 
     */
    private @Nullable String prefix;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String prefixVariable;
    /**
     * @return Destination VPN to resolve the prefix
     *   - Default value: `0`
     * 
     */
    private @Nullable Integer vpnId;

    private CiscoVpnFeatureTemplateIpv4StaticIpsecRoute() {}
    /**
     * @return Variable name
     * 
     */
    public Optional<String> interfaceVariable() {
        return Optional.ofNullable(this.interfaceVariable);
    }
    /**
     * @return List of IPSEC Interfaces (Separated by commas)
     * 
     */
    public List<String> interfaces() {
        return this.interfaces == null ? List.of() : this.interfaces;
    }
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Optional<Boolean> optional() {
        return Optional.ofNullable(this.optional);
    }
    /**
     * @return Prefix
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> prefixVariable() {
        return Optional.ofNullable(this.prefixVariable);
    }
    /**
     * @return Destination VPN to resolve the prefix
     *   - Default value: `0`
     * 
     */
    public Optional<Integer> vpnId() {
        return Optional.ofNullable(this.vpnId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CiscoVpnFeatureTemplateIpv4StaticIpsecRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String interfaceVariable;
        private @Nullable List<String> interfaces;
        private @Nullable Boolean optional;
        private @Nullable String prefix;
        private @Nullable String prefixVariable;
        private @Nullable Integer vpnId;
        public Builder() {}
        public Builder(CiscoVpnFeatureTemplateIpv4StaticIpsecRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interfaceVariable = defaults.interfaceVariable;
    	      this.interfaces = defaults.interfaces;
    	      this.optional = defaults.optional;
    	      this.prefix = defaults.prefix;
    	      this.prefixVariable = defaults.prefixVariable;
    	      this.vpnId = defaults.vpnId;
        }

        @CustomType.Setter
        public Builder interfaceVariable(@Nullable String interfaceVariable) {

            this.interfaceVariable = interfaceVariable;
            return this;
        }
        @CustomType.Setter
        public Builder interfaces(@Nullable List<String> interfaces) {

            this.interfaces = interfaces;
            return this;
        }
        public Builder interfaces(String... interfaces) {
            return interfaces(List.of(interfaces));
        }
        @CustomType.Setter
        public Builder optional(@Nullable Boolean optional) {

            this.optional = optional;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {

            this.prefix = prefix;
            return this;
        }
        @CustomType.Setter
        public Builder prefixVariable(@Nullable String prefixVariable) {

            this.prefixVariable = prefixVariable;
            return this;
        }
        @CustomType.Setter
        public Builder vpnId(@Nullable Integer vpnId) {

            this.vpnId = vpnId;
            return this;
        }
        public CiscoVpnFeatureTemplateIpv4StaticIpsecRoute build() {
            final var _resultValue = new CiscoVpnFeatureTemplateIpv4StaticIpsecRoute();
            _resultValue.interfaceVariable = interfaceVariable;
            _resultValue.interfaces = interfaces;
            _resultValue.optional = optional;
            _resultValue.prefix = prefix;
            _resultValue.prefixVariable = prefixVariable;
            _resultValue.vpnId = vpnId;
            return _resultValue;
        }
    }
}
