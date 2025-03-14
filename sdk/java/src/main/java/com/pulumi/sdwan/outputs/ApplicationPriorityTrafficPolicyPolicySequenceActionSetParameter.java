// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationPriorityTrafficPolicyPolicySequenceActionSetParameter {
    /**
     * @return - Range: `0`-`63`
     * 
     */
    private @Nullable Integer dscp;
    private @Nullable String forwardingClassListId;
    private @Nullable List<String> localTlocListColors;
    /**
     * @return - Choices: `ipsec`, `gre`
     * 
     */
    private @Nullable String localTlocListEncapsulation;
    private @Nullable String localTlocListRestrict;
    private @Nullable String nextHopIpv4;
    private @Nullable String nextHopIpv6;
    private @Nullable Boolean nextHopLoose;
    private @Nullable String policerId;
    private @Nullable String preferredColorGroupId;
    private @Nullable List<String> preferredRemoteColorIds;
    private @Nullable String preferredRemoteColorRestrict;
    private @Nullable Boolean serviceChainFallbackToRouting;
    private @Nullable Boolean serviceChainLocal;
    private @Nullable List<String> serviceChainTlocColors;
    /**
     * @return - Choices: `ipsec`, `gre`
     * 
     */
    private @Nullable String serviceChainTlocEncapsulation;
    private @Nullable String serviceChainTlocIp;
    private @Nullable String serviceChainTlocListId;
    /**
     * @return - Choices: `SC1`, `SC2`, `SC4`, `SC5`, `SC6`, `SC7`, `SC8`, `SC9`, `SC10`, `SC11`, `SC12`, `SC13`, `SC14`, `SC15`, `SC16`
     * 
     */
    private @Nullable String serviceChainType;
    /**
     * @return - Range: `0`-`65530`
     * 
     */
    private @Nullable Integer serviceChainVpn;
    private @Nullable List<String> serviceTlocColors;
    /**
     * @return - Choices: `ipsec`, `gre`
     * 
     */
    private @Nullable String serviceTlocEncapsulation;
    private @Nullable String serviceTlocIp;
    private @Nullable String serviceTlocListId;
    /**
     * @return - Choices: `FW`, `IDS`, `IDP`, `netsvc1`, `netsvc2`, `netsvc3`, `netsvc4`, `appqoe`
     * 
     */
    private @Nullable String serviceType;
    private @Nullable String serviceVpn;
    private @Nullable List<String> tlocColors;
    /**
     * @return - Choices: `ipsec`, `gre`
     * 
     */
    private @Nullable String tlocEncapsulation;
    private @Nullable String tlocIp;
    private @Nullable String tlocListId;
    private @Nullable String vpn;

    private ApplicationPriorityTrafficPolicyPolicySequenceActionSetParameter() {}
    /**
     * @return - Range: `0`-`63`
     * 
     */
    public Optional<Integer> dscp() {
        return Optional.ofNullable(this.dscp);
    }
    public Optional<String> forwardingClassListId() {
        return Optional.ofNullable(this.forwardingClassListId);
    }
    public List<String> localTlocListColors() {
        return this.localTlocListColors == null ? List.of() : this.localTlocListColors;
    }
    /**
     * @return - Choices: `ipsec`, `gre`
     * 
     */
    public Optional<String> localTlocListEncapsulation() {
        return Optional.ofNullable(this.localTlocListEncapsulation);
    }
    public Optional<String> localTlocListRestrict() {
        return Optional.ofNullable(this.localTlocListRestrict);
    }
    public Optional<String> nextHopIpv4() {
        return Optional.ofNullable(this.nextHopIpv4);
    }
    public Optional<String> nextHopIpv6() {
        return Optional.ofNullable(this.nextHopIpv6);
    }
    public Optional<Boolean> nextHopLoose() {
        return Optional.ofNullable(this.nextHopLoose);
    }
    public Optional<String> policerId() {
        return Optional.ofNullable(this.policerId);
    }
    public Optional<String> preferredColorGroupId() {
        return Optional.ofNullable(this.preferredColorGroupId);
    }
    public List<String> preferredRemoteColorIds() {
        return this.preferredRemoteColorIds == null ? List.of() : this.preferredRemoteColorIds;
    }
    public Optional<String> preferredRemoteColorRestrict() {
        return Optional.ofNullable(this.preferredRemoteColorRestrict);
    }
    public Optional<Boolean> serviceChainFallbackToRouting() {
        return Optional.ofNullable(this.serviceChainFallbackToRouting);
    }
    public Optional<Boolean> serviceChainLocal() {
        return Optional.ofNullable(this.serviceChainLocal);
    }
    public List<String> serviceChainTlocColors() {
        return this.serviceChainTlocColors == null ? List.of() : this.serviceChainTlocColors;
    }
    /**
     * @return - Choices: `ipsec`, `gre`
     * 
     */
    public Optional<String> serviceChainTlocEncapsulation() {
        return Optional.ofNullable(this.serviceChainTlocEncapsulation);
    }
    public Optional<String> serviceChainTlocIp() {
        return Optional.ofNullable(this.serviceChainTlocIp);
    }
    public Optional<String> serviceChainTlocListId() {
        return Optional.ofNullable(this.serviceChainTlocListId);
    }
    /**
     * @return - Choices: `SC1`, `SC2`, `SC4`, `SC5`, `SC6`, `SC7`, `SC8`, `SC9`, `SC10`, `SC11`, `SC12`, `SC13`, `SC14`, `SC15`, `SC16`
     * 
     */
    public Optional<String> serviceChainType() {
        return Optional.ofNullable(this.serviceChainType);
    }
    /**
     * @return - Range: `0`-`65530`
     * 
     */
    public Optional<Integer> serviceChainVpn() {
        return Optional.ofNullable(this.serviceChainVpn);
    }
    public List<String> serviceTlocColors() {
        return this.serviceTlocColors == null ? List.of() : this.serviceTlocColors;
    }
    /**
     * @return - Choices: `ipsec`, `gre`
     * 
     */
    public Optional<String> serviceTlocEncapsulation() {
        return Optional.ofNullable(this.serviceTlocEncapsulation);
    }
    public Optional<String> serviceTlocIp() {
        return Optional.ofNullable(this.serviceTlocIp);
    }
    public Optional<String> serviceTlocListId() {
        return Optional.ofNullable(this.serviceTlocListId);
    }
    /**
     * @return - Choices: `FW`, `IDS`, `IDP`, `netsvc1`, `netsvc2`, `netsvc3`, `netsvc4`, `appqoe`
     * 
     */
    public Optional<String> serviceType() {
        return Optional.ofNullable(this.serviceType);
    }
    public Optional<String> serviceVpn() {
        return Optional.ofNullable(this.serviceVpn);
    }
    public List<String> tlocColors() {
        return this.tlocColors == null ? List.of() : this.tlocColors;
    }
    /**
     * @return - Choices: `ipsec`, `gre`
     * 
     */
    public Optional<String> tlocEncapsulation() {
        return Optional.ofNullable(this.tlocEncapsulation);
    }
    public Optional<String> tlocIp() {
        return Optional.ofNullable(this.tlocIp);
    }
    public Optional<String> tlocListId() {
        return Optional.ofNullable(this.tlocListId);
    }
    public Optional<String> vpn() {
        return Optional.ofNullable(this.vpn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationPriorityTrafficPolicyPolicySequenceActionSetParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer dscp;
        private @Nullable String forwardingClassListId;
        private @Nullable List<String> localTlocListColors;
        private @Nullable String localTlocListEncapsulation;
        private @Nullable String localTlocListRestrict;
        private @Nullable String nextHopIpv4;
        private @Nullable String nextHopIpv6;
        private @Nullable Boolean nextHopLoose;
        private @Nullable String policerId;
        private @Nullable String preferredColorGroupId;
        private @Nullable List<String> preferredRemoteColorIds;
        private @Nullable String preferredRemoteColorRestrict;
        private @Nullable Boolean serviceChainFallbackToRouting;
        private @Nullable Boolean serviceChainLocal;
        private @Nullable List<String> serviceChainTlocColors;
        private @Nullable String serviceChainTlocEncapsulation;
        private @Nullable String serviceChainTlocIp;
        private @Nullable String serviceChainTlocListId;
        private @Nullable String serviceChainType;
        private @Nullable Integer serviceChainVpn;
        private @Nullable List<String> serviceTlocColors;
        private @Nullable String serviceTlocEncapsulation;
        private @Nullable String serviceTlocIp;
        private @Nullable String serviceTlocListId;
        private @Nullable String serviceType;
        private @Nullable String serviceVpn;
        private @Nullable List<String> tlocColors;
        private @Nullable String tlocEncapsulation;
        private @Nullable String tlocIp;
        private @Nullable String tlocListId;
        private @Nullable String vpn;
        public Builder() {}
        public Builder(ApplicationPriorityTrafficPolicyPolicySequenceActionSetParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dscp = defaults.dscp;
    	      this.forwardingClassListId = defaults.forwardingClassListId;
    	      this.localTlocListColors = defaults.localTlocListColors;
    	      this.localTlocListEncapsulation = defaults.localTlocListEncapsulation;
    	      this.localTlocListRestrict = defaults.localTlocListRestrict;
    	      this.nextHopIpv4 = defaults.nextHopIpv4;
    	      this.nextHopIpv6 = defaults.nextHopIpv6;
    	      this.nextHopLoose = defaults.nextHopLoose;
    	      this.policerId = defaults.policerId;
    	      this.preferredColorGroupId = defaults.preferredColorGroupId;
    	      this.preferredRemoteColorIds = defaults.preferredRemoteColorIds;
    	      this.preferredRemoteColorRestrict = defaults.preferredRemoteColorRestrict;
    	      this.serviceChainFallbackToRouting = defaults.serviceChainFallbackToRouting;
    	      this.serviceChainLocal = defaults.serviceChainLocal;
    	      this.serviceChainTlocColors = defaults.serviceChainTlocColors;
    	      this.serviceChainTlocEncapsulation = defaults.serviceChainTlocEncapsulation;
    	      this.serviceChainTlocIp = defaults.serviceChainTlocIp;
    	      this.serviceChainTlocListId = defaults.serviceChainTlocListId;
    	      this.serviceChainType = defaults.serviceChainType;
    	      this.serviceChainVpn = defaults.serviceChainVpn;
    	      this.serviceTlocColors = defaults.serviceTlocColors;
    	      this.serviceTlocEncapsulation = defaults.serviceTlocEncapsulation;
    	      this.serviceTlocIp = defaults.serviceTlocIp;
    	      this.serviceTlocListId = defaults.serviceTlocListId;
    	      this.serviceType = defaults.serviceType;
    	      this.serviceVpn = defaults.serviceVpn;
    	      this.tlocColors = defaults.tlocColors;
    	      this.tlocEncapsulation = defaults.tlocEncapsulation;
    	      this.tlocIp = defaults.tlocIp;
    	      this.tlocListId = defaults.tlocListId;
    	      this.vpn = defaults.vpn;
        }

        @CustomType.Setter
        public Builder dscp(@Nullable Integer dscp) {

            this.dscp = dscp;
            return this;
        }
        @CustomType.Setter
        public Builder forwardingClassListId(@Nullable String forwardingClassListId) {

            this.forwardingClassListId = forwardingClassListId;
            return this;
        }
        @CustomType.Setter
        public Builder localTlocListColors(@Nullable List<String> localTlocListColors) {

            this.localTlocListColors = localTlocListColors;
            return this;
        }
        public Builder localTlocListColors(String... localTlocListColors) {
            return localTlocListColors(List.of(localTlocListColors));
        }
        @CustomType.Setter
        public Builder localTlocListEncapsulation(@Nullable String localTlocListEncapsulation) {

            this.localTlocListEncapsulation = localTlocListEncapsulation;
            return this;
        }
        @CustomType.Setter
        public Builder localTlocListRestrict(@Nullable String localTlocListRestrict) {

            this.localTlocListRestrict = localTlocListRestrict;
            return this;
        }
        @CustomType.Setter
        public Builder nextHopIpv4(@Nullable String nextHopIpv4) {

            this.nextHopIpv4 = nextHopIpv4;
            return this;
        }
        @CustomType.Setter
        public Builder nextHopIpv6(@Nullable String nextHopIpv6) {

            this.nextHopIpv6 = nextHopIpv6;
            return this;
        }
        @CustomType.Setter
        public Builder nextHopLoose(@Nullable Boolean nextHopLoose) {

            this.nextHopLoose = nextHopLoose;
            return this;
        }
        @CustomType.Setter
        public Builder policerId(@Nullable String policerId) {

            this.policerId = policerId;
            return this;
        }
        @CustomType.Setter
        public Builder preferredColorGroupId(@Nullable String preferredColorGroupId) {

            this.preferredColorGroupId = preferredColorGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder preferredRemoteColorIds(@Nullable List<String> preferredRemoteColorIds) {

            this.preferredRemoteColorIds = preferredRemoteColorIds;
            return this;
        }
        public Builder preferredRemoteColorIds(String... preferredRemoteColorIds) {
            return preferredRemoteColorIds(List.of(preferredRemoteColorIds));
        }
        @CustomType.Setter
        public Builder preferredRemoteColorRestrict(@Nullable String preferredRemoteColorRestrict) {

            this.preferredRemoteColorRestrict = preferredRemoteColorRestrict;
            return this;
        }
        @CustomType.Setter
        public Builder serviceChainFallbackToRouting(@Nullable Boolean serviceChainFallbackToRouting) {

            this.serviceChainFallbackToRouting = serviceChainFallbackToRouting;
            return this;
        }
        @CustomType.Setter
        public Builder serviceChainLocal(@Nullable Boolean serviceChainLocal) {

            this.serviceChainLocal = serviceChainLocal;
            return this;
        }
        @CustomType.Setter
        public Builder serviceChainTlocColors(@Nullable List<String> serviceChainTlocColors) {

            this.serviceChainTlocColors = serviceChainTlocColors;
            return this;
        }
        public Builder serviceChainTlocColors(String... serviceChainTlocColors) {
            return serviceChainTlocColors(List.of(serviceChainTlocColors));
        }
        @CustomType.Setter
        public Builder serviceChainTlocEncapsulation(@Nullable String serviceChainTlocEncapsulation) {

            this.serviceChainTlocEncapsulation = serviceChainTlocEncapsulation;
            return this;
        }
        @CustomType.Setter
        public Builder serviceChainTlocIp(@Nullable String serviceChainTlocIp) {

            this.serviceChainTlocIp = serviceChainTlocIp;
            return this;
        }
        @CustomType.Setter
        public Builder serviceChainTlocListId(@Nullable String serviceChainTlocListId) {

            this.serviceChainTlocListId = serviceChainTlocListId;
            return this;
        }
        @CustomType.Setter
        public Builder serviceChainType(@Nullable String serviceChainType) {

            this.serviceChainType = serviceChainType;
            return this;
        }
        @CustomType.Setter
        public Builder serviceChainVpn(@Nullable Integer serviceChainVpn) {

            this.serviceChainVpn = serviceChainVpn;
            return this;
        }
        @CustomType.Setter
        public Builder serviceTlocColors(@Nullable List<String> serviceTlocColors) {

            this.serviceTlocColors = serviceTlocColors;
            return this;
        }
        public Builder serviceTlocColors(String... serviceTlocColors) {
            return serviceTlocColors(List.of(serviceTlocColors));
        }
        @CustomType.Setter
        public Builder serviceTlocEncapsulation(@Nullable String serviceTlocEncapsulation) {

            this.serviceTlocEncapsulation = serviceTlocEncapsulation;
            return this;
        }
        @CustomType.Setter
        public Builder serviceTlocIp(@Nullable String serviceTlocIp) {

            this.serviceTlocIp = serviceTlocIp;
            return this;
        }
        @CustomType.Setter
        public Builder serviceTlocListId(@Nullable String serviceTlocListId) {

            this.serviceTlocListId = serviceTlocListId;
            return this;
        }
        @CustomType.Setter
        public Builder serviceType(@Nullable String serviceType) {

            this.serviceType = serviceType;
            return this;
        }
        @CustomType.Setter
        public Builder serviceVpn(@Nullable String serviceVpn) {

            this.serviceVpn = serviceVpn;
            return this;
        }
        @CustomType.Setter
        public Builder tlocColors(@Nullable List<String> tlocColors) {

            this.tlocColors = tlocColors;
            return this;
        }
        public Builder tlocColors(String... tlocColors) {
            return tlocColors(List.of(tlocColors));
        }
        @CustomType.Setter
        public Builder tlocEncapsulation(@Nullable String tlocEncapsulation) {

            this.tlocEncapsulation = tlocEncapsulation;
            return this;
        }
        @CustomType.Setter
        public Builder tlocIp(@Nullable String tlocIp) {

            this.tlocIp = tlocIp;
            return this;
        }
        @CustomType.Setter
        public Builder tlocListId(@Nullable String tlocListId) {

            this.tlocListId = tlocListId;
            return this;
        }
        @CustomType.Setter
        public Builder vpn(@Nullable String vpn) {

            this.vpn = vpn;
            return this;
        }
        public ApplicationPriorityTrafficPolicyPolicySequenceActionSetParameter build() {
            final var _resultValue = new ApplicationPriorityTrafficPolicyPolicySequenceActionSetParameter();
            _resultValue.dscp = dscp;
            _resultValue.forwardingClassListId = forwardingClassListId;
            _resultValue.localTlocListColors = localTlocListColors;
            _resultValue.localTlocListEncapsulation = localTlocListEncapsulation;
            _resultValue.localTlocListRestrict = localTlocListRestrict;
            _resultValue.nextHopIpv4 = nextHopIpv4;
            _resultValue.nextHopIpv6 = nextHopIpv6;
            _resultValue.nextHopLoose = nextHopLoose;
            _resultValue.policerId = policerId;
            _resultValue.preferredColorGroupId = preferredColorGroupId;
            _resultValue.preferredRemoteColorIds = preferredRemoteColorIds;
            _resultValue.preferredRemoteColorRestrict = preferredRemoteColorRestrict;
            _resultValue.serviceChainFallbackToRouting = serviceChainFallbackToRouting;
            _resultValue.serviceChainLocal = serviceChainLocal;
            _resultValue.serviceChainTlocColors = serviceChainTlocColors;
            _resultValue.serviceChainTlocEncapsulation = serviceChainTlocEncapsulation;
            _resultValue.serviceChainTlocIp = serviceChainTlocIp;
            _resultValue.serviceChainTlocListId = serviceChainTlocListId;
            _resultValue.serviceChainType = serviceChainType;
            _resultValue.serviceChainVpn = serviceChainVpn;
            _resultValue.serviceTlocColors = serviceTlocColors;
            _resultValue.serviceTlocEncapsulation = serviceTlocEncapsulation;
            _resultValue.serviceTlocIp = serviceTlocIp;
            _resultValue.serviceTlocListId = serviceTlocListId;
            _resultValue.serviceType = serviceType;
            _resultValue.serviceVpn = serviceVpn;
            _resultValue.tlocColors = tlocColors;
            _resultValue.tlocEncapsulation = tlocEncapsulation;
            _resultValue.tlocIp = tlocIp;
            _resultValue.tlocListId = tlocListId;
            _resultValue.vpn = vpn;
            return _resultValue;
        }
    }
}
