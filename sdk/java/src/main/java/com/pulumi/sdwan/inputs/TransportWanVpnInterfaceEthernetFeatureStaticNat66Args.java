// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransportWanVpnInterfaceEthernetFeatureStaticNat66Args extends com.pulumi.resources.ResourceArgs {

    public static final TransportWanVpnInterfaceEthernetFeatureStaticNat66Args Empty = new TransportWanVpnInterfaceEthernetFeatureStaticNat66Args();

    /**
     * Source Prefix
     * 
     */
    @Import(name="sourcePrefix")
    private @Nullable Output<String> sourcePrefix;

    /**
     * @return Source Prefix
     * 
     */
    public Optional<Output<String>> sourcePrefix() {
        return Optional.ofNullable(this.sourcePrefix);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="sourcePrefixVariable")
    private @Nullable Output<String> sourcePrefixVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> sourcePrefixVariable() {
        return Optional.ofNullable(this.sourcePrefixVariable);
    }

    /**
     * Source VPN ID
     *   - Range: `0`-`65530`
     * 
     */
    @Import(name="sourceVpnId")
    private @Nullable Output<Integer> sourceVpnId;

    /**
     * @return Source VPN ID
     *   - Range: `0`-`65530`
     * 
     */
    public Optional<Output<Integer>> sourceVpnId() {
        return Optional.ofNullable(this.sourceVpnId);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="sourceVpnIdVariable")
    private @Nullable Output<String> sourceVpnIdVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> sourceVpnIdVariable() {
        return Optional.ofNullable(this.sourceVpnIdVariable);
    }

    /**
     * Translated Source Prefix
     * 
     */
    @Import(name="translatedSourcePrefix")
    private @Nullable Output<String> translatedSourcePrefix;

    /**
     * @return Translated Source Prefix
     * 
     */
    public Optional<Output<String>> translatedSourcePrefix() {
        return Optional.ofNullable(this.translatedSourcePrefix);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="translatedSourcePrefixVariable")
    private @Nullable Output<String> translatedSourcePrefixVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> translatedSourcePrefixVariable() {
        return Optional.ofNullable(this.translatedSourcePrefixVariable);
    }

    private TransportWanVpnInterfaceEthernetFeatureStaticNat66Args() {}

    private TransportWanVpnInterfaceEthernetFeatureStaticNat66Args(TransportWanVpnInterfaceEthernetFeatureStaticNat66Args $) {
        this.sourcePrefix = $.sourcePrefix;
        this.sourcePrefixVariable = $.sourcePrefixVariable;
        this.sourceVpnId = $.sourceVpnId;
        this.sourceVpnIdVariable = $.sourceVpnIdVariable;
        this.translatedSourcePrefix = $.translatedSourcePrefix;
        this.translatedSourcePrefixVariable = $.translatedSourcePrefixVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransportWanVpnInterfaceEthernetFeatureStaticNat66Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransportWanVpnInterfaceEthernetFeatureStaticNat66Args $;

        public Builder() {
            $ = new TransportWanVpnInterfaceEthernetFeatureStaticNat66Args();
        }

        public Builder(TransportWanVpnInterfaceEthernetFeatureStaticNat66Args defaults) {
            $ = new TransportWanVpnInterfaceEthernetFeatureStaticNat66Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param sourcePrefix Source Prefix
         * 
         * @return builder
         * 
         */
        public Builder sourcePrefix(@Nullable Output<String> sourcePrefix) {
            $.sourcePrefix = sourcePrefix;
            return this;
        }

        /**
         * @param sourcePrefix Source Prefix
         * 
         * @return builder
         * 
         */
        public Builder sourcePrefix(String sourcePrefix) {
            return sourcePrefix(Output.of(sourcePrefix));
        }

        /**
         * @param sourcePrefixVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder sourcePrefixVariable(@Nullable Output<String> sourcePrefixVariable) {
            $.sourcePrefixVariable = sourcePrefixVariable;
            return this;
        }

        /**
         * @param sourcePrefixVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder sourcePrefixVariable(String sourcePrefixVariable) {
            return sourcePrefixVariable(Output.of(sourcePrefixVariable));
        }

        /**
         * @param sourceVpnId Source VPN ID
         *   - Range: `0`-`65530`
         * 
         * @return builder
         * 
         */
        public Builder sourceVpnId(@Nullable Output<Integer> sourceVpnId) {
            $.sourceVpnId = sourceVpnId;
            return this;
        }

        /**
         * @param sourceVpnId Source VPN ID
         *   - Range: `0`-`65530`
         * 
         * @return builder
         * 
         */
        public Builder sourceVpnId(Integer sourceVpnId) {
            return sourceVpnId(Output.of(sourceVpnId));
        }

        /**
         * @param sourceVpnIdVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder sourceVpnIdVariable(@Nullable Output<String> sourceVpnIdVariable) {
            $.sourceVpnIdVariable = sourceVpnIdVariable;
            return this;
        }

        /**
         * @param sourceVpnIdVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder sourceVpnIdVariable(String sourceVpnIdVariable) {
            return sourceVpnIdVariable(Output.of(sourceVpnIdVariable));
        }

        /**
         * @param translatedSourcePrefix Translated Source Prefix
         * 
         * @return builder
         * 
         */
        public Builder translatedSourcePrefix(@Nullable Output<String> translatedSourcePrefix) {
            $.translatedSourcePrefix = translatedSourcePrefix;
            return this;
        }

        /**
         * @param translatedSourcePrefix Translated Source Prefix
         * 
         * @return builder
         * 
         */
        public Builder translatedSourcePrefix(String translatedSourcePrefix) {
            return translatedSourcePrefix(Output.of(translatedSourcePrefix));
        }

        /**
         * @param translatedSourcePrefixVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder translatedSourcePrefixVariable(@Nullable Output<String> translatedSourcePrefixVariable) {
            $.translatedSourcePrefixVariable = translatedSourcePrefixVariable;
            return this;
        }

        /**
         * @param translatedSourcePrefixVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder translatedSourcePrefixVariable(String translatedSourcePrefixVariable) {
            return translatedSourcePrefixVariable(Output.of(translatedSourcePrefixVariable));
        }

        public TransportWanVpnInterfaceEthernetFeatureStaticNat66Args build() {
            return $;
        }
    }

}
