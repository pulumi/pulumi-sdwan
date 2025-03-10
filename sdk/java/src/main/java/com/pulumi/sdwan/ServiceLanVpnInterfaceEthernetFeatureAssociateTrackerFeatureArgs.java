// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerFeatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerFeatureArgs Empty = new ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerFeatureArgs();

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
     * Service LAN VPN Interface Ethernet Feature ID
     * 
     */
    @Import(name="serviceLanVpnInterfaceEthernetFeatureId", required=true)
    private Output<String> serviceLanVpnInterfaceEthernetFeatureId;

    /**
     * @return Service LAN VPN Interface Ethernet Feature ID
     * 
     */
    public Output<String> serviceLanVpnInterfaceEthernetFeatureId() {
        return this.serviceLanVpnInterfaceEthernetFeatureId;
    }

    /**
     * Service Tracker Feature ID
     * 
     */
    @Import(name="serviceTrackerFeatureId", required=true)
    private Output<String> serviceTrackerFeatureId;

    /**
     * @return Service Tracker Feature ID
     * 
     */
    public Output<String> serviceTrackerFeatureId() {
        return this.serviceTrackerFeatureId;
    }

    private ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerFeatureArgs() {}

    private ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerFeatureArgs(ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerFeatureArgs $) {
        this.featureProfileId = $.featureProfileId;
        this.serviceLanVpnFeatureId = $.serviceLanVpnFeatureId;
        this.serviceLanVpnInterfaceEthernetFeatureId = $.serviceLanVpnInterfaceEthernetFeatureId;
        this.serviceTrackerFeatureId = $.serviceTrackerFeatureId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerFeatureArgs $;

        public Builder() {
            $ = new ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerFeatureArgs();
        }

        public Builder(ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerFeatureArgs defaults) {
            $ = new ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerFeatureArgs(Objects.requireNonNull(defaults));
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
         * @param serviceLanVpnInterfaceEthernetFeatureId Service LAN VPN Interface Ethernet Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceLanVpnInterfaceEthernetFeatureId(Output<String> serviceLanVpnInterfaceEthernetFeatureId) {
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
         * @param serviceTrackerFeatureId Service Tracker Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceTrackerFeatureId(Output<String> serviceTrackerFeatureId) {
            $.serviceTrackerFeatureId = serviceTrackerFeatureId;
            return this;
        }

        /**
         * @param serviceTrackerFeatureId Service Tracker Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceTrackerFeatureId(String serviceTrackerFeatureId) {
            return serviceTrackerFeatureId(Output.of(serviceTrackerFeatureId));
        }

        public ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerFeatureArgs build() {
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerFeatureArgs", "featureProfileId");
            }
            if ($.serviceLanVpnFeatureId == null) {
                throw new MissingRequiredPropertyException("ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerFeatureArgs", "serviceLanVpnFeatureId");
            }
            if ($.serviceLanVpnInterfaceEthernetFeatureId == null) {
                throw new MissingRequiredPropertyException("ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerFeatureArgs", "serviceLanVpnInterfaceEthernetFeatureId");
            }
            if ($.serviceTrackerFeatureId == null) {
                throw new MissingRequiredPropertyException("ServiceLanVpnInterfaceEthernetFeatureAssociateTrackerFeatureArgs", "serviceTrackerFeatureId");
            }
            return $;
        }
    }

}
