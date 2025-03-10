// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.outputs.GetCiscoSnmpFeatureTemplateCommunity;
import com.pulumi.sdwan.outputs.GetCiscoSnmpFeatureTemplateGroup;
import com.pulumi.sdwan.outputs.GetCiscoSnmpFeatureTemplateTrapTarget;
import com.pulumi.sdwan.outputs.GetCiscoSnmpFeatureTemplateUser;
import com.pulumi.sdwan.outputs.GetCiscoSnmpFeatureTemplateView;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCiscoSnmpFeatureTemplateResult {
    /**
     * @return Configure SNMP community
     * 
     */
    private List<GetCiscoSnmpFeatureTemplateCommunity> communities;
    /**
     * @return Set the contact for this managed node
     * 
     */
    private String contact;
    /**
     * @return Variable name
     * 
     */
    private String contactVariable;
    /**
     * @return The description of the feature template
     * 
     */
    private String description;
    /**
     * @return List of supported device types
     * 
     */
    private List<String> deviceTypes;
    /**
     * @return Configure an SNMP group
     * 
     */
    private List<GetCiscoSnmpFeatureTemplateGroup> groups;
    /**
     * @return The id of the feature template
     * 
     */
    private String id;
    /**
     * @return Set the physical location of this managed node
     * 
     */
    private String location;
    /**
     * @return Variable name
     * 
     */
    private String locationVariable;
    /**
     * @return The name of the feature template
     * 
     */
    private String name;
    /**
     * @return Enable or disable SNMP
     * 
     */
    private Boolean shutdown;
    /**
     * @return Variable name
     * 
     */
    private String shutdownVariable;
    /**
     * @return The template type
     * 
     */
    private String templateType;
    /**
     * @return Configure SNMP server to receive SNMP traps
     * 
     */
    private List<GetCiscoSnmpFeatureTemplateTrapTarget> trapTargets;
    /**
     * @return Configure an SNMP user
     * 
     */
    private List<GetCiscoSnmpFeatureTemplateUser> users;
    /**
     * @return The version of the feature template
     * 
     */
    private Integer version;
    /**
     * @return Configure a view record
     * 
     */
    private List<GetCiscoSnmpFeatureTemplateView> views;

    private GetCiscoSnmpFeatureTemplateResult() {}
    /**
     * @return Configure SNMP community
     * 
     */
    public List<GetCiscoSnmpFeatureTemplateCommunity> communities() {
        return this.communities;
    }
    /**
     * @return Set the contact for this managed node
     * 
     */
    public String contact() {
        return this.contact;
    }
    /**
     * @return Variable name
     * 
     */
    public String contactVariable() {
        return this.contactVariable;
    }
    /**
     * @return The description of the feature template
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return List of supported device types
     * 
     */
    public List<String> deviceTypes() {
        return this.deviceTypes;
    }
    /**
     * @return Configure an SNMP group
     * 
     */
    public List<GetCiscoSnmpFeatureTemplateGroup> groups() {
        return this.groups;
    }
    /**
     * @return The id of the feature template
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Set the physical location of this managed node
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Variable name
     * 
     */
    public String locationVariable() {
        return this.locationVariable;
    }
    /**
     * @return The name of the feature template
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Enable or disable SNMP
     * 
     */
    public Boolean shutdown() {
        return this.shutdown;
    }
    /**
     * @return Variable name
     * 
     */
    public String shutdownVariable() {
        return this.shutdownVariable;
    }
    /**
     * @return The template type
     * 
     */
    public String templateType() {
        return this.templateType;
    }
    /**
     * @return Configure SNMP server to receive SNMP traps
     * 
     */
    public List<GetCiscoSnmpFeatureTemplateTrapTarget> trapTargets() {
        return this.trapTargets;
    }
    /**
     * @return Configure an SNMP user
     * 
     */
    public List<GetCiscoSnmpFeatureTemplateUser> users() {
        return this.users;
    }
    /**
     * @return The version of the feature template
     * 
     */
    public Integer version() {
        return this.version;
    }
    /**
     * @return Configure a view record
     * 
     */
    public List<GetCiscoSnmpFeatureTemplateView> views() {
        return this.views;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCiscoSnmpFeatureTemplateResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetCiscoSnmpFeatureTemplateCommunity> communities;
        private String contact;
        private String contactVariable;
        private String description;
        private List<String> deviceTypes;
        private List<GetCiscoSnmpFeatureTemplateGroup> groups;
        private String id;
        private String location;
        private String locationVariable;
        private String name;
        private Boolean shutdown;
        private String shutdownVariable;
        private String templateType;
        private List<GetCiscoSnmpFeatureTemplateTrapTarget> trapTargets;
        private List<GetCiscoSnmpFeatureTemplateUser> users;
        private Integer version;
        private List<GetCiscoSnmpFeatureTemplateView> views;
        public Builder() {}
        public Builder(GetCiscoSnmpFeatureTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.communities = defaults.communities;
    	      this.contact = defaults.contact;
    	      this.contactVariable = defaults.contactVariable;
    	      this.description = defaults.description;
    	      this.deviceTypes = defaults.deviceTypes;
    	      this.groups = defaults.groups;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.locationVariable = defaults.locationVariable;
    	      this.name = defaults.name;
    	      this.shutdown = defaults.shutdown;
    	      this.shutdownVariable = defaults.shutdownVariable;
    	      this.templateType = defaults.templateType;
    	      this.trapTargets = defaults.trapTargets;
    	      this.users = defaults.users;
    	      this.version = defaults.version;
    	      this.views = defaults.views;
        }

        @CustomType.Setter
        public Builder communities(List<GetCiscoSnmpFeatureTemplateCommunity> communities) {
            if (communities == null) {
              throw new MissingRequiredPropertyException("GetCiscoSnmpFeatureTemplateResult", "communities");
            }
            this.communities = communities;
            return this;
        }
        public Builder communities(GetCiscoSnmpFeatureTemplateCommunity... communities) {
            return communities(List.of(communities));
        }
        @CustomType.Setter
        public Builder contact(String contact) {
            if (contact == null) {
              throw new MissingRequiredPropertyException("GetCiscoSnmpFeatureTemplateResult", "contact");
            }
            this.contact = contact;
            return this;
        }
        @CustomType.Setter
        public Builder contactVariable(String contactVariable) {
            if (contactVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoSnmpFeatureTemplateResult", "contactVariable");
            }
            this.contactVariable = contactVariable;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetCiscoSnmpFeatureTemplateResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder deviceTypes(List<String> deviceTypes) {
            if (deviceTypes == null) {
              throw new MissingRequiredPropertyException("GetCiscoSnmpFeatureTemplateResult", "deviceTypes");
            }
            this.deviceTypes = deviceTypes;
            return this;
        }
        public Builder deviceTypes(String... deviceTypes) {
            return deviceTypes(List.of(deviceTypes));
        }
        @CustomType.Setter
        public Builder groups(List<GetCiscoSnmpFeatureTemplateGroup> groups) {
            if (groups == null) {
              throw new MissingRequiredPropertyException("GetCiscoSnmpFeatureTemplateResult", "groups");
            }
            this.groups = groups;
            return this;
        }
        public Builder groups(GetCiscoSnmpFeatureTemplateGroup... groups) {
            return groups(List.of(groups));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCiscoSnmpFeatureTemplateResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetCiscoSnmpFeatureTemplateResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder locationVariable(String locationVariable) {
            if (locationVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoSnmpFeatureTemplateResult", "locationVariable");
            }
            this.locationVariable = locationVariable;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetCiscoSnmpFeatureTemplateResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder shutdown(Boolean shutdown) {
            if (shutdown == null) {
              throw new MissingRequiredPropertyException("GetCiscoSnmpFeatureTemplateResult", "shutdown");
            }
            this.shutdown = shutdown;
            return this;
        }
        @CustomType.Setter
        public Builder shutdownVariable(String shutdownVariable) {
            if (shutdownVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoSnmpFeatureTemplateResult", "shutdownVariable");
            }
            this.shutdownVariable = shutdownVariable;
            return this;
        }
        @CustomType.Setter
        public Builder templateType(String templateType) {
            if (templateType == null) {
              throw new MissingRequiredPropertyException("GetCiscoSnmpFeatureTemplateResult", "templateType");
            }
            this.templateType = templateType;
            return this;
        }
        @CustomType.Setter
        public Builder trapTargets(List<GetCiscoSnmpFeatureTemplateTrapTarget> trapTargets) {
            if (trapTargets == null) {
              throw new MissingRequiredPropertyException("GetCiscoSnmpFeatureTemplateResult", "trapTargets");
            }
            this.trapTargets = trapTargets;
            return this;
        }
        public Builder trapTargets(GetCiscoSnmpFeatureTemplateTrapTarget... trapTargets) {
            return trapTargets(List.of(trapTargets));
        }
        @CustomType.Setter
        public Builder users(List<GetCiscoSnmpFeatureTemplateUser> users) {
            if (users == null) {
              throw new MissingRequiredPropertyException("GetCiscoSnmpFeatureTemplateResult", "users");
            }
            this.users = users;
            return this;
        }
        public Builder users(GetCiscoSnmpFeatureTemplateUser... users) {
            return users(List.of(users));
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetCiscoSnmpFeatureTemplateResult", "version");
            }
            this.version = version;
            return this;
        }
        @CustomType.Setter
        public Builder views(List<GetCiscoSnmpFeatureTemplateView> views) {
            if (views == null) {
              throw new MissingRequiredPropertyException("GetCiscoSnmpFeatureTemplateResult", "views");
            }
            this.views = views;
            return this;
        }
        public Builder views(GetCiscoSnmpFeatureTemplateView... views) {
            return views(List.of(views));
        }
        public GetCiscoSnmpFeatureTemplateResult build() {
            final var _resultValue = new GetCiscoSnmpFeatureTemplateResult();
            _resultValue.communities = communities;
            _resultValue.contact = contact;
            _resultValue.contactVariable = contactVariable;
            _resultValue.description = description;
            _resultValue.deviceTypes = deviceTypes;
            _resultValue.groups = groups;
            _resultValue.id = id;
            _resultValue.location = location;
            _resultValue.locationVariable = locationVariable;
            _resultValue.name = name;
            _resultValue.shutdown = shutdown;
            _resultValue.shutdownVariable = shutdownVariable;
            _resultValue.templateType = templateType;
            _resultValue.trapTargets = trapTargets;
            _resultValue.users = users;
            _resultValue.version = version;
            _resultValue.views = views;
            return _resultValue;
        }
    }
}
