// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransportTrackerGroupFeatureTrackerElementArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransportTrackerGroupFeatureTrackerElementArgs Empty = new TransportTrackerGroupFeatureTrackerElementArgs();

    @Import(name="trackerId")
    private @Nullable Output<String> trackerId;

    public Optional<Output<String>> trackerId() {
        return Optional.ofNullable(this.trackerId);
    }

    private TransportTrackerGroupFeatureTrackerElementArgs() {}

    private TransportTrackerGroupFeatureTrackerElementArgs(TransportTrackerGroupFeatureTrackerElementArgs $) {
        this.trackerId = $.trackerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransportTrackerGroupFeatureTrackerElementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransportTrackerGroupFeatureTrackerElementArgs $;

        public Builder() {
            $ = new TransportTrackerGroupFeatureTrackerElementArgs();
        }

        public Builder(TransportTrackerGroupFeatureTrackerElementArgs defaults) {
            $ = new TransportTrackerGroupFeatureTrackerElementArgs(Objects.requireNonNull(defaults));
        }

        public Builder trackerId(@Nullable Output<String> trackerId) {
            $.trackerId = trackerId;
            return this;
        }

        public Builder trackerId(String trackerId) {
            return trackerId(Output.of(trackerId));
        }

        public TransportTrackerGroupFeatureTrackerElementArgs build() {
            return $;
        }
    }

}
