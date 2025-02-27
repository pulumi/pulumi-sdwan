// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sdwan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCflowdPolicyDefinitionCollector {
    /**
     * @return BFD metrics exporting
     * 
     */
    private Boolean bfdMetricsExporting;
    /**
     * @return Export spreading
     * 
     */
    private String exportSpreading;
    /**
     * @return Exporting interval
     * 
     */
    private Integer exportingInterval;
    /**
     * @return IP address
     * 
     */
    private String ipAddress;
    /**
     * @return Port
     * 
     */
    private Integer port;
    /**
     * @return Source interface
     * 
     */
    private String sourceInterface;
    /**
     * @return Transport protocol
     * 
     */
    private String transport;
    /**
     * @return VPN ID
     * 
     */
    private Integer vpnId;

    private GetCflowdPolicyDefinitionCollector() {}
    /**
     * @return BFD metrics exporting
     * 
     */
    public Boolean bfdMetricsExporting() {
        return this.bfdMetricsExporting;
    }
    /**
     * @return Export spreading
     * 
     */
    public String exportSpreading() {
        return this.exportSpreading;
    }
    /**
     * @return Exporting interval
     * 
     */
    public Integer exportingInterval() {
        return this.exportingInterval;
    }
    /**
     * @return IP address
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return Port
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Source interface
     * 
     */
    public String sourceInterface() {
        return this.sourceInterface;
    }
    /**
     * @return Transport protocol
     * 
     */
    public String transport() {
        return this.transport;
    }
    /**
     * @return VPN ID
     * 
     */
    public Integer vpnId() {
        return this.vpnId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCflowdPolicyDefinitionCollector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean bfdMetricsExporting;
        private String exportSpreading;
        private Integer exportingInterval;
        private String ipAddress;
        private Integer port;
        private String sourceInterface;
        private String transport;
        private Integer vpnId;
        public Builder() {}
        public Builder(GetCflowdPolicyDefinitionCollector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bfdMetricsExporting = defaults.bfdMetricsExporting;
    	      this.exportSpreading = defaults.exportSpreading;
    	      this.exportingInterval = defaults.exportingInterval;
    	      this.ipAddress = defaults.ipAddress;
    	      this.port = defaults.port;
    	      this.sourceInterface = defaults.sourceInterface;
    	      this.transport = defaults.transport;
    	      this.vpnId = defaults.vpnId;
        }

        @CustomType.Setter
        public Builder bfdMetricsExporting(Boolean bfdMetricsExporting) {
            if (bfdMetricsExporting == null) {
              throw new MissingRequiredPropertyException("GetCflowdPolicyDefinitionCollector", "bfdMetricsExporting");
            }
            this.bfdMetricsExporting = bfdMetricsExporting;
            return this;
        }
        @CustomType.Setter
        public Builder exportSpreading(String exportSpreading) {
            if (exportSpreading == null) {
              throw new MissingRequiredPropertyException("GetCflowdPolicyDefinitionCollector", "exportSpreading");
            }
            this.exportSpreading = exportSpreading;
            return this;
        }
        @CustomType.Setter
        public Builder exportingInterval(Integer exportingInterval) {
            if (exportingInterval == null) {
              throw new MissingRequiredPropertyException("GetCflowdPolicyDefinitionCollector", "exportingInterval");
            }
            this.exportingInterval = exportingInterval;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddress(String ipAddress) {
            if (ipAddress == null) {
              throw new MissingRequiredPropertyException("GetCflowdPolicyDefinitionCollector", "ipAddress");
            }
            this.ipAddress = ipAddress;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetCflowdPolicyDefinitionCollector", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder sourceInterface(String sourceInterface) {
            if (sourceInterface == null) {
              throw new MissingRequiredPropertyException("GetCflowdPolicyDefinitionCollector", "sourceInterface");
            }
            this.sourceInterface = sourceInterface;
            return this;
        }
        @CustomType.Setter
        public Builder transport(String transport) {
            if (transport == null) {
              throw new MissingRequiredPropertyException("GetCflowdPolicyDefinitionCollector", "transport");
            }
            this.transport = transport;
            return this;
        }
        @CustomType.Setter
        public Builder vpnId(Integer vpnId) {
            if (vpnId == null) {
              throw new MissingRequiredPropertyException("GetCflowdPolicyDefinitionCollector", "vpnId");
            }
            this.vpnId = vpnId;
            return this;
        }
        public GetCflowdPolicyDefinitionCollector build() {
            final var _resultValue = new GetCflowdPolicyDefinitionCollector();
            _resultValue.bfdMetricsExporting = bfdMetricsExporting;
            _resultValue.exportSpreading = exportSpreading;
            _resultValue.exportingInterval = exportingInterval;
            _resultValue.ipAddress = ipAddress;
            _resultValue.port = port;
            _resultValue.sourceInterface = sourceInterface;
            _resultValue.transport = transport;
            _resultValue.vpnId = vpnId;
            return _resultValue;
        }
    }
}
