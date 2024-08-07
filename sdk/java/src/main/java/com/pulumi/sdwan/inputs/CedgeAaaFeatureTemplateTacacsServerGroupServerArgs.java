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


public final class CedgeAaaFeatureTemplateTacacsServerGroupServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final CedgeAaaFeatureTemplateTacacsServerGroupServerArgs Empty = new CedgeAaaFeatureTemplateTacacsServerGroupServerArgs();

    /**
     * Set IP address of TACACS server
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return Set IP address of TACACS server
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * Type of encyption. To be used for type 6
     *   - Choices: `6`, `7`
     * 
     */
    @Import(name="encryptionType")
    private @Nullable Output<String> encryptionType;

    /**
     * @return Type of encyption. To be used for type 6
     *   - Choices: `6`, `7`
     * 
     */
    public Optional<Output<String>> encryptionType() {
        return Optional.ofNullable(this.encryptionType);
    }

    /**
     * Set the TACACS server shared key
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Set the TACACS server shared key
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
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
     * TACACS Port
     *   - Range: `1`-`65535`
     *   - Default value: `49`
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return TACACS Port
     *   - Range: `1`-`65535`
     *   - Default value: `49`
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
     * Set the TACACS server shared type 7 encrypted key
     * 
     */
    @Import(name="secretKey")
    private @Nullable Output<String> secretKey;

    /**
     * @return Set the TACACS server shared type 7 encrypted key
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
     * Configure how long to wait for replies from the TACACS server
     *   - Range: `1`-`1000`
     *   - Default value: `5`
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return Configure how long to wait for replies from the TACACS server
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

    private CedgeAaaFeatureTemplateTacacsServerGroupServerArgs() {}

    private CedgeAaaFeatureTemplateTacacsServerGroupServerArgs(CedgeAaaFeatureTemplateTacacsServerGroupServerArgs $) {
        this.address = $.address;
        this.encryptionType = $.encryptionType;
        this.key = $.key;
        this.optional = $.optional;
        this.port = $.port;
        this.portVariable = $.portVariable;
        this.secretKey = $.secretKey;
        this.secretKeyVariable = $.secretKeyVariable;
        this.timeout = $.timeout;
        this.timeoutVariable = $.timeoutVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CedgeAaaFeatureTemplateTacacsServerGroupServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CedgeAaaFeatureTemplateTacacsServerGroupServerArgs $;

        public Builder() {
            $ = new CedgeAaaFeatureTemplateTacacsServerGroupServerArgs();
        }

        public Builder(CedgeAaaFeatureTemplateTacacsServerGroupServerArgs defaults) {
            $ = new CedgeAaaFeatureTemplateTacacsServerGroupServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address Set IP address of TACACS server
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address Set IP address of TACACS server
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param encryptionType Type of encyption. To be used for type 6
         *   - Choices: `6`, `7`
         * 
         * @return builder
         * 
         */
        public Builder encryptionType(@Nullable Output<String> encryptionType) {
            $.encryptionType = encryptionType;
            return this;
        }

        /**
         * @param encryptionType Type of encyption. To be used for type 6
         *   - Choices: `6`, `7`
         * 
         * @return builder
         * 
         */
        public Builder encryptionType(String encryptionType) {
            return encryptionType(Output.of(encryptionType));
        }

        /**
         * @param key Set the TACACS server shared key
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Set the TACACS server shared key
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
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
         * @param port TACACS Port
         *   - Range: `1`-`65535`
         *   - Default value: `49`
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port TACACS Port
         *   - Range: `1`-`65535`
         *   - Default value: `49`
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
         * @param secretKey Set the TACACS server shared type 7 encrypted key
         * 
         * @return builder
         * 
         */
        public Builder secretKey(@Nullable Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey Set the TACACS server shared type 7 encrypted key
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
         * @param timeout Configure how long to wait for replies from the TACACS server
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
         * @param timeout Configure how long to wait for replies from the TACACS server
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

        public CedgeAaaFeatureTemplateTacacsServerGroupServerArgs build() {
            return $;
        }
    }

}
