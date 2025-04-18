// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sdwan.outputs.TransportRoutingBgpFeatureIpv6NeighborAddressFamily;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TransportRoutingBgpFeatureIpv6Neighbor {
    /**
     * @return Set IPv6 neighbor address
     * 
     */
    private @Nullable String address;
    /**
     * @return Set IPv6 BGP address family
     * 
     */
    private @Nullable List<TransportRoutingBgpFeatureIpv6NeighborAddressFamily> addressFamilies;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String addressVariable;
    /**
     * @return The number of accept as-path with my AS present in it
     *   - Range: `1`-`10`
     * 
     */
    private @Nullable Integer allowasInNumber;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String allowasInNumberVariable;
    /**
     * @return Override matching AS-number while sending update
     *   - Default value: `false`
     * 
     */
    private @Nullable Boolean asOverride;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String asOverrideVariable;
    /**
     * @return Set description
     * 
     */
    private @Nullable String description;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String descriptionVariable;
    /**
     * @return Set TTL value for peers that are not directly connected
     *   - Range: `1`-`255`
     *   - Default value: `1`
     * 
     */
    private @Nullable Integer ebgpMultihop;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String ebgpMultihopVariable;
    /**
     * @return Interval (seconds) not receiving a keepalive message declares a BGP peer down
     *   - Range: `0`-`65535`
     *   - Default value: `180`
     * 
     */
    private @Nullable Integer holdTime;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String holdTimeVariable;
    /**
     * @return Interval (seconds) of keepalive messages sent to its BGP peer
     *   - Range: `0`-`65535`
     *   - Default value: `60`
     * 
     */
    private @Nullable Integer keepaliveTime;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String keepaliveTimeVariable;
    /**
     * @return Set local autonomous system number,Local-AS cannot have the local BGP protocol AS number or the AS number of the remote peer.The local-as is valid only if the peer is a true eBGP peer. It does not work for two peers in different sub-ASs in a confederation.
     * 
     */
    private @Nullable Integer localAs;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String localAsVariable;
    /**
     * @return Set router to be next hop for routes advertised to neighbor
     *   - Default value: `false`
     * 
     */
    private @Nullable Boolean nextHopSelf;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String nextHopSelfVariable;
    /**
     * @return Set MD5 password on TCP connection with BGP peer
     * 
     */
    private @Nullable String password;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String passwordVariable;
    /**
     * @return Set remote autonomous system number
     * 
     */
    private @Nullable Integer remoteAs;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String remoteAsVariable;
    /**
     * @return Send community attribute
     *   - Default value: `true`
     * 
     */
    private @Nullable Boolean sendCommunity;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String sendCommunityVariable;
    /**
     * @return Send extended community attribute
     *   - Default value: `true`
     * 
     */
    private @Nullable Boolean sendExtendedCommunity;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String sendExtendedCommunityVariable;
    /**
     * @return Enable or disable a BGP neighbor
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
     * @return Source interface name for BGP neighbor
     * 
     */
    private @Nullable String updateSourceInterface;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String updateSourceInterfaceVariable;

    private TransportRoutingBgpFeatureIpv6Neighbor() {}
    /**
     * @return Set IPv6 neighbor address
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * @return Set IPv6 BGP address family
     * 
     */
    public List<TransportRoutingBgpFeatureIpv6NeighborAddressFamily> addressFamilies() {
        return this.addressFamilies == null ? List.of() : this.addressFamilies;
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> addressVariable() {
        return Optional.ofNullable(this.addressVariable);
    }
    /**
     * @return The number of accept as-path with my AS present in it
     *   - Range: `1`-`10`
     * 
     */
    public Optional<Integer> allowasInNumber() {
        return Optional.ofNullable(this.allowasInNumber);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> allowasInNumberVariable() {
        return Optional.ofNullable(this.allowasInNumberVariable);
    }
    /**
     * @return Override matching AS-number while sending update
     *   - Default value: `false`
     * 
     */
    public Optional<Boolean> asOverride() {
        return Optional.ofNullable(this.asOverride);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> asOverrideVariable() {
        return Optional.ofNullable(this.asOverrideVariable);
    }
    /**
     * @return Set description
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> descriptionVariable() {
        return Optional.ofNullable(this.descriptionVariable);
    }
    /**
     * @return Set TTL value for peers that are not directly connected
     *   - Range: `1`-`255`
     *   - Default value: `1`
     * 
     */
    public Optional<Integer> ebgpMultihop() {
        return Optional.ofNullable(this.ebgpMultihop);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> ebgpMultihopVariable() {
        return Optional.ofNullable(this.ebgpMultihopVariable);
    }
    /**
     * @return Interval (seconds) not receiving a keepalive message declares a BGP peer down
     *   - Range: `0`-`65535`
     *   - Default value: `180`
     * 
     */
    public Optional<Integer> holdTime() {
        return Optional.ofNullable(this.holdTime);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> holdTimeVariable() {
        return Optional.ofNullable(this.holdTimeVariable);
    }
    /**
     * @return Interval (seconds) of keepalive messages sent to its BGP peer
     *   - Range: `0`-`65535`
     *   - Default value: `60`
     * 
     */
    public Optional<Integer> keepaliveTime() {
        return Optional.ofNullable(this.keepaliveTime);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> keepaliveTimeVariable() {
        return Optional.ofNullable(this.keepaliveTimeVariable);
    }
    /**
     * @return Set local autonomous system number,Local-AS cannot have the local BGP protocol AS number or the AS number of the remote peer.The local-as is valid only if the peer is a true eBGP peer. It does not work for two peers in different sub-ASs in a confederation.
     * 
     */
    public Optional<Integer> localAs() {
        return Optional.ofNullable(this.localAs);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> localAsVariable() {
        return Optional.ofNullable(this.localAsVariable);
    }
    /**
     * @return Set router to be next hop for routes advertised to neighbor
     *   - Default value: `false`
     * 
     */
    public Optional<Boolean> nextHopSelf() {
        return Optional.ofNullable(this.nextHopSelf);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> nextHopSelfVariable() {
        return Optional.ofNullable(this.nextHopSelfVariable);
    }
    /**
     * @return Set MD5 password on TCP connection with BGP peer
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> passwordVariable() {
        return Optional.ofNullable(this.passwordVariable);
    }
    /**
     * @return Set remote autonomous system number
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
     * @return Send community attribute
     *   - Default value: `true`
     * 
     */
    public Optional<Boolean> sendCommunity() {
        return Optional.ofNullable(this.sendCommunity);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> sendCommunityVariable() {
        return Optional.ofNullable(this.sendCommunityVariable);
    }
    /**
     * @return Send extended community attribute
     *   - Default value: `true`
     * 
     */
    public Optional<Boolean> sendExtendedCommunity() {
        return Optional.ofNullable(this.sendExtendedCommunity);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> sendExtendedCommunityVariable() {
        return Optional.ofNullable(this.sendExtendedCommunityVariable);
    }
    /**
     * @return Enable or disable a BGP neighbor
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
     * @return Source interface name for BGP neighbor
     * 
     */
    public Optional<String> updateSourceInterface() {
        return Optional.ofNullable(this.updateSourceInterface);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> updateSourceInterfaceVariable() {
        return Optional.ofNullable(this.updateSourceInterfaceVariable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransportRoutingBgpFeatureIpv6Neighbor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String address;
        private @Nullable List<TransportRoutingBgpFeatureIpv6NeighborAddressFamily> addressFamilies;
        private @Nullable String addressVariable;
        private @Nullable Integer allowasInNumber;
        private @Nullable String allowasInNumberVariable;
        private @Nullable Boolean asOverride;
        private @Nullable String asOverrideVariable;
        private @Nullable String description;
        private @Nullable String descriptionVariable;
        private @Nullable Integer ebgpMultihop;
        private @Nullable String ebgpMultihopVariable;
        private @Nullable Integer holdTime;
        private @Nullable String holdTimeVariable;
        private @Nullable Integer keepaliveTime;
        private @Nullable String keepaliveTimeVariable;
        private @Nullable Integer localAs;
        private @Nullable String localAsVariable;
        private @Nullable Boolean nextHopSelf;
        private @Nullable String nextHopSelfVariable;
        private @Nullable String password;
        private @Nullable String passwordVariable;
        private @Nullable Integer remoteAs;
        private @Nullable String remoteAsVariable;
        private @Nullable Boolean sendCommunity;
        private @Nullable String sendCommunityVariable;
        private @Nullable Boolean sendExtendedCommunity;
        private @Nullable String sendExtendedCommunityVariable;
        private @Nullable Boolean shutdown;
        private @Nullable String shutdownVariable;
        private @Nullable String updateSourceInterface;
        private @Nullable String updateSourceInterfaceVariable;
        public Builder() {}
        public Builder(TransportRoutingBgpFeatureIpv6Neighbor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.addressFamilies = defaults.addressFamilies;
    	      this.addressVariable = defaults.addressVariable;
    	      this.allowasInNumber = defaults.allowasInNumber;
    	      this.allowasInNumberVariable = defaults.allowasInNumberVariable;
    	      this.asOverride = defaults.asOverride;
    	      this.asOverrideVariable = defaults.asOverrideVariable;
    	      this.description = defaults.description;
    	      this.descriptionVariable = defaults.descriptionVariable;
    	      this.ebgpMultihop = defaults.ebgpMultihop;
    	      this.ebgpMultihopVariable = defaults.ebgpMultihopVariable;
    	      this.holdTime = defaults.holdTime;
    	      this.holdTimeVariable = defaults.holdTimeVariable;
    	      this.keepaliveTime = defaults.keepaliveTime;
    	      this.keepaliveTimeVariable = defaults.keepaliveTimeVariable;
    	      this.localAs = defaults.localAs;
    	      this.localAsVariable = defaults.localAsVariable;
    	      this.nextHopSelf = defaults.nextHopSelf;
    	      this.nextHopSelfVariable = defaults.nextHopSelfVariable;
    	      this.password = defaults.password;
    	      this.passwordVariable = defaults.passwordVariable;
    	      this.remoteAs = defaults.remoteAs;
    	      this.remoteAsVariable = defaults.remoteAsVariable;
    	      this.sendCommunity = defaults.sendCommunity;
    	      this.sendCommunityVariable = defaults.sendCommunityVariable;
    	      this.sendExtendedCommunity = defaults.sendExtendedCommunity;
    	      this.sendExtendedCommunityVariable = defaults.sendExtendedCommunityVariable;
    	      this.shutdown = defaults.shutdown;
    	      this.shutdownVariable = defaults.shutdownVariable;
    	      this.updateSourceInterface = defaults.updateSourceInterface;
    	      this.updateSourceInterfaceVariable = defaults.updateSourceInterfaceVariable;
        }

        @CustomType.Setter
        public Builder address(@Nullable String address) {

            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder addressFamilies(@Nullable List<TransportRoutingBgpFeatureIpv6NeighborAddressFamily> addressFamilies) {

            this.addressFamilies = addressFamilies;
            return this;
        }
        public Builder addressFamilies(TransportRoutingBgpFeatureIpv6NeighborAddressFamily... addressFamilies) {
            return addressFamilies(List.of(addressFamilies));
        }
        @CustomType.Setter
        public Builder addressVariable(@Nullable String addressVariable) {

            this.addressVariable = addressVariable;
            return this;
        }
        @CustomType.Setter
        public Builder allowasInNumber(@Nullable Integer allowasInNumber) {

            this.allowasInNumber = allowasInNumber;
            return this;
        }
        @CustomType.Setter
        public Builder allowasInNumberVariable(@Nullable String allowasInNumberVariable) {

            this.allowasInNumberVariable = allowasInNumberVariable;
            return this;
        }
        @CustomType.Setter
        public Builder asOverride(@Nullable Boolean asOverride) {

            this.asOverride = asOverride;
            return this;
        }
        @CustomType.Setter
        public Builder asOverrideVariable(@Nullable String asOverrideVariable) {

            this.asOverrideVariable = asOverrideVariable;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder descriptionVariable(@Nullable String descriptionVariable) {

            this.descriptionVariable = descriptionVariable;
            return this;
        }
        @CustomType.Setter
        public Builder ebgpMultihop(@Nullable Integer ebgpMultihop) {

            this.ebgpMultihop = ebgpMultihop;
            return this;
        }
        @CustomType.Setter
        public Builder ebgpMultihopVariable(@Nullable String ebgpMultihopVariable) {

            this.ebgpMultihopVariable = ebgpMultihopVariable;
            return this;
        }
        @CustomType.Setter
        public Builder holdTime(@Nullable Integer holdTime) {

            this.holdTime = holdTime;
            return this;
        }
        @CustomType.Setter
        public Builder holdTimeVariable(@Nullable String holdTimeVariable) {

            this.holdTimeVariable = holdTimeVariable;
            return this;
        }
        @CustomType.Setter
        public Builder keepaliveTime(@Nullable Integer keepaliveTime) {

            this.keepaliveTime = keepaliveTime;
            return this;
        }
        @CustomType.Setter
        public Builder keepaliveTimeVariable(@Nullable String keepaliveTimeVariable) {

            this.keepaliveTimeVariable = keepaliveTimeVariable;
            return this;
        }
        @CustomType.Setter
        public Builder localAs(@Nullable Integer localAs) {

            this.localAs = localAs;
            return this;
        }
        @CustomType.Setter
        public Builder localAsVariable(@Nullable String localAsVariable) {

            this.localAsVariable = localAsVariable;
            return this;
        }
        @CustomType.Setter
        public Builder nextHopSelf(@Nullable Boolean nextHopSelf) {

            this.nextHopSelf = nextHopSelf;
            return this;
        }
        @CustomType.Setter
        public Builder nextHopSelfVariable(@Nullable String nextHopSelfVariable) {

            this.nextHopSelfVariable = nextHopSelfVariable;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {

            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder passwordVariable(@Nullable String passwordVariable) {

            this.passwordVariable = passwordVariable;
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
        public Builder sendCommunity(@Nullable Boolean sendCommunity) {

            this.sendCommunity = sendCommunity;
            return this;
        }
        @CustomType.Setter
        public Builder sendCommunityVariable(@Nullable String sendCommunityVariable) {

            this.sendCommunityVariable = sendCommunityVariable;
            return this;
        }
        @CustomType.Setter
        public Builder sendExtendedCommunity(@Nullable Boolean sendExtendedCommunity) {

            this.sendExtendedCommunity = sendExtendedCommunity;
            return this;
        }
        @CustomType.Setter
        public Builder sendExtendedCommunityVariable(@Nullable String sendExtendedCommunityVariable) {

            this.sendExtendedCommunityVariable = sendExtendedCommunityVariable;
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
        public Builder updateSourceInterface(@Nullable String updateSourceInterface) {

            this.updateSourceInterface = updateSourceInterface;
            return this;
        }
        @CustomType.Setter
        public Builder updateSourceInterfaceVariable(@Nullable String updateSourceInterfaceVariable) {

            this.updateSourceInterfaceVariable = updateSourceInterfaceVariable;
            return this;
        }
        public TransportRoutingBgpFeatureIpv6Neighbor build() {
            final var _resultValue = new TransportRoutingBgpFeatureIpv6Neighbor();
            _resultValue.address = address;
            _resultValue.addressFamilies = addressFamilies;
            _resultValue.addressVariable = addressVariable;
            _resultValue.allowasInNumber = allowasInNumber;
            _resultValue.allowasInNumberVariable = allowasInNumberVariable;
            _resultValue.asOverride = asOverride;
            _resultValue.asOverrideVariable = asOverrideVariable;
            _resultValue.description = description;
            _resultValue.descriptionVariable = descriptionVariable;
            _resultValue.ebgpMultihop = ebgpMultihop;
            _resultValue.ebgpMultihopVariable = ebgpMultihopVariable;
            _resultValue.holdTime = holdTime;
            _resultValue.holdTimeVariable = holdTimeVariable;
            _resultValue.keepaliveTime = keepaliveTime;
            _resultValue.keepaliveTimeVariable = keepaliveTimeVariable;
            _resultValue.localAs = localAs;
            _resultValue.localAsVariable = localAsVariable;
            _resultValue.nextHopSelf = nextHopSelf;
            _resultValue.nextHopSelfVariable = nextHopSelfVariable;
            _resultValue.password = password;
            _resultValue.passwordVariable = passwordVariable;
            _resultValue.remoteAs = remoteAs;
            _resultValue.remoteAsVariable = remoteAsVariable;
            _resultValue.sendCommunity = sendCommunity;
            _resultValue.sendCommunityVariable = sendCommunityVariable;
            _resultValue.sendExtendedCommunity = sendExtendedCommunity;
            _resultValue.sendExtendedCommunityVariable = sendExtendedCommunityVariable;
            _resultValue.shutdown = shutdown;
            _resultValue.shutdownVariable = shutdownVariable;
            _resultValue.updateSourceInterface = updateSourceInterface;
            _resultValue.updateSourceInterfaceVariable = updateSourceInterfaceVariable;
            return _resultValue;
        }
    }
}
