// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TransportWanVpnInterfaceEthernetFeatureStaticNat66 {
    /**
     * @return Source Prefix
     * 
     */
    private @Nullable String sourcePrefix;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String sourcePrefixVariable;
    /**
     * @return Source VPN ID
     *   - Range: `0`-`65530`
     * 
     */
    private @Nullable Integer sourceVpnId;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String sourceVpnIdVariable;
    /**
     * @return Translated Source Prefix
     * 
     */
    private @Nullable String translatedSourcePrefix;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String translatedSourcePrefixVariable;

    private TransportWanVpnInterfaceEthernetFeatureStaticNat66() {}
    /**
     * @return Source Prefix
     * 
     */
    public Optional<String> sourcePrefix() {
        return Optional.ofNullable(this.sourcePrefix);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> sourcePrefixVariable() {
        return Optional.ofNullable(this.sourcePrefixVariable);
    }
    /**
     * @return Source VPN ID
     *   - Range: `0`-`65530`
     * 
     */
    public Optional<Integer> sourceVpnId() {
        return Optional.ofNullable(this.sourceVpnId);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> sourceVpnIdVariable() {
        return Optional.ofNullable(this.sourceVpnIdVariable);
    }
    /**
     * @return Translated Source Prefix
     * 
     */
    public Optional<String> translatedSourcePrefix() {
        return Optional.ofNullable(this.translatedSourcePrefix);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> translatedSourcePrefixVariable() {
        return Optional.ofNullable(this.translatedSourcePrefixVariable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransportWanVpnInterfaceEthernetFeatureStaticNat66 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String sourcePrefix;
        private @Nullable String sourcePrefixVariable;
        private @Nullable Integer sourceVpnId;
        private @Nullable String sourceVpnIdVariable;
        private @Nullable String translatedSourcePrefix;
        private @Nullable String translatedSourcePrefixVariable;
        public Builder() {}
        public Builder(TransportWanVpnInterfaceEthernetFeatureStaticNat66 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourcePrefix = defaults.sourcePrefix;
    	      this.sourcePrefixVariable = defaults.sourcePrefixVariable;
    	      this.sourceVpnId = defaults.sourceVpnId;
    	      this.sourceVpnIdVariable = defaults.sourceVpnIdVariable;
    	      this.translatedSourcePrefix = defaults.translatedSourcePrefix;
    	      this.translatedSourcePrefixVariable = defaults.translatedSourcePrefixVariable;
        }

        @CustomType.Setter
        public Builder sourcePrefix(@Nullable String sourcePrefix) {

            this.sourcePrefix = sourcePrefix;
            return this;
        }
        @CustomType.Setter
        public Builder sourcePrefixVariable(@Nullable String sourcePrefixVariable) {

            this.sourcePrefixVariable = sourcePrefixVariable;
            return this;
        }
        @CustomType.Setter
        public Builder sourceVpnId(@Nullable Integer sourceVpnId) {

            this.sourceVpnId = sourceVpnId;
            return this;
        }
        @CustomType.Setter
        public Builder sourceVpnIdVariable(@Nullable String sourceVpnIdVariable) {

            this.sourceVpnIdVariable = sourceVpnIdVariable;
            return this;
        }
        @CustomType.Setter
        public Builder translatedSourcePrefix(@Nullable String translatedSourcePrefix) {

            this.translatedSourcePrefix = translatedSourcePrefix;
            return this;
        }
        @CustomType.Setter
        public Builder translatedSourcePrefixVariable(@Nullable String translatedSourcePrefixVariable) {

            this.translatedSourcePrefixVariable = translatedSourcePrefixVariable;
            return this;
        }
        public TransportWanVpnInterfaceEthernetFeatureStaticNat66 build() {
            final var _resultValue = new TransportWanVpnInterfaceEthernetFeatureStaticNat66();
            _resultValue.sourcePrefix = sourcePrefix;
            _resultValue.sourcePrefixVariable = sourcePrefixVariable;
            _resultValue.sourceVpnId = sourceVpnId;
            _resultValue.sourceVpnIdVariable = sourceVpnIdVariable;
            _resultValue.translatedSourcePrefix = translatedSourcePrefix;
            _resultValue.translatedSourcePrefixVariable = translatedSourcePrefixVariable;
            return _resultValue;
        }
    }
}