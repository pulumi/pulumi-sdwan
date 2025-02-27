// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sdwan.outputs.ServiceRoutingEigrpFeatureInterfaceSummaryAddress;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceRoutingEigrpFeatureInterface {
    /**
     * @return Set interface name
     * 
     */
    private @Nullable String name;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String nameVariable;
    /**
     * @return Enable/disable EIGRP
     *   - Default value: `false`
     * 
     */
    private @Nullable Boolean shutdown;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String shutdownVariable;
    /**
     * @return Set summary addresses
     * 
     */
    private @Nullable List<ServiceRoutingEigrpFeatureInterfaceSummaryAddress> summaryAddresses;

    private ServiceRoutingEigrpFeatureInterface() {}
    /**
     * @return Set interface name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> nameVariable() {
        return Optional.ofNullable(this.nameVariable);
    }
    /**
     * @return Enable/disable EIGRP
     *   - Default value: `false`
     * 
     */
    public Optional<Boolean> shutdown() {
        return Optional.ofNullable(this.shutdown);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> shutdownVariable() {
        return Optional.ofNullable(this.shutdownVariable);
    }
    /**
     * @return Set summary addresses
     * 
     */
    public List<ServiceRoutingEigrpFeatureInterfaceSummaryAddress> summaryAddresses() {
        return this.summaryAddresses == null ? List.of() : this.summaryAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceRoutingEigrpFeatureInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String nameVariable;
        private @Nullable Boolean shutdown;
        private @Nullable String shutdownVariable;
        private @Nullable List<ServiceRoutingEigrpFeatureInterfaceSummaryAddress> summaryAddresses;
        public Builder() {}
        public Builder(ServiceRoutingEigrpFeatureInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.nameVariable = defaults.nameVariable;
    	      this.shutdown = defaults.shutdown;
    	      this.shutdownVariable = defaults.shutdownVariable;
    	      this.summaryAddresses = defaults.summaryAddresses;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nameVariable(@Nullable String nameVariable) {

            this.nameVariable = nameVariable;
            return this;
        }
        @CustomType.Setter
        public Builder shutdown(@Nullable Boolean shutdown) {

            this.shutdown = shutdown;
            return this;
        }
        @CustomType.Setter
        public Builder shutdownVariable(@Nullable String shutdownVariable) {

            this.shutdownVariable = shutdownVariable;
            return this;
        }
        @CustomType.Setter
        public Builder summaryAddresses(@Nullable List<ServiceRoutingEigrpFeatureInterfaceSummaryAddress> summaryAddresses) {

            this.summaryAddresses = summaryAddresses;
            return this;
        }
        public Builder summaryAddresses(ServiceRoutingEigrpFeatureInterfaceSummaryAddress... summaryAddresses) {
            return summaryAddresses(List.of(summaryAddresses));
        }
        public ServiceRoutingEigrpFeatureInterface build() {
            final var _resultValue = new ServiceRoutingEigrpFeatureInterface();
            _resultValue.name = name;
            _resultValue.nameVariable = nameVariable;
            _resultValue.shutdown = shutdown;
            _resultValue.shutdownVariable = shutdownVariable;
            _resultValue.summaryAddresses = summaryAddresses;
            return _resultValue;
        }
    }
}
