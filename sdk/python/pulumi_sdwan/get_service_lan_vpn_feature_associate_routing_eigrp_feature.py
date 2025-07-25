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

__all__ = [
    'GetServiceLanVpnFeatureAssociateRoutingEigrpFeatureResult',
    'AwaitableGetServiceLanVpnFeatureAssociateRoutingEigrpFeatureResult',
    'get_service_lan_vpn_feature_associate_routing_eigrp_feature',
    'get_service_lan_vpn_feature_associate_routing_eigrp_feature_output',
]

@pulumi.output_type
class GetServiceLanVpnFeatureAssociateRoutingEigrpFeatureResult:
    """
    A collection of values returned by getServiceLanVpnFeatureAssociateRoutingEigrpFeature.
    """
    def __init__(__self__, feature_profile_id=None, id=None, service_lan_vpn_feature_id=None, service_routing_eigrp_feature_id=None, version=None):
        if feature_profile_id and not isinstance(feature_profile_id, str):
            raise TypeError("Expected argument 'feature_profile_id' to be a str")
        pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if service_lan_vpn_feature_id and not isinstance(service_lan_vpn_feature_id, str):
            raise TypeError("Expected argument 'service_lan_vpn_feature_id' to be a str")
        pulumi.set(__self__, "service_lan_vpn_feature_id", service_lan_vpn_feature_id)
        if service_routing_eigrp_feature_id and not isinstance(service_routing_eigrp_feature_id, str):
            raise TypeError("Expected argument 'service_routing_eigrp_feature_id' to be a str")
        pulumi.set(__self__, "service_routing_eigrp_feature_id", service_routing_eigrp_feature_id)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)

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
        The id of the object
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="serviceLanVpnFeatureId")
    def service_lan_vpn_feature_id(self) -> _builtins.str:
        """
        Service LAN VPN Feature ID
        """
        return pulumi.get(self, "service_lan_vpn_feature_id")

    @_builtins.property
    @pulumi.getter(name="serviceRoutingEigrpFeatureId")
    def service_routing_eigrp_feature_id(self) -> _builtins.str:
        """
        Service Routing EIGRP Feature ID
        """
        return pulumi.get(self, "service_routing_eigrp_feature_id")

    @_builtins.property
    @pulumi.getter
    def version(self) -> _builtins.int:
        """
        The version of the object
        """
        return pulumi.get(self, "version")


class AwaitableGetServiceLanVpnFeatureAssociateRoutingEigrpFeatureResult(GetServiceLanVpnFeatureAssociateRoutingEigrpFeatureResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceLanVpnFeatureAssociateRoutingEigrpFeatureResult(
            feature_profile_id=self.feature_profile_id,
            id=self.id,
            service_lan_vpn_feature_id=self.service_lan_vpn_feature_id,
            service_routing_eigrp_feature_id=self.service_routing_eigrp_feature_id,
            version=self.version)


def get_service_lan_vpn_feature_associate_routing_eigrp_feature(feature_profile_id: Optional[_builtins.str] = None,
                                                                id: Optional[_builtins.str] = None,
                                                                service_lan_vpn_feature_id: Optional[_builtins.str] = None,
                                                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceLanVpnFeatureAssociateRoutingEigrpFeatureResult:
    """
    This data source can read the Service LAN VPN Feature Associate Routing EIGRP Feature .

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_service_lan_vpn_feature_associate_routing_eigrp_feature(feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        service_lan_vpn_feature_id="140331f6-5418-4755-a059-13c77eb96037",
        id="f6b2c44c-693c-4763-b010-895aa3d236bd")
    ```


    :param _builtins.str feature_profile_id: Feature Profile ID
    :param _builtins.str id: The id of the object
    :param _builtins.str service_lan_vpn_feature_id: Service LAN VPN Feature ID
    """
    __args__ = dict()
    __args__['featureProfileId'] = feature_profile_id
    __args__['id'] = id
    __args__['serviceLanVpnFeatureId'] = service_lan_vpn_feature_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('sdwan:index/getServiceLanVpnFeatureAssociateRoutingEigrpFeature:getServiceLanVpnFeatureAssociateRoutingEigrpFeature', __args__, opts=opts, typ=GetServiceLanVpnFeatureAssociateRoutingEigrpFeatureResult).value

    return AwaitableGetServiceLanVpnFeatureAssociateRoutingEigrpFeatureResult(
        feature_profile_id=pulumi.get(__ret__, 'feature_profile_id'),
        id=pulumi.get(__ret__, 'id'),
        service_lan_vpn_feature_id=pulumi.get(__ret__, 'service_lan_vpn_feature_id'),
        service_routing_eigrp_feature_id=pulumi.get(__ret__, 'service_routing_eigrp_feature_id'),
        version=pulumi.get(__ret__, 'version'))
def get_service_lan_vpn_feature_associate_routing_eigrp_feature_output(feature_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
                                                                       id: Optional[pulumi.Input[_builtins.str]] = None,
                                                                       service_lan_vpn_feature_id: Optional[pulumi.Input[_builtins.str]] = None,
                                                                       opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetServiceLanVpnFeatureAssociateRoutingEigrpFeatureResult]:
    """
    This data source can read the Service LAN VPN Feature Associate Routing EIGRP Feature .

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_service_lan_vpn_feature_associate_routing_eigrp_feature(feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        service_lan_vpn_feature_id="140331f6-5418-4755-a059-13c77eb96037",
        id="f6b2c44c-693c-4763-b010-895aa3d236bd")
    ```


    :param _builtins.str feature_profile_id: Feature Profile ID
    :param _builtins.str id: The id of the object
    :param _builtins.str service_lan_vpn_feature_id: Service LAN VPN Feature ID
    """
    __args__ = dict()
    __args__['featureProfileId'] = feature_profile_id
    __args__['id'] = id
    __args__['serviceLanVpnFeatureId'] = service_lan_vpn_feature_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('sdwan:index/getServiceLanVpnFeatureAssociateRoutingEigrpFeature:getServiceLanVpnFeatureAssociateRoutingEigrpFeature', __args__, opts=opts, typ=GetServiceLanVpnFeatureAssociateRoutingEigrpFeatureResult)
    return __ret__.apply(lambda __response__: GetServiceLanVpnFeatureAssociateRoutingEigrpFeatureResult(
        feature_profile_id=pulumi.get(__response__, 'feature_profile_id'),
        id=pulumi.get(__response__, 'id'),
        service_lan_vpn_feature_id=pulumi.get(__response__, 'service_lan_vpn_feature_id'),
        service_routing_eigrp_feature_id=pulumi.get(__response__, 'service_routing_eigrp_feature_id'),
        version=pulumi.get(__response__, 'version')))
