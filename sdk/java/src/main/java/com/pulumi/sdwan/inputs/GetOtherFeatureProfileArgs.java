// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetOtherFeatureProfileArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOtherFeatureProfileArgs Empty = new GetOtherFeatureProfileArgs();

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

    private GetOtherFeatureProfileArgs() {}

    private GetOtherFeatureProfileArgs(GetOtherFeatureProfileArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOtherFeatureProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOtherFeatureProfileArgs $;

        public Builder() {
            $ = new GetOtherFeatureProfileArgs();
        }

        public Builder(GetOtherFeatureProfileArgs defaults) {
            $ = new GetOtherFeatureProfileArgs(Objects.requireNonNull(defaults));
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

        public GetOtherFeatureProfileArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetOtherFeatureProfileArgs", "id");
            }
            return $;
        }
    }

}