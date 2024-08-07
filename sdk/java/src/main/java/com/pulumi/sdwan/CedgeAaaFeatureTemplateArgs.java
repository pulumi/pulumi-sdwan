// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.inputs.CedgeAaaFeatureTemplateAccountingRuleArgs;
import com.pulumi.sdwan.inputs.CedgeAaaFeatureTemplateAuthorizationRuleArgs;
import com.pulumi.sdwan.inputs.CedgeAaaFeatureTemplateRadiusClientArgs;
import com.pulumi.sdwan.inputs.CedgeAaaFeatureTemplateRadiusServerGroupArgs;
import com.pulumi.sdwan.inputs.CedgeAaaFeatureTemplateTacacsServerGroupArgs;
import com.pulumi.sdwan.inputs.CedgeAaaFeatureTemplateUserArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CedgeAaaFeatureTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CedgeAaaFeatureTemplateArgs Empty = new CedgeAaaFeatureTemplateArgs();

    /**
     * Configure the accounting rules
     * 
     */
    @Import(name="accountingRules")
    private @Nullable Output<List<CedgeAaaFeatureTemplateAccountingRuleArgs>> accountingRules;

    /**
     * @return Configure the accounting rules
     * 
     */
    public Optional<Output<List<CedgeAaaFeatureTemplateAccountingRuleArgs>>> accountingRules() {
        return Optional.ofNullable(this.accountingRules);
    }

    /**
     * For configuration mode commands. - Default value: `false`
     * 
     */
    @Import(name="authorizationConfigCommands")
    private @Nullable Output<Boolean> authorizationConfigCommands;

    /**
     * @return For configuration mode commands. - Default value: `false`
     * 
     */
    public Optional<Output<Boolean>> authorizationConfigCommands() {
        return Optional.ofNullable(this.authorizationConfigCommands);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="authorizationConfigCommandsVariable")
    private @Nullable Output<String> authorizationConfigCommandsVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> authorizationConfigCommandsVariable() {
        return Optional.ofNullable(this.authorizationConfigCommandsVariable);
    }

    /**
     * For enabling console authorization - Default value: `false`
     * 
     */
    @Import(name="authorizationConsole")
    private @Nullable Output<Boolean> authorizationConsole;

    /**
     * @return For enabling console authorization - Default value: `false`
     * 
     */
    public Optional<Output<Boolean>> authorizationConsole() {
        return Optional.ofNullable(this.authorizationConsole);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="authorizationConsoleVariable")
    private @Nullable Output<String> authorizationConsoleVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> authorizationConsoleVariable() {
        return Optional.ofNullable(this.authorizationConsoleVariable);
    }

    /**
     * Configure the Authorization Rules
     * 
     */
    @Import(name="authorizationRules")
    private @Nullable Output<List<CedgeAaaFeatureTemplateAuthorizationRuleArgs>> authorizationRules;

    /**
     * @return Configure the Authorization Rules
     * 
     */
    public Optional<Output<List<CedgeAaaFeatureTemplateAuthorizationRuleArgs>>> authorizationRules() {
        return Optional.ofNullable(this.authorizationRules);
    }

    /**
     * The description of the feature template
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return The description of the feature template
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
     * `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
     * `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
     * 
     */
    @Import(name="deviceTypes", required=true)
    private Output<List<String>> deviceTypes;

    /**
     * @return List of supported device types - Choices: `vedge-C8000V`, `vedge-C8300-1N1S-4T2X`, `vedge-C8300-1N1S-6T`,
     * `vedge-C8300-2N2S-6T`, `vedge-C8300-2N2S-4T2X`, `vedge-C8500-12X4QC`, `vedge-C8500-12X`, `vedge-C8500-20X6C`,
     * `vedge-C8500L-8S4X`, `vedge-C8200-1N-4T`, `vedge-C8200L-1N-4T`
     * 
     */
    public Output<List<String>> deviceTypes() {
        return this.deviceTypes;
    }

    /**
     * Accounting configurations parameters - Default value: `false`
     * 
     */
    @Import(name="dot1xAccounting")
    private @Nullable Output<Boolean> dot1xAccounting;

    /**
     * @return Accounting configurations parameters - Default value: `false`
     * 
     */
    public Optional<Output<Boolean>> dot1xAccounting() {
        return Optional.ofNullable(this.dot1xAccounting);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="dot1xAccountingVariable")
    private @Nullable Output<String> dot1xAccountingVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> dot1xAccountingVariable() {
        return Optional.ofNullable(this.dot1xAccountingVariable);
    }

    /**
     * Authentication configurations parameters - Default value: `false`
     * 
     */
    @Import(name="dot1xAuthentication")
    private @Nullable Output<Boolean> dot1xAuthentication;

    /**
     * @return Authentication configurations parameters - Default value: `false`
     * 
     */
    public Optional<Output<Boolean>> dot1xAuthentication() {
        return Optional.ofNullable(this.dot1xAuthentication);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="dot1xAuthenticationVariable")
    private @Nullable Output<String> dot1xAuthenticationVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> dot1xAuthenticationVariable() {
        return Optional.ofNullable(this.dot1xAuthenticationVariable);
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
     * Specify a RADIUS client
     * 
     */
    @Import(name="radiusClients")
    private @Nullable Output<List<CedgeAaaFeatureTemplateRadiusClientArgs>> radiusClients;

    /**
     * @return Specify a RADIUS client
     * 
     */
    public Optional<Output<List<CedgeAaaFeatureTemplateRadiusClientArgs>>> radiusClients() {
        return Optional.ofNullable(this.radiusClients);
    }

    /**
     * Authentication Type - Choices: `any`, `all`, `session-key` - Default value: `any`
     * 
     */
    @Import(name="radiusDynamicAuthorAuthenticationType")
    private @Nullable Output<String> radiusDynamicAuthorAuthenticationType;

    /**
     * @return Authentication Type - Choices: `any`, `all`, `session-key` - Default value: `any`
     * 
     */
    public Optional<Output<String>> radiusDynamicAuthorAuthenticationType() {
        return Optional.ofNullable(this.radiusDynamicAuthorAuthenticationType);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="radiusDynamicAuthorAuthenticationTypeVariable")
    private @Nullable Output<String> radiusDynamicAuthorAuthenticationTypeVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> radiusDynamicAuthorAuthenticationTypeVariable() {
        return Optional.ofNullable(this.radiusDynamicAuthorAuthenticationTypeVariable);
    }

    /**
     * Domain Stripping - Choices: `yes`, `no`, `right-to-left` - Default value: `no`
     * 
     */
    @Import(name="radiusDynamicAuthorDomainStripping")
    private @Nullable Output<String> radiusDynamicAuthorDomainStripping;

    /**
     * @return Domain Stripping - Choices: `yes`, `no`, `right-to-left` - Default value: `no`
     * 
     */
    public Optional<Output<String>> radiusDynamicAuthorDomainStripping() {
        return Optional.ofNullable(this.radiusDynamicAuthorDomainStripping);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="radiusDynamicAuthorDomainStrippingVariable")
    private @Nullable Output<String> radiusDynamicAuthorDomainStrippingVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> radiusDynamicAuthorDomainStrippingVariable() {
        return Optional.ofNullable(this.radiusDynamicAuthorDomainStrippingVariable);
    }

    /**
     * Specify Radius Dynamic Author Port - Range: `0`-`65535` - Default value: `1700`
     * 
     */
    @Import(name="radiusDynamicAuthorPort")
    private @Nullable Output<Integer> radiusDynamicAuthorPort;

    /**
     * @return Specify Radius Dynamic Author Port - Range: `0`-`65535` - Default value: `1700`
     * 
     */
    public Optional<Output<Integer>> radiusDynamicAuthorPort() {
        return Optional.ofNullable(this.radiusDynamicAuthorPort);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="radiusDynamicAuthorPortVariable")
    private @Nullable Output<String> radiusDynamicAuthorPortVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> radiusDynamicAuthorPortVariable() {
        return Optional.ofNullable(this.radiusDynamicAuthorPortVariable);
    }

    /**
     * Specify a radius dynamic author server-key
     * 
     */
    @Import(name="radiusDynamicAuthorServerKey")
    private @Nullable Output<String> radiusDynamicAuthorServerKey;

    /**
     * @return Specify a radius dynamic author server-key
     * 
     */
    public Optional<Output<String>> radiusDynamicAuthorServerKey() {
        return Optional.ofNullable(this.radiusDynamicAuthorServerKey);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="radiusDynamicAuthorServerKeyVariable")
    private @Nullable Output<String> radiusDynamicAuthorServerKeyVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> radiusDynamicAuthorServerKeyVariable() {
        return Optional.ofNullable(this.radiusDynamicAuthorServerKeyVariable);
    }

    /**
     * Configure the Radius serverGroup
     * 
     */
    @Import(name="radiusServerGroups")
    private @Nullable Output<List<CedgeAaaFeatureTemplateRadiusServerGroupArgs>> radiusServerGroups;

    /**
     * @return Configure the Radius serverGroup
     * 
     */
    public Optional<Output<List<CedgeAaaFeatureTemplateRadiusServerGroupArgs>>> radiusServerGroups() {
        return Optional.ofNullable(this.radiusServerGroups);
    }

    /**
     * CTS Authorization List
     * 
     */
    @Import(name="radiusTrustsecCtsAuthorizationList")
    private @Nullable Output<String> radiusTrustsecCtsAuthorizationList;

    /**
     * @return CTS Authorization List
     * 
     */
    public Optional<Output<String>> radiusTrustsecCtsAuthorizationList() {
        return Optional.ofNullable(this.radiusTrustsecCtsAuthorizationList);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="radiusTrustsecCtsAuthorizationListVariable")
    private @Nullable Output<String> radiusTrustsecCtsAuthorizationListVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> radiusTrustsecCtsAuthorizationListVariable() {
        return Optional.ofNullable(this.radiusTrustsecCtsAuthorizationListVariable);
    }

    /**
     * RADIUS trustsec group
     * 
     */
    @Import(name="radiusTrustsecGroup")
    private @Nullable Output<String> radiusTrustsecGroup;

    /**
     * @return RADIUS trustsec group
     * 
     */
    public Optional<Output<String>> radiusTrustsecGroup() {
        return Optional.ofNullable(this.radiusTrustsecGroup);
    }

    /**
     * ServerGroups priority order - Default value: `local`
     * 
     */
    @Import(name="serverGroupsPriorityOrder")
    private @Nullable Output<String> serverGroupsPriorityOrder;

    /**
     * @return ServerGroups priority order - Default value: `local`
     * 
     */
    public Optional<Output<String>> serverGroupsPriorityOrder() {
        return Optional.ofNullable(this.serverGroupsPriorityOrder);
    }

    /**
     * Configure the TACACS serverGroup
     * 
     */
    @Import(name="tacacsServerGroups")
    private @Nullable Output<List<CedgeAaaFeatureTemplateTacacsServerGroupArgs>> tacacsServerGroups;

    /**
     * @return Configure the TACACS serverGroup
     * 
     */
    public Optional<Output<List<CedgeAaaFeatureTemplateTacacsServerGroupArgs>>> tacacsServerGroups() {
        return Optional.ofNullable(this.tacacsServerGroups);
    }

    /**
     * Create local login account
     * 
     */
    @Import(name="users")
    private @Nullable Output<List<CedgeAaaFeatureTemplateUserArgs>> users;

    /**
     * @return Create local login account
     * 
     */
    public Optional<Output<List<CedgeAaaFeatureTemplateUserArgs>>> users() {
        return Optional.ofNullable(this.users);
    }

    private CedgeAaaFeatureTemplateArgs() {}

    private CedgeAaaFeatureTemplateArgs(CedgeAaaFeatureTemplateArgs $) {
        this.accountingRules = $.accountingRules;
        this.authorizationConfigCommands = $.authorizationConfigCommands;
        this.authorizationConfigCommandsVariable = $.authorizationConfigCommandsVariable;
        this.authorizationConsole = $.authorizationConsole;
        this.authorizationConsoleVariable = $.authorizationConsoleVariable;
        this.authorizationRules = $.authorizationRules;
        this.description = $.description;
        this.deviceTypes = $.deviceTypes;
        this.dot1xAccounting = $.dot1xAccounting;
        this.dot1xAccountingVariable = $.dot1xAccountingVariable;
        this.dot1xAuthentication = $.dot1xAuthentication;
        this.dot1xAuthenticationVariable = $.dot1xAuthenticationVariable;
        this.name = $.name;
        this.radiusClients = $.radiusClients;
        this.radiusDynamicAuthorAuthenticationType = $.radiusDynamicAuthorAuthenticationType;
        this.radiusDynamicAuthorAuthenticationTypeVariable = $.radiusDynamicAuthorAuthenticationTypeVariable;
        this.radiusDynamicAuthorDomainStripping = $.radiusDynamicAuthorDomainStripping;
        this.radiusDynamicAuthorDomainStrippingVariable = $.radiusDynamicAuthorDomainStrippingVariable;
        this.radiusDynamicAuthorPort = $.radiusDynamicAuthorPort;
        this.radiusDynamicAuthorPortVariable = $.radiusDynamicAuthorPortVariable;
        this.radiusDynamicAuthorServerKey = $.radiusDynamicAuthorServerKey;
        this.radiusDynamicAuthorServerKeyVariable = $.radiusDynamicAuthorServerKeyVariable;
        this.radiusServerGroups = $.radiusServerGroups;
        this.radiusTrustsecCtsAuthorizationList = $.radiusTrustsecCtsAuthorizationList;
        this.radiusTrustsecCtsAuthorizationListVariable = $.radiusTrustsecCtsAuthorizationListVariable;
        this.radiusTrustsecGroup = $.radiusTrustsecGroup;
        this.serverGroupsPriorityOrder = $.serverGroupsPriorityOrder;
        this.tacacsServerGroups = $.tacacsServerGroups;
        this.users = $.users;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CedgeAaaFeatureTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CedgeAaaFeatureTemplateArgs $;

        public Builder() {
            $ = new CedgeAaaFeatureTemplateArgs();
        }

        public Builder(CedgeAaaFeatureTemplateArgs defaults) {
            $ = new CedgeAaaFeatureTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountingRules Configure the accounting rules
         * 
         * @return builder
         * 
         */
        public Builder accountingRules(@Nullable Output<List<CedgeAaaFeatureTemplateAccountingRuleArgs>> accountingRules) {
            $.accountingRules = accountingRules;
            return this;
        }

        /**
         * @param accountingRules Configure the accounting rules
         * 
         * @return builder
         * 
         */
        public Builder accountingRules(List<CedgeAaaFeatureTemplateAccountingRuleArgs> accountingRules) {
            return accountingRules(Output.of(accountingRules));
        }

        /**
         * @param accountingRules Configure the accounting rules
         * 
         * @return builder
         * 
         */
        public Builder accountingRules(CedgeAaaFeatureTemplateAccountingRuleArgs... accountingRules) {
            return accountingRules(List.of(accountingRules));
        }

        /**
         * @param authorizationConfigCommands For configuration mode commands. - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder authorizationConfigCommands(@Nullable Output<Boolean> authorizationConfigCommands) {
            $.authorizationConfigCommands = authorizationConfigCommands;
            return this;
        }

        /**
         * @param authorizationConfigCommands For configuration mode commands. - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder authorizationConfigCommands(Boolean authorizationConfigCommands) {
            return authorizationConfigCommands(Output.of(authorizationConfigCommands));
        }

        /**
         * @param authorizationConfigCommandsVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder authorizationConfigCommandsVariable(@Nullable Output<String> authorizationConfigCommandsVariable) {
            $.authorizationConfigCommandsVariable = authorizationConfigCommandsVariable;
            return this;
        }

        /**
         * @param authorizationConfigCommandsVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder authorizationConfigCommandsVariable(String authorizationConfigCommandsVariable) {
            return authorizationConfigCommandsVariable(Output.of(authorizationConfigCommandsVariable));
        }

        /**
         * @param authorizationConsole For enabling console authorization - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder authorizationConsole(@Nullable Output<Boolean> authorizationConsole) {
            $.authorizationConsole = authorizationConsole;
            return this;
        }

        /**
         * @param authorizationConsole For enabling console authorization - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder authorizationConsole(Boolean authorizationConsole) {
            return authorizationConsole(Output.of(authorizationConsole));
        }

        /**
         * @param authorizationConsoleVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder authorizationConsoleVariable(@Nullable Output<String> authorizationConsoleVariable) {
            $.authorizationConsoleVariable = authorizationConsoleVariable;
            return this;
        }

        /**
         * @param authorizationConsoleVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder authorizationConsoleVariable(String authorizationConsoleVariable) {
            return authorizationConsoleVariable(Output.of(authorizationConsoleVariable));
        }

        /**
         * @param authorizationRules Configure the Authorization Rules
         * 
         * @return builder
         * 
         */
        public Builder authorizationRules(@Nullable Output<List<CedgeAaaFeatureTemplateAuthorizationRuleArgs>> authorizationRules) {
            $.authorizationRules = authorizationRules;
            return this;
        }

        /**
         * @param authorizationRules Configure the Authorization Rules
         * 
         * @return builder
         * 
         */
        public Builder authorizationRules(List<CedgeAaaFeatureTemplateAuthorizationRuleArgs> authorizationRules) {
            return authorizationRules(Output.of(authorizationRules));
        }

        /**
         * @param authorizationRules Configure the Authorization Rules
         * 
         * @return builder
         * 
         */
        public Builder authorizationRules(CedgeAaaFeatureTemplateAuthorizationRuleArgs... authorizationRules) {
            return authorizationRules(List.of(authorizationRules));
        }

        /**
         * @param description The description of the feature template
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
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
        public Builder deviceTypes(Output<List<String>> deviceTypes) {
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
         * @param dot1xAccounting Accounting configurations parameters - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder dot1xAccounting(@Nullable Output<Boolean> dot1xAccounting) {
            $.dot1xAccounting = dot1xAccounting;
            return this;
        }

        /**
         * @param dot1xAccounting Accounting configurations parameters - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder dot1xAccounting(Boolean dot1xAccounting) {
            return dot1xAccounting(Output.of(dot1xAccounting));
        }

        /**
         * @param dot1xAccountingVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder dot1xAccountingVariable(@Nullable Output<String> dot1xAccountingVariable) {
            $.dot1xAccountingVariable = dot1xAccountingVariable;
            return this;
        }

        /**
         * @param dot1xAccountingVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder dot1xAccountingVariable(String dot1xAccountingVariable) {
            return dot1xAccountingVariable(Output.of(dot1xAccountingVariable));
        }

        /**
         * @param dot1xAuthentication Authentication configurations parameters - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder dot1xAuthentication(@Nullable Output<Boolean> dot1xAuthentication) {
            $.dot1xAuthentication = dot1xAuthentication;
            return this;
        }

        /**
         * @param dot1xAuthentication Authentication configurations parameters - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder dot1xAuthentication(Boolean dot1xAuthentication) {
            return dot1xAuthentication(Output.of(dot1xAuthentication));
        }

        /**
         * @param dot1xAuthenticationVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder dot1xAuthenticationVariable(@Nullable Output<String> dot1xAuthenticationVariable) {
            $.dot1xAuthenticationVariable = dot1xAuthenticationVariable;
            return this;
        }

        /**
         * @param dot1xAuthenticationVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder dot1xAuthenticationVariable(String dot1xAuthenticationVariable) {
            return dot1xAuthenticationVariable(Output.of(dot1xAuthenticationVariable));
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
         * @param radiusClients Specify a RADIUS client
         * 
         * @return builder
         * 
         */
        public Builder radiusClients(@Nullable Output<List<CedgeAaaFeatureTemplateRadiusClientArgs>> radiusClients) {
            $.radiusClients = radiusClients;
            return this;
        }

        /**
         * @param radiusClients Specify a RADIUS client
         * 
         * @return builder
         * 
         */
        public Builder radiusClients(List<CedgeAaaFeatureTemplateRadiusClientArgs> radiusClients) {
            return radiusClients(Output.of(radiusClients));
        }

        /**
         * @param radiusClients Specify a RADIUS client
         * 
         * @return builder
         * 
         */
        public Builder radiusClients(CedgeAaaFeatureTemplateRadiusClientArgs... radiusClients) {
            return radiusClients(List.of(radiusClients));
        }

        /**
         * @param radiusDynamicAuthorAuthenticationType Authentication Type - Choices: `any`, `all`, `session-key` - Default value: `any`
         * 
         * @return builder
         * 
         */
        public Builder radiusDynamicAuthorAuthenticationType(@Nullable Output<String> radiusDynamicAuthorAuthenticationType) {
            $.radiusDynamicAuthorAuthenticationType = radiusDynamicAuthorAuthenticationType;
            return this;
        }

        /**
         * @param radiusDynamicAuthorAuthenticationType Authentication Type - Choices: `any`, `all`, `session-key` - Default value: `any`
         * 
         * @return builder
         * 
         */
        public Builder radiusDynamicAuthorAuthenticationType(String radiusDynamicAuthorAuthenticationType) {
            return radiusDynamicAuthorAuthenticationType(Output.of(radiusDynamicAuthorAuthenticationType));
        }

        /**
         * @param radiusDynamicAuthorAuthenticationTypeVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder radiusDynamicAuthorAuthenticationTypeVariable(@Nullable Output<String> radiusDynamicAuthorAuthenticationTypeVariable) {
            $.radiusDynamicAuthorAuthenticationTypeVariable = radiusDynamicAuthorAuthenticationTypeVariable;
            return this;
        }

        /**
         * @param radiusDynamicAuthorAuthenticationTypeVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder radiusDynamicAuthorAuthenticationTypeVariable(String radiusDynamicAuthorAuthenticationTypeVariable) {
            return radiusDynamicAuthorAuthenticationTypeVariable(Output.of(radiusDynamicAuthorAuthenticationTypeVariable));
        }

        /**
         * @param radiusDynamicAuthorDomainStripping Domain Stripping - Choices: `yes`, `no`, `right-to-left` - Default value: `no`
         * 
         * @return builder
         * 
         */
        public Builder radiusDynamicAuthorDomainStripping(@Nullable Output<String> radiusDynamicAuthorDomainStripping) {
            $.radiusDynamicAuthorDomainStripping = radiusDynamicAuthorDomainStripping;
            return this;
        }

        /**
         * @param radiusDynamicAuthorDomainStripping Domain Stripping - Choices: `yes`, `no`, `right-to-left` - Default value: `no`
         * 
         * @return builder
         * 
         */
        public Builder radiusDynamicAuthorDomainStripping(String radiusDynamicAuthorDomainStripping) {
            return radiusDynamicAuthorDomainStripping(Output.of(radiusDynamicAuthorDomainStripping));
        }

        /**
         * @param radiusDynamicAuthorDomainStrippingVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder radiusDynamicAuthorDomainStrippingVariable(@Nullable Output<String> radiusDynamicAuthorDomainStrippingVariable) {
            $.radiusDynamicAuthorDomainStrippingVariable = radiusDynamicAuthorDomainStrippingVariable;
            return this;
        }

        /**
         * @param radiusDynamicAuthorDomainStrippingVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder radiusDynamicAuthorDomainStrippingVariable(String radiusDynamicAuthorDomainStrippingVariable) {
            return radiusDynamicAuthorDomainStrippingVariable(Output.of(radiusDynamicAuthorDomainStrippingVariable));
        }

        /**
         * @param radiusDynamicAuthorPort Specify Radius Dynamic Author Port - Range: `0`-`65535` - Default value: `1700`
         * 
         * @return builder
         * 
         */
        public Builder radiusDynamicAuthorPort(@Nullable Output<Integer> radiusDynamicAuthorPort) {
            $.radiusDynamicAuthorPort = radiusDynamicAuthorPort;
            return this;
        }

        /**
         * @param radiusDynamicAuthorPort Specify Radius Dynamic Author Port - Range: `0`-`65535` - Default value: `1700`
         * 
         * @return builder
         * 
         */
        public Builder radiusDynamicAuthorPort(Integer radiusDynamicAuthorPort) {
            return radiusDynamicAuthorPort(Output.of(radiusDynamicAuthorPort));
        }

        /**
         * @param radiusDynamicAuthorPortVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder radiusDynamicAuthorPortVariable(@Nullable Output<String> radiusDynamicAuthorPortVariable) {
            $.radiusDynamicAuthorPortVariable = radiusDynamicAuthorPortVariable;
            return this;
        }

        /**
         * @param radiusDynamicAuthorPortVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder radiusDynamicAuthorPortVariable(String radiusDynamicAuthorPortVariable) {
            return radiusDynamicAuthorPortVariable(Output.of(radiusDynamicAuthorPortVariable));
        }

        /**
         * @param radiusDynamicAuthorServerKey Specify a radius dynamic author server-key
         * 
         * @return builder
         * 
         */
        public Builder radiusDynamicAuthorServerKey(@Nullable Output<String> radiusDynamicAuthorServerKey) {
            $.radiusDynamicAuthorServerKey = radiusDynamicAuthorServerKey;
            return this;
        }

        /**
         * @param radiusDynamicAuthorServerKey Specify a radius dynamic author server-key
         * 
         * @return builder
         * 
         */
        public Builder radiusDynamicAuthorServerKey(String radiusDynamicAuthorServerKey) {
            return radiusDynamicAuthorServerKey(Output.of(radiusDynamicAuthorServerKey));
        }

        /**
         * @param radiusDynamicAuthorServerKeyVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder radiusDynamicAuthorServerKeyVariable(@Nullable Output<String> radiusDynamicAuthorServerKeyVariable) {
            $.radiusDynamicAuthorServerKeyVariable = radiusDynamicAuthorServerKeyVariable;
            return this;
        }

        /**
         * @param radiusDynamicAuthorServerKeyVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder radiusDynamicAuthorServerKeyVariable(String radiusDynamicAuthorServerKeyVariable) {
            return radiusDynamicAuthorServerKeyVariable(Output.of(radiusDynamicAuthorServerKeyVariable));
        }

        /**
         * @param radiusServerGroups Configure the Radius serverGroup
         * 
         * @return builder
         * 
         */
        public Builder radiusServerGroups(@Nullable Output<List<CedgeAaaFeatureTemplateRadiusServerGroupArgs>> radiusServerGroups) {
            $.radiusServerGroups = radiusServerGroups;
            return this;
        }

        /**
         * @param radiusServerGroups Configure the Radius serverGroup
         * 
         * @return builder
         * 
         */
        public Builder radiusServerGroups(List<CedgeAaaFeatureTemplateRadiusServerGroupArgs> radiusServerGroups) {
            return radiusServerGroups(Output.of(radiusServerGroups));
        }

        /**
         * @param radiusServerGroups Configure the Radius serverGroup
         * 
         * @return builder
         * 
         */
        public Builder radiusServerGroups(CedgeAaaFeatureTemplateRadiusServerGroupArgs... radiusServerGroups) {
            return radiusServerGroups(List.of(radiusServerGroups));
        }

        /**
         * @param radiusTrustsecCtsAuthorizationList CTS Authorization List
         * 
         * @return builder
         * 
         */
        public Builder radiusTrustsecCtsAuthorizationList(@Nullable Output<String> radiusTrustsecCtsAuthorizationList) {
            $.radiusTrustsecCtsAuthorizationList = radiusTrustsecCtsAuthorizationList;
            return this;
        }

        /**
         * @param radiusTrustsecCtsAuthorizationList CTS Authorization List
         * 
         * @return builder
         * 
         */
        public Builder radiusTrustsecCtsAuthorizationList(String radiusTrustsecCtsAuthorizationList) {
            return radiusTrustsecCtsAuthorizationList(Output.of(radiusTrustsecCtsAuthorizationList));
        }

        /**
         * @param radiusTrustsecCtsAuthorizationListVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder radiusTrustsecCtsAuthorizationListVariable(@Nullable Output<String> radiusTrustsecCtsAuthorizationListVariable) {
            $.radiusTrustsecCtsAuthorizationListVariable = radiusTrustsecCtsAuthorizationListVariable;
            return this;
        }

        /**
         * @param radiusTrustsecCtsAuthorizationListVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder radiusTrustsecCtsAuthorizationListVariable(String radiusTrustsecCtsAuthorizationListVariable) {
            return radiusTrustsecCtsAuthorizationListVariable(Output.of(radiusTrustsecCtsAuthorizationListVariable));
        }

        /**
         * @param radiusTrustsecGroup RADIUS trustsec group
         * 
         * @return builder
         * 
         */
        public Builder radiusTrustsecGroup(@Nullable Output<String> radiusTrustsecGroup) {
            $.radiusTrustsecGroup = radiusTrustsecGroup;
            return this;
        }

        /**
         * @param radiusTrustsecGroup RADIUS trustsec group
         * 
         * @return builder
         * 
         */
        public Builder radiusTrustsecGroup(String radiusTrustsecGroup) {
            return radiusTrustsecGroup(Output.of(radiusTrustsecGroup));
        }

        /**
         * @param serverGroupsPriorityOrder ServerGroups priority order - Default value: `local`
         * 
         * @return builder
         * 
         */
        public Builder serverGroupsPriorityOrder(@Nullable Output<String> serverGroupsPriorityOrder) {
            $.serverGroupsPriorityOrder = serverGroupsPriorityOrder;
            return this;
        }

        /**
         * @param serverGroupsPriorityOrder ServerGroups priority order - Default value: `local`
         * 
         * @return builder
         * 
         */
        public Builder serverGroupsPriorityOrder(String serverGroupsPriorityOrder) {
            return serverGroupsPriorityOrder(Output.of(serverGroupsPriorityOrder));
        }

        /**
         * @param tacacsServerGroups Configure the TACACS serverGroup
         * 
         * @return builder
         * 
         */
        public Builder tacacsServerGroups(@Nullable Output<List<CedgeAaaFeatureTemplateTacacsServerGroupArgs>> tacacsServerGroups) {
            $.tacacsServerGroups = tacacsServerGroups;
            return this;
        }

        /**
         * @param tacacsServerGroups Configure the TACACS serverGroup
         * 
         * @return builder
         * 
         */
        public Builder tacacsServerGroups(List<CedgeAaaFeatureTemplateTacacsServerGroupArgs> tacacsServerGroups) {
            return tacacsServerGroups(Output.of(tacacsServerGroups));
        }

        /**
         * @param tacacsServerGroups Configure the TACACS serverGroup
         * 
         * @return builder
         * 
         */
        public Builder tacacsServerGroups(CedgeAaaFeatureTemplateTacacsServerGroupArgs... tacacsServerGroups) {
            return tacacsServerGroups(List.of(tacacsServerGroups));
        }

        /**
         * @param users Create local login account
         * 
         * @return builder
         * 
         */
        public Builder users(@Nullable Output<List<CedgeAaaFeatureTemplateUserArgs>> users) {
            $.users = users;
            return this;
        }

        /**
         * @param users Create local login account
         * 
         * @return builder
         * 
         */
        public Builder users(List<CedgeAaaFeatureTemplateUserArgs> users) {
            return users(Output.of(users));
        }

        /**
         * @param users Create local login account
         * 
         * @return builder
         * 
         */
        public Builder users(CedgeAaaFeatureTemplateUserArgs... users) {
            return users(List.of(users));
        }

        public CedgeAaaFeatureTemplateArgs build() {
            if ($.description == null) {
                throw new MissingRequiredPropertyException("CedgeAaaFeatureTemplateArgs", "description");
            }
            if ($.deviceTypes == null) {
                throw new MissingRequiredPropertyException("CedgeAaaFeatureTemplateArgs", "deviceTypes");
            }
            return $;
        }
    }

}
