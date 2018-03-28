/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.implementation;

import java.util.List;
import com.microsoft.azure.management.mysql.Operation;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A list of resource provider operations.
 */
public class OperationListResultInner {
    /**
     * The list of resource provider operations.
     */
    @JsonProperty(value = "value")
    private List<Operation> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<Operation> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the OperationListResultInner object itself.
     */
    public OperationListResultInner withValue(List<Operation> value) {
        this.value = value;
        return this;
    }

}
