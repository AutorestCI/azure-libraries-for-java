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
 * The list of connector connection errors.
 */
public class ConnectorConnectionErrors {
    /**
     * The value returned by the operation.
     */
    @JsonProperty(value = "value")
    private List<ConnectorConnectionError> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<ConnectorConnectionError> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the ConnectorConnectionErrors object itself.
     */
    public ConnectorConnectionErrors withValue(List<ConnectorConnectionError> value) {
        this.value = value;
        return this;
    }

}
