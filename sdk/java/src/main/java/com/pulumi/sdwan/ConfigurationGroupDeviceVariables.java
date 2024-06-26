// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sdwan.ConfigurationGroupDeviceVariablesArgs;
import com.pulumi.sdwan.Utilities;
import com.pulumi.sdwan.inputs.ConfigurationGroupDeviceVariablesState;
import com.pulumi.sdwan.outputs.ConfigurationGroupDeviceVariablesDevice;
import com.pulumi.sdwan.outputs.ConfigurationGroupDeviceVariablesGroup;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource can manage a Configuration Group Device Variables .
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
 * import com.pulumi.sdwan.ConfigurationGroupDeviceVariables;
 * import com.pulumi.sdwan.ConfigurationGroupDeviceVariablesArgs;
 * import com.pulumi.sdwan.inputs.ConfigurationGroupDeviceVariablesDeviceArgs;
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
 *         var example = new ConfigurationGroupDeviceVariables("example", ConfigurationGroupDeviceVariablesArgs.builder()
 *             .configurationGroupId("f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac")
 *             .solution("sdwan")
 *             .devices(ConfigurationGroupDeviceVariablesDeviceArgs.builder()
 *                 .device_id("C8K-15411CCC-D476-0B3B-21F2-5D6AC387EE7B")
 *                 .variables(ConfigurationGroupDeviceVariablesDeviceVariableArgs.builder()
 *                     .name("host_name")
 *                     .value("edge1")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="sdwan:index/configurationGroupDeviceVariables:ConfigurationGroupDeviceVariables")
public class ConfigurationGroupDeviceVariables extends com.pulumi.resources.CustomResource {
    /**
     * Configuration Group ID
     * 
     */
    @Export(name="configurationGroupId", refs={String.class}, tree="[0]")
    private Output<String> configurationGroupId;

    /**
     * @return Configuration Group ID
     * 
     */
    public Output<String> configurationGroupId() {
        return this.configurationGroupId;
    }
    /**
     * List of devices
     * 
     */
    @Export(name="devices", refs={List.class,ConfigurationGroupDeviceVariablesDevice.class}, tree="[0,1]")
    private Output<List<ConfigurationGroupDeviceVariablesDevice>> devices;

    /**
     * @return List of devices
     * 
     */
    public Output<List<ConfigurationGroupDeviceVariablesDevice>> devices() {
        return this.devices;
    }
    /**
     * List of device groups
     * 
     */
    @Export(name="groups", refs={List.class,ConfigurationGroupDeviceVariablesGroup.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ConfigurationGroupDeviceVariablesGroup>> groups;

    /**
     * @return List of device groups
     * 
     */
    public Output<Optional<List<ConfigurationGroupDeviceVariablesGroup>>> groups() {
        return Codegen.optional(this.groups);
    }
    /**
     * Type of solution - Choices: `mobility`, `sdwan`, `nfvirtual`
     * 
     */
    @Export(name="solution", refs={String.class}, tree="[0]")
    private Output<String> solution;

    /**
     * @return Type of solution - Choices: `mobility`, `sdwan`, `nfvirtual`
     * 
     */
    public Output<String> solution() {
        return this.solution;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConfigurationGroupDeviceVariables(String name) {
        this(name, ConfigurationGroupDeviceVariablesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfigurationGroupDeviceVariables(String name, ConfigurationGroupDeviceVariablesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigurationGroupDeviceVariables(String name, ConfigurationGroupDeviceVariablesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sdwan:index/configurationGroupDeviceVariables:ConfigurationGroupDeviceVariables", name, args == null ? ConfigurationGroupDeviceVariablesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConfigurationGroupDeviceVariables(String name, Output<String> id, @Nullable ConfigurationGroupDeviceVariablesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sdwan:index/configurationGroupDeviceVariables:ConfigurationGroupDeviceVariables", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static ConfigurationGroupDeviceVariables get(String name, Output<String> id, @Nullable ConfigurationGroupDeviceVariablesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConfigurationGroupDeviceVariables(name, id, state, options);
    }
}
