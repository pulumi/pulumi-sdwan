// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CedgePimFeatureTemplateInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final CedgePimFeatureTemplateInterfaceArgs Empty = new CedgePimFeatureTemplateInterfaceArgs();

    /**
     * Set interface name
     * 
     */
    @Import(name="interfaceName")
    private @Nullable Output<String> interfaceName;

    /**
     * @return Set interface name
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
     * Set interval at which PIM multicast traffic can join or be removed from RPT or SPT
     *   - Range: `10`-`600`
     *   - Default value: `60`
     * 
     */
    @Import(name="joinPruneInterval")
    private @Nullable Output<Integer> joinPruneInterval;

    /**
     * @return Set interval at which PIM multicast traffic can join or be removed from RPT or SPT
     *   - Range: `10`-`600`
     *   - Default value: `60`
     * 
     */
    public Optional<Output<Integer>> joinPruneInterval() {
        return Optional.ofNullable(this.joinPruneInterval);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="joinPruneIntervalVariable")
    private @Nullable Output<String> joinPruneIntervalVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> joinPruneIntervalVariable() {
        return Optional.ofNullable(this.joinPruneIntervalVariable);
    }

    /**
     * Indicates if list item is considered optional.
     * 
     */
    @Import(name="optional")
    private @Nullable Output<Boolean> optional;

    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Optional<Output<Boolean>> optional() {
        return Optional.ofNullable(this.optional);
    }

    /**
     * Set PIM query interval
     *   - Range: `1`-`18725`
     *   - Default value: `30`
     * 
     */
    @Import(name="queryInterval")
    private @Nullable Output<Integer> queryInterval;

    /**
     * @return Set PIM query interval
     *   - Range: `1`-`18725`
     *   - Default value: `30`
     * 
     */
    public Optional<Output<Integer>> queryInterval() {
        return Optional.ofNullable(this.queryInterval);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="queryIntervalVariable")
    private @Nullable Output<String> queryIntervalVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> queryIntervalVariable() {
        return Optional.ofNullable(this.queryIntervalVariable);
    }

    private CedgePimFeatureTemplateInterfaceArgs() {}

    private CedgePimFeatureTemplateInterfaceArgs(CedgePimFeatureTemplateInterfaceArgs $) {
        this.interfaceName = $.interfaceName;
        this.interfaceNameVariable = $.interfaceNameVariable;
        this.joinPruneInterval = $.joinPruneInterval;
        this.joinPruneIntervalVariable = $.joinPruneIntervalVariable;
        this.optional = $.optional;
        this.queryInterval = $.queryInterval;
        this.queryIntervalVariable = $.queryIntervalVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CedgePimFeatureTemplateInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CedgePimFeatureTemplateInterfaceArgs $;

        public Builder() {
            $ = new CedgePimFeatureTemplateInterfaceArgs();
        }

        public Builder(CedgePimFeatureTemplateInterfaceArgs defaults) {
            $ = new CedgePimFeatureTemplateInterfaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param interfaceName Set interface name
         * 
         * @return builder
         * 
         */
        public Builder interfaceName(@Nullable Output<String> interfaceName) {
            $.interfaceName = interfaceName;
            return this;
        }

        /**
         * @param interfaceName Set interface name
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
         * @param joinPruneInterval Set interval at which PIM multicast traffic can join or be removed from RPT or SPT
         *   - Range: `10`-`600`
         *   - Default value: `60`
         * 
         * @return builder
         * 
         */
        public Builder joinPruneInterval(@Nullable Output<Integer> joinPruneInterval) {
            $.joinPruneInterval = joinPruneInterval;
            return this;
        }

        /**
         * @param joinPruneInterval Set interval at which PIM multicast traffic can join or be removed from RPT or SPT
         *   - Range: `10`-`600`
         *   - Default value: `60`
         * 
         * @return builder
         * 
         */
        public Builder joinPruneInterval(Integer joinPruneInterval) {
            return joinPruneInterval(Output.of(joinPruneInterval));
        }

        /**
         * @param joinPruneIntervalVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder joinPruneIntervalVariable(@Nullable Output<String> joinPruneIntervalVariable) {
            $.joinPruneIntervalVariable = joinPruneIntervalVariable;
            return this;
        }

        /**
         * @param joinPruneIntervalVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder joinPruneIntervalVariable(String joinPruneIntervalVariable) {
            return joinPruneIntervalVariable(Output.of(joinPruneIntervalVariable));
        }

        /**
         * @param optional Indicates if list item is considered optional.
         * 
         * @return builder
         * 
         */
        public Builder optional(@Nullable Output<Boolean> optional) {
            $.optional = optional;
            return this;
        }

        /**
         * @param optional Indicates if list item is considered optional.
         * 
         * @return builder
         * 
         */
        public Builder optional(Boolean optional) {
            return optional(Output.of(optional));
        }

        /**
         * @param queryInterval Set PIM query interval
         *   - Range: `1`-`18725`
         *   - Default value: `30`
         * 
         * @return builder
         * 
         */
        public Builder queryInterval(@Nullable Output<Integer> queryInterval) {
            $.queryInterval = queryInterval;
            return this;
        }

        /**
         * @param queryInterval Set PIM query interval
         *   - Range: `1`-`18725`
         *   - Default value: `30`
         * 
         * @return builder
         * 
         */
        public Builder queryInterval(Integer queryInterval) {
            return queryInterval(Output.of(queryInterval));
        }

        /**
         * @param queryIntervalVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder queryIntervalVariable(@Nullable Output<String> queryIntervalVariable) {
            $.queryIntervalVariable = queryIntervalVariable;
            return this;
        }

        /**
         * @param queryIntervalVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder queryIntervalVariable(String queryIntervalVariable) {
            return queryIntervalVariable(Output.of(queryIntervalVariable));
        }

        public CedgePimFeatureTemplateInterfaceArgs build() {
            return $;
        }
    }

}
