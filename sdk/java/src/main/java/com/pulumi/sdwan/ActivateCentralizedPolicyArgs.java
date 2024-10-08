// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActivateCentralizedPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActivateCentralizedPolicyArgs Empty = new ActivateCentralizedPolicyArgs();

    /**
     * The version of the centralized policy
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return The version of the centralized policy
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private ActivateCentralizedPolicyArgs() {}

    private ActivateCentralizedPolicyArgs(ActivateCentralizedPolicyArgs $) {
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActivateCentralizedPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActivateCentralizedPolicyArgs $;

        public Builder() {
            $ = new ActivateCentralizedPolicyArgs();
        }

        public Builder(ActivateCentralizedPolicyArgs defaults) {
            $ = new ActivateCentralizedPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param version The version of the centralized policy
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the centralized policy
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public ActivateCentralizedPolicyArgs build() {
            return $;
        }
    }

}
