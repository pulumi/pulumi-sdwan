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

__all__ = ['GeoLocationListPolicyObjectArgs', 'GeoLocationListPolicyObject']

@pulumi.input_type
class GeoLocationListPolicyObjectArgs:
    def __init__(__self__, *,
                 entries: pulumi.Input[Sequence[pulumi.Input['GeoLocationListPolicyObjectEntryArgs']]],
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a GeoLocationListPolicyObject resource.
        :param pulumi.Input[Sequence[pulumi.Input['GeoLocationListPolicyObjectEntryArgs']]] entries: List of entries
        :param pulumi.Input[_builtins.str] name: The name of the policy object
        """
        pulumi.set(__self__, "entries", entries)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter
    def entries(self) -> pulumi.Input[Sequence[pulumi.Input['GeoLocationListPolicyObjectEntryArgs']]]:
        """
        List of entries
        """
        return pulumi.get(self, "entries")

    @entries.setter
    def entries(self, value: pulumi.Input[Sequence[pulumi.Input['GeoLocationListPolicyObjectEntryArgs']]]):
        pulumi.set(self, "entries", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the policy object
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _GeoLocationListPolicyObjectState:
    def __init__(__self__, *,
                 entries: Optional[pulumi.Input[Sequence[pulumi.Input['GeoLocationListPolicyObjectEntryArgs']]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 version: Optional[pulumi.Input[_builtins.int]] = None):
        """
        Input properties used for looking up and filtering GeoLocationListPolicyObject resources.
        :param pulumi.Input[Sequence[pulumi.Input['GeoLocationListPolicyObjectEntryArgs']]] entries: List of entries
        :param pulumi.Input[_builtins.str] name: The name of the policy object
        :param pulumi.Input[_builtins.int] version: The version of the object
        """
        if entries is not None:
            pulumi.set(__self__, "entries", entries)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @_builtins.property
    @pulumi.getter
    def entries(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['GeoLocationListPolicyObjectEntryArgs']]]]:
        """
        List of entries
        """
        return pulumi.get(self, "entries")

    @entries.setter
    def entries(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['GeoLocationListPolicyObjectEntryArgs']]]]):
        pulumi.set(self, "entries", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the policy object
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

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


@pulumi.type_token("sdwan:index/geoLocationListPolicyObject:GeoLocationListPolicyObject")
class GeoLocationListPolicyObject(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 entries: Optional[pulumi.Input[Sequence[pulumi.Input[Union['GeoLocationListPolicyObjectEntryArgs', 'GeoLocationListPolicyObjectEntryArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        This resource can manage a Geo Location List Policy Object .

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sdwan as sdwan

        example = sdwan.GeoLocationListPolicyObject("example",
            name="Example",
            entries=[{
                "country": "USA",
                "continent": "AS",
            }])
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        ```sh
        $ pulumi import sdwan:index/geoLocationListPolicyObject:GeoLocationListPolicyObject example "f6b2c44c-693c-4763-b010-895aa3d236bd"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['GeoLocationListPolicyObjectEntryArgs', 'GeoLocationListPolicyObjectEntryArgsDict']]]] entries: List of entries
        :param pulumi.Input[_builtins.str] name: The name of the policy object
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GeoLocationListPolicyObjectArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage a Geo Location List Policy Object .

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sdwan as sdwan

        example = sdwan.GeoLocationListPolicyObject("example",
            name="Example",
            entries=[{
                "country": "USA",
                "continent": "AS",
            }])
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        ```sh
        $ pulumi import sdwan:index/geoLocationListPolicyObject:GeoLocationListPolicyObject example "f6b2c44c-693c-4763-b010-895aa3d236bd"
        ```

        :param str resource_name: The name of the resource.
        :param GeoLocationListPolicyObjectArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GeoLocationListPolicyObjectArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 entries: Optional[pulumi.Input[Sequence[pulumi.Input[Union['GeoLocationListPolicyObjectEntryArgs', 'GeoLocationListPolicyObjectEntryArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GeoLocationListPolicyObjectArgs.__new__(GeoLocationListPolicyObjectArgs)

            if entries is None and not opts.urn:
                raise TypeError("Missing required property 'entries'")
            __props__.__dict__["entries"] = entries
            __props__.__dict__["name"] = name
            __props__.__dict__["version"] = None
        super(GeoLocationListPolicyObject, __self__).__init__(
            'sdwan:index/geoLocationListPolicyObject:GeoLocationListPolicyObject',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            entries: Optional[pulumi.Input[Sequence[pulumi.Input[Union['GeoLocationListPolicyObjectEntryArgs', 'GeoLocationListPolicyObjectEntryArgsDict']]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            version: Optional[pulumi.Input[_builtins.int]] = None) -> 'GeoLocationListPolicyObject':
        """
        Get an existing GeoLocationListPolicyObject resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['GeoLocationListPolicyObjectEntryArgs', 'GeoLocationListPolicyObjectEntryArgsDict']]]] entries: List of entries
        :param pulumi.Input[_builtins.str] name: The name of the policy object
        :param pulumi.Input[_builtins.int] version: The version of the object
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GeoLocationListPolicyObjectState.__new__(_GeoLocationListPolicyObjectState)

        __props__.__dict__["entries"] = entries
        __props__.__dict__["name"] = name
        __props__.__dict__["version"] = version
        return GeoLocationListPolicyObject(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def entries(self) -> pulumi.Output[Sequence['outputs.GeoLocationListPolicyObjectEntry']]:
        """
        List of entries
        """
        return pulumi.get(self, "entries")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the policy object
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def version(self) -> pulumi.Output[_builtins.int]:
        """
        The version of the object
        """
        return pulumi.get(self, "version")

