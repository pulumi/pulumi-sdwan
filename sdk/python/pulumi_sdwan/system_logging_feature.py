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
from ._inputs import *

__all__ = ['SystemLoggingFeatureArgs', 'SystemLoggingFeature']

@pulumi.input_type
class SystemLoggingFeatureArgs:
    def __init__(__self__, *,
                 feature_profile_id: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 disk_enable: Optional[pulumi.Input[_builtins.bool]] = None,
                 disk_enable_variable: Optional[pulumi.Input[_builtins.str]] = None,
                 disk_file_rotate: Optional[pulumi.Input[_builtins.int]] = None,
                 disk_file_rotate_variable: Optional[pulumi.Input[_builtins.str]] = None,
                 disk_file_size: Optional[pulumi.Input[_builtins.int]] = None,
                 disk_file_size_variable: Optional[pulumi.Input[_builtins.str]] = None,
                 ipv4_servers: Optional[pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureIpv4ServerArgs']]]] = None,
                 ipv6_servers: Optional[pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureIpv6ServerArgs']]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tls_profiles: Optional[pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureTlsProfileArgs']]]] = None):
        """
        The set of arguments for constructing a SystemLoggingFeature resource.
        :param pulumi.Input[_builtins.str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[_builtins.str] description: The description of the Feature
        :param pulumi.Input[_builtins.bool] disk_enable: Enable logging to local disk - Default value: `true`
        :param pulumi.Input[_builtins.str] disk_enable_variable: Variable name
        :param pulumi.Input[_builtins.int] disk_file_rotate: Set number of syslog files to create before discarding oldest files - Range: `1`-`10` - Default value: `10`
        :param pulumi.Input[_builtins.str] disk_file_rotate_variable: Variable name
        :param pulumi.Input[_builtins.int] disk_file_size: Set maximum size of file before it is rotated - Range: `1`-`20` - Default value: `10`
        :param pulumi.Input[_builtins.str] disk_file_size_variable: Variable name
        :param pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureIpv4ServerArgs']]] ipv4_servers: Enable logging to remote server
        :param pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureIpv6ServerArgs']]] ipv6_servers: Enable logging to remote ipv6 server
        :param pulumi.Input[_builtins.str] name: The name of the Feature
        :param pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureTlsProfileArgs']]] tls_profiles: Configure a TLS profile
        """
        pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if disk_enable is not None:
            pulumi.set(__self__, "disk_enable", disk_enable)
        if disk_enable_variable is not None:
            pulumi.set(__self__, "disk_enable_variable", disk_enable_variable)
        if disk_file_rotate is not None:
            pulumi.set(__self__, "disk_file_rotate", disk_file_rotate)
        if disk_file_rotate_variable is not None:
            pulumi.set(__self__, "disk_file_rotate_variable", disk_file_rotate_variable)
        if disk_file_size is not None:
            pulumi.set(__self__, "disk_file_size", disk_file_size)
        if disk_file_size_variable is not None:
            pulumi.set(__self__, "disk_file_size_variable", disk_file_size_variable)
        if ipv4_servers is not None:
            pulumi.set(__self__, "ipv4_servers", ipv4_servers)
        if ipv6_servers is not None:
            pulumi.set(__self__, "ipv6_servers", ipv6_servers)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tls_profiles is not None:
            pulumi.set(__self__, "tls_profiles", tls_profiles)

    @_builtins.property
    @pulumi.getter(name="featureProfileId")
    def feature_profile_id(self) -> pulumi.Input[_builtins.str]:
        """
        Feature Profile ID
        """
        return pulumi.get(self, "feature_profile_id")

    @feature_profile_id.setter
    def feature_profile_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "feature_profile_id", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the Feature
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="diskEnable")
    def disk_enable(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Enable logging to local disk - Default value: `true`
        """
        return pulumi.get(self, "disk_enable")

    @disk_enable.setter
    def disk_enable(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "disk_enable", value)

    @_builtins.property
    @pulumi.getter(name="diskEnableVariable")
    def disk_enable_variable(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Variable name
        """
        return pulumi.get(self, "disk_enable_variable")

    @disk_enable_variable.setter
    def disk_enable_variable(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "disk_enable_variable", value)

    @_builtins.property
    @pulumi.getter(name="diskFileRotate")
    def disk_file_rotate(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Set number of syslog files to create before discarding oldest files - Range: `1`-`10` - Default value: `10`
        """
        return pulumi.get(self, "disk_file_rotate")

    @disk_file_rotate.setter
    def disk_file_rotate(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "disk_file_rotate", value)

    @_builtins.property
    @pulumi.getter(name="diskFileRotateVariable")
    def disk_file_rotate_variable(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Variable name
        """
        return pulumi.get(self, "disk_file_rotate_variable")

    @disk_file_rotate_variable.setter
    def disk_file_rotate_variable(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "disk_file_rotate_variable", value)

    @_builtins.property
    @pulumi.getter(name="diskFileSize")
    def disk_file_size(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Set maximum size of file before it is rotated - Range: `1`-`20` - Default value: `10`
        """
        return pulumi.get(self, "disk_file_size")

    @disk_file_size.setter
    def disk_file_size(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "disk_file_size", value)

    @_builtins.property
    @pulumi.getter(name="diskFileSizeVariable")
    def disk_file_size_variable(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Variable name
        """
        return pulumi.get(self, "disk_file_size_variable")

    @disk_file_size_variable.setter
    def disk_file_size_variable(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "disk_file_size_variable", value)

    @_builtins.property
    @pulumi.getter(name="ipv4Servers")
    def ipv4_servers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureIpv4ServerArgs']]]]:
        """
        Enable logging to remote server
        """
        return pulumi.get(self, "ipv4_servers")

    @ipv4_servers.setter
    def ipv4_servers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureIpv4ServerArgs']]]]):
        pulumi.set(self, "ipv4_servers", value)

    @_builtins.property
    @pulumi.getter(name="ipv6Servers")
    def ipv6_servers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureIpv6ServerArgs']]]]:
        """
        Enable logging to remote ipv6 server
        """
        return pulumi.get(self, "ipv6_servers")

    @ipv6_servers.setter
    def ipv6_servers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureIpv6ServerArgs']]]]):
        pulumi.set(self, "ipv6_servers", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Feature
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="tlsProfiles")
    def tls_profiles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureTlsProfileArgs']]]]:
        """
        Configure a TLS profile
        """
        return pulumi.get(self, "tls_profiles")

    @tls_profiles.setter
    def tls_profiles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureTlsProfileArgs']]]]):
        pulumi.set(self, "tls_profiles", value)


@pulumi.input_type
class _SystemLoggingFeatureState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 disk_enable: Optional[pulumi.Input[_builtins.bool]] = None,
                 disk_enable_variable: Optional[pulumi.Input[_builtins.str]] = None,
                 disk_file_rotate: Optional[pulumi.Input[_builtins.int]] = None,
                 disk_file_rotate_variable: Optional[pulumi.Input[_builtins.str]] = None,
                 disk_file_size: Optional[pulumi.Input[_builtins.int]] = None,
                 disk_file_size_variable: Optional[pulumi.Input[_builtins.str]] = None,
                 feature_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
                 ipv4_servers: Optional[pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureIpv4ServerArgs']]]] = None,
                 ipv6_servers: Optional[pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureIpv6ServerArgs']]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tls_profiles: Optional[pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureTlsProfileArgs']]]] = None,
                 version: Optional[pulumi.Input[_builtins.int]] = None):
        """
        Input properties used for looking up and filtering SystemLoggingFeature resources.
        :param pulumi.Input[_builtins.str] description: The description of the Feature
        :param pulumi.Input[_builtins.bool] disk_enable: Enable logging to local disk - Default value: `true`
        :param pulumi.Input[_builtins.str] disk_enable_variable: Variable name
        :param pulumi.Input[_builtins.int] disk_file_rotate: Set number of syslog files to create before discarding oldest files - Range: `1`-`10` - Default value: `10`
        :param pulumi.Input[_builtins.str] disk_file_rotate_variable: Variable name
        :param pulumi.Input[_builtins.int] disk_file_size: Set maximum size of file before it is rotated - Range: `1`-`20` - Default value: `10`
        :param pulumi.Input[_builtins.str] disk_file_size_variable: Variable name
        :param pulumi.Input[_builtins.str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureIpv4ServerArgs']]] ipv4_servers: Enable logging to remote server
        :param pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureIpv6ServerArgs']]] ipv6_servers: Enable logging to remote ipv6 server
        :param pulumi.Input[_builtins.str] name: The name of the Feature
        :param pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureTlsProfileArgs']]] tls_profiles: Configure a TLS profile
        :param pulumi.Input[_builtins.int] version: The version of the Feature
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if disk_enable is not None:
            pulumi.set(__self__, "disk_enable", disk_enable)
        if disk_enable_variable is not None:
            pulumi.set(__self__, "disk_enable_variable", disk_enable_variable)
        if disk_file_rotate is not None:
            pulumi.set(__self__, "disk_file_rotate", disk_file_rotate)
        if disk_file_rotate_variable is not None:
            pulumi.set(__self__, "disk_file_rotate_variable", disk_file_rotate_variable)
        if disk_file_size is not None:
            pulumi.set(__self__, "disk_file_size", disk_file_size)
        if disk_file_size_variable is not None:
            pulumi.set(__self__, "disk_file_size_variable", disk_file_size_variable)
        if feature_profile_id is not None:
            pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if ipv4_servers is not None:
            pulumi.set(__self__, "ipv4_servers", ipv4_servers)
        if ipv6_servers is not None:
            pulumi.set(__self__, "ipv6_servers", ipv6_servers)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tls_profiles is not None:
            pulumi.set(__self__, "tls_profiles", tls_profiles)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the Feature
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="diskEnable")
    def disk_enable(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Enable logging to local disk - Default value: `true`
        """
        return pulumi.get(self, "disk_enable")

    @disk_enable.setter
    def disk_enable(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "disk_enable", value)

    @_builtins.property
    @pulumi.getter(name="diskEnableVariable")
    def disk_enable_variable(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Variable name
        """
        return pulumi.get(self, "disk_enable_variable")

    @disk_enable_variable.setter
    def disk_enable_variable(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "disk_enable_variable", value)

    @_builtins.property
    @pulumi.getter(name="diskFileRotate")
    def disk_file_rotate(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Set number of syslog files to create before discarding oldest files - Range: `1`-`10` - Default value: `10`
        """
        return pulumi.get(self, "disk_file_rotate")

    @disk_file_rotate.setter
    def disk_file_rotate(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "disk_file_rotate", value)

    @_builtins.property
    @pulumi.getter(name="diskFileRotateVariable")
    def disk_file_rotate_variable(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Variable name
        """
        return pulumi.get(self, "disk_file_rotate_variable")

    @disk_file_rotate_variable.setter
    def disk_file_rotate_variable(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "disk_file_rotate_variable", value)

    @_builtins.property
    @pulumi.getter(name="diskFileSize")
    def disk_file_size(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Set maximum size of file before it is rotated - Range: `1`-`20` - Default value: `10`
        """
        return pulumi.get(self, "disk_file_size")

    @disk_file_size.setter
    def disk_file_size(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "disk_file_size", value)

    @_builtins.property
    @pulumi.getter(name="diskFileSizeVariable")
    def disk_file_size_variable(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Variable name
        """
        return pulumi.get(self, "disk_file_size_variable")

    @disk_file_size_variable.setter
    def disk_file_size_variable(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "disk_file_size_variable", value)

    @_builtins.property
    @pulumi.getter(name="featureProfileId")
    def feature_profile_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Feature Profile ID
        """
        return pulumi.get(self, "feature_profile_id")

    @feature_profile_id.setter
    def feature_profile_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "feature_profile_id", value)

    @_builtins.property
    @pulumi.getter(name="ipv4Servers")
    def ipv4_servers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureIpv4ServerArgs']]]]:
        """
        Enable logging to remote server
        """
        return pulumi.get(self, "ipv4_servers")

    @ipv4_servers.setter
    def ipv4_servers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureIpv4ServerArgs']]]]):
        pulumi.set(self, "ipv4_servers", value)

    @_builtins.property
    @pulumi.getter(name="ipv6Servers")
    def ipv6_servers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureIpv6ServerArgs']]]]:
        """
        Enable logging to remote ipv6 server
        """
        return pulumi.get(self, "ipv6_servers")

    @ipv6_servers.setter
    def ipv6_servers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureIpv6ServerArgs']]]]):
        pulumi.set(self, "ipv6_servers", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Feature
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="tlsProfiles")
    def tls_profiles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureTlsProfileArgs']]]]:
        """
        Configure a TLS profile
        """
        return pulumi.get(self, "tls_profiles")

    @tls_profiles.setter
    def tls_profiles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SystemLoggingFeatureTlsProfileArgs']]]]):
        pulumi.set(self, "tls_profiles", value)

    @_builtins.property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The version of the Feature
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "version", value)


@pulumi.type_token("sdwan:index/systemLoggingFeature:SystemLoggingFeature")
class SystemLoggingFeature(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 disk_enable: Optional[pulumi.Input[_builtins.bool]] = None,
                 disk_enable_variable: Optional[pulumi.Input[_builtins.str]] = None,
                 disk_file_rotate: Optional[pulumi.Input[_builtins.int]] = None,
                 disk_file_rotate_variable: Optional[pulumi.Input[_builtins.str]] = None,
                 disk_file_size: Optional[pulumi.Input[_builtins.int]] = None,
                 disk_file_size_variable: Optional[pulumi.Input[_builtins.str]] = None,
                 feature_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
                 ipv4_servers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SystemLoggingFeatureIpv4ServerArgs', 'SystemLoggingFeatureIpv4ServerArgsDict']]]]] = None,
                 ipv6_servers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SystemLoggingFeatureIpv6ServerArgs', 'SystemLoggingFeatureIpv6ServerArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tls_profiles: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SystemLoggingFeatureTlsProfileArgs', 'SystemLoggingFeatureTlsProfileArgsDict']]]]] = None,
                 __props__=None):
        """
        This resource can manage a System Logging Feature.
          - Minimum SD-WAN Manager version: `20.12.0`

        ## Import

        The `pulumi import` command can be used, for example:

        Expected import identifier with the format: "system_logging_feature_id,feature_profile_id"

        ```sh
        $ pulumi import sdwan:index/systemLoggingFeature:SystemLoggingFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: The description of the Feature
        :param pulumi.Input[_builtins.bool] disk_enable: Enable logging to local disk - Default value: `true`
        :param pulumi.Input[_builtins.str] disk_enable_variable: Variable name
        :param pulumi.Input[_builtins.int] disk_file_rotate: Set number of syslog files to create before discarding oldest files - Range: `1`-`10` - Default value: `10`
        :param pulumi.Input[_builtins.str] disk_file_rotate_variable: Variable name
        :param pulumi.Input[_builtins.int] disk_file_size: Set maximum size of file before it is rotated - Range: `1`-`20` - Default value: `10`
        :param pulumi.Input[_builtins.str] disk_file_size_variable: Variable name
        :param pulumi.Input[_builtins.str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[Sequence[pulumi.Input[Union['SystemLoggingFeatureIpv4ServerArgs', 'SystemLoggingFeatureIpv4ServerArgsDict']]]] ipv4_servers: Enable logging to remote server
        :param pulumi.Input[Sequence[pulumi.Input[Union['SystemLoggingFeatureIpv6ServerArgs', 'SystemLoggingFeatureIpv6ServerArgsDict']]]] ipv6_servers: Enable logging to remote ipv6 server
        :param pulumi.Input[_builtins.str] name: The name of the Feature
        :param pulumi.Input[Sequence[pulumi.Input[Union['SystemLoggingFeatureTlsProfileArgs', 'SystemLoggingFeatureTlsProfileArgsDict']]]] tls_profiles: Configure a TLS profile
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SystemLoggingFeatureArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage a System Logging Feature.
          - Minimum SD-WAN Manager version: `20.12.0`

        ## Import

        The `pulumi import` command can be used, for example:

        Expected import identifier with the format: "system_logging_feature_id,feature_profile_id"

        ```sh
        $ pulumi import sdwan:index/systemLoggingFeature:SystemLoggingFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"
        ```

        :param str resource_name: The name of the resource.
        :param SystemLoggingFeatureArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SystemLoggingFeatureArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 disk_enable: Optional[pulumi.Input[_builtins.bool]] = None,
                 disk_enable_variable: Optional[pulumi.Input[_builtins.str]] = None,
                 disk_file_rotate: Optional[pulumi.Input[_builtins.int]] = None,
                 disk_file_rotate_variable: Optional[pulumi.Input[_builtins.str]] = None,
                 disk_file_size: Optional[pulumi.Input[_builtins.int]] = None,
                 disk_file_size_variable: Optional[pulumi.Input[_builtins.str]] = None,
                 feature_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
                 ipv4_servers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SystemLoggingFeatureIpv4ServerArgs', 'SystemLoggingFeatureIpv4ServerArgsDict']]]]] = None,
                 ipv6_servers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SystemLoggingFeatureIpv6ServerArgs', 'SystemLoggingFeatureIpv6ServerArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tls_profiles: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SystemLoggingFeatureTlsProfileArgs', 'SystemLoggingFeatureTlsProfileArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SystemLoggingFeatureArgs.__new__(SystemLoggingFeatureArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["disk_enable"] = disk_enable
            __props__.__dict__["disk_enable_variable"] = disk_enable_variable
            __props__.__dict__["disk_file_rotate"] = disk_file_rotate
            __props__.__dict__["disk_file_rotate_variable"] = disk_file_rotate_variable
            __props__.__dict__["disk_file_size"] = disk_file_size
            __props__.__dict__["disk_file_size_variable"] = disk_file_size_variable
            if feature_profile_id is None and not opts.urn:
                raise TypeError("Missing required property 'feature_profile_id'")
            __props__.__dict__["feature_profile_id"] = feature_profile_id
            __props__.__dict__["ipv4_servers"] = ipv4_servers
            __props__.__dict__["ipv6_servers"] = ipv6_servers
            __props__.__dict__["name"] = name
            __props__.__dict__["tls_profiles"] = tls_profiles
            __props__.__dict__["version"] = None
        super(SystemLoggingFeature, __self__).__init__(
            'sdwan:index/systemLoggingFeature:SystemLoggingFeature',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            disk_enable: Optional[pulumi.Input[_builtins.bool]] = None,
            disk_enable_variable: Optional[pulumi.Input[_builtins.str]] = None,
            disk_file_rotate: Optional[pulumi.Input[_builtins.int]] = None,
            disk_file_rotate_variable: Optional[pulumi.Input[_builtins.str]] = None,
            disk_file_size: Optional[pulumi.Input[_builtins.int]] = None,
            disk_file_size_variable: Optional[pulumi.Input[_builtins.str]] = None,
            feature_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
            ipv4_servers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SystemLoggingFeatureIpv4ServerArgs', 'SystemLoggingFeatureIpv4ServerArgsDict']]]]] = None,
            ipv6_servers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SystemLoggingFeatureIpv6ServerArgs', 'SystemLoggingFeatureIpv6ServerArgsDict']]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            tls_profiles: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SystemLoggingFeatureTlsProfileArgs', 'SystemLoggingFeatureTlsProfileArgsDict']]]]] = None,
            version: Optional[pulumi.Input[_builtins.int]] = None) -> 'SystemLoggingFeature':
        """
        Get an existing SystemLoggingFeature resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: The description of the Feature
        :param pulumi.Input[_builtins.bool] disk_enable: Enable logging to local disk - Default value: `true`
        :param pulumi.Input[_builtins.str] disk_enable_variable: Variable name
        :param pulumi.Input[_builtins.int] disk_file_rotate: Set number of syslog files to create before discarding oldest files - Range: `1`-`10` - Default value: `10`
        :param pulumi.Input[_builtins.str] disk_file_rotate_variable: Variable name
        :param pulumi.Input[_builtins.int] disk_file_size: Set maximum size of file before it is rotated - Range: `1`-`20` - Default value: `10`
        :param pulumi.Input[_builtins.str] disk_file_size_variable: Variable name
        :param pulumi.Input[_builtins.str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[Sequence[pulumi.Input[Union['SystemLoggingFeatureIpv4ServerArgs', 'SystemLoggingFeatureIpv4ServerArgsDict']]]] ipv4_servers: Enable logging to remote server
        :param pulumi.Input[Sequence[pulumi.Input[Union['SystemLoggingFeatureIpv6ServerArgs', 'SystemLoggingFeatureIpv6ServerArgsDict']]]] ipv6_servers: Enable logging to remote ipv6 server
        :param pulumi.Input[_builtins.str] name: The name of the Feature
        :param pulumi.Input[Sequence[pulumi.Input[Union['SystemLoggingFeatureTlsProfileArgs', 'SystemLoggingFeatureTlsProfileArgsDict']]]] tls_profiles: Configure a TLS profile
        :param pulumi.Input[_builtins.int] version: The version of the Feature
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SystemLoggingFeatureState.__new__(_SystemLoggingFeatureState)

        __props__.__dict__["description"] = description
        __props__.__dict__["disk_enable"] = disk_enable
        __props__.__dict__["disk_enable_variable"] = disk_enable_variable
        __props__.__dict__["disk_file_rotate"] = disk_file_rotate
        __props__.__dict__["disk_file_rotate_variable"] = disk_file_rotate_variable
        __props__.__dict__["disk_file_size"] = disk_file_size
        __props__.__dict__["disk_file_size_variable"] = disk_file_size_variable
        __props__.__dict__["feature_profile_id"] = feature_profile_id
        __props__.__dict__["ipv4_servers"] = ipv4_servers
        __props__.__dict__["ipv6_servers"] = ipv6_servers
        __props__.__dict__["name"] = name
        __props__.__dict__["tls_profiles"] = tls_profiles
        __props__.__dict__["version"] = version
        return SystemLoggingFeature(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description of the Feature
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="diskEnable")
    def disk_enable(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Enable logging to local disk - Default value: `true`
        """
        return pulumi.get(self, "disk_enable")

    @_builtins.property
    @pulumi.getter(name="diskEnableVariable")
    def disk_enable_variable(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Variable name
        """
        return pulumi.get(self, "disk_enable_variable")

    @_builtins.property
    @pulumi.getter(name="diskFileRotate")
    def disk_file_rotate(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        Set number of syslog files to create before discarding oldest files - Range: `1`-`10` - Default value: `10`
        """
        return pulumi.get(self, "disk_file_rotate")

    @_builtins.property
    @pulumi.getter(name="diskFileRotateVariable")
    def disk_file_rotate_variable(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Variable name
        """
        return pulumi.get(self, "disk_file_rotate_variable")

    @_builtins.property
    @pulumi.getter(name="diskFileSize")
    def disk_file_size(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        Set maximum size of file before it is rotated - Range: `1`-`20` - Default value: `10`
        """
        return pulumi.get(self, "disk_file_size")

    @_builtins.property
    @pulumi.getter(name="diskFileSizeVariable")
    def disk_file_size_variable(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Variable name
        """
        return pulumi.get(self, "disk_file_size_variable")

    @_builtins.property
    @pulumi.getter(name="featureProfileId")
    def feature_profile_id(self) -> pulumi.Output[_builtins.str]:
        """
        Feature Profile ID
        """
        return pulumi.get(self, "feature_profile_id")

    @_builtins.property
    @pulumi.getter(name="ipv4Servers")
    def ipv4_servers(self) -> pulumi.Output[Optional[Sequence['outputs.SystemLoggingFeatureIpv4Server']]]:
        """
        Enable logging to remote server
        """
        return pulumi.get(self, "ipv4_servers")

    @_builtins.property
    @pulumi.getter(name="ipv6Servers")
    def ipv6_servers(self) -> pulumi.Output[Optional[Sequence['outputs.SystemLoggingFeatureIpv6Server']]]:
        """
        Enable logging to remote ipv6 server
        """
        return pulumi.get(self, "ipv6_servers")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Feature
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="tlsProfiles")
    def tls_profiles(self) -> pulumi.Output[Optional[Sequence['outputs.SystemLoggingFeatureTlsProfile']]]:
        """
        Configure a TLS profile
        """
        return pulumi.get(self, "tls_profiles")

    @_builtins.property
    @pulumi.getter
    def version(self) -> pulumi.Output[_builtins.int]:
        """
        The version of the Feature
        """
        return pulumi.get(self, "version")

