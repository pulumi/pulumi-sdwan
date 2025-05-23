// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.inputs.LocalizedPolicyDefinitionArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LocalizedPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final LocalizedPolicyArgs Empty = new LocalizedPolicyArgs();

    /**
     * IPv4 application visibility - Default value: `true`
     * 
     */
    @Import(name="applicationVisibilityIpv4")
    private @Nullable Output<Boolean> applicationVisibilityIpv4;

    /**
     * @return IPv4 application visibility - Default value: `true`
     * 
     */
    public Optional<Output<Boolean>> applicationVisibilityIpv4() {
        return Optional.ofNullable(this.applicationVisibilityIpv4);
    }

    /**
     * IPv6 application visibility - Default value: `true`
     * 
     */
    @Import(name="applicationVisibilityIpv6")
    private @Nullable Output<Boolean> applicationVisibilityIpv6;

    /**
     * @return IPv6 application visibility - Default value: `true`
     * 
     */
    public Optional<Output<Boolean>> applicationVisibilityIpv6() {
        return Optional.ofNullable(this.applicationVisibilityIpv6);
    }

    /**
     * Cloud QoS - Default value: `true`
     * 
     */
    @Import(name="cloudQos")
    private @Nullable Output<Boolean> cloudQos;

    /**
     * @return Cloud QoS - Default value: `true`
     * 
     */
    public Optional<Output<Boolean>> cloudQos() {
        return Optional.ofNullable(this.cloudQos);
    }

    /**
     * Cloud QoS service side - Default value: `true`
     * 
     */
    @Import(name="cloudQosServiceSide")
    private @Nullable Output<Boolean> cloudQosServiceSide;

    /**
     * @return Cloud QoS service side - Default value: `true`
     * 
     */
    public Optional<Output<Boolean>> cloudQosServiceSide() {
        return Optional.ofNullable(this.cloudQosServiceSide);
    }

    /**
     * List of policy definitions
     * 
     */
    @Import(name="definitions")
    private @Nullable Output<List<LocalizedPolicyDefinitionArgs>> definitions;

    /**
     * @return List of policy definitions
     * 
     */
    public Optional<Output<List<LocalizedPolicyDefinitionArgs>>> definitions() {
        return Optional.ofNullable(this.definitions);
    }

    /**
     * The description of the localized policy
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return The description of the localized policy
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * IPv4 flow visibility - Default value: `true`
     * 
     */
    @Import(name="flowVisibilityIpv4")
    private @Nullable Output<Boolean> flowVisibilityIpv4;

    /**
     * @return IPv4 flow visibility - Default value: `true`
     * 
     */
    public Optional<Output<Boolean>> flowVisibilityIpv4() {
        return Optional.ofNullable(this.flowVisibilityIpv4);
    }

    /**
     * IPv6 flow visibility - Default value: `true`
     * 
     */
    @Import(name="flowVisibilityIpv6")
    private @Nullable Output<Boolean> flowVisibilityIpv6;

    /**
     * @return IPv6 flow visibility - Default value: `true`
     * 
     */
    public Optional<Output<Boolean>> flowVisibilityIpv6() {
        return Optional.ofNullable(this.flowVisibilityIpv6);
    }

    /**
     * Implicit ACL logging - Default value: `true`
     * 
     */
    @Import(name="implicitAclLogging")
    private @Nullable Output<Boolean> implicitAclLogging;

    /**
     * @return Implicit ACL logging - Default value: `true`
     * 
     */
    public Optional<Output<Boolean>> implicitAclLogging() {
        return Optional.ofNullable(this.implicitAclLogging);
    }

    /**
     * IPv4 visibility cache entries - Range: `16`-`2000000`
     * 
     */
    @Import(name="ipv4VisibilityCacheEntries")
    private @Nullable Output<Integer> ipv4VisibilityCacheEntries;

    /**
     * @return IPv4 visibility cache entries - Range: `16`-`2000000`
     * 
     */
    public Optional<Output<Integer>> ipv4VisibilityCacheEntries() {
        return Optional.ofNullable(this.ipv4VisibilityCacheEntries);
    }

    /**
     * IPv6 visibility cache entries - Range: `16`-`2000000`
     * 
     */
    @Import(name="ipv6VisibilityCacheEntries")
    private @Nullable Output<Integer> ipv6VisibilityCacheEntries;

    /**
     * @return IPv6 visibility cache entries - Range: `16`-`2000000`
     * 
     */
    public Optional<Output<Integer>> ipv6VisibilityCacheEntries() {
        return Optional.ofNullable(this.ipv6VisibilityCacheEntries);
    }

    /**
     * Log frequency - Range: `1`-`2147483647`
     * 
     */
    @Import(name="logFrequency")
    private @Nullable Output<Integer> logFrequency;

    /**
     * @return Log frequency - Range: `1`-`2147483647`
     * 
     */
    public Optional<Output<Integer>> logFrequency() {
        return Optional.ofNullable(this.logFrequency);
    }

    /**
     * The name of the localized policy
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the localized policy
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private LocalizedPolicyArgs() {}

    private LocalizedPolicyArgs(LocalizedPolicyArgs $) {
        this.applicationVisibilityIpv4 = $.applicationVisibilityIpv4;
        this.applicationVisibilityIpv6 = $.applicationVisibilityIpv6;
        this.cloudQos = $.cloudQos;
        this.cloudQosServiceSide = $.cloudQosServiceSide;
        this.definitions = $.definitions;
        this.description = $.description;
        this.flowVisibilityIpv4 = $.flowVisibilityIpv4;
        this.flowVisibilityIpv6 = $.flowVisibilityIpv6;
        this.implicitAclLogging = $.implicitAclLogging;
        this.ipv4VisibilityCacheEntries = $.ipv4VisibilityCacheEntries;
        this.ipv6VisibilityCacheEntries = $.ipv6VisibilityCacheEntries;
        this.logFrequency = $.logFrequency;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocalizedPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocalizedPolicyArgs $;

        public Builder() {
            $ = new LocalizedPolicyArgs();
        }

        public Builder(LocalizedPolicyArgs defaults) {
            $ = new LocalizedPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationVisibilityIpv4 IPv4 application visibility - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder applicationVisibilityIpv4(@Nullable Output<Boolean> applicationVisibilityIpv4) {
            $.applicationVisibilityIpv4 = applicationVisibilityIpv4;
            return this;
        }

        /**
         * @param applicationVisibilityIpv4 IPv4 application visibility - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder applicationVisibilityIpv4(Boolean applicationVisibilityIpv4) {
            return applicationVisibilityIpv4(Output.of(applicationVisibilityIpv4));
        }

        /**
         * @param applicationVisibilityIpv6 IPv6 application visibility - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder applicationVisibilityIpv6(@Nullable Output<Boolean> applicationVisibilityIpv6) {
            $.applicationVisibilityIpv6 = applicationVisibilityIpv6;
            return this;
        }

        /**
         * @param applicationVisibilityIpv6 IPv6 application visibility - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder applicationVisibilityIpv6(Boolean applicationVisibilityIpv6) {
            return applicationVisibilityIpv6(Output.of(applicationVisibilityIpv6));
        }

        /**
         * @param cloudQos Cloud QoS - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder cloudQos(@Nullable Output<Boolean> cloudQos) {
            $.cloudQos = cloudQos;
            return this;
        }

        /**
         * @param cloudQos Cloud QoS - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder cloudQos(Boolean cloudQos) {
            return cloudQos(Output.of(cloudQos));
        }

        /**
         * @param cloudQosServiceSide Cloud QoS service side - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder cloudQosServiceSide(@Nullable Output<Boolean> cloudQosServiceSide) {
            $.cloudQosServiceSide = cloudQosServiceSide;
            return this;
        }

        /**
         * @param cloudQosServiceSide Cloud QoS service side - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder cloudQosServiceSide(Boolean cloudQosServiceSide) {
            return cloudQosServiceSide(Output.of(cloudQosServiceSide));
        }

        /**
         * @param definitions List of policy definitions
         * 
         * @return builder
         * 
         */
        public Builder definitions(@Nullable Output<List<LocalizedPolicyDefinitionArgs>> definitions) {
            $.definitions = definitions;
            return this;
        }

        /**
         * @param definitions List of policy definitions
         * 
         * @return builder
         * 
         */
        public Builder definitions(List<LocalizedPolicyDefinitionArgs> definitions) {
            return definitions(Output.of(definitions));
        }

        /**
         * @param definitions List of policy definitions
         * 
         * @return builder
         * 
         */
        public Builder definitions(LocalizedPolicyDefinitionArgs... definitions) {
            return definitions(List.of(definitions));
        }

        /**
         * @param description The description of the localized policy
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the localized policy
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param flowVisibilityIpv4 IPv4 flow visibility - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder flowVisibilityIpv4(@Nullable Output<Boolean> flowVisibilityIpv4) {
            $.flowVisibilityIpv4 = flowVisibilityIpv4;
            return this;
        }

        /**
         * @param flowVisibilityIpv4 IPv4 flow visibility - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder flowVisibilityIpv4(Boolean flowVisibilityIpv4) {
            return flowVisibilityIpv4(Output.of(flowVisibilityIpv4));
        }

        /**
         * @param flowVisibilityIpv6 IPv6 flow visibility - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder flowVisibilityIpv6(@Nullable Output<Boolean> flowVisibilityIpv6) {
            $.flowVisibilityIpv6 = flowVisibilityIpv6;
            return this;
        }

        /**
         * @param flowVisibilityIpv6 IPv6 flow visibility - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder flowVisibilityIpv6(Boolean flowVisibilityIpv6) {
            return flowVisibilityIpv6(Output.of(flowVisibilityIpv6));
        }

        /**
         * @param implicitAclLogging Implicit ACL logging - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder implicitAclLogging(@Nullable Output<Boolean> implicitAclLogging) {
            $.implicitAclLogging = implicitAclLogging;
            return this;
        }

        /**
         * @param implicitAclLogging Implicit ACL logging - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder implicitAclLogging(Boolean implicitAclLogging) {
            return implicitAclLogging(Output.of(implicitAclLogging));
        }

        /**
         * @param ipv4VisibilityCacheEntries IPv4 visibility cache entries - Range: `16`-`2000000`
         * 
         * @return builder
         * 
         */
        public Builder ipv4VisibilityCacheEntries(@Nullable Output<Integer> ipv4VisibilityCacheEntries) {
            $.ipv4VisibilityCacheEntries = ipv4VisibilityCacheEntries;
            return this;
        }

        /**
         * @param ipv4VisibilityCacheEntries IPv4 visibility cache entries - Range: `16`-`2000000`
         * 
         * @return builder
         * 
         */
        public Builder ipv4VisibilityCacheEntries(Integer ipv4VisibilityCacheEntries) {
            return ipv4VisibilityCacheEntries(Output.of(ipv4VisibilityCacheEntries));
        }

        /**
         * @param ipv6VisibilityCacheEntries IPv6 visibility cache entries - Range: `16`-`2000000`
         * 
         * @return builder
         * 
         */
        public Builder ipv6VisibilityCacheEntries(@Nullable Output<Integer> ipv6VisibilityCacheEntries) {
            $.ipv6VisibilityCacheEntries = ipv6VisibilityCacheEntries;
            return this;
        }

        /**
         * @param ipv6VisibilityCacheEntries IPv6 visibility cache entries - Range: `16`-`2000000`
         * 
         * @return builder
         * 
         */
        public Builder ipv6VisibilityCacheEntries(Integer ipv6VisibilityCacheEntries) {
            return ipv6VisibilityCacheEntries(Output.of(ipv6VisibilityCacheEntries));
        }

        /**
         * @param logFrequency Log frequency - Range: `1`-`2147483647`
         * 
         * @return builder
         * 
         */
        public Builder logFrequency(@Nullable Output<Integer> logFrequency) {
            $.logFrequency = logFrequency;
            return this;
        }

        /**
         * @param logFrequency Log frequency - Range: `1`-`2147483647`
         * 
         * @return builder
         * 
         */
        public Builder logFrequency(Integer logFrequency) {
            return logFrequency(Output.of(logFrequency));
        }

        /**
         * @param name The name of the localized policy
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the localized policy
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public LocalizedPolicyArgs build() {
            if ($.description == null) {
                throw new MissingRequiredPropertyException("LocalizedPolicyArgs", "description");
            }
            return $;
        }
    }

}
