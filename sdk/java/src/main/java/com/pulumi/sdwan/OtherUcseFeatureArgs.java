// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.inputs.OtherUcseFeatureInterfaceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OtherUcseFeatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final OtherUcseFeatureArgs Empty = new OtherUcseFeatureArgs();

    /**
     * Dedicated - Default value: `true`
     * 
     */
    @Import(name="accessPortDedicated")
    private @Nullable Output<Boolean> accessPortDedicated;

    /**
     * @return Dedicated - Default value: `true`
     * 
     */
    public Optional<Output<Boolean>> accessPortDedicated() {
        return Optional.ofNullable(this.accessPortDedicated);
    }

    /**
     * , Attribute conditional on `access_port_dedicated` being equal to `false` - Choices: `ge2`, `te2`
     * 
     */
    @Import(name="accessPortSharedFailoverType")
    private @Nullable Output<String> accessPortSharedFailoverType;

    /**
     * @return , Attribute conditional on `access_port_dedicated` being equal to `false` - Choices: `ge2`, `te2`
     * 
     */
    public Optional<Output<String>> accessPortSharedFailoverType() {
        return Optional.ofNullable(this.accessPortSharedFailoverType);
    }

    /**
     * , Attribute conditional on `access_port_dedicated` being equal to `false` - Choices: `ge1`, `ge2`, `ge3`, `te2`, `te3`,
     * `console`, `failover`
     * 
     */
    @Import(name="accessPortSharedType")
    private @Nullable Output<String> accessPortSharedType;

    /**
     * @return , Attribute conditional on `access_port_dedicated` being equal to `false` - Choices: `ge1`, `ge2`, `ge3`, `te2`, `te3`,
     * `console`, `failover`
     * 
     */
    public Optional<Output<String>> accessPortSharedType() {
        return Optional.ofNullable(this.accessPortSharedType);
    }

    /**
     * Assign priority - Range: `0`-`7`
     * 
     */
    @Import(name="assignPriority")
    private @Nullable Output<Integer> assignPriority;

    /**
     * @return Assign priority - Range: `0`-`7`
     * 
     */
    public Optional<Output<Integer>> assignPriority() {
        return Optional.ofNullable(this.assignPriority);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="assignPriorityVariable")
    private @Nullable Output<String> assignPriorityVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> assignPriorityVariable() {
        return Optional.ofNullable(this.assignPriorityVariable);
    }

    /**
     * Bay - Range: `0`-`2`
     * 
     */
    @Import(name="bay", required=true)
    private Output<Integer> bay;

    /**
     * @return Bay - Range: `0`-`2`
     * 
     */
    public Output<Integer> bay() {
        return this.bay;
    }

    /**
     * Assign default gateway
     * 
     */
    @Import(name="defaultGateway")
    private @Nullable Output<String> defaultGateway;

    /**
     * @return Assign default gateway
     * 
     */
    public Optional<Output<String>> defaultGateway() {
        return Optional.ofNullable(this.defaultGateway);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="defaultGatewayVariable")
    private @Nullable Output<String> defaultGatewayVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> defaultGatewayVariable() {
        return Optional.ofNullable(this.defaultGatewayVariable);
    }

    /**
     * The description of the Feature
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Feature
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Feature Profile ID
     * 
     */
    @Import(name="featureProfileId", required=true)
    private Output<String> featureProfileId;

    /**
     * @return Feature Profile ID
     * 
     */
    public Output<String> featureProfileId() {
        return this.featureProfileId;
    }

    /**
     * Interface name: GigabitEthernet0/&lt;&gt;/&lt;&gt; when present
     * 
     */
    @Import(name="interfaces")
    private @Nullable Output<List<OtherUcseFeatureInterfaceArgs>> interfaces;

    /**
     * @return Interface name: GigabitEthernet0/&lt;&gt;/&lt;&gt; when present
     * 
     */
    public Optional<Output<List<OtherUcseFeatureInterfaceArgs>>> interfaces() {
        return Optional.ofNullable(this.interfaces);
    }

    /**
     * Assign IPv4 address
     * 
     */
    @Import(name="ipv4Address")
    private @Nullable Output<String> ipv4Address;

    /**
     * @return Assign IPv4 address
     * 
     */
    public Optional<Output<String>> ipv4Address() {
        return Optional.ofNullable(this.ipv4Address);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="ipv4AddressVariable")
    private @Nullable Output<String> ipv4AddressVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> ipv4AddressVariable() {
        return Optional.ofNullable(this.ipv4AddressVariable);
    }

    /**
     * The name of the Feature
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Feature
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Slot - Range: `0`-`3`
     * 
     */
    @Import(name="slot", required=true)
    private Output<Integer> slot;

    /**
     * @return Slot - Range: `0`-`3`
     * 
     */
    public Output<Integer> slot() {
        return this.slot;
    }

    /**
     * Assign Vlan Id - Range: `2`-`4095`
     * 
     */
    @Import(name="vlanId")
    private @Nullable Output<Integer> vlanId;

    /**
     * @return Assign Vlan Id - Range: `2`-`4095`
     * 
     */
    public Optional<Output<Integer>> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="vlanIdVariable")
    private @Nullable Output<String> vlanIdVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> vlanIdVariable() {
        return Optional.ofNullable(this.vlanIdVariable);
    }

    private OtherUcseFeatureArgs() {}

    private OtherUcseFeatureArgs(OtherUcseFeatureArgs $) {
        this.accessPortDedicated = $.accessPortDedicated;
        this.accessPortSharedFailoverType = $.accessPortSharedFailoverType;
        this.accessPortSharedType = $.accessPortSharedType;
        this.assignPriority = $.assignPriority;
        this.assignPriorityVariable = $.assignPriorityVariable;
        this.bay = $.bay;
        this.defaultGateway = $.defaultGateway;
        this.defaultGatewayVariable = $.defaultGatewayVariable;
        this.description = $.description;
        this.featureProfileId = $.featureProfileId;
        this.interfaces = $.interfaces;
        this.ipv4Address = $.ipv4Address;
        this.ipv4AddressVariable = $.ipv4AddressVariable;
        this.name = $.name;
        this.slot = $.slot;
        this.vlanId = $.vlanId;
        this.vlanIdVariable = $.vlanIdVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OtherUcseFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OtherUcseFeatureArgs $;

        public Builder() {
            $ = new OtherUcseFeatureArgs();
        }

        public Builder(OtherUcseFeatureArgs defaults) {
            $ = new OtherUcseFeatureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPortDedicated Dedicated - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder accessPortDedicated(@Nullable Output<Boolean> accessPortDedicated) {
            $.accessPortDedicated = accessPortDedicated;
            return this;
        }

        /**
         * @param accessPortDedicated Dedicated - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder accessPortDedicated(Boolean accessPortDedicated) {
            return accessPortDedicated(Output.of(accessPortDedicated));
        }

        /**
         * @param accessPortSharedFailoverType , Attribute conditional on `access_port_dedicated` being equal to `false` - Choices: `ge2`, `te2`
         * 
         * @return builder
         * 
         */
        public Builder accessPortSharedFailoverType(@Nullable Output<String> accessPortSharedFailoverType) {
            $.accessPortSharedFailoverType = accessPortSharedFailoverType;
            return this;
        }

        /**
         * @param accessPortSharedFailoverType , Attribute conditional on `access_port_dedicated` being equal to `false` - Choices: `ge2`, `te2`
         * 
         * @return builder
         * 
         */
        public Builder accessPortSharedFailoverType(String accessPortSharedFailoverType) {
            return accessPortSharedFailoverType(Output.of(accessPortSharedFailoverType));
        }

        /**
         * @param accessPortSharedType , Attribute conditional on `access_port_dedicated` being equal to `false` - Choices: `ge1`, `ge2`, `ge3`, `te2`, `te3`,
         * `console`, `failover`
         * 
         * @return builder
         * 
         */
        public Builder accessPortSharedType(@Nullable Output<String> accessPortSharedType) {
            $.accessPortSharedType = accessPortSharedType;
            return this;
        }

        /**
         * @param accessPortSharedType , Attribute conditional on `access_port_dedicated` being equal to `false` - Choices: `ge1`, `ge2`, `ge3`, `te2`, `te3`,
         * `console`, `failover`
         * 
         * @return builder
         * 
         */
        public Builder accessPortSharedType(String accessPortSharedType) {
            return accessPortSharedType(Output.of(accessPortSharedType));
        }

        /**
         * @param assignPriority Assign priority - Range: `0`-`7`
         * 
         * @return builder
         * 
         */
        public Builder assignPriority(@Nullable Output<Integer> assignPriority) {
            $.assignPriority = assignPriority;
            return this;
        }

        /**
         * @param assignPriority Assign priority - Range: `0`-`7`
         * 
         * @return builder
         * 
         */
        public Builder assignPriority(Integer assignPriority) {
            return assignPriority(Output.of(assignPriority));
        }

        /**
         * @param assignPriorityVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder assignPriorityVariable(@Nullable Output<String> assignPriorityVariable) {
            $.assignPriorityVariable = assignPriorityVariable;
            return this;
        }

        /**
         * @param assignPriorityVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder assignPriorityVariable(String assignPriorityVariable) {
            return assignPriorityVariable(Output.of(assignPriorityVariable));
        }

        /**
         * @param bay Bay - Range: `0`-`2`
         * 
         * @return builder
         * 
         */
        public Builder bay(Output<Integer> bay) {
            $.bay = bay;
            return this;
        }

        /**
         * @param bay Bay - Range: `0`-`2`
         * 
         * @return builder
         * 
         */
        public Builder bay(Integer bay) {
            return bay(Output.of(bay));
        }

        /**
         * @param defaultGateway Assign default gateway
         * 
         * @return builder
         * 
         */
        public Builder defaultGateway(@Nullable Output<String> defaultGateway) {
            $.defaultGateway = defaultGateway;
            return this;
        }

        /**
         * @param defaultGateway Assign default gateway
         * 
         * @return builder
         * 
         */
        public Builder defaultGateway(String defaultGateway) {
            return defaultGateway(Output.of(defaultGateway));
        }

        /**
         * @param defaultGatewayVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder defaultGatewayVariable(@Nullable Output<String> defaultGatewayVariable) {
            $.defaultGatewayVariable = defaultGatewayVariable;
            return this;
        }

        /**
         * @param defaultGatewayVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder defaultGatewayVariable(String defaultGatewayVariable) {
            return defaultGatewayVariable(Output.of(defaultGatewayVariable));
        }

        /**
         * @param description The description of the Feature
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Feature
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param featureProfileId Feature Profile ID
         * 
         * @return builder
         * 
         */
        public Builder featureProfileId(Output<String> featureProfileId) {
            $.featureProfileId = featureProfileId;
            return this;
        }

        /**
         * @param featureProfileId Feature Profile ID
         * 
         * @return builder
         * 
         */
        public Builder featureProfileId(String featureProfileId) {
            return featureProfileId(Output.of(featureProfileId));
        }

        /**
         * @param interfaces Interface name: GigabitEthernet0/&lt;&gt;/&lt;&gt; when present
         * 
         * @return builder
         * 
         */
        public Builder interfaces(@Nullable Output<List<OtherUcseFeatureInterfaceArgs>> interfaces) {
            $.interfaces = interfaces;
            return this;
        }

        /**
         * @param interfaces Interface name: GigabitEthernet0/&lt;&gt;/&lt;&gt; when present
         * 
         * @return builder
         * 
         */
        public Builder interfaces(List<OtherUcseFeatureInterfaceArgs> interfaces) {
            return interfaces(Output.of(interfaces));
        }

        /**
         * @param interfaces Interface name: GigabitEthernet0/&lt;&gt;/&lt;&gt; when present
         * 
         * @return builder
         * 
         */
        public Builder interfaces(OtherUcseFeatureInterfaceArgs... interfaces) {
            return interfaces(List.of(interfaces));
        }

        /**
         * @param ipv4Address Assign IPv4 address
         * 
         * @return builder
         * 
         */
        public Builder ipv4Address(@Nullable Output<String> ipv4Address) {
            $.ipv4Address = ipv4Address;
            return this;
        }

        /**
         * @param ipv4Address Assign IPv4 address
         * 
         * @return builder
         * 
         */
        public Builder ipv4Address(String ipv4Address) {
            return ipv4Address(Output.of(ipv4Address));
        }

        /**
         * @param ipv4AddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder ipv4AddressVariable(@Nullable Output<String> ipv4AddressVariable) {
            $.ipv4AddressVariable = ipv4AddressVariable;
            return this;
        }

        /**
         * @param ipv4AddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder ipv4AddressVariable(String ipv4AddressVariable) {
            return ipv4AddressVariable(Output.of(ipv4AddressVariable));
        }

        /**
         * @param name The name of the Feature
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Feature
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param slot Slot - Range: `0`-`3`
         * 
         * @return builder
         * 
         */
        public Builder slot(Output<Integer> slot) {
            $.slot = slot;
            return this;
        }

        /**
         * @param slot Slot - Range: `0`-`3`
         * 
         * @return builder
         * 
         */
        public Builder slot(Integer slot) {
            return slot(Output.of(slot));
        }

        /**
         * @param vlanId Assign Vlan Id - Range: `2`-`4095`
         * 
         * @return builder
         * 
         */
        public Builder vlanId(@Nullable Output<Integer> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        /**
         * @param vlanId Assign Vlan Id - Range: `2`-`4095`
         * 
         * @return builder
         * 
         */
        public Builder vlanId(Integer vlanId) {
            return vlanId(Output.of(vlanId));
        }

        /**
         * @param vlanIdVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder vlanIdVariable(@Nullable Output<String> vlanIdVariable) {
            $.vlanIdVariable = vlanIdVariable;
            return this;
        }

        /**
         * @param vlanIdVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder vlanIdVariable(String vlanIdVariable) {
            return vlanIdVariable(Output.of(vlanIdVariable));
        }

        public OtherUcseFeatureArgs build() {
            if ($.bay == null) {
                throw new MissingRequiredPropertyException("OtherUcseFeatureArgs", "bay");
            }
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("OtherUcseFeatureArgs", "featureProfileId");
            }
            if ($.slot == null) {
                throw new MissingRequiredPropertyException("OtherUcseFeatureArgs", "slot");
            }
            return $;
        }
    }

}
