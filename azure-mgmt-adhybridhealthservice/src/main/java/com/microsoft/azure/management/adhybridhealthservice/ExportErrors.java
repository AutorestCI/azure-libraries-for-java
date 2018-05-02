/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice;

import java.util.List;
import com.microsoft.azure.management.adhybridhealthservice.implementation.ExportErrorInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The list of export errors.
 */
public class ExportErrors {
    /**
     * The value returned by the operation.
     */
    @JsonProperty(value = "value")
    private List<ExportErrorInner> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<ExportErrorInner> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the ExportErrors object itself.
     */
    public ExportErrors withValue(List<ExportErrorInner> value) {
        this.value = value;
        return this;
    }

}