// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceLanVpnFeatureRouteLeakToGlobalVpnRedistribution {
    /**
     * @return Protocol to restributed leaked routes
     * 
     */
    private String protocol;
    /**
     * @return Variable name
     * 
     */
    private String protocolVariable;
    private String redistributionPolicyId;

    private GetServiceLanVpnFeatureRouteLeakToGlobalVpnRedistribution() {}
    /**
     * @return Protocol to restributed leaked routes
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return Variable name
     * 
     */
    public String protocolVariable() {
        return this.protocolVariable;
    }
    public String redistributionPolicyId() {
        return this.redistributionPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceLanVpnFeatureRouteLeakToGlobalVpnRedistribution defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String protocol;
        private String protocolVariable;
        private String redistributionPolicyId;
        public Builder() {}
        public Builder(GetServiceLanVpnFeatureRouteLeakToGlobalVpnRedistribution defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protocol = defaults.protocol;
    	      this.protocolVariable = defaults.protocolVariable;
    	      this.redistributionPolicyId = defaults.redistributionPolicyId;
        }

        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureRouteLeakToGlobalVpnRedistribution", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder protocolVariable(String protocolVariable) {
            if (protocolVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureRouteLeakToGlobalVpnRedistribution", "protocolVariable");
            }
            this.protocolVariable = protocolVariable;
            return this;
        }
        @CustomType.Setter
        public Builder redistributionPolicyId(String redistributionPolicyId) {
            if (redistributionPolicyId == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureRouteLeakToGlobalVpnRedistribution", "redistributionPolicyId");
            }
            this.redistributionPolicyId = redistributionPolicyId;
            return this;
        }
        public GetServiceLanVpnFeatureRouteLeakToGlobalVpnRedistribution build() {
            final var _resultValue = new GetServiceLanVpnFeatureRouteLeakToGlobalVpnRedistribution();
            _resultValue.protocol = protocol;
            _resultValue.protocolVariable = protocolVariable;
            _resultValue.redistributionPolicyId = redistributionPolicyId;
            return _resultValue;
        }
    }
}
