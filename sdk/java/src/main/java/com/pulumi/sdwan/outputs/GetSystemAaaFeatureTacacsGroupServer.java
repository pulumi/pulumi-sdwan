// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSystemAaaFeatureTacacsGroupServer {
    /**
     * @return Set IP address of TACACS server
     * 
     */
    private String address;
    /**
     * @return Set the TACACS server shared key
     * 
     */
    private String key;
    /**
     * @return Type of encyption. To be used for type 6
     * 
     */
    private String keyEnum;
    /**
     * @return TACACS Port
     * 
     */
    private Integer port;
    /**
     * @return Variable name
     * 
     */
    private String portVariable;
    /**
     * @return Set the TACACS server shared type 7 encrypted key
     * 
     */
    private String secretKey;
    /**
     * @return Variable name
     * 
     */
    private String secretKeyVariable;
    /**
     * @return Configure how long to wait for replies from the TACACS server
     * 
     */
    private Integer timeout;
    /**
     * @return Variable name
     * 
     */
    private String timeoutVariable;

    private GetSystemAaaFeatureTacacsGroupServer() {}
    /**
     * @return Set IP address of TACACS server
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return Set the TACACS server shared key
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
     * @return TACACS Port
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
     * @return Set the TACACS server shared type 7 encrypted key
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
     * @return Configure how long to wait for replies from the TACACS server
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

    public static Builder builder(GetSystemAaaFeatureTacacsGroupServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private String key;
        private String keyEnum;
        private Integer port;
        private String portVariable;
        private String secretKey;
        private String secretKeyVariable;
        private Integer timeout;
        private String timeoutVariable;
        public Builder() {}
        public Builder(GetSystemAaaFeatureTacacsGroupServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.key = defaults.key;
    	      this.keyEnum = defaults.keyEnum;
    	      this.port = defaults.port;
    	      this.portVariable = defaults.portVariable;
    	      this.secretKey = defaults.secretKey;
    	      this.secretKeyVariable = defaults.secretKeyVariable;
    	      this.timeout = defaults.timeout;
    	      this.timeoutVariable = defaults.timeoutVariable;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureTacacsGroupServer", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureTacacsGroupServer", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder keyEnum(String keyEnum) {
            if (keyEnum == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureTacacsGroupServer", "keyEnum");
            }
            this.keyEnum = keyEnum;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureTacacsGroupServer", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder portVariable(String portVariable) {
            if (portVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureTacacsGroupServer", "portVariable");
            }
            this.portVariable = portVariable;
            return this;
        }
        @CustomType.Setter
        public Builder secretKey(String secretKey) {
            if (secretKey == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureTacacsGroupServer", "secretKey");
            }
            this.secretKey = secretKey;
            return this;
        }
        @CustomType.Setter
        public Builder secretKeyVariable(String secretKeyVariable) {
            if (secretKeyVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureTacacsGroupServer", "secretKeyVariable");
            }
            this.secretKeyVariable = secretKeyVariable;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(Integer timeout) {
            if (timeout == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureTacacsGroupServer", "timeout");
            }
            this.timeout = timeout;
            return this;
        }
        @CustomType.Setter
        public Builder timeoutVariable(String timeoutVariable) {
            if (timeoutVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemAaaFeatureTacacsGroupServer", "timeoutVariable");
            }
            this.timeoutVariable = timeoutVariable;
            return this;
        }
        public GetSystemAaaFeatureTacacsGroupServer build() {
            final var _resultValue = new GetSystemAaaFeatureTacacsGroupServer();
            _resultValue.address = address;
            _resultValue.key = key;
            _resultValue.keyEnum = keyEnum;
            _resultValue.port = port;
            _resultValue.portVariable = portVariable;
            _resultValue.secretKey = secretKey;
            _resultValue.secretKeyVariable = secretKeyVariable;
            _resultValue.timeout = timeout;
            _resultValue.timeoutVariable = timeoutVariable;
            return _resultValue;
        }
    }
}