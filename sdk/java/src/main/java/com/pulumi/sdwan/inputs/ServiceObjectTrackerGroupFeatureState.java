// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sdwan.inputs.ServiceObjectTrackerGroupFeatureTrackerElementArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceObjectTrackerGroupFeatureState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceObjectTrackerGroupFeatureState Empty = new ServiceObjectTrackerGroupFeatureState();

    /**
     * The description of the Feature
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Feature
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Feature Profile ID
     * 
     */
    @Import(name="featureProfileId")
    private @Nullable Output<String> featureProfileId;

    /**
     * @return Feature Profile ID
     * 
     */
    public Optional<Output<String>> featureProfileId() {
        return Optional.ofNullable(this.featureProfileId);
    }

    /**
     * The name of the Feature
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Feature
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Object ID - Range: `1`-`1000`
     * 
     */
    @Import(name="objectTrackerId")
    private @Nullable Output<Integer> objectTrackerId;

    /**
     * @return Object ID - Range: `1`-`1000`
     * 
     */
    public Optional<Output<Integer>> objectTrackerId() {
        return Optional.ofNullable(this.objectTrackerId);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="objectTrackerIdVariable")
    private @Nullable Output<String> objectTrackerIdVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> objectTrackerIdVariable() {
        return Optional.ofNullable(this.objectTrackerIdVariable);
    }

    /**
     * tracker ref list criteria boolean and or - Choices: `and`, `or` - Default value: `or`
     * 
     */
    @Import(name="reachable")
    private @Nullable Output<String> reachable;

    /**
     * @return tracker ref list criteria boolean and or - Choices: `and`, `or` - Default value: `or`
     * 
     */
    public Optional<Output<String>> reachable() {
        return Optional.ofNullable(this.reachable);
    }

    /**
     * Variable name
     * 
     */
    @Import(name="reachableVariable")
    private @Nullable Output<String> reachableVariable;

    /**
     * @return Variable name
     * 
     */
    public Optional<Output<String>> reachableVariable() {
        return Optional.ofNullable(this.reachableVariable);
    }

    /**
     * Group Tracks ID Refs
     * 
     */
    @Import(name="trackerElements")
    private @Nullable Output<List<ServiceObjectTrackerGroupFeatureTrackerElementArgs>> trackerElements;

    /**
     * @return Group Tracks ID Refs
     * 
     */
    public Optional<Output<List<ServiceObjectTrackerGroupFeatureTrackerElementArgs>>> trackerElements() {
        return Optional.ofNullable(this.trackerElements);
    }

    /**
     * The version of the Feature
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return The version of the Feature
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private ServiceObjectTrackerGroupFeatureState() {}

    private ServiceObjectTrackerGroupFeatureState(ServiceObjectTrackerGroupFeatureState $) {
        this.description = $.description;
        this.featureProfileId = $.featureProfileId;
        this.name = $.name;
        this.objectTrackerId = $.objectTrackerId;
        this.objectTrackerIdVariable = $.objectTrackerIdVariable;
        this.reachable = $.reachable;
        this.reachableVariable = $.reachableVariable;
        this.trackerElements = $.trackerElements;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceObjectTrackerGroupFeatureState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceObjectTrackerGroupFeatureState $;

        public Builder() {
            $ = new ServiceObjectTrackerGroupFeatureState();
        }

        public Builder(ServiceObjectTrackerGroupFeatureState defaults) {
            $ = new ServiceObjectTrackerGroupFeatureState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the Feature
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Feature
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param featureProfileId Feature Profile ID
         * 
         * @return builder
         * 
         */
        public Builder featureProfileId(@Nullable Output<String> featureProfileId) {
            $.featureProfileId = featureProfileId;
            return this;
        }

        /**
         * @param featureProfileId Feature Profile ID
         * 
         * @return builder
         * 
         */
        public Builder featureProfileId(String featureProfileId) {
            return featureProfileId(Output.of(featureProfileId));
        }

        /**
         * @param name The name of the Feature
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Feature
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param objectTrackerId Object ID - Range: `1`-`1000`
         * 
         * @return builder
         * 
         */
        public Builder objectTrackerId(@Nullable Output<Integer> objectTrackerId) {
            $.objectTrackerId = objectTrackerId;
            return this;
        }

        /**
         * @param objectTrackerId Object ID - Range: `1`-`1000`
         * 
         * @return builder
         * 
         */
        public Builder objectTrackerId(Integer objectTrackerId) {
            return objectTrackerId(Output.of(objectTrackerId));
        }

        /**
         * @param objectTrackerIdVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder objectTrackerIdVariable(@Nullable Output<String> objectTrackerIdVariable) {
            $.objectTrackerIdVariable = objectTrackerIdVariable;
            return this;
        }

        /**
         * @param objectTrackerIdVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder objectTrackerIdVariable(String objectTrackerIdVariable) {
            return objectTrackerIdVariable(Output.of(objectTrackerIdVariable));
        }

        /**
         * @param reachable tracker ref list criteria boolean and or - Choices: `and`, `or` - Default value: `or`
         * 
         * @return builder
         * 
         */
        public Builder reachable(@Nullable Output<String> reachable) {
            $.reachable = reachable;
            return this;
        }

        /**
         * @param reachable tracker ref list criteria boolean and or - Choices: `and`, `or` - Default value: `or`
         * 
         * @return builder
         * 
         */
        public Builder reachable(String reachable) {
            return reachable(Output.of(reachable));
        }

        /**
         * @param reachableVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder reachableVariable(@Nullable Output<String> reachableVariable) {
            $.reachableVariable = reachableVariable;
            return this;
        }

        /**
         * @param reachableVariable Variable name
         * 
         * @return builder
         * 
         */
        public Builder reachableVariable(String reachableVariable) {
            return reachableVariable(Output.of(reachableVariable));
        }

        /**
         * @param trackerElements Group Tracks ID Refs
         * 
         * @return builder
         * 
         */
        public Builder trackerElements(@Nullable Output<List<ServiceObjectTrackerGroupFeatureTrackerElementArgs>> trackerElements) {
            $.trackerElements = trackerElements;
            return this;
        }

        /**
         * @param trackerElements Group Tracks ID Refs
         * 
         * @return builder
         * 
         */
        public Builder trackerElements(List<ServiceObjectTrackerGroupFeatureTrackerElementArgs> trackerElements) {
            return trackerElements(Output.of(trackerElements));
        }

        /**
         * @param trackerElements Group Tracks ID Refs
         * 
         * @return builder
         * 
         */
        public Builder trackerElements(ServiceObjectTrackerGroupFeatureTrackerElementArgs... trackerElements) {
            return trackerElements(List.of(trackerElements));
        }

        /**
         * @param version The version of the Feature
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the Feature
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public ServiceObjectTrackerGroupFeatureState build() {
            return $;
        }
    }

}