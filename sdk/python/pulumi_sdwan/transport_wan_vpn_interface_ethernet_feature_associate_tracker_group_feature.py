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

__all__ = ['TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureArgs', 'TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature']

@pulumi.input_type
class TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureArgs:
    def __init__(__self__, *,
                 feature_profile_id: pulumi.Input[_builtins.str],
                 transport_tracker_group_feature_id: pulumi.Input[_builtins.str],
                 transport_wan_vpn_feature_id: pulumi.Input[_builtins.str],
                 transport_wan_vpn_interface_ethernet_feature_id: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature resource.
        :param pulumi.Input[_builtins.str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[_builtins.str] transport_tracker_group_feature_id: Transport Tracker Group Feature ID
        :param pulumi.Input[_builtins.str] transport_wan_vpn_feature_id: Transport WAN VPN Feature ID
        :param pulumi.Input[_builtins.str] transport_wan_vpn_interface_ethernet_feature_id: Transport WAN VPN Interface Ethernet Feature ID
        """
        pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        pulumi.set(__self__, "transport_tracker_group_feature_id", transport_tracker_group_feature_id)
        pulumi.set(__self__, "transport_wan_vpn_feature_id", transport_wan_vpn_feature_id)
        pulumi.set(__self__, "transport_wan_vpn_interface_ethernet_feature_id", transport_wan_vpn_interface_ethernet_feature_id)

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
    @pulumi.getter(name="transportTrackerGroupFeatureId")
    def transport_tracker_group_feature_id(self) -> pulumi.Input[_builtins.str]:
        """
        Transport Tracker Group Feature ID
        """
        return pulumi.get(self, "transport_tracker_group_feature_id")

    @transport_tracker_group_feature_id.setter
    def transport_tracker_group_feature_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "transport_tracker_group_feature_id", value)

    @_builtins.property
    @pulumi.getter(name="transportWanVpnFeatureId")
    def transport_wan_vpn_feature_id(self) -> pulumi.Input[_builtins.str]:
        """
        Transport WAN VPN Feature ID
        """
        return pulumi.get(self, "transport_wan_vpn_feature_id")

    @transport_wan_vpn_feature_id.setter
    def transport_wan_vpn_feature_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "transport_wan_vpn_feature_id", value)

    @_builtins.property
    @pulumi.getter(name="transportWanVpnInterfaceEthernetFeatureId")
    def transport_wan_vpn_interface_ethernet_feature_id(self) -> pulumi.Input[_builtins.str]:
        """
        Transport WAN VPN Interface Ethernet Feature ID
        """
        return pulumi.get(self, "transport_wan_vpn_interface_ethernet_feature_id")

    @transport_wan_vpn_interface_ethernet_feature_id.setter
    def transport_wan_vpn_interface_ethernet_feature_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "transport_wan_vpn_interface_ethernet_feature_id", value)


@pulumi.input_type
class _TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureState:
    def __init__(__self__, *,
                 feature_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
                 transport_tracker_group_feature_id: Optional[pulumi.Input[_builtins.str]] = None,
                 transport_wan_vpn_feature_id: Optional[pulumi.Input[_builtins.str]] = None,
                 transport_wan_vpn_interface_ethernet_feature_id: Optional[pulumi.Input[_builtins.str]] = None,
                 version: Optional[pulumi.Input[_builtins.int]] = None):
        """
        Input properties used for looking up and filtering TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature resources.
        :param pulumi.Input[_builtins.str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[_builtins.str] transport_tracker_group_feature_id: Transport Tracker Group Feature ID
        :param pulumi.Input[_builtins.str] transport_wan_vpn_feature_id: Transport WAN VPN Feature ID
        :param pulumi.Input[_builtins.str] transport_wan_vpn_interface_ethernet_feature_id: Transport WAN VPN Interface Ethernet Feature ID
        :param pulumi.Input[_builtins.int] version: The version of the object
        """
        if feature_profile_id is not None:
            pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if transport_tracker_group_feature_id is not None:
            pulumi.set(__self__, "transport_tracker_group_feature_id", transport_tracker_group_feature_id)
        if transport_wan_vpn_feature_id is not None:
            pulumi.set(__self__, "transport_wan_vpn_feature_id", transport_wan_vpn_feature_id)
        if transport_wan_vpn_interface_ethernet_feature_id is not None:
            pulumi.set(__self__, "transport_wan_vpn_interface_ethernet_feature_id", transport_wan_vpn_interface_ethernet_feature_id)
        if version is not None:
            pulumi.set(__self__, "version", version)

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
    @pulumi.getter(name="transportTrackerGroupFeatureId")
    def transport_tracker_group_feature_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Transport Tracker Group Feature ID
        """
        return pulumi.get(self, "transport_tracker_group_feature_id")

    @transport_tracker_group_feature_id.setter
    def transport_tracker_group_feature_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "transport_tracker_group_feature_id", value)

    @_builtins.property
    @pulumi.getter(name="transportWanVpnFeatureId")
    def transport_wan_vpn_feature_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Transport WAN VPN Feature ID
        """
        return pulumi.get(self, "transport_wan_vpn_feature_id")

    @transport_wan_vpn_feature_id.setter
    def transport_wan_vpn_feature_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "transport_wan_vpn_feature_id", value)

    @_builtins.property
    @pulumi.getter(name="transportWanVpnInterfaceEthernetFeatureId")
    def transport_wan_vpn_interface_ethernet_feature_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Transport WAN VPN Interface Ethernet Feature ID
        """
        return pulumi.get(self, "transport_wan_vpn_interface_ethernet_feature_id")

    @transport_wan_vpn_interface_ethernet_feature_id.setter
    def transport_wan_vpn_interface_ethernet_feature_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "transport_wan_vpn_interface_ethernet_feature_id", value)

    @_builtins.property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The version of the object
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "version", value)


@pulumi.type_token("sdwan:index/transportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature:TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature")
class TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 feature_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
                 transport_tracker_group_feature_id: Optional[pulumi.Input[_builtins.str]] = None,
                 transport_wan_vpn_feature_id: Optional[pulumi.Input[_builtins.str]] = None,
                 transport_wan_vpn_interface_ethernet_feature_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        This resource can manage a Transport WAN VPN Interface Ethernet Feature Associate Tracker Group Feature .
          - Minimum SD-WAN Manager version: `20.12.0`

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sdwan as sdwan

        example = sdwan.TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature("example",
            feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
            transport_wan_vpn_feature_id="140331f6-5418-4755-a059-13c77eb96037",
            transport_wan_vpn_interface_ethernet_feature_id="140331f6-5418-4755-a059-13c77eb96037",
            transport_tracker_group_feature_id="140331f6-5418-4755-a059-13c77eb96037")
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        Expected import identifier with the format: "transport_wan_vpn_interface_ethernet_feature_associate_tracker_group_feature_id,feature_profile_id,transport_wan_vpn_feature_id,transport_wan_vpn_interface_ethernet_feature_id"

        ```sh
        $ pulumi import sdwan:index/transportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature:TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac,140331f6-5418-4755-a059-13c77eb96037,140331f6-5418-4755-a059-13c77eb96037"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[_builtins.str] transport_tracker_group_feature_id: Transport Tracker Group Feature ID
        :param pulumi.Input[_builtins.str] transport_wan_vpn_feature_id: Transport WAN VPN Feature ID
        :param pulumi.Input[_builtins.str] transport_wan_vpn_interface_ethernet_feature_id: Transport WAN VPN Interface Ethernet Feature ID
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage a Transport WAN VPN Interface Ethernet Feature Associate Tracker Group Feature .
          - Minimum SD-WAN Manager version: `20.12.0`

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sdwan as sdwan

        example = sdwan.TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature("example",
            feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
            transport_wan_vpn_feature_id="140331f6-5418-4755-a059-13c77eb96037",
            transport_wan_vpn_interface_ethernet_feature_id="140331f6-5418-4755-a059-13c77eb96037",
            transport_tracker_group_feature_id="140331f6-5418-4755-a059-13c77eb96037")
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        Expected import identifier with the format: "transport_wan_vpn_interface_ethernet_feature_associate_tracker_group_feature_id,feature_profile_id,transport_wan_vpn_feature_id,transport_wan_vpn_interface_ethernet_feature_id"

        ```sh
        $ pulumi import sdwan:index/transportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature:TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac,140331f6-5418-4755-a059-13c77eb96037,140331f6-5418-4755-a059-13c77eb96037"
        ```

        :param str resource_name: The name of the resource.
        :param TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 feature_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
                 transport_tracker_group_feature_id: Optional[pulumi.Input[_builtins.str]] = None,
                 transport_wan_vpn_feature_id: Optional[pulumi.Input[_builtins.str]] = None,
                 transport_wan_vpn_interface_ethernet_feature_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureArgs.__new__(TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureArgs)

            if feature_profile_id is None and not opts.urn:
                raise TypeError("Missing required property 'feature_profile_id'")
            __props__.__dict__["feature_profile_id"] = feature_profile_id
            if transport_tracker_group_feature_id is None and not opts.urn:
                raise TypeError("Missing required property 'transport_tracker_group_feature_id'")
            __props__.__dict__["transport_tracker_group_feature_id"] = transport_tracker_group_feature_id
            if transport_wan_vpn_feature_id is None and not opts.urn:
                raise TypeError("Missing required property 'transport_wan_vpn_feature_id'")
            __props__.__dict__["transport_wan_vpn_feature_id"] = transport_wan_vpn_feature_id
            if transport_wan_vpn_interface_ethernet_feature_id is None and not opts.urn:
                raise TypeError("Missing required property 'transport_wan_vpn_interface_ethernet_feature_id'")
            __props__.__dict__["transport_wan_vpn_interface_ethernet_feature_id"] = transport_wan_vpn_interface_ethernet_feature_id
            __props__.__dict__["version"] = None
        super(TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature, __self__).__init__(
            'sdwan:index/transportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature:TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            feature_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
            transport_tracker_group_feature_id: Optional[pulumi.Input[_builtins.str]] = None,
            transport_wan_vpn_feature_id: Optional[pulumi.Input[_builtins.str]] = None,
            transport_wan_vpn_interface_ethernet_feature_id: Optional[pulumi.Input[_builtins.str]] = None,
            version: Optional[pulumi.Input[_builtins.int]] = None) -> 'TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature':
        """
        Get an existing TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[_builtins.str] transport_tracker_group_feature_id: Transport Tracker Group Feature ID
        :param pulumi.Input[_builtins.str] transport_wan_vpn_feature_id: Transport WAN VPN Feature ID
        :param pulumi.Input[_builtins.str] transport_wan_vpn_interface_ethernet_feature_id: Transport WAN VPN Interface Ethernet Feature ID
        :param pulumi.Input[_builtins.int] version: The version of the object
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureState.__new__(_TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeatureState)

        __props__.__dict__["feature_profile_id"] = feature_profile_id
        __props__.__dict__["transport_tracker_group_feature_id"] = transport_tracker_group_feature_id
        __props__.__dict__["transport_wan_vpn_feature_id"] = transport_wan_vpn_feature_id
        __props__.__dict__["transport_wan_vpn_interface_ethernet_feature_id"] = transport_wan_vpn_interface_ethernet_feature_id
        __props__.__dict__["version"] = version
        return TransportWanVpnInterfaceEthernetFeatureAssociateTrackerGroupFeature(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="featureProfileId")
    def feature_profile_id(self) -> pulumi.Output[_builtins.str]:
        """
        Feature Profile ID
        """
        return pulumi.get(self, "feature_profile_id")

    @_builtins.property
    @pulumi.getter(name="transportTrackerGroupFeatureId")
    def transport_tracker_group_feature_id(self) -> pulumi.Output[_builtins.str]:
        """
        Transport Tracker Group Feature ID
        """
        return pulumi.get(self, "transport_tracker_group_feature_id")

    @_builtins.property
    @pulumi.getter(name="transportWanVpnFeatureId")
    def transport_wan_vpn_feature_id(self) -> pulumi.Output[_builtins.str]:
        """
        Transport WAN VPN Feature ID
        """
        return pulumi.get(self, "transport_wan_vpn_feature_id")

    @_builtins.property
    @pulumi.getter(name="transportWanVpnInterfaceEthernetFeatureId")
    def transport_wan_vpn_interface_ethernet_feature_id(self) -> pulumi.Output[_builtins.str]:
        """
        Transport WAN VPN Interface Ethernet Feature ID
        """
        return pulumi.get(self, "transport_wan_vpn_interface_ethernet_feature_id")

    @_builtins.property
    @pulumi.getter
    def version(self) -> pulumi.Output[_builtins.int]:
        """
        The version of the object
        """
        return pulumi.get(self, "version")

