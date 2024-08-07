// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCiscoWirelessLanFeatureTemplateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCiscoWirelessLanFeatureTemplateArgs Empty = new GetCiscoWirelessLanFeatureTemplateArgs();

    /**
     * The id of the feature template
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The id of the feature template
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
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

    private GetCiscoWirelessLanFeatureTemplateArgs() {}

    private GetCiscoWirelessLanFeatureTemplateArgs(GetCiscoWirelessLanFeatureTemplateArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCiscoWirelessLanFeatureTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCiscoWirelessLanFeatureTemplateArgs $;

        public Builder() {
            $ = new GetCiscoWirelessLanFeatureTemplateArgs();
        }

        public Builder(GetCiscoWirelessLanFeatureTemplateArgs defaults) {
            $ = new GetCiscoWirelessLanFeatureTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The id of the feature template
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The id of the feature template
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
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

        public GetCiscoWirelessLanFeatureTemplateArgs build() {
            return $;
        }
    }

}
