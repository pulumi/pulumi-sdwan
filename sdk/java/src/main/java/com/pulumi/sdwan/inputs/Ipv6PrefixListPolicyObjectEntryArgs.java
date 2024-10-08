// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class Ipv6PrefixListPolicyObjectEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final Ipv6PrefixListPolicyObjectEntryArgs Empty = new Ipv6PrefixListPolicyObjectEntryArgs();

    /**
     * Greater equal
     * 
     */
    @Import(name="ge")
    private @Nullable Output<Integer> ge;

    /**
     * @return Greater equal
     * 
     */
    public Optional<Output<Integer>> ge() {
        return Optional.ofNullable(this.ge);
    }

    /**
     * Lesser equal
     * 
     */
    @Import(name="le")
    private @Nullable Output<Integer> le;

    /**
     * @return Lesser equal
     * 
     */
    public Optional<Output<Integer>> le() {
        return Optional.ofNullable(this.le);
    }

    /**
     * IP prefix list entry, e.g. `2001:1:1:2::/64`
     * 
     */
    @Import(name="prefix", required=true)
    private Output<String> prefix;

    /**
     * @return IP prefix list entry, e.g. `2001:1:1:2::/64`
     * 
     */
    public Output<String> prefix() {
        return this.prefix;
    }

    private Ipv6PrefixListPolicyObjectEntryArgs() {}

    private Ipv6PrefixListPolicyObjectEntryArgs(Ipv6PrefixListPolicyObjectEntryArgs $) {
        this.ge = $.ge;
        this.le = $.le;
        this.prefix = $.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Ipv6PrefixListPolicyObjectEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Ipv6PrefixListPolicyObjectEntryArgs $;

        public Builder() {
            $ = new Ipv6PrefixListPolicyObjectEntryArgs();
        }

        public Builder(Ipv6PrefixListPolicyObjectEntryArgs defaults) {
            $ = new Ipv6PrefixListPolicyObjectEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ge Greater equal
         * 
         * @return builder
         * 
         */
        public Builder ge(@Nullable Output<Integer> ge) {
            $.ge = ge;
            return this;
        }

        /**
         * @param ge Greater equal
         * 
         * @return builder
         * 
         */
        public Builder ge(Integer ge) {
            return ge(Output.of(ge));
        }

        /**
         * @param le Lesser equal
         * 
         * @return builder
         * 
         */
        public Builder le(@Nullable Output<Integer> le) {
            $.le = le;
            return this;
        }

        /**
         * @param le Lesser equal
         * 
         * @return builder
         * 
         */
        public Builder le(Integer le) {
            return le(Output.of(le));
        }

        /**
         * @param prefix IP prefix list entry, e.g. `2001:1:1:2::/64`
         * 
         * @return builder
         * 
         */
        public Builder prefix(Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix IP prefix list entry, e.g. `2001:1:1:2::/64`
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public Ipv6PrefixListPolicyObjectEntryArgs build() {
            if ($.prefix == null) {
                throw new MissingRequiredPropertyException("Ipv6PrefixListPolicyObjectEntryArgs", "prefix");
            }
            return $;
        }
    }

}
