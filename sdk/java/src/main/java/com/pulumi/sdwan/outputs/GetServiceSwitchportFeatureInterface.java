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
public final class GetServiceSwitchportFeatureInterface {
    /**
     * @return Set uni or bi directional authorization mode
     * 
     */
    private String controlDirection;
    /**
     * @return Variable name
     * 
     */
    private String controlDirectionVariable;
    /**
     * @return Set Critical VLAN
     * 
     */
    private Integer criticalVlan;
    /**
     * @return Variable name
     * 
     */
    private String criticalVlanVariable;
    /**
     * @return Duplex mode
     * 
     */
    private String duplex;
    /**
     * @return Variable name
     * 
     */
    private String duplexVariable;
    /**
     * @return Enable Periodic Reauthentication
     * 
     */
    private Boolean enablePeriodicReauth;
    /**
     * @return Variable name
     * 
     */
    private String enablePeriodicReauthVariable;
    /**
     * @return Enable Critical Voice VLAN
     * 
     */
    private Boolean enableVoice;
    /**
     * @return Variable name
     * 
     */
    private String enableVoiceVariable;
    /**
     * @return Set vlan to drop non-802.1x enabled clients into if client is not in MAB list
     * 
     */
    private Integer guestVlan;
    /**
     * @return Variable name
     * 
     */
    private String guestVlanVariable;
    /**
     * @return Set host mode
     * 
     */
    private String hostMode;
    /**
     * @return Variable name
     * 
     */
    private String hostModeVariable;
    /**
     * @return Periodic Reauthentication Inactivity Timeout (in seconds)
     * 
     */
    private Integer inactivity;
    /**
     * @return Variable name
     * 
     */
    private String inactivityVariable;
    /**
     * @return Set Interface name
     * 
     */
    private String interfaceName;
    /**
     * @return Variable name
     * 
     */
    private String interfaceNameVariable;
    /**
     * @return MAC Authentication Bypass
     * 
     */
    private Boolean macAuthenticationBypass;
    /**
     * @return Variable name
     * 
     */
    private String macAuthenticationBypassVariable;
    /**
     * @return Set type of switch port: access/trunk
     * 
     */
    private String mode;
    /**
     * @return Set 802.1x Interface Pae Type
     * 
     */
    private Boolean paeEnable;
    /**
     * @return Variable name
     * 
     */
    private String paeEnableVariable;
    /**
     * @return Set Port-Control Mode
     * 
     */
    private String portControl;
    /**
     * @return Variable name
     * 
     */
    private String portControlVariable;
    /**
     * @return Periodic Reauthentication Interval (in seconds)
     * 
     */
    private Integer reauthentication;
    /**
     * @return Variable name
     * 
     */
    private String reauthenticationVariable;
    /**
     * @return Set Restricted VLAN ID
     * 
     */
    private Integer restrictedVlan;
    /**
     * @return Variable name
     * 
     */
    private String restrictedVlanVariable;
    /**
     * @return Administrative state
     * 
     */
    private Boolean shutdown;
    /**
     * @return Variable name
     * 
     */
    private String shutdownVariable;
    /**
     * @return Set interface speed
     * 
     */
    private String speed;
    /**
     * @return Variable name
     * 
     */
    private String speedVariable;
    /**
     * @return Set VLAN identifier associated with bridging domain
     * 
     */
    private Integer switchportAccessVlan;
    /**
     * @return Variable name
     * 
     */
    private String switchportAccessVlanVariable;
    /**
     * @return Configure VLAN IDs used with the trunk
     * 
     */
    private String switchportTrunkAllowedVlans;
    /**
     * @return Variable name
     * 
     */
    private String switchportTrunkAllowedVlansVariable;
    /**
     * @return Configure VLAN ID used for native VLAN
     * 
     */
    private Integer switchportTrunkNativeVlan;
    /**
     * @return Variable name
     * 
     */
    private String switchportTrunkNativeVlanVariable;
    /**
     * @return Configure Voice Vlan
     * 
     */
    private Integer voiceVlan;
    /**
     * @return Variable name
     * 
     */
    private String voiceVlanVariable;

    private GetServiceSwitchportFeatureInterface() {}
    /**
     * @return Set uni or bi directional authorization mode
     * 
     */
    public String controlDirection() {
        return this.controlDirection;
    }
    /**
     * @return Variable name
     * 
     */
    public String controlDirectionVariable() {
        return this.controlDirectionVariable;
    }
    /**
     * @return Set Critical VLAN
     * 
     */
    public Integer criticalVlan() {
        return this.criticalVlan;
    }
    /**
     * @return Variable name
     * 
     */
    public String criticalVlanVariable() {
        return this.criticalVlanVariable;
    }
    /**
     * @return Duplex mode
     * 
     */
    public String duplex() {
        return this.duplex;
    }
    /**
     * @return Variable name
     * 
     */
    public String duplexVariable() {
        return this.duplexVariable;
    }
    /**
     * @return Enable Periodic Reauthentication
     * 
     */
    public Boolean enablePeriodicReauth() {
        return this.enablePeriodicReauth;
    }
    /**
     * @return Variable name
     * 
     */
    public String enablePeriodicReauthVariable() {
        return this.enablePeriodicReauthVariable;
    }
    /**
     * @return Enable Critical Voice VLAN
     * 
     */
    public Boolean enableVoice() {
        return this.enableVoice;
    }
    /**
     * @return Variable name
     * 
     */
    public String enableVoiceVariable() {
        return this.enableVoiceVariable;
    }
    /**
     * @return Set vlan to drop non-802.1x enabled clients into if client is not in MAB list
     * 
     */
    public Integer guestVlan() {
        return this.guestVlan;
    }
    /**
     * @return Variable name
     * 
     */
    public String guestVlanVariable() {
        return this.guestVlanVariable;
    }
    /**
     * @return Set host mode
     * 
     */
    public String hostMode() {
        return this.hostMode;
    }
    /**
     * @return Variable name
     * 
     */
    public String hostModeVariable() {
        return this.hostModeVariable;
    }
    /**
     * @return Periodic Reauthentication Inactivity Timeout (in seconds)
     * 
     */
    public Integer inactivity() {
        return this.inactivity;
    }
    /**
     * @return Variable name
     * 
     */
    public String inactivityVariable() {
        return this.inactivityVariable;
    }
    /**
     * @return Set Interface name
     * 
     */
    public String interfaceName() {
        return this.interfaceName;
    }
    /**
     * @return Variable name
     * 
     */
    public String interfaceNameVariable() {
        return this.interfaceNameVariable;
    }
    /**
     * @return MAC Authentication Bypass
     * 
     */
    public Boolean macAuthenticationBypass() {
        return this.macAuthenticationBypass;
    }
    /**
     * @return Variable name
     * 
     */
    public String macAuthenticationBypassVariable() {
        return this.macAuthenticationBypassVariable;
    }
    /**
     * @return Set type of switch port: access/trunk
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return Set 802.1x Interface Pae Type
     * 
     */
    public Boolean paeEnable() {
        return this.paeEnable;
    }
    /**
     * @return Variable name
     * 
     */
    public String paeEnableVariable() {
        return this.paeEnableVariable;
    }
    /**
     * @return Set Port-Control Mode
     * 
     */
    public String portControl() {
        return this.portControl;
    }
    /**
     * @return Variable name
     * 
     */
    public String portControlVariable() {
        return this.portControlVariable;
    }
    /**
     * @return Periodic Reauthentication Interval (in seconds)
     * 
     */
    public Integer reauthentication() {
        return this.reauthentication;
    }
    /**
     * @return Variable name
     * 
     */
    public String reauthenticationVariable() {
        return this.reauthenticationVariable;
    }
    /**
     * @return Set Restricted VLAN ID
     * 
     */
    public Integer restrictedVlan() {
        return this.restrictedVlan;
    }
    /**
     * @return Variable name
     * 
     */
    public String restrictedVlanVariable() {
        return this.restrictedVlanVariable;
    }
    /**
     * @return Administrative state
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
     * @return Set interface speed
     * 
     */
    public String speed() {
        return this.speed;
    }
    /**
     * @return Variable name
     * 
     */
    public String speedVariable() {
        return this.speedVariable;
    }
    /**
     * @return Set VLAN identifier associated with bridging domain
     * 
     */
    public Integer switchportAccessVlan() {
        return this.switchportAccessVlan;
    }
    /**
     * @return Variable name
     * 
     */
    public String switchportAccessVlanVariable() {
        return this.switchportAccessVlanVariable;
    }
    /**
     * @return Configure VLAN IDs used with the trunk
     * 
     */
    public String switchportTrunkAllowedVlans() {
        return this.switchportTrunkAllowedVlans;
    }
    /**
     * @return Variable name
     * 
     */
    public String switchportTrunkAllowedVlansVariable() {
        return this.switchportTrunkAllowedVlansVariable;
    }
    /**
     * @return Configure VLAN ID used for native VLAN
     * 
     */
    public Integer switchportTrunkNativeVlan() {
        return this.switchportTrunkNativeVlan;
    }
    /**
     * @return Variable name
     * 
     */
    public String switchportTrunkNativeVlanVariable() {
        return this.switchportTrunkNativeVlanVariable;
    }
    /**
     * @return Configure Voice Vlan
     * 
     */
    public Integer voiceVlan() {
        return this.voiceVlan;
    }
    /**
     * @return Variable name
     * 
     */
    public String voiceVlanVariable() {
        return this.voiceVlanVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceSwitchportFeatureInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String controlDirection;
        private String controlDirectionVariable;
        private Integer criticalVlan;
        private String criticalVlanVariable;
        private String duplex;
        private String duplexVariable;
        private Boolean enablePeriodicReauth;
        private String enablePeriodicReauthVariable;
        private Boolean enableVoice;
        private String enableVoiceVariable;
        private Integer guestVlan;
        private String guestVlanVariable;
        private String hostMode;
        private String hostModeVariable;
        private Integer inactivity;
        private String inactivityVariable;
        private String interfaceName;
        private String interfaceNameVariable;
        private Boolean macAuthenticationBypass;
        private String macAuthenticationBypassVariable;
        private String mode;
        private Boolean paeEnable;
        private String paeEnableVariable;
        private String portControl;
        private String portControlVariable;
        private Integer reauthentication;
        private String reauthenticationVariable;
        private Integer restrictedVlan;
        private String restrictedVlanVariable;
        private Boolean shutdown;
        private String shutdownVariable;
        private String speed;
        private String speedVariable;
        private Integer switchportAccessVlan;
        private String switchportAccessVlanVariable;
        private String switchportTrunkAllowedVlans;
        private String switchportTrunkAllowedVlansVariable;
        private Integer switchportTrunkNativeVlan;
        private String switchportTrunkNativeVlanVariable;
        private Integer voiceVlan;
        private String voiceVlanVariable;
        public Builder() {}
        public Builder(GetServiceSwitchportFeatureInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controlDirection = defaults.controlDirection;
    	      this.controlDirectionVariable = defaults.controlDirectionVariable;
    	      this.criticalVlan = defaults.criticalVlan;
    	      this.criticalVlanVariable = defaults.criticalVlanVariable;
    	      this.duplex = defaults.duplex;
    	      this.duplexVariable = defaults.duplexVariable;
    	      this.enablePeriodicReauth = defaults.enablePeriodicReauth;
    	      this.enablePeriodicReauthVariable = defaults.enablePeriodicReauthVariable;
    	      this.enableVoice = defaults.enableVoice;
    	      this.enableVoiceVariable = defaults.enableVoiceVariable;
    	      this.guestVlan = defaults.guestVlan;
    	      this.guestVlanVariable = defaults.guestVlanVariable;
    	      this.hostMode = defaults.hostMode;
    	      this.hostModeVariable = defaults.hostModeVariable;
    	      this.inactivity = defaults.inactivity;
    	      this.inactivityVariable = defaults.inactivityVariable;
    	      this.interfaceName = defaults.interfaceName;
    	      this.interfaceNameVariable = defaults.interfaceNameVariable;
    	      this.macAuthenticationBypass = defaults.macAuthenticationBypass;
    	      this.macAuthenticationBypassVariable = defaults.macAuthenticationBypassVariable;
    	      this.mode = defaults.mode;
    	      this.paeEnable = defaults.paeEnable;
    	      this.paeEnableVariable = defaults.paeEnableVariable;
    	      this.portControl = defaults.portControl;
    	      this.portControlVariable = defaults.portControlVariable;
    	      this.reauthentication = defaults.reauthentication;
    	      this.reauthenticationVariable = defaults.reauthenticationVariable;
    	      this.restrictedVlan = defaults.restrictedVlan;
    	      this.restrictedVlanVariable = defaults.restrictedVlanVariable;
    	      this.shutdown = defaults.shutdown;
    	      this.shutdownVariable = defaults.shutdownVariable;
    	      this.speed = defaults.speed;
    	      this.speedVariable = defaults.speedVariable;
    	      this.switchportAccessVlan = defaults.switchportAccessVlan;
    	      this.switchportAccessVlanVariable = defaults.switchportAccessVlanVariable;
    	      this.switchportTrunkAllowedVlans = defaults.switchportTrunkAllowedVlans;
    	      this.switchportTrunkAllowedVlansVariable = defaults.switchportTrunkAllowedVlansVariable;
    	      this.switchportTrunkNativeVlan = defaults.switchportTrunkNativeVlan;
    	      this.switchportTrunkNativeVlanVariable = defaults.switchportTrunkNativeVlanVariable;
    	      this.voiceVlan = defaults.voiceVlan;
    	      this.voiceVlanVariable = defaults.voiceVlanVariable;
        }

        @CustomType.Setter
        public Builder controlDirection(String controlDirection) {
            if (controlDirection == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "controlDirection");
            }
            this.controlDirection = controlDirection;
            return this;
        }
        @CustomType.Setter
        public Builder controlDirectionVariable(String controlDirectionVariable) {
            if (controlDirectionVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "controlDirectionVariable");
            }
            this.controlDirectionVariable = controlDirectionVariable;
            return this;
        }
        @CustomType.Setter
        public Builder criticalVlan(Integer criticalVlan) {
            if (criticalVlan == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "criticalVlan");
            }
            this.criticalVlan = criticalVlan;
            return this;
        }
        @CustomType.Setter
        public Builder criticalVlanVariable(String criticalVlanVariable) {
            if (criticalVlanVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "criticalVlanVariable");
            }
            this.criticalVlanVariable = criticalVlanVariable;
            return this;
        }
        @CustomType.Setter
        public Builder duplex(String duplex) {
            if (duplex == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "duplex");
            }
            this.duplex = duplex;
            return this;
        }
        @CustomType.Setter
        public Builder duplexVariable(String duplexVariable) {
            if (duplexVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "duplexVariable");
            }
            this.duplexVariable = duplexVariable;
            return this;
        }
        @CustomType.Setter
        public Builder enablePeriodicReauth(Boolean enablePeriodicReauth) {
            if (enablePeriodicReauth == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "enablePeriodicReauth");
            }
            this.enablePeriodicReauth = enablePeriodicReauth;
            return this;
        }
        @CustomType.Setter
        public Builder enablePeriodicReauthVariable(String enablePeriodicReauthVariable) {
            if (enablePeriodicReauthVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "enablePeriodicReauthVariable");
            }
            this.enablePeriodicReauthVariable = enablePeriodicReauthVariable;
            return this;
        }
        @CustomType.Setter
        public Builder enableVoice(Boolean enableVoice) {
            if (enableVoice == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "enableVoice");
            }
            this.enableVoice = enableVoice;
            return this;
        }
        @CustomType.Setter
        public Builder enableVoiceVariable(String enableVoiceVariable) {
            if (enableVoiceVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "enableVoiceVariable");
            }
            this.enableVoiceVariable = enableVoiceVariable;
            return this;
        }
        @CustomType.Setter
        public Builder guestVlan(Integer guestVlan) {
            if (guestVlan == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "guestVlan");
            }
            this.guestVlan = guestVlan;
            return this;
        }
        @CustomType.Setter
        public Builder guestVlanVariable(String guestVlanVariable) {
            if (guestVlanVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "guestVlanVariable");
            }
            this.guestVlanVariable = guestVlanVariable;
            return this;
        }
        @CustomType.Setter
        public Builder hostMode(String hostMode) {
            if (hostMode == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "hostMode");
            }
            this.hostMode = hostMode;
            return this;
        }
        @CustomType.Setter
        public Builder hostModeVariable(String hostModeVariable) {
            if (hostModeVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "hostModeVariable");
            }
            this.hostModeVariable = hostModeVariable;
            return this;
        }
        @CustomType.Setter
        public Builder inactivity(Integer inactivity) {
            if (inactivity == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "inactivity");
            }
            this.inactivity = inactivity;
            return this;
        }
        @CustomType.Setter
        public Builder inactivityVariable(String inactivityVariable) {
            if (inactivityVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "inactivityVariable");
            }
            this.inactivityVariable = inactivityVariable;
            return this;
        }
        @CustomType.Setter
        public Builder interfaceName(String interfaceName) {
            if (interfaceName == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "interfaceName");
            }
            this.interfaceName = interfaceName;
            return this;
        }
        @CustomType.Setter
        public Builder interfaceNameVariable(String interfaceNameVariable) {
            if (interfaceNameVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "interfaceNameVariable");
            }
            this.interfaceNameVariable = interfaceNameVariable;
            return this;
        }
        @CustomType.Setter
        public Builder macAuthenticationBypass(Boolean macAuthenticationBypass) {
            if (macAuthenticationBypass == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "macAuthenticationBypass");
            }
            this.macAuthenticationBypass = macAuthenticationBypass;
            return this;
        }
        @CustomType.Setter
        public Builder macAuthenticationBypassVariable(String macAuthenticationBypassVariable) {
            if (macAuthenticationBypassVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "macAuthenticationBypassVariable");
            }
            this.macAuthenticationBypassVariable = macAuthenticationBypassVariable;
            return this;
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            if (mode == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "mode");
            }
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder paeEnable(Boolean paeEnable) {
            if (paeEnable == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "paeEnable");
            }
            this.paeEnable = paeEnable;
            return this;
        }
        @CustomType.Setter
        public Builder paeEnableVariable(String paeEnableVariable) {
            if (paeEnableVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "paeEnableVariable");
            }
            this.paeEnableVariable = paeEnableVariable;
            return this;
        }
        @CustomType.Setter
        public Builder portControl(String portControl) {
            if (portControl == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "portControl");
            }
            this.portControl = portControl;
            return this;
        }
        @CustomType.Setter
        public Builder portControlVariable(String portControlVariable) {
            if (portControlVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "portControlVariable");
            }
            this.portControlVariable = portControlVariable;
            return this;
        }
        @CustomType.Setter
        public Builder reauthentication(Integer reauthentication) {
            if (reauthentication == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "reauthentication");
            }
            this.reauthentication = reauthentication;
            return this;
        }
        @CustomType.Setter
        public Builder reauthenticationVariable(String reauthenticationVariable) {
            if (reauthenticationVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "reauthenticationVariable");
            }
            this.reauthenticationVariable = reauthenticationVariable;
            return this;
        }
        @CustomType.Setter
        public Builder restrictedVlan(Integer restrictedVlan) {
            if (restrictedVlan == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "restrictedVlan");
            }
            this.restrictedVlan = restrictedVlan;
            return this;
        }
        @CustomType.Setter
        public Builder restrictedVlanVariable(String restrictedVlanVariable) {
            if (restrictedVlanVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "restrictedVlanVariable");
            }
            this.restrictedVlanVariable = restrictedVlanVariable;
            return this;
        }
        @CustomType.Setter
        public Builder shutdown(Boolean shutdown) {
            if (shutdown == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "shutdown");
            }
            this.shutdown = shutdown;
            return this;
        }
        @CustomType.Setter
        public Builder shutdownVariable(String shutdownVariable) {
            if (shutdownVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "shutdownVariable");
            }
            this.shutdownVariable = shutdownVariable;
            return this;
        }
        @CustomType.Setter
        public Builder speed(String speed) {
            if (speed == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "speed");
            }
            this.speed = speed;
            return this;
        }
        @CustomType.Setter
        public Builder speedVariable(String speedVariable) {
            if (speedVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "speedVariable");
            }
            this.speedVariable = speedVariable;
            return this;
        }
        @CustomType.Setter
        public Builder switchportAccessVlan(Integer switchportAccessVlan) {
            if (switchportAccessVlan == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "switchportAccessVlan");
            }
            this.switchportAccessVlan = switchportAccessVlan;
            return this;
        }
        @CustomType.Setter
        public Builder switchportAccessVlanVariable(String switchportAccessVlanVariable) {
            if (switchportAccessVlanVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "switchportAccessVlanVariable");
            }
            this.switchportAccessVlanVariable = switchportAccessVlanVariable;
            return this;
        }
        @CustomType.Setter
        public Builder switchportTrunkAllowedVlans(String switchportTrunkAllowedVlans) {
            if (switchportTrunkAllowedVlans == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "switchportTrunkAllowedVlans");
            }
            this.switchportTrunkAllowedVlans = switchportTrunkAllowedVlans;
            return this;
        }
        @CustomType.Setter
        public Builder switchportTrunkAllowedVlansVariable(String switchportTrunkAllowedVlansVariable) {
            if (switchportTrunkAllowedVlansVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "switchportTrunkAllowedVlansVariable");
            }
            this.switchportTrunkAllowedVlansVariable = switchportTrunkAllowedVlansVariable;
            return this;
        }
        @CustomType.Setter
        public Builder switchportTrunkNativeVlan(Integer switchportTrunkNativeVlan) {
            if (switchportTrunkNativeVlan == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "switchportTrunkNativeVlan");
            }
            this.switchportTrunkNativeVlan = switchportTrunkNativeVlan;
            return this;
        }
        @CustomType.Setter
        public Builder switchportTrunkNativeVlanVariable(String switchportTrunkNativeVlanVariable) {
            if (switchportTrunkNativeVlanVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "switchportTrunkNativeVlanVariable");
            }
            this.switchportTrunkNativeVlanVariable = switchportTrunkNativeVlanVariable;
            return this;
        }
        @CustomType.Setter
        public Builder voiceVlan(Integer voiceVlan) {
            if (voiceVlan == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "voiceVlan");
            }
            this.voiceVlan = voiceVlan;
            return this;
        }
        @CustomType.Setter
        public Builder voiceVlanVariable(String voiceVlanVariable) {
            if (voiceVlanVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceSwitchportFeatureInterface", "voiceVlanVariable");
            }
            this.voiceVlanVariable = voiceVlanVariable;
            return this;
        }
        public GetServiceSwitchportFeatureInterface build() {
            final var _resultValue = new GetServiceSwitchportFeatureInterface();
            _resultValue.controlDirection = controlDirection;
            _resultValue.controlDirectionVariable = controlDirectionVariable;
            _resultValue.criticalVlan = criticalVlan;
            _resultValue.criticalVlanVariable = criticalVlanVariable;
            _resultValue.duplex = duplex;
            _resultValue.duplexVariable = duplexVariable;
            _resultValue.enablePeriodicReauth = enablePeriodicReauth;
            _resultValue.enablePeriodicReauthVariable = enablePeriodicReauthVariable;
            _resultValue.enableVoice = enableVoice;
            _resultValue.enableVoiceVariable = enableVoiceVariable;
            _resultValue.guestVlan = guestVlan;
            _resultValue.guestVlanVariable = guestVlanVariable;
            _resultValue.hostMode = hostMode;
            _resultValue.hostModeVariable = hostModeVariable;
            _resultValue.inactivity = inactivity;
            _resultValue.inactivityVariable = inactivityVariable;
            _resultValue.interfaceName = interfaceName;
            _resultValue.interfaceNameVariable = interfaceNameVariable;
            _resultValue.macAuthenticationBypass = macAuthenticationBypass;
            _resultValue.macAuthenticationBypassVariable = macAuthenticationBypassVariable;
            _resultValue.mode = mode;
            _resultValue.paeEnable = paeEnable;
            _resultValue.paeEnableVariable = paeEnableVariable;
            _resultValue.portControl = portControl;
            _resultValue.portControlVariable = portControlVariable;
            _resultValue.reauthentication = reauthentication;
            _resultValue.reauthenticationVariable = reauthenticationVariable;
            _resultValue.restrictedVlan = restrictedVlan;
            _resultValue.restrictedVlanVariable = restrictedVlanVariable;
            _resultValue.shutdown = shutdown;
            _resultValue.shutdownVariable = shutdownVariable;
            _resultValue.speed = speed;
            _resultValue.speedVariable = speedVariable;
            _resultValue.switchportAccessVlan = switchportAccessVlan;
            _resultValue.switchportAccessVlanVariable = switchportAccessVlanVariable;
            _resultValue.switchportTrunkAllowedVlans = switchportTrunkAllowedVlans;
            _resultValue.switchportTrunkAllowedVlansVariable = switchportTrunkAllowedVlansVariable;
            _resultValue.switchportTrunkNativeVlan = switchportTrunkNativeVlan;
            _resultValue.switchportTrunkNativeVlanVariable = switchportTrunkNativeVlanVariable;
            _resultValue.voiceVlan = voiceVlan;
            _resultValue.voiceVlanVariable = voiceVlanVariable;
            return _resultValue;
        }
    }
}
