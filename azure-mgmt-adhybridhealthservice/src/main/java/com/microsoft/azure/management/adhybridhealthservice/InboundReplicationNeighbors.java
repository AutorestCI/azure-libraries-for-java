/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The list of replication summary for the domain controller inbound neighbor.
 */
public class InboundReplicationNeighbors {
    /**
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<InboundReplicationNeighbor> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<InboundReplicationNeighbor> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the InboundReplicationNeighbors object itself.
     */
    public InboundReplicationNeighbors withValue(List<InboundReplicationNeighbor> value) {
        this.value = value;
        return this;
    }

}
