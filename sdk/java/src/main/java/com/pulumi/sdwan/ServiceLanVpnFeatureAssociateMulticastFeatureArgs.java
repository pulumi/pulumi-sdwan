// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ServiceLanVpnFeatureAssociateMulticastFeatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLanVpnFeatureAssociateMulticastFeatureArgs Empty = new ServiceLanVpnFeatureAssociateMulticastFeatureArgs();

    /**
     * Feature Profile ID
     * 
     */
    @Import(name="featureProfileId", required=true)
    private Output<String> featureProfileId;

    /**
     * @return Feature Profile ID
     * 
     */
    public Output<String> featureProfileId() {
        return this.featureProfileId;
    }

    /**
     * Service LAN VPN Feature ID
     * 
     */
    @Import(name="serviceLanVpnFeatureId", required=true)
    private Output<String> serviceLanVpnFeatureId;

    /**
     * @return Service LAN VPN Feature ID
     * 
     */
    public Output<String> serviceLanVpnFeatureId() {
        return this.serviceLanVpnFeatureId;
    }

    /**
     * Service Multicast Feature ID
     * 
     */
    @Import(name="serviceMulticastFeatureId", required=true)
    private Output<String> serviceMulticastFeatureId;

    /**
     * @return Service Multicast Feature ID
     * 
     */
    public Output<String> serviceMulticastFeatureId() {
        return this.serviceMulticastFeatureId;
    }

    private ServiceLanVpnFeatureAssociateMulticastFeatureArgs() {}

    private ServiceLanVpnFeatureAssociateMulticastFeatureArgs(ServiceLanVpnFeatureAssociateMulticastFeatureArgs $) {
        this.featureProfileId = $.featureProfileId;
        this.serviceLanVpnFeatureId = $.serviceLanVpnFeatureId;
        this.serviceMulticastFeatureId = $.serviceMulticastFeatureId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLanVpnFeatureAssociateMulticastFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLanVpnFeatureAssociateMulticastFeatureArgs $;

        public Builder() {
            $ = new ServiceLanVpnFeatureAssociateMulticastFeatureArgs();
        }

        public Builder(ServiceLanVpnFeatureAssociateMulticastFeatureArgs defaults) {
            $ = new ServiceLanVpnFeatureAssociateMulticastFeatureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param featureProfileId Feature Profile ID
         * 
         * @return builder
         * 
         */
        public Builder featureProfileId(Output<String> featureProfileId) {
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
        public Builder serviceLanVpnFeatureId(Output<String> serviceLanVpnFeatureId) {
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
         * @param serviceMulticastFeatureId Service Multicast Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceMulticastFeatureId(Output<String> serviceMulticastFeatureId) {
            $.serviceMulticastFeatureId = serviceMulticastFeatureId;
            return this;
        }

        /**
         * @param serviceMulticastFeatureId Service Multicast Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceMulticastFeatureId(String serviceMulticastFeatureId) {
            return serviceMulticastFeatureId(Output.of(serviceMulticastFeatureId));
        }

        public ServiceLanVpnFeatureAssociateMulticastFeatureArgs build() {
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("ServiceLanVpnFeatureAssociateMulticastFeatureArgs", "featureProfileId");
            }
            if ($.serviceLanVpnFeatureId == null) {
                throw new MissingRequiredPropertyException("ServiceLanVpnFeatureAssociateMulticastFeatureArgs", "serviceLanVpnFeatureId");
            }
            if ($.serviceMulticastFeatureId == null) {
                throw new MissingRequiredPropertyException("ServiceLanVpnFeatureAssociateMulticastFeatureArgs", "serviceMulticastFeatureId");
            }
            return $;
        }
    }

}
