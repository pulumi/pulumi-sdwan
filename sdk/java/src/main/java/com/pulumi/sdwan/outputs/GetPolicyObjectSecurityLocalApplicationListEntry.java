// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPolicyObjectSecurityLocalApplicationListEntry {
    private String app;
    private String appFamily;

    private GetPolicyObjectSecurityLocalApplicationListEntry() {}
    public String app() {
        return this.app;
    }
    public String appFamily() {
        return this.appFamily;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyObjectSecurityLocalApplicationListEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String app;
        private String appFamily;
        public Builder() {}
        public Builder(GetPolicyObjectSecurityLocalApplicationListEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.app = defaults.app;
    	      this.appFamily = defaults.appFamily;
        }

        @CustomType.Setter
        public Builder app(String app) {
            if (app == null) {
              throw new MissingRequiredPropertyException("GetPolicyObjectSecurityLocalApplicationListEntry", "app");
            }
            this.app = app;
            return this;
        }
        @CustomType.Setter
        public Builder appFamily(String appFamily) {
            if (appFamily == null) {
              throw new MissingRequiredPropertyException("GetPolicyObjectSecurityLocalApplicationListEntry", "appFamily");
            }
            this.appFamily = appFamily;
            return this;
        }
        public GetPolicyObjectSecurityLocalApplicationListEntry build() {
            final var _resultValue = new GetPolicyObjectSecurityLocalApplicationListEntry();
            _resultValue.app = app;
            _resultValue.appFamily = appFamily;
            return _resultValue;
        }
    }
}
