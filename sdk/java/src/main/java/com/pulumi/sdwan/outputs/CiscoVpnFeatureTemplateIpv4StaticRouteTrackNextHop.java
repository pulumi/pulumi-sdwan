// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CiscoVpnFeatureTemplateIpv4StaticRouteTrackNextHop {
    /**
     * @return IP Address
     * 
     */
    private @Nullable String address;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String addressVariable;
    /**
     * @return Administrative distance
     *   - Range: `1`-`255`
     *   - Default value: `1`
     * 
     */
    private @Nullable Integer distance;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String distanceVariable;
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private @Nullable Boolean optional;
    /**
     * @return Static route tracker
     * 
     */
    private @Nullable String tracker;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String trackerVariable;

    private CiscoVpnFeatureTemplateIpv4StaticRouteTrackNextHop() {}
    /**
     * @return IP Address
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> addressVariable() {
        return Optional.ofNullable(this.addressVariable);
    }
    /**
     * @return Administrative distance
     *   - Range: `1`-`255`
     *   - Default value: `1`
     * 
     */
    public Optional<Integer> distance() {
        return Optional.ofNullable(this.distance);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> distanceVariable() {
        return Optional.ofNullable(this.distanceVariable);
    }
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Optional<Boolean> optional() {
        return Optional.ofNullable(this.optional);
    }
    /**
     * @return Static route tracker
     * 
     */
    public Optional<String> tracker() {
        return Optional.ofNullable(this.tracker);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> trackerVariable() {
        return Optional.ofNullable(this.trackerVariable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CiscoVpnFeatureTemplateIpv4StaticRouteTrackNextHop defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String address;
        private @Nullable String addressVariable;
        private @Nullable Integer distance;
        private @Nullable String distanceVariable;
        private @Nullable Boolean optional;
        private @Nullable String tracker;
        private @Nullable String trackerVariable;
        public Builder() {}
        public Builder(CiscoVpnFeatureTemplateIpv4StaticRouteTrackNextHop defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.addressVariable = defaults.addressVariable;
    	      this.distance = defaults.distance;
    	      this.distanceVariable = defaults.distanceVariable;
    	      this.optional = defaults.optional;
    	      this.tracker = defaults.tracker;
    	      this.trackerVariable = defaults.trackerVariable;
        }

        @CustomType.Setter
        public Builder address(@Nullable String address) {

            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder addressVariable(@Nullable String addressVariable) {

            this.addressVariable = addressVariable;
            return this;
        }
        @CustomType.Setter
        public Builder distance(@Nullable Integer distance) {

            this.distance = distance;
            return this;
        }
        @CustomType.Setter
        public Builder distanceVariable(@Nullable String distanceVariable) {

            this.distanceVariable = distanceVariable;
            return this;
        }
        @CustomType.Setter
        public Builder optional(@Nullable Boolean optional) {

            this.optional = optional;
            return this;
        }
        @CustomType.Setter
        public Builder tracker(@Nullable String tracker) {

            this.tracker = tracker;
            return this;
        }
        @CustomType.Setter
        public Builder trackerVariable(@Nullable String trackerVariable) {

            this.trackerVariable = trackerVariable;
            return this;
        }
        public CiscoVpnFeatureTemplateIpv4StaticRouteTrackNextHop build() {
            final var _resultValue = new CiscoVpnFeatureTemplateIpv4StaticRouteTrackNextHop();
            _resultValue.address = address;
            _resultValue.addressVariable = addressVariable;
            _resultValue.distance = distance;
            _resultValue.distanceVariable = distanceVariable;
            _resultValue.optional = optional;
            _resultValue.tracker = tracker;
            _resultValue.trackerVariable = trackerVariable;
            return _resultValue;
        }
    }
}
