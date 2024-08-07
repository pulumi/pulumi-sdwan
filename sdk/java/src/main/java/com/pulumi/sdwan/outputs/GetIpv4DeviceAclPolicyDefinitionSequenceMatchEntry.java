// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIpv4DeviceAclPolicyDefinitionSequenceMatchEntry {
    /**
     * @return Destination data IPv4 prefix list ID
     * 
     */
    private String destinationDataIpv4PrefixListId;
    /**
     * @return Destination data IPv4 prefix list version
     * 
     */
    private Integer destinationDataIpv4PrefixListVersion;
    /**
     * @return Destination IP prefix
     * 
     */
    private String destinationIp;
    /**
     * @return Destination port, only `22` and `161` supported
     * 
     */
    private Integer destinationPort;
    /**
     * @return Source data IPv4 prefix list ID
     * 
     */
    private String sourceDataIpv4PrefixListId;
    /**
     * @return Source data IPv4 prefix list version
     * 
     */
    private Integer sourceDataIpv4PrefixListVersion;
    /**
     * @return Source IP prefix
     * 
     */
    private String sourceIp;
    /**
     * @return Source ports. Single value (0-65535) or ranges separated by spaces.
     * 
     */
    private String sourcePorts;
    /**
     * @return Type of match entry
     * 
     */
    private String type;

    private GetIpv4DeviceAclPolicyDefinitionSequenceMatchEntry() {}
    /**
     * @return Destination data IPv4 prefix list ID
     * 
     */
    public String destinationDataIpv4PrefixListId() {
        return this.destinationDataIpv4PrefixListId;
    }
    /**
     * @return Destination data IPv4 prefix list version
     * 
     */
    public Integer destinationDataIpv4PrefixListVersion() {
        return this.destinationDataIpv4PrefixListVersion;
    }
    /**
     * @return Destination IP prefix
     * 
     */
    public String destinationIp() {
        return this.destinationIp;
    }
    /**
     * @return Destination port, only `22` and `161` supported
     * 
     */
    public Integer destinationPort() {
        return this.destinationPort;
    }
    /**
     * @return Source data IPv4 prefix list ID
     * 
     */
    public String sourceDataIpv4PrefixListId() {
        return this.sourceDataIpv4PrefixListId;
    }
    /**
     * @return Source data IPv4 prefix list version
     * 
     */
    public Integer sourceDataIpv4PrefixListVersion() {
        return this.sourceDataIpv4PrefixListVersion;
    }
    /**
     * @return Source IP prefix
     * 
     */
    public String sourceIp() {
        return this.sourceIp;
    }
    /**
     * @return Source ports. Single value (0-65535) or ranges separated by spaces.
     * 
     */
    public String sourcePorts() {
        return this.sourcePorts;
    }
    /**
     * @return Type of match entry
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpv4DeviceAclPolicyDefinitionSequenceMatchEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String destinationDataIpv4PrefixListId;
        private Integer destinationDataIpv4PrefixListVersion;
        private String destinationIp;
        private Integer destinationPort;
        private String sourceDataIpv4PrefixListId;
        private Integer sourceDataIpv4PrefixListVersion;
        private String sourceIp;
        private String sourcePorts;
        private String type;
        public Builder() {}
        public Builder(GetIpv4DeviceAclPolicyDefinitionSequenceMatchEntry defaults) {
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
        public Builder destinationDataIpv4PrefixListId(String destinationDataIpv4PrefixListId) {
            if (destinationDataIpv4PrefixListId == null) {
              throw new MissingRequiredPropertyException("GetIpv4DeviceAclPolicyDefinitionSequenceMatchEntry", "destinationDataIpv4PrefixListId");
            }
            this.destinationDataIpv4PrefixListId = destinationDataIpv4PrefixListId;
            return this;
        }
        @CustomType.Setter
        public Builder destinationDataIpv4PrefixListVersion(Integer destinationDataIpv4PrefixListVersion) {
            if (destinationDataIpv4PrefixListVersion == null) {
              throw new MissingRequiredPropertyException("GetIpv4DeviceAclPolicyDefinitionSequenceMatchEntry", "destinationDataIpv4PrefixListVersion");
            }
            this.destinationDataIpv4PrefixListVersion = destinationDataIpv4PrefixListVersion;
            return this;
        }
        @CustomType.Setter
        public Builder destinationIp(String destinationIp) {
            if (destinationIp == null) {
              throw new MissingRequiredPropertyException("GetIpv4DeviceAclPolicyDefinitionSequenceMatchEntry", "destinationIp");
            }
            this.destinationIp = destinationIp;
            return this;
        }
        @CustomType.Setter
        public Builder destinationPort(Integer destinationPort) {
            if (destinationPort == null) {
              throw new MissingRequiredPropertyException("GetIpv4DeviceAclPolicyDefinitionSequenceMatchEntry", "destinationPort");
            }
            this.destinationPort = destinationPort;
            return this;
        }
        @CustomType.Setter
        public Builder sourceDataIpv4PrefixListId(String sourceDataIpv4PrefixListId) {
            if (sourceDataIpv4PrefixListId == null) {
              throw new MissingRequiredPropertyException("GetIpv4DeviceAclPolicyDefinitionSequenceMatchEntry", "sourceDataIpv4PrefixListId");
            }
            this.sourceDataIpv4PrefixListId = sourceDataIpv4PrefixListId;
            return this;
        }
        @CustomType.Setter
        public Builder sourceDataIpv4PrefixListVersion(Integer sourceDataIpv4PrefixListVersion) {
            if (sourceDataIpv4PrefixListVersion == null) {
              throw new MissingRequiredPropertyException("GetIpv4DeviceAclPolicyDefinitionSequenceMatchEntry", "sourceDataIpv4PrefixListVersion");
            }
            this.sourceDataIpv4PrefixListVersion = sourceDataIpv4PrefixListVersion;
            return this;
        }
        @CustomType.Setter
        public Builder sourceIp(String sourceIp) {
            if (sourceIp == null) {
              throw new MissingRequiredPropertyException("GetIpv4DeviceAclPolicyDefinitionSequenceMatchEntry", "sourceIp");
            }
            this.sourceIp = sourceIp;
            return this;
        }
        @CustomType.Setter
        public Builder sourcePorts(String sourcePorts) {
            if (sourcePorts == null) {
              throw new MissingRequiredPropertyException("GetIpv4DeviceAclPolicyDefinitionSequenceMatchEntry", "sourcePorts");
            }
            this.sourcePorts = sourcePorts;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetIpv4DeviceAclPolicyDefinitionSequenceMatchEntry", "type");
            }
            this.type = type;
            return this;
        }
        public GetIpv4DeviceAclPolicyDefinitionSequenceMatchEntry build() {
            final var _resultValue = new GetIpv4DeviceAclPolicyDefinitionSequenceMatchEntry();
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
