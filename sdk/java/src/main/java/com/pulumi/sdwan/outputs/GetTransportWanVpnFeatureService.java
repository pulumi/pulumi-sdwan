// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTransportWanVpnFeatureService {
    /**
     * @return Service Type
     * 
     */
    private String serviceType;

    private GetTransportWanVpnFeatureService() {}
    /**
     * @return Service Type
     * 
     */
    public String serviceType() {
        return this.serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransportWanVpnFeatureService defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String serviceType;
        public Builder() {}
        public Builder(GetTransportWanVpnFeatureService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceType = defaults.serviceType;
        }

        @CustomType.Setter
        public Builder serviceType(String serviceType) {
            if (serviceType == null) {
              throw new MissingRequiredPropertyException("GetTransportWanVpnFeatureService", "serviceType");
            }
            this.serviceType = serviceType;
            return this;
        }
        public GetTransportWanVpnFeatureService build() {
            final var _resultValue = new GetTransportWanVpnFeatureService();
            _resultValue.serviceType = serviceType;
            return _resultValue;
        }
    }
}