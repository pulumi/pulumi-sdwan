# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetSystemRemoteAccessFeatureResult',
    'AwaitableGetSystemRemoteAccessFeatureResult',
    'get_system_remote_access_feature',
    'get_system_remote_access_feature_output',
]

@pulumi.output_type
class GetSystemRemoteAccessFeatureResult:
    """
    A collection of values returned by getSystemRemoteAccessFeature.
    """
    def __init__(__self__, aaa_derive_name_from_peer_domain=None, aaa_derive_name_from_peer_domain_variable=None, aaa_derive_name_from_peer_identity=None, aaa_derive_name_from_peer_identity_variable=None, aaa_enable_accounting=None, aaa_enable_accounting_variable=None, aaa_specify_name_policy_name=None, aaa_specify_name_policy_name_variable=None, aaa_specify_name_policy_password=None, aaa_specify_name_policy_password_variable=None, any_connect_eap_authentication_type=None, connection_type_ssl=None, description=None, enable_certificate_list_check=None, enable_certificate_list_check_variable=None, feature_profile_id=None, id=None, ikev2_anti_dos_threshold=None, ikev2_anti_dos_threshold_variable=None, ikev2_local_ike_identity_type=None, ikev2_local_ike_identity_type_variable=None, ikev2_local_ike_identity_value=None, ikev2_local_ike_identity_value_variable=None, ikev2_security_association_lifetime=None, ikev2_security_association_lifetime_variable=None, ipsec_anti_replay_window_size=None, ipsec_anti_replay_window_size_variable=None, ipsec_enable_anti_replay=None, ipsec_enable_anti_replay_variable=None, ipsec_enable_perfect_foward_secrecy=None, ipsec_enable_perfect_foward_secrecy_variable=None, ipsec_security_association_lifetime=None, ipsec_security_association_lifetime_variable=None, ipv4_pool_size=None, ipv4_pool_size_variable=None, ipv6_pool_size=None, ipv6_pool_size_variable=None, name=None, psk_authentication_pre_shared_key=None, psk_authentication_pre_shared_key_variable=None, psk_authentication_type=None, psk_authentication_type_variable=None, radius_group_name=None, radius_group_name_variable=None, version=None):
        if aaa_derive_name_from_peer_domain and not isinstance(aaa_derive_name_from_peer_domain, str):
            raise TypeError("Expected argument 'aaa_derive_name_from_peer_domain' to be a str")
        pulumi.set(__self__, "aaa_derive_name_from_peer_domain", aaa_derive_name_from_peer_domain)
        if aaa_derive_name_from_peer_domain_variable and not isinstance(aaa_derive_name_from_peer_domain_variable, str):
            raise TypeError("Expected argument 'aaa_derive_name_from_peer_domain_variable' to be a str")
        pulumi.set(__self__, "aaa_derive_name_from_peer_domain_variable", aaa_derive_name_from_peer_domain_variable)
        if aaa_derive_name_from_peer_identity and not isinstance(aaa_derive_name_from_peer_identity, str):
            raise TypeError("Expected argument 'aaa_derive_name_from_peer_identity' to be a str")
        pulumi.set(__self__, "aaa_derive_name_from_peer_identity", aaa_derive_name_from_peer_identity)
        if aaa_derive_name_from_peer_identity_variable and not isinstance(aaa_derive_name_from_peer_identity_variable, str):
            raise TypeError("Expected argument 'aaa_derive_name_from_peer_identity_variable' to be a str")
        pulumi.set(__self__, "aaa_derive_name_from_peer_identity_variable", aaa_derive_name_from_peer_identity_variable)
        if aaa_enable_accounting and not isinstance(aaa_enable_accounting, bool):
            raise TypeError("Expected argument 'aaa_enable_accounting' to be a bool")
        pulumi.set(__self__, "aaa_enable_accounting", aaa_enable_accounting)
        if aaa_enable_accounting_variable and not isinstance(aaa_enable_accounting_variable, str):
            raise TypeError("Expected argument 'aaa_enable_accounting_variable' to be a str")
        pulumi.set(__self__, "aaa_enable_accounting_variable", aaa_enable_accounting_variable)
        if aaa_specify_name_policy_name and not isinstance(aaa_specify_name_policy_name, str):
            raise TypeError("Expected argument 'aaa_specify_name_policy_name' to be a str")
        pulumi.set(__self__, "aaa_specify_name_policy_name", aaa_specify_name_policy_name)
        if aaa_specify_name_policy_name_variable and not isinstance(aaa_specify_name_policy_name_variable, str):
            raise TypeError("Expected argument 'aaa_specify_name_policy_name_variable' to be a str")
        pulumi.set(__self__, "aaa_specify_name_policy_name_variable", aaa_specify_name_policy_name_variable)
        if aaa_specify_name_policy_password and not isinstance(aaa_specify_name_policy_password, str):
            raise TypeError("Expected argument 'aaa_specify_name_policy_password' to be a str")
        pulumi.set(__self__, "aaa_specify_name_policy_password", aaa_specify_name_policy_password)
        if aaa_specify_name_policy_password_variable and not isinstance(aaa_specify_name_policy_password_variable, str):
            raise TypeError("Expected argument 'aaa_specify_name_policy_password_variable' to be a str")
        pulumi.set(__self__, "aaa_specify_name_policy_password_variable", aaa_specify_name_policy_password_variable)
        if any_connect_eap_authentication_type and not isinstance(any_connect_eap_authentication_type, str):
            raise TypeError("Expected argument 'any_connect_eap_authentication_type' to be a str")
        pulumi.set(__self__, "any_connect_eap_authentication_type", any_connect_eap_authentication_type)
        if connection_type_ssl and not isinstance(connection_type_ssl, bool):
            raise TypeError("Expected argument 'connection_type_ssl' to be a bool")
        pulumi.set(__self__, "connection_type_ssl", connection_type_ssl)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if enable_certificate_list_check and not isinstance(enable_certificate_list_check, bool):
            raise TypeError("Expected argument 'enable_certificate_list_check' to be a bool")
        pulumi.set(__self__, "enable_certificate_list_check", enable_certificate_list_check)
        if enable_certificate_list_check_variable and not isinstance(enable_certificate_list_check_variable, str):
            raise TypeError("Expected argument 'enable_certificate_list_check_variable' to be a str")
        pulumi.set(__self__, "enable_certificate_list_check_variable", enable_certificate_list_check_variable)
        if feature_profile_id and not isinstance(feature_profile_id, str):
            raise TypeError("Expected argument 'feature_profile_id' to be a str")
        pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ikev2_anti_dos_threshold and not isinstance(ikev2_anti_dos_threshold, int):
            raise TypeError("Expected argument 'ikev2_anti_dos_threshold' to be a int")
        pulumi.set(__self__, "ikev2_anti_dos_threshold", ikev2_anti_dos_threshold)
        if ikev2_anti_dos_threshold_variable and not isinstance(ikev2_anti_dos_threshold_variable, str):
            raise TypeError("Expected argument 'ikev2_anti_dos_threshold_variable' to be a str")
        pulumi.set(__self__, "ikev2_anti_dos_threshold_variable", ikev2_anti_dos_threshold_variable)
        if ikev2_local_ike_identity_type and not isinstance(ikev2_local_ike_identity_type, str):
            raise TypeError("Expected argument 'ikev2_local_ike_identity_type' to be a str")
        pulumi.set(__self__, "ikev2_local_ike_identity_type", ikev2_local_ike_identity_type)
        if ikev2_local_ike_identity_type_variable and not isinstance(ikev2_local_ike_identity_type_variable, str):
            raise TypeError("Expected argument 'ikev2_local_ike_identity_type_variable' to be a str")
        pulumi.set(__self__, "ikev2_local_ike_identity_type_variable", ikev2_local_ike_identity_type_variable)
        if ikev2_local_ike_identity_value and not isinstance(ikev2_local_ike_identity_value, str):
            raise TypeError("Expected argument 'ikev2_local_ike_identity_value' to be a str")
        pulumi.set(__self__, "ikev2_local_ike_identity_value", ikev2_local_ike_identity_value)
        if ikev2_local_ike_identity_value_variable and not isinstance(ikev2_local_ike_identity_value_variable, str):
            raise TypeError("Expected argument 'ikev2_local_ike_identity_value_variable' to be a str")
        pulumi.set(__self__, "ikev2_local_ike_identity_value_variable", ikev2_local_ike_identity_value_variable)
        if ikev2_security_association_lifetime and not isinstance(ikev2_security_association_lifetime, int):
            raise TypeError("Expected argument 'ikev2_security_association_lifetime' to be a int")
        pulumi.set(__self__, "ikev2_security_association_lifetime", ikev2_security_association_lifetime)
        if ikev2_security_association_lifetime_variable and not isinstance(ikev2_security_association_lifetime_variable, str):
            raise TypeError("Expected argument 'ikev2_security_association_lifetime_variable' to be a str")
        pulumi.set(__self__, "ikev2_security_association_lifetime_variable", ikev2_security_association_lifetime_variable)
        if ipsec_anti_replay_window_size and not isinstance(ipsec_anti_replay_window_size, int):
            raise TypeError("Expected argument 'ipsec_anti_replay_window_size' to be a int")
        pulumi.set(__self__, "ipsec_anti_replay_window_size", ipsec_anti_replay_window_size)
        if ipsec_anti_replay_window_size_variable and not isinstance(ipsec_anti_replay_window_size_variable, str):
            raise TypeError("Expected argument 'ipsec_anti_replay_window_size_variable' to be a str")
        pulumi.set(__self__, "ipsec_anti_replay_window_size_variable", ipsec_anti_replay_window_size_variable)
        if ipsec_enable_anti_replay and not isinstance(ipsec_enable_anti_replay, bool):
            raise TypeError("Expected argument 'ipsec_enable_anti_replay' to be a bool")
        pulumi.set(__self__, "ipsec_enable_anti_replay", ipsec_enable_anti_replay)
        if ipsec_enable_anti_replay_variable and not isinstance(ipsec_enable_anti_replay_variable, str):
            raise TypeError("Expected argument 'ipsec_enable_anti_replay_variable' to be a str")
        pulumi.set(__self__, "ipsec_enable_anti_replay_variable", ipsec_enable_anti_replay_variable)
        if ipsec_enable_perfect_foward_secrecy and not isinstance(ipsec_enable_perfect_foward_secrecy, bool):
            raise TypeError("Expected argument 'ipsec_enable_perfect_foward_secrecy' to be a bool")
        pulumi.set(__self__, "ipsec_enable_perfect_foward_secrecy", ipsec_enable_perfect_foward_secrecy)
        if ipsec_enable_perfect_foward_secrecy_variable and not isinstance(ipsec_enable_perfect_foward_secrecy_variable, str):
            raise TypeError("Expected argument 'ipsec_enable_perfect_foward_secrecy_variable' to be a str")
        pulumi.set(__self__, "ipsec_enable_perfect_foward_secrecy_variable", ipsec_enable_perfect_foward_secrecy_variable)
        if ipsec_security_association_lifetime and not isinstance(ipsec_security_association_lifetime, int):
            raise TypeError("Expected argument 'ipsec_security_association_lifetime' to be a int")
        pulumi.set(__self__, "ipsec_security_association_lifetime", ipsec_security_association_lifetime)
        if ipsec_security_association_lifetime_variable and not isinstance(ipsec_security_association_lifetime_variable, str):
            raise TypeError("Expected argument 'ipsec_security_association_lifetime_variable' to be a str")
        pulumi.set(__self__, "ipsec_security_association_lifetime_variable", ipsec_security_association_lifetime_variable)
        if ipv4_pool_size and not isinstance(ipv4_pool_size, int):
            raise TypeError("Expected argument 'ipv4_pool_size' to be a int")
        pulumi.set(__self__, "ipv4_pool_size", ipv4_pool_size)
        if ipv4_pool_size_variable and not isinstance(ipv4_pool_size_variable, str):
            raise TypeError("Expected argument 'ipv4_pool_size_variable' to be a str")
        pulumi.set(__self__, "ipv4_pool_size_variable", ipv4_pool_size_variable)
        if ipv6_pool_size and not isinstance(ipv6_pool_size, int):
            raise TypeError("Expected argument 'ipv6_pool_size' to be a int")
        pulumi.set(__self__, "ipv6_pool_size", ipv6_pool_size)
        if ipv6_pool_size_variable and not isinstance(ipv6_pool_size_variable, str):
            raise TypeError("Expected argument 'ipv6_pool_size_variable' to be a str")
        pulumi.set(__self__, "ipv6_pool_size_variable", ipv6_pool_size_variable)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if psk_authentication_pre_shared_key and not isinstance(psk_authentication_pre_shared_key, str):
            raise TypeError("Expected argument 'psk_authentication_pre_shared_key' to be a str")
        pulumi.set(__self__, "psk_authentication_pre_shared_key", psk_authentication_pre_shared_key)
        if psk_authentication_pre_shared_key_variable and not isinstance(psk_authentication_pre_shared_key_variable, str):
            raise TypeError("Expected argument 'psk_authentication_pre_shared_key_variable' to be a str")
        pulumi.set(__self__, "psk_authentication_pre_shared_key_variable", psk_authentication_pre_shared_key_variable)
        if psk_authentication_type and not isinstance(psk_authentication_type, str):
            raise TypeError("Expected argument 'psk_authentication_type' to be a str")
        pulumi.set(__self__, "psk_authentication_type", psk_authentication_type)
        if psk_authentication_type_variable and not isinstance(psk_authentication_type_variable, str):
            raise TypeError("Expected argument 'psk_authentication_type_variable' to be a str")
        pulumi.set(__self__, "psk_authentication_type_variable", psk_authentication_type_variable)
        if radius_group_name and not isinstance(radius_group_name, str):
            raise TypeError("Expected argument 'radius_group_name' to be a str")
        pulumi.set(__self__, "radius_group_name", radius_group_name)
        if radius_group_name_variable and not isinstance(radius_group_name_variable, str):
            raise TypeError("Expected argument 'radius_group_name_variable' to be a str")
        pulumi.set(__self__, "radius_group_name_variable", radius_group_name_variable)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="aaaDeriveNameFromPeerDomain")
    def aaa_derive_name_from_peer_domain(self) -> str:
        return pulumi.get(self, "aaa_derive_name_from_peer_domain")

    @property
    @pulumi.getter(name="aaaDeriveNameFromPeerDomainVariable")
    def aaa_derive_name_from_peer_domain_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "aaa_derive_name_from_peer_domain_variable")

    @property
    @pulumi.getter(name="aaaDeriveNameFromPeerIdentity")
    def aaa_derive_name_from_peer_identity(self) -> str:
        return pulumi.get(self, "aaa_derive_name_from_peer_identity")

    @property
    @pulumi.getter(name="aaaDeriveNameFromPeerIdentityVariable")
    def aaa_derive_name_from_peer_identity_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "aaa_derive_name_from_peer_identity_variable")

    @property
    @pulumi.getter(name="aaaEnableAccounting")
    def aaa_enable_accounting(self) -> bool:
        """
        Enable Accounting
        """
        return pulumi.get(self, "aaa_enable_accounting")

    @property
    @pulumi.getter(name="aaaEnableAccountingVariable")
    def aaa_enable_accounting_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "aaa_enable_accounting_variable")

    @property
    @pulumi.getter(name="aaaSpecifyNamePolicyName")
    def aaa_specify_name_policy_name(self) -> str:
        return pulumi.get(self, "aaa_specify_name_policy_name")

    @property
    @pulumi.getter(name="aaaSpecifyNamePolicyNameVariable")
    def aaa_specify_name_policy_name_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "aaa_specify_name_policy_name_variable")

    @property
    @pulumi.getter(name="aaaSpecifyNamePolicyPassword")
    def aaa_specify_name_policy_password(self) -> str:
        return pulumi.get(self, "aaa_specify_name_policy_password")

    @property
    @pulumi.getter(name="aaaSpecifyNamePolicyPasswordVariable")
    def aaa_specify_name_policy_password_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "aaa_specify_name_policy_password_variable")

    @property
    @pulumi.getter(name="anyConnectEapAuthenticationType")
    def any_connect_eap_authentication_type(self) -> str:
        return pulumi.get(self, "any_connect_eap_authentication_type")

    @property
    @pulumi.getter(name="connectionTypeSsl")
    def connection_type_ssl(self) -> bool:
        """
        Enabled SSL VPN
        """
        return pulumi.get(self, "connection_type_ssl")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the Feature
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="enableCertificateListCheck")
    def enable_certificate_list_check(self) -> bool:
        return pulumi.get(self, "enable_certificate_list_check")

    @property
    @pulumi.getter(name="enableCertificateListCheckVariable")
    def enable_certificate_list_check_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "enable_certificate_list_check_variable")

    @property
    @pulumi.getter(name="featureProfileId")
    def feature_profile_id(self) -> str:
        """
        Feature Profile ID
        """
        return pulumi.get(self, "feature_profile_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The id of the Feature
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ikev2AntiDosThreshold")
    def ikev2_anti_dos_threshold(self) -> int:
        """
        Anti-DOS Threshold
        """
        return pulumi.get(self, "ikev2_anti_dos_threshold")

    @property
    @pulumi.getter(name="ikev2AntiDosThresholdVariable")
    def ikev2_anti_dos_threshold_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "ikev2_anti_dos_threshold_variable")

    @property
    @pulumi.getter(name="ikev2LocalIkeIdentityType")
    def ikev2_local_ike_identity_type(self) -> str:
        return pulumi.get(self, "ikev2_local_ike_identity_type")

    @property
    @pulumi.getter(name="ikev2LocalIkeIdentityTypeVariable")
    def ikev2_local_ike_identity_type_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "ikev2_local_ike_identity_type_variable")

    @property
    @pulumi.getter(name="ikev2LocalIkeIdentityValue")
    def ikev2_local_ike_identity_value(self) -> str:
        return pulumi.get(self, "ikev2_local_ike_identity_value")

    @property
    @pulumi.getter(name="ikev2LocalIkeIdentityValueVariable")
    def ikev2_local_ike_identity_value_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "ikev2_local_ike_identity_value_variable")

    @property
    @pulumi.getter(name="ikev2SecurityAssociationLifetime")
    def ikev2_security_association_lifetime(self) -> int:
        """
        Security Association Lifetime in Seconds
        """
        return pulumi.get(self, "ikev2_security_association_lifetime")

    @property
    @pulumi.getter(name="ikev2SecurityAssociationLifetimeVariable")
    def ikev2_security_association_lifetime_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "ikev2_security_association_lifetime_variable")

    @property
    @pulumi.getter(name="ipsecAntiReplayWindowSize")
    def ipsec_anti_replay_window_size(self) -> int:
        """
        security Association Lifetime
        """
        return pulumi.get(self, "ipsec_anti_replay_window_size")

    @property
    @pulumi.getter(name="ipsecAntiReplayWindowSizeVariable")
    def ipsec_anti_replay_window_size_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "ipsec_anti_replay_window_size_variable")

    @property
    @pulumi.getter(name="ipsecEnableAntiReplay")
    def ipsec_enable_anti_replay(self) -> bool:
        """
        Enable Anti-Replay
        """
        return pulumi.get(self, "ipsec_enable_anti_replay")

    @property
    @pulumi.getter(name="ipsecEnableAntiReplayVariable")
    def ipsec_enable_anti_replay_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "ipsec_enable_anti_replay_variable")

    @property
    @pulumi.getter(name="ipsecEnablePerfectFowardSecrecy")
    def ipsec_enable_perfect_foward_secrecy(self) -> bool:
        """
        security Association Lifetime
        """
        return pulumi.get(self, "ipsec_enable_perfect_foward_secrecy")

    @property
    @pulumi.getter(name="ipsecEnablePerfectFowardSecrecyVariable")
    def ipsec_enable_perfect_foward_secrecy_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "ipsec_enable_perfect_foward_secrecy_variable")

    @property
    @pulumi.getter(name="ipsecSecurityAssociationLifetime")
    def ipsec_security_association_lifetime(self) -> int:
        """
        Security Association Lifetime in Seconds
        """
        return pulumi.get(self, "ipsec_security_association_lifetime")

    @property
    @pulumi.getter(name="ipsecSecurityAssociationLifetimeVariable")
    def ipsec_security_association_lifetime_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "ipsec_security_association_lifetime_variable")

    @property
    @pulumi.getter(name="ipv4PoolSize")
    def ipv4_pool_size(self) -> int:
        """
        IPv4 Pool Size
        """
        return pulumi.get(self, "ipv4_pool_size")

    @property
    @pulumi.getter(name="ipv4PoolSizeVariable")
    def ipv4_pool_size_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "ipv4_pool_size_variable")

    @property
    @pulumi.getter(name="ipv6PoolSize")
    def ipv6_pool_size(self) -> int:
        """
        IPv6 Pool Size
        """
        return pulumi.get(self, "ipv6_pool_size")

    @property
    @pulumi.getter(name="ipv6PoolSizeVariable")
    def ipv6_pool_size_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "ipv6_pool_size_variable")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the Feature
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="pskAuthenticationPreSharedKey")
    def psk_authentication_pre_shared_key(self) -> str:
        """
        PSK Pre Shared Key
        """
        return pulumi.get(self, "psk_authentication_pre_shared_key")

    @property
    @pulumi.getter(name="pskAuthenticationPreSharedKeyVariable")
    def psk_authentication_pre_shared_key_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "psk_authentication_pre_shared_key_variable")

    @property
    @pulumi.getter(name="pskAuthenticationType")
    def psk_authentication_type(self) -> str:
        """
        PSK Selection
        """
        return pulumi.get(self, "psk_authentication_type")

    @property
    @pulumi.getter(name="pskAuthenticationTypeVariable")
    def psk_authentication_type_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "psk_authentication_type_variable")

    @property
    @pulumi.getter(name="radiusGroupName")
    def radius_group_name(self) -> str:
        return pulumi.get(self, "radius_group_name")

    @property
    @pulumi.getter(name="radiusGroupNameVariable")
    def radius_group_name_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "radius_group_name_variable")

    @property
    @pulumi.getter
    def version(self) -> int:
        """
        The version of the Feature
        """
        return pulumi.get(self, "version")


class AwaitableGetSystemRemoteAccessFeatureResult(GetSystemRemoteAccessFeatureResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSystemRemoteAccessFeatureResult(
            aaa_derive_name_from_peer_domain=self.aaa_derive_name_from_peer_domain,
            aaa_derive_name_from_peer_domain_variable=self.aaa_derive_name_from_peer_domain_variable,
            aaa_derive_name_from_peer_identity=self.aaa_derive_name_from_peer_identity,
            aaa_derive_name_from_peer_identity_variable=self.aaa_derive_name_from_peer_identity_variable,
            aaa_enable_accounting=self.aaa_enable_accounting,
            aaa_enable_accounting_variable=self.aaa_enable_accounting_variable,
            aaa_specify_name_policy_name=self.aaa_specify_name_policy_name,
            aaa_specify_name_policy_name_variable=self.aaa_specify_name_policy_name_variable,
            aaa_specify_name_policy_password=self.aaa_specify_name_policy_password,
            aaa_specify_name_policy_password_variable=self.aaa_specify_name_policy_password_variable,
            any_connect_eap_authentication_type=self.any_connect_eap_authentication_type,
            connection_type_ssl=self.connection_type_ssl,
            description=self.description,
            enable_certificate_list_check=self.enable_certificate_list_check,
            enable_certificate_list_check_variable=self.enable_certificate_list_check_variable,
            feature_profile_id=self.feature_profile_id,
            id=self.id,
            ikev2_anti_dos_threshold=self.ikev2_anti_dos_threshold,
            ikev2_anti_dos_threshold_variable=self.ikev2_anti_dos_threshold_variable,
            ikev2_local_ike_identity_type=self.ikev2_local_ike_identity_type,
            ikev2_local_ike_identity_type_variable=self.ikev2_local_ike_identity_type_variable,
            ikev2_local_ike_identity_value=self.ikev2_local_ike_identity_value,
            ikev2_local_ike_identity_value_variable=self.ikev2_local_ike_identity_value_variable,
            ikev2_security_association_lifetime=self.ikev2_security_association_lifetime,
            ikev2_security_association_lifetime_variable=self.ikev2_security_association_lifetime_variable,
            ipsec_anti_replay_window_size=self.ipsec_anti_replay_window_size,
            ipsec_anti_replay_window_size_variable=self.ipsec_anti_replay_window_size_variable,
            ipsec_enable_anti_replay=self.ipsec_enable_anti_replay,
            ipsec_enable_anti_replay_variable=self.ipsec_enable_anti_replay_variable,
            ipsec_enable_perfect_foward_secrecy=self.ipsec_enable_perfect_foward_secrecy,
            ipsec_enable_perfect_foward_secrecy_variable=self.ipsec_enable_perfect_foward_secrecy_variable,
            ipsec_security_association_lifetime=self.ipsec_security_association_lifetime,
            ipsec_security_association_lifetime_variable=self.ipsec_security_association_lifetime_variable,
            ipv4_pool_size=self.ipv4_pool_size,
            ipv4_pool_size_variable=self.ipv4_pool_size_variable,
            ipv6_pool_size=self.ipv6_pool_size,
            ipv6_pool_size_variable=self.ipv6_pool_size_variable,
            name=self.name,
            psk_authentication_pre_shared_key=self.psk_authentication_pre_shared_key,
            psk_authentication_pre_shared_key_variable=self.psk_authentication_pre_shared_key_variable,
            psk_authentication_type=self.psk_authentication_type,
            psk_authentication_type_variable=self.psk_authentication_type_variable,
            radius_group_name=self.radius_group_name,
            radius_group_name_variable=self.radius_group_name_variable,
            version=self.version)


def get_system_remote_access_feature(feature_profile_id: Optional[str] = None,
                                     id: Optional[str] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSystemRemoteAccessFeatureResult:
    """
    This data source can read the System Remote Access Feature.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_system_remote_access_feature(id="f6b2c44c-693c-4763-b010-895aa3d236bd",
        feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac")
    ```


    :param str feature_profile_id: Feature Profile ID
    :param str id: The id of the Feature
    """
    __args__ = dict()
    __args__['featureProfileId'] = feature_profile_id
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('sdwan:index/getSystemRemoteAccessFeature:getSystemRemoteAccessFeature', __args__, opts=opts, typ=GetSystemRemoteAccessFeatureResult).value

    return AwaitableGetSystemRemoteAccessFeatureResult(
        aaa_derive_name_from_peer_domain=pulumi.get(__ret__, 'aaa_derive_name_from_peer_domain'),
        aaa_derive_name_from_peer_domain_variable=pulumi.get(__ret__, 'aaa_derive_name_from_peer_domain_variable'),
        aaa_derive_name_from_peer_identity=pulumi.get(__ret__, 'aaa_derive_name_from_peer_identity'),
        aaa_derive_name_from_peer_identity_variable=pulumi.get(__ret__, 'aaa_derive_name_from_peer_identity_variable'),
        aaa_enable_accounting=pulumi.get(__ret__, 'aaa_enable_accounting'),
        aaa_enable_accounting_variable=pulumi.get(__ret__, 'aaa_enable_accounting_variable'),
        aaa_specify_name_policy_name=pulumi.get(__ret__, 'aaa_specify_name_policy_name'),
        aaa_specify_name_policy_name_variable=pulumi.get(__ret__, 'aaa_specify_name_policy_name_variable'),
        aaa_specify_name_policy_password=pulumi.get(__ret__, 'aaa_specify_name_policy_password'),
        aaa_specify_name_policy_password_variable=pulumi.get(__ret__, 'aaa_specify_name_policy_password_variable'),
        any_connect_eap_authentication_type=pulumi.get(__ret__, 'any_connect_eap_authentication_type'),
        connection_type_ssl=pulumi.get(__ret__, 'connection_type_ssl'),
        description=pulumi.get(__ret__, 'description'),
        enable_certificate_list_check=pulumi.get(__ret__, 'enable_certificate_list_check'),
        enable_certificate_list_check_variable=pulumi.get(__ret__, 'enable_certificate_list_check_variable'),
        feature_profile_id=pulumi.get(__ret__, 'feature_profile_id'),
        id=pulumi.get(__ret__, 'id'),
        ikev2_anti_dos_threshold=pulumi.get(__ret__, 'ikev2_anti_dos_threshold'),
        ikev2_anti_dos_threshold_variable=pulumi.get(__ret__, 'ikev2_anti_dos_threshold_variable'),
        ikev2_local_ike_identity_type=pulumi.get(__ret__, 'ikev2_local_ike_identity_type'),
        ikev2_local_ike_identity_type_variable=pulumi.get(__ret__, 'ikev2_local_ike_identity_type_variable'),
        ikev2_local_ike_identity_value=pulumi.get(__ret__, 'ikev2_local_ike_identity_value'),
        ikev2_local_ike_identity_value_variable=pulumi.get(__ret__, 'ikev2_local_ike_identity_value_variable'),
        ikev2_security_association_lifetime=pulumi.get(__ret__, 'ikev2_security_association_lifetime'),
        ikev2_security_association_lifetime_variable=pulumi.get(__ret__, 'ikev2_security_association_lifetime_variable'),
        ipsec_anti_replay_window_size=pulumi.get(__ret__, 'ipsec_anti_replay_window_size'),
        ipsec_anti_replay_window_size_variable=pulumi.get(__ret__, 'ipsec_anti_replay_window_size_variable'),
        ipsec_enable_anti_replay=pulumi.get(__ret__, 'ipsec_enable_anti_replay'),
        ipsec_enable_anti_replay_variable=pulumi.get(__ret__, 'ipsec_enable_anti_replay_variable'),
        ipsec_enable_perfect_foward_secrecy=pulumi.get(__ret__, 'ipsec_enable_perfect_foward_secrecy'),
        ipsec_enable_perfect_foward_secrecy_variable=pulumi.get(__ret__, 'ipsec_enable_perfect_foward_secrecy_variable'),
        ipsec_security_association_lifetime=pulumi.get(__ret__, 'ipsec_security_association_lifetime'),
        ipsec_security_association_lifetime_variable=pulumi.get(__ret__, 'ipsec_security_association_lifetime_variable'),
        ipv4_pool_size=pulumi.get(__ret__, 'ipv4_pool_size'),
        ipv4_pool_size_variable=pulumi.get(__ret__, 'ipv4_pool_size_variable'),
        ipv6_pool_size=pulumi.get(__ret__, 'ipv6_pool_size'),
        ipv6_pool_size_variable=pulumi.get(__ret__, 'ipv6_pool_size_variable'),
        name=pulumi.get(__ret__, 'name'),
        psk_authentication_pre_shared_key=pulumi.get(__ret__, 'psk_authentication_pre_shared_key'),
        psk_authentication_pre_shared_key_variable=pulumi.get(__ret__, 'psk_authentication_pre_shared_key_variable'),
        psk_authentication_type=pulumi.get(__ret__, 'psk_authentication_type'),
        psk_authentication_type_variable=pulumi.get(__ret__, 'psk_authentication_type_variable'),
        radius_group_name=pulumi.get(__ret__, 'radius_group_name'),
        radius_group_name_variable=pulumi.get(__ret__, 'radius_group_name_variable'),
        version=pulumi.get(__ret__, 'version'))


@_utilities.lift_output_func(get_system_remote_access_feature)
def get_system_remote_access_feature_output(feature_profile_id: Optional[pulumi.Input[str]] = None,
                                            id: Optional[pulumi.Input[str]] = None,
                                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSystemRemoteAccessFeatureResult]:
    """
    This data source can read the System Remote Access Feature.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_system_remote_access_feature(id="f6b2c44c-693c-4763-b010-895aa3d236bd",
        feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac")
    ```


    :param str feature_profile_id: Feature Profile ID
    :param str id: The id of the Feature
    """
    ...