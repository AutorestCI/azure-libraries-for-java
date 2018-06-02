/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LocationInner model.
 */
public class LocationInner {
    /**
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

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
     * @return the LocationInner object itself.
     */
    public LocationInner withName(String name) {
        this.name = name;
        return this;
    }

}
