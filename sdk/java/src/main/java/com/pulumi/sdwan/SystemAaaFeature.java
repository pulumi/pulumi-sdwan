// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sdwan.SystemAaaFeatureArgs;
import com.pulumi.sdwan.Utilities;
import com.pulumi.sdwan.inputs.SystemAaaFeatureState;
import com.pulumi.sdwan.outputs.SystemAaaFeatureAccountingRule;
import com.pulumi.sdwan.outputs.SystemAaaFeatureAuthorizationRule;
import com.pulumi.sdwan.outputs.SystemAaaFeatureRadiusGroup;
import com.pulumi.sdwan.outputs.SystemAaaFeatureTacacsGroup;
import com.pulumi.sdwan.outputs.SystemAaaFeatureUser;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource can manage a System AAA Feature.
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
 * Expected import identifier with the format: &#34;system_aaa_feature_id,feature_profile_id&#34;
 * 
 * ```sh
 * $ pulumi import sdwan:index/systemAaaFeature:SystemAaaFeature example &#34;f6b2c44c-693c-4763-b010-895aa3d236bd,f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac&#34;
 * ```
 * 
 */
@ResourceType(type="sdwan:index/systemAaaFeature:SystemAaaFeature")
public class SystemAaaFeature extends com.pulumi.resources.CustomResource {
    /**
     * Accounting configurations parameters - Default value: `false`
     * 
     */
    @Export(name="accountingGroup", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> accountingGroup;

    /**
     * @return Accounting configurations parameters - Default value: `false`
     * 
     */
    public Output<Optional<Boolean>> accountingGroup() {
        return Codegen.optional(this.accountingGroup);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="accountingGroupVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountingGroupVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> accountingGroupVariable() {
        return Codegen.optional(this.accountingGroupVariable);
    }
    /**
     * Configure the accounting rules
     * 
     */
    @Export(name="accountingRules", refs={List.class,SystemAaaFeatureAccountingRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SystemAaaFeatureAccountingRule>> accountingRules;

    /**
     * @return Configure the accounting rules
     * 
     */
    public Output<Optional<List<SystemAaaFeatureAccountingRule>>> accountingRules() {
        return Codegen.optional(this.accountingRules);
    }
    /**
     * Authentication configurations parameters - Default value: `false`
     * 
     */
    @Export(name="authenticationGroup", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> authenticationGroup;

    /**
     * @return Authentication configurations parameters - Default value: `false`
     * 
     */
    public Output<Optional<Boolean>> authenticationGroup() {
        return Codegen.optional(this.authenticationGroup);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="authenticationGroupVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authenticationGroupVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> authenticationGroupVariable() {
        return Codegen.optional(this.authenticationGroupVariable);
    }
    /**
     * For configuration mode commands. - Default value: `false`
     * 
     */
    @Export(name="authorizationConfigCommands", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> authorizationConfigCommands;

    /**
     * @return For configuration mode commands. - Default value: `false`
     * 
     */
    public Output<Optional<Boolean>> authorizationConfigCommands() {
        return Codegen.optional(this.authorizationConfigCommands);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="authorizationConfigCommandsVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authorizationConfigCommandsVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> authorizationConfigCommandsVariable() {
        return Codegen.optional(this.authorizationConfigCommandsVariable);
    }
    /**
     * For enabling console authorization - Default value: `false`
     * 
     */
    @Export(name="authorizationConsole", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> authorizationConsole;

    /**
     * @return For enabling console authorization - Default value: `false`
     * 
     */
    public Output<Optional<Boolean>> authorizationConsole() {
        return Codegen.optional(this.authorizationConsole);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="authorizationConsoleVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authorizationConsoleVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> authorizationConsoleVariable() {
        return Codegen.optional(this.authorizationConsoleVariable);
    }
    /**
     * Configure the Authorization Rules
     * 
     */
    @Export(name="authorizationRules", refs={List.class,SystemAaaFeatureAuthorizationRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SystemAaaFeatureAuthorizationRule>> authorizationRules;

    /**
     * @return Configure the Authorization Rules
     * 
     */
    public Output<Optional<List<SystemAaaFeatureAuthorizationRule>>> authorizationRules() {
        return Codegen.optional(this.authorizationRules);
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
     * Configure the Radius serverGroup
     * 
     */
    @Export(name="radiusGroups", refs={List.class,SystemAaaFeatureRadiusGroup.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SystemAaaFeatureRadiusGroup>> radiusGroups;

    /**
     * @return Configure the Radius serverGroup
     * 
     */
    public Output<Optional<List<SystemAaaFeatureRadiusGroup>>> radiusGroups() {
        return Codegen.optional(this.radiusGroups);
    }
    /**
     * ServerGroups priority order
     * 
     */
    @Export(name="serverAuthOrders", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> serverAuthOrders;

    /**
     * @return ServerGroups priority order
     * 
     */
    public Output<List<String>> serverAuthOrders() {
        return this.serverAuthOrders;
    }
    /**
     * Configure the TACACS serverGroup
     * 
     */
    @Export(name="tacacsGroups", refs={List.class,SystemAaaFeatureTacacsGroup.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SystemAaaFeatureTacacsGroup>> tacacsGroups;

    /**
     * @return Configure the TACACS serverGroup
     * 
     */
    public Output<Optional<List<SystemAaaFeatureTacacsGroup>>> tacacsGroups() {
        return Codegen.optional(this.tacacsGroups);
    }
    /**
     * Create local login account
     * 
     */
    @Export(name="users", refs={List.class,SystemAaaFeatureUser.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SystemAaaFeatureUser>> users;

    /**
     * @return Create local login account
     * 
     */
    public Output<Optional<List<SystemAaaFeatureUser>>> users() {
        return Codegen.optional(this.users);
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
    public SystemAaaFeature(java.lang.String name) {
        this(name, SystemAaaFeatureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SystemAaaFeature(java.lang.String name, SystemAaaFeatureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SystemAaaFeature(java.lang.String name, SystemAaaFeatureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sdwan:index/systemAaaFeature:SystemAaaFeature", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SystemAaaFeature(java.lang.String name, Output<java.lang.String> id, @Nullable SystemAaaFeatureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sdwan:index/systemAaaFeature:SystemAaaFeature", name, state, makeResourceOptions(options, id), false);
    }

    private static SystemAaaFeatureArgs makeArgs(SystemAaaFeatureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SystemAaaFeatureArgs.Empty : args;
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
    public static SystemAaaFeature get(java.lang.String name, Output<java.lang.String> id, @Nullable SystemAaaFeatureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SystemAaaFeature(name, id, state, options);
    }
}
