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
public final class ServiceRoutingOspfFeatureRouterLsa {
    /**
     * @return Set how long to advertise maximum metric after router starts up
     *   - Range: `5`-`86400`
     * 
     */
    private @Nullable Integer time;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String timeVariable;
    /**
     * @return Set the router LSA advertisement type
     *   - Choices: `administrative`, `on-startup`
     * 
     */
    private @Nullable String type;

    private ServiceRoutingOspfFeatureRouterLsa() {}
    /**
     * @return Set how long to advertise maximum metric after router starts up
     *   - Range: `5`-`86400`
     * 
     */
    public Optional<Integer> time() {
        return Optional.ofNullable(this.time);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> timeVariable() {
        return Optional.ofNullable(this.timeVariable);
    }
    /**
     * @return Set the router LSA advertisement type
     *   - Choices: `administrative`, `on-startup`
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceRoutingOspfFeatureRouterLsa defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer time;
        private @Nullable String timeVariable;
        private @Nullable String type;
        public Builder() {}
        public Builder(ServiceRoutingOspfFeatureRouterLsa defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.time = defaults.time;
    	      this.timeVariable = defaults.timeVariable;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder time(@Nullable Integer time) {

            this.time = time;
            return this;
        }
        @CustomType.Setter
        public Builder timeVariable(@Nullable String timeVariable) {

            this.timeVariable = timeVariable;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public ServiceRoutingOspfFeatureRouterLsa build() {
            final var _resultValue = new ServiceRoutingOspfFeatureRouterLsa();
            _resultValue.time = time;
            _resultValue.timeVariable = timeVariable;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
