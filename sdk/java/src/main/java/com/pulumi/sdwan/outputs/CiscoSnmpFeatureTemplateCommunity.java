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
public final class CiscoSnmpFeatureTemplateCommunity {
    /**
     * @return Configure access permissions
     *   - Choices: `read-only`
     * 
     */
    private @Nullable String authorization;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String authorizationVariable;
    /**
     * @return Set name of the SNMP community
     * 
     */
    private @Nullable String name;
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private @Nullable Boolean optional;
    /**
     * @return Set name of the SNMP view
     * 
     */
    private @Nullable String view;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String viewVariable;

    private CiscoSnmpFeatureTemplateCommunity() {}
    /**
     * @return Configure access permissions
     *   - Choices: `read-only`
     * 
     */
    public Optional<String> authorization() {
        return Optional.ofNullable(this.authorization);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> authorizationVariable() {
        return Optional.ofNullable(this.authorizationVariable);
    }
    /**
     * @return Set name of the SNMP community
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Optional<Boolean> optional() {
        return Optional.ofNullable(this.optional);
    }
    /**
     * @return Set name of the SNMP view
     * 
     */
    public Optional<String> view() {
        return Optional.ofNullable(this.view);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> viewVariable() {
        return Optional.ofNullable(this.viewVariable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CiscoSnmpFeatureTemplateCommunity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String authorization;
        private @Nullable String authorizationVariable;
        private @Nullable String name;
        private @Nullable Boolean optional;
        private @Nullable String view;
        private @Nullable String viewVariable;
        public Builder() {}
        public Builder(CiscoSnmpFeatureTemplateCommunity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorization = defaults.authorization;
    	      this.authorizationVariable = defaults.authorizationVariable;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
    	      this.view = defaults.view;
    	      this.viewVariable = defaults.viewVariable;
        }

        @CustomType.Setter
        public Builder authorization(@Nullable String authorization) {

            this.authorization = authorization;
            return this;
        }
        @CustomType.Setter
        public Builder authorizationVariable(@Nullable String authorizationVariable) {

            this.authorizationVariable = authorizationVariable;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder optional(@Nullable Boolean optional) {

            this.optional = optional;
            return this;
        }
        @CustomType.Setter
        public Builder view(@Nullable String view) {

            this.view = view;
            return this;
        }
        @CustomType.Setter
        public Builder viewVariable(@Nullable String viewVariable) {

            this.viewVariable = viewVariable;
            return this;
        }
        public CiscoSnmpFeatureTemplateCommunity build() {
            final var _resultValue = new CiscoSnmpFeatureTemplateCommunity();
            _resultValue.authorization = authorization;
            _resultValue.authorizationVariable = authorizationVariable;
            _resultValue.name = name;
            _resultValue.optional = optional;
            _resultValue.view = view;
            _resultValue.viewVariable = viewVariable;
            return _resultValue;
        }
    }
}
