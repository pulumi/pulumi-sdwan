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
    'GetSystemSecurityFeatureResult',
    'AwaitableGetSystemSecurityFeatureResult',
    'get_system_security_feature',
    'get_system_security_feature_output',
]

@pulumi.output_type
class GetSystemSecurityFeatureResult:
    """
    A collection of values returned by getSystemSecurityFeature.
    """
    def __init__(__self__, anti_replay_window=None, anti_replay_window_variable=None, description=None, extended_anti_replay_window=None, extended_anti_replay_window_variable=None, feature_profile_id=None, id=None, integrity_type_variable=None, integrity_types=None, ipsec_pairwise_keying=None, ipsec_pairwise_keying_variable=None, keychains=None, keys=None, name=None, rekey=None, rekey_variable=None, version=None):
        if anti_replay_window and not isinstance(anti_replay_window, str):
            raise TypeError("Expected argument 'anti_replay_window' to be a str")
        pulumi.set(__self__, "anti_replay_window", anti_replay_window)
        if anti_replay_window_variable and not isinstance(anti_replay_window_variable, str):
            raise TypeError("Expected argument 'anti_replay_window_variable' to be a str")
        pulumi.set(__self__, "anti_replay_window_variable", anti_replay_window_variable)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if extended_anti_replay_window and not isinstance(extended_anti_replay_window, int):
            raise TypeError("Expected argument 'extended_anti_replay_window' to be a int")
        pulumi.set(__self__, "extended_anti_replay_window", extended_anti_replay_window)
        if extended_anti_replay_window_variable and not isinstance(extended_anti_replay_window_variable, str):
            raise TypeError("Expected argument 'extended_anti_replay_window_variable' to be a str")
        pulumi.set(__self__, "extended_anti_replay_window_variable", extended_anti_replay_window_variable)
        if feature_profile_id and not isinstance(feature_profile_id, str):
            raise TypeError("Expected argument 'feature_profile_id' to be a str")
        pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if integrity_type_variable and not isinstance(integrity_type_variable, str):
            raise TypeError("Expected argument 'integrity_type_variable' to be a str")
        pulumi.set(__self__, "integrity_type_variable", integrity_type_variable)
        if integrity_types and not isinstance(integrity_types, list):
            raise TypeError("Expected argument 'integrity_types' to be a list")
        pulumi.set(__self__, "integrity_types", integrity_types)
        if ipsec_pairwise_keying and not isinstance(ipsec_pairwise_keying, bool):
            raise TypeError("Expected argument 'ipsec_pairwise_keying' to be a bool")
        pulumi.set(__self__, "ipsec_pairwise_keying", ipsec_pairwise_keying)
        if ipsec_pairwise_keying_variable and not isinstance(ipsec_pairwise_keying_variable, str):
            raise TypeError("Expected argument 'ipsec_pairwise_keying_variable' to be a str")
        pulumi.set(__self__, "ipsec_pairwise_keying_variable", ipsec_pairwise_keying_variable)
        if keychains and not isinstance(keychains, list):
            raise TypeError("Expected argument 'keychains' to be a list")
        pulumi.set(__self__, "keychains", keychains)
        if keys and not isinstance(keys, list):
            raise TypeError("Expected argument 'keys' to be a list")
        pulumi.set(__self__, "keys", keys)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if rekey and not isinstance(rekey, int):
            raise TypeError("Expected argument 'rekey' to be a int")
        pulumi.set(__self__, "rekey", rekey)
        if rekey_variable and not isinstance(rekey_variable, str):
            raise TypeError("Expected argument 'rekey_variable' to be a str")
        pulumi.set(__self__, "rekey_variable", rekey_variable)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)

    @_builtins.property
    @pulumi.getter(name="antiReplayWindow")
    def anti_replay_window(self) -> _builtins.str:
        """
        Set the sliding replay window size
        """
        return pulumi.get(self, "anti_replay_window")

    @_builtins.property
    @pulumi.getter(name="antiReplayWindowVariable")
    def anti_replay_window_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "anti_replay_window_variable")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        The description of the Feature
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="extendedAntiReplayWindow")
    def extended_anti_replay_window(self) -> _builtins.int:
        """
        Extended Anti-Replay Window
        """
        return pulumi.get(self, "extended_anti_replay_window")

    @_builtins.property
    @pulumi.getter(name="extendedAntiReplayWindowVariable")
    def extended_anti_replay_window_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "extended_anti_replay_window_variable")

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
        The id of the Feature
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="integrityTypeVariable")
    def integrity_type_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "integrity_type_variable")

    @_builtins.property
    @pulumi.getter(name="integrityTypes")
    def integrity_types(self) -> Sequence[_builtins.str]:
        """
        Set the authentication type for DTLS connections
        """
        return pulumi.get(self, "integrity_types")

    @_builtins.property
    @pulumi.getter(name="ipsecPairwiseKeying")
    def ipsec_pairwise_keying(self) -> _builtins.bool:
        """
        Enable or disable IPsec pairwise-keying
        """
        return pulumi.get(self, "ipsec_pairwise_keying")

    @_builtins.property
    @pulumi.getter(name="ipsecPairwiseKeyingVariable")
    def ipsec_pairwise_keying_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "ipsec_pairwise_keying_variable")

    @_builtins.property
    @pulumi.getter
    def keychains(self) -> Sequence['outputs.GetSystemSecurityFeatureKeychainResult']:
        """
        Configure a Keychain
        """
        return pulumi.get(self, "keychains")

    @_builtins.property
    @pulumi.getter
    def keys(self) -> Sequence['outputs.GetSystemSecurityFeatureKeyResult']:
        """
        Configure a Key
        """
        return pulumi.get(self, "keys")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The name of the Feature
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def rekey(self) -> _builtins.int:
        """
        Set how often to change the AES key for DTLS connections
        """
        return pulumi.get(self, "rekey")

    @_builtins.property
    @pulumi.getter(name="rekeyVariable")
    def rekey_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "rekey_variable")

    @_builtins.property
    @pulumi.getter
    def version(self) -> _builtins.int:
        """
        The version of the Feature
        """
        return pulumi.get(self, "version")


class AwaitableGetSystemSecurityFeatureResult(GetSystemSecurityFeatureResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSystemSecurityFeatureResult(
            anti_replay_window=self.anti_replay_window,
            anti_replay_window_variable=self.anti_replay_window_variable,
            description=self.description,
            extended_anti_replay_window=self.extended_anti_replay_window,
            extended_anti_replay_window_variable=self.extended_anti_replay_window_variable,
            feature_profile_id=self.feature_profile_id,
            id=self.id,
            integrity_type_variable=self.integrity_type_variable,
            integrity_types=self.integrity_types,
            ipsec_pairwise_keying=self.ipsec_pairwise_keying,
            ipsec_pairwise_keying_variable=self.ipsec_pairwise_keying_variable,
            keychains=self.keychains,
            keys=self.keys,
            name=self.name,
            rekey=self.rekey,
            rekey_variable=self.rekey_variable,
            version=self.version)


def get_system_security_feature(feature_profile_id: Optional[_builtins.str] = None,
                                id: Optional[_builtins.str] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSystemSecurityFeatureResult:
    """
    This data source can read the System Security Feature.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_system_security_feature(id="f6b2c44c-693c-4763-b010-895aa3d236bd",
        feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac")
    ```


    :param _builtins.str feature_profile_id: Feature Profile ID
    :param _builtins.str id: The id of the Feature
    """
    __args__ = dict()
    __args__['featureProfileId'] = feature_profile_id
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('sdwan:index/getSystemSecurityFeature:getSystemSecurityFeature', __args__, opts=opts, typ=GetSystemSecurityFeatureResult).value

    return AwaitableGetSystemSecurityFeatureResult(
        anti_replay_window=pulumi.get(__ret__, 'anti_replay_window'),
        anti_replay_window_variable=pulumi.get(__ret__, 'anti_replay_window_variable'),
        description=pulumi.get(__ret__, 'description'),
        extended_anti_replay_window=pulumi.get(__ret__, 'extended_anti_replay_window'),
        extended_anti_replay_window_variable=pulumi.get(__ret__, 'extended_anti_replay_window_variable'),
        feature_profile_id=pulumi.get(__ret__, 'feature_profile_id'),
        id=pulumi.get(__ret__, 'id'),
        integrity_type_variable=pulumi.get(__ret__, 'integrity_type_variable'),
        integrity_types=pulumi.get(__ret__, 'integrity_types'),
        ipsec_pairwise_keying=pulumi.get(__ret__, 'ipsec_pairwise_keying'),
        ipsec_pairwise_keying_variable=pulumi.get(__ret__, 'ipsec_pairwise_keying_variable'),
        keychains=pulumi.get(__ret__, 'keychains'),
        keys=pulumi.get(__ret__, 'keys'),
        name=pulumi.get(__ret__, 'name'),
        rekey=pulumi.get(__ret__, 'rekey'),
        rekey_variable=pulumi.get(__ret__, 'rekey_variable'),
        version=pulumi.get(__ret__, 'version'))
def get_system_security_feature_output(feature_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
                                       id: Optional[pulumi.Input[_builtins.str]] = None,
                                       opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSystemSecurityFeatureResult]:
    """
    This data source can read the System Security Feature.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_system_security_feature(id="f6b2c44c-693c-4763-b010-895aa3d236bd",
        feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac")
    ```


    :param _builtins.str feature_profile_id: Feature Profile ID
    :param _builtins.str id: The id of the Feature
    """
    __args__ = dict()
    __args__['featureProfileId'] = feature_profile_id
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('sdwan:index/getSystemSecurityFeature:getSystemSecurityFeature', __args__, opts=opts, typ=GetSystemSecurityFeatureResult)
    return __ret__.apply(lambda __response__: GetSystemSecurityFeatureResult(
        anti_replay_window=pulumi.get(__response__, 'anti_replay_window'),
        anti_replay_window_variable=pulumi.get(__response__, 'anti_replay_window_variable'),
        description=pulumi.get(__response__, 'description'),
        extended_anti_replay_window=pulumi.get(__response__, 'extended_anti_replay_window'),
        extended_anti_replay_window_variable=pulumi.get(__response__, 'extended_anti_replay_window_variable'),
        feature_profile_id=pulumi.get(__response__, 'feature_profile_id'),
        id=pulumi.get(__response__, 'id'),
        integrity_type_variable=pulumi.get(__response__, 'integrity_type_variable'),
        integrity_types=pulumi.get(__response__, 'integrity_types'),
        ipsec_pairwise_keying=pulumi.get(__response__, 'ipsec_pairwise_keying'),
        ipsec_pairwise_keying_variable=pulumi.get(__response__, 'ipsec_pairwise_keying_variable'),
        keychains=pulumi.get(__response__, 'keychains'),
        keys=pulumi.get(__response__, 'keys'),
        name=pulumi.get(__response__, 'name'),
        rekey=pulumi.get(__response__, 'rekey'),
        rekey_variable=pulumi.get(__response__, 'rekey_variable'),
        version=pulumi.get(__response__, 'version')))
