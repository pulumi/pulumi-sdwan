// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AsPathListPolicyObjectEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final AsPathListPolicyObjectEntryArgs Empty = new AsPathListPolicyObjectEntryArgs();

    /**
     * Regular expression to match the BGP AS paths e.g., `^1239_[0-9]*$`
     * 
     */
    @Import(name="asPath", required=true)
    private Output<String> asPath;

    /**
     * @return Regular expression to match the BGP AS paths e.g., `^1239_[0-9]*$`
     * 
     */
    public Output<String> asPath() {
        return this.asPath;
    }

    private AsPathListPolicyObjectEntryArgs() {}

    private AsPathListPolicyObjectEntryArgs(AsPathListPolicyObjectEntryArgs $) {
        this.asPath = $.asPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AsPathListPolicyObjectEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AsPathListPolicyObjectEntryArgs $;

        public Builder() {
            $ = new AsPathListPolicyObjectEntryArgs();
        }

        public Builder(AsPathListPolicyObjectEntryArgs defaults) {
            $ = new AsPathListPolicyObjectEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param asPath Regular expression to match the BGP AS paths e.g., `^1239_[0-9]*$`
         * 
         * @return builder
         * 
         */
        public Builder asPath(Output<String> asPath) {
            $.asPath = asPath;
            return this;
        }

        /**
         * @param asPath Regular expression to match the BGP AS paths e.g., `^1239_[0-9]*$`
         * 
         * @return builder
         * 
         */
        public Builder asPath(String asPath) {
            return asPath(Output.of(asPath));
        }

        public AsPathListPolicyObjectEntryArgs build() {
            if ($.asPath == null) {
                throw new MissingRequiredPropertyException("AsPathListPolicyObjectEntryArgs", "asPath");
            }
            return $;
        }
    }

}
