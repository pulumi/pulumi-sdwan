// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetDataFqdnPrefixListPolicyObjectPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDataFqdnPrefixListPolicyObjectPlainArgs Empty = new GetDataFqdnPrefixListPolicyObjectPlainArgs();

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

    private GetDataFqdnPrefixListPolicyObjectPlainArgs() {}

    private GetDataFqdnPrefixListPolicyObjectPlainArgs(GetDataFqdnPrefixListPolicyObjectPlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDataFqdnPrefixListPolicyObjectPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDataFqdnPrefixListPolicyObjectPlainArgs $;

        public Builder() {
            $ = new GetDataFqdnPrefixListPolicyObjectPlainArgs();
        }

        public Builder(GetDataFqdnPrefixListPolicyObjectPlainArgs defaults) {
            $ = new GetDataFqdnPrefixListPolicyObjectPlainArgs(Objects.requireNonNull(defaults));
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

        public GetDataFqdnPrefixListPolicyObjectPlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetDataFqdnPrefixListPolicyObjectPlainArgs", "id");
            }
            return $;
        }
    }

}
