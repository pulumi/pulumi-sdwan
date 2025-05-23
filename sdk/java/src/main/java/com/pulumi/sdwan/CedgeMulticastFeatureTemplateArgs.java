// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CedgeMulticastFeatureTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CedgeMulticastFeatureTemplateArgs Empty = new CedgeMulticastFeatureTemplateArgs();

    /**
     * The description of the feature template
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return The description of the feature template
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
     * `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
     * `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
     * 
     */
    @Import(name="deviceTypes", required=true)
    private Output<List<String>> deviceTypes;

    /**
     * @return List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
     * `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
     * `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
     * 
     */
    public Output<List<String>> deviceTypes() {
        return this.deviceTypes;
    }

    /**
     * Replicator is local to this device - Default value: `false`
     * 
     */
    @Import(name="localReplicator")
    private @Nullable Output<Boolean> localReplicator;

    /**
     * @return Replicator is local to this device - Default value: `false`
     * 
     */
    public Optional<Output<Boolean>> localReplicator() {
        return Optional.ofNullable(this.localReplicator);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="localReplicatorVariable")
    private @Nullable Output<String> localReplicatorVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> localReplicatorVariable() {
        return Optional.ofNullable(this.localReplicatorVariable);
    }

    /**
     * The name of the feature template
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the feature template
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Shortest Path Tree (SPT) Only Mode - Default value: `false`
     * 
     */
    @Import(name="sptOnly")
    private @Nullable Output<Boolean> sptOnly;

    /**
     * @return Shortest Path Tree (SPT) Only Mode - Default value: `false`
     * 
     */
    public Optional<Output<Boolean>> sptOnly() {
        return Optional.ofNullable(this.sptOnly);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="sptOnlyVariable")
    private @Nullable Output<String> sptOnlyVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> sptOnlyVariable() {
        return Optional.ofNullable(this.sptOnlyVariable);
    }

    /**
     * Set number of joins per group the router supports - Range: `0`-`1000`
     * 
     */
    @Import(name="threshold")
    private @Nullable Output<Integer> threshold;

    /**
     * @return Set number of joins per group the router supports - Range: `0`-`1000`
     * 
     */
    public Optional<Output<Integer>> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="thresholdVariable")
    private @Nullable Output<String> thresholdVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> thresholdVariable() {
        return Optional.ofNullable(this.thresholdVariable);
    }

    private CedgeMulticastFeatureTemplateArgs() {}

    private CedgeMulticastFeatureTemplateArgs(CedgeMulticastFeatureTemplateArgs $) {
        this.description = $.description;
        this.deviceTypes = $.deviceTypes;
        this.localReplicator = $.localReplicator;
        this.localReplicatorVariable = $.localReplicatorVariable;
        this.name = $.name;
        this.sptOnly = $.sptOnly;
        this.sptOnlyVariable = $.sptOnlyVariable;
        this.threshold = $.threshold;
        this.thresholdVariable = $.thresholdVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CedgeMulticastFeatureTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CedgeMulticastFeatureTemplateArgs $;

        public Builder() {
            $ = new CedgeMulticastFeatureTemplateArgs();
        }

        public Builder(CedgeMulticastFeatureTemplateArgs defaults) {
            $ = new CedgeMulticastFeatureTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the feature template
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the feature template
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param deviceTypes List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
         * `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
         * `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
         * 
         * @return builder
         * 
         */
        public Builder deviceTypes(Output<List<String>> deviceTypes) {
            $.deviceTypes = deviceTypes;
            return this;
        }

        /**
         * @param deviceTypes List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
         * `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
         * `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
         * 
         * @return builder
         * 
         */
        public Builder deviceTypes(List<String> deviceTypes) {
            return deviceTypes(Output.of(deviceTypes));
        }

        /**
         * @param deviceTypes List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
         * `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
         * `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
         * 
         * @return builder
         * 
         */
        public Builder deviceTypes(String... deviceTypes) {
            return deviceTypes(List.of(deviceTypes));
        }

        /**
         * @param localReplicator Replicator is local to this device - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder localReplicator(@Nullable Output<Boolean> localReplicator) {
            $.localReplicator = localReplicator;
            return this;
        }

        /**
         * @param localReplicator Replicator is local to this device - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder localReplicator(Boolean localReplicator) {
            return localReplicator(Output.of(localReplicator));
        }

        /**
         * @param localReplicatorVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder localReplicatorVariable(@Nullable Output<String> localReplicatorVariable) {
            $.localReplicatorVariable = localReplicatorVariable;
            return this;
        }

        /**
         * @param localReplicatorVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder localReplicatorVariable(String localReplicatorVariable) {
            return localReplicatorVariable(Output.of(localReplicatorVariable));
        }

        /**
         * @param name The name of the feature template
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the feature template
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sptOnly Shortest Path Tree (SPT) Only Mode - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder sptOnly(@Nullable Output<Boolean> sptOnly) {
            $.sptOnly = sptOnly;
            return this;
        }

        /**
         * @param sptOnly Shortest Path Tree (SPT) Only Mode - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder sptOnly(Boolean sptOnly) {
            return sptOnly(Output.of(sptOnly));
        }

        /**
         * @param sptOnlyVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder sptOnlyVariable(@Nullable Output<String> sptOnlyVariable) {
            $.sptOnlyVariable = sptOnlyVariable;
            return this;
        }

        /**
         * @param sptOnlyVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder sptOnlyVariable(String sptOnlyVariable) {
            return sptOnlyVariable(Output.of(sptOnlyVariable));
        }

        /**
         * @param threshold Set number of joins per group the router supports - Range: `0`-`1000`
         * 
         * @return builder
         * 
         */
        public Builder threshold(@Nullable Output<Integer> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold Set number of joins per group the router supports - Range: `0`-`1000`
         * 
         * @return builder
         * 
         */
        public Builder threshold(Integer threshold) {
            return threshold(Output.of(threshold));
        }

        /**
         * @param thresholdVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder thresholdVariable(@Nullable Output<String> thresholdVariable) {
            $.thresholdVariable = thresholdVariable;
            return this;
        }

        /**
         * @param thresholdVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder thresholdVariable(String thresholdVariable) {
            return thresholdVariable(Output.of(thresholdVariable));
        }

        public CedgeMulticastFeatureTemplateArgs build() {
            if ($.description == null) {
                throw new MissingRequiredPropertyException("CedgeMulticastFeatureTemplateArgs", "description");
            }
            if ($.deviceTypes == null) {
                throw new MissingRequiredPropertyException("CedgeMulticastFeatureTemplateArgs", "deviceTypes");
            }
            return $;
        }
    }

}
