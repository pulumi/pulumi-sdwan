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


public final class CiscoVpnFeatureTemplateNatPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final CiscoVpnFeatureTemplateNatPoolArgs Empty = new CiscoVpnFeatureTemplateNatPoolArgs();

    /**
     * Direction of NAT translation
     *   - Choices: `inside`, `outside`
     * 
     */
    @Import(name="direction")
    private @Nullable Output<String> direction;

    /**
     * @return Direction of NAT translation
     *   - Choices: `inside`, `outside`
     * 
     */
    public Optional<Output<String>> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="directionVariable")
    private @Nullable Output<String> directionVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> directionVariable() {
        return Optional.ofNullable(this.directionVariable);
    }

    /**
     * NAT Pool Name, natpool1..31
     *   - Range: `1`-`31`
     * 
     */
    @Import(name="name")
    private @Nullable Output<Integer> name;

    /**
     * @return NAT Pool Name, natpool1..31
     *   - Range: `1`-`31`
     * 
     */
    public Optional<Output<Integer>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="nameVariable")
    private @Nullable Output<String> nameVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> nameVariable() {
        return Optional.ofNullable(this.nameVariable);
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
     * Enable port translation(PAT)
     *   - Default value: `true`
     * 
     */
    @Import(name="overload")
    private @Nullable Output<Boolean> overload;

    /**
     * @return Enable port translation(PAT)
     *   - Default value: `true`
     * 
     */
    public Optional<Output<Boolean>> overload() {
        return Optional.ofNullable(this.overload);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="overloadVariable")
    private @Nullable Output<String> overloadVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> overloadVariable() {
        return Optional.ofNullable(this.overloadVariable);
    }

    /**
     * Ending IP address of NAT Pool Prefix Length
     *   - Range: `1`-`32`
     * 
     */
    @Import(name="prefixLength")
    private @Nullable Output<Integer> prefixLength;

    /**
     * @return Ending IP address of NAT Pool Prefix Length
     *   - Range: `1`-`32`
     * 
     */
    public Optional<Output<Integer>> prefixLength() {
        return Optional.ofNullable(this.prefixLength);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="prefixLengthVariable")
    private @Nullable Output<String> prefixLengthVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> prefixLengthVariable() {
        return Optional.ofNullable(this.prefixLengthVariable);
    }

    /**
     * Ending IP address of NAT pool range
     * 
     */
    @Import(name="rangeEnd")
    private @Nullable Output<String> rangeEnd;

    /**
     * @return Ending IP address of NAT pool range
     * 
     */
    public Optional<Output<String>> rangeEnd() {
        return Optional.ofNullable(this.rangeEnd);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="rangeEndVariable")
    private @Nullable Output<String> rangeEndVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> rangeEndVariable() {
        return Optional.ofNullable(this.rangeEndVariable);
    }

    /**
     * Starting IP address of NAT pool range
     * 
     */
    @Import(name="rangeStart")
    private @Nullable Output<String> rangeStart;

    /**
     * @return Starting IP address of NAT pool range
     * 
     */
    public Optional<Output<String>> rangeStart() {
        return Optional.ofNullable(this.rangeStart);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="rangeStartVariable")
    private @Nullable Output<String> rangeStartVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> rangeStartVariable() {
        return Optional.ofNullable(this.rangeStartVariable);
    }

    /**
     * Add Object/Object Group Tracker
     *   - Range: `1`-`1000`
     * 
     */
    @Import(name="trackerId")
    private @Nullable Output<Integer> trackerId;

    /**
     * @return Add Object/Object Group Tracker
     *   - Range: `1`-`1000`
     * 
     */
    public Optional<Output<Integer>> trackerId() {
        return Optional.ofNullable(this.trackerId);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="trackerIdVariable")
    private @Nullable Output<String> trackerIdVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> trackerIdVariable() {
        return Optional.ofNullable(this.trackerIdVariable);
    }

    private CiscoVpnFeatureTemplateNatPoolArgs() {}

    private CiscoVpnFeatureTemplateNatPoolArgs(CiscoVpnFeatureTemplateNatPoolArgs $) {
        this.direction = $.direction;
        this.directionVariable = $.directionVariable;
        this.name = $.name;
        this.nameVariable = $.nameVariable;
        this.optional = $.optional;
        this.overload = $.overload;
        this.overloadVariable = $.overloadVariable;
        this.prefixLength = $.prefixLength;
        this.prefixLengthVariable = $.prefixLengthVariable;
        this.rangeEnd = $.rangeEnd;
        this.rangeEndVariable = $.rangeEndVariable;
        this.rangeStart = $.rangeStart;
        this.rangeStartVariable = $.rangeStartVariable;
        this.trackerId = $.trackerId;
        this.trackerIdVariable = $.trackerIdVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CiscoVpnFeatureTemplateNatPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CiscoVpnFeatureTemplateNatPoolArgs $;

        public Builder() {
            $ = new CiscoVpnFeatureTemplateNatPoolArgs();
        }

        public Builder(CiscoVpnFeatureTemplateNatPoolArgs defaults) {
            $ = new CiscoVpnFeatureTemplateNatPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param direction Direction of NAT translation
         *   - Choices: `inside`, `outside`
         * 
         * @return builder
         * 
         */
        public Builder direction(@Nullable Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction Direction of NAT translation
         *   - Choices: `inside`, `outside`
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param directionVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder directionVariable(@Nullable Output<String> directionVariable) {
            $.directionVariable = directionVariable;
            return this;
        }

        /**
         * @param directionVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder directionVariable(String directionVariable) {
            return directionVariable(Output.of(directionVariable));
        }

        /**
         * @param name NAT Pool Name, natpool1..31
         *   - Range: `1`-`31`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<Integer> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name NAT Pool Name, natpool1..31
         *   - Range: `1`-`31`
         * 
         * @return builder
         * 
         */
        public Builder name(Integer name) {
            return name(Output.of(name));
        }

        /**
         * @param nameVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder nameVariable(@Nullable Output<String> nameVariable) {
            $.nameVariable = nameVariable;
            return this;
        }

        /**
         * @param nameVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder nameVariable(String nameVariable) {
            return nameVariable(Output.of(nameVariable));
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
         * @param overload Enable port translation(PAT)
         *   - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder overload(@Nullable Output<Boolean> overload) {
            $.overload = overload;
            return this;
        }

        /**
         * @param overload Enable port translation(PAT)
         *   - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder overload(Boolean overload) {
            return overload(Output.of(overload));
        }

        /**
         * @param overloadVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder overloadVariable(@Nullable Output<String> overloadVariable) {
            $.overloadVariable = overloadVariable;
            return this;
        }

        /**
         * @param overloadVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder overloadVariable(String overloadVariable) {
            return overloadVariable(Output.of(overloadVariable));
        }

        /**
         * @param prefixLength Ending IP address of NAT Pool Prefix Length
         *   - Range: `1`-`32`
         * 
         * @return builder
         * 
         */
        public Builder prefixLength(@Nullable Output<Integer> prefixLength) {
            $.prefixLength = prefixLength;
            return this;
        }

        /**
         * @param prefixLength Ending IP address of NAT Pool Prefix Length
         *   - Range: `1`-`32`
         * 
         * @return builder
         * 
         */
        public Builder prefixLength(Integer prefixLength) {
            return prefixLength(Output.of(prefixLength));
        }

        /**
         * @param prefixLengthVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder prefixLengthVariable(@Nullable Output<String> prefixLengthVariable) {
            $.prefixLengthVariable = prefixLengthVariable;
            return this;
        }

        /**
         * @param prefixLengthVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder prefixLengthVariable(String prefixLengthVariable) {
            return prefixLengthVariable(Output.of(prefixLengthVariable));
        }

        /**
         * @param rangeEnd Ending IP address of NAT pool range
         * 
         * @return builder
         * 
         */
        public Builder rangeEnd(@Nullable Output<String> rangeEnd) {
            $.rangeEnd = rangeEnd;
            return this;
        }

        /**
         * @param rangeEnd Ending IP address of NAT pool range
         * 
         * @return builder
         * 
         */
        public Builder rangeEnd(String rangeEnd) {
            return rangeEnd(Output.of(rangeEnd));
        }

        /**
         * @param rangeEndVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder rangeEndVariable(@Nullable Output<String> rangeEndVariable) {
            $.rangeEndVariable = rangeEndVariable;
            return this;
        }

        /**
         * @param rangeEndVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder rangeEndVariable(String rangeEndVariable) {
            return rangeEndVariable(Output.of(rangeEndVariable));
        }

        /**
         * @param rangeStart Starting IP address of NAT pool range
         * 
         * @return builder
         * 
         */
        public Builder rangeStart(@Nullable Output<String> rangeStart) {
            $.rangeStart = rangeStart;
            return this;
        }

        /**
         * @param rangeStart Starting IP address of NAT pool range
         * 
         * @return builder
         * 
         */
        public Builder rangeStart(String rangeStart) {
            return rangeStart(Output.of(rangeStart));
        }

        /**
         * @param rangeStartVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder rangeStartVariable(@Nullable Output<String> rangeStartVariable) {
            $.rangeStartVariable = rangeStartVariable;
            return this;
        }

        /**
         * @param rangeStartVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder rangeStartVariable(String rangeStartVariable) {
            return rangeStartVariable(Output.of(rangeStartVariable));
        }

        /**
         * @param trackerId Add Object/Object Group Tracker
         *   - Range: `1`-`1000`
         * 
         * @return builder
         * 
         */
        public Builder trackerId(@Nullable Output<Integer> trackerId) {
            $.trackerId = trackerId;
            return this;
        }

        /**
         * @param trackerId Add Object/Object Group Tracker
         *   - Range: `1`-`1000`
         * 
         * @return builder
         * 
         */
        public Builder trackerId(Integer trackerId) {
            return trackerId(Output.of(trackerId));
        }

        /**
         * @param trackerIdVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder trackerIdVariable(@Nullable Output<String> trackerIdVariable) {
            $.trackerIdVariable = trackerIdVariable;
            return this;
        }

        /**
         * @param trackerIdVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder trackerIdVariable(String trackerIdVariable) {
            return trackerIdVariable(Output.of(trackerIdVariable));
        }

        public CiscoVpnFeatureTemplateNatPoolArgs build() {
            return $;
        }
    }

}
