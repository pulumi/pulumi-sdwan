// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sdwan.outputs.CiscoVpnFeatureTemplateRouteVpnImportRedistribute;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CiscoVpnFeatureTemplateRouteVpnImport {
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private @Nullable Boolean optional;
    /**
     * @return Select a Route Protocol to enable route leaking to current VPN
     *   - Choices: `static`, `connected`, `bgp`, `ospf`, `eigrp`
     * 
     */
    private @Nullable String protocol;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String protocolSubTypeVariable;
    /**
     * @return - Default value: `external`
     * 
     */
    private @Nullable List<String> protocolSubTypes;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String protocolVariable;
    /**
     * @return Enable redistribution of replicated route protocol
     * 
     */
    private @Nullable List<CiscoVpnFeatureTemplateRouteVpnImportRedistribute> redistributes;
    /**
     * @return Select a Route Policy to enable route leaking to current VPN
     * 
     */
    private @Nullable String routePolicy;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String routePolicyVariable;
    /**
     * @return Select a Source VPN where route leaks from
     *   - Range: `1`-`65530`
     *   - Default value: `1`
     * 
     */
    private @Nullable Integer sourceVpnId;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String sourceVpnIdVariable;

    private CiscoVpnFeatureTemplateRouteVpnImport() {}
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Optional<Boolean> optional() {
        return Optional.ofNullable(this.optional);
    }
    /**
     * @return Select a Route Protocol to enable route leaking to current VPN
     *   - Choices: `static`, `connected`, `bgp`, `ospf`, `eigrp`
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> protocolSubTypeVariable() {
        return Optional.ofNullable(this.protocolSubTypeVariable);
    }
    /**
     * @return - Default value: `external`
     * 
     */
    public List<String> protocolSubTypes() {
        return this.protocolSubTypes == null ? List.of() : this.protocolSubTypes;
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> protocolVariable() {
        return Optional.ofNullable(this.protocolVariable);
    }
    /**
     * @return Enable redistribution of replicated route protocol
     * 
     */
    public List<CiscoVpnFeatureTemplateRouteVpnImportRedistribute> redistributes() {
        return this.redistributes == null ? List.of() : this.redistributes;
    }
    /**
     * @return Select a Route Policy to enable route leaking to current VPN
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
    /**
     * @return Select a Source VPN where route leaks from
     *   - Range: `1`-`65530`
     *   - Default value: `1`
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CiscoVpnFeatureTemplateRouteVpnImport defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean optional;
        private @Nullable String protocol;
        private @Nullable String protocolSubTypeVariable;
        private @Nullable List<String> protocolSubTypes;
        private @Nullable String protocolVariable;
        private @Nullable List<CiscoVpnFeatureTemplateRouteVpnImportRedistribute> redistributes;
        private @Nullable String routePolicy;
        private @Nullable String routePolicyVariable;
        private @Nullable Integer sourceVpnId;
        private @Nullable String sourceVpnIdVariable;
        public Builder() {}
        public Builder(CiscoVpnFeatureTemplateRouteVpnImport defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.optional = defaults.optional;
    	      this.protocol = defaults.protocol;
    	      this.protocolSubTypeVariable = defaults.protocolSubTypeVariable;
    	      this.protocolSubTypes = defaults.protocolSubTypes;
    	      this.protocolVariable = defaults.protocolVariable;
    	      this.redistributes = defaults.redistributes;
    	      this.routePolicy = defaults.routePolicy;
    	      this.routePolicyVariable = defaults.routePolicyVariable;
    	      this.sourceVpnId = defaults.sourceVpnId;
    	      this.sourceVpnIdVariable = defaults.sourceVpnIdVariable;
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
        public Builder protocolSubTypeVariable(@Nullable String protocolSubTypeVariable) {

            this.protocolSubTypeVariable = protocolSubTypeVariable;
            return this;
        }
        @CustomType.Setter
        public Builder protocolSubTypes(@Nullable List<String> protocolSubTypes) {

            this.protocolSubTypes = protocolSubTypes;
            return this;
        }
        public Builder protocolSubTypes(String... protocolSubTypes) {
            return protocolSubTypes(List.of(protocolSubTypes));
        }
        @CustomType.Setter
        public Builder protocolVariable(@Nullable String protocolVariable) {

            this.protocolVariable = protocolVariable;
            return this;
        }
        @CustomType.Setter
        public Builder redistributes(@Nullable List<CiscoVpnFeatureTemplateRouteVpnImportRedistribute> redistributes) {

            this.redistributes = redistributes;
            return this;
        }
        public Builder redistributes(CiscoVpnFeatureTemplateRouteVpnImportRedistribute... redistributes) {
            return redistributes(List.of(redistributes));
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
        public CiscoVpnFeatureTemplateRouteVpnImport build() {
            final var _resultValue = new CiscoVpnFeatureTemplateRouteVpnImport();
            _resultValue.optional = optional;
            _resultValue.protocol = protocol;
            _resultValue.protocolSubTypeVariable = protocolSubTypeVariable;
            _resultValue.protocolSubTypes = protocolSubTypes;
            _resultValue.protocolVariable = protocolVariable;
            _resultValue.redistributes = redistributes;
            _resultValue.routePolicy = routePolicy;
            _resultValue.routePolicyVariable = routePolicyVariable;
            _resultValue.sourceVpnId = sourceVpnId;
            _resultValue.sourceVpnIdVariable = sourceVpnIdVariable;
            return _resultValue;
        }
    }
}
