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
public final class GetServiceMulticastFeatureMsdpGroupPeer {
    /**
     * @return Set MSDP peer ip connect-source interface
     * 
     */
    private String connectionSourceInterface;
    /**
     * @return Variable name
     * 
     */
    private String connectionSourceInterfaceVariable;
    /**
     * @return Set MSDP default peer
     * 
     */
    private Boolean defaultPeer;
    /**
     * @return Set MSDP peer ip keepalive hold time
     * 
     */
    private Integer keepaliveHoldTime;
    /**
     * @return Variable name
     * 
     */
    private String keepaliveHoldTimeVariable;
    /**
     * @return Set MSDP peer ip keepalive interval
     * 
     */
    private Integer keepaliveInterval;
    /**
     * @return Variable name
     * 
     */
    private String keepaliveIntervalVariable;
    /**
     * @return Set MSDP peer ip password
     * 
     */
    private String peerAuthenticationPassword;
    /**
     * @return Variable name
     * 
     */
    private String peerAuthenticationPasswordVariable;
    /**
     * @return Set MSDP peer ip
     * 
     */
    private String peerIp;
    /**
     * @return Variable name
     * 
     */
    private String peerIpVariable;
    private String prefixListId;
    /**
     * @return Set MSDP peer ip remote autonomous system number
     * 
     */
    private Integer remoteAs;
    /**
     * @return Variable name
     * 
     */
    private String remoteAsVariable;
    /**
     * @return Set MSDP peer ip SA limit message number
     * 
     */
    private Integer saLimit;
    /**
     * @return Variable name
     * 
     */
    private String saLimitVariable;

    private GetServiceMulticastFeatureMsdpGroupPeer() {}
    /**
     * @return Set MSDP peer ip connect-source interface
     * 
     */
    public String connectionSourceInterface() {
        return this.connectionSourceInterface;
    }
    /**
     * @return Variable name
     * 
     */
    public String connectionSourceInterfaceVariable() {
        return this.connectionSourceInterfaceVariable;
    }
    /**
     * @return Set MSDP default peer
     * 
     */
    public Boolean defaultPeer() {
        return this.defaultPeer;
    }
    /**
     * @return Set MSDP peer ip keepalive hold time
     * 
     */
    public Integer keepaliveHoldTime() {
        return this.keepaliveHoldTime;
    }
    /**
     * @return Variable name
     * 
     */
    public String keepaliveHoldTimeVariable() {
        return this.keepaliveHoldTimeVariable;
    }
    /**
     * @return Set MSDP peer ip keepalive interval
     * 
     */
    public Integer keepaliveInterval() {
        return this.keepaliveInterval;
    }
    /**
     * @return Variable name
     * 
     */
    public String keepaliveIntervalVariable() {
        return this.keepaliveIntervalVariable;
    }
    /**
     * @return Set MSDP peer ip password
     * 
     */
    public String peerAuthenticationPassword() {
        return this.peerAuthenticationPassword;
    }
    /**
     * @return Variable name
     * 
     */
    public String peerAuthenticationPasswordVariable() {
        return this.peerAuthenticationPasswordVariable;
    }
    /**
     * @return Set MSDP peer ip
     * 
     */
    public String peerIp() {
        return this.peerIp;
    }
    /**
     * @return Variable name
     * 
     */
    public String peerIpVariable() {
        return this.peerIpVariable;
    }
    public String prefixListId() {
        return this.prefixListId;
    }
    /**
     * @return Set MSDP peer ip remote autonomous system number
     * 
     */
    public Integer remoteAs() {
        return this.remoteAs;
    }
    /**
     * @return Variable name
     * 
     */
    public String remoteAsVariable() {
        return this.remoteAsVariable;
    }
    /**
     * @return Set MSDP peer ip SA limit message number
     * 
     */
    public Integer saLimit() {
        return this.saLimit;
    }
    /**
     * @return Variable name
     * 
     */
    public String saLimitVariable() {
        return this.saLimitVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceMulticastFeatureMsdpGroupPeer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String connectionSourceInterface;
        private String connectionSourceInterfaceVariable;
        private Boolean defaultPeer;
        private Integer keepaliveHoldTime;
        private String keepaliveHoldTimeVariable;
        private Integer keepaliveInterval;
        private String keepaliveIntervalVariable;
        private String peerAuthenticationPassword;
        private String peerAuthenticationPasswordVariable;
        private String peerIp;
        private String peerIpVariable;
        private String prefixListId;
        private Integer remoteAs;
        private String remoteAsVariable;
        private Integer saLimit;
        private String saLimitVariable;
        public Builder() {}
        public Builder(GetServiceMulticastFeatureMsdpGroupPeer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionSourceInterface = defaults.connectionSourceInterface;
    	      this.connectionSourceInterfaceVariable = defaults.connectionSourceInterfaceVariable;
    	      this.defaultPeer = defaults.defaultPeer;
    	      this.keepaliveHoldTime = defaults.keepaliveHoldTime;
    	      this.keepaliveHoldTimeVariable = defaults.keepaliveHoldTimeVariable;
    	      this.keepaliveInterval = defaults.keepaliveInterval;
    	      this.keepaliveIntervalVariable = defaults.keepaliveIntervalVariable;
    	      this.peerAuthenticationPassword = defaults.peerAuthenticationPassword;
    	      this.peerAuthenticationPasswordVariable = defaults.peerAuthenticationPasswordVariable;
    	      this.peerIp = defaults.peerIp;
    	      this.peerIpVariable = defaults.peerIpVariable;
    	      this.prefixListId = defaults.prefixListId;
    	      this.remoteAs = defaults.remoteAs;
    	      this.remoteAsVariable = defaults.remoteAsVariable;
    	      this.saLimit = defaults.saLimit;
    	      this.saLimitVariable = defaults.saLimitVariable;
        }

        @CustomType.Setter
        public Builder connectionSourceInterface(String connectionSourceInterface) {
            if (connectionSourceInterface == null) {
              throw new MissingRequiredPropertyException("GetServiceMulticastFeatureMsdpGroupPeer", "connectionSourceInterface");
            }
            this.connectionSourceInterface = connectionSourceInterface;
            return this;
        }
        @CustomType.Setter
        public Builder connectionSourceInterfaceVariable(String connectionSourceInterfaceVariable) {
            if (connectionSourceInterfaceVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceMulticastFeatureMsdpGroupPeer", "connectionSourceInterfaceVariable");
            }
            this.connectionSourceInterfaceVariable = connectionSourceInterfaceVariable;
            return this;
        }
        @CustomType.Setter
        public Builder defaultPeer(Boolean defaultPeer) {
            if (defaultPeer == null) {
              throw new MissingRequiredPropertyException("GetServiceMulticastFeatureMsdpGroupPeer", "defaultPeer");
            }
            this.defaultPeer = defaultPeer;
            return this;
        }
        @CustomType.Setter
        public Builder keepaliveHoldTime(Integer keepaliveHoldTime) {
            if (keepaliveHoldTime == null) {
              throw new MissingRequiredPropertyException("GetServiceMulticastFeatureMsdpGroupPeer", "keepaliveHoldTime");
            }
            this.keepaliveHoldTime = keepaliveHoldTime;
            return this;
        }
        @CustomType.Setter
        public Builder keepaliveHoldTimeVariable(String keepaliveHoldTimeVariable) {
            if (keepaliveHoldTimeVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceMulticastFeatureMsdpGroupPeer", "keepaliveHoldTimeVariable");
            }
            this.keepaliveHoldTimeVariable = keepaliveHoldTimeVariable;
            return this;
        }
        @CustomType.Setter
        public Builder keepaliveInterval(Integer keepaliveInterval) {
            if (keepaliveInterval == null) {
              throw new MissingRequiredPropertyException("GetServiceMulticastFeatureMsdpGroupPeer", "keepaliveInterval");
            }
            this.keepaliveInterval = keepaliveInterval;
            return this;
        }
        @CustomType.Setter
        public Builder keepaliveIntervalVariable(String keepaliveIntervalVariable) {
            if (keepaliveIntervalVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceMulticastFeatureMsdpGroupPeer", "keepaliveIntervalVariable");
            }
            this.keepaliveIntervalVariable = keepaliveIntervalVariable;
            return this;
        }
        @CustomType.Setter
        public Builder peerAuthenticationPassword(String peerAuthenticationPassword) {
            if (peerAuthenticationPassword == null) {
              throw new MissingRequiredPropertyException("GetServiceMulticastFeatureMsdpGroupPeer", "peerAuthenticationPassword");
            }
            this.peerAuthenticationPassword = peerAuthenticationPassword;
            return this;
        }
        @CustomType.Setter
        public Builder peerAuthenticationPasswordVariable(String peerAuthenticationPasswordVariable) {
            if (peerAuthenticationPasswordVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceMulticastFeatureMsdpGroupPeer", "peerAuthenticationPasswordVariable");
            }
            this.peerAuthenticationPasswordVariable = peerAuthenticationPasswordVariable;
            return this;
        }
        @CustomType.Setter
        public Builder peerIp(String peerIp) {
            if (peerIp == null) {
              throw new MissingRequiredPropertyException("GetServiceMulticastFeatureMsdpGroupPeer", "peerIp");
            }
            this.peerIp = peerIp;
            return this;
        }
        @CustomType.Setter
        public Builder peerIpVariable(String peerIpVariable) {
            if (peerIpVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceMulticastFeatureMsdpGroupPeer", "peerIpVariable");
            }
            this.peerIpVariable = peerIpVariable;
            return this;
        }
        @CustomType.Setter
        public Builder prefixListId(String prefixListId) {
            if (prefixListId == null) {
              throw new MissingRequiredPropertyException("GetServiceMulticastFeatureMsdpGroupPeer", "prefixListId");
            }
            this.prefixListId = prefixListId;
            return this;
        }
        @CustomType.Setter
        public Builder remoteAs(Integer remoteAs) {
            if (remoteAs == null) {
              throw new MissingRequiredPropertyException("GetServiceMulticastFeatureMsdpGroupPeer", "remoteAs");
            }
            this.remoteAs = remoteAs;
            return this;
        }
        @CustomType.Setter
        public Builder remoteAsVariable(String remoteAsVariable) {
            if (remoteAsVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceMulticastFeatureMsdpGroupPeer", "remoteAsVariable");
            }
            this.remoteAsVariable = remoteAsVariable;
            return this;
        }
        @CustomType.Setter
        public Builder saLimit(Integer saLimit) {
            if (saLimit == null) {
              throw new MissingRequiredPropertyException("GetServiceMulticastFeatureMsdpGroupPeer", "saLimit");
            }
            this.saLimit = saLimit;
            return this;
        }
        @CustomType.Setter
        public Builder saLimitVariable(String saLimitVariable) {
            if (saLimitVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceMulticastFeatureMsdpGroupPeer", "saLimitVariable");
            }
            this.saLimitVariable = saLimitVariable;
            return this;
        }
        public GetServiceMulticastFeatureMsdpGroupPeer build() {
            final var _resultValue = new GetServiceMulticastFeatureMsdpGroupPeer();
            _resultValue.connectionSourceInterface = connectionSourceInterface;
            _resultValue.connectionSourceInterfaceVariable = connectionSourceInterfaceVariable;
            _resultValue.defaultPeer = defaultPeer;
            _resultValue.keepaliveHoldTime = keepaliveHoldTime;
            _resultValue.keepaliveHoldTimeVariable = keepaliveHoldTimeVariable;
            _resultValue.keepaliveInterval = keepaliveInterval;
            _resultValue.keepaliveIntervalVariable = keepaliveIntervalVariable;
            _resultValue.peerAuthenticationPassword = peerAuthenticationPassword;
            _resultValue.peerAuthenticationPasswordVariable = peerAuthenticationPasswordVariable;
            _resultValue.peerIp = peerIp;
            _resultValue.peerIpVariable = peerIpVariable;
            _resultValue.prefixListId = prefixListId;
            _resultValue.remoteAs = remoteAs;
            _resultValue.remoteAsVariable = remoteAsVariable;
            _resultValue.saLimit = saLimit;
            _resultValue.saLimitVariable = saLimitVariable;
            return _resultValue;
        }
    }
}
