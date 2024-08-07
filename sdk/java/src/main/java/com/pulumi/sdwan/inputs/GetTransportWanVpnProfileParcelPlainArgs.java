// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetTransportWanVpnProfileParcelPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransportWanVpnProfileParcelPlainArgs Empty = new GetTransportWanVpnProfileParcelPlainArgs();

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
     * The id of the profile parcel
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The id of the profile parcel
     * 
     */
    public String id() {
        return this.id;
    }

    private GetTransportWanVpnProfileParcelPlainArgs() {}

    private GetTransportWanVpnProfileParcelPlainArgs(GetTransportWanVpnProfileParcelPlainArgs $) {
        this.featureProfileId = $.featureProfileId;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransportWanVpnProfileParcelPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransportWanVpnProfileParcelPlainArgs $;

        public Builder() {
            $ = new GetTransportWanVpnProfileParcelPlainArgs();
        }

        public Builder(GetTransportWanVpnProfileParcelPlainArgs defaults) {
            $ = new GetTransportWanVpnProfileParcelPlainArgs(Objects.requireNonNull(defaults));
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
         * @param id The id of the profile parcel
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetTransportWanVpnProfileParcelPlainArgs build() {
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("GetTransportWanVpnProfileParcelPlainArgs", "featureProfileId");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetTransportWanVpnProfileParcelPlainArgs", "id");
            }
            return $;
        }
    }

}
