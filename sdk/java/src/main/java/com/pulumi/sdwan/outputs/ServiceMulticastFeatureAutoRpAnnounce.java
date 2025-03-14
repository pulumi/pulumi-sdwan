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
public final class ServiceMulticastFeatureAutoRpAnnounce {
    /**
     * @return Set RP Announce Interface Name
     * 
     */
    private @Nullable String interfaceName;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String interfaceNameVariable;
    /**
     * @return Set RP Announce Scope
     *   - Range: `1`-`255`
     * 
     */
    private @Nullable Integer scope;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String scopeVariable;

    private ServiceMulticastFeatureAutoRpAnnounce() {}
    /**
     * @return Set RP Announce Interface Name
     * 
     */
    public Optional<String> interfaceName() {
        return Optional.ofNullable(this.interfaceName);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> interfaceNameVariable() {
        return Optional.ofNullable(this.interfaceNameVariable);
    }
    /**
     * @return Set RP Announce Scope
     *   - Range: `1`-`255`
     * 
     */
    public Optional<Integer> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> scopeVariable() {
        return Optional.ofNullable(this.scopeVariable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceMulticastFeatureAutoRpAnnounce defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String interfaceName;
        private @Nullable String interfaceNameVariable;
        private @Nullable Integer scope;
        private @Nullable String scopeVariable;
        public Builder() {}
        public Builder(ServiceMulticastFeatureAutoRpAnnounce defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interfaceName = defaults.interfaceName;
    	      this.interfaceNameVariable = defaults.interfaceNameVariable;
    	      this.scope = defaults.scope;
    	      this.scopeVariable = defaults.scopeVariable;
        }

        @CustomType.Setter
        public Builder interfaceName(@Nullable String interfaceName) {

            this.interfaceName = interfaceName;
            return this;
        }
        @CustomType.Setter
        public Builder interfaceNameVariable(@Nullable String interfaceNameVariable) {

            this.interfaceNameVariable = interfaceNameVariable;
            return this;
        }
        @CustomType.Setter
        public Builder scope(@Nullable Integer scope) {

            this.scope = scope;
            return this;
        }
        @CustomType.Setter
        public Builder scopeVariable(@Nullable String scopeVariable) {

            this.scopeVariable = scopeVariable;
            return this;
        }
        public ServiceMulticastFeatureAutoRpAnnounce build() {
            final var _resultValue = new ServiceMulticastFeatureAutoRpAnnounce();
            _resultValue.interfaceName = interfaceName;
            _resultValue.interfaceNameVariable = interfaceNameVariable;
            _resultValue.scope = scope;
            _resultValue.scopeVariable = scopeVariable;
            return _resultValue;
        }
    }
}
