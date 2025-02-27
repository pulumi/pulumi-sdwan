// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceMulticastFeatureIgmpInterfaceJoinGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceMulticastFeatureIgmpInterfaceJoinGroupArgs Empty = new ServiceMulticastFeatureIgmpInterfaceJoinGroupArgs();

    /**
     * Set group address
     * 
     */
    @Import(name="groupAddress")
    private @Nullable Output<String> groupAddress;

    /**
     * @return Set group address
     * 
     */
    public Optional<Output<String>> groupAddress() {
        return Optional.ofNullable(this.groupAddress);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="groupAddressVariable")
    private @Nullable Output<String> groupAddressVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> groupAddressVariable() {
        return Optional.ofNullable(this.groupAddressVariable);
    }

    /**
     * Set source address
     * 
     */
    @Import(name="sourceAddress")
    private @Nullable Output<String> sourceAddress;

    /**
     * @return Set source address
     * 
     */
    public Optional<Output<String>> sourceAddress() {
        return Optional.ofNullable(this.sourceAddress);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="sourceAddressVariable")
    private @Nullable Output<String> sourceAddressVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> sourceAddressVariable() {
        return Optional.ofNullable(this.sourceAddressVariable);
    }

    private ServiceMulticastFeatureIgmpInterfaceJoinGroupArgs() {}

    private ServiceMulticastFeatureIgmpInterfaceJoinGroupArgs(ServiceMulticastFeatureIgmpInterfaceJoinGroupArgs $) {
        this.groupAddress = $.groupAddress;
        this.groupAddressVariable = $.groupAddressVariable;
        this.sourceAddress = $.sourceAddress;
        this.sourceAddressVariable = $.sourceAddressVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceMulticastFeatureIgmpInterfaceJoinGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceMulticastFeatureIgmpInterfaceJoinGroupArgs $;

        public Builder() {
            $ = new ServiceMulticastFeatureIgmpInterfaceJoinGroupArgs();
        }

        public Builder(ServiceMulticastFeatureIgmpInterfaceJoinGroupArgs defaults) {
            $ = new ServiceMulticastFeatureIgmpInterfaceJoinGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupAddress Set group address
         * 
         * @return builder
         * 
         */
        public Builder groupAddress(@Nullable Output<String> groupAddress) {
            $.groupAddress = groupAddress;
            return this;
        }

        /**
         * @param groupAddress Set group address
         * 
         * @return builder
         * 
         */
        public Builder groupAddress(String groupAddress) {
            return groupAddress(Output.of(groupAddress));
        }

        /**
         * @param groupAddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder groupAddressVariable(@Nullable Output<String> groupAddressVariable) {
            $.groupAddressVariable = groupAddressVariable;
            return this;
        }

        /**
         * @param groupAddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder groupAddressVariable(String groupAddressVariable) {
            return groupAddressVariable(Output.of(groupAddressVariable));
        }

        /**
         * @param sourceAddress Set source address
         * 
         * @return builder
         * 
         */
        public Builder sourceAddress(@Nullable Output<String> sourceAddress) {
            $.sourceAddress = sourceAddress;
            return this;
        }

        /**
         * @param sourceAddress Set source address
         * 
         * @return builder
         * 
         */
        public Builder sourceAddress(String sourceAddress) {
            return sourceAddress(Output.of(sourceAddress));
        }

        /**
         * @param sourceAddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder sourceAddressVariable(@Nullable Output<String> sourceAddressVariable) {
            $.sourceAddressVariable = sourceAddressVariable;
            return this;
        }

        /**
         * @param sourceAddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder sourceAddressVariable(String sourceAddressVariable) {
            return sourceAddressVariable(Output.of(sourceAddressVariable));
        }

        public ServiceMulticastFeatureIgmpInterfaceJoinGroupArgs build() {
            return $;
        }
    }

}
