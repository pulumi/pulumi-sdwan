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

__all__ = ['PolicyObjectAsPathListArgs', 'PolicyObjectAsPathList']

@pulumi.input_type
class PolicyObjectAsPathListArgs:
    def __init__(__self__, *,
                 as_path_list_id: pulumi.Input[_builtins.int],
                 entries: pulumi.Input[Sequence[pulumi.Input['PolicyObjectAsPathListEntryArgs']]],
                 feature_profile_id: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a PolicyObjectAsPathList resource.
        :param pulumi.Input[_builtins.int] as_path_list_id: As path List Number - Range: `1`-`500`
        :param pulumi.Input[Sequence[pulumi.Input['PolicyObjectAsPathListEntryArgs']]] entries: AS Path List
        :param pulumi.Input[_builtins.str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[_builtins.str] description: The description of the Policy_object
        :param pulumi.Input[_builtins.str] name: The name of the Policy_object
        """
        pulumi.set(__self__, "as_path_list_id", as_path_list_id)
        pulumi.set(__self__, "entries", entries)
        pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="asPathListId")
    def as_path_list_id(self) -> pulumi.Input[_builtins.int]:
        """
        As path List Number - Range: `1`-`500`
        """
        return pulumi.get(self, "as_path_list_id")

    @as_path_list_id.setter
    def as_path_list_id(self, value: pulumi.Input[_builtins.int]):
        pulumi.set(self, "as_path_list_id", value)

    @_builtins.property
    @pulumi.getter
    def entries(self) -> pulumi.Input[Sequence[pulumi.Input['PolicyObjectAsPathListEntryArgs']]]:
        """
        AS Path List
        """
        return pulumi.get(self, "entries")

    @entries.setter
    def entries(self, value: pulumi.Input[Sequence[pulumi.Input['PolicyObjectAsPathListEntryArgs']]]):
        pulumi.set(self, "entries", value)

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
        The description of the Policy_object
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Policy_object
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _PolicyObjectAsPathListState:
    def __init__(__self__, *,
                 as_path_list_id: Optional[pulumi.Input[_builtins.int]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 entries: Optional[pulumi.Input[Sequence[pulumi.Input['PolicyObjectAsPathListEntryArgs']]]] = None,
                 feature_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 version: Optional[pulumi.Input[_builtins.int]] = None):
        """
        Input properties used for looking up and filtering PolicyObjectAsPathList resources.
        :param pulumi.Input[_builtins.int] as_path_list_id: As path List Number - Range: `1`-`500`
        :param pulumi.Input[_builtins.str] description: The description of the Policy_object
        :param pulumi.Input[Sequence[pulumi.Input['PolicyObjectAsPathListEntryArgs']]] entries: AS Path List
        :param pulumi.Input[_builtins.str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[_builtins.str] name: The name of the Policy_object
        :param pulumi.Input[_builtins.int] version: The version of the Policy_object
        """
        if as_path_list_id is not None:
            pulumi.set(__self__, "as_path_list_id", as_path_list_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if entries is not None:
            pulumi.set(__self__, "entries", entries)
        if feature_profile_id is not None:
            pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @_builtins.property
    @pulumi.getter(name="asPathListId")
    def as_path_list_id(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        As path List Number - Range: `1`-`500`
        """
        return pulumi.get(self, "as_path_list_id")

    @as_path_list_id.setter
    def as_path_list_id(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "as_path_list_id", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the Policy_object
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def entries(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PolicyObjectAsPathListEntryArgs']]]]:
        """
        AS Path List
        """
        return pulumi.get(self, "entries")

    @entries.setter
    def entries(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PolicyObjectAsPathListEntryArgs']]]]):
        pulumi.set(self, "entries", value)

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
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Policy_object
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The version of the Policy_object
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "version", value)


@pulumi.type_token("sdwan:index/policyObjectAsPathList:PolicyObjectAsPathList")
class PolicyObjectAsPathList(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 as_path_list_id: Optional[pulumi.Input[_builtins.int]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 entries: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PolicyObjectAsPathListEntryArgs', 'PolicyObjectAsPathListEntryArgsDict']]]]] = None,
                 feature_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        This resource can manage a Policy Object AS Path List Policy_object.
          - Minimum SD-WAN Manager version: `20.12.0`

        ## Import

        The `pulumi import` command can be used, for example:

        Expected import identifier with the format: "policy_object_as_path_list_id,feature_profile_id"

        ```sh
        $ pulumi import sdwan:index/policyObjectAsPathList:PolicyObjectAsPathList example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.int] as_path_list_id: As path List Number - Range: `1`-`500`
        :param pulumi.Input[_builtins.str] description: The description of the Policy_object
        :param pulumi.Input[Sequence[pulumi.Input[Union['PolicyObjectAsPathListEntryArgs', 'PolicyObjectAsPathListEntryArgsDict']]]] entries: AS Path List
        :param pulumi.Input[_builtins.str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[_builtins.str] name: The name of the Policy_object
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PolicyObjectAsPathListArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage a Policy Object AS Path List Policy_object.
          - Minimum SD-WAN Manager version: `20.12.0`

        ## Import

        The `pulumi import` command can be used, for example:

        Expected import identifier with the format: "policy_object_as_path_list_id,feature_profile_id"

        ```sh
        $ pulumi import sdwan:index/policyObjectAsPathList:PolicyObjectAsPathList example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"
        ```

        :param str resource_name: The name of the resource.
        :param PolicyObjectAsPathListArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PolicyObjectAsPathListArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 as_path_list_id: Optional[pulumi.Input[_builtins.int]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 entries: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PolicyObjectAsPathListEntryArgs', 'PolicyObjectAsPathListEntryArgsDict']]]]] = None,
                 feature_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PolicyObjectAsPathListArgs.__new__(PolicyObjectAsPathListArgs)

            if as_path_list_id is None and not opts.urn:
                raise TypeError("Missing required property 'as_path_list_id'")
            __props__.__dict__["as_path_list_id"] = as_path_list_id
            __props__.__dict__["description"] = description
            if entries is None and not opts.urn:
                raise TypeError("Missing required property 'entries'")
            __props__.__dict__["entries"] = entries
            if feature_profile_id is None and not opts.urn:
                raise TypeError("Missing required property 'feature_profile_id'")
            __props__.__dict__["feature_profile_id"] = feature_profile_id
            __props__.__dict__["name"] = name
            __props__.__dict__["version"] = None
        super(PolicyObjectAsPathList, __self__).__init__(
            'sdwan:index/policyObjectAsPathList:PolicyObjectAsPathList',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            as_path_list_id: Optional[pulumi.Input[_builtins.int]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            entries: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PolicyObjectAsPathListEntryArgs', 'PolicyObjectAsPathListEntryArgsDict']]]]] = None,
            feature_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            version: Optional[pulumi.Input[_builtins.int]] = None) -> 'PolicyObjectAsPathList':
        """
        Get an existing PolicyObjectAsPathList resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.int] as_path_list_id: As path List Number - Range: `1`-`500`
        :param pulumi.Input[_builtins.str] description: The description of the Policy_object
        :param pulumi.Input[Sequence[pulumi.Input[Union['PolicyObjectAsPathListEntryArgs', 'PolicyObjectAsPathListEntryArgsDict']]]] entries: AS Path List
        :param pulumi.Input[_builtins.str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[_builtins.str] name: The name of the Policy_object
        :param pulumi.Input[_builtins.int] version: The version of the Policy_object
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PolicyObjectAsPathListState.__new__(_PolicyObjectAsPathListState)

        __props__.__dict__["as_path_list_id"] = as_path_list_id
        __props__.__dict__["description"] = description
        __props__.__dict__["entries"] = entries
        __props__.__dict__["feature_profile_id"] = feature_profile_id
        __props__.__dict__["name"] = name
        __props__.__dict__["version"] = version
        return PolicyObjectAsPathList(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="asPathListId")
    def as_path_list_id(self) -> pulumi.Output[_builtins.int]:
        """
        As path List Number - Range: `1`-`500`
        """
        return pulumi.get(self, "as_path_list_id")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description of the Policy_object
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def entries(self) -> pulumi.Output[Sequence['outputs.PolicyObjectAsPathListEntry']]:
        """
        AS Path List
        """
        return pulumi.get(self, "entries")

    @_builtins.property
    @pulumi.getter(name="featureProfileId")
    def feature_profile_id(self) -> pulumi.Output[_builtins.str]:
        """
        Feature Profile ID
        """
        return pulumi.get(self, "feature_profile_id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Policy_object
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def version(self) -> pulumi.Output[_builtins.int]:
        """
        The version of the Policy_object
        """
        return pulumi.get(self, "version")

