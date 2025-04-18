// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceRoutingOspfv3Ipv6FeatureAreaInterface {
    /**
     * @return Set OSPF interface authentication IPSEC key
     * 
     */
    private @Nullable String authenticationKey;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String authenticationKeyVariable;
    /**
     * @return Set OSPF interface authentication IPSec SPI, range 256..4294967295
     *   - Range: `256`-`4294967295`
     * 
     */
    private @Nullable Integer authenticationSpi;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String authenticationSpiVariable;
    /**
     * @return No Authentication by default
     *   - Choices: `no-auth`
     * 
     */
    private @Nullable String authenticationType;
    /**
     * @return Set cost of OSPF interface
     *   - Range: `1`-`65535`
     * 
     */
    private @Nullable Integer cost;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String costVariable;
    /**
     * @return Set interval after which neighbor is declared to be down
     *   - Range: `1`-`65535`
     *   - Default value: `40`
     * 
     */
    private @Nullable Integer deadInterval;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String deadIntervalVariable;
    /**
     * @return Set interval between OSPF hello packets
     *   - Range: `1`-`65535`
     *   - Default value: `10`
     * 
     */
    private @Nullable Integer helloInterval;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String helloIntervalVariable;
    /**
     * @return Set time between retransmitting LSAs
     *   - Range: `1`-`65535`
     *   - Default value: `5`
     * 
     */
    private @Nullable Integer lsaRetransmitInterval;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String lsaRetransmitIntervalVariable;
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
     * @return Set the OSPF network type
     *   - Choices: `broadcast`, `point-to-point`, `non-broadcast`, `point-to-multipoint`
     * 
     */
    private @Nullable String networkType;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String networkTypeVariable;
    /**
     * @return Set the interface to advertise its address, but not to actively run OSPF
     *   - Default value: `false`
     * 
     */
    private @Nullable Boolean passiveInterface;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String passiveInterfaceVariable;

    private ServiceRoutingOspfv3Ipv6FeatureAreaInterface() {}
    /**
     * @return Set OSPF interface authentication IPSEC key
     * 
     */
    public Optional<String> authenticationKey() {
        return Optional.ofNullable(this.authenticationKey);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> authenticationKeyVariable() {
        return Optional.ofNullable(this.authenticationKeyVariable);
    }
    /**
     * @return Set OSPF interface authentication IPSec SPI, range 256..4294967295
     *   - Range: `256`-`4294967295`
     * 
     */
    public Optional<Integer> authenticationSpi() {
        return Optional.ofNullable(this.authenticationSpi);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> authenticationSpiVariable() {
        return Optional.ofNullable(this.authenticationSpiVariable);
    }
    /**
     * @return No Authentication by default
     *   - Choices: `no-auth`
     * 
     */
    public Optional<String> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    /**
     * @return Set cost of OSPF interface
     *   - Range: `1`-`65535`
     * 
     */
    public Optional<Integer> cost() {
        return Optional.ofNullable(this.cost);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> costVariable() {
        return Optional.ofNullable(this.costVariable);
    }
    /**
     * @return Set interval after which neighbor is declared to be down
     *   - Range: `1`-`65535`
     *   - Default value: `40`
     * 
     */
    public Optional<Integer> deadInterval() {
        return Optional.ofNullable(this.deadInterval);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> deadIntervalVariable() {
        return Optional.ofNullable(this.deadIntervalVariable);
    }
    /**
     * @return Set interval between OSPF hello packets
     *   - Range: `1`-`65535`
     *   - Default value: `10`
     * 
     */
    public Optional<Integer> helloInterval() {
        return Optional.ofNullable(this.helloInterval);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> helloIntervalVariable() {
        return Optional.ofNullable(this.helloIntervalVariable);
    }
    /**
     * @return Set time between retransmitting LSAs
     *   - Range: `1`-`65535`
     *   - Default value: `5`
     * 
     */
    public Optional<Integer> lsaRetransmitInterval() {
        return Optional.ofNullable(this.lsaRetransmitInterval);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> lsaRetransmitIntervalVariable() {
        return Optional.ofNullable(this.lsaRetransmitIntervalVariable);
    }
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
     * @return Set the OSPF network type
     *   - Choices: `broadcast`, `point-to-point`, `non-broadcast`, `point-to-multipoint`
     * 
     */
    public Optional<String> networkType() {
        return Optional.ofNullable(this.networkType);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> networkTypeVariable() {
        return Optional.ofNullable(this.networkTypeVariable);
    }
    /**
     * @return Set the interface to advertise its address, but not to actively run OSPF
     *   - Default value: `false`
     * 
     */
    public Optional<Boolean> passiveInterface() {
        return Optional.ofNullable(this.passiveInterface);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> passiveInterfaceVariable() {
        return Optional.ofNullable(this.passiveInterfaceVariable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceRoutingOspfv3Ipv6FeatureAreaInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String authenticationKey;
        private @Nullable String authenticationKeyVariable;
        private @Nullable Integer authenticationSpi;
        private @Nullable String authenticationSpiVariable;
        private @Nullable String authenticationType;
        private @Nullable Integer cost;
        private @Nullable String costVariable;
        private @Nullable Integer deadInterval;
        private @Nullable String deadIntervalVariable;
        private @Nullable Integer helloInterval;
        private @Nullable String helloIntervalVariable;
        private @Nullable Integer lsaRetransmitInterval;
        private @Nullable String lsaRetransmitIntervalVariable;
        private @Nullable String name;
        private @Nullable String nameVariable;
        private @Nullable String networkType;
        private @Nullable String networkTypeVariable;
        private @Nullable Boolean passiveInterface;
        private @Nullable String passiveInterfaceVariable;
        public Builder() {}
        public Builder(ServiceRoutingOspfv3Ipv6FeatureAreaInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationKey = defaults.authenticationKey;
    	      this.authenticationKeyVariable = defaults.authenticationKeyVariable;
    	      this.authenticationSpi = defaults.authenticationSpi;
    	      this.authenticationSpiVariable = defaults.authenticationSpiVariable;
    	      this.authenticationType = defaults.authenticationType;
    	      this.cost = defaults.cost;
    	      this.costVariable = defaults.costVariable;
    	      this.deadInterval = defaults.deadInterval;
    	      this.deadIntervalVariable = defaults.deadIntervalVariable;
    	      this.helloInterval = defaults.helloInterval;
    	      this.helloIntervalVariable = defaults.helloIntervalVariable;
    	      this.lsaRetransmitInterval = defaults.lsaRetransmitInterval;
    	      this.lsaRetransmitIntervalVariable = defaults.lsaRetransmitIntervalVariable;
    	      this.name = defaults.name;
    	      this.nameVariable = defaults.nameVariable;
    	      this.networkType = defaults.networkType;
    	      this.networkTypeVariable = defaults.networkTypeVariable;
    	      this.passiveInterface = defaults.passiveInterface;
    	      this.passiveInterfaceVariable = defaults.passiveInterfaceVariable;
        }

        @CustomType.Setter
        public Builder authenticationKey(@Nullable String authenticationKey) {

            this.authenticationKey = authenticationKey;
            return this;
        }
        @CustomType.Setter
        public Builder authenticationKeyVariable(@Nullable String authenticationKeyVariable) {

            this.authenticationKeyVariable = authenticationKeyVariable;
            return this;
        }
        @CustomType.Setter
        public Builder authenticationSpi(@Nullable Integer authenticationSpi) {

            this.authenticationSpi = authenticationSpi;
            return this;
        }
        @CustomType.Setter
        public Builder authenticationSpiVariable(@Nullable String authenticationSpiVariable) {

            this.authenticationSpiVariable = authenticationSpiVariable;
            return this;
        }
        @CustomType.Setter
        public Builder authenticationType(@Nullable String authenticationType) {

            this.authenticationType = authenticationType;
            return this;
        }
        @CustomType.Setter
        public Builder cost(@Nullable Integer cost) {

            this.cost = cost;
            return this;
        }
        @CustomType.Setter
        public Builder costVariable(@Nullable String costVariable) {

            this.costVariable = costVariable;
            return this;
        }
        @CustomType.Setter
        public Builder deadInterval(@Nullable Integer deadInterval) {

            this.deadInterval = deadInterval;
            return this;
        }
        @CustomType.Setter
        public Builder deadIntervalVariable(@Nullable String deadIntervalVariable) {

            this.deadIntervalVariable = deadIntervalVariable;
            return this;
        }
        @CustomType.Setter
        public Builder helloInterval(@Nullable Integer helloInterval) {

            this.helloInterval = helloInterval;
            return this;
        }
        @CustomType.Setter
        public Builder helloIntervalVariable(@Nullable String helloIntervalVariable) {

            this.helloIntervalVariable = helloIntervalVariable;
            return this;
        }
        @CustomType.Setter
        public Builder lsaRetransmitInterval(@Nullable Integer lsaRetransmitInterval) {

            this.lsaRetransmitInterval = lsaRetransmitInterval;
            return this;
        }
        @CustomType.Setter
        public Builder lsaRetransmitIntervalVariable(@Nullable String lsaRetransmitIntervalVariable) {

            this.lsaRetransmitIntervalVariable = lsaRetransmitIntervalVariable;
            return this;
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
        public Builder networkType(@Nullable String networkType) {

            this.networkType = networkType;
            return this;
        }
        @CustomType.Setter
        public Builder networkTypeVariable(@Nullable String networkTypeVariable) {

            this.networkTypeVariable = networkTypeVariable;
            return this;
        }
        @CustomType.Setter
        public Builder passiveInterface(@Nullable Boolean passiveInterface) {

            this.passiveInterface = passiveInterface;
            return this;
        }
        @CustomType.Setter
        public Builder passiveInterfaceVariable(@Nullable String passiveInterfaceVariable) {

            this.passiveInterfaceVariable = passiveInterfaceVariable;
            return this;
        }
        public ServiceRoutingOspfv3Ipv6FeatureAreaInterface build() {
            final var _resultValue = new ServiceRoutingOspfv3Ipv6FeatureAreaInterface();
            _resultValue.authenticationKey = authenticationKey;
            _resultValue.authenticationKeyVariable = authenticationKeyVariable;
            _resultValue.authenticationSpi = authenticationSpi;
            _resultValue.authenticationSpiVariable = authenticationSpiVariable;
            _resultValue.authenticationType = authenticationType;
            _resultValue.cost = cost;
            _resultValue.costVariable = costVariable;
            _resultValue.deadInterval = deadInterval;
            _resultValue.deadIntervalVariable = deadIntervalVariable;
            _resultValue.helloInterval = helloInterval;
            _resultValue.helloIntervalVariable = helloIntervalVariable;
            _resultValue.lsaRetransmitInterval = lsaRetransmitInterval;
            _resultValue.lsaRetransmitIntervalVariable = lsaRetransmitIntervalVariable;
            _resultValue.name = name;
            _resultValue.nameVariable = nameVariable;
            _resultValue.networkType = networkType;
            _resultValue.networkTypeVariable = networkTypeVariable;
            _resultValue.passiveInterface = passiveInterface;
            _resultValue.passiveInterfaceVariable = passiveInterfaceVariable;
            return _resultValue;
        }
    }
}
