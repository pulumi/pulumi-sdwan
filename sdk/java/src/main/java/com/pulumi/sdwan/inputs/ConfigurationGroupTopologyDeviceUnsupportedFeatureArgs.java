// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationGroupTopologyDeviceUnsupportedFeatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationGroupTopologyDeviceUnsupportedFeatureArgs Empty = new ConfigurationGroupTopologyDeviceUnsupportedFeatureArgs();

    /**
     * Parcel ID
     * 
     */
    @Import(name="parcelId")
    private @Nullable Output<String> parcelId;

    /**
     * @return Parcel ID
     * 
     */
    public Optional<Output<String>> parcelId() {
        return Optional.ofNullable(this.parcelId);
    }

    /**
     * Parcel type
     *   - Choices: `wan/vpn/interface/gre`, `wan/vpn/interface/ethernet`, `wan/vpn/interface/cellular`, `wan/vpn/interface/ipsec`, `wan/vpn/interface/serial`, `routing/ospf`, `lan/vpn/interface/ethernet`, `lan/vpn/interface/svi`, `lan/vpn/interface/ipsec`, `lan/vpn`
     * 
     */
    @Import(name="parcelType")
    private @Nullable Output<String> parcelType;

    /**
     * @return Parcel type
     *   - Choices: `wan/vpn/interface/gre`, `wan/vpn/interface/ethernet`, `wan/vpn/interface/cellular`, `wan/vpn/interface/ipsec`, `wan/vpn/interface/serial`, `routing/ospf`, `lan/vpn/interface/ethernet`, `lan/vpn/interface/svi`, `lan/vpn/interface/ipsec`, `lan/vpn`
     * 
     */
    public Optional<Output<String>> parcelType() {
        return Optional.ofNullable(this.parcelType);
    }

    private ConfigurationGroupTopologyDeviceUnsupportedFeatureArgs() {}

    private ConfigurationGroupTopologyDeviceUnsupportedFeatureArgs(ConfigurationGroupTopologyDeviceUnsupportedFeatureArgs $) {
        this.parcelId = $.parcelId;
        this.parcelType = $.parcelType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationGroupTopologyDeviceUnsupportedFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationGroupTopologyDeviceUnsupportedFeatureArgs $;

        public Builder() {
            $ = new ConfigurationGroupTopologyDeviceUnsupportedFeatureArgs();
        }

        public Builder(ConfigurationGroupTopologyDeviceUnsupportedFeatureArgs defaults) {
            $ = new ConfigurationGroupTopologyDeviceUnsupportedFeatureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parcelId Parcel ID
         * 
         * @return builder
         * 
         */
        public Builder parcelId(@Nullable Output<String> parcelId) {
            $.parcelId = parcelId;
            return this;
        }

        /**
         * @param parcelId Parcel ID
         * 
         * @return builder
         * 
         */
        public Builder parcelId(String parcelId) {
            return parcelId(Output.of(parcelId));
        }

        /**
         * @param parcelType Parcel type
         *   - Choices: `wan/vpn/interface/gre`, `wan/vpn/interface/ethernet`, `wan/vpn/interface/cellular`, `wan/vpn/interface/ipsec`, `wan/vpn/interface/serial`, `routing/ospf`, `lan/vpn/interface/ethernet`, `lan/vpn/interface/svi`, `lan/vpn/interface/ipsec`, `lan/vpn`
         * 
         * @return builder
         * 
         */
        public Builder parcelType(@Nullable Output<String> parcelType) {
            $.parcelType = parcelType;
            return this;
        }

        /**
         * @param parcelType Parcel type
         *   - Choices: `wan/vpn/interface/gre`, `wan/vpn/interface/ethernet`, `wan/vpn/interface/cellular`, `wan/vpn/interface/ipsec`, `wan/vpn/interface/serial`, `routing/ospf`, `lan/vpn/interface/ethernet`, `lan/vpn/interface/svi`, `lan/vpn/interface/ipsec`, `lan/vpn`
         * 
         * @return builder
         * 
         */
        public Builder parcelType(String parcelType) {
            return parcelType(Output.of(parcelType));
        }

        public ConfigurationGroupTopologyDeviceUnsupportedFeatureArgs build() {
            return $;
        }
    }

}
