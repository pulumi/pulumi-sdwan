// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCiscoOspfFeatureTemplateAreaInterface {
    /**
     * @return Set MD5 authentication key
     * 
     */
    private String authenticationMessageDigestKey;
    /**
     * @return Set MD5 message digest key
     * 
     */
    private Integer authenticationMessageDigestKeyId;
    /**
     * @return Variable name
     * 
     */
    private String authenticationMessageDigestKeyIdVariable;
    /**
     * @return Variable name
     * 
     */
    private String authenticationMessageDigestKeyVariable;
    /**
     * @return Set OSPF interface authentication type
     * 
     */
    private String authenticationType;
    /**
     * @return Variable name
     * 
     */
    private String authenticationTypeVariable;
    /**
     * @return Set cost of OSPF interface
     * 
     */
    private Integer cost;
    /**
     * @return Variable name
     * 
     */
    private String costVariable;
    /**
     * @return Set interval after which neighbor is declared to be down
     * 
     */
    private Integer deadInterval;
    /**
     * @return Variable name
     * 
     */
    private String deadIntervalVariable;
    /**
     * @return Set interval between OSPF hello packets
     * 
     */
    private Integer helloInterval;
    /**
     * @return Variable name
     * 
     */
    private String helloIntervalVariable;
    /**
     * @return Set interface name
     * 
     */
    private String name;
    /**
     * @return Variable name
     * 
     */
    private String nameVariable;
    /**
     * @return Set the OSPF network type
     * 
     */
    private String network;
    /**
     * @return Variable name
     * 
     */
    private String networkVariable;
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private Boolean optional;
    /**
     * @return Set the interface to advertise its address, but not to actively run OSPF
     * 
     */
    private Boolean passiveInterface;
    /**
     * @return Variable name
     * 
     */
    private String passiveInterfaceVariable;
    /**
     * @return Set router’s priority to be elected as designated router
     * 
     */
    private Integer priority;
    /**
     * @return Variable name
     * 
     */
    private String priorityVariable;
    /**
     * @return Set time between retransmitting LSAs
     * 
     */
    private Integer retransmitInterval;
    /**
     * @return Variable name
     * 
     */
    private String retransmitIntervalVariable;

    private GetCiscoOspfFeatureTemplateAreaInterface() {}
    /**
     * @return Set MD5 authentication key
     * 
     */
    public String authenticationMessageDigestKey() {
        return this.authenticationMessageDigestKey;
    }
    /**
     * @return Set MD5 message digest key
     * 
     */
    public Integer authenticationMessageDigestKeyId() {
        return this.authenticationMessageDigestKeyId;
    }
    /**
     * @return Variable name
     * 
     */
    public String authenticationMessageDigestKeyIdVariable() {
        return this.authenticationMessageDigestKeyIdVariable;
    }
    /**
     * @return Variable name
     * 
     */
    public String authenticationMessageDigestKeyVariable() {
        return this.authenticationMessageDigestKeyVariable;
    }
    /**
     * @return Set OSPF interface authentication type
     * 
     */
    public String authenticationType() {
        return this.authenticationType;
    }
    /**
     * @return Variable name
     * 
     */
    public String authenticationTypeVariable() {
        return this.authenticationTypeVariable;
    }
    /**
     * @return Set cost of OSPF interface
     * 
     */
    public Integer cost() {
        return this.cost;
    }
    /**
     * @return Variable name
     * 
     */
    public String costVariable() {
        return this.costVariable;
    }
    /**
     * @return Set interval after which neighbor is declared to be down
     * 
     */
    public Integer deadInterval() {
        return this.deadInterval;
    }
    /**
     * @return Variable name
     * 
     */
    public String deadIntervalVariable() {
        return this.deadIntervalVariable;
    }
    /**
     * @return Set interval between OSPF hello packets
     * 
     */
    public Integer helloInterval() {
        return this.helloInterval;
    }
    /**
     * @return Variable name
     * 
     */
    public String helloIntervalVariable() {
        return this.helloIntervalVariable;
    }
    /**
     * @return Set interface name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Variable name
     * 
     */
    public String nameVariable() {
        return this.nameVariable;
    }
    /**
     * @return Set the OSPF network type
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return Variable name
     * 
     */
    public String networkVariable() {
        return this.networkVariable;
    }
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Boolean optional() {
        return this.optional;
    }
    /**
     * @return Set the interface to advertise its address, but not to actively run OSPF
     * 
     */
    public Boolean passiveInterface() {
        return this.passiveInterface;
    }
    /**
     * @return Variable name
     * 
     */
    public String passiveInterfaceVariable() {
        return this.passiveInterfaceVariable;
    }
    /**
     * @return Set router’s priority to be elected as designated router
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return Variable name
     * 
     */
    public String priorityVariable() {
        return this.priorityVariable;
    }
    /**
     * @return Set time between retransmitting LSAs
     * 
     */
    public Integer retransmitInterval() {
        return this.retransmitInterval;
    }
    /**
     * @return Variable name
     * 
     */
    public String retransmitIntervalVariable() {
        return this.retransmitIntervalVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCiscoOspfFeatureTemplateAreaInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authenticationMessageDigestKey;
        private Integer authenticationMessageDigestKeyId;
        private String authenticationMessageDigestKeyIdVariable;
        private String authenticationMessageDigestKeyVariable;
        private String authenticationType;
        private String authenticationTypeVariable;
        private Integer cost;
        private String costVariable;
        private Integer deadInterval;
        private String deadIntervalVariable;
        private Integer helloInterval;
        private String helloIntervalVariable;
        private String name;
        private String nameVariable;
        private String network;
        private String networkVariable;
        private Boolean optional;
        private Boolean passiveInterface;
        private String passiveInterfaceVariable;
        private Integer priority;
        private String priorityVariable;
        private Integer retransmitInterval;
        private String retransmitIntervalVariable;
        public Builder() {}
        public Builder(GetCiscoOspfFeatureTemplateAreaInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationMessageDigestKey = defaults.authenticationMessageDigestKey;
    	      this.authenticationMessageDigestKeyId = defaults.authenticationMessageDigestKeyId;
    	      this.authenticationMessageDigestKeyIdVariable = defaults.authenticationMessageDigestKeyIdVariable;
    	      this.authenticationMessageDigestKeyVariable = defaults.authenticationMessageDigestKeyVariable;
    	      this.authenticationType = defaults.authenticationType;
    	      this.authenticationTypeVariable = defaults.authenticationTypeVariable;
    	      this.cost = defaults.cost;
    	      this.costVariable = defaults.costVariable;
    	      this.deadInterval = defaults.deadInterval;
    	      this.deadIntervalVariable = defaults.deadIntervalVariable;
    	      this.helloInterval = defaults.helloInterval;
    	      this.helloIntervalVariable = defaults.helloIntervalVariable;
    	      this.name = defaults.name;
    	      this.nameVariable = defaults.nameVariable;
    	      this.network = defaults.network;
    	      this.networkVariable = defaults.networkVariable;
    	      this.optional = defaults.optional;
    	      this.passiveInterface = defaults.passiveInterface;
    	      this.passiveInterfaceVariable = defaults.passiveInterfaceVariable;
    	      this.priority = defaults.priority;
    	      this.priorityVariable = defaults.priorityVariable;
    	      this.retransmitInterval = defaults.retransmitInterval;
    	      this.retransmitIntervalVariable = defaults.retransmitIntervalVariable;
        }

        @CustomType.Setter
        public Builder authenticationMessageDigestKey(String authenticationMessageDigestKey) {
            if (authenticationMessageDigestKey == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "authenticationMessageDigestKey");
            }
            this.authenticationMessageDigestKey = authenticationMessageDigestKey;
            return this;
        }
        @CustomType.Setter
        public Builder authenticationMessageDigestKeyId(Integer authenticationMessageDigestKeyId) {
            if (authenticationMessageDigestKeyId == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "authenticationMessageDigestKeyId");
            }
            this.authenticationMessageDigestKeyId = authenticationMessageDigestKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder authenticationMessageDigestKeyIdVariable(String authenticationMessageDigestKeyIdVariable) {
            if (authenticationMessageDigestKeyIdVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "authenticationMessageDigestKeyIdVariable");
            }
            this.authenticationMessageDigestKeyIdVariable = authenticationMessageDigestKeyIdVariable;
            return this;
        }
        @CustomType.Setter
        public Builder authenticationMessageDigestKeyVariable(String authenticationMessageDigestKeyVariable) {
            if (authenticationMessageDigestKeyVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "authenticationMessageDigestKeyVariable");
            }
            this.authenticationMessageDigestKeyVariable = authenticationMessageDigestKeyVariable;
            return this;
        }
        @CustomType.Setter
        public Builder authenticationType(String authenticationType) {
            if (authenticationType == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "authenticationType");
            }
            this.authenticationType = authenticationType;
            return this;
        }
        @CustomType.Setter
        public Builder authenticationTypeVariable(String authenticationTypeVariable) {
            if (authenticationTypeVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "authenticationTypeVariable");
            }
            this.authenticationTypeVariable = authenticationTypeVariable;
            return this;
        }
        @CustomType.Setter
        public Builder cost(Integer cost) {
            if (cost == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "cost");
            }
            this.cost = cost;
            return this;
        }
        @CustomType.Setter
        public Builder costVariable(String costVariable) {
            if (costVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "costVariable");
            }
            this.costVariable = costVariable;
            return this;
        }
        @CustomType.Setter
        public Builder deadInterval(Integer deadInterval) {
            if (deadInterval == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "deadInterval");
            }
            this.deadInterval = deadInterval;
            return this;
        }
        @CustomType.Setter
        public Builder deadIntervalVariable(String deadIntervalVariable) {
            if (deadIntervalVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "deadIntervalVariable");
            }
            this.deadIntervalVariable = deadIntervalVariable;
            return this;
        }
        @CustomType.Setter
        public Builder helloInterval(Integer helloInterval) {
            if (helloInterval == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "helloInterval");
            }
            this.helloInterval = helloInterval;
            return this;
        }
        @CustomType.Setter
        public Builder helloIntervalVariable(String helloIntervalVariable) {
            if (helloIntervalVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "helloIntervalVariable");
            }
            this.helloIntervalVariable = helloIntervalVariable;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nameVariable(String nameVariable) {
            if (nameVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "nameVariable");
            }
            this.nameVariable = nameVariable;
            return this;
        }
        @CustomType.Setter
        public Builder network(String network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "network");
            }
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder networkVariable(String networkVariable) {
            if (networkVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "networkVariable");
            }
            this.networkVariable = networkVariable;
            return this;
        }
        @CustomType.Setter
        public Builder optional(Boolean optional) {
            if (optional == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "optional");
            }
            this.optional = optional;
            return this;
        }
        @CustomType.Setter
        public Builder passiveInterface(Boolean passiveInterface) {
            if (passiveInterface == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "passiveInterface");
            }
            this.passiveInterface = passiveInterface;
            return this;
        }
        @CustomType.Setter
        public Builder passiveInterfaceVariable(String passiveInterfaceVariable) {
            if (passiveInterfaceVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "passiveInterfaceVariable");
            }
            this.passiveInterfaceVariable = passiveInterfaceVariable;
            return this;
        }
        @CustomType.Setter
        public Builder priority(Integer priority) {
            if (priority == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "priority");
            }
            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder priorityVariable(String priorityVariable) {
            if (priorityVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "priorityVariable");
            }
            this.priorityVariable = priorityVariable;
            return this;
        }
        @CustomType.Setter
        public Builder retransmitInterval(Integer retransmitInterval) {
            if (retransmitInterval == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "retransmitInterval");
            }
            this.retransmitInterval = retransmitInterval;
            return this;
        }
        @CustomType.Setter
        public Builder retransmitIntervalVariable(String retransmitIntervalVariable) {
            if (retransmitIntervalVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOspfFeatureTemplateAreaInterface", "retransmitIntervalVariable");
            }
            this.retransmitIntervalVariable = retransmitIntervalVariable;
            return this;
        }
        public GetCiscoOspfFeatureTemplateAreaInterface build() {
            final var _resultValue = new GetCiscoOspfFeatureTemplateAreaInterface();
            _resultValue.authenticationMessageDigestKey = authenticationMessageDigestKey;
            _resultValue.authenticationMessageDigestKeyId = authenticationMessageDigestKeyId;
            _resultValue.authenticationMessageDigestKeyIdVariable = authenticationMessageDigestKeyIdVariable;
            _resultValue.authenticationMessageDigestKeyVariable = authenticationMessageDigestKeyVariable;
            _resultValue.authenticationType = authenticationType;
            _resultValue.authenticationTypeVariable = authenticationTypeVariable;
            _resultValue.cost = cost;
            _resultValue.costVariable = costVariable;
            _resultValue.deadInterval = deadInterval;
            _resultValue.deadIntervalVariable = deadIntervalVariable;
            _resultValue.helloInterval = helloInterval;
            _resultValue.helloIntervalVariable = helloIntervalVariable;
            _resultValue.name = name;
            _resultValue.nameVariable = nameVariable;
            _resultValue.network = network;
            _resultValue.networkVariable = networkVariable;
            _resultValue.optional = optional;
            _resultValue.passiveInterface = passiveInterface;
            _resultValue.passiveInterfaceVariable = passiveInterfaceVariable;
            _resultValue.priority = priority;
            _resultValue.priorityVariable = priorityVariable;
            _resultValue.retransmitInterval = retransmitInterval;
            _resultValue.retransmitIntervalVariable = retransmitIntervalVariable;
            return _resultValue;
        }
    }
}
