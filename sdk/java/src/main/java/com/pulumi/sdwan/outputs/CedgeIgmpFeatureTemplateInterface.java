// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sdwan.outputs.CedgeIgmpFeatureTemplateInterfaceJoinGroup;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CedgeIgmpFeatureTemplateInterface {
    /**
     * @return Configure static joins
     * 
     */
    private @Nullable List<CedgeIgmpFeatureTemplateInterfaceJoinGroup> joinGroups;
    /**
     * @return Set interface name
     * 
     */
    private @Nullable String name;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String nameVariable;
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private @Nullable Boolean optional;

    private CedgeIgmpFeatureTemplateInterface() {}
    /**
     * @return Configure static joins
     * 
     */
    public List<CedgeIgmpFeatureTemplateInterfaceJoinGroup> joinGroups() {
        return this.joinGroups == null ? List.of() : this.joinGroups;
    }
    /**
     * @return Set interface name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> nameVariable() {
        return Optional.ofNullable(this.nameVariable);
    }
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Optional<Boolean> optional() {
        return Optional.ofNullable(this.optional);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CedgeIgmpFeatureTemplateInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<CedgeIgmpFeatureTemplateInterfaceJoinGroup> joinGroups;
        private @Nullable String name;
        private @Nullable String nameVariable;
        private @Nullable Boolean optional;
        public Builder() {}
        public Builder(CedgeIgmpFeatureTemplateInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.joinGroups = defaults.joinGroups;
    	      this.name = defaults.name;
    	      this.nameVariable = defaults.nameVariable;
    	      this.optional = defaults.optional;
        }

        @CustomType.Setter
        public Builder joinGroups(@Nullable List<CedgeIgmpFeatureTemplateInterfaceJoinGroup> joinGroups) {

            this.joinGroups = joinGroups;
            return this;
        }
        public Builder joinGroups(CedgeIgmpFeatureTemplateInterfaceJoinGroup... joinGroups) {
            return joinGroups(List.of(joinGroups));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nameVariable(@Nullable String nameVariable) {

            this.nameVariable = nameVariable;
            return this;
        }
        @CustomType.Setter
        public Builder optional(@Nullable Boolean optional) {

            this.optional = optional;
            return this;
        }
        public CedgeIgmpFeatureTemplateInterface build() {
            final var _resultValue = new CedgeIgmpFeatureTemplateInterface();
            _resultValue.joinGroups = joinGroups;
            _resultValue.name = name;
            _resultValue.nameVariable = nameVariable;
            _resultValue.optional = optional;
            return _resultValue;
        }
    }
}
