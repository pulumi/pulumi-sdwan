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
    'GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureResult',
    'AwaitableGetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureResult',
    'get_transport_wan_vpn_interface_ipsec_feature_associate_tracker_feature',
    'get_transport_wan_vpn_interface_ipsec_feature_associate_tracker_feature_output',
]

@pulumi.output_type
class GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureResult:
    """
    A collection of values returned by getTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeature.
    """
    def __init__(__self__, feature_profile_id=None, id=None, transport_tracker_feature_id=None, transport_wan_vpn_feature_id=None, transport_wan_vpn_interface_ipsec_feature_id=None, version=None):
        if feature_profile_id and not isinstance(feature_profile_id, str):
            raise TypeError("Expected argument 'feature_profile_id' to be a str")
        pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if transport_tracker_feature_id and not isinstance(transport_tracker_feature_id, str):
            raise TypeError("Expected argument 'transport_tracker_feature_id' to be a str")
        pulumi.set(__self__, "transport_tracker_feature_id", transport_tracker_feature_id)
        if transport_wan_vpn_feature_id and not isinstance(transport_wan_vpn_feature_id, str):
            raise TypeError("Expected argument 'transport_wan_vpn_feature_id' to be a str")
        pulumi.set(__self__, "transport_wan_vpn_feature_id", transport_wan_vpn_feature_id)
        if transport_wan_vpn_interface_ipsec_feature_id and not isinstance(transport_wan_vpn_interface_ipsec_feature_id, str):
            raise TypeError("Expected argument 'transport_wan_vpn_interface_ipsec_feature_id' to be a str")
        pulumi.set(__self__, "transport_wan_vpn_interface_ipsec_feature_id", transport_wan_vpn_interface_ipsec_feature_id)
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
    @pulumi.getter(name="transportTrackerFeatureId")
    def transport_tracker_feature_id(self) -> _builtins.str:
        """
        Transport Tracker Feature ID
        """
        return pulumi.get(self, "transport_tracker_feature_id")

    @_builtins.property
    @pulumi.getter(name="transportWanVpnFeatureId")
    def transport_wan_vpn_feature_id(self) -> _builtins.str:
        """
        Transport WAN VPN Feature ID
        """
        return pulumi.get(self, "transport_wan_vpn_feature_id")

    @_builtins.property
    @pulumi.getter(name="transportWanVpnInterfaceIpsecFeatureId")
    def transport_wan_vpn_interface_ipsec_feature_id(self) -> _builtins.str:
        """
        Transport WAN VPN Interface IPSEC Feature ID
        """
        return pulumi.get(self, "transport_wan_vpn_interface_ipsec_feature_id")

    @_builtins.property
    @pulumi.getter
    def version(self) -> _builtins.int:
        """
        The version of the object
        """
        return pulumi.get(self, "version")


class AwaitableGetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureResult(GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureResult(
            feature_profile_id=self.feature_profile_id,
            id=self.id,
            transport_tracker_feature_id=self.transport_tracker_feature_id,
            transport_wan_vpn_feature_id=self.transport_wan_vpn_feature_id,
            transport_wan_vpn_interface_ipsec_feature_id=self.transport_wan_vpn_interface_ipsec_feature_id,
            version=self.version)


def get_transport_wan_vpn_interface_ipsec_feature_associate_tracker_feature(feature_profile_id: Optional[_builtins.str] = None,
                                                                            id: Optional[_builtins.str] = None,
                                                                            transport_wan_vpn_feature_id: Optional[_builtins.str] = None,
                                                                            transport_wan_vpn_interface_ipsec_feature_id: Optional[_builtins.str] = None,
                                                                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureResult:
    """
    This data source can read the Transport WAN VPN Interface IPSEC Feature Associate Tracker Feature .

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_transport_wan_vpn_interface_ipsec_feature_associate_tracker_feature(feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        transport_wan_vpn_feature_id="140331f6-5418-4755-a059-13c77eb96037",
        transport_wan_vpn_interface_ipsec_feature_id="140331f6-5418-4755-a059-13c77eb96037",
        id="f6b2c44c-693c-4763-b010-895aa3d236bd")
    ```


    :param _builtins.str feature_profile_id: Feature Profile ID
    :param _builtins.str id: The id of the object
    :param _builtins.str transport_wan_vpn_feature_id: Transport WAN VPN Feature ID
    :param _builtins.str transport_wan_vpn_interface_ipsec_feature_id: Transport WAN VPN Interface IPSEC Feature ID
    """
    __args__ = dict()
    __args__['featureProfileId'] = feature_profile_id
    __args__['id'] = id
    __args__['transportWanVpnFeatureId'] = transport_wan_vpn_feature_id
    __args__['transportWanVpnInterfaceIpsecFeatureId'] = transport_wan_vpn_interface_ipsec_feature_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('sdwan:index/getTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeature:getTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeature', __args__, opts=opts, typ=GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureResult).value

    return AwaitableGetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureResult(
        feature_profile_id=pulumi.get(__ret__, 'feature_profile_id'),
        id=pulumi.get(__ret__, 'id'),
        transport_tracker_feature_id=pulumi.get(__ret__, 'transport_tracker_feature_id'),
        transport_wan_vpn_feature_id=pulumi.get(__ret__, 'transport_wan_vpn_feature_id'),
        transport_wan_vpn_interface_ipsec_feature_id=pulumi.get(__ret__, 'transport_wan_vpn_interface_ipsec_feature_id'),
        version=pulumi.get(__ret__, 'version'))
def get_transport_wan_vpn_interface_ipsec_feature_associate_tracker_feature_output(feature_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
                                                                                   id: Optional[pulumi.Input[_builtins.str]] = None,
                                                                                   transport_wan_vpn_feature_id: Optional[pulumi.Input[_builtins.str]] = None,
                                                                                   transport_wan_vpn_interface_ipsec_feature_id: Optional[pulumi.Input[_builtins.str]] = None,
                                                                                   opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureResult]:
    """
    This data source can read the Transport WAN VPN Interface IPSEC Feature Associate Tracker Feature .

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_transport_wan_vpn_interface_ipsec_feature_associate_tracker_feature(feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        transport_wan_vpn_feature_id="140331f6-5418-4755-a059-13c77eb96037",
        transport_wan_vpn_interface_ipsec_feature_id="140331f6-5418-4755-a059-13c77eb96037",
        id="f6b2c44c-693c-4763-b010-895aa3d236bd")
    ```


    :param _builtins.str feature_profile_id: Feature Profile ID
    :param _builtins.str id: The id of the object
    :param _builtins.str transport_wan_vpn_feature_id: Transport WAN VPN Feature ID
    :param _builtins.str transport_wan_vpn_interface_ipsec_feature_id: Transport WAN VPN Interface IPSEC Feature ID
    """
    __args__ = dict()
    __args__['featureProfileId'] = feature_profile_id
    __args__['id'] = id
    __args__['transportWanVpnFeatureId'] = transport_wan_vpn_feature_id
    __args__['transportWanVpnInterfaceIpsecFeatureId'] = transport_wan_vpn_interface_ipsec_feature_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('sdwan:index/getTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeature:getTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeature', __args__, opts=opts, typ=GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureResult)
    return __ret__.apply(lambda __response__: GetTransportWanVpnInterfaceIpsecFeatureAssociateTrackerFeatureResult(
        feature_profile_id=pulumi.get(__response__, 'feature_profile_id'),
        id=pulumi.get(__response__, 'id'),
        transport_tracker_feature_id=pulumi.get(__response__, 'transport_tracker_feature_id'),
        transport_wan_vpn_feature_id=pulumi.get(__response__, 'transport_wan_vpn_feature_id'),
        transport_wan_vpn_interface_ipsec_feature_id=pulumi.get(__response__, 'transport_wan_vpn_interface_ipsec_feature_id'),
        version=pulumi.get(__response__, 'version')))
