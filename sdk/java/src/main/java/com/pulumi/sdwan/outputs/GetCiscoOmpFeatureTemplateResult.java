// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.outputs.GetCiscoOmpFeatureTemplateAdvertiseIpv4Route;
import com.pulumi.sdwan.outputs.GetCiscoOmpFeatureTemplateAdvertiseIpv6Route;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCiscoOmpFeatureTemplateResult {
    /**
     * @return Advertise locally learned routes to OMP
     * 
     */
    private List<GetCiscoOmpFeatureTemplateAdvertiseIpv4Route> advertiseIpv4Routes;
    /**
     * @return Advertise locally learned routes to OMP
     * 
     */
    private List<GetCiscoOmpFeatureTemplateAdvertiseIpv6Route> advertiseIpv6Routes;
    /**
     * @return Set the time between OMP Update packets
     * 
     */
    private Integer advertisementInterval;
    /**
     * @return Variable name
     * 
     */
    private String advertisementIntervalVariable;
    /**
     * @return The description of the feature template
     * 
     */
    private String description;
    /**
     * @return List of supported device types
     * 
     */
    private List<String> deviceTypes;
    /**
     * @return Set maximum number of OMP paths to install in vEdge route table
     * 
     */
    private Integer ecmpLimit;
    /**
     * @return Variable name
     * 
     */
    private String ecmpLimitVariable;
    /**
     * @return End of RIB timer \n\n seconds
     * 
     */
    private Integer eorTimer;
    /**
     * @return Variable name
     * 
     */
    private String eorTimerVariable;
    /**
     * @return Enable or disable OMP graceful restart
     * 
     */
    private Boolean gracefulRestart;
    /**
     * @return Set the OMP graceful restart timer
     * 
     */
    private Integer gracefulRestartTimer;
    /**
     * @return Variable name
     * 
     */
    private String gracefulRestartTimerVariable;
    /**
     * @return Variable name
     * 
     */
    private String gracefulRestartVariable;
    /**
     * @return Set how long to wait before closing OMP peer connection
     * 
     */
    private Integer holdtime;
    /**
     * @return Variable name
     * 
     */
    private String holdtimeVariable;
    /**
     * @return The id of the feature template
     * 
     */
    private String id;
    /**
     * @return Ignore Region-Path Length During Best-Path Algorithm
     * 
     */
    private Boolean ignoreRegionPathLength;
    /**
     * @return Variable name
     * 
     */
    private String ignoreRegionPathLengthVariable;
    /**
     * @return The name of the feature template
     * 
     */
    private String name;
    /**
     * @return omp-admin-distance-ipv4
     * 
     */
    private Integer ompAdminDistanceIpv4;
    /**
     * @return Variable name
     * 
     */
    private String ompAdminDistanceIpv4Variable;
    /**
     * @return omp-admin-distance-ipv6
     * 
     */
    private Integer ompAdminDistanceIpv6;
    /**
     * @return Variable name
     * 
     */
    private String ompAdminDistanceIpv6Variable;
    /**
     * @return Set Overlay AS number \n\n or \n\n
     * 
     */
    private Integer overlayAs;
    /**
     * @return Variable name
     * 
     */
    private String overlayAsVariable;
    /**
     * @return Set number of TLOC routes advertised between vSmart and vEdge
     * 
     */
    private Integer sendPathLimit;
    /**
     * @return Variable name
     * 
     */
    private String sendPathLimitVariable;
    /**
     * @return Enable or disable OMP
     * 
     */
    private Boolean shutdown;
    /**
     * @return Variable name
     * 
     */
    private String shutdownVariable;
    /**
     * @return The template type
     * 
     */
    private String templateType;
    /**
     * @return Transport gateway path computation
     * 
     */
    private String transportGateway;
    /**
     * @return Variable name
     * 
     */
    private String transportGatewayVariable;
    /**
     * @return The version of the feature template
     * 
     */
    private Integer version;

    private GetCiscoOmpFeatureTemplateResult() {}
    /**
     * @return Advertise locally learned routes to OMP
     * 
     */
    public List<GetCiscoOmpFeatureTemplateAdvertiseIpv4Route> advertiseIpv4Routes() {
        return this.advertiseIpv4Routes;
    }
    /**
     * @return Advertise locally learned routes to OMP
     * 
     */
    public List<GetCiscoOmpFeatureTemplateAdvertiseIpv6Route> advertiseIpv6Routes() {
        return this.advertiseIpv6Routes;
    }
    /**
     * @return Set the time between OMP Update packets
     * 
     */
    public Integer advertisementInterval() {
        return this.advertisementInterval;
    }
    /**
     * @return Variable name
     * 
     */
    public String advertisementIntervalVariable() {
        return this.advertisementIntervalVariable;
    }
    /**
     * @return The description of the feature template
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return List of supported device types
     * 
     */
    public List<String> deviceTypes() {
        return this.deviceTypes;
    }
    /**
     * @return Set maximum number of OMP paths to install in vEdge route table
     * 
     */
    public Integer ecmpLimit() {
        return this.ecmpLimit;
    }
    /**
     * @return Variable name
     * 
     */
    public String ecmpLimitVariable() {
        return this.ecmpLimitVariable;
    }
    /**
     * @return End of RIB timer \n\n seconds
     * 
     */
    public Integer eorTimer() {
        return this.eorTimer;
    }
    /**
     * @return Variable name
     * 
     */
    public String eorTimerVariable() {
        return this.eorTimerVariable;
    }
    /**
     * @return Enable or disable OMP graceful restart
     * 
     */
    public Boolean gracefulRestart() {
        return this.gracefulRestart;
    }
    /**
     * @return Set the OMP graceful restart timer
     * 
     */
    public Integer gracefulRestartTimer() {
        return this.gracefulRestartTimer;
    }
    /**
     * @return Variable name
     * 
     */
    public String gracefulRestartTimerVariable() {
        return this.gracefulRestartTimerVariable;
    }
    /**
     * @return Variable name
     * 
     */
    public String gracefulRestartVariable() {
        return this.gracefulRestartVariable;
    }
    /**
     * @return Set how long to wait before closing OMP peer connection
     * 
     */
    public Integer holdtime() {
        return this.holdtime;
    }
    /**
     * @return Variable name
     * 
     */
    public String holdtimeVariable() {
        return this.holdtimeVariable;
    }
    /**
     * @return The id of the feature template
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Ignore Region-Path Length During Best-Path Algorithm
     * 
     */
    public Boolean ignoreRegionPathLength() {
        return this.ignoreRegionPathLength;
    }
    /**
     * @return Variable name
     * 
     */
    public String ignoreRegionPathLengthVariable() {
        return this.ignoreRegionPathLengthVariable;
    }
    /**
     * @return The name of the feature template
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return omp-admin-distance-ipv4
     * 
     */
    public Integer ompAdminDistanceIpv4() {
        return this.ompAdminDistanceIpv4;
    }
    /**
     * @return Variable name
     * 
     */
    public String ompAdminDistanceIpv4Variable() {
        return this.ompAdminDistanceIpv4Variable;
    }
    /**
     * @return omp-admin-distance-ipv6
     * 
     */
    public Integer ompAdminDistanceIpv6() {
        return this.ompAdminDistanceIpv6;
    }
    /**
     * @return Variable name
     * 
     */
    public String ompAdminDistanceIpv6Variable() {
        return this.ompAdminDistanceIpv6Variable;
    }
    /**
     * @return Set Overlay AS number \n\n or \n\n
     * 
     */
    public Integer overlayAs() {
        return this.overlayAs;
    }
    /**
     * @return Variable name
     * 
     */
    public String overlayAsVariable() {
        return this.overlayAsVariable;
    }
    /**
     * @return Set number of TLOC routes advertised between vSmart and vEdge
     * 
     */
    public Integer sendPathLimit() {
        return this.sendPathLimit;
    }
    /**
     * @return Variable name
     * 
     */
    public String sendPathLimitVariable() {
        return this.sendPathLimitVariable;
    }
    /**
     * @return Enable or disable OMP
     * 
     */
    public Boolean shutdown() {
        return this.shutdown;
    }
    /**
     * @return Variable name
     * 
     */
    public String shutdownVariable() {
        return this.shutdownVariable;
    }
    /**
     * @return The template type
     * 
     */
    public String templateType() {
        return this.templateType;
    }
    /**
     * @return Transport gateway path computation
     * 
     */
    public String transportGateway() {
        return this.transportGateway;
    }
    /**
     * @return Variable name
     * 
     */
    public String transportGatewayVariable() {
        return this.transportGatewayVariable;
    }
    /**
     * @return The version of the feature template
     * 
     */
    public Integer version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCiscoOmpFeatureTemplateResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetCiscoOmpFeatureTemplateAdvertiseIpv4Route> advertiseIpv4Routes;
        private List<GetCiscoOmpFeatureTemplateAdvertiseIpv6Route> advertiseIpv6Routes;
        private Integer advertisementInterval;
        private String advertisementIntervalVariable;
        private String description;
        private List<String> deviceTypes;
        private Integer ecmpLimit;
        private String ecmpLimitVariable;
        private Integer eorTimer;
        private String eorTimerVariable;
        private Boolean gracefulRestart;
        private Integer gracefulRestartTimer;
        private String gracefulRestartTimerVariable;
        private String gracefulRestartVariable;
        private Integer holdtime;
        private String holdtimeVariable;
        private String id;
        private Boolean ignoreRegionPathLength;
        private String ignoreRegionPathLengthVariable;
        private String name;
        private Integer ompAdminDistanceIpv4;
        private String ompAdminDistanceIpv4Variable;
        private Integer ompAdminDistanceIpv6;
        private String ompAdminDistanceIpv6Variable;
        private Integer overlayAs;
        private String overlayAsVariable;
        private Integer sendPathLimit;
        private String sendPathLimitVariable;
        private Boolean shutdown;
        private String shutdownVariable;
        private String templateType;
        private String transportGateway;
        private String transportGatewayVariable;
        private Integer version;
        public Builder() {}
        public Builder(GetCiscoOmpFeatureTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertiseIpv4Routes = defaults.advertiseIpv4Routes;
    	      this.advertiseIpv6Routes = defaults.advertiseIpv6Routes;
    	      this.advertisementInterval = defaults.advertisementInterval;
    	      this.advertisementIntervalVariable = defaults.advertisementIntervalVariable;
    	      this.description = defaults.description;
    	      this.deviceTypes = defaults.deviceTypes;
    	      this.ecmpLimit = defaults.ecmpLimit;
    	      this.ecmpLimitVariable = defaults.ecmpLimitVariable;
    	      this.eorTimer = defaults.eorTimer;
    	      this.eorTimerVariable = defaults.eorTimerVariable;
    	      this.gracefulRestart = defaults.gracefulRestart;
    	      this.gracefulRestartTimer = defaults.gracefulRestartTimer;
    	      this.gracefulRestartTimerVariable = defaults.gracefulRestartTimerVariable;
    	      this.gracefulRestartVariable = defaults.gracefulRestartVariable;
    	      this.holdtime = defaults.holdtime;
    	      this.holdtimeVariable = defaults.holdtimeVariable;
    	      this.id = defaults.id;
    	      this.ignoreRegionPathLength = defaults.ignoreRegionPathLength;
    	      this.ignoreRegionPathLengthVariable = defaults.ignoreRegionPathLengthVariable;
    	      this.name = defaults.name;
    	      this.ompAdminDistanceIpv4 = defaults.ompAdminDistanceIpv4;
    	      this.ompAdminDistanceIpv4Variable = defaults.ompAdminDistanceIpv4Variable;
    	      this.ompAdminDistanceIpv6 = defaults.ompAdminDistanceIpv6;
    	      this.ompAdminDistanceIpv6Variable = defaults.ompAdminDistanceIpv6Variable;
    	      this.overlayAs = defaults.overlayAs;
    	      this.overlayAsVariable = defaults.overlayAsVariable;
    	      this.sendPathLimit = defaults.sendPathLimit;
    	      this.sendPathLimitVariable = defaults.sendPathLimitVariable;
    	      this.shutdown = defaults.shutdown;
    	      this.shutdownVariable = defaults.shutdownVariable;
    	      this.templateType = defaults.templateType;
    	      this.transportGateway = defaults.transportGateway;
    	      this.transportGatewayVariable = defaults.transportGatewayVariable;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder advertiseIpv4Routes(List<GetCiscoOmpFeatureTemplateAdvertiseIpv4Route> advertiseIpv4Routes) {
            if (advertiseIpv4Routes == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "advertiseIpv4Routes");
            }
            this.advertiseIpv4Routes = advertiseIpv4Routes;
            return this;
        }
        public Builder advertiseIpv4Routes(GetCiscoOmpFeatureTemplateAdvertiseIpv4Route... advertiseIpv4Routes) {
            return advertiseIpv4Routes(List.of(advertiseIpv4Routes));
        }
        @CustomType.Setter
        public Builder advertiseIpv6Routes(List<GetCiscoOmpFeatureTemplateAdvertiseIpv6Route> advertiseIpv6Routes) {
            if (advertiseIpv6Routes == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "advertiseIpv6Routes");
            }
            this.advertiseIpv6Routes = advertiseIpv6Routes;
            return this;
        }
        public Builder advertiseIpv6Routes(GetCiscoOmpFeatureTemplateAdvertiseIpv6Route... advertiseIpv6Routes) {
            return advertiseIpv6Routes(List.of(advertiseIpv6Routes));
        }
        @CustomType.Setter
        public Builder advertisementInterval(Integer advertisementInterval) {
            if (advertisementInterval == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "advertisementInterval");
            }
            this.advertisementInterval = advertisementInterval;
            return this;
        }
        @CustomType.Setter
        public Builder advertisementIntervalVariable(String advertisementIntervalVariable) {
            if (advertisementIntervalVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "advertisementIntervalVariable");
            }
            this.advertisementIntervalVariable = advertisementIntervalVariable;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder deviceTypes(List<String> deviceTypes) {
            if (deviceTypes == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "deviceTypes");
            }
            this.deviceTypes = deviceTypes;
            return this;
        }
        public Builder deviceTypes(String... deviceTypes) {
            return deviceTypes(List.of(deviceTypes));
        }
        @CustomType.Setter
        public Builder ecmpLimit(Integer ecmpLimit) {
            if (ecmpLimit == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "ecmpLimit");
            }
            this.ecmpLimit = ecmpLimit;
            return this;
        }
        @CustomType.Setter
        public Builder ecmpLimitVariable(String ecmpLimitVariable) {
            if (ecmpLimitVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "ecmpLimitVariable");
            }
            this.ecmpLimitVariable = ecmpLimitVariable;
            return this;
        }
        @CustomType.Setter
        public Builder eorTimer(Integer eorTimer) {
            if (eorTimer == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "eorTimer");
            }
            this.eorTimer = eorTimer;
            return this;
        }
        @CustomType.Setter
        public Builder eorTimerVariable(String eorTimerVariable) {
            if (eorTimerVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "eorTimerVariable");
            }
            this.eorTimerVariable = eorTimerVariable;
            return this;
        }
        @CustomType.Setter
        public Builder gracefulRestart(Boolean gracefulRestart) {
            if (gracefulRestart == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "gracefulRestart");
            }
            this.gracefulRestart = gracefulRestart;
            return this;
        }
        @CustomType.Setter
        public Builder gracefulRestartTimer(Integer gracefulRestartTimer) {
            if (gracefulRestartTimer == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "gracefulRestartTimer");
            }
            this.gracefulRestartTimer = gracefulRestartTimer;
            return this;
        }
        @CustomType.Setter
        public Builder gracefulRestartTimerVariable(String gracefulRestartTimerVariable) {
            if (gracefulRestartTimerVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "gracefulRestartTimerVariable");
            }
            this.gracefulRestartTimerVariable = gracefulRestartTimerVariable;
            return this;
        }
        @CustomType.Setter
        public Builder gracefulRestartVariable(String gracefulRestartVariable) {
            if (gracefulRestartVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "gracefulRestartVariable");
            }
            this.gracefulRestartVariable = gracefulRestartVariable;
            return this;
        }
        @CustomType.Setter
        public Builder holdtime(Integer holdtime) {
            if (holdtime == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "holdtime");
            }
            this.holdtime = holdtime;
            return this;
        }
        @CustomType.Setter
        public Builder holdtimeVariable(String holdtimeVariable) {
            if (holdtimeVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "holdtimeVariable");
            }
            this.holdtimeVariable = holdtimeVariable;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreRegionPathLength(Boolean ignoreRegionPathLength) {
            if (ignoreRegionPathLength == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "ignoreRegionPathLength");
            }
            this.ignoreRegionPathLength = ignoreRegionPathLength;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreRegionPathLengthVariable(String ignoreRegionPathLengthVariable) {
            if (ignoreRegionPathLengthVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "ignoreRegionPathLengthVariable");
            }
            this.ignoreRegionPathLengthVariable = ignoreRegionPathLengthVariable;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder ompAdminDistanceIpv4(Integer ompAdminDistanceIpv4) {
            if (ompAdminDistanceIpv4 == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "ompAdminDistanceIpv4");
            }
            this.ompAdminDistanceIpv4 = ompAdminDistanceIpv4;
            return this;
        }
        @CustomType.Setter
        public Builder ompAdminDistanceIpv4Variable(String ompAdminDistanceIpv4Variable) {
            if (ompAdminDistanceIpv4Variable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "ompAdminDistanceIpv4Variable");
            }
            this.ompAdminDistanceIpv4Variable = ompAdminDistanceIpv4Variable;
            return this;
        }
        @CustomType.Setter
        public Builder ompAdminDistanceIpv6(Integer ompAdminDistanceIpv6) {
            if (ompAdminDistanceIpv6 == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "ompAdminDistanceIpv6");
            }
            this.ompAdminDistanceIpv6 = ompAdminDistanceIpv6;
            return this;
        }
        @CustomType.Setter
        public Builder ompAdminDistanceIpv6Variable(String ompAdminDistanceIpv6Variable) {
            if (ompAdminDistanceIpv6Variable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "ompAdminDistanceIpv6Variable");
            }
            this.ompAdminDistanceIpv6Variable = ompAdminDistanceIpv6Variable;
            return this;
        }
        @CustomType.Setter
        public Builder overlayAs(Integer overlayAs) {
            if (overlayAs == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "overlayAs");
            }
            this.overlayAs = overlayAs;
            return this;
        }
        @CustomType.Setter
        public Builder overlayAsVariable(String overlayAsVariable) {
            if (overlayAsVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "overlayAsVariable");
            }
            this.overlayAsVariable = overlayAsVariable;
            return this;
        }
        @CustomType.Setter
        public Builder sendPathLimit(Integer sendPathLimit) {
            if (sendPathLimit == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "sendPathLimit");
            }
            this.sendPathLimit = sendPathLimit;
            return this;
        }
        @CustomType.Setter
        public Builder sendPathLimitVariable(String sendPathLimitVariable) {
            if (sendPathLimitVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "sendPathLimitVariable");
            }
            this.sendPathLimitVariable = sendPathLimitVariable;
            return this;
        }
        @CustomType.Setter
        public Builder shutdown(Boolean shutdown) {
            if (shutdown == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "shutdown");
            }
            this.shutdown = shutdown;
            return this;
        }
        @CustomType.Setter
        public Builder shutdownVariable(String shutdownVariable) {
            if (shutdownVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "shutdownVariable");
            }
            this.shutdownVariable = shutdownVariable;
            return this;
        }
        @CustomType.Setter
        public Builder templateType(String templateType) {
            if (templateType == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "templateType");
            }
            this.templateType = templateType;
            return this;
        }
        @CustomType.Setter
        public Builder transportGateway(String transportGateway) {
            if (transportGateway == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "transportGateway");
            }
            this.transportGateway = transportGateway;
            return this;
        }
        @CustomType.Setter
        public Builder transportGatewayVariable(String transportGatewayVariable) {
            if (transportGatewayVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "transportGatewayVariable");
            }
            this.transportGatewayVariable = transportGatewayVariable;
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetCiscoOmpFeatureTemplateResult", "version");
            }
            this.version = version;
            return this;
        }
        public GetCiscoOmpFeatureTemplateResult build() {
            final var _resultValue = new GetCiscoOmpFeatureTemplateResult();
            _resultValue.advertiseIpv4Routes = advertiseIpv4Routes;
            _resultValue.advertiseIpv6Routes = advertiseIpv6Routes;
            _resultValue.advertisementInterval = advertisementInterval;
            _resultValue.advertisementIntervalVariable = advertisementIntervalVariable;
            _resultValue.description = description;
            _resultValue.deviceTypes = deviceTypes;
            _resultValue.ecmpLimit = ecmpLimit;
            _resultValue.ecmpLimitVariable = ecmpLimitVariable;
            _resultValue.eorTimer = eorTimer;
            _resultValue.eorTimerVariable = eorTimerVariable;
            _resultValue.gracefulRestart = gracefulRestart;
            _resultValue.gracefulRestartTimer = gracefulRestartTimer;
            _resultValue.gracefulRestartTimerVariable = gracefulRestartTimerVariable;
            _resultValue.gracefulRestartVariable = gracefulRestartVariable;
            _resultValue.holdtime = holdtime;
            _resultValue.holdtimeVariable = holdtimeVariable;
            _resultValue.id = id;
            _resultValue.ignoreRegionPathLength = ignoreRegionPathLength;
            _resultValue.ignoreRegionPathLengthVariable = ignoreRegionPathLengthVariable;
            _resultValue.name = name;
            _resultValue.ompAdminDistanceIpv4 = ompAdminDistanceIpv4;
            _resultValue.ompAdminDistanceIpv4Variable = ompAdminDistanceIpv4Variable;
            _resultValue.ompAdminDistanceIpv6 = ompAdminDistanceIpv6;
            _resultValue.ompAdminDistanceIpv6Variable = ompAdminDistanceIpv6Variable;
            _resultValue.overlayAs = overlayAs;
            _resultValue.overlayAsVariable = overlayAsVariable;
            _resultValue.sendPathLimit = sendPathLimit;
            _resultValue.sendPathLimitVariable = sendPathLimitVariable;
            _resultValue.shutdown = shutdown;
            _resultValue.shutdownVariable = shutdownVariable;
            _resultValue.templateType = templateType;
            _resultValue.transportGateway = transportGateway;
            _resultValue.transportGatewayVariable = transportGatewayVariable;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
