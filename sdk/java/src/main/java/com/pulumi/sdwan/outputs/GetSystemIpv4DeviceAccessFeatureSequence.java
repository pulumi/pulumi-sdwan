// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSystemIpv4DeviceAccessFeatureSequence {
    /**
     * @return Base Action
     * 
     */
    private String baseAction;
    private String destinationDataPrefixListId;
    /**
     * @return Variable name
     * 
     */
    private String destinationIpPrefixListVariable;
    /**
     * @return Destination Data IP Prefix List
     * 
     */
    private List<String> destinationIpPrefixLists;
    /**
     * @return device access protocol
     * 
     */
    private Integer deviceAccessPort;
    /**
     * @return Sequence Id
     * 
     */
    private Integer id;
    /**
     * @return Sequence Name
     * 
     */
    private String name;
    private String sourceDataPrefixListId;
    /**
     * @return Variable name
     * 
     */
    private String sourceIpPrefixListVariable;
    /**
     * @return Source Data IP Prefix List
     * 
     */
    private List<String> sourceIpPrefixLists;
    /**
     * @return Source Port List
     * 
     */
    private List<Integer> sourcePorts;

    private GetSystemIpv4DeviceAccessFeatureSequence() {}
    /**
     * @return Base Action
     * 
     */
    public String baseAction() {
        return this.baseAction;
    }
    public String destinationDataPrefixListId() {
        return this.destinationDataPrefixListId;
    }
    /**
     * @return Variable name
     * 
     */
    public String destinationIpPrefixListVariable() {
        return this.destinationIpPrefixListVariable;
    }
    /**
     * @return Destination Data IP Prefix List
     * 
     */
    public List<String> destinationIpPrefixLists() {
        return this.destinationIpPrefixLists;
    }
    /**
     * @return device access protocol
     * 
     */
    public Integer deviceAccessPort() {
        return this.deviceAccessPort;
    }
    /**
     * @return Sequence Id
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return Sequence Name
     * 
     */
    public String name() {
        return this.name;
    }
    public String sourceDataPrefixListId() {
        return this.sourceDataPrefixListId;
    }
    /**
     * @return Variable name
     * 
     */
    public String sourceIpPrefixListVariable() {
        return this.sourceIpPrefixListVariable;
    }
    /**
     * @return Source Data IP Prefix List
     * 
     */
    public List<String> sourceIpPrefixLists() {
        return this.sourceIpPrefixLists;
    }
    /**
     * @return Source Port List
     * 
     */
    public List<Integer> sourcePorts() {
        return this.sourcePorts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSystemIpv4DeviceAccessFeatureSequence defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String baseAction;
        private String destinationDataPrefixListId;
        private String destinationIpPrefixListVariable;
        private List<String> destinationIpPrefixLists;
        private Integer deviceAccessPort;
        private Integer id;
        private String name;
        private String sourceDataPrefixListId;
        private String sourceIpPrefixListVariable;
        private List<String> sourceIpPrefixLists;
        private List<Integer> sourcePorts;
        public Builder() {}
        public Builder(GetSystemIpv4DeviceAccessFeatureSequence defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseAction = defaults.baseAction;
    	      this.destinationDataPrefixListId = defaults.destinationDataPrefixListId;
    	      this.destinationIpPrefixListVariable = defaults.destinationIpPrefixListVariable;
    	      this.destinationIpPrefixLists = defaults.destinationIpPrefixLists;
    	      this.deviceAccessPort = defaults.deviceAccessPort;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.sourceDataPrefixListId = defaults.sourceDataPrefixListId;
    	      this.sourceIpPrefixListVariable = defaults.sourceIpPrefixListVariable;
    	      this.sourceIpPrefixLists = defaults.sourceIpPrefixLists;
    	      this.sourcePorts = defaults.sourcePorts;
        }

        @CustomType.Setter
        public Builder baseAction(String baseAction) {
            if (baseAction == null) {
              throw new MissingRequiredPropertyException("GetSystemIpv4DeviceAccessFeatureSequence", "baseAction");
            }
            this.baseAction = baseAction;
            return this;
        }
        @CustomType.Setter
        public Builder destinationDataPrefixListId(String destinationDataPrefixListId) {
            if (destinationDataPrefixListId == null) {
              throw new MissingRequiredPropertyException("GetSystemIpv4DeviceAccessFeatureSequence", "destinationDataPrefixListId");
            }
            this.destinationDataPrefixListId = destinationDataPrefixListId;
            return this;
        }
        @CustomType.Setter
        public Builder destinationIpPrefixListVariable(String destinationIpPrefixListVariable) {
            if (destinationIpPrefixListVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemIpv4DeviceAccessFeatureSequence", "destinationIpPrefixListVariable");
            }
            this.destinationIpPrefixListVariable = destinationIpPrefixListVariable;
            return this;
        }
        @CustomType.Setter
        public Builder destinationIpPrefixLists(List<String> destinationIpPrefixLists) {
            if (destinationIpPrefixLists == null) {
              throw new MissingRequiredPropertyException("GetSystemIpv4DeviceAccessFeatureSequence", "destinationIpPrefixLists");
            }
            this.destinationIpPrefixLists = destinationIpPrefixLists;
            return this;
        }
        public Builder destinationIpPrefixLists(String... destinationIpPrefixLists) {
            return destinationIpPrefixLists(List.of(destinationIpPrefixLists));
        }
        @CustomType.Setter
        public Builder deviceAccessPort(Integer deviceAccessPort) {
            if (deviceAccessPort == null) {
              throw new MissingRequiredPropertyException("GetSystemIpv4DeviceAccessFeatureSequence", "deviceAccessPort");
            }
            this.deviceAccessPort = deviceAccessPort;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSystemIpv4DeviceAccessFeatureSequence", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSystemIpv4DeviceAccessFeatureSequence", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder sourceDataPrefixListId(String sourceDataPrefixListId) {
            if (sourceDataPrefixListId == null) {
              throw new MissingRequiredPropertyException("GetSystemIpv4DeviceAccessFeatureSequence", "sourceDataPrefixListId");
            }
            this.sourceDataPrefixListId = sourceDataPrefixListId;
            return this;
        }
        @CustomType.Setter
        public Builder sourceIpPrefixListVariable(String sourceIpPrefixListVariable) {
            if (sourceIpPrefixListVariable == null) {
              throw new MissingRequiredPropertyException("GetSystemIpv4DeviceAccessFeatureSequence", "sourceIpPrefixListVariable");
            }
            this.sourceIpPrefixListVariable = sourceIpPrefixListVariable;
            return this;
        }
        @CustomType.Setter
        public Builder sourceIpPrefixLists(List<String> sourceIpPrefixLists) {
            if (sourceIpPrefixLists == null) {
              throw new MissingRequiredPropertyException("GetSystemIpv4DeviceAccessFeatureSequence", "sourceIpPrefixLists");
            }
            this.sourceIpPrefixLists = sourceIpPrefixLists;
            return this;
        }
        public Builder sourceIpPrefixLists(String... sourceIpPrefixLists) {
            return sourceIpPrefixLists(List.of(sourceIpPrefixLists));
        }
        @CustomType.Setter
        public Builder sourcePorts(List<Integer> sourcePorts) {
            if (sourcePorts == null) {
              throw new MissingRequiredPropertyException("GetSystemIpv4DeviceAccessFeatureSequence", "sourcePorts");
            }
            this.sourcePorts = sourcePorts;
            return this;
        }
        public Builder sourcePorts(Integer... sourcePorts) {
            return sourcePorts(List.of(sourcePorts));
        }
        public GetSystemIpv4DeviceAccessFeatureSequence build() {
            final var _resultValue = new GetSystemIpv4DeviceAccessFeatureSequence();
            _resultValue.baseAction = baseAction;
            _resultValue.destinationDataPrefixListId = destinationDataPrefixListId;
            _resultValue.destinationIpPrefixListVariable = destinationIpPrefixListVariable;
            _resultValue.destinationIpPrefixLists = destinationIpPrefixLists;
            _resultValue.deviceAccessPort = deviceAccessPort;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.sourceDataPrefixListId = sourceDataPrefixListId;
            _resultValue.sourceIpPrefixListVariable = sourceIpPrefixListVariable;
            _resultValue.sourceIpPrefixLists = sourceIpPrefixLists;
            _resultValue.sourcePorts = sourcePorts;
            return _resultValue;
        }
    }
}
