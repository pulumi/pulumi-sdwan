// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.outputs.GetCiscoOspfv3FeatureTemplateIpv4AreaInterface;
import com.pulumi.sdwan.outputs.GetCiscoOspfv3FeatureTemplateIpv4AreaRange;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCiscoOspfv3FeatureTemplateIpv4Area {
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
     * @return Set OSPF interface parameters
     * 
     */
    private List<GetCiscoOspfv3FeatureTemplateIpv4AreaInterface> interfaces;
    /**
     * @return Area Type Normal
     * 
     */
    private Boolean normal;
    /**
     * @return Variable name
     * 
     */
    private String normalVariable;
    /**
     * @return NSSA area
     * 
     */
    private Boolean nssa;
    /**
     * @return Do not inject interarea routes into NSSA
     * 
     */
    private Boolean nssaNoSummary;
    /**
     * @return Variable name
     * 
     */
    private String nssaNoSummaryVariable;
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private Boolean optional;
    /**
     * @return Summarize OSPF routes at an area boundary
     * 
     */
    private List<GetCiscoOspfv3FeatureTemplateIpv4AreaRange> ranges;
    /**
     * @return Stub area
     * 
     */
    private Boolean stub;
    /**
     * @return Do not inject interarea routes into stub
     * 
     */
    private Boolean stubNoSummary;
    /**
     * @return Variable name
     * 
     */
    private String stubNoSummaryVariable;
    /**
     * @return Always Translate LSAs on this ABR
     * 
     */
    private String translate;
    /**
     * @return Variable name
     * 
     */
    private String translateVariable;

    private GetCiscoOspfv3FeatureTemplateIpv4Area() {}
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
     * @return Set OSPF interface parameters
     * 
     */
    public List<GetCiscoOspfv3FeatureTemplateIpv4AreaInterface> interfaces() {
        return this.interfaces;
    }
    /**
     * @return Area Type Normal
     * 
     */
    public Boolean normal() {
        return this.normal;
    }
    /**
     * @return Variable name
     * 
     */
    public String normalVariable() {
        return this.normalVariable;
    }
    /**
     * @return NSSA area
     * 
     */
    public Boolean nssa() {
        return this.nssa;
    }
    /**
     * @return Do not inject interarea routes into NSSA
     * 
     */
    public Boolean nssaNoSummary() {
        return this.nssaNoSummary;
    }
    /**
     * @return Variable name
     * 
     */
    public String nssaNoSummaryVariable() {
        return this.nssaNoSummaryVariable;
    }
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Boolean optional() {
        return this.optional;
    }
    /**
     * @return Summarize OSPF routes at an area boundary
     * 
     */
    public List<GetCiscoOspfv3FeatureTemplateIpv4AreaRange> ranges() {
        return this.ranges;
    }
    /**
     * @return Stub area
     * 
     */
    public Boolean stub() {
        return this.stub;
    }
    /**
     * @return Do not inject interarea routes into stub
     * 
     */
    public Boolean stubNoSummary() {
        return this.stubNoSummary;
    }
    /**
     * @return Variable name
     * 
     */
    public String stubNoSummaryVariable() {
        return this.stubNoSummaryVariable;
    }
    /**
     * @return Always Translate LSAs on this ABR
     * 
     */
    public String translate() {
        return this.translate;
    }
    /**
     * @return Variable name
     * 
     */
    public String translateVariable() {
        return this.translateVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCiscoOspfv3FeatureTemplateIpv4Area defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer areaNumber;
        private String areaNumberVariable;
        private List<GetCiscoOspfv3FeatureTemplateIpv4AreaInterface> interfaces;
        private Boolean normal;
        private String normalVariable;
        private Boolean nssa;
        private Boolean nssaNoSummary;
        private String nssaNoSummaryVariable;
        private Boolean optional;
        private List<GetCiscoOspfv3FeatureTemplateIpv4AreaRange> ranges;
        private Boolean stub;
        private Boolean stubNoSummary;
        private String stubNoSummaryVariable;
        private String translate;
        private String translateVariable;
        public Builder() {}
        public Builder(GetCiscoOspfv3FeatureTemplateIpv4Area defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.areaNumber = defaults.areaNumber;
    	      this.areaNumberVariable = defaults.areaNumberVariable;
    	      this.interfaces = defaults.interfaces;
    	      this.normal = defaults.normal;
    	      this.normalVariable = defaults.normalVariable;
    	      this.nssa = defaults.nssa;
    	      this.nssaNoSummary = defaults.nssaNoSummary;
    	      this.nssaNoSummaryVariable = defaults.nssaNoSummaryVariable;
    	      this.optional = defaults.optional;
    	      this.ranges = defaults.ranges;
    	      this.stub = defaults.stub;
    	      this.stubNoSummary = defaults.stubNoSummary;
    	      this.stubNoSummaryVariable = defaults.stubNoSummaryVariable;
    	      this.translate = defaults.translate;
    	      this.translateVariable = defaults.translateVariable;
        }

        @CustomType.Setter
        public Builder areaNumber(Integer areaNumber) {
            if (areaNumber == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfv3FeatureTemplateIpv4Area", "areaNumber");
            }
            this.areaNumber = areaNumber;
            return this;
        }
        @CustomType.Setter
        public Builder areaNumberVariable(String areaNumberVariable) {
            if (areaNumberVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfv3FeatureTemplateIpv4Area", "areaNumberVariable");
            }
            this.areaNumberVariable = areaNumberVariable;
            return this;
        }
        @CustomType.Setter
        public Builder interfaces(List<GetCiscoOspfv3FeatureTemplateIpv4AreaInterface> interfaces) {
            if (interfaces == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfv3FeatureTemplateIpv4Area", "interfaces");
            }
            this.interfaces = interfaces;
            return this;
        }
        public Builder interfaces(GetCiscoOspfv3FeatureTemplateIpv4AreaInterface... interfaces) {
            return interfaces(List.of(interfaces));
        }
        @CustomType.Setter
        public Builder normal(Boolean normal) {
            if (normal == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfv3FeatureTemplateIpv4Area", "normal");
            }
            this.normal = normal;
            return this;
        }
        @CustomType.Setter
        public Builder normalVariable(String normalVariable) {
            if (normalVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfv3FeatureTemplateIpv4Area", "normalVariable");
            }
            this.normalVariable = normalVariable;
            return this;
        }
        @CustomType.Setter
        public Builder nssa(Boolean nssa) {
            if (nssa == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfv3FeatureTemplateIpv4Area", "nssa");
            }
            this.nssa = nssa;
            return this;
        }
        @CustomType.Setter
        public Builder nssaNoSummary(Boolean nssaNoSummary) {
            if (nssaNoSummary == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfv3FeatureTemplateIpv4Area", "nssaNoSummary");
            }
            this.nssaNoSummary = nssaNoSummary;
            return this;
        }
        @CustomType.Setter
        public Builder nssaNoSummaryVariable(String nssaNoSummaryVariable) {
            if (nssaNoSummaryVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfv3FeatureTemplateIpv4Area", "nssaNoSummaryVariable");
            }
            this.nssaNoSummaryVariable = nssaNoSummaryVariable;
            return this;
        }
        @CustomType.Setter
        public Builder optional(Boolean optional) {
            if (optional == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfv3FeatureTemplateIpv4Area", "optional");
            }
            this.optional = optional;
            return this;
        }
        @CustomType.Setter
        public Builder ranges(List<GetCiscoOspfv3FeatureTemplateIpv4AreaRange> ranges) {
            if (ranges == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfv3FeatureTemplateIpv4Area", "ranges");
            }
            this.ranges = ranges;
            return this;
        }
        public Builder ranges(GetCiscoOspfv3FeatureTemplateIpv4AreaRange... ranges) {
            return ranges(List.of(ranges));
        }
        @CustomType.Setter
        public Builder stub(Boolean stub) {
            if (stub == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfv3FeatureTemplateIpv4Area", "stub");
            }
            this.stub = stub;
            return this;
        }
        @CustomType.Setter
        public Builder stubNoSummary(Boolean stubNoSummary) {
            if (stubNoSummary == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfv3FeatureTemplateIpv4Area", "stubNoSummary");
            }
            this.stubNoSummary = stubNoSummary;
            return this;
        }
        @CustomType.Setter
        public Builder stubNoSummaryVariable(String stubNoSummaryVariable) {
            if (stubNoSummaryVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfv3FeatureTemplateIpv4Area", "stubNoSummaryVariable");
            }
            this.stubNoSummaryVariable = stubNoSummaryVariable;
            return this;
        }
        @CustomType.Setter
        public Builder translate(String translate) {
            if (translate == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfv3FeatureTemplateIpv4Area", "translate");
            }
            this.translate = translate;
            return this;
        }
        @CustomType.Setter
        public Builder translateVariable(String translateVariable) {
            if (translateVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfv3FeatureTemplateIpv4Area", "translateVariable");
            }
            this.translateVariable = translateVariable;
            return this;
        }
        public GetCiscoOspfv3FeatureTemplateIpv4Area build() {
            final var _resultValue = new GetCiscoOspfv3FeatureTemplateIpv4Area();
            _resultValue.areaNumber = areaNumber;
            _resultValue.areaNumberVariable = areaNumberVariable;
            _resultValue.interfaces = interfaces;
            _resultValue.normal = normal;
            _resultValue.normalVariable = normalVariable;
            _resultValue.nssa = nssa;
            _resultValue.nssaNoSummary = nssaNoSummary;
            _resultValue.nssaNoSummaryVariable = nssaNoSummaryVariable;
            _resultValue.optional = optional;
            _resultValue.ranges = ranges;
            _resultValue.stub = stub;
            _resultValue.stubNoSummary = stubNoSummary;
            _resultValue.stubNoSummaryVariable = stubNoSummaryVariable;
            _resultValue.translate = translate;
            _resultValue.translateVariable = translateVariable;
            return _resultValue;
        }
    }
}
