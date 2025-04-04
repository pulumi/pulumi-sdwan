// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CiscoSnmpFeatureTemplateViewObjectIdentifier {
    /**
     * @return Exclude the OID
     *   - Default value: `false`
     * 
     */
    private @Nullable Boolean exclude;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String excludeVariable;
    /**
     * @return Configure identifier of subtree of MIB objects
     * 
     */
    private @Nullable String id;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String idVariable;
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private @Nullable Boolean optional;

    private CiscoSnmpFeatureTemplateViewObjectIdentifier() {}
    /**
     * @return Exclude the OID
     *   - Default value: `false`
     * 
     */
    public Optional<Boolean> exclude() {
        return Optional.ofNullable(this.exclude);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> excludeVariable() {
        return Optional.ofNullable(this.excludeVariable);
    }
    /**
     * @return Configure identifier of subtree of MIB objects
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> idVariable() {
        return Optional.ofNullable(this.idVariable);
    }
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Optional<Boolean> optional() {
        return Optional.ofNullable(this.optional);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CiscoSnmpFeatureTemplateViewObjectIdentifier defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean exclude;
        private @Nullable String excludeVariable;
        private @Nullable String id;
        private @Nullable String idVariable;
        private @Nullable Boolean optional;
        public Builder() {}
        public Builder(CiscoSnmpFeatureTemplateViewObjectIdentifier defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclude = defaults.exclude;
    	      this.excludeVariable = defaults.excludeVariable;
    	      this.id = defaults.id;
    	      this.idVariable = defaults.idVariable;
    	      this.optional = defaults.optional;
        }

        @CustomType.Setter
        public Builder exclude(@Nullable Boolean exclude) {

            this.exclude = exclude;
            return this;
        }
        @CustomType.Setter
        public Builder excludeVariable(@Nullable String excludeVariable) {

            this.excludeVariable = excludeVariable;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder idVariable(@Nullable String idVariable) {

            this.idVariable = idVariable;
            return this;
        }
        @CustomType.Setter
        public Builder optional(@Nullable Boolean optional) {

            this.optional = optional;
            return this;
        }
        public CiscoSnmpFeatureTemplateViewObjectIdentifier build() {
            final var _resultValue = new CiscoSnmpFeatureTemplateViewObjectIdentifier();
            _resultValue.exclude = exclude;
            _resultValue.excludeVariable = excludeVariable;
            _resultValue.id = id;
            _resultValue.idVariable = idVariable;
            _resultValue.optional = optional;
            return _resultValue;
        }
    }
}
