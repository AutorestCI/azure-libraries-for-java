/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v20160801.ProxyOnlyResource;

/**
 * Process Thread Information.
 */
@JsonFlatten
public class ProcessThreadInfoInner extends ProxyOnlyResource {
    /**
     * ARM Identifier for deployment.
     */
    @JsonProperty(value = "properties.id")
    private Integer processThreadInfoId;

    /**
     * HRef URI.
     */
    @JsonProperty(value = "properties.href")
    private String href;

    /**
     * Process URI.
     */
    @JsonProperty(value = "properties.process")
    private String process;

    /**
     * Start address.
     */
    @JsonProperty(value = "properties.startAddress")
    private String startAddress;

    /**
     * Current thread priority.
     */
    @JsonProperty(value = "properties.currentPriority")
    private Integer currentPriority;

    /**
     * Thread priority level.
     */
    @JsonProperty(value = "properties.priorityLevel")
    private String priorityLevel;

    /**
     * Base priority.
     */
    @JsonProperty(value = "properties.basePriority")
    private Integer basePriority;

    /**
     * Start time.
     */
    @JsonProperty(value = "properties.startTime")
    private DateTime startTime;

    /**
     * Total processor time.
     */
    @JsonProperty(value = "properties.totalProcessorTime")
    private String totalProcessorTime;

    /**
     * User processor time.
     */
    @JsonProperty(value = "properties.userProcessorTime")
    private String userProcessorTime;

    /**
     * Priviledged processor time.
     */
    @JsonProperty(value = "properties.priviledgedProcessorTime")
    private String priviledgedProcessorTime;

    /**
     * Thread state.
     */
    @JsonProperty(value = "properties.state")
    private String state;

    /**
     * Wait reason.
     */
    @JsonProperty(value = "properties.waitReason")
    private String waitReason;

    /**
     * Get aRM Identifier for deployment.
     *
     * @return the processThreadInfoId value
     */
    public Integer processThreadInfoId() {
        return this.processThreadInfoId;
    }

    /**
     * Set aRM Identifier for deployment.
     *
     * @param processThreadInfoId the processThreadInfoId value to set
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withProcessThreadInfoId(Integer processThreadInfoId) {
        this.processThreadInfoId = processThreadInfoId;
        return this;
    }

    /**
     * Get hRef URI.
     *
     * @return the href value
     */
    public String href() {
        return this.href;
    }

    /**
     * Set hRef URI.
     *
     * @param href the href value to set
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get process URI.
     *
     * @return the process value
     */
    public String process() {
        return this.process;
    }

    /**
     * Set process URI.
     *
     * @param process the process value to set
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withProcess(String process) {
        this.process = process;
        return this;
    }

    /**
     * Get start address.
     *
     * @return the startAddress value
     */
    public String startAddress() {
        return this.startAddress;
    }

    /**
     * Set start address.
     *
     * @param startAddress the startAddress value to set
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withStartAddress(String startAddress) {
        this.startAddress = startAddress;
        return this;
    }

    /**
     * Get current thread priority.
     *
     * @return the currentPriority value
     */
    public Integer currentPriority() {
        return this.currentPriority;
    }

    /**
     * Set current thread priority.
     *
     * @param currentPriority the currentPriority value to set
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withCurrentPriority(Integer currentPriority) {
        this.currentPriority = currentPriority;
        return this;
    }

    /**
     * Get thread priority level.
     *
     * @return the priorityLevel value
     */
    public String priorityLevel() {
        return this.priorityLevel;
    }

    /**
     * Set thread priority level.
     *
     * @param priorityLevel the priorityLevel value to set
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
        return this;
    }

    /**
     * Get base priority.
     *
     * @return the basePriority value
     */
    public Integer basePriority() {
        return this.basePriority;
    }

    /**
     * Set base priority.
     *
     * @param basePriority the basePriority value to set
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withBasePriority(Integer basePriority) {
        this.basePriority = basePriority;
        return this;
    }

    /**
     * Get start time.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set start time.
     *
     * @param startTime the startTime value to set
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get total processor time.
     *
     * @return the totalProcessorTime value
     */
    public String totalProcessorTime() {
        return this.totalProcessorTime;
    }

    /**
     * Set total processor time.
     *
     * @param totalProcessorTime the totalProcessorTime value to set
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withTotalProcessorTime(String totalProcessorTime) {
        this.totalProcessorTime = totalProcessorTime;
        return this;
    }

    /**
     * Get user processor time.
     *
     * @return the userProcessorTime value
     */
    public String userProcessorTime() {
        return this.userProcessorTime;
    }

    /**
     * Set user processor time.
     *
     * @param userProcessorTime the userProcessorTime value to set
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withUserProcessorTime(String userProcessorTime) {
        this.userProcessorTime = userProcessorTime;
        return this;
    }

    /**
     * Get priviledged processor time.
     *
     * @return the priviledgedProcessorTime value
     */
    public String priviledgedProcessorTime() {
        return this.priviledgedProcessorTime;
    }

    /**
     * Set priviledged processor time.
     *
     * @param priviledgedProcessorTime the priviledgedProcessorTime value to set
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withPriviledgedProcessorTime(String priviledgedProcessorTime) {
        this.priviledgedProcessorTime = priviledgedProcessorTime;
        return this;
    }

    /**
     * Get thread state.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Set thread state.
     *
     * @param state the state value to set
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get wait reason.
     *
     * @return the waitReason value
     */
    public String waitReason() {
        return this.waitReason;
    }

    /**
     * Set wait reason.
     *
     * @param waitReason the waitReason value to set
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withWaitReason(String waitReason) {
        this.waitReason = waitReason;
        return this;
    }

}
