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
public final class GetCiscoWirelessLanFeatureTemplateSsid {
    /**
     * @return Set admin state
     * 
     */
    private Boolean adminState;
    /**
     * @return Variable name
     * 
     */
    private String adminStateVariable;
    /**
     * @return Enable broadcast SSID
     * 
     */
    private Boolean broadcastSsid;
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private Boolean optional;
    /**
     * @return Set passphrase
     * 
     */
    private String passphrase;
    /**
     * @return Variable name
     * 
     */
    private String passphraseVariable;
    /**
     * @return Select QoS profile
     * 
     */
    private String qosProfile;
    /**
     * @return Variable name
     * 
     */
    private String qosProfileVariable;
    /**
     * @return Select radio type
     * 
     */
    private String radioType;
    /**
     * @return Variable name
     * 
     */
    private String radioTypeVariable;
    /**
     * @return Set RADIUS server IP
     * 
     */
    private String radiusServerIp;
    /**
     * @return Variable name
     * 
     */
    private String radiusServerIpVariable;
    /**
     * @return Set RADIUS server authentication port
     * 
     */
    private Integer radiusServerPort;
    /**
     * @return Variable name
     * 
     */
    private String radiusServerPortVariable;
    /**
     * @return Set RADIUS server shared secret
     * 
     */
    private String radiusServerSecret;
    /**
     * @return Variable name
     * 
     */
    private String radiusServerSecretVariable;
    /**
     * @return Select security type
     * 
     */
    private String securityType;
    /**
     * @return Variable name
     * 
     */
    private String securityTypeVariable;
    /**
     * @return Set VLAN ID
     * 
     */
    private Integer vlanId;
    /**
     * @return Variable name
     * 
     */
    private String vlanIdVariable;
    /**
     * @return Configure wlan SSID
     * 
     */
    private String wirelessNetworkName;

    private GetCiscoWirelessLanFeatureTemplateSsid() {}
    /**
     * @return Set admin state
     * 
     */
    public Boolean adminState() {
        return this.adminState;
    }
    /**
     * @return Variable name
     * 
     */
    public String adminStateVariable() {
        return this.adminStateVariable;
    }
    /**
     * @return Enable broadcast SSID
     * 
     */
    public Boolean broadcastSsid() {
        return this.broadcastSsid;
    }
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Boolean optional() {
        return this.optional;
    }
    /**
     * @return Set passphrase
     * 
     */
    public String passphrase() {
        return this.passphrase;
    }
    /**
     * @return Variable name
     * 
     */
    public String passphraseVariable() {
        return this.passphraseVariable;
    }
    /**
     * @return Select QoS profile
     * 
     */
    public String qosProfile() {
        return this.qosProfile;
    }
    /**
     * @return Variable name
     * 
     */
    public String qosProfileVariable() {
        return this.qosProfileVariable;
    }
    /**
     * @return Select radio type
     * 
     */
    public String radioType() {
        return this.radioType;
    }
    /**
     * @return Variable name
     * 
     */
    public String radioTypeVariable() {
        return this.radioTypeVariable;
    }
    /**
     * @return Set RADIUS server IP
     * 
     */
    public String radiusServerIp() {
        return this.radiusServerIp;
    }
    /**
     * @return Variable name
     * 
     */
    public String radiusServerIpVariable() {
        return this.radiusServerIpVariable;
    }
    /**
     * @return Set RADIUS server authentication port
     * 
     */
    public Integer radiusServerPort() {
        return this.radiusServerPort;
    }
    /**
     * @return Variable name
     * 
     */
    public String radiusServerPortVariable() {
        return this.radiusServerPortVariable;
    }
    /**
     * @return Set RADIUS server shared secret
     * 
     */
    public String radiusServerSecret() {
        return this.radiusServerSecret;
    }
    /**
     * @return Variable name
     * 
     */
    public String radiusServerSecretVariable() {
        return this.radiusServerSecretVariable;
    }
    /**
     * @return Select security type
     * 
     */
    public String securityType() {
        return this.securityType;
    }
    /**
     * @return Variable name
     * 
     */
    public String securityTypeVariable() {
        return this.securityTypeVariable;
    }
    /**
     * @return Set VLAN ID
     * 
     */
    public Integer vlanId() {
        return this.vlanId;
    }
    /**
     * @return Variable name
     * 
     */
    public String vlanIdVariable() {
        return this.vlanIdVariable;
    }
    /**
     * @return Configure wlan SSID
     * 
     */
    public String wirelessNetworkName() {
        return this.wirelessNetworkName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCiscoWirelessLanFeatureTemplateSsid defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean adminState;
        private String adminStateVariable;
        private Boolean broadcastSsid;
        private Boolean optional;
        private String passphrase;
        private String passphraseVariable;
        private String qosProfile;
        private String qosProfileVariable;
        private String radioType;
        private String radioTypeVariable;
        private String radiusServerIp;
        private String radiusServerIpVariable;
        private Integer radiusServerPort;
        private String radiusServerPortVariable;
        private String radiusServerSecret;
        private String radiusServerSecretVariable;
        private String securityType;
        private String securityTypeVariable;
        private Integer vlanId;
        private String vlanIdVariable;
        private String wirelessNetworkName;
        public Builder() {}
        public Builder(GetCiscoWirelessLanFeatureTemplateSsid defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminState = defaults.adminState;
    	      this.adminStateVariable = defaults.adminStateVariable;
    	      this.broadcastSsid = defaults.broadcastSsid;
    	      this.optional = defaults.optional;
    	      this.passphrase = defaults.passphrase;
    	      this.passphraseVariable = defaults.passphraseVariable;
    	      this.qosProfile = defaults.qosProfile;
    	      this.qosProfileVariable = defaults.qosProfileVariable;
    	      this.radioType = defaults.radioType;
    	      this.radioTypeVariable = defaults.radioTypeVariable;
    	      this.radiusServerIp = defaults.radiusServerIp;
    	      this.radiusServerIpVariable = defaults.radiusServerIpVariable;
    	      this.radiusServerPort = defaults.radiusServerPort;
    	      this.radiusServerPortVariable = defaults.radiusServerPortVariable;
    	      this.radiusServerSecret = defaults.radiusServerSecret;
    	      this.radiusServerSecretVariable = defaults.radiusServerSecretVariable;
    	      this.securityType = defaults.securityType;
    	      this.securityTypeVariable = defaults.securityTypeVariable;
    	      this.vlanId = defaults.vlanId;
    	      this.vlanIdVariable = defaults.vlanIdVariable;
    	      this.wirelessNetworkName = defaults.wirelessNetworkName;
        }

        @CustomType.Setter
        public Builder adminState(Boolean adminState) {
            if (adminState == null) {
              throw new MissingRequiredPropertyException("GetCiscoWirelessLanFeatureTemplateSsid", "adminState");
            }
            this.adminState = adminState;
            return this;
        }
        @CustomType.Setter
        public Builder adminStateVariable(String adminStateVariable) {
            if (adminStateVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoWirelessLanFeatureTemplateSsid", "adminStateVariable");
            }
            this.adminStateVariable = adminStateVariable;
            return this;
        }
        @CustomType.Setter
        public Builder broadcastSsid(Boolean broadcastSsid) {
            if (broadcastSsid == null) {
              throw new MissingRequiredPropertyException("GetCiscoWirelessLanFeatureTemplateSsid", "broadcastSsid");
            }
            this.broadcastSsid = broadcastSsid;
            return this;
        }
        @CustomType.Setter
        public Builder optional(Boolean optional) {
            if (optional == null) {
              throw new MissingRequiredPropertyException("GetCiscoWirelessLanFeatureTemplateSsid", "optional");
            }
            this.optional = optional;
            return this;
        }
        @CustomType.Setter
        public Builder passphrase(String passphrase) {
            if (passphrase == null) {
              throw new MissingRequiredPropertyException("GetCiscoWirelessLanFeatureTemplateSsid", "passphrase");
            }
            this.passphrase = passphrase;
            return this;
        }
        @CustomType.Setter
        public Builder passphraseVariable(String passphraseVariable) {
            if (passphraseVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoWirelessLanFeatureTemplateSsid", "passphraseVariable");
            }
            this.passphraseVariable = passphraseVariable;
            return this;
        }
        @CustomType.Setter
        public Builder qosProfile(String qosProfile) {
            if (qosProfile == null) {
              throw new MissingRequiredPropertyException("GetCiscoWirelessLanFeatureTemplateSsid", "qosProfile");
            }
            this.qosProfile = qosProfile;
            return this;
        }
        @CustomType.Setter
        public Builder qosProfileVariable(String qosProfileVariable) {
            if (qosProfileVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoWirelessLanFeatureTemplateSsid", "qosProfileVariable");
            }
            this.qosProfileVariable = qosProfileVariable;
            return this;
        }
        @CustomType.Setter
        public Builder radioType(String radioType) {
            if (radioType == null) {
              throw new MissingRequiredPropertyException("GetCiscoWirelessLanFeatureTemplateSsid", "radioType");
            }
            this.radioType = radioType;
            return this;
        }
        @CustomType.Setter
        public Builder radioTypeVariable(String radioTypeVariable) {
            if (radioTypeVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoWirelessLanFeatureTemplateSsid", "radioTypeVariable");
            }
            this.radioTypeVariable = radioTypeVariable;
            return this;
        }
        @CustomType.Setter
        public Builder radiusServerIp(String radiusServerIp) {
            if (radiusServerIp == null) {
              throw new MissingRequiredPropertyException("GetCiscoWirelessLanFeatureTemplateSsid", "radiusServerIp");
            }
            this.radiusServerIp = radiusServerIp;
            return this;
        }
        @CustomType.Setter
        public Builder radiusServerIpVariable(String radiusServerIpVariable) {
            if (radiusServerIpVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoWirelessLanFeatureTemplateSsid", "radiusServerIpVariable");
            }
            this.radiusServerIpVariable = radiusServerIpVariable;
            return this;
        }
        @CustomType.Setter
        public Builder radiusServerPort(Integer radiusServerPort) {
            if (radiusServerPort == null) {
              throw new MissingRequiredPropertyException("GetCiscoWirelessLanFeatureTemplateSsid", "radiusServerPort");
            }
            this.radiusServerPort = radiusServerPort;
            return this;
        }
        @CustomType.Setter
        public Builder radiusServerPortVariable(String radiusServerPortVariable) {
            if (radiusServerPortVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoWirelessLanFeatureTemplateSsid", "radiusServerPortVariable");
            }
            this.radiusServerPortVariable = radiusServerPortVariable;
            return this;
        }
        @CustomType.Setter
        public Builder radiusServerSecret(String radiusServerSecret) {
            if (radiusServerSecret == null) {
              throw new MissingRequiredPropertyException("GetCiscoWirelessLanFeatureTemplateSsid", "radiusServerSecret");
            }
            this.radiusServerSecret = radiusServerSecret;
            return this;
        }
        @CustomType.Setter
        public Builder radiusServerSecretVariable(String radiusServerSecretVariable) {
            if (radiusServerSecretVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoWirelessLanFeatureTemplateSsid", "radiusServerSecretVariable");
            }
            this.radiusServerSecretVariable = radiusServerSecretVariable;
            return this;
        }
        @CustomType.Setter
        public Builder securityType(String securityType) {
            if (securityType == null) {
              throw new MissingRequiredPropertyException("GetCiscoWirelessLanFeatureTemplateSsid", "securityType");
            }
            this.securityType = securityType;
            return this;
        }
        @CustomType.Setter
        public Builder securityTypeVariable(String securityTypeVariable) {
            if (securityTypeVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoWirelessLanFeatureTemplateSsid", "securityTypeVariable");
            }
            this.securityTypeVariable = securityTypeVariable;
            return this;
        }
        @CustomType.Setter
        public Builder vlanId(Integer vlanId) {
            if (vlanId == null) {
              throw new MissingRequiredPropertyException("GetCiscoWirelessLanFeatureTemplateSsid", "vlanId");
            }
            this.vlanId = vlanId;
            return this;
        }
        @CustomType.Setter
        public Builder vlanIdVariable(String vlanIdVariable) {
            if (vlanIdVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoWirelessLanFeatureTemplateSsid", "vlanIdVariable");
            }
            this.vlanIdVariable = vlanIdVariable;
            return this;
        }
        @CustomType.Setter
        public Builder wirelessNetworkName(String wirelessNetworkName) {
            if (wirelessNetworkName == null) {
              throw new MissingRequiredPropertyException("GetCiscoWirelessLanFeatureTemplateSsid", "wirelessNetworkName");
            }
            this.wirelessNetworkName = wirelessNetworkName;
            return this;
        }
        public GetCiscoWirelessLanFeatureTemplateSsid build() {
            final var _resultValue = new GetCiscoWirelessLanFeatureTemplateSsid();
            _resultValue.adminState = adminState;
            _resultValue.adminStateVariable = adminStateVariable;
            _resultValue.broadcastSsid = broadcastSsid;
            _resultValue.optional = optional;
            _resultValue.passphrase = passphrase;
            _resultValue.passphraseVariable = passphraseVariable;
            _resultValue.qosProfile = qosProfile;
            _resultValue.qosProfileVariable = qosProfileVariable;
            _resultValue.radioType = radioType;
            _resultValue.radioTypeVariable = radioTypeVariable;
            _resultValue.radiusServerIp = radiusServerIp;
            _resultValue.radiusServerIpVariable = radiusServerIpVariable;
            _resultValue.radiusServerPort = radiusServerPort;
            _resultValue.radiusServerPortVariable = radiusServerPortVariable;
            _resultValue.radiusServerSecret = radiusServerSecret;
            _resultValue.radiusServerSecretVariable = radiusServerSecretVariable;
            _resultValue.securityType = securityType;
            _resultValue.securityTypeVariable = securityTypeVariable;
            _resultValue.vlanId = vlanId;
            _resultValue.vlanIdVariable = vlanIdVariable;
            _resultValue.wirelessNetworkName = wirelessNetworkName;
            return _resultValue;
        }
    }
}
