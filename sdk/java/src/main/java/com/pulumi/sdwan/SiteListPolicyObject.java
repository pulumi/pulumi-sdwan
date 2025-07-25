// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sdwan.SiteListPolicyObjectArgs;
import com.pulumi.sdwan.Utilities;
import com.pulumi.sdwan.inputs.SiteListPolicyObjectState;
import com.pulumi.sdwan.outputs.SiteListPolicyObjectEntry;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This resource can manage a Site List Policy Object .
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * The `pulumi import` command can be used, for example:
 * 
 * ```sh
 * $ pulumi import sdwan:index/siteListPolicyObject:SiteListPolicyObject example &#34;f6b2c44c-693c-4763-b010-895aa3d236bd&#34;
 * ```
 * 
 */
@ResourceType(type="sdwan:index/siteListPolicyObject:SiteListPolicyObject")
public class SiteListPolicyObject extends com.pulumi.resources.CustomResource {
    /**
     * List of entries
     * 
     */
    @Export(name="entries", refs={List.class,SiteListPolicyObjectEntry.class}, tree="[0,1]")
    private Output<List<SiteListPolicyObjectEntry>> entries;

    /**
     * @return List of entries
     * 
     */
    public Output<List<SiteListPolicyObjectEntry>> entries() {
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
    public SiteListPolicyObject(java.lang.String name) {
        this(name, SiteListPolicyObjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SiteListPolicyObject(java.lang.String name, SiteListPolicyObjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SiteListPolicyObject(java.lang.String name, SiteListPolicyObjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sdwan:index/siteListPolicyObject:SiteListPolicyObject", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SiteListPolicyObject(java.lang.String name, Output<java.lang.String> id, @Nullable SiteListPolicyObjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sdwan:index/siteListPolicyObject:SiteListPolicyObject", name, state, makeResourceOptions(options, id), false);
    }

    private static SiteListPolicyObjectArgs makeArgs(SiteListPolicyObjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SiteListPolicyObjectArgs.Empty : args;
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
    public static SiteListPolicyObject get(java.lang.String name, Output<java.lang.String> id, @Nullable SiteListPolicyObjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SiteListPolicyObject(name, id, state, options);
    }
}
