# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['TransportGpsFeatureArgs', 'TransportGpsFeature']

@pulumi.input_type
class TransportGpsFeatureArgs:
    def __init__(__self__, *,
                 feature_profile_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 gps_enable: Optional[pulumi.Input[bool]] = None,
                 gps_enable_variable: Optional[pulumi.Input[str]] = None,
                 gps_mode: Optional[pulumi.Input[str]] = None,
                 gps_mode_variable: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 nmea_destination_address: Optional[pulumi.Input[str]] = None,
                 nmea_destination_address_variable: Optional[pulumi.Input[str]] = None,
                 nmea_destination_port: Optional[pulumi.Input[int]] = None,
                 nmea_destination_port_variable: Optional[pulumi.Input[str]] = None,
                 nmea_enable: Optional[pulumi.Input[bool]] = None,
                 nmea_enable_variable: Optional[pulumi.Input[str]] = None,
                 nmea_source_address: Optional[pulumi.Input[str]] = None,
                 nmea_source_address_variable: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a TransportGpsFeature resource.
        :param pulumi.Input[str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[str] description: The description of the Feature
        :param pulumi.Input[bool] gps_enable: Enable/disable GPS - Default value: `false`
        :param pulumi.Input[str] gps_enable_variable: Variable name
        :param pulumi.Input[str] gps_mode: Select GPS mode - Choices: `ms-based`, `standalone` - Default value: `ms-based`
        :param pulumi.Input[str] gps_mode_variable: Variable name
        :param pulumi.Input[str] name: The name of the Feature
        :param pulumi.Input[str] nmea_destination_address: Destination address
        :param pulumi.Input[str] nmea_destination_address_variable: Variable name
        :param pulumi.Input[int] nmea_destination_port: Destination port - Range: `1`-`65535`
        :param pulumi.Input[str] nmea_destination_port_variable: Variable name
        :param pulumi.Input[bool] nmea_enable: Enable/disable NMEA data - Default value: `false`
        :param pulumi.Input[str] nmea_enable_variable: Variable name
        :param pulumi.Input[str] nmea_source_address: Source address
        :param pulumi.Input[str] nmea_source_address_variable: Variable name
        """
        pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if gps_enable is not None:
            pulumi.set(__self__, "gps_enable", gps_enable)
        if gps_enable_variable is not None:
            pulumi.set(__self__, "gps_enable_variable", gps_enable_variable)
        if gps_mode is not None:
            pulumi.set(__self__, "gps_mode", gps_mode)
        if gps_mode_variable is not None:
            pulumi.set(__self__, "gps_mode_variable", gps_mode_variable)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if nmea_destination_address is not None:
            pulumi.set(__self__, "nmea_destination_address", nmea_destination_address)
        if nmea_destination_address_variable is not None:
            pulumi.set(__self__, "nmea_destination_address_variable", nmea_destination_address_variable)
        if nmea_destination_port is not None:
            pulumi.set(__self__, "nmea_destination_port", nmea_destination_port)
        if nmea_destination_port_variable is not None:
            pulumi.set(__self__, "nmea_destination_port_variable", nmea_destination_port_variable)
        if nmea_enable is not None:
            pulumi.set(__self__, "nmea_enable", nmea_enable)
        if nmea_enable_variable is not None:
            pulumi.set(__self__, "nmea_enable_variable", nmea_enable_variable)
        if nmea_source_address is not None:
            pulumi.set(__self__, "nmea_source_address", nmea_source_address)
        if nmea_source_address_variable is not None:
            pulumi.set(__self__, "nmea_source_address_variable", nmea_source_address_variable)

    @property
    @pulumi.getter(name="featureProfileId")
    def feature_profile_id(self) -> pulumi.Input[str]:
        """
        Feature Profile ID
        """
        return pulumi.get(self, "feature_profile_id")

    @feature_profile_id.setter
    def feature_profile_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "feature_profile_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the Feature
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="gpsEnable")
    def gps_enable(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable/disable GPS - Default value: `false`
        """
        return pulumi.get(self, "gps_enable")

    @gps_enable.setter
    def gps_enable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "gps_enable", value)

    @property
    @pulumi.getter(name="gpsEnableVariable")
    def gps_enable_variable(self) -> Optional[pulumi.Input[str]]:
        """
        Variable name
        """
        return pulumi.get(self, "gps_enable_variable")

    @gps_enable_variable.setter
    def gps_enable_variable(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gps_enable_variable", value)

    @property
    @pulumi.getter(name="gpsMode")
    def gps_mode(self) -> Optional[pulumi.Input[str]]:
        """
        Select GPS mode - Choices: `ms-based`, `standalone` - Default value: `ms-based`
        """
        return pulumi.get(self, "gps_mode")

    @gps_mode.setter
    def gps_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gps_mode", value)

    @property
    @pulumi.getter(name="gpsModeVariable")
    def gps_mode_variable(self) -> Optional[pulumi.Input[str]]:
        """
        Variable name
        """
        return pulumi.get(self, "gps_mode_variable")

    @gps_mode_variable.setter
    def gps_mode_variable(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gps_mode_variable", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Feature
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="nmeaDestinationAddress")
    def nmea_destination_address(self) -> Optional[pulumi.Input[str]]:
        """
        Destination address
        """
        return pulumi.get(self, "nmea_destination_address")

    @nmea_destination_address.setter
    def nmea_destination_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nmea_destination_address", value)

    @property
    @pulumi.getter(name="nmeaDestinationAddressVariable")
    def nmea_destination_address_variable(self) -> Optional[pulumi.Input[str]]:
        """
        Variable name
        """
        return pulumi.get(self, "nmea_destination_address_variable")

    @nmea_destination_address_variable.setter
    def nmea_destination_address_variable(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nmea_destination_address_variable", value)

    @property
    @pulumi.getter(name="nmeaDestinationPort")
    def nmea_destination_port(self) -> Optional[pulumi.Input[int]]:
        """
        Destination port - Range: `1`-`65535`
        """
        return pulumi.get(self, "nmea_destination_port")

    @nmea_destination_port.setter
    def nmea_destination_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "nmea_destination_port", value)

    @property
    @pulumi.getter(name="nmeaDestinationPortVariable")
    def nmea_destination_port_variable(self) -> Optional[pulumi.Input[str]]:
        """
        Variable name
        """
        return pulumi.get(self, "nmea_destination_port_variable")

    @nmea_destination_port_variable.setter
    def nmea_destination_port_variable(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nmea_destination_port_variable", value)

    @property
    @pulumi.getter(name="nmeaEnable")
    def nmea_enable(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable/disable NMEA data - Default value: `false`
        """
        return pulumi.get(self, "nmea_enable")

    @nmea_enable.setter
    def nmea_enable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "nmea_enable", value)

    @property
    @pulumi.getter(name="nmeaEnableVariable")
    def nmea_enable_variable(self) -> Optional[pulumi.Input[str]]:
        """
        Variable name
        """
        return pulumi.get(self, "nmea_enable_variable")

    @nmea_enable_variable.setter
    def nmea_enable_variable(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nmea_enable_variable", value)

    @property
    @pulumi.getter(name="nmeaSourceAddress")
    def nmea_source_address(self) -> Optional[pulumi.Input[str]]:
        """
        Source address
        """
        return pulumi.get(self, "nmea_source_address")

    @nmea_source_address.setter
    def nmea_source_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nmea_source_address", value)

    @property
    @pulumi.getter(name="nmeaSourceAddressVariable")
    def nmea_source_address_variable(self) -> Optional[pulumi.Input[str]]:
        """
        Variable name
        """
        return pulumi.get(self, "nmea_source_address_variable")

    @nmea_source_address_variable.setter
    def nmea_source_address_variable(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nmea_source_address_variable", value)


@pulumi.input_type
class _TransportGpsFeatureState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 feature_profile_id: Optional[pulumi.Input[str]] = None,
                 gps_enable: Optional[pulumi.Input[bool]] = None,
                 gps_enable_variable: Optional[pulumi.Input[str]] = None,
                 gps_mode: Optional[pulumi.Input[str]] = None,
                 gps_mode_variable: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 nmea_destination_address: Optional[pulumi.Input[str]] = None,
                 nmea_destination_address_variable: Optional[pulumi.Input[str]] = None,
                 nmea_destination_port: Optional[pulumi.Input[int]] = None,
                 nmea_destination_port_variable: Optional[pulumi.Input[str]] = None,
                 nmea_enable: Optional[pulumi.Input[bool]] = None,
                 nmea_enable_variable: Optional[pulumi.Input[str]] = None,
                 nmea_source_address: Optional[pulumi.Input[str]] = None,
                 nmea_source_address_variable: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering TransportGpsFeature resources.
        :param pulumi.Input[str] description: The description of the Feature
        :param pulumi.Input[str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[bool] gps_enable: Enable/disable GPS - Default value: `false`
        :param pulumi.Input[str] gps_enable_variable: Variable name
        :param pulumi.Input[str] gps_mode: Select GPS mode - Choices: `ms-based`, `standalone` - Default value: `ms-based`
        :param pulumi.Input[str] gps_mode_variable: Variable name
        :param pulumi.Input[str] name: The name of the Feature
        :param pulumi.Input[str] nmea_destination_address: Destination address
        :param pulumi.Input[str] nmea_destination_address_variable: Variable name
        :param pulumi.Input[int] nmea_destination_port: Destination port - Range: `1`-`65535`
        :param pulumi.Input[str] nmea_destination_port_variable: Variable name
        :param pulumi.Input[bool] nmea_enable: Enable/disable NMEA data - Default value: `false`
        :param pulumi.Input[str] nmea_enable_variable: Variable name
        :param pulumi.Input[str] nmea_source_address: Source address
        :param pulumi.Input[str] nmea_source_address_variable: Variable name
        :param pulumi.Input[int] version: The version of the Feature
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if feature_profile_id is not None:
            pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if gps_enable is not None:
            pulumi.set(__self__, "gps_enable", gps_enable)
        if gps_enable_variable is not None:
            pulumi.set(__self__, "gps_enable_variable", gps_enable_variable)
        if gps_mode is not None:
            pulumi.set(__self__, "gps_mode", gps_mode)
        if gps_mode_variable is not None:
            pulumi.set(__self__, "gps_mode_variable", gps_mode_variable)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if nmea_destination_address is not None:
            pulumi.set(__self__, "nmea_destination_address", nmea_destination_address)
        if nmea_destination_address_variable is not None:
            pulumi.set(__self__, "nmea_destination_address_variable", nmea_destination_address_variable)
        if nmea_destination_port is not None:
            pulumi.set(__self__, "nmea_destination_port", nmea_destination_port)
        if nmea_destination_port_variable is not None:
            pulumi.set(__self__, "nmea_destination_port_variable", nmea_destination_port_variable)
        if nmea_enable is not None:
            pulumi.set(__self__, "nmea_enable", nmea_enable)
        if nmea_enable_variable is not None:
            pulumi.set(__self__, "nmea_enable_variable", nmea_enable_variable)
        if nmea_source_address is not None:
            pulumi.set(__self__, "nmea_source_address", nmea_source_address)
        if nmea_source_address_variable is not None:
            pulumi.set(__self__, "nmea_source_address_variable", nmea_source_address_variable)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the Feature
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="featureProfileId")
    def feature_profile_id(self) -> Optional[pulumi.Input[str]]:
        """
        Feature Profile ID
        """
        return pulumi.get(self, "feature_profile_id")

    @feature_profile_id.setter
    def feature_profile_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "feature_profile_id", value)

    @property
    @pulumi.getter(name="gpsEnable")
    def gps_enable(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable/disable GPS - Default value: `false`
        """
        return pulumi.get(self, "gps_enable")

    @gps_enable.setter
    def gps_enable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "gps_enable", value)

    @property
    @pulumi.getter(name="gpsEnableVariable")
    def gps_enable_variable(self) -> Optional[pulumi.Input[str]]:
        """
        Variable name
        """
        return pulumi.get(self, "gps_enable_variable")

    @gps_enable_variable.setter
    def gps_enable_variable(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gps_enable_variable", value)

    @property
    @pulumi.getter(name="gpsMode")
    def gps_mode(self) -> Optional[pulumi.Input[str]]:
        """
        Select GPS mode - Choices: `ms-based`, `standalone` - Default value: `ms-based`
        """
        return pulumi.get(self, "gps_mode")

    @gps_mode.setter
    def gps_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gps_mode", value)

    @property
    @pulumi.getter(name="gpsModeVariable")
    def gps_mode_variable(self) -> Optional[pulumi.Input[str]]:
        """
        Variable name
        """
        return pulumi.get(self, "gps_mode_variable")

    @gps_mode_variable.setter
    def gps_mode_variable(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gps_mode_variable", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Feature
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="nmeaDestinationAddress")
    def nmea_destination_address(self) -> Optional[pulumi.Input[str]]:
        """
        Destination address
        """
        return pulumi.get(self, "nmea_destination_address")

    @nmea_destination_address.setter
    def nmea_destination_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nmea_destination_address", value)

    @property
    @pulumi.getter(name="nmeaDestinationAddressVariable")
    def nmea_destination_address_variable(self) -> Optional[pulumi.Input[str]]:
        """
        Variable name
        """
        return pulumi.get(self, "nmea_destination_address_variable")

    @nmea_destination_address_variable.setter
    def nmea_destination_address_variable(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nmea_destination_address_variable", value)

    @property
    @pulumi.getter(name="nmeaDestinationPort")
    def nmea_destination_port(self) -> Optional[pulumi.Input[int]]:
        """
        Destination port - Range: `1`-`65535`
        """
        return pulumi.get(self, "nmea_destination_port")

    @nmea_destination_port.setter
    def nmea_destination_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "nmea_destination_port", value)

    @property
    @pulumi.getter(name="nmeaDestinationPortVariable")
    def nmea_destination_port_variable(self) -> Optional[pulumi.Input[str]]:
        """
        Variable name
        """
        return pulumi.get(self, "nmea_destination_port_variable")

    @nmea_destination_port_variable.setter
    def nmea_destination_port_variable(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nmea_destination_port_variable", value)

    @property
    @pulumi.getter(name="nmeaEnable")
    def nmea_enable(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable/disable NMEA data - Default value: `false`
        """
        return pulumi.get(self, "nmea_enable")

    @nmea_enable.setter
    def nmea_enable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "nmea_enable", value)

    @property
    @pulumi.getter(name="nmeaEnableVariable")
    def nmea_enable_variable(self) -> Optional[pulumi.Input[str]]:
        """
        Variable name
        """
        return pulumi.get(self, "nmea_enable_variable")

    @nmea_enable_variable.setter
    def nmea_enable_variable(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nmea_enable_variable", value)

    @property
    @pulumi.getter(name="nmeaSourceAddress")
    def nmea_source_address(self) -> Optional[pulumi.Input[str]]:
        """
        Source address
        """
        return pulumi.get(self, "nmea_source_address")

    @nmea_source_address.setter
    def nmea_source_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nmea_source_address", value)

    @property
    @pulumi.getter(name="nmeaSourceAddressVariable")
    def nmea_source_address_variable(self) -> Optional[pulumi.Input[str]]:
        """
        Variable name
        """
        return pulumi.get(self, "nmea_source_address_variable")

    @nmea_source_address_variable.setter
    def nmea_source_address_variable(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nmea_source_address_variable", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[int]]:
        """
        The version of the Feature
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "version", value)


class TransportGpsFeature(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 feature_profile_id: Optional[pulumi.Input[str]] = None,
                 gps_enable: Optional[pulumi.Input[bool]] = None,
                 gps_enable_variable: Optional[pulumi.Input[str]] = None,
                 gps_mode: Optional[pulumi.Input[str]] = None,
                 gps_mode_variable: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 nmea_destination_address: Optional[pulumi.Input[str]] = None,
                 nmea_destination_address_variable: Optional[pulumi.Input[str]] = None,
                 nmea_destination_port: Optional[pulumi.Input[int]] = None,
                 nmea_destination_port_variable: Optional[pulumi.Input[str]] = None,
                 nmea_enable: Optional[pulumi.Input[bool]] = None,
                 nmea_enable_variable: Optional[pulumi.Input[str]] = None,
                 nmea_source_address: Optional[pulumi.Input[str]] = None,
                 nmea_source_address_variable: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource can manage a Transport GPS Feature.
          - Minimum SD-WAN Manager version: `20.12.0`

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sdwan as sdwan

        example = sdwan.TransportGpsFeature("example",
            name="Example",
            description="My Example",
            feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
            gps_enable=False,
            gps_mode="ms-based",
            nmea_enable=False,
            nmea_source_address="1.2.3.4",
            nmea_destination_address="2.3.4.5",
            nmea_destination_port=22)
        ```

        ## Import

        ```sh
        $ pulumi import sdwan:index/transportGpsFeature:TransportGpsFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the Feature
        :param pulumi.Input[str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[bool] gps_enable: Enable/disable GPS - Default value: `false`
        :param pulumi.Input[str] gps_enable_variable: Variable name
        :param pulumi.Input[str] gps_mode: Select GPS mode - Choices: `ms-based`, `standalone` - Default value: `ms-based`
        :param pulumi.Input[str] gps_mode_variable: Variable name
        :param pulumi.Input[str] name: The name of the Feature
        :param pulumi.Input[str] nmea_destination_address: Destination address
        :param pulumi.Input[str] nmea_destination_address_variable: Variable name
        :param pulumi.Input[int] nmea_destination_port: Destination port - Range: `1`-`65535`
        :param pulumi.Input[str] nmea_destination_port_variable: Variable name
        :param pulumi.Input[bool] nmea_enable: Enable/disable NMEA data - Default value: `false`
        :param pulumi.Input[str] nmea_enable_variable: Variable name
        :param pulumi.Input[str] nmea_source_address: Source address
        :param pulumi.Input[str] nmea_source_address_variable: Variable name
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TransportGpsFeatureArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage a Transport GPS Feature.
          - Minimum SD-WAN Manager version: `20.12.0`

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sdwan as sdwan

        example = sdwan.TransportGpsFeature("example",
            name="Example",
            description="My Example",
            feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
            gps_enable=False,
            gps_mode="ms-based",
            nmea_enable=False,
            nmea_source_address="1.2.3.4",
            nmea_destination_address="2.3.4.5",
            nmea_destination_port=22)
        ```

        ## Import

        ```sh
        $ pulumi import sdwan:index/transportGpsFeature:TransportGpsFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd"
        ```

        :param str resource_name: The name of the resource.
        :param TransportGpsFeatureArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TransportGpsFeatureArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 feature_profile_id: Optional[pulumi.Input[str]] = None,
                 gps_enable: Optional[pulumi.Input[bool]] = None,
                 gps_enable_variable: Optional[pulumi.Input[str]] = None,
                 gps_mode: Optional[pulumi.Input[str]] = None,
                 gps_mode_variable: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 nmea_destination_address: Optional[pulumi.Input[str]] = None,
                 nmea_destination_address_variable: Optional[pulumi.Input[str]] = None,
                 nmea_destination_port: Optional[pulumi.Input[int]] = None,
                 nmea_destination_port_variable: Optional[pulumi.Input[str]] = None,
                 nmea_enable: Optional[pulumi.Input[bool]] = None,
                 nmea_enable_variable: Optional[pulumi.Input[str]] = None,
                 nmea_source_address: Optional[pulumi.Input[str]] = None,
                 nmea_source_address_variable: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TransportGpsFeatureArgs.__new__(TransportGpsFeatureArgs)

            __props__.__dict__["description"] = description
            if feature_profile_id is None and not opts.urn:
                raise TypeError("Missing required property 'feature_profile_id'")
            __props__.__dict__["feature_profile_id"] = feature_profile_id
            __props__.__dict__["gps_enable"] = gps_enable
            __props__.__dict__["gps_enable_variable"] = gps_enable_variable
            __props__.__dict__["gps_mode"] = gps_mode
            __props__.__dict__["gps_mode_variable"] = gps_mode_variable
            __props__.__dict__["name"] = name
            __props__.__dict__["nmea_destination_address"] = nmea_destination_address
            __props__.__dict__["nmea_destination_address_variable"] = nmea_destination_address_variable
            __props__.__dict__["nmea_destination_port"] = nmea_destination_port
            __props__.__dict__["nmea_destination_port_variable"] = nmea_destination_port_variable
            __props__.__dict__["nmea_enable"] = nmea_enable
            __props__.__dict__["nmea_enable_variable"] = nmea_enable_variable
            __props__.__dict__["nmea_source_address"] = nmea_source_address
            __props__.__dict__["nmea_source_address_variable"] = nmea_source_address_variable
            __props__.__dict__["version"] = None
        super(TransportGpsFeature, __self__).__init__(
            'sdwan:index/transportGpsFeature:TransportGpsFeature',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            feature_profile_id: Optional[pulumi.Input[str]] = None,
            gps_enable: Optional[pulumi.Input[bool]] = None,
            gps_enable_variable: Optional[pulumi.Input[str]] = None,
            gps_mode: Optional[pulumi.Input[str]] = None,
            gps_mode_variable: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            nmea_destination_address: Optional[pulumi.Input[str]] = None,
            nmea_destination_address_variable: Optional[pulumi.Input[str]] = None,
            nmea_destination_port: Optional[pulumi.Input[int]] = None,
            nmea_destination_port_variable: Optional[pulumi.Input[str]] = None,
            nmea_enable: Optional[pulumi.Input[bool]] = None,
            nmea_enable_variable: Optional[pulumi.Input[str]] = None,
            nmea_source_address: Optional[pulumi.Input[str]] = None,
            nmea_source_address_variable: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[int]] = None) -> 'TransportGpsFeature':
        """
        Get an existing TransportGpsFeature resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the Feature
        :param pulumi.Input[str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[bool] gps_enable: Enable/disable GPS - Default value: `false`
        :param pulumi.Input[str] gps_enable_variable: Variable name
        :param pulumi.Input[str] gps_mode: Select GPS mode - Choices: `ms-based`, `standalone` - Default value: `ms-based`
        :param pulumi.Input[str] gps_mode_variable: Variable name
        :param pulumi.Input[str] name: The name of the Feature
        :param pulumi.Input[str] nmea_destination_address: Destination address
        :param pulumi.Input[str] nmea_destination_address_variable: Variable name
        :param pulumi.Input[int] nmea_destination_port: Destination port - Range: `1`-`65535`
        :param pulumi.Input[str] nmea_destination_port_variable: Variable name
        :param pulumi.Input[bool] nmea_enable: Enable/disable NMEA data - Default value: `false`
        :param pulumi.Input[str] nmea_enable_variable: Variable name
        :param pulumi.Input[str] nmea_source_address: Source address
        :param pulumi.Input[str] nmea_source_address_variable: Variable name
        :param pulumi.Input[int] version: The version of the Feature
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TransportGpsFeatureState.__new__(_TransportGpsFeatureState)

        __props__.__dict__["description"] = description
        __props__.__dict__["feature_profile_id"] = feature_profile_id
        __props__.__dict__["gps_enable"] = gps_enable
        __props__.__dict__["gps_enable_variable"] = gps_enable_variable
        __props__.__dict__["gps_mode"] = gps_mode
        __props__.__dict__["gps_mode_variable"] = gps_mode_variable
        __props__.__dict__["name"] = name
        __props__.__dict__["nmea_destination_address"] = nmea_destination_address
        __props__.__dict__["nmea_destination_address_variable"] = nmea_destination_address_variable
        __props__.__dict__["nmea_destination_port"] = nmea_destination_port
        __props__.__dict__["nmea_destination_port_variable"] = nmea_destination_port_variable
        __props__.__dict__["nmea_enable"] = nmea_enable
        __props__.__dict__["nmea_enable_variable"] = nmea_enable_variable
        __props__.__dict__["nmea_source_address"] = nmea_source_address
        __props__.__dict__["nmea_source_address_variable"] = nmea_source_address_variable
        __props__.__dict__["version"] = version
        return TransportGpsFeature(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the Feature
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="featureProfileId")
    def feature_profile_id(self) -> pulumi.Output[str]:
        """
        Feature Profile ID
        """
        return pulumi.get(self, "feature_profile_id")

    @property
    @pulumi.getter(name="gpsEnable")
    def gps_enable(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable/disable GPS - Default value: `false`
        """
        return pulumi.get(self, "gps_enable")

    @property
    @pulumi.getter(name="gpsEnableVariable")
    def gps_enable_variable(self) -> pulumi.Output[Optional[str]]:
        """
        Variable name
        """
        return pulumi.get(self, "gps_enable_variable")

    @property
    @pulumi.getter(name="gpsMode")
    def gps_mode(self) -> pulumi.Output[Optional[str]]:
        """
        Select GPS mode - Choices: `ms-based`, `standalone` - Default value: `ms-based`
        """
        return pulumi.get(self, "gps_mode")

    @property
    @pulumi.getter(name="gpsModeVariable")
    def gps_mode_variable(self) -> pulumi.Output[Optional[str]]:
        """
        Variable name
        """
        return pulumi.get(self, "gps_mode_variable")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Feature
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nmeaDestinationAddress")
    def nmea_destination_address(self) -> pulumi.Output[Optional[str]]:
        """
        Destination address
        """
        return pulumi.get(self, "nmea_destination_address")

    @property
    @pulumi.getter(name="nmeaDestinationAddressVariable")
    def nmea_destination_address_variable(self) -> pulumi.Output[Optional[str]]:
        """
        Variable name
        """
        return pulumi.get(self, "nmea_destination_address_variable")

    @property
    @pulumi.getter(name="nmeaDestinationPort")
    def nmea_destination_port(self) -> pulumi.Output[Optional[int]]:
        """
        Destination port - Range: `1`-`65535`
        """
        return pulumi.get(self, "nmea_destination_port")

    @property
    @pulumi.getter(name="nmeaDestinationPortVariable")
    def nmea_destination_port_variable(self) -> pulumi.Output[Optional[str]]:
        """
        Variable name
        """
        return pulumi.get(self, "nmea_destination_port_variable")

    @property
    @pulumi.getter(name="nmeaEnable")
    def nmea_enable(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable/disable NMEA data - Default value: `false`
        """
        return pulumi.get(self, "nmea_enable")

    @property
    @pulumi.getter(name="nmeaEnableVariable")
    def nmea_enable_variable(self) -> pulumi.Output[Optional[str]]:
        """
        Variable name
        """
        return pulumi.get(self, "nmea_enable_variable")

    @property
    @pulumi.getter(name="nmeaSourceAddress")
    def nmea_source_address(self) -> pulumi.Output[Optional[str]]:
        """
        Source address
        """
        return pulumi.get(self, "nmea_source_address")

    @property
    @pulumi.getter(name="nmeaSourceAddressVariable")
    def nmea_source_address_variable(self) -> pulumi.Output[Optional[str]]:
        """
        Variable name
        """
        return pulumi.get(self, "nmea_source_address_variable")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[int]:
        """
        The version of the Feature
        """
        return pulumi.get(self, "version")
