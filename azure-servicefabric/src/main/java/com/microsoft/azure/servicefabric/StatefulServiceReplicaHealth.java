/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.servicefabric.implementation.ReplicaHealthInner;

/**
 * Represents the health of the stateful service replica.
 * Contains the replica aggregated health state, the health events and the
 * unhealthy evaluations.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServiceKind")
@JsonTypeName("Stateful")
public class StatefulServiceReplicaHealth extends ReplicaHealthInner {
    /**
     * Id of a stateful service replica. ReplicaId is used by Service Fabric to
     * uniquely identify a replica of a partition. It is unique within a
     * partition and does not change for the lifetime of the replica. If a
     * replica gets dropped and another replica gets created on the same node
     * for the same partition, it will get a different value for the id.
     * Sometimes the id of a stateless service instance is also referred as a
     * replica id.
     */
    @JsonProperty(value = "ReplicaId")
    private String replicaId;

    /**
     * Get the replicaId value.
     *
     * @return the replicaId value
     */
    public String replicaId() {
        return this.replicaId;
    }

    /**
     * Set the replicaId value.
     *
     * @param replicaId the replicaId value to set
     * @return the StatefulServiceReplicaHealth object itself.
     */
    public StatefulServiceReplicaHealth withReplicaId(String replicaId) {
        this.replicaId = replicaId;
        return this;
    }

}
