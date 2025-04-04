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


public final class ServiceRoutingBgpFeatureIpv4NeighborAddressFamilyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceRoutingBgpFeatureIpv4NeighborAddressFamilyArgs Empty = new ServiceRoutingBgpFeatureIpv4NeighborAddressFamilyArgs();

    /**
     * Set IPv4 unicast address family
     * 
     */
    @Import(name="familyType")
    private @Nullable Output<String> familyType;

    /**
     * @return Set IPv4 unicast address family
     * 
     */
    public Optional<Output<String>> familyType() {
        return Optional.ofNullable(this.familyType);
    }

    @Import(name="inRoutePolicyId")
    private @Nullable Output<String> inRoutePolicyId;

    public Optional<Output<String>> inRoutePolicyId() {
        return Optional.ofNullable(this.inRoutePolicyId);
    }

    /**
     * Set maximum number of prefixes accepted from BGP peer
     *   - Range: `1`-`4294967295`
     * 
     */
    @Import(name="maxNumberOfPrefixes")
    private @Nullable Output<Integer> maxNumberOfPrefixes;

    /**
     * @return Set maximum number of prefixes accepted from BGP peer
     *   - Range: `1`-`4294967295`
     * 
     */
    public Optional<Output<Integer>> maxNumberOfPrefixes() {
        return Optional.ofNullable(this.maxNumberOfPrefixes);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="maxNumberOfPrefixesVariable")
    private @Nullable Output<String> maxNumberOfPrefixesVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> maxNumberOfPrefixesVariable() {
        return Optional.ofNullable(this.maxNumberOfPrefixesVariable);
    }

    @Import(name="outRoutePolicyId")
    private @Nullable Output<String> outRoutePolicyId;

    public Optional<Output<String>> outRoutePolicyId() {
        return Optional.ofNullable(this.outRoutePolicyId);
    }

    /**
     * Neighbor received maximum prefix policy is disabled.
     * 
     */
    @Import(name="policyType")
    private @Nullable Output<String> policyType;

    /**
     * @return Neighbor received maximum prefix policy is disabled.
     * 
     */
    public Optional<Output<String>> policyType() {
        return Optional.ofNullable(this.policyType);
    }

    /**
     * Set the restart interval(minutes) when to restart BGP connection if threshold is exceeded
     *   - Range: `1`-`65535`
     * 
     */
    @Import(name="restartInterval")
    private @Nullable Output<Integer> restartInterval;

    /**
     * @return Set the restart interval(minutes) when to restart BGP connection if threshold is exceeded
     *   - Range: `1`-`65535`
     * 
     */
    public Optional<Output<Integer>> restartInterval() {
        return Optional.ofNullable(this.restartInterval);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="restartIntervalVariable")
    private @Nullable Output<String> restartIntervalVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> restartIntervalVariable() {
        return Optional.ofNullable(this.restartIntervalVariable);
    }

    /**
     * Set threshold(1 to 100) at which to generate a warning message
     *   - Range: `1`-`100`
     *   - Default value: `75`
     * 
     */
    @Import(name="threshold")
    private @Nullable Output<Integer> threshold;

    /**
     * @return Set threshold(1 to 100) at which to generate a warning message
     *   - Range: `1`-`100`
     *   - Default value: `75`
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

    private ServiceRoutingBgpFeatureIpv4NeighborAddressFamilyArgs() {}

    private ServiceRoutingBgpFeatureIpv4NeighborAddressFamilyArgs(ServiceRoutingBgpFeatureIpv4NeighborAddressFamilyArgs $) {
        this.familyType = $.familyType;
        this.inRoutePolicyId = $.inRoutePolicyId;
        this.maxNumberOfPrefixes = $.maxNumberOfPrefixes;
        this.maxNumberOfPrefixesVariable = $.maxNumberOfPrefixesVariable;
        this.outRoutePolicyId = $.outRoutePolicyId;
        this.policyType = $.policyType;
        this.restartInterval = $.restartInterval;
        this.restartIntervalVariable = $.restartIntervalVariable;
        this.threshold = $.threshold;
        this.thresholdVariable = $.thresholdVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceRoutingBgpFeatureIpv4NeighborAddressFamilyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceRoutingBgpFeatureIpv4NeighborAddressFamilyArgs $;

        public Builder() {
            $ = new ServiceRoutingBgpFeatureIpv4NeighborAddressFamilyArgs();
        }

        public Builder(ServiceRoutingBgpFeatureIpv4NeighborAddressFamilyArgs defaults) {
            $ = new ServiceRoutingBgpFeatureIpv4NeighborAddressFamilyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param familyType Set IPv4 unicast address family
         * 
         * @return builder
         * 
         */
        public Builder familyType(@Nullable Output<String> familyType) {
            $.familyType = familyType;
            return this;
        }

        /**
         * @param familyType Set IPv4 unicast address family
         * 
         * @return builder
         * 
         */
        public Builder familyType(String familyType) {
            return familyType(Output.of(familyType));
        }

        public Builder inRoutePolicyId(@Nullable Output<String> inRoutePolicyId) {
            $.inRoutePolicyId = inRoutePolicyId;
            return this;
        }

        public Builder inRoutePolicyId(String inRoutePolicyId) {
            return inRoutePolicyId(Output.of(inRoutePolicyId));
        }

        /**
         * @param maxNumberOfPrefixes Set maximum number of prefixes accepted from BGP peer
         *   - Range: `1`-`4294967295`
         * 
         * @return builder
         * 
         */
        public Builder maxNumberOfPrefixes(@Nullable Output<Integer> maxNumberOfPrefixes) {
            $.maxNumberOfPrefixes = maxNumberOfPrefixes;
            return this;
        }

        /**
         * @param maxNumberOfPrefixes Set maximum number of prefixes accepted from BGP peer
         *   - Range: `1`-`4294967295`
         * 
         * @return builder
         * 
         */
        public Builder maxNumberOfPrefixes(Integer maxNumberOfPrefixes) {
            return maxNumberOfPrefixes(Output.of(maxNumberOfPrefixes));
        }

        /**
         * @param maxNumberOfPrefixesVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder maxNumberOfPrefixesVariable(@Nullable Output<String> maxNumberOfPrefixesVariable) {
            $.maxNumberOfPrefixesVariable = maxNumberOfPrefixesVariable;
            return this;
        }

        /**
         * @param maxNumberOfPrefixesVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder maxNumberOfPrefixesVariable(String maxNumberOfPrefixesVariable) {
            return maxNumberOfPrefixesVariable(Output.of(maxNumberOfPrefixesVariable));
        }

        public Builder outRoutePolicyId(@Nullable Output<String> outRoutePolicyId) {
            $.outRoutePolicyId = outRoutePolicyId;
            return this;
        }

        public Builder outRoutePolicyId(String outRoutePolicyId) {
            return outRoutePolicyId(Output.of(outRoutePolicyId));
        }

        /**
         * @param policyType Neighbor received maximum prefix policy is disabled.
         * 
         * @return builder
         * 
         */
        public Builder policyType(@Nullable Output<String> policyType) {
            $.policyType = policyType;
            return this;
        }

        /**
         * @param policyType Neighbor received maximum prefix policy is disabled.
         * 
         * @return builder
         * 
         */
        public Builder policyType(String policyType) {
            return policyType(Output.of(policyType));
        }

        /**
         * @param restartInterval Set the restart interval(minutes) when to restart BGP connection if threshold is exceeded
         *   - Range: `1`-`65535`
         * 
         * @return builder
         * 
         */
        public Builder restartInterval(@Nullable Output<Integer> restartInterval) {
            $.restartInterval = restartInterval;
            return this;
        }

        /**
         * @param restartInterval Set the restart interval(minutes) when to restart BGP connection if threshold is exceeded
         *   - Range: `1`-`65535`
         * 
         * @return builder
         * 
         */
        public Builder restartInterval(Integer restartInterval) {
            return restartInterval(Output.of(restartInterval));
        }

        /**
         * @param restartIntervalVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder restartIntervalVariable(@Nullable Output<String> restartIntervalVariable) {
            $.restartIntervalVariable = restartIntervalVariable;
            return this;
        }

        /**
         * @param restartIntervalVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder restartIntervalVariable(String restartIntervalVariable) {
            return restartIntervalVariable(Output.of(restartIntervalVariable));
        }

        /**
         * @param threshold Set threshold(1 to 100) at which to generate a warning message
         *   - Range: `1`-`100`
         *   - Default value: `75`
         * 
         * @return builder
         * 
         */
        public Builder threshold(@Nullable Output<Integer> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold Set threshold(1 to 100) at which to generate a warning message
         *   - Range: `1`-`100`
         *   - Default value: `75`
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

        public ServiceRoutingBgpFeatureIpv4NeighborAddressFamilyArgs build() {
            return $;
        }
    }

}
