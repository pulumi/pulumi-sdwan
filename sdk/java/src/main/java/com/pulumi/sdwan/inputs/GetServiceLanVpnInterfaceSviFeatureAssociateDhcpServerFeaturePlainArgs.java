// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeaturePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeaturePlainArgs Empty = new GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeaturePlainArgs();

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
     * Service LAN VPN Interface SVI Feature ID
     * 
     */
    @Import(name="serviceLanVpnInterfaceSviFeatureId", required=true)
    private String serviceLanVpnInterfaceSviFeatureId;

    /**
     * @return Service LAN VPN Interface SVI Feature ID
     * 
     */
    public String serviceLanVpnInterfaceSviFeatureId() {
        return this.serviceLanVpnInterfaceSviFeatureId;
    }

    private GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeaturePlainArgs() {}

    private GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeaturePlainArgs(GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeaturePlainArgs $) {
        this.featureProfileId = $.featureProfileId;
        this.id = $.id;
        this.serviceLanVpnFeatureId = $.serviceLanVpnFeatureId;
        this.serviceLanVpnInterfaceSviFeatureId = $.serviceLanVpnInterfaceSviFeatureId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeaturePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeaturePlainArgs $;

        public Builder() {
            $ = new GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeaturePlainArgs();
        }

        public Builder(GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeaturePlainArgs defaults) {
            $ = new GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeaturePlainArgs(Objects.requireNonNull(defaults));
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
         * @param serviceLanVpnInterfaceSviFeatureId Service LAN VPN Interface SVI Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceLanVpnInterfaceSviFeatureId(String serviceLanVpnInterfaceSviFeatureId) {
            $.serviceLanVpnInterfaceSviFeatureId = serviceLanVpnInterfaceSviFeatureId;
            return this;
        }

        public GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeaturePlainArgs build() {
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeaturePlainArgs", "featureProfileId");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeaturePlainArgs", "id");
            }
            if ($.serviceLanVpnFeatureId == null) {
                throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeaturePlainArgs", "serviceLanVpnFeatureId");
            }
            if ($.serviceLanVpnInterfaceSviFeatureId == null) {
                throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeaturePlainArgs", "serviceLanVpnInterfaceSviFeatureId");
            }
            return $;
        }
    }

}
