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
from ._inputs import *

__all__ = ['TransportTrackerGroupFeatureArgs', 'TransportTrackerGroupFeature']

@pulumi.input_type
class TransportTrackerGroupFeatureArgs:
    def __init__(__self__, *,
                 feature_profile_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tracker_boolean: Optional[pulumi.Input[str]] = None,
                 tracker_boolean_variable: Optional[pulumi.Input[str]] = None,
                 tracker_elements: Optional[pulumi.Input[Sequence[pulumi.Input['TransportTrackerGroupFeatureTrackerElementArgs']]]] = None):
        """
        The set of arguments for constructing a TransportTrackerGroupFeature resource.
        :param pulumi.Input[str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[str] description: The description of the Feature
        :param pulumi.Input[str] name: The name of the Feature
        :param pulumi.Input[str] tracker_boolean: tracker ref list combine boolean and or - Choices: `and`, `or` - Default value: `or`
        :param pulumi.Input[str] tracker_boolean_variable: Variable name
        :param pulumi.Input[Sequence[pulumi.Input['TransportTrackerGroupFeatureTrackerElementArgs']]] tracker_elements: tracker parcel ref list
        """
        pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tracker_boolean is not None:
            pulumi.set(__self__, "tracker_boolean", tracker_boolean)
        if tracker_boolean_variable is not None:
            pulumi.set(__self__, "tracker_boolean_variable", tracker_boolean_variable)
        if tracker_elements is not None:
            pulumi.set(__self__, "tracker_elements", tracker_elements)

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
    @pulumi.getter(name="trackerBoolean")
    def tracker_boolean(self) -> Optional[pulumi.Input[str]]:
        """
        tracker ref list combine boolean and or - Choices: `and`, `or` - Default value: `or`
        """
        return pulumi.get(self, "tracker_boolean")

    @tracker_boolean.setter
    def tracker_boolean(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tracker_boolean", value)

    @property
    @pulumi.getter(name="trackerBooleanVariable")
    def tracker_boolean_variable(self) -> Optional[pulumi.Input[str]]:
        """
        Variable name
        """
        return pulumi.get(self, "tracker_boolean_variable")

    @tracker_boolean_variable.setter
    def tracker_boolean_variable(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tracker_boolean_variable", value)

    @property
    @pulumi.getter(name="trackerElements")
    def tracker_elements(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TransportTrackerGroupFeatureTrackerElementArgs']]]]:
        """
        tracker parcel ref list
        """
        return pulumi.get(self, "tracker_elements")

    @tracker_elements.setter
    def tracker_elements(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TransportTrackerGroupFeatureTrackerElementArgs']]]]):
        pulumi.set(self, "tracker_elements", value)


@pulumi.input_type
class _TransportTrackerGroupFeatureState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 feature_profile_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tracker_boolean: Optional[pulumi.Input[str]] = None,
                 tracker_boolean_variable: Optional[pulumi.Input[str]] = None,
                 tracker_elements: Optional[pulumi.Input[Sequence[pulumi.Input['TransportTrackerGroupFeatureTrackerElementArgs']]]] = None,
                 version: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering TransportTrackerGroupFeature resources.
        :param pulumi.Input[str] description: The description of the Feature
        :param pulumi.Input[str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[str] name: The name of the Feature
        :param pulumi.Input[str] tracker_boolean: tracker ref list combine boolean and or - Choices: `and`, `or` - Default value: `or`
        :param pulumi.Input[str] tracker_boolean_variable: Variable name
        :param pulumi.Input[Sequence[pulumi.Input['TransportTrackerGroupFeatureTrackerElementArgs']]] tracker_elements: tracker parcel ref list
        :param pulumi.Input[int] version: The version of the Feature
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if feature_profile_id is not None:
            pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tracker_boolean is not None:
            pulumi.set(__self__, "tracker_boolean", tracker_boolean)
        if tracker_boolean_variable is not None:
            pulumi.set(__self__, "tracker_boolean_variable", tracker_boolean_variable)
        if tracker_elements is not None:
            pulumi.set(__self__, "tracker_elements", tracker_elements)
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
    @pulumi.getter(name="trackerBoolean")
    def tracker_boolean(self) -> Optional[pulumi.Input[str]]:
        """
        tracker ref list combine boolean and or - Choices: `and`, `or` - Default value: `or`
        """
        return pulumi.get(self, "tracker_boolean")

    @tracker_boolean.setter
    def tracker_boolean(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tracker_boolean", value)

    @property
    @pulumi.getter(name="trackerBooleanVariable")
    def tracker_boolean_variable(self) -> Optional[pulumi.Input[str]]:
        """
        Variable name
        """
        return pulumi.get(self, "tracker_boolean_variable")

    @tracker_boolean_variable.setter
    def tracker_boolean_variable(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tracker_boolean_variable", value)

    @property
    @pulumi.getter(name="trackerElements")
    def tracker_elements(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TransportTrackerGroupFeatureTrackerElementArgs']]]]:
        """
        tracker parcel ref list
        """
        return pulumi.get(self, "tracker_elements")

    @tracker_elements.setter
    def tracker_elements(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TransportTrackerGroupFeatureTrackerElementArgs']]]]):
        pulumi.set(self, "tracker_elements", value)

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


class TransportTrackerGroupFeature(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 feature_profile_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tracker_boolean: Optional[pulumi.Input[str]] = None,
                 tracker_boolean_variable: Optional[pulumi.Input[str]] = None,
                 tracker_elements: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TransportTrackerGroupFeatureTrackerElementArgs', 'TransportTrackerGroupFeatureTrackerElementArgsDict']]]]] = None,
                 __props__=None):
        """
        This resource can manage a Transport Tracker Group Feature.
          - Minimum SD-WAN Manager version: `20.12.0`

        ## Import

        ```sh
        $ pulumi import sdwan:index/transportTrackerGroupFeature:TransportTrackerGroupFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the Feature
        :param pulumi.Input[str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[str] name: The name of the Feature
        :param pulumi.Input[str] tracker_boolean: tracker ref list combine boolean and or - Choices: `and`, `or` - Default value: `or`
        :param pulumi.Input[str] tracker_boolean_variable: Variable name
        :param pulumi.Input[Sequence[pulumi.Input[Union['TransportTrackerGroupFeatureTrackerElementArgs', 'TransportTrackerGroupFeatureTrackerElementArgsDict']]]] tracker_elements: tracker parcel ref list
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TransportTrackerGroupFeatureArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage a Transport Tracker Group Feature.
          - Minimum SD-WAN Manager version: `20.12.0`

        ## Import

        ```sh
        $ pulumi import sdwan:index/transportTrackerGroupFeature:TransportTrackerGroupFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd"
        ```

        :param str resource_name: The name of the resource.
        :param TransportTrackerGroupFeatureArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TransportTrackerGroupFeatureArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 feature_profile_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tracker_boolean: Optional[pulumi.Input[str]] = None,
                 tracker_boolean_variable: Optional[pulumi.Input[str]] = None,
                 tracker_elements: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TransportTrackerGroupFeatureTrackerElementArgs', 'TransportTrackerGroupFeatureTrackerElementArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TransportTrackerGroupFeatureArgs.__new__(TransportTrackerGroupFeatureArgs)

            __props__.__dict__["description"] = description
            if feature_profile_id is None and not opts.urn:
                raise TypeError("Missing required property 'feature_profile_id'")
            __props__.__dict__["feature_profile_id"] = feature_profile_id
            __props__.__dict__["name"] = name
            __props__.__dict__["tracker_boolean"] = tracker_boolean
            __props__.__dict__["tracker_boolean_variable"] = tracker_boolean_variable
            __props__.__dict__["tracker_elements"] = tracker_elements
            __props__.__dict__["version"] = None
        super(TransportTrackerGroupFeature, __self__).__init__(
            'sdwan:index/transportTrackerGroupFeature:TransportTrackerGroupFeature',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            feature_profile_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            tracker_boolean: Optional[pulumi.Input[str]] = None,
            tracker_boolean_variable: Optional[pulumi.Input[str]] = None,
            tracker_elements: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TransportTrackerGroupFeatureTrackerElementArgs', 'TransportTrackerGroupFeatureTrackerElementArgsDict']]]]] = None,
            version: Optional[pulumi.Input[int]] = None) -> 'TransportTrackerGroupFeature':
        """
        Get an existing TransportTrackerGroupFeature resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the Feature
        :param pulumi.Input[str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[str] name: The name of the Feature
        :param pulumi.Input[str] tracker_boolean: tracker ref list combine boolean and or - Choices: `and`, `or` - Default value: `or`
        :param pulumi.Input[str] tracker_boolean_variable: Variable name
        :param pulumi.Input[Sequence[pulumi.Input[Union['TransportTrackerGroupFeatureTrackerElementArgs', 'TransportTrackerGroupFeatureTrackerElementArgsDict']]]] tracker_elements: tracker parcel ref list
        :param pulumi.Input[int] version: The version of the Feature
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TransportTrackerGroupFeatureState.__new__(_TransportTrackerGroupFeatureState)

        __props__.__dict__["description"] = description
        __props__.__dict__["feature_profile_id"] = feature_profile_id
        __props__.__dict__["name"] = name
        __props__.__dict__["tracker_boolean"] = tracker_boolean
        __props__.__dict__["tracker_boolean_variable"] = tracker_boolean_variable
        __props__.__dict__["tracker_elements"] = tracker_elements
        __props__.__dict__["version"] = version
        return TransportTrackerGroupFeature(resource_name, opts=opts, __props__=__props__)

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
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Feature
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="trackerBoolean")
    def tracker_boolean(self) -> pulumi.Output[Optional[str]]:
        """
        tracker ref list combine boolean and or - Choices: `and`, `or` - Default value: `or`
        """
        return pulumi.get(self, "tracker_boolean")

    @property
    @pulumi.getter(name="trackerBooleanVariable")
    def tracker_boolean_variable(self) -> pulumi.Output[Optional[str]]:
        """
        Variable name
        """
        return pulumi.get(self, "tracker_boolean_variable")

    @property
    @pulumi.getter(name="trackerElements")
    def tracker_elements(self) -> pulumi.Output[Optional[Sequence['outputs.TransportTrackerGroupFeatureTrackerElement']]]:
        """
        tracker parcel ref list
        """
        return pulumi.get(self, "tracker_elements")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[int]:
        """
        The version of the Feature
        """
        return pulumi.get(self, "version")
