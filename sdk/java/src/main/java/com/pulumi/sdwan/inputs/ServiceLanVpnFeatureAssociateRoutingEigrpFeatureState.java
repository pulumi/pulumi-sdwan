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


public final class ServiceLanVpnFeatureAssociateRoutingEigrpFeatureState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLanVpnFeatureAssociateRoutingEigrpFeatureState Empty = new ServiceLanVpnFeatureAssociateRoutingEigrpFeatureState();

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
     * Service Routing EIGRP Feature ID
     * 
     */
    @Import(name="serviceRoutingEigrpFeatureId")
    private @Nullable Output<String> serviceRoutingEigrpFeatureId;

    /**
     * @return Service Routing EIGRP Feature ID
     * 
     */
    public Optional<Output<String>> serviceRoutingEigrpFeatureId() {
        return Optional.ofNullable(this.serviceRoutingEigrpFeatureId);
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

    private ServiceLanVpnFeatureAssociateRoutingEigrpFeatureState() {}

    private ServiceLanVpnFeatureAssociateRoutingEigrpFeatureState(ServiceLanVpnFeatureAssociateRoutingEigrpFeatureState $) {
        this.featureProfileId = $.featureProfileId;
        this.serviceLanVpnFeatureId = $.serviceLanVpnFeatureId;
        this.serviceRoutingEigrpFeatureId = $.serviceRoutingEigrpFeatureId;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLanVpnFeatureAssociateRoutingEigrpFeatureState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLanVpnFeatureAssociateRoutingEigrpFeatureState $;

        public Builder() {
            $ = new ServiceLanVpnFeatureAssociateRoutingEigrpFeatureState();
        }

        public Builder(ServiceLanVpnFeatureAssociateRoutingEigrpFeatureState defaults) {
            $ = new ServiceLanVpnFeatureAssociateRoutingEigrpFeatureState(Objects.requireNonNull(defaults));
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
         * @param serviceRoutingEigrpFeatureId Service Routing EIGRP Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceRoutingEigrpFeatureId(@Nullable Output<String> serviceRoutingEigrpFeatureId) {
            $.serviceRoutingEigrpFeatureId = serviceRoutingEigrpFeatureId;
            return this;
        }

        /**
         * @param serviceRoutingEigrpFeatureId Service Routing EIGRP Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceRoutingEigrpFeatureId(String serviceRoutingEigrpFeatureId) {
            return serviceRoutingEigrpFeatureId(Output.of(serviceRoutingEigrpFeatureId));
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

        public ServiceLanVpnFeatureAssociateRoutingEigrpFeatureState build() {
            return $;
        }
    }

}
