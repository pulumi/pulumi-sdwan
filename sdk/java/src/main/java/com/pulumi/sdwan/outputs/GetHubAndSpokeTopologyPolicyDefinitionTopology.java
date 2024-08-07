// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.outputs.GetHubAndSpokeTopologyPolicyDefinitionTopologySpoke;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetHubAndSpokeTopologyPolicyDefinitionTopology {
    /**
     * @return Advertise Hub TLOCs
     * 
     */
    private Boolean advertiseHubTlocs;
    /**
     * @return All hubs are equal (All Spokes Sites connect to all Hubs)
     * 
     */
    private Boolean allHubsAreEqual;
    /**
     * @return Topology name
     * 
     */
    private String name;
    /**
     * @return List of spokes
     * 
     */
    private List<GetHubAndSpokeTopologyPolicyDefinitionTopologySpoke> spokes;
    /**
     * @return TLOC list ID (required when `advertise_hub_tlocs` is &#39;true&#39;)
     * 
     */
    private String tlocListId;

    private GetHubAndSpokeTopologyPolicyDefinitionTopology() {}
    /**
     * @return Advertise Hub TLOCs
     * 
     */
    public Boolean advertiseHubTlocs() {
        return this.advertiseHubTlocs;
    }
    /**
     * @return All hubs are equal (All Spokes Sites connect to all Hubs)
     * 
     */
    public Boolean allHubsAreEqual() {
        return this.allHubsAreEqual;
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
    public List<GetHubAndSpokeTopologyPolicyDefinitionTopologySpoke> spokes() {
        return this.spokes;
    }
    /**
     * @return TLOC list ID (required when `advertise_hub_tlocs` is &#39;true&#39;)
     * 
     */
    public String tlocListId() {
        return this.tlocListId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHubAndSpokeTopologyPolicyDefinitionTopology defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean advertiseHubTlocs;
        private Boolean allHubsAreEqual;
        private String name;
        private List<GetHubAndSpokeTopologyPolicyDefinitionTopologySpoke> spokes;
        private String tlocListId;
        public Builder() {}
        public Builder(GetHubAndSpokeTopologyPolicyDefinitionTopology defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertiseHubTlocs = defaults.advertiseHubTlocs;
    	      this.allHubsAreEqual = defaults.allHubsAreEqual;
    	      this.name = defaults.name;
    	      this.spokes = defaults.spokes;
    	      this.tlocListId = defaults.tlocListId;
        }

        @CustomType.Setter
        public Builder advertiseHubTlocs(Boolean advertiseHubTlocs) {
            if (advertiseHubTlocs == null) {
              throw new MissingRequiredPropertyException("GetHubAndSpokeTopologyPolicyDefinitionTopology", "advertiseHubTlocs");
            }
            this.advertiseHubTlocs = advertiseHubTlocs;
            return this;
        }
        @CustomType.Setter
        public Builder allHubsAreEqual(Boolean allHubsAreEqual) {
            if (allHubsAreEqual == null) {
              throw new MissingRequiredPropertyException("GetHubAndSpokeTopologyPolicyDefinitionTopology", "allHubsAreEqual");
            }
            this.allHubsAreEqual = allHubsAreEqual;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetHubAndSpokeTopologyPolicyDefinitionTopology", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder spokes(List<GetHubAndSpokeTopologyPolicyDefinitionTopologySpoke> spokes) {
            if (spokes == null) {
              throw new MissingRequiredPropertyException("GetHubAndSpokeTopologyPolicyDefinitionTopology", "spokes");
            }
            this.spokes = spokes;
            return this;
        }
        public Builder spokes(GetHubAndSpokeTopologyPolicyDefinitionTopologySpoke... spokes) {
            return spokes(List.of(spokes));
        }
        @CustomType.Setter
        public Builder tlocListId(String tlocListId) {
            if (tlocListId == null) {
              throw new MissingRequiredPropertyException("GetHubAndSpokeTopologyPolicyDefinitionTopology", "tlocListId");
            }
            this.tlocListId = tlocListId;
            return this;
        }
        public GetHubAndSpokeTopologyPolicyDefinitionTopology build() {
            final var _resultValue = new GetHubAndSpokeTopologyPolicyDefinitionTopology();
            _resultValue.advertiseHubTlocs = advertiseHubTlocs;
            _resultValue.allHubsAreEqual = allHubsAreEqual;
            _resultValue.name = name;
            _resultValue.spokes = spokes;
            _resultValue.tlocListId = tlocListId;
            return _resultValue;
        }
    }
}
