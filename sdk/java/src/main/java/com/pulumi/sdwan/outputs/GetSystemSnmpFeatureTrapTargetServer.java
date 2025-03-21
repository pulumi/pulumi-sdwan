// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSystemSnmpFeatureTrapTargetServer {
    /**
     * @return Set IPv4/IPv6 address of SNMP server
     * 
     */
    private String ip;
    /**
     * @return Variable name
     * 
     */
    private String ipVariable;
    /**
     * @return Set UDP port number to connect to SNMP server
     * 
     */
    private Integer port;
    /**
     * @return Variable name
     * 
     */
    private String portVariable;
    /**
     * @return Source interface for outgoing SNMP traps
     * 
     */
    private String sourceInterface;
    /**
     * @return Variable name
     * 
     */
    private String sourceInterfaceVariable;
    /**
     * @return Set name of the SNMP user
     * 
     */
    private String user;
    /**
     * @return Set user label of the SNMP community
     * 
     */
    private String userLabel;
    /**
     * @return Variable name
     * 
     */
    private String userVariable;
    /**
     * @return Set VPN in which SNMP server is located
     * 
     */
    private Integer vpnId;
    /**
     * @return Variable name
     * 
     */
    private String vpnIdVariable;

    private GetSystemSnmpFeatureTrapTargetServer() {}
    /**
     * @return Set IPv4/IPv6 address of SNMP server
     * 
     */
    public String ip() {
        return this.ip;
    }
    /**
     * @return Variable name
     * 
     */
    public String ipVariable() {
        return this.ipVariable;
    }
    /**
     * @return Set UDP port number to connect to SNMP server
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Variable name
     * 
     */
    public String portVariable() {
        return this.portVariable;
    }
    /**
     * @return Source interface for outgoing SNMP traps
     * 
     */
    public String sourceInterface() {
        return this.sourceInterface;
    }
    /**
     * @return Variable name
     * 
     */
    public String sourceInterfaceVariable() {
        return this.sourceInterfaceVariable;
    }
    /**
     * @return Set name of the SNMP user
     * 
     */
    public String user() {
        return this.user;
    }
    /**
     * @return Set user label of the SNMP community
     * 
     */
    public String userLabel() {
        return this.userLabel;
    }
    /**
     * @return Variable name
     * 
     */
    public String userVariable() {
        return this.userVariable;
    }
    /**
     * @return Set VPN in which SNMP server is located
     * 
     */
    public Integer vpnId() {
        return this.vpnId;
    }
    /**
     * @return Variable name
     * 
     */
    public String vpnIdVariable() {
        return this.vpnIdVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSystemSnmpFeatureTrapTargetServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ip;
        private String ipVariable;
        private Integer port;
        private String portVariable;
        private String sourceInterface;
        private String sourceInterfaceVariable;
        private String user;
        private String userLabel;
        private String userVariable;
        private Integer vpnId;
        private String vpnIdVariable;
        public Builder() {}
        public Builder(GetSystemSnmpFeatureTrapTargetServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.ipVariable = defaults.ipVariable;
    	      this.port = defaults.port;
    	      this.portVariable = defaults.portVariable;
    	      this.sourceInterface = defaults.sourceInterface;
    	      this.sourceInterfaceVariable = defaults.sourceInterfaceVariable;
    	      this.user = defaults.user;
    	      this.userLabel = defaults.userLabel;
    	      this.userVariable = defaults.userVariable;
    	      this.vpnId = defaults.vpnId;
    	      this.vpnIdVariable = defaults.vpnIdVariable;
        }

        @CustomType.Setter
        public Builder ip(String ip) {
            if (ip == null) {
              throw new MissingRequiredPropertyException("GetSystemSnmpFeatureTrapTargetServer", "ip");
            }
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder ipVariable(String ipVariable) {
            if (ipVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemSnmpFeatureTrapTargetServer", "ipVariable");
            }
            this.ipVariable = ipVariable;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetSystemSnmpFeatureTrapTargetServer", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder portVariable(String portVariable) {
            if (portVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemSnmpFeatureTrapTargetServer", "portVariable");
            }
            this.portVariable = portVariable;
            return this;
        }
        @CustomType.Setter
        public Builder sourceInterface(String sourceInterface) {
            if (sourceInterface == null) {
              throw new MissingRequiredPropertyException("GetSystemSnmpFeatureTrapTargetServer", "sourceInterface");
            }
            this.sourceInterface = sourceInterface;
            return this;
        }
        @CustomType.Setter
        public Builder sourceInterfaceVariable(String sourceInterfaceVariable) {
            if (sourceInterfaceVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemSnmpFeatureTrapTargetServer", "sourceInterfaceVariable");
            }
            this.sourceInterfaceVariable = sourceInterfaceVariable;
            return this;
        }
        @CustomType.Setter
        public Builder user(String user) {
            if (user == null) {
              throw new MissingRequiredPropertyException("GetSystemSnmpFeatureTrapTargetServer", "user");
            }
            this.user = user;
            return this;
        }
        @CustomType.Setter
        public Builder userLabel(String userLabel) {
            if (userLabel == null) {
              throw new MissingRequiredPropertyException("GetSystemSnmpFeatureTrapTargetServer", "userLabel");
            }
            this.userLabel = userLabel;
            return this;
        }
        @CustomType.Setter
        public Builder userVariable(String userVariable) {
            if (userVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemSnmpFeatureTrapTargetServer", "userVariable");
            }
            this.userVariable = userVariable;
            return this;
        }
        @CustomType.Setter
        public Builder vpnId(Integer vpnId) {
            if (vpnId == null) {
              throw new MissingRequiredPropertyException("GetSystemSnmpFeatureTrapTargetServer", "vpnId");
            }
            this.vpnId = vpnId;
            return this;
        }
        @CustomType.Setter
        public Builder vpnIdVariable(String vpnIdVariable) {
            if (vpnIdVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemSnmpFeatureTrapTargetServer", "vpnIdVariable");
            }
            this.vpnIdVariable = vpnIdVariable;
            return this;
        }
        public GetSystemSnmpFeatureTrapTargetServer build() {
            final var _resultValue = new GetSystemSnmpFeatureTrapTargetServer();
            _resultValue.ip = ip;
            _resultValue.ipVariable = ipVariable;
            _resultValue.port = port;
            _resultValue.portVariable = portVariable;
            _resultValue.sourceInterface = sourceInterface;
            _resultValue.sourceInterfaceVariable = sourceInterfaceVariable;
            _resultValue.user = user;
            _resultValue.userLabel = userLabel;
            _resultValue.userVariable = userVariable;
            _resultValue.vpnId = vpnId;
            _resultValue.vpnIdVariable = vpnIdVariable;
            return _resultValue;
        }
    }
}
