// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceTrackerGroupFeatureTrackerElement {
    private String trackerId;

    private GetServiceTrackerGroupFeatureTrackerElement() {}
    public String trackerId() {
        return this.trackerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTrackerGroupFeatureTrackerElement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String trackerId;
        public Builder() {}
        public Builder(GetServiceTrackerGroupFeatureTrackerElement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.trackerId = defaults.trackerId;
        }

        @CustomType.Setter
        public Builder trackerId(String trackerId) {
            if (trackerId == null) {
              throw new MissingRequiredPropertyException("GetServiceTrackerGroupFeatureTrackerElement", "trackerId");
            }
            this.trackerId = trackerId;
            return this;
        }
        public GetServiceTrackerGroupFeatureTrackerElement build() {
            final var _resultValue = new GetServiceTrackerGroupFeatureTrackerElement();
            _resultValue.trackerId = trackerId;
            return _resultValue;
        }
    }
}