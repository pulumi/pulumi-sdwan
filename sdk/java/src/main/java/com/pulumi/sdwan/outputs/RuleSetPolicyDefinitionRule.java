// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleSetPolicyDefinitionRule {
    /**
     * @return Destination data FQDN prefix list ID
     * 
     */
    private @Nullable String destinationDataFqdnPrefixListId;
    /**
     * @return Destination data FQDN prefix list version
     * 
     */
    private @Nullable Integer destinationDataFqdnPrefixListVersion;
    /**
     * @return Destination data IPv4 prefix list ID
     * 
     */
    private @Nullable String destinationDataIpv4PrefixListId;
    /**
     * @return Destination data IPv4 prefix list version
     * 
     */
    private @Nullable Integer destinationDataIpv4PrefixListVersion;
    /**
     * @return Destination fully qualified domain name
     * 
     */
    private @Nullable String destinationFqdn;
    /**
     * @return Destination geo location
     * 
     */
    private @Nullable String destinationGeoLocation;
    /**
     * @return Destination geo location list ID
     * 
     */
    private @Nullable String destinationGeoLocationListId;
    /**
     * @return Destination geo location list version
     * 
     */
    private @Nullable Integer destinationGeoLocationListVersion;
    /**
     * @return Destination IPv4 prefix
     * 
     */
    private @Nullable String destinationIpv4Prefix;
    /**
     * @return Destination IPv4 prefix variable name
     * 
     */
    private @Nullable String destinationIpv4PrefixVariable;
    /**
     * @return Destination object group ID
     * 
     */
    private @Nullable String destinationObjectGroupId;
    /**
     * @return Destination object group version
     * 
     */
    private @Nullable Integer destinationObjectGroupVersion;
    /**
     * @return Destination port or range of ports
     * 
     */
    private @Nullable String destinationPort;
    /**
     * @return Destination port list ID
     * 
     */
    private @Nullable String destinationPortListId;
    /**
     * @return Destination port list version
     * 
     */
    private @Nullable Integer destinationPortListVersion;
    /**
     * @return The name of the rule
     * 
     */
    private String name;
    /**
     * @return The order of the rule
     * 
     */
    private Integer order;
    /**
     * @return Protocol name
     * 
     */
    private @Nullable String protocol;
    /**
     * @return Protocol list ID
     * 
     */
    private @Nullable String protocolListId;
    /**
     * @return Protocol list version
     * 
     */
    private @Nullable Integer protocolListVersion;
    /**
     * @return Protocol number
     *   - Range: `0`-`255`
     * 
     */
    private @Nullable Integer protocolNumber;
    /**
     * @return Source data FQDN prefix list ID
     * 
     */
    private @Nullable String sourceDataFqdnPrefixListId;
    /**
     * @return Source data FQDN prefix list version
     * 
     */
    private @Nullable Integer sourceDataFqdnPrefixListVersion;
    /**
     * @return Source data IPv4 prefix list ID
     * 
     */
    private @Nullable String sourceDataIpv4PrefixListId;
    /**
     * @return Source data IPv4 prefix list version
     * 
     */
    private @Nullable Integer sourceDataIpv4PrefixListVersion;
    /**
     * @return Source fully qualified domain name
     * 
     */
    private @Nullable String sourceFqdn;
    /**
     * @return Source geo location
     * 
     */
    private @Nullable String sourceGeoLocation;
    /**
     * @return Source geo location list ID
     * 
     */
    private @Nullable String sourceGeoLocationListId;
    /**
     * @return Source geo location list version
     * 
     */
    private @Nullable Integer sourceGeoLocationListVersion;
    /**
     * @return Source IPv4 prefix
     * 
     */
    private @Nullable String sourceIpv4Prefix;
    /**
     * @return Source IPv4 prefix variable name
     * 
     */
    private @Nullable String sourceIpv4PrefixVariable;
    /**
     * @return Source object group ID
     * 
     */
    private @Nullable String sourceObjectGroupId;
    /**
     * @return Source object group version
     * 
     */
    private @Nullable Integer sourceObjectGroupVersion;
    /**
     * @return Source port or range of ports
     * 
     */
    private @Nullable String sourcePort;
    /**
     * @return Source port list ID
     * 
     */
    private @Nullable String sourcePortListId;
    /**
     * @return Source port list version
     * 
     */
    private @Nullable Integer sourcePortListVersion;

    private RuleSetPolicyDefinitionRule() {}
    /**
     * @return Destination data FQDN prefix list ID
     * 
     */
    public Optional<String> destinationDataFqdnPrefixListId() {
        return Optional.ofNullable(this.destinationDataFqdnPrefixListId);
    }
    /**
     * @return Destination data FQDN prefix list version
     * 
     */
    public Optional<Integer> destinationDataFqdnPrefixListVersion() {
        return Optional.ofNullable(this.destinationDataFqdnPrefixListVersion);
    }
    /**
     * @return Destination data IPv4 prefix list ID
     * 
     */
    public Optional<String> destinationDataIpv4PrefixListId() {
        return Optional.ofNullable(this.destinationDataIpv4PrefixListId);
    }
    /**
     * @return Destination data IPv4 prefix list version
     * 
     */
    public Optional<Integer> destinationDataIpv4PrefixListVersion() {
        return Optional.ofNullable(this.destinationDataIpv4PrefixListVersion);
    }
    /**
     * @return Destination fully qualified domain name
     * 
     */
    public Optional<String> destinationFqdn() {
        return Optional.ofNullable(this.destinationFqdn);
    }
    /**
     * @return Destination geo location
     * 
     */
    public Optional<String> destinationGeoLocation() {
        return Optional.ofNullable(this.destinationGeoLocation);
    }
    /**
     * @return Destination geo location list ID
     * 
     */
    public Optional<String> destinationGeoLocationListId() {
        return Optional.ofNullable(this.destinationGeoLocationListId);
    }
    /**
     * @return Destination geo location list version
     * 
     */
    public Optional<Integer> destinationGeoLocationListVersion() {
        return Optional.ofNullable(this.destinationGeoLocationListVersion);
    }
    /**
     * @return Destination IPv4 prefix
     * 
     */
    public Optional<String> destinationIpv4Prefix() {
        return Optional.ofNullable(this.destinationIpv4Prefix);
    }
    /**
     * @return Destination IPv4 prefix variable name
     * 
     */
    public Optional<String> destinationIpv4PrefixVariable() {
        return Optional.ofNullable(this.destinationIpv4PrefixVariable);
    }
    /**
     * @return Destination object group ID
     * 
     */
    public Optional<String> destinationObjectGroupId() {
        return Optional.ofNullable(this.destinationObjectGroupId);
    }
    /**
     * @return Destination object group version
     * 
     */
    public Optional<Integer> destinationObjectGroupVersion() {
        return Optional.ofNullable(this.destinationObjectGroupVersion);
    }
    /**
     * @return Destination port or range of ports
     * 
     */
    public Optional<String> destinationPort() {
        return Optional.ofNullable(this.destinationPort);
    }
    /**
     * @return Destination port list ID
     * 
     */
    public Optional<String> destinationPortListId() {
        return Optional.ofNullable(this.destinationPortListId);
    }
    /**
     * @return Destination port list version
     * 
     */
    public Optional<Integer> destinationPortListVersion() {
        return Optional.ofNullable(this.destinationPortListVersion);
    }
    /**
     * @return The name of the rule
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The order of the rule
     * 
     */
    public Integer order() {
        return this.order;
    }
    /**
     * @return Protocol name
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * @return Protocol list ID
     * 
     */
    public Optional<String> protocolListId() {
        return Optional.ofNullable(this.protocolListId);
    }
    /**
     * @return Protocol list version
     * 
     */
    public Optional<Integer> protocolListVersion() {
        return Optional.ofNullable(this.protocolListVersion);
    }
    /**
     * @return Protocol number
     *   - Range: `0`-`255`
     * 
     */
    public Optional<Integer> protocolNumber() {
        return Optional.ofNullable(this.protocolNumber);
    }
    /**
     * @return Source data FQDN prefix list ID
     * 
     */
    public Optional<String> sourceDataFqdnPrefixListId() {
        return Optional.ofNullable(this.sourceDataFqdnPrefixListId);
    }
    /**
     * @return Source data FQDN prefix list version
     * 
     */
    public Optional<Integer> sourceDataFqdnPrefixListVersion() {
        return Optional.ofNullable(this.sourceDataFqdnPrefixListVersion);
    }
    /**
     * @return Source data IPv4 prefix list ID
     * 
     */
    public Optional<String> sourceDataIpv4PrefixListId() {
        return Optional.ofNullable(this.sourceDataIpv4PrefixListId);
    }
    /**
     * @return Source data IPv4 prefix list version
     * 
     */
    public Optional<Integer> sourceDataIpv4PrefixListVersion() {
        return Optional.ofNullable(this.sourceDataIpv4PrefixListVersion);
    }
    /**
     * @return Source fully qualified domain name
     * 
     */
    public Optional<String> sourceFqdn() {
        return Optional.ofNullable(this.sourceFqdn);
    }
    /**
     * @return Source geo location
     * 
     */
    public Optional<String> sourceGeoLocation() {
        return Optional.ofNullable(this.sourceGeoLocation);
    }
    /**
     * @return Source geo location list ID
     * 
     */
    public Optional<String> sourceGeoLocationListId() {
        return Optional.ofNullable(this.sourceGeoLocationListId);
    }
    /**
     * @return Source geo location list version
     * 
     */
    public Optional<Integer> sourceGeoLocationListVersion() {
        return Optional.ofNullable(this.sourceGeoLocationListVersion);
    }
    /**
     * @return Source IPv4 prefix
     * 
     */
    public Optional<String> sourceIpv4Prefix() {
        return Optional.ofNullable(this.sourceIpv4Prefix);
    }
    /**
     * @return Source IPv4 prefix variable name
     * 
     */
    public Optional<String> sourceIpv4PrefixVariable() {
        return Optional.ofNullable(this.sourceIpv4PrefixVariable);
    }
    /**
     * @return Source object group ID
     * 
     */
    public Optional<String> sourceObjectGroupId() {
        return Optional.ofNullable(this.sourceObjectGroupId);
    }
    /**
     * @return Source object group version
     * 
     */
    public Optional<Integer> sourceObjectGroupVersion() {
        return Optional.ofNullable(this.sourceObjectGroupVersion);
    }
    /**
     * @return Source port or range of ports
     * 
     */
    public Optional<String> sourcePort() {
        return Optional.ofNullable(this.sourcePort);
    }
    /**
     * @return Source port list ID
     * 
     */
    public Optional<String> sourcePortListId() {
        return Optional.ofNullable(this.sourcePortListId);
    }
    /**
     * @return Source port list version
     * 
     */
    public Optional<Integer> sourcePortListVersion() {
        return Optional.ofNullable(this.sourcePortListVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleSetPolicyDefinitionRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String destinationDataFqdnPrefixListId;
        private @Nullable Integer destinationDataFqdnPrefixListVersion;
        private @Nullable String destinationDataIpv4PrefixListId;
        private @Nullable Integer destinationDataIpv4PrefixListVersion;
        private @Nullable String destinationFqdn;
        private @Nullable String destinationGeoLocation;
        private @Nullable String destinationGeoLocationListId;
        private @Nullable Integer destinationGeoLocationListVersion;
        private @Nullable String destinationIpv4Prefix;
        private @Nullable String destinationIpv4PrefixVariable;
        private @Nullable String destinationObjectGroupId;
        private @Nullable Integer destinationObjectGroupVersion;
        private @Nullable String destinationPort;
        private @Nullable String destinationPortListId;
        private @Nullable Integer destinationPortListVersion;
        private String name;
        private Integer order;
        private @Nullable String protocol;
        private @Nullable String protocolListId;
        private @Nullable Integer protocolListVersion;
        private @Nullable Integer protocolNumber;
        private @Nullable String sourceDataFqdnPrefixListId;
        private @Nullable Integer sourceDataFqdnPrefixListVersion;
        private @Nullable String sourceDataIpv4PrefixListId;
        private @Nullable Integer sourceDataIpv4PrefixListVersion;
        private @Nullable String sourceFqdn;
        private @Nullable String sourceGeoLocation;
        private @Nullable String sourceGeoLocationListId;
        private @Nullable Integer sourceGeoLocationListVersion;
        private @Nullable String sourceIpv4Prefix;
        private @Nullable String sourceIpv4PrefixVariable;
        private @Nullable String sourceObjectGroupId;
        private @Nullable Integer sourceObjectGroupVersion;
        private @Nullable String sourcePort;
        private @Nullable String sourcePortListId;
        private @Nullable Integer sourcePortListVersion;
        public Builder() {}
        public Builder(RuleSetPolicyDefinitionRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationDataFqdnPrefixListId = defaults.destinationDataFqdnPrefixListId;
    	      this.destinationDataFqdnPrefixListVersion = defaults.destinationDataFqdnPrefixListVersion;
    	      this.destinationDataIpv4PrefixListId = defaults.destinationDataIpv4PrefixListId;
    	      this.destinationDataIpv4PrefixListVersion = defaults.destinationDataIpv4PrefixListVersion;
    	      this.destinationFqdn = defaults.destinationFqdn;
    	      this.destinationGeoLocation = defaults.destinationGeoLocation;
    	      this.destinationGeoLocationListId = defaults.destinationGeoLocationListId;
    	      this.destinationGeoLocationListVersion = defaults.destinationGeoLocationListVersion;
    	      this.destinationIpv4Prefix = defaults.destinationIpv4Prefix;
    	      this.destinationIpv4PrefixVariable = defaults.destinationIpv4PrefixVariable;
    	      this.destinationObjectGroupId = defaults.destinationObjectGroupId;
    	      this.destinationObjectGroupVersion = defaults.destinationObjectGroupVersion;
    	      this.destinationPort = defaults.destinationPort;
    	      this.destinationPortListId = defaults.destinationPortListId;
    	      this.destinationPortListVersion = defaults.destinationPortListVersion;
    	      this.name = defaults.name;
    	      this.order = defaults.order;
    	      this.protocol = defaults.protocol;
    	      this.protocolListId = defaults.protocolListId;
    	      this.protocolListVersion = defaults.protocolListVersion;
    	      this.protocolNumber = defaults.protocolNumber;
    	      this.sourceDataFqdnPrefixListId = defaults.sourceDataFqdnPrefixListId;
    	      this.sourceDataFqdnPrefixListVersion = defaults.sourceDataFqdnPrefixListVersion;
    	      this.sourceDataIpv4PrefixListId = defaults.sourceDataIpv4PrefixListId;
    	      this.sourceDataIpv4PrefixListVersion = defaults.sourceDataIpv4PrefixListVersion;
    	      this.sourceFqdn = defaults.sourceFqdn;
    	      this.sourceGeoLocation = defaults.sourceGeoLocation;
    	      this.sourceGeoLocationListId = defaults.sourceGeoLocationListId;
    	      this.sourceGeoLocationListVersion = defaults.sourceGeoLocationListVersion;
    	      this.sourceIpv4Prefix = defaults.sourceIpv4Prefix;
    	      this.sourceIpv4PrefixVariable = defaults.sourceIpv4PrefixVariable;
    	      this.sourceObjectGroupId = defaults.sourceObjectGroupId;
    	      this.sourceObjectGroupVersion = defaults.sourceObjectGroupVersion;
    	      this.sourcePort = defaults.sourcePort;
    	      this.sourcePortListId = defaults.sourcePortListId;
    	      this.sourcePortListVersion = defaults.sourcePortListVersion;
        }

        @CustomType.Setter
        public Builder destinationDataFqdnPrefixListId(@Nullable String destinationDataFqdnPrefixListId) {

            this.destinationDataFqdnPrefixListId = destinationDataFqdnPrefixListId;
            return this;
        }
        @CustomType.Setter
        public Builder destinationDataFqdnPrefixListVersion(@Nullable Integer destinationDataFqdnPrefixListVersion) {

            this.destinationDataFqdnPrefixListVersion = destinationDataFqdnPrefixListVersion;
            return this;
        }
        @CustomType.Setter
        public Builder destinationDataIpv4PrefixListId(@Nullable String destinationDataIpv4PrefixListId) {

            this.destinationDataIpv4PrefixListId = destinationDataIpv4PrefixListId;
            return this;
        }
        @CustomType.Setter
        public Builder destinationDataIpv4PrefixListVersion(@Nullable Integer destinationDataIpv4PrefixListVersion) {

            this.destinationDataIpv4PrefixListVersion = destinationDataIpv4PrefixListVersion;
            return this;
        }
        @CustomType.Setter
        public Builder destinationFqdn(@Nullable String destinationFqdn) {

            this.destinationFqdn = destinationFqdn;
            return this;
        }
        @CustomType.Setter
        public Builder destinationGeoLocation(@Nullable String destinationGeoLocation) {

            this.destinationGeoLocation = destinationGeoLocation;
            return this;
        }
        @CustomType.Setter
        public Builder destinationGeoLocationListId(@Nullable String destinationGeoLocationListId) {

            this.destinationGeoLocationListId = destinationGeoLocationListId;
            return this;
        }
        @CustomType.Setter
        public Builder destinationGeoLocationListVersion(@Nullable Integer destinationGeoLocationListVersion) {

            this.destinationGeoLocationListVersion = destinationGeoLocationListVersion;
            return this;
        }
        @CustomType.Setter
        public Builder destinationIpv4Prefix(@Nullable String destinationIpv4Prefix) {

            this.destinationIpv4Prefix = destinationIpv4Prefix;
            return this;
        }
        @CustomType.Setter
        public Builder destinationIpv4PrefixVariable(@Nullable String destinationIpv4PrefixVariable) {

            this.destinationIpv4PrefixVariable = destinationIpv4PrefixVariable;
            return this;
        }
        @CustomType.Setter
        public Builder destinationObjectGroupId(@Nullable String destinationObjectGroupId) {

            this.destinationObjectGroupId = destinationObjectGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder destinationObjectGroupVersion(@Nullable Integer destinationObjectGroupVersion) {

            this.destinationObjectGroupVersion = destinationObjectGroupVersion;
            return this;
        }
        @CustomType.Setter
        public Builder destinationPort(@Nullable String destinationPort) {

            this.destinationPort = destinationPort;
            return this;
        }
        @CustomType.Setter
        public Builder destinationPortListId(@Nullable String destinationPortListId) {

            this.destinationPortListId = destinationPortListId;
            return this;
        }
        @CustomType.Setter
        public Builder destinationPortListVersion(@Nullable Integer destinationPortListVersion) {

            this.destinationPortListVersion = destinationPortListVersion;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("RuleSetPolicyDefinitionRule", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder order(Integer order) {
            if (order == null) {
              throw new MissingRequiredPropertyException("RuleSetPolicyDefinitionRule", "order");
            }
            this.order = order;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {

            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder protocolListId(@Nullable String protocolListId) {

            this.protocolListId = protocolListId;
            return this;
        }
        @CustomType.Setter
        public Builder protocolListVersion(@Nullable Integer protocolListVersion) {

            this.protocolListVersion = protocolListVersion;
            return this;
        }
        @CustomType.Setter
        public Builder protocolNumber(@Nullable Integer protocolNumber) {

            this.protocolNumber = protocolNumber;
            return this;
        }
        @CustomType.Setter
        public Builder sourceDataFqdnPrefixListId(@Nullable String sourceDataFqdnPrefixListId) {

            this.sourceDataFqdnPrefixListId = sourceDataFqdnPrefixListId;
            return this;
        }
        @CustomType.Setter
        public Builder sourceDataFqdnPrefixListVersion(@Nullable Integer sourceDataFqdnPrefixListVersion) {

            this.sourceDataFqdnPrefixListVersion = sourceDataFqdnPrefixListVersion;
            return this;
        }
        @CustomType.Setter
        public Builder sourceDataIpv4PrefixListId(@Nullable String sourceDataIpv4PrefixListId) {

            this.sourceDataIpv4PrefixListId = sourceDataIpv4PrefixListId;
            return this;
        }
        @CustomType.Setter
        public Builder sourceDataIpv4PrefixListVersion(@Nullable Integer sourceDataIpv4PrefixListVersion) {

            this.sourceDataIpv4PrefixListVersion = sourceDataIpv4PrefixListVersion;
            return this;
        }
        @CustomType.Setter
        public Builder sourceFqdn(@Nullable String sourceFqdn) {

            this.sourceFqdn = sourceFqdn;
            return this;
        }
        @CustomType.Setter
        public Builder sourceGeoLocation(@Nullable String sourceGeoLocation) {

            this.sourceGeoLocation = sourceGeoLocation;
            return this;
        }
        @CustomType.Setter
        public Builder sourceGeoLocationListId(@Nullable String sourceGeoLocationListId) {

            this.sourceGeoLocationListId = sourceGeoLocationListId;
            return this;
        }
        @CustomType.Setter
        public Builder sourceGeoLocationListVersion(@Nullable Integer sourceGeoLocationListVersion) {

            this.sourceGeoLocationListVersion = sourceGeoLocationListVersion;
            return this;
        }
        @CustomType.Setter
        public Builder sourceIpv4Prefix(@Nullable String sourceIpv4Prefix) {

            this.sourceIpv4Prefix = sourceIpv4Prefix;
            return this;
        }
        @CustomType.Setter
        public Builder sourceIpv4PrefixVariable(@Nullable String sourceIpv4PrefixVariable) {

            this.sourceIpv4PrefixVariable = sourceIpv4PrefixVariable;
            return this;
        }
        @CustomType.Setter
        public Builder sourceObjectGroupId(@Nullable String sourceObjectGroupId) {

            this.sourceObjectGroupId = sourceObjectGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder sourceObjectGroupVersion(@Nullable Integer sourceObjectGroupVersion) {

            this.sourceObjectGroupVersion = sourceObjectGroupVersion;
            return this;
        }
        @CustomType.Setter
        public Builder sourcePort(@Nullable String sourcePort) {

            this.sourcePort = sourcePort;
            return this;
        }
        @CustomType.Setter
        public Builder sourcePortListId(@Nullable String sourcePortListId) {

            this.sourcePortListId = sourcePortListId;
            return this;
        }
        @CustomType.Setter
        public Builder sourcePortListVersion(@Nullable Integer sourcePortListVersion) {

            this.sourcePortListVersion = sourcePortListVersion;
            return this;
        }
        public RuleSetPolicyDefinitionRule build() {
            final var _resultValue = new RuleSetPolicyDefinitionRule();
            _resultValue.destinationDataFqdnPrefixListId = destinationDataFqdnPrefixListId;
            _resultValue.destinationDataFqdnPrefixListVersion = destinationDataFqdnPrefixListVersion;
            _resultValue.destinationDataIpv4PrefixListId = destinationDataIpv4PrefixListId;
            _resultValue.destinationDataIpv4PrefixListVersion = destinationDataIpv4PrefixListVersion;
            _resultValue.destinationFqdn = destinationFqdn;
            _resultValue.destinationGeoLocation = destinationGeoLocation;
            _resultValue.destinationGeoLocationListId = destinationGeoLocationListId;
            _resultValue.destinationGeoLocationListVersion = destinationGeoLocationListVersion;
            _resultValue.destinationIpv4Prefix = destinationIpv4Prefix;
            _resultValue.destinationIpv4PrefixVariable = destinationIpv4PrefixVariable;
            _resultValue.destinationObjectGroupId = destinationObjectGroupId;
            _resultValue.destinationObjectGroupVersion = destinationObjectGroupVersion;
            _resultValue.destinationPort = destinationPort;
            _resultValue.destinationPortListId = destinationPortListId;
            _resultValue.destinationPortListVersion = destinationPortListVersion;
            _resultValue.name = name;
            _resultValue.order = order;
            _resultValue.protocol = protocol;
            _resultValue.protocolListId = protocolListId;
            _resultValue.protocolListVersion = protocolListVersion;
            _resultValue.protocolNumber = protocolNumber;
            _resultValue.sourceDataFqdnPrefixListId = sourceDataFqdnPrefixListId;
            _resultValue.sourceDataFqdnPrefixListVersion = sourceDataFqdnPrefixListVersion;
            _resultValue.sourceDataIpv4PrefixListId = sourceDataIpv4PrefixListId;
            _resultValue.sourceDataIpv4PrefixListVersion = sourceDataIpv4PrefixListVersion;
            _resultValue.sourceFqdn = sourceFqdn;
            _resultValue.sourceGeoLocation = sourceGeoLocation;
            _resultValue.sourceGeoLocationListId = sourceGeoLocationListId;
            _resultValue.sourceGeoLocationListVersion = sourceGeoLocationListVersion;
            _resultValue.sourceIpv4Prefix = sourceIpv4Prefix;
            _resultValue.sourceIpv4PrefixVariable = sourceIpv4PrefixVariable;
            _resultValue.sourceObjectGroupId = sourceObjectGroupId;
            _resultValue.sourceObjectGroupVersion = sourceObjectGroupVersion;
            _resultValue.sourcePort = sourcePort;
            _resultValue.sourcePortListId = sourcePortListId;
            _resultValue.sourcePortListVersion = sourcePortListVersion;
            return _resultValue;
        }
    }
}
