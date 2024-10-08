// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.outputs.GetServiceLanVpnFeatureAdvertiseOmpIpv6Prefix;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceLanVpnFeatureAdvertiseOmpIpv6 {
    /**
     * @return IPv6 Prefix List
     * 
     */
    private List<GetServiceLanVpnFeatureAdvertiseOmpIpv6Prefix> prefixes;
    /**
     * @return Protocol
     * 
     */
    private String protocol;
    /**
     * @return Protocol Sub Type
     * 
     */
    private String protocolSubType;
    /**
     * @return Variable name
     * 
     */
    private String protocolSubTypeVariable;
    /**
     * @return Variable name
     * 
     */
    private String protocolVariable;
    private String routePolicyId;

    private GetServiceLanVpnFeatureAdvertiseOmpIpv6() {}
    /**
     * @return IPv6 Prefix List
     * 
     */
    public List<GetServiceLanVpnFeatureAdvertiseOmpIpv6Prefix> prefixes() {
        return this.prefixes;
    }
    /**
     * @return Protocol
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return Protocol Sub Type
     * 
     */
    public String protocolSubType() {
        return this.protocolSubType;
    }
    /**
     * @return Variable name
     * 
     */
    public String protocolSubTypeVariable() {
        return this.protocolSubTypeVariable;
    }
    /**
     * @return Variable name
     * 
     */
    public String protocolVariable() {
        return this.protocolVariable;
    }
    public String routePolicyId() {
        return this.routePolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceLanVpnFeatureAdvertiseOmpIpv6 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetServiceLanVpnFeatureAdvertiseOmpIpv6Prefix> prefixes;
        private String protocol;
        private String protocolSubType;
        private String protocolSubTypeVariable;
        private String protocolVariable;
        private String routePolicyId;
        public Builder() {}
        public Builder(GetServiceLanVpnFeatureAdvertiseOmpIpv6 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefixes = defaults.prefixes;
    	      this.protocol = defaults.protocol;
    	      this.protocolSubType = defaults.protocolSubType;
    	      this.protocolSubTypeVariable = defaults.protocolSubTypeVariable;
    	      this.protocolVariable = defaults.protocolVariable;
    	      this.routePolicyId = defaults.routePolicyId;
        }

        @CustomType.Setter
        public Builder prefixes(List<GetServiceLanVpnFeatureAdvertiseOmpIpv6Prefix> prefixes) {
            if (prefixes == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureAdvertiseOmpIpv6", "prefixes");
            }
            this.prefixes = prefixes;
            return this;
        }
        public Builder prefixes(GetServiceLanVpnFeatureAdvertiseOmpIpv6Prefix... prefixes) {
            return prefixes(List.of(prefixes));
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureAdvertiseOmpIpv6", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder protocolSubType(String protocolSubType) {
            if (protocolSubType == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureAdvertiseOmpIpv6", "protocolSubType");
            }
            this.protocolSubType = protocolSubType;
            return this;
        }
        @CustomType.Setter
        public Builder protocolSubTypeVariable(String protocolSubTypeVariable) {
            if (protocolSubTypeVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureAdvertiseOmpIpv6", "protocolSubTypeVariable");
            }
            this.protocolSubTypeVariable = protocolSubTypeVariable;
            return this;
        }
        @CustomType.Setter
        public Builder protocolVariable(String protocolVariable) {
            if (protocolVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureAdvertiseOmpIpv6", "protocolVariable");
            }
            this.protocolVariable = protocolVariable;
            return this;
        }
        @CustomType.Setter
        public Builder routePolicyId(String routePolicyId) {
            if (routePolicyId == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureAdvertiseOmpIpv6", "routePolicyId");
            }
            this.routePolicyId = routePolicyId;
            return this;
        }
        public GetServiceLanVpnFeatureAdvertiseOmpIpv6 build() {
            final var _resultValue = new GetServiceLanVpnFeatureAdvertiseOmpIpv6();
            _resultValue.prefixes = prefixes;
            _resultValue.protocol = protocol;
            _resultValue.protocolSubType = protocolSubType;
            _resultValue.protocolSubTypeVariable = protocolSubTypeVariable;
            _resultValue.protocolVariable = protocolVariable;
            _resultValue.routePolicyId = routePolicyId;
            return _resultValue;
        }
    }
}
