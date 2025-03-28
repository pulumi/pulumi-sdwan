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


public final class ServiceMulticastFeaturePimBsrCandidateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceMulticastFeaturePimBsrCandidateArgs Empty = new ServiceMulticastFeaturePimBsrCandidateArgs();

    /**
     * Set BSR RP candidate filter
     * 
     */
    @Import(name="acceptCandidateAccessList")
    private @Nullable Output<String> acceptCandidateAccessList;

    /**
     * @return Set BSR RP candidate filter
     * 
     */
    public Optional<Output<String>> acceptCandidateAccessList() {
        return Optional.ofNullable(this.acceptCandidateAccessList);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="acceptCandidateAccessListVariable")
    private @Nullable Output<String> acceptCandidateAccessListVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> acceptCandidateAccessListVariable() {
        return Optional.ofNullable(this.acceptCandidateAccessListVariable);
    }

    /**
     * Hash Mask length for RP selection
     *   - Range: `0`-`32`
     * 
     */
    @Import(name="hashMaskLength")
    private @Nullable Output<Integer> hashMaskLength;

    /**
     * @return Hash Mask length for RP selection
     *   - Range: `0`-`32`
     * 
     */
    public Optional<Output<Integer>> hashMaskLength() {
        return Optional.ofNullable(this.hashMaskLength);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="hashMaskLengthVariable")
    private @Nullable Output<String> hashMaskLengthVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> hashMaskLengthVariable() {
        return Optional.ofNullable(this.hashMaskLengthVariable);
    }

    /**
     * Set Autonomic-Networking virtual interface
     * 
     */
    @Import(name="interfaceName")
    private @Nullable Output<String> interfaceName;

    /**
     * @return Set Autonomic-Networking virtual interface
     * 
     */
    public Optional<Output<String>> interfaceName() {
        return Optional.ofNullable(this.interfaceName);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="interfaceNameVariable")
    private @Nullable Output<String> interfaceNameVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> interfaceNameVariable() {
        return Optional.ofNullable(this.interfaceNameVariable);
    }

    /**
     * Set RP candidate priority
     *   - Range: `0`-`255`
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Set RP candidate priority
     *   - Range: `0`-`255`
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="priorityVariable")
    private @Nullable Output<String> priorityVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> priorityVariable() {
        return Optional.ofNullable(this.priorityVariable);
    }

    private ServiceMulticastFeaturePimBsrCandidateArgs() {}

    private ServiceMulticastFeaturePimBsrCandidateArgs(ServiceMulticastFeaturePimBsrCandidateArgs $) {
        this.acceptCandidateAccessList = $.acceptCandidateAccessList;
        this.acceptCandidateAccessListVariable = $.acceptCandidateAccessListVariable;
        this.hashMaskLength = $.hashMaskLength;
        this.hashMaskLengthVariable = $.hashMaskLengthVariable;
        this.interfaceName = $.interfaceName;
        this.interfaceNameVariable = $.interfaceNameVariable;
        this.priority = $.priority;
        this.priorityVariable = $.priorityVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceMulticastFeaturePimBsrCandidateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceMulticastFeaturePimBsrCandidateArgs $;

        public Builder() {
            $ = new ServiceMulticastFeaturePimBsrCandidateArgs();
        }

        public Builder(ServiceMulticastFeaturePimBsrCandidateArgs defaults) {
            $ = new ServiceMulticastFeaturePimBsrCandidateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceptCandidateAccessList Set BSR RP candidate filter
         * 
         * @return builder
         * 
         */
        public Builder acceptCandidateAccessList(@Nullable Output<String> acceptCandidateAccessList) {
            $.acceptCandidateAccessList = acceptCandidateAccessList;
            return this;
        }

        /**
         * @param acceptCandidateAccessList Set BSR RP candidate filter
         * 
         * @return builder
         * 
         */
        public Builder acceptCandidateAccessList(String acceptCandidateAccessList) {
            return acceptCandidateAccessList(Output.of(acceptCandidateAccessList));
        }

        /**
         * @param acceptCandidateAccessListVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder acceptCandidateAccessListVariable(@Nullable Output<String> acceptCandidateAccessListVariable) {
            $.acceptCandidateAccessListVariable = acceptCandidateAccessListVariable;
            return this;
        }

        /**
         * @param acceptCandidateAccessListVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder acceptCandidateAccessListVariable(String acceptCandidateAccessListVariable) {
            return acceptCandidateAccessListVariable(Output.of(acceptCandidateAccessListVariable));
        }

        /**
         * @param hashMaskLength Hash Mask length for RP selection
         *   - Range: `0`-`32`
         * 
         * @return builder
         * 
         */
        public Builder hashMaskLength(@Nullable Output<Integer> hashMaskLength) {
            $.hashMaskLength = hashMaskLength;
            return this;
        }

        /**
         * @param hashMaskLength Hash Mask length for RP selection
         *   - Range: `0`-`32`
         * 
         * @return builder
         * 
         */
        public Builder hashMaskLength(Integer hashMaskLength) {
            return hashMaskLength(Output.of(hashMaskLength));
        }

        /**
         * @param hashMaskLengthVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder hashMaskLengthVariable(@Nullable Output<String> hashMaskLengthVariable) {
            $.hashMaskLengthVariable = hashMaskLengthVariable;
            return this;
        }

        /**
         * @param hashMaskLengthVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder hashMaskLengthVariable(String hashMaskLengthVariable) {
            return hashMaskLengthVariable(Output.of(hashMaskLengthVariable));
        }

        /**
         * @param interfaceName Set Autonomic-Networking virtual interface
         * 
         * @return builder
         * 
         */
        public Builder interfaceName(@Nullable Output<String> interfaceName) {
            $.interfaceName = interfaceName;
            return this;
        }

        /**
         * @param interfaceName Set Autonomic-Networking virtual interface
         * 
         * @return builder
         * 
         */
        public Builder interfaceName(String interfaceName) {
            return interfaceName(Output.of(interfaceName));
        }

        /**
         * @param interfaceNameVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder interfaceNameVariable(@Nullable Output<String> interfaceNameVariable) {
            $.interfaceNameVariable = interfaceNameVariable;
            return this;
        }

        /**
         * @param interfaceNameVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder interfaceNameVariable(String interfaceNameVariable) {
            return interfaceNameVariable(Output.of(interfaceNameVariable));
        }

        /**
         * @param priority Set RP candidate priority
         *   - Range: `0`-`255`
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Set RP candidate priority
         *   - Range: `0`-`255`
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param priorityVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder priorityVariable(@Nullable Output<String> priorityVariable) {
            $.priorityVariable = priorityVariable;
            return this;
        }

        /**
         * @param priorityVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder priorityVariable(String priorityVariable) {
            return priorityVariable(Output.of(priorityVariable));
        }

        public ServiceMulticastFeaturePimBsrCandidateArgs build() {
            return $;
        }
    }

}
