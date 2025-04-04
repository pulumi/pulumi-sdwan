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
public final class Ipv6DeviceAclPolicyDefinitionSequenceMatchEntry {
    /**
     * @return Destination data IPv6 prefix list ID, Attribute conditional on `type` being equal to `destinationDataIpv6PrefixList`
     * 
     */
    private @Nullable String destinationDataIpv6PrefixListId;
    /**
     * @return Destination data IPv6 prefix list version
     * 
     */
    private @Nullable Integer destinationDataIpv6PrefixListVersion;
    /**
     * @return Destination IP prefix, Attribute conditional on `type` being equal to `destinationIpv6`
     * 
     */
    private @Nullable String destinationIp;
    /**
     * @return Destination port, only `22` and `161` supported, Attribute conditional on `type` being equal to `destinationPort`
     *   - Range: `0`-`65535`
     * 
     */
    private @Nullable Integer destinationPort;
    /**
     * @return Source data IPv6 prefix list ID, Attribute conditional on `type` being equal to `sourceDataIpv6PrefixList`
     * 
     */
    private @Nullable String sourceDataIpv6PrefixListId;
    /**
     * @return Source data IPv6 prefix list version
     * 
     */
    private @Nullable Integer sourceDataIpv6PrefixListVersion;
    /**
     * @return Source IP prefix, Attribute conditional on `type` being equal to `sourceIpv6`
     * 
     */
    private @Nullable String sourceIp;
    /**
     * @return Source ports. Single value (0-65535) or ranges separated by spaces., Attribute conditional on `type` being equal to `sourcePort`
     * 
     */
    private @Nullable String sourcePorts;
    /**
     * @return Type of match entry
     *   - Choices: `sourceIpv6`, `destinationIpv6`, `sourcePort`, `destinationPort`, `sourceDataIpv6PrefixList`, `destinationDataIpv6PrefixList`
     * 
     */
    private String type;

    private Ipv6DeviceAclPolicyDefinitionSequenceMatchEntry() {}
    /**
     * @return Destination data IPv6 prefix list ID, Attribute conditional on `type` being equal to `destinationDataIpv6PrefixList`
     * 
     */
    public Optional<String> destinationDataIpv6PrefixListId() {
        return Optional.ofNullable(this.destinationDataIpv6PrefixListId);
    }
    /**
     * @return Destination data IPv6 prefix list version
     * 
     */
    public Optional<Integer> destinationDataIpv6PrefixListVersion() {
        return Optional.ofNullable(this.destinationDataIpv6PrefixListVersion);
    }
    /**
     * @return Destination IP prefix, Attribute conditional on `type` being equal to `destinationIpv6`
     * 
     */
    public Optional<String> destinationIp() {
        return Optional.ofNullable(this.destinationIp);
    }
    /**
     * @return Destination port, only `22` and `161` supported, Attribute conditional on `type` being equal to `destinationPort`
     *   - Range: `0`-`65535`
     * 
     */
    public Optional<Integer> destinationPort() {
        return Optional.ofNullable(this.destinationPort);
    }
    /**
     * @return Source data IPv6 prefix list ID, Attribute conditional on `type` being equal to `sourceDataIpv6PrefixList`
     * 
     */
    public Optional<String> sourceDataIpv6PrefixListId() {
        return Optional.ofNullable(this.sourceDataIpv6PrefixListId);
    }
    /**
     * @return Source data IPv6 prefix list version
     * 
     */
    public Optional<Integer> sourceDataIpv6PrefixListVersion() {
        return Optional.ofNullable(this.sourceDataIpv6PrefixListVersion);
    }
    /**
     * @return Source IP prefix, Attribute conditional on `type` being equal to `sourceIpv6`
     * 
     */
    public Optional<String> sourceIp() {
        return Optional.ofNullable(this.sourceIp);
    }
    /**
     * @return Source ports. Single value (0-65535) or ranges separated by spaces., Attribute conditional on `type` being equal to `sourcePort`
     * 
     */
    public Optional<String> sourcePorts() {
        return Optional.ofNullable(this.sourcePorts);
    }
    /**
     * @return Type of match entry
     *   - Choices: `sourceIpv6`, `destinationIpv6`, `sourcePort`, `destinationPort`, `sourceDataIpv6PrefixList`, `destinationDataIpv6PrefixList`
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Ipv6DeviceAclPolicyDefinitionSequenceMatchEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String destinationDataIpv6PrefixListId;
        private @Nullable Integer destinationDataIpv6PrefixListVersion;
        private @Nullable String destinationIp;
        private @Nullable Integer destinationPort;
        private @Nullable String sourceDataIpv6PrefixListId;
        private @Nullable Integer sourceDataIpv6PrefixListVersion;
        private @Nullable String sourceIp;
        private @Nullable String sourcePorts;
        private String type;
        public Builder() {}
        public Builder(Ipv6DeviceAclPolicyDefinitionSequenceMatchEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationDataIpv6PrefixListId = defaults.destinationDataIpv6PrefixListId;
    	      this.destinationDataIpv6PrefixListVersion = defaults.destinationDataIpv6PrefixListVersion;
    	      this.destinationIp = defaults.destinationIp;
    	      this.destinationPort = defaults.destinationPort;
    	      this.sourceDataIpv6PrefixListId = defaults.sourceDataIpv6PrefixListId;
    	      this.sourceDataIpv6PrefixListVersion = defaults.sourceDataIpv6PrefixListVersion;
    	      this.sourceIp = defaults.sourceIp;
    	      this.sourcePorts = defaults.sourcePorts;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder destinationDataIpv6PrefixListId(@Nullable String destinationDataIpv6PrefixListId) {

            this.destinationDataIpv6PrefixListId = destinationDataIpv6PrefixListId;
            return this;
        }
        @CustomType.Setter
        public Builder destinationDataIpv6PrefixListVersion(@Nullable Integer destinationDataIpv6PrefixListVersion) {

            this.destinationDataIpv6PrefixListVersion = destinationDataIpv6PrefixListVersion;
            return this;
        }
        @CustomType.Setter
        public Builder destinationIp(@Nullable String destinationIp) {

            this.destinationIp = destinationIp;
            return this;
        }
        @CustomType.Setter
        public Builder destinationPort(@Nullable Integer destinationPort) {

            this.destinationPort = destinationPort;
            return this;
        }
        @CustomType.Setter
        public Builder sourceDataIpv6PrefixListId(@Nullable String sourceDataIpv6PrefixListId) {

            this.sourceDataIpv6PrefixListId = sourceDataIpv6PrefixListId;
            return this;
        }
        @CustomType.Setter
        public Builder sourceDataIpv6PrefixListVersion(@Nullable Integer sourceDataIpv6PrefixListVersion) {

            this.sourceDataIpv6PrefixListVersion = sourceDataIpv6PrefixListVersion;
            return this;
        }
        @CustomType.Setter
        public Builder sourceIp(@Nullable String sourceIp) {

            this.sourceIp = sourceIp;
            return this;
        }
        @CustomType.Setter
        public Builder sourcePorts(@Nullable String sourcePorts) {

            this.sourcePorts = sourcePorts;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("Ipv6DeviceAclPolicyDefinitionSequenceMatchEntry", "type");
            }
            this.type = type;
            return this;
        }
        public Ipv6DeviceAclPolicyDefinitionSequenceMatchEntry build() {
            final var _resultValue = new Ipv6DeviceAclPolicyDefinitionSequenceMatchEntry();
            _resultValue.destinationDataIpv6PrefixListId = destinationDataIpv6PrefixListId;
            _resultValue.destinationDataIpv6PrefixListVersion = destinationDataIpv6PrefixListVersion;
            _resultValue.destinationIp = destinationIp;
            _resultValue.destinationPort = destinationPort;
            _resultValue.sourceDataIpv6PrefixListId = sourceDataIpv6PrefixListId;
            _resultValue.sourceDataIpv6PrefixListVersion = sourceDataIpv6PrefixListVersion;
            _resultValue.sourceIp = sourceIp;
            _resultValue.sourcePorts = sourcePorts;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
