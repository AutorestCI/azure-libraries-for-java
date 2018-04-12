/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.servicefabric.implementation.NodeEventInner;

/**
 * Chaos Restart Node Fault Completed event.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ChaosRestartNodeFaultCompleted")
public class ChaosRestartNodeFaultCompletedEvent extends NodeEventInner {
    /**
     * Id of Node instance.
     */
    @JsonProperty(value = "NodeInstanceId", required = true)
    private long nodeInstanceId;

    /**
     * Id of fault group.
     */
    @JsonProperty(value = "FaultGroupId", required = true)
    private UUID faultGroupId;

    /**
     * Id of fault.
     */
    @JsonProperty(value = "FaultId", required = true)
    private UUID faultId;

    /**
     * Get the nodeInstanceId value.
     *
     * @return the nodeInstanceId value
     */
    public long nodeInstanceId() {
        return this.nodeInstanceId;
    }

    /**
     * Set the nodeInstanceId value.
     *
     * @param nodeInstanceId the nodeInstanceId value to set
     * @return the ChaosRestartNodeFaultCompletedEvent object itself.
     */
    public ChaosRestartNodeFaultCompletedEvent withNodeInstanceId(long nodeInstanceId) {
        this.nodeInstanceId = nodeInstanceId;
        return this;
    }

    /**
     * Get the faultGroupId value.
     *
     * @return the faultGroupId value
     */
    public UUID faultGroupId() {
        return this.faultGroupId;
    }

    /**
     * Set the faultGroupId value.
     *
     * @param faultGroupId the faultGroupId value to set
     * @return the ChaosRestartNodeFaultCompletedEvent object itself.
     */
    public ChaosRestartNodeFaultCompletedEvent withFaultGroupId(UUID faultGroupId) {
        this.faultGroupId = faultGroupId;
        return this;
    }

    /**
     * Get the faultId value.
     *
     * @return the faultId value
     */
    public UUID faultId() {
        return this.faultId;
    }

    /**
     * Set the faultId value.
     *
     * @param faultId the faultId value to set
     * @return the ChaosRestartNodeFaultCompletedEvent object itself.
     */
    public ChaosRestartNodeFaultCompletedEvent withFaultId(UUID faultId) {
        this.faultId = faultId;
        return this;
    }

}
