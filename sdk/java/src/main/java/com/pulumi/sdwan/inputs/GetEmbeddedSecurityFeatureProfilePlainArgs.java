// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetEmbeddedSecurityFeatureProfilePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEmbeddedSecurityFeatureProfilePlainArgs Empty = new GetEmbeddedSecurityFeatureProfilePlainArgs();

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

    private GetEmbeddedSecurityFeatureProfilePlainArgs() {}

    private GetEmbeddedSecurityFeatureProfilePlainArgs(GetEmbeddedSecurityFeatureProfilePlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEmbeddedSecurityFeatureProfilePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEmbeddedSecurityFeatureProfilePlainArgs $;

        public Builder() {
            $ = new GetEmbeddedSecurityFeatureProfilePlainArgs();
        }

        public Builder(GetEmbeddedSecurityFeatureProfilePlainArgs defaults) {
            $ = new GetEmbeddedSecurityFeatureProfilePlainArgs(Objects.requireNonNull(defaults));
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

        public GetEmbeddedSecurityFeatureProfilePlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetEmbeddedSecurityFeatureProfilePlainArgs", "id");
            }
            return $;
        }
    }

}
