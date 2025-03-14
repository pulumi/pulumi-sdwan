// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTransportRoutingOspfFeatureRedistribute {
    /**
     * @return Enable NAT DIA for redistributed routes
     * 
     */
    private Boolean natDia;
    /**
     * @return Variable name
     * 
     */
    private String natDiaVariable;
    /**
     * @return Set the protocol
     * 
     */
    private String protocol;
    /**
     * @return Variable name
     * 
     */
    private String protocolVariable;
    private String routePolicyId;

    private GetTransportRoutingOspfFeatureRedistribute() {}
    /**
     * @return Enable NAT DIA for redistributed routes
     * 
     */
    public Boolean natDia() {
        return this.natDia;
    }
    /**
     * @return Variable name
     * 
     */
    public String natDiaVariable() {
        return this.natDiaVariable;
    }
    /**
     * @return Set the protocol
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return Variable name
     * 
     */
    public String protocolVariable() {
        return this.protocolVariable;
    }
    public String routePolicyId() {
        return this.routePolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransportRoutingOspfFeatureRedistribute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean natDia;
        private String natDiaVariable;
        private String protocol;
        private String protocolVariable;
        private String routePolicyId;
        public Builder() {}
        public Builder(GetTransportRoutingOspfFeatureRedistribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.natDia = defaults.natDia;
    	      this.natDiaVariable = defaults.natDiaVariable;
    	      this.protocol = defaults.protocol;
    	      this.protocolVariable = defaults.protocolVariable;
    	      this.routePolicyId = defaults.routePolicyId;
        }

        @CustomType.Setter
        public Builder natDia(Boolean natDia) {
            if (natDia == null) {
              throw new MissingRequiredPropertyException("GetTransportRoutingOspfFeatureRedistribute", "natDia");
            }
            this.natDia = natDia;
            return this;
        }
        @CustomType.Setter
        public Builder natDiaVariable(String natDiaVariable) {
            if (natDiaVariable == null) {
              throw new MissingRequiredPropertyException("GetTransportRoutingOspfFeatureRedistribute", "natDiaVariable");
            }
            this.natDiaVariable = natDiaVariable;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("GetTransportRoutingOspfFeatureRedistribute", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder protocolVariable(String protocolVariable) {
            if (protocolVariable == null) {
              throw new MissingRequiredPropertyException("GetTransportRoutingOspfFeatureRedistribute", "protocolVariable");
            }
            this.protocolVariable = protocolVariable;
            return this;
        }
        @CustomType.Setter
        public Builder routePolicyId(String routePolicyId) {
            if (routePolicyId == null) {
              throw new MissingRequiredPropertyException("GetTransportRoutingOspfFeatureRedistribute", "routePolicyId");
            }
            this.routePolicyId = routePolicyId;
            return this;
        }
        public GetTransportRoutingOspfFeatureRedistribute build() {
            final var _resultValue = new GetTransportRoutingOspfFeatureRedistribute();
            _resultValue.natDia = natDia;
            _resultValue.natDiaVariable = natDiaVariable;
            _resultValue.protocol = protocol;
            _resultValue.protocolVariable = protocolVariable;
            _resultValue.routePolicyId = routePolicyId;
            return _resultValue;
        }
    }
}
