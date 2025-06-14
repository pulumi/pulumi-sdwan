// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Sdwan
{
    public static class GetSystemBasicFeature
    {
        /// <summary>
        /// This data source can read the System Basic Feature.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Sdwan = Pulumi.Sdwan;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Sdwan.GetSystemBasicFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetSystemBasicFeatureResult> InvokeAsync(GetSystemBasicFeatureArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSystemBasicFeatureResult>("sdwan:index/getSystemBasicFeature:getSystemBasicFeature", args ?? new GetSystemBasicFeatureArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the System Basic Feature.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Sdwan = Pulumi.Sdwan;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Sdwan.GetSystemBasicFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSystemBasicFeatureResult> Invoke(GetSystemBasicFeatureInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSystemBasicFeatureResult>("sdwan:index/getSystemBasicFeature:getSystemBasicFeature", args ?? new GetSystemBasicFeatureInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the System Basic Feature.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Sdwan = Pulumi.Sdwan;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Sdwan.GetSystemBasicFeature.Invoke(new()
        ///     {
        ///         Id = "f6b2c44c-693c-4763-b010-895aa3d236bd",
        ///         FeatureProfileId = "f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSystemBasicFeatureResult> Invoke(GetSystemBasicFeatureInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSystemBasicFeatureResult>("sdwan:index/getSystemBasicFeature:getSystemBasicFeature", args ?? new GetSystemBasicFeatureInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSystemBasicFeatureArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId", required: true)]
        public string FeatureProfileId { get; set; } = null!;

        /// <summary>
        /// The id of the Feature
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetSystemBasicFeatureArgs()
        {
        }
        public static new GetSystemBasicFeatureArgs Empty => new GetSystemBasicFeatureArgs();
    }

    public sealed class GetSystemBasicFeatureInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        [Input("featureProfileId", required: true)]
        public Input<string> FeatureProfileId { get; set; } = null!;

        /// <summary>
        /// The id of the Feature
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetSystemBasicFeatureInvokeArgs()
        {
        }
        public static new GetSystemBasicFeatureInvokeArgs Empty => new GetSystemBasicFeatureInvokeArgs();
    }


    [OutputType]
    public sealed class GetSystemBasicFeatureResult
    {
        /// <summary>
        /// Collect admin-tech before reboot due to daemon failure
        /// </summary>
        public readonly bool AdminTechOnFailure;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string AdminTechOnFailureVariable;
        /// <summary>
        /// Affinity Group Number
        /// </summary>
        public readonly int AffinityGroupNumber;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string AffinityGroupNumberVariable;
        /// <summary>
        /// Affinity Group Preference
        /// </summary>
        public readonly ImmutableArray<int> AffinityGroupPreferences;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string AffinityGroupPreferencesVariable;
        /// <summary>
        /// Affinity Group Number for VRFs
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSystemBasicFeatureAffinityPerVrfResult> AffinityPerVrfs;
        /// <summary>
        /// Affinity Group Preference Auto
        /// </summary>
        public readonly bool AffinityPreferenceAuto;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string AffinityPreferenceAutoVariable;
        /// <summary>
        /// Set a text description of the device
        /// </summary>
        public readonly string ConfigDescription;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ConfigDescriptionVariable;
        /// <summary>
        /// Set the console baud rate
        /// </summary>
        public readonly string ConsoleBaudRate;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ConsoleBaudRateVariable;
        /// <summary>
        /// Set the policer rate for control sessions
        /// </summary>
        public readonly int ControlSessionPps;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ControlSessionPpsVariable;
        /// <summary>
        /// Configure a list of comma-separated controller groups
        /// </summary>
        public readonly ImmutableArray<int> ControllerGroups;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string ControllerGroupsVariable;
        /// <summary>
        /// The description of the Feature
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Device groups
        /// </summary>
        public readonly ImmutableArray<string> DeviceGroups;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string DeviceGroupsVariable;
        /// <summary>
        /// Enable SLA Dampening and Enhanced App Routing.
        /// </summary>
        public readonly string EnhancedAppAwareRouting;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string EnhancedAppAwareRoutingVariable;
        /// <summary>
        /// Feature Profile ID
        /// </summary>
        public readonly string FeatureProfileId;
        /// <summary>
        /// Enable Geo fencing
        /// </summary>
        public readonly bool GpsGeoFencingEnable;
        /// <summary>
        /// Set the device’s geo fencing range
        /// </summary>
        public readonly int GpsGeoFencingRange;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string GpsGeoFencingRangeVariable;
        /// <summary>
        /// Set the device physical latitude
        /// </summary>
        public readonly double GpsLatitude;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string GpsLatitudeVariable;
        /// <summary>
        /// Set the device physical longitude
        /// </summary>
        public readonly double GpsLongitude;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string GpsLongitudeVariable;
        /// <summary>
        /// Enable device’s geo fencing SMS
        /// </summary>
        public readonly bool GpsSmsEnable;
        /// <summary>
        /// Set device’s geo fencing SMS phone number
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSystemBasicFeatureGpsSmsMobileNumberResult> GpsSmsMobileNumbers;
        /// <summary>
        /// The id of the Feature
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Idle CLI timeout in minutes
        /// </summary>
        public readonly int IdleTimeout;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string IdleTimeoutVariable;
        /// <summary>
        /// Set the location of the device
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string LocationVariable;
        /// <summary>
        /// Set the maximum number of OMP sessions \n\n the device can have
        /// </summary>
        public readonly int MaxOmpSessions;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string MaxOmpSessionsVariable;
        /// <summary>
        /// Device is multi-tenant
        /// </summary>
        public readonly bool MultiTenant;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string MultiTenantVariable;
        /// <summary>
        /// The name of the Feature
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Enable or disable On-demand Tunnel
        /// </summary>
        public readonly bool OnDemandEnable;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string OnDemandEnableVariable;
        /// <summary>
        /// Set the idle timeout for on-demand tunnels
        /// </summary>
        public readonly int OnDemandIdleTimeout;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string OnDemandIdleTimeoutVariable;
        /// <summary>
        /// Set the Overlay ID
        /// </summary>
        public readonly int OverlayId;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string OverlayIdVariable;
        /// <summary>
        /// Enable port hopping
        /// </summary>
        public readonly bool PortHopping;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string PortHoppingVariable;
        /// <summary>
        /// Set the TLOC port offset when multiple devices are behind a NAT
        /// </summary>
        public readonly int PortOffset;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string PortOffsetVariable;
        /// <summary>
        /// Site Type
        /// </summary>
        public readonly ImmutableArray<string> SiteTypes;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string SiteTypesVariable;
        /// <summary>
        /// Set the timezone
        /// </summary>
        public readonly string Timezone;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TimezoneVariable;
        /// <summary>
        /// Enable or disable default gateway tracking
        /// </summary>
        public readonly bool TrackDefaultGateway;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TrackDefaultGatewayVariable;
        /// <summary>
        /// OMP Tag attached to routes based on interface tracking
        /// </summary>
        public readonly int TrackInterfaceTag;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TrackInterfaceTagVariable;
        /// <summary>
        /// Configure tracking of transport
        /// </summary>
        public readonly bool TrackTransport;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TrackTransportVariable;
        /// <summary>
        /// Enable transport gateway
        /// </summary>
        public readonly bool TransportGateway;
        /// <summary>
        /// Variable name
        /// </summary>
        public readonly string TransportGatewayVariable;
        /// <summary>
        /// The version of the Feature
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetSystemBasicFeatureResult(
            bool adminTechOnFailure,

            string adminTechOnFailureVariable,

            int affinityGroupNumber,

            string affinityGroupNumberVariable,

            ImmutableArray<int> affinityGroupPreferences,

            string affinityGroupPreferencesVariable,

            ImmutableArray<Outputs.GetSystemBasicFeatureAffinityPerVrfResult> affinityPerVrfs,

            bool affinityPreferenceAuto,

            string affinityPreferenceAutoVariable,

            string configDescription,

            string configDescriptionVariable,

            string consoleBaudRate,

            string consoleBaudRateVariable,

            int controlSessionPps,

            string controlSessionPpsVariable,

            ImmutableArray<int> controllerGroups,

            string controllerGroupsVariable,

            string description,

            ImmutableArray<string> deviceGroups,

            string deviceGroupsVariable,

            string enhancedAppAwareRouting,

            string enhancedAppAwareRoutingVariable,

            string featureProfileId,

            bool gpsGeoFencingEnable,

            int gpsGeoFencingRange,

            string gpsGeoFencingRangeVariable,

            double gpsLatitude,

            string gpsLatitudeVariable,

            double gpsLongitude,

            string gpsLongitudeVariable,

            bool gpsSmsEnable,

            ImmutableArray<Outputs.GetSystemBasicFeatureGpsSmsMobileNumberResult> gpsSmsMobileNumbers,

            string id,

            int idleTimeout,

            string idleTimeoutVariable,

            string location,

            string locationVariable,

            int maxOmpSessions,

            string maxOmpSessionsVariable,

            bool multiTenant,

            string multiTenantVariable,

            string name,

            bool onDemandEnable,

            string onDemandEnableVariable,

            int onDemandIdleTimeout,

            string onDemandIdleTimeoutVariable,

            int overlayId,

            string overlayIdVariable,

            bool portHopping,

            string portHoppingVariable,

            int portOffset,

            string portOffsetVariable,

            ImmutableArray<string> siteTypes,

            string siteTypesVariable,

            string timezone,

            string timezoneVariable,

            bool trackDefaultGateway,

            string trackDefaultGatewayVariable,

            int trackInterfaceTag,

            string trackInterfaceTagVariable,

            bool trackTransport,

            string trackTransportVariable,

            bool transportGateway,

            string transportGatewayVariable,

            int version)
        {
            AdminTechOnFailure = adminTechOnFailure;
            AdminTechOnFailureVariable = adminTechOnFailureVariable;
            AffinityGroupNumber = affinityGroupNumber;
            AffinityGroupNumberVariable = affinityGroupNumberVariable;
            AffinityGroupPreferences = affinityGroupPreferences;
            AffinityGroupPreferencesVariable = affinityGroupPreferencesVariable;
            AffinityPerVrfs = affinityPerVrfs;
            AffinityPreferenceAuto = affinityPreferenceAuto;
            AffinityPreferenceAutoVariable = affinityPreferenceAutoVariable;
            ConfigDescription = configDescription;
            ConfigDescriptionVariable = configDescriptionVariable;
            ConsoleBaudRate = consoleBaudRate;
            ConsoleBaudRateVariable = consoleBaudRateVariable;
            ControlSessionPps = controlSessionPps;
            ControlSessionPpsVariable = controlSessionPpsVariable;
            ControllerGroups = controllerGroups;
            ControllerGroupsVariable = controllerGroupsVariable;
            Description = description;
            DeviceGroups = deviceGroups;
            DeviceGroupsVariable = deviceGroupsVariable;
            EnhancedAppAwareRouting = enhancedAppAwareRouting;
            EnhancedAppAwareRoutingVariable = enhancedAppAwareRoutingVariable;
            FeatureProfileId = featureProfileId;
            GpsGeoFencingEnable = gpsGeoFencingEnable;
            GpsGeoFencingRange = gpsGeoFencingRange;
            GpsGeoFencingRangeVariable = gpsGeoFencingRangeVariable;
            GpsLatitude = gpsLatitude;
            GpsLatitudeVariable = gpsLatitudeVariable;
            GpsLongitude = gpsLongitude;
            GpsLongitudeVariable = gpsLongitudeVariable;
            GpsSmsEnable = gpsSmsEnable;
            GpsSmsMobileNumbers = gpsSmsMobileNumbers;
            Id = id;
            IdleTimeout = idleTimeout;
            IdleTimeoutVariable = idleTimeoutVariable;
            Location = location;
            LocationVariable = locationVariable;
            MaxOmpSessions = maxOmpSessions;
            MaxOmpSessionsVariable = maxOmpSessionsVariable;
            MultiTenant = multiTenant;
            MultiTenantVariable = multiTenantVariable;
            Name = name;
            OnDemandEnable = onDemandEnable;
            OnDemandEnableVariable = onDemandEnableVariable;
            OnDemandIdleTimeout = onDemandIdleTimeout;
            OnDemandIdleTimeoutVariable = onDemandIdleTimeoutVariable;
            OverlayId = overlayId;
            OverlayIdVariable = overlayIdVariable;
            PortHopping = portHopping;
            PortHoppingVariable = portHoppingVariable;
            PortOffset = portOffset;
            PortOffsetVariable = portOffsetVariable;
            SiteTypes = siteTypes;
            SiteTypesVariable = siteTypesVariable;
            Timezone = timezone;
            TimezoneVariable = timezoneVariable;
            TrackDefaultGateway = trackDefaultGateway;
            TrackDefaultGatewayVariable = trackDefaultGatewayVariable;
            TrackInterfaceTag = trackInterfaceTag;
            TrackInterfaceTagVariable = trackInterfaceTagVariable;
            TrackTransport = trackTransport;
            TrackTransportVariable = trackTransportVariable;
            TransportGateway = transportGateway;
            TransportGatewayVariable = transportGatewayVariable;
            Version = version;
        }
    }
}
