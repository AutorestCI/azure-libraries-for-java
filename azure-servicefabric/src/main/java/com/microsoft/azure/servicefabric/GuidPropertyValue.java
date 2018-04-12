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

/**
 * Describes a Service Fabric property value of type Guid.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Guid")
public class GuidPropertyValue extends PropertyValue {
    /**
     * The data of the property value.
     */
    @JsonProperty(value = "Data", required = true)
    private UUID data;

    /**
     * Get the data value.
     *
     * @return the data value
     */
    public UUID data() {
        return this.data;
    }

    /**
     * Set the data value.
     *
     * @param data the data value to set
     * @return the GuidPropertyValue object itself.
     */
    public GuidPropertyValue withData(UUID data) {
        this.data = data;
        return this;
    }

}
