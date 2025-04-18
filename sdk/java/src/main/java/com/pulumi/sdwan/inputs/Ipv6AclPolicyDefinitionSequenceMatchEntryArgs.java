// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class Ipv6AclPolicyDefinitionSequenceMatchEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final Ipv6AclPolicyDefinitionSequenceMatchEntryArgs Empty = new Ipv6AclPolicyDefinitionSequenceMatchEntryArgs();

    /**
     * Class map ID, Attribute conditional on `type` being equal to `class`
     * 
     */
    @Import(name="classMapId")
    private @Nullable Output<String> classMapId;

    /**
     * @return Class map ID, Attribute conditional on `type` being equal to `class`
     * 
     */
    public Optional<Output<String>> classMapId() {
        return Optional.ofNullable(this.classMapId);
    }

    /**
     * Class map version
     * 
     */
    @Import(name="classMapVersion")
    private @Nullable Output<Integer> classMapVersion;

    /**
     * @return Class map version
     * 
     */
    public Optional<Output<Integer>> classMapVersion() {
        return Optional.ofNullable(this.classMapVersion);
    }

    /**
     * Destination dataIPv6 prefix list ID, Attribute conditional on `type` being equal to `destinationDataIpv6PrefixList`
     * 
     */
    @Import(name="destinationDataIpv6PrefixListId")
    private @Nullable Output<String> destinationDataIpv6PrefixListId;

    /**
     * @return Destination dataIPv6 prefix list ID, Attribute conditional on `type` being equal to `destinationDataIpv6PrefixList`
     * 
     */
    public Optional<Output<String>> destinationDataIpv6PrefixListId() {
        return Optional.ofNullable(this.destinationDataIpv6PrefixListId);
    }

    /**
     * Destination data prefix list version
     * 
     */
    @Import(name="destinationDataIpv6PrefixListVersion")
    private @Nullable Output<Integer> destinationDataIpv6PrefixListVersion;

    /**
     * @return Destination data prefix list version
     * 
     */
    public Optional<Output<Integer>> destinationDataIpv6PrefixListVersion() {
        return Optional.ofNullable(this.destinationDataIpv6PrefixListVersion);
    }

    /**
     * Destination IPv6 prefix, Attribute conditional on `type` being equal to `destinationIpv6`
     * 
     */
    @Import(name="destinationIp")
    private @Nullable Output<String> destinationIp;

    /**
     * @return Destination IPv6 prefix, Attribute conditional on `type` being equal to `destinationIpv6`
     * 
     */
    public Optional<Output<String>> destinationIp() {
        return Optional.ofNullable(this.destinationIp);
    }

    /**
     * Destination ports. Single value (0-65535) or ranges separated by spaces., Attribute conditional on `type` being equal to `destinationPort`
     * 
     */
    @Import(name="destinationPorts")
    private @Nullable Output<String> destinationPorts;

    /**
     * @return Destination ports. Single value (0-65535) or ranges separated by spaces., Attribute conditional on `type` being equal to `destinationPort`
     * 
     */
    public Optional<Output<String>> destinationPorts() {
        return Optional.ofNullable(this.destinationPorts);
    }

    /**
     * Next header, Attribute conditional on `type` being equal to `nextHeader`
     *   - Range: `0`-`255`
     * 
     */
    @Import(name="nextHeader")
    private @Nullable Output<Integer> nextHeader;

    /**
     * @return Next header, Attribute conditional on `type` being equal to `nextHeader`
     *   - Range: `0`-`255`
     * 
     */
    public Optional<Output<Integer>> nextHeader() {
        return Optional.ofNullable(this.nextHeader);
    }

    /**
     * Packet length, Attribute conditional on `type` being equal to `packetLength`
     *   - Range: `0`-`65535`
     * 
     */
    @Import(name="packetLength")
    private @Nullable Output<Integer> packetLength;

    /**
     * @return Packet length, Attribute conditional on `type` being equal to `packetLength`
     *   - Range: `0`-`65535`
     * 
     */
    public Optional<Output<Integer>> packetLength() {
        return Optional.ofNullable(this.packetLength);
    }

    /**
     * PLP - priority, Attribute conditional on `type` being equal to `plp`
     *   - Choices: `high`, `low`
     * 
     */
    @Import(name="priority")
    private @Nullable Output<String> priority;

    /**
     * @return PLP - priority, Attribute conditional on `type` being equal to `plp`
     *   - Choices: `high`, `low`
     * 
     */
    public Optional<Output<String>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * Source data IPv6 prefix list ID, Attribute conditional on `type` being equal to `sourceDataIpv6PrefixList`
     * 
     */
    @Import(name="sourceDataIpv6PrefixListId")
    private @Nullable Output<String> sourceDataIpv6PrefixListId;

    /**
     * @return Source data IPv6 prefix list ID, Attribute conditional on `type` being equal to `sourceDataIpv6PrefixList`
     * 
     */
    public Optional<Output<String>> sourceDataIpv6PrefixListId() {
        return Optional.ofNullable(this.sourceDataIpv6PrefixListId);
    }

    /**
     * Source data IPv6 prefix list version
     * 
     */
    @Import(name="sourceDataIpv6PrefixListVersion")
    private @Nullable Output<Integer> sourceDataIpv6PrefixListVersion;

    /**
     * @return Source data IPv6 prefix list version
     * 
     */
    public Optional<Output<Integer>> sourceDataIpv6PrefixListVersion() {
        return Optional.ofNullable(this.sourceDataIpv6PrefixListVersion);
    }

    /**
     * Source IPv6 prefix, Attribute conditional on `type` being equal to `sourceIpv6`
     * 
     */
    @Import(name="sourceIp")
    private @Nullable Output<String> sourceIp;

    /**
     * @return Source IPv6 prefix, Attribute conditional on `type` being equal to `sourceIpv6`
     * 
     */
    public Optional<Output<String>> sourceIp() {
        return Optional.ofNullable(this.sourceIp);
    }

    /**
     * Source ports. Single value (0-65535) or ranges separated by spaces., Attribute conditional on `type` being equal to `sourcePort`
     * 
     */
    @Import(name="sourcePorts")
    private @Nullable Output<String> sourcePorts;

    /**
     * @return Source ports. Single value (0-65535) or ranges separated by spaces., Attribute conditional on `type` being equal to `sourcePort`
     * 
     */
    public Optional<Output<String>> sourcePorts() {
        return Optional.ofNullable(this.sourcePorts);
    }

    /**
     * TCP parameters, Attribute conditional on `type` being equal to `tcp`
     *   - Choices: `syn`
     * 
     */
    @Import(name="tcp")
    private @Nullable Output<String> tcp;

    /**
     * @return TCP parameters, Attribute conditional on `type` being equal to `tcp`
     *   - Choices: `syn`
     * 
     */
    public Optional<Output<String>> tcp() {
        return Optional.ofNullable(this.tcp);
    }

    /**
     * Traffic class, Attribute conditional on `type` being equal to `trafficClass`
     *   - Range: `0`-`63`
     * 
     */
    @Import(name="trafficClass")
    private @Nullable Output<Integer> trafficClass;

    /**
     * @return Traffic class, Attribute conditional on `type` being equal to `trafficClass`
     *   - Range: `0`-`63`
     * 
     */
    public Optional<Output<Integer>> trafficClass() {
        return Optional.ofNullable(this.trafficClass);
    }

    /**
     * Type of match entry
     *   - Choices: `nextHeader`, `sourceIpv6`, `destinationIpv6`, `class`, `packetLength`, `plp`, `sourcePort`, `destinationPort`, `sourceDataIpv6PrefixList`, `destinationDataIpv6PrefixList`, `tcp`, `trafficClass`
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of match entry
     *   - Choices: `nextHeader`, `sourceIpv6`, `destinationIpv6`, `class`, `packetLength`, `plp`, `sourcePort`, `destinationPort`, `sourceDataIpv6PrefixList`, `destinationDataIpv6PrefixList`, `tcp`, `trafficClass`
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private Ipv6AclPolicyDefinitionSequenceMatchEntryArgs() {}

    private Ipv6AclPolicyDefinitionSequenceMatchEntryArgs(Ipv6AclPolicyDefinitionSequenceMatchEntryArgs $) {
        this.classMapId = $.classMapId;
        this.classMapVersion = $.classMapVersion;
        this.destinationDataIpv6PrefixListId = $.destinationDataIpv6PrefixListId;
        this.destinationDataIpv6PrefixListVersion = $.destinationDataIpv6PrefixListVersion;
        this.destinationIp = $.destinationIp;
        this.destinationPorts = $.destinationPorts;
        this.nextHeader = $.nextHeader;
        this.packetLength = $.packetLength;
        this.priority = $.priority;
        this.sourceDataIpv6PrefixListId = $.sourceDataIpv6PrefixListId;
        this.sourceDataIpv6PrefixListVersion = $.sourceDataIpv6PrefixListVersion;
        this.sourceIp = $.sourceIp;
        this.sourcePorts = $.sourcePorts;
        this.tcp = $.tcp;
        this.trafficClass = $.trafficClass;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Ipv6AclPolicyDefinitionSequenceMatchEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Ipv6AclPolicyDefinitionSequenceMatchEntryArgs $;

        public Builder() {
            $ = new Ipv6AclPolicyDefinitionSequenceMatchEntryArgs();
        }

        public Builder(Ipv6AclPolicyDefinitionSequenceMatchEntryArgs defaults) {
            $ = new Ipv6AclPolicyDefinitionSequenceMatchEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param classMapId Class map ID, Attribute conditional on `type` being equal to `class`
         * 
         * @return builder
         * 
         */
        public Builder classMapId(@Nullable Output<String> classMapId) {
            $.classMapId = classMapId;
            return this;
        }

        /**
         * @param classMapId Class map ID, Attribute conditional on `type` being equal to `class`
         * 
         * @return builder
         * 
         */
        public Builder classMapId(String classMapId) {
            return classMapId(Output.of(classMapId));
        }

        /**
         * @param classMapVersion Class map version
         * 
         * @return builder
         * 
         */
        public Builder classMapVersion(@Nullable Output<Integer> classMapVersion) {
            $.classMapVersion = classMapVersion;
            return this;
        }

        /**
         * @param classMapVersion Class map version
         * 
         * @return builder
         * 
         */
        public Builder classMapVersion(Integer classMapVersion) {
            return classMapVersion(Output.of(classMapVersion));
        }

        /**
         * @param destinationDataIpv6PrefixListId Destination dataIPv6 prefix list ID, Attribute conditional on `type` being equal to `destinationDataIpv6PrefixList`
         * 
         * @return builder
         * 
         */
        public Builder destinationDataIpv6PrefixListId(@Nullable Output<String> destinationDataIpv6PrefixListId) {
            $.destinationDataIpv6PrefixListId = destinationDataIpv6PrefixListId;
            return this;
        }

        /**
         * @param destinationDataIpv6PrefixListId Destination dataIPv6 prefix list ID, Attribute conditional on `type` being equal to `destinationDataIpv6PrefixList`
         * 
         * @return builder
         * 
         */
        public Builder destinationDataIpv6PrefixListId(String destinationDataIpv6PrefixListId) {
            return destinationDataIpv6PrefixListId(Output.of(destinationDataIpv6PrefixListId));
        }

        /**
         * @param destinationDataIpv6PrefixListVersion Destination data prefix list version
         * 
         * @return builder
         * 
         */
        public Builder destinationDataIpv6PrefixListVersion(@Nullable Output<Integer> destinationDataIpv6PrefixListVersion) {
            $.destinationDataIpv6PrefixListVersion = destinationDataIpv6PrefixListVersion;
            return this;
        }

        /**
         * @param destinationDataIpv6PrefixListVersion Destination data prefix list version
         * 
         * @return builder
         * 
         */
        public Builder destinationDataIpv6PrefixListVersion(Integer destinationDataIpv6PrefixListVersion) {
            return destinationDataIpv6PrefixListVersion(Output.of(destinationDataIpv6PrefixListVersion));
        }

        /**
         * @param destinationIp Destination IPv6 prefix, Attribute conditional on `type` being equal to `destinationIpv6`
         * 
         * @return builder
         * 
         */
        public Builder destinationIp(@Nullable Output<String> destinationIp) {
            $.destinationIp = destinationIp;
            return this;
        }

        /**
         * @param destinationIp Destination IPv6 prefix, Attribute conditional on `type` being equal to `destinationIpv6`
         * 
         * @return builder
         * 
         */
        public Builder destinationIp(String destinationIp) {
            return destinationIp(Output.of(destinationIp));
        }

        /**
         * @param destinationPorts Destination ports. Single value (0-65535) or ranges separated by spaces., Attribute conditional on `type` being equal to `destinationPort`
         * 
         * @return builder
         * 
         */
        public Builder destinationPorts(@Nullable Output<String> destinationPorts) {
            $.destinationPorts = destinationPorts;
            return this;
        }

        /**
         * @param destinationPorts Destination ports. Single value (0-65535) or ranges separated by spaces., Attribute conditional on `type` being equal to `destinationPort`
         * 
         * @return builder
         * 
         */
        public Builder destinationPorts(String destinationPorts) {
            return destinationPorts(Output.of(destinationPorts));
        }

        /**
         * @param nextHeader Next header, Attribute conditional on `type` being equal to `nextHeader`
         *   - Range: `0`-`255`
         * 
         * @return builder
         * 
         */
        public Builder nextHeader(@Nullable Output<Integer> nextHeader) {
            $.nextHeader = nextHeader;
            return this;
        }

        /**
         * @param nextHeader Next header, Attribute conditional on `type` being equal to `nextHeader`
         *   - Range: `0`-`255`
         * 
         * @return builder
         * 
         */
        public Builder nextHeader(Integer nextHeader) {
            return nextHeader(Output.of(nextHeader));
        }

        /**
         * @param packetLength Packet length, Attribute conditional on `type` being equal to `packetLength`
         *   - Range: `0`-`65535`
         * 
         * @return builder
         * 
         */
        public Builder packetLength(@Nullable Output<Integer> packetLength) {
            $.packetLength = packetLength;
            return this;
        }

        /**
         * @param packetLength Packet length, Attribute conditional on `type` being equal to `packetLength`
         *   - Range: `0`-`65535`
         * 
         * @return builder
         * 
         */
        public Builder packetLength(Integer packetLength) {
            return packetLength(Output.of(packetLength));
        }

        /**
         * @param priority PLP - priority, Attribute conditional on `type` being equal to `plp`
         *   - Choices: `high`, `low`
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<String> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority PLP - priority, Attribute conditional on `type` being equal to `plp`
         *   - Choices: `high`, `low`
         * 
         * @return builder
         * 
         */
        public Builder priority(String priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param sourceDataIpv6PrefixListId Source data IPv6 prefix list ID, Attribute conditional on `type` being equal to `sourceDataIpv6PrefixList`
         * 
         * @return builder
         * 
         */
        public Builder sourceDataIpv6PrefixListId(@Nullable Output<String> sourceDataIpv6PrefixListId) {
            $.sourceDataIpv6PrefixListId = sourceDataIpv6PrefixListId;
            return this;
        }

        /**
         * @param sourceDataIpv6PrefixListId Source data IPv6 prefix list ID, Attribute conditional on `type` being equal to `sourceDataIpv6PrefixList`
         * 
         * @return builder
         * 
         */
        public Builder sourceDataIpv6PrefixListId(String sourceDataIpv6PrefixListId) {
            return sourceDataIpv6PrefixListId(Output.of(sourceDataIpv6PrefixListId));
        }

        /**
         * @param sourceDataIpv6PrefixListVersion Source data IPv6 prefix list version
         * 
         * @return builder
         * 
         */
        public Builder sourceDataIpv6PrefixListVersion(@Nullable Output<Integer> sourceDataIpv6PrefixListVersion) {
            $.sourceDataIpv6PrefixListVersion = sourceDataIpv6PrefixListVersion;
            return this;
        }

        /**
         * @param sourceDataIpv6PrefixListVersion Source data IPv6 prefix list version
         * 
         * @return builder
         * 
         */
        public Builder sourceDataIpv6PrefixListVersion(Integer sourceDataIpv6PrefixListVersion) {
            return sourceDataIpv6PrefixListVersion(Output.of(sourceDataIpv6PrefixListVersion));
        }

        /**
         * @param sourceIp Source IPv6 prefix, Attribute conditional on `type` being equal to `sourceIpv6`
         * 
         * @return builder
         * 
         */
        public Builder sourceIp(@Nullable Output<String> sourceIp) {
            $.sourceIp = sourceIp;
            return this;
        }

        /**
         * @param sourceIp Source IPv6 prefix, Attribute conditional on `type` being equal to `sourceIpv6`
         * 
         * @return builder
         * 
         */
        public Builder sourceIp(String sourceIp) {
            return sourceIp(Output.of(sourceIp));
        }

        /**
         * @param sourcePorts Source ports. Single value (0-65535) or ranges separated by spaces., Attribute conditional on `type` being equal to `sourcePort`
         * 
         * @return builder
         * 
         */
        public Builder sourcePorts(@Nullable Output<String> sourcePorts) {
            $.sourcePorts = sourcePorts;
            return this;
        }

        /**
         * @param sourcePorts Source ports. Single value (0-65535) or ranges separated by spaces., Attribute conditional on `type` being equal to `sourcePort`
         * 
         * @return builder
         * 
         */
        public Builder sourcePorts(String sourcePorts) {
            return sourcePorts(Output.of(sourcePorts));
        }

        /**
         * @param tcp TCP parameters, Attribute conditional on `type` being equal to `tcp`
         *   - Choices: `syn`
         * 
         * @return builder
         * 
         */
        public Builder tcp(@Nullable Output<String> tcp) {
            $.tcp = tcp;
            return this;
        }

        /**
         * @param tcp TCP parameters, Attribute conditional on `type` being equal to `tcp`
         *   - Choices: `syn`
         * 
         * @return builder
         * 
         */
        public Builder tcp(String tcp) {
            return tcp(Output.of(tcp));
        }

        /**
         * @param trafficClass Traffic class, Attribute conditional on `type` being equal to `trafficClass`
         *   - Range: `0`-`63`
         * 
         * @return builder
         * 
         */
        public Builder trafficClass(@Nullable Output<Integer> trafficClass) {
            $.trafficClass = trafficClass;
            return this;
        }

        /**
         * @param trafficClass Traffic class, Attribute conditional on `type` being equal to `trafficClass`
         *   - Range: `0`-`63`
         * 
         * @return builder
         * 
         */
        public Builder trafficClass(Integer trafficClass) {
            return trafficClass(Output.of(trafficClass));
        }

        /**
         * @param type Type of match entry
         *   - Choices: `nextHeader`, `sourceIpv6`, `destinationIpv6`, `class`, `packetLength`, `plp`, `sourcePort`, `destinationPort`, `sourceDataIpv6PrefixList`, `destinationDataIpv6PrefixList`, `tcp`, `trafficClass`
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of match entry
         *   - Choices: `nextHeader`, `sourceIpv6`, `destinationIpv6`, `class`, `packetLength`, `plp`, `sourcePort`, `destinationPort`, `sourceDataIpv6PrefixList`, `destinationDataIpv6PrefixList`, `tcp`, `trafficClass`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Ipv6AclPolicyDefinitionSequenceMatchEntryArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("Ipv6AclPolicyDefinitionSequenceMatchEntryArgs", "type");
            }
            return $;
        }
    }

}
