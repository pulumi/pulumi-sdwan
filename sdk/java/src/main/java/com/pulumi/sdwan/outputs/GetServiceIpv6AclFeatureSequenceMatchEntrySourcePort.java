// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceIpv6AclFeatureSequenceMatchEntrySourcePort {
    /**
     * @return source port range or individual port number
     * 
     */
    private String port;

    private GetServiceIpv6AclFeatureSequenceMatchEntrySourcePort() {}
    /**
     * @return source port range or individual port number
     * 
     */
    public String port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceIpv6AclFeatureSequenceMatchEntrySourcePort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String port;
        public Builder() {}
        public Builder(GetServiceIpv6AclFeatureSequenceMatchEntrySourcePort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder port(String port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetServiceIpv6AclFeatureSequenceMatchEntrySourcePort", "port");
            }
            this.port = port;
            return this;
        }
        public GetServiceIpv6AclFeatureSequenceMatchEntrySourcePort build() {
            final var _resultValue = new GetServiceIpv6AclFeatureSequenceMatchEntrySourcePort();
            _resultValue.port = port;
            return _resultValue;
        }
    }
}
