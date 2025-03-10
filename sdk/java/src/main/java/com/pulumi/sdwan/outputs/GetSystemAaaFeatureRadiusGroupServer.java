// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSystemAaaFeatureRadiusGroupServer {
    /**
     * @return Set Accounting port to use to connect to Radius server
     * 
     */
    private Integer acctPort;
    /**
     * @return Variable name
     * 
     */
    private String acctPortVariable;
    /**
     * @return Set IP address of Radius server
     * 
     */
    private String address;
    /**
     * @return Set Authentication port to use to connect to Radius server
     * 
     */
    private Integer authPort;
    /**
     * @return Variable name
     * 
     */
    private String authPortVariable;
    /**
     * @return Set the Radius server shared key
     * 
     */
    private String key;
    /**
     * @return Type of encyption. To be used for type 6
     * 
     */
    private String keyEnum;
    /**
     * @return key type
     * 
     */
    private String keyType;
    /**
     * @return Variable name
     * 
     */
    private String keyTypeVariable;
    /**
     * @return Configure how many times to contact this Radius server
     * 
     */
    private Integer retransmit;
    /**
     * @return Variable name
     * 
     */
    private String retransmitVariable;
    /**
     * @return Set the Radius server shared type 7 encrypted key
     * 
     */
    private String secretKey;
    /**
     * @return Variable name
     * 
     */
    private String secretKeyVariable;
    /**
     * @return Configure how long to wait for replies from the Radius server
     * 
     */
    private Integer timeout;
    /**
     * @return Variable name
     * 
     */
    private String timeoutVariable;

    private GetSystemAaaFeatureRadiusGroupServer() {}
    /**
     * @return Set Accounting port to use to connect to Radius server
     * 
     */
    public Integer acctPort() {
        return this.acctPort;
    }
    /**
     * @return Variable name
     * 
     */
    public String acctPortVariable() {
        return this.acctPortVariable;
    }
    /**
     * @return Set IP address of Radius server
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return Set Authentication port to use to connect to Radius server
     * 
     */
    public Integer authPort() {
        return this.authPort;
    }
    /**
     * @return Variable name
     * 
     */
    public String authPortVariable() {
        return this.authPortVariable;
    }
    /**
     * @return Set the Radius server shared key
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Type of encyption. To be used for type 6
     * 
     */
    public String keyEnum() {
        return this.keyEnum;
    }
    /**
     * @return key type
     * 
     */
    public String keyType() {
        return this.keyType;
    }
    /**
     * @return Variable name
     * 
     */
    public String keyTypeVariable() {
        return this.keyTypeVariable;
    }
    /**
     * @return Configure how many times to contact this Radius server
     * 
     */
    public Integer retransmit() {
        return this.retransmit;
    }
    /**
     * @return Variable name
     * 
     */
    public String retransmitVariable() {
        return this.retransmitVariable;
    }
    /**
     * @return Set the Radius server shared type 7 encrypted key
     * 
     */
    public String secretKey() {
        return this.secretKey;
    }
    /**
     * @return Variable name
     * 
     */
    public String secretKeyVariable() {
        return this.secretKeyVariable;
    }
    /**
     * @return Configure how long to wait for replies from the Radius server
     * 
     */
    public Integer timeout() {
        return this.timeout;
    }
    /**
     * @return Variable name
     * 
     */
    public String timeoutVariable() {
        return this.timeoutVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSystemAaaFeatureRadiusGroupServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer acctPort;
        private String acctPortVariable;
        private String address;
        private Integer authPort;
        private String authPortVariable;
        private String key;
        private String keyEnum;
        private String keyType;
        private String keyTypeVariable;
        private Integer retransmit;
        private String retransmitVariable;
        private String secretKey;
        private String secretKeyVariable;
        private Integer timeout;
        private String timeoutVariable;
        public Builder() {}
        public Builder(GetSystemAaaFeatureRadiusGroupServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acctPort = defaults.acctPort;
    	      this.acctPortVariable = defaults.acctPortVariable;
    	      this.address = defaults.address;
    	      this.authPort = defaults.authPort;
    	      this.authPortVariable = defaults.authPortVariable;
    	      this.key = defaults.key;
    	      this.keyEnum = defaults.keyEnum;
    	      this.keyType = defaults.keyType;
    	      this.keyTypeVariable = defaults.keyTypeVariable;
    	      this.retransmit = defaults.retransmit;
    	      this.retransmitVariable = defaults.retransmitVariable;
    	      this.secretKey = defaults.secretKey;
    	      this.secretKeyVariable = defaults.secretKeyVariable;
    	      this.timeout = defaults.timeout;
    	      this.timeoutVariable = defaults.timeoutVariable;
        }

        @CustomType.Setter
        public Builder acctPort(Integer acctPort) {
            if (acctPort == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureRadiusGroupServer", "acctPort");
            }
            this.acctPort = acctPort;
            return this;
        }
        @CustomType.Setter
        public Builder acctPortVariable(String acctPortVariable) {
            if (acctPortVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureRadiusGroupServer", "acctPortVariable");
            }
            this.acctPortVariable = acctPortVariable;
            return this;
        }
        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureRadiusGroupServer", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder authPort(Integer authPort) {
            if (authPort == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureRadiusGroupServer", "authPort");
            }
            this.authPort = authPort;
            return this;
        }
        @CustomType.Setter
        public Builder authPortVariable(String authPortVariable) {
            if (authPortVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureRadiusGroupServer", "authPortVariable");
            }
            this.authPortVariable = authPortVariable;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureRadiusGroupServer", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder keyEnum(String keyEnum) {
            if (keyEnum == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureRadiusGroupServer", "keyEnum");
            }
            this.keyEnum = keyEnum;
            return this;
        }
        @CustomType.Setter
        public Builder keyType(String keyType) {
            if (keyType == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureRadiusGroupServer", "keyType");
            }
            this.keyType = keyType;
            return this;
        }
        @CustomType.Setter
        public Builder keyTypeVariable(String keyTypeVariable) {
            if (keyTypeVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureRadiusGroupServer", "keyTypeVariable");
            }
            this.keyTypeVariable = keyTypeVariable;
            return this;
        }
        @CustomType.Setter
        public Builder retransmit(Integer retransmit) {
            if (retransmit == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureRadiusGroupServer", "retransmit");
            }
            this.retransmit = retransmit;
            return this;
        }
        @CustomType.Setter
        public Builder retransmitVariable(String retransmitVariable) {
            if (retransmitVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureRadiusGroupServer", "retransmitVariable");
            }
            this.retransmitVariable = retransmitVariable;
            return this;
        }
        @CustomType.Setter
        public Builder secretKey(String secretKey) {
            if (secretKey == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureRadiusGroupServer", "secretKey");
            }
            this.secretKey = secretKey;
            return this;
        }
        @CustomType.Setter
        public Builder secretKeyVariable(String secretKeyVariable) {
            if (secretKeyVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureRadiusGroupServer", "secretKeyVariable");
            }
            this.secretKeyVariable = secretKeyVariable;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(Integer timeout) {
            if (timeout == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureRadiusGroupServer", "timeout");
            }
            this.timeout = timeout;
            return this;
        }
        @CustomType.Setter
        public Builder timeoutVariable(String timeoutVariable) {
            if (timeoutVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureRadiusGroupServer", "timeoutVariable");
            }
            this.timeoutVariable = timeoutVariable;
            return this;
        }
        public GetSystemAaaFeatureRadiusGroupServer build() {
            final var _resultValue = new GetSystemAaaFeatureRadiusGroupServer();
            _resultValue.acctPort = acctPort;
            _resultValue.acctPortVariable = acctPortVariable;
            _resultValue.address = address;
            _resultValue.authPort = authPort;
            _resultValue.authPortVariable = authPortVariable;
            _resultValue.key = key;
            _resultValue.keyEnum = keyEnum;
            _resultValue.keyType = keyType;
            _resultValue.keyTypeVariable = keyTypeVariable;
            _resultValue.retransmit = retransmit;
            _resultValue.retransmitVariable = retransmitVariable;
            _resultValue.secretKey = secretKey;
            _resultValue.secretKeyVariable = secretKeyVariable;
            _resultValue.timeout = timeout;
            _resultValue.timeoutVariable = timeoutVariable;
            return _resultValue;
        }
    }
}
