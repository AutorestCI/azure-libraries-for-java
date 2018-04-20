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

/**
 * Describes a Chaos event that gets generated when Chaos is waiting for the
 * cluster to become ready for faulting, for example, Chaos may be waiting for
 * the on-going upgrade to finish.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Waiting")
public class WaitingChaosEvent extends ChaosEvent {
    /**
     * Describes why the WaitingChaosEvent was generated, for example, due to a
     * cluster upgrade.
     */
    @JsonProperty(value = "Reason")
    private String reason;

    /**
     * Get the reason value.
     *
     * @return the reason value
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason value.
     *
     * @param reason the reason value to set
     * @return the WaitingChaosEvent object itself.
     */
    public WaitingChaosEvent withReason(String reason) {
        this.reason = reason;
        return this;
    }

}
