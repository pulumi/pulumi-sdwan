// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPolicerPolicyObjectResult {
    /**
     * @return Burst in bytes
     * 
     */
    private Integer burst;
    /**
     * @return Exceed action
     * 
     */
    private String exceedAction;
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
     * @return Rate in bps
     * 
     */
    private Integer rate;
    /**
     * @return The version of the object
     * 
     */
    private Integer version;

    private GetPolicerPolicyObjectResult() {}
    /**
     * @return Burst in bytes
     * 
     */
    public Integer burst() {
        return this.burst;
    }
    /**
     * @return Exceed action
     * 
     */
    public String exceedAction() {
        return this.exceedAction;
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
     * @return Rate in bps
     * 
     */
    public Integer rate() {
        return this.rate;
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

    public static Builder builder(GetPolicerPolicyObjectResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer burst;
        private String exceedAction;
        private String id;
        private String name;
        private Integer rate;
        private Integer version;
        public Builder() {}
        public Builder(GetPolicerPolicyObjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.burst = defaults.burst;
    	      this.exceedAction = defaults.exceedAction;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.rate = defaults.rate;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder burst(Integer burst) {
            if (burst == null) {
              throw new MissingRequiredPropertyException("GetPolicerPolicyObjectResult", "burst");
            }
            this.burst = burst;
            return this;
        }
        @CustomType.Setter
        public Builder exceedAction(String exceedAction) {
            if (exceedAction == null) {
              throw new MissingRequiredPropertyException("GetPolicerPolicyObjectResult", "exceedAction");
            }
            this.exceedAction = exceedAction;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPolicerPolicyObjectResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetPolicerPolicyObjectResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder rate(Integer rate) {
            if (rate == null) {
              throw new MissingRequiredPropertyException("GetPolicerPolicyObjectResult", "rate");
            }
            this.rate = rate;
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetPolicerPolicyObjectResult", "version");
            }
            this.version = version;
            return this;
        }
        public GetPolicerPolicyObjectResult build() {
            final var _resultValue = new GetPolicerPolicyObjectResult();
            _resultValue.burst = burst;
            _resultValue.exceedAction = exceedAction;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.rate = rate;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
