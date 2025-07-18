// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sdwan.TlsSslDecryptionPolicyDefinitionArgs;
import com.pulumi.sdwan.Utilities;
import com.pulumi.sdwan.inputs.TlsSslDecryptionPolicyDefinitionState;
import com.pulumi.sdwan.outputs.TlsSslDecryptionPolicyDefinitionNetworkRule;
import com.pulumi.sdwan.outputs.TlsSslDecryptionPolicyDefinitionUrlRule;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource can manage a TLS SSL Decryption Policy Definition .
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
 * $ pulumi import sdwan:index/tlsSslDecryptionPolicyDefinition:TlsSslDecryptionPolicyDefinition example &#34;f6b2c44c-693c-4763-b010-895aa3d236bd&#34;
 * ```
 * 
 */
@ResourceType(type="sdwan:index/tlsSslDecryptionPolicyDefinition:TlsSslDecryptionPolicyDefinition")
public class TlsSslDecryptionPolicyDefinition extends com.pulumi.resources.CustomResource {
    /**
     * Certificate Lifetime(in Days)
     * 
     */
    @Export(name="certificateLifetimeInDays", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> certificateLifetimeInDays;

    /**
     * @return Certificate Lifetime(in Days)
     * 
     */
    public Output<Optional<Integer>> certificateLifetimeInDays() {
        return Codegen.optional(this.certificateLifetimeInDays);
    }
    /**
     * Certificate revocation status - Choices: `ocsp`, `none`
     * 
     */
    @Export(name="certificateRevocationStatus", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certificateRevocationStatus;

    /**
     * @return Certificate revocation status - Choices: `ocsp`, `none`
     * 
     */
    public Output<Optional<String>> certificateRevocationStatus() {
        return Codegen.optional(this.certificateRevocationStatus);
    }
    /**
     * Default action (applies when `mode` set to `security`) - Choices: `noIntent`, `doNotDecrypt`, `decrypt`
     * 
     */
    @Export(name="defaultAction", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> defaultAction;

    /**
     * @return Default action (applies when `mode` set to `security`) - Choices: `noIntent`, `doNotDecrypt`, `decrypt`
     * 
     */
    public Output<Optional<String>> defaultAction() {
        return Codegen.optional(this.defaultAction);
    }
    /**
     * The description of the policy definition.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return The description of the policy definition.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * EC Key Type - Choices: `P256`, `P384`, `P521`
     * 
     */
    @Export(name="ecKeyType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ecKeyType;

    /**
     * @return EC Key Type - Choices: `P256`, `P384`, `P521`
     * 
     */
    public Output<Optional<String>> ecKeyType() {
        return Codegen.optional(this.ecKeyType);
    }
    /**
     * Expired certificate action - Choices: `drop`, `decrypt`
     * 
     */
    @Export(name="expiredCertificate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> expiredCertificate;

    /**
     * @return Expired certificate action - Choices: `drop`, `decrypt`
     * 
     */
    public Output<Optional<String>> expiredCertificate() {
        return Codegen.optional(this.expiredCertificate);
    }
    /**
     * Failure mode - Choices: `open`, `close`
     * 
     */
    @Export(name="failureMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> failureMode;

    /**
     * @return Failure mode - Choices: `open`, `close`
     * 
     */
    public Output<Optional<String>> failureMode() {
        return Codegen.optional(this.failureMode);
    }
    /**
     * Minimal TLS Version - Choices: `TLSv1.0`, `TLSv1.1`, `TLSv1.2`
     * 
     */
    @Export(name="minimalTlsVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> minimalTlsVersion;

    /**
     * @return Minimal TLS Version - Choices: `TLSv1.0`, `TLSv1.1`, `TLSv1.2`
     * 
     */
    public Output<Optional<String>> minimalTlsVersion() {
        return Codegen.optional(this.minimalTlsVersion);
    }
    /**
     * The policy mode - Choices: `security`, `unified`
     * 
     */
    @Export(name="mode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> mode;

    /**
     * @return The policy mode - Choices: `security`, `unified`
     * 
     */
    public Output<Optional<String>> mode() {
        return Codegen.optional(this.mode);
    }
    /**
     * The name of the policy definition.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the policy definition.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of network rules (applies when `mode` set to `security`)
     * 
     */
    @Export(name="networkRules", refs={List.class,TlsSslDecryptionPolicyDefinitionNetworkRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TlsSslDecryptionPolicyDefinitionNetworkRule>> networkRules;

    /**
     * @return List of network rules (applies when `mode` set to `security`)
     * 
     */
    public Output<Optional<List<TlsSslDecryptionPolicyDefinitionNetworkRule>>> networkRules() {
        return Codegen.optional(this.networkRules);
    }
    /**
     * RSA key pair modules - Choices: `1024`, `2048`, `4096`
     * 
     */
    @Export(name="rsaKeyPairModulus", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> rsaKeyPairModulus;

    /**
     * @return RSA key pair modules - Choices: `1024`, `2048`, `4096`
     * 
     */
    public Output<Optional<String>> rsaKeyPairModulus() {
        return Codegen.optional(this.rsaKeyPairModulus);
    }
    /**
     * SSL decryption enabled
     * 
     */
    @Export(name="sslDecryptionEnabled", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sslDecryptionEnabled;

    /**
     * @return SSL decryption enabled
     * 
     */
    public Output<Optional<String>> sslDecryptionEnabled() {
        return Codegen.optional(this.sslDecryptionEnabled);
    }
    /**
     * Unknown revocation status action - Choices: `drop`, `decrypt`
     * 
     */
    @Export(name="unknownRevocationStatus", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> unknownRevocationStatus;

    /**
     * @return Unknown revocation status action - Choices: `drop`, `decrypt`
     * 
     */
    public Output<Optional<String>> unknownRevocationStatus() {
        return Codegen.optional(this.unknownRevocationStatus);
    }
    /**
     * Unsupported cipher suites action - Choices: `drop`, `no-decrypt`
     * 
     */
    @Export(name="unsupportedCipherSuites", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> unsupportedCipherSuites;

    /**
     * @return Unsupported cipher suites action - Choices: `drop`, `no-decrypt`
     * 
     */
    public Output<Optional<String>> unsupportedCipherSuites() {
        return Codegen.optional(this.unsupportedCipherSuites);
    }
    /**
     * Unsupported protocol versions action - Choices: `drop`, `no-decrypt`
     * 
     */
    @Export(name="unsupportedProtocolVersions", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> unsupportedProtocolVersions;

    /**
     * @return Unsupported protocol versions action - Choices: `drop`, `no-decrypt`
     * 
     */
    public Output<Optional<String>> unsupportedProtocolVersions() {
        return Codegen.optional(this.unsupportedProtocolVersions);
    }
    /**
     * Untrusted certificate action - Choices: `drop`, `decrypt`
     * 
     */
    @Export(name="untrustedCertificate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> untrustedCertificate;

    /**
     * @return Untrusted certificate action - Choices: `drop`, `decrypt`
     * 
     */
    public Output<Optional<String>> untrustedCertificate() {
        return Codegen.optional(this.untrustedCertificate);
    }
    /**
     * List of url rules (applies when `mode` set to `security`)
     * 
     */
    @Export(name="urlRules", refs={List.class,TlsSslDecryptionPolicyDefinitionUrlRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TlsSslDecryptionPolicyDefinitionUrlRule>> urlRules;

    /**
     * @return List of url rules (applies when `mode` set to `security`)
     * 
     */
    public Output<Optional<List<TlsSslDecryptionPolicyDefinitionUrlRule>>> urlRules() {
        return Codegen.optional(this.urlRules);
    }
    /**
     * Use default CA certificate bundle
     * 
     */
    @Export(name="useDefaultCaCertBundle", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> useDefaultCaCertBundle;

    /**
     * @return Use default CA certificate bundle
     * 
     */
    public Output<Optional<Boolean>> useDefaultCaCertBundle() {
        return Codegen.optional(this.useDefaultCaCertBundle);
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
    public TlsSslDecryptionPolicyDefinition(java.lang.String name) {
        this(name, TlsSslDecryptionPolicyDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TlsSslDecryptionPolicyDefinition(java.lang.String name, TlsSslDecryptionPolicyDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TlsSslDecryptionPolicyDefinition(java.lang.String name, TlsSslDecryptionPolicyDefinitionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sdwan:index/tlsSslDecryptionPolicyDefinition:TlsSslDecryptionPolicyDefinition", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private TlsSslDecryptionPolicyDefinition(java.lang.String name, Output<java.lang.String> id, @Nullable TlsSslDecryptionPolicyDefinitionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sdwan:index/tlsSslDecryptionPolicyDefinition:TlsSslDecryptionPolicyDefinition", name, state, makeResourceOptions(options, id), false);
    }

    private static TlsSslDecryptionPolicyDefinitionArgs makeArgs(TlsSslDecryptionPolicyDefinitionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TlsSslDecryptionPolicyDefinitionArgs.Empty : args;
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
    public static TlsSslDecryptionPolicyDefinition get(java.lang.String name, Output<java.lang.String> id, @Nullable TlsSslDecryptionPolicyDefinitionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TlsSslDecryptionPolicyDefinition(name, id, state, options);
    }
}
