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
public final class SystemSecurityFeatureKeychain {
    /**
     * @return Specify the name of the Keychain
     * 
     */
    private @Nullable String keyChainName;
    /**
     * @return Specify the Key ID
     *   - Range: `0`-`2147483647`
     * 
     */
    private @Nullable Integer keyId;

    private SystemSecurityFeatureKeychain() {}
    /**
     * @return Specify the name of the Keychain
     * 
     */
    public Optional<String> keyChainName() {
        return Optional.ofNullable(this.keyChainName);
    }
    /**
     * @return Specify the Key ID
     *   - Range: `0`-`2147483647`
     * 
     */
    public Optional<Integer> keyId() {
        return Optional.ofNullable(this.keyId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SystemSecurityFeatureKeychain defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String keyChainName;
        private @Nullable Integer keyId;
        public Builder() {}
        public Builder(SystemSecurityFeatureKeychain defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyChainName = defaults.keyChainName;
    	      this.keyId = defaults.keyId;
        }

        @CustomType.Setter
        public Builder keyChainName(@Nullable String keyChainName) {

            this.keyChainName = keyChainName;
            return this;
        }
        @CustomType.Setter
        public Builder keyId(@Nullable Integer keyId) {

            this.keyId = keyId;
            return this;
        }
        public SystemSecurityFeatureKeychain build() {
            final var _resultValue = new SystemSecurityFeatureKeychain();
            _resultValue.keyChainName = keyChainName;
            _resultValue.keyId = keyId;
            return _resultValue;
        }
    }
}
