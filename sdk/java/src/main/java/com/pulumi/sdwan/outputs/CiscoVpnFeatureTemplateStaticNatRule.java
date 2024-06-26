// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CiscoVpnFeatureTemplateStaticNatRule {
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private @Nullable Boolean optional;
    /**
     * @return NAT Pool Name, natpool1..31
     * 
     */
    private @Nullable Integer poolName;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String poolNameVariable;
    /**
     * @return Source IP address to be translated
     * 
     */
    private @Nullable String sourceIp;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String sourceIpVariable;
    /**
     * @return Direction of static NAT translation
     *   - Choices: `inside`, `outside`
     * 
     */
    private @Nullable String staticNatDirection;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String staticNatDirectionVariable;
    /**
     * @return Add Object/Object Group Tracker
     *   - Range: `1`-`1000`
     * 
     */
    private @Nullable Integer trackerId;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String trackerIdVariable;
    /**
     * @return Statically translated source IP address
     * 
     */
    private @Nullable String translateIp;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String translateIpVariable;

    private CiscoVpnFeatureTemplateStaticNatRule() {}
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Optional<Boolean> optional() {
        return Optional.ofNullable(this.optional);
    }
    /**
     * @return NAT Pool Name, natpool1..31
     * 
     */
    public Optional<Integer> poolName() {
        return Optional.ofNullable(this.poolName);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> poolNameVariable() {
        return Optional.ofNullable(this.poolNameVariable);
    }
    /**
     * @return Source IP address to be translated
     * 
     */
    public Optional<String> sourceIp() {
        return Optional.ofNullable(this.sourceIp);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> sourceIpVariable() {
        return Optional.ofNullable(this.sourceIpVariable);
    }
    /**
     * @return Direction of static NAT translation
     *   - Choices: `inside`, `outside`
     * 
     */
    public Optional<String> staticNatDirection() {
        return Optional.ofNullable(this.staticNatDirection);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> staticNatDirectionVariable() {
        return Optional.ofNullable(this.staticNatDirectionVariable);
    }
    /**
     * @return Add Object/Object Group Tracker
     *   - Range: `1`-`1000`
     * 
     */
    public Optional<Integer> trackerId() {
        return Optional.ofNullable(this.trackerId);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> trackerIdVariable() {
        return Optional.ofNullable(this.trackerIdVariable);
    }
    /**
     * @return Statically translated source IP address
     * 
     */
    public Optional<String> translateIp() {
        return Optional.ofNullable(this.translateIp);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> translateIpVariable() {
        return Optional.ofNullable(this.translateIpVariable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CiscoVpnFeatureTemplateStaticNatRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean optional;
        private @Nullable Integer poolName;
        private @Nullable String poolNameVariable;
        private @Nullable String sourceIp;
        private @Nullable String sourceIpVariable;
        private @Nullable String staticNatDirection;
        private @Nullable String staticNatDirectionVariable;
        private @Nullable Integer trackerId;
        private @Nullable String trackerIdVariable;
        private @Nullable String translateIp;
        private @Nullable String translateIpVariable;
        public Builder() {}
        public Builder(CiscoVpnFeatureTemplateStaticNatRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.optional = defaults.optional;
    	      this.poolName = defaults.poolName;
    	      this.poolNameVariable = defaults.poolNameVariable;
    	      this.sourceIp = defaults.sourceIp;
    	      this.sourceIpVariable = defaults.sourceIpVariable;
    	      this.staticNatDirection = defaults.staticNatDirection;
    	      this.staticNatDirectionVariable = defaults.staticNatDirectionVariable;
    	      this.trackerId = defaults.trackerId;
    	      this.trackerIdVariable = defaults.trackerIdVariable;
    	      this.translateIp = defaults.translateIp;
    	      this.translateIpVariable = defaults.translateIpVariable;
        }

        @CustomType.Setter
        public Builder optional(@Nullable Boolean optional) {

            this.optional = optional;
            return this;
        }
        @CustomType.Setter
        public Builder poolName(@Nullable Integer poolName) {

            this.poolName = poolName;
            return this;
        }
        @CustomType.Setter
        public Builder poolNameVariable(@Nullable String poolNameVariable) {

            this.poolNameVariable = poolNameVariable;
            return this;
        }
        @CustomType.Setter
        public Builder sourceIp(@Nullable String sourceIp) {

            this.sourceIp = sourceIp;
            return this;
        }
        @CustomType.Setter
        public Builder sourceIpVariable(@Nullable String sourceIpVariable) {

            this.sourceIpVariable = sourceIpVariable;
            return this;
        }
        @CustomType.Setter
        public Builder staticNatDirection(@Nullable String staticNatDirection) {

            this.staticNatDirection = staticNatDirection;
            return this;
        }
        @CustomType.Setter
        public Builder staticNatDirectionVariable(@Nullable String staticNatDirectionVariable) {

            this.staticNatDirectionVariable = staticNatDirectionVariable;
            return this;
        }
        @CustomType.Setter
        public Builder trackerId(@Nullable Integer trackerId) {

            this.trackerId = trackerId;
            return this;
        }
        @CustomType.Setter
        public Builder trackerIdVariable(@Nullable String trackerIdVariable) {

            this.trackerIdVariable = trackerIdVariable;
            return this;
        }
        @CustomType.Setter
        public Builder translateIp(@Nullable String translateIp) {

            this.translateIp = translateIp;
            return this;
        }
        @CustomType.Setter
        public Builder translateIpVariable(@Nullable String translateIpVariable) {

            this.translateIpVariable = translateIpVariable;
            return this;
        }
        public CiscoVpnFeatureTemplateStaticNatRule build() {
            final var _resultValue = new CiscoVpnFeatureTemplateStaticNatRule();
            _resultValue.optional = optional;
            _resultValue.poolName = poolName;
            _resultValue.poolNameVariable = poolNameVariable;
            _resultValue.sourceIp = sourceIp;
            _resultValue.sourceIpVariable = sourceIpVariable;
            _resultValue.staticNatDirection = staticNatDirection;
            _resultValue.staticNatDirectionVariable = staticNatDirectionVariable;
            _resultValue.trackerId = trackerId;
            _resultValue.trackerIdVariable = trackerIdVariable;
            _resultValue.translateIp = translateIp;
            _resultValue.translateIpVariable = translateIpVariable;
            return _resultValue;
        }
    }
}
