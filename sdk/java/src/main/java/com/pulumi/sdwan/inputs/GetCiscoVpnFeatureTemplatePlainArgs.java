// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCiscoVpnFeatureTemplatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCiscoVpnFeatureTemplatePlainArgs Empty = new GetCiscoVpnFeatureTemplatePlainArgs();

    /**
     * The id of the feature template
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The id of the feature template
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the feature template
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the feature template
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetCiscoVpnFeatureTemplatePlainArgs() {}

    private GetCiscoVpnFeatureTemplatePlainArgs(GetCiscoVpnFeatureTemplatePlainArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCiscoVpnFeatureTemplatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCiscoVpnFeatureTemplatePlainArgs $;

        public Builder() {
            $ = new GetCiscoVpnFeatureTemplatePlainArgs();
        }

        public Builder(GetCiscoVpnFeatureTemplatePlainArgs defaults) {
            $ = new GetCiscoVpnFeatureTemplatePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The id of the feature template
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The name of the feature template
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetCiscoVpnFeatureTemplatePlainArgs build() {
            return $;
        }
    }

}
