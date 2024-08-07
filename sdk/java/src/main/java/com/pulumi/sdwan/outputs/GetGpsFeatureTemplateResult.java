// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGpsFeatureTemplateResult {
    /**
     * @return The description of the feature template
     * 
     */
    private String description;
    /**
     * @return Destination address
     * 
     */
    private String destinationAddress;
    /**
     * @return Variable name
     * 
     */
    private String destinationAddressVariable;
    /**
     * @return Destination port
     * 
     */
    private Integer destinationPort;
    /**
     * @return Variable name
     * 
     */
    private String destinationPortVariable;
    /**
     * @return List of supported device types
     * 
     */
    private List<String> deviceTypes;
    /**
     * @return Enable/disable GPS
     * 
     */
    private Boolean enable;
    /**
     * @return Variable name
     * 
     */
    private String enableVariable;
    /**
     * @return Select GPS mode
     * 
     */
    private String gpsMode;
    /**
     * @return Variable name
     * 
     */
    private String gpsModeVariable;
    /**
     * @return The id of the feature template
     * 
     */
    private String id;
    /**
     * @return The name of the feature template
     * 
     */
    private String name;
    /**
     * @return Enable/disable NMEA data
     * 
     */
    private Boolean nmea;
    /**
     * @return Variable name
     * 
     */
    private String nmeaVariable;
    /**
     * @return Source address
     * 
     */
    private String sourceAddress;
    /**
     * @return Variable name
     * 
     */
    private String sourceAddressVariable;
    /**
     * @return The template type
     * 
     */
    private String templateType;
    /**
     * @return The version of the feature template
     * 
     */
    private Integer version;

    private GetGpsFeatureTemplateResult() {}
    /**
     * @return The description of the feature template
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Destination address
     * 
     */
    public String destinationAddress() {
        return this.destinationAddress;
    }
    /**
     * @return Variable name
     * 
     */
    public String destinationAddressVariable() {
        return this.destinationAddressVariable;
    }
    /**
     * @return Destination port
     * 
     */
    public Integer destinationPort() {
        return this.destinationPort;
    }
    /**
     * @return Variable name
     * 
     */
    public String destinationPortVariable() {
        return this.destinationPortVariable;
    }
    /**
     * @return List of supported device types
     * 
     */
    public List<String> deviceTypes() {
        return this.deviceTypes;
    }
    /**
     * @return Enable/disable GPS
     * 
     */
    public Boolean enable() {
        return this.enable;
    }
    /**
     * @return Variable name
     * 
     */
    public String enableVariable() {
        return this.enableVariable;
    }
    /**
     * @return Select GPS mode
     * 
     */
    public String gpsMode() {
        return this.gpsMode;
    }
    /**
     * @return Variable name
     * 
     */
    public String gpsModeVariable() {
        return this.gpsModeVariable;
    }
    /**
     * @return The id of the feature template
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the feature template
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Enable/disable NMEA data
     * 
     */
    public Boolean nmea() {
        return this.nmea;
    }
    /**
     * @return Variable name
     * 
     */
    public String nmeaVariable() {
        return this.nmeaVariable;
    }
    /**
     * @return Source address
     * 
     */
    public String sourceAddress() {
        return this.sourceAddress;
    }
    /**
     * @return Variable name
     * 
     */
    public String sourceAddressVariable() {
        return this.sourceAddressVariable;
    }
    /**
     * @return The template type
     * 
     */
    public String templateType() {
        return this.templateType;
    }
    /**
     * @return The version of the feature template
     * 
     */
    public Integer version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGpsFeatureTemplateResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String destinationAddress;
        private String destinationAddressVariable;
        private Integer destinationPort;
        private String destinationPortVariable;
        private List<String> deviceTypes;
        private Boolean enable;
        private String enableVariable;
        private String gpsMode;
        private String gpsModeVariable;
        private String id;
        private String name;
        private Boolean nmea;
        private String nmeaVariable;
        private String sourceAddress;
        private String sourceAddressVariable;
        private String templateType;
        private Integer version;
        public Builder() {}
        public Builder(GetGpsFeatureTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationAddress = defaults.destinationAddress;
    	      this.destinationAddressVariable = defaults.destinationAddressVariable;
    	      this.destinationPort = defaults.destinationPort;
    	      this.destinationPortVariable = defaults.destinationPortVariable;
    	      this.deviceTypes = defaults.deviceTypes;
    	      this.enable = defaults.enable;
    	      this.enableVariable = defaults.enableVariable;
    	      this.gpsMode = defaults.gpsMode;
    	      this.gpsModeVariable = defaults.gpsModeVariable;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.nmea = defaults.nmea;
    	      this.nmeaVariable = defaults.nmeaVariable;
    	      this.sourceAddress = defaults.sourceAddress;
    	      this.sourceAddressVariable = defaults.sourceAddressVariable;
    	      this.templateType = defaults.templateType;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetGpsFeatureTemplateResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder destinationAddress(String destinationAddress) {
            if (destinationAddress == null) {
              throw new MissingRequiredPropertyException("GetGpsFeatureTemplateResult", "destinationAddress");
            }
            this.destinationAddress = destinationAddress;
            return this;
        }
        @CustomType.Setter
        public Builder destinationAddressVariable(String destinationAddressVariable) {
            if (destinationAddressVariable == null) {
              throw new MissingRequiredPropertyException("GetGpsFeatureTemplateResult", "destinationAddressVariable");
            }
            this.destinationAddressVariable = destinationAddressVariable;
            return this;
        }
        @CustomType.Setter
        public Builder destinationPort(Integer destinationPort) {
            if (destinationPort == null) {
              throw new MissingRequiredPropertyException("GetGpsFeatureTemplateResult", "destinationPort");
            }
            this.destinationPort = destinationPort;
            return this;
        }
        @CustomType.Setter
        public Builder destinationPortVariable(String destinationPortVariable) {
            if (destinationPortVariable == null) {
              throw new MissingRequiredPropertyException("GetGpsFeatureTemplateResult", "destinationPortVariable");
            }
            this.destinationPortVariable = destinationPortVariable;
            return this;
        }
        @CustomType.Setter
        public Builder deviceTypes(List<String> deviceTypes) {
            if (deviceTypes == null) {
              throw new MissingRequiredPropertyException("GetGpsFeatureTemplateResult", "deviceTypes");
            }
            this.deviceTypes = deviceTypes;
            return this;
        }
        public Builder deviceTypes(String... deviceTypes) {
            return deviceTypes(List.of(deviceTypes));
        }
        @CustomType.Setter
        public Builder enable(Boolean enable) {
            if (enable == null) {
              throw new MissingRequiredPropertyException("GetGpsFeatureTemplateResult", "enable");
            }
            this.enable = enable;
            return this;
        }
        @CustomType.Setter
        public Builder enableVariable(String enableVariable) {
            if (enableVariable == null) {
              throw new MissingRequiredPropertyException("GetGpsFeatureTemplateResult", "enableVariable");
            }
            this.enableVariable = enableVariable;
            return this;
        }
        @CustomType.Setter
        public Builder gpsMode(String gpsMode) {
            if (gpsMode == null) {
              throw new MissingRequiredPropertyException("GetGpsFeatureTemplateResult", "gpsMode");
            }
            this.gpsMode = gpsMode;
            return this;
        }
        @CustomType.Setter
        public Builder gpsModeVariable(String gpsModeVariable) {
            if (gpsModeVariable == null) {
              throw new MissingRequiredPropertyException("GetGpsFeatureTemplateResult", "gpsModeVariable");
            }
            this.gpsModeVariable = gpsModeVariable;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetGpsFeatureTemplateResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetGpsFeatureTemplateResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nmea(Boolean nmea) {
            if (nmea == null) {
              throw new MissingRequiredPropertyException("GetGpsFeatureTemplateResult", "nmea");
            }
            this.nmea = nmea;
            return this;
        }
        @CustomType.Setter
        public Builder nmeaVariable(String nmeaVariable) {
            if (nmeaVariable == null) {
              throw new MissingRequiredPropertyException("GetGpsFeatureTemplateResult", "nmeaVariable");
            }
            this.nmeaVariable = nmeaVariable;
            return this;
        }
        @CustomType.Setter
        public Builder sourceAddress(String sourceAddress) {
            if (sourceAddress == null) {
              throw new MissingRequiredPropertyException("GetGpsFeatureTemplateResult", "sourceAddress");
            }
            this.sourceAddress = sourceAddress;
            return this;
        }
        @CustomType.Setter
        public Builder sourceAddressVariable(String sourceAddressVariable) {
            if (sourceAddressVariable == null) {
              throw new MissingRequiredPropertyException("GetGpsFeatureTemplateResult", "sourceAddressVariable");
            }
            this.sourceAddressVariable = sourceAddressVariable;
            return this;
        }
        @CustomType.Setter
        public Builder templateType(String templateType) {
            if (templateType == null) {
              throw new MissingRequiredPropertyException("GetGpsFeatureTemplateResult", "templateType");
            }
            this.templateType = templateType;
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetGpsFeatureTemplateResult", "version");
            }
            this.version = version;
            return this;
        }
        public GetGpsFeatureTemplateResult build() {
            final var _resultValue = new GetGpsFeatureTemplateResult();
            _resultValue.description = description;
            _resultValue.destinationAddress = destinationAddress;
            _resultValue.destinationAddressVariable = destinationAddressVariable;
            _resultValue.destinationPort = destinationPort;
            _resultValue.destinationPortVariable = destinationPortVariable;
            _resultValue.deviceTypes = deviceTypes;
            _resultValue.enable = enable;
            _resultValue.enableVariable = enableVariable;
            _resultValue.gpsMode = gpsMode;
            _resultValue.gpsModeVariable = gpsModeVariable;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.nmea = nmea;
            _resultValue.nmeaVariable = nmeaVariable;
            _resultValue.sourceAddress = sourceAddress;
            _resultValue.sourceAddressVariable = sourceAddressVariable;
            _resultValue.templateType = templateType;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
