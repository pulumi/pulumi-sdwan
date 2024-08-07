// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTransportWanVpnInterfaceEthernetProfileParcelTunnelInterfaceEncapsulation {
    /**
     * @return Encapsulation
     * 
     */
    private String encapsulation;
    /**
     * @return Set preference for TLOC
     * 
     */
    private Integer preference;
    /**
     * @return Variable name
     * 
     */
    private String preferenceVariable;
    /**
     * @return Set weight for TLOC
     * 
     */
    private Integer weight;
    /**
     * @return Variable name
     * 
     */
    private String weightVariable;

    private GetTransportWanVpnInterfaceEthernetProfileParcelTunnelInterfaceEncapsulation() {}
    /**
     * @return Encapsulation
     * 
     */
    public String encapsulation() {
        return this.encapsulation;
    }
    /**
     * @return Set preference for TLOC
     * 
     */
    public Integer preference() {
        return this.preference;
    }
    /**
     * @return Variable name
     * 
     */
    public String preferenceVariable() {
        return this.preferenceVariable;
    }
    /**
     * @return Set weight for TLOC
     * 
     */
    public Integer weight() {
        return this.weight;
    }
    /**
     * @return Variable name
     * 
     */
    public String weightVariable() {
        return this.weightVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransportWanVpnInterfaceEthernetProfileParcelTunnelInterfaceEncapsulation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String encapsulation;
        private Integer preference;
        private String preferenceVariable;
        private Integer weight;
        private String weightVariable;
        public Builder() {}
        public Builder(GetTransportWanVpnInterfaceEthernetProfileParcelTunnelInterfaceEncapsulation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encapsulation = defaults.encapsulation;
    	      this.preference = defaults.preference;
    	      this.preferenceVariable = defaults.preferenceVariable;
    	      this.weight = defaults.weight;
    	      this.weightVariable = defaults.weightVariable;
        }

        @CustomType.Setter
        public Builder encapsulation(String encapsulation) {
            if (encapsulation == null) {
              throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceEthernetProfileParcelTunnelInterfaceEncapsulation", "encapsulation");
            }
            this.encapsulation = encapsulation;
            return this;
        }
        @CustomType.Setter
        public Builder preference(Integer preference) {
            if (preference == null) {
              throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceEthernetProfileParcelTunnelInterfaceEncapsulation", "preference");
            }
            this.preference = preference;
            return this;
        }
        @CustomType.Setter
        public Builder preferenceVariable(String preferenceVariable) {
            if (preferenceVariable == null) {
              throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceEthernetProfileParcelTunnelInterfaceEncapsulation", "preferenceVariable");
            }
            this.preferenceVariable = preferenceVariable;
            return this;
        }
        @CustomType.Setter
        public Builder weight(Integer weight) {
            if (weight == null) {
              throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceEthernetProfileParcelTunnelInterfaceEncapsulation", "weight");
            }
            this.weight = weight;
            return this;
        }
        @CustomType.Setter
        public Builder weightVariable(String weightVariable) {
            if (weightVariable == null) {
              throw new MissingRequiredPropertyException("GetTransportWanVpnInterfaceEthernetProfileParcelTunnelInterfaceEncapsulation", "weightVariable");
            }
            this.weightVariable = weightVariable;
            return this;
        }
        public GetTransportWanVpnInterfaceEthernetProfileParcelTunnelInterfaceEncapsulation build() {
            final var _resultValue = new GetTransportWanVpnInterfaceEthernetProfileParcelTunnelInterfaceEncapsulation();
            _resultValue.encapsulation = encapsulation;
            _resultValue.preference = preference;
            _resultValue.preferenceVariable = preferenceVariable;
            _resultValue.weight = weight;
            _resultValue.weightVariable = weightVariable;
            return _resultValue;
        }
    }
}
