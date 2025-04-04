// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class TransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs Empty = new TransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs();

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
     * Transport Tracker Group Feature ID
     * 
     */
    @Import(name="transportTrackerGroupFeatureId", required=true)
    private Output<String> transportTrackerGroupFeatureId;

    /**
     * @return Transport Tracker Group Feature ID
     * 
     */
    public Output<String> transportTrackerGroupFeatureId() {
        return this.transportTrackerGroupFeatureId;
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
     * Transport WAN VPN Interface Cellular Feature ID
     * 
     */
    @Import(name="transportWanVpnInterfaceCellularFeatureId", required=true)
    private Output<String> transportWanVpnInterfaceCellularFeatureId;

    /**
     * @return Transport WAN VPN Interface Cellular Feature ID
     * 
     */
    public Output<String> transportWanVpnInterfaceCellularFeatureId() {
        return this.transportWanVpnInterfaceCellularFeatureId;
    }

    private TransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs() {}

    private TransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs(TransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs $) {
        this.featureProfileId = $.featureProfileId;
        this.transportTrackerGroupFeatureId = $.transportTrackerGroupFeatureId;
        this.transportWanVpnFeatureId = $.transportWanVpnFeatureId;
        this.transportWanVpnInterfaceCellularFeatureId = $.transportWanVpnInterfaceCellularFeatureId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs $;

        public Builder() {
            $ = new TransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs();
        }

        public Builder(TransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs defaults) {
            $ = new TransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs(Objects.requireNonNull(defaults));
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
         * @param transportTrackerGroupFeatureId Transport Tracker Group Feature ID
         * 
         * @return builder
         * 
         */
        public Builder transportTrackerGroupFeatureId(Output<String> transportTrackerGroupFeatureId) {
            $.transportTrackerGroupFeatureId = transportTrackerGroupFeatureId;
            return this;
        }

        /**
         * @param transportTrackerGroupFeatureId Transport Tracker Group Feature ID
         * 
         * @return builder
         * 
         */
        public Builder transportTrackerGroupFeatureId(String transportTrackerGroupFeatureId) {
            return transportTrackerGroupFeatureId(Output.of(transportTrackerGroupFeatureId));
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
         * @param transportWanVpnInterfaceCellularFeatureId Transport WAN VPN Interface Cellular Feature ID
         * 
         * @return builder
         * 
         */
        public Builder transportWanVpnInterfaceCellularFeatureId(Output<String> transportWanVpnInterfaceCellularFeatureId) {
            $.transportWanVpnInterfaceCellularFeatureId = transportWanVpnInterfaceCellularFeatureId;
            return this;
        }

        /**
         * @param transportWanVpnInterfaceCellularFeatureId Transport WAN VPN Interface Cellular Feature ID
         * 
         * @return builder
         * 
         */
        public Builder transportWanVpnInterfaceCellularFeatureId(String transportWanVpnInterfaceCellularFeatureId) {
            return transportWanVpnInterfaceCellularFeatureId(Output.of(transportWanVpnInterfaceCellularFeatureId));
        }

        public TransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs build() {
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("TransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs", "featureProfileId");
            }
            if ($.transportTrackerGroupFeatureId == null) {
                throw new MissingRequiredPropertyException("TransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs", "transportTrackerGroupFeatureId");
            }
            if ($.transportWanVpnFeatureId == null) {
                throw new MissingRequiredPropertyException("TransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs", "transportWanVpnFeatureId");
            }
            if ($.transportWanVpnInterfaceCellularFeatureId == null) {
                throw new MissingRequiredPropertyException("TransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs", "transportWanVpnInterfaceCellularFeatureId");
            }
            return $;
        }
    }

}
