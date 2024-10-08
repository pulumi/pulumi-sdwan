// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CellularControllerFeatureTemplateDataProfile {
    /**
     * @return Set attach profile
     *   - Range: `1`-`16`
     * 
     */
    private @Nullable Integer attachProfile;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String attachProfileVariable;
    /**
     * @return Set data profile
     *   - Range: `1`-`16`
     * 
     */
    private @Nullable Integer dataProfile;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String dataProfileVariable;
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    private @Nullable Boolean optional;
    /**
     * @return Set slot number
     *   - Range: `0`-`1`
     * 
     */
    private @Nullable Integer slotNumber;
    /**
     * @return Variable name
     * 
     */
    private @Nullable String slotNumberVariable;

    private CellularControllerFeatureTemplateDataProfile() {}
    /**
     * @return Set attach profile
     *   - Range: `1`-`16`
     * 
     */
    public Optional<Integer> attachProfile() {
        return Optional.ofNullable(this.attachProfile);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> attachProfileVariable() {
        return Optional.ofNullable(this.attachProfileVariable);
    }
    /**
     * @return Set data profile
     *   - Range: `1`-`16`
     * 
     */
    public Optional<Integer> dataProfile() {
        return Optional.ofNullable(this.dataProfile);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> dataProfileVariable() {
        return Optional.ofNullable(this.dataProfileVariable);
    }
    /**
     * @return Indicates if list item is considered optional.
     * 
     */
    public Optional<Boolean> optional() {
        return Optional.ofNullable(this.optional);
    }
    /**
     * @return Set slot number
     *   - Range: `0`-`1`
     * 
     */
    public Optional<Integer> slotNumber() {
        return Optional.ofNullable(this.slotNumber);
    }
    /**
     * @return Variable name
     * 
     */
    public Optional<String> slotNumberVariable() {
        return Optional.ofNullable(this.slotNumberVariable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CellularControllerFeatureTemplateDataProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer attachProfile;
        private @Nullable String attachProfileVariable;
        private @Nullable Integer dataProfile;
        private @Nullable String dataProfileVariable;
        private @Nullable Boolean optional;
        private @Nullable Integer slotNumber;
        private @Nullable String slotNumberVariable;
        public Builder() {}
        public Builder(CellularControllerFeatureTemplateDataProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachProfile = defaults.attachProfile;
    	      this.attachProfileVariable = defaults.attachProfileVariable;
    	      this.dataProfile = defaults.dataProfile;
    	      this.dataProfileVariable = defaults.dataProfileVariable;
    	      this.optional = defaults.optional;
    	      this.slotNumber = defaults.slotNumber;
    	      this.slotNumberVariable = defaults.slotNumberVariable;
        }

        @CustomType.Setter
        public Builder attachProfile(@Nullable Integer attachProfile) {

            this.attachProfile = attachProfile;
            return this;
        }
        @CustomType.Setter
        public Builder attachProfileVariable(@Nullable String attachProfileVariable) {

            this.attachProfileVariable = attachProfileVariable;
            return this;
        }
        @CustomType.Setter
        public Builder dataProfile(@Nullable Integer dataProfile) {

            this.dataProfile = dataProfile;
            return this;
        }
        @CustomType.Setter
        public Builder dataProfileVariable(@Nullable String dataProfileVariable) {

            this.dataProfileVariable = dataProfileVariable;
            return this;
        }
        @CustomType.Setter
        public Builder optional(@Nullable Boolean optional) {

            this.optional = optional;
            return this;
        }
        @CustomType.Setter
        public Builder slotNumber(@Nullable Integer slotNumber) {

            this.slotNumber = slotNumber;
            return this;
        }
        @CustomType.Setter
        public Builder slotNumberVariable(@Nullable String slotNumberVariable) {

            this.slotNumberVariable = slotNumberVariable;
            return this;
        }
        public CellularControllerFeatureTemplateDataProfile build() {
            final var _resultValue = new CellularControllerFeatureTemplateDataProfile();
            _resultValue.attachProfile = attachProfile;
            _resultValue.attachProfileVariable = attachProfileVariable;
            _resultValue.dataProfile = dataProfile;
            _resultValue.dataProfileVariable = dataProfileVariable;
            _resultValue.optional = optional;
            _resultValue.slotNumber = slotNumber;
            _resultValue.slotNumberVariable = slotNumberVariable;
            return _resultValue;
        }
    }
}
