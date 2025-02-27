// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.outputs.GetServiceMulticastFeatureMsdpGroupPeer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceMulticastFeatureMsdpGroup {
    /**
     * @return Set MSDP mesh group
     * 
     */
    private String meshGroupName;
    /**
     * @return Variable name
     * 
     */
    private String meshGroupNameVariable;
    /**
     * @return Configure peer
     * 
     */
    private List<GetServiceMulticastFeatureMsdpGroupPeer> peers;

    private GetServiceMulticastFeatureMsdpGroup() {}
    /**
     * @return Set MSDP mesh group
     * 
     */
    public String meshGroupName() {
        return this.meshGroupName;
    }
    /**
     * @return Variable name
     * 
     */
    public String meshGroupNameVariable() {
        return this.meshGroupNameVariable;
    }
    /**
     * @return Configure peer
     * 
     */
    public List<GetServiceMulticastFeatureMsdpGroupPeer> peers() {
        return this.peers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceMulticastFeatureMsdpGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String meshGroupName;
        private String meshGroupNameVariable;
        private List<GetServiceMulticastFeatureMsdpGroupPeer> peers;
        public Builder() {}
        public Builder(GetServiceMulticastFeatureMsdpGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.meshGroupName = defaults.meshGroupName;
    	      this.meshGroupNameVariable = defaults.meshGroupNameVariable;
    	      this.peers = defaults.peers;
        }

        @CustomType.Setter
        public Builder meshGroupName(String meshGroupName) {
            if (meshGroupName == null) {
              throw new MissingRequiredPropertyException("GetServiceMulticastFeatureMsdpGroup", "meshGroupName");
            }
            this.meshGroupName = meshGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder meshGroupNameVariable(String meshGroupNameVariable) {
            if (meshGroupNameVariable == null) {
              throw new MissingRequiredPropertyException("GetServiceMulticastFeatureMsdpGroup", "meshGroupNameVariable");
            }
            this.meshGroupNameVariable = meshGroupNameVariable;
            return this;
        }
        @CustomType.Setter
        public Builder peers(List<GetServiceMulticastFeatureMsdpGroupPeer> peers) {
            if (peers == null) {
              throw new MissingRequiredPropertyException("GetServiceMulticastFeatureMsdpGroup", "peers");
            }
            this.peers = peers;
            return this;
        }
        public Builder peers(GetServiceMulticastFeatureMsdpGroupPeer... peers) {
            return peers(List.of(peers));
        }
        public GetServiceMulticastFeatureMsdpGroup build() {
            final var _resultValue = new GetServiceMulticastFeatureMsdpGroup();
            _resultValue.meshGroupName = meshGroupName;
            _resultValue.meshGroupNameVariable = meshGroupNameVariable;
            _resultValue.peers = peers;
            return _resultValue;
        }
    }
}
