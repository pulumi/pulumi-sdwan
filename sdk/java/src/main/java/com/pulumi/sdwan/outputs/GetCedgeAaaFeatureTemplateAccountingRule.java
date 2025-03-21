// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCedgeAaaFeatureTemplateAccountingRule {
    /**
     * @return Comma separated list of groups
     * 
     */
    private String groups;
    /**
     * @return Configure Accounting Method
     * 
     */
    private String method;
    /**
     * @return Configure Accounting Rule ID
     * 
     */
    private String name;
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private Boolean optional;
    /**
     * @return Privilege level when method is commands
     * 
     */
    private String privilegeLevel;
    /**
     * @return Record start and stop without waiting
     * 
     */
    private Boolean startStop;
    /**
     * @return Variable name
     * 
     */
    private String startStopVariable;

    private GetCedgeAaaFeatureTemplateAccountingRule() {}
    /**
     * @return Comma separated list of groups
     * 
     */
    public String groups() {
        return this.groups;
    }
    /**
     * @return Configure Accounting Method
     * 
     */
    public String method() {
        return this.method;
    }
    /**
     * @return Configure Accounting Rule ID
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Boolean optional() {
        return this.optional;
    }
    /**
     * @return Privilege level when method is commands
     * 
     */
    public String privilegeLevel() {
        return this.privilegeLevel;
    }
    /**
     * @return Record start and stop without waiting
     * 
     */
    public Boolean startStop() {
        return this.startStop;
    }
    /**
     * @return Variable name
     * 
     */
    public String startStopVariable() {
        return this.startStopVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCedgeAaaFeatureTemplateAccountingRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String groups;
        private String method;
        private String name;
        private Boolean optional;
        private String privilegeLevel;
        private Boolean startStop;
        private String startStopVariable;
        public Builder() {}
        public Builder(GetCedgeAaaFeatureTemplateAccountingRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
    	      this.method = defaults.method;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
    	      this.privilegeLevel = defaults.privilegeLevel;
    	      this.startStop = defaults.startStop;
    	      this.startStopVariable = defaults.startStopVariable;
        }

        @CustomType.Setter
        public Builder groups(String groups) {
            if (groups == null) {
              throw new MissingRequiredPropertyException("GetCedgeAaaFeatureTemplateAccountingRule", "groups");
            }
            this.groups = groups;
            return this;
        }
        @CustomType.Setter
        public Builder method(String method) {
            if (method == null) {
              throw new MissingRequiredPropertyException("GetCedgeAaaFeatureTemplateAccountingRule", "method");
            }
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetCedgeAaaFeatureTemplateAccountingRule", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder optional(Boolean optional) {
            if (optional == null) {
              throw new MissingRequiredPropertyException("GetCedgeAaaFeatureTemplateAccountingRule", "optional");
            }
            this.optional = optional;
            return this;
        }
        @CustomType.Setter
        public Builder privilegeLevel(String privilegeLevel) {
            if (privilegeLevel == null) {
              throw new MissingRequiredPropertyException("GetCedgeAaaFeatureTemplateAccountingRule", "privilegeLevel");
            }
            this.privilegeLevel = privilegeLevel;
            return this;
        }
        @CustomType.Setter
        public Builder startStop(Boolean startStop) {
            if (startStop == null) {
              throw new MissingRequiredPropertyException("GetCedgeAaaFeatureTemplateAccountingRule", "startStop");
            }
            this.startStop = startStop;
            return this;
        }
        @CustomType.Setter
        public Builder startStopVariable(String startStopVariable) {
            if (startStopVariable == null) {
              throw new MissingRequiredPropertyException("GetCedgeAaaFeatureTemplateAccountingRule", "startStopVariable");
            }
            this.startStopVariable = startStopVariable;
            return this;
        }
        public GetCedgeAaaFeatureTemplateAccountingRule build() {
            final var _resultValue = new GetCedgeAaaFeatureTemplateAccountingRule();
            _resultValue.groups = groups;
            _resultValue.method = method;
            _resultValue.name = name;
            _resultValue.optional = optional;
            _resultValue.privilegeLevel = privilegeLevel;
            _resultValue.startStop = startStop;
            _resultValue.startStopVariable = startStopVariable;
            return _resultValue;
        }
    }
}
