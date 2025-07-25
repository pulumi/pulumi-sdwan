// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sdwan.DomainListPolicyObjectArgs;
import com.pulumi.sdwan.Utilities;
import com.pulumi.sdwan.inputs.DomainListPolicyObjectState;
import com.pulumi.sdwan.outputs.DomainListPolicyObjectEntry;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This resource can manage a Domain List Policy Object .
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
 * import com.pulumi.sdwan.DomainListPolicyObject;
 * import com.pulumi.sdwan.DomainListPolicyObjectArgs;
 * import com.pulumi.sdwan.inputs.DomainListPolicyObjectEntryArgs;
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
 *         var example = new DomainListPolicyObject("example", DomainListPolicyObjectArgs.builder()
 *             .name("Example")
 *             .entries(DomainListPolicyObjectEntryArgs.builder()
 *                 .domain(".*.cisco.com")
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
 * $ pulumi import sdwan:index/domainListPolicyObject:DomainListPolicyObject example &#34;f6b2c44c-693c-4763-b010-895aa3d236bd&#34;
 * ```
 * 
 */
@ResourceType(type="sdwan:index/domainListPolicyObject:DomainListPolicyObject")
public class DomainListPolicyObject extends com.pulumi.resources.CustomResource {
    /**
     * List of entries
     * 
     */
    @Export(name="entries", refs={List.class,DomainListPolicyObjectEntry.class}, tree="[0,1]")
    private Output<List<DomainListPolicyObjectEntry>> entries;

    /**
     * @return List of entries
     * 
     */
    public Output<List<DomainListPolicyObjectEntry>> entries() {
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
    public DomainListPolicyObject(java.lang.String name) {
        this(name, DomainListPolicyObjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainListPolicyObject(java.lang.String name, DomainListPolicyObjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainListPolicyObject(java.lang.String name, DomainListPolicyObjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sdwan:index/domainListPolicyObject:DomainListPolicyObject", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DomainListPolicyObject(java.lang.String name, Output<java.lang.String> id, @Nullable DomainListPolicyObjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sdwan:index/domainListPolicyObject:DomainListPolicyObject", name, state, makeResourceOptions(options, id), false);
    }

    private static DomainListPolicyObjectArgs makeArgs(DomainListPolicyObjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DomainListPolicyObjectArgs.Empty : args;
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
    public static DomainListPolicyObject get(java.lang.String name, Output<java.lang.String> id, @Nullable DomainListPolicyObjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DomainListPolicyObject(name, id, state, options);
    }
}
