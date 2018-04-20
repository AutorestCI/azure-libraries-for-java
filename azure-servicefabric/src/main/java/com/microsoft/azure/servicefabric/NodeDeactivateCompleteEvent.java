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
import com.microsoft.azure.servicefabric.implementation.NodeEventInner;

/**
 * Node Deactivate Complete event.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("NodeDeactivateComplete")
public class NodeDeactivateCompleteEvent extends NodeEventInner {
    /**
     * Id of Node instance.
     */
    @JsonProperty(value = "NodeInstance", required = true)
    private long nodeInstance;

    /**
     * Describes deactivate intent.
     */
    @JsonProperty(value = "EffectiveDeactivateIntent", required = true)
    private String effectiveDeactivateIntent;

    /**
     * Batch Ids.
     */
    @JsonProperty(value = "BatchIdsWithDeactivateIntent", required = true)
    private String batchIdsWithDeactivateIntent;

    /**
     * Start time.
     */
    @JsonProperty(value = "StartTime", required = true)
    private DateTime startTime;

    /**
     * Get the nodeInstance value.
     *
     * @return the nodeInstance value
     */
    public long nodeInstance() {
        return this.nodeInstance;
    }

    /**
     * Set the nodeInstance value.
     *
     * @param nodeInstance the nodeInstance value to set
     * @return the NodeDeactivateCompleteEvent object itself.
     */
    public NodeDeactivateCompleteEvent withNodeInstance(long nodeInstance) {
        this.nodeInstance = nodeInstance;
        return this;
    }

    /**
     * Get the effectiveDeactivateIntent value.
     *
     * @return the effectiveDeactivateIntent value
     */
    public String effectiveDeactivateIntent() {
        return this.effectiveDeactivateIntent;
    }

    /**
     * Set the effectiveDeactivateIntent value.
     *
     * @param effectiveDeactivateIntent the effectiveDeactivateIntent value to set
     * @return the NodeDeactivateCompleteEvent object itself.
     */
    public NodeDeactivateCompleteEvent withEffectiveDeactivateIntent(String effectiveDeactivateIntent) {
        this.effectiveDeactivateIntent = effectiveDeactivateIntent;
        return this;
    }

    /**
     * Get the batchIdsWithDeactivateIntent value.
     *
     * @return the batchIdsWithDeactivateIntent value
     */
    public String batchIdsWithDeactivateIntent() {
        return this.batchIdsWithDeactivateIntent;
    }

    /**
     * Set the batchIdsWithDeactivateIntent value.
     *
     * @param batchIdsWithDeactivateIntent the batchIdsWithDeactivateIntent value to set
     * @return the NodeDeactivateCompleteEvent object itself.
     */
    public NodeDeactivateCompleteEvent withBatchIdsWithDeactivateIntent(String batchIdsWithDeactivateIntent) {
        this.batchIdsWithDeactivateIntent = batchIdsWithDeactivateIntent;
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
     * @return the NodeDeactivateCompleteEvent object itself.
     */
    public NodeDeactivateCompleteEvent withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

}
