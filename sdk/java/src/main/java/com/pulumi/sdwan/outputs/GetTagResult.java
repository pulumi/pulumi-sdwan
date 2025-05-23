// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTagResult {
    /**
     * @return Tag description
     * 
     */
    private String description;
    /**
     * @return List of associated devices
     * 
     */
    private List<String> devices;
    /**
     * @return The id of the object
     * 
     */
    private String id;
    /**
     * @return Tag name
     * 
     */
    private String name;

    private GetTagResult() {}
    /**
     * @return Tag description
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return List of associated devices
     * 
     */
    public List<String> devices() {
        return this.devices;
    }
    /**
     * @return The id of the object
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Tag name
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private List<String> devices;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetTagResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.devices = defaults.devices;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetTagResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder devices(List<String> devices) {
            if (devices == null) {
              throw new MissingRequiredPropertyException("GetTagResult", "devices");
            }
            this.devices = devices;
            return this;
        }
        public Builder devices(String... devices) {
            return devices(List.of(devices));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTagResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetTagResult", "name");
            }
            this.name = name;
            return this;
        }
        public GetTagResult build() {
            final var _resultValue = new GetTagResult();
            _resultValue.description = description;
            _resultValue.devices = devices;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
