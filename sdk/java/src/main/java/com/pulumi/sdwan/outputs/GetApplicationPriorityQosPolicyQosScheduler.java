// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplicationPriorityQosPolicyQosScheduler {
    /**
     * @return bandwidthPercent
     * 
     */
    private String bandwidth;
    /**
     * @return drops
     * 
     */
    private String drops;
    private String forwardingClassId;
    /**
     * @return queue
     * 
     */
    private String queue;
    /**
     * @return scheduling
     * 
     */
    private String schedulingType;

    private GetApplicationPriorityQosPolicyQosScheduler() {}
    /**
     * @return bandwidthPercent
     * 
     */
    public String bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return drops
     * 
     */
    public String drops() {
        return this.drops;
    }
    public String forwardingClassId() {
        return this.forwardingClassId;
    }
    /**
     * @return queue
     * 
     */
    public String queue() {
        return this.queue;
    }
    /**
     * @return scheduling
     * 
     */
    public String schedulingType() {
        return this.schedulingType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationPriorityQosPolicyQosScheduler defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bandwidth;
        private String drops;
        private String forwardingClassId;
        private String queue;
        private String schedulingType;
        public Builder() {}
        public Builder(GetApplicationPriorityQosPolicyQosScheduler defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidth = defaults.bandwidth;
    	      this.drops = defaults.drops;
    	      this.forwardingClassId = defaults.forwardingClassId;
    	      this.queue = defaults.queue;
    	      this.schedulingType = defaults.schedulingType;
        }

        @CustomType.Setter
        public Builder bandwidth(String bandwidth) {
            if (bandwidth == null) {
              throw new MissingRequiredPropertyException("GetApplicationPriorityQosPolicyQosScheduler", "bandwidth");
            }
            this.bandwidth = bandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder drops(String drops) {
            if (drops == null) {
              throw new MissingRequiredPropertyException("GetApplicationPriorityQosPolicyQosScheduler", "drops");
            }
            this.drops = drops;
            return this;
        }
        @CustomType.Setter
        public Builder forwardingClassId(String forwardingClassId) {
            if (forwardingClassId == null) {
              throw new MissingRequiredPropertyException("GetApplicationPriorityQosPolicyQosScheduler", "forwardingClassId");
            }
            this.forwardingClassId = forwardingClassId;
            return this;
        }
        @CustomType.Setter
        public Builder queue(String queue) {
            if (queue == null) {
              throw new MissingRequiredPropertyException("GetApplicationPriorityQosPolicyQosScheduler", "queue");
            }
            this.queue = queue;
            return this;
        }
        @CustomType.Setter
        public Builder schedulingType(String schedulingType) {
            if (schedulingType == null) {
              throw new MissingRequiredPropertyException("GetApplicationPriorityQosPolicyQosScheduler", "schedulingType");
            }
            this.schedulingType = schedulingType;
            return this;
        }
        public GetApplicationPriorityQosPolicyQosScheduler build() {
            final var _resultValue = new GetApplicationPriorityQosPolicyQosScheduler();
            _resultValue.bandwidth = bandwidth;
            _resultValue.drops = drops;
            _resultValue.forwardingClassId = forwardingClassId;
            _resultValue.queue = queue;
            _resultValue.schedulingType = schedulingType;
            return _resultValue;
        }
    }
}
