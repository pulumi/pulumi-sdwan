// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeaturePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeaturePlainArgs Empty = new GetServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeaturePlainArgs();

    /**
     * Feature Profile ID
     * 
     */
    @Import(name="featureProfileId", required=true)
    private String featureProfileId;

    /**
     * @return Feature Profile ID
     * 
     */
    public String featureProfileId() {
        return this.featureProfileId;
    }

    /**
     * The id of the object
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The id of the object
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * Service LAN VPN Feature ID
     * 
     */
    @Import(name="serviceLanVpnFeatureId", required=true)
    private String serviceLanVpnFeatureId;

    /**
     * @return Service LAN VPN Feature ID
     * 
     */
    public String serviceLanVpnFeatureId() {
        return this.serviceLanVpnFeatureId;
    }

    /**
     * Service LAN VPN Interface Ethernet Feature ID
     * 
     */
    @Import(name="serviceLanVpnInterfaceEthernetFeatureId", required=true)
    private String serviceLanVpnInterfaceEthernetFeatureId;

    /**
     * @return Service LAN VPN Interface Ethernet Feature ID
     * 
     */
    public String serviceLanVpnInterfaceEthernetFeatureId() {
        return this.serviceLanVpnInterfaceEthernetFeatureId;
    }

    private GetServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeaturePlainArgs() {}

    private GetServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeaturePlainArgs(GetServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeaturePlainArgs $) {
        this.featureProfileId = $.featureProfileId;
        this.id = $.id;
        this.serviceLanVpnFeatureId = $.serviceLanVpnFeatureId;
        this.serviceLanVpnInterfaceEthernetFeatureId = $.serviceLanVpnInterfaceEthernetFeatureId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeaturePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeaturePlainArgs $;

        public Builder() {
            $ = new GetServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeaturePlainArgs();
        }

        public Builder(GetServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeaturePlainArgs defaults) {
            $ = new GetServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeaturePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param featureProfileId Feature Profile ID
         * 
         * @return builder
         * 
         */
        public Builder featureProfileId(String featureProfileId) {
            $.featureProfileId = featureProfileId;
            return this;
        }

        /**
         * @param id The id of the object
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param serviceLanVpnFeatureId Service LAN VPN Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceLanVpnFeatureId(String serviceLanVpnFeatureId) {
            $.serviceLanVpnFeatureId = serviceLanVpnFeatureId;
            return this;
        }

        /**
         * @param serviceLanVpnInterfaceEthernetFeatureId Service LAN VPN Interface Ethernet Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceLanVpnInterfaceEthernetFeatureId(String serviceLanVpnInterfaceEthernetFeatureId) {
            $.serviceLanVpnInterfaceEthernetFeatureId = serviceLanVpnInterfaceEthernetFeatureId;
            return this;
        }

        public GetServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeaturePlainArgs build() {
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeaturePlainArgs", "featureProfileId");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeaturePlainArgs", "id");
            }
            if ($.serviceLanVpnFeatureId == null) {
                throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeaturePlainArgs", "serviceLanVpnFeatureId");
            }
            if ($.serviceLanVpnInterfaceEthernetFeatureId == null) {
                throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeaturePlainArgs", "serviceLanVpnInterfaceEthernetFeatureId");
            }
            return $;
        }
    }

}
