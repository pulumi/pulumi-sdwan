// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.outputs.GetSystemNtpFeatureAuthenticationKey;
import com.pulumi.sdwan.outputs.GetSystemNtpFeatureServer;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSystemNtpFeatureResult {
    /**
     * @return Set MD5 authentication key
     * 
     */
    private List<GetSystemNtpFeatureAuthenticationKey> authenticationKeys;
    /**
     * @return Enable device as NTP Leader
     * 
     */
    private Boolean authoritativeNtpServer;
    /**
     * @return Variable name
     * 
     */
    private String authoritativeNtpServerVariable;
    /**
     * @return The description of the Feature
     * 
     */
    private String description;
    /**
     * @return Feature Profile ID
     * 
     */
    private String featureProfileId;
    /**
     * @return The id of the Feature
     * 
     */
    private String id;
    /**
     * @return The name of the Feature
     * 
     */
    private String name;
    /**
     * @return Configure NTP servers
     * 
     */
    private List<GetSystemNtpFeatureServer> servers;
    /**
     * @return Enable device as NTP Leader
     * 
     */
    private String sourceInterface;
    /**
     * @return Variable name
     * 
     */
    private String sourceInterfaceVariable;
    /**
     * @return Enable device as NTP Leader
     * 
     */
    private Integer stratum;
    /**
     * @return Variable name
     * 
     */
    private String stratumVariable;
    /**
     * @return Designate authentication key as trustworthy
     * 
     */
    private List<Integer> trustedKeys;
    /**
     * @return Variable name
     * 
     */
    private String trustedKeysVariable;
    /**
     * @return The version of the Feature
     * 
     */
    private Integer version;

    private GetSystemNtpFeatureResult() {}
    /**
     * @return Set MD5 authentication key
     * 
     */
    public List<GetSystemNtpFeatureAuthenticationKey> authenticationKeys() {
        return this.authenticationKeys;
    }
    /**
     * @return Enable device as NTP Leader
     * 
     */
    public Boolean authoritativeNtpServer() {
        return this.authoritativeNtpServer;
    }
    /**
     * @return Variable name
     * 
     */
    public String authoritativeNtpServerVariable() {
        return this.authoritativeNtpServerVariable;
    }
    /**
     * @return The description of the Feature
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Feature Profile ID
     * 
     */
    public String featureProfileId() {
        return this.featureProfileId;
    }
    /**
     * @return The id of the Feature
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the Feature
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Configure NTP servers
     * 
     */
    public List<GetSystemNtpFeatureServer> servers() {
        return this.servers;
    }
    /**
     * @return Enable device as NTP Leader
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
     * @return Enable device as NTP Leader
     * 
     */
    public Integer stratum() {
        return this.stratum;
    }
    /**
     * @return Variable name
     * 
     */
    public String stratumVariable() {
        return this.stratumVariable;
    }
    /**
     * @return Designate authentication key as trustworthy
     * 
     */
    public List<Integer> trustedKeys() {
        return this.trustedKeys;
    }
    /**
     * @return Variable name
     * 
     */
    public String trustedKeysVariable() {
        return this.trustedKeysVariable;
    }
    /**
     * @return The version of the Feature
     * 
     */
    public Integer version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSystemNtpFeatureResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetSystemNtpFeatureAuthenticationKey> authenticationKeys;
        private Boolean authoritativeNtpServer;
        private String authoritativeNtpServerVariable;
        private String description;
        private String featureProfileId;
        private String id;
        private String name;
        private List<GetSystemNtpFeatureServer> servers;
        private String sourceInterface;
        private String sourceInterfaceVariable;
        private Integer stratum;
        private String stratumVariable;
        private List<Integer> trustedKeys;
        private String trustedKeysVariable;
        private Integer version;
        public Builder() {}
        public Builder(GetSystemNtpFeatureResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationKeys = defaults.authenticationKeys;
    	      this.authoritativeNtpServer = defaults.authoritativeNtpServer;
    	      this.authoritativeNtpServerVariable = defaults.authoritativeNtpServerVariable;
    	      this.description = defaults.description;
    	      this.featureProfileId = defaults.featureProfileId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.servers = defaults.servers;
    	      this.sourceInterface = defaults.sourceInterface;
    	      this.sourceInterfaceVariable = defaults.sourceInterfaceVariable;
    	      this.stratum = defaults.stratum;
    	      this.stratumVariable = defaults.stratumVariable;
    	      this.trustedKeys = defaults.trustedKeys;
    	      this.trustedKeysVariable = defaults.trustedKeysVariable;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder authenticationKeys(List<GetSystemNtpFeatureAuthenticationKey> authenticationKeys) {
            if (authenticationKeys == null) {
              throw new MissingRequiredPropertyException("GetSystemNtpFeatureResult", "authenticationKeys");
            }
            this.authenticationKeys = authenticationKeys;
            return this;
        }
        public Builder authenticationKeys(GetSystemNtpFeatureAuthenticationKey... authenticationKeys) {
            return authenticationKeys(List.of(authenticationKeys));
        }
        @CustomType.Setter
        public Builder authoritativeNtpServer(Boolean authoritativeNtpServer) {
            if (authoritativeNtpServer == null) {
              throw new MissingRequiredPropertyException("GetSystemNtpFeatureResult", "authoritativeNtpServer");
            }
            this.authoritativeNtpServer = authoritativeNtpServer;
            return this;
        }
        @CustomType.Setter
        public Builder authoritativeNtpServerVariable(String authoritativeNtpServerVariable) {
            if (authoritativeNtpServerVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemNtpFeatureResult", "authoritativeNtpServerVariable");
            }
            this.authoritativeNtpServerVariable = authoritativeNtpServerVariable;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetSystemNtpFeatureResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder featureProfileId(String featureProfileId) {
            if (featureProfileId == null) {
              throw new MissingRequiredPropertyException("GetSystemNtpFeatureResult", "featureProfileId");
            }
            this.featureProfileId = featureProfileId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSystemNtpFeatureResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSystemNtpFeatureResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder servers(List<GetSystemNtpFeatureServer> servers) {
            if (servers == null) {
              throw new MissingRequiredPropertyException("GetSystemNtpFeatureResult", "servers");
            }
            this.servers = servers;
            return this;
        }
        public Builder servers(GetSystemNtpFeatureServer... servers) {
            return servers(List.of(servers));
        }
        @CustomType.Setter
        public Builder sourceInterface(String sourceInterface) {
            if (sourceInterface == null) {
              throw new MissingRequiredPropertyException("GetSystemNtpFeatureResult", "sourceInterface");
            }
            this.sourceInterface = sourceInterface;
            return this;
        }
        @CustomType.Setter
        public Builder sourceInterfaceVariable(String sourceInterfaceVariable) {
            if (sourceInterfaceVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemNtpFeatureResult", "sourceInterfaceVariable");
            }
            this.sourceInterfaceVariable = sourceInterfaceVariable;
            return this;
        }
        @CustomType.Setter
        public Builder stratum(Integer stratum) {
            if (stratum == null) {
              throw new MissingRequiredPropertyException("GetSystemNtpFeatureResult", "stratum");
            }
            this.stratum = stratum;
            return this;
        }
        @CustomType.Setter
        public Builder stratumVariable(String stratumVariable) {
            if (stratumVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemNtpFeatureResult", "stratumVariable");
            }
            this.stratumVariable = stratumVariable;
            return this;
        }
        @CustomType.Setter
        public Builder trustedKeys(List<Integer> trustedKeys) {
            if (trustedKeys == null) {
              throw new MissingRequiredPropertyException("GetSystemNtpFeatureResult", "trustedKeys");
            }
            this.trustedKeys = trustedKeys;
            return this;
        }
        public Builder trustedKeys(Integer... trustedKeys) {
            return trustedKeys(List.of(trustedKeys));
        }
        @CustomType.Setter
        public Builder trustedKeysVariable(String trustedKeysVariable) {
            if (trustedKeysVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemNtpFeatureResult", "trustedKeysVariable");
            }
            this.trustedKeysVariable = trustedKeysVariable;
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetSystemNtpFeatureResult", "version");
            }
            this.version = version;
            return this;
        }
        public GetSystemNtpFeatureResult build() {
            final var _resultValue = new GetSystemNtpFeatureResult();
            _resultValue.authenticationKeys = authenticationKeys;
            _resultValue.authoritativeNtpServer = authoritativeNtpServer;
            _resultValue.authoritativeNtpServerVariable = authoritativeNtpServerVariable;
            _resultValue.description = description;
            _resultValue.featureProfileId = featureProfileId;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.servers = servers;
            _resultValue.sourceInterface = sourceInterface;
            _resultValue.sourceInterfaceVariable = sourceInterfaceVariable;
            _resultValue.stratum = stratum;
            _resultValue.stratumVariable = stratumVariable;
            _resultValue.trustedKeys = trustedKeys;
            _resultValue.trustedKeysVariable = trustedKeysVariable;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}