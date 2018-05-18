/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.logic.v20160601.WorkflowStatus;
import com.microsoft.azure.management.logic.v20160601.Correlation;
import com.microsoft.azure.management.logic.v20160601.ContentLink;
import java.util.List;
import com.microsoft.azure.management.logic.v20160601.RetryHistory;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * The workflow run action.
 */
@JsonFlatten
public class WorkflowRunActionInner extends SubResource {
    /**
     * Gets the start time.
     */
    @JsonProperty(value = "properties.startTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startTime;

    /**
     * Gets the end time.
     */
    @JsonProperty(value = "properties.endTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endTime;

    /**
     * Gets the status. Possible values include: 'NotSpecified', 'Paused',
     * 'Running', 'Waiting', 'Succeeded', 'Skipped', 'Suspended', 'Cancelled',
     * 'Failed', 'Faulted', 'TimedOut', 'Aborted', 'Ignored'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private WorkflowStatus status;

    /**
     * Gets the code.
     */
    @JsonProperty(value = "properties.code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * Gets the error.
     */
    @JsonProperty(value = "properties.error", access = JsonProperty.Access.WRITE_ONLY)
    private Object error;

    /**
     * Gets the tracking id.
     */
    @JsonProperty(value = "properties.trackingId", access = JsonProperty.Access.WRITE_ONLY)
    private String trackingId;

    /**
     * The correlation properties.
     */
    @JsonProperty(value = "properties.correlation")
    private Correlation correlation;

    /**
     * Gets the link to inputs.
     */
    @JsonProperty(value = "properties.inputsLink", access = JsonProperty.Access.WRITE_ONLY)
    private ContentLink inputsLink;

    /**
     * Gets the link to outputs.
     */
    @JsonProperty(value = "properties.outputsLink", access = JsonProperty.Access.WRITE_ONLY)
    private ContentLink outputsLink;

    /**
     * Gets the tracked properties.
     */
    @JsonProperty(value = "properties.trackedProperties", access = JsonProperty.Access.WRITE_ONLY)
    private Object trackedProperties;

    /**
     * Gets the retry histories.
     */
    @JsonProperty(value = "properties.retryHistory")
    private List<RetryHistory> retryHistory;

    /**
     * Gets the workflow run action name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Gets the workflow run action type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public WorkflowStatus status() {
        return this.status;
    }

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public Object error() {
        return this.error;
    }

    /**
     * Get the trackingId value.
     *
     * @return the trackingId value
     */
    public String trackingId() {
        return this.trackingId;
    }

    /**
     * Get the correlation value.
     *
     * @return the correlation value
     */
    public Correlation correlation() {
        return this.correlation;
    }

    /**
     * Set the correlation value.
     *
     * @param correlation the correlation value to set
     * @return the WorkflowRunActionInner object itself.
     */
    public WorkflowRunActionInner withCorrelation(Correlation correlation) {
        this.correlation = correlation;
        return this;
    }

    /**
     * Get the inputsLink value.
     *
     * @return the inputsLink value
     */
    public ContentLink inputsLink() {
        return this.inputsLink;
    }

    /**
     * Get the outputsLink value.
     *
     * @return the outputsLink value
     */
    public ContentLink outputsLink() {
        return this.outputsLink;
    }

    /**
     * Get the trackedProperties value.
     *
     * @return the trackedProperties value
     */
    public Object trackedProperties() {
        return this.trackedProperties;
    }

    /**
     * Get the retryHistory value.
     *
     * @return the retryHistory value
     */
    public List<RetryHistory> retryHistory() {
        return this.retryHistory;
    }

    /**
     * Set the retryHistory value.
     *
     * @param retryHistory the retryHistory value to set
     * @return the WorkflowRunActionInner object itself.
     */
    public WorkflowRunActionInner withRetryHistory(List<RetryHistory> retryHistory) {
        this.retryHistory = retryHistory;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
