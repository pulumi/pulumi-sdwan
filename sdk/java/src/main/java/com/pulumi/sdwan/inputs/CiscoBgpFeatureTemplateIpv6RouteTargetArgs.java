// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sdwan.inputs.CiscoBgpFeatureTemplateIpv6RouteTargetExportArgs;
import com.pulumi.sdwan.inputs.CiscoBgpFeatureTemplateIpv6RouteTargetImportArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CiscoBgpFeatureTemplateIpv6RouteTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CiscoBgpFeatureTemplateIpv6RouteTargetArgs Empty = new CiscoBgpFeatureTemplateIpv6RouteTargetArgs();

    /**
     * Export Target-VPN community for IPV6
     * 
     */
    @Import(name="exports")
    private @Nullable Output<List<CiscoBgpFeatureTemplateIpv6RouteTargetExportArgs>> exports;

    /**
     * @return Export Target-VPN community for IPV6
     * 
     */
    public Optional<Output<List<CiscoBgpFeatureTemplateIpv6RouteTargetExportArgs>>> exports() {
        return Optional.ofNullable(this.exports);
    }

    /**
     * Import Target-VPN community for IPV6
     * 
     */
    @Import(name="imports")
    private @Nullable Output<List<CiscoBgpFeatureTemplateIpv6RouteTargetImportArgs>> imports;

    /**
     * @return Import Target-VPN community for IPV6
     * 
     */
    public Optional<Output<List<CiscoBgpFeatureTemplateIpv6RouteTargetImportArgs>>> imports() {
        return Optional.ofNullable(this.imports);
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
     * VPN ID for IPv6
     *   - Range: `1`-`65527`
     * 
     */
    @Import(name="vpnId")
    private @Nullable Output<Integer> vpnId;

    /**
     * @return VPN ID for IPv6
     *   - Range: `1`-`65527`
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

    private CiscoBgpFeatureTemplateIpv6RouteTargetArgs() {}

    private CiscoBgpFeatureTemplateIpv6RouteTargetArgs(CiscoBgpFeatureTemplateIpv6RouteTargetArgs $) {
        this.exports = $.exports;
        this.imports = $.imports;
        this.optional = $.optional;
        this.vpnId = $.vpnId;
        this.vpnIdVariable = $.vpnIdVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CiscoBgpFeatureTemplateIpv6RouteTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CiscoBgpFeatureTemplateIpv6RouteTargetArgs $;

        public Builder() {
            $ = new CiscoBgpFeatureTemplateIpv6RouteTargetArgs();
        }

        public Builder(CiscoBgpFeatureTemplateIpv6RouteTargetArgs defaults) {
            $ = new CiscoBgpFeatureTemplateIpv6RouteTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exports Export Target-VPN community for IPV6
         * 
         * @return builder
         * 
         */
        public Builder exports(@Nullable Output<List<CiscoBgpFeatureTemplateIpv6RouteTargetExportArgs>> exports) {
            $.exports = exports;
            return this;
        }

        /**
         * @param exports Export Target-VPN community for IPV6
         * 
         * @return builder
         * 
         */
        public Builder exports(List<CiscoBgpFeatureTemplateIpv6RouteTargetExportArgs> exports) {
            return exports(Output.of(exports));
        }

        /**
         * @param exports Export Target-VPN community for IPV6
         * 
         * @return builder
         * 
         */
        public Builder exports(CiscoBgpFeatureTemplateIpv6RouteTargetExportArgs... exports) {
            return exports(List.of(exports));
        }

        /**
         * @param imports Import Target-VPN community for IPV6
         * 
         * @return builder
         * 
         */
        public Builder imports(@Nullable Output<List<CiscoBgpFeatureTemplateIpv6RouteTargetImportArgs>> imports) {
            $.imports = imports;
            return this;
        }

        /**
         * @param imports Import Target-VPN community for IPV6
         * 
         * @return builder
         * 
         */
        public Builder imports(List<CiscoBgpFeatureTemplateIpv6RouteTargetImportArgs> imports) {
            return imports(Output.of(imports));
        }

        /**
         * @param imports Import Target-VPN community for IPV6
         * 
         * @return builder
         * 
         */
        public Builder imports(CiscoBgpFeatureTemplateIpv6RouteTargetImportArgs... imports) {
            return imports(List.of(imports));
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
         * @param vpnId VPN ID for IPv6
         *   - Range: `1`-`65527`
         * 
         * @return builder
         * 
         */
        public Builder vpnId(@Nullable Output<Integer> vpnId) {
            $.vpnId = vpnId;
            return this;
        }

        /**
         * @param vpnId VPN ID for IPv6
         *   - Range: `1`-`65527`
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

        public CiscoBgpFeatureTemplateIpv6RouteTargetArgs build() {
            return $;
        }
    }

}
