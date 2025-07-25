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

__all__ = [
    'GetPolicyObjectExpandedCommunityListResult',
    'AwaitableGetPolicyObjectExpandedCommunityListResult',
    'get_policy_object_expanded_community_list',
    'get_policy_object_expanded_community_list_output',
]

@pulumi.output_type
class GetPolicyObjectExpandedCommunityListResult:
    """
    A collection of values returned by getPolicyObjectExpandedCommunityList.
    """
    def __init__(__self__, description=None, expanded_community_lists=None, expanded_community_lists_variable=None, feature_profile_id=None, id=None, name=None, version=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if expanded_community_lists and not isinstance(expanded_community_lists, list):
            raise TypeError("Expected argument 'expanded_community_lists' to be a list")
        pulumi.set(__self__, "expanded_community_lists", expanded_community_lists)
        if expanded_community_lists_variable and not isinstance(expanded_community_lists_variable, str):
            raise TypeError("Expected argument 'expanded_community_lists_variable' to be a str")
        pulumi.set(__self__, "expanded_community_lists_variable", expanded_community_lists_variable)
        if feature_profile_id and not isinstance(feature_profile_id, str):
            raise TypeError("Expected argument 'feature_profile_id' to be a str")
        pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        The description of the Policy_object
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="expandedCommunityLists")
    def expanded_community_lists(self) -> Sequence[_builtins.str]:
        """
        Expanded Community List
        """
        return pulumi.get(self, "expanded_community_lists")

    @_builtins.property
    @pulumi.getter(name="expandedCommunityListsVariable")
    def expanded_community_lists_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "expanded_community_lists_variable")

    @_builtins.property
    @pulumi.getter(name="featureProfileId")
    def feature_profile_id(self) -> _builtins.str:
        """
        Feature Profile ID
        """
        return pulumi.get(self, "feature_profile_id")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The id of the Policy_object
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The name of the Policy_object
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def version(self) -> _builtins.int:
        """
        The version of the Policy_object
        """
        return pulumi.get(self, "version")


class AwaitableGetPolicyObjectExpandedCommunityListResult(GetPolicyObjectExpandedCommunityListResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPolicyObjectExpandedCommunityListResult(
            description=self.description,
            expanded_community_lists=self.expanded_community_lists,
            expanded_community_lists_variable=self.expanded_community_lists_variable,
            feature_profile_id=self.feature_profile_id,
            id=self.id,
            name=self.name,
            version=self.version)


def get_policy_object_expanded_community_list(feature_profile_id: Optional[_builtins.str] = None,
                                              id: Optional[_builtins.str] = None,
                                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPolicyObjectExpandedCommunityListResult:
    """
    This data source can read the Policy Object Expanded Community List Policy_object.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_policy_object_expanded_community_list(id="f6b2c44c-693c-4763-b010-895aa3d236bd",
        feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac")
    ```


    :param _builtins.str feature_profile_id: Feature Profile ID
    :param _builtins.str id: The id of the Policy_object
    """
    __args__ = dict()
    __args__['featureProfileId'] = feature_profile_id
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('sdwan:index/getPolicyObjectExpandedCommunityList:getPolicyObjectExpandedCommunityList', __args__, opts=opts, typ=GetPolicyObjectExpandedCommunityListResult).value

    return AwaitableGetPolicyObjectExpandedCommunityListResult(
        description=pulumi.get(__ret__, 'description'),
        expanded_community_lists=pulumi.get(__ret__, 'expanded_community_lists'),
        expanded_community_lists_variable=pulumi.get(__ret__, 'expanded_community_lists_variable'),
        feature_profile_id=pulumi.get(__ret__, 'feature_profile_id'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        version=pulumi.get(__ret__, 'version'))
def get_policy_object_expanded_community_list_output(feature_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
                                                     id: Optional[pulumi.Input[_builtins.str]] = None,
                                                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetPolicyObjectExpandedCommunityListResult]:
    """
    This data source can read the Policy Object Expanded Community List Policy_object.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_policy_object_expanded_community_list(id="f6b2c44c-693c-4763-b010-895aa3d236bd",
        feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac")
    ```


    :param _builtins.str feature_profile_id: Feature Profile ID
    :param _builtins.str id: The id of the Policy_object
    """
    __args__ = dict()
    __args__['featureProfileId'] = feature_profile_id
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('sdwan:index/getPolicyObjectExpandedCommunityList:getPolicyObjectExpandedCommunityList', __args__, opts=opts, typ=GetPolicyObjectExpandedCommunityListResult)
    return __ret__.apply(lambda __response__: GetPolicyObjectExpandedCommunityListResult(
        description=pulumi.get(__response__, 'description'),
        expanded_community_lists=pulumi.get(__response__, 'expanded_community_lists'),
        expanded_community_lists_variable=pulumi.get(__response__, 'expanded_community_lists_variable'),
        feature_profile_id=pulumi.get(__response__, 'feature_profile_id'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        version=pulumi.get(__response__, 'version')))
