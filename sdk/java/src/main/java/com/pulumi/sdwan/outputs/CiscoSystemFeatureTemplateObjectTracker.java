// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sdwan.outputs.CiscoSystemFeatureTemplateObjectTrackerGroupTracksId;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CiscoSystemFeatureTemplateObjectTracker {
    /**
     * @return Type of grouping to be performed for tracker group
     *   - Choices: `and`, `or`
     * 
     */
    private @Nullable String boolean_;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String booleanVariable;
    /**
     * @return Tracks id in group configuration
     * 
     */
    private @Nullable List<CiscoSystemFeatureTemplateObjectTrackerGroupTracksId> groupTracksIds;
    /**
     * @return interface name
     * 
     */
    private @Nullable String interface_;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String interfaceVariable;
    /**
     * @return IP address of route
     * 
     */
    private @Nullable String ip;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String ipVariable;
    /**
     * @return Route Ip Mask
     *   - Default value: `0.0.0.0`
     * 
     */
    private @Nullable String mask;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String maskVariable;
    /**
     * @return Object tracker ID
     *   - Range: `1`-`1000`
     * 
     */
    private @Nullable Integer objectNumber;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String objectNumberVariable;
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private @Nullable Boolean optional;
    /**
     * @return service sig
     * 
     */
    private @Nullable String sig;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String sigVariable;
    /**
     * @return VPN
     *   - Range: `0`-`65527`
     *   - Default value: `0`
     * 
     */
    private @Nullable Integer vpnId;

    private CiscoSystemFeatureTemplateObjectTracker() {}
    /**
     * @return Type of grouping to be performed for tracker group
     *   - Choices: `and`, `or`
     * 
     */
    public Optional<String> boolean_() {
        return Optional.ofNullable(this.boolean_);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> booleanVariable() {
        return Optional.ofNullable(this.booleanVariable);
    }
    /**
     * @return Tracks id in group configuration
     * 
     */
    public List<CiscoSystemFeatureTemplateObjectTrackerGroupTracksId> groupTracksIds() {
        return this.groupTracksIds == null ? List.of() : this.groupTracksIds;
    }
    /**
     * @return interface name
     * 
     */
    public Optional<String> interface_() {
        return Optional.ofNullable(this.interface_);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> interfaceVariable() {
        return Optional.ofNullable(this.interfaceVariable);
    }
    /**
     * @return IP address of route
     * 
     */
    public Optional<String> ip() {
        return Optional.ofNullable(this.ip);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> ipVariable() {
        return Optional.ofNullable(this.ipVariable);
    }
    /**
     * @return Route Ip Mask
     *   - Default value: `0.0.0.0`
     * 
     */
    public Optional<String> mask() {
        return Optional.ofNullable(this.mask);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> maskVariable() {
        return Optional.ofNullable(this.maskVariable);
    }
    /**
     * @return Object tracker ID
     *   - Range: `1`-`1000`
     * 
     */
    public Optional<Integer> objectNumber() {
        return Optional.ofNullable(this.objectNumber);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> objectNumberVariable() {
        return Optional.ofNullable(this.objectNumberVariable);
    }
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Optional<Boolean> optional() {
        return Optional.ofNullable(this.optional);
    }
    /**
     * @return service sig
     * 
     */
    public Optional<String> sig() {
        return Optional.ofNullable(this.sig);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> sigVariable() {
        return Optional.ofNullable(this.sigVariable);
    }
    /**
     * @return VPN
     *   - Range: `0`-`65527`
     *   - Default value: `0`
     * 
     */
    public Optional<Integer> vpnId() {
        return Optional.ofNullable(this.vpnId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CiscoSystemFeatureTemplateObjectTracker defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String boolean_;
        private @Nullable String booleanVariable;
        private @Nullable List<CiscoSystemFeatureTemplateObjectTrackerGroupTracksId> groupTracksIds;
        private @Nullable String interface_;
        private @Nullable String interfaceVariable;
        private @Nullable String ip;
        private @Nullable String ipVariable;
        private @Nullable String mask;
        private @Nullable String maskVariable;
        private @Nullable Integer objectNumber;
        private @Nullable String objectNumberVariable;
        private @Nullable Boolean optional;
        private @Nullable String sig;
        private @Nullable String sigVariable;
        private @Nullable Integer vpnId;
        public Builder() {}
        public Builder(CiscoSystemFeatureTemplateObjectTracker defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boolean_ = defaults.boolean_;
    	      this.booleanVariable = defaults.booleanVariable;
    	      this.groupTracksIds = defaults.groupTracksIds;
    	      this.interface_ = defaults.interface_;
    	      this.interfaceVariable = defaults.interfaceVariable;
    	      this.ip = defaults.ip;
    	      this.ipVariable = defaults.ipVariable;
    	      this.mask = defaults.mask;
    	      this.maskVariable = defaults.maskVariable;
    	      this.objectNumber = defaults.objectNumber;
    	      this.objectNumberVariable = defaults.objectNumberVariable;
    	      this.optional = defaults.optional;
    	      this.sig = defaults.sig;
    	      this.sigVariable = defaults.sigVariable;
    	      this.vpnId = defaults.vpnId;
        }

        @CustomType.Setter("boolean")
        public Builder boolean_(@Nullable String boolean_) {

            this.boolean_ = boolean_;
            return this;
        }
        @CustomType.Setter
        public Builder booleanVariable(@Nullable String booleanVariable) {

            this.booleanVariable = booleanVariable;
            return this;
        }
        @CustomType.Setter
        public Builder groupTracksIds(@Nullable List<CiscoSystemFeatureTemplateObjectTrackerGroupTracksId> groupTracksIds) {

            this.groupTracksIds = groupTracksIds;
            return this;
        }
        public Builder groupTracksIds(CiscoSystemFeatureTemplateObjectTrackerGroupTracksId... groupTracksIds) {
            return groupTracksIds(List.of(groupTracksIds));
        }
        @CustomType.Setter("interface")
        public Builder interface_(@Nullable String interface_) {

            this.interface_ = interface_;
            return this;
        }
        @CustomType.Setter
        public Builder interfaceVariable(@Nullable String interfaceVariable) {

            this.interfaceVariable = interfaceVariable;
            return this;
        }
        @CustomType.Setter
        public Builder ip(@Nullable String ip) {

            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder ipVariable(@Nullable String ipVariable) {

            this.ipVariable = ipVariable;
            return this;
        }
        @CustomType.Setter
        public Builder mask(@Nullable String mask) {

            this.mask = mask;
            return this;
        }
        @CustomType.Setter
        public Builder maskVariable(@Nullable String maskVariable) {

            this.maskVariable = maskVariable;
            return this;
        }
        @CustomType.Setter
        public Builder objectNumber(@Nullable Integer objectNumber) {

            this.objectNumber = objectNumber;
            return this;
        }
        @CustomType.Setter
        public Builder objectNumberVariable(@Nullable String objectNumberVariable) {

            this.objectNumberVariable = objectNumberVariable;
            return this;
        }
        @CustomType.Setter
        public Builder optional(@Nullable Boolean optional) {

            this.optional = optional;
            return this;
        }
        @CustomType.Setter
        public Builder sig(@Nullable String sig) {

            this.sig = sig;
            return this;
        }
        @CustomType.Setter
        public Builder sigVariable(@Nullable String sigVariable) {

            this.sigVariable = sigVariable;
            return this;
        }
        @CustomType.Setter
        public Builder vpnId(@Nullable Integer vpnId) {

            this.vpnId = vpnId;
            return this;
        }
        public CiscoSystemFeatureTemplateObjectTracker build() {
            final var _resultValue = new CiscoSystemFeatureTemplateObjectTracker();
            _resultValue.boolean_ = boolean_;
            _resultValue.booleanVariable = booleanVariable;
            _resultValue.groupTracksIds = groupTracksIds;
            _resultValue.interface_ = interface_;
            _resultValue.interfaceVariable = interfaceVariable;
            _resultValue.ip = ip;
            _resultValue.ipVariable = ipVariable;
            _resultValue.mask = mask;
            _resultValue.maskVariable = maskVariable;
            _resultValue.objectNumber = objectNumber;
            _resultValue.objectNumberVariable = objectNumberVariable;
            _resultValue.optional = optional;
            _resultValue.sig = sig;
            _resultValue.sigVariable = sigVariable;
            _resultValue.vpnId = vpnId;
            return _resultValue;
        }
    }
}
