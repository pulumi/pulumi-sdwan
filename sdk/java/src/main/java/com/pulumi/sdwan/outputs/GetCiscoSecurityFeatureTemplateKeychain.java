// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCiscoSecurityFeatureTemplateKeychain {
    /**
     * @return Specify the Key ID
     * 
     */
    private Integer keyId;
    /**
     * @return Specify the name of the Keychain
     * 
     */
    private String name;
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private Boolean optional;

    private GetCiscoSecurityFeatureTemplateKeychain() {}
    /**
     * @return Specify the Key ID
     * 
     */
    public Integer keyId() {
        return this.keyId;
    }
    /**
     * @return Specify the name of the Keychain
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Boolean optional() {
        return this.optional;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCiscoSecurityFeatureTemplateKeychain defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer keyId;
        private String name;
        private Boolean optional;
        public Builder() {}
        public Builder(GetCiscoSecurityFeatureTemplateKeychain defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        @CustomType.Setter
        public Builder keyId(Integer keyId) {
            if (keyId == null) {
              throw new MissingRequiredPropertyException("GetCiscoSecurityFeatureTemplateKeychain", "keyId");
            }
            this.keyId = keyId;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetCiscoSecurityFeatureTemplateKeychain", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder optional(Boolean optional) {
            if (optional == null) {
              throw new MissingRequiredPropertyException("GetCiscoSecurityFeatureTemplateKeychain", "optional");
            }
            this.optional = optional;
            return this;
        }
        public GetCiscoSecurityFeatureTemplateKeychain build() {
            final var _resultValue = new GetCiscoSecurityFeatureTemplateKeychain();
            _resultValue.keyId = keyId;
            _resultValue.name = name;
            _resultValue.optional = optional;
            return _resultValue;
        }
    }
}
