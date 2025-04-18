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


public final class ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureState Empty = new ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureState();

    /**
     * Feature Profile ID
     * 
     */
    @Import(name="featureProfileId")
    private @Nullable Output<String> featureProfileId;

    /**
     * @return Feature Profile ID
     * 
     */
    public Optional<Output<String>> featureProfileId() {
        return Optional.ofNullable(this.featureProfileId);
    }

    /**
     * Service LAN VPN Feature ID
     * 
     */
    @Import(name="serviceLanVpnFeatureId")
    private @Nullable Output<String> serviceLanVpnFeatureId;

    /**
     * @return Service LAN VPN Feature ID
     * 
     */
    public Optional<Output<String>> serviceLanVpnFeatureId() {
        return Optional.ofNullable(this.serviceLanVpnFeatureId);
    }

    /**
     * Service LAN VPN Interface Ethernet Feature ID
     * 
     */
    @Import(name="serviceLanVpnInterfaceEthernetFeatureId")
    private @Nullable Output<String> serviceLanVpnInterfaceEthernetFeatureId;

    /**
     * @return Service LAN VPN Interface Ethernet Feature ID
     * 
     */
    public Optional<Output<String>> serviceLanVpnInterfaceEthernetFeatureId() {
        return Optional.ofNullable(this.serviceLanVpnInterfaceEthernetFeatureId);
    }

    /**
     * Service Tracker Group Feature ID
     * 
     */
    @Import(name="serviceTrackerGroupFeatureId")
    private @Nullable Output<String> serviceTrackerGroupFeatureId;

    /**
     * @return Service Tracker Group Feature ID
     * 
     */
    public Optional<Output<String>> serviceTrackerGroupFeatureId() {
        return Optional.ofNullable(this.serviceTrackerGroupFeatureId);
    }

    /**
     * The version of the object
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return The version of the object
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureState() {}

    private ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureState(ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureState $) {
        this.featureProfileId = $.featureProfileId;
        this.serviceLanVpnFeatureId = $.serviceLanVpnFeatureId;
        this.serviceLanVpnInterfaceEthernetFeatureId = $.serviceLanVpnInterfaceEthernetFeatureId;
        this.serviceTrackerGroupFeatureId = $.serviceTrackerGroupFeatureId;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureState $;

        public Builder() {
            $ = new ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureState();
        }

        public Builder(ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureState defaults) {
            $ = new ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureState(Objects.requireNonNull(defaults));
        }

        /**
         * @param featureProfileId Feature Profile ID
         * 
         * @return builder
         * 
         */
        public Builder featureProfileId(@Nullable Output<String> featureProfileId) {
            $.featureProfileId = featureProfileId;
            return this;
        }

        /**
         * @param featureProfileId Feature Profile ID
         * 
         * @return builder
         * 
         */
        public Builder featureProfileId(String featureProfileId) {
            return featureProfileId(Output.of(featureProfileId));
        }

        /**
         * @param serviceLanVpnFeatureId Service LAN VPN Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceLanVpnFeatureId(@Nullable Output<String> serviceLanVpnFeatureId) {
            $.serviceLanVpnFeatureId = serviceLanVpnFeatureId;
            return this;
        }

        /**
         * @param serviceLanVpnFeatureId Service LAN VPN Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceLanVpnFeatureId(String serviceLanVpnFeatureId) {
            return serviceLanVpnFeatureId(Output.of(serviceLanVpnFeatureId));
        }

        /**
         * @param serviceLanVpnInterfaceEthernetFeatureId Service LAN VPN Interface Ethernet Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceLanVpnInterfaceEthernetFeatureId(@Nullable Output<String> serviceLanVpnInterfaceEthernetFeatureId) {
            $.serviceLanVpnInterfaceEthernetFeatureId = serviceLanVpnInterfaceEthernetFeatureId;
            return this;
        }

        /**
         * @param serviceLanVpnInterfaceEthernetFeatureId Service LAN VPN Interface Ethernet Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceLanVpnInterfaceEthernetFeatureId(String serviceLanVpnInterfaceEthernetFeatureId) {
            return serviceLanVpnInterfaceEthernetFeatureId(Output.of(serviceLanVpnInterfaceEthernetFeatureId));
        }

        /**
         * @param serviceTrackerGroupFeatureId Service Tracker Group Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceTrackerGroupFeatureId(@Nullable Output<String> serviceTrackerGroupFeatureId) {
            $.serviceTrackerGroupFeatureId = serviceTrackerGroupFeatureId;
            return this;
        }

        /**
         * @param serviceTrackerGroupFeatureId Service Tracker Group Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceTrackerGroupFeatureId(String serviceTrackerGroupFeatureId) {
            return serviceTrackerGroupFeatureId(Output.of(serviceTrackerGroupFeatureId));
        }

        /**
         * @param version The version of the object
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the object
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureState build() {
            return $;
        }
    }

}
