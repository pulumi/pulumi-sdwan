// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransportWanVpnFeatureServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransportWanVpnFeatureServiceArgs Empty = new TransportWanVpnFeatureServiceArgs();

    /**
     * Service Type
     *   - Choices: `TE`
     * 
     */
    @Import(name="serviceType")
    private @Nullable Output<String> serviceType;

    /**
     * @return Service Type
     *   - Choices: `TE`
     * 
     */
    public Optional<Output<String>> serviceType() {
        return Optional.ofNullable(this.serviceType);
    }

    private TransportWanVpnFeatureServiceArgs() {}

    private TransportWanVpnFeatureServiceArgs(TransportWanVpnFeatureServiceArgs $) {
        this.serviceType = $.serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransportWanVpnFeatureServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransportWanVpnFeatureServiceArgs $;

        public Builder() {
            $ = new TransportWanVpnFeatureServiceArgs();
        }

        public Builder(TransportWanVpnFeatureServiceArgs defaults) {
            $ = new TransportWanVpnFeatureServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serviceType Service Type
         *   - Choices: `TE`
         * 
         * @return builder
         * 
         */
        public Builder serviceType(@Nullable Output<String> serviceType) {
            $.serviceType = serviceType;
            return this;
        }

        /**
         * @param serviceType Service Type
         *   - Choices: `TE`
         * 
         * @return builder
         * 
         */
        public Builder serviceType(String serviceType) {
            return serviceType(Output.of(serviceType));
        }

        public TransportWanVpnFeatureServiceArgs build() {
            return $;
        }
    }

}
