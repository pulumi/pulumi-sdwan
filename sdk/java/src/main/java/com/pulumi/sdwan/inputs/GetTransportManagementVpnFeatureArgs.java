// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetTransportManagementVpnFeatureArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransportManagementVpnFeatureArgs Empty = new GetTransportManagementVpnFeatureArgs();

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

    private GetTransportManagementVpnFeatureArgs() {}

    private GetTransportManagementVpnFeatureArgs(GetTransportManagementVpnFeatureArgs $) {
        this.featureProfileId = $.featureProfileId;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransportManagementVpnFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransportManagementVpnFeatureArgs $;

        public Builder() {
            $ = new GetTransportManagementVpnFeatureArgs();
        }

        public Builder(GetTransportManagementVpnFeatureArgs defaults) {
            $ = new GetTransportManagementVpnFeatureArgs(Objects.requireNonNull(defaults));
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

        public GetTransportManagementVpnFeatureArgs build() {
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("GetTransportManagementVpnFeatureArgs", "featureProfileId");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetTransportManagementVpnFeatureArgs", "id");
            }
            return $;
        }
    }

}