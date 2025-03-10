// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityAppHostingFeatureTemplateVirtualApplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityAppHostingFeatureTemplateVirtualApplicationArgs Empty = new SecurityAppHostingFeatureTemplateVirtualApplicationArgs();

    /**
     * List of Virtual applications
     *   - Choices: `utd`
     *   - Default value: `utd`
     * 
     */
    @Import(name="applicationType")
    private @Nullable Output<String> applicationType;

    /**
     * @return List of Virtual applications
     *   - Choices: `utd`
     *   - Default value: `utd`
     * 
     */
    public Optional<Output<String>> applicationType() {
        return Optional.ofNullable(this.applicationType);
    }

    /**
     * Data Gateway IP
     *   - Default value: `192.0.2.1/24`
     * 
     */
    @Import(name="dataGatewayIp")
    private @Nullable Output<String> dataGatewayIp;

    /**
     * @return Data Gateway IP
     *   - Default value: `192.0.2.1/24`
     * 
     */
    public Optional<Output<String>> dataGatewayIp() {
        return Optional.ofNullable(this.dataGatewayIp);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="dataGatewayIpVariable")
    private @Nullable Output<String> dataGatewayIpVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> dataGatewayIpVariable() {
        return Optional.ofNullable(this.dataGatewayIpVariable);
    }

    /**
     * Data Service IP
     *   - Default value: `192.0.2.2/24`
     * 
     */
    @Import(name="dataServiceIp")
    private @Nullable Output<String> dataServiceIp;

    /**
     * @return Data Service IP
     *   - Default value: `192.0.2.2/24`
     * 
     */
    public Optional<Output<String>> dataServiceIp() {
        return Optional.ofNullable(this.dataServiceIp);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="dataServiceIpVariable")
    private @Nullable Output<String> dataServiceIpVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> dataServiceIpVariable() {
        return Optional.ofNullable(this.dataServiceIpVariable);
    }

    /**
     * Download URL Database on Device
     *   - Default value: `false`
     * 
     */
    @Import(name="databaseUrl")
    private @Nullable Output<Boolean> databaseUrl;

    /**
     * @return Download URL Database on Device
     *   - Default value: `false`
     * 
     */
    public Optional<Output<Boolean>> databaseUrl() {
        return Optional.ofNullable(this.databaseUrl);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="databaseUrlVariable")
    private @Nullable Output<String> databaseUrlVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> databaseUrlVariable() {
        return Optional.ofNullable(this.databaseUrlVariable);
    }

    /**
     * List of Virtual applications
     *   - Default value: `1`
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return List of Virtual applications
     *   - Default value: `1`
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * Is Nat enabled
     *   - Default value: `true`
     * 
     */
    @Import(name="nat")
    private @Nullable Output<Boolean> nat;

    /**
     * @return Is Nat enabled
     *   - Default value: `true`
     * 
     */
    public Optional<Output<Boolean>> nat() {
        return Optional.ofNullable(this.nat);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="natVariable")
    private @Nullable Output<String> natVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> natVariable() {
        return Optional.ofNullable(this.natVariable);
    }

    /**
     * Indicates if list item is considered optional.
     * 
     */
    @Import(name="optional")
    private @Nullable Output<Boolean> optional;

    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Optional<Output<Boolean>> optional() {
        return Optional.ofNullable(this.optional);
    }

    /**
     * Resource Profile
     *   - Choices: `low`, `medium`, `high`
     *   - Default value: `low`
     * 
     */
    @Import(name="resourceProfile")
    private @Nullable Output<String> resourceProfile;

    /**
     * @return Resource Profile
     *   - Choices: `low`, `medium`, `high`
     *   - Default value: `low`
     * 
     */
    public Optional<Output<String>> resourceProfile() {
        return Optional.ofNullable(this.resourceProfile);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="resourceProfileVariable")
    private @Nullable Output<String> resourceProfileVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> resourceProfileVariable() {
        return Optional.ofNullable(this.resourceProfileVariable);
    }

    /**
     * Service Gateway IP (Management interface)
     * 
     */
    @Import(name="serviceGatewayIp")
    private @Nullable Output<String> serviceGatewayIp;

    /**
     * @return Service Gateway IP (Management interface)
     * 
     */
    public Optional<Output<String>> serviceGatewayIp() {
        return Optional.ofNullable(this.serviceGatewayIp);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="serviceGatewayIpVariable")
    private @Nullable Output<String> serviceGatewayIpVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> serviceGatewayIpVariable() {
        return Optional.ofNullable(this.serviceGatewayIpVariable);
    }

    /**
     * Service IP
     * 
     */
    @Import(name="serviceIp")
    private @Nullable Output<String> serviceIp;

    /**
     * @return Service IP
     * 
     */
    public Optional<Output<String>> serviceIp() {
        return Optional.ofNullable(this.serviceIp);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="serviceIpVariable")
    private @Nullable Output<String> serviceIpVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> serviceIpVariable() {
        return Optional.ofNullable(this.serviceIpVariable);
    }

    private SecurityAppHostingFeatureTemplateVirtualApplicationArgs() {}

    private SecurityAppHostingFeatureTemplateVirtualApplicationArgs(SecurityAppHostingFeatureTemplateVirtualApplicationArgs $) {
        this.applicationType = $.applicationType;
        this.dataGatewayIp = $.dataGatewayIp;
        this.dataGatewayIpVariable = $.dataGatewayIpVariable;
        this.dataServiceIp = $.dataServiceIp;
        this.dataServiceIpVariable = $.dataServiceIpVariable;
        this.databaseUrl = $.databaseUrl;
        this.databaseUrlVariable = $.databaseUrlVariable;
        this.instanceId = $.instanceId;
        this.nat = $.nat;
        this.natVariable = $.natVariable;
        this.optional = $.optional;
        this.resourceProfile = $.resourceProfile;
        this.resourceProfileVariable = $.resourceProfileVariable;
        this.serviceGatewayIp = $.serviceGatewayIp;
        this.serviceGatewayIpVariable = $.serviceGatewayIpVariable;
        this.serviceIp = $.serviceIp;
        this.serviceIpVariable = $.serviceIpVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityAppHostingFeatureTemplateVirtualApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityAppHostingFeatureTemplateVirtualApplicationArgs $;

        public Builder() {
            $ = new SecurityAppHostingFeatureTemplateVirtualApplicationArgs();
        }

        public Builder(SecurityAppHostingFeatureTemplateVirtualApplicationArgs defaults) {
            $ = new SecurityAppHostingFeatureTemplateVirtualApplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationType List of Virtual applications
         *   - Choices: `utd`
         *   - Default value: `utd`
         * 
         * @return builder
         * 
         */
        public Builder applicationType(@Nullable Output<String> applicationType) {
            $.applicationType = applicationType;
            return this;
        }

        /**
         * @param applicationType List of Virtual applications
         *   - Choices: `utd`
         *   - Default value: `utd`
         * 
         * @return builder
         * 
         */
        public Builder applicationType(String applicationType) {
            return applicationType(Output.of(applicationType));
        }

        /**
         * @param dataGatewayIp Data Gateway IP
         *   - Default value: `192.0.2.1/24`
         * 
         * @return builder
         * 
         */
        public Builder dataGatewayIp(@Nullable Output<String> dataGatewayIp) {
            $.dataGatewayIp = dataGatewayIp;
            return this;
        }

        /**
         * @param dataGatewayIp Data Gateway IP
         *   - Default value: `192.0.2.1/24`
         * 
         * @return builder
         * 
         */
        public Builder dataGatewayIp(String dataGatewayIp) {
            return dataGatewayIp(Output.of(dataGatewayIp));
        }

        /**
         * @param dataGatewayIpVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder dataGatewayIpVariable(@Nullable Output<String> dataGatewayIpVariable) {
            $.dataGatewayIpVariable = dataGatewayIpVariable;
            return this;
        }

        /**
         * @param dataGatewayIpVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder dataGatewayIpVariable(String dataGatewayIpVariable) {
            return dataGatewayIpVariable(Output.of(dataGatewayIpVariable));
        }

        /**
         * @param dataServiceIp Data Service IP
         *   - Default value: `192.0.2.2/24`
         * 
         * @return builder
         * 
         */
        public Builder dataServiceIp(@Nullable Output<String> dataServiceIp) {
            $.dataServiceIp = dataServiceIp;
            return this;
        }

        /**
         * @param dataServiceIp Data Service IP
         *   - Default value: `192.0.2.2/24`
         * 
         * @return builder
         * 
         */
        public Builder dataServiceIp(String dataServiceIp) {
            return dataServiceIp(Output.of(dataServiceIp));
        }

        /**
         * @param dataServiceIpVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder dataServiceIpVariable(@Nullable Output<String> dataServiceIpVariable) {
            $.dataServiceIpVariable = dataServiceIpVariable;
            return this;
        }

        /**
         * @param dataServiceIpVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder dataServiceIpVariable(String dataServiceIpVariable) {
            return dataServiceIpVariable(Output.of(dataServiceIpVariable));
        }

        /**
         * @param databaseUrl Download URL Database on Device
         *   - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder databaseUrl(@Nullable Output<Boolean> databaseUrl) {
            $.databaseUrl = databaseUrl;
            return this;
        }

        /**
         * @param databaseUrl Download URL Database on Device
         *   - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder databaseUrl(Boolean databaseUrl) {
            return databaseUrl(Output.of(databaseUrl));
        }

        /**
         * @param databaseUrlVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder databaseUrlVariable(@Nullable Output<String> databaseUrlVariable) {
            $.databaseUrlVariable = databaseUrlVariable;
            return this;
        }

        /**
         * @param databaseUrlVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder databaseUrlVariable(String databaseUrlVariable) {
            return databaseUrlVariable(Output.of(databaseUrlVariable));
        }

        /**
         * @param instanceId List of Virtual applications
         *   - Default value: `1`
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId List of Virtual applications
         *   - Default value: `1`
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param nat Is Nat enabled
         *   - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder nat(@Nullable Output<Boolean> nat) {
            $.nat = nat;
            return this;
        }

        /**
         * @param nat Is Nat enabled
         *   - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder nat(Boolean nat) {
            return nat(Output.of(nat));
        }

        /**
         * @param natVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder natVariable(@Nullable Output<String> natVariable) {
            $.natVariable = natVariable;
            return this;
        }

        /**
         * @param natVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder natVariable(String natVariable) {
            return natVariable(Output.of(natVariable));
        }

        /**
         * @param optional Indicates if list item is considered optional.
         * 
         * @return builder
         * 
         */
        public Builder optional(@Nullable Output<Boolean> optional) {
            $.optional = optional;
            return this;
        }

        /**
         * @param optional Indicates if list item is considered optional.
         * 
         * @return builder
         * 
         */
        public Builder optional(Boolean optional) {
            return optional(Output.of(optional));
        }

        /**
         * @param resourceProfile Resource Profile
         *   - Choices: `low`, `medium`, `high`
         *   - Default value: `low`
         * 
         * @return builder
         * 
         */
        public Builder resourceProfile(@Nullable Output<String> resourceProfile) {
            $.resourceProfile = resourceProfile;
            return this;
        }

        /**
         * @param resourceProfile Resource Profile
         *   - Choices: `low`, `medium`, `high`
         *   - Default value: `low`
         * 
         * @return builder
         * 
         */
        public Builder resourceProfile(String resourceProfile) {
            return resourceProfile(Output.of(resourceProfile));
        }

        /**
         * @param resourceProfileVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder resourceProfileVariable(@Nullable Output<String> resourceProfileVariable) {
            $.resourceProfileVariable = resourceProfileVariable;
            return this;
        }

        /**
         * @param resourceProfileVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder resourceProfileVariable(String resourceProfileVariable) {
            return resourceProfileVariable(Output.of(resourceProfileVariable));
        }

        /**
         * @param serviceGatewayIp Service Gateway IP (Management interface)
         * 
         * @return builder
         * 
         */
        public Builder serviceGatewayIp(@Nullable Output<String> serviceGatewayIp) {
            $.serviceGatewayIp = serviceGatewayIp;
            return this;
        }

        /**
         * @param serviceGatewayIp Service Gateway IP (Management interface)
         * 
         * @return builder
         * 
         */
        public Builder serviceGatewayIp(String serviceGatewayIp) {
            return serviceGatewayIp(Output.of(serviceGatewayIp));
        }

        /**
         * @param serviceGatewayIpVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder serviceGatewayIpVariable(@Nullable Output<String> serviceGatewayIpVariable) {
            $.serviceGatewayIpVariable = serviceGatewayIpVariable;
            return this;
        }

        /**
         * @param serviceGatewayIpVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder serviceGatewayIpVariable(String serviceGatewayIpVariable) {
            return serviceGatewayIpVariable(Output.of(serviceGatewayIpVariable));
        }

        /**
         * @param serviceIp Service IP
         * 
         * @return builder
         * 
         */
        public Builder serviceIp(@Nullable Output<String> serviceIp) {
            $.serviceIp = serviceIp;
            return this;
        }

        /**
         * @param serviceIp Service IP
         * 
         * @return builder
         * 
         */
        public Builder serviceIp(String serviceIp) {
            return serviceIp(Output.of(serviceIp));
        }

        /**
         * @param serviceIpVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder serviceIpVariable(@Nullable Output<String> serviceIpVariable) {
            $.serviceIpVariable = serviceIpVariable;
            return this;
        }

        /**
         * @param serviceIpVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder serviceIpVariable(String serviceIpVariable) {
            return serviceIpVariable(Output.of(serviceIpVariable));
        }

        public SecurityAppHostingFeatureTemplateVirtualApplicationArgs build() {
            return $;
        }
    }

}
