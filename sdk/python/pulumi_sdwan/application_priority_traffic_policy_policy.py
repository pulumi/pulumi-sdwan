# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
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

__all__ = ['ApplicationPriorityTrafficPolicyPolicyArgs', 'ApplicationPriorityTrafficPolicyPolicy']

@pulumi.input_type
class ApplicationPriorityTrafficPolicyPolicyArgs:
    def __init__(__self__, *,
                 default_action: pulumi.Input[builtins.str],
                 direction: pulumi.Input[builtins.str],
                 feature_profile_id: pulumi.Input[builtins.str],
                 vpns: pulumi.Input[Sequence[pulumi.Input[builtins.str]]],
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 sequences: Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationPriorityTrafficPolicyPolicySequenceArgs']]]] = None):
        """
        The set of arguments for constructing a ApplicationPriorityTrafficPolicyPolicy resource.
        :param pulumi.Input[builtins.str] default_action: - Choices: `drop`, `accept`
        :param pulumi.Input[builtins.str] direction: - Choices: `service`, `tunnel`, `all`
        :param pulumi.Input[builtins.str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[builtins.str] description: The description of the Policy
        :param pulumi.Input[builtins.str] name: The name of the Policy
        :param pulumi.Input[Sequence[pulumi.Input['ApplicationPriorityTrafficPolicyPolicySequenceArgs']]] sequences: Traffic policy sequence list
        """
        pulumi.set(__self__, "default_action", default_action)
        pulumi.set(__self__, "direction", direction)
        pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        pulumi.set(__self__, "vpns", vpns)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if sequences is not None:
            pulumi.set(__self__, "sequences", sequences)

    @property
    @pulumi.getter(name="defaultAction")
    def default_action(self) -> pulumi.Input[builtins.str]:
        """
        - Choices: `drop`, `accept`
        """
        return pulumi.get(self, "default_action")

    @default_action.setter
    def default_action(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "default_action", value)

    @property
    @pulumi.getter
    def direction(self) -> pulumi.Input[builtins.str]:
        """
        - Choices: `service`, `tunnel`, `all`
        """
        return pulumi.get(self, "direction")

    @direction.setter
    def direction(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "direction", value)

    @property
    @pulumi.getter(name="featureProfileId")
    def feature_profile_id(self) -> pulumi.Input[builtins.str]:
        """
        Feature Profile ID
        """
        return pulumi.get(self, "feature_profile_id")

    @feature_profile_id.setter
    def feature_profile_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "feature_profile_id", value)

    @property
    @pulumi.getter
    def vpns(self) -> pulumi.Input[Sequence[pulumi.Input[builtins.str]]]:
        return pulumi.get(self, "vpns")

    @vpns.setter
    def vpns(self, value: pulumi.Input[Sequence[pulumi.Input[builtins.str]]]):
        pulumi.set(self, "vpns", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The description of the Policy
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the Policy
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def sequences(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationPriorityTrafficPolicyPolicySequenceArgs']]]]:
        """
        Traffic policy sequence list
        """
        return pulumi.get(self, "sequences")

    @sequences.setter
    def sequences(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationPriorityTrafficPolicyPolicySequenceArgs']]]]):
        pulumi.set(self, "sequences", value)


@pulumi.input_type
class _ApplicationPriorityTrafficPolicyPolicyState:
    def __init__(__self__, *,
                 default_action: Optional[pulumi.Input[builtins.str]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 direction: Optional[pulumi.Input[builtins.str]] = None,
                 feature_profile_id: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 sequences: Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationPriorityTrafficPolicyPolicySequenceArgs']]]] = None,
                 version: Optional[pulumi.Input[builtins.int]] = None,
                 vpns: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering ApplicationPriorityTrafficPolicyPolicy resources.
        :param pulumi.Input[builtins.str] default_action: - Choices: `drop`, `accept`
        :param pulumi.Input[builtins.str] description: The description of the Policy
        :param pulumi.Input[builtins.str] direction: - Choices: `service`, `tunnel`, `all`
        :param pulumi.Input[builtins.str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[builtins.str] name: The name of the Policy
        :param pulumi.Input[Sequence[pulumi.Input['ApplicationPriorityTrafficPolicyPolicySequenceArgs']]] sequences: Traffic policy sequence list
        :param pulumi.Input[builtins.int] version: The version of the Policy
        """
        if default_action is not None:
            pulumi.set(__self__, "default_action", default_action)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if direction is not None:
            pulumi.set(__self__, "direction", direction)
        if feature_profile_id is not None:
            pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if sequences is not None:
            pulumi.set(__self__, "sequences", sequences)
        if version is not None:
            pulumi.set(__self__, "version", version)
        if vpns is not None:
            pulumi.set(__self__, "vpns", vpns)

    @property
    @pulumi.getter(name="defaultAction")
    def default_action(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        - Choices: `drop`, `accept`
        """
        return pulumi.get(self, "default_action")

    @default_action.setter
    def default_action(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "default_action", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The description of the Policy
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def direction(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        - Choices: `service`, `tunnel`, `all`
        """
        return pulumi.get(self, "direction")

    @direction.setter
    def direction(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "direction", value)

    @property
    @pulumi.getter(name="featureProfileId")
    def feature_profile_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Feature Profile ID
        """
        return pulumi.get(self, "feature_profile_id")

    @feature_profile_id.setter
    def feature_profile_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "feature_profile_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the Policy
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def sequences(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationPriorityTrafficPolicyPolicySequenceArgs']]]]:
        """
        Traffic policy sequence list
        """
        return pulumi.get(self, "sequences")

    @sequences.setter
    def sequences(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationPriorityTrafficPolicyPolicySequenceArgs']]]]):
        pulumi.set(self, "sequences", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The version of the Policy
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "version", value)

    @property
    @pulumi.getter
    def vpns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        return pulumi.get(self, "vpns")

    @vpns.setter
    def vpns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "vpns", value)


@pulumi.type_token("sdwan:index/applicationPriorityTrafficPolicyPolicy:ApplicationPriorityTrafficPolicyPolicy")
class ApplicationPriorityTrafficPolicyPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_action: Optional[pulumi.Input[builtins.str]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 direction: Optional[pulumi.Input[builtins.str]] = None,
                 feature_profile_id: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 sequences: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ApplicationPriorityTrafficPolicyPolicySequenceArgs', 'ApplicationPriorityTrafficPolicyPolicySequenceArgsDict']]]]] = None,
                 vpns: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 __props__=None):
        """
        This resource can manage a Application Priority Traffic Policy Policy.
          - Minimum SD-WAN Manager version: `20.12.0`

        ## Import

        The `pulumi import` command can be used, for example:

        Expected import identifier with the format: "application_priority_traffic_policy_policy_id,feature_profile_id"

        ```sh
        $ pulumi import sdwan:index/applicationPriorityTrafficPolicyPolicy:ApplicationPriorityTrafficPolicyPolicy example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] default_action: - Choices: `drop`, `accept`
        :param pulumi.Input[builtins.str] description: The description of the Policy
        :param pulumi.Input[builtins.str] direction: - Choices: `service`, `tunnel`, `all`
        :param pulumi.Input[builtins.str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[builtins.str] name: The name of the Policy
        :param pulumi.Input[Sequence[pulumi.Input[Union['ApplicationPriorityTrafficPolicyPolicySequenceArgs', 'ApplicationPriorityTrafficPolicyPolicySequenceArgsDict']]]] sequences: Traffic policy sequence list
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApplicationPriorityTrafficPolicyPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage a Application Priority Traffic Policy Policy.
          - Minimum SD-WAN Manager version: `20.12.0`

        ## Import

        The `pulumi import` command can be used, for example:

        Expected import identifier with the format: "application_priority_traffic_policy_policy_id,feature_profile_id"

        ```sh
        $ pulumi import sdwan:index/applicationPriorityTrafficPolicyPolicy:ApplicationPriorityTrafficPolicyPolicy example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"
        ```

        :param str resource_name: The name of the resource.
        :param ApplicationPriorityTrafficPolicyPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApplicationPriorityTrafficPolicyPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_action: Optional[pulumi.Input[builtins.str]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 direction: Optional[pulumi.Input[builtins.str]] = None,
                 feature_profile_id: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 sequences: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ApplicationPriorityTrafficPolicyPolicySequenceArgs', 'ApplicationPriorityTrafficPolicyPolicySequenceArgsDict']]]]] = None,
                 vpns: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApplicationPriorityTrafficPolicyPolicyArgs.__new__(ApplicationPriorityTrafficPolicyPolicyArgs)

            if default_action is None and not opts.urn:
                raise TypeError("Missing required property 'default_action'")
            __props__.__dict__["default_action"] = default_action
            __props__.__dict__["description"] = description
            if direction is None and not opts.urn:
                raise TypeError("Missing required property 'direction'")
            __props__.__dict__["direction"] = direction
            if feature_profile_id is None and not opts.urn:
                raise TypeError("Missing required property 'feature_profile_id'")
            __props__.__dict__["feature_profile_id"] = feature_profile_id
            __props__.__dict__["name"] = name
            __props__.__dict__["sequences"] = sequences
            if vpns is None and not opts.urn:
                raise TypeError("Missing required property 'vpns'")
            __props__.__dict__["vpns"] = vpns
            __props__.__dict__["version"] = None
        super(ApplicationPriorityTrafficPolicyPolicy, __self__).__init__(
            'sdwan:index/applicationPriorityTrafficPolicyPolicy:ApplicationPriorityTrafficPolicyPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            default_action: Optional[pulumi.Input[builtins.str]] = None,
            description: Optional[pulumi.Input[builtins.str]] = None,
            direction: Optional[pulumi.Input[builtins.str]] = None,
            feature_profile_id: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            sequences: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ApplicationPriorityTrafficPolicyPolicySequenceArgs', 'ApplicationPriorityTrafficPolicyPolicySequenceArgsDict']]]]] = None,
            version: Optional[pulumi.Input[builtins.int]] = None,
            vpns: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None) -> 'ApplicationPriorityTrafficPolicyPolicy':
        """
        Get an existing ApplicationPriorityTrafficPolicyPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] default_action: - Choices: `drop`, `accept`
        :param pulumi.Input[builtins.str] description: The description of the Policy
        :param pulumi.Input[builtins.str] direction: - Choices: `service`, `tunnel`, `all`
        :param pulumi.Input[builtins.str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[builtins.str] name: The name of the Policy
        :param pulumi.Input[Sequence[pulumi.Input[Union['ApplicationPriorityTrafficPolicyPolicySequenceArgs', 'ApplicationPriorityTrafficPolicyPolicySequenceArgsDict']]]] sequences: Traffic policy sequence list
        :param pulumi.Input[builtins.int] version: The version of the Policy
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApplicationPriorityTrafficPolicyPolicyState.__new__(_ApplicationPriorityTrafficPolicyPolicyState)

        __props__.__dict__["default_action"] = default_action
        __props__.__dict__["description"] = description
        __props__.__dict__["direction"] = direction
        __props__.__dict__["feature_profile_id"] = feature_profile_id
        __props__.__dict__["name"] = name
        __props__.__dict__["sequences"] = sequences
        __props__.__dict__["version"] = version
        __props__.__dict__["vpns"] = vpns
        return ApplicationPriorityTrafficPolicyPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="defaultAction")
    def default_action(self) -> pulumi.Output[builtins.str]:
        """
        - Choices: `drop`, `accept`
        """
        return pulumi.get(self, "default_action")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The description of the Policy
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def direction(self) -> pulumi.Output[builtins.str]:
        """
        - Choices: `service`, `tunnel`, `all`
        """
        return pulumi.get(self, "direction")

    @property
    @pulumi.getter(name="featureProfileId")
    def feature_profile_id(self) -> pulumi.Output[builtins.str]:
        """
        Feature Profile ID
        """
        return pulumi.get(self, "feature_profile_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the Policy
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def sequences(self) -> pulumi.Output[Optional[Sequence['outputs.ApplicationPriorityTrafficPolicyPolicySequence']]]:
        """
        Traffic policy sequence list
        """
        return pulumi.get(self, "sequences")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[builtins.int]:
        """
        The version of the Policy
        """
        return pulumi.get(self, "version")

    @property
    @pulumi.getter
    def vpns(self) -> pulumi.Output[Sequence[builtins.str]]:
        return pulumi.get(self, "vpns")

