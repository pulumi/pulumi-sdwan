// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetMirrorPolicyObjectPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMirrorPolicyObjectPlainArgs Empty = new GetMirrorPolicyObjectPlainArgs();

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

    private GetMirrorPolicyObjectPlainArgs() {}

    private GetMirrorPolicyObjectPlainArgs(GetMirrorPolicyObjectPlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMirrorPolicyObjectPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMirrorPolicyObjectPlainArgs $;

        public Builder() {
            $ = new GetMirrorPolicyObjectPlainArgs();
        }

        public Builder(GetMirrorPolicyObjectPlainArgs defaults) {
            $ = new GetMirrorPolicyObjectPlainArgs(Objects.requireNonNull(defaults));
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

        public GetMirrorPolicyObjectPlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetMirrorPolicyObjectPlainArgs", "id");
            }
            return $;
        }
    }

}
