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
public final class ServiceMulticastFeatureMsdpGroupPeer {
    /**
     * @return Set MSDP peer ip connect-source interface
     * 
     */
    private @Nullable String connectionSourceInterface;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String connectionSourceInterfaceVariable;
    /**
     * @return Set MSDP default peer
     * 
     */
    private @Nullable Boolean defaultPeer;
    /**
     * @return Set MSDP peer ip keepalive hold time
     *   - Range: `1`-`75`
     * 
     */
    private @Nullable Integer keepaliveHoldTime;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String keepaliveHoldTimeVariable;
    /**
     * @return Set MSDP peer ip keepalive interval
     *   - Range: `1`-`60`
     * 
     */
    private @Nullable Integer keepaliveInterval;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String keepaliveIntervalVariable;
    /**
     * @return Set MSDP peer ip password
     * 
     */
    private @Nullable String peerAuthenticationPassword;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String peerAuthenticationPasswordVariable;
    /**
     * @return Set MSDP peer ip
     * 
     */
    private @Nullable String peerIp;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String peerIpVariable;
    private @Nullable String prefixListId;
    /**
     * @return Set MSDP peer ip remote autonomous system number
     *   - Range: `1`-`65535`
     * 
     */
    private @Nullable Integer remoteAs;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String remoteAsVariable;
    /**
     * @return Set MSDP peer ip SA limit message number
     *   - Range: `1`-`2147483646`
     * 
     */
    private @Nullable Integer saLimit;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String saLimitVariable;

    private ServiceMulticastFeatureMsdpGroupPeer() {}
    /**
     * @return Set MSDP peer ip connect-source interface
     * 
     */
    public Optional<String> connectionSourceInterface() {
        return Optional.ofNullable(this.connectionSourceInterface);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> connectionSourceInterfaceVariable() {
        return Optional.ofNullable(this.connectionSourceInterfaceVariable);
    }
    /**
     * @return Set MSDP default peer
     * 
     */
    public Optional<Boolean> defaultPeer() {
        return Optional.ofNullable(this.defaultPeer);
    }
    /**
     * @return Set MSDP peer ip keepalive hold time
     *   - Range: `1`-`75`
     * 
     */
    public Optional<Integer> keepaliveHoldTime() {
        return Optional.ofNullable(this.keepaliveHoldTime);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> keepaliveHoldTimeVariable() {
        return Optional.ofNullable(this.keepaliveHoldTimeVariable);
    }
    /**
     * @return Set MSDP peer ip keepalive interval
     *   - Range: `1`-`60`
     * 
     */
    public Optional<Integer> keepaliveInterval() {
        return Optional.ofNullable(this.keepaliveInterval);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> keepaliveIntervalVariable() {
        return Optional.ofNullable(this.keepaliveIntervalVariable);
    }
    /**
     * @return Set MSDP peer ip password
     * 
     */
    public Optional<String> peerAuthenticationPassword() {
        return Optional.ofNullable(this.peerAuthenticationPassword);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> peerAuthenticationPasswordVariable() {
        return Optional.ofNullable(this.peerAuthenticationPasswordVariable);
    }
    /**
     * @return Set MSDP peer ip
     * 
     */
    public Optional<String> peerIp() {
        return Optional.ofNullable(this.peerIp);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> peerIpVariable() {
        return Optional.ofNullable(this.peerIpVariable);
    }
    public Optional<String> prefixListId() {
        return Optional.ofNullable(this.prefixListId);
    }
    /**
     * @return Set MSDP peer ip remote autonomous system number
     *   - Range: `1`-`65535`
     * 
     */
    public Optional<Integer> remoteAs() {
        return Optional.ofNullable(this.remoteAs);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> remoteAsVariable() {
        return Optional.ofNullable(this.remoteAsVariable);
    }
    /**
     * @return Set MSDP peer ip SA limit message number
     *   - Range: `1`-`2147483646`
     * 
     */
    public Optional<Integer> saLimit() {
        return Optional.ofNullable(this.saLimit);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> saLimitVariable() {
        return Optional.ofNullable(this.saLimitVariable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceMulticastFeatureMsdpGroupPeer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String connectionSourceInterface;
        private @Nullable String connectionSourceInterfaceVariable;
        private @Nullable Boolean defaultPeer;
        private @Nullable Integer keepaliveHoldTime;
        private @Nullable String keepaliveHoldTimeVariable;
        private @Nullable Integer keepaliveInterval;
        private @Nullable String keepaliveIntervalVariable;
        private @Nullable String peerAuthenticationPassword;
        private @Nullable String peerAuthenticationPasswordVariable;
        private @Nullable String peerIp;
        private @Nullable String peerIpVariable;
        private @Nullable String prefixListId;
        private @Nullable Integer remoteAs;
        private @Nullable String remoteAsVariable;
        private @Nullable Integer saLimit;
        private @Nullable String saLimitVariable;
        public Builder() {}
        public Builder(ServiceMulticastFeatureMsdpGroupPeer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionSourceInterface = defaults.connectionSourceInterface;
    	      this.connectionSourceInterfaceVariable = defaults.connectionSourceInterfaceVariable;
    	      this.defaultPeer = defaults.defaultPeer;
    	      this.keepaliveHoldTime = defaults.keepaliveHoldTime;
    	      this.keepaliveHoldTimeVariable = defaults.keepaliveHoldTimeVariable;
    	      this.keepaliveInterval = defaults.keepaliveInterval;
    	      this.keepaliveIntervalVariable = defaults.keepaliveIntervalVariable;
    	      this.peerAuthenticationPassword = defaults.peerAuthenticationPassword;
    	      this.peerAuthenticationPasswordVariable = defaults.peerAuthenticationPasswordVariable;
    	      this.peerIp = defaults.peerIp;
    	      this.peerIpVariable = defaults.peerIpVariable;
    	      this.prefixListId = defaults.prefixListId;
    	      this.remoteAs = defaults.remoteAs;
    	      this.remoteAsVariable = defaults.remoteAsVariable;
    	      this.saLimit = defaults.saLimit;
    	      this.saLimitVariable = defaults.saLimitVariable;
        }

        @CustomType.Setter
        public Builder connectionSourceInterface(@Nullable String connectionSourceInterface) {

            this.connectionSourceInterface = connectionSourceInterface;
            return this;
        }
        @CustomType.Setter
        public Builder connectionSourceInterfaceVariable(@Nullable String connectionSourceInterfaceVariable) {

            this.connectionSourceInterfaceVariable = connectionSourceInterfaceVariable;
            return this;
        }
        @CustomType.Setter
        public Builder defaultPeer(@Nullable Boolean defaultPeer) {

            this.defaultPeer = defaultPeer;
            return this;
        }
        @CustomType.Setter
        public Builder keepaliveHoldTime(@Nullable Integer keepaliveHoldTime) {

            this.keepaliveHoldTime = keepaliveHoldTime;
            return this;
        }
        @CustomType.Setter
        public Builder keepaliveHoldTimeVariable(@Nullable String keepaliveHoldTimeVariable) {

            this.keepaliveHoldTimeVariable = keepaliveHoldTimeVariable;
            return this;
        }
        @CustomType.Setter
        public Builder keepaliveInterval(@Nullable Integer keepaliveInterval) {

            this.keepaliveInterval = keepaliveInterval;
            return this;
        }
        @CustomType.Setter
        public Builder keepaliveIntervalVariable(@Nullable String keepaliveIntervalVariable) {

            this.keepaliveIntervalVariable = keepaliveIntervalVariable;
            return this;
        }
        @CustomType.Setter
        public Builder peerAuthenticationPassword(@Nullable String peerAuthenticationPassword) {

            this.peerAuthenticationPassword = peerAuthenticationPassword;
            return this;
        }
        @CustomType.Setter
        public Builder peerAuthenticationPasswordVariable(@Nullable String peerAuthenticationPasswordVariable) {

            this.peerAuthenticationPasswordVariable = peerAuthenticationPasswordVariable;
            return this;
        }
        @CustomType.Setter
        public Builder peerIp(@Nullable String peerIp) {

            this.peerIp = peerIp;
            return this;
        }
        @CustomType.Setter
        public Builder peerIpVariable(@Nullable String peerIpVariable) {

            this.peerIpVariable = peerIpVariable;
            return this;
        }
        @CustomType.Setter
        public Builder prefixListId(@Nullable String prefixListId) {

            this.prefixListId = prefixListId;
            return this;
        }
        @CustomType.Setter
        public Builder remoteAs(@Nullable Integer remoteAs) {

            this.remoteAs = remoteAs;
            return this;
        }
        @CustomType.Setter
        public Builder remoteAsVariable(@Nullable String remoteAsVariable) {

            this.remoteAsVariable = remoteAsVariable;
            return this;
        }
        @CustomType.Setter
        public Builder saLimit(@Nullable Integer saLimit) {

            this.saLimit = saLimit;
            return this;
        }
        @CustomType.Setter
        public Builder saLimitVariable(@Nullable String saLimitVariable) {

            this.saLimitVariable = saLimitVariable;
            return this;
        }
        public ServiceMulticastFeatureMsdpGroupPeer build() {
            final var _resultValue = new ServiceMulticastFeatureMsdpGroupPeer();
            _resultValue.connectionSourceInterface = connectionSourceInterface;
            _resultValue.connectionSourceInterfaceVariable = connectionSourceInterfaceVariable;
            _resultValue.defaultPeer = defaultPeer;
            _resultValue.keepaliveHoldTime = keepaliveHoldTime;
            _resultValue.keepaliveHoldTimeVariable = keepaliveHoldTimeVariable;
            _resultValue.keepaliveInterval = keepaliveInterval;
            _resultValue.keepaliveIntervalVariable = keepaliveIntervalVariable;
            _resultValue.peerAuthenticationPassword = peerAuthenticationPassword;
            _resultValue.peerAuthenticationPasswordVariable = peerAuthenticationPasswordVariable;
            _resultValue.peerIp = peerIp;
            _resultValue.peerIpVariable = peerIpVariable;
            _resultValue.prefixListId = prefixListId;
            _resultValue.remoteAs = remoteAs;
            _resultValue.remoteAsVariable = remoteAsVariable;
            _resultValue.saLimit = saLimit;
            _resultValue.saLimitVariable = saLimitVariable;
            return _resultValue;
        }
    }
}
