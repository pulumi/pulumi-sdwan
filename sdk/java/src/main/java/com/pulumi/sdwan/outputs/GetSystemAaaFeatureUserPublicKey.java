// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSystemAaaFeatureUserPublicKey {
    /**
     * @return Set the RSA key string
     * 
     */
    private String keyString;
    /**
     * @return Only RSA is supported
     * 
     */
    private String keyType;
    /**
     * @return Variable name
     * 
     */
    private String keyTypeVariable;

    private GetSystemAaaFeatureUserPublicKey() {}
    /**
     * @return Set the RSA key string
     * 
     */
    public String keyString() {
        return this.keyString;
    }
    /**
     * @return Only RSA is supported
     * 
     */
    public String keyType() {
        return this.keyType;
    }
    /**
     * @return Variable name
     * 
     */
    public String keyTypeVariable() {
        return this.keyTypeVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSystemAaaFeatureUserPublicKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String keyString;
        private String keyType;
        private String keyTypeVariable;
        public Builder() {}
        public Builder(GetSystemAaaFeatureUserPublicKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyString = defaults.keyString;
    	      this.keyType = defaults.keyType;
    	      this.keyTypeVariable = defaults.keyTypeVariable;
        }

        @CustomType.Setter
        public Builder keyString(String keyString) {
            if (keyString == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureUserPublicKey", "keyString");
            }
            this.keyString = keyString;
            return this;
        }
        @CustomType.Setter
        public Builder keyType(String keyType) {
            if (keyType == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureUserPublicKey", "keyType");
            }
            this.keyType = keyType;
            return this;
        }
        @CustomType.Setter
        public Builder keyTypeVariable(String keyTypeVariable) {
            if (keyTypeVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureUserPublicKey", "keyTypeVariable");
            }
            this.keyTypeVariable = keyTypeVariable;
            return this;
        }
        public GetSystemAaaFeatureUserPublicKey build() {
            final var _resultValue = new GetSystemAaaFeatureUserPublicKey();
            _resultValue.keyString = keyString;
            _resultValue.keyType = keyType;
            _resultValue.keyTypeVariable = keyTypeVariable;
            return _resultValue;
        }
    }
}
