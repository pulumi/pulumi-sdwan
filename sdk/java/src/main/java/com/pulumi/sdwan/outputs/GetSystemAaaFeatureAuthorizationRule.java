// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSystemAaaFeatureAuthorizationRule {
    /**
     * @return Use Server-group
     * 
     */
    private List<String> groups;
    /**
     * @return Succeed if user has authenticated
     * 
     */
    private Boolean ifAuthenticated;
    /**
     * @return Privilege level when method is commands
     * 
     */
    private String level;
    /**
     * @return Method
     * 
     */
    private String method;
    /**
     * @return Configure Authorization Rule ID
     * 
     */
    private String ruleId;

    private GetSystemAaaFeatureAuthorizationRule() {}
    /**
     * @return Use Server-group
     * 
     */
    public List<String> groups() {
        return this.groups;
    }
    /**
     * @return Succeed if user has authenticated
     * 
     */
    public Boolean ifAuthenticated() {
        return this.ifAuthenticated;
    }
    /**
     * @return Privilege level when method is commands
     * 
     */
    public String level() {
        return this.level;
    }
    /**
     * @return Method
     * 
     */
    public String method() {
        return this.method;
    }
    /**
     * @return Configure Authorization Rule ID
     * 
     */
    public String ruleId() {
        return this.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSystemAaaFeatureAuthorizationRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> groups;
        private Boolean ifAuthenticated;
        private String level;
        private String method;
        private String ruleId;
        public Builder() {}
        public Builder(GetSystemAaaFeatureAuthorizationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
    	      this.ifAuthenticated = defaults.ifAuthenticated;
    	      this.level = defaults.level;
    	      this.method = defaults.method;
    	      this.ruleId = defaults.ruleId;
        }

        @CustomType.Setter
        public Builder groups(List<String> groups) {
            if (groups == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureAuthorizationRule", "groups");
            }
            this.groups = groups;
            return this;
        }
        public Builder groups(String... groups) {
            return groups(List.of(groups));
        }
        @CustomType.Setter
        public Builder ifAuthenticated(Boolean ifAuthenticated) {
            if (ifAuthenticated == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureAuthorizationRule", "ifAuthenticated");
            }
            this.ifAuthenticated = ifAuthenticated;
            return this;
        }
        @CustomType.Setter
        public Builder level(String level) {
            if (level == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureAuthorizationRule", "level");
            }
            this.level = level;
            return this;
        }
        @CustomType.Setter
        public Builder method(String method) {
            if (method == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureAuthorizationRule", "method");
            }
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder ruleId(String ruleId) {
            if (ruleId == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureAuthorizationRule", "ruleId");
            }
            this.ruleId = ruleId;
            return this;
        }
        public GetSystemAaaFeatureAuthorizationRule build() {
            final var _resultValue = new GetSystemAaaFeatureAuthorizationRule();
            _resultValue.groups = groups;
            _resultValue.ifAuthenticated = ifAuthenticated;
            _resultValue.level = level;
            _resultValue.method = method;
            _resultValue.ruleId = ruleId;
            return _resultValue;
        }
    }
}
