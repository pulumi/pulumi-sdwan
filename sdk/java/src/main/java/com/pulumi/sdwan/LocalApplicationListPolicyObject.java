// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sdwan.LocalApplicationListPolicyObjectArgs;
import com.pulumi.sdwan.Utilities;
import com.pulumi.sdwan.inputs.LocalApplicationListPolicyObjectState;
import com.pulumi.sdwan.outputs.LocalApplicationListPolicyObjectEntry;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This resource can manage a Local Application List Policy Object .
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
 * import com.pulumi.sdwan.LocalApplicationListPolicyObject;
 * import com.pulumi.sdwan.LocalApplicationListPolicyObjectArgs;
 * import com.pulumi.sdwan.inputs.LocalApplicationListPolicyObjectEntryArgs;
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
 *         var example = new LocalApplicationListPolicyObject("example", LocalApplicationListPolicyObjectArgs.builder()
 *             .name("Example")
 *             .entries(LocalApplicationListPolicyObjectEntryArgs.builder()
 *                 .application("cisco-collab-video")
 *                 .build())
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
 * The `pulumi import` command can be used, for example:
 * 
 * ```sh
 * $ pulumi import sdwan:index/localApplicationListPolicyObject:LocalApplicationListPolicyObject example &#34;f6b2c44c-693c-4763-b010-895aa3d236bd&#34;
 * ```
 * 
 */
@ResourceType(type="sdwan:index/localApplicationListPolicyObject:LocalApplicationListPolicyObject")
public class LocalApplicationListPolicyObject extends com.pulumi.resources.CustomResource {
    /**
     * List of entries
     * 
     */
    @Export(name="entries", refs={List.class,LocalApplicationListPolicyObjectEntry.class}, tree="[0,1]")
    private Output<List<LocalApplicationListPolicyObjectEntry>> entries;

    /**
     * @return List of entries
     * 
     */
    public Output<List<LocalApplicationListPolicyObjectEntry>> entries() {
        return this.entries;
    }
    /**
     * The name of the policy object
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the policy object
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The version of the object
     * 
     */
    @Export(name="version", refs={Integer.class}, tree="[0]")
    private Output<Integer> version;

    /**
     * @return The version of the object
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LocalApplicationListPolicyObject(java.lang.String name) {
        this(name, LocalApplicationListPolicyObjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LocalApplicationListPolicyObject(java.lang.String name, LocalApplicationListPolicyObjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LocalApplicationListPolicyObject(java.lang.String name, LocalApplicationListPolicyObjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sdwan:index/localApplicationListPolicyObject:LocalApplicationListPolicyObject", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private LocalApplicationListPolicyObject(java.lang.String name, Output<java.lang.String> id, @Nullable LocalApplicationListPolicyObjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sdwan:index/localApplicationListPolicyObject:LocalApplicationListPolicyObject", name, state, makeResourceOptions(options, id), false);
    }

    private static LocalApplicationListPolicyObjectArgs makeArgs(LocalApplicationListPolicyObjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LocalApplicationListPolicyObjectArgs.Empty : args;
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
    public static LocalApplicationListPolicyObject get(java.lang.String name, Output<java.lang.String> id, @Nullable LocalApplicationListPolicyObjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LocalApplicationListPolicyObject(name, id, state, options);
    }
}
