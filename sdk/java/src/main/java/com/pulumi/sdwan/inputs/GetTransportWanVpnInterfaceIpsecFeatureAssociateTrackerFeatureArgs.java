// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs Empty = new GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs();

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
     * The id of the object
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The id of the object
     * 
     */
    public Output<String> id() {
        return this.id;
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

    private GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs() {}

    private GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs(GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs $) {
        this.featureProfileId = $.featureProfileId;
        this.id = $.id;
        this.transportWanVpnFeatureId = $.transportWanVpnFeatureId;
        this.transportWanVpnInterfaceIpsecFeatureId = $.transportWanVpnInterfaceIpsecFeatureId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs $;

        public Builder() {
            $ = new GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs();
        }

        public Builder(GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs defaults) {
            $ = new GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs(Objects.requireNonNull(defaults));
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
         * @param id The id of the object
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The id of the object
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
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

        public GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs build() {
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs", "featureProfileId");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs", "id");
            }
            if ($.transportWanVpnFeatureId == null) {
                throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs", "transportWanVpnFeatureId");
            }
            if ($.transportWanVpnInterfaceIpsecFeatureId == null) {
                throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureArgs", "transportWanVpnInterfaceIpsecFeatureId");
            }
            return $;
        }
    }

}
