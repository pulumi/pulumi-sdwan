// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sdwan.inputs.EigrpFeatureTemplateAddressFamilyArgs;
import com.pulumi.sdwan.inputs.EigrpFeatureTemplateInterfaceArgs;
import com.pulumi.sdwan.inputs.EigrpFeatureTemplateKeyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EigrpFeatureTemplateState extends com.pulumi.resources.ResourceArgs {

    public static final EigrpFeatureTemplateState Empty = new EigrpFeatureTemplateState();

    /**
     * Set EIGRP address family
     * 
     */
    @Import(name="addressFamilies")
    private @Nullable Output<List<EigrpFeatureTemplateAddressFamilyArgs>> addressFamilies;

    /**
     * @return Set EIGRP address family
     * 
     */
    public Optional<Output<List<EigrpFeatureTemplateAddressFamilyArgs>>> addressFamilies() {
        return Optional.ofNullable(this.addressFamilies);
    }

    /**
     * Set autonomous system ID &lt;1..65535&gt; - Range: `1`-`65535`
     * 
     */
    @Import(name="asNumber")
    private @Nullable Output<Integer> asNumber;

    /**
     * @return Set autonomous system ID &lt;1..65535&gt; - Range: `1`-`65535`
     * 
     */
    public Optional<Output<Integer>> asNumber() {
        return Optional.ofNullable(this.asNumber);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="asNumberVariable")
    private @Nullable Output<String> asNumberVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> asNumberVariable() {
        return Optional.ofNullable(this.asNumberVariable);
    }

    /**
     * Set EIGRP router authentication type - Choices: `md5`, `hmac-sha-256`
     * 
     */
    @Import(name="authenticationType")
    private @Nullable Output<String> authenticationType;

    /**
     * @return Set EIGRP router authentication type - Choices: `md5`, `hmac-sha-256`
     * 
     */
    public Optional<Output<String>> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="authenticationTypeVariable")
    private @Nullable Output<String> authenticationTypeVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> authenticationTypeVariable() {
        return Optional.ofNullable(this.authenticationTypeVariable);
    }

    /**
     * The description of the feature template
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the feature template
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
     * `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
     * `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
     * 
     */
    @Import(name="deviceTypes")
    private @Nullable Output<List<String>> deviceTypes;

    /**
     * @return List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
     * `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
     * `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
     * 
     */
    public Optional<Output<List<String>>> deviceTypes() {
        return Optional.ofNullable(this.deviceTypes);
    }

    /**
     * Selective route download - Default value: `false`
     * 
     */
    @Import(name="filter")
    private @Nullable Output<Boolean> filter;

    /**
     * @return Selective route download - Default value: `false`
     * 
     */
    public Optional<Output<Boolean>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="filterVariable")
    private @Nullable Output<String> filterVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> filterVariable() {
        return Optional.ofNullable(this.filterVariable);
    }

    /**
     * Set EIGRP hello interval - Range: `0`-`65535` - Default value: `5`
     * 
     */
    @Import(name="helloInterval")
    private @Nullable Output<Integer> helloInterval;

    /**
     * @return Set EIGRP hello interval - Range: `0`-`65535` - Default value: `5`
     * 
     */
    public Optional<Output<Integer>> helloInterval() {
        return Optional.ofNullable(this.helloInterval);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="helloIntervalVariable")
    private @Nullable Output<String> helloIntervalVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> helloIntervalVariable() {
        return Optional.ofNullable(this.helloIntervalVariable);
    }

    /**
     * Set hmac-sha-256 authentication key
     * 
     */
    @Import(name="hmacAuthenticationKey")
    private @Nullable Output<String> hmacAuthenticationKey;

    /**
     * @return Set hmac-sha-256 authentication key
     * 
     */
    public Optional<Output<String>> hmacAuthenticationKey() {
        return Optional.ofNullable(this.hmacAuthenticationKey);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="hmacAuthenticationKeyVariable")
    private @Nullable Output<String> hmacAuthenticationKeyVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> hmacAuthenticationKeyVariable() {
        return Optional.ofNullable(this.hmacAuthenticationKeyVariable);
    }

    /**
     * Set EIGRP hold time - Range: `0`-`65535` - Default value: `15`
     * 
     */
    @Import(name="holdTime")
    private @Nullable Output<Integer> holdTime;

    /**
     * @return Set EIGRP hold time - Range: `0`-`65535` - Default value: `15`
     * 
     */
    public Optional<Output<Integer>> holdTime() {
        return Optional.ofNullable(this.holdTime);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="holdTimeVariable")
    private @Nullable Output<String> holdTimeVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> holdTimeVariable() {
        return Optional.ofNullable(this.holdTimeVariable);
    }

    /**
     * Configure IPv4 Static Routes
     * 
     */
    @Import(name="interfaces")
    private @Nullable Output<List<EigrpFeatureTemplateInterfaceArgs>> interfaces;

    /**
     * @return Configure IPv4 Static Routes
     * 
     */
    public Optional<Output<List<EigrpFeatureTemplateInterfaceArgs>>> interfaces() {
        return Optional.ofNullable(this.interfaces);
    }

    /**
     * Set keychain name
     * 
     */
    @Import(name="keys")
    private @Nullable Output<List<EigrpFeatureTemplateKeyArgs>> keys;

    /**
     * @return Set keychain name
     * 
     */
    public Optional<Output<List<EigrpFeatureTemplateKeyArgs>>> keys() {
        return Optional.ofNullable(this.keys);
    }

    /**
     * The name of the feature template
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the feature template
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Configure policy to apply to prefixes received from EIGRP neighbor
     * 
     */
    @Import(name="routePolicyName")
    private @Nullable Output<String> routePolicyName;

    /**
     * @return Configure policy to apply to prefixes received from EIGRP neighbor
     * 
     */
    public Optional<Output<String>> routePolicyName() {
        return Optional.ofNullable(this.routePolicyName);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="routePolicyNameVariable")
    private @Nullable Output<String> routePolicyNameVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> routePolicyNameVariable() {
        return Optional.ofNullable(this.routePolicyNameVariable);
    }

    /**
     * The template type
     * 
     */
    @Import(name="templateType")
    private @Nullable Output<String> templateType;

    /**
     * @return The template type
     * 
     */
    public Optional<Output<String>> templateType() {
        return Optional.ofNullable(this.templateType);
    }

    /**
     * The version of the feature template
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return The version of the feature template
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private EigrpFeatureTemplateState() {}

    private EigrpFeatureTemplateState(EigrpFeatureTemplateState $) {
        this.addressFamilies = $.addressFamilies;
        this.asNumber = $.asNumber;
        this.asNumberVariable = $.asNumberVariable;
        this.authenticationType = $.authenticationType;
        this.authenticationTypeVariable = $.authenticationTypeVariable;
        this.description = $.description;
        this.deviceTypes = $.deviceTypes;
        this.filter = $.filter;
        this.filterVariable = $.filterVariable;
        this.helloInterval = $.helloInterval;
        this.helloIntervalVariable = $.helloIntervalVariable;
        this.hmacAuthenticationKey = $.hmacAuthenticationKey;
        this.hmacAuthenticationKeyVariable = $.hmacAuthenticationKeyVariable;
        this.holdTime = $.holdTime;
        this.holdTimeVariable = $.holdTimeVariable;
        this.interfaces = $.interfaces;
        this.keys = $.keys;
        this.name = $.name;
        this.routePolicyName = $.routePolicyName;
        this.routePolicyNameVariable = $.routePolicyNameVariable;
        this.templateType = $.templateType;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EigrpFeatureTemplateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EigrpFeatureTemplateState $;

        public Builder() {
            $ = new EigrpFeatureTemplateState();
        }

        public Builder(EigrpFeatureTemplateState defaults) {
            $ = new EigrpFeatureTemplateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressFamilies Set EIGRP address family
         * 
         * @return builder
         * 
         */
        public Builder addressFamilies(@Nullable Output<List<EigrpFeatureTemplateAddressFamilyArgs>> addressFamilies) {
            $.addressFamilies = addressFamilies;
            return this;
        }

        /**
         * @param addressFamilies Set EIGRP address family
         * 
         * @return builder
         * 
         */
        public Builder addressFamilies(List<EigrpFeatureTemplateAddressFamilyArgs> addressFamilies) {
            return addressFamilies(Output.of(addressFamilies));
        }

        /**
         * @param addressFamilies Set EIGRP address family
         * 
         * @return builder
         * 
         */
        public Builder addressFamilies(EigrpFeatureTemplateAddressFamilyArgs... addressFamilies) {
            return addressFamilies(List.of(addressFamilies));
        }

        /**
         * @param asNumber Set autonomous system ID &lt;1..65535&gt; - Range: `1`-`65535`
         * 
         * @return builder
         * 
         */
        public Builder asNumber(@Nullable Output<Integer> asNumber) {
            $.asNumber = asNumber;
            return this;
        }

        /**
         * @param asNumber Set autonomous system ID &lt;1..65535&gt; - Range: `1`-`65535`
         * 
         * @return builder
         * 
         */
        public Builder asNumber(Integer asNumber) {
            return asNumber(Output.of(asNumber));
        }

        /**
         * @param asNumberVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder asNumberVariable(@Nullable Output<String> asNumberVariable) {
            $.asNumberVariable = asNumberVariable;
            return this;
        }

        /**
         * @param asNumberVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder asNumberVariable(String asNumberVariable) {
            return asNumberVariable(Output.of(asNumberVariable));
        }

        /**
         * @param authenticationType Set EIGRP router authentication type - Choices: `md5`, `hmac-sha-256`
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(@Nullable Output<String> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        /**
         * @param authenticationType Set EIGRP router authentication type - Choices: `md5`, `hmac-sha-256`
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(String authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        /**
         * @param authenticationTypeVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder authenticationTypeVariable(@Nullable Output<String> authenticationTypeVariable) {
            $.authenticationTypeVariable = authenticationTypeVariable;
            return this;
        }

        /**
         * @param authenticationTypeVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder authenticationTypeVariable(String authenticationTypeVariable) {
            return authenticationTypeVariable(Output.of(authenticationTypeVariable));
        }

        /**
         * @param description The description of the feature template
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the feature template
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param deviceTypes List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
         * `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
         * `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
         * 
         * @return builder
         * 
         */
        public Builder deviceTypes(@Nullable Output<List<String>> deviceTypes) {
            $.deviceTypes = deviceTypes;
            return this;
        }

        /**
         * @param deviceTypes List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
         * `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
         * `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
         * 
         * @return builder
         * 
         */
        public Builder deviceTypes(List<String> deviceTypes) {
            return deviceTypes(Output.of(deviceTypes));
        }

        /**
         * @param deviceTypes List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
         * `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
         * `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
         * 
         * @return builder
         * 
         */
        public Builder deviceTypes(String... deviceTypes) {
            return deviceTypes(List.of(deviceTypes));
        }

        /**
         * @param filter Selective route download - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<Boolean> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter Selective route download - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder filter(Boolean filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param filterVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder filterVariable(@Nullable Output<String> filterVariable) {
            $.filterVariable = filterVariable;
            return this;
        }

        /**
         * @param filterVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder filterVariable(String filterVariable) {
            return filterVariable(Output.of(filterVariable));
        }

        /**
         * @param helloInterval Set EIGRP hello interval - Range: `0`-`65535` - Default value: `5`
         * 
         * @return builder
         * 
         */
        public Builder helloInterval(@Nullable Output<Integer> helloInterval) {
            $.helloInterval = helloInterval;
            return this;
        }

        /**
         * @param helloInterval Set EIGRP hello interval - Range: `0`-`65535` - Default value: `5`
         * 
         * @return builder
         * 
         */
        public Builder helloInterval(Integer helloInterval) {
            return helloInterval(Output.of(helloInterval));
        }

        /**
         * @param helloIntervalVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder helloIntervalVariable(@Nullable Output<String> helloIntervalVariable) {
            $.helloIntervalVariable = helloIntervalVariable;
            return this;
        }

        /**
         * @param helloIntervalVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder helloIntervalVariable(String helloIntervalVariable) {
            return helloIntervalVariable(Output.of(helloIntervalVariable));
        }

        /**
         * @param hmacAuthenticationKey Set hmac-sha-256 authentication key
         * 
         * @return builder
         * 
         */
        public Builder hmacAuthenticationKey(@Nullable Output<String> hmacAuthenticationKey) {
            $.hmacAuthenticationKey = hmacAuthenticationKey;
            return this;
        }

        /**
         * @param hmacAuthenticationKey Set hmac-sha-256 authentication key
         * 
         * @return builder
         * 
         */
        public Builder hmacAuthenticationKey(String hmacAuthenticationKey) {
            return hmacAuthenticationKey(Output.of(hmacAuthenticationKey));
        }

        /**
         * @param hmacAuthenticationKeyVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder hmacAuthenticationKeyVariable(@Nullable Output<String> hmacAuthenticationKeyVariable) {
            $.hmacAuthenticationKeyVariable = hmacAuthenticationKeyVariable;
            return this;
        }

        /**
         * @param hmacAuthenticationKeyVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder hmacAuthenticationKeyVariable(String hmacAuthenticationKeyVariable) {
            return hmacAuthenticationKeyVariable(Output.of(hmacAuthenticationKeyVariable));
        }

        /**
         * @param holdTime Set EIGRP hold time - Range: `0`-`65535` - Default value: `15`
         * 
         * @return builder
         * 
         */
        public Builder holdTime(@Nullable Output<Integer> holdTime) {
            $.holdTime = holdTime;
            return this;
        }

        /**
         * @param holdTime Set EIGRP hold time - Range: `0`-`65535` - Default value: `15`
         * 
         * @return builder
         * 
         */
        public Builder holdTime(Integer holdTime) {
            return holdTime(Output.of(holdTime));
        }

        /**
         * @param holdTimeVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder holdTimeVariable(@Nullable Output<String> holdTimeVariable) {
            $.holdTimeVariable = holdTimeVariable;
            return this;
        }

        /**
         * @param holdTimeVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder holdTimeVariable(String holdTimeVariable) {
            return holdTimeVariable(Output.of(holdTimeVariable));
        }

        /**
         * @param interfaces Configure IPv4 Static Routes
         * 
         * @return builder
         * 
         */
        public Builder interfaces(@Nullable Output<List<EigrpFeatureTemplateInterfaceArgs>> interfaces) {
            $.interfaces = interfaces;
            return this;
        }

        /**
         * @param interfaces Configure IPv4 Static Routes
         * 
         * @return builder
         * 
         */
        public Builder interfaces(List<EigrpFeatureTemplateInterfaceArgs> interfaces) {
            return interfaces(Output.of(interfaces));
        }

        /**
         * @param interfaces Configure IPv4 Static Routes
         * 
         * @return builder
         * 
         */
        public Builder interfaces(EigrpFeatureTemplateInterfaceArgs... interfaces) {
            return interfaces(List.of(interfaces));
        }

        /**
         * @param keys Set keychain name
         * 
         * @return builder
         * 
         */
        public Builder keys(@Nullable Output<List<EigrpFeatureTemplateKeyArgs>> keys) {
            $.keys = keys;
            return this;
        }

        /**
         * @param keys Set keychain name
         * 
         * @return builder
         * 
         */
        public Builder keys(List<EigrpFeatureTemplateKeyArgs> keys) {
            return keys(Output.of(keys));
        }

        /**
         * @param keys Set keychain name
         * 
         * @return builder
         * 
         */
        public Builder keys(EigrpFeatureTemplateKeyArgs... keys) {
            return keys(List.of(keys));
        }

        /**
         * @param name The name of the feature template
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the feature template
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param routePolicyName Configure policy to apply to prefixes received from EIGRP neighbor
         * 
         * @return builder
         * 
         */
        public Builder routePolicyName(@Nullable Output<String> routePolicyName) {
            $.routePolicyName = routePolicyName;
            return this;
        }

        /**
         * @param routePolicyName Configure policy to apply to prefixes received from EIGRP neighbor
         * 
         * @return builder
         * 
         */
        public Builder routePolicyName(String routePolicyName) {
            return routePolicyName(Output.of(routePolicyName));
        }

        /**
         * @param routePolicyNameVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder routePolicyNameVariable(@Nullable Output<String> routePolicyNameVariable) {
            $.routePolicyNameVariable = routePolicyNameVariable;
            return this;
        }

        /**
         * @param routePolicyNameVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder routePolicyNameVariable(String routePolicyNameVariable) {
            return routePolicyNameVariable(Output.of(routePolicyNameVariable));
        }

        /**
         * @param templateType The template type
         * 
         * @return builder
         * 
         */
        public Builder templateType(@Nullable Output<String> templateType) {
            $.templateType = templateType;
            return this;
        }

        /**
         * @param templateType The template type
         * 
         * @return builder
         * 
         */
        public Builder templateType(String templateType) {
            return templateType(Output.of(templateType));
        }

        /**
         * @param version The version of the feature template
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the feature template
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public EigrpFeatureTemplateState build() {
            return $;
        }
    }

}
