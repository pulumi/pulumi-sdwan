// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.outputs.GetZoneListPolicyObjectEntry;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetZoneListPolicyObjectResult {
    /**
     * @return List of entries
     * 
     */
    private List<GetZoneListPolicyObjectEntry> entries;
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
     * @return The version of the object
     * 
     */
    private Integer version;

    private GetZoneListPolicyObjectResult() {}
    /**
     * @return List of entries
     * 
     */
    public List<GetZoneListPolicyObjectEntry> entries() {
        return this.entries;
    }
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
     * @return The version of the object
     * 
     */
    public Integer version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZoneListPolicyObjectResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetZoneListPolicyObjectEntry> entries;
        private String id;
        private String name;
        private Integer version;
        public Builder() {}
        public Builder(GetZoneListPolicyObjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entries = defaults.entries;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder entries(List<GetZoneListPolicyObjectEntry> entries) {
            if (entries == null) {
              throw new MissingRequiredPropertyException("GetZoneListPolicyObjectResult", "entries");
            }
            this.entries = entries;
            return this;
        }
        public Builder entries(GetZoneListPolicyObjectEntry... entries) {
            return entries(List.of(entries));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZoneListPolicyObjectResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetZoneListPolicyObjectResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetZoneListPolicyObjectResult", "version");
            }
            this.version = version;
            return this;
        }
        public GetZoneListPolicyObjectResult build() {
            final var _resultValue = new GetZoneListPolicyObjectResult();
            _resultValue.entries = entries;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
