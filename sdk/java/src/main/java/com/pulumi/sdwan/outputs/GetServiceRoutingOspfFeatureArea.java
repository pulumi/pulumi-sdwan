// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.outputs.GetServiceRoutingOspfFeatureAreaInterface;
import com.pulumi.sdwan.outputs.GetServiceRoutingOspfFeatureAreaRange;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceRoutingOspfFeatureArea {
    /**
     * @return Set OSPF area number
     * 
     */
    private Integer areaNumber;
    /**
     * @return Variable name
     * 
     */
    private String areaNumberVariable;
    /**
     * @return set the area type
     * 
     */
    private String areaType;
    /**
     * @return Set OSPF interface parameters
     * 
     */
    private List<GetServiceRoutingOspfFeatureAreaInterface> interfaces;
    /**
     * @return Do not inject interarea routes into STUB or NSSA
     * 
     */
    private Boolean noSummary;
    /**
     * @return Variable name
     * 
     */
    private String noSummaryVariable;
    /**
     * @return Summarize OSPF routes at an area boundary
     * 
     */
    private List<GetServiceRoutingOspfFeatureAreaRange> ranges;

    private GetServiceRoutingOspfFeatureArea() {}
    /**
     * @return Set OSPF area number
     * 
     */
    public Integer areaNumber() {
        return this.areaNumber;
    }
    /**
     * @return Variable name
     * 
     */
    public String areaNumberVariable() {
        return this.areaNumberVariable;
    }
    /**
     * @return set the area type
     * 
     */
    public String areaType() {
        return this.areaType;
    }
    /**
     * @return Set OSPF interface parameters
     * 
     */
    public List<GetServiceRoutingOspfFeatureAreaInterface> interfaces() {
        return this.interfaces;
    }
    /**
     * @return Do not inject interarea routes into STUB or NSSA
     * 
     */
    public Boolean noSummary() {
        return this.noSummary;
    }
    /**
     * @return Variable name
     * 
     */
    public String noSummaryVariable() {
        return this.noSummaryVariable;
    }
    /**
     * @return Summarize OSPF routes at an area boundary
     * 
     */
    public List<GetServiceRoutingOspfFeatureAreaRange> ranges() {
        return this.ranges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceRoutingOspfFeatureArea defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer areaNumber;
        private String areaNumberVariable;
        private String areaType;
        private List<GetServiceRoutingOspfFeatureAreaInterface> interfaces;
        private Boolean noSummary;
        private String noSummaryVariable;
        private List<GetServiceRoutingOspfFeatureAreaRange> ranges;
        public Builder() {}
        public Builder(GetServiceRoutingOspfFeatureArea defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.areaNumber = defaults.areaNumber;
    	      this.areaNumberVariable = defaults.areaNumberVariable;
    	      this.areaType = defaults.areaType;
    	      this.interfaces = defaults.interfaces;
    	      this.noSummary = defaults.noSummary;
    	      this.noSummaryVariable = defaults.noSummaryVariable;
    	      this.ranges = defaults.ranges;
        }

        @CustomType.Setter
        public Builder areaNumber(Integer areaNumber) {
            if (areaNumber == null) {
              throw new MissingRequiredPropertyException("GetServiceRoutingOspfFeatureArea", "areaNumber");
            }
            this.areaNumber = areaNumber;
            return this;
        }
        @CustomType.Setter
        public Builder areaNumberVariable(String areaNumberVariable) {
            if (areaNumberVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceRoutingOspfFeatureArea", "areaNumberVariable");
            }
            this.areaNumberVariable = areaNumberVariable;
            return this;
        }
        @CustomType.Setter
        public Builder areaType(String areaType) {
            if (areaType == null) {
              throw new MissingRequiredPropertyException("GetServiceRoutingOspfFeatureArea", "areaType");
            }
            this.areaType = areaType;
            return this;
        }
        @CustomType.Setter
        public Builder interfaces(List<GetServiceRoutingOspfFeatureAreaInterface> interfaces) {
            if (interfaces == null) {
              throw new MissingRequiredPropertyException("GetServiceRoutingOspfFeatureArea", "interfaces");
            }
            this.interfaces = interfaces;
            return this;
        }
        public Builder interfaces(GetServiceRoutingOspfFeatureAreaInterface... interfaces) {
            return interfaces(List.of(interfaces));
        }
        @CustomType.Setter
        public Builder noSummary(Boolean noSummary) {
            if (noSummary == null) {
              throw new MissingRequiredPropertyException("GetServiceRoutingOspfFeatureArea", "noSummary");
            }
            this.noSummary = noSummary;
            return this;
        }
        @CustomType.Setter
        public Builder noSummaryVariable(String noSummaryVariable) {
            if (noSummaryVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceRoutingOspfFeatureArea", "noSummaryVariable");
            }
            this.noSummaryVariable = noSummaryVariable;
            return this;
        }
        @CustomType.Setter
        public Builder ranges(List<GetServiceRoutingOspfFeatureAreaRange> ranges) {
            if (ranges == null) {
              throw new MissingRequiredPropertyException("GetServiceRoutingOspfFeatureArea", "ranges");
            }
            this.ranges = ranges;
            return this;
        }
        public Builder ranges(GetServiceRoutingOspfFeatureAreaRange... ranges) {
            return ranges(List.of(ranges));
        }
        public GetServiceRoutingOspfFeatureArea build() {
            final var _resultValue = new GetServiceRoutingOspfFeatureArea();
            _resultValue.areaNumber = areaNumber;
            _resultValue.areaNumberVariable = areaNumberVariable;
            _resultValue.areaType = areaType;
            _resultValue.interfaces = interfaces;
            _resultValue.noSummary = noSummary;
            _resultValue.noSummaryVariable = noSummaryVariable;
            _resultValue.ranges = ranges;
            return _resultValue;
        }
    }
}
