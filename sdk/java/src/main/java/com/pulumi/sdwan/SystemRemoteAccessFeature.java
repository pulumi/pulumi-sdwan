// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sdwan.SystemRemoteAccessFeatureArgs;
import com.pulumi.sdwan.Utilities;
import com.pulumi.sdwan.inputs.SystemRemoteAccessFeatureState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource can manage a System Remote Access Feature.
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
 * import com.pulumi.sdwan.SystemRemoteAccessFeature;
 * import com.pulumi.sdwan.SystemRemoteAccessFeatureArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var example = new SystemRemoteAccessFeature("example", SystemRemoteAccessFeatureArgs.builder()
 *             .name("Example")
 *             .description("My Example")
 *             .featureProfileId("f6dd22c8-0b4f-496c-9a0b-6813d1f8b8ac")
 *             .connectionTypeSsl(false)
 *             .anyConnectEapAuthenticationType("user")
 *             .ipv4PoolSize(50)
 *             .ipv6PoolSize(1024)
 *             .enableCertificateListCheck(false)
 *             .pskAuthenticationType("aaa")
 *             .radiusGroupName("radius-1")
 *             .aaaDeriveNameFromPeerIdentity("MyPassword")
 *             .aaaEnableAccounting(false)
 *             .ikev2LocalIkeIdentityType("EMAIL")
 *             .ikev2LocalIkeIdentityValue("abc}{@literal @}{@code xyz.com")
 *             .ikev2SecurityAssociationLifetime(86400)
 *             .ikev2AntiDosThreshold(99)
 *             .ipsecEnableAntiReplay(false)
 *             .ipsecSecurityAssociationLifetime(3600)
 *             .ipsecEnablePerfectFowardSecrecy(false)
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import sdwan:index/systemRemoteAccessFeature:SystemRemoteAccessFeature example &#34;f6b2c44c-693c-4763-b010-895aa3d236bd&#34;
 * ```
 * 
 */
@ResourceType(type="sdwan:index/systemRemoteAccessFeature:SystemRemoteAccessFeature")
public class SystemRemoteAccessFeature extends com.pulumi.resources.CustomResource {
    /**
     * , Attribute conditional on `connection_type_ssl` being equal to `false`
     * 
     */
    @Export(name="aaaDeriveNameFromPeerDomain", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> aaaDeriveNameFromPeerDomain;

    /**
     * @return , Attribute conditional on `connection_type_ssl` being equal to `false`
     * 
     */
    public Output<Optional<String>> aaaDeriveNameFromPeerDomain() {
        return Codegen.optional(this.aaaDeriveNameFromPeerDomain);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="aaaDeriveNameFromPeerDomainVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> aaaDeriveNameFromPeerDomainVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> aaaDeriveNameFromPeerDomainVariable() {
        return Codegen.optional(this.aaaDeriveNameFromPeerDomainVariable);
    }
    /**
     * , Attribute conditional on `connection_type_ssl` being equal to `false`
     * 
     */
    @Export(name="aaaDeriveNameFromPeerIdentity", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> aaaDeriveNameFromPeerIdentity;

    /**
     * @return , Attribute conditional on `connection_type_ssl` being equal to `false`
     * 
     */
    public Output<Optional<String>> aaaDeriveNameFromPeerIdentity() {
        return Codegen.optional(this.aaaDeriveNameFromPeerIdentity);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="aaaDeriveNameFromPeerIdentityVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> aaaDeriveNameFromPeerIdentityVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> aaaDeriveNameFromPeerIdentityVariable() {
        return Codegen.optional(this.aaaDeriveNameFromPeerIdentityVariable);
    }
    /**
     * Enable Accounting - Default value: `true`
     * 
     */
    @Export(name="aaaEnableAccounting", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> aaaEnableAccounting;

    /**
     * @return Enable Accounting - Default value: `true`
     * 
     */
    public Output<Optional<Boolean>> aaaEnableAccounting() {
        return Codegen.optional(this.aaaEnableAccounting);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="aaaEnableAccountingVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> aaaEnableAccountingVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> aaaEnableAccountingVariable() {
        return Codegen.optional(this.aaaEnableAccountingVariable);
    }
    @Export(name="aaaSpecifyNamePolicyName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> aaaSpecifyNamePolicyName;

    public Output<Optional<String>> aaaSpecifyNamePolicyName() {
        return Codegen.optional(this.aaaSpecifyNamePolicyName);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="aaaSpecifyNamePolicyNameVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> aaaSpecifyNamePolicyNameVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> aaaSpecifyNamePolicyNameVariable() {
        return Codegen.optional(this.aaaSpecifyNamePolicyNameVariable);
    }
    @Export(name="aaaSpecifyNamePolicyPassword", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> aaaSpecifyNamePolicyPassword;

    public Output<Optional<String>> aaaSpecifyNamePolicyPassword() {
        return Codegen.optional(this.aaaSpecifyNamePolicyPassword);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="aaaSpecifyNamePolicyPasswordVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> aaaSpecifyNamePolicyPasswordVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> aaaSpecifyNamePolicyPasswordVariable() {
        return Codegen.optional(this.aaaSpecifyNamePolicyPasswordVariable);
    }
    /**
     * , Attribute conditional on `connection_type_ssl` being equal to `false` - Choices: `user`, `device`
     * 
     */
    @Export(name="anyConnectEapAuthenticationType", refs={String.class}, tree="[0]")
    private Output<String> anyConnectEapAuthenticationType;

    /**
     * @return , Attribute conditional on `connection_type_ssl` being equal to `false` - Choices: `user`, `device`
     * 
     */
    public Output<String> anyConnectEapAuthenticationType() {
        return this.anyConnectEapAuthenticationType;
    }
    /**
     * Enabled SSL VPN - Default value: `false`
     * 
     */
    @Export(name="connectionTypeSsl", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> connectionTypeSsl;

    /**
     * @return Enabled SSL VPN - Default value: `false`
     * 
     */
    public Output<Optional<Boolean>> connectionTypeSsl() {
        return Codegen.optional(this.connectionTypeSsl);
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
     * - Default value: `false`
     * 
     */
    @Export(name="enableCertificateListCheck", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableCertificateListCheck;

    /**
     * @return - Default value: `false`
     * 
     */
    public Output<Optional<Boolean>> enableCertificateListCheck() {
        return Codegen.optional(this.enableCertificateListCheck);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="enableCertificateListCheckVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> enableCertificateListCheckVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> enableCertificateListCheckVariable() {
        return Codegen.optional(this.enableCertificateListCheckVariable);
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
     * Anti-DOS Threshold, Attribute conditional on `connection_type_ssl` being equal to `false` - Range: `10`-`1000` - Default
     * value: `100`
     * 
     */
    @Export(name="ikev2AntiDosThreshold", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> ikev2AntiDosThreshold;

    /**
     * @return Anti-DOS Threshold, Attribute conditional on `connection_type_ssl` being equal to `false` - Range: `10`-`1000` - Default
     * value: `100`
     * 
     */
    public Output<Optional<Integer>> ikev2AntiDosThreshold() {
        return Codegen.optional(this.ikev2AntiDosThreshold);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="ikev2AntiDosThresholdVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ikev2AntiDosThresholdVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> ikev2AntiDosThresholdVariable() {
        return Codegen.optional(this.ikev2AntiDosThresholdVariable);
    }
    /**
     * , Attribute conditional on `connection_type_ssl` being equal to `false` - Choices: `EMAIL`, `FQDN`, `KEYID`, `IPv4
     * ADDRESS`, `IPv6 ADDRESS`
     * 
     */
    @Export(name="ikev2LocalIkeIdentityType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ikev2LocalIkeIdentityType;

    /**
     * @return , Attribute conditional on `connection_type_ssl` being equal to `false` - Choices: `EMAIL`, `FQDN`, `KEYID`, `IPv4
     * ADDRESS`, `IPv6 ADDRESS`
     * 
     */
    public Output<Optional<String>> ikev2LocalIkeIdentityType() {
        return Codegen.optional(this.ikev2LocalIkeIdentityType);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="ikev2LocalIkeIdentityTypeVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ikev2LocalIkeIdentityTypeVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> ikev2LocalIkeIdentityTypeVariable() {
        return Codegen.optional(this.ikev2LocalIkeIdentityTypeVariable);
    }
    /**
     * , Attribute conditional on `connection_type_ssl` being equal to `false`
     * 
     */
    @Export(name="ikev2LocalIkeIdentityValue", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ikev2LocalIkeIdentityValue;

    /**
     * @return , Attribute conditional on `connection_type_ssl` being equal to `false`
     * 
     */
    public Output<Optional<String>> ikev2LocalIkeIdentityValue() {
        return Codegen.optional(this.ikev2LocalIkeIdentityValue);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="ikev2LocalIkeIdentityValueVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ikev2LocalIkeIdentityValueVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> ikev2LocalIkeIdentityValueVariable() {
        return Codegen.optional(this.ikev2LocalIkeIdentityValueVariable);
    }
    /**
     * Security Association Lifetime in Seconds, Attribute conditional on `connection_type_ssl` being equal to `false` - Range:
     * `3600`-`86400` - Default value: `86400`
     * 
     */
    @Export(name="ikev2SecurityAssociationLifetime", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> ikev2SecurityAssociationLifetime;

    /**
     * @return Security Association Lifetime in Seconds, Attribute conditional on `connection_type_ssl` being equal to `false` - Range:
     * `3600`-`86400` - Default value: `86400`
     * 
     */
    public Output<Optional<Integer>> ikev2SecurityAssociationLifetime() {
        return Codegen.optional(this.ikev2SecurityAssociationLifetime);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="ikev2SecurityAssociationLifetimeVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ikev2SecurityAssociationLifetimeVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> ikev2SecurityAssociationLifetimeVariable() {
        return Codegen.optional(this.ikev2SecurityAssociationLifetimeVariable);
    }
    /**
     * security Association Lifetime, Attribute conditional on `ipsec_enable_anti_replay` being equal to `true` - Default
     * value: `64`
     * 
     */
    @Export(name="ipsecAntiReplayWindowSize", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> ipsecAntiReplayWindowSize;

    /**
     * @return security Association Lifetime, Attribute conditional on `ipsec_enable_anti_replay` being equal to `true` - Default
     * value: `64`
     * 
     */
    public Output<Optional<Integer>> ipsecAntiReplayWindowSize() {
        return Codegen.optional(this.ipsecAntiReplayWindowSize);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="ipsecAntiReplayWindowSizeVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipsecAntiReplayWindowSizeVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> ipsecAntiReplayWindowSizeVariable() {
        return Codegen.optional(this.ipsecAntiReplayWindowSizeVariable);
    }
    /**
     * Enable Anti-Replay, Attribute conditional on `connection_type_ssl` being equal to `false` - Default value: `true`
     * 
     */
    @Export(name="ipsecEnableAntiReplay", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ipsecEnableAntiReplay;

    /**
     * @return Enable Anti-Replay, Attribute conditional on `connection_type_ssl` being equal to `false` - Default value: `true`
     * 
     */
    public Output<Optional<Boolean>> ipsecEnableAntiReplay() {
        return Codegen.optional(this.ipsecEnableAntiReplay);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="ipsecEnableAntiReplayVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipsecEnableAntiReplayVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> ipsecEnableAntiReplayVariable() {
        return Codegen.optional(this.ipsecEnableAntiReplayVariable);
    }
    /**
     * security Association Lifetime, Attribute conditional on `connection_type_ssl` being equal to `false` - Default value:
     * `false`
     * 
     */
    @Export(name="ipsecEnablePerfectFowardSecrecy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ipsecEnablePerfectFowardSecrecy;

    /**
     * @return security Association Lifetime, Attribute conditional on `connection_type_ssl` being equal to `false` - Default value:
     * `false`
     * 
     */
    public Output<Optional<Boolean>> ipsecEnablePerfectFowardSecrecy() {
        return Codegen.optional(this.ipsecEnablePerfectFowardSecrecy);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="ipsecEnablePerfectFowardSecrecyVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipsecEnablePerfectFowardSecrecyVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> ipsecEnablePerfectFowardSecrecyVariable() {
        return Codegen.optional(this.ipsecEnablePerfectFowardSecrecyVariable);
    }
    /**
     * Security Association Lifetime in Seconds, Attribute conditional on `connection_type_ssl` being equal to `false` - Range:
     * `3600`-`86400` - Default value: `3600`
     * 
     */
    @Export(name="ipsecSecurityAssociationLifetime", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> ipsecSecurityAssociationLifetime;

    /**
     * @return Security Association Lifetime in Seconds, Attribute conditional on `connection_type_ssl` being equal to `false` - Range:
     * `3600`-`86400` - Default value: `3600`
     * 
     */
    public Output<Optional<Integer>> ipsecSecurityAssociationLifetime() {
        return Codegen.optional(this.ipsecSecurityAssociationLifetime);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="ipsecSecurityAssociationLifetimeVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipsecSecurityAssociationLifetimeVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> ipsecSecurityAssociationLifetimeVariable() {
        return Codegen.optional(this.ipsecSecurityAssociationLifetimeVariable);
    }
    /**
     * IPv4 Pool Size - Default value: `1000`
     * 
     */
    @Export(name="ipv4PoolSize", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> ipv4PoolSize;

    /**
     * @return IPv4 Pool Size - Default value: `1000`
     * 
     */
    public Output<Optional<Integer>> ipv4PoolSize() {
        return Codegen.optional(this.ipv4PoolSize);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="ipv4PoolSizeVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipv4PoolSizeVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> ipv4PoolSizeVariable() {
        return Codegen.optional(this.ipv4PoolSizeVariable);
    }
    /**
     * IPv6 Pool Size - Default value: `1024`
     * 
     */
    @Export(name="ipv6PoolSize", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> ipv6PoolSize;

    /**
     * @return IPv6 Pool Size - Default value: `1024`
     * 
     */
    public Output<Optional<Integer>> ipv6PoolSize() {
        return Codegen.optional(this.ipv6PoolSize);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="ipv6PoolSizeVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipv6PoolSizeVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> ipv6PoolSizeVariable() {
        return Codegen.optional(this.ipv6PoolSizeVariable);
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
     * PSK Pre Shared Key, Attribute conditional on `psk_authentication_type` being equal to `group`
     * 
     */
    @Export(name="pskAuthenticationPreSharedKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pskAuthenticationPreSharedKey;

    /**
     * @return PSK Pre Shared Key, Attribute conditional on `psk_authentication_type` being equal to `group`
     * 
     */
    public Output<Optional<String>> pskAuthenticationPreSharedKey() {
        return Codegen.optional(this.pskAuthenticationPreSharedKey);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="pskAuthenticationPreSharedKeyVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pskAuthenticationPreSharedKeyVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> pskAuthenticationPreSharedKeyVariable() {
        return Codegen.optional(this.pskAuthenticationPreSharedKeyVariable);
    }
    /**
     * PSK Selection, Attribute conditional on `connection_type_ssl` being equal to `false` - Choices: `aaa`, `group`
     * 
     */
    @Export(name="pskAuthenticationType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pskAuthenticationType;

    /**
     * @return PSK Selection, Attribute conditional on `connection_type_ssl` being equal to `false` - Choices: `aaa`, `group`
     * 
     */
    public Output<Optional<String>> pskAuthenticationType() {
        return Codegen.optional(this.pskAuthenticationType);
    }
    /**
     * Variable name
     * 
     */
    @Export(name="pskAuthenticationTypeVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pskAuthenticationTypeVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> pskAuthenticationTypeVariable() {
        return Codegen.optional(this.pskAuthenticationTypeVariable);
    }
    @Export(name="radiusGroupName", refs={String.class}, tree="[0]")
    private Output<String> radiusGroupName;

    public Output<String> radiusGroupName() {
        return this.radiusGroupName;
    }
    /**
     * Variable name
     * 
     */
    @Export(name="radiusGroupNameVariable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> radiusGroupNameVariable;

    /**
     * @return Variable name
     * 
     */
    public Output<Optional<String>> radiusGroupNameVariable() {
        return Codegen.optional(this.radiusGroupNameVariable);
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
    public SystemRemoteAccessFeature(java.lang.String name) {
        this(name, SystemRemoteAccessFeatureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SystemRemoteAccessFeature(java.lang.String name, SystemRemoteAccessFeatureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SystemRemoteAccessFeature(java.lang.String name, SystemRemoteAccessFeatureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sdwan:index/systemRemoteAccessFeature:SystemRemoteAccessFeature", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SystemRemoteAccessFeature(java.lang.String name, Output<java.lang.String> id, @Nullable SystemRemoteAccessFeatureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sdwan:index/systemRemoteAccessFeature:SystemRemoteAccessFeature", name, state, makeResourceOptions(options, id), false);
    }

    private static SystemRemoteAccessFeatureArgs makeArgs(SystemRemoteAccessFeatureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SystemRemoteAccessFeatureArgs.Empty : args;
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
    public static SystemRemoteAccessFeature get(java.lang.String name, Output<java.lang.String> id, @Nullable SystemRemoteAccessFeatureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SystemRemoteAccessFeature(name, id, state, options);
    }
}