// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.inputs.CustomControlTopologyPolicyDefinitionSequenceActionEntrySetParameterArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomControlTopologyPolicyDefinitionSequenceActionEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomControlTopologyPolicyDefinitionSequenceActionEntryArgs Empty = new CustomControlTopologyPolicyDefinitionSequenceActionEntryArgs();

    /**
     * Export to VPN list ID, Attribute conditional on `type` being equal to `exportTo`
     * 
     */
    @Import(name="exportToVpnListId")
    private @Nullable Output<String> exportToVpnListId;

    /**
     * @return Export to VPN list ID, Attribute conditional on `type` being equal to `exportTo`
     * 
     */
    public Optional<Output<String>> exportToVpnListId() {
        return Optional.ofNullable(this.exportToVpnListId);
    }

    /**
     * Export to VPN list version
     * 
     */
    @Import(name="exportToVpnListVersion")
    private @Nullable Output<Integer> exportToVpnListVersion;

    /**
     * @return Export to VPN list version
     * 
     */
    public Optional<Output<Integer>> exportToVpnListVersion() {
        return Optional.ofNullable(this.exportToVpnListVersion);
    }

    /**
     * List of set parameters, Attribute conditional on `type` being equal to `set`
     * 
     */
    @Import(name="setParameters")
    private @Nullable Output<List<CustomControlTopologyPolicyDefinitionSequenceActionEntrySetParameterArgs>> setParameters;

    /**
     * @return List of set parameters, Attribute conditional on `type` being equal to `set`
     * 
     */
    public Optional<Output<List<CustomControlTopologyPolicyDefinitionSequenceActionEntrySetParameterArgs>>> setParameters() {
        return Optional.ofNullable(this.setParameters);
    }

    /**
     * Type of action entry
     *   - Choices: `set`, `exportTo`
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of action entry
     *   - Choices: `set`, `exportTo`
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private CustomControlTopologyPolicyDefinitionSequenceActionEntryArgs() {}

    private CustomControlTopologyPolicyDefinitionSequenceActionEntryArgs(CustomControlTopologyPolicyDefinitionSequenceActionEntryArgs $) {
        this.exportToVpnListId = $.exportToVpnListId;
        this.exportToVpnListVersion = $.exportToVpnListVersion;
        this.setParameters = $.setParameters;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomControlTopologyPolicyDefinitionSequenceActionEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomControlTopologyPolicyDefinitionSequenceActionEntryArgs $;

        public Builder() {
            $ = new CustomControlTopologyPolicyDefinitionSequenceActionEntryArgs();
        }

        public Builder(CustomControlTopologyPolicyDefinitionSequenceActionEntryArgs defaults) {
            $ = new CustomControlTopologyPolicyDefinitionSequenceActionEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exportToVpnListId Export to VPN list ID, Attribute conditional on `type` being equal to `exportTo`
         * 
         * @return builder
         * 
         */
        public Builder exportToVpnListId(@Nullable Output<String> exportToVpnListId) {
            $.exportToVpnListId = exportToVpnListId;
            return this;
        }

        /**
         * @param exportToVpnListId Export to VPN list ID, Attribute conditional on `type` being equal to `exportTo`
         * 
         * @return builder
         * 
         */
        public Builder exportToVpnListId(String exportToVpnListId) {
            return exportToVpnListId(Output.of(exportToVpnListId));
        }

        /**
         * @param exportToVpnListVersion Export to VPN list version
         * 
         * @return builder
         * 
         */
        public Builder exportToVpnListVersion(@Nullable Output<Integer> exportToVpnListVersion) {
            $.exportToVpnListVersion = exportToVpnListVersion;
            return this;
        }

        /**
         * @param exportToVpnListVersion Export to VPN list version
         * 
         * @return builder
         * 
         */
        public Builder exportToVpnListVersion(Integer exportToVpnListVersion) {
            return exportToVpnListVersion(Output.of(exportToVpnListVersion));
        }

        /**
         * @param setParameters List of set parameters, Attribute conditional on `type` being equal to `set`
         * 
         * @return builder
         * 
         */
        public Builder setParameters(@Nullable Output<List<CustomControlTopologyPolicyDefinitionSequenceActionEntrySetParameterArgs>> setParameters) {
            $.setParameters = setParameters;
            return this;
        }

        /**
         * @param setParameters List of set parameters, Attribute conditional on `type` being equal to `set`
         * 
         * @return builder
         * 
         */
        public Builder setParameters(List<CustomControlTopologyPolicyDefinitionSequenceActionEntrySetParameterArgs> setParameters) {
            return setParameters(Output.of(setParameters));
        }

        /**
         * @param setParameters List of set parameters, Attribute conditional on `type` being equal to `set`
         * 
         * @return builder
         * 
         */
        public Builder setParameters(CustomControlTopologyPolicyDefinitionSequenceActionEntrySetParameterArgs... setParameters) {
            return setParameters(List.of(setParameters));
        }

        /**
         * @param type Type of action entry
         *   - Choices: `set`, `exportTo`
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of action entry
         *   - Choices: `set`, `exportTo`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public CustomControlTopologyPolicyDefinitionSequenceActionEntryArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("CustomControlTopologyPolicyDefinitionSequenceActionEntryArgs", "type");
            }
            return $;
        }
    }

}
