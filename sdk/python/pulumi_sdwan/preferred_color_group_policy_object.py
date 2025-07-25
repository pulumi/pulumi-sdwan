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

__all__ = ['PreferredColorGroupPolicyObjectArgs', 'PreferredColorGroupPolicyObject']

@pulumi.input_type
class PreferredColorGroupPolicyObjectArgs:
    def __init__(__self__, *,
                 primary_color_preference: pulumi.Input[_builtins.str],
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 primary_path_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 secondary_color_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 secondary_path_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 tertiary_color_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 tertiary_path_preference: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a PreferredColorGroupPolicyObject resource.
        :param pulumi.Input[_builtins.str] primary_color_preference: Color or space separated list of colors
        :param pulumi.Input[_builtins.str] name: The name of the policy object
        :param pulumi.Input[_builtins.str] primary_path_preference: Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
        :param pulumi.Input[_builtins.str] secondary_color_preference: Color or space separated list of colors
        :param pulumi.Input[_builtins.str] secondary_path_preference: Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
        :param pulumi.Input[_builtins.str] tertiary_color_preference: Color or space separated list of colors
        :param pulumi.Input[_builtins.str] tertiary_path_preference: Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
        """
        pulumi.set(__self__, "primary_color_preference", primary_color_preference)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if primary_path_preference is not None:
            pulumi.set(__self__, "primary_path_preference", primary_path_preference)
        if secondary_color_preference is not None:
            pulumi.set(__self__, "secondary_color_preference", secondary_color_preference)
        if secondary_path_preference is not None:
            pulumi.set(__self__, "secondary_path_preference", secondary_path_preference)
        if tertiary_color_preference is not None:
            pulumi.set(__self__, "tertiary_color_preference", tertiary_color_preference)
        if tertiary_path_preference is not None:
            pulumi.set(__self__, "tertiary_path_preference", tertiary_path_preference)

    @_builtins.property
    @pulumi.getter(name="primaryColorPreference")
    def primary_color_preference(self) -> pulumi.Input[_builtins.str]:
        """
        Color or space separated list of colors
        """
        return pulumi.get(self, "primary_color_preference")

    @primary_color_preference.setter
    def primary_color_preference(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "primary_color_preference", value)

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
    @pulumi.getter(name="primaryPathPreference")
    def primary_path_preference(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
        """
        return pulumi.get(self, "primary_path_preference")

    @primary_path_preference.setter
    def primary_path_preference(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "primary_path_preference", value)

    @_builtins.property
    @pulumi.getter(name="secondaryColorPreference")
    def secondary_color_preference(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Color or space separated list of colors
        """
        return pulumi.get(self, "secondary_color_preference")

    @secondary_color_preference.setter
    def secondary_color_preference(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "secondary_color_preference", value)

    @_builtins.property
    @pulumi.getter(name="secondaryPathPreference")
    def secondary_path_preference(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
        """
        return pulumi.get(self, "secondary_path_preference")

    @secondary_path_preference.setter
    def secondary_path_preference(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "secondary_path_preference", value)

    @_builtins.property
    @pulumi.getter(name="tertiaryColorPreference")
    def tertiary_color_preference(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Color or space separated list of colors
        """
        return pulumi.get(self, "tertiary_color_preference")

    @tertiary_color_preference.setter
    def tertiary_color_preference(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "tertiary_color_preference", value)

    @_builtins.property
    @pulumi.getter(name="tertiaryPathPreference")
    def tertiary_path_preference(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
        """
        return pulumi.get(self, "tertiary_path_preference")

    @tertiary_path_preference.setter
    def tertiary_path_preference(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "tertiary_path_preference", value)


@pulumi.input_type
class _PreferredColorGroupPolicyObjectState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 primary_color_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 primary_path_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 secondary_color_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 secondary_path_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 tertiary_color_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 tertiary_path_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 version: Optional[pulumi.Input[_builtins.int]] = None):
        """
        Input properties used for looking up and filtering PreferredColorGroupPolicyObject resources.
        :param pulumi.Input[_builtins.str] name: The name of the policy object
        :param pulumi.Input[_builtins.str] primary_color_preference: Color or space separated list of colors
        :param pulumi.Input[_builtins.str] primary_path_preference: Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
        :param pulumi.Input[_builtins.str] secondary_color_preference: Color or space separated list of colors
        :param pulumi.Input[_builtins.str] secondary_path_preference: Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
        :param pulumi.Input[_builtins.str] tertiary_color_preference: Color or space separated list of colors
        :param pulumi.Input[_builtins.str] tertiary_path_preference: Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
        :param pulumi.Input[_builtins.int] version: The version of the object
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if primary_color_preference is not None:
            pulumi.set(__self__, "primary_color_preference", primary_color_preference)
        if primary_path_preference is not None:
            pulumi.set(__self__, "primary_path_preference", primary_path_preference)
        if secondary_color_preference is not None:
            pulumi.set(__self__, "secondary_color_preference", secondary_color_preference)
        if secondary_path_preference is not None:
            pulumi.set(__self__, "secondary_path_preference", secondary_path_preference)
        if tertiary_color_preference is not None:
            pulumi.set(__self__, "tertiary_color_preference", tertiary_color_preference)
        if tertiary_path_preference is not None:
            pulumi.set(__self__, "tertiary_path_preference", tertiary_path_preference)
        if version is not None:
            pulumi.set(__self__, "version", version)

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
    @pulumi.getter(name="primaryColorPreference")
    def primary_color_preference(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Color or space separated list of colors
        """
        return pulumi.get(self, "primary_color_preference")

    @primary_color_preference.setter
    def primary_color_preference(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "primary_color_preference", value)

    @_builtins.property
    @pulumi.getter(name="primaryPathPreference")
    def primary_path_preference(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
        """
        return pulumi.get(self, "primary_path_preference")

    @primary_path_preference.setter
    def primary_path_preference(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "primary_path_preference", value)

    @_builtins.property
    @pulumi.getter(name="secondaryColorPreference")
    def secondary_color_preference(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Color or space separated list of colors
        """
        return pulumi.get(self, "secondary_color_preference")

    @secondary_color_preference.setter
    def secondary_color_preference(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "secondary_color_preference", value)

    @_builtins.property
    @pulumi.getter(name="secondaryPathPreference")
    def secondary_path_preference(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
        """
        return pulumi.get(self, "secondary_path_preference")

    @secondary_path_preference.setter
    def secondary_path_preference(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "secondary_path_preference", value)

    @_builtins.property
    @pulumi.getter(name="tertiaryColorPreference")
    def tertiary_color_preference(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Color or space separated list of colors
        """
        return pulumi.get(self, "tertiary_color_preference")

    @tertiary_color_preference.setter
    def tertiary_color_preference(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "tertiary_color_preference", value)

    @_builtins.property
    @pulumi.getter(name="tertiaryPathPreference")
    def tertiary_path_preference(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
        """
        return pulumi.get(self, "tertiary_path_preference")

    @tertiary_path_preference.setter
    def tertiary_path_preference(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "tertiary_path_preference", value)

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


@pulumi.type_token("sdwan:index/preferredColorGroupPolicyObject:PreferredColorGroupPolicyObject")
class PreferredColorGroupPolicyObject(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 primary_color_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 primary_path_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 secondary_color_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 secondary_path_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 tertiary_color_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 tertiary_path_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        This resource can manage a Preferred Color Group Policy Object .

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sdwan as sdwan

        example = sdwan.PreferredColorGroupPolicyObject("example",
            name="Example",
            primary_color_preference="blue bronze",
            primary_path_preference="direct-path",
            secondary_color_preference="3g",
            secondary_path_preference="multi-hop-path",
            tertiary_color_preference="custom1",
            tertiary_path_preference="all-paths")
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        ```sh
        $ pulumi import sdwan:index/preferredColorGroupPolicyObject:PreferredColorGroupPolicyObject example "f6b2c44c-693c-4763-b010-895aa3d236bd"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] name: The name of the policy object
        :param pulumi.Input[_builtins.str] primary_color_preference: Color or space separated list of colors
        :param pulumi.Input[_builtins.str] primary_path_preference: Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
        :param pulumi.Input[_builtins.str] secondary_color_preference: Color or space separated list of colors
        :param pulumi.Input[_builtins.str] secondary_path_preference: Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
        :param pulumi.Input[_builtins.str] tertiary_color_preference: Color or space separated list of colors
        :param pulumi.Input[_builtins.str] tertiary_path_preference: Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PreferredColorGroupPolicyObjectArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage a Preferred Color Group Policy Object .

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sdwan as sdwan

        example = sdwan.PreferredColorGroupPolicyObject("example",
            name="Example",
            primary_color_preference="blue bronze",
            primary_path_preference="direct-path",
            secondary_color_preference="3g",
            secondary_path_preference="multi-hop-path",
            tertiary_color_preference="custom1",
            tertiary_path_preference="all-paths")
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        ```sh
        $ pulumi import sdwan:index/preferredColorGroupPolicyObject:PreferredColorGroupPolicyObject example "f6b2c44c-693c-4763-b010-895aa3d236bd"
        ```

        :param str resource_name: The name of the resource.
        :param PreferredColorGroupPolicyObjectArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PreferredColorGroupPolicyObjectArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 primary_color_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 primary_path_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 secondary_color_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 secondary_path_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 tertiary_color_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 tertiary_path_preference: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PreferredColorGroupPolicyObjectArgs.__new__(PreferredColorGroupPolicyObjectArgs)

            __props__.__dict__["name"] = name
            if primary_color_preference is None and not opts.urn:
                raise TypeError("Missing required property 'primary_color_preference'")
            __props__.__dict__["primary_color_preference"] = primary_color_preference
            __props__.__dict__["primary_path_preference"] = primary_path_preference
            __props__.__dict__["secondary_color_preference"] = secondary_color_preference
            __props__.__dict__["secondary_path_preference"] = secondary_path_preference
            __props__.__dict__["tertiary_color_preference"] = tertiary_color_preference
            __props__.__dict__["tertiary_path_preference"] = tertiary_path_preference
            __props__.__dict__["version"] = None
        super(PreferredColorGroupPolicyObject, __self__).__init__(
            'sdwan:index/preferredColorGroupPolicyObject:PreferredColorGroupPolicyObject',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            primary_color_preference: Optional[pulumi.Input[_builtins.str]] = None,
            primary_path_preference: Optional[pulumi.Input[_builtins.str]] = None,
            secondary_color_preference: Optional[pulumi.Input[_builtins.str]] = None,
            secondary_path_preference: Optional[pulumi.Input[_builtins.str]] = None,
            tertiary_color_preference: Optional[pulumi.Input[_builtins.str]] = None,
            tertiary_path_preference: Optional[pulumi.Input[_builtins.str]] = None,
            version: Optional[pulumi.Input[_builtins.int]] = None) -> 'PreferredColorGroupPolicyObject':
        """
        Get an existing PreferredColorGroupPolicyObject resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] name: The name of the policy object
        :param pulumi.Input[_builtins.str] primary_color_preference: Color or space separated list of colors
        :param pulumi.Input[_builtins.str] primary_path_preference: Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
        :param pulumi.Input[_builtins.str] secondary_color_preference: Color or space separated list of colors
        :param pulumi.Input[_builtins.str] secondary_path_preference: Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
        :param pulumi.Input[_builtins.str] tertiary_color_preference: Color or space separated list of colors
        :param pulumi.Input[_builtins.str] tertiary_path_preference: Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
        :param pulumi.Input[_builtins.int] version: The version of the object
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PreferredColorGroupPolicyObjectState.__new__(_PreferredColorGroupPolicyObjectState)

        __props__.__dict__["name"] = name
        __props__.__dict__["primary_color_preference"] = primary_color_preference
        __props__.__dict__["primary_path_preference"] = primary_path_preference
        __props__.__dict__["secondary_color_preference"] = secondary_color_preference
        __props__.__dict__["secondary_path_preference"] = secondary_path_preference
        __props__.__dict__["tertiary_color_preference"] = tertiary_color_preference
        __props__.__dict__["tertiary_path_preference"] = tertiary_path_preference
        __props__.__dict__["version"] = version
        return PreferredColorGroupPolicyObject(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the policy object
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="primaryColorPreference")
    def primary_color_preference(self) -> pulumi.Output[_builtins.str]:
        """
        Color or space separated list of colors
        """
        return pulumi.get(self, "primary_color_preference")

    @_builtins.property
    @pulumi.getter(name="primaryPathPreference")
    def primary_path_preference(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
        """
        return pulumi.get(self, "primary_path_preference")

    @_builtins.property
    @pulumi.getter(name="secondaryColorPreference")
    def secondary_color_preference(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Color or space separated list of colors
        """
        return pulumi.get(self, "secondary_color_preference")

    @_builtins.property
    @pulumi.getter(name="secondaryPathPreference")
    def secondary_path_preference(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
        """
        return pulumi.get(self, "secondary_path_preference")

    @_builtins.property
    @pulumi.getter(name="tertiaryColorPreference")
    def tertiary_color_preference(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Color or space separated list of colors
        """
        return pulumi.get(self, "tertiary_color_preference")

    @_builtins.property
    @pulumi.getter(name="tertiaryPathPreference")
    def tertiary_path_preference(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Path preference - Choices: `direct-path`, `multi-hop-path`, `all-paths`
        """
        return pulumi.get(self, "tertiary_path_preference")

    @_builtins.property
    @pulumi.getter
    def version(self) -> pulumi.Output[_builtins.int]:
        """
        The version of the object
        """
        return pulumi.get(self, "version")

