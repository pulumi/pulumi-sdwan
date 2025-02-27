// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDevicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDevicePlainArgs Empty = new GetDevicePlainArgs();

    /**
     * The hostname of a device
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The hostname of a device
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Serial number for device. Could be board or virtual identifier
     * 
     */
    @Import(name="serialNumber")
    private @Nullable String serialNumber;

    /**
     * @return Serial number for device. Could be board or virtual identifier
     * 
     */
    public Optional<String> serialNumber() {
        return Optional.ofNullable(this.serialNumber);
    }

    private GetDevicePlainArgs() {}

    private GetDevicePlainArgs(GetDevicePlainArgs $) {
        this.name = $.name;
        this.serialNumber = $.serialNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDevicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDevicePlainArgs $;

        public Builder() {
            $ = new GetDevicePlainArgs();
        }

        public Builder(GetDevicePlainArgs defaults) {
            $ = new GetDevicePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The hostname of a device
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param serialNumber Serial number for device. Could be board or virtual identifier
         * 
         * @return builder
         * 
         */
        public Builder serialNumber(@Nullable String serialNumber) {
            $.serialNumber = serialNumber;
            return this;
        }

        public GetDevicePlainArgs build() {
            return $;
        }
    }

}
