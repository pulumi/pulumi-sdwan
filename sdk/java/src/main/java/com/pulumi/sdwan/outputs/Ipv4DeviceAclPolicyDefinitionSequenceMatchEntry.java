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
public final class Ipv4DeviceAclPolicyDefinitionSequenceMatchEntry {
    /**
     * @return Destination data IPv4 prefix list ID, Attribute conditional on `type` being equal to `destinationDataPrefixList`
     * 
     */
    private @Nullable String destinationDataIpv4PrefixListId;
    /**
     * @return Destination data IPv4 prefix list version
     * 
     */
    private @Nullable Integer destinationDataIpv4PrefixListVersion;
    /**
     * @return Destination IP prefix, Attribute conditional on `type` being equal to `destinationIp`
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
     * @return Source data IPv4 prefix list ID, Attribute conditional on `type` being equal to `sourceDataPrefixList`
     * 
     */
    private @Nullable String sourceDataIpv4PrefixListId;
    /**
     * @return Source data IPv4 prefix list version
     * 
     */
    private @Nullable Integer sourceDataIpv4PrefixListVersion;
    /**
     * @return Source IP prefix, Attribute conditional on `type` being equal to `sourceIp`
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
     *   - Choices: `sourceIp`, `destinationIp`, `sourcePort`, `destinationPort`, `sourceDataPrefixList`, `destinationDataPrefixList`
     * 
     */
    private String type;

    private Ipv4DeviceAclPolicyDefinitionSequenceMatchEntry() {}
    /**
     * @return Destination data IPv4 prefix list ID, Attribute conditional on `type` being equal to `destinationDataPrefixList`
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
     * @return Destination IP prefix, Attribute conditional on `type` being equal to `destinationIp`
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
     * @return Source data IPv4 prefix list ID, Attribute conditional on `type` being equal to `sourceDataPrefixList`
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
     * @return Source IP prefix, Attribute conditional on `type` being equal to `sourceIp`
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
     *   - Choices: `sourceIp`, `destinationIp`, `sourcePort`, `destinationPort`, `sourceDataPrefixList`, `destinationDataPrefixList`
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Ipv4DeviceAclPolicyDefinitionSequenceMatchEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String destinationDataIpv4PrefixListId;
        private @Nullable Integer destinationDataIpv4PrefixListVersion;
        private @Nullable String destinationIp;
        private @Nullable Integer destinationPort;
        private @Nullable String sourceDataIpv4PrefixListId;
        private @Nullable Integer sourceDataIpv4PrefixListVersion;
        private @Nullable String sourceIp;
        private @Nullable String sourcePorts;
        private String type;
        public Builder() {}
        public Builder(Ipv4DeviceAclPolicyDefinitionSequenceMatchEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationDataIpv4PrefixListId = defaults.destinationDataIpv4PrefixListId;
    	      this.destinationDataIpv4PrefixListVersion = defaults.destinationDataIpv4PrefixListVersion;
    	      this.destinationIp = defaults.destinationIp;
    	      this.destinationPort = defaults.destinationPort;
    	      this.sourceDataIpv4PrefixListId = defaults.sourceDataIpv4PrefixListId;
    	      this.sourceDataIpv4PrefixListVersion = defaults.sourceDataIpv4PrefixListVersion;
    	      this.sourceIp = defaults.sourceIp;
    	      this.sourcePorts = defaults.sourcePorts;
    	      this.type = defaults.type;
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
              throw new MissingRequiredPropertyException("Ipv4DeviceAclPolicyDefinitionSequenceMatchEntry", "type");
            }
            this.type = type;
            return this;
        }
        public Ipv4DeviceAclPolicyDefinitionSequenceMatchEntry build() {
            final var _resultValue = new Ipv4DeviceAclPolicyDefinitionSequenceMatchEntry();
            _resultValue.destinationDataIpv4PrefixListId = destinationDataIpv4PrefixListId;
            _resultValue.destinationDataIpv4PrefixListVersion = destinationDataIpv4PrefixListVersion;
            _resultValue.destinationIp = destinationIp;
            _resultValue.destinationPort = destinationPort;
            _resultValue.sourceDataIpv4PrefixListId = sourceDataIpv4PrefixListId;
            _resultValue.sourceDataIpv4PrefixListVersion = sourceDataIpv4PrefixListVersion;
            _resultValue.sourceIp = sourceIp;
            _resultValue.sourcePorts = sourcePorts;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
