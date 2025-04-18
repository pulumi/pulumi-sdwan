// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceRoutingEigrpFeatureRedistribute {
    /**
     * @return Set the protocol to redistribute routes from
     *   - Choices: `bgp`, `connected`, `nat-route`, `omp`, `ospf`, `ospfv3`, `static`
     * 
     */
    private @Nullable String protocol;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String protocolVariable;
    private @Nullable String routePolicyId;

    private ServiceRoutingEigrpFeatureRedistribute() {}
    /**
     * @return Set the protocol to redistribute routes from
     *   - Choices: `bgp`, `connected`, `nat-route`, `omp`, `ospf`, `ospfv3`, `static`
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
    public Optional<String> routePolicyId() {
        return Optional.ofNullable(this.routePolicyId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceRoutingEigrpFeatureRedistribute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String protocol;
        private @Nullable String protocolVariable;
        private @Nullable String routePolicyId;
        public Builder() {}
        public Builder(ServiceRoutingEigrpFeatureRedistribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protocol = defaults.protocol;
    	      this.protocolVariable = defaults.protocolVariable;
    	      this.routePolicyId = defaults.routePolicyId;
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
        public Builder routePolicyId(@Nullable String routePolicyId) {

            this.routePolicyId = routePolicyId;
            return this;
        }
        public ServiceRoutingEigrpFeatureRedistribute build() {
            final var _resultValue = new ServiceRoutingEigrpFeatureRedistribute();
            _resultValue.protocol = protocol;
            _resultValue.protocolVariable = protocolVariable;
            _resultValue.routePolicyId = routePolicyId;
            return _resultValue;
        }
    }
}
