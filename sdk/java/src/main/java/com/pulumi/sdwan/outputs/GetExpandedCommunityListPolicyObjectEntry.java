// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetExpandedCommunityListPolicyObjectEntry {
    /**
     * @return Expanded community value, e.g. `100:1000`
     * 
     */
    private String community;

    private GetExpandedCommunityListPolicyObjectEntry() {}
    /**
     * @return Expanded community value, e.g. `100:1000`
     * 
     */
    public String community() {
        return this.community;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExpandedCommunityListPolicyObjectEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String community;
        public Builder() {}
        public Builder(GetExpandedCommunityListPolicyObjectEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.community = defaults.community;
        }

        @CustomType.Setter
        public Builder community(String community) {
            if (community == null) {
              throw new MissingRequiredPropertyException("GetExpandedCommunityListPolicyObjectEntry", "community");
            }
            this.community = community;
            return this;
        }
        public GetExpandedCommunityListPolicyObjectEntry build() {
            final var _resultValue = new GetExpandedCommunityListPolicyObjectEntry();
            _resultValue.community = community;
            return _resultValue;
        }
    }
}
