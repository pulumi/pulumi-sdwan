// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZoneBasedFirewallPolicyDefinitionRuleMatchEntry {
    /**
     * @return policy id for selected match entry
     * 
     */
    private @Nullable String policyId;
    /**
     * @return Should be included with additionally entries for `destinationPort` and `protocol` whenever the type `protocolName` is used.
     * 
     */
    private @Nullable String protocolType;
    /**
     * @return Type of match entry
     *   - Choices: `sourceFqdnList`, `sourceDataPrefixList`, `sourceGeoLocationList`, `sourcePortList`, `destinationFqdnList`, `destinationDataPrefixList`, `destinationGeoLocationList`, `destinationPortList`, `appList`, `protocolNameList`, `sourceIp`, `sourcePort`, `sourceFqdn`, `destinationIp`, `destinationFqdn`, `destinationPort`, `sourceGeoLocation`, `destinationGeoLocation`, `protocolName`, `protocol`, `app`, `ruleSetList`
     * 
     */
    private String type;
    /**
     * @return value for selected match entry
     * 
     */
    private @Nullable String value;
    /**
     * @return variable value for selected match entry if it has variable option (sourceIp &amp; destinationIp)
     * 
     */
    private @Nullable String valueVariable;

    private ZoneBasedFirewallPolicyDefinitionRuleMatchEntry() {}
    /**
     * @return policy id for selected match entry
     * 
     */
    public Optional<String> policyId() {
        return Optional.ofNullable(this.policyId);
    }
    /**
     * @return Should be included with additionally entries for `destinationPort` and `protocol` whenever the type `protocolName` is used.
     * 
     */
    public Optional<String> protocolType() {
        return Optional.ofNullable(this.protocolType);
    }
    /**
     * @return Type of match entry
     *   - Choices: `sourceFqdnList`, `sourceDataPrefixList`, `sourceGeoLocationList`, `sourcePortList`, `destinationFqdnList`, `destinationDataPrefixList`, `destinationGeoLocationList`, `destinationPortList`, `appList`, `protocolNameList`, `sourceIp`, `sourcePort`, `sourceFqdn`, `destinationIp`, `destinationFqdn`, `destinationPort`, `sourceGeoLocation`, `destinationGeoLocation`, `protocolName`, `protocol`, `app`, `ruleSetList`
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return value for selected match entry
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }
    /**
     * @return variable value for selected match entry if it has variable option (sourceIp &amp; destinationIp)
     * 
     */
    public Optional<String> valueVariable() {
        return Optional.ofNullable(this.valueVariable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZoneBasedFirewallPolicyDefinitionRuleMatchEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String policyId;
        private @Nullable String protocolType;
        private String type;
        private @Nullable String value;
        private @Nullable String valueVariable;
        public Builder() {}
        public Builder(ZoneBasedFirewallPolicyDefinitionRuleMatchEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyId = defaults.policyId;
    	      this.protocolType = defaults.protocolType;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
    	      this.valueVariable = defaults.valueVariable;
        }

        @CustomType.Setter
        public Builder policyId(@Nullable String policyId) {

            this.policyId = policyId;
            return this;
        }
        @CustomType.Setter
        public Builder protocolType(@Nullable String protocolType) {

            this.protocolType = protocolType;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("ZoneBasedFirewallPolicyDefinitionRuleMatchEntry", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        @CustomType.Setter
        public Builder valueVariable(@Nullable String valueVariable) {

            this.valueVariable = valueVariable;
            return this;
        }
        public ZoneBasedFirewallPolicyDefinitionRuleMatchEntry build() {
            final var _resultValue = new ZoneBasedFirewallPolicyDefinitionRuleMatchEntry();
            _resultValue.policyId = policyId;
            _resultValue.protocolType = protocolType;
            _resultValue.type = type;
            _resultValue.value = value;
            _resultValue.valueVariable = valueVariable;
            return _resultValue;
        }
    }
}