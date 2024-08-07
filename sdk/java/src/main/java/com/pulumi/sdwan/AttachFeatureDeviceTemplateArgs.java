// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.inputs.AttachFeatureDeviceTemplateDeviceArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AttachFeatureDeviceTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final AttachFeatureDeviceTemplateArgs Empty = new AttachFeatureDeviceTemplateArgs();

    /**
     * Devices
     * 
     */
    @Import(name="devices", required=true)
    private Output<List<AttachFeatureDeviceTemplateDeviceArgs>> devices;

    /**
     * @return Devices
     * 
     */
    public Output<List<AttachFeatureDeviceTemplateDeviceArgs>> devices() {
        return this.devices;
    }

    /**
     * The version of the device template
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return The version of the device template
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private AttachFeatureDeviceTemplateArgs() {}

    private AttachFeatureDeviceTemplateArgs(AttachFeatureDeviceTemplateArgs $) {
        this.devices = $.devices;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttachFeatureDeviceTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttachFeatureDeviceTemplateArgs $;

        public Builder() {
            $ = new AttachFeatureDeviceTemplateArgs();
        }

        public Builder(AttachFeatureDeviceTemplateArgs defaults) {
            $ = new AttachFeatureDeviceTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param devices Devices
         * 
         * @return builder
         * 
         */
        public Builder devices(Output<List<AttachFeatureDeviceTemplateDeviceArgs>> devices) {
            $.devices = devices;
            return this;
        }

        /**
         * @param devices Devices
         * 
         * @return builder
         * 
         */
        public Builder devices(List<AttachFeatureDeviceTemplateDeviceArgs> devices) {
            return devices(Output.of(devices));
        }

        /**
         * @param devices Devices
         * 
         * @return builder
         * 
         */
        public Builder devices(AttachFeatureDeviceTemplateDeviceArgs... devices) {
            return devices(List.of(devices));
        }

        /**
         * @param version The version of the device template
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the device template
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public AttachFeatureDeviceTemplateArgs build() {
            if ($.devices == null) {
                throw new MissingRequiredPropertyException("AttachFeatureDeviceTemplateArgs", "devices");
            }
            return $;
        }
    }

}
