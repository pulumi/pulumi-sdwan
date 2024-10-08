// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sdwan.outputs.CiscoOspfFeatureTemplateAreaInterface;
import com.pulumi.sdwan.outputs.CiscoOspfFeatureTemplateAreaRange;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CiscoOspfFeatureTemplateArea {
    /**
     * @return Set OSPF area number
     *   - Range: `0`-`4294967295`
     * 
     */
    private @Nullable Integer areaNumber;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String areaNumberVariable;
    /**
     * @return Set OSPF interface parameters
     * 
     */
    private @Nullable List<CiscoOspfFeatureTemplateAreaInterface> interfaces;
    /**
     * @return NSSA area
     * 
     */
    private @Nullable Boolean nssa;
    /**
     * @return Do not inject interarea routes into NSSA
     *   - Default value: `false`
     * 
     */
    private @Nullable Boolean nssaNoSummary;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String nssaNoSummaryVariable;
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private @Nullable Boolean optional;
    /**
     * @return Summarize OSPF routes at an area boundary
     * 
     */
    private @Nullable List<CiscoOspfFeatureTemplateAreaRange> ranges;
    /**
     * @return Stub area
     * 
     */
    private @Nullable Boolean stub;
    /**
     * @return Do not inject interarea routes into stub
     *   - Default value: `false`
     * 
     */
    private @Nullable Boolean stubNoSummary;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String stubNoSummaryVariable;

    private CiscoOspfFeatureTemplateArea() {}
    /**
     * @return Set OSPF area number
     *   - Range: `0`-`4294967295`
     * 
     */
    public Optional<Integer> areaNumber() {
        return Optional.ofNullable(this.areaNumber);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> areaNumberVariable() {
        return Optional.ofNullable(this.areaNumberVariable);
    }
    /**
     * @return Set OSPF interface parameters
     * 
     */
    public List<CiscoOspfFeatureTemplateAreaInterface> interfaces() {
        return this.interfaces == null ? List.of() : this.interfaces;
    }
    /**
     * @return NSSA area
     * 
     */
    public Optional<Boolean> nssa() {
        return Optional.ofNullable(this.nssa);
    }
    /**
     * @return Do not inject interarea routes into NSSA
     *   - Default value: `false`
     * 
     */
    public Optional<Boolean> nssaNoSummary() {
        return Optional.ofNullable(this.nssaNoSummary);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> nssaNoSummaryVariable() {
        return Optional.ofNullable(this.nssaNoSummaryVariable);
    }
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Optional<Boolean> optional() {
        return Optional.ofNullable(this.optional);
    }
    /**
     * @return Summarize OSPF routes at an area boundary
     * 
     */
    public List<CiscoOspfFeatureTemplateAreaRange> ranges() {
        return this.ranges == null ? List.of() : this.ranges;
    }
    /**
     * @return Stub area
     * 
     */
    public Optional<Boolean> stub() {
        return Optional.ofNullable(this.stub);
    }
    /**
     * @return Do not inject interarea routes into stub
     *   - Default value: `false`
     * 
     */
    public Optional<Boolean> stubNoSummary() {
        return Optional.ofNullable(this.stubNoSummary);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> stubNoSummaryVariable() {
        return Optional.ofNullable(this.stubNoSummaryVariable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CiscoOspfFeatureTemplateArea defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer areaNumber;
        private @Nullable String areaNumberVariable;
        private @Nullable List<CiscoOspfFeatureTemplateAreaInterface> interfaces;
        private @Nullable Boolean nssa;
        private @Nullable Boolean nssaNoSummary;
        private @Nullable String nssaNoSummaryVariable;
        private @Nullable Boolean optional;
        private @Nullable List<CiscoOspfFeatureTemplateAreaRange> ranges;
        private @Nullable Boolean stub;
        private @Nullable Boolean stubNoSummary;
        private @Nullable String stubNoSummaryVariable;
        public Builder() {}
        public Builder(CiscoOspfFeatureTemplateArea defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.areaNumber = defaults.areaNumber;
    	      this.areaNumberVariable = defaults.areaNumberVariable;
    	      this.interfaces = defaults.interfaces;
    	      this.nssa = defaults.nssa;
    	      this.nssaNoSummary = defaults.nssaNoSummary;
    	      this.nssaNoSummaryVariable = defaults.nssaNoSummaryVariable;
    	      this.optional = defaults.optional;
    	      this.ranges = defaults.ranges;
    	      this.stub = defaults.stub;
    	      this.stubNoSummary = defaults.stubNoSummary;
    	      this.stubNoSummaryVariable = defaults.stubNoSummaryVariable;
        }

        @CustomType.Setter
        public Builder areaNumber(@Nullable Integer areaNumber) {

            this.areaNumber = areaNumber;
            return this;
        }
        @CustomType.Setter
        public Builder areaNumberVariable(@Nullable String areaNumberVariable) {

            this.areaNumberVariable = areaNumberVariable;
            return this;
        }
        @CustomType.Setter
        public Builder interfaces(@Nullable List<CiscoOspfFeatureTemplateAreaInterface> interfaces) {

            this.interfaces = interfaces;
            return this;
        }
        public Builder interfaces(CiscoOspfFeatureTemplateAreaInterface... interfaces) {
            return interfaces(List.of(interfaces));
        }
        @CustomType.Setter
        public Builder nssa(@Nullable Boolean nssa) {

            this.nssa = nssa;
            return this;
        }
        @CustomType.Setter
        public Builder nssaNoSummary(@Nullable Boolean nssaNoSummary) {

            this.nssaNoSummary = nssaNoSummary;
            return this;
        }
        @CustomType.Setter
        public Builder nssaNoSummaryVariable(@Nullable String nssaNoSummaryVariable) {

            this.nssaNoSummaryVariable = nssaNoSummaryVariable;
            return this;
        }
        @CustomType.Setter
        public Builder optional(@Nullable Boolean optional) {

            this.optional = optional;
            return this;
        }
        @CustomType.Setter
        public Builder ranges(@Nullable List<CiscoOspfFeatureTemplateAreaRange> ranges) {

            this.ranges = ranges;
            return this;
        }
        public Builder ranges(CiscoOspfFeatureTemplateAreaRange... ranges) {
            return ranges(List.of(ranges));
        }
        @CustomType.Setter
        public Builder stub(@Nullable Boolean stub) {

            this.stub = stub;
            return this;
        }
        @CustomType.Setter
        public Builder stubNoSummary(@Nullable Boolean stubNoSummary) {

            this.stubNoSummary = stubNoSummary;
            return this;
        }
        @CustomType.Setter
        public Builder stubNoSummaryVariable(@Nullable String stubNoSummaryVariable) {

            this.stubNoSummaryVariable = stubNoSummaryVariable;
            return this;
        }
        public CiscoOspfFeatureTemplateArea build() {
            final var _resultValue = new CiscoOspfFeatureTemplateArea();
            _resultValue.areaNumber = areaNumber;
            _resultValue.areaNumberVariable = areaNumberVariable;
            _resultValue.interfaces = interfaces;
            _resultValue.nssa = nssa;
            _resultValue.nssaNoSummary = nssaNoSummary;
            _resultValue.nssaNoSummaryVariable = nssaNoSummaryVariable;
            _resultValue.optional = optional;
            _resultValue.ranges = ranges;
            _resultValue.stub = stub;
            _resultValue.stubNoSummary = stubNoSummary;
            _resultValue.stubNoSummaryVariable = stubNoSummaryVariable;
            return _resultValue;
        }
    }
}
