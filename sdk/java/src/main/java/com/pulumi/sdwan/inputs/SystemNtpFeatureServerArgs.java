// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SystemNtpFeatureServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final SystemNtpFeatureServerArgs Empty = new SystemNtpFeatureServerArgs();

    /**
     * Set authentication key for the server
     *   - Range: `1`-`65535`
     * 
     */
    @Import(name="authenticationKey")
    private @Nullable Output<Integer> authenticationKey;

    /**
     * @return Set authentication key for the server
     *   - Range: `1`-`65535`
     * 
     */
    public Optional<Output<Integer>> authenticationKey() {
        return Optional.ofNullable(this.authenticationKey);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="authenticationKeyVariable")
    private @Nullable Output<String> authenticationKeyVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> authenticationKeyVariable() {
        return Optional.ofNullable(this.authenticationKeyVariable);
    }

    /**
     * Set hostname or IP address of server
     * 
     */
    @Import(name="hostnameIpAddress")
    private @Nullable Output<String> hostnameIpAddress;

    /**
     * @return Set hostname or IP address of server
     * 
     */
    public Optional<Output<String>> hostnameIpAddress() {
        return Optional.ofNullable(this.hostnameIpAddress);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="hostnameIpAddressVariable")
    private @Nullable Output<String> hostnameIpAddressVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> hostnameIpAddressVariable() {
        return Optional.ofNullable(this.hostnameIpAddressVariable);
    }

    /**
     * Set NTP version
     *   - Range: `1`-`4`
     *   - Default value: `4`
     * 
     */
    @Import(name="ntpVersion")
    private @Nullable Output<Integer> ntpVersion;

    /**
     * @return Set NTP version
     *   - Range: `1`-`4`
     *   - Default value: `4`
     * 
     */
    public Optional<Output<Integer>> ntpVersion() {
        return Optional.ofNullable(this.ntpVersion);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="ntpVersionVariable")
    private @Nullable Output<String> ntpVersionVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> ntpVersionVariable() {
        return Optional.ofNullable(this.ntpVersionVariable);
    }

    /**
     * Prefer this NTP server
     *   - Default value: `false`
     * 
     */
    @Import(name="preferThisNtpServer")
    private @Nullable Output<Boolean> preferThisNtpServer;

    /**
     * @return Prefer this NTP server
     *   - Default value: `false`
     * 
     */
    public Optional<Output<Boolean>> preferThisNtpServer() {
        return Optional.ofNullable(this.preferThisNtpServer);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="preferThisNtpServerVariable")
    private @Nullable Output<String> preferThisNtpServerVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> preferThisNtpServerVariable() {
        return Optional.ofNullable(this.preferThisNtpServerVariable);
    }

    /**
     * Set interface to use to reach NTP server
     * 
     */
    @Import(name="sourceInterface")
    private @Nullable Output<String> sourceInterface;

    /**
     * @return Set interface to use to reach NTP server
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
     * Set VPN in which NTP server is located
     *   - Range: `0`-`65530`
     *   - Default value: `0`
     * 
     */
    @Import(name="vpn")
    private @Nullable Output<Integer> vpn;

    /**
     * @return Set VPN in which NTP server is located
     *   - Range: `0`-`65530`
     *   - Default value: `0`
     * 
     */
    public Optional<Output<Integer>> vpn() {
        return Optional.ofNullable(this.vpn);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="vpnVariable")
    private @Nullable Output<String> vpnVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> vpnVariable() {
        return Optional.ofNullable(this.vpnVariable);
    }

    private SystemNtpFeatureServerArgs() {}

    private SystemNtpFeatureServerArgs(SystemNtpFeatureServerArgs $) {
        this.authenticationKey = $.authenticationKey;
        this.authenticationKeyVariable = $.authenticationKeyVariable;
        this.hostnameIpAddress = $.hostnameIpAddress;
        this.hostnameIpAddressVariable = $.hostnameIpAddressVariable;
        this.ntpVersion = $.ntpVersion;
        this.ntpVersionVariable = $.ntpVersionVariable;
        this.preferThisNtpServer = $.preferThisNtpServer;
        this.preferThisNtpServerVariable = $.preferThisNtpServerVariable;
        this.sourceInterface = $.sourceInterface;
        this.sourceInterfaceVariable = $.sourceInterfaceVariable;
        this.vpn = $.vpn;
        this.vpnVariable = $.vpnVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SystemNtpFeatureServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SystemNtpFeatureServerArgs $;

        public Builder() {
            $ = new SystemNtpFeatureServerArgs();
        }

        public Builder(SystemNtpFeatureServerArgs defaults) {
            $ = new SystemNtpFeatureServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationKey Set authentication key for the server
         *   - Range: `1`-`65535`
         * 
         * @return builder
         * 
         */
        public Builder authenticationKey(@Nullable Output<Integer> authenticationKey) {
            $.authenticationKey = authenticationKey;
            return this;
        }

        /**
         * @param authenticationKey Set authentication key for the server
         *   - Range: `1`-`65535`
         * 
         * @return builder
         * 
         */
        public Builder authenticationKey(Integer authenticationKey) {
            return authenticationKey(Output.of(authenticationKey));
        }

        /**
         * @param authenticationKeyVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder authenticationKeyVariable(@Nullable Output<String> authenticationKeyVariable) {
            $.authenticationKeyVariable = authenticationKeyVariable;
            return this;
        }

        /**
         * @param authenticationKeyVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder authenticationKeyVariable(String authenticationKeyVariable) {
            return authenticationKeyVariable(Output.of(authenticationKeyVariable));
        }

        /**
         * @param hostnameIpAddress Set hostname or IP address of server
         * 
         * @return builder
         * 
         */
        public Builder hostnameIpAddress(@Nullable Output<String> hostnameIpAddress) {
            $.hostnameIpAddress = hostnameIpAddress;
            return this;
        }

        /**
         * @param hostnameIpAddress Set hostname or IP address of server
         * 
         * @return builder
         * 
         */
        public Builder hostnameIpAddress(String hostnameIpAddress) {
            return hostnameIpAddress(Output.of(hostnameIpAddress));
        }

        /**
         * @param hostnameIpAddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder hostnameIpAddressVariable(@Nullable Output<String> hostnameIpAddressVariable) {
            $.hostnameIpAddressVariable = hostnameIpAddressVariable;
            return this;
        }

        /**
         * @param hostnameIpAddressVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder hostnameIpAddressVariable(String hostnameIpAddressVariable) {
            return hostnameIpAddressVariable(Output.of(hostnameIpAddressVariable));
        }

        /**
         * @param ntpVersion Set NTP version
         *   - Range: `1`-`4`
         *   - Default value: `4`
         * 
         * @return builder
         * 
         */
        public Builder ntpVersion(@Nullable Output<Integer> ntpVersion) {
            $.ntpVersion = ntpVersion;
            return this;
        }

        /**
         * @param ntpVersion Set NTP version
         *   - Range: `1`-`4`
         *   - Default value: `4`
         * 
         * @return builder
         * 
         */
        public Builder ntpVersion(Integer ntpVersion) {
            return ntpVersion(Output.of(ntpVersion));
        }

        /**
         * @param ntpVersionVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder ntpVersionVariable(@Nullable Output<String> ntpVersionVariable) {
            $.ntpVersionVariable = ntpVersionVariable;
            return this;
        }

        /**
         * @param ntpVersionVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder ntpVersionVariable(String ntpVersionVariable) {
            return ntpVersionVariable(Output.of(ntpVersionVariable));
        }

        /**
         * @param preferThisNtpServer Prefer this NTP server
         *   - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder preferThisNtpServer(@Nullable Output<Boolean> preferThisNtpServer) {
            $.preferThisNtpServer = preferThisNtpServer;
            return this;
        }

        /**
         * @param preferThisNtpServer Prefer this NTP server
         *   - Default value: `false`
         * 
         * @return builder
         * 
         */
        public Builder preferThisNtpServer(Boolean preferThisNtpServer) {
            return preferThisNtpServer(Output.of(preferThisNtpServer));
        }

        /**
         * @param preferThisNtpServerVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder preferThisNtpServerVariable(@Nullable Output<String> preferThisNtpServerVariable) {
            $.preferThisNtpServerVariable = preferThisNtpServerVariable;
            return this;
        }

        /**
         * @param preferThisNtpServerVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder preferThisNtpServerVariable(String preferThisNtpServerVariable) {
            return preferThisNtpServerVariable(Output.of(preferThisNtpServerVariable));
        }

        /**
         * @param sourceInterface Set interface to use to reach NTP server
         * 
         * @return builder
         * 
         */
        public Builder sourceInterface(@Nullable Output<String> sourceInterface) {
            $.sourceInterface = sourceInterface;
            return this;
        }

        /**
         * @param sourceInterface Set interface to use to reach NTP server
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
         * @param vpn Set VPN in which NTP server is located
         *   - Range: `0`-`65530`
         *   - Default value: `0`
         * 
         * @return builder
         * 
         */
        public Builder vpn(@Nullable Output<Integer> vpn) {
            $.vpn = vpn;
            return this;
        }

        /**
         * @param vpn Set VPN in which NTP server is located
         *   - Range: `0`-`65530`
         *   - Default value: `0`
         * 
         * @return builder
         * 
         */
        public Builder vpn(Integer vpn) {
            return vpn(Output.of(vpn));
        }

        /**
         * @param vpnVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder vpnVariable(@Nullable Output<String> vpnVariable) {
            $.vpnVariable = vpnVariable;
            return this;
        }

        /**
         * @param vpnVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder vpnVariable(String vpnVariable) {
            return vpnVariable(Output.of(vpnVariable));
        }

        public SystemNtpFeatureServerArgs build() {
            return $;
        }
    }

}