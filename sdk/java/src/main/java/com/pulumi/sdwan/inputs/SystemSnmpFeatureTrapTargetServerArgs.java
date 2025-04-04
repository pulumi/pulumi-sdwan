// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SystemSnmpFeatureTrapTargetServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final SystemSnmpFeatureTrapTargetServerArgs Empty = new SystemSnmpFeatureTrapTargetServerArgs();

    /**
     * Set IPv4/IPv6 address of SNMP server
     * 
     */
    @Import(name="ip")
    private @Nullable Output<String> ip;

    /**
     * @return Set IPv4/IPv6 address of SNMP server
     * 
     */
    public Optional<Output<String>> ip() {
        return Optional.ofNullable(this.ip);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="ipVariable")
    private @Nullable Output<String> ipVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> ipVariable() {
        return Optional.ofNullable(this.ipVariable);
    }

    /**
     * Set UDP port number to connect to SNMP server
     *   - Range: `1`-`65535`
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return Set UDP port number to connect to SNMP server
     *   - Range: `1`-`65535`
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="portVariable")
    private @Nullable Output<String> portVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> portVariable() {
        return Optional.ofNullable(this.portVariable);
    }

    /**
     * Source interface for outgoing SNMP traps
     * 
     */
    @Import(name="sourceInterface")
    private @Nullable Output<String> sourceInterface;

    /**
     * @return Source interface for outgoing SNMP traps
     * 
     */
    public Optional<Output<String>> sourceInterface() {
        return Optional.ofNullable(this.sourceInterface);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="sourceInterfaceVariable")
    private @Nullable Output<String> sourceInterfaceVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> sourceInterfaceVariable() {
        return Optional.ofNullable(this.sourceInterfaceVariable);
    }

    /**
     * Set name of the SNMP user
     * 
     */
    @Import(name="user")
    private @Nullable Output<String> user;

    /**
     * @return Set name of the SNMP user
     * 
     */
    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    /**
     * Set user label of the SNMP community
     * 
     */
    @Import(name="userLabel")
    private @Nullable Output<String> userLabel;

    /**
     * @return Set user label of the SNMP community
     * 
     */
    public Optional<Output<String>> userLabel() {
        return Optional.ofNullable(this.userLabel);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="userVariable")
    private @Nullable Output<String> userVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> userVariable() {
        return Optional.ofNullable(this.userVariable);
    }

    /**
     * Set VPN in which SNMP server is located
     *   - Range: `0`-`65530`
     * 
     */
    @Import(name="vpnId")
    private @Nullable Output<Integer> vpnId;

    /**
     * @return Set VPN in which SNMP server is located
     *   - Range: `0`-`65530`
     * 
     */
    public Optional<Output<Integer>> vpnId() {
        return Optional.ofNullable(this.vpnId);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="vpnIdVariable")
    private @Nullable Output<String> vpnIdVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> vpnIdVariable() {
        return Optional.ofNullable(this.vpnIdVariable);
    }

    private SystemSnmpFeatureTrapTargetServerArgs() {}

    private SystemSnmpFeatureTrapTargetServerArgs(SystemSnmpFeatureTrapTargetServerArgs $) {
        this.ip = $.ip;
        this.ipVariable = $.ipVariable;
        this.port = $.port;
        this.portVariable = $.portVariable;
        this.sourceInterface = $.sourceInterface;
        this.sourceInterfaceVariable = $.sourceInterfaceVariable;
        this.user = $.user;
        this.userLabel = $.userLabel;
        this.userVariable = $.userVariable;
        this.vpnId = $.vpnId;
        this.vpnIdVariable = $.vpnIdVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SystemSnmpFeatureTrapTargetServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SystemSnmpFeatureTrapTargetServerArgs $;

        public Builder() {
            $ = new SystemSnmpFeatureTrapTargetServerArgs();
        }

        public Builder(SystemSnmpFeatureTrapTargetServerArgs defaults) {
            $ = new SystemSnmpFeatureTrapTargetServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ip Set IPv4/IPv6 address of SNMP server
         * 
         * @return builder
         * 
         */
        public Builder ip(@Nullable Output<String> ip) {
            $.ip = ip;
            return this;
        }

        /**
         * @param ip Set IPv4/IPv6 address of SNMP server
         * 
         * @return builder
         * 
         */
        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        /**
         * @param ipVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder ipVariable(@Nullable Output<String> ipVariable) {
            $.ipVariable = ipVariable;
            return this;
        }

        /**
         * @param ipVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder ipVariable(String ipVariable) {
            return ipVariable(Output.of(ipVariable));
        }

        /**
         * @param port Set UDP port number to connect to SNMP server
         *   - Range: `1`-`65535`
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Set UDP port number to connect to SNMP server
         *   - Range: `1`-`65535`
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param portVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder portVariable(@Nullable Output<String> portVariable) {
            $.portVariable = portVariable;
            return this;
        }

        /**
         * @param portVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder portVariable(String portVariable) {
            return portVariable(Output.of(portVariable));
        }

        /**
         * @param sourceInterface Source interface for outgoing SNMP traps
         * 
         * @return builder
         * 
         */
        public Builder sourceInterface(@Nullable Output<String> sourceInterface) {
            $.sourceInterface = sourceInterface;
            return this;
        }

        /**
         * @param sourceInterface Source interface for outgoing SNMP traps
         * 
         * @return builder
         * 
         */
        public Builder sourceInterface(String sourceInterface) {
            return sourceInterface(Output.of(sourceInterface));
        }

        /**
         * @param sourceInterfaceVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder sourceInterfaceVariable(@Nullable Output<String> sourceInterfaceVariable) {
            $.sourceInterfaceVariable = sourceInterfaceVariable;
            return this;
        }

        /**
         * @param sourceInterfaceVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder sourceInterfaceVariable(String sourceInterfaceVariable) {
            return sourceInterfaceVariable(Output.of(sourceInterfaceVariable));
        }

        /**
         * @param user Set name of the SNMP user
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user Set name of the SNMP user
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        /**
         * @param userLabel Set user label of the SNMP community
         * 
         * @return builder
         * 
         */
        public Builder userLabel(@Nullable Output<String> userLabel) {
            $.userLabel = userLabel;
            return this;
        }

        /**
         * @param userLabel Set user label of the SNMP community
         * 
         * @return builder
         * 
         */
        public Builder userLabel(String userLabel) {
            return userLabel(Output.of(userLabel));
        }

        /**
         * @param userVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder userVariable(@Nullable Output<String> userVariable) {
            $.userVariable = userVariable;
            return this;
        }

        /**
         * @param userVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder userVariable(String userVariable) {
            return userVariable(Output.of(userVariable));
        }

        /**
         * @param vpnId Set VPN in which SNMP server is located
         *   - Range: `0`-`65530`
         * 
         * @return builder
         * 
         */
        public Builder vpnId(@Nullable Output<Integer> vpnId) {
            $.vpnId = vpnId;
            return this;
        }

        /**
         * @param vpnId Set VPN in which SNMP server is located
         *   - Range: `0`-`65530`
         * 
         * @return builder
         * 
         */
        public Builder vpnId(Integer vpnId) {
            return vpnId(Output.of(vpnId));
        }

        /**
         * @param vpnIdVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder vpnIdVariable(@Nullable Output<String> vpnIdVariable) {
            $.vpnIdVariable = vpnIdVariable;
            return this;
        }

        /**
         * @param vpnIdVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder vpnIdVariable(String vpnIdVariable) {
            return vpnIdVariable(Output.of(vpnIdVariable));
        }

        public SystemSnmpFeatureTrapTargetServerArgs build() {
            return $;
        }
    }

}
