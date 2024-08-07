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
public final class GetCiscoVpnFeatureTemplateStaticNatSubnetRule {
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private Boolean optional;
    /**
     * @return Network Prefix Length
     * 
     */
    private Integer prefixLength;
    /**
     * @return Variable name
     * 
     */
    private String prefixLengthVariable;
    /**
     * @return Source IP Subnet to be translated
     * 
     */
    private String sourceIpSubnet;
    /**
     * @return Variable name
     * 
     */
    private String sourceIpSubnetVariable;
    /**
     * @return Direction of static NAT translation
     * 
     */
    private String staticNatDirection;
    /**
     * @return Variable name
     * 
     */
    private String staticNatDirectionVariable;
    /**
     * @return Add Object/Object Group Tracker
     * 
     */
    private Integer trackerId;
    /**
     * @return Variable name
     * 
     */
    private String trackerIdVariable;
    /**
     * @return Statically translated source IP Subnet
     * 
     */
    private String translateIpSubnet;
    /**
     * @return Variable name
     * 
     */
    private String translateIpSubnetVariable;

    private GetCiscoVpnFeatureTemplateStaticNatSubnetRule() {}
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Boolean optional() {
        return this.optional;
    }
    /**
     * @return Network Prefix Length
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
     * @return Source IP Subnet to be translated
     * 
     */
    public String sourceIpSubnet() {
        return this.sourceIpSubnet;
    }
    /**
     * @return Variable name
     * 
     */
    public String sourceIpSubnetVariable() {
        return this.sourceIpSubnetVariable;
    }
    /**
     * @return Direction of static NAT translation
     * 
     */
    public String staticNatDirection() {
        return this.staticNatDirection;
    }
    /**
     * @return Variable name
     * 
     */
    public String staticNatDirectionVariable() {
        return this.staticNatDirectionVariable;
    }
    /**
     * @return Add Object/Object Group Tracker
     * 
     */
    public Integer trackerId() {
        return this.trackerId;
    }
    /**
     * @return Variable name
     * 
     */
    public String trackerIdVariable() {
        return this.trackerIdVariable;
    }
    /**
     * @return Statically translated source IP Subnet
     * 
     */
    public String translateIpSubnet() {
        return this.translateIpSubnet;
    }
    /**
     * @return Variable name
     * 
     */
    public String translateIpSubnetVariable() {
        return this.translateIpSubnetVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCiscoVpnFeatureTemplateStaticNatSubnetRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean optional;
        private Integer prefixLength;
        private String prefixLengthVariable;
        private String sourceIpSubnet;
        private String sourceIpSubnetVariable;
        private String staticNatDirection;
        private String staticNatDirectionVariable;
        private Integer trackerId;
        private String trackerIdVariable;
        private String translateIpSubnet;
        private String translateIpSubnetVariable;
        public Builder() {}
        public Builder(GetCiscoVpnFeatureTemplateStaticNatSubnetRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.optional = defaults.optional;
    	      this.prefixLength = defaults.prefixLength;
    	      this.prefixLengthVariable = defaults.prefixLengthVariable;
    	      this.sourceIpSubnet = defaults.sourceIpSubnet;
    	      this.sourceIpSubnetVariable = defaults.sourceIpSubnetVariable;
    	      this.staticNatDirection = defaults.staticNatDirection;
    	      this.staticNatDirectionVariable = defaults.staticNatDirectionVariable;
    	      this.trackerId = defaults.trackerId;
    	      this.trackerIdVariable = defaults.trackerIdVariable;
    	      this.translateIpSubnet = defaults.translateIpSubnet;
    	      this.translateIpSubnetVariable = defaults.translateIpSubnetVariable;
        }

        @CustomType.Setter
        public Builder optional(Boolean optional) {
            if (optional == null) {
              throw new MissingRequiredPropertyException("GetCiscoVpnFeatureTemplateStaticNatSubnetRule", "optional");
            }
            this.optional = optional;
            return this;
        }
        @CustomType.Setter
        public Builder prefixLength(Integer prefixLength) {
            if (prefixLength == null) {
              throw new MissingRequiredPropertyException("GetCiscoVpnFeatureTemplateStaticNatSubnetRule", "prefixLength");
            }
            this.prefixLength = prefixLength;
            return this;
        }
        @CustomType.Setter
        public Builder prefixLengthVariable(String prefixLengthVariable) {
            if (prefixLengthVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoVpnFeatureTemplateStaticNatSubnetRule", "prefixLengthVariable");
            }
            this.prefixLengthVariable = prefixLengthVariable;
            return this;
        }
        @CustomType.Setter
        public Builder sourceIpSubnet(String sourceIpSubnet) {
            if (sourceIpSubnet == null) {
              throw new MissingRequiredPropertyException("GetCiscoVpnFeatureTemplateStaticNatSubnetRule", "sourceIpSubnet");
            }
            this.sourceIpSubnet = sourceIpSubnet;
            return this;
        }
        @CustomType.Setter
        public Builder sourceIpSubnetVariable(String sourceIpSubnetVariable) {
            if (sourceIpSubnetVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoVpnFeatureTemplateStaticNatSubnetRule", "sourceIpSubnetVariable");
            }
            this.sourceIpSubnetVariable = sourceIpSubnetVariable;
            return this;
        }
        @CustomType.Setter
        public Builder staticNatDirection(String staticNatDirection) {
            if (staticNatDirection == null) {
              throw new MissingRequiredPropertyException("GetCiscoVpnFeatureTemplateStaticNatSubnetRule", "staticNatDirection");
            }
            this.staticNatDirection = staticNatDirection;
            return this;
        }
        @CustomType.Setter
        public Builder staticNatDirectionVariable(String staticNatDirectionVariable) {
            if (staticNatDirectionVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoVpnFeatureTemplateStaticNatSubnetRule", "staticNatDirectionVariable");
            }
            this.staticNatDirectionVariable = staticNatDirectionVariable;
            return this;
        }
        @CustomType.Setter
        public Builder trackerId(Integer trackerId) {
            if (trackerId == null) {
              throw new MissingRequiredPropertyException("GetCiscoVpnFeatureTemplateStaticNatSubnetRule", "trackerId");
            }
            this.trackerId = trackerId;
            return this;
        }
        @CustomType.Setter
        public Builder trackerIdVariable(String trackerIdVariable) {
            if (trackerIdVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoVpnFeatureTemplateStaticNatSubnetRule", "trackerIdVariable");
            }
            this.trackerIdVariable = trackerIdVariable;
            return this;
        }
        @CustomType.Setter
        public Builder translateIpSubnet(String translateIpSubnet) {
            if (translateIpSubnet == null) {
              throw new MissingRequiredPropertyException("GetCiscoVpnFeatureTemplateStaticNatSubnetRule", "translateIpSubnet");
            }
            this.translateIpSubnet = translateIpSubnet;
            return this;
        }
        @CustomType.Setter
        public Builder translateIpSubnetVariable(String translateIpSubnetVariable) {
            if (translateIpSubnetVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoVpnFeatureTemplateStaticNatSubnetRule", "translateIpSubnetVariable");
            }
            this.translateIpSubnetVariable = translateIpSubnetVariable;
            return this;
        }
        public GetCiscoVpnFeatureTemplateStaticNatSubnetRule build() {
            final var _resultValue = new GetCiscoVpnFeatureTemplateStaticNatSubnetRule();
            _resultValue.optional = optional;
            _resultValue.prefixLength = prefixLength;
            _resultValue.prefixLengthVariable = prefixLengthVariable;
            _resultValue.sourceIpSubnet = sourceIpSubnet;
            _resultValue.sourceIpSubnetVariable = sourceIpSubnetVariable;
            _resultValue.staticNatDirection = staticNatDirection;
            _resultValue.staticNatDirectionVariable = staticNatDirectionVariable;
            _resultValue.trackerId = trackerId;
            _resultValue.trackerIdVariable = trackerIdVariable;
            _resultValue.translateIpSubnet = translateIpSubnet;
            _resultValue.translateIpSubnetVariable = translateIpSubnetVariable;
            return _resultValue;
        }
    }
}
