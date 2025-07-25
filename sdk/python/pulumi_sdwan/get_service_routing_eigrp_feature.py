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
    'GetServiceRoutingEigrpFeatureResult',
    'AwaitableGetServiceRoutingEigrpFeatureResult',
    'get_service_routing_eigrp_feature',
    'get_service_routing_eigrp_feature_output',
]

@pulumi.output_type
class GetServiceRoutingEigrpFeatureResult:
    """
    A collection of values returned by getServiceRoutingEigrpFeature.
    """
    def __init__(__self__, authentication_type=None, authentication_type_variable=None, autonomous_system_id=None, autonomous_system_id_variable=None, description=None, feature_profile_id=None, filter=None, filter_variable=None, hello_interval=None, hello_interval_variable=None, hmac_authentication_key=None, hmac_authentication_key_variable=None, hold_time=None, hold_time_variable=None, id=None, interfaces=None, md5_keys=None, name=None, networks=None, redistributes=None, route_policy_id=None, version=None):
        if authentication_type and not isinstance(authentication_type, str):
            raise TypeError("Expected argument 'authentication_type' to be a str")
        pulumi.set(__self__, "authentication_type", authentication_type)
        if authentication_type_variable and not isinstance(authentication_type_variable, str):
            raise TypeError("Expected argument 'authentication_type_variable' to be a str")
        pulumi.set(__self__, "authentication_type_variable", authentication_type_variable)
        if autonomous_system_id and not isinstance(autonomous_system_id, int):
            raise TypeError("Expected argument 'autonomous_system_id' to be a int")
        pulumi.set(__self__, "autonomous_system_id", autonomous_system_id)
        if autonomous_system_id_variable and not isinstance(autonomous_system_id_variable, str):
            raise TypeError("Expected argument 'autonomous_system_id_variable' to be a str")
        pulumi.set(__self__, "autonomous_system_id_variable", autonomous_system_id_variable)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if feature_profile_id and not isinstance(feature_profile_id, str):
            raise TypeError("Expected argument 'feature_profile_id' to be a str")
        pulumi.set(__self__, "feature_profile_id", feature_profile_id)
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
        if md5_keys and not isinstance(md5_keys, list):
            raise TypeError("Expected argument 'md5_keys' to be a list")
        pulumi.set(__self__, "md5_keys", md5_keys)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if networks and not isinstance(networks, list):
            raise TypeError("Expected argument 'networks' to be a list")
        pulumi.set(__self__, "networks", networks)
        if redistributes and not isinstance(redistributes, list):
            raise TypeError("Expected argument 'redistributes' to be a list")
        pulumi.set(__self__, "redistributes", redistributes)
        if route_policy_id and not isinstance(route_policy_id, str):
            raise TypeError("Expected argument 'route_policy_id' to be a str")
        pulumi.set(__self__, "route_policy_id", route_policy_id)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)

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
    @pulumi.getter(name="autonomousSystemId")
    def autonomous_system_id(self) -> _builtins.int:
        """
        Set autonomous system ID \\n\\n
        """
        return pulumi.get(self, "autonomous_system_id")

    @_builtins.property
    @pulumi.getter(name="autonomousSystemIdVariable")
    def autonomous_system_id_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "autonomous_system_id_variable")

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
        The id of the Feature
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def interfaces(self) -> Sequence['outputs.GetServiceRoutingEigrpFeatureInterfaceResult']:
        """
        Configure IPv4 Static Routes
        """
        return pulumi.get(self, "interfaces")

    @_builtins.property
    @pulumi.getter(name="md5Keys")
    def md5_keys(self) -> Sequence['outputs.GetServiceRoutingEigrpFeatureMd5KeyResult']:
        """
        Set keychain details
        """
        return pulumi.get(self, "md5_keys")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The name of the Feature
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def networks(self) -> Sequence['outputs.GetServiceRoutingEigrpFeatureNetworkResult']:
        """
        Configure the networks for EIGRP to advertise
        """
        return pulumi.get(self, "networks")

    @_builtins.property
    @pulumi.getter
    def redistributes(self) -> Sequence['outputs.GetServiceRoutingEigrpFeatureRedistributeResult']:
        """
        Redistribute routes into EIGRP
        """
        return pulumi.get(self, "redistributes")

    @_builtins.property
    @pulumi.getter(name="routePolicyId")
    def route_policy_id(self) -> _builtins.str:
        return pulumi.get(self, "route_policy_id")

    @_builtins.property
    @pulumi.getter
    def version(self) -> _builtins.int:
        """
        The version of the Feature
        """
        return pulumi.get(self, "version")


class AwaitableGetServiceRoutingEigrpFeatureResult(GetServiceRoutingEigrpFeatureResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceRoutingEigrpFeatureResult(
            authentication_type=self.authentication_type,
            authentication_type_variable=self.authentication_type_variable,
            autonomous_system_id=self.autonomous_system_id,
            autonomous_system_id_variable=self.autonomous_system_id_variable,
            description=self.description,
            feature_profile_id=self.feature_profile_id,
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
            md5_keys=self.md5_keys,
            name=self.name,
            networks=self.networks,
            redistributes=self.redistributes,
            route_policy_id=self.route_policy_id,
            version=self.version)


def get_service_routing_eigrp_feature(feature_profile_id: Optional[_builtins.str] = None,
                                      id: Optional[_builtins.str] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceRoutingEigrpFeatureResult:
    """
    This data source can read the Service Routing EIGRP Feature.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_service_routing_eigrp_feature(id="f6b2c44c-693c-4763-b010-895aa3d236bd",
        feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac")
    ```


    :param _builtins.str feature_profile_id: Feature Profile ID
    :param _builtins.str id: The id of the Feature
    """
    __args__ = dict()
    __args__['featureProfileId'] = feature_profile_id
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('sdwan:index/getServiceRoutingEigrpFeature:getServiceRoutingEigrpFeature', __args__, opts=opts, typ=GetServiceRoutingEigrpFeatureResult).value

    return AwaitableGetServiceRoutingEigrpFeatureResult(
        authentication_type=pulumi.get(__ret__, 'authentication_type'),
        authentication_type_variable=pulumi.get(__ret__, 'authentication_type_variable'),
        autonomous_system_id=pulumi.get(__ret__, 'autonomous_system_id'),
        autonomous_system_id_variable=pulumi.get(__ret__, 'autonomous_system_id_variable'),
        description=pulumi.get(__ret__, 'description'),
        feature_profile_id=pulumi.get(__ret__, 'feature_profile_id'),
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
        md5_keys=pulumi.get(__ret__, 'md5_keys'),
        name=pulumi.get(__ret__, 'name'),
        networks=pulumi.get(__ret__, 'networks'),
        redistributes=pulumi.get(__ret__, 'redistributes'),
        route_policy_id=pulumi.get(__ret__, 'route_policy_id'),
        version=pulumi.get(__ret__, 'version'))
def get_service_routing_eigrp_feature_output(feature_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
                                             id: Optional[pulumi.Input[_builtins.str]] = None,
                                             opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetServiceRoutingEigrpFeatureResult]:
    """
    This data source can read the Service Routing EIGRP Feature.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_service_routing_eigrp_feature(id="f6b2c44c-693c-4763-b010-895aa3d236bd",
        feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac")
    ```


    :param _builtins.str feature_profile_id: Feature Profile ID
    :param _builtins.str id: The id of the Feature
    """
    __args__ = dict()
    __args__['featureProfileId'] = feature_profile_id
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('sdwan:index/getServiceRoutingEigrpFeature:getServiceRoutingEigrpFeature', __args__, opts=opts, typ=GetServiceRoutingEigrpFeatureResult)
    return __ret__.apply(lambda __response__: GetServiceRoutingEigrpFeatureResult(
        authentication_type=pulumi.get(__response__, 'authentication_type'),
        authentication_type_variable=pulumi.get(__response__, 'authentication_type_variable'),
        autonomous_system_id=pulumi.get(__response__, 'autonomous_system_id'),
        autonomous_system_id_variable=pulumi.get(__response__, 'autonomous_system_id_variable'),
        description=pulumi.get(__response__, 'description'),
        feature_profile_id=pulumi.get(__response__, 'feature_profile_id'),
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
        md5_keys=pulumi.get(__response__, 'md5_keys'),
        name=pulumi.get(__response__, 'name'),
        networks=pulumi.get(__response__, 'networks'),
        redistributes=pulumi.get(__response__, 'redistributes'),
        route_policy_id=pulumi.get(__response__, 'route_policy_id'),
        version=pulumi.get(__response__, 'version')))
