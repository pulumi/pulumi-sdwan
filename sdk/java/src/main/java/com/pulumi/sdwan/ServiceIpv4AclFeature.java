// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sdwan.ServiceIpv4AclFeatureArgs;
import com.pulumi.sdwan.Utilities;
import com.pulumi.sdwan.inputs.ServiceIpv4AclFeatureState;
import com.pulumi.sdwan.outputs.ServiceIpv4AclFeatureSequence;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource can manage a Service IPv4 ACL Feature.
 *   - Minimum SD-WAN Manager version: `20.12.0`
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
 * Expected import identifier with the format: &#34;service_ipv4_acl_feature_id,feature_profile_id&#34;
 * 
 * ```sh
 * $ pulumi import sdwan:index/serviceIpv4AclFeature:ServiceIpv4AclFeature example &#34;f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac&#34;
 * ```
 * 
 */
@ResourceType(type="sdwan:index/serviceIpv4AclFeature:ServiceIpv4AclFeature")
public class ServiceIpv4AclFeature extends com.pulumi.resources.CustomResource {
    /**
     * Default Action - Choices: `drop`, `accept` - Default value: `drop`
     * 
     */
    @Export(name="defaultAction", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> defaultAction;

    /**
     * @return Default Action - Choices: `drop`, `accept` - Default value: `drop`
     * 
     */
    public Output<Optional<String>> defaultAction() {
        return Codegen.optional(this.defaultAction);
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
     * Feature Profile ID
     * 
     */
    @Export(name="featureProfileId", refs={String.class}, tree="[0]")
    private Output<String> featureProfileId;

    /**
     * @return Feature Profile ID
     * 
     */
    public Output<String> featureProfileId() {
        return this.featureProfileId;
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
     * Access Control List
     * 
     */
    @Export(name="sequences", refs={List.class,ServiceIpv4AclFeatureSequence.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ServiceIpv4AclFeatureSequence>> sequences;

    /**
     * @return Access Control List
     * 
     */
    public Output<Optional<List<ServiceIpv4AclFeatureSequence>>> sequences() {
        return Codegen.optional(this.sequences);
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
    public ServiceIpv4AclFeature(java.lang.String name) {
        this(name, ServiceIpv4AclFeatureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceIpv4AclFeature(java.lang.String name, ServiceIpv4AclFeatureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceIpv4AclFeature(java.lang.String name, ServiceIpv4AclFeatureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sdwan:index/serviceIpv4AclFeature:ServiceIpv4AclFeature", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ServiceIpv4AclFeature(java.lang.String name, Output<java.lang.String> id, @Nullable ServiceIpv4AclFeatureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sdwan:index/serviceIpv4AclFeature:ServiceIpv4AclFeature", name, state, makeResourceOptions(options, id), false);
    }

    private static ServiceIpv4AclFeatureArgs makeArgs(ServiceIpv4AclFeatureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ServiceIpv4AclFeatureArgs.Empty : args;
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
    public static ServiceIpv4AclFeature get(java.lang.String name, Output<java.lang.String> id, @Nullable ServiceIpv4AclFeatureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceIpv4AclFeature(name, id, state, options);
    }
}
