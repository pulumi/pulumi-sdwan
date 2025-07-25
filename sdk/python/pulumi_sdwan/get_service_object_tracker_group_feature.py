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
    'GetServiceObjectTrackerGroupFeatureResult',
    'AwaitableGetServiceObjectTrackerGroupFeatureResult',
    'get_service_object_tracker_group_feature',
    'get_service_object_tracker_group_feature_output',
]

@pulumi.output_type
class GetServiceObjectTrackerGroupFeatureResult:
    """
    A collection of values returned by getServiceObjectTrackerGroupFeature.
    """
    def __init__(__self__, description=None, feature_profile_id=None, id=None, name=None, object_tracker_id=None, object_tracker_id_variable=None, reachable=None, reachable_variable=None, tracker_elements=None, version=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if feature_profile_id and not isinstance(feature_profile_id, str):
            raise TypeError("Expected argument 'feature_profile_id' to be a str")
        pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if object_tracker_id and not isinstance(object_tracker_id, int):
            raise TypeError("Expected argument 'object_tracker_id' to be a int")
        pulumi.set(__self__, "object_tracker_id", object_tracker_id)
        if object_tracker_id_variable and not isinstance(object_tracker_id_variable, str):
            raise TypeError("Expected argument 'object_tracker_id_variable' to be a str")
        pulumi.set(__self__, "object_tracker_id_variable", object_tracker_id_variable)
        if reachable and not isinstance(reachable, str):
            raise TypeError("Expected argument 'reachable' to be a str")
        pulumi.set(__self__, "reachable", reachable)
        if reachable_variable and not isinstance(reachable_variable, str):
            raise TypeError("Expected argument 'reachable_variable' to be a str")
        pulumi.set(__self__, "reachable_variable", reachable_variable)
        if tracker_elements and not isinstance(tracker_elements, list):
            raise TypeError("Expected argument 'tracker_elements' to be a list")
        pulumi.set(__self__, "tracker_elements", tracker_elements)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        The description of the Feature
        """
        return pulumi.get(self, "description")

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
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The name of the Feature
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="objectTrackerId")
    def object_tracker_id(self) -> _builtins.int:
        """
        Object ID
        """
        return pulumi.get(self, "object_tracker_id")

    @_builtins.property
    @pulumi.getter(name="objectTrackerIdVariable")
    def object_tracker_id_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "object_tracker_id_variable")

    @_builtins.property
    @pulumi.getter
    def reachable(self) -> _builtins.str:
        """
        tracker ref list criteria boolean and or
        """
        return pulumi.get(self, "reachable")

    @_builtins.property
    @pulumi.getter(name="reachableVariable")
    def reachable_variable(self) -> _builtins.str:
        """
        Variable name
        """
        return pulumi.get(self, "reachable_variable")

    @_builtins.property
    @pulumi.getter(name="trackerElements")
    def tracker_elements(self) -> Sequence['outputs.GetServiceObjectTrackerGroupFeatureTrackerElementResult']:
        """
        Group Tracks ID Refs
        """
        return pulumi.get(self, "tracker_elements")

    @_builtins.property
    @pulumi.getter
    def version(self) -> _builtins.int:
        """
        The version of the Feature
        """
        return pulumi.get(self, "version")


class AwaitableGetServiceObjectTrackerGroupFeatureResult(GetServiceObjectTrackerGroupFeatureResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceObjectTrackerGroupFeatureResult(
            description=self.description,
            feature_profile_id=self.feature_profile_id,
            id=self.id,
            name=self.name,
            object_tracker_id=self.object_tracker_id,
            object_tracker_id_variable=self.object_tracker_id_variable,
            reachable=self.reachable,
            reachable_variable=self.reachable_variable,
            tracker_elements=self.tracker_elements,
            version=self.version)


def get_service_object_tracker_group_feature(feature_profile_id: Optional[_builtins.str] = None,
                                             id: Optional[_builtins.str] = None,
                                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceObjectTrackerGroupFeatureResult:
    """
    This data source can read the Service Object Tracker Group Feature.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_service_object_tracker_group_feature(id="f6b2c44c-693c-4763-b010-895aa3d236bd",
        feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac")
    ```


    :param _builtins.str feature_profile_id: Feature Profile ID
    :param _builtins.str id: The id of the Feature
    """
    __args__ = dict()
    __args__['featureProfileId'] = feature_profile_id
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('sdwan:index/getServiceObjectTrackerGroupFeature:getServiceObjectTrackerGroupFeature', __args__, opts=opts, typ=GetServiceObjectTrackerGroupFeatureResult).value

    return AwaitableGetServiceObjectTrackerGroupFeatureResult(
        description=pulumi.get(__ret__, 'description'),
        feature_profile_id=pulumi.get(__ret__, 'feature_profile_id'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        object_tracker_id=pulumi.get(__ret__, 'object_tracker_id'),
        object_tracker_id_variable=pulumi.get(__ret__, 'object_tracker_id_variable'),
        reachable=pulumi.get(__ret__, 'reachable'),
        reachable_variable=pulumi.get(__ret__, 'reachable_variable'),
        tracker_elements=pulumi.get(__ret__, 'tracker_elements'),
        version=pulumi.get(__ret__, 'version'))
def get_service_object_tracker_group_feature_output(feature_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
                                                    id: Optional[pulumi.Input[_builtins.str]] = None,
                                                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetServiceObjectTrackerGroupFeatureResult]:
    """
    This data source can read the Service Object Tracker Group Feature.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_sdwan as sdwan

    example = sdwan.get_service_object_tracker_group_feature(id="f6b2c44c-693c-4763-b010-895aa3d236bd",
        feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac")
    ```


    :param _builtins.str feature_profile_id: Feature Profile ID
    :param _builtins.str id: The id of the Feature
    """
    __args__ = dict()
    __args__['featureProfileId'] = feature_profile_id
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('sdwan:index/getServiceObjectTrackerGroupFeature:getServiceObjectTrackerGroupFeature', __args__, opts=opts, typ=GetServiceObjectTrackerGroupFeatureResult)
    return __ret__.apply(lambda __response__: GetServiceObjectTrackerGroupFeatureResult(
        description=pulumi.get(__response__, 'description'),
        feature_profile_id=pulumi.get(__response__, 'feature_profile_id'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        object_tracker_id=pulumi.get(__response__, 'object_tracker_id'),
        object_tracker_id_variable=pulumi.get(__response__, 'object_tracker_id_variable'),
        reachable=pulumi.get(__response__, 'reachable'),
        reachable_variable=pulumi.get(__response__, 'reachable_variable'),
        tracker_elements=pulumi.get(__response__, 'tracker_elements'),
        version=pulumi.get(__response__, 'version')))
