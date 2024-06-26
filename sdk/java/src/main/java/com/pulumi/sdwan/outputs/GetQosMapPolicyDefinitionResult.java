// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.outputs.GetQosMapPolicyDefinitionQosScheduler;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetQosMapPolicyDefinitionResult {
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
     * @return List of QoS schedulers
     * 
     */
    private List<GetQosMapPolicyDefinitionQosScheduler> qosSchedulers;
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

    private GetQosMapPolicyDefinitionResult() {}
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
     * @return List of QoS schedulers
     * 
     */
    public List<GetQosMapPolicyDefinitionQosScheduler> qosSchedulers() {
        return this.qosSchedulers;
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

    public static Builder builder(GetQosMapPolicyDefinitionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private String name;
        private List<GetQosMapPolicyDefinitionQosScheduler> qosSchedulers;
        private String type;
        private Integer version;
        public Builder() {}
        public Builder(GetQosMapPolicyDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.qosSchedulers = defaults.qosSchedulers;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetQosMapPolicyDefinitionResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetQosMapPolicyDefinitionResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetQosMapPolicyDefinitionResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder qosSchedulers(List<GetQosMapPolicyDefinitionQosScheduler> qosSchedulers) {
            if (qosSchedulers == null) {
              throw new MissingRequiredPropertyException("GetQosMapPolicyDefinitionResult", "qosSchedulers");
            }
            this.qosSchedulers = qosSchedulers;
            return this;
        }
        public Builder qosSchedulers(GetQosMapPolicyDefinitionQosScheduler... qosSchedulers) {
            return qosSchedulers(List.of(qosSchedulers));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetQosMapPolicyDefinitionResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetQosMapPolicyDefinitionResult", "version");
            }
            this.version = version;
            return this;
        }
        public GetQosMapPolicyDefinitionResult build() {
            final var _resultValue = new GetQosMapPolicyDefinitionResult();
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.qosSchedulers = qosSchedulers;
            _resultValue.type = type;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
