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

__all__ = [
    'GetCiscoBgpFeatureTemplateResult',
    'AwaitableGetCiscoBgpFeatureTemplateResult',
    'get_cisco_bgp_feature_template',
    'get_cisco_bgp_feature_template_output',
]

@pulumi.output_type
class GetCiscoBgpFeatureTemplateResult:
    """
    A collection of values returned by getCiscoBgpFeatureTemplate.
    """
    def __init__(__self__, address_families=None, always_compare_med=None, always_compare_med_variable=None, as_number=None, as_number_variable=None, compare_router_id=None, compare_router_id_variable=None, description=None, deterministic_med=None, deterministic_med_variable=None, device_types=None, distance_external=None, distance_external_variable=None, distance_internal=None, distance_internal_variable=None, distance_local=None, distance_local_variable=None, holdtime=None, holdtime_variable=None, id=None, ipv4_neighbors=None, ipv4_route_targets=None, ipv6_neighbors=None, ipv6_route_targets=None, keepalive=None, keepalive_variable=None, missing_med_worst=None, missing_med_worst_variable=None, mpls_interfaces=None, multipath_relax=None, multipath_relax_variable=None, name=None, propagate_aspath=None, propagate_aspath_variable=None, propagate_community=None, propagate_community_variable=None, router_id=None, router_id_variable=None, shutdown=None, shutdown_variable=None, template_type=None, version=None):
        if address_families and not isinstance(address_families, list):
            raise TypeError("Expected argument 'address_families' to be a list")
        pulumi.set(__self__, "address_families", address_families)
        if always_compare_med and not isinstance(always_compare_med, bool):
            raise TypeError("Expected argument 'always_compare_med' to be a bool")
        pulumi.set(__self__, "always_compare_med", always_compare_med)
        if always_compare_med_variable and not isinstance(always_compare_med_variable, str):
            raise TypeError("Expected argument 'always_compare_med_variable' to be a str")
        pulumi.set(__self__, "always_compare_med_variable", always_compare_med_variable)
        if as_number and not isinstance(as_number, str):
            raise TypeError("Expected argument 'as_number' to be a str")
        pulumi.set(__self__, "as_number", as_number)
        if as_number_variable and not isinstance(as_number_variable, str):
            raise TypeError("Expected argument 'as_number_variable' to be a str")
        pulumi.set(__self__, "as_number_variable", as_number_variable)
        if compare_router_id and not isinstance(compare_router_id, bool):
            raise TypeError("Expected argument 'compare_router_id' to be a bool")
        pulumi.set(__self__, "compare_router_id", compare_router_id)
        if compare_router_id_variable and not isinstance(compare_router_id_variable, str):
            raise TypeError("Expected argument 'compare_router_id_variable' to be a str")
        pulumi.set(__self__, "compare_router_id_variable", compare_router_id_variable)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if deterministic_med and not isinstance(deterministic_med, bool):
            raise TypeError("Expected argument 'deterministic_med' to be a bool")
        pulumi.set(__self__, "deterministic_med", deterministic_med)
        if deterministic_med_variable and not isinstance(deterministic_med_variable, str):
            raise TypeError("Expected argument 'deterministic_med_variable' to be a str")
        pulumi.set(__self__, "deterministic_med_variable", deterministic_med_variable)
        if device_types and not isinstance(device_types, list):
            raise TypeError("Expected argument 'device_types' to be a list")
        pulumi.set(__self__, "device_types", device_types)
        if distance_external and not isinstance(distance_external, int):
            raise TypeError("Expected argument 'distance_external' to be a int")
        pulumi.set(__self__, "distance_external", distance_external)
        if distance_external_variable and not isinstance(distance_external_variable, str):
            raise TypeError("Expected argument 'distance_external_variable' to be a str")
        pulumi.set(__self__, "distance_external_variable", distance_external_variable)
        if distance_internal and not isinstance(distance_internal, int):
            raise TypeError("Expected argument 'distance_internal' to be a int")
        pulumi.set(__self__, "distance_internal", distance_internal)
        if distance_internal_variable and not isinstance(distance_internal_variable, str):
            raise TypeError("Expected argument 'distance_internal_variable' to be a str")
        pulumi.set(__self__, "distance_internal_variable", distance_internal_variable)
        if distance_local and not isinstance(distance_local, int):
            raise TypeError("Expected argument 'distance_local' to be a int")
        pulumi.set(__self__, "distance_local", distance_local)
        if distance_local_variable and not isinstance(distance_local_variable, str):
            raise TypeError("Expected argument 'distance_local_variable' to be a str")
        pulumi.set(__self__, "distance_local_variable", distance_local_variable)
        if holdtime and not isinstance(holdtime, int):
            raise TypeError("Expected argument 'holdtime' to be a int")
        pulumi.set(__self__, "holdtime", holdtime)
        if holdtime_variable and not isinstance(holdtime_variable, str):
            raise TypeError("Expected argument 'holdtime_variable' to be a str")
        pulumi.set(__self__, "holdtime_variable", holdtime_variable)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ipv4_neighbors and not isinstance(ipv4_neighbors, list):
            raise TypeError("Expected argument 'ipv4_neighbors' to be a list")
        pulumi.set(__self__, "ipv4_neighbors", ipv4_neighbors)
        if ipv4_route_targets and not isinstance(ipv4_route_targets, list):
            raise TypeError("Expected argument 'ipv4_route_targets' to be a list")
        pulumi.set(__self__, "ipv4_route_targets", ipv4_route_targets)
        if ipv6_neighbors and not isinstance(ipv6_neighbors, list):
            raise TypeError("Expected argument 'ipv6_neighbors' to be a list")
        pulumi.set(__self__, "ipv6_neighbors", ipv6_neighbors)
        if ipv6_route_targets and not isinstance(ipv6_route_targets, list):
            raise TypeError("Expected argument 'ipv6_route_targets' to be a list")
        pulumi.set(__self__, "ipv6_route_targets", ipv6_route_targets)
        if keepalive and not isinstance(keepalive, int):
            raise TypeError("Expected argument 'keepalive' to be a int")
        pulumi.set(__self__, "keepalive", keepalive)
        if keepalive_variable and not isinstance(keepalive_variable, str):
            raise TypeError("Expected argument 'keepalive_variable' to be a str")
        pulumi.set(__self__, "keepalive_variable", keepalive_variable)
        if missing_med_worst and not isinstance(missing_med_worst, bool):
            raise TypeError("Expected argument 'missing_med_worst' to be a bool")
        pulumi.set(__self__, "missing_med_worst", missing_med_worst)
        if missing_med_worst_variable and not isinstance(missing_med_worst_variable, str):
            raise TypeError("Expected argument 'missing_med_worst_variable' to be a str")
        pulumi.set(__self__, "missing_med_worst_variable", missing_med_worst_variable)
        if mpls_interfaces and not isinstance(mpls_interfaces, list):
            raise TypeError("Expected argument 'mpls_interfaces' to be a list")
        pulumi.set(__self__, "mpls_interfaces", mpls_interfaces)
        if multipath_relax and not isinstance(multipath_relax, bool):
            raise TypeError("Expected argument 'multipath_relax' to be a bool")
        pulumi.set(__self__, "multipath_relax", multipath_relax)
        if multipath_relax_variable and not isinstance(multipath_relax_variable, str):
            raise TypeError("Expected argument 'multipath_relax_variable' to be a str")
        pulumi.set(__self__, "multipath_relax_variable", multipath_relax_variable)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if propagate_aspath and not isinstance(propagate_aspath, bool):
            raise TypeError("Expected argument 'propagate_aspath' to be a bool")
        pulumi.set(__self__, "propagate_aspath", propagate_aspath)
        if propagate_aspath_variable and not isinstance(propagate_aspath_variable, str):
            raise TypeError("Expected argument 'propagate_aspath_variable' to be a str")
        pulumi.set(__self__, "propagate_aspath_variable", propagate_aspath_variable)
        if propagate_community and not isinstance(propagate_community, bool):
            raise TypeError("Expected argument 'propagate_community' to be a bool")
        pulumi.set(__self__, "propagate_community", propagate_community)
        if propagate_community_variable and not isinstance(propagate_community_variable, str):
            raise TypeError("Expected argument 'propagate_community_variable' to be a str")
        pulumi.set(__self__, "propagate_community_variable", propagate_community_variable)
        if router_id and not isinstance(router_id, str):
            raise TypeError("Expected argument 'router_id' to be a str")
        pulumi.set(__self__, "router_id", router_id)
        if router_id_variable and not isinstance(router_id_variable, str):
            raise TypeError("Expected argument 'router_id_variable' to be a str")
        pulumi.set(__self__, "router_id_variable", router_id_variable)
        if shutdown and not isinstance(shutdown, bool):
            raise TypeError("Expected argument 'shutdown' to be a bool")
        pulumi.set(__self__, "shutdown", shutdown)
        if shutdown_variable and not isinstance(shutdown_variable, str):
            raise TypeError("Expected argument 'shutdown_variable' to be a str")
        pulumi.set(__self__, "shutdown_variable", shutdown_variable)
        if template_type and not isinstance(template_type, str):
            raise TypeError("Expected argument 'template_type' to be a str")
        pulumi.set(__self__, "template_type", template_type)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)

    @_builtins.property
    @pulumi.getter(name="addressFamilies")
    def address_families(self) -> Sequence['outputs.GetCiscoBgpFeatureTemplateAddressFamilyResult']:
        """
        Set BGP address family
        """
        return pulumi.get(self, "address_families")

    @_builtins.property
    @pulumi.getter(name="alwaysCompareMed")
    def always_compare_med(self) -> _builtins.bool:
        """
        Compare MEDs from all ASs when selecting active BGP paths
        """
        return pulumi.get(self, "always_compare_med")

    @_builtins.property
    @pulumi.getter(name="alwaysCompareMedVariable")
    def always_compare_med_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "always_compare_med_variable")

    @_builtins.property
    @pulumi.getter(name="asNumber")
    def as_number(self) -> _builtins.str:
        """
        Set autonomous system number \\n\\n or \\n\\n
        """
        return pulumi.get(self, "as_number")

    @_builtins.property
    @pulumi.getter(name="asNumberVariable")
    def as_number_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "as_number_variable")

    @_builtins.property
    @pulumi.getter(name="compareRouterId")
    def compare_router_id(self) -> _builtins.bool:
        """
        Compare router IDs when selecting active BGP paths
        """
        return pulumi.get(self, "compare_router_id")

    @_builtins.property
    @pulumi.getter(name="compareRouterIdVariable")
    def compare_router_id_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "compare_router_id_variable")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        The description of the feature template
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="deterministicMed")
    def deterministic_med(self) -> _builtins.bool:
        """
        Compare MEDs from all routes from same AS when selecting active BGP paths
        """
        return pulumi.get(self, "deterministic_med")

    @_builtins.property
    @pulumi.getter(name="deterministicMedVariable")
    def deterministic_med_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "deterministic_med_variable")

    @_builtins.property
    @pulumi.getter(name="deviceTypes")
    def device_types(self) -> Sequence[_builtins.str]:
        """
        List of supported device types
        """
        return pulumi.get(self, "device_types")

    @_builtins.property
    @pulumi.getter(name="distanceExternal")
    def distance_external(self) -> _builtins.int:
        """
        Set administrative distance for external BGP routes
        """
        return pulumi.get(self, "distance_external")

    @_builtins.property
    @pulumi.getter(name="distanceExternalVariable")
    def distance_external_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "distance_external_variable")

    @_builtins.property
    @pulumi.getter(name="distanceInternal")
    def distance_internal(self) -> _builtins.int:
        """
        Set administrative distance for internal BGP routes
        """
        return pulumi.get(self, "distance_internal")

    @_builtins.property
    @pulumi.getter(name="distanceInternalVariable")
    def distance_internal_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "distance_internal_variable")

    @_builtins.property
    @pulumi.getter(name="distanceLocal")
    def distance_local(self) -> _builtins.int:
        """
        Set administrative distance for local BGP routes
        """
        return pulumi.get(self, "distance_local")

    @_builtins.property
    @pulumi.getter(name="distanceLocalVariable")
    def distance_local_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "distance_local_variable")

    @_builtins.property
    @pulumi.getter
    def holdtime(self) -> _builtins.int:
        """
        Set the interval when BGP considers a neighbor to be down
        """
        return pulumi.get(self, "holdtime")

    @_builtins.property
    @pulumi.getter(name="holdtimeVariable")
    def holdtime_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "holdtime_variable")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The id of the feature template
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="ipv4Neighbors")
    def ipv4_neighbors(self) -> Sequence['outputs.GetCiscoBgpFeatureTemplateIpv4NeighborResult']:
        """
        Set BGP neighbors
        """
        return pulumi.get(self, "ipv4_neighbors")

    @_builtins.property
    @pulumi.getter(name="ipv4RouteTargets")
    def ipv4_route_targets(self) -> Sequence['outputs.GetCiscoBgpFeatureTemplateIpv4RouteTargetResult']:
        """
        Router Target for IPV4
        """
        return pulumi.get(self, "ipv4_route_targets")

    @_builtins.property
    @pulumi.getter(name="ipv6Neighbors")
    def ipv6_neighbors(self) -> Sequence['outputs.GetCiscoBgpFeatureTemplateIpv6NeighborResult']:
        """
        Set BGP IPv6 neighbors
        """
        return pulumi.get(self, "ipv6_neighbors")

    @_builtins.property
    @pulumi.getter(name="ipv6RouteTargets")
    def ipv6_route_targets(self) -> Sequence['outputs.GetCiscoBgpFeatureTemplateIpv6RouteTargetResult']:
        """
        Router Target for IPV6
        """
        return pulumi.get(self, "ipv6_route_targets")

    @_builtins.property
    @pulumi.getter
    def keepalive(self) -> _builtins.int:
        """
        Set how often keepalive messages are sent to BGP peer
        """
        return pulumi.get(self, "keepalive")

    @_builtins.property
    @pulumi.getter(name="keepaliveVariable")
    def keepalive_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "keepalive_variable")

    @_builtins.property
    @pulumi.getter(name="missingMedWorst")
    def missing_med_worst(self) -> _builtins.bool:
        """
        If path has no MED, consider it to be worst path when selecting active BGP paths
        """
        return pulumi.get(self, "missing_med_worst")

    @_builtins.property
    @pulumi.getter(name="missingMedWorstVariable")
    def missing_med_worst_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "missing_med_worst_variable")

    @_builtins.property
    @pulumi.getter(name="mplsInterfaces")
    def mpls_interfaces(self) -> Sequence['outputs.GetCiscoBgpFeatureTemplateMplsInterfaceResult']:
        """
        MPLS BGP Interface
        """
        return pulumi.get(self, "mpls_interfaces")

    @_builtins.property
    @pulumi.getter(name="multipathRelax")
    def multipath_relax(self) -> _builtins.bool:
        """
        Ignore AS for multipath selection
        """
        return pulumi.get(self, "multipath_relax")

    @_builtins.property
    @pulumi.getter(name="multipathRelaxVariable")
    def multipath_relax_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "multipath_relax_variable")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The name of the feature template
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="propagateAspath")
    def propagate_aspath(self) -> _builtins.bool:
        """
        Propagate AS Path
        """
        return pulumi.get(self, "propagate_aspath")

    @_builtins.property
    @pulumi.getter(name="propagateAspathVariable")
    def propagate_aspath_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "propagate_aspath_variable")

    @_builtins.property
    @pulumi.getter(name="propagateCommunity")
    def propagate_community(self) -> _builtins.bool:
        """
        Propagate Community
        """
        return pulumi.get(self, "propagate_community")

    @_builtins.property
    @pulumi.getter(name="propagateCommunityVariable")
    def propagate_community_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "propagate_community_variable")

    @_builtins.property
    @pulumi.getter(name="routerId")
    def router_id(self) -> _builtins.str:
        """
        Configure BGP router identifier
        """
        return pulumi.get(self, "router_id")

    @_builtins.property
    @pulumi.getter(name="routerIdVariable")
    def router_id_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "router_id_variable")

    @_builtins.property
    @pulumi.getter
    def shutdown(self) -> _builtins.bool:
        """
        Enable or disable BGP
        """
        return pulumi.get(self, "shutdown")

    @_builtins.property
    @pulumi.getter(name="shutdownVariable")
    def shutdown_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "shutdown_variable")

    @_builtins.property
    @pulumi.getter(name="templateType")
    def template_type(self) -> _builtins.str:
        """
        The template type
        """
        return pulumi.get(self, "template_type")

    @_builtins.property
    @pulumi.getter
    def version(self) -> _builtins.int:
        """
        The version of the feature template
        """
        return pulumi.get(self, "version")


class AwaitableGetCiscoBgpFeatureTemplateResult(GetCiscoBgpFeatureTemplateResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCiscoBgpFeatureTemplateResult(
            address_families=self.address_families,
            always_compare_med=self.always_compare_med,
            always_compare_med_variable=self.always_compare_med_variable,
            as_number=self.as_number,
            as_number_variable=self.as_number_variable,
            compare_router_id=self.compare_router_id,
            compare_router_id_variable=self.compare_router_id_variable,
            description=self.description,
            deterministic_med=self.deterministic_med,
            deterministic_med_variable=self.deterministic_med_variable,
            device_types=self.device_types,
            distance_external=self.distance_external,
            distance_external_variable=self.distance_external_variable,
            distance_internal=self.distance_internal,
            distance_internal_variable=self.distance_internal_variable,
            distance_local=self.distance_local,
            distance_local_variable=self.distance_local_variable,
            holdtime=self.holdtime,
            holdtime_variable=self.holdtime_variable,
            id=self.id,
            ipv4_neighbors=self.ipv4_neighbors,
            ipv4_route_targets=self.ipv4_route_targets,
            ipv6_neighbors=self.ipv6_neighbors,
            ipv6_route_targets=self.ipv6_route_targets,
            keepalive=self.keepalive,
            keepalive_variable=self.keepalive_variable,
            missing_med_worst=self.missing_med_worst,
            missing_med_worst_variable=self.missing_med_worst_variable,
            mpls_interfaces=self.mpls_interfaces,
            multipath_relax=self.multipath_relax,
            multipath_relax_variable=self.multipath_relax_variable,
            name=self.name,
            propagate_aspath=self.propagate_aspath,
            propagate_aspath_variable=self.propagate_aspath_variable,
            propagate_community=self.propagate_community,
            propagate_community_variable=self.propagate_community_variable,
            router_id=self.router_id,
            router_id_variable=self.router_id_variable,
            shutdown=self.shutdown,
            shutdown_variable=self.shutdown_variable,
            template_type=self.template_type,
            version=self.version)


def get_cisco_bgp_feature_template(id: Optional[_builtins.str] = None,
                                   name: Optional[_builtins.str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCiscoBgpFeatureTemplateResult:
    """
    This data source can read the Cisco BGP feature template.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_cisco_bgp_feature_template(id="f6b2c44c-693c-4763-b010-895aa3d236bd")
    ```


    :param _builtins.str id: The id of the feature template
    :param _builtins.str name: The name of the feature template
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('sdwan:index/getCiscoBgpFeatureTemplate:getCiscoBgpFeatureTemplate', __args__, opts=opts, typ=GetCiscoBgpFeatureTemplateResult).value

    return AwaitableGetCiscoBgpFeatureTemplateResult(
        address_families=pulumi.get(__ret__, 'address_families'),
        always_compare_med=pulumi.get(__ret__, 'always_compare_med'),
        always_compare_med_variable=pulumi.get(__ret__, 'always_compare_med_variable'),
        as_number=pulumi.get(__ret__, 'as_number'),
        as_number_variable=pulumi.get(__ret__, 'as_number_variable'),
        compare_router_id=pulumi.get(__ret__, 'compare_router_id'),
        compare_router_id_variable=pulumi.get(__ret__, 'compare_router_id_variable'),
        description=pulumi.get(__ret__, 'description'),
        deterministic_med=pulumi.get(__ret__, 'deterministic_med'),
        deterministic_med_variable=pulumi.get(__ret__, 'deterministic_med_variable'),
        device_types=pulumi.get(__ret__, 'device_types'),
        distance_external=pulumi.get(__ret__, 'distance_external'),
        distance_external_variable=pulumi.get(__ret__, 'distance_external_variable'),
        distance_internal=pulumi.get(__ret__, 'distance_internal'),
        distance_internal_variable=pulumi.get(__ret__, 'distance_internal_variable'),
        distance_local=pulumi.get(__ret__, 'distance_local'),
        distance_local_variable=pulumi.get(__ret__, 'distance_local_variable'),
        holdtime=pulumi.get(__ret__, 'holdtime'),
        holdtime_variable=pulumi.get(__ret__, 'holdtime_variable'),
        id=pulumi.get(__ret__, 'id'),
        ipv4_neighbors=pulumi.get(__ret__, 'ipv4_neighbors'),
        ipv4_route_targets=pulumi.get(__ret__, 'ipv4_route_targets'),
        ipv6_neighbors=pulumi.get(__ret__, 'ipv6_neighbors'),
        ipv6_route_targets=pulumi.get(__ret__, 'ipv6_route_targets'),
        keepalive=pulumi.get(__ret__, 'keepalive'),
        keepalive_variable=pulumi.get(__ret__, 'keepalive_variable'),
        missing_med_worst=pulumi.get(__ret__, 'missing_med_worst'),
        missing_med_worst_variable=pulumi.get(__ret__, 'missing_med_worst_variable'),
        mpls_interfaces=pulumi.get(__ret__, 'mpls_interfaces'),
        multipath_relax=pulumi.get(__ret__, 'multipath_relax'),
        multipath_relax_variable=pulumi.get(__ret__, 'multipath_relax_variable'),
        name=pulumi.get(__ret__, 'name'),
        propagate_aspath=pulumi.get(__ret__, 'propagate_aspath'),
        propagate_aspath_variable=pulumi.get(__ret__, 'propagate_aspath_variable'),
        propagate_community=pulumi.get(__ret__, 'propagate_community'),
        propagate_community_variable=pulumi.get(__ret__, 'propagate_community_variable'),
        router_id=pulumi.get(__ret__, 'router_id'),
        router_id_variable=pulumi.get(__ret__, 'router_id_variable'),
        shutdown=pulumi.get(__ret__, 'shutdown'),
        shutdown_variable=pulumi.get(__ret__, 'shutdown_variable'),
        template_type=pulumi.get(__ret__, 'template_type'),
        version=pulumi.get(__ret__, 'version'))
def get_cisco_bgp_feature_template_output(id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                          name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetCiscoBgpFeatureTemplateResult]:
    """
    This data source can read the Cisco BGP feature template.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_cisco_bgp_feature_template(id="f6b2c44c-693c-4763-b010-895aa3d236bd")
    ```


    :param _builtins.str id: The id of the feature template
    :param _builtins.str name: The name of the feature template
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('sdwan:index/getCiscoBgpFeatureTemplate:getCiscoBgpFeatureTemplate', __args__, opts=opts, typ=GetCiscoBgpFeatureTemplateResult)
    return __ret__.apply(lambda __response__: GetCiscoBgpFeatureTemplateResult(
        address_families=pulumi.get(__response__, 'address_families'),
        always_compare_med=pulumi.get(__response__, 'always_compare_med'),
        always_compare_med_variable=pulumi.get(__response__, 'always_compare_med_variable'),
        as_number=pulumi.get(__response__, 'as_number'),
        as_number_variable=pulumi.get(__response__, 'as_number_variable'),
        compare_router_id=pulumi.get(__response__, 'compare_router_id'),
        compare_router_id_variable=pulumi.get(__response__, 'compare_router_id_variable'),
        description=pulumi.get(__response__, 'description'),
        deterministic_med=pulumi.get(__response__, 'deterministic_med'),
        deterministic_med_variable=pulumi.get(__response__, 'deterministic_med_variable'),
        device_types=pulumi.get(__response__, 'device_types'),
        distance_external=pulumi.get(__response__, 'distance_external'),
        distance_external_variable=pulumi.get(__response__, 'distance_external_variable'),
        distance_internal=pulumi.get(__response__, 'distance_internal'),
        distance_internal_variable=pulumi.get(__response__, 'distance_internal_variable'),
        distance_local=pulumi.get(__response__, 'distance_local'),
        distance_local_variable=pulumi.get(__response__, 'distance_local_variable'),
        holdtime=pulumi.get(__response__, 'holdtime'),
        holdtime_variable=pulumi.get(__response__, 'holdtime_variable'),
        id=pulumi.get(__response__, 'id'),
        ipv4_neighbors=pulumi.get(__response__, 'ipv4_neighbors'),
        ipv4_route_targets=pulumi.get(__response__, 'ipv4_route_targets'),
        ipv6_neighbors=pulumi.get(__response__, 'ipv6_neighbors'),
        ipv6_route_targets=pulumi.get(__response__, 'ipv6_route_targets'),
        keepalive=pulumi.get(__response__, 'keepalive'),
        keepalive_variable=pulumi.get(__response__, 'keepalive_variable'),
        missing_med_worst=pulumi.get(__response__, 'missing_med_worst'),
        missing_med_worst_variable=pulumi.get(__response__, 'missing_med_worst_variable'),
        mpls_interfaces=pulumi.get(__response__, 'mpls_interfaces'),
        multipath_relax=pulumi.get(__response__, 'multipath_relax'),
        multipath_relax_variable=pulumi.get(__response__, 'multipath_relax_variable'),
        name=pulumi.get(__response__, 'name'),
        propagate_aspath=pulumi.get(__response__, 'propagate_aspath'),
        propagate_aspath_variable=pulumi.get(__response__, 'propagate_aspath_variable'),
        propagate_community=pulumi.get(__response__, 'propagate_community'),
        propagate_community_variable=pulumi.get(__response__, 'propagate_community_variable'),
        router_id=pulumi.get(__response__, 'router_id'),
        router_id_variable=pulumi.get(__response__, 'router_id_variable'),
        shutdown=pulumi.get(__response__, 'shutdown'),
        shutdown_variable=pulumi.get(__response__, 'shutdown_variable'),
        template_type=pulumi.get(__response__, 'template_type'),
        version=pulumi.get(__response__, 'version')))
