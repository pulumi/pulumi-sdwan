// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.outputs.HubAndSpokeTopologyPolicyDefinitionTopologySpoke;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HubAndSpokeTopologyPolicyDefinitionTopology {
    /**
     * @return Advertise Hub TLOCs
     * 
     */
    private @Nullable Boolean advertiseHubTlocs;
    /**
     * @return All hubs are equal (All Spokes Sites connect to all Hubs)
     * 
     */
    private @Nullable Boolean allHubsAreEqual;
    /**
     * @return Topology name
     * 
     */
    private String name;
    /**
     * @return List of spokes
     * 
     */
    private @Nullable List<HubAndSpokeTopologyPolicyDefinitionTopologySpoke> spokes;
    /**
     * @return TLOC list ID (required when `advertise_hub_tlocs` is &#39;true&#39;)
     * 
     */
    private @Nullable String tlocListId;

    private HubAndSpokeTopologyPolicyDefinitionTopology() {}
    /**
     * @return Advertise Hub TLOCs
     * 
     */
    public Optional<Boolean> advertiseHubTlocs() {
        return Optional.ofNullable(this.advertiseHubTlocs);
    }
    /**
     * @return All hubs are equal (All Spokes Sites connect to all Hubs)
     * 
     */
    public Optional<Boolean> allHubsAreEqual() {
        return Optional.ofNullable(this.allHubsAreEqual);
    }
    /**
     * @return Topology name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of spokes
     * 
     */
    public List<HubAndSpokeTopologyPolicyDefinitionTopologySpoke> spokes() {
        return this.spokes == null ? List.of() : this.spokes;
    }
    /**
     * @return TLOC list ID (required when `advertise_hub_tlocs` is &#39;true&#39;)
     * 
     */
    public Optional<String> tlocListId() {
        return Optional.ofNullable(this.tlocListId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HubAndSpokeTopologyPolicyDefinitionTopology defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean advertiseHubTlocs;
        private @Nullable Boolean allHubsAreEqual;
        private String name;
        private @Nullable List<HubAndSpokeTopologyPolicyDefinitionTopologySpoke> spokes;
        private @Nullable String tlocListId;
        public Builder() {}
        public Builder(HubAndSpokeTopologyPolicyDefinitionTopology defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertiseHubTlocs = defaults.advertiseHubTlocs;
    	      this.allHubsAreEqual = defaults.allHubsAreEqual;
    	      this.name = defaults.name;
    	      this.spokes = defaults.spokes;
    	      this.tlocListId = defaults.tlocListId;
        }

        @CustomType.Setter
        public Builder advertiseHubTlocs(@Nullable Boolean advertiseHubTlocs) {

            this.advertiseHubTlocs = advertiseHubTlocs;
            return this;
        }
        @CustomType.Setter
        public Builder allHubsAreEqual(@Nullable Boolean allHubsAreEqual) {

            this.allHubsAreEqual = allHubsAreEqual;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("HubAndSpokeTopologyPolicyDefinitionTopology", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder spokes(@Nullable List<HubAndSpokeTopologyPolicyDefinitionTopologySpoke> spokes) {

            this.spokes = spokes;
            return this;
        }
        public Builder spokes(HubAndSpokeTopologyPolicyDefinitionTopologySpoke... spokes) {
            return spokes(List.of(spokes));
        }
        @CustomType.Setter
        public Builder tlocListId(@Nullable String tlocListId) {

            this.tlocListId = tlocListId;
            return this;
        }
        public HubAndSpokeTopologyPolicyDefinitionTopology build() {
            final var _resultValue = new HubAndSpokeTopologyPolicyDefinitionTopology();
            _resultValue.advertiseHubTlocs = advertiseHubTlocs;
            _resultValue.allHubsAreEqual = allHubsAreEqual;
            _resultValue.name = name;
            _resultValue.spokes = spokes;
            _resultValue.tlocListId = tlocListId;
            return _resultValue;
        }
    }
}
