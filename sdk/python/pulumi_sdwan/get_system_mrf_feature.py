# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetSystemMrfFeatureResult',
    'AwaitableGetSystemMrfFeatureResult',
    'get_system_mrf_feature',
    'get_system_mrf_feature_output',
]

@pulumi.output_type
class GetSystemMrfFeatureResult:
    """
    A collection of values returned by getSystemMrfFeature.
    """
    def __init__(__self__, description=None, enable_migration_to_mrf=None, feature_profile_id=None, id=None, migration_bgp_community=None, name=None, region_id=None, role=None, role_variable=None, secondary_region_id=None, secondary_region_id_variable=None, version=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if enable_migration_to_mrf and not isinstance(enable_migration_to_mrf, str):
            raise TypeError("Expected argument 'enable_migration_to_mrf' to be a str")
        pulumi.set(__self__, "enable_migration_to_mrf", enable_migration_to_mrf)
        if feature_profile_id and not isinstance(feature_profile_id, str):
            raise TypeError("Expected argument 'feature_profile_id' to be a str")
        pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if migration_bgp_community and not isinstance(migration_bgp_community, int):
            raise TypeError("Expected argument 'migration_bgp_community' to be a int")
        pulumi.set(__self__, "migration_bgp_community", migration_bgp_community)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if region_id and not isinstance(region_id, int):
            raise TypeError("Expected argument 'region_id' to be a int")
        pulumi.set(__self__, "region_id", region_id)
        if role and not isinstance(role, str):
            raise TypeError("Expected argument 'role' to be a str")
        pulumi.set(__self__, "role", role)
        if role_variable and not isinstance(role_variable, str):
            raise TypeError("Expected argument 'role_variable' to be a str")
        pulumi.set(__self__, "role_variable", role_variable)
        if secondary_region_id and not isinstance(secondary_region_id, int):
            raise TypeError("Expected argument 'secondary_region_id' to be a int")
        pulumi.set(__self__, "secondary_region_id", secondary_region_id)
        if secondary_region_id_variable and not isinstance(secondary_region_id_variable, str):
            raise TypeError("Expected argument 'secondary_region_id_variable' to be a str")
        pulumi.set(__self__, "secondary_region_id_variable", secondary_region_id_variable)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the Feature
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="enableMigrationToMrf")
    def enable_migration_to_mrf(self) -> str:
        """
        Enable migration mode to Multi-Region Fabric
        """
        return pulumi.get(self, "enable_migration_to_mrf")

    @property
    @pulumi.getter(name="featureProfileId")
    def feature_profile_id(self) -> str:
        """
        Feature Profile ID
        """
        return pulumi.get(self, "feature_profile_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The id of the Feature
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="migrationBgpCommunity")
    def migration_bgp_community(self) -> int:
        """
        Set BGP community during migration from BGP-core based network
        """
        return pulumi.get(self, "migration_bgp_community")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the Feature
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="regionId")
    def region_id(self) -> int:
        """
        Set region ID
        """
        return pulumi.get(self, "region_id")

    @property
    @pulumi.getter
    def role(self) -> str:
        """
        Set the role for router
        """
        return pulumi.get(self, "role")

    @property
    @pulumi.getter(name="roleVariable")
    def role_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "role_variable")

    @property
    @pulumi.getter(name="secondaryRegionId")
    def secondary_region_id(self) -> int:
        """
        Set secondary region ID
        """
        return pulumi.get(self, "secondary_region_id")

    @property
    @pulumi.getter(name="secondaryRegionIdVariable")
    def secondary_region_id_variable(self) -> str:
        """
        Variable name
        """
        return pulumi.get(self, "secondary_region_id_variable")

    @property
    @pulumi.getter
    def version(self) -> int:
        """
        The version of the Feature
        """
        return pulumi.get(self, "version")


class AwaitableGetSystemMrfFeatureResult(GetSystemMrfFeatureResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSystemMrfFeatureResult(
            description=self.description,
            enable_migration_to_mrf=self.enable_migration_to_mrf,
            feature_profile_id=self.feature_profile_id,
            id=self.id,
            migration_bgp_community=self.migration_bgp_community,
            name=self.name,
            region_id=self.region_id,
            role=self.role,
            role_variable=self.role_variable,
            secondary_region_id=self.secondary_region_id,
            secondary_region_id_variable=self.secondary_region_id_variable,
            version=self.version)


def get_system_mrf_feature(feature_profile_id: Optional[str] = None,
                           id: Optional[str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSystemMrfFeatureResult:
    """
    This data source can read the System MRF Feature.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_system_mrf_feature(id="f6b2c44c-693c-4763-b010-895aa3d236bd",
        feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac")
    ```


    :param str feature_profile_id: Feature Profile ID
    :param str id: The id of the Feature
    """
    __args__ = dict()
    __args__['featureProfileId'] = feature_profile_id
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('sdwan:index/getSystemMrfFeature:getSystemMrfFeature', __args__, opts=opts, typ=GetSystemMrfFeatureResult).value

    return AwaitableGetSystemMrfFeatureResult(
        description=pulumi.get(__ret__, 'description'),
        enable_migration_to_mrf=pulumi.get(__ret__, 'enable_migration_to_mrf'),
        feature_profile_id=pulumi.get(__ret__, 'feature_profile_id'),
        id=pulumi.get(__ret__, 'id'),
        migration_bgp_community=pulumi.get(__ret__, 'migration_bgp_community'),
        name=pulumi.get(__ret__, 'name'),
        region_id=pulumi.get(__ret__, 'region_id'),
        role=pulumi.get(__ret__, 'role'),
        role_variable=pulumi.get(__ret__, 'role_variable'),
        secondary_region_id=pulumi.get(__ret__, 'secondary_region_id'),
        secondary_region_id_variable=pulumi.get(__ret__, 'secondary_region_id_variable'),
        version=pulumi.get(__ret__, 'version'))


@_utilities.lift_output_func(get_system_mrf_feature)
def get_system_mrf_feature_output(feature_profile_id: Optional[pulumi.Input[str]] = None,
                                  id: Optional[pulumi.Input[str]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSystemMrfFeatureResult]:
    """
    This data source can read the System MRF Feature.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_system_mrf_feature(id="f6b2c44c-693c-4763-b010-895aa3d236bd",
        feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac")
    ```


    :param str feature_profile_id: Feature Profile ID
    :param str id: The id of the Feature
    """
    ...