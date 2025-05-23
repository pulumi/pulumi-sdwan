// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.outputs.GetUrlFilteringPolicyDefinitionLogging;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetUrlFilteringPolicyDefinitionResult {
    /**
     * @return List of alerts options that will be exported as syslog messages
     * 
     */
    private List<String> alerts;
    /**
     * @return Allow URL list ID
     * 
     */
    private String allowUrlListId;
    /**
     * @return Allow URL list version
     * 
     */
    private Integer allowUrlListVersion;
    /**
     * @return Redirect to a URL or display a message when a blocked page is accessed.
     * 
     */
    private String blockPageAction;
    /**
     * @return The message displayed or URL redirected to when a blocked page is accessed.
     * 
     */
    private String blockPageContents;
    /**
     * @return Block URL list ID
     * 
     */
    private String blockUrlListId;
    /**
     * @return Block URL list version
     * 
     */
    private Integer blockUrlListVersion;
    /**
     * @return The description of the policy definition.
     * 
     */
    private String description;
    /**
     * @return The id of the object
     * 
     */
    private String id;
    private List<GetUrlFilteringPolicyDefinitionLogging> loggings;
    /**
     * @return The policy mode
     * 
     */
    private String mode;
    /**
     * @return The name of the policy definition.
     * 
     */
    private String name;
    /**
     * @return List of VPN IDs
     * 
     */
    private List<String> targetVpns;
    /**
     * @return The version of the object
     * 
     */
    private Integer version;
    /**
     * @return List of categories to block or allow
     * 
     */
    private List<String> webCategories;
    /**
     * @return whether the selected web categories should be blocked or allowed.
     * 
     */
    private String webCategoriesAction;
    /**
     * @return The web reputation of the policy definition
     * 
     */
    private String webReputation;

    private GetUrlFilteringPolicyDefinitionResult() {}
    /**
     * @return List of alerts options that will be exported as syslog messages
     * 
     */
    public List<String> alerts() {
        return this.alerts;
    }
    /**
     * @return Allow URL list ID
     * 
     */
    public String allowUrlListId() {
        return this.allowUrlListId;
    }
    /**
     * @return Allow URL list version
     * 
     */
    public Integer allowUrlListVersion() {
        return this.allowUrlListVersion;
    }
    /**
     * @return Redirect to a URL or display a message when a blocked page is accessed.
     * 
     */
    public String blockPageAction() {
        return this.blockPageAction;
    }
    /**
     * @return The message displayed or URL redirected to when a blocked page is accessed.
     * 
     */
    public String blockPageContents() {
        return this.blockPageContents;
    }
    /**
     * @return Block URL list ID
     * 
     */
    public String blockUrlListId() {
        return this.blockUrlListId;
    }
    /**
     * @return Block URL list version
     * 
     */
    public Integer blockUrlListVersion() {
        return this.blockUrlListVersion;
    }
    /**
     * @return The description of the policy definition.
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
    public List<GetUrlFilteringPolicyDefinitionLogging> loggings() {
        return this.loggings;
    }
    /**
     * @return The policy mode
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return The name of the policy definition.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of VPN IDs
     * 
     */
    public List<String> targetVpns() {
        return this.targetVpns;
    }
    /**
     * @return The version of the object
     * 
     */
    public Integer version() {
        return this.version;
    }
    /**
     * @return List of categories to block or allow
     * 
     */
    public List<String> webCategories() {
        return this.webCategories;
    }
    /**
     * @return whether the selected web categories should be blocked or allowed.
     * 
     */
    public String webCategoriesAction() {
        return this.webCategoriesAction;
    }
    /**
     * @return The web reputation of the policy definition
     * 
     */
    public String webReputation() {
        return this.webReputation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUrlFilteringPolicyDefinitionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> alerts;
        private String allowUrlListId;
        private Integer allowUrlListVersion;
        private String blockPageAction;
        private String blockPageContents;
        private String blockUrlListId;
        private Integer blockUrlListVersion;
        private String description;
        private String id;
        private List<GetUrlFilteringPolicyDefinitionLogging> loggings;
        private String mode;
        private String name;
        private List<String> targetVpns;
        private Integer version;
        private List<String> webCategories;
        private String webCategoriesAction;
        private String webReputation;
        public Builder() {}
        public Builder(GetUrlFilteringPolicyDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alerts = defaults.alerts;
    	      this.allowUrlListId = defaults.allowUrlListId;
    	      this.allowUrlListVersion = defaults.allowUrlListVersion;
    	      this.blockPageAction = defaults.blockPageAction;
    	      this.blockPageContents = defaults.blockPageContents;
    	      this.blockUrlListId = defaults.blockUrlListId;
    	      this.blockUrlListVersion = defaults.blockUrlListVersion;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.loggings = defaults.loggings;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.targetVpns = defaults.targetVpns;
    	      this.version = defaults.version;
    	      this.webCategories = defaults.webCategories;
    	      this.webCategoriesAction = defaults.webCategoriesAction;
    	      this.webReputation = defaults.webReputation;
        }

        @CustomType.Setter
        public Builder alerts(List<String> alerts) {
            if (alerts == null) {
              throw new MissingRequiredPropertyException("GetUrlFilteringPolicyDefinitionResult", "alerts");
            }
            this.alerts = alerts;
            return this;
        }
        public Builder alerts(String... alerts) {
            return alerts(List.of(alerts));
        }
        @CustomType.Setter
        public Builder allowUrlListId(String allowUrlListId) {
            if (allowUrlListId == null) {
              throw new MissingRequiredPropertyException("GetUrlFilteringPolicyDefinitionResult", "allowUrlListId");
            }
            this.allowUrlListId = allowUrlListId;
            return this;
        }
        @CustomType.Setter
        public Builder allowUrlListVersion(Integer allowUrlListVersion) {
            if (allowUrlListVersion == null) {
              throw new MissingRequiredPropertyException("GetUrlFilteringPolicyDefinitionResult", "allowUrlListVersion");
            }
            this.allowUrlListVersion = allowUrlListVersion;
            return this;
        }
        @CustomType.Setter
        public Builder blockPageAction(String blockPageAction) {
            if (blockPageAction == null) {
              throw new MissingRequiredPropertyException("GetUrlFilteringPolicyDefinitionResult", "blockPageAction");
            }
            this.blockPageAction = blockPageAction;
            return this;
        }
        @CustomType.Setter
        public Builder blockPageContents(String blockPageContents) {
            if (blockPageContents == null) {
              throw new MissingRequiredPropertyException("GetUrlFilteringPolicyDefinitionResult", "blockPageContents");
            }
            this.blockPageContents = blockPageContents;
            return this;
        }
        @CustomType.Setter
        public Builder blockUrlListId(String blockUrlListId) {
            if (blockUrlListId == null) {
              throw new MissingRequiredPropertyException("GetUrlFilteringPolicyDefinitionResult", "blockUrlListId");
            }
            this.blockUrlListId = blockUrlListId;
            return this;
        }
        @CustomType.Setter
        public Builder blockUrlListVersion(Integer blockUrlListVersion) {
            if (blockUrlListVersion == null) {
              throw new MissingRequiredPropertyException("GetUrlFilteringPolicyDefinitionResult", "blockUrlListVersion");
            }
            this.blockUrlListVersion = blockUrlListVersion;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetUrlFilteringPolicyDefinitionResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetUrlFilteringPolicyDefinitionResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder loggings(List<GetUrlFilteringPolicyDefinitionLogging> loggings) {
            if (loggings == null) {
              throw new MissingRequiredPropertyException("GetUrlFilteringPolicyDefinitionResult", "loggings");
            }
            this.loggings = loggings;
            return this;
        }
        public Builder loggings(GetUrlFilteringPolicyDefinitionLogging... loggings) {
            return loggings(List.of(loggings));
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            if (mode == null) {
              throw new MissingRequiredPropertyException("GetUrlFilteringPolicyDefinitionResult", "mode");
            }
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetUrlFilteringPolicyDefinitionResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder targetVpns(List<String> targetVpns) {
            if (targetVpns == null) {
              throw new MissingRequiredPropertyException("GetUrlFilteringPolicyDefinitionResult", "targetVpns");
            }
            this.targetVpns = targetVpns;
            return this;
        }
        public Builder targetVpns(String... targetVpns) {
            return targetVpns(List.of(targetVpns));
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetUrlFilteringPolicyDefinitionResult", "version");
            }
            this.version = version;
            return this;
        }
        @CustomType.Setter
        public Builder webCategories(List<String> webCategories) {
            if (webCategories == null) {
              throw new MissingRequiredPropertyException("GetUrlFilteringPolicyDefinitionResult", "webCategories");
            }
            this.webCategories = webCategories;
            return this;
        }
        public Builder webCategories(String... webCategories) {
            return webCategories(List.of(webCategories));
        }
        @CustomType.Setter
        public Builder webCategoriesAction(String webCategoriesAction) {
            if (webCategoriesAction == null) {
              throw new MissingRequiredPropertyException("GetUrlFilteringPolicyDefinitionResult", "webCategoriesAction");
            }
            this.webCategoriesAction = webCategoriesAction;
            return this;
        }
        @CustomType.Setter
        public Builder webReputation(String webReputation) {
            if (webReputation == null) {
              throw new MissingRequiredPropertyException("GetUrlFilteringPolicyDefinitionResult", "webReputation");
            }
            this.webReputation = webReputation;
            return this;
        }
        public GetUrlFilteringPolicyDefinitionResult build() {
            final var _resultValue = new GetUrlFilteringPolicyDefinitionResult();
            _resultValue.alerts = alerts;
            _resultValue.allowUrlListId = allowUrlListId;
            _resultValue.allowUrlListVersion = allowUrlListVersion;
            _resultValue.blockPageAction = blockPageAction;
            _resultValue.blockPageContents = blockPageContents;
            _resultValue.blockUrlListId = blockUrlListId;
            _resultValue.blockUrlListVersion = blockUrlListVersion;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.loggings = loggings;
            _resultValue.mode = mode;
            _resultValue.name = name;
            _resultValue.targetVpns = targetVpns;
            _resultValue.version = version;
            _resultValue.webCategories = webCategories;
            _resultValue.webCategoriesAction = webCategoriesAction;
            _resultValue.webReputation = webReputation;
            return _resultValue;
        }
    }
}
