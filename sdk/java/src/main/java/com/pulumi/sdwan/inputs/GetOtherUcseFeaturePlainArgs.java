// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetOtherUcseFeaturePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOtherUcseFeaturePlainArgs Empty = new GetOtherUcseFeaturePlainArgs();

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

    private GetOtherUcseFeaturePlainArgs() {}

    private GetOtherUcseFeaturePlainArgs(GetOtherUcseFeaturePlainArgs $) {
        this.featureProfileId = $.featureProfileId;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOtherUcseFeaturePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOtherUcseFeaturePlainArgs $;

        public Builder() {
            $ = new GetOtherUcseFeaturePlainArgs();
        }

        public Builder(GetOtherUcseFeaturePlainArgs defaults) {
            $ = new GetOtherUcseFeaturePlainArgs(Objects.requireNonNull(defaults));
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

        public GetOtherUcseFeaturePlainArgs build() {
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("GetOtherUcseFeaturePlainArgs", "featureProfileId");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetOtherUcseFeaturePlainArgs", "id");
            }
            return $;
        }
    }

}