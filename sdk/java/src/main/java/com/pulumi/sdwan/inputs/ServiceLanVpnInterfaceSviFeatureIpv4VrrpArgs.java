// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sdwan.inputs.ServiceLanVpnInterfaceSviFeatureIpv4VrrpSecondaryAddressArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceLanVpnInterfaceSviFeatureIpv4VrrpArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLanVpnInterfaceSviFeatureIpv4VrrpArgs Empty = new ServiceLanVpnInterfaceSviFeatureIpv4VrrpArgs();

    /**
     * Assign IPV4 Address
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return Assign IPV4 Address
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="addressVariable")
    private @Nullable Output<String> addressVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> addressVariable() {
        return Optional.ofNullable(this.addressVariable);
    }

    /**
     * Group ID
     *   - Range: `1`-`255`
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<Integer> groupId;

    /**
     * @return Group ID
     *   - Range: `1`-`255`
     * 
     */
    public Optional<Output<Integer>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="groupIdVariable")
    private @Nullable Output<String> groupIdVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> groupIdVariable() {
        return Optional.ofNullable(this.groupIdVariable);
    }

    /**
     * Track Prefix List
     * 
     */
    @Import(name="prefixList")
    private @Nullable Output<String> prefixList;

    /**
     * @return Track Prefix List
     * 
     */
    public Optional<Output<String>> prefixList() {
        return Optional.ofNullable(this.prefixList);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="prefixListVariable")
    private @Nullable Output<String> prefixListVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> prefixListVariable() {
        return Optional.ofNullable(this.prefixListVariable);
    }

    /**
     * Set priority
     *   - Range: `1`-`254`
     *   - Default value: `100`
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Set priority
     *   - Range: `1`-`254`
     *   - Default value: `100`
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="priorityVariable")
    private @Nullable Output<String> priorityVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> priorityVariable() {
        return Optional.ofNullable(this.priorityVariable);
    }

    /**
     * VRRP Secondary IPV4 address
     * 
     */
    @Import(name="secondaryAddresses")
    private @Nullable Output<List<ServiceLanVpnInterfaceSviFeatureIpv4VrrpSecondaryAddressArgs>> secondaryAddresses;

    /**
     * @return VRRP Secondary IPV4 address
     * 
     */
    public Optional<Output<List<ServiceLanVpnInterfaceSviFeatureIpv4VrrpSecondaryAddressArgs>>> secondaryAddresses() {
        return Optional.ofNullable(this.secondaryAddresses);
    }

    /**
     * Timer interval for successive advertisements, in milliseconds
     *   - Range: `100`-`40950`
     *   - Default value: `1000`
     * 
     */
    @Import(name="timer")
    private @Nullable Output<Integer> timer;

    /**
     * @return Timer interval for successive advertisements, in milliseconds
     *   - Range: `100`-`40950`
     *   - Default value: `1000`
     * 
     */
    public Optional<Output<Integer>> timer() {
        return Optional.ofNullable(this.timer);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="timerVariable")
    private @Nullable Output<String> timerVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> timerVariable() {
        return Optional.ofNullable(this.timerVariable);
    }

    /**
     * change TLOC preference
     *   - Default value: `false`
     * 
     */
    @Import(name="tlocPrefixChange")
    private @Nullable Output<Boolean> tlocPrefixChange;

    /**
     * @return change TLOC preference
     *   - Default value: `false`
     * 
     */
    public Optional<Output<Boolean>> tlocPrefixChange() {
        return Optional.ofNullable(this.tlocPrefixChange);
    }

    /**
     * Set tloc preference change value
     *   - Range: `1`-`4294967295`
     * 
     */
    @Import(name="tlocPrefixChangeValue")
    private @Nullable Output<Integer> tlocPrefixChangeValue;

    /**
     * @return Set tloc preference change value
     *   - Range: `1`-`4294967295`
     * 
     */
    public Optional<Output<Integer>> tlocPrefixChangeValue() {
        return Optional.ofNullable(this.tlocPrefixChangeValue);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="tlocPrefixChangeValueVariable")
    private @Nullable Output<String> tlocPrefixChangeValueVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> tlocPrefixChangeValueVariable() {
        return Optional.ofNullable(this.tlocPrefixChangeValueVariable);
    }

    /**
     * Track OMP status
     *   - Default value: `false`
     * 
     */
    @Import(name="trackOmp")
    private @Nullable Output<Boolean> trackOmp;

    /**
     * @return Track OMP status
     *   - Default value: `false`
     * 
     */
    public Optional<Output<Boolean>> trackOmp() {
        return Optional.ofNullable(this.trackOmp);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="trackOmpVariable")
    private @Nullable Output<String> trackOmpVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> trackOmpVariable() {
        return Optional.ofNullable(this.trackOmpVariable);
    }

    private ServiceLanVpnInterfaceSviFeatureIpv4VrrpArgs() {}

    private ServiceLanVpnInterfaceSviFeatureIpv4VrrpArgs(ServiceLanVpnInterfaceSviFeatureIpv4VrrpArgs $) {
        this.address = $.address;
        this.addressVariable = $.addressVariable;
        this.groupId = $.groupId;
        this.groupIdVariable = $.groupIdVariable;
        this.prefixList = $.prefixList;
        this.prefixListVariable = $.prefixListVariable;
        this.priority = $.priority;
        this.priorityVariable = $.priorityVariable;
        this.secondaryAddresses = $.secondaryAddresses;
        this.timer = $.timer;
        this.timerVariable = $.timerVariable;
        this.tlocPrefixChange = $.tlocPrefixChange;
        this.tlocPrefixChangeValue = $.tlocPrefixChangeValue;
        this.tlocPrefixChangeValueVariable = $.tlocPrefixChangeValueVariable;
        this.trackOmp = $.trackOmp;
        this.trackOmpVariable = $.trackOmpVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLanVpnInterfaceSviFeatureIpv4VrrpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLanVpnInterfaceSviFeatureIpv4VrrpArgs $;

        public Builder() {
            $ = new ServiceLanVpnInterfaceSviFeatureIpv4VrrpArgs();
        }

        public Builder(ServiceLanVpnInterfaceSviFeatureIpv4VrrpArgs defaults) {
            $ = new ServiceLanVpnInterfaceSviFeatureIpv4VrrpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address Assign IPV4 Address
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address Assign IPV4 Address
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param addressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder addressVariable(@Nullable Output<String> addressVariable) {
            $.addressVariable = addressVariable;
            return this;
        }

        /**
         * @param addressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder addressVariable(String addressVariable) {
            return addressVariable(Output.of(addressVariable));
        }

        /**
         * @param groupId Group ID
         *   - Range: `1`-`255`
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<Integer> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId Group ID
         *   - Range: `1`-`255`
         * 
         * @return builder
         * 
         */
        public Builder groupId(Integer groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param groupIdVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder groupIdVariable(@Nullable Output<String> groupIdVariable) {
            $.groupIdVariable = groupIdVariable;
            return this;
        }

        /**
         * @param groupIdVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder groupIdVariable(String groupIdVariable) {
            return groupIdVariable(Output.of(groupIdVariable));
        }

        /**
         * @param prefixList Track Prefix List
         * 
         * @return builder
         * 
         */
        public Builder prefixList(@Nullable Output<String> prefixList) {
            $.prefixList = prefixList;
            return this;
        }

        /**
         * @param prefixList Track Prefix List
         * 
         * @return builder
         * 
         */
        public Builder prefixList(String prefixList) {
            return prefixList(Output.of(prefixList));
        }

        /**
         * @param prefixListVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder prefixListVariable(@Nullable Output<String> prefixListVariable) {
            $.prefixListVariable = prefixListVariable;
            return this;
        }

        /**
         * @param prefixListVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder prefixListVariable(String prefixListVariable) {
            return prefixListVariable(Output.of(prefixListVariable));
        }

        /**
         * @param priority Set priority
         *   - Range: `1`-`254`
         *   - Default value: `100`
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Set priority
         *   - Range: `1`-`254`
         *   - Default value: `100`
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param priorityVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder priorityVariable(@Nullable Output<String> priorityVariable) {
            $.priorityVariable = priorityVariable;
            return this;
        }

        /**
         * @param priorityVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder priorityVariable(String priorityVariable) {
            return priorityVariable(Output.of(priorityVariable));
        }

        /**
         * @param secondaryAddresses VRRP Secondary IPV4 address
         * 
         * @return builder
         * 
         */
        public Builder secondaryAddresses(@Nullable Output<List<ServiceLanVpnInterfaceSviFeatureIpv4VrrpSecondaryAddressArgs>> secondaryAddresses) {
            $.secondaryAddresses = secondaryAddresses;
            return this;
        }

        /**
         * @param secondaryAddresses VRRP Secondary IPV4 address
         * 
         * @return builder
         * 
         */
        public Builder secondaryAddresses(List<ServiceLanVpnInterfaceSviFeatureIpv4VrrpSecondaryAddressArgs> secondaryAddresses) {
            return secondaryAddresses(Output.of(secondaryAddresses));
        }

        /**
         * @param secondaryAddresses VRRP Secondary IPV4 address
         * 
         * @return builder
         * 
         */
        public Builder secondaryAddresses(ServiceLanVpnInterfaceSviFeatureIpv4VrrpSecondaryAddressArgs... secondaryAddresses) {
            return secondaryAddresses(List.of(secondaryAddresses));
        }

        /**
         * @param timer Timer interval for successive advertisements, in milliseconds
         *   - Range: `100`-`40950`
         *   - Default value: `1000`
         * 
         * @return builder
         * 
         */
        public Builder timer(@Nullable Output<Integer> timer) {
            $.timer = timer;
            return this;
        }

        /**
         * @param timer Timer interval for successive advertisements, in milliseconds
         *   - Range: `100`-`40950`
         *   - Default value: `1000`
         * 
         * @return builder
         * 
         */
        public Builder timer(Integer timer) {
            return timer(Output.of(timer));
        }

        /**
         * @param timerVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder timerVariable(@Nullable Output<String> timerVariable) {
            $.timerVariable = timerVariable;
            return this;
        }

        /**
         * @param timerVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder timerVariable(String timerVariable) {
            return timerVariable(Output.of(timerVariable));
        }

        /**
         * @param tlocPrefixChange change TLOC preference
         *   - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder tlocPrefixChange(@Nullable Output<Boolean> tlocPrefixChange) {
            $.tlocPrefixChange = tlocPrefixChange;
            return this;
        }

        /**
         * @param tlocPrefixChange change TLOC preference
         *   - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder tlocPrefixChange(Boolean tlocPrefixChange) {
            return tlocPrefixChange(Output.of(tlocPrefixChange));
        }

        /**
         * @param tlocPrefixChangeValue Set tloc preference change value
         *   - Range: `1`-`4294967295`
         * 
         * @return builder
         * 
         */
        public Builder tlocPrefixChangeValue(@Nullable Output<Integer> tlocPrefixChangeValue) {
            $.tlocPrefixChangeValue = tlocPrefixChangeValue;
            return this;
        }

        /**
         * @param tlocPrefixChangeValue Set tloc preference change value
         *   - Range: `1`-`4294967295`
         * 
         * @return builder
         * 
         */
        public Builder tlocPrefixChangeValue(Integer tlocPrefixChangeValue) {
            return tlocPrefixChangeValue(Output.of(tlocPrefixChangeValue));
        }

        /**
         * @param tlocPrefixChangeValueVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder tlocPrefixChangeValueVariable(@Nullable Output<String> tlocPrefixChangeValueVariable) {
            $.tlocPrefixChangeValueVariable = tlocPrefixChangeValueVariable;
            return this;
        }

        /**
         * @param tlocPrefixChangeValueVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder tlocPrefixChangeValueVariable(String tlocPrefixChangeValueVariable) {
            return tlocPrefixChangeValueVariable(Output.of(tlocPrefixChangeValueVariable));
        }

        /**
         * @param trackOmp Track OMP status
         *   - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder trackOmp(@Nullable Output<Boolean> trackOmp) {
            $.trackOmp = trackOmp;
            return this;
        }

        /**
         * @param trackOmp Track OMP status
         *   - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder trackOmp(Boolean trackOmp) {
            return trackOmp(Output.of(trackOmp));
        }

        /**
         * @param trackOmpVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder trackOmpVariable(@Nullable Output<String> trackOmpVariable) {
            $.trackOmpVariable = trackOmpVariable;
            return this;
        }

        /**
         * @param trackOmpVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder trackOmpVariable(String trackOmpVariable) {
            return trackOmpVariable(Output.of(trackOmpVariable));
        }

        public ServiceLanVpnInterfaceSviFeatureIpv4VrrpArgs build() {
            return $;
        }
    }

}