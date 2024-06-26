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


public final class CellularControllerFeatureTemplateDataProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final CellularControllerFeatureTemplateDataProfileArgs Empty = new CellularControllerFeatureTemplateDataProfileArgs();

    /**
     * Set attach profile
     *   - Range: `1`-`16`
     * 
     */
    @Import(name="attachProfile")
    private @Nullable Output<Integer> attachProfile;

    /**
     * @return Set attach profile
     *   - Range: `1`-`16`
     * 
     */
    public Optional<Output<Integer>> attachProfile() {
        return Optional.ofNullable(this.attachProfile);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="attachProfileVariable")
    private @Nullable Output<String> attachProfileVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> attachProfileVariable() {
        return Optional.ofNullable(this.attachProfileVariable);
    }

    /**
     * Set data profile
     *   - Range: `1`-`16`
     * 
     */
    @Import(name="dataProfile")
    private @Nullable Output<Integer> dataProfile;

    /**
     * @return Set data profile
     *   - Range: `1`-`16`
     * 
     */
    public Optional<Output<Integer>> dataProfile() {
        return Optional.ofNullable(this.dataProfile);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="dataProfileVariable")
    private @Nullable Output<String> dataProfileVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> dataProfileVariable() {
        return Optional.ofNullable(this.dataProfileVariable);
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
     * Set slot number
     *   - Range: `0`-`1`
     * 
     */
    @Import(name="slotNumber")
    private @Nullable Output<Integer> slotNumber;

    /**
     * @return Set slot number
     *   - Range: `0`-`1`
     * 
     */
    public Optional<Output<Integer>> slotNumber() {
        return Optional.ofNullable(this.slotNumber);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="slotNumberVariable")
    private @Nullable Output<String> slotNumberVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> slotNumberVariable() {
        return Optional.ofNullable(this.slotNumberVariable);
    }

    private CellularControllerFeatureTemplateDataProfileArgs() {}

    private CellularControllerFeatureTemplateDataProfileArgs(CellularControllerFeatureTemplateDataProfileArgs $) {
        this.attachProfile = $.attachProfile;
        this.attachProfileVariable = $.attachProfileVariable;
        this.dataProfile = $.dataProfile;
        this.dataProfileVariable = $.dataProfileVariable;
        this.optional = $.optional;
        this.slotNumber = $.slotNumber;
        this.slotNumberVariable = $.slotNumberVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CellularControllerFeatureTemplateDataProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CellularControllerFeatureTemplateDataProfileArgs $;

        public Builder() {
            $ = new CellularControllerFeatureTemplateDataProfileArgs();
        }

        public Builder(CellularControllerFeatureTemplateDataProfileArgs defaults) {
            $ = new CellularControllerFeatureTemplateDataProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attachProfile Set attach profile
         *   - Range: `1`-`16`
         * 
         * @return builder
         * 
         */
        public Builder attachProfile(@Nullable Output<Integer> attachProfile) {
            $.attachProfile = attachProfile;
            return this;
        }

        /**
         * @param attachProfile Set attach profile
         *   - Range: `1`-`16`
         * 
         * @return builder
         * 
         */
        public Builder attachProfile(Integer attachProfile) {
            return attachProfile(Output.of(attachProfile));
        }

        /**
         * @param attachProfileVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder attachProfileVariable(@Nullable Output<String> attachProfileVariable) {
            $.attachProfileVariable = attachProfileVariable;
            return this;
        }

        /**
         * @param attachProfileVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder attachProfileVariable(String attachProfileVariable) {
            return attachProfileVariable(Output.of(attachProfileVariable));
        }

        /**
         * @param dataProfile Set data profile
         *   - Range: `1`-`16`
         * 
         * @return builder
         * 
         */
        public Builder dataProfile(@Nullable Output<Integer> dataProfile) {
            $.dataProfile = dataProfile;
            return this;
        }

        /**
         * @param dataProfile Set data profile
         *   - Range: `1`-`16`
         * 
         * @return builder
         * 
         */
        public Builder dataProfile(Integer dataProfile) {
            return dataProfile(Output.of(dataProfile));
        }

        /**
         * @param dataProfileVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder dataProfileVariable(@Nullable Output<String> dataProfileVariable) {
            $.dataProfileVariable = dataProfileVariable;
            return this;
        }

        /**
         * @param dataProfileVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder dataProfileVariable(String dataProfileVariable) {
            return dataProfileVariable(Output.of(dataProfileVariable));
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
         * @param slotNumber Set slot number
         *   - Range: `0`-`1`
         * 
         * @return builder
         * 
         */
        public Builder slotNumber(@Nullable Output<Integer> slotNumber) {
            $.slotNumber = slotNumber;
            return this;
        }

        /**
         * @param slotNumber Set slot number
         *   - Range: `0`-`1`
         * 
         * @return builder
         * 
         */
        public Builder slotNumber(Integer slotNumber) {
            return slotNumber(Output.of(slotNumber));
        }

        /**
         * @param slotNumberVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder slotNumberVariable(@Nullable Output<String> slotNumberVariable) {
            $.slotNumberVariable = slotNumberVariable;
            return this;
        }

        /**
         * @param slotNumberVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder slotNumberVariable(String slotNumberVariable) {
            return slotNumberVariable(Output.of(slotNumberVariable));
        }

        public CellularControllerFeatureTemplateDataProfileArgs build() {
            return $;
        }
    }

}
