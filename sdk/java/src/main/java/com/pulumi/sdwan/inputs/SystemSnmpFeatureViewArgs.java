// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sdwan.inputs.SystemSnmpFeatureViewOidArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SystemSnmpFeatureViewArgs extends com.pulumi.resources.ResourceArgs {

    public static final SystemSnmpFeatureViewArgs Empty = new SystemSnmpFeatureViewArgs();

    /**
     * Set the name of the SNMP view
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Set the name of the SNMP view
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Configure SNMP object identifier
     * 
     */
    @Import(name="oids")
    private @Nullable Output<List<SystemSnmpFeatureViewOidArgs>> oids;

    /**
     * @return Configure SNMP object identifier
     * 
     */
    public Optional<Output<List<SystemSnmpFeatureViewOidArgs>>> oids() {
        return Optional.ofNullable(this.oids);
    }

    private SystemSnmpFeatureViewArgs() {}

    private SystemSnmpFeatureViewArgs(SystemSnmpFeatureViewArgs $) {
        this.name = $.name;
        this.oids = $.oids;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SystemSnmpFeatureViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SystemSnmpFeatureViewArgs $;

        public Builder() {
            $ = new SystemSnmpFeatureViewArgs();
        }

        public Builder(SystemSnmpFeatureViewArgs defaults) {
            $ = new SystemSnmpFeatureViewArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Set the name of the SNMP view
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Set the name of the SNMP view
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param oids Configure SNMP object identifier
         * 
         * @return builder
         * 
         */
        public Builder oids(@Nullable Output<List<SystemSnmpFeatureViewOidArgs>> oids) {
            $.oids = oids;
            return this;
        }

        /**
         * @param oids Configure SNMP object identifier
         * 
         * @return builder
         * 
         */
        public Builder oids(List<SystemSnmpFeatureViewOidArgs> oids) {
            return oids(Output.of(oids));
        }

        /**
         * @param oids Configure SNMP object identifier
         * 
         * @return builder
         * 
         */
        public Builder oids(SystemSnmpFeatureViewOidArgs... oids) {
            return oids(List.of(oids));
        }

        public SystemSnmpFeatureViewArgs build() {
            return $;
        }
    }

}