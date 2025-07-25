# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs

__all__ = [
    'GetSystemNtpFeatureResult',
    'AwaitableGetSystemNtpFeatureResult',
    'get_system_ntp_feature',
    'get_system_ntp_feature_output',
]

@pulumi.output_type
class GetSystemNtpFeatureResult:
    """
    A collection of values returned by getSystemNtpFeature.
    """
    def __init__(__self__, authentication_keys=None, authoritative_ntp_server=None, authoritative_ntp_server_variable=None, description=None, feature_profile_id=None, id=None, name=None, servers=None, source_interface=None, source_interface_variable=None, stratum=None, stratum_variable=None, trusted_keys=None, trusted_keys_variable=None, version=None):
        if authentication_keys and not isinstance(authentication_keys, list):
            raise TypeError("Expected argument 'authentication_keys' to be a list")
        pulumi.set(__self__, "authentication_keys", authentication_keys)
        if authoritative_ntp_server and not isinstance(authoritative_ntp_server, bool):
            raise TypeError("Expected argument 'authoritative_ntp_server' to be a bool")
        pulumi.set(__self__, "authoritative_ntp_server", authoritative_ntp_server)
        if authoritative_ntp_server_variable and not isinstance(authoritative_ntp_server_variable, str):
            raise TypeError("Expected argument 'authoritative_ntp_server_variable' to be a str")
        pulumi.set(__self__, "authoritative_ntp_server_variable", authoritative_ntp_server_variable)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if feature_profile_id and not isinstance(feature_profile_id, str):
            raise TypeError("Expected argument 'feature_profile_id' to be a str")
        pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if servers and not isinstance(servers, list):
            raise TypeError("Expected argument 'servers' to be a list")
        pulumi.set(__self__, "servers", servers)
        if source_interface and not isinstance(source_interface, str):
            raise TypeError("Expected argument 'source_interface' to be a str")
        pulumi.set(__self__, "source_interface", source_interface)
        if source_interface_variable and not isinstance(source_interface_variable, str):
            raise TypeError("Expected argument 'source_interface_variable' to be a str")
        pulumi.set(__self__, "source_interface_variable", source_interface_variable)
        if stratum and not isinstance(stratum, int):
            raise TypeError("Expected argument 'stratum' to be a int")
        pulumi.set(__self__, "stratum", stratum)
        if stratum_variable and not isinstance(stratum_variable, str):
            raise TypeError("Expected argument 'stratum_variable' to be a str")
        pulumi.set(__self__, "stratum_variable", stratum_variable)
        if trusted_keys and not isinstance(trusted_keys, list):
            raise TypeError("Expected argument 'trusted_keys' to be a list")
        pulumi.set(__self__, "trusted_keys", trusted_keys)
        if trusted_keys_variable and not isinstance(trusted_keys_variable, str):
            raise TypeError("Expected argument 'trusted_keys_variable' to be a str")
        pulumi.set(__self__, "trusted_keys_variable", trusted_keys_variable)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)

    @_builtins.property
    @pulumi.getter(name="authenticationKeys")
    def authentication_keys(self) -> Sequence['outputs.GetSystemNtpFeatureAuthenticationKeyResult']:
        """
        Set MD5 authentication key
        """
        return pulumi.get(self, "authentication_keys")

    @_builtins.property
    @pulumi.getter(name="authoritativeNtpServer")
    def authoritative_ntp_server(self) -> _builtins.bool:
        """
        Enable device as NTP Leader
        """
        return pulumi.get(self, "authoritative_ntp_server")

    @_builtins.property
    @pulumi.getter(name="authoritativeNtpServerVariable")
    def authoritative_ntp_server_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "authoritative_ntp_server_variable")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        The description of the Feature
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="featureProfileId")
    def feature_profile_id(self) -> _builtins.str:
        """
        Feature Profile ID
        """
        return pulumi.get(self, "feature_profile_id")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The id of the Feature
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The name of the Feature
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def servers(self) -> Sequence['outputs.GetSystemNtpFeatureServerResult']:
        """
        Configure NTP servers
        """
        return pulumi.get(self, "servers")

    @_builtins.property
    @pulumi.getter(name="sourceInterface")
    def source_interface(self) -> _builtins.str:
        """
        Enable device as NTP Leader
        """
        return pulumi.get(self, "source_interface")

    @_builtins.property
    @pulumi.getter(name="sourceInterfaceVariable")
    def source_interface_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "source_interface_variable")

    @_builtins.property
    @pulumi.getter
    def stratum(self) -> _builtins.int:
        """
        Enable device as NTP Leader
        """
        return pulumi.get(self, "stratum")

    @_builtins.property
    @pulumi.getter(name="stratumVariable")
    def stratum_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "stratum_variable")

    @_builtins.property
    @pulumi.getter(name="trustedKeys")
    def trusted_keys(self) -> Sequence[_builtins.int]:
        """
        Designate authentication key as trustworthy
        """
        return pulumi.get(self, "trusted_keys")

    @_builtins.property
    @pulumi.getter(name="trustedKeysVariable")
    def trusted_keys_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "trusted_keys_variable")

    @_builtins.property
    @pulumi.getter
    def version(self) -> _builtins.int:
        """
        The version of the Feature
        """
        return pulumi.get(self, "version")


class AwaitableGetSystemNtpFeatureResult(GetSystemNtpFeatureResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSystemNtpFeatureResult(
            authentication_keys=self.authentication_keys,
            authoritative_ntp_server=self.authoritative_ntp_server,
            authoritative_ntp_server_variable=self.authoritative_ntp_server_variable,
            description=self.description,
            feature_profile_id=self.feature_profile_id,
            id=self.id,
            name=self.name,
            servers=self.servers,
            source_interface=self.source_interface,
            source_interface_variable=self.source_interface_variable,
            stratum=self.stratum,
            stratum_variable=self.stratum_variable,
            trusted_keys=self.trusted_keys,
            trusted_keys_variable=self.trusted_keys_variable,
            version=self.version)


def get_system_ntp_feature(feature_profile_id: Optional[_builtins.str] = None,
                           id: Optional[_builtins.str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSystemNtpFeatureResult:
    """
    This data source can read the System NTP Feature.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_system_ntp_feature(id="f6b2c44c-693c-4763-b010-895aa3d236bd",
        feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac")
    ```


    :param _builtins.str feature_profile_id: Feature Profile ID
    :param _builtins.str id: The id of the Feature
    """
    __args__ = dict()
    __args__['featureProfileId'] = feature_profile_id
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('sdwan:index/getSystemNtpFeature:getSystemNtpFeature', __args__, opts=opts, typ=GetSystemNtpFeatureResult).value

    return AwaitableGetSystemNtpFeatureResult(
        authentication_keys=pulumi.get(__ret__, 'authentication_keys'),
        authoritative_ntp_server=pulumi.get(__ret__, 'authoritative_ntp_server'),
        authoritative_ntp_server_variable=pulumi.get(__ret__, 'authoritative_ntp_server_variable'),
        description=pulumi.get(__ret__, 'description'),
        feature_profile_id=pulumi.get(__ret__, 'feature_profile_id'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        servers=pulumi.get(__ret__, 'servers'),
        source_interface=pulumi.get(__ret__, 'source_interface'),
        source_interface_variable=pulumi.get(__ret__, 'source_interface_variable'),
        stratum=pulumi.get(__ret__, 'stratum'),
        stratum_variable=pulumi.get(__ret__, 'stratum_variable'),
        trusted_keys=pulumi.get(__ret__, 'trusted_keys'),
        trusted_keys_variable=pulumi.get(__ret__, 'trusted_keys_variable'),
        version=pulumi.get(__ret__, 'version'))
def get_system_ntp_feature_output(feature_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
                                  id: Optional[pulumi.Input[_builtins.str]] = None,
                                  opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSystemNtpFeatureResult]:
    """
    This data source can read the System NTP Feature.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_system_ntp_feature(id="f6b2c44c-693c-4763-b010-895aa3d236bd",
        feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac")
    ```


    :param _builtins.str feature_profile_id: Feature Profile ID
    :param _builtins.str id: The id of the Feature
    """
    __args__ = dict()
    __args__['featureProfileId'] = feature_profile_id
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('sdwan:index/getSystemNtpFeature:getSystemNtpFeature', __args__, opts=opts, typ=GetSystemNtpFeatureResult)
    return __ret__.apply(lambda __response__: GetSystemNtpFeatureResult(
        authentication_keys=pulumi.get(__response__, 'authentication_keys'),
        authoritative_ntp_server=pulumi.get(__response__, 'authoritative_ntp_server'),
        authoritative_ntp_server_variable=pulumi.get(__response__, 'authoritative_ntp_server_variable'),
        description=pulumi.get(__response__, 'description'),
        feature_profile_id=pulumi.get(__response__, 'feature_profile_id'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        servers=pulumi.get(__response__, 'servers'),
        source_interface=pulumi.get(__response__, 'source_interface'),
        source_interface_variable=pulumi.get(__response__, 'source_interface_variable'),
        stratum=pulumi.get(__response__, 'stratum'),
        stratum_variable=pulumi.get(__response__, 'stratum_variable'),
        trusted_keys=pulumi.get(__response__, 'trusted_keys'),
        trusted_keys_variable=pulumi.get(__response__, 'trusted_keys_variable'),
        version=pulumi.get(__response__, 'version')))
