// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetServiceIpv6AclFeaturePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceIpv6AclFeaturePlainArgs Empty = new GetServiceIpv6AclFeaturePlainArgs();

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

    private GetServiceIpv6AclFeaturePlainArgs() {}

    private GetServiceIpv6AclFeaturePlainArgs(GetServiceIpv6AclFeaturePlainArgs $) {
        this.featureProfileId = $.featureProfileId;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceIpv6AclFeaturePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceIpv6AclFeaturePlainArgs $;

        public Builder() {
            $ = new GetServiceIpv6AclFeaturePlainArgs();
        }

        public Builder(GetServiceIpv6AclFeaturePlainArgs defaults) {
            $ = new GetServiceIpv6AclFeaturePlainArgs(Objects.requireNonNull(defaults));
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

        public GetServiceIpv6AclFeaturePlainArgs build() {
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("GetServiceIpv6AclFeaturePlainArgs", "featureProfileId");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetServiceIpv6AclFeaturePlainArgs", "id");
            }
            return $;
        }
    }

}
