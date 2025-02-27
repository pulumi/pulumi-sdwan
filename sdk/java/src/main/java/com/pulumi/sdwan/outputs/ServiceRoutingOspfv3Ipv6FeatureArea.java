// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sdwan.outputs.ServiceRoutingOspfv3Ipv6FeatureAreaInterface;
import com.pulumi.sdwan.outputs.ServiceRoutingOspfv3Ipv6FeatureAreaRange;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceRoutingOspfv3Ipv6FeatureArea {
    /**
     * @return Always translate type7 LSAs
     * 
     */
    private @Nullable Boolean alwaysTranslate;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String alwaysTranslateVariable;
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
     * @return stub area type
     *   - Choices: `stub`
     * 
     */
    private @Nullable String areaType;
    /**
     * @return Set OSPF interface parameters
     * 
     */
    private @Nullable List<ServiceRoutingOspfv3Ipv6FeatureAreaInterface> interfaces;
    /**
     * @return Do not inject inter-area routes
     * 
     */
    private @Nullable Boolean noSummary;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String noSummaryVariable;
    /**
     * @return Summarize OSPF routes at an area boundary
     * 
     */
    private @Nullable List<ServiceRoutingOspfv3Ipv6FeatureAreaRange> ranges;

    private ServiceRoutingOspfv3Ipv6FeatureArea() {}
    /**
     * @return Always translate type7 LSAs
     * 
     */
    public Optional<Boolean> alwaysTranslate() {
        return Optional.ofNullable(this.alwaysTranslate);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> alwaysTranslateVariable() {
        return Optional.ofNullable(this.alwaysTranslateVariable);
    }
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
     * @return stub area type
     *   - Choices: `stub`
     * 
     */
    public Optional<String> areaType() {
        return Optional.ofNullable(this.areaType);
    }
    /**
     * @return Set OSPF interface parameters
     * 
     */
    public List<ServiceRoutingOspfv3Ipv6FeatureAreaInterface> interfaces() {
        return this.interfaces == null ? List.of() : this.interfaces;
    }
    /**
     * @return Do not inject inter-area routes
     * 
     */
    public Optional<Boolean> noSummary() {
        return Optional.ofNullable(this.noSummary);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> noSummaryVariable() {
        return Optional.ofNullable(this.noSummaryVariable);
    }
    /**
     * @return Summarize OSPF routes at an area boundary
     * 
     */
    public List<ServiceRoutingOspfv3Ipv6FeatureAreaRange> ranges() {
        return this.ranges == null ? List.of() : this.ranges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceRoutingOspfv3Ipv6FeatureArea defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean alwaysTranslate;
        private @Nullable String alwaysTranslateVariable;
        private @Nullable Integer areaNumber;
        private @Nullable String areaNumberVariable;
        private @Nullable String areaType;
        private @Nullable List<ServiceRoutingOspfv3Ipv6FeatureAreaInterface> interfaces;
        private @Nullable Boolean noSummary;
        private @Nullable String noSummaryVariable;
        private @Nullable List<ServiceRoutingOspfv3Ipv6FeatureAreaRange> ranges;
        public Builder() {}
        public Builder(ServiceRoutingOspfv3Ipv6FeatureArea defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alwaysTranslate = defaults.alwaysTranslate;
    	      this.alwaysTranslateVariable = defaults.alwaysTranslateVariable;
    	      this.areaNumber = defaults.areaNumber;
    	      this.areaNumberVariable = defaults.areaNumberVariable;
    	      this.areaType = defaults.areaType;
    	      this.interfaces = defaults.interfaces;
    	      this.noSummary = defaults.noSummary;
    	      this.noSummaryVariable = defaults.noSummaryVariable;
    	      this.ranges = defaults.ranges;
        }

        @CustomType.Setter
        public Builder alwaysTranslate(@Nullable Boolean alwaysTranslate) {

            this.alwaysTranslate = alwaysTranslate;
            return this;
        }
        @CustomType.Setter
        public Builder alwaysTranslateVariable(@Nullable String alwaysTranslateVariable) {

            this.alwaysTranslateVariable = alwaysTranslateVariable;
            return this;
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
        public Builder areaType(@Nullable String areaType) {

            this.areaType = areaType;
            return this;
        }
        @CustomType.Setter
        public Builder interfaces(@Nullable List<ServiceRoutingOspfv3Ipv6FeatureAreaInterface> interfaces) {

            this.interfaces = interfaces;
            return this;
        }
        public Builder interfaces(ServiceRoutingOspfv3Ipv6FeatureAreaInterface... interfaces) {
            return interfaces(List.of(interfaces));
        }
        @CustomType.Setter
        public Builder noSummary(@Nullable Boolean noSummary) {

            this.noSummary = noSummary;
            return this;
        }
        @CustomType.Setter
        public Builder noSummaryVariable(@Nullable String noSummaryVariable) {

            this.noSummaryVariable = noSummaryVariable;
            return this;
        }
        @CustomType.Setter
        public Builder ranges(@Nullable List<ServiceRoutingOspfv3Ipv6FeatureAreaRange> ranges) {

            this.ranges = ranges;
            return this;
        }
        public Builder ranges(ServiceRoutingOspfv3Ipv6FeatureAreaRange... ranges) {
            return ranges(List.of(ranges));
        }
        public ServiceRoutingOspfv3Ipv6FeatureArea build() {
            final var _resultValue = new ServiceRoutingOspfv3Ipv6FeatureArea();
            _resultValue.alwaysTranslate = alwaysTranslate;
            _resultValue.alwaysTranslateVariable = alwaysTranslateVariable;
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
