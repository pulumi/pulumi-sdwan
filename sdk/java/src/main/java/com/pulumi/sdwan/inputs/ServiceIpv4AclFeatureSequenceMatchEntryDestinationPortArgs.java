// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceIpv4AclFeatureSequenceMatchEntryDestinationPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIpv4AclFeatureSequenceMatchEntryDestinationPortArgs Empty = new ServiceIpv4AclFeatureSequenceMatchEntryDestinationPortArgs();

    /**
     * destination port range or individual port number
     * 
     */
    @Import(name="port")
    private @Nullable Output<String> port;

    /**
     * @return destination port range or individual port number
     * 
     */
    public Optional<Output<String>> port() {
        return Optional.ofNullable(this.port);
    }

    private ServiceIpv4AclFeatureSequenceMatchEntryDestinationPortArgs() {}

    private ServiceIpv4AclFeatureSequenceMatchEntryDestinationPortArgs(ServiceIpv4AclFeatureSequenceMatchEntryDestinationPortArgs $) {
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIpv4AclFeatureSequenceMatchEntryDestinationPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIpv4AclFeatureSequenceMatchEntryDestinationPortArgs $;

        public Builder() {
            $ = new ServiceIpv4AclFeatureSequenceMatchEntryDestinationPortArgs();
        }

        public Builder(ServiceIpv4AclFeatureSequenceMatchEntryDestinationPortArgs defaults) {
            $ = new ServiceIpv4AclFeatureSequenceMatchEntryDestinationPortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param port destination port range or individual port number
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<String> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port destination port range or individual port number
         * 
         * @return builder
         * 
         */
        public Builder port(String port) {
            return port(Output.of(port));
        }

        public ServiceIpv4AclFeatureSequenceMatchEntryDestinationPortArgs build() {
            return $;
        }
    }

}
