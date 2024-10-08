// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sdwan.outputs.GetSystemSnmpFeatureViewOid;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSystemSnmpFeatureView {
    /**
     * @return Set the name of the SNMP view
     * 
     */
    private String name;
    /**
     * @return Configure SNMP object identifier
     * 
     */
    private List<GetSystemSnmpFeatureViewOid> oids;

    private GetSystemSnmpFeatureView() {}
    /**
     * @return Set the name of the SNMP view
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Configure SNMP object identifier
     * 
     */
    public List<GetSystemSnmpFeatureViewOid> oids() {
        return this.oids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSystemSnmpFeatureView defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private List<GetSystemSnmpFeatureViewOid> oids;
        public Builder() {}
        public Builder(GetSystemSnmpFeatureView defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.oids = defaults.oids;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSystemSnmpFeatureView", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder oids(List<GetSystemSnmpFeatureViewOid> oids) {
            if (oids == null) {
              throw new MissingRequiredPropertyException("GetSystemSnmpFeatureView", "oids");
            }
            this.oids = oids;
            return this;
        }
        public Builder oids(GetSystemSnmpFeatureViewOid... oids) {
            return oids(List.of(oids));
        }
        public GetSystemSnmpFeatureView build() {
            final var _resultValue = new GetSystemSnmpFeatureView();
            _resultValue.name = name;
            _resultValue.oids = oids;
            return _resultValue;
        }
    }
}
