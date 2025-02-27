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
public final class GetServiceLanVpnFeatureNatPool {
    /**
     * @return NAT Direction
     * 
     */
    private String direction;
    /**
     * @return Variable name
     * 
     */
    private String directionVariable;
    /**
     * @return NAT Pool Name
     * 
     */
    private Integer natPoolName;
    /**
     * @return Variable name
     * 
     */
    private String natPoolNameVariable;
    /**
     * @return NAT Overload
     * 
     */
    private Boolean overload;
    /**
     * @return Variable name
     * 
     */
    private String overloadVariable;
    /**
     * @return NAT Pool Prefix Length
     * 
     */
    private Integer prefixLength;
    /**
     * @return Variable name
     * 
     */
    private String prefixLengthVariable;
    /**
     * @return NAT Pool Range End
     * 
     */
    private String rangeEnd;
    /**
     * @return Variable name
     * 
     */
    private String rangeEndVariable;
    /**
     * @return NAT Pool Range Start
     * 
     */
    private String rangeStart;
    /**
     * @return Variable name
     * 
     */
    private String rangeStartVariable;
    private String trackerObjectId;

    private GetServiceLanVpnFeatureNatPool() {}
    /**
     * @return NAT Direction
     * 
     */
    public String direction() {
        return this.direction;
    }
    /**
     * @return Variable name
     * 
     */
    public String directionVariable() {
        return this.directionVariable;
    }
    /**
     * @return NAT Pool Name
     * 
     */
    public Integer natPoolName() {
        return this.natPoolName;
    }
    /**
     * @return Variable name
     * 
     */
    public String natPoolNameVariable() {
        return this.natPoolNameVariable;
    }
    /**
     * @return NAT Overload
     * 
     */
    public Boolean overload() {
        return this.overload;
    }
    /**
     * @return Variable name
     * 
     */
    public String overloadVariable() {
        return this.overloadVariable;
    }
    /**
     * @return NAT Pool Prefix Length
     * 
     */
    public Integer prefixLength() {
        return this.prefixLength;
    }
    /**
     * @return Variable name
     * 
     */
    public String prefixLengthVariable() {
        return this.prefixLengthVariable;
    }
    /**
     * @return NAT Pool Range End
     * 
     */
    public String rangeEnd() {
        return this.rangeEnd;
    }
    /**
     * @return Variable name
     * 
     */
    public String rangeEndVariable() {
        return this.rangeEndVariable;
    }
    /**
     * @return NAT Pool Range Start
     * 
     */
    public String rangeStart() {
        return this.rangeStart;
    }
    /**
     * @return Variable name
     * 
     */
    public String rangeStartVariable() {
        return this.rangeStartVariable;
    }
    public String trackerObjectId() {
        return this.trackerObjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceLanVpnFeatureNatPool defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String direction;
        private String directionVariable;
        private Integer natPoolName;
        private String natPoolNameVariable;
        private Boolean overload;
        private String overloadVariable;
        private Integer prefixLength;
        private String prefixLengthVariable;
        private String rangeEnd;
        private String rangeEndVariable;
        private String rangeStart;
        private String rangeStartVariable;
        private String trackerObjectId;
        public Builder() {}
        public Builder(GetServiceLanVpnFeatureNatPool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.directionVariable = defaults.directionVariable;
    	      this.natPoolName = defaults.natPoolName;
    	      this.natPoolNameVariable = defaults.natPoolNameVariable;
    	      this.overload = defaults.overload;
    	      this.overloadVariable = defaults.overloadVariable;
    	      this.prefixLength = defaults.prefixLength;
    	      this.prefixLengthVariable = defaults.prefixLengthVariable;
    	      this.rangeEnd = defaults.rangeEnd;
    	      this.rangeEndVariable = defaults.rangeEndVariable;
    	      this.rangeStart = defaults.rangeStart;
    	      this.rangeStartVariable = defaults.rangeStartVariable;
    	      this.trackerObjectId = defaults.trackerObjectId;
        }

        @CustomType.Setter
        public Builder direction(String direction) {
            if (direction == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureNatPool", "direction");
            }
            this.direction = direction;
            return this;
        }
        @CustomType.Setter
        public Builder directionVariable(String directionVariable) {
            if (directionVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureNatPool", "directionVariable");
            }
            this.directionVariable = directionVariable;
            return this;
        }
        @CustomType.Setter
        public Builder natPoolName(Integer natPoolName) {
            if (natPoolName == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureNatPool", "natPoolName");
            }
            this.natPoolName = natPoolName;
            return this;
        }
        @CustomType.Setter
        public Builder natPoolNameVariable(String natPoolNameVariable) {
            if (natPoolNameVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureNatPool", "natPoolNameVariable");
            }
            this.natPoolNameVariable = natPoolNameVariable;
            return this;
        }
        @CustomType.Setter
        public Builder overload(Boolean overload) {
            if (overload == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureNatPool", "overload");
            }
            this.overload = overload;
            return this;
        }
        @CustomType.Setter
        public Builder overloadVariable(String overloadVariable) {
            if (overloadVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureNatPool", "overloadVariable");
            }
            this.overloadVariable = overloadVariable;
            return this;
        }
        @CustomType.Setter
        public Builder prefixLength(Integer prefixLength) {
            if (prefixLength == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureNatPool", "prefixLength");
            }
            this.prefixLength = prefixLength;
            return this;
        }
        @CustomType.Setter
        public Builder prefixLengthVariable(String prefixLengthVariable) {
            if (prefixLengthVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureNatPool", "prefixLengthVariable");
            }
            this.prefixLengthVariable = prefixLengthVariable;
            return this;
        }
        @CustomType.Setter
        public Builder rangeEnd(String rangeEnd) {
            if (rangeEnd == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureNatPool", "rangeEnd");
            }
            this.rangeEnd = rangeEnd;
            return this;
        }
        @CustomType.Setter
        public Builder rangeEndVariable(String rangeEndVariable) {
            if (rangeEndVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureNatPool", "rangeEndVariable");
            }
            this.rangeEndVariable = rangeEndVariable;
            return this;
        }
        @CustomType.Setter
        public Builder rangeStart(String rangeStart) {
            if (rangeStart == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureNatPool", "rangeStart");
            }
            this.rangeStart = rangeStart;
            return this;
        }
        @CustomType.Setter
        public Builder rangeStartVariable(String rangeStartVariable) {
            if (rangeStartVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureNatPool", "rangeStartVariable");
            }
            this.rangeStartVariable = rangeStartVariable;
            return this;
        }
        @CustomType.Setter
        public Builder trackerObjectId(String trackerObjectId) {
            if (trackerObjectId == null) {
              throw new MissingRequiredPropertyException("GetServiceLanVpnFeatureNatPool", "trackerObjectId");
            }
            this.trackerObjectId = trackerObjectId;
            return this;
        }
        public GetServiceLanVpnFeatureNatPool build() {
            final var _resultValue = new GetServiceLanVpnFeatureNatPool();
            _resultValue.direction = direction;
            _resultValue.directionVariable = directionVariable;
            _resultValue.natPoolName = natPoolName;
            _resultValue.natPoolNameVariable = natPoolNameVariable;
            _resultValue.overload = overload;
            _resultValue.overloadVariable = overloadVariable;
            _resultValue.prefixLength = prefixLength;
            _resultValue.prefixLengthVariable = prefixLengthVariable;
            _resultValue.rangeEnd = rangeEnd;
            _resultValue.rangeEndVariable = rangeEndVariable;
            _resultValue.rangeStart = rangeStart;
            _resultValue.rangeStartVariable = rangeStartVariable;
            _resultValue.trackerObjectId = trackerObjectId;
            return _resultValue;
        }
    }
}
