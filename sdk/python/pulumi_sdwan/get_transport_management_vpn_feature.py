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
    'GetTransportManagementVpnFeatureResult',
    'AwaitableGetTransportManagementVpnFeatureResult',
    'get_transport_management_vpn_feature',
    'get_transport_management_vpn_feature_output',
]

@pulumi.output_type
class GetTransportManagementVpnFeatureResult:
    """
    A collection of values returned by getTransportManagementVpnFeature.
    """
    def __init__(__self__, description=None, feature_profile_id=None, id=None, ipv4_static_routes=None, ipv6_static_routes=None, name=None, new_host_mappings=None, primary_dns_address_ipv4=None, primary_dns_address_ipv4_variable=None, primary_dns_address_ipv6=None, primary_dns_address_ipv6_variable=None, secondary_dns_address_ipv4=None, secondary_dns_address_ipv4_variable=None, secondary_dns_address_ipv6=None, secondary_dns_address_ipv6_variable=None, version=None, vpn_description=None, vpn_description_variable=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if feature_profile_id and not isinstance(feature_profile_id, str):
            raise TypeError("Expected argument 'feature_profile_id' to be a str")
        pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ipv4_static_routes and not isinstance(ipv4_static_routes, list):
            raise TypeError("Expected argument 'ipv4_static_routes' to be a list")
        pulumi.set(__self__, "ipv4_static_routes", ipv4_static_routes)
        if ipv6_static_routes and not isinstance(ipv6_static_routes, list):
            raise TypeError("Expected argument 'ipv6_static_routes' to be a list")
        pulumi.set(__self__, "ipv6_static_routes", ipv6_static_routes)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if new_host_mappings and not isinstance(new_host_mappings, list):
            raise TypeError("Expected argument 'new_host_mappings' to be a list")
        pulumi.set(__self__, "new_host_mappings", new_host_mappings)
        if primary_dns_address_ipv4 and not isinstance(primary_dns_address_ipv4, str):
            raise TypeError("Expected argument 'primary_dns_address_ipv4' to be a str")
        pulumi.set(__self__, "primary_dns_address_ipv4", primary_dns_address_ipv4)
        if primary_dns_address_ipv4_variable and not isinstance(primary_dns_address_ipv4_variable, str):
            raise TypeError("Expected argument 'primary_dns_address_ipv4_variable' to be a str")
        pulumi.set(__self__, "primary_dns_address_ipv4_variable", primary_dns_address_ipv4_variable)
        if primary_dns_address_ipv6 and not isinstance(primary_dns_address_ipv6, str):
            raise TypeError("Expected argument 'primary_dns_address_ipv6' to be a str")
        pulumi.set(__self__, "primary_dns_address_ipv6", primary_dns_address_ipv6)
        if primary_dns_address_ipv6_variable and not isinstance(primary_dns_address_ipv6_variable, str):
            raise TypeError("Expected argument 'primary_dns_address_ipv6_variable' to be a str")
        pulumi.set(__self__, "primary_dns_address_ipv6_variable", primary_dns_address_ipv6_variable)
        if secondary_dns_address_ipv4 and not isinstance(secondary_dns_address_ipv4, str):
            raise TypeError("Expected argument 'secondary_dns_address_ipv4' to be a str")
        pulumi.set(__self__, "secondary_dns_address_ipv4", secondary_dns_address_ipv4)
        if secondary_dns_address_ipv4_variable and not isinstance(secondary_dns_address_ipv4_variable, str):
            raise TypeError("Expected argument 'secondary_dns_address_ipv4_variable' to be a str")
        pulumi.set(__self__, "secondary_dns_address_ipv4_variable", secondary_dns_address_ipv4_variable)
        if secondary_dns_address_ipv6 and not isinstance(secondary_dns_address_ipv6, str):
            raise TypeError("Expected argument 'secondary_dns_address_ipv6' to be a str")
        pulumi.set(__self__, "secondary_dns_address_ipv6", secondary_dns_address_ipv6)
        if secondary_dns_address_ipv6_variable and not isinstance(secondary_dns_address_ipv6_variable, str):
            raise TypeError("Expected argument 'secondary_dns_address_ipv6_variable' to be a str")
        pulumi.set(__self__, "secondary_dns_address_ipv6_variable", secondary_dns_address_ipv6_variable)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)
        if vpn_description and not isinstance(vpn_description, str):
            raise TypeError("Expected argument 'vpn_description' to be a str")
        pulumi.set(__self__, "vpn_description", vpn_description)
        if vpn_description_variable and not isinstance(vpn_description_variable, str):
            raise TypeError("Expected argument 'vpn_description_variable' to be a str")
        pulumi.set(__self__, "vpn_description_variable", vpn_description_variable)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the Feature
        """
        return pulumi.get(self, "description")

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
    @pulumi.getter(name="ipv4StaticRoutes")
    def ipv4_static_routes(self) -> Sequence['outputs.GetTransportManagementVpnFeatureIpv4StaticRouteResult']:
        """
        IPv4 Static Route
        """
        return pulumi.get(self, "ipv4_static_routes")

    @property
    @pulumi.getter(name="ipv6StaticRoutes")
    def ipv6_static_routes(self) -> Sequence['outputs.GetTransportManagementVpnFeatureIpv6StaticRouteResult']:
        """
        IPv6 Static Route
        """
        return pulumi.get(self, "ipv6_static_routes")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the Feature
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="newHostMappings")
    def new_host_mappings(self) -> Sequence['outputs.GetTransportManagementVpnFeatureNewHostMappingResult']:
        return pulumi.get(self, "new_host_mappings")

    @property
    @pulumi.getter(name="primaryDnsAddressIpv4")
    def primary_dns_address_ipv4(self) -> str:
        """
        Primary DNS Address (IPv4)
        """
        return pulumi.get(self, "primary_dns_address_ipv4")

    @property
    @pulumi.getter(name="primaryDnsAddressIpv4Variable")
    def primary_dns_address_ipv4_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "primary_dns_address_ipv4_variable")

    @property
    @pulumi.getter(name="primaryDnsAddressIpv6")
    def primary_dns_address_ipv6(self) -> str:
        """
        Primary DNS Address (IPv6)
        """
        return pulumi.get(self, "primary_dns_address_ipv6")

    @property
    @pulumi.getter(name="primaryDnsAddressIpv6Variable")
    def primary_dns_address_ipv6_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "primary_dns_address_ipv6_variable")

    @property
    @pulumi.getter(name="secondaryDnsAddressIpv4")
    def secondary_dns_address_ipv4(self) -> str:
        """
        Secondary DNS Address (IPv4)
        """
        return pulumi.get(self, "secondary_dns_address_ipv4")

    @property
    @pulumi.getter(name="secondaryDnsAddressIpv4Variable")
    def secondary_dns_address_ipv4_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "secondary_dns_address_ipv4_variable")

    @property
    @pulumi.getter(name="secondaryDnsAddressIpv6")
    def secondary_dns_address_ipv6(self) -> str:
        """
        Secondary DNS Address (IPv6)
        """
        return pulumi.get(self, "secondary_dns_address_ipv6")

    @property
    @pulumi.getter(name="secondaryDnsAddressIpv6Variable")
    def secondary_dns_address_ipv6_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "secondary_dns_address_ipv6_variable")

    @property
    @pulumi.getter
    def version(self) -> int:
        """
        The version of the Feature
        """
        return pulumi.get(self, "version")

    @property
    @pulumi.getter(name="vpnDescription")
    def vpn_description(self) -> str:
        """
        Name
        """
        return pulumi.get(self, "vpn_description")

    @property
    @pulumi.getter(name="vpnDescriptionVariable")
    def vpn_description_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "vpn_description_variable")


class AwaitableGetTransportManagementVpnFeatureResult(GetTransportManagementVpnFeatureResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTransportManagementVpnFeatureResult(
            description=self.description,
            feature_profile_id=self.feature_profile_id,
            id=self.id,
            ipv4_static_routes=self.ipv4_static_routes,
            ipv6_static_routes=self.ipv6_static_routes,
            name=self.name,
            new_host_mappings=self.new_host_mappings,
            primary_dns_address_ipv4=self.primary_dns_address_ipv4,
            primary_dns_address_ipv4_variable=self.primary_dns_address_ipv4_variable,
            primary_dns_address_ipv6=self.primary_dns_address_ipv6,
            primary_dns_address_ipv6_variable=self.primary_dns_address_ipv6_variable,
            secondary_dns_address_ipv4=self.secondary_dns_address_ipv4,
            secondary_dns_address_ipv4_variable=self.secondary_dns_address_ipv4_variable,
            secondary_dns_address_ipv6=self.secondary_dns_address_ipv6,
            secondary_dns_address_ipv6_variable=self.secondary_dns_address_ipv6_variable,
            version=self.version,
            vpn_description=self.vpn_description,
            vpn_description_variable=self.vpn_description_variable)


def get_transport_management_vpn_feature(feature_profile_id: Optional[str] = None,
                                         id: Optional[str] = None,
                                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTransportManagementVpnFeatureResult:
    """
    This data source can read the Transport Management VPN Feature.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_transport_management_vpn_feature(id="f6b2c44c-693c-4763-b010-895aa3d236bd",
        feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac")
    ```


    :param str feature_profile_id: Feature Profile ID
    :param str id: The id of the Feature
    """
    __args__ = dict()
    __args__['featureProfileId'] = feature_profile_id
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('sdwan:index/getTransportManagementVpnFeature:getTransportManagementVpnFeature', __args__, opts=opts, typ=GetTransportManagementVpnFeatureResult).value

    return AwaitableGetTransportManagementVpnFeatureResult(
        description=pulumi.get(__ret__, 'description'),
        feature_profile_id=pulumi.get(__ret__, 'feature_profile_id'),
        id=pulumi.get(__ret__, 'id'),
        ipv4_static_routes=pulumi.get(__ret__, 'ipv4_static_routes'),
        ipv6_static_routes=pulumi.get(__ret__, 'ipv6_static_routes'),
        name=pulumi.get(__ret__, 'name'),
        new_host_mappings=pulumi.get(__ret__, 'new_host_mappings'),
        primary_dns_address_ipv4=pulumi.get(__ret__, 'primary_dns_address_ipv4'),
        primary_dns_address_ipv4_variable=pulumi.get(__ret__, 'primary_dns_address_ipv4_variable'),
        primary_dns_address_ipv6=pulumi.get(__ret__, 'primary_dns_address_ipv6'),
        primary_dns_address_ipv6_variable=pulumi.get(__ret__, 'primary_dns_address_ipv6_variable'),
        secondary_dns_address_ipv4=pulumi.get(__ret__, 'secondary_dns_address_ipv4'),
        secondary_dns_address_ipv4_variable=pulumi.get(__ret__, 'secondary_dns_address_ipv4_variable'),
        secondary_dns_address_ipv6=pulumi.get(__ret__, 'secondary_dns_address_ipv6'),
        secondary_dns_address_ipv6_variable=pulumi.get(__ret__, 'secondary_dns_address_ipv6_variable'),
        version=pulumi.get(__ret__, 'version'),
        vpn_description=pulumi.get(__ret__, 'vpn_description'),
        vpn_description_variable=pulumi.get(__ret__, 'vpn_description_variable'))


@_utilities.lift_output_func(get_transport_management_vpn_feature)
def get_transport_management_vpn_feature_output(feature_profile_id: Optional[pulumi.Input[str]] = None,
                                                id: Optional[pulumi.Input[str]] = None,
                                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTransportManagementVpnFeatureResult]:
    """
    This data source can read the Transport Management VPN Feature.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_transport_management_vpn_feature(id="f6b2c44c-693c-4763-b010-895aa3d236bd",
        feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac")
    ```


    :param str feature_profile_id: Feature Profile ID
    :param str id: The id of the Feature
    """
    ...