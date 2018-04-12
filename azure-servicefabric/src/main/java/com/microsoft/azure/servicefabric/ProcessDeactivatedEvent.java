/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.servicefabric.implementation.ApplicationEventInner;

/**
 * Process Deactivated event.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ProcessDeactivated")
public class ProcessDeactivatedEvent extends ApplicationEventInner {
    /**
     * Name of Service.
     */
    @JsonProperty(value = "ServiceName", required = true)
    private String serviceName;

    /**
     * Name of Service package.
     */
    @JsonProperty(value = "ServicePackageName", required = true)
    private String servicePackageName;

    /**
     * Activation Id of Service package.
     */
    @JsonProperty(value = "ServicePackageActivationId", required = true)
    private String servicePackageActivationId;

    /**
     * Indicates IsExclusive flag.
     */
    @JsonProperty(value = "IsExclusive", required = true)
    private boolean isExclusive;

    /**
     * Name of Code package.
     */
    @JsonProperty(value = "CodePackageName", required = true)
    private String codePackageName;

    /**
     * Type of EntryPoint.
     */
    @JsonProperty(value = "EntryPointType", required = true)
    private String entryPointType;

    /**
     * Name of executable.
     */
    @JsonProperty(value = "ExeName", required = true)
    private String exeName;

    /**
     * Process Id.
     */
    @JsonProperty(value = "ProcessId", required = true)
    private long processId;

    /**
     * Host Id.
     */
    @JsonProperty(value = "HostId", required = true)
    private String hostId;

    /**
     * Exit code of process.
     */
    @JsonProperty(value = "ExitCode", required = true)
    private long exitCode;

    /**
     * Indicates if termination is unexpected.
     */
    @JsonProperty(value = "UnexpectedTermination", required = true)
    private boolean unexpectedTermination;

    /**
     * Start time of process.
     */
    @JsonProperty(value = "StartTime", required = true)
    private DateTime startTime;

    /**
     * Get the serviceName value.
     *
     * @return the serviceName value
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName value.
     *
     * @param serviceName the serviceName value to set
     * @return the ProcessDeactivatedEvent object itself.
     */
    public ProcessDeactivatedEvent withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the servicePackageName value.
     *
     * @return the servicePackageName value
     */
    public String servicePackageName() {
        return this.servicePackageName;
    }

    /**
     * Set the servicePackageName value.
     *
     * @param servicePackageName the servicePackageName value to set
     * @return the ProcessDeactivatedEvent object itself.
     */
    public ProcessDeactivatedEvent withServicePackageName(String servicePackageName) {
        this.servicePackageName = servicePackageName;
        return this;
    }

    /**
     * Get the servicePackageActivationId value.
     *
     * @return the servicePackageActivationId value
     */
    public String servicePackageActivationId() {
        return this.servicePackageActivationId;
    }

    /**
     * Set the servicePackageActivationId value.
     *
     * @param servicePackageActivationId the servicePackageActivationId value to set
     * @return the ProcessDeactivatedEvent object itself.
     */
    public ProcessDeactivatedEvent withServicePackageActivationId(String servicePackageActivationId) {
        this.servicePackageActivationId = servicePackageActivationId;
        return this;
    }

    /**
     * Get the isExclusive value.
     *
     * @return the isExclusive value
     */
    public boolean isExclusive() {
        return this.isExclusive;
    }

    /**
     * Set the isExclusive value.
     *
     * @param isExclusive the isExclusive value to set
     * @return the ProcessDeactivatedEvent object itself.
     */
    public ProcessDeactivatedEvent withIsExclusive(boolean isExclusive) {
        this.isExclusive = isExclusive;
        return this;
    }

    /**
     * Get the codePackageName value.
     *
     * @return the codePackageName value
     */
    public String codePackageName() {
        return this.codePackageName;
    }

    /**
     * Set the codePackageName value.
     *
     * @param codePackageName the codePackageName value to set
     * @return the ProcessDeactivatedEvent object itself.
     */
    public ProcessDeactivatedEvent withCodePackageName(String codePackageName) {
        this.codePackageName = codePackageName;
        return this;
    }

    /**
     * Get the entryPointType value.
     *
     * @return the entryPointType value
     */
    public String entryPointType() {
        return this.entryPointType;
    }

    /**
     * Set the entryPointType value.
     *
     * @param entryPointType the entryPointType value to set
     * @return the ProcessDeactivatedEvent object itself.
     */
    public ProcessDeactivatedEvent withEntryPointType(String entryPointType) {
        this.entryPointType = entryPointType;
        return this;
    }

    /**
     * Get the exeName value.
     *
     * @return the exeName value
     */
    public String exeName() {
        return this.exeName;
    }

    /**
     * Set the exeName value.
     *
     * @param exeName the exeName value to set
     * @return the ProcessDeactivatedEvent object itself.
     */
    public ProcessDeactivatedEvent withExeName(String exeName) {
        this.exeName = exeName;
        return this;
    }

    /**
     * Get the processId value.
     *
     * @return the processId value
     */
    public long processId() {
        return this.processId;
    }

    /**
     * Set the processId value.
     *
     * @param processId the processId value to set
     * @return the ProcessDeactivatedEvent object itself.
     */
    public ProcessDeactivatedEvent withProcessId(long processId) {
        this.processId = processId;
        return this;
    }

    /**
     * Get the hostId value.
     *
     * @return the hostId value
     */
    public String hostId() {
        return this.hostId;
    }

    /**
     * Set the hostId value.
     *
     * @param hostId the hostId value to set
     * @return the ProcessDeactivatedEvent object itself.
     */
    public ProcessDeactivatedEvent withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * Get the exitCode value.
     *
     * @return the exitCode value
     */
    public long exitCode() {
        return this.exitCode;
    }

    /**
     * Set the exitCode value.
     *
     * @param exitCode the exitCode value to set
     * @return the ProcessDeactivatedEvent object itself.
     */
    public ProcessDeactivatedEvent withExitCode(long exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    /**
     * Get the unexpectedTermination value.
     *
     * @return the unexpectedTermination value
     */
    public boolean unexpectedTermination() {
        return this.unexpectedTermination;
    }

    /**
     * Set the unexpectedTermination value.
     *
     * @param unexpectedTermination the unexpectedTermination value to set
     * @return the ProcessDeactivatedEvent object itself.
     */
    public ProcessDeactivatedEvent withUnexpectedTermination(boolean unexpectedTermination) {
        this.unexpectedTermination = unexpectedTermination;
        return this;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime value.
     *
     * @param startTime the startTime value to set
     * @return the ProcessDeactivatedEvent object itself.
     */
    public ProcessDeactivatedEvent withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

}
