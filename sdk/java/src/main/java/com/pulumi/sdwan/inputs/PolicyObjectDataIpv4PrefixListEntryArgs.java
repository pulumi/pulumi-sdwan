// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyObjectDataIpv4PrefixListEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyObjectDataIpv4PrefixListEntryArgs Empty = new PolicyObjectDataIpv4PrefixListEntryArgs();

    /**
     * IPv4 address
     * 
     */
    @Import(name="ipv4Address")
    private @Nullable Output<String> ipv4Address;

    /**
     * @return IPv4 address
     * 
     */
    public Optional<Output<String>> ipv4Address() {
        return Optional.ofNullable(this.ipv4Address);
    }

    /**
     * IPv4 prefix Length
     *   - Range: `0`-`32`
     * 
     */
    @Import(name="ipv4PrefixLength")
    private @Nullable Output<Integer> ipv4PrefixLength;

    /**
     * @return IPv4 prefix Length
     *   - Range: `0`-`32`
     * 
     */
    public Optional<Output<Integer>> ipv4PrefixLength() {
        return Optional.ofNullable(this.ipv4PrefixLength);
    }

    private PolicyObjectDataIpv4PrefixListEntryArgs() {}

    private PolicyObjectDataIpv4PrefixListEntryArgs(PolicyObjectDataIpv4PrefixListEntryArgs $) {
        this.ipv4Address = $.ipv4Address;
        this.ipv4PrefixLength = $.ipv4PrefixLength;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyObjectDataIpv4PrefixListEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyObjectDataIpv4PrefixListEntryArgs $;

        public Builder() {
            $ = new PolicyObjectDataIpv4PrefixListEntryArgs();
        }

        public Builder(PolicyObjectDataIpv4PrefixListEntryArgs defaults) {
            $ = new PolicyObjectDataIpv4PrefixListEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipv4Address IPv4 address
         * 
         * @return builder
         * 
         */
        public Builder ipv4Address(@Nullable Output<String> ipv4Address) {
            $.ipv4Address = ipv4Address;
            return this;
        }

        /**
         * @param ipv4Address IPv4 address
         * 
         * @return builder
         * 
         */
        public Builder ipv4Address(String ipv4Address) {
            return ipv4Address(Output.of(ipv4Address));
        }

        /**
         * @param ipv4PrefixLength IPv4 prefix Length
         *   - Range: `0`-`32`
         * 
         * @return builder
         * 
         */
        public Builder ipv4PrefixLength(@Nullable Output<Integer> ipv4PrefixLength) {
            $.ipv4PrefixLength = ipv4PrefixLength;
            return this;
        }

        /**
         * @param ipv4PrefixLength IPv4 prefix Length
         *   - Range: `0`-`32`
         * 
         * @return builder
         * 
         */
        public Builder ipv4PrefixLength(Integer ipv4PrefixLength) {
            return ipv4PrefixLength(Output.of(ipv4PrefixLength));
        }

        public PolicyObjectDataIpv4PrefixListEntryArgs build() {
            return $;
        }
    }

}