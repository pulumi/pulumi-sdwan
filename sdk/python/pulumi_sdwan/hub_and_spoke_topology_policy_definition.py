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

__all__ = ['HubAndSpokeTopologyPolicyDefinitionArgs', 'HubAndSpokeTopologyPolicyDefinition']

@pulumi.input_type
class HubAndSpokeTopologyPolicyDefinitionArgs:
    def __init__(__self__, *,
                 description: pulumi.Input[_builtins.str],
                 topologies: pulumi.Input[Sequence[pulumi.Input['HubAndSpokeTopologyPolicyDefinitionTopologyArgs']]],
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 vpn_list_id: Optional[pulumi.Input[_builtins.str]] = None,
                 vpn_list_version: Optional[pulumi.Input[_builtins.int]] = None):
        """
        The set of arguments for constructing a HubAndSpokeTopologyPolicyDefinition resource.
        :param pulumi.Input[_builtins.str] description: The description of the policy definition
        :param pulumi.Input[Sequence[pulumi.Input['HubAndSpokeTopologyPolicyDefinitionTopologyArgs']]] topologies: List of topologies
        :param pulumi.Input[_builtins.str] name: The name of the policy definition
        :param pulumi.Input[_builtins.str] vpn_list_id: VPN list ID
        :param pulumi.Input[_builtins.int] vpn_list_version: VPN list version
        """
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "topologies", topologies)
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
    def topologies(self) -> pulumi.Input[Sequence[pulumi.Input['HubAndSpokeTopologyPolicyDefinitionTopologyArgs']]]:
        """
        List of topologies
        """
        return pulumi.get(self, "topologies")

    @topologies.setter
    def topologies(self, value: pulumi.Input[Sequence[pulumi.Input['HubAndSpokeTopologyPolicyDefinitionTopologyArgs']]]):
        pulumi.set(self, "topologies", value)

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
class _HubAndSpokeTopologyPolicyDefinitionState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 topologies: Optional[pulumi.Input[Sequence[pulumi.Input['HubAndSpokeTopologyPolicyDefinitionTopologyArgs']]]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 version: Optional[pulumi.Input[_builtins.int]] = None,
                 vpn_list_id: Optional[pulumi.Input[_builtins.str]] = None,
                 vpn_list_version: Optional[pulumi.Input[_builtins.int]] = None):
        """
        Input properties used for looking up and filtering HubAndSpokeTopologyPolicyDefinition resources.
        :param pulumi.Input[_builtins.str] description: The description of the policy definition
        :param pulumi.Input[_builtins.str] name: The name of the policy definition
        :param pulumi.Input[Sequence[pulumi.Input['HubAndSpokeTopologyPolicyDefinitionTopologyArgs']]] topologies: List of topologies
        :param pulumi.Input[_builtins.str] type: Type
        :param pulumi.Input[_builtins.int] version: The version of the object
        :param pulumi.Input[_builtins.str] vpn_list_id: VPN list ID
        :param pulumi.Input[_builtins.int] vpn_list_version: VPN list version
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if topologies is not None:
            pulumi.set(__self__, "topologies", topologies)
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
    def topologies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['HubAndSpokeTopologyPolicyDefinitionTopologyArgs']]]]:
        """
        List of topologies
        """
        return pulumi.get(self, "topologies")

    @topologies.setter
    def topologies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['HubAndSpokeTopologyPolicyDefinitionTopologyArgs']]]]):
        pulumi.set(self, "topologies", value)

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


@pulumi.type_token("sdwan:index/hubAndSpokeTopologyPolicyDefinition:HubAndSpokeTopologyPolicyDefinition")
class HubAndSpokeTopologyPolicyDefinition(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 topologies: Optional[pulumi.Input[Sequence[pulumi.Input[Union['HubAndSpokeTopologyPolicyDefinitionTopologyArgs', 'HubAndSpokeTopologyPolicyDefinitionTopologyArgsDict']]]]] = None,
                 vpn_list_id: Optional[pulumi.Input[_builtins.str]] = None,
                 vpn_list_version: Optional[pulumi.Input[_builtins.int]] = None,
                 __props__=None):
        """
        This resource can manage a Hub and Spoke Topology Policy Definition .

        ## Import

        The `pulumi import` command can be used, for example:

        ```sh
        $ pulumi import sdwan:index/hubAndSpokeTopologyPolicyDefinition:HubAndSpokeTopologyPolicyDefinition example "f6b2c44c-693c-4763-b010-895aa3d236bd"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: The description of the policy definition
        :param pulumi.Input[_builtins.str] name: The name of the policy definition
        :param pulumi.Input[Sequence[pulumi.Input[Union['HubAndSpokeTopologyPolicyDefinitionTopologyArgs', 'HubAndSpokeTopologyPolicyDefinitionTopologyArgsDict']]]] topologies: List of topologies
        :param pulumi.Input[_builtins.str] vpn_list_id: VPN list ID
        :param pulumi.Input[_builtins.int] vpn_list_version: VPN list version
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HubAndSpokeTopologyPolicyDefinitionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage a Hub and Spoke Topology Policy Definition .

        ## Import

        The `pulumi import` command can be used, for example:

        ```sh
        $ pulumi import sdwan:index/hubAndSpokeTopologyPolicyDefinition:HubAndSpokeTopologyPolicyDefinition example "f6b2c44c-693c-4763-b010-895aa3d236bd"
        ```

        :param str resource_name: The name of the resource.
        :param HubAndSpokeTopologyPolicyDefinitionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HubAndSpokeTopologyPolicyDefinitionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 topologies: Optional[pulumi.Input[Sequence[pulumi.Input[Union['HubAndSpokeTopologyPolicyDefinitionTopologyArgs', 'HubAndSpokeTopologyPolicyDefinitionTopologyArgsDict']]]]] = None,
                 vpn_list_id: Optional[pulumi.Input[_builtins.str]] = None,
                 vpn_list_version: Optional[pulumi.Input[_builtins.int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HubAndSpokeTopologyPolicyDefinitionArgs.__new__(HubAndSpokeTopologyPolicyDefinitionArgs)

            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            if topologies is None and not opts.urn:
                raise TypeError("Missing required property 'topologies'")
            __props__.__dict__["topologies"] = topologies
            __props__.__dict__["vpn_list_id"] = vpn_list_id
            __props__.__dict__["vpn_list_version"] = vpn_list_version
            __props__.__dict__["type"] = None
            __props__.__dict__["version"] = None
        super(HubAndSpokeTopologyPolicyDefinition, __self__).__init__(
            'sdwan:index/hubAndSpokeTopologyPolicyDefinition:HubAndSpokeTopologyPolicyDefinition',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            topologies: Optional[pulumi.Input[Sequence[pulumi.Input[Union['HubAndSpokeTopologyPolicyDefinitionTopologyArgs', 'HubAndSpokeTopologyPolicyDefinitionTopologyArgsDict']]]]] = None,
            type: Optional[pulumi.Input[_builtins.str]] = None,
            version: Optional[pulumi.Input[_builtins.int]] = None,
            vpn_list_id: Optional[pulumi.Input[_builtins.str]] = None,
            vpn_list_version: Optional[pulumi.Input[_builtins.int]] = None) -> 'HubAndSpokeTopologyPolicyDefinition':
        """
        Get an existing HubAndSpokeTopologyPolicyDefinition resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: The description of the policy definition
        :param pulumi.Input[_builtins.str] name: The name of the policy definition
        :param pulumi.Input[Sequence[pulumi.Input[Union['HubAndSpokeTopologyPolicyDefinitionTopologyArgs', 'HubAndSpokeTopologyPolicyDefinitionTopologyArgsDict']]]] topologies: List of topologies
        :param pulumi.Input[_builtins.str] type: Type
        :param pulumi.Input[_builtins.int] version: The version of the object
        :param pulumi.Input[_builtins.str] vpn_list_id: VPN list ID
        :param pulumi.Input[_builtins.int] vpn_list_version: VPN list version
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HubAndSpokeTopologyPolicyDefinitionState.__new__(_HubAndSpokeTopologyPolicyDefinitionState)

        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["topologies"] = topologies
        __props__.__dict__["type"] = type
        __props__.__dict__["version"] = version
        __props__.__dict__["vpn_list_id"] = vpn_list_id
        __props__.__dict__["vpn_list_version"] = vpn_list_version
        return HubAndSpokeTopologyPolicyDefinition(resource_name, opts=opts, __props__=__props__)

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
    def topologies(self) -> pulumi.Output[Sequence['outputs.HubAndSpokeTopologyPolicyDefinitionTopology']]:
        """
        List of topologies
        """
        return pulumi.get(self, "topologies")

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

