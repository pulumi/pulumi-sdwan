// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan.Outputs
{

    [OutputType]
    public sealed class GetServiceSwitchportFeatureInterfaceResult
    {
        /// <summary>
        /// Set uni or bi directional authorization mode
        /// </summary>
        public readonly string ControlDirection;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ControlDirectionVariable;
        /// <summary>
        /// Set Critical VLAN
        /// </summary>
        public readonly int CriticalVlan;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string CriticalVlanVariable;
        /// <summary>
        /// Duplex mode
        /// </summary>
        public readonly string Duplex;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string DuplexVariable;
        /// <summary>
        /// Enable Periodic Reauthentication
        /// </summary>
        public readonly bool EnablePeriodicReauth;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string EnablePeriodicReauthVariable;
        /// <summary>
        /// Enable Critical Voice VLAN
        /// </summary>
        public readonly bool EnableVoice;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string EnableVoiceVariable;
        /// <summary>
        /// Set vlan to drop non-802.1x enabled clients into if client is not in MAB list
        /// </summary>
        public readonly int GuestVlan;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string GuestVlanVariable;
        /// <summary>
        /// Set host mode
        /// </summary>
        public readonly string HostMode;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string HostModeVariable;
        /// <summary>
        /// Periodic Reauthentication Inactivity Timeout (in seconds)
        /// </summary>
        public readonly int Inactivity;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string InactivityVariable;
        /// <summary>
        /// Set Interface name
        /// </summary>
        public readonly string InterfaceName;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string InterfaceNameVariable;
        /// <summary>
        /// MAC Authentication Bypass
        /// </summary>
        public readonly bool MacAuthenticationBypass;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string MacAuthenticationBypassVariable;
        /// <summary>
        /// Set type of switch port: access/trunk
        /// </summary>
        public readonly string Mode;
        /// <summary>
        /// Set 802.1x Interface Pae Type
        /// </summary>
        public readonly bool PaeEnable;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string PaeEnableVariable;
        /// <summary>
        /// Set Port-Control Mode
        /// </summary>
        public readonly string PortControl;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string PortControlVariable;
        /// <summary>
        /// Periodic Reauthentication Interval (in seconds)
        /// </summary>
        public readonly int Reauthentication;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ReauthenticationVariable;
        /// <summary>
        /// Set Restricted VLAN ID
        /// </summary>
        public readonly int RestrictedVlan;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string RestrictedVlanVariable;
        /// <summary>
        /// Administrative state
        /// </summary>
        public readonly bool Shutdown;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ShutdownVariable;
        /// <summary>
        /// Set interface speed
        /// </summary>
        public readonly string Speed;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string SpeedVariable;
        /// <summary>
        /// Set VLAN identifier associated with bridging domain
        /// </summary>
        public readonly int SwitchportAccessVlan;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string SwitchportAccessVlanVariable;
        /// <summary>
        /// Configure VLAN IDs used with the trunk
        /// </summary>
        public readonly string SwitchportTrunkAllowedVlans;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string SwitchportTrunkAllowedVlansVariable;
        /// <summary>
        /// Configure VLAN ID used for native VLAN
        /// </summary>
        public readonly int SwitchportTrunkNativeVlan;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string SwitchportTrunkNativeVlanVariable;
        /// <summary>
        /// Configure Voice Vlan
        /// </summary>
        public readonly int VoiceVlan;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string VoiceVlanVariable;

        [OutputConstructor]
        private GetServiceSwitchportFeatureInterfaceResult(
            string controlDirection,

            string controlDirectionVariable,

            int criticalVlan,

            string criticalVlanVariable,

            string duplex,

            string duplexVariable,

            bool enablePeriodicReauth,

            string enablePeriodicReauthVariable,

            bool enableVoice,

            string enableVoiceVariable,

            int guestVlan,

            string guestVlanVariable,

            string hostMode,

            string hostModeVariable,

            int inactivity,

            string inactivityVariable,

            string interfaceName,

            string interfaceNameVariable,

            bool macAuthenticationBypass,

            string macAuthenticationBypassVariable,

            string mode,

            bool paeEnable,

            string paeEnableVariable,

            string portControl,

            string portControlVariable,

            int reauthentication,

            string reauthenticationVariable,

            int restrictedVlan,

            string restrictedVlanVariable,

            bool shutdown,

            string shutdownVariable,

            string speed,

            string speedVariable,

            int switchportAccessVlan,

            string switchportAccessVlanVariable,

            string switchportTrunkAllowedVlans,

            string switchportTrunkAllowedVlansVariable,

            int switchportTrunkNativeVlan,

            string switchportTrunkNativeVlanVariable,

            int voiceVlan,

            string voiceVlanVariable)
        {
            ControlDirection = controlDirection;
            ControlDirectionVariable = controlDirectionVariable;
            CriticalVlan = criticalVlan;
            CriticalVlanVariable = criticalVlanVariable;
            Duplex = duplex;
            DuplexVariable = duplexVariable;
            EnablePeriodicReauth = enablePeriodicReauth;
            EnablePeriodicReauthVariable = enablePeriodicReauthVariable;
            EnableVoice = enableVoice;
            EnableVoiceVariable = enableVoiceVariable;
            GuestVlan = guestVlan;
            GuestVlanVariable = guestVlanVariable;
            HostMode = hostMode;
            HostModeVariable = hostModeVariable;
            Inactivity = inactivity;
            InactivityVariable = inactivityVariable;
            InterfaceName = interfaceName;
            InterfaceNameVariable = interfaceNameVariable;
            MacAuthenticationBypass = macAuthenticationBypass;
            MacAuthenticationBypassVariable = macAuthenticationBypassVariable;
            Mode = mode;
            PaeEnable = paeEnable;
            PaeEnableVariable = paeEnableVariable;
            PortControl = portControl;
            PortControlVariable = portControlVariable;
            Reauthentication = reauthentication;
            ReauthenticationVariable = reauthenticationVariable;
            RestrictedVlan = restrictedVlan;
            RestrictedVlanVariable = restrictedVlanVariable;
            Shutdown = shutdown;
            ShutdownVariable = shutdownVariable;
            Speed = speed;
            SpeedVariable = speedVariable;
            SwitchportAccessVlan = switchportAccessVlan;
            SwitchportAccessVlanVariable = switchportAccessVlanVariable;
            SwitchportTrunkAllowedVlans = switchportTrunkAllowedVlans;
            SwitchportTrunkAllowedVlansVariable = switchportTrunkAllowedVlansVariable;
            SwitchportTrunkNativeVlan = switchportTrunkNativeVlan;
            SwitchportTrunkNativeVlanVariable = switchportTrunkNativeVlanVariable;
            VoiceVlan = voiceVlan;
            VoiceVlanVariable = voiceVlanVariable;
        }
    }
}