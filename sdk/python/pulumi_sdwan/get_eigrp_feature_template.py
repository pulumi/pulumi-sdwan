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
    'GetEigrpFeatureTemplateResult',
    'AwaitableGetEigrpFeatureTemplateResult',
    'get_eigrp_feature_template',
    'get_eigrp_feature_template_output',
]

@pulumi.output_type
class GetEigrpFeatureTemplateResult:
    """
    A collection of values returned by getEigrpFeatureTemplate.
    """
    def __init__(__self__, address_families=None, as_number=None, as_number_variable=None, authentication_type=None, authentication_type_variable=None, description=None, device_types=None, filter=None, filter_variable=None, hello_interval=None, hello_interval_variable=None, hmac_authentication_key=None, hmac_authentication_key_variable=None, hold_time=None, hold_time_variable=None, id=None, interfaces=None, keys=None, name=None, route_policy_name=None, route_policy_name_variable=None, template_type=None, version=None):
        if address_families and not isinstance(address_families, list):
            raise TypeError("Expected argument 'address_families' to be a list")
        pulumi.set(__self__, "address_families", address_families)
        if as_number and not isinstance(as_number, int):
            raise TypeError("Expected argument 'as_number' to be a int")
        pulumi.set(__self__, "as_number", as_number)
        if as_number_variable and not isinstance(as_number_variable, str):
            raise TypeError("Expected argument 'as_number_variable' to be a str")
        pulumi.set(__self__, "as_number_variable", as_number_variable)
        if authentication_type and not isinstance(authentication_type, str):
            raise TypeError("Expected argument 'authentication_type' to be a str")
        pulumi.set(__self__, "authentication_type", authentication_type)
        if authentication_type_variable and not isinstance(authentication_type_variable, str):
            raise TypeError("Expected argument 'authentication_type_variable' to be a str")
        pulumi.set(__self__, "authentication_type_variable", authentication_type_variable)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if device_types and not isinstance(device_types, list):
            raise TypeError("Expected argument 'device_types' to be a list")
        pulumi.set(__self__, "device_types", device_types)
        if filter and not isinstance(filter, bool):
            raise TypeError("Expected argument 'filter' to be a bool")
        pulumi.set(__self__, "filter", filter)
        if filter_variable and not isinstance(filter_variable, str):
            raise TypeError("Expected argument 'filter_variable' to be a str")
        pulumi.set(__self__, "filter_variable", filter_variable)
        if hello_interval and not isinstance(hello_interval, int):
            raise TypeError("Expected argument 'hello_interval' to be a int")
        pulumi.set(__self__, "hello_interval", hello_interval)
        if hello_interval_variable and not isinstance(hello_interval_variable, str):
            raise TypeError("Expected argument 'hello_interval_variable' to be a str")
        pulumi.set(__self__, "hello_interval_variable", hello_interval_variable)
        if hmac_authentication_key and not isinstance(hmac_authentication_key, str):
            raise TypeError("Expected argument 'hmac_authentication_key' to be a str")
        pulumi.set(__self__, "hmac_authentication_key", hmac_authentication_key)
        if hmac_authentication_key_variable and not isinstance(hmac_authentication_key_variable, str):
            raise TypeError("Expected argument 'hmac_authentication_key_variable' to be a str")
        pulumi.set(__self__, "hmac_authentication_key_variable", hmac_authentication_key_variable)
        if hold_time and not isinstance(hold_time, int):
            raise TypeError("Expected argument 'hold_time' to be a int")
        pulumi.set(__self__, "hold_time", hold_time)
        if hold_time_variable and not isinstance(hold_time_variable, str):
            raise TypeError("Expected argument 'hold_time_variable' to be a str")
        pulumi.set(__self__, "hold_time_variable", hold_time_variable)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if interfaces and not isinstance(interfaces, list):
            raise TypeError("Expected argument 'interfaces' to be a list")
        pulumi.set(__self__, "interfaces", interfaces)
        if keys and not isinstance(keys, list):
            raise TypeError("Expected argument 'keys' to be a list")
        pulumi.set(__self__, "keys", keys)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if route_policy_name and not isinstance(route_policy_name, str):
            raise TypeError("Expected argument 'route_policy_name' to be a str")
        pulumi.set(__self__, "route_policy_name", route_policy_name)
        if route_policy_name_variable and not isinstance(route_policy_name_variable, str):
            raise TypeError("Expected argument 'route_policy_name_variable' to be a str")
        pulumi.set(__self__, "route_policy_name_variable", route_policy_name_variable)
        if template_type and not isinstance(template_type, str):
            raise TypeError("Expected argument 'template_type' to be a str")
        pulumi.set(__self__, "template_type", template_type)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)

    @_builtins.property
    @pulumi.getter(name="addressFamilies")
    def address_families(self) -> Sequence['outputs.GetEigrpFeatureTemplateAddressFamilyResult']:
        """
        Set EIGRP address family
        """
        return pulumi.get(self, "address_families")

    @_builtins.property
    @pulumi.getter(name="asNumber")
    def as_number(self) -> _builtins.int:
        """
        Set autonomous system ID \\n\\n
        """
        return pulumi.get(self, "as_number")

    @_builtins.property
    @pulumi.getter(name="asNumberVariable")
    def as_number_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "as_number_variable")

    @_builtins.property
    @pulumi.getter(name="authenticationType")
    def authentication_type(self) -> _builtins.str:
        """
        Set EIGRP router authentication type
        """
        return pulumi.get(self, "authentication_type")

    @_builtins.property
    @pulumi.getter(name="authenticationTypeVariable")
    def authentication_type_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "authentication_type_variable")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        The description of the feature template
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="deviceTypes")
    def device_types(self) -> Sequence[_builtins.str]:
        """
        List of supported device types
        """
        return pulumi.get(self, "device_types")

    @_builtins.property
    @pulumi.getter
    def filter(self) -> _builtins.bool:
        """
        Selective route download
        """
        return pulumi.get(self, "filter")

    @_builtins.property
    @pulumi.getter(name="filterVariable")
    def filter_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "filter_variable")

    @_builtins.property
    @pulumi.getter(name="helloInterval")
    def hello_interval(self) -> _builtins.int:
        """
        Set EIGRP hello interval
        """
        return pulumi.get(self, "hello_interval")

    @_builtins.property
    @pulumi.getter(name="helloIntervalVariable")
    def hello_interval_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "hello_interval_variable")

    @_builtins.property
    @pulumi.getter(name="hmacAuthenticationKey")
    def hmac_authentication_key(self) -> _builtins.str:
        """
        Set hmac-sha-256 authentication key
        """
        return pulumi.get(self, "hmac_authentication_key")

    @_builtins.property
    @pulumi.getter(name="hmacAuthenticationKeyVariable")
    def hmac_authentication_key_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "hmac_authentication_key_variable")

    @_builtins.property
    @pulumi.getter(name="holdTime")
    def hold_time(self) -> _builtins.int:
        """
        Set EIGRP hold time
        """
        return pulumi.get(self, "hold_time")

    @_builtins.property
    @pulumi.getter(name="holdTimeVariable")
    def hold_time_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "hold_time_variable")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The id of the feature template
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def interfaces(self) -> Sequence['outputs.GetEigrpFeatureTemplateInterfaceResult']:
        """
        Configure IPv4 Static Routes
        """
        return pulumi.get(self, "interfaces")

    @_builtins.property
    @pulumi.getter
    def keys(self) -> Sequence['outputs.GetEigrpFeatureTemplateKeyResult']:
        """
        Set keychain name
        """
        return pulumi.get(self, "keys")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The name of the feature template
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="routePolicyName")
    def route_policy_name(self) -> _builtins.str:
        """
        Configure policy to apply to prefixes received from EIGRP neighbor
        """
        return pulumi.get(self, "route_policy_name")

    @_builtins.property
    @pulumi.getter(name="routePolicyNameVariable")
    def route_policy_name_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "route_policy_name_variable")

    @_builtins.property
    @pulumi.getter(name="templateType")
    def template_type(self) -> _builtins.str:
        """
        The template type
        """
        return pulumi.get(self, "template_type")

    @_builtins.property
    @pulumi.getter
    def version(self) -> _builtins.int:
        """
        The version of the feature template
        """
        return pulumi.get(self, "version")


class AwaitableGetEigrpFeatureTemplateResult(GetEigrpFeatureTemplateResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEigrpFeatureTemplateResult(
            address_families=self.address_families,
            as_number=self.as_number,
            as_number_variable=self.as_number_variable,
            authentication_type=self.authentication_type,
            authentication_type_variable=self.authentication_type_variable,
            description=self.description,
            device_types=self.device_types,
            filter=self.filter,
            filter_variable=self.filter_variable,
            hello_interval=self.hello_interval,
            hello_interval_variable=self.hello_interval_variable,
            hmac_authentication_key=self.hmac_authentication_key,
            hmac_authentication_key_variable=self.hmac_authentication_key_variable,
            hold_time=self.hold_time,
            hold_time_variable=self.hold_time_variable,
            id=self.id,
            interfaces=self.interfaces,
            keys=self.keys,
            name=self.name,
            route_policy_name=self.route_policy_name,
            route_policy_name_variable=self.route_policy_name_variable,
            template_type=self.template_type,
            version=self.version)


def get_eigrp_feature_template(id: Optional[_builtins.str] = None,
                               name: Optional[_builtins.str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEigrpFeatureTemplateResult:
    """
    This data source can read the eigrp feature template.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_eigrp_feature_template(id="f6b2c44c-693c-4763-b010-895aa3d236bd")
    ```


    :param _builtins.str id: The id of the feature template
    :param _builtins.str name: The name of the feature template
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('sdwan:index/getEigrpFeatureTemplate:getEigrpFeatureTemplate', __args__, opts=opts, typ=GetEigrpFeatureTemplateResult).value

    return AwaitableGetEigrpFeatureTemplateResult(
        address_families=pulumi.get(__ret__, 'address_families'),
        as_number=pulumi.get(__ret__, 'as_number'),
        as_number_variable=pulumi.get(__ret__, 'as_number_variable'),
        authentication_type=pulumi.get(__ret__, 'authentication_type'),
        authentication_type_variable=pulumi.get(__ret__, 'authentication_type_variable'),
        description=pulumi.get(__ret__, 'description'),
        device_types=pulumi.get(__ret__, 'device_types'),
        filter=pulumi.get(__ret__, 'filter'),
        filter_variable=pulumi.get(__ret__, 'filter_variable'),
        hello_interval=pulumi.get(__ret__, 'hello_interval'),
        hello_interval_variable=pulumi.get(__ret__, 'hello_interval_variable'),
        hmac_authentication_key=pulumi.get(__ret__, 'hmac_authentication_key'),
        hmac_authentication_key_variable=pulumi.get(__ret__, 'hmac_authentication_key_variable'),
        hold_time=pulumi.get(__ret__, 'hold_time'),
        hold_time_variable=pulumi.get(__ret__, 'hold_time_variable'),
        id=pulumi.get(__ret__, 'id'),
        interfaces=pulumi.get(__ret__, 'interfaces'),
        keys=pulumi.get(__ret__, 'keys'),
        name=pulumi.get(__ret__, 'name'),
        route_policy_name=pulumi.get(__ret__, 'route_policy_name'),
        route_policy_name_variable=pulumi.get(__ret__, 'route_policy_name_variable'),
        template_type=pulumi.get(__ret__, 'template_type'),
        version=pulumi.get(__ret__, 'version'))
def get_eigrp_feature_template_output(id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                      name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetEigrpFeatureTemplateResult]:
    """
    This data source can read the eigrp feature template.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_eigrp_feature_template(id="f6b2c44c-693c-4763-b010-895aa3d236bd")
    ```


    :param _builtins.str id: The id of the feature template
    :param _builtins.str name: The name of the feature template
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('sdwan:index/getEigrpFeatureTemplate:getEigrpFeatureTemplate', __args__, opts=opts, typ=GetEigrpFeatureTemplateResult)
    return __ret__.apply(lambda __response__: GetEigrpFeatureTemplateResult(
        address_families=pulumi.get(__response__, 'address_families'),
        as_number=pulumi.get(__response__, 'as_number'),
        as_number_variable=pulumi.get(__response__, 'as_number_variable'),
        authentication_type=pulumi.get(__response__, 'authentication_type'),
        authentication_type_variable=pulumi.get(__response__, 'authentication_type_variable'),
        description=pulumi.get(__response__, 'description'),
        device_types=pulumi.get(__response__, 'device_types'),
        filter=pulumi.get(__response__, 'filter'),
        filter_variable=pulumi.get(__response__, 'filter_variable'),
        hello_interval=pulumi.get(__response__, 'hello_interval'),
        hello_interval_variable=pulumi.get(__response__, 'hello_interval_variable'),
        hmac_authentication_key=pulumi.get(__response__, 'hmac_authentication_key'),
        hmac_authentication_key_variable=pulumi.get(__response__, 'hmac_authentication_key_variable'),
        hold_time=pulumi.get(__response__, 'hold_time'),
        hold_time_variable=pulumi.get(__response__, 'hold_time_variable'),
        id=pulumi.get(__response__, 'id'),
        interfaces=pulumi.get(__response__, 'interfaces'),
        keys=pulumi.get(__response__, 'keys'),
        name=pulumi.get(__response__, 'name'),
        route_policy_name=pulumi.get(__response__, 'route_policy_name'),
        route_policy_name_variable=pulumi.get(__response__, 'route_policy_name_variable'),
        template_type=pulumi.get(__response__, 'template_type'),
        version=pulumi.get(__response__, 'version')))
