// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sdwan.SystemPerformanceMonitoringFeatureArgs;
import com.pulumi.sdwan.Utilities;
import com.pulumi.sdwan.inputs.SystemPerformanceMonitoringFeatureState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource can manage a System Performance Monitoring Feature.
 *   - Minimum SD-WAN Manager version: `20.12.0`
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.sdwan.SystemPerformanceMonitoringFeature;
 * import com.pulumi.sdwan.SystemPerformanceMonitoringFeatureArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new SystemPerformanceMonitoringFeature("example", SystemPerformanceMonitoringFeatureArgs.builder()
 *             .name("Example")
 *             .description("My Example")
 *             .featureProfileId("f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac")
 *             .appPerfMonitorEnabled(true)
 *             .appPerfMonitorAppGroups("amazon-group")
 *             .monitoringConfigEnabled(true)
 *             .monitoringConfigInterval("30")
 *             .eventDrivenConfigEnabled(true)
 *             .eventDrivenEvents("SLA_CHANGE")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import sdwan:index/systemPerformanceMonitoringFeature:SystemPerformanceMonitoringFeature example &#34;f6b2c44c-693c-4763-b010-895aa3d236bd&#34;
 * ```
 * 
 */
@ResourceType(type="sdwan:index/systemPerformanceMonitoringFeature:SystemPerformanceMonitoringFeature")
public class SystemPerformanceMonitoringFeature extends com.pulumi.resources.CustomResource {
    /**
     * Application groups to be monitored
     * 
     */
    @Export(name="appPerfMonitorAppGroups", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> appPerfMonitorAppGroups;

    /**
     * @return Application groups to be monitored
     * 
     */
    public Output<Optional<List<String>>> appPerfMonitorAppGroups() {
        return Codegen.optional(this.appPerfMonitorAppGroups);
    }
    /**
     * Application performance monitoring enable or disable - Default value: `false`
     * 
     */
    @Export(name="appPerfMonitorEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> appPerfMonitorEnabled;

    /**
     * @return Application performance monitoring enable or disable - Default value: `false`
     * 
     */
    public Output<Optional<Boolean>> appPerfMonitorEnabled() {
        return Codegen.optional(this.appPerfMonitorEnabled);
    }
    /**
     * The description of the Feature
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the Feature
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * UMTS event driven monitoring enable or disable - Default value: `false`
     * 
     */
    @Export(name="eventDrivenConfigEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> eventDrivenConfigEnabled;

    /**
     * @return UMTS event driven monitoring enable or disable - Default value: `false`
     * 
     */
    public Output<Optional<Boolean>> eventDrivenConfigEnabled() {
        return Codegen.optional(this.eventDrivenConfigEnabled);
    }
    /**
     * UMTS events
     * 
     */
    @Export(name="eventDrivenEvents", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> eventDrivenEvents;

    /**
     * @return UMTS events
     * 
     */
    public Output<Optional<List<String>>> eventDrivenEvents() {
        return Codegen.optional(this.eventDrivenEvents);
    }
    /**
     * Feature Profile ID
     * 
     */
    @Export(name="featureProfileId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> featureProfileId;

    /**
     * @return Feature Profile ID
     * 
     */
    public Output<Optional<String>> featureProfileId() {
        return Codegen.optional(this.featureProfileId);
    }
    /**
     * UMTS monitoring enable or disable - Default value: `false`
     * 
     */
    @Export(name="monitoringConfigEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> monitoringConfigEnabled;

    /**
     * @return UMTS monitoring enable or disable - Default value: `false`
     * 
     */
    public Output<Optional<Boolean>> monitoringConfigEnabled() {
        return Codegen.optional(this.monitoringConfigEnabled);
    }
    /**
     * UMTS monitoring interval(Minutes) - Choices: `30`, `60`
     * 
     */
    @Export(name="monitoringConfigInterval", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> monitoringConfigInterval;

    /**
     * @return UMTS monitoring interval(Minutes) - Choices: `30`, `60`
     * 
     */
    public Output<Optional<String>> monitoringConfigInterval() {
        return Codegen.optional(this.monitoringConfigInterval);
    }
    /**
     * The name of the Feature
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Feature
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The version of the Feature
     * 
     */
    @Export(name="version", refs={Integer.class}, tree="[0]")
    private Output<Integer> version;

    /**
     * @return The version of the Feature
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SystemPerformanceMonitoringFeature(java.lang.String name) {
        this(name, SystemPerformanceMonitoringFeatureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SystemPerformanceMonitoringFeature(java.lang.String name, @Nullable SystemPerformanceMonitoringFeatureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SystemPerformanceMonitoringFeature(java.lang.String name, @Nullable SystemPerformanceMonitoringFeatureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sdwan:index/systemPerformanceMonitoringFeature:SystemPerformanceMonitoringFeature", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SystemPerformanceMonitoringFeature(java.lang.String name, Output<java.lang.String> id, @Nullable SystemPerformanceMonitoringFeatureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sdwan:index/systemPerformanceMonitoringFeature:SystemPerformanceMonitoringFeature", name, state, makeResourceOptions(options, id), false);
    }

    private static SystemPerformanceMonitoringFeatureArgs makeArgs(@Nullable SystemPerformanceMonitoringFeatureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SystemPerformanceMonitoringFeatureArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SystemPerformanceMonitoringFeature get(java.lang.String name, Output<java.lang.String> id, @Nullable SystemPerformanceMonitoringFeatureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SystemPerformanceMonitoringFeature(name, id, state, options);
    }
}