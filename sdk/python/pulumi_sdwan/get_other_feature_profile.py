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
    'GetOtherFeatureProfileResult',
    'AwaitableGetOtherFeatureProfileResult',
    'get_other_feature_profile',
    'get_other_feature_profile_output',
]

@pulumi.output_type
class GetOtherFeatureProfileResult:
    """
    A collection of values returned by getOtherFeatureProfile.
    """
    def __init__(__self__, description=None, id=None, name=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The id of the object
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the transport feature profile
        """
        return pulumi.get(self, "name")


class AwaitableGetOtherFeatureProfileResult(GetOtherFeatureProfileResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOtherFeatureProfileResult(
            description=self.description,
            id=self.id,
            name=self.name)


def get_other_feature_profile(id: Optional[str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOtherFeatureProfileResult:
    """
    This data source can read the Other Feature Profile .

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_other_feature_profile(id="f6b2c44c-693c-4763-b010-895aa3d236bd")
    ```


    :param str id: The id of the object
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('sdwan:index/getOtherFeatureProfile:getOtherFeatureProfile', __args__, opts=opts, typ=GetOtherFeatureProfileResult).value

    return AwaitableGetOtherFeatureProfileResult(
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'))


@_utilities.lift_output_func(get_other_feature_profile)
def get_other_feature_profile_output(id: Optional[pulumi.Input[str]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetOtherFeatureProfileResult]:
    """
    This data source can read the Other Feature Profile .

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_other_feature_profile(id="f6b2c44c-693c-4763-b010-895aa3d236bd")
    ```


    :param str id: The id of the object
    """
    ...