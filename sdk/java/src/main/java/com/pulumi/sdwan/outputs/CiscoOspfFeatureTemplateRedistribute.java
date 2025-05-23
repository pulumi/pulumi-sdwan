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
public final class CiscoOspfFeatureTemplateRedistribute {
    /**
     * @return Enable NAT DIA for redistributed routes
     *   - Default value: `true`
     * 
     */
    private @Nullable Boolean natDia;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String natDiaVariable;
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private @Nullable Boolean optional;
    /**
     * @return Set the protocol
     *   - Choices: `static`, `connected`, `bgp`, `omp`, `nat`, `eigrp`
     * 
     */
    private @Nullable String protocol;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String protocolVariable;
    /**
     * @return Set route policy to apply to redistributed routes
     * 
     */
    private @Nullable String routePolicy;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String routePolicyVariable;

    private CiscoOspfFeatureTemplateRedistribute() {}
    /**
     * @return Enable NAT DIA for redistributed routes
     *   - Default value: `true`
     * 
     */
    public Optional<Boolean> natDia() {
        return Optional.ofNullable(this.natDia);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> natDiaVariable() {
        return Optional.ofNullable(this.natDiaVariable);
    }
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Optional<Boolean> optional() {
        return Optional.ofNullable(this.optional);
    }
    /**
     * @return Set the protocol
     *   - Choices: `static`, `connected`, `bgp`, `omp`, `nat`, `eigrp`
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> protocolVariable() {
        return Optional.ofNullable(this.protocolVariable);
    }
    /**
     * @return Set route policy to apply to redistributed routes
     * 
     */
    public Optional<String> routePolicy() {
        return Optional.ofNullable(this.routePolicy);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> routePolicyVariable() {
        return Optional.ofNullable(this.routePolicyVariable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CiscoOspfFeatureTemplateRedistribute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean natDia;
        private @Nullable String natDiaVariable;
        private @Nullable Boolean optional;
        private @Nullable String protocol;
        private @Nullable String protocolVariable;
        private @Nullable String routePolicy;
        private @Nullable String routePolicyVariable;
        public Builder() {}
        public Builder(CiscoOspfFeatureTemplateRedistribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.natDia = defaults.natDia;
    	      this.natDiaVariable = defaults.natDiaVariable;
    	      this.optional = defaults.optional;
    	      this.protocol = defaults.protocol;
    	      this.protocolVariable = defaults.protocolVariable;
    	      this.routePolicy = defaults.routePolicy;
    	      this.routePolicyVariable = defaults.routePolicyVariable;
        }

        @CustomType.Setter
        public Builder natDia(@Nullable Boolean natDia) {

            this.natDia = natDia;
            return this;
        }
        @CustomType.Setter
        public Builder natDiaVariable(@Nullable String natDiaVariable) {

            this.natDiaVariable = natDiaVariable;
            return this;
        }
        @CustomType.Setter
        public Builder optional(@Nullable Boolean optional) {

            this.optional = optional;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {

            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder protocolVariable(@Nullable String protocolVariable) {

            this.protocolVariable = protocolVariable;
            return this;
        }
        @CustomType.Setter
        public Builder routePolicy(@Nullable String routePolicy) {

            this.routePolicy = routePolicy;
            return this;
        }
        @CustomType.Setter
        public Builder routePolicyVariable(@Nullable String routePolicyVariable) {

            this.routePolicyVariable = routePolicyVariable;
            return this;
        }
        public CiscoOspfFeatureTemplateRedistribute build() {
            final var _resultValue = new CiscoOspfFeatureTemplateRedistribute();
            _resultValue.natDia = natDia;
            _resultValue.natDiaVariable = natDiaVariable;
            _resultValue.optional = optional;
            _resultValue.protocol = protocol;
            _resultValue.protocolVariable = protocolVariable;
            _resultValue.routePolicy = routePolicy;
            _resultValue.routePolicyVariable = routePolicyVariable;
            return _resultValue;
        }
    }
}
