// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTlsSslProfilePolicyDefinitionResult {
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
     * @return Categories that should be decrypted
     * 
     */
    private List<String> decryptCategories;
    /**
     * @return Decrypt threshold
     * 
     */
    private String decryptThreshold;
    /**
     * @return The description of the policy definition.
     * 
     */
    private String description;
    /**
     * @return Fail decrypt enabled
     * 
     */
    private Boolean failDecrypt;
    /**
     * @return The id of the object
     * 
     */
    private String id;
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
     * @return Categories that should never be decrypted
     * 
     */
    private List<String> neverDecryptCategories;
    /**
     * @return Reputation enabled
     * 
     */
    private Boolean reputation;
    /**
     * @return Categories that should skipped
     * 
     */
    private List<String> skipDecryptCategories;
    /**
     * @return The version of the object
     * 
     */
    private Integer version;

    private GetTlsSslProfilePolicyDefinitionResult() {}
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
     * @return Categories that should be decrypted
     * 
     */
    public List<String> decryptCategories() {
        return this.decryptCategories;
    }
    /**
     * @return Decrypt threshold
     * 
     */
    public String decryptThreshold() {
        return this.decryptThreshold;
    }
    /**
     * @return The description of the policy definition.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Fail decrypt enabled
     * 
     */
    public Boolean failDecrypt() {
        return this.failDecrypt;
    }
    /**
     * @return The id of the object
     * 
     */
    public String id() {
        return this.id;
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
     * @return Categories that should never be decrypted
     * 
     */
    public List<String> neverDecryptCategories() {
        return this.neverDecryptCategories;
    }
    /**
     * @return Reputation enabled
     * 
     */
    public Boolean reputation() {
        return this.reputation;
    }
    /**
     * @return Categories that should skipped
     * 
     */
    public List<String> skipDecryptCategories() {
        return this.skipDecryptCategories;
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

    public static Builder builder(GetTlsSslProfilePolicyDefinitionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String allowUrlListId;
        private Integer allowUrlListVersion;
        private String blockUrlListId;
        private Integer blockUrlListVersion;
        private List<String> decryptCategories;
        private String decryptThreshold;
        private String description;
        private Boolean failDecrypt;
        private String id;
        private String mode;
        private String name;
        private List<String> neverDecryptCategories;
        private Boolean reputation;
        private List<String> skipDecryptCategories;
        private Integer version;
        public Builder() {}
        public Builder(GetTlsSslProfilePolicyDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowUrlListId = defaults.allowUrlListId;
    	      this.allowUrlListVersion = defaults.allowUrlListVersion;
    	      this.blockUrlListId = defaults.blockUrlListId;
    	      this.blockUrlListVersion = defaults.blockUrlListVersion;
    	      this.decryptCategories = defaults.decryptCategories;
    	      this.decryptThreshold = defaults.decryptThreshold;
    	      this.description = defaults.description;
    	      this.failDecrypt = defaults.failDecrypt;
    	      this.id = defaults.id;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.neverDecryptCategories = defaults.neverDecryptCategories;
    	      this.reputation = defaults.reputation;
    	      this.skipDecryptCategories = defaults.skipDecryptCategories;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder allowUrlListId(String allowUrlListId) {
            if (allowUrlListId == null) {
              throw new MissingRequiredPropertyException("GetTlsSslProfilePolicyDefinitionResult", "allowUrlListId");
            }
            this.allowUrlListId = allowUrlListId;
            return this;
        }
        @CustomType.Setter
        public Builder allowUrlListVersion(Integer allowUrlListVersion) {
            if (allowUrlListVersion == null) {
              throw new MissingRequiredPropertyException("GetTlsSslProfilePolicyDefinitionResult", "allowUrlListVersion");
            }
            this.allowUrlListVersion = allowUrlListVersion;
            return this;
        }
        @CustomType.Setter
        public Builder blockUrlListId(String blockUrlListId) {
            if (blockUrlListId == null) {
              throw new MissingRequiredPropertyException("GetTlsSslProfilePolicyDefinitionResult", "blockUrlListId");
            }
            this.blockUrlListId = blockUrlListId;
            return this;
        }
        @CustomType.Setter
        public Builder blockUrlListVersion(Integer blockUrlListVersion) {
            if (blockUrlListVersion == null) {
              throw new MissingRequiredPropertyException("GetTlsSslProfilePolicyDefinitionResult", "blockUrlListVersion");
            }
            this.blockUrlListVersion = blockUrlListVersion;
            return this;
        }
        @CustomType.Setter
        public Builder decryptCategories(List<String> decryptCategories) {
            if (decryptCategories == null) {
              throw new MissingRequiredPropertyException("GetTlsSslProfilePolicyDefinitionResult", "decryptCategories");
            }
            this.decryptCategories = decryptCategories;
            return this;
        }
        public Builder decryptCategories(String... decryptCategories) {
            return decryptCategories(List.of(decryptCategories));
        }
        @CustomType.Setter
        public Builder decryptThreshold(String decryptThreshold) {
            if (decryptThreshold == null) {
              throw new MissingRequiredPropertyException("GetTlsSslProfilePolicyDefinitionResult", "decryptThreshold");
            }
            this.decryptThreshold = decryptThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetTlsSslProfilePolicyDefinitionResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder failDecrypt(Boolean failDecrypt) {
            if (failDecrypt == null) {
              throw new MissingRequiredPropertyException("GetTlsSslProfilePolicyDefinitionResult", "failDecrypt");
            }
            this.failDecrypt = failDecrypt;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTlsSslProfilePolicyDefinitionResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            if (mode == null) {
              throw new MissingRequiredPropertyException("GetTlsSslProfilePolicyDefinitionResult", "mode");
            }
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetTlsSslProfilePolicyDefinitionResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder neverDecryptCategories(List<String> neverDecryptCategories) {
            if (neverDecryptCategories == null) {
              throw new MissingRequiredPropertyException("GetTlsSslProfilePolicyDefinitionResult", "neverDecryptCategories");
            }
            this.neverDecryptCategories = neverDecryptCategories;
            return this;
        }
        public Builder neverDecryptCategories(String... neverDecryptCategories) {
            return neverDecryptCategories(List.of(neverDecryptCategories));
        }
        @CustomType.Setter
        public Builder reputation(Boolean reputation) {
            if (reputation == null) {
              throw new MissingRequiredPropertyException("GetTlsSslProfilePolicyDefinitionResult", "reputation");
            }
            this.reputation = reputation;
            return this;
        }
        @CustomType.Setter
        public Builder skipDecryptCategories(List<String> skipDecryptCategories) {
            if (skipDecryptCategories == null) {
              throw new MissingRequiredPropertyException("GetTlsSslProfilePolicyDefinitionResult", "skipDecryptCategories");
            }
            this.skipDecryptCategories = skipDecryptCategories;
            return this;
        }
        public Builder skipDecryptCategories(String... skipDecryptCategories) {
            return skipDecryptCategories(List.of(skipDecryptCategories));
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetTlsSslProfilePolicyDefinitionResult", "version");
            }
            this.version = version;
            return this;
        }
        public GetTlsSslProfilePolicyDefinitionResult build() {
            final var _resultValue = new GetTlsSslProfilePolicyDefinitionResult();
            _resultValue.allowUrlListId = allowUrlListId;
            _resultValue.allowUrlListVersion = allowUrlListVersion;
            _resultValue.blockUrlListId = blockUrlListId;
            _resultValue.blockUrlListVersion = blockUrlListVersion;
            _resultValue.decryptCategories = decryptCategories;
            _resultValue.decryptThreshold = decryptThreshold;
            _resultValue.description = description;
            _resultValue.failDecrypt = failDecrypt;
            _resultValue.id = id;
            _resultValue.mode = mode;
            _resultValue.name = name;
            _resultValue.neverDecryptCategories = neverDecryptCategories;
            _resultValue.reputation = reputation;
            _resultValue.skipDecryptCategories = skipDecryptCategories;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
