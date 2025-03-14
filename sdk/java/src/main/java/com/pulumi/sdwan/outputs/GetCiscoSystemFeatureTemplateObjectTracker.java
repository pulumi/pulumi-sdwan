// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.outputs.GetCiscoSystemFeatureTemplateObjectTrackerGroupTracksId;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCiscoSystemFeatureTemplateObjectTracker {
    /**
     * @return Type of grouping to be performed for tracker group
     * 
     */
    private String boolean_;
    /**
     * @return Variable name
     * 
     */
    private String booleanVariable;
    /**
     * @return Tracks id in group configuration
     * 
     */
    private List<GetCiscoSystemFeatureTemplateObjectTrackerGroupTracksId> groupTracksIds;
    /**
     * @return interface name
     * 
     */
    private String interface_;
    /**
     * @return Variable name
     * 
     */
    private String interfaceVariable;
    /**
     * @return IP address of route
     * 
     */
    private String ip;
    /**
     * @return Variable name
     * 
     */
    private String ipVariable;
    /**
     * @return Route Ip Mask
     * 
     */
    private String mask;
    /**
     * @return Variable name
     * 
     */
    private String maskVariable;
    /**
     * @return Object tracker ID
     * 
     */
    private Integer objectNumber;
    /**
     * @return Variable name
     * 
     */
    private String objectNumberVariable;
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private Boolean optional;
    /**
     * @return service sig
     * 
     */
    private String sig;
    /**
     * @return Variable name
     * 
     */
    private String sigVariable;
    /**
     * @return VPN
     * 
     */
    private Integer vpnId;

    private GetCiscoSystemFeatureTemplateObjectTracker() {}
    /**
     * @return Type of grouping to be performed for tracker group
     * 
     */
    public String boolean_() {
        return this.boolean_;
    }
    /**
     * @return Variable name
     * 
     */
    public String booleanVariable() {
        return this.booleanVariable;
    }
    /**
     * @return Tracks id in group configuration
     * 
     */
    public List<GetCiscoSystemFeatureTemplateObjectTrackerGroupTracksId> groupTracksIds() {
        return this.groupTracksIds;
    }
    /**
     * @return interface name
     * 
     */
    public String interface_() {
        return this.interface_;
    }
    /**
     * @return Variable name
     * 
     */
    public String interfaceVariable() {
        return this.interfaceVariable;
    }
    /**
     * @return IP address of route
     * 
     */
    public String ip() {
        return this.ip;
    }
    /**
     * @return Variable name
     * 
     */
    public String ipVariable() {
        return this.ipVariable;
    }
    /**
     * @return Route Ip Mask
     * 
     */
    public String mask() {
        return this.mask;
    }
    /**
     * @return Variable name
     * 
     */
    public String maskVariable() {
        return this.maskVariable;
    }
    /**
     * @return Object tracker ID
     * 
     */
    public Integer objectNumber() {
        return this.objectNumber;
    }
    /**
     * @return Variable name
     * 
     */
    public String objectNumberVariable() {
        return this.objectNumberVariable;
    }
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Boolean optional() {
        return this.optional;
    }
    /**
     * @return service sig
     * 
     */
    public String sig() {
        return this.sig;
    }
    /**
     * @return Variable name
     * 
     */
    public String sigVariable() {
        return this.sigVariable;
    }
    /**
     * @return VPN
     * 
     */
    public Integer vpnId() {
        return this.vpnId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCiscoSystemFeatureTemplateObjectTracker defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String boolean_;
        private String booleanVariable;
        private List<GetCiscoSystemFeatureTemplateObjectTrackerGroupTracksId> groupTracksIds;
        private String interface_;
        private String interfaceVariable;
        private String ip;
        private String ipVariable;
        private String mask;
        private String maskVariable;
        private Integer objectNumber;
        private String objectNumberVariable;
        private Boolean optional;
        private String sig;
        private String sigVariable;
        private Integer vpnId;
        public Builder() {}
        public Builder(GetCiscoSystemFeatureTemplateObjectTracker defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boolean_ = defaults.boolean_;
    	      this.booleanVariable = defaults.booleanVariable;
    	      this.groupTracksIds = defaults.groupTracksIds;
    	      this.interface_ = defaults.interface_;
    	      this.interfaceVariable = defaults.interfaceVariable;
    	      this.ip = defaults.ip;
    	      this.ipVariable = defaults.ipVariable;
    	      this.mask = defaults.mask;
    	      this.maskVariable = defaults.maskVariable;
    	      this.objectNumber = defaults.objectNumber;
    	      this.objectNumberVariable = defaults.objectNumberVariable;
    	      this.optional = defaults.optional;
    	      this.sig = defaults.sig;
    	      this.sigVariable = defaults.sigVariable;
    	      this.vpnId = defaults.vpnId;
        }

        @CustomType.Setter("boolean")
        public Builder boolean_(String boolean_) {
            if (boolean_ == null) {
              throw new MissingRequiredPropertyException("GetCiscoSystemFeatureTemplateObjectTracker", "boolean_");
            }
            this.boolean_ = boolean_;
            return this;
        }
        @CustomType.Setter
        public Builder booleanVariable(String booleanVariable) {
            if (booleanVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoSystemFeatureTemplateObjectTracker", "booleanVariable");
            }
            this.booleanVariable = booleanVariable;
            return this;
        }
        @CustomType.Setter
        public Builder groupTracksIds(List<GetCiscoSystemFeatureTemplateObjectTrackerGroupTracksId> groupTracksIds) {
            if (groupTracksIds == null) {
              throw new MissingRequiredPropertyException("GetCiscoSystemFeatureTemplateObjectTracker", "groupTracksIds");
            }
            this.groupTracksIds = groupTracksIds;
            return this;
        }
        public Builder groupTracksIds(GetCiscoSystemFeatureTemplateObjectTrackerGroupTracksId... groupTracksIds) {
            return groupTracksIds(List.of(groupTracksIds));
        }
        @CustomType.Setter("interface")
        public Builder interface_(String interface_) {
            if (interface_ == null) {
              throw new MissingRequiredPropertyException("GetCiscoSystemFeatureTemplateObjectTracker", "interface_");
            }
            this.interface_ = interface_;
            return this;
        }
        @CustomType.Setter
        public Builder interfaceVariable(String interfaceVariable) {
            if (interfaceVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoSystemFeatureTemplateObjectTracker", "interfaceVariable");
            }
            this.interfaceVariable = interfaceVariable;
            return this;
        }
        @CustomType.Setter
        public Builder ip(String ip) {
            if (ip == null) {
              throw new MissingRequiredPropertyException("GetCiscoSystemFeatureTemplateObjectTracker", "ip");
            }
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder ipVariable(String ipVariable) {
            if (ipVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoSystemFeatureTemplateObjectTracker", "ipVariable");
            }
            this.ipVariable = ipVariable;
            return this;
        }
        @CustomType.Setter
        public Builder mask(String mask) {
            if (mask == null) {
              throw new MissingRequiredPropertyException("GetCiscoSystemFeatureTemplateObjectTracker", "mask");
            }
            this.mask = mask;
            return this;
        }
        @CustomType.Setter
        public Builder maskVariable(String maskVariable) {
            if (maskVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoSystemFeatureTemplateObjectTracker", "maskVariable");
            }
            this.maskVariable = maskVariable;
            return this;
        }
        @CustomType.Setter
        public Builder objectNumber(Integer objectNumber) {
            if (objectNumber == null) {
              throw new MissingRequiredPropertyException("GetCiscoSystemFeatureTemplateObjectTracker", "objectNumber");
            }
            this.objectNumber = objectNumber;
            return this;
        }
        @CustomType.Setter
        public Builder objectNumberVariable(String objectNumberVariable) {
            if (objectNumberVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoSystemFeatureTemplateObjectTracker", "objectNumberVariable");
            }
            this.objectNumberVariable = objectNumberVariable;
            return this;
        }
        @CustomType.Setter
        public Builder optional(Boolean optional) {
            if (optional == null) {
              throw new MissingRequiredPropertyException("GetCiscoSystemFeatureTemplateObjectTracker", "optional");
            }
            this.optional = optional;
            return this;
        }
        @CustomType.Setter
        public Builder sig(String sig) {
            if (sig == null) {
              throw new MissingRequiredPropertyException("GetCiscoSystemFeatureTemplateObjectTracker", "sig");
            }
            this.sig = sig;
            return this;
        }
        @CustomType.Setter
        public Builder sigVariable(String sigVariable) {
            if (sigVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoSystemFeatureTemplateObjectTracker", "sigVariable");
            }
            this.sigVariable = sigVariable;
            return this;
        }
        @CustomType.Setter
        public Builder vpnId(Integer vpnId) {
            if (vpnId == null) {
              throw new MissingRequiredPropertyException("GetCiscoSystemFeatureTemplateObjectTracker", "vpnId");
            }
            this.vpnId = vpnId;
            return this;
        }
        public GetCiscoSystemFeatureTemplateObjectTracker build() {
            final var _resultValue = new GetCiscoSystemFeatureTemplateObjectTracker();
            _resultValue.boolean_ = boolean_;
            _resultValue.booleanVariable = booleanVariable;
            _resultValue.groupTracksIds = groupTracksIds;
            _resultValue.interface_ = interface_;
            _resultValue.interfaceVariable = interfaceVariable;
            _resultValue.ip = ip;
            _resultValue.ipVariable = ipVariable;
            _resultValue.mask = mask;
            _resultValue.maskVariable = maskVariable;
            _resultValue.objectNumber = objectNumber;
            _resultValue.objectNumberVariable = objectNumberVariable;
            _resultValue.optional = optional;
            _resultValue.sig = sig;
            _resultValue.sigVariable = sigVariable;
            _resultValue.vpnId = vpnId;
            return _resultValue;
        }
    }
}
