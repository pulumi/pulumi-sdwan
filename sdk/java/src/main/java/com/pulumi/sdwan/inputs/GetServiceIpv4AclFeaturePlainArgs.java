// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetServiceIpv4AclFeaturePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceIpv4AclFeaturePlainArgs Empty = new GetServiceIpv4AclFeaturePlainArgs();

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
     * The id of the Feature
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The id of the Feature
     * 
     */
    public String id() {
        return this.id;
    }

    private GetServiceIpv4AclFeaturePlainArgs() {}

    private GetServiceIpv4AclFeaturePlainArgs(GetServiceIpv4AclFeaturePlainArgs $) {
        this.featureProfileId = $.featureProfileId;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceIpv4AclFeaturePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceIpv4AclFeaturePlainArgs $;

        public Builder() {
            $ = new GetServiceIpv4AclFeaturePlainArgs();
        }

        public Builder(GetServiceIpv4AclFeaturePlainArgs defaults) {
            $ = new GetServiceIpv4AclFeaturePlainArgs(Objects.requireNonNull(defaults));
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
         * @param id The id of the Feature
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetServiceIpv4AclFeaturePlainArgs build() {
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("GetServiceIpv4AclFeaturePlainArgs", "featureProfileId");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetServiceIpv4AclFeaturePlainArgs", "id");
            }
            return $;
        }
    }

}
