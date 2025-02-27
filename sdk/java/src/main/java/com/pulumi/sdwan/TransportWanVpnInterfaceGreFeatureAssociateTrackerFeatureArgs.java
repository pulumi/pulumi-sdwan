// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class TransportWanVpnInterfaceGreFeatureAssociateTrackerFeatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransportWanVpnInterfaceGreFeatureAssociateTrackerFeatureArgs Empty = new TransportWanVpnInterfaceGreFeatureAssociateTrackerFeatureArgs();

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
     * Transport Tracker Feature ID
     * 
     */
    @Import(name="transportTrackerFeatureId", required=true)
    private Output<String> transportTrackerFeatureId;

    /**
     * @return Transport Tracker Feature ID
     * 
     */
    public Output<String> transportTrackerFeatureId() {
        return this.transportTrackerFeatureId;
    }

    /**
     * Transport WAN VPN Feature ID
     * 
     */
    @Import(name="transportWanVpnFeatureId", required=true)
    private Output<String> transportWanVpnFeatureId;

    /**
     * @return Transport WAN VPN Feature ID
     * 
     */
    public Output<String> transportWanVpnFeatureId() {
        return this.transportWanVpnFeatureId;
    }

    /**
     * Transport WAN VPN Interface GRE Feature ID
     * 
     */
    @Import(name="transportWanVpnInterfaceGreFeatureId", required=true)
    private Output<String> transportWanVpnInterfaceGreFeatureId;

    /**
     * @return Transport WAN VPN Interface GRE Feature ID
     * 
     */
    public Output<String> transportWanVpnInterfaceGreFeatureId() {
        return this.transportWanVpnInterfaceGreFeatureId;
    }

    private TransportWanVpnInterfaceGreFeatureAssociateTrackerFeatureArgs() {}

    private TransportWanVpnInterfaceGreFeatureAssociateTrackerFeatureArgs(TransportWanVpnInterfaceGreFeatureAssociateTrackerFeatureArgs $) {
        this.featureProfileId = $.featureProfileId;
        this.transportTrackerFeatureId = $.transportTrackerFeatureId;
        this.transportWanVpnFeatureId = $.transportWanVpnFeatureId;
        this.transportWanVpnInterfaceGreFeatureId = $.transportWanVpnInterfaceGreFeatureId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransportWanVpnInterfaceGreFeatureAssociateTrackerFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransportWanVpnInterfaceGreFeatureAssociateTrackerFeatureArgs $;

        public Builder() {
            $ = new TransportWanVpnInterfaceGreFeatureAssociateTrackerFeatureArgs();
        }

        public Builder(TransportWanVpnInterfaceGreFeatureAssociateTrackerFeatureArgs defaults) {
            $ = new TransportWanVpnInterfaceGreFeatureAssociateTrackerFeatureArgs(Objects.requireNonNull(defaults));
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
         * @param transportTrackerFeatureId Transport Tracker Feature ID
         * 
         * @return builder
         * 
         */
        public Builder transportTrackerFeatureId(Output<String> transportTrackerFeatureId) {
            $.transportTrackerFeatureId = transportTrackerFeatureId;
            return this;
        }

        /**
         * @param transportTrackerFeatureId Transport Tracker Feature ID
         * 
         * @return builder
         * 
         */
        public Builder transportTrackerFeatureId(String transportTrackerFeatureId) {
            return transportTrackerFeatureId(Output.of(transportTrackerFeatureId));
        }

        /**
         * @param transportWanVpnFeatureId Transport WAN VPN Feature ID
         * 
         * @return builder
         * 
         */
        public Builder transportWanVpnFeatureId(Output<String> transportWanVpnFeatureId) {
            $.transportWanVpnFeatureId = transportWanVpnFeatureId;
            return this;
        }

        /**
         * @param transportWanVpnFeatureId Transport WAN VPN Feature ID
         * 
         * @return builder
         * 
         */
        public Builder transportWanVpnFeatureId(String transportWanVpnFeatureId) {
            return transportWanVpnFeatureId(Output.of(transportWanVpnFeatureId));
        }

        /**
         * @param transportWanVpnInterfaceGreFeatureId Transport WAN VPN Interface GRE Feature ID
         * 
         * @return builder
         * 
         */
        public Builder transportWanVpnInterfaceGreFeatureId(Output<String> transportWanVpnInterfaceGreFeatureId) {
            $.transportWanVpnInterfaceGreFeatureId = transportWanVpnInterfaceGreFeatureId;
            return this;
        }

        /**
         * @param transportWanVpnInterfaceGreFeatureId Transport WAN VPN Interface GRE Feature ID
         * 
         * @return builder
         * 
         */
        public Builder transportWanVpnInterfaceGreFeatureId(String transportWanVpnInterfaceGreFeatureId) {
            return transportWanVpnInterfaceGreFeatureId(Output.of(transportWanVpnInterfaceGreFeatureId));
        }

        public TransportWanVpnInterfaceGreFeatureAssociateTrackerFeatureArgs build() {
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("TransportWanVpnInterfaceGreFeatureAssociateTrackerFeatureArgs", "featureProfileId");
            }
            if ($.transportTrackerFeatureId == null) {
                throw new MissingRequiredPropertyException("TransportWanVpnInterfaceGreFeatureAssociateTrackerFeatureArgs", "transportTrackerFeatureId");
            }
            if ($.transportWanVpnFeatureId == null) {
                throw new MissingRequiredPropertyException("TransportWanVpnInterfaceGreFeatureAssociateTrackerFeatureArgs", "transportWanVpnFeatureId");
            }
            if ($.transportWanVpnInterfaceGreFeatureId == null) {
                throw new MissingRequiredPropertyException("TransportWanVpnInterfaceGreFeatureAssociateTrackerFeatureArgs", "transportWanVpnInterfaceGreFeatureId");
            }
            return $;
        }
    }

}
