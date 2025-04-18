// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceLanVpnInterfaceEthernetFeatureIpv4VrrpTrackingObjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLanVpnInterfaceEthernetFeatureIpv4VrrpTrackingObjectArgs Empty = new ServiceLanVpnInterfaceEthernetFeatureIpv4VrrpTrackingObjectArgs();

    /**
     * Decrement Value for VRRP priority
     *   - Range: `1`-`255`
     * 
     */
    @Import(name="decrementValue")
    private @Nullable Output<Integer> decrementValue;

    /**
     * @return Decrement Value for VRRP priority
     *   - Range: `1`-`255`
     * 
     */
    public Optional<Output<Integer>> decrementValue() {
        return Optional.ofNullable(this.decrementValue);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="decrementValueVariable")
    private @Nullable Output<String> decrementValueVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> decrementValueVariable() {
        return Optional.ofNullable(this.decrementValueVariable);
    }

    /**
     * Track Action
     *   - Choices: `Decrement`, `Shutdown`
     * 
     */
    @Import(name="trackerAction")
    private @Nullable Output<String> trackerAction;

    /**
     * @return Track Action
     *   - Choices: `Decrement`, `Shutdown`
     * 
     */
    public Optional<Output<String>> trackerAction() {
        return Optional.ofNullable(this.trackerAction);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="trackerActionVariable")
    private @Nullable Output<String> trackerActionVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> trackerActionVariable() {
        return Optional.ofNullable(this.trackerActionVariable);
    }

    @Import(name="trackerId")
    private @Nullable Output<String> trackerId;

    public Optional<Output<String>> trackerId() {
        return Optional.ofNullable(this.trackerId);
    }

    private ServiceLanVpnInterfaceEthernetFeatureIpv4VrrpTrackingObjectArgs() {}

    private ServiceLanVpnInterfaceEthernetFeatureIpv4VrrpTrackingObjectArgs(ServiceLanVpnInterfaceEthernetFeatureIpv4VrrpTrackingObjectArgs $) {
        this.decrementValue = $.decrementValue;
        this.decrementValueVariable = $.decrementValueVariable;
        this.trackerAction = $.trackerAction;
        this.trackerActionVariable = $.trackerActionVariable;
        this.trackerId = $.trackerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLanVpnInterfaceEthernetFeatureIpv4VrrpTrackingObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLanVpnInterfaceEthernetFeatureIpv4VrrpTrackingObjectArgs $;

        public Builder() {
            $ = new ServiceLanVpnInterfaceEthernetFeatureIpv4VrrpTrackingObjectArgs();
        }

        public Builder(ServiceLanVpnInterfaceEthernetFeatureIpv4VrrpTrackingObjectArgs defaults) {
            $ = new ServiceLanVpnInterfaceEthernetFeatureIpv4VrrpTrackingObjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param decrementValue Decrement Value for VRRP priority
         *   - Range: `1`-`255`
         * 
         * @return builder
         * 
         */
        public Builder decrementValue(@Nullable Output<Integer> decrementValue) {
            $.decrementValue = decrementValue;
            return this;
        }

        /**
         * @param decrementValue Decrement Value for VRRP priority
         *   - Range: `1`-`255`
         * 
         * @return builder
         * 
         */
        public Builder decrementValue(Integer decrementValue) {
            return decrementValue(Output.of(decrementValue));
        }

        /**
         * @param decrementValueVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder decrementValueVariable(@Nullable Output<String> decrementValueVariable) {
            $.decrementValueVariable = decrementValueVariable;
            return this;
        }

        /**
         * @param decrementValueVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder decrementValueVariable(String decrementValueVariable) {
            return decrementValueVariable(Output.of(decrementValueVariable));
        }

        /**
         * @param trackerAction Track Action
         *   - Choices: `Decrement`, `Shutdown`
         * 
         * @return builder
         * 
         */
        public Builder trackerAction(@Nullable Output<String> trackerAction) {
            $.trackerAction = trackerAction;
            return this;
        }

        /**
         * @param trackerAction Track Action
         *   - Choices: `Decrement`, `Shutdown`
         * 
         * @return builder
         * 
         */
        public Builder trackerAction(String trackerAction) {
            return trackerAction(Output.of(trackerAction));
        }

        /**
         * @param trackerActionVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder trackerActionVariable(@Nullable Output<String> trackerActionVariable) {
            $.trackerActionVariable = trackerActionVariable;
            return this;
        }

        /**
         * @param trackerActionVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder trackerActionVariable(String trackerActionVariable) {
            return trackerActionVariable(Output.of(trackerActionVariable));
        }

        public Builder trackerId(@Nullable Output<String> trackerId) {
            $.trackerId = trackerId;
            return this;
        }

        public Builder trackerId(String trackerId) {
            return trackerId(Output.of(trackerId));
        }

        public ServiceLanVpnInterfaceEthernetFeatureIpv4VrrpTrackingObjectArgs build() {
            return $;
        }
    }

}
