// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMirrorPolicyObjectResult {
    /**
     * @return The id of the object
     * 
     */
    private String id;
    /**
     * @return The name of the policy object
     * 
     */
    private String name;
    /**
     * @return Remote destination IP
     * 
     */
    private String remoteDestinationIp;
    /**
     * @return Source IP
     * 
     */
    private String sourceIp;
    /**
     * @return The version of the object
     * 
     */
    private Integer version;

    private GetMirrorPolicyObjectResult() {}
    /**
     * @return The id of the object
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the policy object
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Remote destination IP
     * 
     */
    public String remoteDestinationIp() {
        return this.remoteDestinationIp;
    }
    /**
     * @return Source IP
     * 
     */
    public String sourceIp() {
        return this.sourceIp;
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

    public static Builder builder(GetMirrorPolicyObjectResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        private String remoteDestinationIp;
        private String sourceIp;
        private Integer version;
        public Builder() {}
        public Builder(GetMirrorPolicyObjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.remoteDestinationIp = defaults.remoteDestinationIp;
    	      this.sourceIp = defaults.sourceIp;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetMirrorPolicyObjectResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetMirrorPolicyObjectResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder remoteDestinationIp(String remoteDestinationIp) {
            if (remoteDestinationIp == null) {
              throw new MissingRequiredPropertyException("GetMirrorPolicyObjectResult", "remoteDestinationIp");
            }
            this.remoteDestinationIp = remoteDestinationIp;
            return this;
        }
        @CustomType.Setter
        public Builder sourceIp(String sourceIp) {
            if (sourceIp == null) {
              throw new MissingRequiredPropertyException("GetMirrorPolicyObjectResult", "sourceIp");
            }
            this.sourceIp = sourceIp;
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetMirrorPolicyObjectResult", "version");
            }
            this.version = version;
            return this;
        }
        public GetMirrorPolicyObjectResult build() {
            final var _resultValue = new GetMirrorPolicyObjectResult();
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.remoteDestinationIp = remoteDestinationIp;
            _resultValue.sourceIp = sourceIp;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
