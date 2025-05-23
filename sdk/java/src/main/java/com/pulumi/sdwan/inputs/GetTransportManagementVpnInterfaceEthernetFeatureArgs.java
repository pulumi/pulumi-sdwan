// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetTransportManagementVpnInterfaceEthernetFeatureArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransportManagementVpnInterfaceEthernetFeatureArgs Empty = new GetTransportManagementVpnInterfaceEthernetFeatureArgs();

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
     * Transport Management VPN Feature ID
     * 
     */
    @Import(name="transportManagementVpnFeatureId", required=true)
    private Output<String> transportManagementVpnFeatureId;

    /**
     * @return Transport Management VPN Feature ID
     * 
     */
    public Output<String> transportManagementVpnFeatureId() {
        return this.transportManagementVpnFeatureId;
    }

    private GetTransportManagementVpnInterfaceEthernetFeatureArgs() {}

    private GetTransportManagementVpnInterfaceEthernetFeatureArgs(GetTransportManagementVpnInterfaceEthernetFeatureArgs $) {
        this.featureProfileId = $.featureProfileId;
        this.id = $.id;
        this.transportManagementVpnFeatureId = $.transportManagementVpnFeatureId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransportManagementVpnInterfaceEthernetFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransportManagementVpnInterfaceEthernetFeatureArgs $;

        public Builder() {
            $ = new GetTransportManagementVpnInterfaceEthernetFeatureArgs();
        }

        public Builder(GetTransportManagementVpnInterfaceEthernetFeatureArgs defaults) {
            $ = new GetTransportManagementVpnInterfaceEthernetFeatureArgs(Objects.requireNonNull(defaults));
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
         * @param transportManagementVpnFeatureId Transport Management VPN Feature ID
         * 
         * @return builder
         * 
         */
        public Builder transportManagementVpnFeatureId(Output<String> transportManagementVpnFeatureId) {
            $.transportManagementVpnFeatureId = transportManagementVpnFeatureId;
            return this;
        }

        /**
         * @param transportManagementVpnFeatureId Transport Management VPN Feature ID
         * 
         * @return builder
         * 
         */
        public Builder transportManagementVpnFeatureId(String transportManagementVpnFeatureId) {
            return transportManagementVpnFeatureId(Output.of(transportManagementVpnFeatureId));
        }

        public GetTransportManagementVpnInterfaceEthernetFeatureArgs build() {
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("GetTransportManagementVpnInterfaceEthernetFeatureArgs", "featureProfileId");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetTransportManagementVpnInterfaceEthernetFeatureArgs", "id");
            }
            if ($.transportManagementVpnFeatureId == null) {
                throw new MissingRequiredPropertyException("GetTransportManagementVpnInterfaceEthernetFeatureArgs", "transportManagementVpnFeatureId");
            }
            return $;
        }
    }

}
