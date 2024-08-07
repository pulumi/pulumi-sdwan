// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVpnInterfaceSviFeatureTemplateIpv4VrrpTrackingObject {
    /**
     * @return Decrement Value for VRRP priority
     * 
     */
    private Integer decrementValue;
    /**
     * @return Variable name
     * 
     */
    private String decrementValueVariable;
    /**
     * @return Tracker ID
     * 
     */
    private Integer name;
    /**
     * @return Variable name
     * 
     */
    private String nameVariable;
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private Boolean optional;
    /**
     * @return Track Action
     * 
     */
    private String trackAction;
    /**
     * @return Variable name
     * 
     */
    private String trackActionVariable;

    private GetVpnInterfaceSviFeatureTemplateIpv4VrrpTrackingObject() {}
    /**
     * @return Decrement Value for VRRP priority
     * 
     */
    public Integer decrementValue() {
        return this.decrementValue;
    }
    /**
     * @return Variable name
     * 
     */
    public String decrementValueVariable() {
        return this.decrementValueVariable;
    }
    /**
     * @return Tracker ID
     * 
     */
    public Integer name() {
        return this.name;
    }
    /**
     * @return Variable name
     * 
     */
    public String nameVariable() {
        return this.nameVariable;
    }
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Boolean optional() {
        return this.optional;
    }
    /**
     * @return Track Action
     * 
     */
    public String trackAction() {
        return this.trackAction;
    }
    /**
     * @return Variable name
     * 
     */
    public String trackActionVariable() {
        return this.trackActionVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpnInterfaceSviFeatureTemplateIpv4VrrpTrackingObject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer decrementValue;
        private String decrementValueVariable;
        private Integer name;
        private String nameVariable;
        private Boolean optional;
        private String trackAction;
        private String trackActionVariable;
        public Builder() {}
        public Builder(GetVpnInterfaceSviFeatureTemplateIpv4VrrpTrackingObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.decrementValue = defaults.decrementValue;
    	      this.decrementValueVariable = defaults.decrementValueVariable;
    	      this.name = defaults.name;
    	      this.nameVariable = defaults.nameVariable;
    	      this.optional = defaults.optional;
    	      this.trackAction = defaults.trackAction;
    	      this.trackActionVariable = defaults.trackActionVariable;
        }

        @CustomType.Setter
        public Builder decrementValue(Integer decrementValue) {
            if (decrementValue == null) {
              throw new MissingRequiredPropertyException("GetVpnInterfaceSviFeatureTemplateIpv4VrrpTrackingObject", "decrementValue");
            }
            this.decrementValue = decrementValue;
            return this;
        }
        @CustomType.Setter
        public Builder decrementValueVariable(String decrementValueVariable) {
            if (decrementValueVariable == null) {
              throw new MissingRequiredPropertyException("GetVpnInterfaceSviFeatureTemplateIpv4VrrpTrackingObject", "decrementValueVariable");
            }
            this.decrementValueVariable = decrementValueVariable;
            return this;
        }
        @CustomType.Setter
        public Builder name(Integer name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetVpnInterfaceSviFeatureTemplateIpv4VrrpTrackingObject", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nameVariable(String nameVariable) {
            if (nameVariable == null) {
              throw new MissingRequiredPropertyException("GetVpnInterfaceSviFeatureTemplateIpv4VrrpTrackingObject", "nameVariable");
            }
            this.nameVariable = nameVariable;
            return this;
        }
        @CustomType.Setter
        public Builder optional(Boolean optional) {
            if (optional == null) {
              throw new MissingRequiredPropertyException("GetVpnInterfaceSviFeatureTemplateIpv4VrrpTrackingObject", "optional");
            }
            this.optional = optional;
            return this;
        }
        @CustomType.Setter
        public Builder trackAction(String trackAction) {
            if (trackAction == null) {
              throw new MissingRequiredPropertyException("GetVpnInterfaceSviFeatureTemplateIpv4VrrpTrackingObject", "trackAction");
            }
            this.trackAction = trackAction;
            return this;
        }
        @CustomType.Setter
        public Builder trackActionVariable(String trackActionVariable) {
            if (trackActionVariable == null) {
              throw new MissingRequiredPropertyException("GetVpnInterfaceSviFeatureTemplateIpv4VrrpTrackingObject", "trackActionVariable");
            }
            this.trackActionVariable = trackActionVariable;
            return this;
        }
        public GetVpnInterfaceSviFeatureTemplateIpv4VrrpTrackingObject build() {
            final var _resultValue = new GetVpnInterfaceSviFeatureTemplateIpv4VrrpTrackingObject();
            _resultValue.decrementValue = decrementValue;
            _resultValue.decrementValueVariable = decrementValueVariable;
            _resultValue.name = name;
            _resultValue.nameVariable = nameVariable;
            _resultValue.optional = optional;
            _resultValue.trackAction = trackAction;
            _resultValue.trackActionVariable = trackActionVariable;
            return _resultValue;
        }
    }
}
