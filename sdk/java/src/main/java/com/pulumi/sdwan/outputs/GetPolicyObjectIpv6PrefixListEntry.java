// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPolicyObjectIpv6PrefixListEntry {
    /**
     * @return IPv6 prefix length with ge range operator
     * 
     */
    private Integer ge;
    /**
     * @return IPv6 address
     * 
     */
    private String ipv6Address;
    /**
     * @return IPv6 prefix length
     * 
     */
    private Integer ipv6PrefixLength;
    /**
     * @return IPv6 prefix length with le range operator
     * 
     */
    private Integer le;

    private GetPolicyObjectIpv6PrefixListEntry() {}
    /**
     * @return IPv6 prefix length with ge range operator
     * 
     */
    public Integer ge() {
        return this.ge;
    }
    /**
     * @return IPv6 address
     * 
     */
    public String ipv6Address() {
        return this.ipv6Address;
    }
    /**
     * @return IPv6 prefix length
     * 
     */
    public Integer ipv6PrefixLength() {
        return this.ipv6PrefixLength;
    }
    /**
     * @return IPv6 prefix length with le range operator
     * 
     */
    public Integer le() {
        return this.le;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyObjectIpv6PrefixListEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer ge;
        private String ipv6Address;
        private Integer ipv6PrefixLength;
        private Integer le;
        public Builder() {}
        public Builder(GetPolicyObjectIpv6PrefixListEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ge = defaults.ge;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.ipv6PrefixLength = defaults.ipv6PrefixLength;
    	      this.le = defaults.le;
        }

        @CustomType.Setter
        public Builder ge(Integer ge) {
            if (ge == null) {
              throw new MissingRequiredPropertyException("GetPolicyObjectIpv6PrefixListEntry", "ge");
            }
            this.ge = ge;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6Address(String ipv6Address) {
            if (ipv6Address == null) {
              throw new MissingRequiredPropertyException("GetPolicyObjectIpv6PrefixListEntry", "ipv6Address");
            }
            this.ipv6Address = ipv6Address;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6PrefixLength(Integer ipv6PrefixLength) {
            if (ipv6PrefixLength == null) {
              throw new MissingRequiredPropertyException("GetPolicyObjectIpv6PrefixListEntry", "ipv6PrefixLength");
            }
            this.ipv6PrefixLength = ipv6PrefixLength;
            return this;
        }
        @CustomType.Setter
        public Builder le(Integer le) {
            if (le == null) {
              throw new MissingRequiredPropertyException("GetPolicyObjectIpv6PrefixListEntry", "le");
            }
            this.le = le;
            return this;
        }
        public GetPolicyObjectIpv6PrefixListEntry build() {
            final var _resultValue = new GetPolicyObjectIpv6PrefixListEntry();
            _resultValue.ge = ge;
            _resultValue.ipv6Address = ipv6Address;
            _resultValue.ipv6PrefixLength = ipv6PrefixLength;
            _resultValue.le = le;
            return _resultValue;
        }
    }
}