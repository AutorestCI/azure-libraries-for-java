/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The list of key value properties.
 */
public class ItemsInner {
    /**
     * The value returned by the operation.
     */
    @JsonProperty(value = "value")
    private List<ItemInner> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<ItemInner> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the ItemsInner object itself.
     */
    public ItemsInner withValue(List<ItemInner> value) {
        this.value = value;
        return this;
    }

}
