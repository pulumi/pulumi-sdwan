// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sdwan.outputs.CiscoVpnInterfaceFeatureTemplateIpv4VrrpIpv4SecondaryAddress;
import com.pulumi.sdwan.outputs.CiscoVpnInterfaceFeatureTemplateIpv4VrrpTrackingObject;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CiscoVpnInterfaceFeatureTemplateIpv4Vrrp {
    /**
     * @return Group ID
     *   - Range: `1`-`255`
     * 
     */
    private @Nullable Integer groupId;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String groupIdVariable;
    /**
     * @return Assign IP Address
     * 
     */
    private @Nullable String ipAddress;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String ipAddressVariable;
    /**
     * @return VRRP Secondary IP address
     * 
     */
    private @Nullable List<CiscoVpnInterfaceFeatureTemplateIpv4VrrpIpv4SecondaryAddress> ipv4SecondaryAddresses;
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private @Nullable Boolean optional;
    /**
     * @return Set priority
     *   - Range: `1`-`254`
     *   - Default value: `100`
     * 
     */
    private @Nullable Integer priority;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String priorityVariable;
    /**
     * @return Timer interval for successive advertisements, in milliseconds
     *   - Range: `100`-`40950`
     *   - Default value: `100`
     * 
     */
    private @Nullable Integer timer;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String timerVariable;
    /**
     * @return change TLOC preference
     *   - Default value: `false`
     * 
     */
    private @Nullable Boolean tlocPreferenceChange;
    /**
     * @return Set tloc preference change value
     *   - Range: `1`-`4294967295`
     * 
     */
    private @Nullable Integer tlocPreferenceChangeValue;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String tlocPreferenceChangeValueVariable;
    /**
     * @return Track OMP status
     *   - Default value: `false`
     * 
     */
    private @Nullable Boolean trackOmp;
    /**
     * @return Track Prefix List
     * 
     */
    private @Nullable String trackPrefixList;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String trackPrefixListVariable;
    /**
     * @return tracking object for VRRP configuration
     * 
     */
    private @Nullable List<CiscoVpnInterfaceFeatureTemplateIpv4VrrpTrackingObject> trackingObjects;

    private CiscoVpnInterfaceFeatureTemplateIpv4Vrrp() {}
    /**
     * @return Group ID
     *   - Range: `1`-`255`
     * 
     */
    public Optional<Integer> groupId() {
        return Optional.ofNullable(this.groupId);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> groupIdVariable() {
        return Optional.ofNullable(this.groupIdVariable);
    }
    /**
     * @return Assign IP Address
     * 
     */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> ipAddressVariable() {
        return Optional.ofNullable(this.ipAddressVariable);
    }
    /**
     * @return VRRP Secondary IP address
     * 
     */
    public List<CiscoVpnInterfaceFeatureTemplateIpv4VrrpIpv4SecondaryAddress> ipv4SecondaryAddresses() {
        return this.ipv4SecondaryAddresses == null ? List.of() : this.ipv4SecondaryAddresses;
    }
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Optional<Boolean> optional() {
        return Optional.ofNullable(this.optional);
    }
    /**
     * @return Set priority
     *   - Range: `1`-`254`
     *   - Default value: `100`
     * 
     */
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> priorityVariable() {
        return Optional.ofNullable(this.priorityVariable);
    }
    /**
     * @return Timer interval for successive advertisements, in milliseconds
     *   - Range: `100`-`40950`
     *   - Default value: `100`
     * 
     */
    public Optional<Integer> timer() {
        return Optional.ofNullable(this.timer);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> timerVariable() {
        return Optional.ofNullable(this.timerVariable);
    }
    /**
     * @return change TLOC preference
     *   - Default value: `false`
     * 
     */
    public Optional<Boolean> tlocPreferenceChange() {
        return Optional.ofNullable(this.tlocPreferenceChange);
    }
    /**
     * @return Set tloc preference change value
     *   - Range: `1`-`4294967295`
     * 
     */
    public Optional<Integer> tlocPreferenceChangeValue() {
        return Optional.ofNullable(this.tlocPreferenceChangeValue);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> tlocPreferenceChangeValueVariable() {
        return Optional.ofNullable(this.tlocPreferenceChangeValueVariable);
    }
    /**
     * @return Track OMP status
     *   - Default value: `false`
     * 
     */
    public Optional<Boolean> trackOmp() {
        return Optional.ofNullable(this.trackOmp);
    }
    /**
     * @return Track Prefix List
     * 
     */
    public Optional<String> trackPrefixList() {
        return Optional.ofNullable(this.trackPrefixList);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> trackPrefixListVariable() {
        return Optional.ofNullable(this.trackPrefixListVariable);
    }
    /**
     * @return tracking object for VRRP configuration
     * 
     */
    public List<CiscoVpnInterfaceFeatureTemplateIpv4VrrpTrackingObject> trackingObjects() {
        return this.trackingObjects == null ? List.of() : this.trackingObjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CiscoVpnInterfaceFeatureTemplateIpv4Vrrp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer groupId;
        private @Nullable String groupIdVariable;
        private @Nullable String ipAddress;
        private @Nullable String ipAddressVariable;
        private @Nullable List<CiscoVpnInterfaceFeatureTemplateIpv4VrrpIpv4SecondaryAddress> ipv4SecondaryAddresses;
        private @Nullable Boolean optional;
        private @Nullable Integer priority;
        private @Nullable String priorityVariable;
        private @Nullable Integer timer;
        private @Nullable String timerVariable;
        private @Nullable Boolean tlocPreferenceChange;
        private @Nullable Integer tlocPreferenceChangeValue;
        private @Nullable String tlocPreferenceChangeValueVariable;
        private @Nullable Boolean trackOmp;
        private @Nullable String trackPrefixList;
        private @Nullable String trackPrefixListVariable;
        private @Nullable List<CiscoVpnInterfaceFeatureTemplateIpv4VrrpTrackingObject> trackingObjects;
        public Builder() {}
        public Builder(CiscoVpnInterfaceFeatureTemplateIpv4Vrrp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.groupIdVariable = defaults.groupIdVariable;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipAddressVariable = defaults.ipAddressVariable;
    	      this.ipv4SecondaryAddresses = defaults.ipv4SecondaryAddresses;
    	      this.optional = defaults.optional;
    	      this.priority = defaults.priority;
    	      this.priorityVariable = defaults.priorityVariable;
    	      this.timer = defaults.timer;
    	      this.timerVariable = defaults.timerVariable;
    	      this.tlocPreferenceChange = defaults.tlocPreferenceChange;
    	      this.tlocPreferenceChangeValue = defaults.tlocPreferenceChangeValue;
    	      this.tlocPreferenceChangeValueVariable = defaults.tlocPreferenceChangeValueVariable;
    	      this.trackOmp = defaults.trackOmp;
    	      this.trackPrefixList = defaults.trackPrefixList;
    	      this.trackPrefixListVariable = defaults.trackPrefixListVariable;
    	      this.trackingObjects = defaults.trackingObjects;
        }

        @CustomType.Setter
        public Builder groupId(@Nullable Integer groupId) {

            this.groupId = groupId;
            return this;
        }
        @CustomType.Setter
        public Builder groupIdVariable(@Nullable String groupIdVariable) {

            this.groupIdVariable = groupIdVariable;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddress(@Nullable String ipAddress) {

            this.ipAddress = ipAddress;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddressVariable(@Nullable String ipAddressVariable) {

            this.ipAddressVariable = ipAddressVariable;
            return this;
        }
        @CustomType.Setter
        public Builder ipv4SecondaryAddresses(@Nullable List<CiscoVpnInterfaceFeatureTemplateIpv4VrrpIpv4SecondaryAddress> ipv4SecondaryAddresses) {

            this.ipv4SecondaryAddresses = ipv4SecondaryAddresses;
            return this;
        }
        public Builder ipv4SecondaryAddresses(CiscoVpnInterfaceFeatureTemplateIpv4VrrpIpv4SecondaryAddress... ipv4SecondaryAddresses) {
            return ipv4SecondaryAddresses(List.of(ipv4SecondaryAddresses));
        }
        @CustomType.Setter
        public Builder optional(@Nullable Boolean optional) {

            this.optional = optional;
            return this;
        }
        @CustomType.Setter
        public Builder priority(@Nullable Integer priority) {

            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder priorityVariable(@Nullable String priorityVariable) {

            this.priorityVariable = priorityVariable;
            return this;
        }
        @CustomType.Setter
        public Builder timer(@Nullable Integer timer) {

            this.timer = timer;
            return this;
        }
        @CustomType.Setter
        public Builder timerVariable(@Nullable String timerVariable) {

            this.timerVariable = timerVariable;
            return this;
        }
        @CustomType.Setter
        public Builder tlocPreferenceChange(@Nullable Boolean tlocPreferenceChange) {

            this.tlocPreferenceChange = tlocPreferenceChange;
            return this;
        }
        @CustomType.Setter
        public Builder tlocPreferenceChangeValue(@Nullable Integer tlocPreferenceChangeValue) {

            this.tlocPreferenceChangeValue = tlocPreferenceChangeValue;
            return this;
        }
        @CustomType.Setter
        public Builder tlocPreferenceChangeValueVariable(@Nullable String tlocPreferenceChangeValueVariable) {

            this.tlocPreferenceChangeValueVariable = tlocPreferenceChangeValueVariable;
            return this;
        }
        @CustomType.Setter
        public Builder trackOmp(@Nullable Boolean trackOmp) {

            this.trackOmp = trackOmp;
            return this;
        }
        @CustomType.Setter
        public Builder trackPrefixList(@Nullable String trackPrefixList) {

            this.trackPrefixList = trackPrefixList;
            return this;
        }
        @CustomType.Setter
        public Builder trackPrefixListVariable(@Nullable String trackPrefixListVariable) {

            this.trackPrefixListVariable = trackPrefixListVariable;
            return this;
        }
        @CustomType.Setter
        public Builder trackingObjects(@Nullable List<CiscoVpnInterfaceFeatureTemplateIpv4VrrpTrackingObject> trackingObjects) {

            this.trackingObjects = trackingObjects;
            return this;
        }
        public Builder trackingObjects(CiscoVpnInterfaceFeatureTemplateIpv4VrrpTrackingObject... trackingObjects) {
            return trackingObjects(List.of(trackingObjects));
        }
        public CiscoVpnInterfaceFeatureTemplateIpv4Vrrp build() {
            final var _resultValue = new CiscoVpnInterfaceFeatureTemplateIpv4Vrrp();
            _resultValue.groupId = groupId;
            _resultValue.groupIdVariable = groupIdVariable;
            _resultValue.ipAddress = ipAddress;
            _resultValue.ipAddressVariable = ipAddressVariable;
            _resultValue.ipv4SecondaryAddresses = ipv4SecondaryAddresses;
            _resultValue.optional = optional;
            _resultValue.priority = priority;
            _resultValue.priorityVariable = priorityVariable;
            _resultValue.timer = timer;
            _resultValue.timerVariable = timerVariable;
            _resultValue.tlocPreferenceChange = tlocPreferenceChange;
            _resultValue.tlocPreferenceChangeValue = tlocPreferenceChangeValue;
            _resultValue.tlocPreferenceChangeValueVariable = tlocPreferenceChangeValueVariable;
            _resultValue.trackOmp = trackOmp;
            _resultValue.trackPrefixList = trackPrefixList;
            _resultValue.trackPrefixListVariable = trackPrefixListVariable;
            _resultValue.trackingObjects = trackingObjects;
            return _resultValue;
        }
    }
}
