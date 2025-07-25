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
    'GetDnsSecurityFeatureProfileResult',
    'AwaitableGetDnsSecurityFeatureProfileResult',
    'get_dns_security_feature_profile',
    'get_dns_security_feature_profile_output',
]

@pulumi.output_type
class GetDnsSecurityFeatureProfileResult:
    """
    A collection of values returned by getDnsSecurityFeatureProfile.
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

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        Description
        """
        return pulumi.get(self, "description")

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
        The name of the dns security feature profile
        """
        return pulumi.get(self, "name")


class AwaitableGetDnsSecurityFeatureProfileResult(GetDnsSecurityFeatureProfileResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDnsSecurityFeatureProfileResult(
            description=self.description,
            id=self.id,
            name=self.name)


def get_dns_security_feature_profile(id: Optional[_builtins.str] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDnsSecurityFeatureProfileResult:
    """
    This data source can read the DNS Security Feature Profile .

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_dns_security_feature_profile(id="f6b2c44c-693c-4763-b010-895aa3d236bd")
    ```


    :param _builtins.str id: The id of the object
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('sdwan:index/getDnsSecurityFeatureProfile:getDnsSecurityFeatureProfile', __args__, opts=opts, typ=GetDnsSecurityFeatureProfileResult).value

    return AwaitableGetDnsSecurityFeatureProfileResult(
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'))
def get_dns_security_feature_profile_output(id: Optional[pulumi.Input[_builtins.str]] = None,
                                            opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDnsSecurityFeatureProfileResult]:
    """
    This data source can read the DNS Security Feature Profile .

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_dns_security_feature_profile(id="f6b2c44c-693c-4763-b010-895aa3d236bd")
    ```


    :param _builtins.str id: The id of the object
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('sdwan:index/getDnsSecurityFeatureProfile:getDnsSecurityFeatureProfile', __args__, opts=opts, typ=GetDnsSecurityFeatureProfileResult)
    return __ret__.apply(lambda __response__: GetDnsSecurityFeatureProfileResult(
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name')))
