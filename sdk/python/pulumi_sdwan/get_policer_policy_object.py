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
    'GetPolicerPolicyObjectResult',
    'AwaitableGetPolicerPolicyObjectResult',
    'get_policer_policy_object',
    'get_policer_policy_object_output',
]

@pulumi.output_type
class GetPolicerPolicyObjectResult:
    """
    A collection of values returned by getPolicerPolicyObject.
    """
    def __init__(__self__, burst=None, exceed_action=None, id=None, name=None, rate=None, version=None):
        if burst and not isinstance(burst, int):
            raise TypeError("Expected argument 'burst' to be a int")
        pulumi.set(__self__, "burst", burst)
        if exceed_action and not isinstance(exceed_action, str):
            raise TypeError("Expected argument 'exceed_action' to be a str")
        pulumi.set(__self__, "exceed_action", exceed_action)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if rate and not isinstance(rate, int):
            raise TypeError("Expected argument 'rate' to be a int")
        pulumi.set(__self__, "rate", rate)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)

    @_builtins.property
    @pulumi.getter
    def burst(self) -> _builtins.int:
        """
        Burst in bytes
        """
        return pulumi.get(self, "burst")

    @_builtins.property
    @pulumi.getter(name="exceedAction")
    def exceed_action(self) -> _builtins.str:
        """
        Exceed action
        """
        return pulumi.get(self, "exceed_action")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The id of the object
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The name of the policy object
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def rate(self) -> _builtins.int:
        """
        Rate in bps
        """
        return pulumi.get(self, "rate")

    @_builtins.property
    @pulumi.getter
    def version(self) -> _builtins.int:
        """
        The version of the object
        """
        return pulumi.get(self, "version")


class AwaitableGetPolicerPolicyObjectResult(GetPolicerPolicyObjectResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPolicerPolicyObjectResult(
            burst=self.burst,
            exceed_action=self.exceed_action,
            id=self.id,
            name=self.name,
            rate=self.rate,
            version=self.version)


def get_policer_policy_object(id: Optional[_builtins.str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPolicerPolicyObjectResult:
    """
    This data source can read the Policer Policy Object .

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_policer_policy_object(id="f6b2c44c-693c-4763-b010-895aa3d236bd")
    ```


    :param _builtins.str id: The id of the object
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('sdwan:index/getPolicerPolicyObject:getPolicerPolicyObject', __args__, opts=opts, typ=GetPolicerPolicyObjectResult).value

    return AwaitableGetPolicerPolicyObjectResult(
        burst=pulumi.get(__ret__, 'burst'),
        exceed_action=pulumi.get(__ret__, 'exceed_action'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        rate=pulumi.get(__ret__, 'rate'),
        version=pulumi.get(__ret__, 'version'))
def get_policer_policy_object_output(id: Optional[pulumi.Input[_builtins.str]] = None,
                                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetPolicerPolicyObjectResult]:
    """
    This data source can read the Policer Policy Object .

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_policer_policy_object(id="f6b2c44c-693c-4763-b010-895aa3d236bd")
    ```


    :param _builtins.str id: The id of the object
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('sdwan:index/getPolicerPolicyObject:getPolicerPolicyObject', __args__, opts=opts, typ=GetPolicerPolicyObjectResult)
    return __ret__.apply(lambda __response__: GetPolicerPolicyObjectResult(
        burst=pulumi.get(__response__, 'burst'),
        exceed_action=pulumi.get(__response__, 'exceed_action'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        rate=pulumi.get(__response__, 'rate'),
        version=pulumi.get(__response__, 'version')))
