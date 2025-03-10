// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.outputs.GetCiscoBgpFeatureTemplateIpv6RouteTargetExport;
import com.pulumi.sdwan.outputs.GetCiscoBgpFeatureTemplateIpv6RouteTargetImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCiscoBgpFeatureTemplateIpv6RouteTarget {
    /**
     * @return Export Target-VPN community for IPV6
     * 
     */
    private List<GetCiscoBgpFeatureTemplateIpv6RouteTargetExport> exports;
    /**
     * @return Import Target-VPN community for IPV6
     * 
     */
    private List<GetCiscoBgpFeatureTemplateIpv6RouteTargetImport> imports;
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private Boolean optional;
    /**
     * @return VPN ID for IPv6
     * 
     */
    private Integer vpnId;
    /**
     * @return Variable name
     * 
     */
    private String vpnIdVariable;

    private GetCiscoBgpFeatureTemplateIpv6RouteTarget() {}
    /**
     * @return Export Target-VPN community for IPV6
     * 
     */
    public List<GetCiscoBgpFeatureTemplateIpv6RouteTargetExport> exports() {
        return this.exports;
    }
    /**
     * @return Import Target-VPN community for IPV6
     * 
     */
    public List<GetCiscoBgpFeatureTemplateIpv6RouteTargetImport> imports() {
        return this.imports;
    }
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Boolean optional() {
        return this.optional;
    }
    /**
     * @return VPN ID for IPv6
     * 
     */
    public Integer vpnId() {
        return this.vpnId;
    }
    /**
     * @return Variable name
     * 
     */
    public String vpnIdVariable() {
        return this.vpnIdVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCiscoBgpFeatureTemplateIpv6RouteTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetCiscoBgpFeatureTemplateIpv6RouteTargetExport> exports;
        private List<GetCiscoBgpFeatureTemplateIpv6RouteTargetImport> imports;
        private Boolean optional;
        private Integer vpnId;
        private String vpnIdVariable;
        public Builder() {}
        public Builder(GetCiscoBgpFeatureTemplateIpv6RouteTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exports = defaults.exports;
    	      this.imports = defaults.imports;
    	      this.optional = defaults.optional;
    	      this.vpnId = defaults.vpnId;
    	      this.vpnIdVariable = defaults.vpnIdVariable;
        }

        @CustomType.Setter
        public Builder exports(List<GetCiscoBgpFeatureTemplateIpv6RouteTargetExport> exports) {
            if (exports == null) {
              throw new MissingRequiredPropertyException("GetCiscoBgpFeatureTemplateIpv6RouteTarget", "exports");
            }
            this.exports = exports;
            return this;
        }
        public Builder exports(GetCiscoBgpFeatureTemplateIpv6RouteTargetExport... exports) {
            return exports(List.of(exports));
        }
        @CustomType.Setter
        public Builder imports(List<GetCiscoBgpFeatureTemplateIpv6RouteTargetImport> imports) {
            if (imports == null) {
              throw new MissingRequiredPropertyException("GetCiscoBgpFeatureTemplateIpv6RouteTarget", "imports");
            }
            this.imports = imports;
            return this;
        }
        public Builder imports(GetCiscoBgpFeatureTemplateIpv6RouteTargetImport... imports) {
            return imports(List.of(imports));
        }
        @CustomType.Setter
        public Builder optional(Boolean optional) {
            if (optional == null) {
              throw new MissingRequiredPropertyException("GetCiscoBgpFeatureTemplateIpv6RouteTarget", "optional");
            }
            this.optional = optional;
            return this;
        }
        @CustomType.Setter
        public Builder vpnId(Integer vpnId) {
            if (vpnId == null) {
              throw new MissingRequiredPropertyException("GetCiscoBgpFeatureTemplateIpv6RouteTarget", "vpnId");
            }
            this.vpnId = vpnId;
            return this;
        }
        @CustomType.Setter
        public Builder vpnIdVariable(String vpnIdVariable) {
            if (vpnIdVariable == null) {
              throw new MissingRequiredPropertyException("GetCiscoBgpFeatureTemplateIpv6RouteTarget", "vpnIdVariable");
            }
            this.vpnIdVariable = vpnIdVariable;
            return this;
        }
        public GetCiscoBgpFeatureTemplateIpv6RouteTarget build() {
            final var _resultValue = new GetCiscoBgpFeatureTemplateIpv6RouteTarget();
            _resultValue.exports = exports;
            _resultValue.imports = imports;
            _resultValue.optional = optional;
            _resultValue.vpnId = vpnId;
            _resultValue.vpnIdVariable = vpnIdVariable;
            return _resultValue;
        }
    }
}
