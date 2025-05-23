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


public final class ServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureState Empty = new ServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureState();

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
     * Service Routing OSPFv3 IPv4 Feature ID
     * 
     */
    @Import(name="serviceRoutingOspfv3Ipv4FeatureId")
    private @Nullable Output<String> serviceRoutingOspfv3Ipv4FeatureId;

    /**
     * @return Service Routing OSPFv3 IPv4 Feature ID
     * 
     */
    public Optional<Output<String>> serviceRoutingOspfv3Ipv4FeatureId() {
        return Optional.ofNullable(this.serviceRoutingOspfv3Ipv4FeatureId);
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

    private ServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureState() {}

    private ServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureState(ServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureState $) {
        this.featureProfileId = $.featureProfileId;
        this.serviceLanVpnFeatureId = $.serviceLanVpnFeatureId;
        this.serviceRoutingOspfv3Ipv4FeatureId = $.serviceRoutingOspfv3Ipv4FeatureId;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureState $;

        public Builder() {
            $ = new ServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureState();
        }

        public Builder(ServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureState defaults) {
            $ = new ServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureState(Objects.requireNonNull(defaults));
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
         * @param serviceRoutingOspfv3Ipv4FeatureId Service Routing OSPFv3 IPv4 Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceRoutingOspfv3Ipv4FeatureId(@Nullable Output<String> serviceRoutingOspfv3Ipv4FeatureId) {
            $.serviceRoutingOspfv3Ipv4FeatureId = serviceRoutingOspfv3Ipv4FeatureId;
            return this;
        }

        /**
         * @param serviceRoutingOspfv3Ipv4FeatureId Service Routing OSPFv3 IPv4 Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceRoutingOspfv3Ipv4FeatureId(String serviceRoutingOspfv3Ipv4FeatureId) {
            return serviceRoutingOspfv3Ipv4FeatureId(Output.of(serviceRoutingOspfv3Ipv4FeatureId));
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

        public ServiceLanVpnFeatureAssociateRoutingOspfv3Ipv4FeatureState build() {
            return $;
        }
    }

}
