// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureArgs Empty = new TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureArgs();

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
     * Transport Routing OSPFv4 IPv6 Feature ID
     * 
     */
    @Import(name="transportRoutingOspfv3Ipv6FeatureId", required=true)
    private Output<String> transportRoutingOspfv3Ipv6FeatureId;

    /**
     * @return Transport Routing OSPFv4 IPv6 Feature ID
     * 
     */
    public Output<String> transportRoutingOspfv3Ipv6FeatureId() {
        return this.transportRoutingOspfv3Ipv6FeatureId;
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

    private TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureArgs() {}

    private TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureArgs(TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureArgs $) {
        this.featureProfileId = $.featureProfileId;
        this.transportRoutingOspfv3Ipv6FeatureId = $.transportRoutingOspfv3Ipv6FeatureId;
        this.transportWanVpnFeatureId = $.transportWanVpnFeatureId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureArgs $;

        public Builder() {
            $ = new TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureArgs();
        }

        public Builder(TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureArgs defaults) {
            $ = new TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureArgs(Objects.requireNonNull(defaults));
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
         * @param transportRoutingOspfv3Ipv6FeatureId Transport Routing OSPFv4 IPv6 Feature ID
         * 
         * @return builder
         * 
         */
        public Builder transportRoutingOspfv3Ipv6FeatureId(Output<String> transportRoutingOspfv3Ipv6FeatureId) {
            $.transportRoutingOspfv3Ipv6FeatureId = transportRoutingOspfv3Ipv6FeatureId;
            return this;
        }

        /**
         * @param transportRoutingOspfv3Ipv6FeatureId Transport Routing OSPFv4 IPv6 Feature ID
         * 
         * @return builder
         * 
         */
        public Builder transportRoutingOspfv3Ipv6FeatureId(String transportRoutingOspfv3Ipv6FeatureId) {
            return transportRoutingOspfv3Ipv6FeatureId(Output.of(transportRoutingOspfv3Ipv6FeatureId));
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

        public TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureArgs build() {
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureArgs", "featureProfileId");
            }
            if ($.transportRoutingOspfv3Ipv6FeatureId == null) {
                throw new MissingRequiredPropertyException("TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureArgs", "transportRoutingOspfv3Ipv6FeatureId");
            }
            if ($.transportWanVpnFeatureId == null) {
                throw new MissingRequiredPropertyException("TransportWanVpnFeatureAssociateRoutingOspfv3Ipv6FeatureArgs", "transportWanVpnFeatureId");
            }
            return $;
        }
    }

}
