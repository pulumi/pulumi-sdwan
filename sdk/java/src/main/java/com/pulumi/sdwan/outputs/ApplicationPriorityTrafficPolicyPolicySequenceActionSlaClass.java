// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationPriorityTrafficPolicyPolicySequenceActionSlaClass {
    private @Nullable Boolean fallbackToBestPath;
    private @Nullable String preferredColorGroupListId;
    private @Nullable List<String> preferredColors;
    private @Nullable List<String> preferredRemoteColors;
    private @Nullable Boolean remoteColorRestrict;
    private @Nullable String slaClassListId;
    private @Nullable Boolean strict;

    private ApplicationPriorityTrafficPolicyPolicySequenceActionSlaClass() {}
    public Optional<Boolean> fallbackToBestPath() {
        return Optional.ofNullable(this.fallbackToBestPath);
    }
    public Optional<String> preferredColorGroupListId() {
        return Optional.ofNullable(this.preferredColorGroupListId);
    }
    public List<String> preferredColors() {
        return this.preferredColors == null ? List.of() : this.preferredColors;
    }
    public List<String> preferredRemoteColors() {
        return this.preferredRemoteColors == null ? List.of() : this.preferredRemoteColors;
    }
    public Optional<Boolean> remoteColorRestrict() {
        return Optional.ofNullable(this.remoteColorRestrict);
    }
    public Optional<String> slaClassListId() {
        return Optional.ofNullable(this.slaClassListId);
    }
    public Optional<Boolean> strict() {
        return Optional.ofNullable(this.strict);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationPriorityTrafficPolicyPolicySequenceActionSlaClass defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean fallbackToBestPath;
        private @Nullable String preferredColorGroupListId;
        private @Nullable List<String> preferredColors;
        private @Nullable List<String> preferredRemoteColors;
        private @Nullable Boolean remoteColorRestrict;
        private @Nullable String slaClassListId;
        private @Nullable Boolean strict;
        public Builder() {}
        public Builder(ApplicationPriorityTrafficPolicyPolicySequenceActionSlaClass defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fallbackToBestPath = defaults.fallbackToBestPath;
    	      this.preferredColorGroupListId = defaults.preferredColorGroupListId;
    	      this.preferredColors = defaults.preferredColors;
    	      this.preferredRemoteColors = defaults.preferredRemoteColors;
    	      this.remoteColorRestrict = defaults.remoteColorRestrict;
    	      this.slaClassListId = defaults.slaClassListId;
    	      this.strict = defaults.strict;
        }

        @CustomType.Setter
        public Builder fallbackToBestPath(@Nullable Boolean fallbackToBestPath) {

            this.fallbackToBestPath = fallbackToBestPath;
            return this;
        }
        @CustomType.Setter
        public Builder preferredColorGroupListId(@Nullable String preferredColorGroupListId) {

            this.preferredColorGroupListId = preferredColorGroupListId;
            return this;
        }
        @CustomType.Setter
        public Builder preferredColors(@Nullable List<String> preferredColors) {

            this.preferredColors = preferredColors;
            return this;
        }
        public Builder preferredColors(String... preferredColors) {
            return preferredColors(List.of(preferredColors));
        }
        @CustomType.Setter
        public Builder preferredRemoteColors(@Nullable List<String> preferredRemoteColors) {

            this.preferredRemoteColors = preferredRemoteColors;
            return this;
        }
        public Builder preferredRemoteColors(String... preferredRemoteColors) {
            return preferredRemoteColors(List.of(preferredRemoteColors));
        }
        @CustomType.Setter
        public Builder remoteColorRestrict(@Nullable Boolean remoteColorRestrict) {

            this.remoteColorRestrict = remoteColorRestrict;
            return this;
        }
        @CustomType.Setter
        public Builder slaClassListId(@Nullable String slaClassListId) {

            this.slaClassListId = slaClassListId;
            return this;
        }
        @CustomType.Setter
        public Builder strict(@Nullable Boolean strict) {

            this.strict = strict;
            return this;
        }
        public ApplicationPriorityTrafficPolicyPolicySequenceActionSlaClass build() {
            final var _resultValue = new ApplicationPriorityTrafficPolicyPolicySequenceActionSlaClass();
            _resultValue.fallbackToBestPath = fallbackToBestPath;
            _resultValue.preferredColorGroupListId = preferredColorGroupListId;
            _resultValue.preferredColors = preferredColors;
            _resultValue.preferredRemoteColors = preferredRemoteColors;
            _resultValue.remoteColorRestrict = remoteColorRestrict;
            _resultValue.slaClassListId = slaClassListId;
            _resultValue.strict = strict;
            return _resultValue;
        }
    }
}
