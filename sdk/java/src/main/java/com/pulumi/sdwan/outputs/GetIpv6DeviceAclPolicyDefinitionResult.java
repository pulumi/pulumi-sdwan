// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.outputs.GetIpv6DeviceAclPolicyDefinitionSequence;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIpv6DeviceAclPolicyDefinitionResult {
    /**
     * @return Default action, either `accept` or `drop`
     * 
     */
    private String defaultAction;
    /**
     * @return The description of the policy definition
     * 
     */
    private String description;
    /**
     * @return The id of the object
     * 
     */
    private String id;
    /**
     * @return The name of the policy definition
     * 
     */
    private String name;
    /**
     * @return List of ACL sequences
     * 
     */
    private List<GetIpv6DeviceAclPolicyDefinitionSequence> sequences;
    /**
     * @return Type
     * 
     */
    private String type;
    /**
     * @return The version of the object
     * 
     */
    private Integer version;

    private GetIpv6DeviceAclPolicyDefinitionResult() {}
    /**
     * @return Default action, either `accept` or `drop`
     * 
     */
    public String defaultAction() {
        return this.defaultAction;
    }
    /**
     * @return The description of the policy definition
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The id of the object
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the policy definition
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of ACL sequences
     * 
     */
    public List<GetIpv6DeviceAclPolicyDefinitionSequence> sequences() {
        return this.sequences;
    }
    /**
     * @return Type
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The version of the object
     * 
     */
    public Integer version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpv6DeviceAclPolicyDefinitionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String defaultAction;
        private String description;
        private String id;
        private String name;
        private List<GetIpv6DeviceAclPolicyDefinitionSequence> sequences;
        private String type;
        private Integer version;
        public Builder() {}
        public Builder(GetIpv6DeviceAclPolicyDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultAction = defaults.defaultAction;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.sequences = defaults.sequences;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder defaultAction(String defaultAction) {
            if (defaultAction == null) {
              throw new MissingRequiredPropertyException("GetIpv6DeviceAclPolicyDefinitionResult", "defaultAction");
            }
            this.defaultAction = defaultAction;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetIpv6DeviceAclPolicyDefinitionResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetIpv6DeviceAclPolicyDefinitionResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetIpv6DeviceAclPolicyDefinitionResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder sequences(List<GetIpv6DeviceAclPolicyDefinitionSequence> sequences) {
            if (sequences == null) {
              throw new MissingRequiredPropertyException("GetIpv6DeviceAclPolicyDefinitionResult", "sequences");
            }
            this.sequences = sequences;
            return this;
        }
        public Builder sequences(GetIpv6DeviceAclPolicyDefinitionSequence... sequences) {
            return sequences(List.of(sequences));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetIpv6DeviceAclPolicyDefinitionResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetIpv6DeviceAclPolicyDefinitionResult", "version");
            }
            this.version = version;
            return this;
        }
        public GetIpv6DeviceAclPolicyDefinitionResult build() {
            final var _resultValue = new GetIpv6DeviceAclPolicyDefinitionResult();
            _resultValue.defaultAction = defaultAction;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.sequences = sequences;
            _resultValue.type = type;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
