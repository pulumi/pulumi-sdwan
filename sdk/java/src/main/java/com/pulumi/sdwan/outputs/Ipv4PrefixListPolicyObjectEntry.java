// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Ipv4PrefixListPolicyObjectEntry {
    /**
     * @return Greater equal
     * 
     */
    private @Nullable Integer ge;
    /**
     * @return Lesser equal
     * 
     */
    private @Nullable Integer le;
    /**
     * @return IP prefix list entry e.g., `10.0.0.0/12`
     * 
     */
    private String prefix;

    private Ipv4PrefixListPolicyObjectEntry() {}
    /**
     * @return Greater equal
     * 
     */
    public Optional<Integer> ge() {
        return Optional.ofNullable(this.ge);
    }
    /**
     * @return Lesser equal
     * 
     */
    public Optional<Integer> le() {
        return Optional.ofNullable(this.le);
    }
    /**
     * @return IP prefix list entry e.g., `10.0.0.0/12`
     * 
     */
    public String prefix() {
        return this.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Ipv4PrefixListPolicyObjectEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer ge;
        private @Nullable Integer le;
        private String prefix;
        public Builder() {}
        public Builder(Ipv4PrefixListPolicyObjectEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ge = defaults.ge;
    	      this.le = defaults.le;
    	      this.prefix = defaults.prefix;
        }

        @CustomType.Setter
        public Builder ge(@Nullable Integer ge) {

            this.ge = ge;
            return this;
        }
        @CustomType.Setter
        public Builder le(@Nullable Integer le) {

            this.le = le;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(String prefix) {
            if (prefix == null) {
              throw new MissingRequiredPropertyException("Ipv4PrefixListPolicyObjectEntry", "prefix");
            }
            this.prefix = prefix;
            return this;
        }
        public Ipv4PrefixListPolicyObjectEntry build() {
            final var _resultValue = new Ipv4PrefixListPolicyObjectEntry();
            _resultValue.ge = ge;
            _resultValue.le = le;
            _resultValue.prefix = prefix;
            return _resultValue;
        }
    }
}
