// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TlsSslDecryptionPolicyDefinitionNetworkRuleSourceAndDestinationConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TlsSslDecryptionPolicyDefinitionNetworkRuleSourceAndDestinationConfigurationArgs Empty = new TlsSslDecryptionPolicyDefinitionNetworkRuleSourceAndDestinationConfigurationArgs();

    /**
     * source / destination option
     *   - Choices: `sourceIp`, `sourcePort`, `destinationVpn`, `destinationIp`, `destinationPort`
     * 
     */
    @Import(name="option")
    private @Nullable Output<String> option;

    /**
     * @return source / destination option
     *   - Choices: `sourceIp`, `sourcePort`, `destinationVpn`, `destinationIp`, `destinationPort`
     * 
     */
    public Optional<Output<String>> option() {
        return Optional.ofNullable(this.option);
    }

    /**
     * source / destination option target
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return source / destination option target
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private TlsSslDecryptionPolicyDefinitionNetworkRuleSourceAndDestinationConfigurationArgs() {}

    private TlsSslDecryptionPolicyDefinitionNetworkRuleSourceAndDestinationConfigurationArgs(TlsSslDecryptionPolicyDefinitionNetworkRuleSourceAndDestinationConfigurationArgs $) {
        this.option = $.option;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TlsSslDecryptionPolicyDefinitionNetworkRuleSourceAndDestinationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsSslDecryptionPolicyDefinitionNetworkRuleSourceAndDestinationConfigurationArgs $;

        public Builder() {
            $ = new TlsSslDecryptionPolicyDefinitionNetworkRuleSourceAndDestinationConfigurationArgs();
        }

        public Builder(TlsSslDecryptionPolicyDefinitionNetworkRuleSourceAndDestinationConfigurationArgs defaults) {
            $ = new TlsSslDecryptionPolicyDefinitionNetworkRuleSourceAndDestinationConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param option source / destination option
         *   - Choices: `sourceIp`, `sourcePort`, `destinationVpn`, `destinationIp`, `destinationPort`
         * 
         * @return builder
         * 
         */
        public Builder option(@Nullable Output<String> option) {
            $.option = option;
            return this;
        }

        /**
         * @param option source / destination option
         *   - Choices: `sourceIp`, `sourcePort`, `destinationVpn`, `destinationIp`, `destinationPort`
         * 
         * @return builder
         * 
         */
        public Builder option(String option) {
            return option(Output.of(option));
        }

        /**
         * @param value source / destination option target
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value source / destination option target
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public TlsSslDecryptionPolicyDefinitionNetworkRuleSourceAndDestinationConfigurationArgs build() {
            return $;
        }
    }

}
