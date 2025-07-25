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

__all__ = ['MeshTopologyPolicyDefinitionArgs', 'MeshTopologyPolicyDefinition']

@pulumi.input_type
class MeshTopologyPolicyDefinitionArgs:
    def __init__(__self__, *,
                 description: pulumi.Input[_builtins.str],
                 regions: pulumi.Input[Sequence[pulumi.Input['MeshTopologyPolicyDefinitionRegionArgs']]],
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 vpn_list_id: Optional[pulumi.Input[_builtins.str]] = None,
                 vpn_list_version: Optional[pulumi.Input[_builtins.int]] = None):
        """
        The set of arguments for constructing a MeshTopologyPolicyDefinition resource.
        :param pulumi.Input[_builtins.str] description: The description of the policy definition
        :param pulumi.Input[Sequence[pulumi.Input['MeshTopologyPolicyDefinitionRegionArgs']]] regions: List of regions
        :param pulumi.Input[_builtins.str] name: The name of the policy definition
        :param pulumi.Input[_builtins.str] vpn_list_id: VPN list ID
        :param pulumi.Input[_builtins.int] vpn_list_version: VPN list version
        """
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "regions", regions)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if vpn_list_id is not None:
            pulumi.set(__self__, "vpn_list_id", vpn_list_id)
        if vpn_list_version is not None:
            pulumi.set(__self__, "vpn_list_version", vpn_list_version)

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Input[_builtins.str]:
        """
        The description of the policy definition
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def regions(self) -> pulumi.Input[Sequence[pulumi.Input['MeshTopologyPolicyDefinitionRegionArgs']]]:
        """
        List of regions
        """
        return pulumi.get(self, "regions")

    @regions.setter
    def regions(self, value: pulumi.Input[Sequence[pulumi.Input['MeshTopologyPolicyDefinitionRegionArgs']]]):
        pulumi.set(self, "regions", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the policy definition
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="vpnListId")
    def vpn_list_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        VPN list ID
        """
        return pulumi.get(self, "vpn_list_id")

    @vpn_list_id.setter
    def vpn_list_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "vpn_list_id", value)

    @_builtins.property
    @pulumi.getter(name="vpnListVersion")
    def vpn_list_version(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        VPN list version
        """
        return pulumi.get(self, "vpn_list_version")

    @vpn_list_version.setter
    def vpn_list_version(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "vpn_list_version", value)


@pulumi.input_type
class _MeshTopologyPolicyDefinitionState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 regions: Optional[pulumi.Input[Sequence[pulumi.Input['MeshTopologyPolicyDefinitionRegionArgs']]]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 version: Optional[pulumi.Input[_builtins.int]] = None,
                 vpn_list_id: Optional[pulumi.Input[_builtins.str]] = None,
                 vpn_list_version: Optional[pulumi.Input[_builtins.int]] = None):
        """
        Input properties used for looking up and filtering MeshTopologyPolicyDefinition resources.
        :param pulumi.Input[_builtins.str] description: The description of the policy definition
        :param pulumi.Input[_builtins.str] name: The name of the policy definition
        :param pulumi.Input[Sequence[pulumi.Input['MeshTopologyPolicyDefinitionRegionArgs']]] regions: List of regions
        :param pulumi.Input[_builtins.str] type: Type
        :param pulumi.Input[_builtins.int] version: The version of the object
        :param pulumi.Input[_builtins.str] vpn_list_id: VPN list ID
        :param pulumi.Input[_builtins.int] vpn_list_version: VPN list version
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if regions is not None:
            pulumi.set(__self__, "regions", regions)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if version is not None:
            pulumi.set(__self__, "version", version)
        if vpn_list_id is not None:
            pulumi.set(__self__, "vpn_list_id", vpn_list_id)
        if vpn_list_version is not None:
            pulumi.set(__self__, "vpn_list_version", vpn_list_version)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the policy definition
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the policy definition
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def regions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['MeshTopologyPolicyDefinitionRegionArgs']]]]:
        """
        List of regions
        """
        return pulumi.get(self, "regions")

    @regions.setter
    def regions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['MeshTopologyPolicyDefinitionRegionArgs']]]]):
        pulumi.set(self, "regions", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Type
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)

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

    @_builtins.property
    @pulumi.getter(name="vpnListId")
    def vpn_list_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        VPN list ID
        """
        return pulumi.get(self, "vpn_list_id")

    @vpn_list_id.setter
    def vpn_list_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "vpn_list_id", value)

    @_builtins.property
    @pulumi.getter(name="vpnListVersion")
    def vpn_list_version(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        VPN list version
        """
        return pulumi.get(self, "vpn_list_version")

    @vpn_list_version.setter
    def vpn_list_version(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "vpn_list_version", value)


@pulumi.type_token("sdwan:index/meshTopologyPolicyDefinition:MeshTopologyPolicyDefinition")
class MeshTopologyPolicyDefinition(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 regions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['MeshTopologyPolicyDefinitionRegionArgs', 'MeshTopologyPolicyDefinitionRegionArgsDict']]]]] = None,
                 vpn_list_id: Optional[pulumi.Input[_builtins.str]] = None,
                 vpn_list_version: Optional[pulumi.Input[_builtins.int]] = None,
                 __props__=None):
        """
        This resource can manage a Mesh Topology Policy Definition .

        ## Import

        The `pulumi import` command can be used, for example:

        ```sh
        $ pulumi import sdwan:index/meshTopologyPolicyDefinition:MeshTopologyPolicyDefinition example "f6b2c44c-693c-4763-b010-895aa3d236bd"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: The description of the policy definition
        :param pulumi.Input[_builtins.str] name: The name of the policy definition
        :param pulumi.Input[Sequence[pulumi.Input[Union['MeshTopologyPolicyDefinitionRegionArgs', 'MeshTopologyPolicyDefinitionRegionArgsDict']]]] regions: List of regions
        :param pulumi.Input[_builtins.str] vpn_list_id: VPN list ID
        :param pulumi.Input[_builtins.int] vpn_list_version: VPN list version
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MeshTopologyPolicyDefinitionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage a Mesh Topology Policy Definition .

        ## Import

        The `pulumi import` command can be used, for example:

        ```sh
        $ pulumi import sdwan:index/meshTopologyPolicyDefinition:MeshTopologyPolicyDefinition example "f6b2c44c-693c-4763-b010-895aa3d236bd"
        ```

        :param str resource_name: The name of the resource.
        :param MeshTopologyPolicyDefinitionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MeshTopologyPolicyDefinitionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 regions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['MeshTopologyPolicyDefinitionRegionArgs', 'MeshTopologyPolicyDefinitionRegionArgsDict']]]]] = None,
                 vpn_list_id: Optional[pulumi.Input[_builtins.str]] = None,
                 vpn_list_version: Optional[pulumi.Input[_builtins.int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MeshTopologyPolicyDefinitionArgs.__new__(MeshTopologyPolicyDefinitionArgs)

            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            if regions is None and not opts.urn:
                raise TypeError("Missing required property 'regions'")
            __props__.__dict__["regions"] = regions
            __props__.__dict__["vpn_list_id"] = vpn_list_id
            __props__.__dict__["vpn_list_version"] = vpn_list_version
            __props__.__dict__["type"] = None
            __props__.__dict__["version"] = None
        super(MeshTopologyPolicyDefinition, __self__).__init__(
            'sdwan:index/meshTopologyPolicyDefinition:MeshTopologyPolicyDefinition',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            regions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['MeshTopologyPolicyDefinitionRegionArgs', 'MeshTopologyPolicyDefinitionRegionArgsDict']]]]] = None,
            type: Optional[pulumi.Input[_builtins.str]] = None,
            version: Optional[pulumi.Input[_builtins.int]] = None,
            vpn_list_id: Optional[pulumi.Input[_builtins.str]] = None,
            vpn_list_version: Optional[pulumi.Input[_builtins.int]] = None) -> 'MeshTopologyPolicyDefinition':
        """
        Get an existing MeshTopologyPolicyDefinition resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: The description of the policy definition
        :param pulumi.Input[_builtins.str] name: The name of the policy definition
        :param pulumi.Input[Sequence[pulumi.Input[Union['MeshTopologyPolicyDefinitionRegionArgs', 'MeshTopologyPolicyDefinitionRegionArgsDict']]]] regions: List of regions
        :param pulumi.Input[_builtins.str] type: Type
        :param pulumi.Input[_builtins.int] version: The version of the object
        :param pulumi.Input[_builtins.str] vpn_list_id: VPN list ID
        :param pulumi.Input[_builtins.int] vpn_list_version: VPN list version
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MeshTopologyPolicyDefinitionState.__new__(_MeshTopologyPolicyDefinitionState)

        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["regions"] = regions
        __props__.__dict__["type"] = type
        __props__.__dict__["version"] = version
        __props__.__dict__["vpn_list_id"] = vpn_list_id
        __props__.__dict__["vpn_list_version"] = vpn_list_version
        return MeshTopologyPolicyDefinition(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[_builtins.str]:
        """
        The description of the policy definition
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the policy definition
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def regions(self) -> pulumi.Output[Sequence['outputs.MeshTopologyPolicyDefinitionRegion']]:
        """
        List of regions
        """
        return pulumi.get(self, "regions")

    @_builtins.property
    @pulumi.getter
    def type(self) -> pulumi.Output[_builtins.str]:
        """
        Type
        """
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter
    def version(self) -> pulumi.Output[_builtins.int]:
        """
        The version of the object
        """
        return pulumi.get(self, "version")

    @_builtins.property
    @pulumi.getter(name="vpnListId")
    def vpn_list_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        VPN list ID
        """
        return pulumi.get(self, "vpn_list_id")

    @_builtins.property
    @pulumi.getter(name="vpnListVersion")
    def vpn_list_version(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        VPN list version
        """
        return pulumi.get(self, "vpn_list_version")

