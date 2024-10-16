// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ColorListPolicyObjectEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final ColorListPolicyObjectEntryArgs Empty = new ColorListPolicyObjectEntryArgs();

    /**
     * Color
     *   - Choices: `default`, `3g`, `biz-internet`, `blue`, `bronze`, `custom1`, `custom2`, `custom3`, `gold`, `green`, `lte`, `metro-ethernet`, `mpls`, `private1`, `private2`, `private3`, `private4`, `private5`, `private6`, `public-internet`, `red`, `silver`
     * 
     */
    @Import(name="color", required=true)
    private Output<String> color;

    /**
     * @return Color
     *   - Choices: `default`, `3g`, `biz-internet`, `blue`, `bronze`, `custom1`, `custom2`, `custom3`, `gold`, `green`, `lte`, `metro-ethernet`, `mpls`, `private1`, `private2`, `private3`, `private4`, `private5`, `private6`, `public-internet`, `red`, `silver`
     * 
     */
    public Output<String> color() {
        return this.color;
    }

    private ColorListPolicyObjectEntryArgs() {}

    private ColorListPolicyObjectEntryArgs(ColorListPolicyObjectEntryArgs $) {
        this.color = $.color;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ColorListPolicyObjectEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ColorListPolicyObjectEntryArgs $;

        public Builder() {
            $ = new ColorListPolicyObjectEntryArgs();
        }

        public Builder(ColorListPolicyObjectEntryArgs defaults) {
            $ = new ColorListPolicyObjectEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param color Color
         *   - Choices: `default`, `3g`, `biz-internet`, `blue`, `bronze`, `custom1`, `custom2`, `custom3`, `gold`, `green`, `lte`, `metro-ethernet`, `mpls`, `private1`, `private2`, `private3`, `private4`, `private5`, `private6`, `public-internet`, `red`, `silver`
         * 
         * @return builder
         * 
         */
        public Builder color(Output<String> color) {
            $.color = color;
            return this;
        }

        /**
         * @param color Color
         *   - Choices: `default`, `3g`, `biz-internet`, `blue`, `bronze`, `custom1`, `custom2`, `custom3`, `gold`, `green`, `lte`, `metro-ethernet`, `mpls`, `private1`, `private2`, `private3`, `private4`, `private5`, `private6`, `public-internet`, `red`, `silver`
         * 
         * @return builder
         * 
         */
        public Builder color(String color) {
            return color(Output.of(color));
        }

        public ColorListPolicyObjectEntryArgs build() {
            if ($.color == null) {
                throw new MissingRequiredPropertyException("ColorListPolicyObjectEntryArgs", "color");
            }
            return $;
        }
    }

}
