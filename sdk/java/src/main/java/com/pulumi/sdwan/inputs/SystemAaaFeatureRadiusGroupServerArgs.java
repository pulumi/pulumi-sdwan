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


public final class SystemAaaFeatureRadiusGroupServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final SystemAaaFeatureRadiusGroupServerArgs Empty = new SystemAaaFeatureRadiusGroupServerArgs();

    /**
     * Set Accounting port to use to connect to Radius server
     *   - Range: `1`-`65534`
     *   - Default value: `1813`
     * 
     */
    @Import(name="acctPort")
    private @Nullable Output<Integer> acctPort;

    /**
     * @return Set Accounting port to use to connect to Radius server
     *   - Range: `1`-`65534`
     *   - Default value: `1813`
     * 
     */
    public Optional<Output<Integer>> acctPort() {
        return Optional.ofNullable(this.acctPort);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="acctPortVariable")
    private @Nullable Output<String> acctPortVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> acctPortVariable() {
        return Optional.ofNullable(this.acctPortVariable);
    }

    /**
     * Set IP address of Radius server
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return Set IP address of Radius server
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * Set Authentication port to use to connect to Radius server
     *   - Range: `1`-`65534`
     *   - Default value: `1812`
     * 
     */
    @Import(name="authPort")
    private @Nullable Output<Integer> authPort;

    /**
     * @return Set Authentication port to use to connect to Radius server
     *   - Range: `1`-`65534`
     *   - Default value: `1812`
     * 
     */
    public Optional<Output<Integer>> authPort() {
        return Optional.ofNullable(this.authPort);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="authPortVariable")
    private @Nullable Output<String> authPortVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> authPortVariable() {
        return Optional.ofNullable(this.authPortVariable);
    }

    /**
     * Set the Radius server shared key
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Set the Radius server shared key
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Type of encyption. To be used for type 6
     *   - Choices: `6`, `7`
     * 
     */
    @Import(name="keyEnum")
    private @Nullable Output<String> keyEnum;

    /**
     * @return Type of encyption. To be used for type 6
     *   - Choices: `6`, `7`
     * 
     */
    public Optional<Output<String>> keyEnum() {
        return Optional.ofNullable(this.keyEnum);
    }

    /**
     * key type
     *   - Choices: `key`, `pac`
     *   - Default value: `key`
     * 
     */
    @Import(name="keyType")
    private @Nullable Output<String> keyType;

    /**
     * @return key type
     *   - Choices: `key`, `pac`
     *   - Default value: `key`
     * 
     */
    public Optional<Output<String>> keyType() {
        return Optional.ofNullable(this.keyType);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="keyTypeVariable")
    private @Nullable Output<String> keyTypeVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> keyTypeVariable() {
        return Optional.ofNullable(this.keyTypeVariable);
    }

    /**
     * Configure how many times to contact this Radius server
     *   - Range: `1`-`100`
     *   - Default value: `3`
     * 
     */
    @Import(name="retransmit")
    private @Nullable Output<Integer> retransmit;

    /**
     * @return Configure how many times to contact this Radius server
     *   - Range: `1`-`100`
     *   - Default value: `3`
     * 
     */
    public Optional<Output<Integer>> retransmit() {
        return Optional.ofNullable(this.retransmit);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="retransmitVariable")
    private @Nullable Output<String> retransmitVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> retransmitVariable() {
        return Optional.ofNullable(this.retransmitVariable);
    }

    /**
     * Set the Radius server shared type 7 encrypted key
     * 
     */
    @Import(name="secretKey")
    private @Nullable Output<String> secretKey;

    /**
     * @return Set the Radius server shared type 7 encrypted key
     * 
     */
    public Optional<Output<String>> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="secretKeyVariable")
    private @Nullable Output<String> secretKeyVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> secretKeyVariable() {
        return Optional.ofNullable(this.secretKeyVariable);
    }

    /**
     * Configure how long to wait for replies from the Radius server
     *   - Range: `1`-`1000`
     *   - Default value: `5`
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return Configure how long to wait for replies from the Radius server
     *   - Range: `1`-`1000`
     *   - Default value: `5`
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="timeoutVariable")
    private @Nullable Output<String> timeoutVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> timeoutVariable() {
        return Optional.ofNullable(this.timeoutVariable);
    }

    private SystemAaaFeatureRadiusGroupServerArgs() {}

    private SystemAaaFeatureRadiusGroupServerArgs(SystemAaaFeatureRadiusGroupServerArgs $) {
        this.acctPort = $.acctPort;
        this.acctPortVariable = $.acctPortVariable;
        this.address = $.address;
        this.authPort = $.authPort;
        this.authPortVariable = $.authPortVariable;
        this.key = $.key;
        this.keyEnum = $.keyEnum;
        this.keyType = $.keyType;
        this.keyTypeVariable = $.keyTypeVariable;
        this.retransmit = $.retransmit;
        this.retransmitVariable = $.retransmitVariable;
        this.secretKey = $.secretKey;
        this.secretKeyVariable = $.secretKeyVariable;
        this.timeout = $.timeout;
        this.timeoutVariable = $.timeoutVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SystemAaaFeatureRadiusGroupServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SystemAaaFeatureRadiusGroupServerArgs $;

        public Builder() {
            $ = new SystemAaaFeatureRadiusGroupServerArgs();
        }

        public Builder(SystemAaaFeatureRadiusGroupServerArgs defaults) {
            $ = new SystemAaaFeatureRadiusGroupServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acctPort Set Accounting port to use to connect to Radius server
         *   - Range: `1`-`65534`
         *   - Default value: `1813`
         * 
         * @return builder
         * 
         */
        public Builder acctPort(@Nullable Output<Integer> acctPort) {
            $.acctPort = acctPort;
            return this;
        }

        /**
         * @param acctPort Set Accounting port to use to connect to Radius server
         *   - Range: `1`-`65534`
         *   - Default value: `1813`
         * 
         * @return builder
         * 
         */
        public Builder acctPort(Integer acctPort) {
            return acctPort(Output.of(acctPort));
        }

        /**
         * @param acctPortVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder acctPortVariable(@Nullable Output<String> acctPortVariable) {
            $.acctPortVariable = acctPortVariable;
            return this;
        }

        /**
         * @param acctPortVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder acctPortVariable(String acctPortVariable) {
            return acctPortVariable(Output.of(acctPortVariable));
        }

        /**
         * @param address Set IP address of Radius server
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address Set IP address of Radius server
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param authPort Set Authentication port to use to connect to Radius server
         *   - Range: `1`-`65534`
         *   - Default value: `1812`
         * 
         * @return builder
         * 
         */
        public Builder authPort(@Nullable Output<Integer> authPort) {
            $.authPort = authPort;
            return this;
        }

        /**
         * @param authPort Set Authentication port to use to connect to Radius server
         *   - Range: `1`-`65534`
         *   - Default value: `1812`
         * 
         * @return builder
         * 
         */
        public Builder authPort(Integer authPort) {
            return authPort(Output.of(authPort));
        }

        /**
         * @param authPortVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder authPortVariable(@Nullable Output<String> authPortVariable) {
            $.authPortVariable = authPortVariable;
            return this;
        }

        /**
         * @param authPortVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder authPortVariable(String authPortVariable) {
            return authPortVariable(Output.of(authPortVariable));
        }

        /**
         * @param key Set the Radius server shared key
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Set the Radius server shared key
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param keyEnum Type of encyption. To be used for type 6
         *   - Choices: `6`, `7`
         * 
         * @return builder
         * 
         */
        public Builder keyEnum(@Nullable Output<String> keyEnum) {
            $.keyEnum = keyEnum;
            return this;
        }

        /**
         * @param keyEnum Type of encyption. To be used for type 6
         *   - Choices: `6`, `7`
         * 
         * @return builder
         * 
         */
        public Builder keyEnum(String keyEnum) {
            return keyEnum(Output.of(keyEnum));
        }

        /**
         * @param keyType key type
         *   - Choices: `key`, `pac`
         *   - Default value: `key`
         * 
         * @return builder
         * 
         */
        public Builder keyType(@Nullable Output<String> keyType) {
            $.keyType = keyType;
            return this;
        }

        /**
         * @param keyType key type
         *   - Choices: `key`, `pac`
         *   - Default value: `key`
         * 
         * @return builder
         * 
         */
        public Builder keyType(String keyType) {
            return keyType(Output.of(keyType));
        }

        /**
         * @param keyTypeVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder keyTypeVariable(@Nullable Output<String> keyTypeVariable) {
            $.keyTypeVariable = keyTypeVariable;
            return this;
        }

        /**
         * @param keyTypeVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder keyTypeVariable(String keyTypeVariable) {
            return keyTypeVariable(Output.of(keyTypeVariable));
        }

        /**
         * @param retransmit Configure how many times to contact this Radius server
         *   - Range: `1`-`100`
         *   - Default value: `3`
         * 
         * @return builder
         * 
         */
        public Builder retransmit(@Nullable Output<Integer> retransmit) {
            $.retransmit = retransmit;
            return this;
        }

        /**
         * @param retransmit Configure how many times to contact this Radius server
         *   - Range: `1`-`100`
         *   - Default value: `3`
         * 
         * @return builder
         * 
         */
        public Builder retransmit(Integer retransmit) {
            return retransmit(Output.of(retransmit));
        }

        /**
         * @param retransmitVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder retransmitVariable(@Nullable Output<String> retransmitVariable) {
            $.retransmitVariable = retransmitVariable;
            return this;
        }

        /**
         * @param retransmitVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder retransmitVariable(String retransmitVariable) {
            return retransmitVariable(Output.of(retransmitVariable));
        }

        /**
         * @param secretKey Set the Radius server shared type 7 encrypted key
         * 
         * @return builder
         * 
         */
        public Builder secretKey(@Nullable Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey Set the Radius server shared type 7 encrypted key
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        /**
         * @param secretKeyVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder secretKeyVariable(@Nullable Output<String> secretKeyVariable) {
            $.secretKeyVariable = secretKeyVariable;
            return this;
        }

        /**
         * @param secretKeyVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder secretKeyVariable(String secretKeyVariable) {
            return secretKeyVariable(Output.of(secretKeyVariable));
        }

        /**
         * @param timeout Configure how long to wait for replies from the Radius server
         *   - Range: `1`-`1000`
         *   - Default value: `5`
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Configure how long to wait for replies from the Radius server
         *   - Range: `1`-`1000`
         *   - Default value: `5`
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param timeoutVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder timeoutVariable(@Nullable Output<String> timeoutVariable) {
            $.timeoutVariable = timeoutVariable;
            return this;
        }

        /**
         * @param timeoutVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder timeoutVariable(String timeoutVariable) {
            return timeoutVariable(Output.of(timeoutVariable));
        }

        public SystemAaaFeatureRadiusGroupServerArgs build() {
            return $;
        }
    }

}
