// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class DataIpv4PrefixListPolicyObjectEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataIpv4PrefixListPolicyObjectEntryArgs Empty = new DataIpv4PrefixListPolicyObjectEntryArgs();

    /**
     * IP prefix list entry, e.g. `10.0.0.0/12`
     * 
     */
    @Import(name="prefix", required=true)
    private Output<String> prefix;

    /**
     * @return IP prefix list entry, e.g. `10.0.0.0/12`
     * 
     */
    public Output<String> prefix() {
        return this.prefix;
    }

    private DataIpv4PrefixListPolicyObjectEntryArgs() {}

    private DataIpv4PrefixListPolicyObjectEntryArgs(DataIpv4PrefixListPolicyObjectEntryArgs $) {
        this.prefix = $.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataIpv4PrefixListPolicyObjectEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataIpv4PrefixListPolicyObjectEntryArgs $;

        public Builder() {
            $ = new DataIpv4PrefixListPolicyObjectEntryArgs();
        }

        public Builder(DataIpv4PrefixListPolicyObjectEntryArgs defaults) {
            $ = new DataIpv4PrefixListPolicyObjectEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param prefix IP prefix list entry, e.g. `10.0.0.0/12`
         * 
         * @return builder
         * 
         */
        public Builder prefix(Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix IP prefix list entry, e.g. `10.0.0.0/12`
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public DataIpv4PrefixListPolicyObjectEntryArgs build() {
            if ($.prefix == null) {
                throw new MissingRequiredPropertyException("DataIpv4PrefixListPolicyObjectEntryArgs", "prefix");
            }
            return $;
        }
    }

}
