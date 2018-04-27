/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Operation definition.
 */
public class Operation {
    /**
     * Operation name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Display metadata associated with the operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the Operation object itself.
     */
    public Operation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display value.
     *
     * @return the display value
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display value.
     *
     * @param display the display value to set
     * @return the Operation object itself.
     */
    public Operation withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

}
