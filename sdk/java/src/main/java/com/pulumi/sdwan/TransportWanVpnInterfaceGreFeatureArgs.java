// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransportWanVpnInterfaceGreFeatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransportWanVpnInterfaceGreFeatureArgs Empty = new TransportWanVpnInterfaceGreFeatureArgs();

    /**
     * Enable Application Tunnel Type - Choices: `none`, `sig`
     * 
     */
    @Import(name="applicationTunnelType")
    private @Nullable Output<String> applicationTunnelType;

    /**
     * @return Enable Application Tunnel Type - Choices: `none`, `sig`
     * 
     */
    public Optional<Output<String>> applicationTunnelType() {
        return Optional.ofNullable(this.applicationTunnelType);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="applicationTunnelTypeVariable")
    private @Nullable Output<String> applicationTunnelTypeVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> applicationTunnelTypeVariable() {
        return Optional.ofNullable(this.applicationTunnelTypeVariable);
    }

    /**
     * Enable clear dont fragment (Currently Only SDWAN Tunnel Interface) - Default value: `false`
     * 
     */
    @Import(name="clearDontFragment")
    private @Nullable Output<Boolean> clearDontFragment;

    /**
     * @return Enable clear dont fragment (Currently Only SDWAN Tunnel Interface) - Default value: `false`
     * 
     */
    public Optional<Output<Boolean>> clearDontFragment() {
        return Optional.ofNullable(this.clearDontFragment);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="clearDontFragmentVariable")
    private @Nullable Output<String> clearDontFragmentVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> clearDontFragmentVariable() {
        return Optional.ofNullable(this.clearDontFragmentVariable);
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
     * Interface description
     * 
     */
    @Import(name="interfaceDescription")
    private @Nullable Output<String> interfaceDescription;

    /**
     * @return Interface description
     * 
     */
    public Optional<Output<String>> interfaceDescription() {
        return Optional.ofNullable(this.interfaceDescription);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="interfaceDescriptionVariable")
    private @Nullable Output<String> interfaceDescriptionVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> interfaceDescriptionVariable() {
        return Optional.ofNullable(this.interfaceDescriptionVariable);
    }

    /**
     * Interface name (1..255)
     * 
     */
    @Import(name="interfaceName")
    private @Nullable Output<String> interfaceName;

    /**
     * @return Interface name (1..255)
     * 
     */
    public Optional<Output<String>> interfaceName() {
        return Optional.ofNullable(this.interfaceName);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="interfaceNameVariable")
    private @Nullable Output<String> interfaceNameVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> interfaceNameVariable() {
        return Optional.ofNullable(this.interfaceNameVariable);
    }

    /**
     * Interface MTU &lt;576..9976&gt;, in bytes - Range: `576`-`9976` - Default value: `1500`
     * 
     */
    @Import(name="ipMtu")
    private @Nullable Output<Integer> ipMtu;

    /**
     * @return Interface MTU &lt;576..9976&gt;, in bytes - Range: `576`-`9976` - Default value: `1500`
     * 
     */
    public Optional<Output<Integer>> ipMtu() {
        return Optional.ofNullable(this.ipMtu);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="ipMtuVariable")
    private @Nullable Output<String> ipMtuVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> ipMtuVariable() {
        return Optional.ofNullable(this.ipMtuVariable);
    }

    @Import(name="ipv4Address")
    private @Nullable Output<String> ipv4Address;

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
     * - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
     *   `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`,
     *   `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`,
     *   `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`,
     *   `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
     * 
     */
    @Import(name="ipv4SubnetMask")
    private @Nullable Output<String> ipv4SubnetMask;

    /**
     * @return - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
     * `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`,
     * `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`,
     * `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`,
     * `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
     * 
     */
    public Optional<Output<String>> ipv4SubnetMask() {
        return Optional.ofNullable(this.ipv4SubnetMask);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="ipv4SubnetMaskVariable")
    private @Nullable Output<String> ipv4SubnetMaskVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> ipv4SubnetMaskVariable() {
        return Optional.ofNullable(this.ipv4SubnetMaskVariable);
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
     * Administrative state - Default value: `false`
     * 
     */
    @Import(name="shutdown")
    private @Nullable Output<Boolean> shutdown;

    /**
     * @return Administrative state - Default value: `false`
     * 
     */
    public Optional<Output<Boolean>> shutdown() {
        return Optional.ofNullable(this.shutdown);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="shutdownVariable")
    private @Nullable Output<String> shutdownVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> shutdownVariable() {
        return Optional.ofNullable(this.shutdownVariable);
    }

    /**
     * TCP MSS on SYN packets, in bytes - Range: `500`-`1460`
     * 
     */
    @Import(name="tcpMss")
    private @Nullable Output<Integer> tcpMss;

    /**
     * @return TCP MSS on SYN packets, in bytes - Range: `500`-`1460`
     * 
     */
    public Optional<Output<Integer>> tcpMss() {
        return Optional.ofNullable(this.tcpMss);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="tcpMssVariable")
    private @Nullable Output<String> tcpMssVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> tcpMssVariable() {
        return Optional.ofNullable(this.tcpMssVariable);
    }

    /**
     * Transport WAN VPN Feature ID
     * 
     */
    @Import(name="transportWanVpnFeatureId")
    private @Nullable Output<String> transportWanVpnFeatureId;

    /**
     * @return Transport WAN VPN Feature ID
     * 
     */
    public Optional<Output<String>> transportWanVpnFeatureId() {
        return Optional.ofNullable(this.transportWanVpnFeatureId);
    }

    /**
     * Tunnel destination IP Address
     * 
     */
    @Import(name="tunnelDestinationIpv4Address")
    private @Nullable Output<String> tunnelDestinationIpv4Address;

    /**
     * @return Tunnel destination IP Address
     * 
     */
    public Optional<Output<String>> tunnelDestinationIpv4Address() {
        return Optional.ofNullable(this.tunnelDestinationIpv4Address);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="tunnelDestinationIpv4AddressVariable")
    private @Nullable Output<String> tunnelDestinationIpv4AddressVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> tunnelDestinationIpv4AddressVariable() {
        return Optional.ofNullable(this.tunnelDestinationIpv4AddressVariable);
    }

    /**
     * &lt;1..32 characters&gt; Interface name, can&#39;t be Loopback interface
     * 
     */
    @Import(name="tunnelRouteViaLoopback")
    private @Nullable Output<String> tunnelRouteViaLoopback;

    /**
     * @return &lt;1..32 characters&gt; Interface name, can&#39;t be Loopback interface
     * 
     */
    public Optional<Output<String>> tunnelRouteViaLoopback() {
        return Optional.ofNullable(this.tunnelRouteViaLoopback);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="tunnelRouteViaLoopbackVariable")
    private @Nullable Output<String> tunnelRouteViaLoopbackVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> tunnelRouteViaLoopbackVariable() {
        return Optional.ofNullable(this.tunnelRouteViaLoopbackVariable);
    }

    /**
     * &lt;1..32 characters&gt; Interface name
     * 
     */
    @Import(name="tunnelSourceInterface")
    private @Nullable Output<String> tunnelSourceInterface;

    /**
     * @return &lt;1..32 characters&gt; Interface name
     * 
     */
    public Optional<Output<String>> tunnelSourceInterface() {
        return Optional.ofNullable(this.tunnelSourceInterface);
    }

    /**
     * &lt;1..32 characters&gt; Interface name
     * 
     */
    @Import(name="tunnelSourceInterfaceLoopback")
    private @Nullable Output<String> tunnelSourceInterfaceLoopback;

    /**
     * @return &lt;1..32 characters&gt; Interface name
     * 
     */
    public Optional<Output<String>> tunnelSourceInterfaceLoopback() {
        return Optional.ofNullable(this.tunnelSourceInterfaceLoopback);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="tunnelSourceInterfaceLoopbackVariable")
    private @Nullable Output<String> tunnelSourceInterfaceLoopbackVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> tunnelSourceInterfaceLoopbackVariable() {
        return Optional.ofNullable(this.tunnelSourceInterfaceLoopbackVariable);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="tunnelSourceInterfaceVariable")
    private @Nullable Output<String> tunnelSourceInterfaceVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> tunnelSourceInterfaceVariable() {
        return Optional.ofNullable(this.tunnelSourceInterfaceVariable);
    }

    /**
     * Tunnel source IP Address
     * 
     */
    @Import(name="tunnelSourceIpv4Address")
    private @Nullable Output<String> tunnelSourceIpv4Address;

    /**
     * @return Tunnel source IP Address
     * 
     */
    public Optional<Output<String>> tunnelSourceIpv4Address() {
        return Optional.ofNullable(this.tunnelSourceIpv4Address);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="tunnelSourceIpv4AddressVariable")
    private @Nullable Output<String> tunnelSourceIpv4AddressVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> tunnelSourceIpv4AddressVariable() {
        return Optional.ofNullable(this.tunnelSourceIpv4AddressVariable);
    }

    private TransportWanVpnInterfaceGreFeatureArgs() {}

    private TransportWanVpnInterfaceGreFeatureArgs(TransportWanVpnInterfaceGreFeatureArgs $) {
        this.applicationTunnelType = $.applicationTunnelType;
        this.applicationTunnelTypeVariable = $.applicationTunnelTypeVariable;
        this.clearDontFragment = $.clearDontFragment;
        this.clearDontFragmentVariable = $.clearDontFragmentVariable;
        this.description = $.description;
        this.featureProfileId = $.featureProfileId;
        this.interfaceDescription = $.interfaceDescription;
        this.interfaceDescriptionVariable = $.interfaceDescriptionVariable;
        this.interfaceName = $.interfaceName;
        this.interfaceNameVariable = $.interfaceNameVariable;
        this.ipMtu = $.ipMtu;
        this.ipMtuVariable = $.ipMtuVariable;
        this.ipv4Address = $.ipv4Address;
        this.ipv4AddressVariable = $.ipv4AddressVariable;
        this.ipv4SubnetMask = $.ipv4SubnetMask;
        this.ipv4SubnetMaskVariable = $.ipv4SubnetMaskVariable;
        this.name = $.name;
        this.shutdown = $.shutdown;
        this.shutdownVariable = $.shutdownVariable;
        this.tcpMss = $.tcpMss;
        this.tcpMssVariable = $.tcpMssVariable;
        this.transportWanVpnFeatureId = $.transportWanVpnFeatureId;
        this.tunnelDestinationIpv4Address = $.tunnelDestinationIpv4Address;
        this.tunnelDestinationIpv4AddressVariable = $.tunnelDestinationIpv4AddressVariable;
        this.tunnelRouteViaLoopback = $.tunnelRouteViaLoopback;
        this.tunnelRouteViaLoopbackVariable = $.tunnelRouteViaLoopbackVariable;
        this.tunnelSourceInterface = $.tunnelSourceInterface;
        this.tunnelSourceInterfaceLoopback = $.tunnelSourceInterfaceLoopback;
        this.tunnelSourceInterfaceLoopbackVariable = $.tunnelSourceInterfaceLoopbackVariable;
        this.tunnelSourceInterfaceVariable = $.tunnelSourceInterfaceVariable;
        this.tunnelSourceIpv4Address = $.tunnelSourceIpv4Address;
        this.tunnelSourceIpv4AddressVariable = $.tunnelSourceIpv4AddressVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransportWanVpnInterfaceGreFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransportWanVpnInterfaceGreFeatureArgs $;

        public Builder() {
            $ = new TransportWanVpnInterfaceGreFeatureArgs();
        }

        public Builder(TransportWanVpnInterfaceGreFeatureArgs defaults) {
            $ = new TransportWanVpnInterfaceGreFeatureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationTunnelType Enable Application Tunnel Type - Choices: `none`, `sig`
         * 
         * @return builder
         * 
         */
        public Builder applicationTunnelType(@Nullable Output<String> applicationTunnelType) {
            $.applicationTunnelType = applicationTunnelType;
            return this;
        }

        /**
         * @param applicationTunnelType Enable Application Tunnel Type - Choices: `none`, `sig`
         * 
         * @return builder
         * 
         */
        public Builder applicationTunnelType(String applicationTunnelType) {
            return applicationTunnelType(Output.of(applicationTunnelType));
        }

        /**
         * @param applicationTunnelTypeVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder applicationTunnelTypeVariable(@Nullable Output<String> applicationTunnelTypeVariable) {
            $.applicationTunnelTypeVariable = applicationTunnelTypeVariable;
            return this;
        }

        /**
         * @param applicationTunnelTypeVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder applicationTunnelTypeVariable(String applicationTunnelTypeVariable) {
            return applicationTunnelTypeVariable(Output.of(applicationTunnelTypeVariable));
        }

        /**
         * @param clearDontFragment Enable clear dont fragment (Currently Only SDWAN Tunnel Interface) - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder clearDontFragment(@Nullable Output<Boolean> clearDontFragment) {
            $.clearDontFragment = clearDontFragment;
            return this;
        }

        /**
         * @param clearDontFragment Enable clear dont fragment (Currently Only SDWAN Tunnel Interface) - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder clearDontFragment(Boolean clearDontFragment) {
            return clearDontFragment(Output.of(clearDontFragment));
        }

        /**
         * @param clearDontFragmentVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder clearDontFragmentVariable(@Nullable Output<String> clearDontFragmentVariable) {
            $.clearDontFragmentVariable = clearDontFragmentVariable;
            return this;
        }

        /**
         * @param clearDontFragmentVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder clearDontFragmentVariable(String clearDontFragmentVariable) {
            return clearDontFragmentVariable(Output.of(clearDontFragmentVariable));
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
         * @param interfaceDescription Interface description
         * 
         * @return builder
         * 
         */
        public Builder interfaceDescription(@Nullable Output<String> interfaceDescription) {
            $.interfaceDescription = interfaceDescription;
            return this;
        }

        /**
         * @param interfaceDescription Interface description
         * 
         * @return builder
         * 
         */
        public Builder interfaceDescription(String interfaceDescription) {
            return interfaceDescription(Output.of(interfaceDescription));
        }

        /**
         * @param interfaceDescriptionVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder interfaceDescriptionVariable(@Nullable Output<String> interfaceDescriptionVariable) {
            $.interfaceDescriptionVariable = interfaceDescriptionVariable;
            return this;
        }

        /**
         * @param interfaceDescriptionVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder interfaceDescriptionVariable(String interfaceDescriptionVariable) {
            return interfaceDescriptionVariable(Output.of(interfaceDescriptionVariable));
        }

        /**
         * @param interfaceName Interface name (1..255)
         * 
         * @return builder
         * 
         */
        public Builder interfaceName(@Nullable Output<String> interfaceName) {
            $.interfaceName = interfaceName;
            return this;
        }

        /**
         * @param interfaceName Interface name (1..255)
         * 
         * @return builder
         * 
         */
        public Builder interfaceName(String interfaceName) {
            return interfaceName(Output.of(interfaceName));
        }

        /**
         * @param interfaceNameVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder interfaceNameVariable(@Nullable Output<String> interfaceNameVariable) {
            $.interfaceNameVariable = interfaceNameVariable;
            return this;
        }

        /**
         * @param interfaceNameVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder interfaceNameVariable(String interfaceNameVariable) {
            return interfaceNameVariable(Output.of(interfaceNameVariable));
        }

        /**
         * @param ipMtu Interface MTU &lt;576..9976&gt;, in bytes - Range: `576`-`9976` - Default value: `1500`
         * 
         * @return builder
         * 
         */
        public Builder ipMtu(@Nullable Output<Integer> ipMtu) {
            $.ipMtu = ipMtu;
            return this;
        }

        /**
         * @param ipMtu Interface MTU &lt;576..9976&gt;, in bytes - Range: `576`-`9976` - Default value: `1500`
         * 
         * @return builder
         * 
         */
        public Builder ipMtu(Integer ipMtu) {
            return ipMtu(Output.of(ipMtu));
        }

        /**
         * @param ipMtuVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder ipMtuVariable(@Nullable Output<String> ipMtuVariable) {
            $.ipMtuVariable = ipMtuVariable;
            return this;
        }

        /**
         * @param ipMtuVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder ipMtuVariable(String ipMtuVariable) {
            return ipMtuVariable(Output.of(ipMtuVariable));
        }

        public Builder ipv4Address(@Nullable Output<String> ipv4Address) {
            $.ipv4Address = ipv4Address;
            return this;
        }

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
         * @param ipv4SubnetMask - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
         * `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`,
         * `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`,
         * `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`,
         * `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
         * 
         * @return builder
         * 
         */
        public Builder ipv4SubnetMask(@Nullable Output<String> ipv4SubnetMask) {
            $.ipv4SubnetMask = ipv4SubnetMask;
            return this;
        }

        /**
         * @param ipv4SubnetMask - Choices: `255.255.255.255`, `255.255.255.254`, `255.255.255.252`, `255.255.255.248`, `255.255.255.240`,
         * `255.255.255.224`, `255.255.255.192`, `255.255.255.128`, `255.255.255.0`, `255.255.254.0`, `255.255.252.0`,
         * `255.255.248.0`, `255.255.240.0`, `255.255.224.0`, `255.255.192.0`, `255.255.128.0`, `255.255.0.0`, `255.254.0.0`,
         * `255.252.0.0`, `255.240.0.0`, `255.224.0.0`, `255.192.0.0`, `255.128.0.0`, `255.0.0.0`, `254.0.0.0`, `252.0.0.0`,
         * `248.0.0.0`, `240.0.0.0`, `224.0.0.0`, `192.0.0.0`, `128.0.0.0`, `0.0.0.0`
         * 
         * @return builder
         * 
         */
        public Builder ipv4SubnetMask(String ipv4SubnetMask) {
            return ipv4SubnetMask(Output.of(ipv4SubnetMask));
        }

        /**
         * @param ipv4SubnetMaskVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder ipv4SubnetMaskVariable(@Nullable Output<String> ipv4SubnetMaskVariable) {
            $.ipv4SubnetMaskVariable = ipv4SubnetMaskVariable;
            return this;
        }

        /**
         * @param ipv4SubnetMaskVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder ipv4SubnetMaskVariable(String ipv4SubnetMaskVariable) {
            return ipv4SubnetMaskVariable(Output.of(ipv4SubnetMaskVariable));
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
         * @param shutdown Administrative state - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder shutdown(@Nullable Output<Boolean> shutdown) {
            $.shutdown = shutdown;
            return this;
        }

        /**
         * @param shutdown Administrative state - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder shutdown(Boolean shutdown) {
            return shutdown(Output.of(shutdown));
        }

        /**
         * @param shutdownVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder shutdownVariable(@Nullable Output<String> shutdownVariable) {
            $.shutdownVariable = shutdownVariable;
            return this;
        }

        /**
         * @param shutdownVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder shutdownVariable(String shutdownVariable) {
            return shutdownVariable(Output.of(shutdownVariable));
        }

        /**
         * @param tcpMss TCP MSS on SYN packets, in bytes - Range: `500`-`1460`
         * 
         * @return builder
         * 
         */
        public Builder tcpMss(@Nullable Output<Integer> tcpMss) {
            $.tcpMss = tcpMss;
            return this;
        }

        /**
         * @param tcpMss TCP MSS on SYN packets, in bytes - Range: `500`-`1460`
         * 
         * @return builder
         * 
         */
        public Builder tcpMss(Integer tcpMss) {
            return tcpMss(Output.of(tcpMss));
        }

        /**
         * @param tcpMssVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder tcpMssVariable(@Nullable Output<String> tcpMssVariable) {
            $.tcpMssVariable = tcpMssVariable;
            return this;
        }

        /**
         * @param tcpMssVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder tcpMssVariable(String tcpMssVariable) {
            return tcpMssVariable(Output.of(tcpMssVariable));
        }

        /**
         * @param transportWanVpnFeatureId Transport WAN VPN Feature ID
         * 
         * @return builder
         * 
         */
        public Builder transportWanVpnFeatureId(@Nullable Output<String> transportWanVpnFeatureId) {
            $.transportWanVpnFeatureId = transportWanVpnFeatureId;
            return this;
        }

        /**
         * @param transportWanVpnFeatureId Transport WAN VPN Feature ID
         * 
         * @return builder
         * 
         */
        public Builder transportWanVpnFeatureId(String transportWanVpnFeatureId) {
            return transportWanVpnFeatureId(Output.of(transportWanVpnFeatureId));
        }

        /**
         * @param tunnelDestinationIpv4Address Tunnel destination IP Address
         * 
         * @return builder
         * 
         */
        public Builder tunnelDestinationIpv4Address(@Nullable Output<String> tunnelDestinationIpv4Address) {
            $.tunnelDestinationIpv4Address = tunnelDestinationIpv4Address;
            return this;
        }

        /**
         * @param tunnelDestinationIpv4Address Tunnel destination IP Address
         * 
         * @return builder
         * 
         */
        public Builder tunnelDestinationIpv4Address(String tunnelDestinationIpv4Address) {
            return tunnelDestinationIpv4Address(Output.of(tunnelDestinationIpv4Address));
        }

        /**
         * @param tunnelDestinationIpv4AddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder tunnelDestinationIpv4AddressVariable(@Nullable Output<String> tunnelDestinationIpv4AddressVariable) {
            $.tunnelDestinationIpv4AddressVariable = tunnelDestinationIpv4AddressVariable;
            return this;
        }

        /**
         * @param tunnelDestinationIpv4AddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder tunnelDestinationIpv4AddressVariable(String tunnelDestinationIpv4AddressVariable) {
            return tunnelDestinationIpv4AddressVariable(Output.of(tunnelDestinationIpv4AddressVariable));
        }

        /**
         * @param tunnelRouteViaLoopback &lt;1..32 characters&gt; Interface name, can&#39;t be Loopback interface
         * 
         * @return builder
         * 
         */
        public Builder tunnelRouteViaLoopback(@Nullable Output<String> tunnelRouteViaLoopback) {
            $.tunnelRouteViaLoopback = tunnelRouteViaLoopback;
            return this;
        }

        /**
         * @param tunnelRouteViaLoopback &lt;1..32 characters&gt; Interface name, can&#39;t be Loopback interface
         * 
         * @return builder
         * 
         */
        public Builder tunnelRouteViaLoopback(String tunnelRouteViaLoopback) {
            return tunnelRouteViaLoopback(Output.of(tunnelRouteViaLoopback));
        }

        /**
         * @param tunnelRouteViaLoopbackVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder tunnelRouteViaLoopbackVariable(@Nullable Output<String> tunnelRouteViaLoopbackVariable) {
            $.tunnelRouteViaLoopbackVariable = tunnelRouteViaLoopbackVariable;
            return this;
        }

        /**
         * @param tunnelRouteViaLoopbackVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder tunnelRouteViaLoopbackVariable(String tunnelRouteViaLoopbackVariable) {
            return tunnelRouteViaLoopbackVariable(Output.of(tunnelRouteViaLoopbackVariable));
        }

        /**
         * @param tunnelSourceInterface &lt;1..32 characters&gt; Interface name
         * 
         * @return builder
         * 
         */
        public Builder tunnelSourceInterface(@Nullable Output<String> tunnelSourceInterface) {
            $.tunnelSourceInterface = tunnelSourceInterface;
            return this;
        }

        /**
         * @param tunnelSourceInterface &lt;1..32 characters&gt; Interface name
         * 
         * @return builder
         * 
         */
        public Builder tunnelSourceInterface(String tunnelSourceInterface) {
            return tunnelSourceInterface(Output.of(tunnelSourceInterface));
        }

        /**
         * @param tunnelSourceInterfaceLoopback &lt;1..32 characters&gt; Interface name
         * 
         * @return builder
         * 
         */
        public Builder tunnelSourceInterfaceLoopback(@Nullable Output<String> tunnelSourceInterfaceLoopback) {
            $.tunnelSourceInterfaceLoopback = tunnelSourceInterfaceLoopback;
            return this;
        }

        /**
         * @param tunnelSourceInterfaceLoopback &lt;1..32 characters&gt; Interface name
         * 
         * @return builder
         * 
         */
        public Builder tunnelSourceInterfaceLoopback(String tunnelSourceInterfaceLoopback) {
            return tunnelSourceInterfaceLoopback(Output.of(tunnelSourceInterfaceLoopback));
        }

        /**
         * @param tunnelSourceInterfaceLoopbackVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder tunnelSourceInterfaceLoopbackVariable(@Nullable Output<String> tunnelSourceInterfaceLoopbackVariable) {
            $.tunnelSourceInterfaceLoopbackVariable = tunnelSourceInterfaceLoopbackVariable;
            return this;
        }

        /**
         * @param tunnelSourceInterfaceLoopbackVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder tunnelSourceInterfaceLoopbackVariable(String tunnelSourceInterfaceLoopbackVariable) {
            return tunnelSourceInterfaceLoopbackVariable(Output.of(tunnelSourceInterfaceLoopbackVariable));
        }

        /**
         * @param tunnelSourceInterfaceVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder tunnelSourceInterfaceVariable(@Nullable Output<String> tunnelSourceInterfaceVariable) {
            $.tunnelSourceInterfaceVariable = tunnelSourceInterfaceVariable;
            return this;
        }

        /**
         * @param tunnelSourceInterfaceVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder tunnelSourceInterfaceVariable(String tunnelSourceInterfaceVariable) {
            return tunnelSourceInterfaceVariable(Output.of(tunnelSourceInterfaceVariable));
        }

        /**
         * @param tunnelSourceIpv4Address Tunnel source IP Address
         * 
         * @return builder
         * 
         */
        public Builder tunnelSourceIpv4Address(@Nullable Output<String> tunnelSourceIpv4Address) {
            $.tunnelSourceIpv4Address = tunnelSourceIpv4Address;
            return this;
        }

        /**
         * @param tunnelSourceIpv4Address Tunnel source IP Address
         * 
         * @return builder
         * 
         */
        public Builder tunnelSourceIpv4Address(String tunnelSourceIpv4Address) {
            return tunnelSourceIpv4Address(Output.of(tunnelSourceIpv4Address));
        }

        /**
         * @param tunnelSourceIpv4AddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder tunnelSourceIpv4AddressVariable(@Nullable Output<String> tunnelSourceIpv4AddressVariable) {
            $.tunnelSourceIpv4AddressVariable = tunnelSourceIpv4AddressVariable;
            return this;
        }

        /**
         * @param tunnelSourceIpv4AddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder tunnelSourceIpv4AddressVariable(String tunnelSourceIpv4AddressVariable) {
            return tunnelSourceIpv4AddressVariable(Output.of(tunnelSourceIpv4AddressVariable));
        }

        public TransportWanVpnInterfaceGreFeatureArgs build() {
            if ($.featureProfileId == null) {
                throw new MissingRequiredPropertyException("TransportWanVpnInterfaceGreFeatureArgs", "featureProfileId");
            }
            return $;
        }
    }

}