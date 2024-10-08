// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceRoutingBgpFeatureIpv6AggregateAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceRoutingBgpFeatureIpv6AggregateAddressArgs Empty = new ServiceRoutingBgpFeatureIpv6AggregateAddressArgs();

    /**
     * Configure the IPv6 prefixes to aggregate
     * 
     */
    @Import(name="aggregatePrefix")
    private @Nullable Output<String> aggregatePrefix;

    /**
     * @return Configure the IPv6 prefixes to aggregate
     * 
     */
    public Optional<Output<String>> aggregatePrefix() {
        return Optional.ofNullable(this.aggregatePrefix);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="aggregatePrefixVariable")
    private @Nullable Output<String> aggregatePrefixVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> aggregatePrefixVariable() {
        return Optional.ofNullable(this.aggregatePrefixVariable);
    }

    /**
     * Set AS set path information
     *   - Default value: `false`
     * 
     */
    @Import(name="asSetPath")
    private @Nullable Output<Boolean> asSetPath;

    /**
     * @return Set AS set path information
     *   - Default value: `false`
     * 
     */
    public Optional<Output<Boolean>> asSetPath() {
        return Optional.ofNullable(this.asSetPath);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="asSetPathVariable")
    private @Nullable Output<String> asSetPathVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> asSetPathVariable() {
        return Optional.ofNullable(this.asSetPathVariable);
    }

    /**
     * Filter out more specific routes from updates
     *   - Default value: `false`
     * 
     */
    @Import(name="summaryOnly")
    private @Nullable Output<Boolean> summaryOnly;

    /**
     * @return Filter out more specific routes from updates
     *   - Default value: `false`
     * 
     */
    public Optional<Output<Boolean>> summaryOnly() {
        return Optional.ofNullable(this.summaryOnly);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="summaryOnlyVariable")
    private @Nullable Output<String> summaryOnlyVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> summaryOnlyVariable() {
        return Optional.ofNullable(this.summaryOnlyVariable);
    }

    private ServiceRoutingBgpFeatureIpv6AggregateAddressArgs() {}

    private ServiceRoutingBgpFeatureIpv6AggregateAddressArgs(ServiceRoutingBgpFeatureIpv6AggregateAddressArgs $) {
        this.aggregatePrefix = $.aggregatePrefix;
        this.aggregatePrefixVariable = $.aggregatePrefixVariable;
        this.asSetPath = $.asSetPath;
        this.asSetPathVariable = $.asSetPathVariable;
        this.summaryOnly = $.summaryOnly;
        this.summaryOnlyVariable = $.summaryOnlyVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceRoutingBgpFeatureIpv6AggregateAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceRoutingBgpFeatureIpv6AggregateAddressArgs $;

        public Builder() {
            $ = new ServiceRoutingBgpFeatureIpv6AggregateAddressArgs();
        }

        public Builder(ServiceRoutingBgpFeatureIpv6AggregateAddressArgs defaults) {
            $ = new ServiceRoutingBgpFeatureIpv6AggregateAddressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregatePrefix Configure the IPv6 prefixes to aggregate
         * 
         * @return builder
         * 
         */
        public Builder aggregatePrefix(@Nullable Output<String> aggregatePrefix) {
            $.aggregatePrefix = aggregatePrefix;
            return this;
        }

        /**
         * @param aggregatePrefix Configure the IPv6 prefixes to aggregate
         * 
         * @return builder
         * 
         */
        public Builder aggregatePrefix(String aggregatePrefix) {
            return aggregatePrefix(Output.of(aggregatePrefix));
        }

        /**
         * @param aggregatePrefixVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder aggregatePrefixVariable(@Nullable Output<String> aggregatePrefixVariable) {
            $.aggregatePrefixVariable = aggregatePrefixVariable;
            return this;
        }

        /**
         * @param aggregatePrefixVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder aggregatePrefixVariable(String aggregatePrefixVariable) {
            return aggregatePrefixVariable(Output.of(aggregatePrefixVariable));
        }

        /**
         * @param asSetPath Set AS set path information
         *   - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder asSetPath(@Nullable Output<Boolean> asSetPath) {
            $.asSetPath = asSetPath;
            return this;
        }

        /**
         * @param asSetPath Set AS set path information
         *   - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder asSetPath(Boolean asSetPath) {
            return asSetPath(Output.of(asSetPath));
        }

        /**
         * @param asSetPathVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder asSetPathVariable(@Nullable Output<String> asSetPathVariable) {
            $.asSetPathVariable = asSetPathVariable;
            return this;
        }

        /**
         * @param asSetPathVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder asSetPathVariable(String asSetPathVariable) {
            return asSetPathVariable(Output.of(asSetPathVariable));
        }

        /**
         * @param summaryOnly Filter out more specific routes from updates
         *   - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder summaryOnly(@Nullable Output<Boolean> summaryOnly) {
            $.summaryOnly = summaryOnly;
            return this;
        }

        /**
         * @param summaryOnly Filter out more specific routes from updates
         *   - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder summaryOnly(Boolean summaryOnly) {
            return summaryOnly(Output.of(summaryOnly));
        }

        /**
         * @param summaryOnlyVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder summaryOnlyVariable(@Nullable Output<String> summaryOnlyVariable) {
            $.summaryOnlyVariable = summaryOnlyVariable;
            return this;
        }

        /**
         * @param summaryOnlyVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder summaryOnlyVariable(String summaryOnlyVariable) {
            return summaryOnlyVariable(Output.of(summaryOnlyVariable));
        }

        public ServiceRoutingBgpFeatureIpv6AggregateAddressArgs build() {
            return $;
        }
    }

}
