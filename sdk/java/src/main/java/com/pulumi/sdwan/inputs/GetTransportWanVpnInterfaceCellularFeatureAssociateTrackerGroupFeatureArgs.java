// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs Empty = new GetTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs();

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

    private GetTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs() {}

    private GetTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs(GetTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs $) {
        this.featureProfileId = $.featureProfileId;
        this.id = $.id;
        this.transportWanVpnFeatureId = $.transportWanVpnFeatureId;
        this.transportWanVpnInterfaceCellularFeatureId = $.transportWanVpnInterfaceCellularFeatureId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs $;

        public Builder() {
            $ = new GetTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs();
        }

        public Builder(GetTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs defaults) {
            $ = new GetTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs(Objects.requireNonNull(defaults));
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

        public GetTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs build() {
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs", "featureProfileId");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs", "id");
            }
            if ($.transportWanVpnFeatureId == null) {
                throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs", "transportWanVpnFeatureId");
            }
            if ($.transportWanVpnInterfaceCellularFeatureId == null) {
                throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceCellularFeatureAssociateTrackerGroupFeatureArgs", "transportWanVpnInterfaceCellularFeatureId");
            }
            return $;
        }
    }

}
