// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class TransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs Empty = new TransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs();

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
     * Transport WAN VPN Interface IPSEC Feature ID
     * 
     */
    @Import(name="transportWanVpnInterfaceIpsecFeatureId", required=true)
    private Output<String> transportWanVpnInterfaceIpsecFeatureId;

    /**
     * @return Transport WAN VPN Interface IPSEC Feature ID
     * 
     */
    public Output<String> transportWanVpnInterfaceIpsecFeatureId() {
        return this.transportWanVpnInterfaceIpsecFeatureId;
    }

    private TransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs() {}

    private TransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs(TransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs $) {
        this.featureProfileId = $.featureProfileId;
        this.transportTrackerFeatureId = $.transportTrackerFeatureId;
        this.transportWanVpnFeatureId = $.transportWanVpnFeatureId;
        this.transportWanVpnInterfaceIpsecFeatureId = $.transportWanVpnInterfaceIpsecFeatureId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs $;

        public Builder() {
            $ = new TransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs();
        }

        public Builder(TransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs defaults) {
            $ = new TransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs(Objects.requireNonNull(defaults));
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
         * @param transportWanVpnInterfaceIpsecFeatureId Transport WAN VPN Interface IPSEC Feature ID
         * 
         * @return builder
         * 
         */
        public Builder transportWanVpnInterfaceIpsecFeatureId(Output<String> transportWanVpnInterfaceIpsecFeatureId) {
            $.transportWanVpnInterfaceIpsecFeatureId = transportWanVpnInterfaceIpsecFeatureId;
            return this;
        }

        /**
         * @param transportWanVpnInterfaceIpsecFeatureId Transport WAN VPN Interface IPSEC Feature ID
         * 
         * @return builder
         * 
         */
        public Builder transportWanVpnInterfaceIpsecFeatureId(String transportWanVpnInterfaceIpsecFeatureId) {
            return transportWanVpnInterfaceIpsecFeatureId(Output.of(transportWanVpnInterfaceIpsecFeatureId));
        }

        public TransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs build() {
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("TransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs", "featureProfileId");
            }
            if ($.transportTrackerFeatureId == null) {
                throw new MissingRequiredPropertyException("TransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs", "transportTrackerFeatureId");
            }
            if ($.transportWanVpnFeatureId == null) {
                throw new MissingRequiredPropertyException("TransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs", "transportWanVpnFeatureId");
            }
            if ($.transportWanVpnInterfaceIpsecFeatureId == null) {
                throw new MissingRequiredPropertyException("TransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs", "transportWanVpnInterfaceIpsecFeatureId");
            }
            return $;
        }
    }

}
