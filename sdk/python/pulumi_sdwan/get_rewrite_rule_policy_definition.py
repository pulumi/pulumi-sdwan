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
    'GetRewriteRulePolicyDefinitionResult',
    'AwaitableGetRewriteRulePolicyDefinitionResult',
    'get_rewrite_rule_policy_definition',
    'get_rewrite_rule_policy_definition_output',
]

@pulumi.output_type
class GetRewriteRulePolicyDefinitionResult:
    """
    A collection of values returned by getRewriteRulePolicyDefinition.
    """
    def __init__(__self__, description=None, id=None, name=None, rules=None, type=None, version=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if rules and not isinstance(rules, list):
            raise TypeError("Expected argument 'rules' to be a list")
        pulumi.set(__self__, "rules", rules)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        The description of the policy definition
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
        The name of the policy definition
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def rules(self) -> Sequence['outputs.GetRewriteRulePolicyDefinitionRuleResult']:
        """
        List of rules
        """
        return pulumi.get(self, "rules")

    @_builtins.property
    @pulumi.getter
    def type(self) -> _builtins.str:
        """
        Type
        """
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter
    def version(self) -> _builtins.int:
        """
        The version of the object
        """
        return pulumi.get(self, "version")


class AwaitableGetRewriteRulePolicyDefinitionResult(GetRewriteRulePolicyDefinitionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRewriteRulePolicyDefinitionResult(
            description=self.description,
            id=self.id,
            name=self.name,
            rules=self.rules,
            type=self.type,
            version=self.version)


def get_rewrite_rule_policy_definition(id: Optional[_builtins.str] = None,
                                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRewriteRulePolicyDefinitionResult:
    """
    This data source can read the Rewrite Rule Policy Definition .

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_rewrite_rule_policy_definition(id="f6b2c44c-693c-4763-b010-895aa3d236bd")
    ```


    :param _builtins.str id: The id of the object
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('sdwan:index/getRewriteRulePolicyDefinition:getRewriteRulePolicyDefinition', __args__, opts=opts, typ=GetRewriteRulePolicyDefinitionResult).value

    return AwaitableGetRewriteRulePolicyDefinitionResult(
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        rules=pulumi.get(__ret__, 'rules'),
        type=pulumi.get(__ret__, 'type'),
        version=pulumi.get(__ret__, 'version'))
def get_rewrite_rule_policy_definition_output(id: Optional[pulumi.Input[_builtins.str]] = None,
                                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetRewriteRulePolicyDefinitionResult]:
    """
    This data source can read the Rewrite Rule Policy Definition .

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_rewrite_rule_policy_definition(id="f6b2c44c-693c-4763-b010-895aa3d236bd")
    ```


    :param _builtins.str id: The id of the object
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('sdwan:index/getRewriteRulePolicyDefinition:getRewriteRulePolicyDefinition', __args__, opts=opts, typ=GetRewriteRulePolicyDefinitionResult)
    return __ret__.apply(lambda __response__: GetRewriteRulePolicyDefinitionResult(
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        rules=pulumi.get(__response__, 'rules'),
        type=pulumi.get(__response__, 'type'),
        version=pulumi.get(__response__, 'version')))
