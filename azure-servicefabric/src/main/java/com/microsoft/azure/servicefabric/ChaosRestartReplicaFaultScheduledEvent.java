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
import com.microsoft.azure.servicefabric.implementation.ReplicaEventInner;

/**
 * Chaos Restart Replica Fault Scheduled event.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ChaosRestartReplicaFaultScheduled")
public class ChaosRestartReplicaFaultScheduledEvent extends ReplicaEventInner {
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
     * Service name.
     */
    @JsonProperty(value = "ServiceUri", required = true)
    private String serviceUri;

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
     * @return the ChaosRestartReplicaFaultScheduledEvent object itself.
     */
    public ChaosRestartReplicaFaultScheduledEvent withFaultGroupId(UUID faultGroupId) {
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
     * @return the ChaosRestartReplicaFaultScheduledEvent object itself.
     */
    public ChaosRestartReplicaFaultScheduledEvent withFaultId(UUID faultId) {
        this.faultId = faultId;
        return this;
    }

    /**
     * Get the serviceUri value.
     *
     * @return the serviceUri value
     */
    public String serviceUri() {
        return this.serviceUri;
    }

    /**
     * Set the serviceUri value.
     *
     * @param serviceUri the serviceUri value to set
     * @return the ChaosRestartReplicaFaultScheduledEvent object itself.
     */
    public ChaosRestartReplicaFaultScheduledEvent withServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

}
