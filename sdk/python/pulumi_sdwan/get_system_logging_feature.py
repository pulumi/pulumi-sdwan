# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetSystemLoggingFeatureResult',
    'AwaitableGetSystemLoggingFeatureResult',
    'get_system_logging_feature',
    'get_system_logging_feature_output',
]

@pulumi.output_type
class GetSystemLoggingFeatureResult:
    """
    A collection of values returned by getSystemLoggingFeature.
    """
    def __init__(__self__, description=None, disk_enable=None, disk_enable_variable=None, disk_file_rotate=None, disk_file_rotate_variable=None, disk_file_size=None, disk_file_size_variable=None, feature_profile_id=None, id=None, ipv4_servers=None, ipv6_servers=None, name=None, tls_profiles=None, version=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if disk_enable and not isinstance(disk_enable, bool):
            raise TypeError("Expected argument 'disk_enable' to be a bool")
        pulumi.set(__self__, "disk_enable", disk_enable)
        if disk_enable_variable and not isinstance(disk_enable_variable, str):
            raise TypeError("Expected argument 'disk_enable_variable' to be a str")
        pulumi.set(__self__, "disk_enable_variable", disk_enable_variable)
        if disk_file_rotate and not isinstance(disk_file_rotate, int):
            raise TypeError("Expected argument 'disk_file_rotate' to be a int")
        pulumi.set(__self__, "disk_file_rotate", disk_file_rotate)
        if disk_file_rotate_variable and not isinstance(disk_file_rotate_variable, str):
            raise TypeError("Expected argument 'disk_file_rotate_variable' to be a str")
        pulumi.set(__self__, "disk_file_rotate_variable", disk_file_rotate_variable)
        if disk_file_size and not isinstance(disk_file_size, int):
            raise TypeError("Expected argument 'disk_file_size' to be a int")
        pulumi.set(__self__, "disk_file_size", disk_file_size)
        if disk_file_size_variable and not isinstance(disk_file_size_variable, str):
            raise TypeError("Expected argument 'disk_file_size_variable' to be a str")
        pulumi.set(__self__, "disk_file_size_variable", disk_file_size_variable)
        if feature_profile_id and not isinstance(feature_profile_id, str):
            raise TypeError("Expected argument 'feature_profile_id' to be a str")
        pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ipv4_servers and not isinstance(ipv4_servers, list):
            raise TypeError("Expected argument 'ipv4_servers' to be a list")
        pulumi.set(__self__, "ipv4_servers", ipv4_servers)
        if ipv6_servers and not isinstance(ipv6_servers, list):
            raise TypeError("Expected argument 'ipv6_servers' to be a list")
        pulumi.set(__self__, "ipv6_servers", ipv6_servers)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if tls_profiles and not isinstance(tls_profiles, list):
            raise TypeError("Expected argument 'tls_profiles' to be a list")
        pulumi.set(__self__, "tls_profiles", tls_profiles)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the Feature
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="diskEnable")
    def disk_enable(self) -> bool:
        """
        Enable logging to local disk
        """
        return pulumi.get(self, "disk_enable")

    @property
    @pulumi.getter(name="diskEnableVariable")
    def disk_enable_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "disk_enable_variable")

    @property
    @pulumi.getter(name="diskFileRotate")
    def disk_file_rotate(self) -> int:
        """
        Set number of syslog files to create before discarding oldest files
        """
        return pulumi.get(self, "disk_file_rotate")

    @property
    @pulumi.getter(name="diskFileRotateVariable")
    def disk_file_rotate_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "disk_file_rotate_variable")

    @property
    @pulumi.getter(name="diskFileSize")
    def disk_file_size(self) -> int:
        """
        Set maximum size of file before it is rotated
        """
        return pulumi.get(self, "disk_file_size")

    @property
    @pulumi.getter(name="diskFileSizeVariable")
    def disk_file_size_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "disk_file_size_variable")

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
    @pulumi.getter(name="ipv4Servers")
    def ipv4_servers(self) -> Sequence['outputs.GetSystemLoggingFeatureIpv4ServerResult']:
        """
        Enable logging to remote server
        """
        return pulumi.get(self, "ipv4_servers")

    @property
    @pulumi.getter(name="ipv6Servers")
    def ipv6_servers(self) -> Sequence['outputs.GetSystemLoggingFeatureIpv6ServerResult']:
        """
        Enable logging to remote ipv6 server
        """
        return pulumi.get(self, "ipv6_servers")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the Feature
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="tlsProfiles")
    def tls_profiles(self) -> Sequence['outputs.GetSystemLoggingFeatureTlsProfileResult']:
        """
        Configure a TLS profile
        """
        return pulumi.get(self, "tls_profiles")

    @property
    @pulumi.getter
    def version(self) -> int:
        """
        The version of the Feature
        """
        return pulumi.get(self, "version")


class AwaitableGetSystemLoggingFeatureResult(GetSystemLoggingFeatureResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSystemLoggingFeatureResult(
            description=self.description,
            disk_enable=self.disk_enable,
            disk_enable_variable=self.disk_enable_variable,
            disk_file_rotate=self.disk_file_rotate,
            disk_file_rotate_variable=self.disk_file_rotate_variable,
            disk_file_size=self.disk_file_size,
            disk_file_size_variable=self.disk_file_size_variable,
            feature_profile_id=self.feature_profile_id,
            id=self.id,
            ipv4_servers=self.ipv4_servers,
            ipv6_servers=self.ipv6_servers,
            name=self.name,
            tls_profiles=self.tls_profiles,
            version=self.version)


def get_system_logging_feature(feature_profile_id: Optional[str] = None,
                               id: Optional[str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSystemLoggingFeatureResult:
    """
    This data source can read the System Logging Feature.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_system_logging_feature(id="f6b2c44c-693c-4763-b010-895aa3d236bd",
        feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac")
    ```


    :param str feature_profile_id: Feature Profile ID
    :param str id: The id of the Feature
    """
    __args__ = dict()
    __args__['featureProfileId'] = feature_profile_id
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('sdwan:index/getSystemLoggingFeature:getSystemLoggingFeature', __args__, opts=opts, typ=GetSystemLoggingFeatureResult).value

    return AwaitableGetSystemLoggingFeatureResult(
        description=pulumi.get(__ret__, 'description'),
        disk_enable=pulumi.get(__ret__, 'disk_enable'),
        disk_enable_variable=pulumi.get(__ret__, 'disk_enable_variable'),
        disk_file_rotate=pulumi.get(__ret__, 'disk_file_rotate'),
        disk_file_rotate_variable=pulumi.get(__ret__, 'disk_file_rotate_variable'),
        disk_file_size=pulumi.get(__ret__, 'disk_file_size'),
        disk_file_size_variable=pulumi.get(__ret__, 'disk_file_size_variable'),
        feature_profile_id=pulumi.get(__ret__, 'feature_profile_id'),
        id=pulumi.get(__ret__, 'id'),
        ipv4_servers=pulumi.get(__ret__, 'ipv4_servers'),
        ipv6_servers=pulumi.get(__ret__, 'ipv6_servers'),
        name=pulumi.get(__ret__, 'name'),
        tls_profiles=pulumi.get(__ret__, 'tls_profiles'),
        version=pulumi.get(__ret__, 'version'))


@_utilities.lift_output_func(get_system_logging_feature)
def get_system_logging_feature_output(feature_profile_id: Optional[pulumi.Input[str]] = None,
                                      id: Optional[pulumi.Input[str]] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSystemLoggingFeatureResult]:
    """
    This data source can read the System Logging Feature.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_system_logging_feature(id="f6b2c44c-693c-4763-b010-895aa3d236bd",
        feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac")
    ```


    :param str feature_profile_id: Feature Profile ID
    :param str id: The id of the Feature
    """
    ...