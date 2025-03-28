// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityPolicyDefinition {
    /**
     * @return Destination Zone, Attribute conditional on `type` being equal to `zoneBasedFW`
     * 
     */
    private @Nullable String destinationZone;
    /**
     * @return Policy definition ID
     * 
     */
    private String id;
    /**
     * @return Source Zone, Attribute conditional on `type` being equal to `zoneBasedFW`
     * 
     */
    private @Nullable String sourceZone;
    /**
     * @return Policy definition type
     *   - Choices: `urlFiltering`, `zoneBasedFW`, `intrusionPrevention`, `sslDecryption`, `advancedMalwareProtection`, `dnsSecurity`
     * 
     */
    private String type;
    /**
     * @return Policy definition version
     * 
     */
    private @Nullable Integer version;

    private SecurityPolicyDefinition() {}
    /**
     * @return Destination Zone, Attribute conditional on `type` being equal to `zoneBasedFW`
     * 
     */
    public Optional<String> destinationZone() {
        return Optional.ofNullable(this.destinationZone);
    }
    /**
     * @return Policy definition ID
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Source Zone, Attribute conditional on `type` being equal to `zoneBasedFW`
     * 
     */
    public Optional<String> sourceZone() {
        return Optional.ofNullable(this.sourceZone);
    }
    /**
     * @return Policy definition type
     *   - Choices: `urlFiltering`, `zoneBasedFW`, `intrusionPrevention`, `sslDecryption`, `advancedMalwareProtection`, `dnsSecurity`
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Policy definition version
     * 
     */
    public Optional<Integer> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String destinationZone;
        private String id;
        private @Nullable String sourceZone;
        private String type;
        private @Nullable Integer version;
        public Builder() {}
        public Builder(SecurityPolicyDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationZone = defaults.destinationZone;
    	      this.id = defaults.id;
    	      this.sourceZone = defaults.sourceZone;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder destinationZone(@Nullable String destinationZone) {

            this.destinationZone = destinationZone;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("SecurityPolicyDefinition", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder sourceZone(@Nullable String sourceZone) {

            this.sourceZone = sourceZone;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("SecurityPolicyDefinition", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable Integer version) {

            this.version = version;
            return this;
        }
        public SecurityPolicyDefinition build() {
            final var _resultValue = new SecurityPolicyDefinition();
            _resultValue.destinationZone = destinationZone;
            _resultValue.id = id;
            _resultValue.sourceZone = sourceZone;
            _resultValue.type = type;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
