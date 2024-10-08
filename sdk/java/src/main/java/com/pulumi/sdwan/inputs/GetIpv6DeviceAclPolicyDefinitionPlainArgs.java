// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetIpv6DeviceAclPolicyDefinitionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIpv6DeviceAclPolicyDefinitionPlainArgs Empty = new GetIpv6DeviceAclPolicyDefinitionPlainArgs();

    /**
     * The id of the object
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The id of the object
     * 
     */
    public String id() {
        return this.id;
    }

    private GetIpv6DeviceAclPolicyDefinitionPlainArgs() {}

    private GetIpv6DeviceAclPolicyDefinitionPlainArgs(GetIpv6DeviceAclPolicyDefinitionPlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIpv6DeviceAclPolicyDefinitionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIpv6DeviceAclPolicyDefinitionPlainArgs $;

        public Builder() {
            $ = new GetIpv6DeviceAclPolicyDefinitionPlainArgs();
        }

        public Builder(GetIpv6DeviceAclPolicyDefinitionPlainArgs defaults) {
            $ = new GetIpv6DeviceAclPolicyDefinitionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The id of the object
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetIpv6DeviceAclPolicyDefinitionPlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetIpv6DeviceAclPolicyDefinitionPlainArgs", "id");
            }
            return $;
        }
    }

}
