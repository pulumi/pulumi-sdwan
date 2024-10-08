// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVpnInterfaceDslPppoeFeatureTemplatePolicer {
    /**
     * @return Direction
     * 
     */
    private String direction;
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private Boolean optional;
    /**
     * @return Name of policer
     * 
     */
    private String policerName;

    private GetVpnInterfaceDslPppoeFeatureTemplatePolicer() {}
    /**
     * @return Direction
     * 
     */
    public String direction() {
        return this.direction;
    }
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Boolean optional() {
        return this.optional;
    }
    /**
     * @return Name of policer
     * 
     */
    public String policerName() {
        return this.policerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpnInterfaceDslPppoeFeatureTemplatePolicer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String direction;
        private Boolean optional;
        private String policerName;
        public Builder() {}
        public Builder(GetVpnInterfaceDslPppoeFeatureTemplatePolicer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.optional = defaults.optional;
    	      this.policerName = defaults.policerName;
        }

        @CustomType.Setter
        public Builder direction(String direction) {
            if (direction == null) {
              throw new MissingRequiredPropertyException("GetVpnInterfaceDslPppoeFeatureTemplatePolicer", "direction");
            }
            this.direction = direction;
            return this;
        }
        @CustomType.Setter
        public Builder optional(Boolean optional) {
            if (optional == null) {
              throw new MissingRequiredPropertyException("GetVpnInterfaceDslPppoeFeatureTemplatePolicer", "optional");
            }
            this.optional = optional;
            return this;
        }
        @CustomType.Setter
        public Builder policerName(String policerName) {
            if (policerName == null) {
              throw new MissingRequiredPropertyException("GetVpnInterfaceDslPppoeFeatureTemplatePolicer", "policerName");
            }
            this.policerName = policerName;
            return this;
        }
        public GetVpnInterfaceDslPppoeFeatureTemplatePolicer build() {
            final var _resultValue = new GetVpnInterfaceDslPppoeFeatureTemplatePolicer();
            _resultValue.direction = direction;
            _resultValue.optional = optional;
            _resultValue.policerName = policerName;
            return _resultValue;
        }
    }
}
