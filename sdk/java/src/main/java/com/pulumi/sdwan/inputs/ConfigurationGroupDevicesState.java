// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sdwan.inputs.ConfigurationGroupDevicesDeviceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationGroupDevicesState extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationGroupDevicesState Empty = new ConfigurationGroupDevicesState();

    /**
     * Configuration Group ID
     * 
     */
    @Import(name="configurationGroupId")
    private @Nullable Output<String> configurationGroupId;

    /**
     * @return Configuration Group ID
     * 
     */
    public Optional<Output<String>> configurationGroupId() {
        return Optional.ofNullable(this.configurationGroupId);
    }

    /**
     * List of devices
     * 
     */
    @Import(name="devices")
    private @Nullable Output<List<ConfigurationGroupDevicesDeviceArgs>> devices;

    /**
     * @return List of devices
     * 
     */
    public Optional<Output<List<ConfigurationGroupDevicesDeviceArgs>>> devices() {
        return Optional.ofNullable(this.devices);
    }

    private ConfigurationGroupDevicesState() {}

    private ConfigurationGroupDevicesState(ConfigurationGroupDevicesState $) {
        this.configurationGroupId = $.configurationGroupId;
        this.devices = $.devices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationGroupDevicesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationGroupDevicesState $;

        public Builder() {
            $ = new ConfigurationGroupDevicesState();
        }

        public Builder(ConfigurationGroupDevicesState defaults) {
            $ = new ConfigurationGroupDevicesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationGroupId Configuration Group ID
         * 
         * @return builder
         * 
         */
        public Builder configurationGroupId(@Nullable Output<String> configurationGroupId) {
            $.configurationGroupId = configurationGroupId;
            return this;
        }

        /**
         * @param configurationGroupId Configuration Group ID
         * 
         * @return builder
         * 
         */
        public Builder configurationGroupId(String configurationGroupId) {
            return configurationGroupId(Output.of(configurationGroupId));
        }

        /**
         * @param devices List of devices
         * 
         * @return builder
         * 
         */
        public Builder devices(@Nullable Output<List<ConfigurationGroupDevicesDeviceArgs>> devices) {
            $.devices = devices;
            return this;
        }

        /**
         * @param devices List of devices
         * 
         * @return builder
         * 
         */
        public Builder devices(List<ConfigurationGroupDevicesDeviceArgs> devices) {
            return devices(Output.of(devices));
        }

        /**
         * @param devices List of devices
         * 
         * @return builder
         * 
         */
        public Builder devices(ConfigurationGroupDevicesDeviceArgs... devices) {
            return devices(List.of(devices));
        }

        public ConfigurationGroupDevicesState build() {
            return $;
        }
    }

}
