// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.outputs.GetIpv6AclPolicyDefinitionSequenceActionEntry;
import com.pulumi.sdwan.outputs.GetIpv6AclPolicyDefinitionSequenceMatchEntry;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIpv6AclPolicyDefinitionSequence {
    /**
     * @return List of action entries
     * 
     */
    private List<GetIpv6AclPolicyDefinitionSequenceActionEntry> actionEntries;
    /**
     * @return Base action, either `accept` or `drop`
     * 
     */
    private String baseAction;
    /**
     * @return Sequence ID
     * 
     */
    private Integer id;
    /**
     * @return List of match entries
     * 
     */
    private List<GetIpv6AclPolicyDefinitionSequenceMatchEntry> matchEntries;
    /**
     * @return Sequence name
     * 
     */
    private String name;

    private GetIpv6AclPolicyDefinitionSequence() {}
    /**
     * @return List of action entries
     * 
     */
    public List<GetIpv6AclPolicyDefinitionSequenceActionEntry> actionEntries() {
        return this.actionEntries;
    }
    /**
     * @return Base action, either `accept` or `drop`
     * 
     */
    public String baseAction() {
        return this.baseAction;
    }
    /**
     * @return Sequence ID
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return List of match entries
     * 
     */
    public List<GetIpv6AclPolicyDefinitionSequenceMatchEntry> matchEntries() {
        return this.matchEntries;
    }
    /**
     * @return Sequence name
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpv6AclPolicyDefinitionSequence defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetIpv6AclPolicyDefinitionSequenceActionEntry> actionEntries;
        private String baseAction;
        private Integer id;
        private List<GetIpv6AclPolicyDefinitionSequenceMatchEntry> matchEntries;
        private String name;
        public Builder() {}
        public Builder(GetIpv6AclPolicyDefinitionSequence defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionEntries = defaults.actionEntries;
    	      this.baseAction = defaults.baseAction;
    	      this.id = defaults.id;
    	      this.matchEntries = defaults.matchEntries;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder actionEntries(List<GetIpv6AclPolicyDefinitionSequenceActionEntry> actionEntries) {
            if (actionEntries == null) {
              throw new MissingRequiredPropertyException("GetIpv6AclPolicyDefinitionSequence", "actionEntries");
            }
            this.actionEntries = actionEntries;
            return this;
        }
        public Builder actionEntries(GetIpv6AclPolicyDefinitionSequenceActionEntry... actionEntries) {
            return actionEntries(List.of(actionEntries));
        }
        @CustomType.Setter
        public Builder baseAction(String baseAction) {
            if (baseAction == null) {
              throw new MissingRequiredPropertyException("GetIpv6AclPolicyDefinitionSequence", "baseAction");
            }
            this.baseAction = baseAction;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetIpv6AclPolicyDefinitionSequence", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder matchEntries(List<GetIpv6AclPolicyDefinitionSequenceMatchEntry> matchEntries) {
            if (matchEntries == null) {
              throw new MissingRequiredPropertyException("GetIpv6AclPolicyDefinitionSequence", "matchEntries");
            }
            this.matchEntries = matchEntries;
            return this;
        }
        public Builder matchEntries(GetIpv6AclPolicyDefinitionSequenceMatchEntry... matchEntries) {
            return matchEntries(List.of(matchEntries));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetIpv6AclPolicyDefinitionSequence", "name");
            }
            this.name = name;
            return this;
        }
        public GetIpv6AclPolicyDefinitionSequence build() {
            final var _resultValue = new GetIpv6AclPolicyDefinitionSequence();
            _resultValue.actionEntries = actionEntries;
            _resultValue.baseAction = baseAction;
            _resultValue.id = id;
            _resultValue.matchEntries = matchEntries;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
