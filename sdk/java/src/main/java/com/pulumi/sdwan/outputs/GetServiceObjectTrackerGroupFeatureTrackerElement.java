// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceObjectTrackerGroupFeatureTrackerElement {
    private String objectTrackerId;

    private GetServiceObjectTrackerGroupFeatureTrackerElement() {}
    public String objectTrackerId() {
        return this.objectTrackerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceObjectTrackerGroupFeatureTrackerElement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String objectTrackerId;
        public Builder() {}
        public Builder(GetServiceObjectTrackerGroupFeatureTrackerElement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectTrackerId = defaults.objectTrackerId;
        }

        @CustomType.Setter
        public Builder objectTrackerId(String objectTrackerId) {
            if (objectTrackerId == null) {
              throw new MissingRequiredPropertyException("GetServiceObjectTrackerGroupFeatureTrackerElement", "objectTrackerId");
            }
            this.objectTrackerId = objectTrackerId;
            return this;
        }
        public GetServiceObjectTrackerGroupFeatureTrackerElement build() {
            final var _resultValue = new GetServiceObjectTrackerGroupFeatureTrackerElement();
            _resultValue.objectTrackerId = objectTrackerId;
            return _resultValue;
        }
    }
}