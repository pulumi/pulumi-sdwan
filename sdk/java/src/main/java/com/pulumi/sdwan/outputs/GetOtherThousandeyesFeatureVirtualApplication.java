// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetOtherThousandeyesFeatureVirtualApplication {
    /**
     * @return Set the Account Group Token
     * 
     */
    private String accountGroupToken;
    /**
     * @return Variable name
     * 
     */
    private String accountGroupTokenVariable;
    /**
     * @return Set the Agent default gateway
     * 
     */
    private String agentDefaultGateway;
    /**
     * @return Variable name
     * 
     */
    private String agentDefaultGatewayVariable;
    /**
     * @return Set the host name
     * 
     */
    private String hostname;
    /**
     * @return Variable name
     * 
     */
    private String hostnameVariable;
    /**
     * @return Set the Agent IP Address
     * 
     */
    private String managementIp;
    /**
     * @return Variable name
     * 
     */
    private String managementIpVariable;
    /**
     * @return Set the Agent SubnetMask
     * 
     */
    private String managementSubnetMask;
    /**
     * @return Variable name
     * 
     */
    private String managementSubnetMaskVariable;
    /**
     * @return Set the name server
     * 
     */
    private String nameServerIp;
    /**
     * @return Variable name
     * 
     */
    private String nameServerIpVariable;
    /**
     * @return Set the proxy PAC url
     * 
     */
    private String pacUrl;
    /**
     * @return Variable name
     * 
     */
    private String pacUrlVariable;
    /**
     * @return Set the Proxy Host
     * 
     */
    private String proxyHost;
    /**
     * @return Variable name
     * 
     */
    private String proxyHostVariable;
    /**
     * @return Set the Proxy Port
     * 
     */
    private Integer proxyPort;
    /**
     * @return Variable name
     * 
     */
    private String proxyPortVariable;
    /**
     * @return Select Web Proxy Type
     * 
     */
    private String proxyType;
    /**
     * @return VPN number
     * 
     */
    private Integer vpn;
    /**
     * @return Variable name
     * 
     */
    private String vpnVariable;

    private GetOtherThousandeyesFeatureVirtualApplication() {}
    /**
     * @return Set the Account Group Token
     * 
     */
    public String accountGroupToken() {
        return this.accountGroupToken;
    }
    /**
     * @return Variable name
     * 
     */
    public String accountGroupTokenVariable() {
        return this.accountGroupTokenVariable;
    }
    /**
     * @return Set the Agent default gateway
     * 
     */
    public String agentDefaultGateway() {
        return this.agentDefaultGateway;
    }
    /**
     * @return Variable name
     * 
     */
    public String agentDefaultGatewayVariable() {
        return this.agentDefaultGatewayVariable;
    }
    /**
     * @return Set the host name
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return Variable name
     * 
     */
    public String hostnameVariable() {
        return this.hostnameVariable;
    }
    /**
     * @return Set the Agent IP Address
     * 
     */
    public String managementIp() {
        return this.managementIp;
    }
    /**
     * @return Variable name
     * 
     */
    public String managementIpVariable() {
        return this.managementIpVariable;
    }
    /**
     * @return Set the Agent SubnetMask
     * 
     */
    public String managementSubnetMask() {
        return this.managementSubnetMask;
    }
    /**
     * @return Variable name
     * 
     */
    public String managementSubnetMaskVariable() {
        return this.managementSubnetMaskVariable;
    }
    /**
     * @return Set the name server
     * 
     */
    public String nameServerIp() {
        return this.nameServerIp;
    }
    /**
     * @return Variable name
     * 
     */
    public String nameServerIpVariable() {
        return this.nameServerIpVariable;
    }
    /**
     * @return Set the proxy PAC url
     * 
     */
    public String pacUrl() {
        return this.pacUrl;
    }
    /**
     * @return Variable name
     * 
     */
    public String pacUrlVariable() {
        return this.pacUrlVariable;
    }
    /**
     * @return Set the Proxy Host
     * 
     */
    public String proxyHost() {
        return this.proxyHost;
    }
    /**
     * @return Variable name
     * 
     */
    public String proxyHostVariable() {
        return this.proxyHostVariable;
    }
    /**
     * @return Set the Proxy Port
     * 
     */
    public Integer proxyPort() {
        return this.proxyPort;
    }
    /**
     * @return Variable name
     * 
     */
    public String proxyPortVariable() {
        return this.proxyPortVariable;
    }
    /**
     * @return Select Web Proxy Type
     * 
     */
    public String proxyType() {
        return this.proxyType;
    }
    /**
     * @return VPN number
     * 
     */
    public Integer vpn() {
        return this.vpn;
    }
    /**
     * @return Variable name
     * 
     */
    public String vpnVariable() {
        return this.vpnVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOtherThousandeyesFeatureVirtualApplication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountGroupToken;
        private String accountGroupTokenVariable;
        private String agentDefaultGateway;
        private String agentDefaultGatewayVariable;
        private String hostname;
        private String hostnameVariable;
        private String managementIp;
        private String managementIpVariable;
        private String managementSubnetMask;
        private String managementSubnetMaskVariable;
        private String nameServerIp;
        private String nameServerIpVariable;
        private String pacUrl;
        private String pacUrlVariable;
        private String proxyHost;
        private String proxyHostVariable;
        private Integer proxyPort;
        private String proxyPortVariable;
        private String proxyType;
        private Integer vpn;
        private String vpnVariable;
        public Builder() {}
        public Builder(GetOtherThousandeyesFeatureVirtualApplication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountGroupToken = defaults.accountGroupToken;
    	      this.accountGroupTokenVariable = defaults.accountGroupTokenVariable;
    	      this.agentDefaultGateway = defaults.agentDefaultGateway;
    	      this.agentDefaultGatewayVariable = defaults.agentDefaultGatewayVariable;
    	      this.hostname = defaults.hostname;
    	      this.hostnameVariable = defaults.hostnameVariable;
    	      this.managementIp = defaults.managementIp;
    	      this.managementIpVariable = defaults.managementIpVariable;
    	      this.managementSubnetMask = defaults.managementSubnetMask;
    	      this.managementSubnetMaskVariable = defaults.managementSubnetMaskVariable;
    	      this.nameServerIp = defaults.nameServerIp;
    	      this.nameServerIpVariable = defaults.nameServerIpVariable;
    	      this.pacUrl = defaults.pacUrl;
    	      this.pacUrlVariable = defaults.pacUrlVariable;
    	      this.proxyHost = defaults.proxyHost;
    	      this.proxyHostVariable = defaults.proxyHostVariable;
    	      this.proxyPort = defaults.proxyPort;
    	      this.proxyPortVariable = defaults.proxyPortVariable;
    	      this.proxyType = defaults.proxyType;
    	      this.vpn = defaults.vpn;
    	      this.vpnVariable = defaults.vpnVariable;
        }

        @CustomType.Setter
        public Builder accountGroupToken(String accountGroupToken) {
            if (accountGroupToken == null) {
              throw new MissingRequiredPropertyException("GetOtherThousandeyesFeatureVirtualApplication", "accountGroupToken");
            }
            this.accountGroupToken = accountGroupToken;
            return this;
        }
        @CustomType.Setter
        public Builder accountGroupTokenVariable(String accountGroupTokenVariable) {
            if (accountGroupTokenVariable == null) {
              throw new MissingRequiredPropertyException("GetOtherThousandeyesFeatureVirtualApplication", "accountGroupTokenVariable");
            }
            this.accountGroupTokenVariable = accountGroupTokenVariable;
            return this;
        }
        @CustomType.Setter
        public Builder agentDefaultGateway(String agentDefaultGateway) {
            if (agentDefaultGateway == null) {
              throw new MissingRequiredPropertyException("GetOtherThousandeyesFeatureVirtualApplication", "agentDefaultGateway");
            }
            this.agentDefaultGateway = agentDefaultGateway;
            return this;
        }
        @CustomType.Setter
        public Builder agentDefaultGatewayVariable(String agentDefaultGatewayVariable) {
            if (agentDefaultGatewayVariable == null) {
              throw new MissingRequiredPropertyException("GetOtherThousandeyesFeatureVirtualApplication", "agentDefaultGatewayVariable");
            }
            this.agentDefaultGatewayVariable = agentDefaultGatewayVariable;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(String hostname) {
            if (hostname == null) {
              throw new MissingRequiredPropertyException("GetOtherThousandeyesFeatureVirtualApplication", "hostname");
            }
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder hostnameVariable(String hostnameVariable) {
            if (hostnameVariable == null) {
              throw new MissingRequiredPropertyException("GetOtherThousandeyesFeatureVirtualApplication", "hostnameVariable");
            }
            this.hostnameVariable = hostnameVariable;
            return this;
        }
        @CustomType.Setter
        public Builder managementIp(String managementIp) {
            if (managementIp == null) {
              throw new MissingRequiredPropertyException("GetOtherThousandeyesFeatureVirtualApplication", "managementIp");
            }
            this.managementIp = managementIp;
            return this;
        }
        @CustomType.Setter
        public Builder managementIpVariable(String managementIpVariable) {
            if (managementIpVariable == null) {
              throw new MissingRequiredPropertyException("GetOtherThousandeyesFeatureVirtualApplication", "managementIpVariable");
            }
            this.managementIpVariable = managementIpVariable;
            return this;
        }
        @CustomType.Setter
        public Builder managementSubnetMask(String managementSubnetMask) {
            if (managementSubnetMask == null) {
              throw new MissingRequiredPropertyException("GetOtherThousandeyesFeatureVirtualApplication", "managementSubnetMask");
            }
            this.managementSubnetMask = managementSubnetMask;
            return this;
        }
        @CustomType.Setter
        public Builder managementSubnetMaskVariable(String managementSubnetMaskVariable) {
            if (managementSubnetMaskVariable == null) {
              throw new MissingRequiredPropertyException("GetOtherThousandeyesFeatureVirtualApplication", "managementSubnetMaskVariable");
            }
            this.managementSubnetMaskVariable = managementSubnetMaskVariable;
            return this;
        }
        @CustomType.Setter
        public Builder nameServerIp(String nameServerIp) {
            if (nameServerIp == null) {
              throw new MissingRequiredPropertyException("GetOtherThousandeyesFeatureVirtualApplication", "nameServerIp");
            }
            this.nameServerIp = nameServerIp;
            return this;
        }
        @CustomType.Setter
        public Builder nameServerIpVariable(String nameServerIpVariable) {
            if (nameServerIpVariable == null) {
              throw new MissingRequiredPropertyException("GetOtherThousandeyesFeatureVirtualApplication", "nameServerIpVariable");
            }
            this.nameServerIpVariable = nameServerIpVariable;
            return this;
        }
        @CustomType.Setter
        public Builder pacUrl(String pacUrl) {
            if (pacUrl == null) {
              throw new MissingRequiredPropertyException("GetOtherThousandeyesFeatureVirtualApplication", "pacUrl");
            }
            this.pacUrl = pacUrl;
            return this;
        }
        @CustomType.Setter
        public Builder pacUrlVariable(String pacUrlVariable) {
            if (pacUrlVariable == null) {
              throw new MissingRequiredPropertyException("GetOtherThousandeyesFeatureVirtualApplication", "pacUrlVariable");
            }
            this.pacUrlVariable = pacUrlVariable;
            return this;
        }
        @CustomType.Setter
        public Builder proxyHost(String proxyHost) {
            if (proxyHost == null) {
              throw new MissingRequiredPropertyException("GetOtherThousandeyesFeatureVirtualApplication", "proxyHost");
            }
            this.proxyHost = proxyHost;
            return this;
        }
        @CustomType.Setter
        public Builder proxyHostVariable(String proxyHostVariable) {
            if (proxyHostVariable == null) {
              throw new MissingRequiredPropertyException("GetOtherThousandeyesFeatureVirtualApplication", "proxyHostVariable");
            }
            this.proxyHostVariable = proxyHostVariable;
            return this;
        }
        @CustomType.Setter
        public Builder proxyPort(Integer proxyPort) {
            if (proxyPort == null) {
              throw new MissingRequiredPropertyException("GetOtherThousandeyesFeatureVirtualApplication", "proxyPort");
            }
            this.proxyPort = proxyPort;
            return this;
        }
        @CustomType.Setter
        public Builder proxyPortVariable(String proxyPortVariable) {
            if (proxyPortVariable == null) {
              throw new MissingRequiredPropertyException("GetOtherThousandeyesFeatureVirtualApplication", "proxyPortVariable");
            }
            this.proxyPortVariable = proxyPortVariable;
            return this;
        }
        @CustomType.Setter
        public Builder proxyType(String proxyType) {
            if (proxyType == null) {
              throw new MissingRequiredPropertyException("GetOtherThousandeyesFeatureVirtualApplication", "proxyType");
            }
            this.proxyType = proxyType;
            return this;
        }
        @CustomType.Setter
        public Builder vpn(Integer vpn) {
            if (vpn == null) {
              throw new MissingRequiredPropertyException("GetOtherThousandeyesFeatureVirtualApplication", "vpn");
            }
            this.vpn = vpn;
            return this;
        }
        @CustomType.Setter
        public Builder vpnVariable(String vpnVariable) {
            if (vpnVariable == null) {
              throw new MissingRequiredPropertyException("GetOtherThousandeyesFeatureVirtualApplication", "vpnVariable");
            }
            this.vpnVariable = vpnVariable;
            return this;
        }
        public GetOtherThousandeyesFeatureVirtualApplication build() {
            final var _resultValue = new GetOtherThousandeyesFeatureVirtualApplication();
            _resultValue.accountGroupToken = accountGroupToken;
            _resultValue.accountGroupTokenVariable = accountGroupTokenVariable;
            _resultValue.agentDefaultGateway = agentDefaultGateway;
            _resultValue.agentDefaultGatewayVariable = agentDefaultGatewayVariable;
            _resultValue.hostname = hostname;
            _resultValue.hostnameVariable = hostnameVariable;
            _resultValue.managementIp = managementIp;
            _resultValue.managementIpVariable = managementIpVariable;
            _resultValue.managementSubnetMask = managementSubnetMask;
            _resultValue.managementSubnetMaskVariable = managementSubnetMaskVariable;
            _resultValue.nameServerIp = nameServerIp;
            _resultValue.nameServerIpVariable = nameServerIpVariable;
            _resultValue.pacUrl = pacUrl;
            _resultValue.pacUrlVariable = pacUrlVariable;
            _resultValue.proxyHost = proxyHost;
            _resultValue.proxyHostVariable = proxyHostVariable;
            _resultValue.proxyPort = proxyPort;
            _resultValue.proxyPortVariable = proxyPortVariable;
            _resultValue.proxyType = proxyType;
            _resultValue.vpn = vpn;
            _resultValue.vpnVariable = vpnVariable;
            return _resultValue;
        }
    }
}