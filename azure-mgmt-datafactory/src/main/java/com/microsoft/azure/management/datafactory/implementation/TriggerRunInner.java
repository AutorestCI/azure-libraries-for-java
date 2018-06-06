/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.implementation;

import java.util.Map;
import org.joda.time.DateTime;
import com.microsoft.azure.management.datafactory.TriggerRunStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Trigger runs.
 */
public class TriggerRunInner {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Trigger run id.
     */
    @JsonProperty(value = "triggerRunId", access = JsonProperty.Access.WRITE_ONLY)
    private String triggerRunId;

    /**
     * Trigger name.
     */
    @JsonProperty(value = "triggerName", access = JsonProperty.Access.WRITE_ONLY)
    private String triggerName;

    /**
     * Trigger type.
     */
    @JsonProperty(value = "triggerType", access = JsonProperty.Access.WRITE_ONLY)
    private String triggerType;

    /**
     * Trigger run start time.
     */
    @JsonProperty(value = "triggerRunTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime triggerRunTimestamp;

    /**
     * Trigger run status. Possible values include: 'Succeeded', 'Failed',
     * 'Inprogress'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private TriggerRunStatus status;

    /**
     * Trigger error message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * List of property name and value related to trigger run. Name, value pair
     * depends on type of trigger.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> properties;

    /**
     * List of pipeline name and run Id triggered by the trigger run.
     */
    @JsonProperty(value = "triggeredPipelines", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> triggeredPipelines;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the TriggerRunInner object itself.
     */
    public TriggerRunInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get trigger run id.
     *
     * @return the triggerRunId value
     */
    public String triggerRunId() {
        return this.triggerRunId;
    }

    /**
     * Get trigger name.
     *
     * @return the triggerName value
     */
    public String triggerName() {
        return this.triggerName;
    }

    /**
     * Get trigger type.
     *
     * @return the triggerType value
     */
    public String triggerType() {
        return this.triggerType;
    }

    /**
     * Get trigger run start time.
     *
     * @return the triggerRunTimestamp value
     */
    public DateTime triggerRunTimestamp() {
        return this.triggerRunTimestamp;
    }

    /**
     * Get trigger run status. Possible values include: 'Succeeded', 'Failed', 'Inprogress'.
     *
     * @return the status value
     */
    public TriggerRunStatus status() {
        return this.status;
    }

    /**
     * Get trigger error message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get list of property name and value related to trigger run. Name, value pair depends on type of trigger.
     *
     * @return the properties value
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Get list of pipeline name and run Id triggered by the trigger run.
     *
     * @return the triggeredPipelines value
     */
    public Map<String, String> triggeredPipelines() {
        return this.triggeredPipelines;
    }

}
