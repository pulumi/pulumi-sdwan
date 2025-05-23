// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetTransportWanVpnInterfaceIpsecFeatureArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransportWanVpnInterfaceIpsecFeatureArgs Empty = new GetTransportWanVpnInterfaceIpsecFeatureArgs();

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
     * The id of the Feature
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The id of the Feature
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

    private GetTransportWanVpnInterfaceIpsecFeatureArgs() {}

    private GetTransportWanVpnInterfaceIpsecFeatureArgs(GetTransportWanVpnInterfaceIpsecFeatureArgs $) {
        this.featureProfileId = $.featureProfileId;
        this.id = $.id;
        this.transportWanVpnFeatureId = $.transportWanVpnFeatureId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransportWanVpnInterfaceIpsecFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransportWanVpnInterfaceIpsecFeatureArgs $;

        public Builder() {
            $ = new GetTransportWanVpnInterfaceIpsecFeatureArgs();
        }

        public Builder(GetTransportWanVpnInterfaceIpsecFeatureArgs defaults) {
            $ = new GetTransportWanVpnInterfaceIpsecFeatureArgs(Objects.requireNonNull(defaults));
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
         * @param id The id of the Feature
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The id of the Feature
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

        public GetTransportWanVpnInterfaceIpsecFeatureArgs build() {
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceIpsecFeatureArgs", "featureProfileId");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceIpsecFeatureArgs", "id");
            }
            if ($.transportWanVpnFeatureId == null) {
                throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceIpsecFeatureArgs", "transportWanVpnFeatureId");
            }
            return $;
        }
    }

}
