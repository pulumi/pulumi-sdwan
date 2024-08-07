// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceLanVpnProfileParcelIpv4ExportRouteTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLanVpnProfileParcelIpv4ExportRouteTargetArgs Empty = new ServiceLanVpnProfileParcelIpv4ExportRouteTargetArgs();

    /**
     * Route target
     * 
     */
    @Import(name="routeTarget")
    private @Nullable Output<String> routeTarget;

    /**
     * @return Route target
     * 
     */
    public Optional<Output<String>> routeTarget() {
        return Optional.ofNullable(this.routeTarget);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="routeTargetVariable")
    private @Nullable Output<String> routeTargetVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> routeTargetVariable() {
        return Optional.ofNullable(this.routeTargetVariable);
    }

    private ServiceLanVpnProfileParcelIpv4ExportRouteTargetArgs() {}

    private ServiceLanVpnProfileParcelIpv4ExportRouteTargetArgs(ServiceLanVpnProfileParcelIpv4ExportRouteTargetArgs $) {
        this.routeTarget = $.routeTarget;
        this.routeTargetVariable = $.routeTargetVariable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLanVpnProfileParcelIpv4ExportRouteTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLanVpnProfileParcelIpv4ExportRouteTargetArgs $;

        public Builder() {
            $ = new ServiceLanVpnProfileParcelIpv4ExportRouteTargetArgs();
        }

        public Builder(ServiceLanVpnProfileParcelIpv4ExportRouteTargetArgs defaults) {
            $ = new ServiceLanVpnProfileParcelIpv4ExportRouteTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param routeTarget Route target
         * 
         * @return builder
         * 
         */
        public Builder routeTarget(@Nullable Output<String> routeTarget) {
            $.routeTarget = routeTarget;
            return this;
        }

        /**
         * @param routeTarget Route target
         * 
         * @return builder
         * 
         */
        public Builder routeTarget(String routeTarget) {
            return routeTarget(Output.of(routeTarget));
        }

        /**
         * @param routeTargetVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder routeTargetVariable(@Nullable Output<String> routeTargetVariable) {
            $.routeTargetVariable = routeTargetVariable;
            return this;
        }

        /**
         * @param routeTargetVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder routeTargetVariable(String routeTargetVariable) {
            return routeTargetVariable(Output.of(routeTargetVariable));
        }

        public ServiceLanVpnProfileParcelIpv4ExportRouteTargetArgs build() {
            return $;
        }
    }

}
