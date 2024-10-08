// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSystemSnmpFeatureCommunity {
    /**
     * @return Configure access permissions
     * 
     */
    private String authorization;
    /**
     * @return Variable name
     * 
     */
    private String authorizationVariable;
    /**
     * @return Set name of the SNMP community
     * 
     */
    private String name;
    /**
     * @return Set user label of the SNMP community
     * 
     */
    private String userLabel;
    /**
     * @return Set name of the SNMP view
     * 
     */
    private String view;
    /**
     * @return Variable name
     * 
     */
    private String viewVariable;

    private GetSystemSnmpFeatureCommunity() {}
    /**
     * @return Configure access permissions
     * 
     */
    public String authorization() {
        return this.authorization;
    }
    /**
     * @return Variable name
     * 
     */
    public String authorizationVariable() {
        return this.authorizationVariable;
    }
    /**
     * @return Set name of the SNMP community
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Set user label of the SNMP community
     * 
     */
    public String userLabel() {
        return this.userLabel;
    }
    /**
     * @return Set name of the SNMP view
     * 
     */
    public String view() {
        return this.view;
    }
    /**
     * @return Variable name
     * 
     */
    public String viewVariable() {
        return this.viewVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSystemSnmpFeatureCommunity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authorization;
        private String authorizationVariable;
        private String name;
        private String userLabel;
        private String view;
        private String viewVariable;
        public Builder() {}
        public Builder(GetSystemSnmpFeatureCommunity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorization = defaults.authorization;
    	      this.authorizationVariable = defaults.authorizationVariable;
    	      this.name = defaults.name;
    	      this.userLabel = defaults.userLabel;
    	      this.view = defaults.view;
    	      this.viewVariable = defaults.viewVariable;
        }

        @CustomType.Setter
        public Builder authorization(String authorization) {
            if (authorization == null) {
              throw new MissingRequiredPropertyException("GetSystemSnmpFeatureCommunity", "authorization");
            }
            this.authorization = authorization;
            return this;
        }
        @CustomType.Setter
        public Builder authorizationVariable(String authorizationVariable) {
            if (authorizationVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemSnmpFeatureCommunity", "authorizationVariable");
            }
            this.authorizationVariable = authorizationVariable;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSystemSnmpFeatureCommunity", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder userLabel(String userLabel) {
            if (userLabel == null) {
              throw new MissingRequiredPropertyException("GetSystemSnmpFeatureCommunity", "userLabel");
            }
            this.userLabel = userLabel;
            return this;
        }
        @CustomType.Setter
        public Builder view(String view) {
            if (view == null) {
              throw new MissingRequiredPropertyException("GetSystemSnmpFeatureCommunity", "view");
            }
            this.view = view;
            return this;
        }
        @CustomType.Setter
        public Builder viewVariable(String viewVariable) {
            if (viewVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemSnmpFeatureCommunity", "viewVariable");
            }
            this.viewVariable = viewVariable;
            return this;
        }
        public GetSystemSnmpFeatureCommunity build() {
            final var _resultValue = new GetSystemSnmpFeatureCommunity();
            _resultValue.authorization = authorization;
            _resultValue.authorizationVariable = authorizationVariable;
            _resultValue.name = name;
            _resultValue.userLabel = userLabel;
            _resultValue.view = view;
            _resultValue.viewVariable = viewVariable;
            return _resultValue;
        }
    }
}
