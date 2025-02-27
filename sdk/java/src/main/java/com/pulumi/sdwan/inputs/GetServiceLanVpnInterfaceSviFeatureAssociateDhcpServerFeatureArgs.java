// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureArgs Empty = new GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureArgs();

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
     * Service LAN VPN Feature ID
     * 
     */
    @Import(name="serviceLanVpnFeatureId", required=true)
    private Output<String> serviceLanVpnFeatureId;

    /**
     * @return Service LAN VPN Feature ID
     * 
     */
    public Output<String> serviceLanVpnFeatureId() {
        return this.serviceLanVpnFeatureId;
    }

    /**
     * Service LAN VPN Interface SVI Feature ID
     * 
     */
    @Import(name="serviceLanVpnInterfaceSviFeatureId", required=true)
    private Output<String> serviceLanVpnInterfaceSviFeatureId;

    /**
     * @return Service LAN VPN Interface SVI Feature ID
     * 
     */
    public Output<String> serviceLanVpnInterfaceSviFeatureId() {
        return this.serviceLanVpnInterfaceSviFeatureId;
    }

    private GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureArgs() {}

    private GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureArgs(GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureArgs $) {
        this.featureProfileId = $.featureProfileId;
        this.id = $.id;
        this.serviceLanVpnFeatureId = $.serviceLanVpnFeatureId;
        this.serviceLanVpnInterfaceSviFeatureId = $.serviceLanVpnInterfaceSviFeatureId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureArgs $;

        public Builder() {
            $ = new GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureArgs();
        }

        public Builder(GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureArgs defaults) {
            $ = new GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureArgs(Objects.requireNonNull(defaults));
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
         * @param serviceLanVpnFeatureId Service LAN VPN Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceLanVpnFeatureId(Output<String> serviceLanVpnFeatureId) {
            $.serviceLanVpnFeatureId = serviceLanVpnFeatureId;
            return this;
        }

        /**
         * @param serviceLanVpnFeatureId Service LAN VPN Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceLanVpnFeatureId(String serviceLanVpnFeatureId) {
            return serviceLanVpnFeatureId(Output.of(serviceLanVpnFeatureId));
        }

        /**
         * @param serviceLanVpnInterfaceSviFeatureId Service LAN VPN Interface SVI Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceLanVpnInterfaceSviFeatureId(Output<String> serviceLanVpnInterfaceSviFeatureId) {
            $.serviceLanVpnInterfaceSviFeatureId = serviceLanVpnInterfaceSviFeatureId;
            return this;
        }

        /**
         * @param serviceLanVpnInterfaceSviFeatureId Service LAN VPN Interface SVI Feature ID
         * 
         * @return builder
         * 
         */
        public Builder serviceLanVpnInterfaceSviFeatureId(String serviceLanVpnInterfaceSviFeatureId) {
            return serviceLanVpnInterfaceSviFeatureId(Output.of(serviceLanVpnInterfaceSviFeatureId));
        }

        public GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureArgs build() {
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureArgs", "featureProfileId");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureArgs", "id");
            }
            if ($.serviceLanVpnFeatureId == null) {
                throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureArgs", "serviceLanVpnFeatureId");
            }
            if ($.serviceLanVpnInterfaceSviFeatureId == null) {
                throw new MissingRequiredPropertyException("GetServiceLanVpnInterfaceSviFeatureAssociateDhcpServerFeatureArgs", "serviceLanVpnInterfaceSviFeatureId");
            }
            return $;
        }
    }

}
