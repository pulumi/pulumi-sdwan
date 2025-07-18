# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
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

__all__ = ['SystemPerformanceMonitoringFeatureArgs', 'SystemPerformanceMonitoringFeature']

@pulumi.input_type
class SystemPerformanceMonitoringFeatureArgs:
    def __init__(__self__, *,
                 feature_profile_id: pulumi.Input[builtins.str],
                 app_perf_monitor_app_groups: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 app_perf_monitor_enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 event_driven_config_enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 event_driven_events: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 monitoring_config_enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 monitoring_config_interval: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a SystemPerformanceMonitoringFeature resource.
        :param pulumi.Input[builtins.str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] app_perf_monitor_app_groups: Application groups to be monitored
        :param pulumi.Input[builtins.bool] app_perf_monitor_enabled: Application performance monitoring enable or disable - Default value: `false`
        :param pulumi.Input[builtins.str] description: The description of the Feature
        :param pulumi.Input[builtins.bool] event_driven_config_enabled: UMTS event driven monitoring enable or disable - Default value: `false`
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] event_driven_events: UMTS events
        :param pulumi.Input[builtins.bool] monitoring_config_enabled: UMTS monitoring enable or disable - Default value: `false`
        :param pulumi.Input[builtins.str] monitoring_config_interval: UMTS monitoring interval(Minutes) - Choices: `30`, `60`
        :param pulumi.Input[builtins.str] name: The name of the Feature
        """
        pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if app_perf_monitor_app_groups is not None:
            pulumi.set(__self__, "app_perf_monitor_app_groups", app_perf_monitor_app_groups)
        if app_perf_monitor_enabled is not None:
            pulumi.set(__self__, "app_perf_monitor_enabled", app_perf_monitor_enabled)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if event_driven_config_enabled is not None:
            pulumi.set(__self__, "event_driven_config_enabled", event_driven_config_enabled)
        if event_driven_events is not None:
            pulumi.set(__self__, "event_driven_events", event_driven_events)
        if monitoring_config_enabled is not None:
            pulumi.set(__self__, "monitoring_config_enabled", monitoring_config_enabled)
        if monitoring_config_interval is not None:
            pulumi.set(__self__, "monitoring_config_interval", monitoring_config_interval)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="featureProfileId")
    def feature_profile_id(self) -> pulumi.Input[builtins.str]:
        """
        Feature Profile ID
        """
        return pulumi.get(self, "feature_profile_id")

    @feature_profile_id.setter
    def feature_profile_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "feature_profile_id", value)

    @property
    @pulumi.getter(name="appPerfMonitorAppGroups")
    def app_perf_monitor_app_groups(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        Application groups to be monitored
        """
        return pulumi.get(self, "app_perf_monitor_app_groups")

    @app_perf_monitor_app_groups.setter
    def app_perf_monitor_app_groups(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "app_perf_monitor_app_groups", value)

    @property
    @pulumi.getter(name="appPerfMonitorEnabled")
    def app_perf_monitor_enabled(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Application performance monitoring enable or disable - Default value: `false`
        """
        return pulumi.get(self, "app_perf_monitor_enabled")

    @app_perf_monitor_enabled.setter
    def app_perf_monitor_enabled(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "app_perf_monitor_enabled", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The description of the Feature
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="eventDrivenConfigEnabled")
    def event_driven_config_enabled(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        UMTS event driven monitoring enable or disable - Default value: `false`
        """
        return pulumi.get(self, "event_driven_config_enabled")

    @event_driven_config_enabled.setter
    def event_driven_config_enabled(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "event_driven_config_enabled", value)

    @property
    @pulumi.getter(name="eventDrivenEvents")
    def event_driven_events(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        UMTS events
        """
        return pulumi.get(self, "event_driven_events")

    @event_driven_events.setter
    def event_driven_events(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "event_driven_events", value)

    @property
    @pulumi.getter(name="monitoringConfigEnabled")
    def monitoring_config_enabled(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        UMTS monitoring enable or disable - Default value: `false`
        """
        return pulumi.get(self, "monitoring_config_enabled")

    @monitoring_config_enabled.setter
    def monitoring_config_enabled(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "monitoring_config_enabled", value)

    @property
    @pulumi.getter(name="monitoringConfigInterval")
    def monitoring_config_interval(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        UMTS monitoring interval(Minutes) - Choices: `30`, `60`
        """
        return pulumi.get(self, "monitoring_config_interval")

    @monitoring_config_interval.setter
    def monitoring_config_interval(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "monitoring_config_interval", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the Feature
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _SystemPerformanceMonitoringFeatureState:
    def __init__(__self__, *,
                 app_perf_monitor_app_groups: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 app_perf_monitor_enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 event_driven_config_enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 event_driven_events: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 feature_profile_id: Optional[pulumi.Input[builtins.str]] = None,
                 monitoring_config_enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 monitoring_config_interval: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 version: Optional[pulumi.Input[builtins.int]] = None):
        """
        Input properties used for looking up and filtering SystemPerformanceMonitoringFeature resources.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] app_perf_monitor_app_groups: Application groups to be monitored
        :param pulumi.Input[builtins.bool] app_perf_monitor_enabled: Application performance monitoring enable or disable - Default value: `false`
        :param pulumi.Input[builtins.str] description: The description of the Feature
        :param pulumi.Input[builtins.bool] event_driven_config_enabled: UMTS event driven monitoring enable or disable - Default value: `false`
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] event_driven_events: UMTS events
        :param pulumi.Input[builtins.str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[builtins.bool] monitoring_config_enabled: UMTS monitoring enable or disable - Default value: `false`
        :param pulumi.Input[builtins.str] monitoring_config_interval: UMTS monitoring interval(Minutes) - Choices: `30`, `60`
        :param pulumi.Input[builtins.str] name: The name of the Feature
        :param pulumi.Input[builtins.int] version: The version of the Feature
        """
        if app_perf_monitor_app_groups is not None:
            pulumi.set(__self__, "app_perf_monitor_app_groups", app_perf_monitor_app_groups)
        if app_perf_monitor_enabled is not None:
            pulumi.set(__self__, "app_perf_monitor_enabled", app_perf_monitor_enabled)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if event_driven_config_enabled is not None:
            pulumi.set(__self__, "event_driven_config_enabled", event_driven_config_enabled)
        if event_driven_events is not None:
            pulumi.set(__self__, "event_driven_events", event_driven_events)
        if feature_profile_id is not None:
            pulumi.set(__self__, "feature_profile_id", feature_profile_id)
        if monitoring_config_enabled is not None:
            pulumi.set(__self__, "monitoring_config_enabled", monitoring_config_enabled)
        if monitoring_config_interval is not None:
            pulumi.set(__self__, "monitoring_config_interval", monitoring_config_interval)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="appPerfMonitorAppGroups")
    def app_perf_monitor_app_groups(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        Application groups to be monitored
        """
        return pulumi.get(self, "app_perf_monitor_app_groups")

    @app_perf_monitor_app_groups.setter
    def app_perf_monitor_app_groups(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "app_perf_monitor_app_groups", value)

    @property
    @pulumi.getter(name="appPerfMonitorEnabled")
    def app_perf_monitor_enabled(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Application performance monitoring enable or disable - Default value: `false`
        """
        return pulumi.get(self, "app_perf_monitor_enabled")

    @app_perf_monitor_enabled.setter
    def app_perf_monitor_enabled(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "app_perf_monitor_enabled", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The description of the Feature
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="eventDrivenConfigEnabled")
    def event_driven_config_enabled(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        UMTS event driven monitoring enable or disable - Default value: `false`
        """
        return pulumi.get(self, "event_driven_config_enabled")

    @event_driven_config_enabled.setter
    def event_driven_config_enabled(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "event_driven_config_enabled", value)

    @property
    @pulumi.getter(name="eventDrivenEvents")
    def event_driven_events(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        UMTS events
        """
        return pulumi.get(self, "event_driven_events")

    @event_driven_events.setter
    def event_driven_events(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "event_driven_events", value)

    @property
    @pulumi.getter(name="featureProfileId")
    def feature_profile_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Feature Profile ID
        """
        return pulumi.get(self, "feature_profile_id")

    @feature_profile_id.setter
    def feature_profile_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "feature_profile_id", value)

    @property
    @pulumi.getter(name="monitoringConfigEnabled")
    def monitoring_config_enabled(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        UMTS monitoring enable or disable - Default value: `false`
        """
        return pulumi.get(self, "monitoring_config_enabled")

    @monitoring_config_enabled.setter
    def monitoring_config_enabled(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "monitoring_config_enabled", value)

    @property
    @pulumi.getter(name="monitoringConfigInterval")
    def monitoring_config_interval(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        UMTS monitoring interval(Minutes) - Choices: `30`, `60`
        """
        return pulumi.get(self, "monitoring_config_interval")

    @monitoring_config_interval.setter
    def monitoring_config_interval(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "monitoring_config_interval", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the Feature
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The version of the Feature
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "version", value)


@pulumi.type_token("sdwan:index/systemPerformanceMonitoringFeature:SystemPerformanceMonitoringFeature")
class SystemPerformanceMonitoringFeature(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_perf_monitor_app_groups: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 app_perf_monitor_enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 event_driven_config_enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 event_driven_events: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 feature_profile_id: Optional[pulumi.Input[builtins.str]] = None,
                 monitoring_config_enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 monitoring_config_interval: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        This resource can manage a System Performance Monitoring Feature.
          - Minimum SD-WAN Manager version: `20.12.0`

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sdwan as sdwan

        example = sdwan.SystemPerformanceMonitoringFeature("example",
            name="Example",
            description="My Example",
            feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
            app_perf_monitor_enabled=True,
            app_perf_monitor_app_groups=["amazon-group"],
            monitoring_config_enabled=True,
            monitoring_config_interval="30",
            event_driven_config_enabled=True,
            event_driven_events=["SLA_CHANGE"])
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        Expected import identifier with the format: "system_performance_monitoring_feature_id,feature_profile_id"

        ```sh
        $ pulumi import sdwan:index/systemPerformanceMonitoringFeature:SystemPerformanceMonitoringFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] app_perf_monitor_app_groups: Application groups to be monitored
        :param pulumi.Input[builtins.bool] app_perf_monitor_enabled: Application performance monitoring enable or disable - Default value: `false`
        :param pulumi.Input[builtins.str] description: The description of the Feature
        :param pulumi.Input[builtins.bool] event_driven_config_enabled: UMTS event driven monitoring enable or disable - Default value: `false`
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] event_driven_events: UMTS events
        :param pulumi.Input[builtins.str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[builtins.bool] monitoring_config_enabled: UMTS monitoring enable or disable - Default value: `false`
        :param pulumi.Input[builtins.str] monitoring_config_interval: UMTS monitoring interval(Minutes) - Choices: `30`, `60`
        :param pulumi.Input[builtins.str] name: The name of the Feature
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SystemPerformanceMonitoringFeatureArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage a System Performance Monitoring Feature.
          - Minimum SD-WAN Manager version: `20.12.0`

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sdwan as sdwan

        example = sdwan.SystemPerformanceMonitoringFeature("example",
            name="Example",
            description="My Example",
            feature_profile_id="f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
            app_perf_monitor_enabled=True,
            app_perf_monitor_app_groups=["amazon-group"],
            monitoring_config_enabled=True,
            monitoring_config_interval="30",
            event_driven_config_enabled=True,
            event_driven_events=["SLA_CHANGE"])
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        Expected import identifier with the format: "system_performance_monitoring_feature_id,feature_profile_id"

        ```sh
        $ pulumi import sdwan:index/systemPerformanceMonitoringFeature:SystemPerformanceMonitoringFeature example "f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac"
        ```

        :param str resource_name: The name of the resource.
        :param SystemPerformanceMonitoringFeatureArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SystemPerformanceMonitoringFeatureArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_perf_monitor_app_groups: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 app_perf_monitor_enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 event_driven_config_enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 event_driven_events: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 feature_profile_id: Optional[pulumi.Input[builtins.str]] = None,
                 monitoring_config_enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 monitoring_config_interval: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SystemPerformanceMonitoringFeatureArgs.__new__(SystemPerformanceMonitoringFeatureArgs)

            __props__.__dict__["app_perf_monitor_app_groups"] = app_perf_monitor_app_groups
            __props__.__dict__["app_perf_monitor_enabled"] = app_perf_monitor_enabled
            __props__.__dict__["description"] = description
            __props__.__dict__["event_driven_config_enabled"] = event_driven_config_enabled
            __props__.__dict__["event_driven_events"] = event_driven_events
            if feature_profile_id is None and not opts.urn:
                raise TypeError("Missing required property 'feature_profile_id'")
            __props__.__dict__["feature_profile_id"] = feature_profile_id
            __props__.__dict__["monitoring_config_enabled"] = monitoring_config_enabled
            __props__.__dict__["monitoring_config_interval"] = monitoring_config_interval
            __props__.__dict__["name"] = name
            __props__.__dict__["version"] = None
        super(SystemPerformanceMonitoringFeature, __self__).__init__(
            'sdwan:index/systemPerformanceMonitoringFeature:SystemPerformanceMonitoringFeature',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            app_perf_monitor_app_groups: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
            app_perf_monitor_enabled: Optional[pulumi.Input[builtins.bool]] = None,
            description: Optional[pulumi.Input[builtins.str]] = None,
            event_driven_config_enabled: Optional[pulumi.Input[builtins.bool]] = None,
            event_driven_events: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
            feature_profile_id: Optional[pulumi.Input[builtins.str]] = None,
            monitoring_config_enabled: Optional[pulumi.Input[builtins.bool]] = None,
            monitoring_config_interval: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            version: Optional[pulumi.Input[builtins.int]] = None) -> 'SystemPerformanceMonitoringFeature':
        """
        Get an existing SystemPerformanceMonitoringFeature resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] app_perf_monitor_app_groups: Application groups to be monitored
        :param pulumi.Input[builtins.bool] app_perf_monitor_enabled: Application performance monitoring enable or disable - Default value: `false`
        :param pulumi.Input[builtins.str] description: The description of the Feature
        :param pulumi.Input[builtins.bool] event_driven_config_enabled: UMTS event driven monitoring enable or disable - Default value: `false`
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] event_driven_events: UMTS events
        :param pulumi.Input[builtins.str] feature_profile_id: Feature Profile ID
        :param pulumi.Input[builtins.bool] monitoring_config_enabled: UMTS monitoring enable or disable - Default value: `false`
        :param pulumi.Input[builtins.str] monitoring_config_interval: UMTS monitoring interval(Minutes) - Choices: `30`, `60`
        :param pulumi.Input[builtins.str] name: The name of the Feature
        :param pulumi.Input[builtins.int] version: The version of the Feature
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SystemPerformanceMonitoringFeatureState.__new__(_SystemPerformanceMonitoringFeatureState)

        __props__.__dict__["app_perf_monitor_app_groups"] = app_perf_monitor_app_groups
        __props__.__dict__["app_perf_monitor_enabled"] = app_perf_monitor_enabled
        __props__.__dict__["description"] = description
        __props__.__dict__["event_driven_config_enabled"] = event_driven_config_enabled
        __props__.__dict__["event_driven_events"] = event_driven_events
        __props__.__dict__["feature_profile_id"] = feature_profile_id
        __props__.__dict__["monitoring_config_enabled"] = monitoring_config_enabled
        __props__.__dict__["monitoring_config_interval"] = monitoring_config_interval
        __props__.__dict__["name"] = name
        __props__.__dict__["version"] = version
        return SystemPerformanceMonitoringFeature(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="appPerfMonitorAppGroups")
    def app_perf_monitor_app_groups(self) -> pulumi.Output[Optional[Sequence[builtins.str]]]:
        """
        Application groups to be monitored
        """
        return pulumi.get(self, "app_perf_monitor_app_groups")

    @property
    @pulumi.getter(name="appPerfMonitorEnabled")
    def app_perf_monitor_enabled(self) -> pulumi.Output[Optional[builtins.bool]]:
        """
        Application performance monitoring enable or disable - Default value: `false`
        """
        return pulumi.get(self, "app_perf_monitor_enabled")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The description of the Feature
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="eventDrivenConfigEnabled")
    def event_driven_config_enabled(self) -> pulumi.Output[Optional[builtins.bool]]:
        """
        UMTS event driven monitoring enable or disable - Default value: `false`
        """
        return pulumi.get(self, "event_driven_config_enabled")

    @property
    @pulumi.getter(name="eventDrivenEvents")
    def event_driven_events(self) -> pulumi.Output[Optional[Sequence[builtins.str]]]:
        """
        UMTS events
        """
        return pulumi.get(self, "event_driven_events")

    @property
    @pulumi.getter(name="featureProfileId")
    def feature_profile_id(self) -> pulumi.Output[builtins.str]:
        """
        Feature Profile ID
        """
        return pulumi.get(self, "feature_profile_id")

    @property
    @pulumi.getter(name="monitoringConfigEnabled")
    def monitoring_config_enabled(self) -> pulumi.Output[Optional[builtins.bool]]:
        """
        UMTS monitoring enable or disable - Default value: `false`
        """
        return pulumi.get(self, "monitoring_config_enabled")

    @property
    @pulumi.getter(name="monitoringConfigInterval")
    def monitoring_config_interval(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        UMTS monitoring interval(Minutes) - Choices: `30`, `60`
        """
        return pulumi.get(self, "monitoring_config_interval")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the Feature
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[builtins.int]:
        """
        The version of the Feature
        """
        return pulumi.get(self, "version")

